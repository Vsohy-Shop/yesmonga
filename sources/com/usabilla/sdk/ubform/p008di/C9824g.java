package com.usabilla.sdk.ubform.p008di;

import com.urbanairship.job.C9314l;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.di.g */
public final class C9824g<T> {
    @C12579k

    /* renamed from: a */
    public final C11300l<C9818a, T> f26877a;
    @C12580l

    /* renamed from: b */
    public T f26878b;

    public C9824g(@C12579k C11300l<? super C9818a, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "create");
        this.f26877a = lVar;
    }

    /* renamed from: c */
    public static /* synthetic */ C9824g m36769c(C9824g gVar, C11300l<C9818a, T> lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = gVar.f26877a;
        }
        return gVar.mo20155b(lVar);
    }

    /* renamed from: a */
    public final C11300l<C9818a, T> mo20154a() {
        return this.f26877a;
    }

    @C12579k
    /* renamed from: b */
    public final C9824g<T> mo20155b(@C12579k C11300l<? super C9818a, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "create");
        return new C9824g<>(lVar);
    }

    /* renamed from: d */
    public final synchronized T mo20156d(@C12579k C9818a aVar) {
        T t;
        Intrinsics.checkNotNullParameter(aVar, C9314l.f25417c);
        t = this.f26878b;
        if (t == null) {
            t = this.f26877a.invoke(aVar);
            this.f26878b = t;
        }
        return t;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9824g) && Intrinsics.areEqual((Object) this.f26877a, (Object) ((C9824g) obj).f26877a);
    }

    public int hashCode() {
        return this.f26877a.hashCode();
    }

    @C12579k
    public String toString() {
        return "Provider(create=" + this.f26877a + ')';
    }
}
