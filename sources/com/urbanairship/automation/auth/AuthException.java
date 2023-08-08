package com.urbanairship.automation.auth;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class AuthException extends Exception {
    public AuthException(@C0359n0 String str, @C0359n0 Throwable th) {
        super(str, th);
    }

    public AuthException(@C0359n0 String str) {
        super(str);
    }
}
