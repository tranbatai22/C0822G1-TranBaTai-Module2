package review.phone.service.impl;

import review.phone.model.ChinhHang;
import review.phone.service.IXachTayService;
import review.phone.util.ReadWriteChinhHang;

import java.util.List;
import java.util.Scanner;

public class ChinhHangService implements IXachTayService {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String PATH = "D:\\CodeGym\\C0822G1-TranBaTai-Module2\\modul2_C08\\src\\review.phone\\data\\chinhhang.csv";

    @Override
    public void add() {

        List<ChinhHang> chinhHangList = ReadWriteChinhHang.readChinhHang(PATH);
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Nhập tên: ");
        String name = SCANNER.nextLine();
        System.out.println("Nhập giá: ");
        double prime = Double.parseDouble(SCANNER.nextLine());
        System.out.println("Nhập số lượng: ");
        int amount = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Nhập hãng sản xuất: ");
        String producer = SCANNER.nextLine();
        System.out.println("Nhập thời gian bảo hành: ");
        double time = Double.parseDouble(SCANNER.nextLine());
        System.out.println("Nhập phạm vi bảo hành: ");
        String range = SCANNER.nextLine();
        chinhHangList.add(new ChinhHang(id, name, prime, amount, producer, time, range));
        ReadWriteChinhHang.writeChinhHang(PATH, chinhHangList);
        System.out.println("Thêm sản phẩm thành công!!!");
    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        List<ChinhHang> chinhHangList = ReadWriteChinhHang.readChinhHang(PATH);
        for (ChinhHang chinhHang : chinhHangList) {
            System.out.println(chinhHang);
        }
    }

    @Override
    public void find() {

    }
}
