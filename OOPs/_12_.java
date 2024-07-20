
public class _12_ {
  public static void main(String[] args) {
    Complex c1 = new Complex(1, 1);
    Complex c2 = new Complex(1, 1);
    Complex add = Complex.add(c1, c2);
    Complex diff = Complex.diff(c1, c2);
    Complex prod = Complex.product(c1, c2);
    add.printComplex();
    diff.printComplex();
    prod.printComplex();
  }
}

class Complex {
  int real;
  int imag;

  public Complex(int real, int imag) {
    this.real = real;
    this.imag = imag;
  }

  public static Complex add(Complex c1, Complex c2) {
    return new Complex((c1.real + c2.real), (c1.imag + c2.imag));
  }

  public static Complex diff(Complex c1, Complex c2) {
    return new Complex((c1.real - c2.real), (c1.imag - c2.imag));
  }

  public static Complex product(Complex c1, Complex c2) {
    return new Complex(((c1.real * c2.real) - (c1.imag * c2.imag)), ((c1.real * c2.imag) + (c1.imag * c2.real)));
  }
  
  public void printComplex() {
    if (real == 0 && imag != 0) {
      System.out.println(imag + "i");
    }
    else if (real != 0 && imag == 0) {
      System.out.println(real);
    }
    else {
      System.out.println(real + "+" + imag+"i");
    }
  }
}
