package com.service;

import com.entity.Blog;

import java.util.List;

public interface IBlogService {
    /**
     * 获取所有Blog
     *
     * @return
     */
    List<Blog> getBlogs();

    /**
     * 根据ID获取Blog
     *
     * @param id
     */
    void deleteBlog(long id);
}
