package com.ood.myorange.dto;

import lombok.Data;
import lombok.ToString;

/**
 * TODO check API define
 * Created by Chen on 4/15/20.
 */
@Data
@ToString
public class FileUploadDto {
    private String name;
    private Long size;
    private String MD5;
    private Integer dirId;
}