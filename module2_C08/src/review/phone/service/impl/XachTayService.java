package review.phone.service.impl;

import review.phone.model.XachTay;
import review.phone.service.IXachTayService;
import review.phone.util.ReadWriteXachTay;

import java.util.List;
import java.util.Scanner;

public class XachTayService implements IXachTayService {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String PATH = "D:\\CodeGym\\C0822G1-TranBaTai-Module2\\modul2_C08\\src\\review.phone\\data\\xachtay.csv";

    @Override
    public void add() {
        List<XachTay> xachTayList = ReadWriteXachTay.readXachTay(PATH);
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
        String nation = SCANNER.nextLine();
        System.out.println("Nhập phạm vi bảo hành: ");
        String status = SCANNER.nextLine();
        xachTayList.add(new XachTay(id, name, prime, amount, producer, nation, status));
        ReadWriteXachTay.writeXachTay(PATH, xachTayList);
        System.out.println("Thêm sản phẩm thành công!!!");
    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        List<XachTay> xachTayList = ReadWriteXachTay.readXachTay(PATH);
        for (XachTay xachTay : xachTayList) {
            System.out.println(xachTay);
        }
    }

    @Override
    public void find() {

    }
}
