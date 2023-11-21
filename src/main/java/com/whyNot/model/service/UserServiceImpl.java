package com.whyNot.model.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.whyNot.model.dao.UserDao;
import com.whyNot.model.dto.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao uDao;

	@Value("${upload.path}")
	private String UPLOAD_PATH;

	@Override
	public Map<String, Object> login(User user) {
		return uDao.login(user);
	}

	@Override
	public Integer registUser(User user, MultipartFile imgFile) {
		UUID uuid = UUID.randomUUID();
		String fileName = uuid.toString() + "_" + imgFile.getOriginalFilename();
		
		// 디렉토리가 존재하지 않으면 생성
		File imgFolder = new File(UPLOAD_PATH + "/static/img");
	    if (!imgFolder.exists()) {
	        imgFolder.mkdirs();
	    }
	    
		File profileImg = new File(UPLOAD_PATH + "/static/img", fileName);
		
		try {
			imgFile.transferTo(profileImg);
			user.setProfileImgName(fileName);
			user.setProfileImgPath(UPLOAD_PATH + "/static/img" + "/" + fileName);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return uDao.registUser(user);
	}

	@Override
	public String getProfileImg(String userId) {
		// TODO Auto-generated method stub
		return uDao.getProfileImg(userId);
	}
	
	// 사용자 정보 (JWT 사용해서 어떻게 가져올지 고민해봐야함
	// 일단 전에 id로 검색하던 대로 작성해둘게요
	@Override
	public List<User> searchById(String id) {
		return uDao.searchById(id);
	}


}
