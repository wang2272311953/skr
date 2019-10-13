 package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.bean.Goods;
import com.example.demo.mapper.Goodsmapper;

@Service
public class GoodsServiceImpl implements GoodsService {
	@Resource
	private Goodsmapper goodsmapper;

	@Override
	public List<Goods> getgoodsList() {
		// TODO Auto-generated method stub
		return goodsmapper.getgoodsList();
	}
}
