package com.lizhihui.camile.app.system.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by lizhihui on 11/05/2017.
 */
public class EncodingFilter implements Filter {

    protected String encoding = null;

    public void destroy() {
        this.encoding = null;
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding(this.encoding);
        resp.setCharacterEncoding(this.encoding);
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        this.encoding = config.getInitParameter("encoding");

        if (null == this.encoding) this.encoding = "UTF-8";
    }

}
