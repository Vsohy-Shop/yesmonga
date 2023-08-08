package com.google.android.gms.common.api;

import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.api.internal.C40638v2;

/* renamed from: com.google.android.gms.common.api.u */
public abstract class C40672u<R extends C40669r, S extends C40669r> {
    @C0359n0
    /* renamed from: a */
    public final C40663m<S> mo134102a(@C0359n0 Status status) {
        return new C40638v2(status);
    }

    @C0359n0
    /* renamed from: b */
    public Status mo134103b(@C0359n0 Status status) {
        return status;
    }

    @C0348i1
    @C0363p0
    /* renamed from: c */
    public abstract C40663m<S> mo134104c(@C0359n0 R r);
}
