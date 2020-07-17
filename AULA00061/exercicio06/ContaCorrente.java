package exercicio06;

public class ContaCorrente extends Conta {
    public ContaCorrente(int numero) {
        super(numero);
    }

    public boolean saque(double valor){
        if (valor > 0 && getSaldo() >= valor) {
            super.saque(valor);
            return true;
        }
        return false;
    }


}
