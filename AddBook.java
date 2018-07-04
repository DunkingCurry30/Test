package bookmanager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AddBook {
	public AddBook(JFrame frame)
	{
		frame.setTitle("增加图书");
		
		JPanel panel = new JPanel();
		
		frame.add(panel);
		
		placeFrame(panel);
		
		frame.setVisible(true);
		
	}
	
	private void placeFrame(JPanel panel)
	{
		JLabel name = new JLabel("请输入图书名称：");
		name.setBounds(50,120,80,25);
		panel.add(name);
		JTextField nameText = new JTextField(18);
		nameText.setBounds(90,120,165,25);
        panel.add(nameText);
        
        JLabel author = new JLabel("请输入作者名称：");
		author.setBounds(50,150,80,25);
		panel.add(author);
		JTextField authorText = new JTextField(18);
		authorText.setBounds(90,150,165,25);
        panel.add(authorText);
        
        JLabel publisher = new JLabel("请输入出版社名称：");
		publisher.setBounds(50,180,80,25);
		panel.add(publisher);
		JTextField publisherText = new JTextField(18);
		publisherText.setBounds(90,180,165,25);
        panel.add(publisherText);
        
        JLabel cate = new JLabel("请输入图书种类：");
		cate.setBounds(50,210,80,25);
		panel.add(cate);
		JTextField cateText = new JTextField(18);
		cateText.setBounds(90,210,165,25);
        panel.add(cateText);
        
        JLabel price = new JLabel("请输入图书价格：");
		price.setBounds(50,120,80,25);
		panel.add(price);
		JTextField priceText = new JTextField(18);
		priceText.setBounds(90,240,165,25);
        panel.add(priceText);
//        信息提示
        JLabel info = new JLabel();
        info.setBounds(150,320,80,25);
        panel.add(info);
        
        JButton sure = new JButton("确认");
        panel.add(sure);
        sure.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		if(e.getSource() == sure)
        		{
					String bookname = nameText.getText();
					String author = authorText.getText();
					String publisher = publisherText.getText();
					String category = cateText.getText();
					String price = priceText.getText();
					model.Book book = new model.Book(bookname ,author ,publisher ,category ,price);

					info.setText("添加成功");
					panel.setVisible(false);
        		}
        	}
        });
        
      
	}

}
