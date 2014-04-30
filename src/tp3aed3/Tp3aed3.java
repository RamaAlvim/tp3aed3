/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3aed3;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Rama
 */
public class Tp3aed3 {

    /**
     * @param fis
     * @param bs
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void MostraByte(FileInputStream fis,int tam)
    {
        int i = 0;
        byte[] vbyte = new byte[tam];
        char c;
        try {
            i=fis.read(vbyte);
        } catch (IOException ex) {
            Logger.getLogger(Tp3aed3.class.getName()).log(Level.SEVERE, null, ex);
        }
                for(byte b:vbyte)
         {
            // converts byte to character
            c=(char)b;
            
            // print
            System.out.print(c);
         } 
        
    }
    public static void main(String[] args)throws IOException 
    {
         FileInputStream fis = null;
      
      
        int cabecalho = 4;//tipo de arquivo ppm
        int largura =4;//colunas
        int altura = 4;//linhas
        int maxCor = 4;//define a quantidade de cores. Se for atÃ© 255, cada pixel terÃ¡ em cada cor 8 bytes
        //caso passe de 255, cada pixel terÃ¡ 16 bytes para cada cor.
        int quantBytePorCor=8;
        
        try{
            // cria o novo arquivo de stream com o arquivo dentro
        fis = new FileInputStream("C:\\Users\\Rama\\SkyDrive\\aed3\\tp3\\Pinguims.ppm");
        // le os bytes dentro no buffer
        MostraByte(fis,cabecalho) ;
        MostraByte(fis,largura) ;
        MostraByte(fis,altura) ;
        MostraByte(fis,maxCor) ;
        
        MostraByte(fis,quantBytePorCor) ;
        }
        catch(IOException ex){}
        finally
        {
            if(fis!=null)
            {
                fis.close();
            }
        }

   }
    
    
}
