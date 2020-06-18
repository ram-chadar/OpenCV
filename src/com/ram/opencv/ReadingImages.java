package com.ram.opencv;
import org.opencv.core.Core; 
import org.opencv.core.Mat;  
import org.opencv.imgcodecs.Imgcodecs;
 
public class ReadingImages {
   public static void main(String args[]) { 
      //Loading the OpenCV core library  
      System.loadLibrary( Core.NATIVE_LIBRARY_NAME ); 
     
      //Instantiating the Imagecodecs class 
     
      //Reading the Image from the file  
      String file ="E:\\data\\azllu.jpg"; 
      Mat matrix = Imgcodecs.imread(file); 
     
      System.out.println("Image Loaded");     
   } 
}