package Exercicios;

import java.time.LocalDate;
import java.time.Period;

public class HeartRate {

    private String nome, sobrenome;
    private int dia, mes, ano;

    public HeartRate(String nome, String sobrenome, int dia, int mes, int ano){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getNomeCompleto(){
        return getNome() + " " + getSobrenome();
    }
    public int getDia(){
        return this.dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public int getMes(){
        return this.mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public int getAno(){
        return this.ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public int calculaIdade(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataNascimento = LocalDate.of(this.getAno(), this.getMes(), this.getDia());
        Period diferenca = Period.between(dataNascimento, dataAtual);
        return diferenca.getYears();
    }

    public int calculaFreqCardiaca(){
        return 220 - this.calculaIdade();
    }

    public double calculaAlvo_Minima(){
        return this.calculaFreqCardiaca() * 0.50;
    }

    public double calculaAlvo_Maxima(){
        return this.calculaFreqCardiaca() * 0.85;
    }

    public static void main(String[] args) {
        
    }
}
