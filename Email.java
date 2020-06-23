package emailapp;

import java.util.Scanner;

public class Email
{
private String firstName;
private String lastName;
private String department;
private String password;
private int mailboxCapacity=500;
private String alternateEmail;
private int defaultPasswordLength=8;
private String email;
private String companySuffix="company.com";


//constructor
public Email(String firstName,String lastName)
{
	this.firstName = firstName;
	this.lastName = lastName;
	System.out.println("Email created: "+this.firstName+" "+this.lastName);
	this.department=setDepartment();
	System.out.println(this.department);
	this.password=randomPassword(defaultPasswordLength);
	System.out.println("Your password is "+this.password);
	email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
	//System.out.println("Your email id is: "+email);
}

//asking for department
private String setDepartment()
{
 System.out.print("Enter the Department\n1 for Sales\n2 for Development\n3 for Accounting\n4 for None\nEnter your department code:");
 Scanner sc=new Scanner(System.in);
 int deptCode=sc.nextInt();
 if(deptCode==1)
 {
	 return "Sales";
 }
 else if(deptCode==2)
 {
 return "Development";
 }
 else if(deptCode==3)
 {
	 return "Accounting";
 }
 else
 {
	 return "";
 }
 
}
//generate random password
private String randomPassword(int length)
{
String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@$*";
char[] password=new char[length];
for(int i=0;i<length;i++)
{
	int rand=(int)(Math.random()*passwordSet.length());
	password[i]=passwordSet.charAt(rand);
}
return new String(password);
}

//set mailbox capacity
public void setMailboxCapacity(int capacity)
{
	this.mailboxCapacity=capacity;
}
//set alternate password
public void setAlternateEmail(String alternateEmail)
{
	this.alternateEmail=alternateEmail;
}

//change password
public void setPasssword(String password)
{
	this.password=password;
}
public String getPassword()
{
	return password;
}
public String getAlternateEmail()
{
	return alternateEmail;
}
public int getMailboxCapacity()
{
	return mailboxCapacity;
}
public String getInfo()
{
	return "Display Name: "+firstName+
			"\nCompany Email: "+email+
			"\nMailbox Capacity: "+mailboxCapacity+"mb";
}
}
