package com.quirino.clases;

public class Personas {
    string nombre, persona;
    float peso;
    int altura;
    double imc;

    public Personas(string nombre, string persona, float peso, int altura, double imc) {
        this.nombre = nombre;
        this.persona = persona;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }

    public persona() {}

    public string getNombre() {
        return nombre;
    }

    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    public string getPersona() {
        return persona;
    }

    public void setPersona(string persona) {
        this.persona = persona;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    @Override
    public String toString() {
        return "Emmanuel" + getNombre() + "Su IMC es de" + getImc() + "IMC normal" + get
    }
}
