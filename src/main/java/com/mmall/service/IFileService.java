package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by zeng.chengquan on 2018/11/27 0027.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
