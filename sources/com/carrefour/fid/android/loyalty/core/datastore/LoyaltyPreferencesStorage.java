package com.carrefour.fid.android.loyalty.core.datastore;

import android.content.Context;
import androidx.datastore.core.C18570d;
import androidx.datastore.preferences.core.C18602a;
import androidx.datastore.preferences.core.PreferencesKt;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u001b\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0004J\u001b\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0004J\u0013\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0004J\u0013\u0010\u0011\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0004R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferences;", "getLoyaltyPreferences", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/d2;", "setPrimesFidLaunched", "", "loyaltyCardNumber", "setLoyaltyCardNumber", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getLoyaltyCardNumber", "", "hasPrimeFid", "setHasPrimeFid", "(ZLkotlin/coroutines/c;)Ljava/lang/Object;", "hasLoyaltyCard", "clearLoyaltyCard", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroidx/datastore/core/d;", "Landroidx/datastore/preferences/core/a;", "dataStore", "Landroidx/datastore/core/d;", "<init>", "(Landroid/content/Context;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLoyaltyPreferencesStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyPreferencesStorage.kt\ncom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,109:1\n53#2:110\n55#2:114\n50#3:111\n55#3:113\n106#4:112\n*S KotlinDebug\n*F\n+ 1 LoyaltyPreferencesStorage.kt\ncom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage\n*L\n63#1:110\n63#1:114\n63#1:111\n63#1:113\n63#1:112\n*E\n"})
public final class LoyaltyPreferencesStorage {
    @C12579k
    private final Context context;
    @C12579k
    private final C18570d<C18602a> dataStore;

    @Inject
    public LoyaltyPreferencesStorage(@C10255b @C12579k Context context2) {
        Intrinsics.checkNotNullParameter(context2, C9175a.f24932Y);
        this.context = context2;
        this.dataStore = LoyaltyPreferencesStorageKt.getDataStore(context2);
    }

    @C12580l
    public final Object clearLoyaltyCard(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.dataStore, new LoyaltyPreferencesStorage$clearLoyaltyCard$2((C11045c<? super LoyaltyPreferencesStorage$clearLoyaltyCard$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12579k
    public final Context getContext() {
        return this.context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getLoyaltyCardNumber(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$getLoyaltyCardNumber$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$getLoyaltyCardNumber$1 r0 = (com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$getLoyaltyCardNumber$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$getLoyaltyCardNumber$1 r0 = new com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$getLoyaltyCardNumber$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            r0.label = r3
            java.lang.Object r5 = r4.getLoyaltyPreferences(r0)
            if (r5 != r1) goto L_0x003d
            return r1
        L_0x003d:
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferences r5 = (com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferences) r5
            java.lang.String r5 = r5.getLoyaltyCardNumber()
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            if (r3 == 0) goto L_0x0057
            com.carrefour.fid.android.shared.util.s r0 = com.carrefour.fid.android.shared.util.C28951s.f70964a
            java.lang.String r5 = r0.mo84276b(r5)
            if (r5 != 0) goto L_0x0057
            java.lang.String r5 = ""
        L_0x0057:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage.getLoyaltyCardNumber(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    public final Object getLoyaltyPreferences(@C12579k C11045c<? super LoyaltyPreferences> cVar) {
        return C11909g.m47495u0(new LoyaltyPreferencesStorage$getLoyaltyPreferences$$inlined$map$1(this.dataStore.getData()), cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object hasLoyaltyCard(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$hasLoyaltyCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$hasLoyaltyCard$1 r0 = (com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$hasLoyaltyCard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$hasLoyaltyCard$1 r0 = new com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$hasLoyaltyCard$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            r0.label = r3
            java.lang.Object r5 = r4.getLoyaltyPreferences(r0)
            if (r5 != r1) goto L_0x003d
            return r1
        L_0x003d:
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferences r5 = (com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferences) r5
            java.lang.String r5 = r5.getLoyaltyCardNumber()
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage.hasLoyaltyCard(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object hasPrimeFid(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$hasPrimeFid$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$hasPrimeFid$1 r0 = (com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$hasPrimeFid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$hasPrimeFid$1 r0 = new com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$hasPrimeFid$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            r0.label = r3
            java.lang.Object r5 = r4.getLoyaltyPreferences(r0)
            if (r5 != r1) goto L_0x003d
            return r1
        L_0x003d:
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferences r5 = (com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferences) r5
            boolean r5 = r5.getHasPrimeFid()
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage.hasPrimeFid(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    public final Object setHasPrimeFid(boolean z, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.dataStore, new LoyaltyPreferencesStorage$setHasPrimeFid$2(z, (C11045c<? super LoyaltyPreferencesStorage$setHasPrimeFid$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    public final Object setLoyaltyCardNumber(@C12579k String str, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.dataStore, new LoyaltyPreferencesStorage$setLoyaltyCardNumber$2(this, str, (C11045c<? super LoyaltyPreferencesStorage$setLoyaltyCardNumber$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    public final Object setPrimesFidLaunched(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.dataStore, new LoyaltyPreferencesStorage$setPrimesFidLaunched$2((C11045c<? super LoyaltyPreferencesStorage$setPrimesFidLaunched$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }
}
