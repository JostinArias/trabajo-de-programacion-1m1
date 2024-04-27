import java.util.Scanner;
//Jostin Alexander Arias Valle - 2024-1348U
public class App {
    
    //variables de un metodo  
    public static int V1, V2, V3;
    public static void main(String[] args) throws Exception {

        //capturar informacion del teclado;
        Scanner teclas = new Scanner(System.in);

        //ciclo cuando el usuario escriba 2  o 3 numeros iguales se repetira hasta que los 3 numeros sean diferentes;
        do {

            try {

                System.out.println("Ingrese tres numeros enteros diferentes");
                V1 = teclas.nextInt();
                V2 = teclas.nextInt();
                V3 = teclas.nextInt();

                //para excepciones
            } catch (Exception str) {

                System.out.println(str);
                System.out.println("Ingrese valores correctos solo se aceptan valores int");
                teclas.nextLine();
            }
            //hasta que esta condicion no se cumpla se finaliza el ciclo;
        } while (V1 == V2 || V1 == V3 || V2 == V3);

        
    
    
        teclas.close();

        //buscar numero mayor
        int May = Math.max(Math.max(V1,V2),V3);

        //sumar 2 numeros mas pequeños
        int SumDMin = V1+V2+V3-Math.max
        (Math.max(V1,V2),V3);

        //diferencia de los dos mayores
        int DifDeMay = Math.max(Math.max(V1,V2),V3)-Math.max
        (Math.min(V1,V2), Math.min(Math.max(V1,V2),V3));

        

        //Mostrar la suma de menores, diferencia de mayores y mostrar el numero mayor
        System.out.println("suma de los dos numeros menores: "+SumDMin);
        System.out.println("resta de los 2 numeros mayores: "+DifDeMay);
        System.out.println("numero mayor: "+May);
        
    }
}
