/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonyp.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {
    
    //Kiểm thử tình huống cà chớn, đưa data vào cà chớn
    //thì nhận về cú tát EXCEPTION
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        //Test case 7:
        // n = -5; -5! hy vọng bị vả vào mặt cái EXCEPTION
        //             thực tế nó có vả mặt hay ko, đoán xem, chạy hàm đã
        //ko xài assertEquals() vì nó dùng cho các giá trị cụ thể
        //còn ngoại lệ là 1 thứ đo lường - cách mày có xuất hiện hay ko
        //mày ko là 1 giá trị kiểu 5 10 15 20
        MathUtil.getFactorial(-5); //ngoại lệ cầm chắc trong tay
        //nhưng phải đo/ dòm xem mày có hiện nguyên hình hem???
        
    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {

        //Test case #4:
        //n = 3; 3! hy vọng expected trả về 6
        //                  thực tế actual là mấy, đoán xem
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        //Test case #5:
        //n = 4; 4! hy vọng expected trả về 24
        //                  thực tế actual là mấy, đoán xem
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
        //Test case #6:
        //n = 5; 5! hy vọng expected trả về 120
        //                  thực tế actual là mấy, đoán xem
        Assert.assertEquals(120, MathUtil.getFactorial(5));

    }

    @Test
    public void tryAssertion() {
        Assert.assertEquals(69, 69);
    }

    @Test //quy tắc đặt tên hàm kiểm thử phải mang ý nghĩa của các test case
    // mình muốn test hàm - CODING CONVENTION
    public void testFactorialGivenRightArgumentReturnsWell() {

        //Test case #1 - Tình huống kiểm thử xài hàm getF() đầu tiên
        //n = 0, 0! hy vọng expected =1
        long expected = 1;
        long actual = MathUtil.getFactorial(0);

        Assert.assertEquals(expected, actual);

        //Test case #2:
        //n = 1; 1! hy vọng expected trả về 1
        //                  thực tế actual là mấy, đoán xem
        expected = 1;
        actual = MathUtil.getFactorial(1);
        Assert.assertEquals(expected, actual);

        //Test case #3:
        //n = 2; 2! hy vọng expected trả về 2
        //                  thực tế actual là mấy, đoán xem
        Assert.assertEquals(2, MathUtil.getFactorial(2));

    }

}
