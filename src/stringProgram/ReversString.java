package stringProgram;

public class ReversString {

	public static void main(String[] args) {
           String name=" SHAILESH ";
           int leng=name.length();
           String rev=" ";
           System.out.println(leng);
           for(int i=leng-1;i>=0;i--)
           {
        	   rev=rev+name.charAt(i);
           }
           System.out.println("Reverse of"+name+"is"+rev);
	}

}
