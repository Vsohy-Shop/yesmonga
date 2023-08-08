package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.C40407s;
import com.google.android.gms.common.internal.C40858y;
import com.google.firebase.crashlytics.internal.metadata.C32748d;
import java.util.HashMap;

@C40858y
/* renamed from: com.google.android.gms.internal.gtm.d0 */
public final class C41198d0 extends C40407s<C41198d0> {

    /* renamed from: a */
    public String f104506a;

    /* renamed from: b */
    public String f104507b;

    /* renamed from: c */
    public String f104508c;

    /* renamed from: d */
    public String f104509d;

    /* renamed from: e */
    public boolean f104510e;

    /* renamed from: f */
    public boolean f104511f;

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo133444c(C40407s sVar) {
        C41198d0 d0Var = (C41198d0) sVar;
        if (!TextUtils.isEmpty(this.f104506a)) {
            d0Var.f104506a = this.f104506a;
        }
        if (!TextUtils.isEmpty(this.f104507b)) {
            d0Var.f104507b = this.f104507b;
        }
        if (!TextUtils.isEmpty(this.f104508c)) {
            d0Var.f104508c = this.f104508c;
        }
        if (!TextUtils.isEmpty(this.f104509d)) {
            d0Var.f104509d = this.f104509d;
        }
        if (this.f104510e) {
            d0Var.f104510e = true;
        }
        TextUtils.isEmpty((CharSequence) null);
        if (this.f104511f) {
            d0Var.f104511f = true;
        }
    }

    /* renamed from: e */
    public final String mo135192e() {
        return this.f104509d;
    }

    /* renamed from: f */
    public final String mo135193f() {
        return this.f104507b;
    }

    /* renamed from: g */
    public final String mo135194g() {
        return this.f104506a;
    }

    /* renamed from: h */
    public final String mo135195h() {
        return this.f104508c;
    }

    /* renamed from: i */
    public final void mo135196i(boolean z) {
        this.f104510e = z;
    }

    /* renamed from: j */
    public final void mo135197j(String str) {
        this.f104509d = str;
    }

    /* renamed from: k */
    public final void mo135198k(String str) {
        this.f104507b = str;
    }

    /* renamed from: l */
    public final void mo135199l(String str) {
        this.f104506a = "data";
    }

    /* renamed from: m */
    public final void mo135200m(boolean z) {
        this.f104511f = true;
    }

    /* renamed from: n */
    public final void mo135201n(String str) {
        this.f104508c = str;
    }

    /* renamed from: o */
    public final boolean mo135202o() {
        return this.f104510e;
    }

    /* renamed from: p */
    public final boolean mo135203p() {
        return this.f104511f;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("hitType", this.f104506a);
        hashMap.put("clientId", this.f104507b);
        hashMap.put(C32748d.f79502c, this.f104508c);
        hashMap.put("androidAdId", this.f104509d);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.f104510e));
        hashMap.put("sessionControl", (Object) null);
        hashMap.put("nonInteraction", Boolean.valueOf(this.f104511f));
        hashMap.put("sampleRate", Double.valueOf(0.0d));
        return C40407s.m164503a(hashMap);
    }
}
