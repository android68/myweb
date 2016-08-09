package com.tom;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Tester {

	public static void main(String[] args) {
		String pw = "123456";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] bb = md.digest(pw.getBytes());
			for (int i=0; i<bb.length; i++){
				System.out.println(bb[i]);
			}
			BigInteger bi = new BigInteger(1, bb);
			System.out.println(bi.toString(16));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
