package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] disney= {"Shrek","Elsa","Goofy","Mulan","Tom&Jerry"};
System.out.println(disney[1]);

for(int i=0; i<disney.length; i++) {
	if(disney[i].equalsIgnoreCase("Shrek")) {
		System.out.println(disney[i]+" is my fav char");
	}

System.out.println(disney[i]+" ");
	}
System.out.println("All element using regular for loop--------");
for(String character:disney) {
	if(character.equalsIgnoreCase("Mulan")) {
		continue;
	}else {
	System.out.println(character+" ");
}
}
for(String character:disney) {
	if(character.equalsIgnoreCase("Mulan")) {
		System.out.println(character+" is my fav character");
	}else {
	System.out.println(character+" ");
	}
}
	}
}
