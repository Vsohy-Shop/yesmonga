package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.C0359n0;

public class GooglePlayServicesRepairableException extends UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int i, @C0359n0 String str, @C0359n0 Intent intent) {
        super(str, intent);
        this.zza = i;
    }

    /* renamed from: b */
    public int mo133609b() {
        return this.zza;
    }
}
