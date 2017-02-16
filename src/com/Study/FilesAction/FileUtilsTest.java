package com.Study.FilesAction;

import java.io.*;

public class FileUtilsTest {
	
	public static void main(String args[]) throws Exception{
		String filePath = "E:\\UP_Test\\ZIP\\199089231.full.2016-10-19-10-30-00";
		//boolean isDelete = FileUtils.deleteFile(filePath);
		boolean isFile = FileUtils.isFliesExist(new String[] {"E:","UP_Test","ZIP","199089231.full.2016-10-19-10-30-00","1"});
		System.out.println(isFile);
		System.out.println(FileUtils.linkDirAndFileName(new String[] {"E:","UP_Test","ZIP","199089231.full.2016-10-19-10-30-00"}));
		System.out.println(FileUtils.creatDirs("123455"));
		File file = new File("E:\\soft\\130000006.d30.2016-01-01-02-02-02.xml");
		System.out.println(FileUtils.readFiles(file));
		System.out.println(FileUtils.readFiles("E:\\soft\\130000006.d30.2016-01-01-02-02-02.xml"));
	}
	
}
