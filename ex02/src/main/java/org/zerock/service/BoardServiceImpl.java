package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{
	
	//spring 4.3 이상에서 자동 처리
	private BoardMapper mapper;
	
	@Override
	public void register(BoardVO board) { 
		
		log.info("register....." + board);
		
		mapper.insertSelectKey(board);
	}

	@Override
	public BoardVO get(Long id) {
		
		log.info("get......." + id);
		
		return mapper.read(id);
	}

	@Override
	public List<BoardVO> getList() {
	
		log.info("getList.........");
		
		return mapper.getList();
	}
	
	@Override
	public boolean modify(BoardVO board) {
		
		log.info("modify....." + board);
		
		return mapper.update(board) == 1;
	}
	
	@Override
	public boolean remove(Long id) {
		
		log.info("remove....." + id);
		
		return mapper.delete(id) == 1;
	}

//	@Override
//	public List<BoardVO> getList() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
