package com.graphqljava.tutorial.bookdetails.f2db;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "FU")
public class Fu {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long fuFelradnr;
  private String fuObjnr;
  private String fuRegdat;
  private String fuRegid;
  private long fuUtrnr;
  private long fuEnhnr;
  private String fuFelbesk;
  private java.sql.Timestamp fuModdat;
  private String fuStatus;
  private String fuAkut;
  private String fuDateAkut;
  private String fuIdAkut;
  private String fuUtrkod;
  private String fuEnhtyp;
  private String fuResurs;
  private String fuArttyp;
  private String fuArtnr;
  private String fuFeltyp;
  private String fuAnsvoc;
  private String fuOmr;
  private String fuTfnavk;
  private String fuGain;
  private String fuPreldat;
  private String fuAvrhbh;
  private String fuFtill1;
  private String fuFtill2;
  private String fuFtill3;
  private String fuFtill4;
  private String fuMomskto;
  private String fuFritext;
  private String fuFtgnr;
  private String fuFastnr;
  private String fuBygnr;
  private String fuPreltid;
  private String fuAnmovr;
  private String fuAnmovrtfn;
  private String fuKundnrovr;
  private String fuKommentar;
  private String fuAnm;
  private String fuKundnr;
  private long fuFras;
  private String fuFakturaid;
  private String fuMomsktol;
  private String fuFaktureras;
  private String fuProjkonto;
  private String fuFrastext;
  private String fuResursext;
  private String fuDriftproj;
  private String fuDateBest;
  private String fuBestId;
  private String fuUtfid;
  private String fuUtfdat;
  private double fuUtftid;
  private long fuBelopp;
  private long fuBesid;
  private String fuOffertid;
  private String fuBytenhtyp;
  private String fuAcceptdat;
  private String fuPamin1;
  private String fuPamin2;
  private String fuHetaarb;
  private String fuArbmiljo;
  private long fuKundbelopp;
  private long fuFaktnr;
  private long fuFaktradnr;
  private String fuRefid;
  private String fuModid;
  private String fuPrio;
  private long fuOrgin;
  private String fuKundnr2;
  private String fuProdnrarb;
  private String fuProdnrtid;
  private String fuEnhetsnotering;
  private String fuAnmovrepost;
  private String fuFtill5;
  private String fuFtill6;
  private long fuBeloppm;
  private long fuRamavtal;
  private String fuPrefaktura;
  private long fuPrefakturabelopp;
  private String fuPreltidTom;
  private long fuBokningStatus;
  private String fuNyckelkod;
  private String fuExterntBestallningsId;
  private String fuExterntBestallningsNr;
  private String fuAgressoRead;
  private java.sql.Timestamp fuSlaStart;
  private java.sql.Timestamp fuSlaAvtalatSlut;
  private long fuSlaDiffSlut;
  private java.sql.Timestamp fuSlaFaktisktSlut;


  public Fu() {
  }

