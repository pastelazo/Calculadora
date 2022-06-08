
package calculadorabasica;

public class Calculadora {

private double num1; private double num2;

    public void setNumero1(double num1){
    this.num1=num1;
    }
    public void setNumero2(double num2){
    this.num2=num2;
    }
    public double getNumero1(){
      return num1;
    }
    public double suma(){
      double suma = num1+num2;
      return suma;
    }
    public double resta(){
        double resta = num1-num2;
        return resta;
    }
    public double multiplicar(){
        double multip = num1 * num2;
        return multip;
    }
    public double dividir(){
        double divi = num1/num2;
        return divi;
    }
}
