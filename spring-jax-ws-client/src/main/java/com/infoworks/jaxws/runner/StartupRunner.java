package com.infoworks.jaxws.runner;

import com.infoworks.jaxws.client.ArticleClient;
import com.infoworks.jaxws.config.SoapClientConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        try {
            AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SoapClientConfig.class);
            ArticleClient articleClient = annotationConfigApplicationContext.getBean(ArticleClient.class);
            System.out.println("HelloWorld WSDL & JAX-WS");
            System.out.println(articleClient.getArticle(2).getArticle().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
