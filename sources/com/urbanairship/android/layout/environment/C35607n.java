package com.urbanairship.android.layout.environment;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.urbanairship.android.layout.environment.n */
public final class C35607n<T> {
    @C12579k

    /* renamed from: a */
    public final C11940j<T> f88022a;
    @C12579k

    /* renamed from: b */
    public final C11952u<T> f88023b;

    /* renamed from: c */
    public final T f88024c;

    public C35607n(T t) {
        C11940j<T> a = C11953v.m47628a(t);
        this.f88022a = a;
        this.f88023b = C11909g.m47470m(a);
        this.f88024c = a.getValue();
    }

    @C12579k
    /* renamed from: a */
    public final C11952u<T> mo106666a() {
        return this.f88023b;
    }

    /* renamed from: b */
    public final T mo106667b() {
        return this.f88024c;
    }

    /* renamed from: c */
    public final void mo106668c(@C12579k C11300l<? super T, ? extends T> lVar) {
        T value;
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C11940j<T> jVar = this.f88022a;
        do {
            value = jVar.getValue();
        } while (!jVar.mo24216e(value, lVar.invoke(value)));
    }
}
