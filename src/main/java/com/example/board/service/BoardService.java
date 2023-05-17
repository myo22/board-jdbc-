package com.example.board.service;

import com.example.board.dao.BoardDao;
import com.example.board.dto.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardDao boardDao;

    @Transactional
    public void addBoard(int userId, String title, String content) {
        boardDao.addBoard(userId, title, content);
    }

    @Transactional(readOnly = true) // select만 할때는 readOnly = true하는게 성능상 좋다.
    public int getTotalCount() {
        return boardDao.getTotalCount();
    }

    @Transactional(readOnly = true) // 마찬가지로 읽어오기만 할거니
    public List<Board> getBoards(int page) {
        return boardDao.getBoards(page);
    }

    @Transactional
    public Board getBoard(int boardId) {
        Board board = boardDao.getBoard(boardId);
        boardDao.updateViewCnt(boardId);
        return board;
    }
}
