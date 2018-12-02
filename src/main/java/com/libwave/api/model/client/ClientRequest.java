/*

MIT License

Copyright (c) 2018 libWAVE team

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package com.libwave.api.model.client;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public abstract class ClientRequest implements Serializable {

	protected String uuid;

	protected String clientUuid;

	protected String desktopUuid;

	protected Date date = new Date();

	public Date getDate() {
		return date;
	}

	public abstract String getCommand();

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getClientUuid() {
		return clientUuid;
	}

	public void setClientUuid(String clientUuid) {
		this.clientUuid = clientUuid;
	}

	public String getDesktopUuid() {
		return desktopUuid;
	}

	public void setDesktopUuid(String desktopUuid) {
		this.desktopUuid = desktopUuid;
	}

	@Override
	public String toString() {
		return "ClientRequest [uuid=" + uuid + ", clientUuid=" + clientUuid + ", desktopUuid=" + desktopUuid + ", date="
				+ date + "]";
	}

}
