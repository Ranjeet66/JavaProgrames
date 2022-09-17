package collection;

 class Pair<X,Y,Z> {
	X x;
	Y y;
	
	public Pair(X x,Y y) {
		this.x = x;
		this.y = y; 
	}
		public void getDescription() {
			System.out.println(x+" " +y);
		}
    } 

