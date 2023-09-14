package com.hotel.myhotel.pojo;

import lombok.Data;

@Data
public class CommodityPo {
	
	private Integer id;
	
	private Integer commodityTypeID;
	
	private Integer uOMID;
	
	private String commodityName;
	
	private String salePrice;
	
	
	//宽展字段
	private String commodityTypeName;  //商品类别名称
	
	private String uOMName;  //计量单位名称
	
	
	
	
	
	
	

}
