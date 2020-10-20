//Lab2Ex2Formatted
//Corey Dennison T00185828
/*This program formats Lab 2 Exercise 2*/
 
 public class Lab2Ex2Formatted {
 	public static void main(String[] args){
 		
 		String titleName, authorName, pagesAmount, yop, priceAmount, title, author;
 		int pages, year;
 		float price;
 		
 		titleName = "Title: ";
 		authorName = "Author: ";
 		pagesAmount = "Pages: ";
 		yop = "Year of Publication: ";
 		priceAmount = "Price: EUR";
 		
 		title = "Harry Potter and the Prisoner of Azkaban";
 		author = "J.K Rowling";
 		pages = 317;
 		year = 1999;
 		price = 35.50f;
 		
 		String bookFormat = String.format("%-25s%-10s\n%-25s%-10s\n%-25s%-10d\n%-25s%-10d\n%-25s%-10.2f\n",
 											titleName, title,
 											authorName, author,
 											pagesAmount, pages,
 											yop, year,
 											priceAmount, price);
 		
 		System.out.println(bookFormat);
 		
 		
 	}
 }