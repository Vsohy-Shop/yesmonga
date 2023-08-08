package com.urbanairship.http;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RequestException extends Exception {
    public RequestException(String str) {
        super(str);
    }

    public RequestException(String str, Throwable th) {
        super(str, th);
    }
}
