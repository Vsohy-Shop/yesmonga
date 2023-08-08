package com.carrefour.fid.android.cms.data.cache;

import android.content.Context;
import androidx.datastore.core.C18570d;
import androidx.datastore.core.handlers.C18576b;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.C18602a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.properties.C11427e;
import kotlin.reflect.C11510n;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.cms.data.cache.a */
public final class C40011a {

    /* renamed from: a */
    public static final /* synthetic */ C11510n<Object>[] f102035a = {C11342l0.m43564u(new PropertyReference1Impl(C40011a.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    @C12579k

    /* renamed from: b */
    public static final String f102036b = "CmsDaoDataStore";
    @C12579k

    /* renamed from: c */
    public static final String f102037c = "StorePetrolKey";
    @C12579k

    /* renamed from: d */
    public static final C11427e f102038d = PreferenceDataStoreDelegateKt.m84092b(f102036b, (C18576b) null, (C11300l) null, (C12074o0) null, 14, (Object) null);

    /* renamed from: b */
    public static final C18570d<C18602a> m162973b(Context context) {
        return (C18570d) f102038d.mo22938a(context, f102035a[0]);
    }
}
