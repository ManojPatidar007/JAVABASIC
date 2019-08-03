class ReverseString{
	static String reverse = "";
	public static void main(String ar[]){
		
		String a="hello";
		String b=reverse(a);
		System.out.println(a);
		System.out.println(b);
	}
	public static String reverse(String str){
		if(str.length()==0)
			return str;//ar.charAt(0);
		 reverse += str.charAt(str.length()-1)
                    +reverse(str.substring(0,str.length()-1));
            return reverse;
	}
}