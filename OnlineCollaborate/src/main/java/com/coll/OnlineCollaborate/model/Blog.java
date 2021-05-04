//package com.coll.OnlineCollaborate.model;
//
//public class Blog {
//
//}
package com.coll.OnlineCollaborate.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Component
@Entity
public class Blog extends DomainResponse implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int blogId;
	String blogTitle, blogContent;
	LocalDate blogPosted;
	String status;
	int noOfLikes, noOfComments, noOfViews;
	int userId;
	String username;
	@OneToMany(mappedBy="blog", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JsonManagedReference
	List<BlogComments> blogComments;
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getBlogContent() {
		return blogContent;
	}
	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}
	public LocalDate getBlogPosted() {
		return blogPosted;
	}
	public void setBlogPosted(LocalDate blogPosted) {
		this.blogPosted = blogPosted;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getNoOfLikes() {
		return noOfLikes;
	}
	public void setNoOfLikes(int noOfLikes) {
		this.noOfLikes = noOfLikes;
	}
	public int getNoOfComments() {
		return noOfComments;
	}
	public void setNoOfComments(int noOfComments) {
		this.noOfComments = noOfComments;
	}
	public int getNoOfViews() {
		return noOfViews;
	}
	public void setNoOfViews(int noOfViews) {
		this.noOfViews = noOfViews;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<BlogComments> getBlogComments() {
		return blogComments;
	}
	public void setBlogComments(List<BlogComments> blogComments) {
		this.blogComments = blogComments;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

//Generate getter and setter methods
	
	
}
