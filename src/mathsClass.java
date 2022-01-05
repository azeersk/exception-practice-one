import org.w3c.dom.Text;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.ForkJoinPool;

public class mathsClass {
    public static void findFile() throws Exception{
        File newFile = new File(String.valueOf(Text.ENTITY_NODE));
        FileInputStream stream = new FileInputStream(newFile);
    }
    public static void main(String[] args){
        try{
            int divideOf = 5/0;
            System.out.println(divideOf);
        }
        catch (Exception e){
            System.out.println("Catch block => "+ e.getMessage());
        }
        finally {
            System.out.println("Finally Block is Executed.");
        }

        System.out.println("");
        try{
           int divideOf = 10/2;
           System.out.println("Try block => "+ divideOf);
        }
        catch(Exception e){
            System.out.println("Catch block => "+ e.getMessage());
        }
        finally {
            System.out.println("Finally Block Is Executed.");
        }
        System.out.println(" ");

        try{
            findFile();
        }
        catch (Exception e){
            System.out.println("File Exception => "+ e.getMessage());
        }
    }

}
