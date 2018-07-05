package bookmanager;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.Scanner;

import model.Book;

public class MainClass {
	
	int bookNum=0;
	int index = 0;
	@SuppressWarnings("rawtypes")
	ArrayList booklist = new ArrayList();
	private Scanner scan;
	public MainClass() throws IOException
	{	
		while(true)
		{
			System.out.println("欢迎登录图书管理系统！");
			System.out.println("增加图书——————————1");
			System.out.println("删除图书——————————2");
			System.out.println("修改图书信息 ———————3");
			System.out.println("查询图书——————————4");
			System.out.println("打印当前图书 ———————5");
			System.out.println("退出系统——————————0");
			
			scan = new Scanner(System.in);
			int choice = scan.nextInt();
			
			if(choice==0)
			{
				break;
			}
			
			switch(choice)
			{
			case 1:addBook();break;
			case 2:deleteBook();break;
			case 3:changeBook();break;
			case 4:searchBook();break;
			case 5:print();break;
			
			}
		}
		
		
		
	}
	
	

	private void searchBook() {
		// TODO Auto-generated method stub
		System.out.println("请输入要查询的图书名称：");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		
		for(int i = 0 ;i < bookNum; i++)
		{
			Book book = (Book) booklist.get(i);
			if(name.equals(book.getName()))
			{
				System.out.println("书    名: "+book.getName());
				System.out.println("作    者: "+book.getAuthor());
				System.out.println("出版社: "+book.getPublisher());
				System.out.println("种    类: "+book.getCate());
				System.out.println("价    格: "+book.getPrice());
			}
		}
	}



	private void changeBook() {
		// TODO Auto-generated method stub
		System.out.print("请输入要修改信息的图书名称：");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		for( int i = 0; i < bookNum; i++)
		{
			Book book = (Book) booklist.get(i);
			if(name.equals(book.getName()))
			{
				System.out.println("原图书信息如下：");
				System.out.println("书    名: "+book.getName());
				System.out.println("作    者: "+book.getAuthor());
				System.out.println("出版社: "+book.getPublisher());
				System.out.println("种    类: "+book.getCate());
				System.out.println("价    格: "+book.getPrice());
				while(true)
				{
					System.out.println("请输入需要修改的图书内容：");
					System.out.println("书    名——————1");
					System.out.println("作    者——————2");
					System.out.println("出版社——————3");
					System.out.println("种    类——————4");
					System.out.println("价    格——————5");
					System.out.println("取    消——————0");
					int choice = scan.nextInt();
					if(choice==0)
					{
						break;
					}
					switch(choice)
					{
					case 1:changeName(book);break;
					case 2:changeAuthor(book);break;
					case 3:changePublisher(book);break;
					case 4:changeCate(book);break;
					case 5:changePrice(book);break;
					}
				}
			}
		}
	}



	private void changeName(Book book) {
		// TODO Auto-generated method stub
		System.out.print("请输入修改后的信息：");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		book.setName(str);
		System.out.println("修改成功");
	}
	
	private void changeAuthor(Book book) {
		// TODO Auto-generated method stub
		System.out.print("请输入修改后的信息：");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		book.setAuthor(str);
		System.out.println("修改成功");
	}
	
	private void changePublisher(Book book) {
		// TODO Auto-generated method stub
		System.out.print("请输入修改后的信息：");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		book.setPublisher(str);
		System.out.println("修改成功");
	}
	
	private void changePrice(Book book) {
		// TODO Auto-generated method stub
		System.out.print("请输入修改后的信息：");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		book.setPrice(str);
		System.out.println("修改成功");
	}
	
	private void changeCate(Book book) {
		// TODO Auto-generated method stub
		System.out.print("请输入修改后的信息：");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		book.setCate(str);
		System.out.println("修改成功");
	}



	private void print() {
		// TODO Auto-generated method stub
		for(int i = 0 ;i<bookNum ;i++)
		{
			Book book = (Book) booklist.get(i);
			System.out.println((i+1)+":"+book.getName());
		}
	}



	private void deleteBook() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要删除的图书名称：");
		String name = scan.next();
		for(int i = 0; i < bookNum; i++)
		{
			Book book = (Book) booklist.get(i);
			if(name.equals(book.getName()))
			{
				booklist.remove(i);
				bookNum--;
				System.out.print("已删除"+name+"!\n\n");
			}
		}
		
	}



	@SuppressWarnings("unchecked")
	private void addBook() throws IOException {
//		通过控制台输入
		
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.println("请输入图书名称");
//		String bookname = scan.next();
//		System.out.println("请输入图书作者");
//		String author = scan.next();
//		System.out.println("请输入图书出版社");
//		String publisher = scan.next();
//		System.out.println("请输入图书类别");
//		String category = scan.next();
//		System.out.println("请输入图书价格");
//		float price = scan.nextFloat();
		
//		简单读取文件输入
		
		System.out.println("请输入图书文件信息：");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String uri = scan.next();
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(Paths.get(uri));
		String bookname = in.next();
		String author = in.next();
		String publisher = in.next();
		String category = in.next();
		String price = in.next();
		Book book = new Book(bookname ,author ,publisher ,category ,price);
		booklist.add(bookNum, book);
		
		bookNum++;
		System.out.print("添加成功！\n\n");
	}





	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		new MainClass();
	}

}
