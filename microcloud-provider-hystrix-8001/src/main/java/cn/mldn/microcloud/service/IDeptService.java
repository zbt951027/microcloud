package cn.mldn.microcloud.service;

import java.util.List;

import cn.mldn.vo.Dept;

public interface IDeptService {
	public Dept get(long id) ;
	public boolean add(Dept dept) ;
	public List<Dept> list() ;
}
