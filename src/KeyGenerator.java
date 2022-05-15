import java.util.ArrayList;

public class KeyGenerator {
    
    // private static int vetorDigitos[] = {105,48,48,48,48,48,48};

    // private static char[] simbolosASCII = {'i','0','0','0','0','0','0'};

    // private static ArrayList<Character> charList = populateList();
    
    // public static boolean sinal = false;


    
    private static final char[] caracteres = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};

    private static final int PASSWORD_SIZE = 7;

    private static int[] password_index =  inicializaSenhaIndex();
    public static char[] password =  inicializaSenha(); 
    private static final char[] final_password =  inicializaSenhaFinal();
    public static boolean sinal = false;
    public static int max_index  = PASSWORD_SIZE - 1;

    public static int[] inicializaSenhaIndex(){
        int[] senha = new int[PASSWORD_SIZE];
        for(int i = 0; i < PASSWORD_SIZE-1; i++){
            senha[i] = 0;
        }
        senha[PASSWORD_SIZE-1] = -1;
        return senha;
    }

    
    public static char[] inicializaSenha(){
        char[] senha = new char[PASSWORD_SIZE];
        senha[0] = 'i';
        for(int i = 1; i < PASSWORD_SIZE; i++){
            senha[i] = caracteres[0];
        }
        return senha;
    }

    public static char[] inicializaSenhaFinal(){
        char[] senha = new char[PASSWORD_SIZE];
        for(int i = 0; i < PASSWORD_SIZE; i++){
            senha[i] = caracteres[caracteres.length-1];
        }
        return senha;
    }

    public static char[] incrementa() {
        for (int i=PASSWORD_SIZE-1; i>=0; i--){
            
            if (password_index[i] == caracteres.length-1){
                if (max_index > i){
                    max_index = i;
                    System.out.println("Nivel: " + max_index + " Senha: " + String.valueOf(password));
                }
                password_index[i] = 0;
                password[i] = caracteres[0];
            } else {
                password_index[i]++;
                password[i] = caracteres[password_index[i]];
                break;
            }
            
        }

        // comparamos se password é igual a senha final
        if (password.equals(final_password)){
            sinal = true;
        }

        return password;
        
    }

}


















//     public void IncrementoTratado(int indice)  {

//         if(vetorDigitos[1] >= 122) {

//             sinal = true;

//         }

//         if(indice == vetorDigitos.length - 1){

//             vetorDigitos[indice]++;

//         }
//         else   {
            
//             if(vetorDigitos[indice+1] > 122){

//                 vetorDigitos[indice+1] = 48;

//                 if(vetorDigitos[indice] <= 122){

//                     vetorDigitos[indice]++;

            
//                 }
        
//             }

            
//         }

//         if(vetorDigitos[indice] == 58){

//             vetorDigitos[indice] = 65;

//         }
        
//         if(vetorDigitos[indice] == 91){

//             vetorDigitos[indice] = 97;
//         }
    
        
//     }

//     public char[] converteASCII(){

//         char simbolos[] = new char[vetorDigitos.length];


//             for(int i = 0; i < simbolos.length;i++){

//                 simbolos[i] = (char)vetorDigitos[i];
                
//             }


//     return simbolos;

// }
    
//     public  void percorreVetor(){    
        

//         if( sinal == false)  {
    
//             simbolosASCII = converteASCII();
                
            
//                 IncrementoTratado(6);
//                 IncrementoTratado(5);
//                 IncrementoTratado(4);
//                 IncrementoTratado(3);
//                 IncrementoTratado(2);
//                 IncrementoTratado(1);
//             //IncrementoTratado(0);  = 'i'

//             } 
            
//         }

//     public  char[] getASCII(){
        
//         return simbolosASCII;
        
//     }

//     public void allRandom() {
        
//         for(int i = 1; i < vetorDigitos.length; i++){

//             char randomChar = charList.get((int)(Math.random()*charList.size()));            
//             simbolosASCII[i] = randomChar;
            
//         }
        
//     }

//     public static ArrayList<Character> populateList(){

//         int charCod = 48;

//         ArrayList<Character> list = new ArrayList<>();

//         while(charCod <= 122){

//             if(charCod == 58){

//                 charCod = 65;
    
//             }
            
//             if(charCod == 91){
    
//                 charCod = 97;
//             }

//             list.add((char)charCod);

//             charCod++;
//         }

//         return list;
        
//     }

//     public void charListPrint(){

//         for(int i = 0; i < charList.size(); i++){

//             System.out.print(charList.get(i));
//             System.out.print(" - ");

//     }

//     }
// }






