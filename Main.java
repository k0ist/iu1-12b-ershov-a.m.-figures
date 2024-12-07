import java.util.Scanner;


public class Main {
    public static class figure {
        public figure() {
            super();
        }
        public void exists(double ... args) {
        }
        public double square(double ... args) {
            double Square = 0;
            return Square;
        }
        public double perimeter(double ... args) {
            double Perimeter = 0;
            return Perimeter;
        }
    }
    public static class rectangle extends figure {
        private double a, b;
        public rectangle(double ar, double br) {
            super();
            a = ar;
            b = br;
        }

        @Override
        public void exists(double ... args) {
            super.exists(args);
            if (a > 0 && b > 0) {
                System.out.println("This rectangle exists.");
            }
            else {
                throw new RuntimeException("There is no figure with such parameters.");
            }
        }


        @Override
        public double square(double  ... args) {
            double Square = a * b;
            return Square;
        }


        @Override
        public double perimeter(double ... args) {
            return 2 * (a + b);
        }
    }


    public static class triangle extends figure {
        private int a, b, c;
        public triangle(int at, int bt, int ct) {
            super();
            a = at;
            b = bt;
            c = ct;
        }


        @Override
        public void exists(double ... args) {
            super.exists(args);
            if (a > 0 && b > 0 && c > 0) {
                if (a < b + c && b < a + c && c < a + b) {
                    System.out.println("This triangle exists.");
                } else {
                    throw new RuntimeException("There is no figure with such parameters.");
                }
            } else {
                throw new RuntimeException("There is no figure with such parameters.");
            }
        }


        @Override
        public double square(double ... args) {
            double pp = (a + b + c) / 2;
            double Square = Math.pow((pp * (pp - a) * (pp - b) * (pp - c)), 0.5);
            return Square;
        }


        @Override
        public double perimeter(double ... args) {
            return a + b + c;
        }
    }


    public static class circle extends figure {
        private int a;
        public circle(int ar) {
            super();
            a = ar;
        }

        @Override
        public void exists(double... args) {
            super.exists(args);
            if (a > 0) {
                System.out.println("This circle exists.");
            }
            else {
                throw new RuntimeException("There is no figure with such parameters.");
            }
        }


        @Override
        public double square(double  ... args) {
            double Square = Math.pow(a, 2) * 3.141592;
            return Square;
        }


        @Override
        public double perimeter(double ... args) {
            return 2 * 3.141592 * a;
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input your numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        triangle abc = new triangle(a, b, c);
        rectangle abcd = new rectangle(a, b);
        circle ao = new circle(a);
        System.out.println(ao.perimeter());
    }
}

//