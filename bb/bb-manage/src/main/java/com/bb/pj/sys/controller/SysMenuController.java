package com.bb.pj.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bb.pj.common.vo.JsonResult;
import com.bb.pj.sys.entity.SysMenu;
import com.bb.sys.service.SysMenuService;

@Controller
@RequestMapping("/menu/")
public class SysMenuController {


	@Autowired
	private SysMenuService sysMenuService;
	@RequestMapping(value="doFindObjects")
	@ResponseBody
	public JsonResult doFindObjects(){
		System.out.println(sysMenuService.findObjects());
		return new JsonResult(sysMenuService.findObjects());
	}
	@RequestMapping("doMenuListUI")
	public String doMenuListUI(){
		return "sys/menu_list";
	}
	@RequestMapping("doFindZtreeMenuNodes")
	@ResponseBody
	public JsonResult doFindZtreeMenuNodes(){
		return new JsonResult(
				sysMenuService.findZtreeMenuNodes());
	}
	@RequestMapping("doMenuEditUI")
	public String doMenuEditUI(){
		return "sys/menu_edit";
	}
	@RequestMapping("doSaveObject")
	@ResponseBody
	public JsonResult doSaveObject(SysMenu entity){
		sysMenuService.saveObject(entity);
		return new JsonResult("save ok");
	}
	@RequestMapping("doUpdateObject")
	@ResponseBody
	public JsonResult doUpdateObject(SysMenu entity){
	    sysMenuService.updateObject(entity);
	    return new JsonResult("update ok");
	}
	 
}