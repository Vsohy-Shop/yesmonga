package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.RequestPayload;

public abstract class StreamReadException extends JsonProcessingException {
    static final long serialVersionUID = 1;
    protected transient JsonParser _processor;
    protected RequestPayload _requestPayload;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamReadException(JsonParser jsonParser, String str) {
        super(str, jsonParser == null ? null : jsonParser.getCurrentLocation());
        this._processor = jsonParser;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (this._requestPayload == null) {
            return message;
        }
        return message + "\nRequest payload : " + this._requestPayload.toString();
    }

    public RequestPayload getRequestPayload() {
        return this._requestPayload;
    }

    public String getRequestPayloadAsString() {
        RequestPayload requestPayload = this._requestPayload;
        if (requestPayload != null) {
            return requestPayload.toString();
        }
        return null;
    }

    public abstract StreamReadException withParser(JsonParser jsonParser);

    public abstract StreamReadException withRequestPayload(RequestPayload requestPayload);

    public JsonParser getProcessor() {
        return this._processor;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamReadException(JsonParser jsonParser, String str, Throwable th) {
        super(str, jsonParser == null ? null : jsonParser.getCurrentLocation(), th);
        this._processor = jsonParser;
    }

    public StreamReadException(JsonParser jsonParser, String str, JsonLocation jsonLocation) {
        super(str, jsonLocation, (Throwable) null);
        this._processor = jsonParser;
    }

    public StreamReadException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this._location = jsonLocation;
    }
}
