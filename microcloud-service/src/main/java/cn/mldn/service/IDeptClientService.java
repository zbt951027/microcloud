package cn.mldn.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.mldn.commons.config.FeignClientConfig;
import cn.mldn.service.fallback.IDeptClientServiceFallbackFactory;
import cn.mldn.vo.Dept;
@FeignClient(value = "MICROCLOUD-ZUUL-GATEWAY", configuration = FeignClientConfig.class, fallbackFactory = IDeptClientServiceFallbackFactory.class)
public interface IDeptClientService {
	@RequestMapping(method = RequestMethod.GET, value = "/mldn-proxy/dept-proxy/dept/get/{id}")
	public Dept get(@PathVariable("id") long id);
	@RequestMapping(method = RequestMethod.GET, value = "/mldn-proxy/dept-proxy/dept/list")
	public List<Dept> list();
	@RequestMapping(method = RequestMethod.POST, value = "/mldn-proxy/dept-proxy/dept/add")
	public boolean add(Dept dept);
}
