//package com.demo.graduation;
//
//import java.io.File;
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.mybatis.generator.api.MyBatisGenerator;
//import org.mybatis.generator.config.Configuration;
//import org.mybatis.generator.config.xml.ConfigurationParser;
//import org.mybatis.generator.exception.InvalidConfigurationException;
//import org.mybatis.generator.exception.XMLParserException;
//import org.mybatis.generator.internal.DefaultShellCallback;
//import org.springframework.core.io.ClassPathResource;
//
//public class MBG {
//    public static void main(String[] args) {
//        List<String> warnings = new ArrayList<String>();
//        boolean overwrite = true;
//        File configFile = null;//这里是加载mybatis generator自动生成的配置文件，注意文件名不要弄错
//        try {
//            configFile = new ClassPathResource("mybatis-generator.xml").getFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        ConfigurationParser cp = new ConfigurationParser(warnings);
//        Configuration config;
//        try {
//            config = cp.parseConfiguration(configFile);
//            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
//            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//            myBatisGenerator.generate(null);
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (XMLParserException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (InvalidConfigurationException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//    }
//}