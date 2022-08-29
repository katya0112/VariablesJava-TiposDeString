 public class TipoString {
     public static void main(String[] args) {
 

// Actualizar variable de tipo string:

    String employeeName = "Anahí";
    employeeName = employeeName + "Salgado";
    System.out.println(employeeName); //Anahí Salgado (EL ERROR ES QUE EN EL CÓDIGO DEL PDF EN VEZ DE DECIR EMPLOYEENAME APARECÍA SALARY)
    
    employeeName += employeeName + "Díaz de la Vega";
    System.out.println(employeeName); //Anahí Salgado Díaz de la Vega
    
    employeeName = employeeName + "Irene" + employeeName;
    System.out.println(employeeName); //Irene Anahí Salgado Díaz de la Vega
     
     }
     
     
 }
    
    