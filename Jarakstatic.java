class Jarakstatic {
	static double jarak(double x1,double x2,double y1,double y2){
		double	hj = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		return	hj;
		}
	public static void main(String[] args){
	double z=jarak(6,7,8,9);
	System.out.println("jadi jarak antar dua titik = " + z);
	}
}



//STATIC METHOD
