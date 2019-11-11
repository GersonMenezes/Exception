
public class StringsNull {
    
   private String a;
   private String b;

    public StringsNull(String a, String b) {
        this.a = a;
        this.b = b;
        compare();
    }
   
   public void compare(){
       try{
       if(a.compareTo(b) == 0){
           System.out.println("As Strings são iguais");
       }
       else if(a.compareTo(b) < 0){
           System.out.println("a is less than b");
               }
       else
           System.out.println("a is greater than b");
              
        }
       catch(NullPointerException z){
           System.out.println("Error\n");
           System.out.println(z.getMessage());
       }
       finally{
           System.out.println(a);
           System.out.println(b);
       }
       
   }
}

