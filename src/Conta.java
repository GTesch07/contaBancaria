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
        }else if (valor <= saldo + chequeEspecial){
            double restante = valor - saldo;
            saldo = 0;
            chequeEspecial -= restante;
            System.out.println("Você usou R$ " + restante + " do cheque especial.");
        }else{
            System.out.println("Saldo insuficiente, incluindo o limite do cheque especial.");
        }
    }

    public void pagarBoleto(double valor){
       sacar(valor);
       System.out.println("Boleto pago no valor de R$ " + valor);
    }

    public void verificarUsoChequeEspecial(){
        if (chequeEspecial < 50 && saldo <= 500 || chequeEspecial < saldo * 0.5 && saldo > 500){
            System.out.println("Você está utilizando o cheque especial.");
        }else{
            System.out.println("Você não está utilizando o cheque especial.");
        }
    }

    public void cobrarTaxaChequeEspecial(){
        double limiteOriginal;
        if(saldo <= 500){
            limiteOriginal = 50;
        }else{
            limiteOriginal = saldo * 0.5;
        }

        double valorUsado = limiteOriginal - chequeEspecial;

        if (valorUsado > 0) {
            double taxa = valorUsado * 0.2;
            if (saldo >= taxa) {
                saldo -= taxa;
                System.out.println("Foi cobrada uma taxa de R$ " + taxa + " referente ao uso do cheque especial.");
            }else{
                System.out.println("Saldo insuficiente para cobrar a taxa de cheque especial.");
            }
        }
    }
}
