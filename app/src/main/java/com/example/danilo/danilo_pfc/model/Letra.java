package com.example.danilo.danilo_pfc.model;

import android.graphics.Bitmap;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

/**
 * Created by thevilela on 26/02/17.
 */


public class Letra extends SugarRecord{

    @Unique
    private String nome;

    private byte[] telaLetra;
    private byte[] telaSilaba;
    private byte[] telaSentenca;

    public Letra(String nome, byte[] telaLetra, byte[] telaSilaba, byte[] telaSentenca) {
        this.nome = nome;
        this.telaLetra = telaLetra;
        this.telaSilaba = telaSilaba;
        this.telaSentenca = telaSentenca;
    }

    public Letra(String nome) {
        this.nome = nome;
    }

    public Letra() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte[] getTelaLetra() {
        return telaLetra;
    }

    public void setTelaLetra(byte[] telaLetra) {
        this.telaLetra = telaLetra;
    }

    public byte[] getTelaSilaba() {
        return telaSilaba;
    }

    public void setTelaSilaba(byte[] telaSilaba) {
        this.telaSilaba = telaSilaba;
    }

    public byte[] getTelaSentenca() {
        return telaSentenca;
    }

    public void setTelaSentenca(byte[] telaSentenca) {
        this.telaSentenca = telaSentenca;
    }
}
