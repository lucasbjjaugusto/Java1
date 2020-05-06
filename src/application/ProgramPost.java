package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class ProgramPost {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post post1 = new Post(sdf.parse("21/06/2020 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful coutry!", 12);
		post1.addComment(c1);
		post1.addComment(c2);
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the force be  with you");
		Post post2 = new Post(sdf.parse("28/07/2020 23:14:19"), "Good night guys", "See you Tomorrow!", 5);
		post2.addComment(c3);
		post2.addComment(c4);
		
		System.out.println(post1);
		System.out.println(post2);
	}
}
