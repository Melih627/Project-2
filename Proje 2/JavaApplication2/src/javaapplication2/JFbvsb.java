/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author OnurOkyay
 */
public class JFbvsb extends javax.swing.JFrame {
 ArrayList<Pokemon> list;
 int[] dizi;
 Bilgisayar      Bot0;
 Bilgisayar      Bot1;
 int z;
 int a;
 int x;
 int o;
 int sayac=0;
 int t=0;
 int m=0;
    /**
     * Creates new form JFbvsb
     */
    public JFbvsb() {
        initComponents();
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jButton20.setVisible(false);
        jButton21.setVisible(false);
        jButton2.setVisible(false);
        jButton1.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton17.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton23.setVisible(false);
      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\OnurOkyay\\Desktop\\kartlar\\bulbasaur.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(610, 840, 160, 220);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\OnurOkyay\\Desktop\\kartlar\\butterfree.jpg")); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(800, 840, 160, 220);

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\OnurOkyay\\Desktop\\kartlar\\charmander.jpg")); // NOI18N
        getContentPane().add(jButton3);
        jButton3.setBounds(980, 840, 160, 220);

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\OnurOkyay\\Desktop\\kartlar\\jigglypuf.jpg")); // NOI18N
        getContentPane().add(jButton4);
        jButton4.setBounds(620, 20, 150, 220);

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\OnurOkyay\\Desktop\\kartlar\\meowth.jpg")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(800, 20, 160, 230);

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\OnurOkyay\\Desktop\\kartlar\\pikachu.jpg")); // NOI18N
        getContentPane().add(jButton6);
        jButton6.setBounds(993, 20, 150, 220);

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\OnurOkyay\\Desktop\\kartlar\\pikachu.jpg")); // NOI18N
        getContentPane().add(jButton7);
        jButton7.setBounds(410, 560, 160, 220);

        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\OnurOkyay\\Desktop\\kartlar\\psyduck.jpg")); // NOI18N
        getContentPane().add(jButton8);
        jButton8.setBounds(600, 560, 160, 220);

        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\OnurOkyay\\Desktop\\kartlar\\snorlax.jpg")); // NOI18N
        getContentPane().add(jButton9);
        jButton9.setBounds(780, 560, 160, 220);

        jButton10.setIcon(new javax.swing.ImageIcon("C:\\Users\\OnurOkyay\\Desktop\\kartlar\\squirtle.jpg")); // NOI18N
        getContentPane().add(jButton10);
        jButton10.setBounds(960, 560, 160, 220);

        jButton11.setIcon(new javax.swing.ImageIcon("C:\\Users\\OnurOkyay\\Desktop\\kartlar\\zubat.jpg")); // NOI18N
        getContentPane().add(jButton11);
        jButton11.setBounds(1160, 560, 160, 220);

        jButton12.setIcon(new javax.swing.ImageIcon("C:\\Users\\OnurOkyay\\Desktop\\kartlar\\bulbasaur.jpg")); // NOI18N
        getContentPane().add(jButton12);
        jButton12.setBounds(410, 290, 160, 220);

        jButton13.setIcon(new javax.swing.ImageIcon("C:\\Users\\OnurOkyay\\Desktop\\kartlar\\butterfree.jpg")); // NOI18N
        getContentPane().add(jButton13);
        jButton13.setBounds(600, 290, 160, 220);

        jButton14.setIcon(new javax.swing.ImageIcon("C:\\Users\\OnurOkyay\\Desktop\\kartlar\\charmander.jpg")); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(780, 290, 160, 220);

        jButton15.setIcon(new javax.swing.ImageIcon("C:\\Users\\OnurOkyay\\Desktop\\kartlar\\jigglypuf.jpg")); // NOI18N
        getContentPane().add(jButton15);
        jButton15.setBounds(970, 290, 160, 220);

        jButton16.setIcon(new javax.swing.ImageIcon("C:\\Users\\OnurOkyay\\Desktop\\kartlar\\meowth.jpg")); // NOI18N
        getContentPane().add(jButton16);
        jButton16.setBounds(1150, 290, 160, 220);

        jButton17.setBackground(new java.awt.Color(204, 0, 0));
        jButton17.setIcon(new javax.swing.ImageIcon("C:\\Users\\OnurOkyay\\Desktop\\kartlar\\squirtle.jpg")); // NOI18N
        getContentPane().add(jButton17);
        jButton17.setBounds(1410, 230, 240, 280);

        jButton18.setBackground(new java.awt.Color(0, 153, 153));
        jButton18.setIcon(new javax.swing.ImageIcon("C:\\Users\\OnurOkyay\\Desktop\\kartlar\\snorlax.jpg")); // NOI18N
        getContentPane().add(jButton18);
        jButton18.setBounds(1410, 590, 250, 280);

        jButton19.setText("Kart Al");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19);
        jButton19.setBounds(1750, 630, 120, 60);

