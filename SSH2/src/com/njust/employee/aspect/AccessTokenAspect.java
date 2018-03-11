package com.njust.employee.aspect;


import com.opensymphony.xwork2.ActionContext;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccessTokenAspect {

    // @Around("@aspect(com.njust.employee.aspect.AccessToken)")
    public Object around(ProceedingJoinPoint pjp) throws  Throwable{
       if (ActionContext.getContext().getSession().get("existEmployee")==null){
           System.out.println("身份认证失败");
           return null;
       }else{
           Object object = pjp.proceed();
           System.out.println("身份认证成功");
           return object;
       }
    }
}
