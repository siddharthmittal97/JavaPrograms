package Programs;
class Child extends Parent
{
     void eat()
      {
	   System.out.println("b");
      }
     public static void main(String[] args) 
     {
    	 Child a = new Child();
    	 a.Bark();
    	 a.eat();
     }
}

