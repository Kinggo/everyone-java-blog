/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zuoxiaolong.blog.sdk;

import com.google.gson.reflect.TypeToken;
import com.zuoxiaolong.blog.common.utils.HttpUtils;
import com.zuoxiaolong.blog.common.utils.JsonUtils;
import com.zuoxiaolong.blog.model.dto.cache.ArticleRankResponseDto;
import com.zuoxiaolong.blog.sdk.util.BlogSdkPropertiesUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Boren You
 * @date 2016/5/26 10:52
 * @since 1.0.0
 */
public interface BlogSdk {

    /**
     * 从文章排名接口中获取文章数据
     *
     * @return
     */
    static List<ArticleRankResponseDto> getArticleRank() throws Exception {
        String responseString = HttpUtils.sendHttpRequest("GET", BlogSdkPropertiesUtil.getProperty("articleRankUrl"));
        ArrayList<ArticleRankResponseDto> list = JsonUtils.fromJson(responseString, new TypeToken<List<ArticleRankResponseDto>>(){}.getType());
        return list;
    }

}