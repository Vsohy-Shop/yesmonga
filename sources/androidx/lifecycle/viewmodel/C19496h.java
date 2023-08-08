package androidx.lifecycle.viewmodel;

import androidx.lifecycle.C19476v0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.lifecycle.viewmodel.h */
public final class C19496h<T extends C19476v0> {
    @C12579k

    /* renamed from: a */
    public final Class<T> f49884a;
    @C12579k

    /* renamed from: b */
    public final C11300l<C19477a, T> f49885b;

    public C19496h(@C12579k Class<T> cls, @C12579k C11300l<? super C19477a, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(cls, "clazz");
        Intrinsics.checkNotNullParameter(lVar, "initializer");
        this.f49884a = cls;
        this.f49885b = lVar;
    }

    @C12579k
    /* renamed from: a */
    public final Class<T> mo57691a() {
        return this.f49884a;
    }

    @C12579k
    /* renamed from: b */
    public final C11300l<C19477a, T> mo57692b() {
        return this.f49885b;
    }
}
