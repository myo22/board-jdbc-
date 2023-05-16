package com.example.board.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardService {
    @Transactional
    public void addBoard(Integer userId, String title, String content) {
    }
}
