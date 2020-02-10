package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator {

    String name;
    String Xinyu = DuongXinyuEvaluatorEnum.Xinyu.name().toLowerCase();
    String Duong = DuongXinyuEvaluatorEnum.Duong.name().toLowerCase();

    public DuongXinyuEvaluator(String name) {
        this.name = name.toLowerCase();
    }

    public boolean isXinyu(){
        return Xinyu.equals(name);
    }

    public boolean isDuong(){
        return Duong.equals(name);
    }

    public static void main(String args[]) {
        DuongXinyuEvaluator abc = new DuongXinyuEvaluator("xinyu");
        System.out.println(abc.isDuong());
        System.out.println(abc.isXinyu());
    }
}

enum DuongXinyuEvaluatorEnum {
    Duong("duong"), Xinyu("xinyu");

    private String name;

    private DuongXinyuEvaluatorEnum(String duong) {
        setName(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


}
