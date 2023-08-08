package com.carrefour.fid.android.shared.data.datastore.pref;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import androidx.datastore.core.C18570d;
import androidx.datastore.preferences.core.C18602a;
import androidx.datastore.preferences.core.C18606c;
import androidx.datastore.preferences.core.PreferencesKt;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nBaseAppPrefImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAppPrefImpl.kt\ncom/carrefour/fid/android/shared/data/datastore/pref/BaseAppPreferencesStorage\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,54:1\n53#2:55\n55#2:59\n50#3:56\n55#3:58\n106#4:57\n*S KotlinDebug\n*F\n+ 1 BaseAppPrefImpl.kt\ncom/carrefour/fid/android/shared/data/datastore/pref/BaseAppPreferencesStorage\n*L\n34#1:55\n34#1:59\n34#1:56\n34#1:58\n34#1:57\n*E\n"})
public final class BaseAppPreferencesStorage {

    /* renamed from: d */
    public static final int f70153d = 8;
    @C12579k

    /* renamed from: a */
    public final Context f70154a;
    @C12579k

    /* renamed from: b */
    public final C18570d<C18602a> f70155b;
    @C12579k

    /* renamed from: c */
    public final C18602a.C18603a<String> f70156c = C18606c.m84364f(C28629c.f70207c);

    @Inject
    public BaseAppPreferencesStorage(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f70154a = context;
        this.f70155b = C28629c.m118539b(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo83495c(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super com.carrefour.fid.android.shared.data.datastore.pref.C28631e> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage$getBasePreferences$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage$getBasePreferences$1 r0 = (com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage$getBasePreferences$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage$getBasePreferences$1 r0 = new com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage$getBasePreferences$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.shared.data.datastore.pref.e r0 = (com.carrefour.fid.android.shared.data.datastore.pref.C28631e) r0
            kotlin.C11661u0.m45747n(r7)
            goto L_0x008a
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003c:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage r2 = (com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage) r2
            kotlin.C11661u0.m45747n(r7)
            goto L_0x005e
        L_0x0044:
            kotlin.C11661u0.m45747n(r7)
            androidx.datastore.core.d<androidx.datastore.preferences.core.a> r7 = r6.f70155b
            kotlinx.coroutines.flow.e r7 = r7.getData()
            com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage$getBasePreferences$$inlined$map$1 r2 = new com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage$getBasePreferences$$inlined$map$1
            r2.<init>(r7, r6)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = kotlinx.coroutines.flow.C11909g.m47495u0(r2, r0)
            if (r7 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r2 = r6
        L_0x005e:
            com.carrefour.fid.android.shared.data.datastore.pref.e r7 = (com.carrefour.fid.android.shared.data.datastore.pref.C28631e) r7
            java.lang.String r5 = r7.mo83520d()
            int r5 = r5.length()
            if (r5 != 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r4 = 0
        L_0x006c:
            if (r4 == 0) goto L_0x008e
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "randomUUID().toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.L$0 = r7
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r0 = r2.mo83498f(r4, r0)
            if (r0 != r1) goto L_0x0088
            return r1
        L_0x0088:
            r0 = r7
            r1 = r4
        L_0x008a:
            com.carrefour.fid.android.shared.data.datastore.pref.e r7 = r0.mo83519b(r1)
        L_0x008e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage.mo83495c(kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: d */
    public final Context mo83496d() {
        return this.f70154a;
    }

    @C12579k
    /* renamed from: e */
    public final C18570d<C18602a> mo83497e() {
        return this.f70155b;
    }

    /* renamed from: f */
    public final Object mo83498f(String str, C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f70155b, new BaseAppPreferencesStorage$setUuid$2(this, str, (C11045c<? super BaseAppPreferencesStorage$setUuid$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }
}