  public Fu(long fuFelradnr, String fuObjnr, String fuRegdat, String fuRegid, long fuUtrnr, long fuEnhnr, String fuFelbesk, Timestamp fuModdat, String fuStatus, String fuAkut, String fuDateAkut, String fuIdAkut, String fuUtrkod, String fuEnhtyp, String fuResurs, String fuArttyp, String fuArtnr, String fuFeltyp, String fuAnsvoc, String fuOmr, String fuTfnavk, String fuGain, String fuPreldat, String fuAvrhbh, String fuFtill1, String fuFtill2, String fuFtill3, String fuFtill4, String fuMomskto, String fuFritext, String fuFtgnr, String fuFastnr, String fuBygnr, String fuPreltid, String fuAnmovr, String fuAnmovrtfn, String fuKundnrovr, String fuKommentar, String fuAnm, String fuKundnr, long fuFras, String fuFakturaid, String fuMomsktol, String fuFaktureras, String fuProjkonto, String fuFrastext, String fuResursext, String fuDriftproj, String fuDateBest, String fuBestId, String fuUtfid, String fuUtfdat, double fuUtftid, long fuBelopp, long fuBesid, String fuOffertid, String fuBytenhtyp, String fuAcceptdat, String fuPamin1, String fuPamin2, String fuHetaarb, String fuArbmiljo, long fuKundbelopp, long fuFaktnr, long fuFaktradnr, String fuRefid, String fuModid, String fuPrio, long fuOrgin, String fuKundnr2, String fuProdnrarb, String fuProdnrtid, String fuEnhetsnotering, String fuAnmovrepost, String fuFtill5, String fuFtill6, long fuBeloppm, long fuRamavtal, String fuPrefaktura, long fuPrefakturabelopp, String fuPreltidTom, long fuBokningStatus, String fuNyckelkod, String fuExterntBestallningsId, String fuExterntBestallningsNr, String fuAgressoRead, Timestamp fuSlaStart, Timestamp fuSlaAvtalatSlut, long fuSlaDiffSlut, Timestamp fuSlaFaktisktSlut) {
    this.fuFelradnr = fuFelradnr;
    this.fuObjnr = fuObjnr;
    this.fuRegdat = fuRegdat;
    this.fuRegid = fuRegid;
    this.fuUtrnr = fuUtrnr;
    this.fuEnhnr = fuEnhnr;
    this.fuFelbesk = fuFelbesk;
    this.fuModdat = fuModdat;
    this.fuStatus = fuStatus;
    this.fuAkut = fuAkut;
    this.fuDateAkut = fuDateAkut;
    this.fuIdAkut = fuIdAkut;
    this.fuUtrkod = fuUtrkod;
    this.fuEnhtyp = fuEnhtyp;
    this.fuResurs = fuResurs;
    this.fuArttyp = fuArttyp;
    this.fuArtnr = fuArtnr;
    this.fuFeltyp = fuFeltyp;
    this.fuAnsvoc = fuAnsvoc;
    this.fuOmr = fuOmr;
    this.fuTfnavk = fuTfnavk;
    this.fuGain = fuGain;
    this.fuPreldat = fuPreldat;
    this.fuAvrhbh = fuAvrhbh;
    this.fuFtill1 = fuFtill1;
    this.fuFtill2 = fuFtill2;
    this.fuFtill3 = fuFtill3;
    this.fuFtill4 = fuFtill4;
    this.fuMomskto = fuMomskto;
    this.fuFritext = fuFritext;
    this.fuFtgnr = fuFtgnr;
    this.fuFastnr = fuFastnr;
    this.fuBygnr = fuBygnr;
    this.fuPreltid = fuPreltid;
    this.fuAnmovr = fuAnmovr;
    this.fuAnmovrtfn = fuAnmovrtfn;
    this.fuKundnrovr = fuKundnrovr;
    this.fuKommentar = fuKommentar;
    this.fuAnm = fuAnm;
    this.fuKundnr = fuKundnr;
    this.fuFras = fuFras;
    this.fuFakturaid = fuFakturaid;
    this.fuMomsktol = fuMomsktol;
    this.fuFaktureras = fuFaktureras;
    this.fuProjkonto = fuProjkonto;
    this.fuFrastext = fuFrastext;
    this.fuResursext = fuResursext;
    this.fuDriftproj = fuDriftproj;
    this.fuDateBest = fuDateBest;
    this.fuBestId = fuBestId;
    this.fuUtfid = fuUtfid;
    this.fuUtfdat = fuUtfdat;
    this.fuUtftid = fuUtftid;
    this.fuBelopp = fuBelopp;
    this.fuBesid = fuBesid;
    this.fuOffertid = fuOffertid;
    this.fuBytenhtyp = fuBytenhtyp;
    this.fuAcceptdat = fuAcceptdat;
    this.fuPamin1 = fuPamin1;
    this.fuPamin2 = fuPamin2;
    this.fuHetaarb = fuHetaarb;
    this.fuArbmiljo = fuArbmiljo;
    this.fuKundbelopp = fuKundbelopp;
    this.fuFaktnr = fuFaktnr;
    this.fuFaktradnr = fuFaktradnr;
    this.fuRefid = fuRefid;
    this.fuModid = fuModid;
    this.fuPrio = fuPrio;
    this.fuOrgin = fuOrgin;
    this.fuKundnr2 = fuKundnr2;
    this.fuProdnrarb = fuProdnrarb;
    this.fuProdnrtid = fuProdnrtid;
    this.fuEnhetsnotering = fuEnhetsnotering;
    this.fuAnmovrepost = fuAnmovrepost;
    this.fuFtill5 = fuFtill5;
    this.fuFtill6 = fuFtill6;
    this.fuBeloppm = fuBeloppm;
    this.fuRamavtal = fuRamavtal;
    this.fuPrefaktura = fuPrefaktura;
    this.fuPrefakturabelopp = fuPrefakturabelopp;
    this.fuPreltidTom = fuPreltidTom;
    this.fuBokningStatus = fuBokningStatus;
    this.fuNyckelkod = fuNyckelkod;
    this.fuExterntBestallningsId = fuExterntBestallningsId;
    this.fuExterntBestallningsNr = fuExterntBestallningsNr;
    this.fuAgressoRead = fuAgressoRead;
    this.fuSlaStart = fuSlaStart;
    this.fuSlaAvtalatSlut = fuSlaAvtalatSlut;
    this.fuSlaDiffSlut = fuSlaDiffSlut;
    this.fuSlaFaktisktSlut = fuSlaFaktisktSlut;
  }

