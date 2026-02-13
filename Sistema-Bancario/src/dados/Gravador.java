package dados;

import classes.ContaBancaria;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Gravador {
    
    private File pasta;
    private File arquivo;
    
    private HashMap<String, ContaBancaria> linhas;

    public Gravador(HashMap<String, ContaBancaria> contas) {
        pasta = new File(System.getProperty("user.dir"), "src\\dados");
        pasta.mkdirs();
        
        arquivo = new File(pasta, "contas.txt");

        this.linhas = contas;
    }

    public void escritaEmArquivo(){
            
        try {
            FileWriter escrita = new FileWriter(arquivo);
            PrintWriter saida = new PrintWriter(escrita);
            
            String cabecario = "numero,titutar,saldo,tipo,caracteristica";
            saida.println(cabecario);
            
            for(ContaBancaria conta : linhas.values()) {
                
                String numero = conta.getNumero();
                String titular = conta.getNome();
                String saldo = String.valueOf(conta.getSaldo());
                String tipo = conta.getTipoConta();
                String caractristica = String.valueOf(conta.getInformacao());
                
                String linha = numero + "," + titular + "," + saldo + "," + tipo + "," + caractristica;
                
                saida.println(linha);

            }

            saida.close();
            escrita.close();
        } catch (IOException ex) {
          Logger.getLogger(Gravador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
