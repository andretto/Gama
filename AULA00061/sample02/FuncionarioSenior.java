package sample02;

public class FuncionarioSenior extends Funcionario {
    private double bonus;

    public FuncionarioSenior(String nome, int horasTrabalhadas, double valorPagoPorHoraTrabalhada, double bonus) {
        super(nome, horasTrabalhadas, valorPagoPorHoraTrabalhada);
        this.bonus = bonus;
    }

    public double calculaSalario() {
        double salarioPreFinal;

        salarioPreFinal = super.getSalarioFinal();
        return salarioPreFinal + (bonus * getHorasTrabalhadas() / 10);

    }

    @Override
    public String exibir() {
        return "Nome: " + getNome() +" - Horas Trabalhas: " + getHorasTrabalhadas() + " - Valor Pago por hora: " + getValorPagoPorHoraTrabalhada() +" - Salario Final: " + calculaSalario();

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}