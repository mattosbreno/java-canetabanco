package br.org.curso;

/**
 *
 * @author polar
 */
public class Conta {
    private String agencia;
    private String conta;
    private String nome;
    private String banco;
    private String senha;
    private double saldo;
    
    private Cliente cliente;
    
        public Conta(String conta, Cliente cliente, double saldo, String senha) {
        this.conta = conta;
        this.cliente = cliente;
        this.saldo = saldo;
        this.senha = senha;
    }
    
    /*
    public Conta(String agencia, String conta, Cliente cliente, String banco, String nome, String senha, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.banco = banco;
        this.nome = nome;
        this.cliente = cliente;
        this.senha = senha;
        this.saldo = saldo;
    }
    */
        
        
        
        
    //Getters e Setters
    public double getSaldo(){
        return this.saldo;
    }
    
    public String getBanco(){
        return this.banco;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public String getConta(){
        return this.conta;
    }
    
    public String getSenha(){
        return this.senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getAgencia(){
        return this.agencia;
    }
        
        
        
        
        //Método de depósito
        String deposito (double qtdeDeposito) {
        saldo += qtdeDeposito;
        return "Depósito de " + qtdeDeposito + " realizado com sucesso.";
    }
        
        
        
        
        //Método de saque
        String saque (double qtdeSaque) {
        if (qtdeSaque > saldo){
            return "Saldo insuficiente para realizar o saque.";
        }
        saldo -= qtdeSaque;
        return "Saque de " + qtdeSaque + " realizado com sucesso.";
    }
        
        
        
        
        //Método de transferência
        String transferir (double qtdeDeposito, Conta contaDestino) {
            if (qtdeDeposito > this.saldo) {
                return "Saldo insuficiente";
            }   
            this.saque(qtdeDeposito);
            contaDestino.deposito(qtdeDeposito);
            return "Transferência de " + qtdeDeposito
                + " realizado com sucesso da conta\n"
                + this.conta + " " + (cliente.getSexo() == 'F'?"da":"do")
                + " cliente " + cliente.getNome() + " para a conta "
                + contaDestino.conta + " "
                + (contaDestino.getCliente().getSexo() == 'F'?"da":"do")
                + "\ncliente " + contaDestino.getCliente().getNome() 
                + ".\n";
    }
        
        
        
        //Mostrar as informações da conta
        String mostrarInfo() {
            String info;
            info = "Número da conta: " + this.conta + "\n";
            info += "Nome do cliente: " + this.cliente.getNome() + "\n";
            info += "Idade do cliente: " + this.cliente.getIdade() + "\n";
            info += "Sexo do cliente: " + this.cliente.getSexo() + "\n";
            info += "Saldo da conta: " + this.saldo + "\n";
            info += "--------------------------------------------------------";
                    
            return info;
        }
}