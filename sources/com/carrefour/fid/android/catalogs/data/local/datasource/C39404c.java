package com.carrefour.fid.android.catalogs.data.local.datasource;

import android.content.Context;
import androidx.datastore.DataStoreDelegateKt;
import androidx.datastore.core.C18570d;
import androidx.datastore.core.C18577i;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.handlers.C18576b;
import com.carrefour.fid.android.FavoriteCatalogProductList;
import com.carrefour.fid.android.shared.data.datastore.proto.C28638e;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.properties.C11427e;
import kotlin.reflect.C11510n;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.catalogs.data.local.datasource.c */
public final class C39404c implements C18577i<FavoriteCatalogProductList> {
    @C12579k

    /* renamed from: a */
    public static final C39404c f100780a;

    /* renamed from: b */
    public static final /* synthetic */ C11510n<Object>[] f100781b = {C11342l0.m43565v(new PropertyReference2Impl(C39404c.class, "favoriteProducts", "getFavoriteProducts(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    @C12579k

    /* renamed from: c */
    public static final C11427e f100782c;

    static {
        C39404c cVar = new C39404c();
        f100780a = cVar;
        f100782c = DataStoreDelegateKt.m83990b(C28638e.f70226d, cVar, (C18576b) null, (C11300l) null, (C12074o0) null, 28, (Object) null);
    }

    @C12580l
    /* renamed from: b */
    public Object mo31157b(@C12579k InputStream inputStream, @C12579k C11045c<? super FavoriteCatalogProductList> cVar) {
        try {
            FavoriteCatalogProductList parseFrom = FavoriteCatalogProductList.parseFrom(inputStream);
            Intrinsics.checkNotNullExpressionValue(parseFrom, "parseFrom(input)");
            return parseFrom;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }

    @C12579k
    /* renamed from: c */
    public FavoriteCatalogProductList getDefaultValue() {
        FavoriteCatalogProductList defaultInstance = FavoriteCatalogProductList.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
        return defaultInstance;
    }

    @C12579k
    /* renamed from: d */
    public final C18570d<FavoriteCatalogProductList> mo130456d(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (C18570d) f100782c.mo22938a(context, f100781b[0]);
    }

    @C12580l
    /* renamed from: e */
    public Object mo31156a(@C12579k FavoriteCatalogProductList favoriteCatalogProductList, @C12579k OutputStream outputStream, @C12579k C11045c<? super C11079d2> cVar) {
        favoriteCatalogProductList.writeTo(outputStream);
        return C11079d2.f28267a;
    }
}
