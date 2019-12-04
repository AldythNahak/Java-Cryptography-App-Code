/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriptografy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.BitSet;
import java.util.Base64;

/**
 *
 * @author User
 */
public class Chriptografy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
         int kunci,pilihan, hasil;
         String[] kalimat1 = new String[20];
         String[] kalimat2 = new String[20];
         
         
         String[] abjad = new String[29];
         abjad[0]="A";abjad[1]="B";abjad[2]="C";abjad[3]="D";abjad[4]="E";abjad[5]="F";abjad[6]="G";abjad[7]="H";abjad[8]="I";
         abjad[9]="J";abjad[10]="K";abjad[11]="L";abjad[12]="M";abjad[13]="N";abjad[14]="O";abjad[15]="P";abjad[16]="Q";abjad[17]="R";
         abjad[18]="S";abjad[19]="T";abjad[20]="U";abjad[21]="V";abjad[22]="W";abjad[23]="X";abjad[24]="Y";abjad[25]="Z";abjad[26]=" ";
         abjad[27]=".";abjad[28]="*";
        System.out.println("Enkripsi & Dekripsi");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
    
        System.out.print("1.Enkripsi\n ");
        System.out.print("2.Dekripsi\n");
        System.out.print("(untuk berhenti tekan nomor lain selain yang tertera)\n");
        System.out.print("________________________\n");
        System.out.print("masukan pilihan: ");
         pilihan = input.nextInt();
        System.out.print("________________________\n");
        switch(pilihan){
            
 case 1:
        System.out.println("masukan kunci: ");
       kunci= input.nextInt();
        System.out.println("Kalimat yang akan di enkripsi: ");
       for (int i = 0; i < 100;){
      kalimat1[i]= input.nextLine();
      String huruf[] = kalimat1[i].toUpperCase().split("");
        
       for (i = 0; i < huruf.length;i++)
          for(int j = 0; j < abjad.length;j++)
       if (huruf[i].equals(abjad[j])){
        hasil =(2 * Arrays.asList(abjad).indexOf(abjad[j])-kunci) % abjad.length;
                if(hasil<0)
                    hasil = abjad.length + hasil;
                else
                   hasil=hasil;
                System.out.println("Hasil Enkripsi huruf ke - "+(i+1)+": ");  
               System.out.println(abjad[hasil].getBytes());
            }
         
        }//kurung For i
        break;
case 2:
       System.out.println("masukan kunci: ");
       kunci= input.nextInt();
        System.out.println("Kalimat yang akan di Dekripsi: ");
       for (int i = 0; i < 100;){
       kalimat2[i]= input.nextLine();
       String huruf[] = kalimat2[i].toUpperCase().split("");
        
       for (i = 0; i < huruf.length;i++)
          for(int j = 0; j < abjad.length;j++)
       if (huruf[i].equals(abjad[j])){
        hasil =((15*(Arrays.asList(abjad).indexOf(abjad[j])+kunci)) % 29);    
        System.out.println("Hasil Dekripsi huruf ke - "+(i+1)+": ");   
               System.out.println(abjad[hasil]);
                }
          
   }//kurung For i
        break;
      
        }

}
}