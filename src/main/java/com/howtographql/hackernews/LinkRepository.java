package com.howtographql.hackernews;

import java.util.ArrayList;
import java.util.List;

public class LinkRepository {
    private final List<Link> links;

    public LinkRepository() {
        links = new ArrayList<>();
        //adding some sample links
        links.add(new Link("www.google.com","cool link"));
        links.add(new Link("www.google2.com","cool link2"));
    }

    public List<Link> getAllLinks() {
        return links;
    }

    public void saveLink(Link link) {
        links.add(link);
    }
}
