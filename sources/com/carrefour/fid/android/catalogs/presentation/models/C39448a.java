package com.carrefour.fid.android.catalogs.presentation.models;

import com.carrefour.fid.android.catalogs.core.type.CatalogsType;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.models.a */
public final class C39448a extends C39449b {

    /* renamed from: a */
    public final int f100933a;
    @C12579k

    /* renamed from: b */
    public final List<Catalog> f100934b;
    @C12579k

    /* renamed from: c */
    public final CatalogsType f100935c;
    @C12580l

    /* renamed from: d */
    public final C11300l<Catalog, C11079d2> f100936d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39448a(int i, List list, CatalogsType catalogsType, C11300l lVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, catalogsType, (i2 & 8) != 0 ? null : lVar);
    }

    @C12579k
    /* renamed from: a */
    public final CatalogsType mo130535a() {
        return this.f100935c;
    }

    @C12579k
    /* renamed from: b */
    public final List<Catalog> mo130536b() {
        return this.f100934b;
    }

    @C12580l
    /* renamed from: c */
    public final C11300l<Catalog, C11079d2> mo130537c() {
        return this.f100936d;
    }

    /* renamed from: d */
    public final int mo130538d() {
        return this.f100933a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39448a(int i, @C12579k List<Catalog> list, @C12579k CatalogsType catalogsType, @C12580l C11300l<? super Catalog, C11079d2> lVar) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(catalogsType, "format");
        this.f100933a = i;
        this.f100934b = list;
        this.f100935c = catalogsType;
        this.f100936d = lVar;
    }
}
