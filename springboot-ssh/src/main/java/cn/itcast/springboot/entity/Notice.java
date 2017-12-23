/**   
 * @Title: Natice.java 
 * @Package cn.itcast.springboot.pojo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 聂 鹏翔
 * @date 2017年12月22日 下午7:35:43 
 * @version V1.0   
 */

package cn.itcast.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName: Natice
 * @Description: pojo
 * @author 聂 鹏翔
 * @date 2017年12月22日 下午7:35:43
 * 
 */
@Entity
@Table(name = "notice")
public class Notice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "TITLE")
	private String title;
	@Column(name = "CONTENT")
	private String content;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Natice [id=" + id + ", title=" + title + ", content=" + content + "]";
	}

}
