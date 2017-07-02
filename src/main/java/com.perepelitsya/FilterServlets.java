package com.perepelitsya;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;
/**
 * Created by Andriu on 7/2/2017.
 */
public class FilterServlets implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, FilterChain chain) throws IOException, ServletException {


        String ipAddress = request.getRemoteAddr();
        String dateTime = new Date().toString();

        System.out.println("\n\n==============================================\n");

        System.out.println("Request...");
        System.out.println("Date/Time: " + dateTime);
        System.out.println("IP:" + ipAddress);

        System.out.println("\n==============================================\n");

        chain.doFilter(request, response);
    }

    public void destroy() {

    }
}
