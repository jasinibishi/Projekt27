class B{ //SUPERCLASS B
	int x=2; // DATA MEMBER SUPER CLASS x=2
	void triple() {x=x*3;} // metod- pomnozi ja vrednosta x so 3 x*=3
	int returnIt() {return x;} //metod- vrati go podatokot- DATA MEMBER x
			}


class C extends B{ //SUPER CLASS C
	void triple() {
		x=x+3; //metod- Zgolemi ja vrednosta na x so 3 x+=3
	}
}