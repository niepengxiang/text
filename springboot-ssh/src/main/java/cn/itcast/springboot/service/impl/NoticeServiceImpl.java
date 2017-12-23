/**   
 * @Title: NaticeServiceImpl.java 
 * @Package cn.itcast.springboot.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 聂 鹏翔
 * @date 2017年12月22日 下午7:37:59 
 * @version V1.0   
 */

package cn.itcast.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cn.itcast.springboot.dao.NoticeDao;
import cn.itcast.springboot.entity.Notice;
import cn.itcast.springboot.service.NoticeService;

/**
 * @ClassName: NaticeServiceImpl
 * @Description: 业务层实现类
 * @author 聂 鹏翔
 * @date 2017年12月22日 下午7:37:59
 * 
 */
@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeDao noticeDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.itcast.springboot.service.NoticeService#findByPage(java.lang.Integer,
	 * java.lang.Integer)
	 */
	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		Pageable pageable = new PageRequest((page - 1), rows);
		Page<Notice> pageDate = noticeDao.findAll(pageable);
		Long totalElements = pageDate.getTotalElements();
		int total = totalElements.intValue();
		List<Notice> list = pageDate.getContent();
		map.put("total", total);
		map.put("rows", list);

		return map;
	}

}
