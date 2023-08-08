package com.appsflyer.internal.components.network.http.exceptions;

import android.support.annotation.NonNull;
import com.appsflyer.internal.C21932bq;
import java.io.IOException;

public class ParsingException extends IOException {
    @NonNull
    private final C21932bq<String> values;

    public ParsingException(String str, Throwable th, @NonNull C21932bq<String> bqVar) {
        super(str, th);
        this.values = bqVar;
    }

    @NonNull
    public C21932bq<String> getRawResponse() {
        return this.values;
    }
}
