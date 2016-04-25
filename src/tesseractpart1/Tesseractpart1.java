package tesseractpart1;

 

 

 
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.io.*;
import net.sourceforge.tess4j.*;
import java.util.Scanner;

public class Tesseractpart1 {

private File image1;
private File image2;
private Tesseract instance1;
private Tesseract instance2;
private String lineInput;

public Tesseractpart1(){
    
}


private static void main(String[] args) {
File imageFile = new File("/Users/samarthmadduru/Downloads/random.png");
Tesseract instance = Tesseract.getInstance(); //

    try {

        String result = instance.doOCR(imageFile);
        System.out.println(result);

    }catch (TesseractException e) {
        System.err.println(e.getMessage());
    }
}


   

public String getOutput(String foo){ 
    image1 = new File(foo);
    instance1 = Tesseract.getInstance();
    try {

        String result = instance1.doOCR(image1);
        return result;

    } catch (TesseractException e) {
        System.err.println(e.getMessage());
        return null;
        
    }
}

public String getOutput(){ 
    System.out.print("Enter a file name with the location: ");
    Scanner sc = new Scanner(System.in);
    lineInput=sc.nextLine();
    image2 = new File(lineInput);
    instance2 = Tesseract.getInstance();
    try {

        String result = instance2.doOCR(image2);
        return result;

    } catch (TesseractException e) {
        
        System.err.println(e.getMessage());
        return null;
        
    }
}

}
