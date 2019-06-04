package com.powerbridge.saas;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.powerbridge.saas.dao.PbUserMapper;
import com.powerbridge.saas.entity.PbUser;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisPlusCrudApplicationTests {

	@Autowired
	private PbUserMapper pbUserMapper;
	
	/**
	 * 插入数据
	 * @param 
	 * @return
	 * wenhaosun@powerbridge.com
	 * 2019年6月4日 上午10:53:29
	 */
    @Test
    public void insertLoads() {
    	PbUser pbUser = new PbUser();
    	pbUser.setUserName("test1");

        Integer insert = pbUserMapper.insert(pbUser);
        System.out.println("return insert value = " + insert);
    }
    
    /**
     * 根据id更新
     * @param 
     * @return
     * wenhaosun@powerbridge.com
     * 2019年6月4日 上午10:57:01
     */
    @Test
    public void updateByIdLoads() {
    	PbUser pbUser = new PbUser();
    	pbUser.setId(3);
    	pbUser.setUserPwd("123");

        Integer insert = pbUserMapper.updateById(pbUser);
        System.out.println("return insert value = " + insert);
    }
    
    /**
     * 通过条件修改数据
     * @param 
     * @return
     * wenhaosun@powerbridge.com
     * 2019年6月4日 上午11:20:21
     */
    @Test
    public void updateByWrapper() {
    	
    	//要修改的对象
    	PbUser pbUser = new PbUser();
    	pbUser.setUserPwd("2222");

    	//查询条件
    	UpdateWrapper<PbUser> wrapper = new UpdateWrapper<PbUser>();
    	wrapper.eq("user_name", "test1");
    	pbUserMapper.update(pbUser, wrapper);
    }
    
    
    /**
     * 通过条件进行实体list查询
     * @param 
     * @return
     * wenhaosun@powerbridge.com
     * 2019年6月4日 上午10:59:28
     */
    @Test
    public void selectByMapLoads() {
        HashMap<String, Object> map = new HashMap<>(16);
        map.put("user_name", "test1");
        List<PbUser> list = pbUserMapper.selectByMap(map);
        System.out.println("return selectByMap value = " + list);
    }
    
    /**
     * 分页查询
     * @param 
     * @return
     * wenhaosun@powerbridge.com
     * 2019年6月4日 上午11:00:38
     */
    @Test
    public void selectPageLoads() {
        Page<PbUser> page = new Page<>(1,5);
        IPage<PbUser> lstUser = pbUserMapper.selectPage(page, null);
        System.out.println("list= " + lstUser.getRecords() + ",total=" + lstUser.getTotal());
    }
	
}
