class HitungJarak {
	double jarak(double x1, double x2,double y1, double y2){
	double jarak = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
	return jarak;
	}
	
	public static void main(String[] args){
		HitungJarak x = new HitungJarak();
		double x1 = Double.parseDouble(args[0]);
		double x2 = Double.parseDouble(args[0]);
		double y1 = Double.parseDouble(args[0]);
		double y2 = Double.parseDouble(args[0]);
		double r = x.jarak(x1,x2,y1,y2);
		System.out.println("jarak antar titik adalah "+r );
	}
	
}

//String[] args  

