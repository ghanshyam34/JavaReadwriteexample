/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mapconverter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ghanshyam
 */
public class MapConverter{

    public MapConverter() {

    }


    public  void mapfile(){
        File file = new File("c:/ini.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            StringBuffer sb = new StringBuffer();
            int data = 0;
            while((data=fis.read())!=-1){
                sb.append((char)data);
            }
            String s = sb.toString();
            fis.close();
            File mfile = new File("c:/temp.txt");
            FileOutputStream fos = new FileOutputStream(mfile);
            fos.write(s.getBytes());
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MapConverter.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){

         }

        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        new MapConverter();
    }

}
