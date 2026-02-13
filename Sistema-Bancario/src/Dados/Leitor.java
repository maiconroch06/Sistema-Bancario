package dados;

import classes.ContaBancaria;
import classes.ContaCorrente;
import classes.ContaPoupanca;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Leitor {

    File pasta;
    File arquivo;
    
    HashMap<String, ContaBancaria> linhas;

    public Leitor(HashMap<String, ContaBancaria> contas) {
        pasta = new File(System.getProperty("user.dir"), "src\\dados");
        pasta.mkdirs();
        
        arquivo = new File(pasta, "contas.txt");
        this.linhas = contas;
    }

    public HashMap<String, ContaBancaria> lerArquivo() {
        try {
            Scanner leitor = new Scanner(arquivo);
            leitor.nextLine();
            
            while(leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] conteudo = linha.split(",");
                
                if (conteudo.length < 5) {
                    System.out.println("Linha inválida: " + linha);
                    continue;
                }
                
                String numero = conteudo[0];
                String titular = conteudo[1];
                double saldo = Double.parseDouble(conteudo[2]);
                String tipo = conteudo[3];
                double extra = Double.parseDouble(conteudo[4]);
                
                ContaBancaria conta;
                
                if(tipo.equalsIgnoreCase("CORRENTE")) {
                    conta = new ContaCorrente(numero, titular, saldo, tipo, extra);
                
                } else if(tipo.equalsIgnoreCase("POUPANÇA")) {
                    conta = new ContaPoupanca(numero, titular, saldo, tipo, extra);
                
                } else {
                    System.out.println("Tipo inválido - Conta:" + numero + " Tipo: " + tipo);
                    continue;
                }
                linhas.put(numero, conta);
            }
            
            leitor.close();
            return linhas;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Leitor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
            System.out.println("Erro na conversão numérica");
        }
        return linhas;   
    }
    
}


//public void lerArquivo() {
//    try {
//        Scanner leitor = new Scanner(arquivo);
//
//        while(leitor.hasNextLine()) {
//            String linha = leitor.nextLine();
//            linhas.add(linha.split(","));
//        }
//
//        for (String[] conteudo : linhas) {
//            for (int i = 0; i < conteudo.length; i++) {
//                System.out.print(conteudo[i]);
//
//                if (i < conteudo.length - 1) {
//                    System.out.print(" - ");
//                }
//            }
//            System.out.println();
//        }
//
//        leitor.close();
//
//    } catch (FileNotFoundException e) {
//        Logger.getLogger(Leitor.class.getName()).log(Level.SEVERE, null, e);
//    }
//}