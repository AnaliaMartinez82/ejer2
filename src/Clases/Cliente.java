package Clases;

import javax.swing.*;

public class Cliente {
    private String nombre;
    private int dni;
    private Double saldo;
    private int nroDeCuenta;
    private int cbu;
    private String alias;

    public Cliente(String nombre, int dni){
        this.nombre= nombre;
        this.dni = dni;
        this.saldo= 0.0;
        this.nroDeCuenta = 123456;
        this.cbu = 123456;
        this.alias = nombre+"random";
    }

    public String getNombre(){
        return this.nombre;
    }
    public int get.dni(){
        return this.dni;
    }
    public Double get.saldo(){
        return this.saldo;
    }

    public void setSaldo(Double newSaldo) {
        this.saldo = newSaldo;
    }
    public int getnroDeCuenta(){
        return this.nroDeCuenta;
    }
    public Int getcbu(){
        return this.cbu;
    }
    public String getAlias(){
        return this.alias;
    }

    public void setAlias(String newAlias) {
        this.alias = newAlias;
    }
}
