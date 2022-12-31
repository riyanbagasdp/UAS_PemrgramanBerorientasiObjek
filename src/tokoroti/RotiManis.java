/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokoroti;

/**
 *
 * @author lenovo
 */
public class RotiManis {
    public double beratTepung = 1000;
    public double beratGula = 150;
    public double beratButter = 150;
    public double beratRagi= 20;    
    public double beratSusuBubuk = 300 ;
    public double beratSusuCair =250;
    public double beratTelur = 80;
    public double beratEsBatu = 400;
    public double pesanManis;
    public double doughManis = 50;
    public double totalBahanManis;
    public double totalHargaManis;
    double total = 2350;
    double perPcs;
    public double tepung;
    public double gula;
    public double butter;
    public double ragi;
    public double sBubuk;
    public double sCair;
    public double telur;
    public double es;      
    public double hTepung;
    public double hGula;
    public double hButter;
    public double hRagi;
    public double hsBubuk;
    public double hsCair;
    public double hTelur;
    public double hEs; 
    public void hitungBeratPcs(){
        perPcs = this.total / this.doughManis;
        System.out.println(perPcs);
        tepung = this.beratTepung/this.perPcs;
        System.out.println(tepung);
        gula = this.beratGula/this.perPcs;
        System.out.println(gula);
        butter = this.beratButter/this.perPcs;
        System.out.println(butter);
        ragi = this.beratRagi/this.perPcs;
        System.out.println(ragi);
        sBubuk = this.beratSusuBubuk/this.perPcs;
        System.out.println(sBubuk);
        sCair = this.beratSusuCair/this.perPcs;
        System.out.println(sCair);
        telur = this.beratTelur/this.perPcs;
        System.out.println(telur);
        es = this.beratEsBatu/this.perPcs;
        System.out.println(es);
    }
    public void hitungHargaPcs(){
        hTepung = 40000/1000;
        hGula = 25000 / 1000;
        hButter = 23000 / 500;
        hRagi = 5000 / 11;
        hsBubuk = 39000 / 1000;
        hsCair = 24000 / 1000;
        hTelur = 23000 / 1000;
        hEs = 2000 / 1000;
    }
    public double hitungBeratBahan(){
        this.totalBahanManis = this.pesanManis * this.doughManis;
        System.out.println(totalBahanManis);
        return totalBahanManis;
    }
    public double hitungHargaBahan(){
        int hargaTepung = (int) (this.hTepung * (this.tepung * this.pesanManis));
        System.out.println(hargaTepung);
        int hargaGula = (int) (this.hGula * (this.gula * this.pesanManis));
        System.out.println(hargaGula);
        int hargaButter = (int) (this.hButter * (this.butter * this.pesanManis));
        System.out.println(hargaButter);
        int hargaRagi = (int) (this.hRagi * (this.ragi * this.pesanManis));
        System.out.println(hargaRagi);
        int hargasBubuk = (int) (this.hsBubuk * (this.sBubuk * this.pesanManis));
        System.out.println(hargasBubuk);
        int hargasCair = (int) (this.hsCair * (this.sCair * this.pesanManis));
        System.out.println(hargasCair);
        int hargaTelur = (int) (this.hTelur * (this.telur * this.pesanManis));
        System.out.println(hargaTelur);
        int hargaEs = (int) (this.hEs * (this.es * this.pesanManis));
        System.out.println(hargaEs);
        this.totalHargaManis = hargaTepung + hargaGula + hargaButter + hargaRagi + hargasBubuk + hargasCair + hargaTelur + hargaEs;
        System.out.println(totalHargaManis);
        return totalHargaManis;
    }
}