  public long getFuFelradnr() {
    return fuFelradnr;
  }

  public void setFuFelradnr(long fuFelradnr) {
    this.fuFelradnr = fuFelradnr;
  }


  public String getFuObjnr() {
    return fuObjnr;
  }

  public void setFuObjnr(String fuObjnr) {
    this.fuObjnr = fuObjnr;
  }


  public String getFuRegdat() {
    return fuRegdat;
  }

  public void setFuRegdat(String fuRegdat) {
    this.fuRegdat = fuRegdat;
  }


  public String getFuRegid() {
    return fuRegid;
  }

  public void setFuRegid(String fuRegid) {
    this.fuRegid = fuRegid;
  }


  public long getFuUtrnr() {
    return fuUtrnr;
  }

  public void setFuUtrnr(long fuUtrnr) {
    this.fuUtrnr = fuUtrnr;
  }


  public long getFuEnhnr() {
    return fuEnhnr;
  }

  public void setFuEnhnr(long fuEnhnr) {
    this.fuEnhnr = fuEnhnr;
  }


  public String getFuFelbesk() {
    return fuFelbesk;
  }

  public void setFuFelbesk(String fuFelbesk) {
    this.fuFelbesk = fuFelbesk;
  }


  public java.sql.Timestamp getFuModdat() {
    return fuModdat;
  }

  public void setFuModdat(java.sql.Timestamp fuModdat) {
    this.fuModdat = fuModdat;
  }


  public String getFuStatus() {
    return fuStatus;
  }

  public void setFuStatus(String fuStatus) {
    this.fuStatus = fuStatus;
  }


  public String getFuAkut() {
    return fuAkut;
  }

  public void setFuAkut(String fuAkut) {
    this.fuAkut = fuAkut;
  }


  public String getFuDateAkut() {
    return fuDateAkut;
  }

  public void setFuDateAkut(String fuDateAkut) {
    this.fuDateAkut = fuDateAkut;
  }


  public String getFuIdAkut() {
    return fuIdAkut;
  }

  public void setFuIdAkut(String fuIdAkut) {
    this.fuIdAkut = fuIdAkut;
  }


  public String getFuUtrkod() {
    return fuUtrkod;
  }

  public void setFuUtrkod(String fuUtrkod) {
    this.fuUtrkod = fuUtrkod;
  }


  public String getFuEnhtyp() {
    return fuEnhtyp;
  }

  public void setFuEnhtyp(String fuEnhtyp) {
    this.fuEnhtyp = fuEnhtyp;
  }


  public String getFuResurs() {
    return fuResurs;
  }

  public void setFuResurs(String fuResurs) {
    this.fuResurs = fuResurs;
  }


  public String getFuArttyp() {
    return fuArttyp;
  }

  public void setFuArttyp(String fuArttyp) {
    this.fuArttyp = fuArttyp;
  }


  public String getFuArtnr() {
    return fuArtnr;
  }

  public void setFuArtnr(String fuArtnr) {
    this.fuArtnr = fuArtnr;
  }


  public String getFuFeltyp() {
    return fuFeltyp;
  }

  public void setFuFeltyp(String fuFeltyp) {
    this.fuFeltyp = fuFeltyp;
  }


  public String getFuAnsvoc() {
    return fuAnsvoc;
  }

  public void setFuAnsvoc(String fuAnsvoc) {
    this.fuAnsvoc = fuAnsvoc;
  }


  public String getFuOmr() {
    return fuOmr;
  }

  public void setFuOmr(String fuOmr) {
    this.fuOmr = fuOmr;
  }


  public String getFuTfnavk() {
    return fuTfnavk;
  }

