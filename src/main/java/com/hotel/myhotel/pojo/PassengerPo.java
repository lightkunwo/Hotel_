package com.hotel.myhotel.pojo;

import lombok.Data;

@Data
public class PassengerPo {
	
	private Integer id;
	
	private Integer papersID;              //证件ID
	
	private Integer educationDegreeID;     //文化程度ID
	
	private Integer genderID;              //性别ID
	
	private Integer passengerLevelID;      //旅客级别ID
	
	private Integer nationID;              //民族ID
	
	private Integer thingReasonID;         //事由

	private String name;                   //姓名
	
	private String papersNumber;           //证件号码
	
	private String birthDate;              //出生日期
	
	private String licenceIssuingAuthorty; //发证机关
	
	private String unitsOrAddress;         //单位或住址
	
	private String papersValidity;         //证件有效期
	
	private String profession;             //职业
	
	private String whereAreFrom;           //从何处来
	
	private String whereToGo;              //到哪里去
	
	private String contactPhoneNumber;     //联系电话
	
	private String remarks;                //备注
	
	
	//扩展字段
	
	private String papersName;             //证件名称
	
	private String educationDegreeName;    //文化程度名称
	
	private String genderName;             //姓别
	
	private String passengerLevelName;     //旅客级别名称
	
	private String nationName;             //民族名称
	
	private String thingReasonName;        //民族名称
	
	
	//额外传参数需要
	private Integer lvKeID;        //旅客id
	
	private Integer stayRegisterID;        //住宿登记id
	


	
	
}
