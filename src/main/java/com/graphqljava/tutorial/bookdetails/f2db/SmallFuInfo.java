package com.graphqljava.tutorial.bookdetails.f2db;

public class SmallFuInfo {
//    String getFuStatus();
//    String getFuRegdat();
//    String getFuResursext();
//    String getFuObjnr();

    String status;
    String datum;
    String utforare;
    String objnr;

    public SmallFuInfo(String status, String datum, String utforare, String objnr) {
        this.status = status;
        this.datum = datum;
        this.utforare = utforare;
        this.objnr = objnr;
    }

    public SmallFuInfo(Object[] o) {
        this.status = o[0].toString();
        this.datum = o[1].toString();
        this.utforare = o[2].toString();
        this.objnr = o[3].toString();
    }

    public String getObjnr() {
        return objnr;
    }

    public void setObjnr(String objnr) {
        this.objnr = objnr;
    }

    public SmallFuInfo() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getUtforare() {
        return utforare;
    }

    public void setUtforare(String utforare) {
        this.utforare = utforare;
    }
}
