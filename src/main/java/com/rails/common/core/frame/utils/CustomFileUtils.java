package com.rails.common.core.frame.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.rails.common.utils.FileUtils;

public class CustomFileUtils extends FileUtils {

	/**
	 * 
	 * Function:移动文件夹(文件也行),路径写到真正移动的文件夹为止(也可用作改名)
	 * 
	 * @author WengShengyuan DateTime 2015-1-29 下午4:58:04
	 * @param srcFile
	 *            原文件夹
	 * @param destPath
	 *            目标文件夹
	 * @return
	 */
	public static boolean moveFolder(String srcFile, String destPath) {
		try {
			File srcFolder = new File(srcFile);
			
			File destFolder = new File(destPath);
			if (destFolder.exists()) {
				deleteDir(destPath);
			}
			File newFile = new File(destFolder.getAbsoluteFile() + "\\"
					+ srcFolder.getName());
			return srcFolder.renameTo(destFolder);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 
	 * Function:复制文件夹,路径写到真正复制的文件夹为止 ** 若复制文件则目的地写文件所在目录
	 * 
	 * @author WengShengyuan DateTime 2015-1-29 下午4:58:22
	 * @param srcfile
	 *            原文件夹
	 * @param destfile
	 *            目标哦文件夹
	 * @throws IOException
	 */
//	public static boolean copyFolder(String srcfile, String destfile)
//			throws IOException // 使用FileInputStream和FileOutStream
//	{
//		try {
//			(new File(destfile)).mkdirs(); // 如果文件夹不存在 则建立新文件夹
//			File a = new File(srcfile);
//			String[] file = a.list();
//			File temp = null;
//			for (int i = 0; i < file.length; i++) {
//				if (srcfile.endsWith(File.separator)) {
//					temp = new File(srcfile + file[i]);
//				} else {
//					temp = new File(srcfile + File.separator + file[i]);
//				}
//				
//				if (temp.isDirectory()) {// 如果是子文件夹
//					copyFolder(srcfile + "/" + file[i], destfile + "/" + file[i]);
//				}
//			}
//			return true;
//		} catch (IOException e) {
//			throw e;
//		}
//
//	}
	
	
	
	
	public static boolean copy(String srcfile, String destfile)
			throws IOException // 使用FileInputStream和FileOutStream
	{
		try{
			(new File(destfile)).mkdirs();
			File srcF = new File(srcfile);
			if(srcF.isDirectory()){
				// 获取源文件夹当前下的文件或目录
		        File[] file = (new File(srcfile)).listFiles();
		        for (int i = 0; i < file.length; i++) {
		            if (file[i].isFile()) {
		                // 复制文件
		                String type = file[i].getName().substring(file[i].getName().lastIndexOf(".") + 1);
		                if(!destfile.endsWith(File.separator))
		                	destfile = destfile + "\\";
		                    copyFile(file[i], new File(destfile + file[i].getName()));
		            }
		            if (file[i].isDirectory()) {
		                // 复制目录
		                String sourceDir = srcfile + File.separator + file[i].getName();
		                String targetDir = destfile + File.separator + file[i].getName();
		                copyDirectiory(sourceDir, targetDir);
		            }
		        }
			}
			else{
				copyFile(srcF, new File(destfile + File.separator + srcF.getName()));
			}
			return true;

		} catch(IOException e){
			throw e;
		}
        

	}
	
	
	
	// 复制文件
    public static void copyFile(File sourceFile, File targetFile) throws IOException {
        BufferedInputStream inBuff = null;
        BufferedOutputStream outBuff = null;
        try {
            // 新建文件输入流并对它进行缓冲
            inBuff = new BufferedInputStream(new FileInputStream(sourceFile));

            // 新建文件输出流并对它进行缓冲
            outBuff = new BufferedOutputStream(new FileOutputStream(targetFile));

            // 缓冲数组
            byte[] b = new byte[1024 * 5];
            int len;
            while ((len = inBuff.read(b)) != -1) {
                outBuff.write(b, 0, len);
            }
            // 刷新此缓冲的输出流
            outBuff.flush();
        } finally {
            // 关闭流
            if (inBuff != null)
                inBuff.close();
            if (outBuff != null)
                outBuff.close();
        }
    }

    // 复制文件夹
    public static void copyDirectiory(String sourceDir, String targetDir) throws IOException {
        // 新建目标目录
        (new File(targetDir)).mkdirs();
        // 获取源文件夹当前下的文件或目录
        File[] file = (new File(sourceDir)).listFiles();
        for (int i = 0; i < file.length; i++) {
            if (file[i].isFile()) {
                // 源文件
                File sourceFile = file[i];
                // 目标文件
                File targetFile = new File(new File(targetDir).getAbsolutePath() + File.separator + file[i].getName());
                copyFile(sourceFile, targetFile);
            }
            if (file[i].isDirectory()) {
                // 准备复制的源文件夹
                String dir1 = sourceDir + "/" + file[i].getName();
                // 准备复制的目标文件夹
                String dir2 = targetDir + "/" + file[i].getName();
                copyDirectiory(dir1, dir2);
            }
        }
    }
	

	/**
	 * 
	 * Function:获取当前文件夹下的后缀名匹配的文件
	 * 
	 * @author WengShengyuan DateTime 2015-1-29 下午4:06:15
	 * @param path
	 * @param ext
	 * @return
	 */
	public static List<File> getCurrentPathFileExt(String path, String ext) {
		List<File> list = new ArrayList<File>();
		File dir = new File(path);
		if (dir.isDirectory() == false)
			return null;
		File[] files = dir.listFiles();
		for (File f : files) {
			if (f.getName().endsWith(ext)) {
				list.add(f);
			}
		}
		return list;
	}
	
	
	
	/**
	 * 
	 * Function:获取当前文件夹下的文件名匹配的文件
	 * 
	 * @author WengShengyuan DateTime 2015-1-29 下午4:06:15
	 * @param path 文件名
	 * @param Name 匹配文件名
	 * @return
	 */
	public static List<File> getCurrentPathFileName(String path, String Name) {
		List<File> list = new ArrayList<File>();
		File dir = new File(path);
		if (dir.isDirectory() == false)
			return null;
		File[] files = dir.listFiles();
		for (File f : files) {
			if (CustomFileUtils.getFileNameNoExt(f.getName()).equals(Name) && !f.isDirectory()) {
				list.add(f);
			}
		}
		return list;
	}
	

	/**
	 * 从指定目录中找出指定后缀、文件名的文件(文件名完全匹配)
	 * 
	 * @param path
	 *            文件夹路径
	 * @param ext
	 *            匹配的后缀，不限则""
	 * @param matchName
	 *            匹配的文件名
	 * @return
	 */
	public static List<File> getPathAllFileExt(String path, String ext,
			String matchName) {
		List<File> returnList = new ArrayList();
		for (File f : FileUtils.getPathAllFileExt(path, "")) {
			if (f.isFile()) {
				if (getFileNameNoExt(f.getName()).equals(matchName)) {
					returnList.add(f);
				}
			}

		}
		return returnList;
	}

	/**
	 * 输入 文件名.后缀 输出时去掉后缀
	 * 
	 * @param fullName
	 *            文件全名 xxx.xx
	 * @return
	 */
	public static String getFileNameNoExt(String fullName) {
		if (fullName.contains(".")) {
			try {

				return fullName.substring(0, fullName.lastIndexOf("."));
			} catch (Exception e) {
				return "";
			}
		} else {
			return fullName;
		}

	}

	/**
	 * 输入 文件名.后缀 输出后缀
	 * 
	 * @param fullName
	 *            文件全名 xxx.xx
	 * @return
	 */
	public static String getFileExt(String fullName) {
		if (fullName.contains(".")) {
			try {
				return fullName.substring(fullName.lastIndexOf(".") + 1);
			} catch (Exception e) {
				return "";
			}
		} else {
			return "";
		}

	}

	/**
	 * 递归删除文件夹下所有文件
	 * 
	 * @param dirPath
	 *            文件夹路径
	 * @return
	 */
	public static boolean deleteDir(String dirPath) {
		File dir = new File(dirPath);
		if (dir.isDirectory()) {
			String[] children = dir.list();
			for (int i = 0; i < children.length; i++) {
				boolean success = deleteDir(new File(dir, children[i])
						.getPath());
				if (!success) {
					return false;
				}
			}
		}
		// 目录此时为空，可以删除
		return dir.delete();
	}

	/**
	 * 根据文件路径得到所在文件夹的路径，如果本身就是文件夹，则返回上一级
	 * 
	 * @param dirPath
	 *            文件或文件夹的路径
	 * @return
	 */
	public static String getFileLocation(String dirPath) {
		File inFile = new File(dirPath);

		try {
			return inFile.getParent();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}