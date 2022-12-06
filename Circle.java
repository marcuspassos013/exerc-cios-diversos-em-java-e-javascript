/*
 * Princípios para Orientação a Objetos.
 * Uma classe que modela um círculo com raio e cor.
 * Esta classe será chamada em outra classe externa que contém 
 * um métod main.
 */
public class Circle {
    //Variáveis de instância.
    private double radius;
    private String color;

    // Aqui farei uma sobrecarga de construtores.
    //Parte do código destinada a criar os atributos da classe.
    //1º construtor(construtor padrão)
    //Constrói uma instância de Circle com raio e cor padrão.
    public Circle(){
        radius = 1.0;       //Literal
        color = "vermelho";//Literal
    }

    //2º construtor 
    //Constrói uma instância de Circle com o raio forneciado mediante variável e cor padrão
    public Circle(double r){
        radius = r; //Recebe uma variável como parâmetro.
        color = "vermelho";//Literal
    }

    //3º construtor
    //Constrói uma instância de Circle com o raio e cor fornecidos mediante variáveis.
    public Circle(double r, String c){
        radius = r;
        color = c; 
    }

    //Métodos públicos 
    //Parte do código responsável pela parte lógica do corpo da classe.
    //Método/função responsável por retornar o raio do objeto.
    public double getRadius(){
        return radius;
    }

    //Método/função responsável por retornar a cor do objeto.
    public String getColor(){
        return color;
    }

    //Método/função responsável por retornar a área do círculo.
    public double getArea(){
        return radius * radius * Math.PI;
    }

}
