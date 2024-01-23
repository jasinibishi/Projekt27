class main{
	public static void main(String[]args) {
		B b= new B(); //Kreiraj objekt b - SUPERCLASS B
		System.out.println("b.x:" +b.returnIt()); // pecati 2
		C c= new C(); // Kreiraj objekt c - SUPERCLASS C
		System.out.println("c.x:" +c.returnIt()); // pecati c.x 2
		b.triple();// promena na vrednosta b.x *=3
		c.triple();// promena na vrednosta c.x +=3
		System.out.println("b.x posle b.triple():" + b.returnIt());// pecati b.x =2*3=6
		System.out.println("c.x posle c.triple():" + c.returnIt());// pecati c.x 2+3=5
	}
}