/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinaljava2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author alfonsogalvanmadera
 */
public class Memorama extends javax.swing.JFrame {
ArrayList<JLabel> etiquetas;
int piezas[]=new int[12];
JLabel imagenes[]=new JLabel[12];
int valor=0;
int carta[]=new int[12];
Random alea=new Random();
int z=0;
int l[]=new int[4];


    public Memorama() {
        
        etiquetas=new ArrayList<JLabel>();
        initComponents();
        //Vamos a agregar los label's 
        
        
        //int valor=0;
        int largo =350;
        int ancho=350;
        jPanel1.setSize(largo,ancho);
        
        
        
        for(int x=0; x<12; x++){
        int arreglo=(int)(alea.nextDouble()*6+1);
         if(x==0){
            carta[x]=arreglo;
         }
          if(x!=0){
            int a=0;
        
           for(;a!=1;){
            int variable=0;
                for(int j=0; j<carta.length; j++){
                    if(arreglo==carta[j]){
                        variable++;
                    }
                }
                if((variable==0)||(variable==1)){
                    carta[x]=arreglo;
                    a=1;
                }else{
                    arreglo=(int)(alea.nextDouble()*6+1);
                }
            }
          }
        }
        for(int i:piezas){
            imagenes[valor]=new JLabel();
            ImageIcon iconx=new ImageIcon("src/proyectofinal/a.png");
            imagenes[valor].setIcon(iconx);
            imagenes[valor].setName(" "+valor);
            imagenes[valor].setSize(500, 500);
            final Integer inte=new Integer(imagenes[valor].getName());
            
            jPanel1.add(imagenes[valor]);
        
        
        
        
        
        /*
        for(int i:piezas){
        //JLabel label =new JLabel("Pieza "+valor);
        // jPanel1.add(label);
         imagenes[valor]=new JLabel("Pieza "+ valor);
         imagenes [valor].setName("pieza "+ valor);
        jPanel1.add(imagenes[valor]);
        */

        imagenes[valor].addMouseListener(new MouseListener(){

             @Override
             public void mouseClicked(MouseEvent e) {
                 //jLabel1.setText(e.getComponent().getName());
                 
                 ///Agrego imagenes 
                 ImageIcon icon0=new ImageIcon("src/proyectofinal/a.png");
                 ImageIcon icon1=new ImageIcon("src/proyectofinal/b.png");
                 ImageIcon icon2=new ImageIcon("src/proyectofinal/c.png");
                 ImageIcon icon3=new ImageIcon("src/proyectofinal/d.png");
                 ImageIcon icon4=new ImageIcon("src/proyectofinal/e.png");
                 ImageIcon icon5=new ImageIcon("src/proyectofinal/f.png");
                 ImageIcon icon6=new ImageIcon("src/proyectofinal/g.png");
                 
                 if(carta[inte]==1){
                     imagenes[inte].setIcon(icon1);
                     imagenes[inte].setText(null);
                     z++;
                     if(z==1){
                         l[0]=carta[inte];
                         Integer ls=new Integer(imagenes[inte].getName());
                         l[1]=ls;
                     }
                     if(z==2){
                         l[2]=carta[inte];
                         Integer lt=new Integer(imagenes[inte].getName());
                         l[3]=lt;
                     }
                     if(z==3){
                         if(l[0]!=l[2]){
                             imagenes[l[1]].setIcon(icon0);
                             imagenes[l[3]].setIcon(icon0);
                         }
                         z=1;
                         l[0]=carta[inte];
                         Integer lu=new Integer(imagenes[inte].getName());
                         l[1]=lu;
                     }
                 }
                 if(carta[inte]==2){
                     imagenes[inte].setIcon(icon2);
                     imagenes[inte].setText(null);
                     z++;
                     if(z==1){
                         l[0]=carta[inte];
                         Integer ls=new Integer(imagenes[inte].getName());
                         l[1]=ls;
                     }
                     if(z==2){
                         l[2]=carta[inte];
                         Integer lt=new Integer(imagenes[inte].getName());
                         l[3]=lt;
                     }
                     if(z==3){
                         if(l[0]!=l[2]){
                             imagenes[l[1]].setIcon(icon0);
                             imagenes[l[3]].setIcon(icon0);
                         }
                         z=1;
                         l[0]=carta[inte];
                         Integer pares=new Integer(imagenes[inte].getName());
                         l[1]=pares;
                     }
                 }
                 if(carta[inte]==3){
                     imagenes[inte].setIcon(icon3);
                     imagenes[inte].setText(null);
                     z++;
                     if(z==1){
                         l[0]=carta[inte];
                         Integer ls=new Integer(imagenes[inte].getName());
                         l[1]=ls;
                     }
                     if(z==2){
                         l[2]=carta[inte];
                         Integer lt=new Integer(imagenes[inte].getName());
                         l[3]=lt;
                     }
                     if(z==3){
                         if(l[0]!=l[2]){
                             imagenes[l[1]].setIcon(icon0);
                             imagenes[l[3]].setIcon(icon0);
                         }
                         z=1;
                         l[0]=carta[inte];
                         Integer lu=new Integer(imagenes[inte].getName());
                         l[1]=lu;
                     }
                 }
                 if(carta[inte]==4){
                     imagenes[inte].setIcon(icon4);

                     imagenes[inte].setText(null);
                     z++;
                     if(z==1){
                         l[0]=carta[inte];
                         Integer ls=new Integer(imagenes[inte].getName());
                         l[1]=ls;
                     }
                     if(z==2){
                         l[2]=carta[inte];
                         Integer lt=new Integer(imagenes[inte].getName());
                         l[3]=lt;
                     }
                     if(z==3){
                         if(l[0]!=l[2]){
                             imagenes[l[1]].setIcon(icon0);
                             imagenes[l[3]].setIcon(icon0);
                         }
                         z=1;
                         l[0]=carta[inte];
                         Integer lu=new Integer(imagenes[inte].getName());
                         l[1]=lu;
                     }
                 }
                 if(carta[inte]==5){
                     imagenes[inte].setIcon(icon5);
                     imagenes[inte].setText(null);
                     z++;
                     if(z==1){
                         l[0]=carta[inte];
                         Integer ls=new Integer(imagenes[inte].getName());
                         l[1]=ls;
                     }
                     if(z==2){
                         l[2]=carta[inte];
                         Integer paresy=new Integer(imagenes[inte].getName());
                         l[3]=paresy;
                     }
                     if(z==3){
                         if(l[0]!=l[2]){
                             imagenes[l[1]].setIcon(icon0);
                             imagenes[l[3]].setIcon(icon0);
                         }
                         z=1;
                         l[0]=carta[inte];
                         Integer lu=new Integer(imagenes[inte].getName());
                         l[1]=lu;
                     } 
                 }
                 if(carta[inte]==6){
                     imagenes[inte].setIcon(icon6);
                     imagenes[inte].setText(null);
                     z++;
                     if(z==1){
                         l[0]=carta[inte];
                         Integer ls=new Integer(imagenes[inte].getName());
                         l[1]=ls;
                     }
                     if(z==2){
                         l[2]=carta[inte];
                         Integer lt=new Integer(imagenes[inte].getName());
                         l[3]=lt;
                     }
                     if(z==3){
                         if(l[0]!=l[2]){
                             imagenes[l[1]].setIcon(icon0);
                             imagenes[l[3]].setIcon(icon0);
                         }
                         z=1;
                         l[0]=carta[inte];
                         Integer lu=new Integer(imagenes[inte].getName());
                         l[1]=lu;
                     }
                 }
                 jLabel1.setText(" "+inte);
             }

             @Override
             public void mousePressed(MouseEvent e) {
                 
             }

             @Override
             public void mouseReleased(MouseEvent e) {
                 
             }

             @Override
             public void mouseEntered(MouseEvent e) {
                 
             }

             @Override
             public void mouseExited(MouseEvent e) {
                 
             }
        
        });
        valor++;
        
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(141, 141, 141)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Memorama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
