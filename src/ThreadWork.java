import java.io.File;
import java.util.List;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.model.FileHeader;

public class ThreadWork extends Thread {


    KeyGenerator Key = new KeyGenerator();
    String Path = "";
    Object lock = new Object();
    

    ThreadWork( String path) {
        this.Path = path;

    }  

    public void run() {            
        
                          
        while(Key.sinal == false) {     
            
                                        
                try {   
                        System.out.println(Key.getASCII());
                        new ZipFile(Path, Key.getASCII()).extractAll("C:\\Dev\\");
                        System.out.print("Sucesso essa é a senha: " );
                        System.out.println(Key.getASCII());
                        Key.sinal = true;  
                    }   
                
                catch (Exception e) {

                    synchronized(lock){

                       Key.percorreVetor();

                    } 
                                    
                }
        }
    
    }

}


    