public class Pangram {
    public static boolean isPangram(String test){
        for (char a = 'A'; a <= 'Z'; a++)
            if ((test.indexOf(a) < 0) {
                if(test.indexOf((char)(a + 32)) < 0))
                {
                return false;
                }
            }
        return true;
    }
 
    public static void main(String[] args){
                 Scanner s= new scanner(System.in);
                String a;
                a=s.nextline();
        System.out.println(isPangram(a));
       
    }
}
