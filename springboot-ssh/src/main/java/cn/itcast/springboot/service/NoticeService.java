/**   
 * @Title: NaticeService.java 
 * @Package cn.itcast.springboot.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 聂 鹏翔
 * @date 2017年12月22日 下午7:37:10 
 * @version V1.0   
 */

package cn.itcast.springboot.service;

import java.util.Map;

/**
 * @ClassName: NaticeService
 * @Description: 业务层接口
 * @author 聂 鹏翔
 * @date 2017年12月22日 下午7:37:10
 * 
 */

public interface NoticeService {

	/** 
	 * @Title: findByPage 
	 * @Description: 分页查询
	 * @return    设定文件 
	 * @return Map<String,Object>    返回类型 
	 * @throws 
	 */
	
	Map<String, Object> findByPage(Integer page,Integer rows);
}
