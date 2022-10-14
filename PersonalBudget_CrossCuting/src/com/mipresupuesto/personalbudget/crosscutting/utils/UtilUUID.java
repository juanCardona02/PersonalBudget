package com.mipresupuesto.personalbudget.crosscutting.utils;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscuting.util.text.UtilText;

public class UtilUUID {

	public static final String DEFAULT_UUID_STRING = "00000000-0000-0000-0000-000000000000";

	public static final UUID DEFAULT_UUID = UUID.fromString(DEFAULT_UUID_STRING);

	private UtilUUID() {
		super();
		System.out.println("Me creé");
	}

	public static final UUID getDefaultUUID(final UUID uuid) {
		return (uuid == null) ? DEFAULT_UUID : uuid;
	}

	public static final boolean isEqual(final UUID uuidOne, final UUID uuidTwo) {

		return getDefaultUUID(uuidOne).equals(getDefaultUUID(uuidTwo));
	}

	public static final UUID getNewUUID() {
		UUID uuid;

		do {
			uuid = UUID.randomUUID();

		} while (isEqual(uuid, DEFAULT_UUID));

		return uuid;
	}
	
	public static final UUID getUUIDFromString(final String uuidString) {
		
		UUID uuid = DEFAULT_UUID;
		
		if (uuidString != null && !"".equals(uuidString.trim())) {
			try {
				uuid = UUID.fromString(uuidString);
			}catch (IllegalArgumentException e) {
				// TODO: handle exception
			}
		}
		
		return uuid;
	}
	
	public static final String getStringFromUUID(final UUID uuid) {
		String uuidString=DEFAULT_UUID_STRING;
		
		if(uuid != null)
		{
			uuidString = uuid.toString(); 
		}
		return uuidString;
		
	}
}
