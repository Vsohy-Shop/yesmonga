package com.usabilla.sdk.ubform.p008di;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.usabilla.sdk.ubform.di.ComponentKt */
public final class ComponentKt {
    /* renamed from: a */
    public static final /* synthetic */ <T> C9820c<T> m36686a(C9819b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.needClassReification();
        return new C9820c<>(new ComponentKt$inject$1(bVar));
    }

    /* renamed from: b */
    public static final /* synthetic */ <T> C9820c<T> m36687b(C9819b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.needClassReification();
        return new C9820c<>(new ComponentKt$injectNullable$1(bVar));
    }
}
