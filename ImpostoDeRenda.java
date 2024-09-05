public class ImpostoDeRenda {

    private double salario;

    public ImpostoDeRenda(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("O salário não pode ser negativo.");
        }
    }

    public double calcularImpostoDeRenda() {
        double imposto;
        if (salario <= 1903.98) {
            imposto = 0.0; 
        } else if (salario <= 2826.65) {
            imposto = (salario - 1903.98) * 0.075; 
        } else if (salario <= 3751.05) {
            imposto = (salario - 2826.65) * 0.15 + 69.20; 
        } else if (salario <= 4664.68) {
            imposto = (salario - 3751.05) * 0.225 + 138.66; 
        } else {
            imposto = (salario - 4664.68) * 0.275 + 205.57;
        }
        return imposto;
    }

    public static void main(String[] args) {
        
        ImpostoDeRenda calculadora = new ImpostoDeRenda(2500.00);

        System.out.println("Salário: R$ " + calculadora.getSalario());

        double imposto = calculadora.calcularImpostoDeRenda();
        System.out.println("Imposto de Renda: R$ " + imposto);

        calculadora.setSalario(5000.00);
        System.out.println("Salário atualizado: R$ " + calculadora.getSalario());
        imposto = calculadora.calcularImpostoDeRenda();
        System.out.println("Imposto de Renda atualizado: R$ " + imposto);
    }
}
