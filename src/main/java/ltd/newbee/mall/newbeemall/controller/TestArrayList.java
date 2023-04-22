package ltd.newbee.mall.newbeemall.controller;



import java.util.ArrayList;
import java.util.List;

import ltd.newbee.mall.newbeemall.vo.GoodsReviewVO;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<GoodsReviewVO> list = new ArrayList<GoodsReviewVO>();
		GoodsReviewVO vo = new GoodsReviewVO();
		vo.setGoodsId(1111L);
		vo.setContent("sssssssss");
		list.add(vo);
		GoodsReviewVO vo2 = new GoodsReviewVO();
		vo2.setGoodsId(1112L);
		vo2.setContent("sssxxxxxxxxxxxxxssssss");
		list.add(vo2);
		
		String s = "";
		for (GoodsReviewVO goodsReviewVO : list) {
			s = s + "["+ goodsReviewVO.getGoodsId() + "," + goodsReviewVO.getContent() +"]";
		}
		System.out.println(s);
	}

}
