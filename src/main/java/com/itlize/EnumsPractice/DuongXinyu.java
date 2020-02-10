package com.itlize.EnumsPractice;

enum DuongXinyuEnum {
    Duong("Duong"), Xinyu("Xinyu");

    private String name;

    private DuongXinyuEnum(String name) {
        setName(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCatchPhrase() {
        return "Hey, my name is " + getName() + "!";
    }

    public boolean isDuong(){
        if (toString().equals(DuongXinyuEnum.Duong.name)) {
            return true;
        }
        return false;
    }

    public boolean isXinyu(){
        if (toString().equals(DuongXinyuEnum.Xinyu.name)) {
            return true;
        }
        return false;
    }
}

public class DuongXinyu {


}
