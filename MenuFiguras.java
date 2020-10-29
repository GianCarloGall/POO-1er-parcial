import java.util.Scanner;
class MenuFiguras{
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        int op = 0, num1 = 0, num2 = 0, a = 0, dma = 0, dme = 0;
        double result = 0, result1 = 0;
        System.out.println("Hola bienvenido al Menu");
        System.out.println("Elija una opcion para su figura :3");
        System.out.println("1. Rectangulo");   
        System.out.println("2. Hexagono");
        System.out.println("3. Rombo");
        System.out.println("4. Cuadrado");
        System.out.println("5 salir");
        op = in.nextInt();
        switch(op){
             //holi
            case 1 :              
                System.out.println("Elegiste la opcion numero Uno");
                System.out.println("Inserta el primer numero de tu lado ");
                num1 = in.nextInt();
                System.out.println("Inserta ahora el segundo numero de tu lado xd");
                num2 = in.nextInt();
                result = num1 * 2 + num2 * 2;
                System.out.println("Perimetro de tu Rectangulo es: " + result + " unidades");
                result = num1 * num2;
                System.out.println("El area de tu Rectangulo es: " + result + " unidades cuadradas" );
                break;
            case 2 :              
                System.out.println("Elegiste la opcion numero Dos");
                System.out.println("Inserta el numero de tu lado");
                num1 = in.nextInt();
                System.out.println("Ahora dime la Hipotenusa si no, no prodre sacar el area de tu hexagono");
                a = in.nextInt();
                result = num1 * 6;
                System.out.println("Perimetro de tu Hexagono es: " + result + " unidades");
                result = (result * a)/2;
                System.out.println("El area de tu Hexagono es: " + result + " unidades cuadradas" );
                break;
                case 3 :              
                System.out.println("Elegiste la opcion numero Tres");
                System.out.println("Inserta el lado");
                num1 = in.nextInt();
                System.out.println("Inserta la diagonal mayor");
                dma = in.nextInt();
                System.out.println("Inserta la diagonal menor");
                dme = in.nextInt();
                result = num1 * 4;
                System.out.println("El perimetro de tu Rombo es de: " + result + " unidades");
                result1 = dma * dme / 2;
                System.out.println("El area de tu Rombo es de: " + result1 + " unidades cuadradas");
                break;
            case 4 :              
                System.out.println("Elegiste la opcion numero Cuatro");
                System.out.println("Inserta el primer numero de tu lado ");
                num1 = in.nextInt();
                result = num1 * 4;
                System.out.println("Perimetro de tu Rectangulo es: " + result + " unidades");
                result = num1 * num1;
                System.out.println("El area de tu Rectangulo es: " + result + " unidades cuadradas" );
                break;
            case 5 :
                System.out.println("Adioooooooos");
            
        } 
    }
}