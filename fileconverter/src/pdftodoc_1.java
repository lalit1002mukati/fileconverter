
//import javax.swing.text.Document;
//import com.adobe.acrobat.PDFDocument;
//import com.adobe.acrobat.PDFDocument;
import java.io.IOException;
// import org.apache.poi.hwpf.usermodel.Paragraph;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xwpf.usermodel.BreakType;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;
import java.io.*;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.util.*;
import java.io.File;
import java.io.FileOutputStream;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.Paragraph;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
//import com.itextpdf.text.List;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ByteBuffer;
//import com.itextpdf.text.pdf.PdfDocument;
//import com.lowagie.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.nio.MappedByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import javax.imageio.ImageIO;
//import org.apache.pdfbox.PDFToImage;
import com.sun.pdfview.PDFFile;
import com.sun.pdfview.PDFPage;
import java.awt.Frame;
import java.awt.Graphics;
//import java.awt.List.*;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import static org.apache.poi.hssf.usermodel.HeaderFooter.file;

        
        

//import com.lowagie.text.Document;
//import com.lowagie.text.DocumentException;
//import com.lowagie.text.Paragraph;
//import com.lowagie.text.pdf.PdfWriter;








public class pdftodoc_1 extends javax.swing.JFrame {

   int i=0,num=0;  String s1,s2;
   String path;File selectedFile;
   
  /* 
   public static void texttopdf(){ }
   
    public static void pdftotext(){ }
   
     public static void pdftodoc(){}
     
     public static void doctopdf(){}
     
     public static void invalidselect(){}
   */  
   
