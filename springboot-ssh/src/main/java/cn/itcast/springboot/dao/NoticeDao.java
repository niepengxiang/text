/**   
 * @Title: NoticeDao.java 
 * @Package cn.itcast.springboot.dao 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 聂 鹏翔
 * @date 2017年12月22日 下午9:23:48 
 * @version V1.0   
 */

package cn.itcast.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import cn.itcast.springboot.entity.Notice;

/** 
 * @ClassName: NoticeDao 
 * @Description: 持久层接口 
 * @author 聂 鹏翔
 * @date 2017年12月22日 下午9:23:48 
 *  
 */

@Repository
public interface NoticeDao extends JpaRepository<Notice, Integer>,JpaSpecificationExecutor<Notice>{
}
