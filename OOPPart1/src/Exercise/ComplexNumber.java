package Exercise;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return this.real;
    }

    public double getImaginary(){
        return this.imaginary;
    }

    public void add (double real, double imaginary ){
        this.real += real;
        this.imaginary += imaginary;

    }

    public void add(ComplexNumber complexNumber){

        add(complexNumber.real, complexNumber.imaginary);
//        this.real += complexNumber.getReal();
//        this.imaginary += complexNumber.getImaginary();

    }

    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber complexNumber){
        subtract(complexNumber.real, complexNumber.imaginary);
//        this.real -= complexNumber.getReal();
//        this.imaginary -= complexNumber.getImaginary();
    }

}
