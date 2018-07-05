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
			System.out.println("��ӭ��¼ͼ�����ϵͳ��");
			System.out.println("����ͼ�顪������������������1");
			System.out.println("ɾ��ͼ�顪������������������2");
			System.out.println("�޸�ͼ����Ϣ ��������������3");
			System.out.println("��ѯͼ�顪������������������4");
			System.out.println("��ӡ��ǰͼ�� ��������������5");
			System.out.println("�˳�ϵͳ��������������������0");
			
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
		System.out.println("������Ҫ��ѯ��ͼ�����ƣ�");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		
		for(int i = 0 ;i < bookNum; i++)
		{
			Book book = (Book) booklist.get(i);
			if(name.equals(book.getName()))
			{
				System.out.println("��    ��: "+book.getName());
				System.out.println("��    ��: "+book.getAuthor());
				System.out.println("������: "+book.getPublisher());
				System.out.println("��    ��: "+book.getCate());
				System.out.println("��    ��: "+book.getPrice());
			}
		}
	}



	private void changeBook() {
		// TODO Auto-generated method stub
		System.out.print("������Ҫ�޸���Ϣ��ͼ�����ƣ�");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		for( int i = 0; i < bookNum; i++)
		{
			Book book = (Book) booklist.get(i);
			if(name.equals(book.getName()))
			{
				System.out.println("ԭͼ����Ϣ���£�");
				System.out.println("��    ��: "+book.getName());
				System.out.println("��    ��: "+book.getAuthor());
				System.out.println("������: "+book.getPublisher());
				System.out.println("��    ��: "+book.getCate());
				System.out.println("��    ��: "+book.getPrice());
				while(true)
				{
					System.out.println("��������Ҫ�޸ĵ�ͼ�����ݣ�");
					System.out.println("��    ��������������1");
					System.out.println("��    �ߡ�����������2");
					System.out.println("�����硪����������3");
					System.out.println("��    �ࡪ����������4");
					System.out.println("��    �񡪡���������5");
					System.out.println("ȡ    ��������������0");
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
		System.out.print("�������޸ĺ����Ϣ��");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		book.setName(str);
		System.out.println("�޸ĳɹ�");
	}
	
	private void changeAuthor(Book book) {
		// TODO Auto-generated method stub
		System.out.print("�������޸ĺ����Ϣ��");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		book.setAuthor(str);
		System.out.println("�޸ĳɹ�");
	}
	
	private void changePublisher(Book book) {
		// TODO Auto-generated method stub
		System.out.print("�������޸ĺ����Ϣ��");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		book.setPublisher(str);
		System.out.println("�޸ĳɹ�");
	}
	
	private void changePrice(Book book) {
		// TODO Auto-generated method stub
		System.out.print("�������޸ĺ����Ϣ��");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		book.setPrice(str);
		System.out.println("�޸ĳɹ�");
	}
	
	private void changeCate(Book book) {
		// TODO Auto-generated method stub
		System.out.print("�������޸ĺ����Ϣ��");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		book.setCate(str);
		System.out.println("�޸ĳɹ�");
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
		System.out.println("������Ҫɾ����ͼ�����ƣ�");
		String name = scan.next();
		for(int i = 0; i < bookNum; i++)
		{
			Book book = (Book) booklist.get(i);
			if(name.equals(book.getName()))
			{
				booklist.remove(i);
				bookNum--;
				System.out.print("��ɾ��"+name+"!\n\n");
			}
		}
		
	}



	@SuppressWarnings("unchecked")
	private void addBook() throws IOException {
//		ͨ������̨����
		
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.println("������ͼ������");
//		String bookname = scan.next();
//		System.out.println("������ͼ������");
//		String author = scan.next();
//		System.out.println("������ͼ�������");
//		String publisher = scan.next();
//		System.out.println("������ͼ�����");
//		String category = scan.next();
//		System.out.println("������ͼ��۸�");
//		float price = scan.nextFloat();
		
//		�򵥶�ȡ�ļ�����
		
		System.out.println("������ͼ���ļ���Ϣ��");
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
		System.out.print("��ӳɹ���\n\n");
	}





	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		new MainClass();
	}

}
