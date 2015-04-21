package com.linedata.ekip.pos.crma.api;

import com.linedata.ekip.pos.dao.model.impl.Abacus;

public interface AbacusDao {

	public boolean addElement(Abacus abacus, long idComponent, long idComplexity);
	public boolean updateElement(long idAbacus, long idComponent, long idComplexity);
}
