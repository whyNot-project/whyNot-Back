package com.whyNot.model.dao;

import java.util.List;

import com.whyNot.model.dto.Crew;
import com.whyNot.model.dto.SearchCondition;

public interface CrewDao {
	
	//등록
	int registCrew(Crew crew);
		
	//크루 수정
	int updateCrew(Crew crew);
	
	//크루 삭제
	int deleteCrew(Crew crew);
	
	//크루 검색
	List<Crew> searchByCondition(SearchCondition condition);

}
