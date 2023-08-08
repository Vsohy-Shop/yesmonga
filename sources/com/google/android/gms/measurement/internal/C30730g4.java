package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.C0348i1;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.measurement.internal.g4 */
public final class C30730g4 {

    /* renamed from: a */
    public final String f73419a;

    /* renamed from: b */
    public final long f73420b;

    /* renamed from: c */
    public boolean f73421c;

    /* renamed from: d */
    public long f73422d;

    /* renamed from: e */
    public final /* synthetic */ C30780k4 f73423e;

    public C30730g4(C30780k4 k4Var, String str, long j) {
        this.f73423e = k4Var;
        C40843u.m166198h(str);
        this.f73419a = str;
        this.f73420b = j;
    }

    @C0348i1
    /* renamed from: a */
    public final long mo87096a() {
        if (!this.f73421c) {
            this.f73421c = true;
            this.f73422d = this.f73423e.mo87191o().getLong(this.f73419a, this.f73420b);
        }
        return this.f73422d;
    }

    @C0348i1
    /* renamed from: b */
    public final void mo87097b(long j) {
        SharedPreferences.Editor edit = this.f73423e.mo87191o().edit();
        edit.putLong(this.f73419a, j);
        edit.apply();
        this.f73422d = j;
    }
}
