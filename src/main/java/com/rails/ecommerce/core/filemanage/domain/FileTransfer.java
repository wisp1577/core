package com.rails.ecommerce.core.filemanage.domain; 
/** * Class Name: FileTransfer.java * Function: * * Modifications: * * @author WengShengyuan DateTime 2015-1-22 上午11:10:38 * @version 1.0 * 
 */
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ecommerce_file_transfer")
public class FileTransfer {

//	@GeneratedValue(generator = "paymentableGenerator")    
//	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")  
	
	@Id
	@Column(name = "file_id")
	private String fileId;
	
	@Column(name="file_name",length=4000)
	private String fileName;
	
	@Column(name="file_path",length=4000)
	private String filePath;
	
	@Column(name="file_ext",length=255)
	private String fileExt;
	
	@Column(name="file_type",length=1)
	private String fileType;
	
	@Column(name="file_pid")
	private String filePid;
	
	@Column(name="from_to",length=1)
	private String fromTo;
	
	@Column(name="file_state",length=1)
	private String fileState;
	
	@Column(name="train_code",length=255)
	private String trainCode;
	
	@Column(name="train_date")
	private Date trainDate;
	
	@Column(name="create_date")
	private Date createDate;
	
	@Column(name="upload_time")
	private Date uploadTime;
	
	@Column(name="download_time")
	private Date downloadTime;
	
	@Column(name="file_size")
	private long fileSize;
	
	@Column(name="creator")
	private String creator;
	
	@Column(name="md5_string")
	private String MD5String;

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileExt() {
		return fileExt;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFilePid() {
		return filePid;
	}

	public void setFilePid(String filePid) {
		this.filePid = filePid;
	}

	public String getFromTo() {
		return fromTo;
	}

	public void setFromTo(String fromTo) {
		this.fromTo = fromTo;
	}

	public String getFileState() {
		return fileState;
	}

	public void setFileState(String fileState) {
		this.fileState = fileState;
	}

	public String getTrainCode() {
		return trainCode;
	}

	public void setTrainCode(String trainCode) {
		this.trainCode = trainCode;
	}

	public Date getTrainDate() {
		return trainDate;
	}

	public void setTrainDate(Date trainDate) {
		this.trainDate = trainDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	public Date getDownloadTime() {
		return downloadTime;
	}

	public void setDownloadTime(Date downloadTime) {
		this.downloadTime = downloadTime;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getMD5String() {
		return MD5String;
	}

	public void setMD5String(String mD5String) {
		MD5String = mD5String;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	
	
	
	
}
