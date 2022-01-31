import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class CalDemo implements ActionListener
{
    JFrame f;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,div,mul,sub,add,dec,equ,del,clr;

    static double a=0,b=0,result=0;
    static int operator=0;

    CalDemo()
    {
        f=new JFrame("Calculator");
        t=new JTextField();
        t.setBackground(Color.pink);
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        div=new JButton("/");
        mul=new JButton("*");
        sub=new JButton("-");
        add=new JButton("+");
        dec=new JButton(".");
        equ=new JButton("=");
        del=new JButton("Delete");
        clr=new JButton("Clears");
        t.setBounds(30,40,270,50);
        b7.setBounds(30,100,60,40);
        b8.setBounds(100,100,60,40);
        b9.setBounds(170,100,60,40);
        div.setBounds(240,100,60,40);
        b4.setBounds(30,170,60,40);
        b5.setBounds(100,170,60,40);
        b6.setBounds(170,170,60,40);
        mul.setBounds(240,170,60,40);
        b1.setBounds(30,240,60,40);
        b2.setBounds(100,240,60,40);
        b3.setBounds(170,240,60,40);
        sub.setBounds(240,240,60,40);
        dec.setBounds(30,310,60,40);
        b0.setBounds(100,310,60,40);
        equ.setBounds(170,310,60,40);
        add.setBounds(240,310,60,40);
        del.setBounds(60,380,100,40);
        clr.setBounds(180,380,100,40);
        f.add(t);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(div);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(mul);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(sub);
        f.add(dec);
        f.add(b0);
        f.add(equ);
        f.add(add);
        f.add(del);
        f.add(clr);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        add.addActionListener(this);
        div.addActionListener(this);
        mul.addActionListener(this);
        sub.addActionListener(this);
        dec.addActionListener(this);
        equ.addActionListener(this);
        del.addActionListener(this);
        clr.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == b1)
                t.setText(t.getText().concat("1"));
            if (e.getSource() == b2)
                t.setText(t.getText().concat("2"));
            if (e.getSource() == b3)
                t.setText(t.getText().concat("3"));
            if (e.getSource() == b4)
                t.setText(t.getText().concat("4"));
            if (e.getSource() == b5)
                t.setText(t.getText().concat("5"));
            if (e.getSource() == b6)
                t.setText(t.getText().concat("6"));
            if (e.getSource() == b7)
                t.setText(t.getText().concat("7"));
            if (e.getSource() == b8)
                t.setText(t.getText().concat("8"));
            if (e.getSource() == b9)
                t.setText(t.getText().concat("9"));
            if (e.getSource() == b0)
                t.setText(t.getText().concat("0"));
            if (e.getSource() == dec)
                t.setText(t.getText().concat("."));
            if (e.getSource() == add) {
                a = Double.parseDouble(t.getText());
                operator = 1;
                t.setText("");
            }
            if (e.getSource() == sub) {
                a = Double.parseDouble(t.getText());
                operator = 2;
                t.setText("");
            }
            if (e.getSource() == mul) {
                a = Double.parseDouble(t.getText());
                operator = 3;
                t.setText("");
            }
            if (e.getSource() == div) {
                a = Double.parseDouble(t.getText());
                operator = 4;
                t.setText("");
            }
            if (e.getSource() == equ) {
                b = Double.parseDouble(t.getText());
                switch (operator) {
                    case 1:
                        result = a + b;
                        break;
                    case 2:
                        result = a - b;
                        break;
                    case 3:
                        result = a * b;
                        break;
                    case 4:
                        result = a / b;
                        break;
                    default:
                        result = 0;
                }
                t.setText("" + result);
            }
            if (e.getSource() == clr)
                t.setText("");
            if (e.getSource() == del) {
                String s = t.getText();
                t.setText("");
                for (int i = 0; i < s.length() - 1; i++)
                    t.setText(t.getText() + s.charAt(i));
            }
        } catch (Exception e1) {
            System.out.println(e1.getMessage());

        }
    }

    public static void main(String...s)
    {
        new CalDemo();
    }
}