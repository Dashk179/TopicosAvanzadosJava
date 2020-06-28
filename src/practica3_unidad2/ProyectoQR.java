/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_unidad2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.encoder.ByteMatrix;


import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeWriter;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;



public class ProyectoQR {

    
    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        String pathname = "C:/Users/dash_/OneDrive/Escritorio/QRPrueba/miqr.png";
        String textToQr ="Aprendiendo generacion de QR en java";
        try {
            writeQR(textToQr,pathname);
            String text = readQR(pathname);
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    
}
     private static void writeQR (String text, String pathname) throws WriterException, IOException{
            int width = 600;
            int height = 400;
            
            String imageFormat = "png"; // Formatos de imagen "jpeg "gif" "tiff"
            
          BitMatrix bitMatrix = new QRCodeWriter().encode(text, BarcodeFormat.QR_CODE, width, height);
         
        FileOutputStream outputStream = new FileOutputStream(new File(pathname));
        MatrixToImageWriter.writeToStream(bitMatrix, imageFormat, outputStream);
        
    }
        
        private static String readQR(String pathname) throws FormatException, ChecksumException,
                NotFoundException,IOException, ReaderException{
            InputStream qrInputStream = new FileInputStream(pathname);
            BufferedImage qrBufferedImage = ImageIO.read(qrInputStream);
            
            LuminanceSource source = new BufferedImageLuminanceSource(qrBufferedImage);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
            Reader reader = new MultiFormatReader();
            Result stringBarCode = reader.decode(bitmap);
            
            return stringBarCode.getText();
            
        }
    
}
