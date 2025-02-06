//package com.bungeobbang.backend.common.config;
//
//import com.amazonaws.auth.AWSCredentials;
//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.AmazonS3ClientBuilder;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import software.amazon.awssdk.auth.credentials.AwsCredentials;
//import software.amazon.awssdk.regions.Region;
//import software.amazon.awssdk.services.s3.S3Client;
//
//
//@Configuration
//public class S3Config {
//
//    @Value("${spring.cloud.aws.credentials.accessKey}")
//    private String accessKey;
//
//    @Value("${spring.cloud.aws.credentials.secretKey}")
//    private String accessSecret;
//
//    @Value("${spring.cloud.aws.region.static}")
//    private String region;
//
//    @Bean
//    public S3Client amazonS3() {
//        return S3Client.builder()
//                .credentialsProvider(this::awsCredentials)
//                .region(Region.of(region))
//                .build();
//    }
//
//    private AwsCredentials awsCredentials() {
//        return new AwsCredentials() {
//            @Override
//            public String accessKeyId() {
//                return accessKey;
//            }
//
//            @Override
//            public String secretAccessKey() {
//                return accessSecret;
//            }
//        };
//    }
//}
