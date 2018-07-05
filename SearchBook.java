package bookmanager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2018/3/13 0013.
 */
public class SearchBook {
    public SearchBook(JFrame frame)
    {
        frame.setTitle("查询图书");

        JPanel panel = new JPanel();

        frame.add(panel);

        placeFrame(panel);

        frame.setVisible(true);
    }

    private  void placeFrame(JPanel panel)
    {
        JButton name = new JButton("按名称查找");
        name.setBounds(90,200,100,45);
        panel.add(name);
        name.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == name)
                {
                    JLabel namelabel = new JLabel("请输入图书名称：");
                    panel.add(namelabel);
                    JTextField nametext = new JTextField();
                    nametext.setBounds(100,200,140,45);
                    panel.add(nametext);

                    JButton sure = new JButton("确认");
                    sure.setDefaultCapable(true);
                    panel.add(sure);

                    sure.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (e.getSource() == sure)
                            {
                                JLabel mess = new JLabel("添加成功！");
                                mess.setBounds(100,300,80,25);
                                panel.add(mess);
                            }
                        }
                    });
                }
            }
        });
    }

    public static void main(String[] arg0){
//        JFrame frame = new JFrame("hello");
//        frame.setSize(300,250);
//        frame.setVisible(true);
//        new SearchBook(frame);

    }
}