  public void setFuTfnavk(String fuTfnavk) {
    this.fuTfnavk = fuTfnavk;
  }


  public String getFuGain() {
    return fuGain;
  }

  public void setFuGain(String fuGain) {
    this.fuGain = fuGain;
  }


  public String getFuPreldat() {
    return fuPreldat;
  }

  public void setFuPreldat(String fuPreldat) {
    this.fuPreldat = fuPreldat;
  }


  public String getFuAvrhbh() {
    return fuAvrhbh;
  }

  public void setFuAvrhbh(String fuAvrhbh) {
    this.fuAvrhbh = fuAvrhbh;
  }


  public String getFuFtill1() {
    return fuFtill1;
  }

  public void setFuFtill1(String fuFtill1) {
    this.fuFtill1 = fuFtill1;
  }


  public String getFuFtill2() {
    return fuFtill2;
  }

  public void setFuFtill2(String fuFtill2) {
    this.fuFtill2 = fuFtill2;
  }


  public String getFuFtill3() {
    return fuFtill3;
  }

  public void setFuFtill3(String fuFtill3) {
    this.fuFtill3 = fuFtill3;
  }


  public String getFuFtill4() {
    return fuFtill4;
  }

  public void setFuFtill4(String fuFtill4) {
    this.fuFtill4 = fuFtill4;
  }


  public String getFuMomskto() {
    return fuMomskto;
  }

  public void setFuMomskto(String fuMomskto) {
    this.fuMomskto = fuMomskto;
  }


  public String getFuFritext() {
    return fuFritext;
  }

  public void setFuFritext(String fuFritext) {
    this.fuFritext = fuFritext;
  }


  public String getFuFtgnr() {
    return fuFtgnr;
  }

  public void setFuFtgnr(String fuFtgnr) {
    this.fuFtgnr = fuFtgnr;
  }


  public String getFuFastnr() {
    return fuFastnr;
  }

  public void setFuFastnr(String fuFastnr) {
    this.fuFastnr = fuFastnr;
  }


  public String getFuBygnr() {
    return fuBygnr;
  }

  public void setFuBygnr(String fuBygnr) {
    this.fuBygnr = fuBygnr;
  }


  public String getFuPreltid() {
    return fuPreltid;
  }

  public void setFuPreltid(String fuPreltid) {
    this.fuPreltid = fuPreltid;
  }


  public String getFuAnmovr() {
    return fuAnmovr;
  }

  public void setFuAnmovr(String fuAnmovr) {
    this.fuAnmovr = fuAnmovr;
  }


  public String getFuAnmovrtfn() {
    return fuAnmovrtfn;
  }

  public void setFuAnmovrtfn(String fuAnmovrtfn) {
    this.fuAnmovrtfn = fuAnmovrtfn;
  }


  public String getFuKundnrovr() {
    return fuKundnrovr;
  }

  public void setFuKundnrovr(String fuKundnrovr) {
    this.fuKundnrovr = fuKundnrovr;
  }


  public String getFuKommentar() {
    return fuKommentar;
  }

  public void setFuKommentar(String fuKommentar) {
    this.fuKommentar = fuKommentar;
  }


  public String getFuAnm() {
    return fuAnm;
  }

  public void setFuAnm(String fuAnm) {
    this.fuAnm = fuAnm;
  }


  public String getFuKundnr() {
    return fuKundnr;
  }

  public void setFuKundnr(String fuKundnr) {
    this.fuKundnr = fuKundnr;
  }


  public long getFuFras() {
    return fuFras;
  }

  public void setFuFras(long fuFras) {
    this.fuFras = fuFras;
  }


  public String getFuFakturaid() {
    return fuFakturaid;
  }

  public void setFuFakturaid(String fuFakturaid) {
    this.fuFakturaid = fuFakturaid;
  }


  public String getFuMomsktol() {
    return fuMomsktol;
  }

  public void setFuMomsktol(String fuMomsktol) {
    this.fuMomsktol = fuMomsktol;
  }


  public String getFuFaktureras() {
    return fuFaktureras;
  }

  public void setFuFaktureras(String fuFaktureras) {
    this.fuFaktureras = fuFaktureras;
  }


  public String getFuProjkonto() {
    return fuProjkonto;
  }

  public void setFuProjkonto(String fuProjkonto) {
    this.fuProjkonto = fuProjkonto;
  }


  public String getFuFrastext() {
    return fuFrastext;
  }

