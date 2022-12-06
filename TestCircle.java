/*
 * Um driver de teste para a classe "Circle"
 */
public class TestCircle {
    public static void main(String[] args) {
        //Ponto de entrada do programa
        //Declarando e construindo uma instância da classe Circle
        //chamada c1, usando o terceiro construtor.
        System.out.println();
        Circle c1 = new Circle(2.0, "azul");
        System.out.println("Primeiro objeto:");
        System.out.println("O raio é:" + c1.getRadius());
        System.out.println("A cor é: " + c1.getColor());
        System.out.printf("A área é: %.2f%n", c1.getArea());
        System.out.println();

        //Declara e constrói outra instância da classe Circle
        //chamada c2, usando o segundo construtor.
        Circle c2 = new Circle(2.0);
        System.out.println("Segundo objeto:");
        System.out.println("O raio é: " + c2.getRadius());
        System.out.println("A cor é: " + c2.getColor());
        System.out.printf("A área é: %.2f%n" ,c2.getArea());
        System.out.println();

        //Agora usando o primeiro construtor.
        Circle c3 = new Circle();
        System.out.println("Terceiro objeto:");
        System.out.println("O raio é: " + c3.getRadius());
        System.out.println("A cor é: " + c3.getColor());
        System.out.printf("A área é: %.2f%n", c3.getArea());
        
    }   
}