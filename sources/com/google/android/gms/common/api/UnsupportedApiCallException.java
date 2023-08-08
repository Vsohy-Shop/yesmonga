package com.google.android.gms.common.api;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C40473a;

public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final Feature zza;

    @C40473a
    public UnsupportedApiCallException(@C0359n0 Feature feature) {
        this.zza = feature;
    }

    @C0359n0
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.zza));
    }
}
