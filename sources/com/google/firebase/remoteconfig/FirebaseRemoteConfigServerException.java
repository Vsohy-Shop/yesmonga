package com.google.firebase.remoteconfig;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    private final int httpStatusCode;

    public FirebaseRemoteConfigServerException(int i, @C0359n0 String str) {
        super(str);
        this.httpStatusCode = i;
    }

    /* renamed from: a */
    public int mo97271a() {
        return this.httpStatusCode;
    }

    public FirebaseRemoteConfigServerException(int i, @C0359n0 String str, @C0363p0 Throwable th) {
        super(str, th);
        this.httpStatusCode = i;
    }
}
