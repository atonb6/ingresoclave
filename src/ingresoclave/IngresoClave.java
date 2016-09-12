package ingresoclave;

import java.util.Scanner;

public class IngresoClave {

    
    public static void main(String[] args) {
        String ingreso; int cond1, cond2=0, cond3=0, cond4=0, x ; char letra;
        Scanner leer = new Scanner(System.in);
        
        do{
                cond2=0;
                cond3=0;
                cond4=0;
                
                System.out.println("**********************"); 
                System.out.println("Escriba una contraseña");
                System.out.println("**********************");
                ingreso = leer.nextLine();
                
                cond1 = ingreso.length();
                    
                    if(cond1<8){
                        System.out.println("<La contraseña debe tener un mínimo de 8 caracteres>");
                    }
           
                for(x=0;x<cond1;++x){    
                letra = ingreso.charAt(x);
                    if (Character.isUpperCase(letra))
                    cond2 = cond2+1;
                }
            
                if(cond2<=0){
                    System.out.println("<Debe Ingresar a lo menos una mayúscula>");
                }
                
            
                for(x=0;x<cond1;++x){    
                letra = ingreso.charAt(x);
                    if (Character.isLowerCase(letra))
                        cond3 = cond3+1;
                }
        
                if(cond3<=0){ 
                    System.out.println("<Debe Ingresar a lo menos una minúscula>");
                }
                
                for(x=0;x<cond1;++x){    
                letra = ingreso.charAt(x);
                    if (Character.isDigit(letra))
                        cond4 = cond4+1;
                }
        
                if(cond4<=0){ 
                    System.out.println("<Debe Ingresar a lo menos un número>");
                }
                
        }while(cond1<8 || cond2<=0 || cond3<=0 || cond4<=0);
               
    System.out.println("________________________________________________");   
    System.out.println("La contraseña ha sido ingresa satisfactoriamente");
    
}
}
