package app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import app.pojo.AppList;
import app.service.AppListService;


@Controller
public class BasicController {

	@Autowired
	private AppListService appListService;
	
	/**
	 * 图片列表
	 * @author cewin
	 * @email cewin95@foxmaill.com
	 * @version 1.0
	 * @date 2017年9月13日	下午8:01:47
	 * @param callback
	 * @return
	 */
	@RequestMapping("/applist.action")
	@ResponseBody
	public Object getAppList(String callback,HttpSession httpSession) {
		List<AppList> list = appListService.selectAppList();
		MappingJacksonValue mjv=new MappingJacksonValue(list);
		mjv.setJsonpFunction(callback);
		return mjv;
		
	}
	
	

}
