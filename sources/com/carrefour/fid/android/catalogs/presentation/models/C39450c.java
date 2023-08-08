package com.carrefour.fid.android.catalogs.presentation.models;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.models.c */
public final class C39450c extends C39449b {
    @C12579k

    /* renamed from: a */
    public final String f100937a;
    @C12580l

    /* renamed from: b */
    public final C11289a<C11079d2> f100938b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39450c(String str, C11289a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : aVar);
    }

    @C12580l
    /* renamed from: a */
    public final C11289a<C11079d2> mo130539a() {
        return this.f100938b;
    }

    @C12579k
    /* renamed from: b */
    public final String mo130540b() {
        return this.f100937a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39450c(@C12579k String str, @C12580l C11289a<C11079d2> aVar) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "url");
        this.f100937a = str;
        this.f100938b = aVar;
    }
}
