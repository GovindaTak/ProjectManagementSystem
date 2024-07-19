package com.example.demo.util;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

public final class Utility {
	@Autowired
	private static Cloudinary cloud;

	public static String uploadImage(MultipartFile image) 
	{
		try {
	Map uploadResult=	cloud.uploader().upload(image.getBytes(), ObjectUtils.asMap("folder","Project_Management_System"));
	return uploadResult.get("url").toString();
		}
		catch(Exception ex)
		{
			throw new RuntimeException(ex.getMessage());
		}
	}
	
	public static void removeImage(String url)
	{
		try {
		String[] urlParts =url.split("/");
		
		String publicIdWithExtension=urlParts[urlParts.length-1];
		String publicId=publicIdWithExtension.split("//.")[0];
		
		Map result=cloud.uploader().destroy(publicId, ObjectUtils.asMap("folder","Project_Management_System"));
		if("ok".equals(result.get("result")))
		{ return ;}
		else throw new RuntimeException("something wrong in image removal from cloudinary !!!");
		}
		catch(Exception ex)
		{
			throw new RuntimeException(ex.getMessage());
		}
	}
	
}
