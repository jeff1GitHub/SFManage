package com.sf.manage.utils;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.util.List;
import java.util.Map;

public class ExcelUtil {
    /**
     * 为excel表增加数据
     * 在最后一行后增加数据,用于大数据量的分段查询
     *
     * @param wb   已经实例化的 SXSSFWorkbook 对象
     * @param keys 用于获取数据的key
     * @param data
     */
    public void addDataToExcel(SXSSFWorkbook wb, String sheetName, String[] keys, List<Map<String, Object>> data) {
        // 创建单元格样式
        CellStyle cellStyle = wb.createCellStyle();
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderTop(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THIN);
        cellStyle.setBorderRight(BorderStyle.THIN);

        // 获取excel中的sheet
        SXSSFSheet sheet = wb.getSheet(sheetName);

        // 获取sheet最后一行的行号
        int lastRowNum = sheet.getLastRowNum();

        SXSSFRow row = null;
        SXSSFCell cell = null;
        String key = null;
        Object vlaueObject = null;
        String value = null;

        for (Map<String, Object> map : data) {
            row = (SXSSFRow) sheet.createRow(++lastRowNum);
            for (int i = 0; i < keys.length; i++) {
                key = keys[i];
                vlaueObject = map.get(key);
                if (vlaueObject == null) {
                    value = "";
                } else {
                    value = vlaueObject.toString();

                }

                // 创建单元格
                cell = (SXSSFCell) row.createCell(i);
                // 设置单元格样式
                cell.setCellStyle(cellStyle);
                // 设置单元格属性
                cell.setCellValue(value);
            }
        }
    }

    /**
     * 创建一个excel并将数据存入excel
     *
     * @param sheetName 表格名称
     * @param title     用于显示的title
     * @param keys      用于获取数据的key
     * @param data
     * @return
     */
    public SXSSFWorkbook createExcel2007(String sheetName, String[] title, String[] keys, List<Map<String, Object>> data) {
        SXSSFWorkbook wb = new SXSSFWorkbook(10000);
        SXSSFSheet sheet = (SXSSFSheet) wb.createSheet(sheetName);
        SXSSFRow row = null;
        SXSSFCell cell = null;

        Font font = wb.createFont();
        font.setBold(true);

        // 创建单元格样式
        CellStyle cellStyle = wb.createCellStyle();
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderTop(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THIN);
        cellStyle.setBorderRight(BorderStyle.THIN);
        cellStyle.setFont(font);

        row = (SXSSFRow) sheet.createRow(0);
        // 设置title
        if (title != null) {
            for (int i = 0; i < title.length; i++) {
                cell = (SXSSFCell) row.createCell(i);
                cell.setCellStyle(cellStyle);
                cell.setCellValue(title[i]);
            }
        }

        // 判断是否有数据需要导入
        if (data != null) {
            this.addDataToExcel(wb, sheetName, keys, data);
        }
        return wb;
    }
}
