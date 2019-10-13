package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bean.Goods;
import com.example.demo.service.GoodsService;

@Controller
public class GoodsController {
	@Resource
	private GoodsService service; 
	@Resource
	private RedisTemplate<String, Object> redisTemplate;
	@RequestMapping("list")
	public Object goodsList(Model model) {
		List<Goods>list=service.getgoodsList();
		model.addAttribute("list", list);
		return "list";
	}
	@RequestMapping("toadd")
	public Object toadd(Model model) {
		
		return "add";
	}
	@RequestMapping("addgoods")
	public Object addgoods(Goods goods) {
		ListOperations<String, Object> opsForList = redisTemplate.opsForList();
		Long leftPush = opsForList.leftPush("goodslist", goods);
		System.err.println(leftPush);
		return "redirect:list";
	}
}
