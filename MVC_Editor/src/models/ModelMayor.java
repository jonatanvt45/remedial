/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author JonatanVT
 */
    public class ModelMayor {
    private double n1 = 6.0;
    private double n2 = 6.0;
    private double n3 = 6.0;
    private double n_mayor = 6.0;
    
    public double getN1(){
        return n1;
    }
    
    public double getN2(){
        return n2;
    }
    
    public double getN3(){
        return n3;
    }
    
    public double getN_Mayor(){
        return n_mayor;
    }
    
    public void setN1(double n1){
        this.n1 = n1;
    }
    
    public void setN2(double n2){
        this.n2 = n2;
    }
    
    public void setN3(double nu3){
        this.n3 = n3;
    }
    
    public void setN_Mayor(double n_mayor){
        this.n_mayor = n_mayor;
    }
    
    public void CalcularMayor(){
        n_mayor = n1;
        if(n_mayor < n2){
            n_mayor = n2;
        }
        if(n_mayor < n3){
            n_mayor = n3;
        }
    }
    }


