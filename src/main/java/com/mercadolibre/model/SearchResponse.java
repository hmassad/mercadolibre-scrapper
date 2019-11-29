package com.mercadolibre.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SearchResponse {

    @JsonProperty("site_id")
    private String siteId;

    @JsonProperty("query")
    private String query;

    @JsonProperty("paging")
    private Paging paging;

    @JsonProperty("results")
    private List<ItemResponse> results = new ArrayList<>();

    public String getSiteId() {
        return siteId;
    }

    public SearchResponse setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public SearchResponse setQuery(String query) {
        this.query = query;
        return this;
    }

    public Paging getPaging() {
        return paging;
    }

    public SearchResponse setPaging(Paging paging) {
        this.paging = paging;
        return this;
    }

    public List<ItemResponse> getResults() {
        return results;
    }

    public SearchResponse setResults(List<ItemResponse> results) {
        this.results = results;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchResponse that = (SearchResponse) o;
        return siteId.equals(that.siteId) &&
                query.equals(that.query) &&
                paging.equals(that.paging) &&
                results.equals(that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, query, paging, results);
    }

    @Override
    public String toString() {
        return "SearchResponse{" +
                "siteId='" + siteId + '\'' +
                ", query='" + query + '\'' +
                ", paging=" + paging +
                ", results=" + results +
                '}';
    }
}
