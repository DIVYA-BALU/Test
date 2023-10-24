package com.repo.project1;//your package name

import java.io.InputStream;
import java.util.Properties;

import org.hibernate.cfg.*;

//import javax.security.auth.login.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App p=new App();
        Configuration c=new Configuration().addProperties( p.loadConfig());
        System.out.println(c);
        }
    public  Properties loadConfig() {
        Properties properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("hibernate.properties")) {
            properties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }
}