    public pdftodoc_1() {
       initComponents();
        
        
        jb.setVisible(true);
        
        
        
        
        
        
        
/*         
//jb=new JProgressBar(0,2000);    
//jb.setBounds(40,40,160,30);         
jb.setValue(0);    
jb.setStringPainted(true);    
add(jb);    
setSize(250,150);    
setLayout(null); 

    }

    public void iterate(){    
while(i<=5000){    
  jb.setValue(i);    
  i=i+20;    
  try{
      Thread.sleep(5000);
 
  
  
  }catch(Exception e){}    
}    
    */
    
   
   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jb = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("File Converter");
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "pdf", "doc", "text", "jpg", "png" }));
        jComboBox1.setBorder(new javax.swing.border.MatteBorder(null));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "doc", "pdf", "text", "jpg", "png" }));
        jComboBox2.setBorder(new javax.swing.border.MatteBorder(null));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jb.setBackground(new java.awt.Color(51, 51, 255));

        jButton1.setText("Converter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("STOP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));

        jButton3.setText("Save file");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));

        jFileChooser1.setCurrentDirectory(new java.io.File("C:\\Users\\niral\\Desktop"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("DOC","docx","doc");
        FileNameExtensionFilter filter1 = new FileNameExtensionFilter("PDF","pdf");
        FileNameExtensionFilter filter2 = new FileNameExtensionFilter("PNG","png");
        FileNameExtensionFilter filter3 = new FileNameExtensionFilter("JPG","jpg");
        FileNameExtensionFilter filter4 = new FileNameExtensionFilter("TEXT","txt");
        jFileChooser1.setFileFilter(filter);
        jFileChooser1.setFileFilter(filter1);
        jFileChooser1.setFileFilter(filter2);
        jFileChooser1.setFileFilter(filter3);
        jFileChooser1.setFileFilter(filter4);
        jFileChooser1.setMultiSelectionEnabled(false);
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenu3.setText("jMenu3");
        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, 89, Short.MAX_VALUE))
                                .addGap(110, 110, 110)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(792, 792, 792)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
       //jButton2.setEnabled(false);
      jFileChooser1.setVisible(true);
        
        
        jButton1.setEnabled(true);
    //jb.setVisible(true); 
        
    jComboBox1.setVisible(true);
    jComboBox2.setVisible(true);
    
      
            
  repaint();
  File file = jFileChooser1.getSelectedFile();
  if(file!=null){
   if((s1=="text" && s2=="pdf") || (s1=="pdf" && s2=="text")|| (s1=="pdf" && s2=="doc" ) || (s1=="doc" && s2=="pdf") || (s1=="jpg" && s2=="pdf") || (s1=="png" && s2=="pdf") || (s1=="pdf" && s2=="jpg") || (s1=="pdf" && s2=="png") ){
   
   
   ////////////////////////////////
   
  if(s1=="text" && s2=="pdf"){
          
       for(int i=0;i<=100;i++){
          jb.setValue(i);
         // jProgressBar1.setIndeterminate(false);              
          try{
              jb.paintImmediately(0,0,1000,1000);//0, 1, 100, 10
          Thread.sleep(100);
          jb.setStringPainted(true);

     }catch(Exception e){}
        
   } 
      
      
      
      
      
      
      BufferedReader br = null;
      System.out.println("convert file text to pdf");
       //File file = null;
  
      try {
//File file = jFileChooser1.getSelectedFile();

        Document pdfDoc = new Document(PageSize.A4);
         //File output = new File("/Users/niral/Desktop/test.pdf");
        String output_file = file.getName().replace(".txt", ".pdf");
        
        System.out.println("## writing to: " + output_file);
        PdfWriter.getInstance(pdfDoc, new FileOutputStream(output_file)).setPdfVersion(PdfWriter.VERSION_1_7);;

        pdfDoc.open();

        Font myfont = new Font();
        myfont.setStyle(Font.NORMAL);
        myfont.setSize(11);

        pdfDoc.add(new Paragraph("\n"));

        if (file.exists()) {

            br = new BufferedReader(new FileReader(file));
            String strLine;

            while ((strLine = br.readLine()) != null) {
                Paragraph para = new Paragraph(strLine + "\n", myfont);
                para.setAlignment(Element.ALIGN_JUSTIFIED);
                pdfDoc.add(para);
            }
        } else {
            System.out.println("no such file exists!");
            //return false;
        }
        pdfDoc.close();
    }

    catch (Exception e) {
        e.printStackTrace();
    } 

    
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
       
        
        
         jLabel2.setText("completed...");
        
   }
  //////////////////////////////////////////////////
   
   if(s1=="pdf" && s2=="text"){
   
       
        for(int i=0;i<=100;i++){
          jb.setValue(i);
         // jProgressBar1.setIndeterminate(false);              
          try{
              jb.paintImmediately(0,0,1000,1000);//0, 1, 100, 10
          Thread.sleep(100);
          jb.setStringPainted(true);

     }catch(Exception e){}
        
   } 
       
       
       
       
       
       
       
       
       
   System.out.println("convert file pdf to text");
   
   
     PDDocument pd;
        BufferedWriter wr;
        try {
            File input = jFileChooser1.getSelectedFile();  // The PDF file from where you would like to extract
            File output = new File("/Users/niral/Desktop/test.txt"); // The text file where you are going to store the extracted data
            pd = PDDocument.load(input);
            System.out.println(pd.getNumberOfPages());
            System.out.println(pd.isEncrypted());
            pd.save("CopyOfInvoice.pdf"); // Creates a copy called "CopyOfInvoice.pdf"
            PDFTextStripper stripper = new PDFTextStripper();
            wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output)));
            stripper.writeText(pd, wr);
            if (pd != null) {
                pd.close();
            }
            // I use close() to flush the stream.
            wr.close();
        } 
        catch (Exception e){
            e.printStackTrace();
        } 
     
    //    pdftotext();
   jLabel2.setText("completed...");
   
   
   }
   //////////////////////////////////////////
   
   if(s1=="pdf" && s2=="doc"){
       
       
       
        for(int i=0;i<=100;i++){
          jb.setValue(i);
         // jProgressBar1.setIndeterminate(false);              
          try{
              jb.paintImmediately(0,0,1000,1000);//0, 1, 100, 10
          Thread.sleep(100);
          jb.setStringPainted(true);

     }catch(Exception e){}
        
   } 
   
   System.out.println("convert file pdf to doc");
   
             // pdftodoc();
  
    try{
   
   XWPFDocument doc = new XWPFDocument();
        String pdf = selectedFile.getAbsolutePath();
        PdfReader reader = new PdfReader(pdf);
        PdfReaderContentParser parser = new PdfReaderContentParser(reader);
        for (int i = 1; i <= reader.getNumberOfPages(); i++) {
            TextExtractionStrategy strategy = parser.processContent(i,new SimpleTextExtractionStrategy());
            String text = strategy.getResultantText();
            XWPFParagraph p = doc.createParagraph();
            XWPFRun run = p.createRun();
            run.setText(text);
            run.addBreak(BreakType.PAGE);
        }
        FileOutputStream out = new FileOutputStream("/Users/niral/Desktop/Ashish_Latest.docx");
        doc.write(out);
        out.close();
        reader.close();
        System.out.println("Document converted successfully");
   
   }catch(Exception e){
       
        System.out.println("exception");
   
   }
  
   jLabel2.setText("completed...");
   
   }
   ////////////////////////////////////////////////
   
   if(s1=="doc" && s2=="pdf"){
        for(int i=0;i<=100;i++){
          jb.setValue(i);
         // jProgressBar1.setIndeterminate(false);              
          try{
              jb.paintImmediately(0,0,1000,1000);//0, 1, 100, 10
          Thread.sleep(100);
          jb.setStringPainted(true);

     }catch(Exception e){}
        
   } 
       
       
       
       
       
       
       
       
   
   System.out.println("convert file doc to pdf");
   POIFSFileSystem fs = null;  
   
        Document document = new Document();

         try {  
             System.out.println("Starting the test"); 
             File input = jFileChooser1.getSelectedFile(); 
             fs = new POIFSFileSystem(new FileInputStream(input));  

             HWPFDocument doc = new HWPFDocument(fs);  
             WordExtractor we = new WordExtractor(doc);  

             OutputStream filee = new FileOutputStream(new File("/Users/niral/Desktop/test.pdf")); 

             
             PdfWriter writer = PdfWriter.getInstance(document, filee);  

             Range range = doc.getRange();
             document.open();  
             writer.setPageEmpty(true);  
             document.newPage();  
             writer.setPageEmpty(true);  

             String[] paragraphs = we.getParagraphText();  
             for (int i = 0; i < paragraphs.length; i++) {  

                 org.apache.poi.hwpf.usermodel.Paragraph pr = range.getParagraph(i);
                 paragraphs[i] = paragraphs[i].replaceAll("\\cM?\r?\n", "");  
                 //System.out.println("Length:" + paragraphs[i].length());  
                // System.out.println("Paragraph" + i + ": " + paragraphs[i].toString());  
                 // add the paragraph to the document  
                 document.add(new Paragraph(paragraphs[i]));  
             }  

             //System.out.println("Document testing completed");  
         } catch (Exception e) {  
             System.out.println("Exception during test");  
             e.printStackTrace();  
         } finally {  
             // close the document  
             document.close();  
         }  
     
 
   
   
   
   
   
   
   
   
   jLabel2.setText("completed...");
   }
   ////////////////////////////
   
   
   
   
    if(s1=="jpg" && s2=="pdf"){
    
         for(int i=0;i<=100;i++){
          jb.setValue(i);
         // jProgressBar1.setIndeterminate(false);              
          try{
              jb.paintImmediately(0,0,1000,1000);//0, 1, 100, 10
          Thread.sleep(100);
          jb.setStringPainted(true);

     }catch(Exception e){}
        
   } 
        
        
        
        
        
        
        
        
        
        
        
        
    System.out.println("covert image to pdf");
    File Files = jFileChooser1.getSelectedFile();
 System.out.println("Please wait...");
               //for( int i=0;i<Files.length;i++){     
                //convertJPGToPDF(Files[i].toString(),"pdfimage"+i+".pdf");
               // }
    
    
    
    String strimg;String desc;
    
    //public static void convertJPGToPDF(String strimg,String desc){
 try{
  //create document object
  Document doc=new Document();
  //create pdf writer object to write the document to the output file
  PdfWriter.getInstance(doc,new FileOutputStream("/Users/niral/Desktop/capture.pdf"));
  //get a4 paper size
  Rectangle r=PageSize.A4;
  //read the image
  BufferedImage orImg=ImageIO.read(Files);
  //initialize image width and height
  int width=orImg.getWidth();
  int height=orImg.getHeight();
  //resize the image that is bigger than A4 size
  if(width>r.getWidth())
   width=(int)r.getWidth();
  if(height>r.getHeight())
   height=(int)r.getHeight();  
  //create a blank buffered image
  BufferedImage bi=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
  //create graphic2d object from the buffered image
  Graphics2D g2d=bi.createGraphics();
  //draw the original image on the buffered image
  //so the image is resized to fit the A4 paper size if it is bigger than A4 size
  g2d.drawImage(orImg, 0,0,width,height,null);
  //store the image data in memory
  ByteArrayOutputStream bas=new ByteArrayOutputStream();
  ImageIO.write(bi, "png", bas);
  //create image from the image data stored in memory
  Image img=Image.getInstance(bas.toByteArray());
  //centrally align the image on the pdf page
  img.setAlignment(Element.ALIGN_CENTER);
  //open document
  doc.open();
//add image to the document
  doc.add(img);
  //close the document
  doc.close();
  
  
  }catch(Exception e){e.printStackTrace();}
 


 

    
    
    
    
    jLabel2.setText("completed...");
    
    
    
    
    
    
    }
    if(s1=="png" && s2=="pdf"){
        
         for(int i=0;i<=100;i++){
          jb.setValue(i);
         // jProgressBar1.setIndeterminate(false);              
          try{
              jb.paintImmediately(0,0,1000,1000);//0, 1, 100, 10
          Thread.sleep(100);
          jb.setStringPainted(true);

     }catch(Exception e){}
        
   } 
        
        
        
        
    
    System.out.println("covert image to pdf");
    File Files = jFileChooser1.getSelectedFile();
 System.out.println("Please wait...");
               //for( int i=0;i<Files.length;i++){     
                //convertJPGToPDF(Files[i].toString(),"pdfimage"+i+".pdf");
               // }
    
    
    
    String strimg;String desc;
    
    //public static void convertJPGToPDF(String strimg,String desc){
 try{
  //create document object
  Document doc=new Document();
  //create pdf writer object to write the document to the output file
  
  PdfWriter.getInstance(doc,new FileOutputStream("/Users/niral/Desktop/capture.pdf"));
  //get a4 paper size
  Rectangle r=PageSize.A4;
  //read the image
  BufferedImage orImg=ImageIO.read(Files);
  //initialize image width and height
  int width=orImg.getWidth();
  int height=orImg.getHeight();
  //resize the image that is bigger than A4 size
  if(width>r.getWidth())
   width=(int)r.getWidth();
  if(height>r.getHeight())
   height=(int)r.getHeight();  
  //create a blank buffered image
  BufferedImage bi=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
  //create graphic2d object from the buffered image
  Graphics2D g2d=bi.createGraphics();
  //draw the original image on the buffered image
  //so the image is resized to fit the A4 paper size if it is bigger than A4 size
  g2d.drawImage(orImg, 0,0,width,height,null);
  //store the image data in memory
  ByteArrayOutputStream bas=new ByteArrayOutputStream();
  ImageIO.write(bi, "png", bas);
  //create image from the image data stored in memory
  Image img=Image.getInstance(bas.toByteArray());
  //centrally align the image on the pdf page
  img.setAlignment(Element.ALIGN_CENTER);
  //open document
  doc.open();
//add image to the document
  doc.add(img);
  //close the document
  doc.close();
  
  
  }catch(Exception e){e.printStackTrace();}
 


 

    
    
    
    
    jLabel2.setText("completed...");
    
    
    
    
    
    
    }
    if(s1=="pdf" && s2=="jpg"){
        //PDDocument pdd;
          for(int i=0;i<=100;i++){
          jb.setValue(i);
         // jProgressBar1.setIndeterminate(false);              
          try{
              jb.paintImmediately(0,0,1000,1000);//0, 1, 100, 10
          Thread.sleep(100);
          jb.setStringPainted(true);

     }catch(Exception e){}
        
   } 
     
        
         try{
File pdffile = jFileChooser1.getSelectedFile();
        String src=pdffile.toString();
   //load pdf file in the document object
   PDDocument doc=PDDocument.load(new FileInputStream(src));
   //Get all pages from document and store them in a list
   List<PDPage> pages=doc.getDocumentCatalog().getAllPages();
   //create iterator object so it is easy to access each page from the list
   Iterator<PDPage> i= pages.iterator();
   int count=1; //count variable used to separate each image file
   //Convert every page of the pdf document to a unique image file
   System.out.println("Please wait...");
   while(i.hasNext()){
    PDPage page=i.next(); 
    BufferedImage bi=page.convertToImage();
    ImageIO.write(bi, "jpg", new File("/Users/niral/Desktop/"+count+".jpg"));
    count++;
    }
   System.out.println("Conversion complete");
   }catch(IOException ie){ie.printStackTrace();}
  
 
        
        
        
        
        
        
        
        
        
        
     jLabel2.setText("completed...");
    
    }
    if(s1=="pdf" && s2=="png"){
        //PDDocument pdd;
          for(int i=0;i<=100;i++){
          jb.setValue(i);
         // jProgressBar1.setIndeterminate(false);              
          try{
              jb.paintImmediately(0,0,1000,1000);//0, 1, 100, 10
          Thread.sleep(100);
          jb.setStringPainted(true);

     }catch(Exception e){}
        
   } 
     
        
         try{
File pdffile = jFileChooser1.getSelectedFile();
        String src=pdffile.toString();
   //load pdf file in the document object
   PDDocument doc=PDDocument.load(new FileInputStream(src));
   //Get all pages from document and store them in a list
   List<PDPage> pages=doc.getDocumentCatalog().getAllPages();
   //create iterator object so it is easy to access each page from the list
   Iterator<PDPage> i= pages.iterator();
   int count=1; //count variable used to separate each image file
   //Convert every page of the pdf document to a unique image file
   System.out.println("Please wait...");
   while(i.hasNext()){
    PDPage page=i.next(); 
    BufferedImage bi=page.convertToImage();
    ImageIO.write(bi, "png", new File("/Users/niral/Desktop/"+count+".png"));
    count++;
    }
   System.out.println("Conversion complete");
   }catch(IOException ie){ie.printStackTrace();}
  
 
        
        
        
        
        
        
        
        
        
        
     jLabel2.setText("completed...");
    
    }
    
   
    
   }
   
   
   
   else{
   
   
   System.out.println("invalid selestion");
   
    jLabel3.setText("invalid file selection...");
  // invalidselect();
   }
   
   
   
  }
  else{
  
   System.out.println("no file selection");
   
    jLabel3.setText("no file selection...");
  
  
  }
       
           
   
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        
         s1=String.valueOf(jComboBox1.getSelectedItem());
        
        
        System.out.println(s1);
        
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        
        
         
         s2=String.valueOf(jComboBox2.getSelectedItem());
        
        
        System.out.println(s2);
    
        
        
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       if(evt.getActionCommand().equals("STOP")){
       
       jButton1.setEnabled(true);
       //jb.setEnabled(true);
       jLabel2.setVisible(false);
         jLabel3.setVisible(false);
       //JFrame.getFrames();
         
       }
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
        jButton3.setEnabled(true);
        jButton1.setVisible(true);
        jFileChooser1.setVisible(true);
        
 
      		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Specify a file to save");
//fileChooser.showSaveDialog(null);
	
        		int userSelection = fileChooser.showSaveDialog(this);
		if (userSelection == JFileChooser.APPROVE_OPTION) {
			File filee = fileChooser.getSelectedFile();
                        
                       
                }
        			
        
        
        
        
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // TODO add your handling code here:
        
        
        jFileChooser1.setCurrentDirectory(new File(System.getProperty("user.home")));
//int result = jFileChooser1;
//if (result == JFileChooser.APPROVE_OPTION) {
    File selectedFile = jFileChooser1.getSelectedFile();
  
     //label.setText(selectedFile.getAbsolutePath());
    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
    //String path=selectedFile.getAbsolutePath();
   jLabel1.setText("File:" + selectedFile.getAbsolutePath());
    
    
//}
        
        
        
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws IOException {
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
            java.util.logging.Logger.getLogger(pdftodoc_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pdftodoc_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pdftodoc_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pdftodoc_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
  /*pdftodoc m=new pdftodoc();    
    m.setVisible(true);    
    m.iterate();  
    */    
  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
              
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pdftodoc_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JProgressBar jb;
    // End of variables declaration//GEN-END:variables
}
