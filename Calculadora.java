public class Calculadora {

    public float suma(float a, float b){
        return a + b;
    }

    public float resta(float a, float b){
        return a - b;
    }

    public float multiplicacion(float a, float b){
        return a * b;
    }

    public float division(float a, float b){
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b; 
            
    }

}
