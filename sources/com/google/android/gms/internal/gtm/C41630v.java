package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.C40407s;
import com.google.android.gms.common.internal.C40858y;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;

@C40858y
/* renamed from: com.google.android.gms.internal.gtm.v */
public final class C41630v extends C40407s<C41630v> {

    /* renamed from: a */
    public String f105079a;

    /* renamed from: b */
    public String f105080b;

    /* renamed from: c */
    public String f105081c;

    /* renamed from: d */
    public String f105082d;

    /* renamed from: e */
    public String f105083e;

    /* renamed from: f */
    public String f105084f;

    /* renamed from: g */
    public String f105085g;

    /* renamed from: h */
    public String f105086h;

    /* renamed from: i */
    public String f105087i;

    /* renamed from: j */
    public String f105088j;

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo133444c(C40407s sVar) {
        C41630v vVar = (C41630v) sVar;
        if (!TextUtils.isEmpty(this.f105079a)) {
            vVar.f105079a = this.f105079a;
        }
        if (!TextUtils.isEmpty(this.f105080b)) {
            vVar.f105080b = this.f105080b;
        }
        if (!TextUtils.isEmpty(this.f105081c)) {
            vVar.f105081c = this.f105081c;
        }
        if (!TextUtils.isEmpty(this.f105082d)) {
            vVar.f105082d = this.f105082d;
        }
        if (!TextUtils.isEmpty(this.f105083e)) {
            vVar.f105083e = this.f105083e;
        }
        if (!TextUtils.isEmpty(this.f105084f)) {
            vVar.f105084f = this.f105084f;
        }
        if (!TextUtils.isEmpty(this.f105085g)) {
            vVar.f105085g = this.f105085g;
        }
        if (!TextUtils.isEmpty(this.f105086h)) {
            vVar.f105086h = this.f105086h;
        }
        if (!TextUtils.isEmpty(this.f105087i)) {
            vVar.f105087i = this.f105087i;
        }
        if (!TextUtils.isEmpty(this.f105088j)) {
            vVar.f105088j = this.f105088j;
        }
    }

    /* renamed from: e */
    public final String mo135931e() {
        return this.f105088j;
    }

    /* renamed from: f */
    public final String mo135932f() {
        return this.f105085g;
    }

    /* renamed from: g */
    public final String mo135933g() {
        return this.f105083e;
    }

    /* renamed from: h */
    public final String mo135934h() {
        return this.f105087i;
    }

    /* renamed from: i */
    public final String mo135935i() {
        return this.f105086h;
    }

    /* renamed from: j */
    public final String mo135936j() {
        return this.f105084f;
    }

    /* renamed from: k */
    public final String mo135937k() {
        return this.f105082d;
    }

    /* renamed from: l */
    public final String mo135938l() {
        return this.f105081c;
    }

    /* renamed from: m */
    public final String mo135939m() {
        return this.f105079a;
    }

    /* renamed from: n */
    public final String mo135940n() {
        return this.f105080b;
    }

    /* renamed from: o */
    public final void mo135941o(String str) {
        this.f105088j = str;
    }

    /* renamed from: p */
    public final void mo135942p(String str) {
        this.f105085g = str;
    }

    /* renamed from: q */
    public final void mo135943q(String str) {
        this.f105083e = str;
    }

    /* renamed from: r */
    public final void mo135944r(String str) {
        this.f105087i = str;
    }

    /* renamed from: s */
    public final void mo135945s(String str) {
        this.f105086h = str;
    }

    /* renamed from: t */
    public final void mo135946t(String str) {
        this.f105084f = str;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", this.f105079a);
        hashMap.put("source", this.f105080b);
        hashMap.put("medium", this.f105081c);
        hashMap.put("keyword", this.f105082d);
        hashMap.put("content", this.f105083e);
        hashMap.put("id", this.f105084f);
        hashMap.put("adNetworkId", this.f105085g);
        hashMap.put("gclid", this.f105086h);
        hashMap.put("dclid", this.f105087i);
        hashMap.put(FirebaseAnalytics.C32532b.f78929Q, this.f105088j);
        return C40407s.m164503a(hashMap);
    }

    /* renamed from: u */
    public final void mo135948u(String str) {
        this.f105082d = str;
    }

    /* renamed from: v */
    public final void mo135949v(String str) {
        this.f105081c = str;
    }

    /* renamed from: w */
    public final void mo135950w(String str) {
        this.f105079a = str;
    }

    /* renamed from: x */
    public final void mo135951x(String str) {
        this.f105080b = str;
    }
}
