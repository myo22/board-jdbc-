package com.example.board.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@ToString
public class PageResponse<E> {
    private int page;
    private int  size;
    private int total;

    private int start;
    private int end;

    private boolean prev;
    private boolean next;

    private List<E> dtolist;

    @Builder(builderMethodName = "wtihAll")
    public PageResponse(PageRequest pageRequest, List<E> dtolist, int total){
        this.page = pageRequest.getPage();
        this.size = pageRequest.getSize();

        this.total = total;
        this.dtolist = dtolist;

        this.end = (int)(Math.ceil(this.page / 10.0)) * 10;

        this.start = this.end - 9;

        int last = (int)(Math.ceil((total/(double)size)));

        this.end = end > last ? last: end;

        this.prev = this.start > 1;

        this.next = total > this.end * this.size;
    }
}
