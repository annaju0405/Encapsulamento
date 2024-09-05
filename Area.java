public class Area {

    public double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }


    public double calcularAreaRetangulo(double largura, double altura) {
        return largura * altura;
    }


    public double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    public static void main(String[] args) {
        Area calc = new Area();

      
        double areaQuadrado = calc.calcularAreaQuadrado(5);
        System.out.println("Área do quadrado: " + areaQuadrado);

        
        double areaRetangulo = calc.calcularAreaRetangulo(4, 6);
        System.out.println("Área do retângulo: " + areaRetangulo);

       
        double areaCirculo = calc.calcularAreaCirculo(3);
        System.out.println("Área do círculo: " + areaCirculo);
    }
}
