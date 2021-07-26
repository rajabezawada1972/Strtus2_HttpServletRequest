package com.raja.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport implements ServletRequestAware {
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	HttpServletRequest request;
	  public void setServletRequest(HttpServletRequest req) {
	    request = req;
	  }

	  @Override
	  public String execute() throws Exception {
	  ActionContext ctx = ActionContext.getContext();
	  HttpServletRequest request = (HttpServletRequest) ctx.get(ServletActionContext.HTTP_REQUEST);
	  String code = request.getParameter("code");
	  String name = request.getParameter("name");
	  String city = request.getParameter("city");
	  String salary = request.getParameter("salary");
	  request.setAttribute("code", code);
	  request.setAttribute("name", name);
	  request.setAttribute("city", city);
	  request.setAttribute("salary", salary);
	
	  return SUCCESS;
	  }
	}
