import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
 public class exam  extends JFrame implements ActionListener
 {
    int i, count=0,current=0,x=1,y=1,now=0;
     JButton b=new JButton("Next");
     ButtonGroup bg=new ButtonGroup();
     JRadioButton r[]=new JRadioButton[5];
     JFrame f=new JFrame("Online Exam");
     JLabel l=new JLabel();

    exam(String s)
    {
       
        f.setSize(500,500);
        l.setFont(new Font("Times New Roman",Font.PLAIN,30));
        l.setBounds(400,100,1000,300);
        f.add(l);  
       
        for(i=0;i<5;i++)
        {
            r[i]=new JRadioButton();
            f.add(r[i]);
            bg.add(r[i]);
        }
        r[0].setBounds(400,300,100,20);
        r[0].setFont(new Font("Calibiri",Font.PLAIN,20));
        r[1].setBounds(400,350,100,20);
        r[1].setFont(new Font("Calibiri",Font.PLAIN,20));
        r[2].setBounds(400,400,100,20);
        r[2].setFont(new Font("Calibiri",Font.PLAIN,20));
        r[3].setBounds(400,450,100,20);
        r[3].setFont(new Font("Calibiri",Font.PLAIN,20));
        
       
        b.setFont(new Font("Algerian",Font.PLAIN,20));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        b.setBounds(600,500,150,60);
        b.addActionListener(this);
        f.add(b);
        question();
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(600,350);  
}

public void actionPerformed(ActionEvent e)  
{  
    if(e.getSource()==b)  
    {  
        if(check())  
            count=count+1;  
        current++;  
        question();    
        if(current==9)  
        {    
            b.setText("Result");  
        }  
    }  

    if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                count=count+1;  
            current++;  
            //System.out.println("correct ans="+count);  
            JOptionPane.showMessageDialog(this,"correct ans="+count);  
            System.exit(0);  
        }  
    }

 void question()
    {
        r[4].setSelected(true);
        if(current==0)
        {
            l.setText("Que1:Murty is ____ old friend of mine. ");
            r[0].setText("a");
            r[1].setText("an");
            r[2].setText("the");
            r[3].setText("x");
        }
        if(current==1)
        {
            l.setText("Que2:I had ___ weirdest day yesterday. ");
            r[0].setText("an");
            r[1].setText("a");
            r[2].setText("x");
            r[3].setText("the");
        }
        if(current==2)
        {
            l.setText("Que3:I spoke to ____ teacher yesterday after class. ");
            r[0].setText("the");
            r[1].setText("a");
            r[2].setText("x");
            r[3].setText("an");
        }
        if(current==3)
        {
            l.setText("Que4:There is ____ storm coming soon this way.");
            r[0].setText("x");
            r[1].setText("a");
            r[2].setText("an");
            r[3].setText("the");
        }
        if(current==4)
        {
            l.setText("Que5:___ baby gorilla sleeps on its mothers lap all day. ");
            r[0].setText("the");
            r[1].setText("x");
            r[2].setText("a");
            r[3].setText("an");
        }
        if(current==5)
        {
            l.setText("Que6:India is ____ South Asian country. ");
            r[0].setText("the");
            r[1].setText("an");
            r[2].setText("a");
            r[3].setText("x");
        }
        if(current==6)
        {
            l.setText("Que7:Samar might be poor, but he is ___ honest man. ");
            r[0].setText("x");
            r[1].setText("a");
            r[2].setText("the");
            r[3].setText("an");
        }
        if(current==7)
        {
            l.setText("Que8:Paris is one of ____ most beautiful cities in the world.");
            r[0].setText("a");
            r[1].setText("the");
            r[2].setText("x");
            r[3].setText("an");
        }
        if(current==8)
        {
            l.setText("Que9:The teacher asked me ___ question that I could not answer.");
            r[0].setText("x");
            r[1].setText("the");
            r[2].setText("an");
            r[3].setText("a");
        }
        if(current==9)
        {
            l.setText("Que10:The man who was injured in ____ accident was my uncle. ");
            r[0].setText("a");
            r[1].setText("an");
            r[2].setText("x");
            r[3].setText("the");
        }
        }
        Boolean check()
        {
            if(current==0)
                return(r[1].isSelected());//correct answer ka index fill krna h
            if(current==1)
                return(r[3].isSelected());
            if(current==2)
                return(r[0].isSelected());
            if(current==3)
                return(r[1].isSelected());
            if(current==4)
                return(r[0].isSelected());
            if(current==5)
                return(r[2].isSelected());
            if(current==6)
                return(r[3].isSelected());
            if(current==7)
                return(r[1].isSelected());
            if(current==8)
                return(r[3].isSelected());
            if(current==9)
                return(r[3].isSelected());
            return false;
        }
    

        public static void main(String[] args) {
            new exam("hello");
        }

    }