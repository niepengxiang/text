/**   
 * @Title: Application.java 
 * @Package cn.itcast.springboot 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 聂 鹏翔
 * @date 2017年12月22日 下午6:53:16 
 * @version V1.0   
 */

package cn.itcast.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 
 * @ClassName: Application 
 * @Description: 启动类 
 * @author 聂 鹏翔
 * @date 2017年12月22日 下午6:53:16 
 *  
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//创建 springApplication 应用对象
		SpringApplication application = new SpringApplication(Application.class);
		
		application.run(args);
		
	}
}
