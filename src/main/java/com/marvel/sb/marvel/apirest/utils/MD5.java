package com.marvel.sb.marvel.apirest.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	
	public String getHashKey(String data) {
		final byte[] defaultBytes = data.getBytes();
		
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
        
		md.reset();
		md.update(defaultBytes);

        return getHexString(md);
	}
	
	private String getHexString(MessageDigest md) {
		final StringBuffer hexString = new StringBuffer();
		
		final byte messageDigest[] = md.digest();
        for (final byte element : messageDigest) {
            final String hex = Integer.toHexString(0xFF & element);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
	}
}
