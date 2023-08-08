package com.google.android.gms.common.api;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.internal.C40843u;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.c */
public final class C40495c implements C40669r {

    /* renamed from: a */
    public final Status f103210a;

    /* renamed from: b */
    public final C40663m[] f103211b;

    public C40495c(Status status, C40663m[] mVarArr) {
        this.f103210a = status;
        this.f103211b = mVarArr;
    }

    @C0359n0
    /* renamed from: a */
    public <R extends C40669r> R mo133692a(@C0359n0 C40497d<R> dVar) {
        boolean z;
        if (dVar.f103213a < this.f103211b.length) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166192b(z, "The result token does not belong to this batch");
        return this.f103211b[dVar.f103213a].mo133785e(0, TimeUnit.MILLISECONDS);
    }

    @C0359n0
    public Status getStatus() {
        return this.f103210a;
    }
}
