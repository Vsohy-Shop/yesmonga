package com.carrefour.fid.android.catalogs.presentation.models;

import com.carrefour.fid.android.domain.models.catalog.Catalog;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.models.h */
public final class C39455h extends C39449b {
    @C12579k

    /* renamed from: a */
    public final List<Catalog> f100945a;
    @C12580l

    /* renamed from: b */
    public final C11300l<Catalog, C11079d2> f100946b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39455h(List list, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : lVar);
    }

    @C12579k
    /* renamed from: a */
    public final List<Catalog> mo130553a() {
        return this.f100945a;
    }

    @C12580l
    /* renamed from: b */
    public final C11300l<Catalog, C11079d2> mo130554b() {
        return this.f100946b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39455h(@C12579k List<Catalog> list, @C12580l C11300l<? super Catalog, C11079d2> lVar) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "list");
        this.f100945a = list;
        this.f100946b = lVar;
    }
}
