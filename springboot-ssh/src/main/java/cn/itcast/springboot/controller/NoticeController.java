/**   
 * @Title: NoticeController.java 
 * @Package cn.itcast.springboot.controller 
 * @Description: 控制层
 * @author 聂 鹏翔
 * @date 2017年12月22日 下午6:50:46 
 * @version V1.0   
 */

package cn.itcast.springboot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.service.NoticeService;

/**
 * @ClassName: NoticeController
 * @Description: 控制器
 * @author 聂 鹏翔
 * @date 2017年12月22日 下午6:50:46
 * 
 */

@RestController
public class NoticeController {

	@Autowired
	private NoticeService noticeService;

	@PostMapping("findByPage")
	public Map<String, Object> findByPage(@RequestParam("page") Integer page, 
										  @RequestParam("rows") Integer rows) {

		return noticeService.findByPage(page,rows);
	}
}
