package com.stream;

import java.io.FileReader;

import java.io.IOException;


public class InputSteramReader {
    public static void main(String[] args) {
       /* try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.println("Enter the Letters");
            int letters = isr.read();
            while(isr.ready()){
                System.out.println((char) letters);
                letters = isr.read();
            }
            isr.close();
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
*/
        try(FileReader fr = new FileReader("note.txt")){
            int letters = fr.read();
            while(fr.ready()){
                System.out.println((char) letters);
                letters = fr.read();
            }
            fr.close();
            System.out.println();
        }catch(IOException e){
            System.out.println();
        }
        // Byte Stream to character Stream and then reading character Stream
//       try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//           System.out.println("You Typed : "+br.readLine());
//       }catch(IOException e){
//        System.out.println(e.getMessage());
        }
    }


