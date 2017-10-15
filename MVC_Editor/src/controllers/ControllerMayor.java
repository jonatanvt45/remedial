/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.ViewMayor;
import models.ModelMayor;
/**
 *
 * @author JonatanVT
 */
public class ControllerMayor {
private final ModelMayor model_mayor;
private final ViewMayor view_mayor;

public ControllerMayor(ModelMayor model_mayor, Object views[]){
    this.model_mayor= model_mayor;
    this.view_mayor = (ViewMayor) views[2];
    initView();
}

public void initView(){
        view_mayor.jtf_n1.setText("" + model_mayor.getN1());
        view_mayor.jtf_n2.setText("" + model_mayor.getN2());
        view_mayor.jtf_n3.setText("" + model_mayor.getN3());
        view_mayor.jbtn_calcular.addActionListener(e -> jbtn_calcularMouseClicked());
    }
    
    public void jbtn_calcularMouseClicked(){
        model_mayor.setN1(Double.parseDouble(view_mayor.jtf_n1.getText()));
        model_mayor.setN2(Double.parseDouble(view_mayor.jtf_n2.getText()));
        model_mayor.setN3(Double.parseDouble(view_mayor.jtf_n3.getText()));
        model_mayor.CalcularMayor();
        view_mayor.jlb_resultado.setText("Mayor: " + model_mayor.getN_Mayor());
    }
}
