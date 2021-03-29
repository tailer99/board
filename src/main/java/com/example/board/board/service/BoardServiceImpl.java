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
        System.out.println(">>> BoardServiceImpl.selectBoardList Start");
        return boardMapper.selectBoardList();
    }
}
