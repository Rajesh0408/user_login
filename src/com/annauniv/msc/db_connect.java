package com.annauniv.msc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class db_connect {
	static PreparedStatement st=null;
	static Connection c=null;
	public static void main(String[] args)
	{
		try {
			 c=DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root","raju0408");
			//PreparedStatement st=c.prepareStatement("insert into proj values(?,?,?,?,?)");
			Scanner s=new Scanner(System.in);
			int ch;
			do {
				System.out.println("\tMENU\n1.Register\n2.Login\n3.Exit\nEnter your choice:");
				ch=s.nextInt();
				s.nextLine();
				switch(ch) {
					case 1:
						
						System.out.println("Enter username:");
						String uname=s.nextLine();
						System.out.println("Enter name:");
						String name=s.nextLine();
						System.out.println("Enter dob:");
						String dob=s.nextLine();
						System.out.println("Enter email:");
						String email=s.nextLine();
						System.out.println("Enter password:");
						String pass=s.nextLine();
						break;
					case 2:
						System.out.println("Enter username:");
						 uname=s.nextLine();
						System.out.println("Enter password:");
						 pass=s.nextLine();
						 break;
					case 3:
						break;
					
				}
				}while(ch!=3);
		}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}

