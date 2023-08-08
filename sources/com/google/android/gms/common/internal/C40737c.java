package com.google.android.gms.common.internal;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

@C40473a
/* renamed from: com.google.android.gms.common.internal.c */
public class C40737c {
    @C40473a
    @C0359n0
    /* renamed from: a */
    public static ApiException m165762a(@C0359n0 Status status) {
        if (status.mo133650e0()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
