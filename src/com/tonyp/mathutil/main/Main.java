/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonyp.mathutil.main;

import com.tonyp.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tryTDDFirst();
    }

    public static void tryTDDFirst() {
        //Test case #1 (tình huống kiểm thử hàm)
        //Input : n = 1;
        //Gọi hàm getFactorial(1)
        //Hy vọng hàm trả về 1, vì 1! = 1

        long expected = 1;
        long actual = MathUtil.getFactorial(1);

        System.out.println("0! Status  |   expected: " + expected
                + "   |   actual: " + actual);

        //Test case #2
        //n = 2
        System.out.println("2! Status  |   expected: 2"
                + "   |   actual: " + MathUtil.getFactorial(2));

        //Test case #3:
        //n = 5
        System.out.println("5! Status  |   expected: 120"
                + "   |   actual: " + MathUtil.getFactorial(5));

        //Test case #4:
        //n = -5 , -5! hy vọng bị đập vào mặt câu, CÀ CHỚN, N KO HỢP LỆ
//        System.out.println("-5! Status  |   expected: NGOẠI LỆ XUẤT HIỆN"
//                + "   |   actual: " + MathUtil.getFactorial(n = -5));
        System.out.println("-5! Status  |   expected: NGOẠI LỆ XUẤT HIỆN"
                + "   |   actual: ");
        MathUtil.getFactorial(-5);
    }
}
