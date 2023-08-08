package com.carrefour.fid.android.catalogs.presentation.models;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.models.f */
public final class C39453f extends C39449b {
    @C12579k

    /* renamed from: a */
    public final CatalogsMessageState f100942a;
    @C12580l

    /* renamed from: b */
    public final C11289a<C11079d2> f100943b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39453f(CatalogsMessageState catalogsMessageState, C11289a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(catalogsMessageState, (i & 2) != 0 ? null : aVar);
    }

    @C12580l
    /* renamed from: a */
    public final C11289a<C11079d2> mo130550a() {
        return this.f100943b;
    }

    @C12579k
    /* renamed from: b */
    public final CatalogsMessageState mo130551b() {
        return this.f100942a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39453f(@C12579k CatalogsMessageState catalogsMessageState, @C12580l C11289a<C11079d2> aVar) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(catalogsMessageState, "state");
        this.f100942a = catalogsMessageState;
        this.f100943b = aVar;
    }
}
