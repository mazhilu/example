package com.asto.trade.io;

import java.io.File;
import java.io.IOException;

public class IoFile {
//	File类共提供了三个不同的构造函数，以不同的参数形式灵活地接收文件和目录名信息。构造函数：
//	1）File (String   pathname)   
//	     例:File  f1=new File("FileTest1.txt"); //创建文件对象f1，f1所指的文件是在当前目录下创建的FileTest1.txt
//	2）File (String  parent  ,  String child)
//	     例:File f2=new  File(“D:\\dir1","FileTest2.txt") ;//  注意：D:\\dir1目录事先必须存在，否则异常
//	3）File (File    parent  , String child)
//	     例:File  f4=new File("\\dir3");
//	          File  f5=new File(f4,"FileTest5.txt");  //在如果 \\dir3目录不存在使用f4.mkdir()先创建
//	        一个对应于某磁盘文件或目录的File对象一经创建， 就可以通过调用它的方法来获得文件或目录的属性。    
//	       1）public boolean exists( ) 判断文件或目录是否存在
//	       2）public boolean isFile( ) 判断是文件还是目录 
//	       3）public boolean isDirectory( ) 判断是文件还是目录
//	       4）public String getName( ) 返回文件名或目录名
//	       5）public String getPath( ) 返回文件或目录的路径。
//	       6）public long length( ) 获取文件的长度 
//	       7）public String[ ] list ( ) 将目录中所有文件名保存在字符串数组中返回。 
//	       File类中还定义了一些对文件或目录进行管理、操作的方法，常用的方法有：
//	       1） public boolean renameTo( File newFile );    重命名文件
//	       2） public void delete( );   删除文件
//	       3）  public boolean mkdir( ); 创建目录
	
	
	
		public static void main(String[] args) throws IOException {
			File file = new File("love/you");
			File file2 = new File(file,"test.txt");
			File file3 = new File(file,"test.java");
			if(!file.exists()){
				file.mkdirs();
			}
			if(!file2.exists()){
				file2.createNewFile();
			}
			if(!file3.exists()){
				file3.createNewFile();
			}
			System.out.println("1"+file2.getAbsolutePath());
			System.out.println("2"+file2.getPath());
			System.out.println("3"+file2.canRead());
			System.out.println("4"+file2.length());
			int count=0;
			String []arr=file.list();
			for(String a:arr){
				count++;
				System.out.println("文件"+a+"in love.you");
			}
			System.out.println("一共有"+count+"文件");
		}
		
	
}
