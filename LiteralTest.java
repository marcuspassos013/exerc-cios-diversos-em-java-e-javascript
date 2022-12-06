/**
 * Literais de teste para vários tipos primitivos
 */ 
public class LiteralTest {
   public static void main(String[] args) {
      String nome = "Tan Ah Teck"; // A string está entre aspas duplas 
      char gender = 'm';           // char é 
      boolean isMarried = true;    // booleano de true ou false 
      byte numChildren = 8;        // Intervalo de bytes é [-127, 128] 
      short yearOfBirth = 1945;    // Intervalo de curto é [-32767, 32768]. Além do byte 
      int salario = 88000;          // Além dos intervalos de byte e short 
      long netAsset = 8234567890L; // Necessita do sufixo 'L' por muito tempo. Alem de int 
      double peso = 88.88;       // Com parte fracionária 
      float gpa = 3.88f;           // Necessita do sufixo 'f' para float

      // println() pode ser usado para imprimir valores de qualquer tipo
      System.out.println("O nome é: " + nome);
      // O nome é: Tan Ah Teck
      System.out.println("Sexo é: " + gender);
      // Gênero é: m
      System.out.println("É casado é: " + isMarried);
      // É casado é: true
      System.out.println("Número de filhos é: " + numChildren);
      // Número de filhos é: 8
      System.out.println("O ano de nascimento é: " + yearOfBirth);
      // O ano de nascimento é: 1945
      System.out.println("Salário é: " + salario);
      // O salário é: 88000
      System.out.println("Ativo Líquido é: " + netAsset);
      // O patrimônio líquido é: 8234567890
      System.out.println("Peso é: " + peso);
      // Peso é: 88,88
      System.out.println("GPA é: " + gpa);
      // GPA é: 3,88
   }
}
