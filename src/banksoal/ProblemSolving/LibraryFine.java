/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2024 All Rights Reserved.
 */
package banksoal.ProblemSolving;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: LibraryFine.java, v 0.1 2024‐12‐29 09.25
 */
public class LibraryFine {
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if(y1>y2){
            return 10000;
        }else if (y1 == y2 && m1 > m2) {
            return (m1 - m2) * 500;
        } else if (y1 == y2 && m1 == m2 && d1 > d2) {
            return (d1 - d2) * 15;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(libraryFine(17,10,2024,15,10,2024));
    }
}
