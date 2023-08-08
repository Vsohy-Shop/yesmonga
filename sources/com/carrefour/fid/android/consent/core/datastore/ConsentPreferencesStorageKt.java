package com.carrefour.fid.android.consent.core.datastore;

import android.content.Context;
import androidx.datastore.core.C18570d;
import androidx.datastore.core.handlers.C18576b;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.C18602a;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.properties.C11427e;
import kotlin.reflect.C11510n;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002XT¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, mo22516d2 = {"", "CONSENT_DATA_STORE_PREF_NAME", "Ljava/lang/String;", "Landroid/content/Context;", "Landroidx/datastore/core/d;", "Landroidx/datastore/preferences/core/a;", "dataStore$delegate", "Lkotlin/properties/e;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/d;", "dataStore", "consent_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
public final class ConsentPreferencesStorageKt {
    static final /* synthetic */ C11510n<Object>[] $$delegatedProperties = {C11342l0.m43564u(new PropertyReference1Impl(ConsentPreferencesStorageKt.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    @C12579k
    private static final String CONSENT_DATA_STORE_PREF_NAME = "CONSENT_PREFS";
    @C12579k
    private static final C11427e dataStore$delegate = PreferenceDataStoreDelegateKt.m84092b(CONSENT_DATA_STORE_PREF_NAME, (C18576b) null, (C11300l) null, (C12074o0) null, 14, (Object) null);

    /* access modifiers changed from: private */
    public static final C18570d<C18602a> getDataStore(Context context) {
        return (C18570d) dataStore$delegate.mo22938a(context, $$delegatedProperties[0]);
    }
}
