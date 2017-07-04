package cn.mldn.microcloud.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.mldn.vo.Company;

@RestController
public class CompanyRest {
	@RequestMapping(value="/company/get/{title}",method=RequestMethod.GET)
	public Object get(@PathVariable("title") String title) {
		Company vo = new Company() ;
		vo.setTitle(title);
		vo.setNote("www.mldn.cn");
		return vo ;
	}
}
