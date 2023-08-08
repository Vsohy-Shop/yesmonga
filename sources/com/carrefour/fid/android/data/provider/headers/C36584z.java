package com.carrefour.fid.android.data.provider.headers;

import com.carrefour.fid.android.shared.data.headers.C28640a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.provider.headers.z */
public final class C36584z implements C10324h<C36583y> {

    /* renamed from: a */
    public final Provider<C28640a> f90323a;

    public C36584z(Provider<C28640a> provider) {
        this.f90323a = provider;
    }

    /* renamed from: a */
    public static C36584z m149951a(Provider<C28640a> provider) {
        return new C36584z(provider);
    }

    /* renamed from: c */
    public static C36583y m149952c(C28640a aVar) {
        return new C36583y(aVar);
    }

    /* renamed from: b */
    public C36583y get() {
        return m149952c(this.f90323a.get());
    }
}
