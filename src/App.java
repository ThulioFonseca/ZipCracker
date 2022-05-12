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


        ThreadWork t0 = new ThreadWork(path0);
        ThreadWork t1 = new ThreadWork(path1);
        ThreadWork t2 = new ThreadWork(path2);
        ThreadWork t3 = new ThreadWork(path3);
        ThreadWork t4 = new ThreadWork(path4);
        ThreadWork t5 = new ThreadWork(path5);
        ThreadWork t6 = new ThreadWork(path6);
        ThreadWork t7 = new ThreadWork(path7);
        ThreadWork t8 = new ThreadWork(path8);
        ThreadWork t9 = new ThreadWork(path9);
        ThreadWork t10 = new ThreadWork(path10);
        ThreadWork t11 = new ThreadWork(path11);
        
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
