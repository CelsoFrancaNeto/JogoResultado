/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.resultado;

import java.util.Random;

/**
 *
 * @author Celso Franca Neto
 */
public class Resultado {

    private String num01;
    private String num02;
    private String resultado;
    private String operador;
    private String valorSessao;
    private Random random;
    private int pontuacao;

    public Resultado() {
        this.random = new Random();
        this.pontuacao = 0;
        this.valorSessao = "";
        atribuirQuestao();
    }

    public void atribuirQuestao() {

        int valor1 = random.nextInt(100);
        int valor2 = random.nextInt(100);
        int escolha = random.nextInt(4);

        switch (escolha) {
            case 0:
                this.operador = "+";
                this.resultado = String.valueOf(valor1 + valor2);
                break;
            case 1:
                this.operador = "-";
                if (valor1 > valor2) {
                    this.resultado = String.valueOf(valor1 - valor2);
                    break;
                } else {
                    int aux = valor2;
                    valor2 = valor1;
                    valor1 = aux;
                    this.resultado = String.valueOf(valor1 - valor2);
                    break;
                }
            case 2:
                this.operador = "*";
                this.resultado = String.valueOf(valor1 * valor2);
                break;
            case 3:
                this.operador = "/";
                if (valor1 % valor2 == 0) {
                    this.resultado = String.valueOf(valor1 / valor2);
                } else {
                    this.resultado = String.format("%.2f",(float)valor1/valor2);
                }
                break;
            default:
                this.operador = "+";
                this.resultado = String.valueOf(valor1 + valor2);
                break;
        }
        this.num01 = String.valueOf(valor1);
        this.num02 = String.valueOf(valor2);

    }

    public String getNum01() {
        return num01;
    }

    public String getNum02() {
        return num02;
    }

    public String getResultado() {
        return resultado;
    }

    public String getOperador() {
        return operador;
    }

    public void setValorSessao(String valor) {
        this.valorSessao = valor;
    }

    public void addValorSessao(String valor) {
        this.valorSessao += valor;
    }

    public String getValorSessao() {
        return this.valorSessao;
    }

    public void limparSessao() {
        this.valorSessao = "";
    }

    public void addPontuacao() {
        this.pontuacao++;
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

    public void setPontuacao(int valor) {
        this.pontuacao = valor;
    }

}
