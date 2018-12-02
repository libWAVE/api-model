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
package com.libwave.api.model.desktop;

import com.libwave.api.model.common.BaseModelObject;

@SuppressWarnings("serial")
public class GetClientRequestsResponse extends BaseModelObject {

	public static enum RequestType {
		SEARCH, DOWNLOAD
	}

	private String clientRequestUuid;

	private RequestType requestType;

	private String requestData;

	public String getClientRequestUuid() {
		return clientRequestUuid;
	}

	public void setClientRequestUuid(String clientRequestUuid) {
		this.clientRequestUuid = clientRequestUuid;
	}

	public RequestType getRequestType() {
		return requestType;
	}

	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}

	public String getRequestData() {
		return requestData;
	}

	public void setRequestData(String requestData) {
		this.requestData = requestData;
	}

	@Override
	public String toString() {
		return "GetClientRequestsResponse [clientRequestUuid=" + clientRequestUuid + ", requestType=" + requestType
				+ ", requestData=" + requestData + "]";
	}

	@Override
	public String getType() {
		return "get-client-requests";
	}

}
