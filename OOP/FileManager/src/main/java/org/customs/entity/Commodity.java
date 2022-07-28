package org.customs.entity;

import java.math.BigDecimal;
import java.util.List;

public class Commodity {
    private String hsCode;
    private String hsName;
    private BigDecimal brutto;
    private BigDecimal netto;
    private String date;
    private List<Payment> payments;

    public Commodity() {
    }

    public Commodity(String hsCode, String hsName, BigDecimal brutto, BigDecimal netto, String date, List<Payment> payments) {
        this.hsCode = hsCode;
        this.hsName = hsName;
        this.brutto = brutto;
        this.netto = netto;
        this.date = date;
        this.payments = payments;
    }

    public String getHsCode() {
        return hsCode;
    }

    public void setHsCode(String hsCode) {
        this.hsCode = hsCode;
    }

    public String getHsName() {
        return hsName;
    }

    public void setHsName(String hsName) {
        this.hsName = hsName;
    }

    public BigDecimal getBrutto() {
        return brutto;
    }

    public void setBrutto(BigDecimal brutto) {
        this.brutto = brutto;
    }

    public BigDecimal getNetto() {
        return netto;
    }

    public void setNetto(BigDecimal netto) {
        this.netto = netto;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
