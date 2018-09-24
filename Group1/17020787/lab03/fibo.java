package lap3;
class fibo {
	
	public int FiboN(int n) {
		/**
		 * FiboN la ham dung de dua ra so fibo n
		 * @param n la so nguyen the hien vi tri fibo n
		 * @return tra ve so fibo n trong day fibo 
		 */
		if(n==0) return 0;
		if(n==1) return 1;
		if(n>=2) {
			int a=0,b=1;
			for(int i=2;i<=n;i++) {
				b+=a;
				a=b-a;
			}
			return b;
		}
		return n;
	}

}
