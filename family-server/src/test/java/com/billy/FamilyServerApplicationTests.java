package com.billy;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.billy.system.entity.FamilyMembers;
import com.billy.system.mapper.MembersMapper;
import com.billy.system.service.MembersManageService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FamilyServerApplicationTests {

	@Autowired
	private MembersMapper membersMapper;

	@Autowired
	private MembersManageService manageService;

	@Test
	public void getSelect(){

		List<FamilyMembers> familyMembers = membersMapper.selectList(null);
		Assert.assertEquals(1, familyMembers.size());
		familyMembers.forEach(System.out::println);
	}

	@Test
	public void testPage(){

		Page<FamilyMembers> page = new Page<>();
		IPage<FamilyMembers> membersByPage = manageService.getMembersByPage(page);
		System.out.println(membersByPage.getRecords());
	}

}
