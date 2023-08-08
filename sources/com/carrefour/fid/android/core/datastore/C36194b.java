package com.carrefour.fid.android.core.datastore;

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

/* renamed from: com.carrefour.fid.android.core.datastore.b */
public final class C36194b {

    /* renamed from: a */
    public static final /* synthetic */ C11510n<Object>[] f89388a = {C11342l0.m43564u(new PropertyReference1Impl(C36194b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    @C12579k

    /* renamed from: b */
    public static final String f89389b = "ONE_APP_PREFS";
    @C12579k

    /* renamed from: c */
    public static final C11427e f89390c = PreferenceDataStoreDelegateKt.m84092b(f89389b, (C18576b) null, (C11300l) null, (C12074o0) null, 14, (Object) null);

    /* renamed from: b */
    public static final C18570d<C18602a> m148648b(Context context) {
        return (C18570d) f89390c.mo22938a(context, f89388a[0]);
    }
}
