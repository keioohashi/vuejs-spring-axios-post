package com.example.vuejsaxios.ac;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/goods")
public class GoodsController {

	/**
	* 商品情報受信
	* @return 結果
	*/
	@RequestMapping(value = "/recieve", method = RequestMethod.POST)
	public Goods recieve( @RequestBody Goods goods ){
		return goods;
	}
}