  public void setFuFrastext(String fuFrastext) {
    this.fuFrastext = fuFrastext;
  }


  public String getFuResursext() {
    return fuResursext;
  }

  public void setFuResursext(String fuResursext) {
    this.fuResursext = fuResursext;
  }


  public String getFuDriftproj() {
    return fuDriftproj;
  }

  public void setFuDriftproj(String fuDriftproj) {
    this.fuDriftproj = fuDriftproj;
  }


  public String getFuDateBest() {
    return fuDateBest;
  }

  public void setFuDateBest(String fuDateBest) {
    this.fuDateBest = fuDateBest;
  }


  public String getFuBestId() {
    return fuBestId;
  }

  public void setFuBestId(String fuBestId) {
    this.fuBestId = fuBestId;
  }


  public String getFuUtfid() {
    return fuUtfid;
  }

  public void setFuUtfid(String fuUtfid) {
    this.fuUtfid = fuUtfid;
  }


  public String getFuUtfdat() {
    return fuUtfdat;
  }

  public void setFuUtfdat(String fuUtfdat) {
    this.fuUtfdat = fuUtfdat;
  }


  public double getFuUtftid() {
    return fuUtftid;
  }

  public void setFuUtftid(double fuUtftid) {
    this.fuUtftid = fuUtftid;
  }


  public long getFuBelopp() {
    return fuBelopp;
  }

  public void setFuBelopp(long fuBelopp) {
    this.fuBelopp = fuBelopp;
  }


  public long getFuBesid() {
    return fuBesid;
  }

  public void setFuBesid(long fuBesid) {
    this.fuBesid = fuBesid;
  }


  public String getFuOffertid() {
    return fuOffertid;
  }

  public void setFuOffertid(String fuOffertid) {
    this.fuOffertid = fuOffertid;
  }


  public String getFuBytenhtyp() {
    return fuBytenhtyp;
  }

  public void setFuBytenhtyp(String fuBytenhtyp) {
    this.fuBytenhtyp = fuBytenhtyp;
  }


  public String getFuAcceptdat() {
    return fuAcceptdat;
  }

  public void setFuAcceptdat(String fuAcceptdat) {
    this.fuAcceptdat = fuAcceptdat;
  }


  public String getFuPamin1() {
    return fuPamin1;
  }

  public void setFuPamin1(String fuPamin1) {
    this.fuPamin1 = fuPamin1;
  }


  public String getFuPamin2() {
    return fuPamin2;
  }

  public void setFuPamin2(String fuPamin2) {
    this.fuPamin2 = fuPamin2;
  }


  public String getFuHetaarb() {
    return fuHetaarb;
  }

  public void setFuHetaarb(String fuHetaarb) {
    this.fuHetaarb = fuHetaarb;
  }


  public String getFuArbmiljo() {
    return fuArbmiljo;
  }

  public void setFuArbmiljo(String fuArbmiljo) {
    this.fuArbmiljo = fuArbmiljo;
  }


  public long getFuKundbelopp() {
    return fuKundbelopp;
  }

  public void setFuKundbelopp(long fuKundbelopp) {
    this.fuKundbelopp = fuKundbelopp;
  }


  public long getFuFaktnr() {
    return fuFaktnr;
  }

  public void setFuFaktnr(long fuFaktnr) {
    this.fuFaktnr = fuFaktnr;
  }


  public long getFuFaktradnr() {
    return fuFaktradnr;
  }

  public void setFuFaktradnr(long fuFaktradnr) {
    this.fuFaktradnr = fuFaktradnr;
  }


  public String getFuRefid() {
    return fuRefid;
  }

  public void setFuRefid(String fuRefid) {
    this.fuRefid = fuRefid;
  }


  public String getFuModid() {
    return fuModid;
  }

  public void setFuModid(String fuModid) {
    this.fuModid = fuModid;
  }


  public String getFuPrio() {
    return fuPrio;
  }

  public void setFuPrio(String fuPrio) {
    this.fuPrio = fuPrio;
  }


  public long getFuOrgin() {
    return fuOrgin;
  }

  public void setFuOrgin(long fuOrgin) {
    this.fuOrgin = fuOrgin;
  }


  public String getFuKundnr2() {
    return fuKundnr2;
  }

  public void setFuKundnr2(String fuKundnr2) {
    this.fuKundnr2 = fuKundnr2;
  }


  public String getFuProdnrarb() {
    return fuProdnrarb;
  }

