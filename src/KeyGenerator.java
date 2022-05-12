
public class KeyGenerator {
    
    private static int vetorDigitos[] = {105,48,48,48,48,48,48};

    private static char[] simbolosASCII = {'0','0','0','0','0','0','0'};

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
}






