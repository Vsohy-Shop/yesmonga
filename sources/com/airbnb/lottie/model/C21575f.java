package com.airbnb.lottie.model;

import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.collection.C1879j;
import com.airbnb.lottie.C21495g;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.airbnb.lottie.model.f */
public class C21575f {

    /* renamed from: b */
    public static final C21575f f55744b = new C21575f();

    /* renamed from: a */
    public final C1879j<String, C21495g> f55745a = new C1879j<>(20);

    /* renamed from: c */
    public static C21575f m99425c() {
        return f55744b;
    }

    /* renamed from: a */
    public void mo64438a() {
        this.f55745a.mo6244d();
    }

    @C0363p0
    /* renamed from: b */
    public C21495g mo64439b(@C0363p0 String str) {
        if (str == null) {
            return null;
        }
        return this.f55745a.mo6246f(str);
    }

    /* renamed from: d */
    public void mo64440d(@C0363p0 String str, C21495g gVar) {
        if (str != null) {
            this.f55745a.mo6250j(str, gVar);
        }
    }

    /* renamed from: e */
    public void mo64441e(int i) {
        this.f55745a.mo6253m(i);
    }
}
