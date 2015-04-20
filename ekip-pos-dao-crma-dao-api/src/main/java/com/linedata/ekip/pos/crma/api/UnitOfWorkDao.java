package com.linedata.ekip.pos.crma.api;

import com.linedata.ekip.pos.dao.model.impl.UnitOfWork;

public interface UnitOfWorkDao {

	public UnitOfWork addUniOfWork(UnitOfWork unit, Long idEstimation);
	
}
