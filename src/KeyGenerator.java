import java.util.ArrayList;

public class KeyGenerator {
    
    private static int vetorDigitos[] = {105,48,48,48,48,48,48};

    private static char[] simbolosASCII = {'i','0','0','0','0','0','0'};

    private static ArrayList<Character> charList = populateList();
    

    public static boolean sinal = false;

    public void IncrementoTratado(int indice)  {

        if(vetorDigitos[1] >= 122) {

            sinal = true;

        }

        if(indice == vetorDigitos.length - 1){

            vetorDigitos[indice]++;

        }
        else   {
            
            if(vetorDigitos[indice+1] > 122){

                vetorDigitos[indice+1] = 48;

                if(vetorDigitos[indice] <= 122){

                    vetorDigitos[indice]++;

                
                    }
        
            }

            
        }

        if(vetorDigitos[indice] == 58){

            vetorDigitos[indice] = 65;

        }
        
        if(vetorDigitos[indice] == 91){

            vetorDigitos[indice] = 97;
        }
    
        
    }

    public char[] converteASCII(){

        char simbolos[] = new char[vetorDigitos.length];


            for(int i = 0; i < simbolos.length;i++){

                simbolos[i] = (char)vetorDigitos[i];
                
            }


    return simbolos;

}
    
    public  void percorreVetor(){    
        

        if( sinal == false)  {
    
        simbolosASCII = converteASCII();
            
        
            IncrementoTratado(6);
            IncrementoTratado(5);
            IncrementoTratado(4);
            IncrementoTratado(3);
            IncrementoTratado(2);
            IncrementoTratado(1);
           // IncrementoTratado(0);  = 'i'

        } 
        
    }

    public  char[] getASCII(){
        
        return simbolosASCII;
        
    }

    public void allRandom() {
        
        for(int i = 1; i < vetorDigitos.length; i++){

            char randomChar = charList.get((int)(Math.random()*charList.size()));            
            simbolosASCII[i] = randomChar;
            
        }
        
    }

    public static ArrayList<Character> populateList(){

        int charCod = 48;

        ArrayList<Character> list = new ArrayList<>();

        while(charCod <= 122){

            if(charCod == 58){

                charCod = 65;
    
            }
            
            if(charCod == 91){
    
                charCod = 97;
            }

            list.add((char)charCod);

            charCod++;
        }

        return list;
        
    }

    public void charListPrint(){

        for(int i = 0; i < charList.size(); i++){

            System.out.print(charList.get(i));
            System.out.print(" - ");

    }

    }
}






