package com.appsflyer.internal.components.network.http.exceptions;

import android.support.annotation.NonNull;
import com.appsflyer.internal.C21924bi;
import java.io.IOException;

public class HttpException extends IOException {
    private final C21924bi valueOf;

    public HttpException(@NonNull Throwable th, @NonNull C21924bi biVar) {
        super(th.getMessage(), th);
        this.valueOf = biVar;
    }

    @NonNull
    public C21924bi getMetrics() {
        return this.valueOf;
    }
}
