public class Conta {
    private double saldo;
    private double chequeEspecial;

    public Conta(double saldo){
        this.saldo = saldo;
        if (saldo <= 500){
            this.chequeEspecial = 50;
        }else if (saldo > 500) {
            this.chequeEspecial = saldo * 0.5;
        }
      
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo é de: "+ saldo);
    }

    public void consultarChequeEspecial(){
        System.out.println("Seu cheque especial é de: " + chequeEspecial);
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
        }else if (valor > saldo){
            System.out.println("Saldo insuficiente.");
        }
    }

    public void pagarBoleto(double valor){
           if (valor <= saldo){
            saldo -= valor;
        }else if (valor > saldo){
            System.out.println("Saldo insuficiente.");
        }
    }

    public void verificarUsoChequeEspecial(){

    }

    public void cobrarTaxaChequeEspecial(){

    }
}
