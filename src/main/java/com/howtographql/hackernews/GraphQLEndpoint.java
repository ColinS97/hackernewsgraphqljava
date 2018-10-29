package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.SchemaParser;
import javax.servlet.annotation.WebServlet;
import graphql.servlet.SimpleGraphQLServlet;

@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet{
    public GraphQLEndpoint() {
        super(SchemaParser.newParser()
        .file("schema.graphqls")// parses the schema file
        .build()
        .makeExecutableSchema());
    }
}
