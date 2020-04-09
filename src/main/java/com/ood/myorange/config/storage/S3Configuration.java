package com.ood.myorange.config.storage;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * Created by Guancheng Lai
 */
@Component
@Data
@ToString
@AllArgsConstructor
public class S3Configuration implements StorageConfiguration, java.io.Serializable {
    private String awsAccessKeyId;
    private String awsSecretAccessKey;
    private String region;
    private String bucketName;

    public S3Configuration() {
        awsAccessKeyId = "Default";
        awsSecretAccessKey = "Default";
        region = "Default";
        bucketName = "Default";
    }

    public S3Configuration(S3Configuration s3Config) {
        awsAccessKeyId = s3Config.getAwsAccessKeyId();
        awsSecretAccessKey = s3Config.getAwsSecretAccessKey();
        region = s3Config.getRegion();
        bucketName = s3Config.getBucketName();
    }
}