package com.linedata.ekip.pos.crma.api;

import java.util.List;

import com.linedata.ekip.pos.dao.model.impl.Estimation;
import com.linedata.ekip.pos.dao.model.impl.UnitOfWork;

public interface EstimationDao {
	public Estimation addEstimation(Estimation estimation,long idAuteur, long idSubject);
	public Estimation getEstimation(long idEstimation);
	public List<UnitOfWork> getAllUnits(long idEstimation);
	public List<Estimation> getAllEstimationByLabel(String label);
	
	
	
}
