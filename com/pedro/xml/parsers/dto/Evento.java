package com.pedro.xml.parsers.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Evento {
    private String idEvento;
    private String nome;
    private String descricao;
    private double precoBilhete;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFinal;
    private Pessoa organizador;
    private Local local;
    private ArrayList<Pessoa> participante;

    public String getIdEvento() {
        return idEvento;
    }
    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getPrecoBilhete() {
        return precoBilhete;
    }
    public void setPrecoBilhete(double precoBilhete) {
        this.precoBilhete = precoBilhete;
    }
    public LocalDateTime getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }
    public LocalDateTime getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(LocalDateTime dataFinal) {
        this.dataFinal = dataFinal;
    }
    public Pessoa getOrganizador() {
        return organizador;
    }
    public void setOrganizador(Pessoa organizador) {
        this.organizador = organizador;
    }
    public Local getLocal() {
        return local;
    }
    public void setLocal(Local local) {
        this.local = local;
    }
    public ArrayList<Pessoa> getParticipante() {
        return participante;
    }
    public void setParticipante(ArrayList<Pessoa> participante) {
        this.participante = participante;
    }
    @Override
    public String toString() {
        return "Evento [idEvento=" + idEvento + ", nome=" + nome + ", descricao=" + descricao + ", precoBilhete="
                + precoBilhete + ", dataInicio=" + dataInicio + ", dataFinal=" + dataFinal + ", organizador="
                + organizador + ", local=" + local + ", participante=" + participante + ", getIdEvento()="
                + getIdEvento() + ", getNome()=" + getNome() + ", getDescricao()=" + getDescricao()
                + ", getPrecoBilhete()=" + getPrecoBilhete() + ", getDataInicio()=" + getDataInicio()
                + ", getDataFinal()=" + getDataFinal() + ", getOrganizador()=" + getOrganizador() + ", getLocal()="
                + getLocal() + ", getParticipante()=" + getParticipante() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

    

}
