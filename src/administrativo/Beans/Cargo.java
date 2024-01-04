package administrativo.Beans;

import javax.swing.JCheckBox;

    public class Cargo {
        
    private int idCargo;
    private String NomeCargo;
    private String descricao;
    private String salario;

    public Cargo() {
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getNomeCargo() {
        return NomeCargo;
    }

    public void setNomeCargo(String NomeCargo) {
        this.NomeCargo = NomeCargo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    

   

    

       
}

