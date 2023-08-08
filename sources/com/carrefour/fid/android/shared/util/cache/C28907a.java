package com.carrefour.fid.android.shared.util.cache;

import kotlin.C11532s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.C11652q;
import kotlin.time.C11654r;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11532s0
/* renamed from: com.carrefour.fid.android.shared.util.cache.a */
public final class C28907a<T> {
    @C12580l

    /* renamed from: a */
    public T f70817a;
    @C12579k

    /* renamed from: b */
    public C11652q f70818b;

    public /* synthetic */ C28907a(Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j);
    }

    @C12580l
    /* renamed from: a */
    public final T mo84147a() {
        if (mo84148b()) {
            return null;
        }
        return this.f70817a;
    }

    /* renamed from: b */
    public final boolean mo84148b() {
        return this.f70818b.mo23421q();
    }

    public C28907a(T t, long j) {
        this.f70817a = t;
        this.f70818b = C11654r.C11656b.C11657a.m45705b(C11654r.C11656b.C11657a.m45710n0(C11654r.C11656b.f28970b.mo23495b(), j));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28907a(Object obj, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, j, (DefaultConstructorMarker) null);
    }
}
