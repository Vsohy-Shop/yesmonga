package com.google.android.gms.common.api;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40669r;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.m */
public abstract class C40663m<R extends C40669r> {

    @C40473a
    /* renamed from: com.google.android.gms.common.api.m$a */
    public interface C40664a {
        @C40473a
        /* renamed from: a */
        void mo133895a(@C0359n0 Status status);
    }

    @C40473a
    /* renamed from: c */
    public void mo133783c(@C0359n0 C40664a aVar) {
        throw new UnsupportedOperationException();
    }

    @C0359n0
    /* renamed from: d */
    public abstract R mo133784d();

    @C0359n0
    /* renamed from: e */
    public abstract R mo133785e(long j, @C0359n0 TimeUnit timeUnit);

    /* renamed from: f */
    public abstract void mo133687f();

    /* renamed from: g */
    public abstract boolean mo133786g();

    /* renamed from: h */
    public abstract void mo133787h(@C0359n0 C40670s<? super R> sVar);

    /* renamed from: i */
    public abstract void mo133788i(@C0359n0 C40670s<? super R> sVar, long j, @C0359n0 TimeUnit timeUnit);

    @C0359n0
    /* renamed from: j */
    public <S extends C40669r> C40673v<S> mo133789j(@C0359n0 C40672u<? super R, ? extends S> uVar) {
        throw new UnsupportedOperationException();
    }
}