  public void setFuProdnrarb(String fuProdnrarb) {
    this.fuProdnrarb = fuProdnrarb;
  }


  public String getFuProdnrtid() {
    return fuProdnrtid;
  }

  public void setFuProdnrtid(String fuProdnrtid) {
    this.fuProdnrtid = fuProdnrtid;
  }


  public String getFuEnhetsnotering() {
    return fuEnhetsnotering;
  }

  public void setFuEnhetsnotering(String fuEnhetsnotering) {
    this.fuEnhetsnotering = fuEnhetsnotering;
  }


  public String getFuAnmovrepost() {
    return fuAnmovrepost;
  }

  public void setFuAnmovrepost(String fuAnmovrepost) {
    this.fuAnmovrepost = fuAnmovrepost;
  }


  public String getFuFtill5() {
    return fuFtill5;
  }

  public void setFuFtill5(String fuFtill5) {
    this.fuFtill5 = fuFtill5;
  }


  public String getFuFtill6() {
    return fuFtill6;
  }

  public void setFuFtill6(String fuFtill6) {
    this.fuFtill6 = fuFtill6;
  }


  public long getFuBeloppm() {
    return fuBeloppm;
  }

  public void setFuBeloppm(long fuBeloppm) {
    this.fuBeloppm = fuBeloppm;
  }


  public long getFuRamavtal() {
    return fuRamavtal;
  }

  public void setFuRamavtal(long fuRamavtal) {
    this.fuRamavtal = fuRamavtal;
  }


  public String getFuPrefaktura() {
    return fuPrefaktura;
  }

  public void setFuPrefaktura(String fuPrefaktura) {
    this.fuPrefaktura = fuPrefaktura;
  }


  public long getFuPrefakturabelopp() {
    return fuPrefakturabelopp;
  }

  public void setFuPrefakturabelopp(long fuPrefakturabelopp) {
    this.fuPrefakturabelopp = fuPrefakturabelopp;
  }


  public String getFuPreltidTom() {
    return fuPreltidTom;
  }

  public void setFuPreltidTom(String fuPreltidTom) {
    this.fuPreltidTom = fuPreltidTom;
  }


  public long getFuBokningStatus() {
    return fuBokningStatus;
  }

  public void setFuBokningStatus(long fuBokningStatus) {
    this.fuBokningStatus = fuBokningStatus;
  }


  public String getFuNyckelkod() {
    return fuNyckelkod;
  }

  public void setFuNyckelkod(String fuNyckelkod) {
    this.fuNyckelkod = fuNyckelkod;
  }


  public String getFuExterntBestallningsId() {
    return fuExterntBestallningsId;
  }

  public void setFuExterntBestallningsId(String fuExterntBestallningsId) {
    this.fuExterntBestallningsId = fuExterntBestallningsId;
  }


  public String getFuExterntBestallningsNr() {
    return fuExterntBestallningsNr;
  }

  public void setFuExterntBestallningsNr(String fuExterntBestallningsNr) {
    this.fuExterntBestallningsNr = fuExterntBestallningsNr;
  }


  public String getFuAgressoRead() {
    return fuAgressoRead;
  }

  public void setFuAgressoRead(String fuAgressoRead) {
    this.fuAgressoRead = fuAgressoRead;
  }


  public java.sql.Timestamp getFuSlaStart() {
    return fuSlaStart;
  }

  public void setFuSlaStart(java.sql.Timestamp fuSlaStart) {
    this.fuSlaStart = fuSlaStart;
  }


  public java.sql.Timestamp getFuSlaAvtalatSlut() {
    return fuSlaAvtalatSlut;
  }

  public void setFuSlaAvtalatSlut(java.sql.Timestamp fuSlaAvtalatSlut) {
    this.fuSlaAvtalatSlut = fuSlaAvtalatSlut;
  }


  public long getFuSlaDiffSlut() {
    return fuSlaDiffSlut;
  }

  public void setFuSlaDiffSlut(long fuSlaDiffSlut) {
    this.fuSlaDiffSlut = fuSlaDiffSlut;
  }


  public java.sql.Timestamp getFuSlaFaktisktSlut() {
    return fuSlaFaktisktSlut;
  }

  public void setFuSlaFaktisktSlut(java.sql.Timestamp fuSlaFaktisktSlut) {
    this.fuSlaFaktisktSlut = fuSlaFaktisktSlut;
  }

}
