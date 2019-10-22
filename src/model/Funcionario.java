package model;

import java.io.StringReader;

public class Funcionario {

    public String nome;
    public String area;
    public Double codigo;
    public  String lider;

    public Funcionario(String nome, String area, Double codigo, String lider) {
        this.nome = nome;
        this.area = area;
        this.codigo = codigo;
        this.lider = lider;
    }

    @Override
    public String toString() {
        return "Funcionário{" +
                "nome='" + nome + '\'' +
                ", area='" + area + '\'' +
                ", codigo=" + codigo +
                ", lider='" + lider + '\'' +
                '}';
    }
}


