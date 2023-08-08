package com.carrefour.fid.android.loyalty.core.datastore;

import android.content.Context;
import androidx.datastore.core.C18570d;
import androidx.datastore.core.handlers.C18576b;
import androidx.datastore.migrations.C18587b;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.C18602a;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.properties.C11427e;
import kotlin.reflect.C11510n;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a4\u0010\u0005\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\n\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\t\"%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f*\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo22516d2 = {"Lkotlin/Function3;", "Landroidx/datastore/migrations/b;", "Landroidx/datastore/preferences/core/a;", "Lkotlin/coroutines/c;", "", "loyaltyMigration", "()Lkotlin/jvm/functions/q;", "", "LOYALTY_DATA_STORE_PREF_NAME", "Ljava/lang/String;", "LEGACY_LOYALTY_SHARED_PREF_NAME", "Landroid/content/Context;", "Landroidx/datastore/core/d;", "dataStore$delegate", "Lkotlin/properties/e;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/d;", "dataStore", "loyalty_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
public final class LoyaltyPreferencesStorageKt {
    @C12579k
    private static final String LEGACY_LOYALTY_SHARED_PREF_NAME = "Loyalty";
    @C12579k
    private static final String LOYALTY_DATA_STORE_PREF_NAME = "LOYALTY_PREFS";

    /* renamed from: a */
    public static final /* synthetic */ C11510n<Object>[] f97016a = {C11342l0.m43564u(new PropertyReference1Impl(LoyaltyPreferencesStorageKt.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    @C12579k
    private static final C11427e dataStore$delegate = PreferenceDataStoreDelegateKt.m84092b(LOYALTY_DATA_STORE_PREF_NAME, (C18576b) null, LoyaltyPreferencesStorageKt$dataStore$2.INSTANCE, (C12074o0) null, 10, (Object) null);

    /* access modifiers changed from: private */
    public static final C18570d<C18602a> getDataStore(Context context) {
        return (C18570d) dataStore$delegate.mo22938a(context, f97016a[0]);
    }

    /* access modifiers changed from: private */
    public static final C11305q<C18587b, C18602a, C11045c<? super C18602a>, Object> loyaltyMigration() {
        return new LoyaltyPreferencesStorageKt$loyaltyMigration$1((C11045c<? super LoyaltyPreferencesStorageKt$loyaltyMigration$1>) null);
    }
}
