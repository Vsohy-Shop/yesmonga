package com.airbnb.lottie;

import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.v */
public class C21692v {

    /* renamed from: a */
    public final Map<String, String> f56088a;
    @C0363p0

    /* renamed from: b */
    public final LottieAnimationView f56089b;
    @C0363p0

    /* renamed from: c */
    public final C21516j f56090c;

    /* renamed from: d */
    public boolean f56091d;

    @C0344h1
    public C21692v() {
        this.f56088a = new HashMap();
        this.f56091d = true;
        this.f56089b = null;
        this.f56090c = null;
    }

    /* renamed from: a */
    public String mo64714a(String str) {
        return str;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: b */
    public final String mo64715b(String str) {
        if (this.f56091d && this.f56088a.containsKey(str)) {
            return this.f56088a.get(str);
        }
        String a = mo64714a(str);
        if (this.f56091d) {
            this.f56088a.put(str, a);
        }
        return a;
    }

    /* renamed from: c */
    public final void mo64716c() {
        LottieAnimationView lottieAnimationView = this.f56089b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        C21516j jVar = this.f56090c;
        if (jVar != null) {
            jVar.invalidateSelf();
        }
    }

    /* renamed from: d */
    public void mo64717d() {
        this.f56088a.clear();
        mo64716c();
    }

    /* renamed from: e */
    public void mo64718e(String str) {
        this.f56088a.remove(str);
        mo64716c();
    }

    /* renamed from: f */
    public void mo64719f(boolean z) {
        this.f56091d = z;
    }

    /* renamed from: g */
    public void mo64720g(String str, String str2) {
        this.f56088a.put(str, str2);
        mo64716c();
    }

    public C21692v(LottieAnimationView lottieAnimationView) {
        this.f56088a = new HashMap();
        this.f56091d = true;
        this.f56089b = lottieAnimationView;
        this.f56090c = null;
    }

    public C21692v(C21516j jVar) {
        this.f56088a = new HashMap();
        this.f56091d = true;
        this.f56090c = jVar;
        this.f56089b = null;
    }
}
