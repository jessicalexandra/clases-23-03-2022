package co.edu.cesde;

import java.util.Scanner;

public class Product {
    private double price;
    private String name;
    private String reference;
    private String uni;
    private double size;
    private String code;

    void setPrice() {
        Scanner inpuData=new Scanner(System.in);
        System.out.println("ingrese el precio");
        double price=inpuData.nextDouble();
        if (price <= 10000000) {
            this.price = price;
        } else {
            System.out.println("no se puede un precio mayor a 10 millones");
        }


    }
    double getPrice(){
        return  this.price;
    }
    void setName(String name){
        this.name=name;
    }
    void setReference(String reference){
        this.reference=reference;
    }
    void setUni(String uni){
        this.uni=uni;
    }
    void setSize(double size){
        this.size=size;
    }


    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getReference() {
        return reference;
    }

    public String getUni() {
        return uni;
    }

    public double getSize() {
        return size;
    }

    public String getCode() {
        return code;
    }
}
