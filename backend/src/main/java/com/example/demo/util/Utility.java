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

	public static String uploadImage(MultipartFile image) throws IOException
	{
	Map uploadResult=	cloud.uploader().upload(image.getBytes(), ObjectUtils.asMap("folder","Project_Management_System"));
	return uploadResult.get("url").toString();
	}
}
