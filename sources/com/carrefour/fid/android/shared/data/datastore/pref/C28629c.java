package com.carrefour.fid.android.shared.data.datastore.pref;

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

/* renamed from: com.carrefour.fid.android.shared.data.datastore.pref.c */
public final class C28629c {

    /* renamed from: a */
    public static final /* synthetic */ C11510n<Object>[] f70205a = {C11342l0.m43564u(new PropertyReference1Impl(C28629c.class, "baseDataStore", "getBaseDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    @C12579k

    /* renamed from: b */
    public static final String f70206b = "BASE_PREFS";
    @C12579k

    /* renamed from: c */
    public static final String f70207c = "UUID";
    @C12579k

    /* renamed from: d */
    public static final C11427e f70208d = PreferenceDataStoreDelegateKt.m84092b(f70206b, (C18576b) null, (C11300l) null, (C12074o0) null, 14, (Object) null);

    /* renamed from: b */
    public static final C18570d<C18602a> m118539b(Context context) {
        return (C18570d) f70208d.mo22938a(context, f70205a[0]);
    }
}
