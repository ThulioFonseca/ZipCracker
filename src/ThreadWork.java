import java.io.File;
import java.util.List;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.model.FileHeader;

public class ThreadWork extends Thread {


    KeyGenerator Key = new KeyGenerator();
    String Path = "";
    ZipFile zip_file;

    ThreadWork( String path) {
        this.Path = path;
        this.zip_file = new ZipFile(this.Path);
    }  

    public void run() {          
        while(Key.sinal == false) {
            try {   
                    // System.out.println(Key.incrementa());
                    this.zip_file.setPassword(Key.incrementa());
                    this.zip_file.extractAll("C:\\Dev\\");
                    System.out.print("Sucesso essa é a senha: " + Key.password);
                    Key.sinal = true;  
                }   
            
            catch (Exception e) {
                // System.out.println(e);
                // if (e.getMessage().equals("Index 62 out of bounds for length 62")){
                //     e.printStackTrace();
                // }

                // 
            }
        }
    
    }

}


    