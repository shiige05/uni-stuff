/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20luta;

/**
 *
 * @author gabri
 */
public class Lutador implements ControladorLutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    private String getNome() {return nome;}
    private void setNome(String nome) {this.nome = nome;}
    private String getNacionalidade() {return nacionalidade;}
    private void setNacionalidade(String nacionalidade) {this.nacionalidade = nacionalidade;}
    private int getIdade() {return idade;}
    private void setIdade(int idade) {this.idade = idade;}
    private float getAltura() {return altura;}
    private void setAltura(float altura) {this.altura = altura;}
    private float getPeso() {return peso;}
    
    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    private String getCategoria() {return categoria;}
    
    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    
    private int getVitorias() {return vitorias;}
    private void setVitorias(int vitorias) {this.vitorias = vitorias;}
    private int getDerrotas() {return derrotas;}
    private void setDerrotas(int derrotas) {this.derrotas = derrotas;}
    private int getEmpates() {return empates;}
    private void setEmpates(int empates) {this.empates = empates;}

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    @Override
    public void apresentar() {
        System.out.println("-----");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Peso: " + this.getPeso() + "kg");
        System.out.println("Altura: " + this.getAltura() + "m");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("Derrotas: " + this.getDerrotas());
    }

    @Override
    public void status() {
        System.out.println("-----");
        System.out.println(this.getNome() + " é da categoria " + this.getCategoria() + ", venceu " + this.getVitorias() + ", empatou " + this.getEmpates() + " e perdeu " + this.getDerrotas());
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
