package com.okchain.types;

import com.alibaba.fastjson.annotation.JSONField;

public class MsgNewOrder implements IMsg {
    // price of the order
    private String price;

    // product for trading pair in full name of the tokens
    private String product;

    // quantity of the order
    private String quantity;

    // order maker address
    private String sender;

    // BUY/SELL
    private String side;

    public MsgNewOrder(String price, String product, String quantity, String sender, String side) {
        this.price = price;
        this.product = product;
        this.quantity = quantity;
        this.sender = sender;
        this.side = side;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }


}
