package app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.mapper.AppListMapper;
import app.pojo.AppList;
import app.service.AppListService;
@Service
public class AppListServiceImpl implements AppListService{
	
	@Autowired
	private AppListMapper appListMapper;
	
	@Override
	public List<AppList> selectAppList() {
		List<AppList> list = appListMapper.selectAppList();
		return list;
	}

}
