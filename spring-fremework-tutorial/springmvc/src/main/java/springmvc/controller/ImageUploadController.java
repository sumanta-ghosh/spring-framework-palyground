package springmvc.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller

public class ImageUploadController {

	@RequestMapping(path = "profile-image-upload", method = RequestMethod.GET)
	public String imageUploadForm() {
		return "file-upload";
	}

	@RequestMapping(path = "handle-image-upload", method = RequestMethod.POST)
	public String imageUploadHandler(@RequestParam("profile_image") CommonsMultipartFile profile_image, HttpSession hs) {
		System.out.println("Inside imageUploadHandler...");
		System.out.println(profile_image.getName());
		System.out.println(profile_image.getOriginalFilename());
		System.out.println(profile_image.getSize());
		System.out.println(profile_image.getStorageDescription());
		System.out.println(profile_image.getContentType());

		byte[] image_data = profile_image.getBytes();
		// save in server
		String image = hs.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "assets" + File.separator + "image" + File.separator + "New-" + profile_image.getOriginalFilename();
		System.out.println(image);

		FileOutputStream fos;
		try {
			fos = new FileOutputStream(image);
			fos.write(image_data);
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "file-upload";
	}

}
