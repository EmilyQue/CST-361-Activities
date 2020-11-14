package util;
import java.io.Serializable;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LoggingInterceptor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4375205512917543300L;

	@AroundInvoke
	public Object methodInterceptor(InvocationContext ctx) throws Exception{
		System.out.println("********** Intercepting call to method: " + ctx.getTarget().getClass() + "." + ctx.getMethod().getName() + "()");
		return ctx.proceed();
	}
}
