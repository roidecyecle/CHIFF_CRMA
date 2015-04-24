package com.linedata.ekip.pos.crma.api;

import java.util.List;

import com.linedata.ekip.pos.dao.model.impl.ActionType;
import com.linedata.ekip.pos.dao.model.impl.UnitOfWork;

public interface ActionTypeDao {
	
	public ActionType addActionType(ActionType actionType);
	public ActionType updateActionType(ActionType actionType);
	public boolean removeActionType(ActionType actionType);
	
	public ActionType getActionType(long idAction);
	public List<UnitOfWork> getUnitsByAction(long idAction);

}
