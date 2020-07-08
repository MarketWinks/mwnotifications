package com.marketwinks.mwnotifications.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class notification {

	@Id
	public ObjectId _id;

	private String targetuser;
	private java.time.LocalDateTime time;
	private String message;
	private boolean isRead;

	// ObjectId needs to be converted to string
	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	/**
	 * @return the targetuser
	 */
	public String getTargetuser() {
		return targetuser;
	}

	/**
	 * @param targetuser
	 *            the targetuser to set
	 */
	public void setTargetuser(String targetuser) {
		this.targetuser = targetuser;
	}

	/**
	 * @return the time
	 */
	public java.time.LocalDateTime getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(java.time.LocalDateTime time) {
		this.time = time;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the isRead
	 */
	public boolean isRead() {
		return isRead;
	}

	/**
	 * @param isRead
	 *            the isRead to set
	 */
	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}

}
