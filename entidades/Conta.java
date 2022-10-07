package ProjetoFinanceiro.entidades;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

ublic class Conta {

   private Agencia agencia; 
   private Pessoa cliente; 
   private ArrayList<Transacao> transações = new ArrayList<>(); 
   private int id; 
   private String numero; 
   private double saldo;
   private double limite;
   public static int contadorContas = 0; 

   public Conta() {
   }

   public Conta(Agencia agencia, Pessoa pessoa, int id, String numero, double saldo, double limite) {
       this.agencia = agencia;
       this.cliente = pessoa;
       this.id = id;
       this.numero = numero;
       this.saldo = saldo;
       this.limite = limite;
   }

   public Agencia getAgencia() {
       return agencia;
   }

   public void setAgencia(Agencia agencia) {
       this.agencia = agencia;
   }

   
   public Pessoa getCliente() {
       return cliente;
   }

   public void setCliente(Pessoa cliente) {
       this.cliente = cliente;
   }

   public ArrayList<Transacao> getTransações() {
       return transações;
   }

   public void setTransações(ArrayList<Transacao> transações) {
       this.transações = transações;
   }

   public int getId() {
       return id;
   }

   public void setId(int id) {
       this.id = id;
   }

   public String getNumero() {
       return numero;
   }

   public double getSaldo() {
       return saldo;
   }

   public double getLimite() {
       return limite;
   }

   public void setLimite(double limite) {
       this.limite = limite;
   }
   
  
   
}