import java.io.File;
import java.security.Key;
import java.util.List;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.model.FileHeader;

public class ThreadWork extends Thread {


    KeyGenerator Key = new KeyGenerator();
    String Path = "";
    Object Obj = new Object();
    Object obj = new Object();

    ThreadWork(KeyGenerator key, String path, Object obj) {
        this.Key = key;
        this.Path = path;
        this.Obj = obj;

    }


    public void run() {     
        
        synchronized (obj) {
              
             
        while(Key.sinal == false) {                       
                            
                try {                   

                    ZipFile zipFile = new ZipFile(new File(Path));
                    
                    char[] senha = Key.percorreVetor(); 

                    if (zipFile.isEncrypted()) {  
                       
                        zipFile.setPassword(senha);
                        System.out.println(senha);
                    }
                    

                    List fileHeaderList = zipFile.getFileHeaders();
    
                    for (int i = 0; i < fileHeaderList.size(); i++) {
                        FileHeader fileHeader = (FileHeader) fileHeaderList.get(i);
                        
                        zipFile.extractFile(fileHeader, "E:\\Download");
                        System.out.print("Sucesso essa é a senha: " );
                        System.out.println(senha);
                        Key.sinal = true;
                    }
                
                
                } catch (Exception e) {
                    //System.out.print("Senha incorreta: ");
                   //System.out.println(e.getMessage());
                    
                }
            
            }
        
        }
    
    }

}


    