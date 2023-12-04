package springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class CustomInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("This is preHandle");
		String name = request.getParameter("userEmail");
		System.out.println(name);
		if (name != null && name.isEmpty()) {
			response.setContentType("text/html");
			response.getWriter().println("Email can not be blank...");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This is postHandle...");
		modelAndView.addObject("postHandleMsg", "I am from postHandle.");
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This is afterCompletion...");
		super.afterCompletion(request, response, handler, ex);
	}
}
