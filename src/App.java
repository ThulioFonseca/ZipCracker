import java.io.File;
import java.util.List;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.model.FileHeader;

public class App {
    public static void main(String[] args) throws Exception {

        String path0 = "C:\\Dev\\arquivo.zip";
        String path1 = "C:\\Dev\\arquivo1.zip";
        String path2 = "C:\\Dev\\arquivo2.zip";
        String path3 = "C:\\Dev\\arquivo3.zip";
        String path4 = "C:\\Dev\\arquivo4.zip";
        String path5 = "C:\\Dev\\arquivo5.zip";
        String path6 = "C:\\Dev\\arquivo6.zip";
        String path7 = "C:\\Dev\\arquivo7.zip";
        String path8 = "C:\\Dev\\arquivo8.zip";
        String path9 = "C:\\Dev\\arquivo9.zip";
        String path10 = "C:\\Dev\\arquivo10.zip";
        String path11 = "C:\\Dev\\arquivo11.zip";

        KeyGenerator key = new KeyGenerator();

        Object lock = new Object();

        ThreadWork t0 = new ThreadWork(key, path0, lock);        
        ThreadWork t1 = new ThreadWork(key, path1, lock);
        ThreadWork t2 = new ThreadWork(key, path2, lock);
        ThreadWork t3 = new ThreadWork(key, path3, lock);
        ThreadWork t4 = new ThreadWork(key, path4, lock);
        ThreadWork t5 = new ThreadWork(key, path5, lock);
        ThreadWork t6 = new ThreadWork(key, path6, lock);
        ThreadWork t7 = new ThreadWork(key, path7, lock);
        ThreadWork t8 = new ThreadWork(key, path8, lock);
        ThreadWork t9 = new ThreadWork(key, path9, lock);
        ThreadWork t10 = new ThreadWork(key, path10, lock);
        ThreadWork t11 = new ThreadWork(key, path11, lock);
    
        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
       
        t0.join();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
        t10.join();
             
    }
}
