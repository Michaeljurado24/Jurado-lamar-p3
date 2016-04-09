package cs1302.p2;

import cs1302.effects.Artsy;
import javafx.scene.image.*;

import javafx.scene.image.ImageView;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
public class MyArtsy implements Artsy {

    @Override
    public Image doCheckers(Image src1, Image src2, int size) {
    return null;
    } // doCheckers

    @Override
    public Image doHorizontalStripes(Image src1, Image src2, int height) {
    return null;
    } // doHorizontalStripes

    @Override
    public Image doRotate(Image src, double degrees) {
        int width = (int) src.getWidth();
        int height = (int) src.getHeight();

        WritableImage ret = new WritableImage(width, height);
        PixelReader pr = src.getPixelReader();
        PixelWriter pw = ret.getPixelWriter();
    
     double pi = 3.14159;
        double initialxx = 0;
        double initialyy = 0;
        for (int x = 0; x < width; ++x) {
         for (int y = 0; y < height; ++y) {
                    double xx = (x * Math.cos(degrees*pi/180) + y*Math.sin(degrees*pi/180));
                    double yy=  (-x * Math.sin(degrees*pi/180) + y*Math.cos(degrees*pi/180));           
                        try{
                         pw.setArgb((int)(xx+width/2),(int)(yy+height/2), pr.getArgb(x, y));
                        } catch( IndexOutOfBoundsException e){

                        }
                    
                    
             } // for
    }// for
        return ret;
        } // doRotate

    @Override
    public Image doVerticalStripes(Image src1, Image src2, int width) {
        int width1 = (int) src1.getWidth();
        int height1 = (int) src1.getHeight();

    int width2 = (int) src2.getWidth();
    int height2 = (int) src2.getHeight();

        WritableImage ret = new WritableImage(width1, height1);
        PixelReader pr1 = src1.getPixelReader();
    PixelReader pr2 = src2.getPixelReader();
        PixelWriter pw = ret.getPixelWriter();

    boolean imageOne = false;
    int originalX = 0;
    for(int x = 0; x < width1; x++){
        if (x - originalX > width){
            originalX = x;
            if (imageOne == false){
                imageOne = true;
            }
            else{
                imageOne = false;
            }
        }
        for(int y = 0; y< height1; y++) {
            if (imageOne) {
                pw.setArgb(x,y, pr1.getArgb(x, y));     
            }
            else{
                 pw.setArgb(x,y, pr2.getArgb(x, y));
            }
        }
    }
        double pi = 3.14159;    
    return ret;
    } // doVerticalStripes
    

} // MyArtsy