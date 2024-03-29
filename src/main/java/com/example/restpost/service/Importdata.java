package com.example.restpost.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restpost.entity.Comment;
import com.example.restpost.entity.Post;
import com.example.restpost.entity.User;
import com.example.restpost.repository.CommentRepository;
import com.example.restpost.repository.PostRepository;
import com.example.restpost.repository.UserRepository;

@Service
public class Importdata {
	@Autowired
	UserRepository usp;
	
	@Autowired
	PostRepository postp;
	
	@Autowired
	CommentRepository commentp;	
	
	public void importposts() throws ParseException {
		List<Comment> comlist = new ArrayList<>();
		List<User> userlist = new ArrayList<>();
		userlist=(List<User>) usp.findAll();
		for (int i=0;i<43;i++) {
			Post p=new Post();
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
			Date  date1=formatter.parse("31-06-2023 00:00:00");
			Date  date2=formatter.parse("31-06-2024 00:00:00");		
			
			p.setDateCreated(between(date1,date2));
			
			comlist = new ArrayList<>();
			
			System.out.println("ul "+userlist.size());
			
			for (int j=0;j<randomint(1,6);j++) {
				Comment com=new Comment();
				com.setTxt(randomstring());
				com.setDateCreated(between(date1,date2));
				System.out.println("randomint "+(randomint(1,userlist.size())-1));
				com.setUser(userlist.get(randomint(1,userlist.size())-1));
				comlist.add(com);
				commentp.save(com);
			}
			
			p.setComments(comlist);
			p.setTxt(randomstring());
			
			
			
			p.setUser(userlist.get(randomint(1,userlist.size())-1));
			
			postp.save(p);

		}
	}
	
	
	
	public void importusers() throws ParseException {
		List<String> usernames= new ArrayList<String>();;
		
		usernames.add("Jef Degroof");
		usernames.add("Antoine Demeester");
		usernames.add("Georges Cremer");
		usernames.add("Jocelyn Eldo");
		usernames.add("Claire Petit");
		usernames.add("Jean Renolf");
		usernames.add("Piet Harar");
		usernames.add("Abib Legrand");
		usernames.add("Geoffrey Renolds");
		usernames.add("Rothilda Degroof");
		usernames.add("Griet peters");
		usernames.add("Mr Hugh O'Connor");
		usernames.add("Ms Alice Potter");
		usernames.add("Mr Benjamin Wadlow");
		usernames.add("Miss Wendy Preston");
		usernames.add("Mr Patrick Farrell");
		usernames.add("Ms Anthea Marshall");
		usernames.add("Mr Zane Nixon");
		usernames.add("Miss Anna Marshall");
		usernames.add("Mr Matthew Simmons");
		usernames.add("Miss Noreen Hadley");
		usernames.add("Mr Ryan Hunt");
		usernames.add("Miss Judy Lloyd");
		usernames.add("Mr Vincent Nash");
		usernames.add("Mrs Lydia Yarwood");
		usernames.add("Mr Gordon Hogan");
		usernames.add("Ms Megan Hallworth");
		usernames.add("Mr Desmond Croner");
		usernames.add("Mrs Cindy Adams");
		usernames.add("Mr Clifford Salisbury");
		usernames.add("Miss Melinda Chapel");
		usernames.add("Mr Simon Ramsden");
		usernames.add("Miss Lydia Eckard");
		usernames.add("Mr Julian Farrow");
		usernames.add("Mrs Sandra Walker");
		usernames.add("Mr Eric Boyle");
		usernames.add("Mrs Angela Barber");
		usernames.add("Mr Desmond Jenkinson");
		usernames.add("Miss Melinda Halsall");
		usernames.add("Mr Albert Harper");
		usernames.add("Ms Cheryl Macavoy");
		usernames.add("Mr Conrad Lyons");
		usernames.add("Ms Tracy Tasker");
		usernames.add("Mr Jacob Hart");
		usernames.add("Miss Emilia Dixon");
		usernames.add("Mr Scott Purvis");
		usernames.add("Miss Lisa Barber");
		usernames.add("Mr Richard Popplewell");
		usernames.add("Miss Diane Walker");
		usernames.add("Mr David Doyle");
		usernames.add("Miss Sandra Rathbone");
		usernames.add("Mr Brendan Ratner");
		usernames.add("Miss Jennifer Bainbridge");
		usernames.add("Mr Desmond Tarbuck");
		usernames.add("Ms Catherine Whittaker");
		usernames.add("Mr Wayne Gibbs");
		usernames.add("Ms Lena Wadlow");
		usernames.add("Mr Barry Hanley");
		usernames.add("Mrs Emilia O'Brien");
		usernames.add("Mr Colin Hamill");
		usernames.add("Ms Angela Palmer");

		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		
		Date  date1=formatter.parse("01-01-2019 00:00:00");
		Date  date2=formatter.parse("31-06-2023 00:00:00");
		
		
	      
		for (String usernames1 : usernames) {
			User user = new User();
			user.setName_user(usernames1);
			user.setDate(between(date1,date2));
			usp.save(user);
			
		}
		
	}
	
	
	
	public String randomstring() {
		String lorem="lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna aliqua ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur excepteur sint occaecat cupidatat non proident sunt in culpa qui officia deserunt mollit anim id est laborum";
		String[]  list;
		
		list=lorem.split(" ");
		
		Random rand = new Random(); 
		int upperbound = 60;
		int int_random = rand.nextInt(upperbound);
		
		String newline="";
		
		for (int b=0;b<int_random;b++){
			int int_random_tot = rand.nextInt(int_random);
			newline+=list[int_random_tot]+" ";
		}
		
		System.out.println(newline);		
		
		return newline;
	}
	
	public int randomint(int val1, int val2) {
		
		Random rand = new Random(); 
		int upperbound = val2;
		int int_random = rand.nextInt(upperbound);
		
		System.out.println(int_random);		
		
		return (val1+int_random);
	}	
	
	public static Date between(Date startInclusive, Date endExclusive) {
	    long startMillis = startInclusive.getTime();
	    long endMillis = endExclusive.getTime();
	    long randomMillisSinceEpoch = ThreadLocalRandom
	      .current()
	      .nextLong(startMillis, endMillis);

	    return new Date(randomMillisSinceEpoch);
	}

}
