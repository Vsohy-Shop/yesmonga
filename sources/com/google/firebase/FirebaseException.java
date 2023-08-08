package com.google.firebase;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.internal.C40843u;

public class FirebaseException extends Exception {
    @Deprecated
    public FirebaseException() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(@C0359n0 String str) {
        super(str);
        C40843u.m166199i(str, "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(@C0359n0 String str, @C0359n0 Throwable th) {
        super(str, th);
        C40843u.m166199i(str, "Detail message must not be empty");
    }
}
