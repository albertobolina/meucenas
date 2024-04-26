package com.pedro.xml.parsers.dto;

public class Local {
    private String nome;
    private String rua;
    private String codPostal;
    private String localidade;
    private String concelho;
    private String distrito;
    
    public Local(String nome, String rua, String codPostal, String localidade, String concelho, String distrito) {
        this.nome = nome;
        this.rua = rua;
        this.codPostal = codPostal;
        this.localidade = localidade;
        this.concelho = concelho;
        this.distrito = distrito;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getCodPostal() {
        return codPostal;
    }
    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    public String getConcelho() {
        return concelho;
    }
    public void setConcelho(String concelho) {
        this.concelho = concelho;
    }
    public String getDistrito() {
        return distrito;
    }
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    @Override
    public String toString() {
        return "Local [nome=" + nome + ", rua=" + rua + ", codPostal=" + codPostal + ", localidade=" + localidade
                + ", concelho=" + concelho + ", distrito=" + distrito + ", getNome()=" + getNome() + ", getRua()="
                + getRua() + ", getCodPostal()=" + getCodPostal() + ", getLocalidade()=" + getLocalidade()
                + ", getConcelho()=" + getConcelho() + ", getDistrito()=" + getDistrito() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }


}
