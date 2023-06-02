//package com.example.board.dto;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.Positive;
//import java.util.List;
//
//
//@Builder
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class PageRequest {
//
//    @Builder.Default
//    @Min(value =  1)
//    @Positive // 양수만 가능
//    private int page = 1;
//
//    @Builder.Default
//    @Min(value = 10)
//    @Max(value = 100)
//    @Positive
//    private int  size = 10;
//
//    public int getSkip(){
//        return (page - 1) * 10;
//    }
//
//
//
//}
