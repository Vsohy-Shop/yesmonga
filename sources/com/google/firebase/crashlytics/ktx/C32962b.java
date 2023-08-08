package com.google.firebase.crashlytics.ktx;

import com.google.firebase.crashlytics.C32652i;
import com.google.firebase.ktx.C33135b;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.google.firebase.crashlytics.ktx.b */
public final class C32962b {
    @C12579k

    /* renamed from: a */
    public static final String f80074a = "fire-cls-ktx";

    @C12579k
    /* renamed from: a */
    public static final C32652i m133143a(@C12579k C33135b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        C32652i d = C32652i.m131872d();
        Intrinsics.checkNotNullExpressionValue(d, "getInstance()");
        return d;
    }

    /* renamed from: b */
    public static final void m133144b(@C12579k C32652i iVar, @C12579k C11300l<? super C32963c, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "init");
        lVar.invoke(new C32963c(iVar));
    }
}
