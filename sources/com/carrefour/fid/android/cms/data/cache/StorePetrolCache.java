package com.carrefour.fid.android.cms.data.cache;

import android.content.Context;
import androidx.datastore.core.C18570d;
import androidx.datastore.preferences.core.C18602a;
import androidx.datastore.preferences.core.C18606c;
import androidx.datastore.preferences.core.PreferencesKt;
import com.google.gson.C33614e;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nStorePetrolCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorePetrolCache.kt\ncom/carrefour/fid/android/cms/data/cache/StorePetrolCache\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,54:1\n53#2:55\n55#2:59\n50#3:56\n55#3:58\n106#4:57\n*S KotlinDebug\n*F\n+ 1 StorePetrolCache.kt\ncom/carrefour/fid/android/cms/data/cache/StorePetrolCache\n*L\n32#1:55\n32#1:59\n32#1:56\n32#1:58\n32#1:57\n*E\n"})
public final class StorePetrolCache {
    @C12579k

    /* renamed from: a */
    public final Context f102028a;
    @C12579k

    /* renamed from: b */
    public final C33614e f102029b = new C33614e();
    @C12579k

    /* renamed from: c */
    public final C18602a.C18603a<String> f102030c = C18606c.m84364f(C40011a.f102037c);

    @Inject
    public StorePetrolCache(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "appContext");
        this.f102028a = context;
    }

    @C12580l
    /* renamed from: c */
    public final Object mo131893c(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(mo131894d(), new StorePetrolCache$clearData$2(this, (C11045c<? super StorePetrolCache$clearData$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    /* renamed from: d */
    public final C18570d<C18602a> mo131894d() {
        return C40011a.m162973b(this.f102028a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058 A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063 A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131895e(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super com.carrefour.fid.android.cms.data.entities.StorePetrolInfoPojo> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.cms.data.cache.StorePetrolCache$getPetrolInfos$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.cms.data.cache.StorePetrolCache$getPetrolInfos$1 r0 = (com.carrefour.fid.android.cms.data.cache.StorePetrolCache$getPetrolInfos$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.cms.data.cache.StorePetrolCache$getPetrolInfos$1 r0 = new com.carrefour.fid.android.cms.data.cache.StorePetrolCache$getPetrolInfos$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.cms.data.cache.StorePetrolCache r0 = (com.carrefour.fid.android.cms.data.cache.StorePetrolCache) r0
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x0069 }
            goto L_0x0054
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0069 }
            androidx.datastore.core.d r6 = r5.mo131894d()     // Catch:{ all -> 0x0069 }
            kotlinx.coroutines.flow.e r6 = r6.getData()     // Catch:{ all -> 0x0069 }
            com.carrefour.fid.android.cms.data.cache.StorePetrolCache$getPetrolInfos$lambda$2$$inlined$map$1 r2 = new com.carrefour.fid.android.cms.data.cache.StorePetrolCache$getPetrolInfos$lambda$2$$inlined$map$1     // Catch:{ all -> 0x0069 }
            r2.<init>(r6, r5)     // Catch:{ all -> 0x0069 }
            r0.L$0 = r5     // Catch:{ all -> 0x0069 }
            r0.label = r4     // Catch:{ all -> 0x0069 }
            java.lang.Object r6 = kotlinx.coroutines.flow.C11909g.m47501w0(r2, r0)     // Catch:{ all -> 0x0069 }
            if (r6 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r0 = r5
        L_0x0054:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0069 }
            if (r6 == 0) goto L_0x0063
            com.google.gson.e r0 = r0.f102029b     // Catch:{ all -> 0x0069 }
            java.lang.Class<com.carrefour.fid.android.cms.data.entities.StorePetrolInfoPojo> r1 = com.carrefour.fid.android.cms.data.entities.StorePetrolInfoPojo.class
            java.lang.Object r6 = r0.mo97479n(r6, r1)     // Catch:{ all -> 0x0069 }
            com.carrefour.fid.android.cms.data.entities.StorePetrolInfoPojo r6 = (com.carrefour.fid.android.cms.data.entities.StorePetrolInfoPojo) r6     // Catch:{ all -> 0x0069 }
            goto L_0x0064
        L_0x0063:
            r6 = r3
        L_0x0064:
            java.lang.Object r6 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x0069 }
            goto L_0x0074
        L_0x0069:
            r6 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x0074:
            boolean r0 = kotlin.Result.m38709i(r6)
            if (r0 == 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r3 = r6
        L_0x007c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.data.cache.StorePetrolCache.mo131895e(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131896f(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.cms.data.entities.StorePetrolInfoPojo r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.cms.data.cache.StorePetrolCache$savePetrolInfos$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.cms.data.cache.StorePetrolCache$savePetrolInfos$1 r0 = (com.carrefour.fid.android.cms.data.cache.StorePetrolCache$savePetrolInfos$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.cms.data.cache.StorePetrolCache$savePetrolInfos$1 r0 = new com.carrefour.fid.android.cms.data.cache.StorePetrolCache$savePetrolInfos$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x004f }
            goto L_0x0049
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result$a r7 = kotlin.Result.f28060a     // Catch:{ all -> 0x004f }
            androidx.datastore.core.d r7 = r5.mo131894d()     // Catch:{ all -> 0x004f }
            com.carrefour.fid.android.cms.data.cache.StorePetrolCache$savePetrolInfos$2$1 r2 = new com.carrefour.fid.android.cms.data.cache.StorePetrolCache$savePetrolInfos$2$1     // Catch:{ all -> 0x004f }
            r4 = 0
            r2.<init>(r5, r6, r4)     // Catch:{ all -> 0x004f }
            r0.label = r3     // Catch:{ all -> 0x004f }
            java.lang.Object r7 = androidx.datastore.preferences.core.PreferencesKt.m84345a(r7, r2, r0)     // Catch:{ all -> 0x004f }
            if (r7 != r1) goto L_0x0049
            return r1
        L_0x0049:
            androidx.datastore.preferences.core.a r7 = (androidx.datastore.preferences.core.C18602a) r7     // Catch:{ all -> 0x004f }
            kotlin.Result.m38702b(r7)     // Catch:{ all -> 0x004f }
            goto L_0x0059
        L_0x004f:
            r6 = move-exception
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            kotlin.Result.m38702b(r6)
        L_0x0059:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.data.cache.StorePetrolCache.mo131896f(com.carrefour.fid.android.cms.data.entities.StorePetrolInfoPojo, kotlin.coroutines.c):java.lang.Object");
    }
}
