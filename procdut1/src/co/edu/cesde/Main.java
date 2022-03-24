package co.edu.cesde;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inpudata = new Scanner(System.in);

//        System.out.println("ingrese el precio del monitor ");
//        double price = inpudata.nextDouble();
        Product monitorhp = new Product();
        monitorhp.setName("monitor hp 24 full hd");
        monitorhp.setCode("sku1020");
        monitorhp.setPrice();
//        if (price <= 1000000) {
//            monitorhp.price = price;
//        }
//        System.out.println("ingrese el precio de la cpu");
//        double price2 = inpudata.nextDouble();
        Product cpuhp = new Product();
        cpuhp.setName("CPU HP core 13");
        cpuhp.setPrice();
//        if (price2 <= 1000000) {
//            cpuhp.price = price2;
//        }
        System.out.println("precio del monitor " + monitorhp.getPrice());
        System.out.println("precio cpu " + cpuhp.getPrice());
//

    }

}
