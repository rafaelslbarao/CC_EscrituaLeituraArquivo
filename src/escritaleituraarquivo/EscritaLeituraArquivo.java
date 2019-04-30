/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritaleituraarquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class EscritaLeituraArquivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        System.out.println("### Conteudo atual do arquivo ###");
        BufferedReader reader = new BufferedReader(new FileReader("meuArquivo.txt"));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
        //
        System.out.println("\r\n### Digite novos conteudos para serem adicionados ###");
        FileWriter fileWriter = new FileWriter("meuArquivo.txt", true);
        while (true) {
            String leitura;
            Scanner scanner = new Scanner(System.in);
            leitura = scanner.nextLine();
            if (!leitura.isBlank()) {
                fileWriter.write(leitura + "\r\n");
            } else {
                break;
            }
        }

        fileWriter.close();

    }

}
