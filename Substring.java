package Assignment8;

public class Substring {

	public static void main(String[] args) {
        StringBuffer buff = new StringBuffer("XYZ");
       for(int i=0;i<=buff.length();i++)
       {
    	   for(int j=i;j<=buff.length();j++)
    	   {
    		   System.out.println(buff.substring(i,j));
    	   }
       }

	}

}
