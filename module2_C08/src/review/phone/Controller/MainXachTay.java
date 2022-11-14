package review.phone.Controller;

import review.phone.model.XachTay;
import review.phone.service.impl.XachTayService;
import review.phone.util.ReadWriteXachTay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainXachTay {
    public static void menuXachTay(){
        List<XachTay> xachTayList = new ArrayList<>();
        xachTayList.add(new XachTay(1, "nokia",
                5.555, 5, "aaa", "bbb", "ccc"));
        ReadWriteXachTay.writeXachTay("D:\\CodeGym\\C0822G1-TranBaTai-Module2\\modul2_C08\\src\\review.phone\\data\\xachtay.csv", xachTayList);
        XachTayService xachTayService = new XachTayService();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("Quản lý điện thoại xách tay\n"
                    + " 1.Thêm sản phẩm mới\n"
                    + " 2.Chỉnh sủa sản phẩm\n"
                    + " 3.Hiển thị danh sách\n"
                    + " 4.Tìm kiếm sản phẩm"
                    + " 5.Quay về menu chính");
            System.out.println("Chọn chức năng: ");
            option = Integer.parseInt(scanner.nextLine());
            if (option <= 0 || option > 5){
                System.out.println("Không có chức năng phù hợp, vui lòng chọn lại !!!");
            }
            switch (option){
                case 1:
                    xachTayService.add();
                    break;
                case 2:
                    xachTayService.delete();
                    break;
                case 3:
                    xachTayService.display();
                    break;
                case 4:
                    xachTayService.find();
                    break;
                case 5:
                    menuXachTay();
            }
        }while (option <= 0 || option > 5);
    }
}
