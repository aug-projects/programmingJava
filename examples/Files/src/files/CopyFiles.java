
package files;

import java.io.*;

public class CopyFiles {
    
    public static void main(String[] args) throws IOException {
        
            FileInputStream     in  = null;
            FileOutputStream    out = null;
            
            
        
        try{
            
            in  = new FileInputStream("C:\\Users\\Haytham Salama\\Desktop\\mytshert.jpg");
            out = new FileOutputStream("C:\\Users\\Haytham Salama\\Desktop\\out.text");
            
            int c;
            
            while ((c = in.read()) != -1){
                out.write(c);
            }
            
        }finally{
            
            if(in != null){
                in.close();
                
            }
            
            if(out != null){
                
                out.close();
            }
            
            
        }
            
    }
    
}
