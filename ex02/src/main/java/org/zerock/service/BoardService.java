package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardService {
	
	public void register(BoardVO board);
	
	public BoardVO get(Long id);
	
	public boolean modify(BoardVO board);
	
	public boolean remove(Long id);
	
//	public List<BoardVO> getList();
	public List<BoardVO> getList(Criteria cri);
}