        jButton20.setText("Kart At");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20);
        jButton20.setBounds(1750, 550, 120, 60);

        jButton21.setText("Kartları Dağıt");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21);
        jButton21.setBounds(1749, 460, 120, 60);

        jButton22.setText("Oyun başlat");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22);
        jButton22.setBounds(781, 293, 180, 60);

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sonuç.jpg"))); // NOI18N
        jButton23.setText("Sonuçları görüntüle");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23);
        jButton23.setBounds(0, 0, 1910, 1080);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arkaplan.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setMaximumSize(new java.awt.Dimension(1900, 1080));
        jLabel1.setMinimumSize(new java.awt.Dimension(1900, 1080));
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1900, 1080));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1930, 1080);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1910, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1910, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
      if(o==1 && m<2){
          o=0;
          t++;
          m++;
        if(Bot0.liste.get(0).kullanildiMi2(Bot0.liste.get(0).getKullanim2())){
           a=0;
       }
       if(Bot0.liste.get(1).kullanildiMi2(Bot0.liste.get(1).getKullanim2())){
           a=1;
       }
       if(Bot0.liste.get(2).kullanildiMi2(Bot0.liste.get(2).getKullanim2())){
           a=2;
       }
        
        Random rnd=new Random();
        int y1=0;
        y1=rnd.nextInt(10);
    while(list.get(y1).kullanildiMi(list.get(y1).getKullanim())){
        y1=rnd.nextInt(10);
    }
     Bot0.liste.set(a,list.get(y1));
     Bot0.liste.get(a).setKullanim();
      if(a==0){
             jButton1.setVisible(true);
             jButton1.setIcon(new javax.swing.ImageIcon(Bot0.liste.get(a).getDosyayolu()));
         }
         if(a==1){
             jButton2.setVisible(true);
              jButton2.setIcon(new javax.swing.ImageIcon(Bot0.liste.get(a).getDosyayolu()));
             
         }
         if(a==2){
             jButton3.setVisible(true);
              jButton3.setIcon(new javax.swing.ImageIcon(Bot0.liste.get(a).getDosyayolu()));
         }
     
    if(Bot1.liste.get(0).kullanildiMi2(Bot1.liste.get(0).getKullanim2())){
           a=0;
       }
       if(Bot1.liste.get(1).kullanildiMi2(Bot1.liste.get(1).getKullanim2())){
           a=1;
       }
       if(Bot1.liste.get(2).kullanildiMi2(Bot1.liste.get(2).getKullanim2())){
           a=2;
       }
       
    
         y1=0;
        y1=rnd.nextInt(10);
    while(list.get(y1).kullanildiMi(list.get(y1).getKullanim())){
        y1=rnd.nextInt(10);
    }
     Bot1.liste.set(a,list.get(y1));
        Bot1.liste.get(a).setKullanim();
      if(a==0){
             jButton4.setVisible(true);
             jButton4.setIcon(new javax.swing.ImageIcon(Bot1.liste.get(a).getDosyayolu()));
         }
         if(a==1){
             jButton5.setVisible(true);
              jButton5.setIcon(new javax.swing.ImageIcon(Bot1.liste.get(a).getDosyayolu()));
             
         }
         if(a==2){
             jButton6.setVisible(true);
              jButton6.setIcon(new javax.swing.ImageIcon(Bot1.liste.get(a).getDosyayolu()));
         }
         
         if(list.get(dizi[0]).kullanildiMi(list.get(dizi[0]).getKullanim())){
            jButton7.setVisible(false);
        }
        
        if(list.get(dizi[1]).kullanildiMi(list.get(dizi[1]).getKullanim())){
            jButton8.setVisible(false);
        }
        
        if(list.get(dizi[2]).kullanildiMi(list.get(dizi[2]).getKullanim())){
            jButton9.setVisible(false);
        }
        
        if(list.get(dizi[3]).kullanildiMi(list.get(dizi[3]).getKullanim())){
            jButton10.setVisible(false);
        }
        
        if(list.get(dizi[4]).kullanildiMi(list.get(dizi[4]).getKullanim())){
            jButton11.setVisible(false);
        }
        
        if(list.get(dizi[5]).kullanildiMi(list.get(dizi[5]).getKullanim())){
            jButton12.setVisible(false);
        }
        
        if(list.get(dizi[6]).kullanildiMi(list.get(dizi[6]).getKullanim())){
            jButton13.setVisible(false);
        }
        
        if(list.get(dizi[7]).kullanildiMi(list.get(dizi[7]).getKullanim())){
            jButton14.setVisible(false);
        }
        
        if(list.get(dizi[8]).kullanildiMi(list.get(dizi[8]).getKullanim())){
            jButton15.setVisible(false);
        }
        
        if(list.get(dizi[9]).kullanildiMi(list.get(dizi[9]).getKullanim())){
            jButton16.setVisible(false);
        }
     }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        list=new ArrayList<Pokemon>();
            Pokemon pika=new Pikachu("01","Pikachu","Elektrik");
            Pokemon bulba=new Bulbasaur("02","Bulbasaur","Çim");
            Pokemon charman=new Charmander("03","Charmander","Ateş");
            Pokemon squ=new Squirtle("04","Squirtle","Su");
            Pokemon zuba=new Zubat("05","Zubat","Hava");
            Pokemon psy=new Psyduck("06","Psyduck","Su");
            Pokemon snor=new Snorlax("07","Snorlax","Normal");
            Pokemon butter=new Butterfree("08","Butterfree","Hava");
            Pokemon jiggly=new Jigglypuff("09","Jigglypuff","Ses");
            Pokemon meow=new Meowth("10","Meowth","Normal");
            
            
            list.add(pika);
            list.add(bulba);
            list.add(charman);
            list.add(squ);
            list.add(zuba);
            list.add(psy);
            list.add(snor);
            list.add(butter);
            list.add(jiggly);
            list.add(meow);
            
            int x1,i=0;
      dizi =new int[10];
            Random  rnd=new Random();
            while(i<10){
               x1=rnd.nextInt(10);
               dizi[i]=x1;
               for(int j=0;j<i;j++){
                   if(dizi[j]==dizi[i]){
                       
                       i--;
                   }
               }
                i++;
                
            }
            
            for(int k=0;k<10;k++){
             //   System.out.println("--> "+dizi[k]);
            }
            
            
            
        jButton7.setIcon(new javax.swing.ImageIcon(list.get(dizi[0]).getDosyayolu()));
        jButton8.setIcon(new javax.swing.ImageIcon(list.get(dizi[1]).getDosyayolu()));
        jButton9.setIcon(new javax.swing.ImageIcon(list.get(dizi[2]).getDosyayolu()));
        jButton10.setIcon(new javax.swing.ImageIcon(list.get(dizi[3]).getDosyayolu()));
        jButton11.setIcon(new javax.swing.ImageIcon(list.get(dizi[4]).getDosyayolu()));
        jButton12.setIcon(new javax.swing.ImageIcon(list.get(dizi[5]).getDosyayolu()));
        jButton13.setIcon(new javax.swing.ImageIcon(list.get(dizi[6]).getDosyayolu()));
        jButton14.setIcon(new javax.swing.ImageIcon(list.get(dizi[7]).getDosyayolu()));
        jButton15.setIcon(new javax.swing.ImageIcon(list.get(dizi[8]).getDosyayolu()));
        jButton16.setIcon(new javax.swing.ImageIcon(list.get(dizi[9]).getDosyayolu()));
        
        jButton7.setVisible(true);
         jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton10.setVisible(true);
        jButton11.setVisible(true);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton14.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(true);
        jButton21.setVisible(true); //3 kart
        jButton22.setVisible(false);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
      Bot0 =new Bilgisayar("bilgisayar", "002", 0);
         Bot1=new Bilgisayar("bilgisayar","003",0);
          Random  rnd=new Random();
        int a,b,c,d,e,f;
            
            do{
                a=rnd.nextInt(10);
                b=rnd.nextInt(10);
                c=rnd.nextInt(10);
                d=rnd.nextInt(10);
                e=rnd.nextInt(10);
                f=rnd.nextInt(10);
                
            }while(a==b || a==c || a==d || a==e || a==f|| b==c||b==d||b==e||b==f||c==d ||c==e||c==f||d==e||d==f ||e==f );
            
            Bot0.KartSec(list, a, b, c);
            System.out.println(""+Bot0.liste.get(0));
            System.out.println(""+Bot0.liste.get(1));  
            System.out.println(""+Bot0.liste.get(2));
            Bot0.liste.get(0).setKullanim();
            Bot0.liste.get(1).setKullanim();
            Bot0.liste.get(2).setKullanim();
            
            
            Bot1.KartSec(list, d, e, f);
            System.out.println(""+Bot1.liste.get(0));
            System.out.println(""+Bot1.liste.get(1));  
            System.out.println(""+Bot1.liste.get(2));
            Bot1.liste.get(0).setKullanim();
            Bot1.liste.get(1).setKullanim();
            Bot1.liste.get(2).setKullanim();
            
            
            if(list.get(dizi[0]).kullanildiMi(list.get(dizi[0]).getKullanim())){
            jButton7.setVisible(false);
        }
        
        if(list.get(dizi[1]).kullanildiMi(list.get(dizi[1]).getKullanim())){
            jButton8.setVisible(false);
        }
        
        if(list.get(dizi[2]).kullanildiMi(list.get(dizi[2]).getKullanim())){
            jButton9.setVisible(false);
        }
        
        if(list.get(dizi[3]).kullanildiMi(list.get(dizi[3]).getKullanim())){
            jButton10.setVisible(false);
        }
        
        if(list.get(dizi[4]).kullanildiMi(list.get(dizi[4]).getKullanim())){
            jButton11.setVisible(false);
        }
        
        if(list.get(dizi[5]).kullanildiMi(list.get(dizi[5]).getKullanim())){
            jButton12.setVisible(false);
        }
        
        if(list.get(dizi[6]).kullanildiMi(list.get(dizi[6]).getKullanim())){
            jButton13.setVisible(false);
        }
        
        if(list.get(dizi[7]).kullanildiMi(list.get(dizi[7]).getKullanim())){
            jButton14.setVisible(false);
        }
        
        if(list.get(dizi[8]).kullanildiMi(list.get(dizi[8]).getKullanim())){
            jButton15.setVisible(false);
        }
        
        if(list.get(dizi[9]).kullanildiMi(list.get(dizi[9]).getKullanim())){
            jButton16.setVisible(false);
        }
        jButton21.setVisible(false);
        
        jButton1.setIcon(new javax.swing.ImageIcon(Bot0.liste.get(0).getDosyayolu()));
        jButton2.setIcon(new javax.swing.ImageIcon(Bot0.liste.get(1).getDosyayolu()));
        jButton3.setIcon(new javax.swing.ImageIcon(Bot0.liste.get(2).getDosyayolu()));
        jButton4.setIcon(new javax.swing.ImageIcon(Bot1.liste.get(0).getDosyayolu()));
        jButton5.setIcon(new javax.swing.ImageIcon(Bot1.liste.get(1).getDosyayolu()));
        jButton6.setIcon(new javax.swing.ImageIcon(Bot1.liste.get(2).getDosyayolu()));
        
         jButton20.setVisible(true);
          jButton1.setVisible(true);
           jButton2.setVisible(true);
            jButton3.setVisible(true);
             jButton4.setVisible(true);
              jButton5.setVisible(true);
               jButton6.setVisible(true);
               jButton19.setVisible(true);
        
        
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
    
       
        if( !(  Bot0.liste.get(0).kullanildiMi2(Bot0.liste.get(0).getKullanim2())&&
               Bot0.liste.get(1).kullanildiMi2(Bot0.liste.get(1).getKullanim2())&&
               Bot0.liste.get(2).kullanildiMi2(Bot0.liste.get(2).getKullanim2())&&
               Bot1.liste.get(0).kullanildiMi2(Bot1.liste.get(0).getKullanim2())&&
               Bot1.liste.get(1).kullanildiMi2(Bot1.liste.get(1).getKullanim2())&&
               Bot1.liste.get(2).kullanildiMi2(Bot1.liste.get(2).getKullanim2())
               )){
            if(o==0 || t>=5){
           sayac++;
           o=1;
           t++;
       
        
                
                        
                                
                               
                
                        
        Random rnd=new Random();
         int z=rnd.nextInt(3);
         while(Bot0.liste.get(z).kullanildiMi2(Bot0.liste.get(z).getKullanim2())){
             z=rnd.nextInt(3);
         }
          x=rnd.nextInt(3);
         while(Bot1.liste.get(x).kullanildiMi2(Bot1.liste.get(x).getKullanim2())){
             x=rnd.nextInt(3);
         }
         
         if(Bot0.liste.get(z).getDamage()>Bot1.liste.get(x).getDamage()){
             Bot0.setSkor();
         }
         else if(Bot0.liste.get(z).getDamage()==Bot1.liste.get(x).getDamage()){
             
         }
         else{
             Bot1.setSkor();
         }
         Bot0.SkorGoster();
         Bot1.SkorGoster();
         if(z==0){
             jButton1.setVisible(false);
         }
         if(z==1){
             jButton2.setVisible(false);
         }
         if(z==2){
             jButton3.setVisible(false);
         }
         if(x==0){
             jButton4.setVisible(false);
         }
         if(x==1){
             jButton5.setVisible(false);
         }
         if(x==2){
             jButton6.setVisible(false);
         }
         
        Bot0.liste.get(z).setKullanim2();
         Bot1.liste.get(x).setKullanim2();
        
        jButton17.setIcon(new javax.swing.ImageIcon(Bot1.liste.get(x).getDosyayolu()));
        jButton18.setIcon(new javax.swing.ImageIcon(Bot0.liste.get(z).getDosyayolu()));
        jButton17.setVisible(true);
        jButton18.setVisible(true);
        
        if(sayac>=5){
            jButton23.setVisible(true);
        }
            }
       }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
      
        if(Bot0.getSkor()>Bot1.getSkor()){
            System.out.println("Bot 0kazandı");
            JOptionPane.showMessageDialog(this,"Bot0 ın skoru: "+Bot0.getSkor()+"\nBot1 in skoru: "+Bot1.getSkor()+"\nKazanan ==> Bot0");
        }
        else if(Bot0.getSkor()==Bot1.getSkor()){
            System.out.println("Berabere");
            JOptionPane.showMessageDialog(this,"Bot0 ın skoru: "+Bot0.getSkor()+"\nBot1 in skoru: "+Bot1.getSkor()+"\nBerabere");
        }
        else{
            System.out.println("Bot2 kazandı");
            JOptionPane.showMessageDialog(this,"Bot0ın skoru: "+Bot0.getSkor()+"\nBot1 in skoru: "+Bot1.getSkor()+"\nKazanan ==> Bot1 ");
        }
        exit(0);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public  void main(String args[]) {
        
            
            
            
            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFbvsb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton10;
    public javax.swing.JButton jButton11;
    public javax.swing.JButton jButton12;
    public javax.swing.JButton jButton13;
    public javax.swing.JButton jButton14;
    public javax.swing.JButton jButton15;
    public javax.swing.JButton jButton16;
    public javax.swing.JButton jButton17;
    public javax.swing.JButton jButton18;
    public javax.swing.JButton jButton19;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton20;
    public javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    public javax.swing.JButton jButton23;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    public javax.swing.JButton jButton9;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
