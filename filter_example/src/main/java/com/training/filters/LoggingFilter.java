package com.training.filters;
import java.util.logging.*;
import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class LoggingFilter
 */
@WebFilter(urlPatterns="/*",dispatcherTypes = DispatcherType.FORWARD)
public class LoggingFilter implements Filter {

	Logger log=Logger.getLogger(this.getClass().getName());
	
	
    /**
     * Default constructor. 
     */
    public LoggingFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		HttpServletRequest req=(HttpServletRequest) request;
		String reqUrl = req.getRequestURL().toString();
		log.info("URL"+reqUrl);
		
		chain.doFilter(request, response);
		
		HttpServletResponse res=(HttpServletResponse) response;
		
		String contentType=res.getContentType();
		log.info("content type   "+contentType);
		res.getWriter().println("<h2>Transformed by Filter</h2>");
		res.setHeader("custom", "Set By Filter");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
