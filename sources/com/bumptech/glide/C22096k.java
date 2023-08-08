package com.bumptech.glide;

import androidx.annotation.C0359n0;
import com.bumptech.glide.C22096k;
import com.bumptech.glide.request.transition.C22596e;
import com.bumptech.glide.request.transition.C22600g;
import com.bumptech.glide.request.transition.C22601h;
import com.bumptech.glide.request.transition.C22604i;
import com.bumptech.glide.request.transition.C22605j;
import com.bumptech.glide.util.C22633m;

/* renamed from: com.bumptech.glide.k */
public abstract class C22096k<CHILD extends C22096k<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a */
    public C22600g<? super TranscodeType> f56758a = C22596e.m102548c();

    /* renamed from: b */
    public final CHILD clone() {
        try {
            return (C22096k) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @C0359n0
    /* renamed from: c */
    public final CHILD mo65756c() {
        return mo65761i(C22596e.m102548c());
    }

    /* renamed from: e */
    public final C22600g<? super TranscodeType> mo65758e() {
        return this.f56758a;
    }

    /* renamed from: f */
    public final CHILD mo65759f() {
        return this;
    }

    @C0359n0
    /* renamed from: h */
    public final CHILD mo65760h(int i) {
        return mo65761i(new C22601h(i));
    }

    @C0359n0
    /* renamed from: i */
    public final CHILD mo65761i(@C0359n0 C22600g<? super TranscodeType> gVar) {
        this.f56758a = (C22600g) C22633m.m102624d(gVar);
        return mo65759f();
    }

    @C0359n0
    /* renamed from: j */
    public final CHILD mo65762j(@C0359n0 C22605j.C22606a aVar) {
        return mo65761i(new C22604i(aVar));
    }
}
