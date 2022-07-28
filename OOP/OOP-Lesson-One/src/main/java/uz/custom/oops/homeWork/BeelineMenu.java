package uz.custom.oops.homeWork;

import lombok.Getter;

@Getter
public class BeelineMenu {

    public String name;
    public String paymentMonth;
    private int code = 1700238;

    public BeelineMenu(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaymentMonth() {
        return paymentMonth;
    }

    public void setPaymentMonth(String paymentMonth) {
        this.paymentMonth = paymentMonth;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public BeelineMenu(String name, String paymentMonth, int code) {
        this.name = name;
        this.paymentMonth = paymentMonth;
        this.code = code;
    }
}
