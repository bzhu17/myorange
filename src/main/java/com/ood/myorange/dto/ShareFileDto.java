package com.ood.myorange.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.ood.myorange.constant.enumeration.FileType;
import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by Linkun on 4/13/20.
 */

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShareFileDto {
    private int id;
    private String name;
    private FileType type;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp deadline;
    private int limitDownloadTimes;
    private int DownloadTimes;
    private boolean hasPassword;
    private String shareKey;
    private String password;
    private String size;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp createDate;

}
