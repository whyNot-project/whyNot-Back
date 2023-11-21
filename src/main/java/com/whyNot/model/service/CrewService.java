package com.whyNot.model.service;

import java.util.List;

import com.whyNot.model.dto.Crew;
import com.whyNot.model.dto.SearchCondition;

public interface CrewService {
	
	//등록
	int registCrew(Crew crew);
		
	//크루 수정
	int updateCrew(Crew crew);
	
	//크루 삭제
	int deleteUserCrew(int crewId);
	int deleteCrew(int crewId);
	
	//크루 전체목록
	List<Crew> selectCrewAll();
	
	//크루 상세
	Crew detailCrew(int crewId);
	
	//크루 검색
	List<Crew> searchByCondition(SearchCondition condition);
	
	//크루 이름으로 검색
	List<Crew> searchByName(String name);

}
