package com.linedata.ekip.pos.crma.api;

import com.linedata.ekip.pos.dao.model.impl.UnitOfWork;

public interface UnitOfWorkDao {

	public UnitOfWork addUniOfWork(UnitOfWork unit, long idEstimation, long idActionType, long idAbaque);
	public UnitOfWork updateUnitOfWork(UnitOfWork unit, long idAtionType, long idAbaque);
	public boolean deleteUnitOfWork(long idUnit);
	
	public UnitOfWork getUnitOfWorkDetail(long idUnit);
	
}
