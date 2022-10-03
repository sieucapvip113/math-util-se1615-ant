 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonyp.mathutil.core;

import static com.tonyp.mathutil.core.MathUtil.getFactorial;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//import static.... tên-class.tên hàm; thì sau này
//khi gọi hàm static bỏ luôn tên class chấm, hiểu ngầm tên class
//code gọi như hàm của C
//.* là đại diện cho tất cả các hàm static trong class vừa import
//nếu rảnh thì chấm từng tên hàm static (ko có dấu ngoặc)

//KĨ THUẬT DDT - DATA DRIVEN TESTING
//TRÁNH NHẦM VỚI TDD - TEST DRIVEN DEVELOPMENT
//DDT: KĨ THUẬT TỔ CHỨC CÁC TEST CASES CHO GỌN GÀNG
//TÁCH CÁC CÂU LỆNH KIỂM THỬ VÀ BỘ DATA DỦNG ĐỂ TEST RIÊNG RA 2 NƠI
//PHIÊN BẢN TEST JUNIT VỪA HỌC ĐANG TRỘN DATA TEST VÀ GỌI HÀM
//LẪN LỘN VỚI NHAU, KO SAI, NHƯNG NHÌN KO RÕ RÀNG

//Nếu ta muốn check hàm getF() với các giá trị đầu vào và có trả về
//đầu ra mong đợi hay ko, kiểu như:
//0 --> 1
//1 --> 1
//2 --> 5
//4 --> 24
//5 --> 120
//6 --> 720
//...
//có chỗ nào định nghĩa riêng cái đám data này, thì ta sẽ dễ dàng
//cảm nhận các case đã đủ hay chưa, đã đại diện đủ hay chưa!!!
//lát hồi ta nhồi cái đám data này vào hàm assertEquals(? getF(?))
//cảm giác viết code để test hàm nhìn rõ ràng hơn
//kĩ thuật đẩ data test ra 1 chỗ khác, lát hồi nhồi ngược lại vào
//chỗ gọi hàm, kĩ thuật này gọi là DDT - viết test case theo kiểu
//hướng về tách data cho dễ đọc, còn gọi là PARAMETERIZED TESTING


@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    //chuẩn bị data để nhồi vào hàm test
    //quy ước hàm chuẩn bị data phải là static - nằm ở 1 chỗ cố định
    //trong ram để object nào cũng thấy được!!!
    @Parameterized.Parameters
    public static Object[][] initData() {
        
        int a[] = {5,
                  10,
                  15,
                  20
                  };
        
        return new Integer[][] {
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 240},
                                {5, 120},
                                {6, 720}
                                };
    }
    
    @Parameterized.Parameter(value = 0) //map biến này vào cột 0
    public int n;
    
    @Parameterized.Parameter(value = 1) //map biến này vào cột 0
    public long expected;   //2 biến này sẽ map vào 2 cột tương ứng
                            //của hàm initData
                            //sau đó ta nhồi 2 biến này vào trong hàm
                            //assertEquals() như cũ
    
    @Test //xài data từ 2 biến trên và chạy compare
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, getFactorial(n));
    }
    
}

//KẾT LUẬN CHUNG CHO XANH ĐỎ:
//XANH: KHI TẤT CẢ CÁC CASE, TÌNH HUỐNG ĐỀU PHẢI XANH - EXPECTED == ACTUAL
//ĐỎ: CHỈ CẦN 1 THẰNG ĐỎ, TẤT CẢ LÀ ĐỎ!!!
//XANH: MỆNH ĐỀ AND, XANH KHI TẤT CẢ CÙNG XANH
//ĐỎ: MỆNH ĐỂ OR, CHỈ CÓ 1 THẰNG ĐỎ, CẢ ĐÁM ĐỎ

//LÍ DO: HÀM DC GỌI LÀ ĐÚNG, THÌ PHẢI ĐÚNG HẾT VỚI CÁC CASES
//      HÀM CÓ 1 THẰNG SAI, ĐÁM CÒN LẠI ĐÚNG/XANH, HÀM KO ỔN ĐỊNH
//      DO CÓ 1 THẰNG SAI -> KẾT LUẬN HÀM