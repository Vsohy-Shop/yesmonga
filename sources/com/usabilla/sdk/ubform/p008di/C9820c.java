package com.usabilla.sdk.ubform.p008di;

import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.di.c */
public final class C9820c<T> {
    @C12579k

    /* renamed from: a */
    public final C11289a<T> f26874a;

    public C9820c(@C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "initializer");
        this.f26874a = aVar;
    }

    /* renamed from: a */
    public final T mo20113a(@C12580l Object obj, @C12579k C11510n<?> nVar) {
        Intrinsics.checkNotNullParameter(nVar, "property");
        return this.f26874a.invoke();
    }
}
