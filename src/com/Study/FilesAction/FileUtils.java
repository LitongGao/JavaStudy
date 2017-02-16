package com.Study.FilesAction;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

import org.apache.log4j.Logger;

public class FileUtils {
	private static Logger logger = Logger.getLogger(FileUtils.class);
	
	public static boolean isFileExist(String filePath){
		File file = new File(filePath);
		if (file.exists())
		{
			return true;
		}
		return false;
	}
	
	public static boolean isFliesExist(String...filesPath){
		String filePath = linkDirAndFileName(filesPath);
		/*
		File file = new File(filePath);
		if (file.exists())
		{
			return true;
		}
		return false;
		*/
		return isFileExist(filePath);
	}
	
	public static boolean deleteFile(String filePath)
	{
		File file = new File(filePath);
		if (file.exists())
		{
			if (file.isFile())
			{
				System.out.println("delete the file name:");
				System.out.println(file.getAbsolutePath());
				return file.delete();
			}
			else if (file.isDirectory())
			{
				if (file.listFiles().length == 0)
				{
					System.out.println("delete the file directory:");
					System.out.println(file.getAbsolutePath());
					return file.delete();
				}
				else
				{
					for (File fl:file.listFiles())
					{
						deleteFile(fl.getAbsolutePath());
					}
					System.out.println("delete the root directory:");
					System.out.println(file.getAbsolutePath());
					file.delete();
				}
			}
		}
		return true;
	}
	/**
	 link directory and file name
	 
	 */
	public static String linkDirAndFileName(String...files){
		StringBuffer sb = new StringBuffer();
		int i = 0;
		for (String file: files)
		{
			if (i != 0) {sb.append(File.separator);}
			sb.append(file);
			i++;			
		}
		return sb.toString();
	}
	
	public static boolean creatDirs(String pathName){
		File file = new File(pathName);
		if (!file.exists()) {
			return file.mkdir();
		}
		return true;
	}

	public static byte[] readFiles(File f) throws Exception {
		BufferedInputStream in = null;
		ByteArrayOutputStream out;
		
		try {
			in = new BufferedInputStream(new FileInputStream(f));
			out = new ByteArrayOutputStream();
			byte[] temp = new byte[8192];
			int size = 0;
			long start = System.currentTimeMillis();
			//while (in.read(temp, size, 8192) != -1) {
				
			//}
			while ((size=in.read(temp)) != -1) {
				out.write(temp, 0, size);
			}
			long end = System.currentTimeMillis();
			byte[] content = out.toByteArray();
			
			return content;
			
		}
		
		catch(Exception e) {
			throw e;
		}
		
		finally {
			if (in != null) {
				in.close();
			}
		}
		
	}
	
	public static String readFiles(String filepath) throws IOException {
		StringBuffer fileData = new StringBuffer(900);
		BufferedReader reader = new BufferedReader(new FileReader(filepath));
		
		char[] bufChar = new char[1024];
		int numRead = 0;
		while ((numRead=reader.read(bufChar)) != -1) {
			String readData = String.valueOf(bufChar, 0, numRead);
			fileData.append(readData);
			bufChar = new char[1024];
			
		}
		reader.close();
		return fileData.toString();
	}
}
