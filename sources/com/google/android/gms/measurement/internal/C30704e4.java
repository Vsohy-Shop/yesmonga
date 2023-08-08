package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.C0348i1;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.measurement.internal.e4 */
public final class C30704e4 {

    /* renamed from: a */
    public final String f73352a;

    /* renamed from: b */
    public final boolean f73353b;

    /* renamed from: c */
    public boolean f73354c;

    /* renamed from: d */
    public boolean f73355d;

    /* renamed from: e */
    public final /* synthetic */ C30780k4 f73356e;

    public C30704e4(C30780k4 k4Var, String str, boolean z) {
        this.f73356e = k4Var;
        C40843u.m166198h(str);
        this.f73352a = str;
        this.f73353b = z;
    }

    @C0348i1
    /* renamed from: a */
    public final void mo87051a(boolean z) {
        SharedPreferences.Editor edit = this.f73356e.mo87191o().edit();
        edit.putBoolean(this.f73352a, z);
        edit.apply();
        this.f73355d = z;
    }

    @C0348i1
    /* renamed from: b */
    public final boolean mo87052b() {
        if (!this.f73354c) {
            this.f73354c = true;
            this.f73355d = this.f73356e.mo87191o().getBoolean(this.f73352a, this.f73353b);
        }
        return this.f73355d;
    }
}
