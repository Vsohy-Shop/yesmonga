package com.airbnb.lottie.animation.keyframe;

import androidx.annotation.C0363p0;
import com.airbnb.lottie.value.C21693a;
import com.airbnb.lottie.value.C21694b;
import com.airbnb.lottie.value.C21702j;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.animation.keyframe.p */
public class C21487p<K, A> extends C21466a<K, A> {

    /* renamed from: i */
    public final C21694b<A> f55429i;

    /* renamed from: j */
    public final A f55430j;

    public C21487p(C21702j<A> jVar) {
        this(jVar, (Object) null);
    }

    /* renamed from: c */
    public float mo64059c() {
        return 1.0f;
    }

    /* renamed from: h */
    public A mo64064h() {
        C21702j<A> jVar = this.f55385e;
        A a = this.f55430j;
        return jVar.mo64748b(0.0f, 0.0f, a, a, mo64062f(), mo64062f(), mo64062f());
    }

    /* renamed from: i */
    public A mo64065i(C21693a<K> aVar, float f) {
        return mo64064h();
    }

    /* renamed from: k */
    public void mo64067k() {
        if (this.f55385e != null) {
            super.mo64067k();
        }
    }

    /* renamed from: m */
    public void mo64069m(float f) {
        this.f55384d = f;
    }

    public C21487p(C21702j<A> jVar, @C0363p0 A a) {
        super(Collections.emptyList());
        this.f55429i = new C21694b<>();
        mo64070n(jVar);
        this.f55430j = a;
    }
}
