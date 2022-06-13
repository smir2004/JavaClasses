package replit;

public class StrMeth {
		  String breed, name, color;
		  void bark(){
		    System.out.println(breed+" can bark");
		  } 
		  void run(){
		    System.out.println(breed+" can run");
		  }
		    void play(){
		      System.out.println(breed+" can play");
		    }
public static void main(String[] args) {
		StrMeth dog1=new StrMeth();
		    dog1.breed="Husky";
		    dog1.run();
		    dog1.bark();
		    dog1.play();
		    StrMeth dog2=new StrMeth();
		  dog2.breed="Bulldog";
		  dog2.run();
		  dog2.play();
		  dog2.bark();
		  StrMeth dog3=new StrMeth();
		    dog3.breed="Labrador";
		    dog3.bark();
		    dog3.run();
		    dog3.play();
		    
		    System.out.println(dog1.breed);
		    System.out.println(dog2.breed);
		    System.out.println(dog3.breed);
		    

	}

	}
