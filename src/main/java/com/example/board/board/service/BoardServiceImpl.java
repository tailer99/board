package com.example.board.board.service;

import java.util.List;

import com.example.board.board.dto.BoardDto;
import com.example.board.board.mapper.BoardMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{
    
    @Autowired
    private BoardMapper boardMapper;

    @Override
    public List<BoardDto> selectBoardList() throws Exception{
        return boardMapper.selectBoardList();
    }

    @Override
    public void insertBoard(BoardDto board) throws Exception{
        boardMapper.insertBoard(board);
    }

    @Override
    public BoardDto selectBoardDetail(int boardIdx){
        try {
            boardMapper.updateHitCount(boardIdx);
        } catch (Exception e) {
            e.printStackTrace();
        }

        BoardDto board=null;
        try {
            board = boardMapper.selectBoardDetail(boardIdx);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return board;
    }

    @Override
    public void updateBoard(BoardDto board) throws Exception{
        boardMapper.updateBoard(board);
    }

    @Override
    public void deleteBoard(int boardIdx) throws Exception{
        boardMapper.deleteBoard(boardIdx);
    }
}
