/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;
import telas.TelaCadastro;

/**
 *
 * @author Olivercom
 */
public class Orcamento {
    private int cod;
    private String discricao = " ";
    private String empresa = " ";
    private String telefone = " ";
    private Date date;
    private String obs = " ";

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDiscricao() {
        return discricao;
    }

    public void setDiscricao(String discricao) {
        this.discricao = discricao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDate() {
     JDateChooser  calendario = new JDateChooser(new Date(), "yyyy-MM-dd");
        return calendario.getDate();
    }

    public void setDate(Date date) {
        this.date = date;
    }

   

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
       
   
 
    
}
