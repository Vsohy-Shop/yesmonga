package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.C0359n0;

public class UserRecoverableException extends Exception {
    private final Intent zza;

    public UserRecoverableException(@C0359n0 String str, @C0359n0 Intent intent) {
        super(str);
        this.zza = intent;
    }

    @C0359n0
    /* renamed from: a */
    public Intent mo133619a() {
        return new Intent(this.zza);
    }
}
