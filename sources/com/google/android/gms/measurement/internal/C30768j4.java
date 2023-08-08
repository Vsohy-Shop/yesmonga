package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.C0348i1;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.measurement.internal.j4 */
public final class C30768j4 {

    /* renamed from: a */
    public final String f73624a;

    /* renamed from: b */
    public boolean f73625b;

    /* renamed from: c */
    public String f73626c;

    /* renamed from: d */
    public final /* synthetic */ C30780k4 f73627d;

    public C30768j4(C30780k4 k4Var, String str, String str2) {
        this.f73627d = k4Var;
        C40843u.m166198h(str);
        this.f73624a = str;
    }

    @C0348i1
    /* renamed from: a */
    public final String mo87179a() {
        if (!this.f73625b) {
            this.f73625b = true;
            this.f73626c = this.f73627d.mo87191o().getString(this.f73624a, (String) null);
        }
        return this.f73626c;
    }

    @C0348i1
    /* renamed from: b */
    public final void mo87180b(String str) {
        SharedPreferences.Editor edit = this.f73627d.mo87191o().edit();
        edit.putString(this.f73624a, str);
        edit.apply();
        this.f73626c = str;
    }
}
