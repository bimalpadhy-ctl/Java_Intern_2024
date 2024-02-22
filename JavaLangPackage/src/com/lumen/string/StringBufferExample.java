package com.lumen.string;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Helloo");
		System.out.println (sb.length()+ " " +sb.capacity());
		System.out.println (sb.charAt(5));
		sb.setCharAt(2, 'o');
		System.out.println (sb);
		
		StringBuffer s=new StringBuffer("This is a Demo");
		char t[]=new char[6];
		s.getChars(5, 8, t, 1);
		System.out.println (t);
		
		s.insert(5, "Was");
		System.out.println (s);
		
		System.out.println (s.delete(5, 7));
		System.out.println (s.insert(5, "Was"));
		System.out.println (s.insert(5, "S"));
		System.out.println (s.insert(5, sb));
		System.out.println (s.delete(5, 13));
		System.out.println (s.deleteCharAt(5));
		System.out.println (s.replace(5,7,"was ur"));
		
		String s2=s.substring(5,8);
		String s3=s.substring(5);
		
		System.out.println (s2);
		System.out.println (s3);
		System.out.println (s.append(s2));
		System.out.println (s.append(20));
		System.out.println (s.append("Demo"));		
		
	}

}
