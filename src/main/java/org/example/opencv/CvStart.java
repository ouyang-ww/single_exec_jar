package org.example.opencv;


import org.bytedeco.javacpp.Loader;
import org.bytedeco.opencv.opencv_java;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class CvStart {

    public static void main(String[] args) {
        //initialize opencv
        System.out.println("opencv init!");
        try {
            try {
                Loader.load(opencv_java.class);
                System.out.println("succeed in opencv initialization");
            } catch (Exception e) {
                System.out.println("There is an exception,fail to init opencv;");
                e.printStackTrace();
            }
            Mat matrix = new Mat(10,10, CvType.CV_8UC3);
            System.out.println(matrix.dump());
        } catch (Error error) {
            System.out.println("There is an error, fail to init opencv;");
            error.printStackTrace();
        }

    }
}
