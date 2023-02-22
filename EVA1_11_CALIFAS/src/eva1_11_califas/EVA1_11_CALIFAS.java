/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_califas;

/**
 *
 * @author isaaczapatto
 */
public class EVA1_11_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        //TODO
        String result;
        
        result = calificar(85);
        System.out.println(result);
        
        
        result = calificar(95);
        System.out.println(result);
        
        
        result = calificar(40);
        System.out.println(result);
        
        
        result = calificar(80);
        System.out.println(result);
        
        
        result = calificar(8000);
        System.out.println(result);
        
        
    }
    
    public static String calificar(int calif){
        String grade = "Sin asignar.";
        
        if((calif <= 100) && (calif >= 91)){
            grade = "A";
        }else if((calif <= 90) && (calif >= 81)){
            grade = "B";
        }else if((calif <= 80) && (calif >= 71)){
            grade = "C";
        }else if((calif <= 70) && (calif >= 61)){
            grade = "D";
        }else{
            grade = "F";
        }
        
        return grade;
    }

}