package org.example.java.excel;

public class ExcelSheetColumnTitle {
    private static final char START = 64;

    public static String convertToTitle(int columnNumber) {
        StringBuilder title = new StringBuilder();

        for(; columnNumber > 26; columnNumber /= 26){
            title.append(getLetter(columnNumber % 26));
            if (columnNumber % 26 == 0) columnNumber--;
        }
        title.append(getLetter(columnNumber));
        return title.reverse().toString();
    }

    private static char getLetter(int num) {
        if (num == 0) num = 26;
        return (char) (START + num);
    }
}
