package com.ram.opencv;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class BlurTest {
   public static void main(String args[]) {
      // Loading the OpenCV core library
      System.loadLibrary( Core.NATIVE_LIBRARY_NAME );

      // Reading the Image from the file and storing it in to a Matrix object
      String file ="E:\\data\\krishna.jpg";
      Mat src = Imgcodecs.imread(file);

      // Creating an empty matrix to store the result
      Mat dst = new Mat();

      // Creating the Size and Point objects
      Size size = new Size(45, 45);
      Point point = new Point(20, 30);

      // Applying Blur effect on the Image
      Imgproc.blur(src, dst, size, point, Core.BORDER_DEFAULT);

      // blur(Mat src, Mat dst, Size ksize, Point anchor, int borderType)
      // Writing the image
      Imgcodecs.imwrite("E:\\data\\blr.jpg", dst);
      System.out.println("Image processed");
   }
}

