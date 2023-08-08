package com.google.android.gms.common;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {
    private final int zza;

    public GooglePlayServicesManifestException(int i, @C0359n0 String str) {
        super(str);
        this.zza = i;
    }

    /* renamed from: a */
    public int mo133607a() {
        return this.zza;
    }

    /* renamed from: b */
    public int mo133608b() {
        return C40715h.f103695a;
    }
}
