import java.io.File;
import java.util.List;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.model.FileHeader;

public class ThreadConsume extends Thread {


    KeyGenerator key = new KeyGenerator();
    
    ThreadConsume(KeyGenerator key) {
        this.key = key;
    }


    public void run() {

        

       
            while(!key.lista.isEmpty()) {

                synchronized(key){
                    
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }


                        System.out.println(key.lista.get(0));

                        key.lista.remove(0);

            // while(key.sinal == false) {

            //     char[] senha = key.percorreVetor();
                
            //     try {
            //         ZipFile zipFile = new ZipFile(new File("C:\\Users\\Thulio\\Downloads\\Compressed\\arquivo.zip"));
            //         if (zipFile.isEncrypted()) {                        
                        
            //             zipFile.setPassword(senha);
            //         }
            //         List fileHeaderList = zipFile.getFileHeaders();
    
            //         for (int i = 0; i < fileHeaderList.size(); i++) {
            //             FileHeader fileHeader = (FileHeader) fileHeaderList.get(i);
                        
            //             zipFile.extractFile(fileHeader, "E:\\Download");
            //             System.out.print("Sucesso essa é a senha: " );
            //             System.out.println(senha);
            //             key.sinal = true;
            //         }
    
            //     } catch (Exception e) {
            //         System.out.print("Senha incorreta: ");
            //         System.out.println(senha);
            //     }
            // }

        }
    }


        
    }
    
}
