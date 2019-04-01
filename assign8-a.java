import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
/* <APPLET CODE ="assign8-a" WIDTH=300 HEIGHT=200> </APPLET> */ 
public class assign8-a extends Applet implements ActionListener 
  { 
      TextArea txt; 
      Button b1, b2, b3; 
      int countv = 0, countc = 0, countp = 0;
      String s1,s2; 
      Label l1,l2,l3; 
      TextField t1,t2,t3; 
        public void init() 
            { 
                Color custom = new Color(204, 229, 255);
                Color custom2 = new Color(255, 178, 102);
                setBackground(custom);
                txt = new TextArea(5,30); 
                add(txt); 
                s1=""; 
                txt.append(s1);
                l1=new Label("No. of vowels"); 
                add(l1);

                t1=new TextField(10); 
                add(t1); 

                b1=new Button("Count"); 
                b1.setBackground(custom2);
                add(b1); 

                l2=new Label("No. of consonants"); 
                
                add(l2); 
                t2=new TextField(10); 
                add(t2); 

                b2=new Button("Count"); 
                b2.setBackground(custom2);
                add(b2); 

                l3=new Label("No. of punctuations"); 
                add(l3); 
                t3=new TextField(10); 
                add(t3); 
                b3=new Button("Count"); 
                b3.setBackground(custom2);
                add(b3); 
                b1.addActionListener(this); 
                b2.addActionListener(this);
                b3.addActionListener(this);
             }     
                public void actionPerformed(ActionEvent e) 
                   { 
                    s2 = txt.getText();
                    s2 = s2.toLowerCase(); 
                    countv = 0; countc = 0; countp = 0;

                          
                    for(int i = 0; i<s2.length(); ++i)
                    {
                      if(s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u')
                      {
                          countv++;
                      }

                      else if(s2.charAt(i)>'a' && s2.charAt(i)<='z')
                      {
                          countc++;
                      }
                      else if(s2.charAt(i)=='.'|| s2.charAt(i)==',' || s2.charAt(i)=='?' || s2.charAt(i)=='!' || s2.charAt(i)=='"' || s2.charAt(i)==';' || s2.charAt(i)==':' )
                      {
                          countp++;
                      }
                    }
                     if(e.getSource()==b1) 
                        { 
                          
                          t1.setText(Integer.toString(countv));
                          
                       } 
                       if(e.getSource()==b2) 
                        { 
                          
                          
                          t2.setText(Integer.toString(countc));
                          
                       } 
                       if(e.getSource()==b3) 
                        { 
                          
                          
                          t3.setText(Integer.toString(countp));
                       } 
                    } 
   } 
