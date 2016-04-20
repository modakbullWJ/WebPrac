package com.wj.mwp.db;

import java.util.List;

import com.wj.mwp.bean.Members;

public interface MwpMapper {

	public abstract int join(Members mbs);
	public abstract List<Members> login(Members mbs);

}
