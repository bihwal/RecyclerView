package com.example.recyclerview;

public class Contacts {

    private String name;
    private String PhoneNo;
    private int ImageID;

    public Contacts(String name, String phoneNo, int imageID) {
        this.name = name;
        PhoneNo = phoneNo;
        ImageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public int getImageID() {
        return ImageID;
    }

    public void setImageID(int imageID) {
        ImageID = imageID;
    }
}
