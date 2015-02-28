package com.rails.ecommerce.core.goodsinfo.serviceImpl;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;
import org.springframework.stereotype.Service;

import com.rails.common.core.frame.utils.StaticConfig;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.goodsinfo.dao.GoodsInfoDao;
import com.rails.ecommerce.core.goodsinfo.domain.GoodsInfo;
import com.rails.ecommerce.core.goodsinfo.service.GoodsInfoService;


@Service("GoodsInfoServiceImpl")
public class GoodsInfoServiceImpl  implements GoodsInfoService {
	
	@Resource(name = "GoodsInfoDaoImpl")
	private GoodsInfoDao goodsInfoDao;

	
	@Override
	public PaginationList findAllPage(String goodsTitle,String state,String beginDate,String endDate,int pageNo, int pageSize)throws Exception {
		return goodsInfoDao.findAllPage( goodsTitle, state, beginDate, endDate,pageNo, pageSize);
	}
	
	@Override
	public List<GoodsInfo> findByIds(String goodsIds)  throws Exception{
		return goodsInfoDao.findByIds(goodsIds);
	}


	@Override
	public GoodsInfo save(GoodsInfo entity) throws Exception {
		return goodsInfoDao.save(entity);
	}


	@Override
	public void delete(GoodsInfo entity) throws Exception {
		goodsInfoDao.delete(entity);
	}


	@Override
	public GoodsInfo update(GoodsInfo entity) throws Exception {
		// TODO Auto-generated method stub
		return goodsInfoDao.update(entity);
	}


	@Override
	public List<GoodsInfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public GoodsInfo findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return goodsInfoDao.findById(id);
	}
	
	
	@Override
	public GoodsInfo findById(Object id) throws Exception {
		// TODO Auto-generated method stub
		return goodsInfoDao.findById(id);
	}
	
	@Override
	public String imageUpload(HttpServletRequest request) throws Exception{
		String retxt ="";
        String realDir = request.getSession().getServletContext().getRealPath("");  
        //String contextpath = request.getContextPath();  
        //String basePath = request.getScheme() + "://"  + request.getServerName() + ":" + request.getServerPort() + contextpath + "/";  
  
        try {  
        String filePath = StaticConfig.uploadUrl+"/images";  
        String realPath = realDir+"\\"+filePath;  
        //判断路径是否存在，不存在则创建  
        /**E:\workspace\ecommerce\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\admin\resources\*/
        File dir = new File(realPath);  
        if(!dir.isDirectory())  
            dir.mkdir();  
  
        if(ServletFileUpload.isMultipartContent(request)){  
  
            DiskFileItemFactory dff = new DiskFileItemFactory();  
            dff.setRepository(dir);  
            dff.setSizeThreshold(1024000);  
            ServletFileUpload sfu = new ServletFileUpload(dff);  
            FileItemIterator fii = null;  
            fii = sfu.getItemIterator(request);  
            String title = "";   //图片标题  
            String url = "";    //图片地址  
            String fileName = "";  
            String state="success";  
            String realFileName="";  
            while(fii.hasNext()){  
                FileItemStream fis = fii.next();  
 
                try{  
                    if(!fis.isFormField() && fis.getName().length()>0){  
                        fileName = fis.getName();  
                        Pattern reg=Pattern.compile("[.]jpg|png|jpeg|gif$");  
                        Matcher matcher=reg.matcher(fileName);  
                        if(!matcher.find()) {  
                            state = "type_error";  
                            break;  
                        }  
                        realFileName = new Date().getTime()+fileName.substring(fileName.lastIndexOf("."),fileName.length());  
                        url = realPath+"\\"+realFileName;  
  
                        BufferedInputStream in = new BufferedInputStream(fis.openStream());//获得文件输入流  
                        FileOutputStream a = new FileOutputStream(new File(url));  
                        BufferedOutputStream output = new BufferedOutputStream(a);  
                        Streams.copy(in, output, true);//开始把文件写到你指定的上传文件夹  
                        
                        a.flush();
                        output.flush();
                        
                        a.close();
                        in.close();
                        output.close();
                    }else{  
                        String fname = fis.getFieldName();  
  
                        if(fname.indexOf("pictitle")!=-1){  
                            BufferedInputStream in = new BufferedInputStream(fis.openStream());  
                            byte c [] = new byte[10];  
                            int n = 0;  
                            while((n=in.read(c))!=-1){  
                                title = new String(c,0,n);  
                                break;  
                            }
                            in.close();
                        }
                    } 
                   
  
                }catch(Exception e){  
                	retxt ="error";  
                    e.printStackTrace();  
                }  
            }  
            //retxt ="[{src:'"+filePath+"/"+realFileName+"',status:'"+state+"'}]";   
            retxt =filePath+"/"+realFileName;  
        }  
        }catch(Exception ee) {  
        	retxt ="error";
            ee.printStackTrace(); 
        } 
        return retxt;
	}

}
