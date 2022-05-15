import java.io.File;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Vector;

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.model.FileHeader;

public class App {
    public static void main(String[] args) throws Exception {

      
        String[] paths = new String[100]; 
        
        for (int i = 0; i< 100; i++){

            paths[i] = "C:\\Dev\\copy" + i + ".zip";

        }

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 64; i++) {

            ThreadWork threadWork = new ThreadWork(paths[i]);
            threadWork.setName("t"+i);
            threadWork.start();
            threadWork.join();
        }
        
        System.out.println("Tempo de execução: " + (System.currentTimeMillis() - startTime)/1000 + " s");
             
    }
}
