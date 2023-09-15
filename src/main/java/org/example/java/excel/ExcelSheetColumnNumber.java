package org.example.java.excel;

public class ExcelSheetColumnNumber {

    public static int titleToNumber(String columnTitle) {
        int colNum = 0, i = 0;
        StringBuilder sb = new StringBuilder(columnTitle);
        for (char c : sb.reverse().toString().toCharArray()) {
            colNum += (c - '@') * Math.pow(26, i++);
        }
        return colNum;
    }
}
