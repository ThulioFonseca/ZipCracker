import java.util.ArrayList;

public class KeyGenerator {
    
    public static int vetorDigitos[] = {105,48,48,48,48,48,48};

    public static boolean sinal = false;

    public static ArrayList<char[]> lista = new ArrayList<char[]>();

    

    public void IncrementoTratado(int indice)  {

        if(vetorDigitos[1] >= 122 && vetorDigitos[2] >= 122) {

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

    public char[] percorreVetor(){    
        
        char simbolos[] = new char[vetorDigitos.length];


        if( sinal == false)  {


            for(int i = 0; i < simbolos.length;i++){

                simbolos[i] = (char)vetorDigitos[i];

                
            }

            //lista.add(simbolos); 
            //System.out.println(lista.get(lista.size()-1));          
        
            IncrementoTratado(6);
            IncrementoTratado(5);
            IncrementoTratado(4);
            IncrementoTratado(3);
            IncrementoTratado(2);
            IncrementoTratado(1);
           // IncrementoTratado(0);

           
            return simbolos;

            
        } 
        
        return null;


    }

}






