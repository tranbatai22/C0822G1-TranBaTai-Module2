package review.phone.Controller;

import review.phone.model.ChinhHang;
import review.phone.service.impl.ChinhHangService;
import review.phone.util.ReadWriteChinhHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainChinhHang {
    public static void menuChinhHang() {
        List<ChinhHang> chinhHangList = new ArrayList<>();
        chinhHangList.add(new ChinhHang(1, "nokia",
                5.555, 5, "aaa", 4.555, "ccc"));
        ReadWriteChinhHang.writeChinhHang("D:\\CodeGym\\C0822G1-TranBaTai-Module2\\modul2_C08\\src\\review.phone\\data\\chinhhang.csv", chinhHangList);
        ChinhHangService chinhHangService = new ChinhHangService();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("Quản lý điện thoại chính hãng\n"
                    + " 1.Thêm sản phẩm mới\n"
                    + " 2.Chỉnh sủa sản phẩm\n"
                    + " 3.Hiển thị danh sách\n"
                    + " 4.Tìm kiếm sản phẩm\n"
                    + " 5.Quay về menu chính");
            System.out.println("Chọn chức năng: ");
            option = Integer.parseInt(scanner.nextLine());
            if (option <= 0 || option > 5){
                System.out.println("Không có chức năng phù hợp, vui lòng chọn lại !!!");
            }
            switch (option){
                case 1:
                    chinhHangService.add();
                    break;
                case 2:
                    chinhHangService.delete();
                    break;
                case 3:
                    chinhHangService.display();
                    break;
                case 4:
                    chinhHangService.find();
                    break;
                case 5:
                    menuChinhHang();
            }
        }while (option <= 0 || option > 5);
    }
}
