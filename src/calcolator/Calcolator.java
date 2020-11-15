/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author you
 */
public class Calcolator implements ActionListener {

    /**
     * @param args the command line arguments
     */
    private JFrame frame;
    private JPanel txt, btns, equl_decS;
    private JLabel res, txt_real_time;
    private JButton _1, _2, _3, _4, _5, _6, _7, _8, _9, _0, _c, _x, add, sub, mltii, div, equl, decS;
    private char lst_op = 'n';
    private StringBuilder st = new StringBuilder("");
//    private 
    private String data = "";
    private int cnt_opr = 0;

    public Calcolator() {
        frame = new JFrame();
        frame.setTitle("Calcolator");
        frame.setBounds(400, 150, 500, 550);

        txt = new JPanel();
        txt.setBounds(0, 0, 500, 100);
        txt.setBackground(Color.yellow);
        txt.setLayout(null);
        res = new JLabel();
        res.setFont(new Font("", Font.BOLD, 30));
        res.setBounds(0, 0, 500, 30);
        txt.add(res);
        txt_real_time = new JLabel();
        txt_real_time.setFont(new Font("", Font.BOLD, 20));
        txt_real_time.setBounds(0, 30, 500, 70);
        txt_real_time.setBackground(Color.red);
        txt_real_time.setOpaque(true);
        txt.add(txt_real_time);

        btns = new JPanel();
        btns.setLayout(new GridLayout(4, 4));
        btns.setLocation(0, 110);
        btns.setSize(500, 350);
        _1 = new JButton("1");
        _1.addActionListener(this);
        btns.add(_1);
        _2 = new JButton("2");
        _2.addActionListener(this);
        btns.add(_2);
        _3 = new JButton("3");
        btns.add(_3);
        _3.addActionListener(this);
        _4 = new JButton("4");
        btns.add(_4);
        _4.addActionListener(this);
        _5 = new JButton("5");
        btns.add(_5);
        _5.addActionListener(this);
        _6 = new JButton("6");
        btns.add(_6);
        _6.addActionListener(this);
        _7 = new JButton("7");
        btns.add(_7);
        _7.addActionListener(this);
        _8 = new JButton("8");
        btns.add(_8);
        _8.addActionListener(this);
        _9 = new JButton("9");
        btns.add(_9);
        _9.addActionListener(this);
        _0 = new JButton("0");
        btns.add(_0);
        _0.addActionListener(this);
        add = new JButton("+");
        btns.add(add);
        add.addActionListener(this);
        sub = new JButton("-");
        btns.add(sub);
        sub.addActionListener(this);
        mltii = new JButton("*");
        btns.add(mltii);
        mltii.addActionListener(this);
        div = new JButton("/");
        btns.add(div);
        div.addActionListener(this);
        _c = new JButton("C");
        btns.add(_c);
        _c.addActionListener(this);
        _x = new JButton("X");
        btns.add(_x);
        _x.addActionListener(this);
        equl_decS = new JPanel();
        equl_decS.setLayout(new GridLayout(1, 2));
        equl_decS.setBounds(0, 460, 500, 50);

        equl = new JButton("=");
        equl_decS.add(equl);
        equl.addActionListener(this);
        decS = new JButton(".");
        equl_decS.add(decS);
        decS.addActionListener(this);

        frame.add(equl_decS);
        frame.add(btns);
        frame.add(txt);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        new Calcolator();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == _0) {
            st.append('0');
            res.setText(st.toString());
        }
        if (ae.getSource() == _1) {
            st.append('1');
            res.setText(st.toString());
        }
        if (ae.getSource() == _2) {
            st.append('2');
            res.setText(st.toString());
        }
        if (ae.getSource() == _3) {
            st.append('3');
            res.setText(st.toString());
        }
        if (ae.getSource() == _4) {
            st.append('4');
            res.setText(st.toString());
        }
        if (ae.getSource() == _5) {
            st.append('5');
            res.setText(st.toString());
        }
        if (ae.getSource() == _6) {
            st.append('6');
            res.setText(st.toString());
        }
        if (ae.getSource() == _7) {
            st.append('7');
            res.setText(st.toString());
        }
        if (ae.getSource() == _8) {
            st.append('8');
            res.setText(st.toString());
        }
        if (ae.getSource() == _9) {
            st.append('9');
            res.setText(st.toString());
        }
        if (ae.getSource() == add) {
            lst_op = '+';
            ++cnt_opr;
//            System.out.println('+' - '0');
            st.append('+');
            res.setText(st.toString());
        }
        if (ae.getSource() == sub) {
            lst_op = '-';
            ++cnt_opr;
//            System.out.println('-' - '0');
            st.append('-');
            res.setText(st.toString());
        }
        if (ae.getSource() == div) {
            ++cnt_opr;
            lst_op = '/';
            st.append('/');
//            System.out.println('/' - '0');
            res.setText(st.toString());
        }
        if (ae.getSource() == mltii) {
            ++cnt_opr;
            lst_op = '*';
            st.append('*');
            res.setText(st.toString());
//            System.out.println('*' - '0');
        }
        if (ae.getSource() == _c) {
            st = new StringBuilder("");
            res.setText(st.toString());
            cnt_opr = 0;
        }
        if (ae.getSource() == _x) {
            if (st.length() >= 1) {
                if (st.charAt(st.length() - 1) - '0' < 0) {
                    --cnt_opr;
                }
                st.deleteCharAt(st.length() - 1);
            }
            res.setText(st.toString());
        }
        if (ae.getSource() == decS) {
            st.append('.');
            res.setText(st.toString());
            //System.out.println('.' - '0');
        }
        if (st.length() == 0) {
            lst_op = 'n';
        }
        if (st.length() >= 1 && cnt_opr > 1 && st.charAt(st.length() - 1) - '0' < 0) {
            Stack<String> stack = new Stack<>();
            StringBuilder cur = new StringBuilder();
            for (int i = st.length() - 2; i >= 0; i--) {
                if (st.charAt(i) - '0' < 0) {
                    stack.push(cur.toString());
                    if((st.charAt(i) == '+' || st.charAt(i) == '-') && stack.size() >= 3) {
                        stack = get_res(stack);
                        System.out.println("work");
                    }
                    stack.push(st.charAt(i) + "");
                    cur = new StringBuilder("");
                    continue;
                }
               cur.append(st.charAt(i));
            }
            cur.reverse();
            stack.push(cur.toString());
            stack = get_res(stack);
            System.out.println(stack.peek());
            txt_real_time.setText(stack.peek());
        }
    }
    Stack <String> get_res(Stack <String> stack) {
       Stack <String> tmp = stack; 
       while(tmp.size() > 1) {
           Double cur1 = new Double(tmp.pop());
           String sign = tmp.pop();
           Double cur2 = new Double(tmp.pop());
           
           if(sign.charAt(0) == '+') {
               Double ps = cur1 + cur2;
               tmp.push(ps.toString());
           }
           if(sign.charAt(0) == '-') {
               Double ps = cur1 - cur2;
               tmp.push(ps.toString());
           }
           if(sign.charAt(0) == '*') {
               Double ps = cur1 * cur2;
               tmp.push(ps.toString());
           }
           if(sign.charAt(0) == '/') {
               Double ps = cur1 / cur2;
               tmp.push(ps.toString());
           }
       }
       return tmp;
       
    }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
}
