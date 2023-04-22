package ltd.newbee.mall.newbeemall.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.GoodsDetailService;
import ltd.newbee.mall.newbeemall.util.PageUtil;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class TestController {
	
	//方法1    Postman: GET + QueryParameters
	@Resource
	private GoodsDetailService goodsDetailService;
	
	@GetMapping("/goods/detail")
    @ResponseBody
    public Result getgoodsDetail(long goodsId,String name) {
        return ResultGenerator.genSuccessResult(goodsDetailService.findGoodsDetailsByGoodsId(goodsId));
    }
	
	//方法2  Postman:POST
	/**
	 * restful风格的参数请求
	 * http://localhost:8080/goods/detail/review/222222
	 * @param id
	 */
	
	@RequestMapping(value = "/ec/cat/{category}/{level2Category}/{level3Category}/{pageNo}", method = RequestMethod.GET)
	@ResponseBody
	public Result queryProduct(@PathVariable("category") String category,
			@PathVariable("level2Category") String level2Category,
			@PathVariable(required = false,value="level3Category") String level3Category,
			@PathVariable(required = false,value="pageNo") int pageNo,String orderBy) {
	// ...业务处理
		System.out.println(orderBy);
		HashMap<String,Object> map = new HashMap<String,Object>();
		int limit = 3;
	
		PageUtil util = new PageUtil(pageNo, orderBy, limit);
		util.put("category", category);
		System.out.println(util.offSet);
		
		return ResultGenerator.genSuccessResult(util);
	}
	
	@RequestMapping(value = "/queryProductByJsonData", method = RequestMethod.GET)
	@ResponseBody
	public Result queryProductByJsonData(@RequestBody Map<String,Object> map) {
		// ...业务处理
	
		PageUtil util = new PageUtil(map);
		
		return ResultGenerator.genSuccessResult(util);
	}
	
	@RequestMapping(value = "/sub/categories", method = RequestMethod.GET)
	@ResponseBody
	public Result getSubCategories(int categoryId) {
		// ...业务处理
	
		
		
		return ResultGenerator.genSuccessResult(categoryId);
	}
	
	@RequestMapping(value = "ec/cat/{category1}/{category2}/{category3}", method = RequestMethod.POST)
	@ResponseBody
	public Result test(@PathVariable("category1") String category,@PathVariable("category2") String category2,@PathVariable("category3") String category3) {
	// ...业务处理
	return ResultGenerator.genSuccessResult(category);
	}
	
	//方法3  Postman:DELETE   Body-form-data
	@DeleteMapping("/goods/detail/review")
	@ResponseBody
	public Result review(@RequestParam(value = "reviewId", required = true) long reviewId) {
	System.out.println(reviewId);
	return ResultGenerator.genSuccessResult(reviewId);
	}

	@CrossOrigin(origins="http://localhost:3000")
	@PostMapping("/todo")
	@ResponseBody
	public Result review(@RequestBody Map map) {
		System.out.println(map);
		return ResultGenerator.genSuccessResult(map);
	}

	

}
