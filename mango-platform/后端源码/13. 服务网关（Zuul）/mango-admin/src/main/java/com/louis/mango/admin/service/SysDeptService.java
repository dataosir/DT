package com.louis.mango.admin.service;

import com.louis.mango.admin.model.SysDept;
import com.louis.mango.core.service.CurdService;

import java.util.List;

/**
 * 机构管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @param userId 
	 * @return
	 */
	List<SysDept> findTree();
}
