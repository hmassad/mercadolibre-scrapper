package com.mercadolibre.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class ScrollResponse {
    @JsonProperty("scroll_id")
    private String scrollId;

    public String getScrollId() {
        return scrollId;
    }

    public ScrollResponse setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScrollResponse that = (ScrollResponse) o;
        return Objects.equals(scrollId, that.scrollId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scrollId);
    }

    @Override
    public String toString() {
        return "ScrollResponse{" +
                "scrollId='" + scrollId + '\'' +
                '}';
    }
}
