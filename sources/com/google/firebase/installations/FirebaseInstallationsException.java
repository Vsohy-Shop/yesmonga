package com.google.firebase.installations;

import androidx.annotation.C0359n0;
import com.google.firebase.FirebaseException;

public class FirebaseInstallationsException extends FirebaseException {
    @C0359n0
    private final Status status;

    public enum Status {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(@C0359n0 Status status2) {
        this.status = status2;
    }

    @C0359n0
    /* renamed from: a */
    public Status mo95774a() {
        return this.status;
    }

    public FirebaseInstallationsException(@C0359n0 String str, @C0359n0 Status status2) {
        super(str);
        this.status = status2;
    }

    public FirebaseInstallationsException(@C0359n0 String str, @C0359n0 Status status2, @C0359n0 Throwable th) {
        super(str, th);
        this.status = status2;
    }
}
