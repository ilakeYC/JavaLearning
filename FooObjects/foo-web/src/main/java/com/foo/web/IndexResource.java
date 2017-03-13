package com.foo.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author ilakeyc
 * @since 2017/3/13
 */

@Path("/")

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class IndexResource extends BaseResource {
    private static final Log LOG = LogFactory.getLog(IndexResource.class);


    @GET
    @Produces(MediaType.TEXT_HTML)
    public String index() {
        return "Hello World!";
    }
}
