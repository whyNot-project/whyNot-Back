package com.whyNot.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.whyNot.model.dao.CrewDao;
import com.whyNot.model.dto.Crew;
import com.whyNot.model.dto.SearchCondition;

@Service
public class CrewServiceImpl implements CrewService{

	@Autowired
	private CrewDao cDao;

	@Override
	public int registCrew(Crew crew) {
		return cDao.registCrew(crew);
	}

	@Override
	public int updateCrew(Crew crew) {
		return cDao.updateCrew(crew);
	}

	@Override
	public int deleteUserCrew(int crewId) {
		return cDao.deleteUserCrew(crewId);
	}
	@Override
	public int deleteCrew(int crewId) {
		return cDao.deleteCrew(crewId);
	}
	
	@Override
	public List<Crew> selectCrewAll(){
		return cDao.selectCrewAll();
	}
	
	@Override
	public Crew detailCrew(int crewId) {
		return cDao.detailCrew(crewId);
	}

	@Override
	public List<Crew> searchByCondition(SearchCondition condition) {
		return cDao.searchByCondition(condition);
	}

	@Override
	public List<Crew> searchByName(String name) {
		return cDao.searchByName(name);
	}

}
