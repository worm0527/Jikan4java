package com.github.Doomsdayrs.Jikan4java.types.Support.News;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 * Jikan4java
 * 29 / October / 2018
 *
 * @author github.com/doomsdayrs
 */
public class Article {
    @JsonProperty("url")
    public String url;

    @JsonProperty("title")
    public String title;

    @JsonProperty("date")
    public String date;

    @JsonProperty("author_name")
    public String author_name;

    @JsonProperty("author_url")
    public String author_url;

    @JsonProperty("forum_url")
    public String forum_url;

    @JsonProperty("image_url")
    public String image_url;

    @JsonProperty("comments")
    public int comments;

    @JsonProperty("intro")
    public String intro;

    @Override
    public String toString() {
        return "Article{" +
                "url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", author_name='" + author_name + '\'' +
                ", author_url='" + author_url + '\'' +
                ", forum_url='" + forum_url + '\'' +
                ", image_url='" + image_url + '\'' +
                ", comments=" + comments +
                ", intro='" + intro + '\'' +
                '}';
    }
}
