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
package com.libwave.api;

public interface Urls {

	// Desktop
	public static final String DESKTOP_GET_CLIENT_REQUESTS = "/api/desktop/requests/get/{dektopUuid}";
	public static final String DESKTOP_UPLOAD_FILE = "/api/desktop/upload/{requestUuid}";
	public static final String DESKTOP_SEND_SEARCH_RESULTS = "/api/desktop/search/submit";

	// Client
	public static final String CLIENT_CHECK_DESKTOP_STATUS = "/api/client/request/desktop/status/{dektopUuid}";
	public static final String CLIENT_SUBMIT_REQUEST = "/api/client/request/submit";
	public static final String CLIENT_SUBMIT_SEARCH_REQUEST_POLL = "/api/client/request/search/poll/{requestUuid}";

	public static final String CLIENT_SUBMIT_DOWNLOAD_REQUEST_POLL = "/api/client/request/download/poll/{requestUuid}";

}