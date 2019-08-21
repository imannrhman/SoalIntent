package com.belajar.soalintent;

import android.os.Parcel;
import android.os.Parcelable;

public class OrderType implements Parcelable {
    public int getIdOrderType() {
        return idOrderType;
    }

    public void setIdOrderType(int idOrderType) {
        this.idOrderType = idOrderType;
    }

    public String getNameOrderType() {
        return nameOrderType;
    }

    public void setNameOrderType(String nameOrderType) {
        this.nameOrderType = nameOrderType;
    }

    public int getOrderPicture() {
        return orderPicture;
    }

    public void setOrderPicture(int orderPicture) {
        this.orderPicture = orderPicture;
    }

    public int getButtonColor() {
        return buttonColor;
    }

    public void setButtonColor(int buttonColor) {
        this.buttonColor = buttonColor;
    }

    private int buttonColor;
    private int idOrderType;
    private String nameOrderType;
    private int orderPicture;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.idOrderType);
        dest.writeString(this.nameOrderType);
        dest.writeInt(this.orderPicture);
        dest.writeInt(this.buttonColor);
    }

    public OrderType() {
    }

    protected OrderType(Parcel in) {
        this.idOrderType = in.readInt();
        this.nameOrderType = in.readString();
        this.orderPicture = in.readInt();
        this.buttonColor = in.readInt();
    }

    public static final Parcelable.Creator<OrderType> CREATOR = new Parcelable.Creator<OrderType>() {
        @Override
        public OrderType createFromParcel(Parcel source) {
            return new OrderType(source);
        }

        @Override
        public OrderType[] newArray(int size) {
            return new OrderType[size];
        }
    };
}
