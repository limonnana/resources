package resources;

import java.io.*;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
 
public class TableTest {
 
    public static void main (String[] args) throws Exception {
        String fileName = "/home/eyal/Downloads/Download1/GUIDE INSTRUCTIONS (0).doc";
 
        if (args.length > 0) {
            fileName = args[0];
        }
 
        InputStream fis = new FileInputStream(fileName);
        POIFSFileSystem fs = new POIFSFileSystem(fis);
        HWPFDocument doc = new HWPFDocument(fs);
 
        Range range = doc.getRange();
 
        for (int i=0; i<range.numParagraphs(); i++) {
            Paragraph par = range.getParagraph(i);
            System.out.println("paragraph "+(i+1));
            System.out.println("is in table: "+par.isInTable());
            System.out.println("is table row end: "+par.isTableRowEnd());
            System.out.println(par.text());
        }
 
        Paragraph tablePar = range.getParagraph(0);
        if (tablePar.isInTable()) {
            Table table = range.getTable(tablePar);
            for (int rowIdx=0; rowIdx<table.numRows(); rowIdx++) {
                TableRow row = table.getRow(rowIdx);
                System.out.println("row "+(rowIdx+1)+", is table header: "+row.isTableHeader());
                for (int colIdx=0; colIdx<row.numCells(); colIdx++) {
                    TableCell cell = row.getCell(colIdx);
                    System.out.println("column "+(colIdx+1)+", text="+cell.getParagraph(0).text());
                }
            }
        }
    }
}
