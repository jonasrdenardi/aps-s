/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Perceptron;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import model.Arquivo;
import util.JPDesenho;
import model.MatrizModelo;
import util.Util;

/**
 *
 * @author Rodrigo O Plotze
 */
public class Principal extends javax.swing.JFrame {

    private String IMGPATH;
    Perceptron a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
    ArrayList<Perceptron> lp = new ArrayList<>();
    ArrayList<MatrizModelo> lm = new ArrayList<>();
    private String caminho = null;
    // variavel utilizada responsável pelo controle de treinamento recebe falso
    boolean ajustouPeso = false;
    // variavel que limita o numero de epocas maximas
    final int epocasMax = 50000;
    // variavel que conta as epocas
    int countEpocas = 0;

    // private BufferedImage bufferedImage;
    /**
     * Creates new form FormOpenCV
     */
    public Principal() {
        initComponents();
        configurarFormulario();
        // seta as configuracoes basicas dos neurônios
        setConfListPerc();
        caminho = "src\\imagens";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpDesenho = new JPDesenho();
        btnTreinarComoD = new javax.swing.JButton();
        cbLetrasTreinarD = new javax.swing.JComboBox<>();
        btnIdentificarD = new javax.swing.JButton();
        lblDesenhar = new javax.swing.JLabel();
        lblApagar = new javax.swing.JLabel();
        btnCarregAprendizado = new javax.swing.JButton();
        btnSalvarModeloComoD = new javax.swing.JButton();
        cbLetrasSalvarD = new javax.swing.JComboBox<>();
        btnBuscarImg = new javax.swing.JButton();
        jpBusca = new util.OpenPanel();
        btnIdentificarB = new javax.swing.JButton();
        cbLetrasSalvarB = new javax.swing.JComboBox<>();
        btnTreinarComoB = new javax.swing.JButton();
        cbLetrasTreinarB = new javax.swing.JComboBox<>();
        btnSalvarModeloComoB = new javax.swing.JButton();
        jpRecorte = new util.OpenPanel();
        lblrecorte = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpDesenho.setPreferredSize(new java.awt.Dimension(135, 135));

        javax.swing.GroupLayout jpDesenhoLayout = new javax.swing.GroupLayout(jpDesenho);
        jpDesenho.setLayout(jpDesenhoLayout);
        jpDesenhoLayout.setHorizontalGroup(
            jpDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );
        jpDesenhoLayout.setVerticalGroup(
            jpDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );

        btnTreinarComoD.setText("Treinar como:");
        btnTreinarComoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreinarComoDActionPerformed(evt);
            }
        });

        cbLetrasTreinarD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" }));

        btnIdentificarD.setText("Indetificar");
        btnIdentificarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdentificarDActionPerformed(evt);
            }
        });

        lblDesenhar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDesenhar.setText("Desenhar: botão esquerdo");

        lblApagar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblApagar.setText("Apagar: botão direito");

        btnCarregAprendizado.setText("Carregar Aprendizado");
        btnCarregAprendizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregAprendizadoActionPerformed(evt);
            }
        });

        btnSalvarModeloComoD.setText("Salvar modelo como");
        btnSalvarModeloComoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarModeloComoDActionPerformed(evt);
            }
        });

        cbLetrasSalvarD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" }));

        btnBuscarImg.setText("Buscar Img");
        btnBuscarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarImgActionPerformed(evt);
            }
        });

        jpBusca.setPreferredSize(new java.awt.Dimension(135, 135));

        javax.swing.GroupLayout jpBuscaLayout = new javax.swing.GroupLayout(jpBusca);
        jpBusca.setLayout(jpBuscaLayout);
        jpBuscaLayout.setHorizontalGroup(
            jpBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );
        jpBuscaLayout.setVerticalGroup(
            jpBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );

        btnIdentificarB.setText("Indetificar");
        btnIdentificarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdentificarBActionPerformed(evt);
            }
        });

        cbLetrasSalvarB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" }));

        btnTreinarComoB.setText("Treinar como:");
        btnTreinarComoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreinarComoBActionPerformed(evt);
            }
        });

        cbLetrasTreinarB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" }));

        btnSalvarModeloComoB.setText("Salvar modelo como");
        btnSalvarModeloComoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarModeloComoBActionPerformed(evt);
            }
        });

        jpRecorte.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jpRecorteLayout = new javax.swing.GroupLayout(jpRecorte);
        jpRecorte.setLayout(jpRecorteLayout);
        jpRecorteLayout.setHorizontalGroup(
            jpRecorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jpRecorteLayout.setVerticalGroup(
            jpRecorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        lblrecorte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblrecorte.setText("Recorte: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnTreinarComoD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbLetrasTreinarD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnSalvarModeloComoD)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbLetrasSalvarD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblDesenhar)
                            .addComponent(lblApagar)
                            .addComponent(btnCarregAprendizado, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpDesenho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIdentificarD))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(lblrecorte)
                                .addGap(18, 18, 18)
                                .addComponent(jpRecorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnIdentificarB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBuscarImg))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnTreinarComoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbLetrasTreinarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(btnSalvarModeloComoB)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbLetrasSalvarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jpBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCarregAprendizado)
                        .addComponent(lblrecorte))
                    .addComponent(jpRecorte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblDesenhar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblApagar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscarImg)
                        .addComponent(btnIdentificarB)
                        .addComponent(btnIdentificarD)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpDesenho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbLetrasTreinarD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTreinarComoD))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbLetrasSalvarD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarModeloComoD)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbLetrasTreinarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTreinarComoB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbLetrasSalvarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarModeloComoB))))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTreinarComoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreinarComoDActionPerformed
        SalvarImagem();
        
        Mat mat1 = Imgcodecs.imread("src\\imagens\\painel.jpg");

        int[][] matrizBinaria = RecortarEConverter(mat1);

        MatrizModelo mm = new MatrizModelo();
        mm.matriz = matrizBinaria;
        mm.setNome(cbLetrasTreinarD.getSelectedItem().toString().charAt(0));

        try {
            // grava matriz modelo no arquivo
            new Arquivo().gravarArquivo("src\\modelos\\modelos.txt", mm);

            // le matrizes modelos
            lm = new Arquivo().lerArquivo("src\\modelos\\modelos.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "ERRO: " + e.getMessage());
        }

        treinar();

        // mostra os pesos
        for (int aux = 0; aux < lp.size(); aux++) {
            System.out.print(lp.get(aux).getNome() + ";");
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 30; j++) {
                    System.out.print(lp.get(aux).peso[i][j] + ";");
                }
            }
            System.out.println("");
        }

    }//GEN-LAST:event_btnTreinarComoDActionPerformed

    private void btnIdentificarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdentificarDActionPerformed
        SalvarImagem();
        
        Mat mat1 = Imgcodecs.imread("src\\imagens\\painel.jpg");

        int[][] matrizBinaria = RecortarEConverter(mat1);

        String resultado = "Letra reconhecida: ";
        int count = 0;
        // for para mostrar as saídas dos neuronios no JOptionPane
        for (int aux = 0; aux < lp.size(); aux++) {
            if (lp.get(aux).executar(matrizBinaria) == 1) {
                if (count > 0) {
                    resultado += " ou ";
                }

                resultado += lp.get(aux).getNome();
                count++;

            }
        }

        JOptionPane.showMessageDialog(this, resultado);

        // for para mostrar as saídas dos neuronios no terminal
        for (int aux = 0; aux < lp.size(); aux++) {
            System.out.println("Letra: " + lp.get(aux).getNome() + " | Saída: " + lp.get(aux).executar(matrizBinaria));
        }
        System.out.println("----------------------------------");

    }//GEN-LAST:event_btnIdentificarDActionPerformed

    private void btnSalvarModeloComoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarModeloComoDActionPerformed
        SalvarImagem();
        
        Mat mat1 = Imgcodecs.imread("src\\imagens\\painel.jpg");

        int[][] matrizBinaria = RecortarEConverter(mat1);

        MatrizModelo mm = new MatrizModelo();
        mm.matriz = matrizBinaria;
        mm.setNome(cbLetrasSalvarD.getSelectedItem().toString().charAt(0));

        try {
            // grava matriz modelo no arquivo
            new Arquivo().gravarArquivo("src\\modelos\\modelos.txt", mm);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarModeloComoDActionPerformed

    private void btnBuscarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarImgActionPerformed
        // chama método para buscar a imagem
        caminho = BuscarImagem();

        // se o caminho for diferente de null então mostra no painel a imagem
        if (caminho != null) {
            Mat matImp = Imgcodecs.imread(caminho);
            // redimensiona a imagem para o tamanho do painel
            Imgproc.resize(matImp, matImp, new Size(jpBusca.getWidth(), jpBusca.getHeight()));
            Util.exibirImagem(jpBusca, matImp);
        }

    }//GEN-LAST:event_btnBuscarImgActionPerformed

    private void btnIdentificarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdentificarBActionPerformed
        try{
        if(! caminho.equals(null)){
        
        Mat mat1 = Imgcodecs.imread(caminho);

        int[][] matrizBinaria = RecortarEConverter(mat1);

        String resultado = "Letra reconhecida: ";
        int count = 0;
        // for para mostrar as saídas dos neuronios no JOptionPane
        for (int aux = 0; aux < lp.size(); aux++) {
            if (lp.get(aux).executar(matrizBinaria) == 1) {
                if (count > 0) {
                    resultado += " ou ";
                }

                resultado += lp.get(aux).getNome();
                count++;

            }
        }

        JOptionPane.showMessageDialog(this, resultado);

        // for para mostrar as saídas dos neuronios no terminal
        for (int aux = 0; aux < lp.size(); aux++) {
            System.out.println("Letra: " + lp.get(aux).getNome() + " | Saída: " + lp.get(aux).executar(matrizBinaria));
        }
        System.out.println("----------------------------------");
    }//GEN-LAST:event_btnIdentificarBActionPerformed
    }catch(NullPointerException e){
        JOptionPane.showMessageDialog(this,"Escolha uma imagem !");
    }
}

    private void btnTreinarComoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreinarComoBActionPerformed
        Mat mat1 = Imgcodecs.imread(caminho);

        int[][] matrizBinaria = RecortarEConverter(mat1);

        MatrizModelo mm = new MatrizModelo();
        mm.matriz = matrizBinaria;
        mm.setNome(cbLetrasTreinarB.getSelectedItem().toString().charAt(0));

        try {
            // grava matriz modelo no arquivo
            new Arquivo().gravarArquivo("src\\modelos\\modelos.txt", mm);

            // le matrizes modelos
            lm = new Arquivo().lerArquivo("src\\modelos\\modelos.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "ERRO: " + e.getMessage());
        }

        treinar();

        // mostra os pesos
        for (int aux = 0; aux < lp.size(); aux++) {
            System.out.print(lp.get(aux).getNome() + ";");
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 30; j++) {
                    System.out.print(lp.get(aux).peso[i][j] + ";");
                }
            }
            System.out.println("");
        }
    }//GEN-LAST:event_btnTreinarComoBActionPerformed

    private void btnSalvarModeloComoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarModeloComoBActionPerformed
        Mat mat1 = Imgcodecs.imread(caminho);

        int[][] matrizBinaria = RecortarEConverter(mat1);

        MatrizModelo mm = new MatrizModelo();
        mm.matriz = matrizBinaria;
        mm.setNome(cbLetrasSalvarB.getSelectedItem().toString().charAt(0));

        try {
            // grava matriz modelo no arquivo
            new Arquivo().gravarArquivo("src\\modelos\\modelos.txt", mm);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarModeloComoBActionPerformed

    private void btnCarregAprendizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregAprendizadoActionPerformed
        try {
            // le matrizes modelos
            lm = new Arquivo().lerArquivo("src\\modelos\\modelos.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "ERRO: " + e.getMessage());
        }

        treinar();

        // mostra os pesos
        for (int aux = 0; aux < lp.size(); aux++) {
            System.out.print(lp.get(aux).getNome() + ";PesoBIAS:" + lp.get(aux).getPesoBias() + ";Pesos:");
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 30; j++) {
                    System.out.print(lp.get(aux).peso[i][j] + ";");
                }
            }
            System.out.println("");
        }
    }//GEN-LAST:event_btnCarregAprendizadoActionPerformed

    public static void main(String args[]) {

        //CARREGAR BIBLIOTECA OPENCV
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarImg;
    private javax.swing.JButton btnCarregAprendizado;
    private javax.swing.JButton btnIdentificarB;
    private javax.swing.JButton btnIdentificarD;
    private javax.swing.JButton btnSalvarModeloComoB;
    private javax.swing.JButton btnSalvarModeloComoD;
    private javax.swing.JButton btnTreinarComoB;
    private javax.swing.JButton btnTreinarComoD;
    private javax.swing.JComboBox<String> cbLetrasSalvarB;
    private javax.swing.JComboBox<String> cbLetrasSalvarD;
    private javax.swing.JComboBox<String> cbLetrasTreinarB;
    private javax.swing.JComboBox<String> cbLetrasTreinarD;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpBusca;
    private javax.swing.JPanel jpDesenho;
    private javax.swing.JPanel jpRecorte;
    private javax.swing.JLabel lblApagar;
    private javax.swing.JLabel lblDesenhar;
    private javax.swing.JLabel lblrecorte;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("OpenCV");
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        URL myURL = getClass().getProtectionDomain().getCodeSource().getLocation();
        java.net.URI myURI = null;
        try {
            myURI = myURL.toURI();
        } catch (URISyntaxException e1) {
        }
        IMGPATH = Paths.get(myURI).toFile().toString();
    }

    private void treinar() {

        countEpocas = 0;
        do {
            ajustouPeso = false;
            // for para passar por cada neuronio
            for (int aux = 0; aux < 26; aux++) {
                for (int i = 0; i < lm.size(); i++) {

                    // varável responsável para receber o valor esperado
                    int saidaEsperada;

                    // Se a o neuronio a ser treinado é igual a letra desejada entao a saida esperada recebe 1 senao recebe 0
                    if (lp.get(aux).getNome() == lm.get(i).getNome()) {
                        saidaEsperada = 1;
                    } else {
                        saidaEsperada = 0;
                    }

                    // A saída recebe o resultado da rede que no caso é 1 ou 0
                    int saida = lp.get(aux).executar(lm.get(i).matriz);

                    // Caso a saída seja diferente do valor esperado os pesos sinápticos serão corrigidos
                    if (saida != saidaEsperada) {

                        lp.get(aux).corrigirPeso(saida, saidaEsperada, lm.get(i).matriz);

                        // a variavél responsável pelo controle de treinamento recebe true
                        ajustouPeso = true;

                    }
                }
            }
            // acrescenta uma época
            countEpocas++;

            System.out.println("epocas: " + countEpocas);

            // teste se houve algum erro durante o treinamento e o número de epocas é menor que o definido
        } while ((ajustouPeso == true) && (countEpocas < epocasMax));

        if (ajustouPeso == false && countEpocas < epocasMax) {
            System.out.println("Treinamento concluido com sucesso: Epocas Usadas " + countEpocas);
            countEpocas = 0;
        } else if (countEpocas == epocasMax) {
            System.out.println("Nao foi possivel treinar corretamente");
            countEpocas = 0;
            ajustouPeso = false;
        } else {
            System.out.println("ERRO");
        }

    }
    public int[][] RecortarEConverter(Mat mat1){
        // ix = inicio de x | iy = inicio de y | fx = fim de x | fy = fim de y
        // instanciado com esses valores para poder pegar qualquer valor na primeira passar do for
        int ix = 999999;
        int iy = 999999;
        int fx = -999999;
        int fy = -999999;
        
        //System.out.println(mat1.size().width);
        //System.out.println(mat1.size().height);
        
        // for e if para verificar pegar os valores do bouding box do x e y iniciais e finais
        for (int i = 0; i < mat1.size().width; i++) {
            for (int j = 0; j < mat1.size().height; j++) {
                if (mat1.get(i, j)[0] == 0.0) {
                    if (j < iy) {
                        iy = j;
                    }
                    if (j > fy) {
                        fy = j;
                    }
                    if (i < ix) {
                        ix = i;
                    }
                    if (i > fx) {
                        fx = i;
                    }
                }
            }
        }

        //System.out.println(ix);
        //System.out.println(fx);
        //System.out.println(iy);
        //System.out.println(fy);
        
        // recorta a area de interesse e gera uma nova matriz
        Mat mat2 = mat1.submat(ix, fx, iy, fy);
        
        // redimensiona a nova matriz
        Imgproc.resize(mat2, mat2, new Size(30, 30));
        
        //System.out.println(mat2.channels());
        
        // se a imagem for colorida(3 canais) transforma em tons de cinza para depois transformar em preto e branco
        if (mat2.channels() > 1) {
            Imgproc.cvtColor(mat2, mat2, Imgproc.COLOR_RGB2GRAY);
        }

        // transforma a imagem em preto e branco
        Imgproc.threshold(mat2, mat2, 0, 255, Imgproc.THRESH_OTSU);

        int[][] matrizBinaria = new int[30][30];

        // for para pegar os pixels, se for preto(0) recebe valor 1 se for branco(255) recebe valor 0
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                if (mat2.get(i, j)[0] == 255) {
                    matrizBinaria[i][j] = 0;
                } else if ((mat2.get(i, j)[0] == 0)) {
                    matrizBinaria[i][j] = 1;
                } else {
                    JOptionPane.showMessageDialog(this, "numero desconhecido: " + mat2.get(i, j)[0]);
                }
            }
        }
        
        // mostra no painel de recorte a area de interesse ja redimensionada 
        Util.exibirImagem(jpRecorte, mat2);
        
        return matrizBinaria;
    }

    public String BuscarImagem() {
        String caminho = null;
        JFileChooser abrir = new JFileChooser(this.caminho);

        // filtra os tipos de arquivo que será disponivel selecionar
        abrir.setFileFilter(new FileNameExtensionFilter(".bmp, .png ou .jpg", "bmp", "png", "jpg"));
        abrir.setAcceptAllFileFilterUsed(false);
        int retorno = abrir.showOpenDialog(null);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            caminho = abrir.getSelectedFile().getAbsolutePath();
            System.out.println(caminho);
        }

        return caminho;
    }
    
    public void SalvarImagem(){
        BufferedImage imagem = new BufferedImage(jpDesenho.getWidth(), jpDesenho.getHeight(), BufferedImage.TYPE_INT_RGB);
        //Obtem o contexto gráfico dessa imagem:
        Graphics2D graphics = imagem.createGraphics();
        //Faz o painel desenhar sobre essa imagem:
        jpDesenho.paint(graphics);
        //Apaga o contexto gráfico (isso não apagará a imagem):
        graphics.dispose();
        try {
            //Salva a imagem no disco:
            ImageIO.write(imagem, "jpg", new File("src\\imagens\\painel.jpg"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());;
        }
    }

    public void setConfListPerc() {
        // seta o nome de cada neuronio e a posicao no ArrayList
        a = new Perceptron();
        a.setPosicao(0);
        a.setNome('a');
        b = new Perceptron();
        b.setPosicao(1);
        b.setNome('b');
        c = new Perceptron();
        c.setPosicao(2);
        c.setNome('c');
        d = new Perceptron();
        d.setPosicao(3);
        d.setNome('d');
        e = new Perceptron();
        e.setPosicao(4);
        e.setNome('e');
        f = new Perceptron();
        f.setPosicao(5);
        f.setNome('f');
        g = new Perceptron();
        g.setPosicao(6);
        g.setNome('g');
        h = new Perceptron();
        h.setPosicao(7);
        h.setNome('h');
        i = new Perceptron();
        i.setPosicao(8);
        i.setNome('i');
        j = new Perceptron();
        j.setPosicao(9);
        j.setNome('j');
        k = new Perceptron();
        k.setPosicao(10);
        k.setNome('k');
        l = new Perceptron();
        l.setPosicao(11);
        l.setNome('l');
        m = new Perceptron();
        m.setPosicao(12);
        m.setNome('m');
        n = new Perceptron();
        n.setPosicao(13);
        n.setNome('n');
        o = new Perceptron();
        o.setPosicao(14);
        o.setNome('o');
        p = new Perceptron();
        p.setPosicao(15);
        p.setNome('p');
        q = new Perceptron();
        q.setPosicao(16);
        q.setNome('q');
        r = new Perceptron();
        r.setPosicao(17);
        r.setNome('r');
        s = new Perceptron();
        s.setPosicao(18);
        s.setNome('s');
        t = new Perceptron();
        t.setPosicao(19);
        t.setNome('t');
        u = new Perceptron();
        u.setPosicao(20);
        u.setNome('u');
        v = new Perceptron();
        v.setPosicao(21);
        v.setNome('v');
        w = new Perceptron();
        w.setPosicao(22);
        w.setNome('w');
        x = new Perceptron();
        x.setPosicao(23);
        x.setNome('x');
        y = new Perceptron();
        y.setPosicao(24);
        y.setNome('y');
        z = new Perceptron();
        z.setPosicao(25);
        z.setNome('z');

        // Adiciona cada neuronio no ArrayList
        lp.add(a);
        lp.add(b);
        lp.add(c);
        lp.add(d);
        lp.add(e);
        lp.add(f);
        lp.add(g);
        lp.add(h);
        lp.add(i);
        lp.add(j);
        lp.add(k);
        lp.add(l);
        lp.add(m);
        lp.add(n);
        lp.add(o);
        lp.add(p);
        lp.add(q);
        lp.add(r);
        lp.add(s);
        lp.add(t);
        lp.add(u);
        lp.add(v);
        lp.add(w);
        lp.add(x);
        lp.add(y);
        lp.add(z);
    }

}
