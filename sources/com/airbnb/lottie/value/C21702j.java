package com.airbnb.lottie.value;

import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.animation.keyframe.C21466a;

/* renamed from: com.airbnb.lottie.value.j */
public class C21702j<T> {

    /* renamed from: a */
    public final C21694b<T> f56122a;
    @C0363p0

    /* renamed from: b */
    public C21466a<?, ?> f56123b;
    @C0363p0

    /* renamed from: c */
    public T f56124c;

    public C21702j() {
        this.f56122a = new C21694b<>();
        this.f56124c = null;
    }

    @C0363p0
    /* renamed from: a */
    public T mo64017a(C21694b<T> bVar) {
        return this.f56124c;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: b */
    public final T mo64748b(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return mo64017a(this.f56122a.mo64737h(f, f2, t, t2, f3, f4, f5));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    public final void mo64749c(@C0363p0 C21466a<?, ?> aVar) {
        this.f56123b = aVar;
    }

    /* renamed from: d */
    public final void mo64750d(@C0363p0 T t) {
        this.f56124c = t;
        C21466a<?, ?> aVar = this.f56123b;
        if (aVar != null) {
            aVar.mo64067k();
        }
    }

    public C21702j(@C0363p0 T t) {
        this.f56122a = new C21694b<>();
        this.f56124c = t;
    }
}
