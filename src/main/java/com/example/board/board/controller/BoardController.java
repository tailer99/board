package com.example.board.board.controller;

import java.util.List;

import com.example.board.board.dto.BoardDto;
import com.example.board.board.service.BoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
    
    @Autowired
    private BoardService boardService;

    @RequestMapping("/board/openBoardList.do")
    public ModelAndView openBoardList() throws Exception{
        System.out.println(">>> BoardController.openBoardList Start");

        ModelAndView mv = new ModelAndView("/board/boardList");

        List<BoardDto> list = boardService.selectBoardList();
        System.out.println(">>> check 2");
        mv.addObject("list", list);
    
        return mv;
    
    }
}
