package com.ust.sagaeventsourcing.ms.initsrv.service.impl;

import com.ust.sagaeventsourcing.event.Eventide;
import com.ust.sagaeventsourcing.ms.initsrv.api.dto.SimpleDto;

public class MyEvent extends Eventide<SimpleDto> {

	public MyEvent() {	}
	
	public MyEvent(String eventType, SimpleDto simpleData) {
		super(eventType, simpleData);
	}

	@Override
	public String toString() {
		return "MyEvent [getId_transaccion()=" + getId_transaccion() + ", getTimestamp()=" + getTimestamp()
				+ ", getApplication()=" + getApplication() + ", getSaga()=" + getSaga() + ", getEventName()="
				+ getEventName() + ", getStatus()=" + getStatus() + ", getData()=" + getData() + "]";
	}

}
