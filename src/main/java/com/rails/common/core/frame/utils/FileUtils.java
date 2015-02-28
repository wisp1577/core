package com.rails.common.core.frame.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 *  Class Name: FileUtils.java
 *  Function:文件的读写操作
 *  
 *  Modifications:   
 *  
 *  @author zjf  DateTime 2015-1-19 下午9:55:31    
 *  @version 1.0
 */
public class FileUtils {

	
	/**
	 * 
	 *  Function:把字符串写到指定的文件中
	 * 
	 *  @author zjf  DateTime 2015-1-19 下午9:58:32
	 *  @param content
	 *  @param fileUrl
	 * @throws IOException 
	 */
	public static void WriteToFile(String content,String fileUrl,String fileName) throws IOException{
		
			   //String content = "This is the content to write into file";
			   File file = new File(fileUrl);
			   File file2 = new File(fileUrl+"/"+fileName);
			   // if file doesnt exists, then create it
			   if (!file.exists()) {
			    if(file.mkdirs()){
			    	if(!file2.exists()){
			    		file2.createNewFile();
			    	}
			      }
			   }

			   FileWriter fw = new FileWriter(file2.getAbsoluteFile());
			   BufferedWriter bw = new BufferedWriter(fw);
			   bw.write(content);
			   bw.close();
			 }
	
	/** 
     * 复制单个文件 
     * @param oldPath String 原文件路径 如：c:/fqf.txt 
     * @param newPath String 复制后路径 如：f:/fqf.txt 
     * @return boolean 
     */ 
   public static void copyFile(String oldPath, String newPath) { 
       try { 
    	   int i=newPath.lastIndexOf("/");
    	   String newPathDir=newPath.substring(0, i);
    	   File newFile = new File(newPathDir);
    	   int bytesum = 0; 
           int byteread = 0; 
           File oldfile = new File(oldPath); 
    	   if (!newFile.exists()) {
			    newFile.mkdirs();
    	   }
           if (oldfile.exists()) { //文件存在时 
               InputStream inStream = new FileInputStream(oldPath); //读入原文件 
               FileOutputStream fs = new FileOutputStream(newPath); 
               byte[] buffer = new byte[1444]; 
               int length; 
               while ( (byteread = inStream.read(buffer)) != -1) { 
                   bytesum += byteread; //字节数 文件大小 
                   //System.out.println(bytesum); 
                   fs.write(buffer, 0, byteread); 
               } 
               inStream.close(); 
           } 
           
       } 
       catch (Exception e) { 
           System.out.println("复制单个文件操作出错"); 
           e.printStackTrace(); 

       } 

   } 

   /** 
     * 复制整个文件夹内容 
     * @param oldPath String 原文件路径 如：c:/fqf 
     * @param newPath String 复制后路径 如：f:/fqf/ff 
     * @return boolean 
     */ 
   public void copyFolder(String oldPath, String newPath) { 

       try { 
           (new File(newPath)).mkdirs(); //如果文件夹不存在 则建立新文件夹 
           File a=new File(oldPath); 
           String[] file=a.list(); 
           File temp=null; 
           for (int i = 0; i < file.length; i++) { 
               if(oldPath.endsWith(File.separator)){ 
                   temp=new File(oldPath+file[i]); 
               } 
               else{ 
                   temp=new File(oldPath+File.separator+file[i]); 
               } 

               if(temp.isFile()){ 
                   FileInputStream input = new FileInputStream(temp); 
                   FileOutputStream output = new FileOutputStream(newPath + "/" + 
                           (temp.getName()).toString()); 
                   byte[] b = new byte[1024 * 5]; 
                   int len; 
                   while ( (len = input.read(b)) != -1) { 
                       output.write(b, 0, len); 
                   } 
                   output.flush(); 
                   output.close(); 
                   input.close(); 
               } 
               if(temp.isDirectory()){//如果是子文件夹 
                   copyFolder(oldPath+"/"+file[i],newPath+"/"+file[i]); 
               } 
           } 
       } 
       catch (Exception e) { 
           System.out.println("复制整个文件夹内容操作出错"); 
           e.printStackTrace(); 

       } 

   }
   
   /**
    * 递归删除目录下的所有文件及子目录下所有文件
    * @param dir 将要删除的文件目录
    * @return boolean Returns "true" if all deletions were successful.
    *                 If a deletion fails, the method stops attempting to
    *                 delete and returns "false".
    */
   public static boolean deleteDir(File dir) {
       if (dir.isDirectory()) {
           String[] children = dir.list();
           for (int i=0; i<children.length; i++) {
               boolean success = deleteDir(new File(dir, children[i]));
               if (!success) {
                   return false;
               }
           }
       }
       // 目录此时为空，可以删除
       return dir.delete();
   }
   
   
   /** 
    * 删除单个文件 
    * @param   sPath    被删除文件的文件名 
    * @return 单个文件删除成功返回true，否则返回false 
    */  
   public static boolean deleteFile(String sPath) {  
       boolean flag = false;  
       File file = new File(sPath);  
       // 路径为文件且不为空则进行删除  
       if (file.isFile() && file.exists()) {  
           file.delete();  
           flag = true;  
       }  
       return flag;  
   }  
   

}

