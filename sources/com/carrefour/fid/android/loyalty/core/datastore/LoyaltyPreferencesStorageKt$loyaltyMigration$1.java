package com.carrefour.fid.android.loyalty.core.datastore;

import androidx.datastore.migrations.C18587b;
import androidx.datastore.preferences.core.C18602a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorageKt$loyaltyMigration$1", mo22502f = "LoyaltyPreferencesStorage.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H@"}, mo22516d2 = {"Landroidx/datastore/migrations/b;", "sharedPrefs", "Landroidx/datastore/preferences/core/a;", "currentData", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLoyaltyPreferencesStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyPreferencesStorage.kt\ncom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorageKt$loyaltyMigration$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,109:1\n1549#2:110\n1620#2,3:111\n515#3:114\n500#3,6:115\n*S KotlinDebug\n*F\n+ 1 LoyaltyPreferencesStorage.kt\ncom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorageKt$loyaltyMigration$1\n*L\n40#1:110\n40#1:111,3\n42#1:114\n42#1:115,6\n*E\n"})
public final class LoyaltyPreferencesStorageKt$loyaltyMigration$1 extends SuspendLambda implements C11305q<C18587b, C18602a, C11045c<? super C18602a>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public LoyaltyPreferencesStorageKt$loyaltyMigration$1(C11045c<? super LoyaltyPreferencesStorageKt$loyaltyMigration$1> cVar) {
        super(3, cVar);
    }

    @C12580l
    public final Object invoke(@C12579k C18587b bVar, @C12579k C18602a aVar, @C12580l C11045c<? super C18602a> cVar) {
        LoyaltyPreferencesStorageKt$loyaltyMigration$1 loyaltyPreferencesStorageKt$loyaltyMigration$1 = new LoyaltyPreferencesStorageKt$loyaltyMigration$1(cVar);
        loyaltyPreferencesStorageKt$loyaltyMigration$1.L$0 = bVar;
        loyaltyPreferencesStorageKt$loyaltyMigration$1.L$1 = aVar;
        return loyaltyPreferencesStorageKt$loyaltyMigration$1.invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r0 = r5.label
            if (r0 != 0) goto L_0x00c9
            kotlin.C11661u0.m45747n(r6)
            java.lang.Object r6 = r5.L$0
            androidx.datastore.migrations.b r6 = (androidx.datastore.migrations.C18587b) r6
            java.lang.Object r0 = r5.L$1
            androidx.datastore.preferences.core.a r0 = (androidx.datastore.preferences.core.C18602a) r0
            java.util.Map r1 = r0.mo53692a()
            java.util.Set r1 = r1.keySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.C10978t.m41495Y(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x002b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x003f
            java.lang.Object r3 = r1.next()
            androidx.datastore.preferences.core.a$a r3 = (androidx.datastore.preferences.core.C18602a.C18603a) r3
            java.lang.String r3 = r3.mo53719a()
            r2.add(r3)
            goto L_0x002b
        L_0x003f:
            java.util.Map r6 = r6.mo53597c()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0050:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0076
            java.lang.Object r3 = r6.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r2.contains(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0050
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            r1.put(r4, r3)
            goto L_0x0050
        L_0x0076:
            androidx.datastore.preferences.core.MutablePreferences r6 = r0.mo53717d()
            java.lang.String r0 = "HAS_PRIME_FID"
            boolean r2 = r1.containsKey(r0)
            r3 = 0
            if (r2 == 0) goto L_0x00a4
            com.carrefour.fid.android.shared.data.datastore.pref.f r2 = com.carrefour.fid.android.shared.data.datastore.pref.C28632f.f70212a
            androidx.datastore.preferences.core.a$a r2 = r2.mo83524a()
            java.lang.Object r0 = r1.get(r0)
            boolean r4 = r0 instanceof java.lang.Boolean
            if (r4 == 0) goto L_0x0094
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x0095
        L_0x0094:
            r0 = r3
        L_0x0095:
            if (r0 == 0) goto L_0x009c
            boolean r0 = r0.booleanValue()
            goto L_0x009d
        L_0x009c:
            r0 = 0
        L_0x009d:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r0)
            r6.mo53706o(r2, r0)
        L_0x00a4:
            java.lang.String r0 = "cardNumber"
            boolean r2 = r1.containsKey(r0)
            if (r2 == 0) goto L_0x00c4
            com.carrefour.fid.android.shared.data.datastore.pref.f r2 = com.carrefour.fid.android.shared.data.datastore.pref.C28632f.f70212a
            androidx.datastore.preferences.core.a$a r2 = r2.mo83525b()
            java.lang.Object r0 = r1.get(r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x00bd
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
        L_0x00bd:
            if (r3 != 0) goto L_0x00c1
            java.lang.String r3 = ""
        L_0x00c1:
            r6.mo53706o(r2, r3)
        L_0x00c4:
            androidx.datastore.preferences.core.a r6 = r6.mo53718e()
            return r6
        L_0x00c9:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorageKt$loyaltyMigration$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
