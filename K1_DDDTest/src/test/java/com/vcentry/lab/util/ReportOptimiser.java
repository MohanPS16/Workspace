package com.vcentry.lab.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

public class ReportOptimiser {

	public static void optimizeReport() throws IOException{
		
		Date date=new Date();
		//dd-M-yyyy hh:mm:ss
		SimpleDateFormat sf=new SimpleDateFormat("dd-M-yyyy_hh:mm:ss");
		String folderName= sf.format(date);
		
		File src= new File("C:\\Users\\Rohini\\Desktop\\Workspace\\batch251\\K1_DDDTest\\screenshot");
		File dst=new File("C:\\Users\\Rohini\\Desktop\\Workspace\\batch251\\K1_DDDTest\\oldScreenshot\\"+folderName);
	
		FileUtils.copyDirectory(src, dst);
		FileUtils.cleanDirectory(src);
	}
}
