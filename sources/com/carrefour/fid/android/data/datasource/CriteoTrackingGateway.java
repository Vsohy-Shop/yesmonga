package com.carrefour.fid.android.data.datasource;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.cache.C36378a;
import com.carrefour.fid.android.data.repositories.CriteoRepository;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.shared.p046io.CriteoTrackingThrowable;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCriteoTrackingGateway.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CriteoTrackingGateway.kt\ncom/carrefour/fid/android/data/datasource/CriteoTrackingGateway\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1#2:66\n1855#3,2:67\n*S KotlinDebug\n*F\n+ 1 CriteoTrackingGateway.kt\ncom/carrefour/fid/android/data/datasource/CriteoTrackingGateway\n*L\n54#1:67,2\n*E\n"})
public final class CriteoTrackingGateway {

    /* renamed from: e */
    public static final int f90001e = 8;
    @C12579k

    /* renamed from: a */
    public final Context f90002a;
    @C12579k

    /* renamed from: b */
    public final CriteoRepository f90003b;
    @C12579k

    /* renamed from: c */
    public final C37807b f90004c;
    @C12579k

    /* renamed from: d */
    public List<C36378a> f90005d = new ArrayList();

    @Inject
    public CriteoTrackingGateway(@C10255b @C12579k Context context, @C12579k CriteoRepository criteoRepository, @C12579k C37807b bVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(criteoRepository, "criteoRepository");
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        this.f90002a = context;
        this.f90003b = criteoRepository;
        this.f90004c = bVar;
    }

    @C0344h1(otherwise = 2)
    /* renamed from: e */
    public static /* synthetic */ void m149238e() {
    }

    /* renamed from: i */
    public static final boolean m149239i(C11300l lVar, Object obj) {
        Intrinsics.checkNotNullParameter(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    @C12579k
    /* renamed from: d */
    public final List<C36378a> mo108649d() {
        return this.f90005d;
    }

    /* renamed from: f */
    public final Object mo108650f(String str, boolean z) {
        mo108652h();
        this.f90005d.add(new C36378a(str, z, 0, 4, (DefaultConstructorMarker) null));
        Result.C10852a aVar = Result.f28060a;
        return Result.m38702b(C11661u0.m45734a(new CriteoTrackingThrowable()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108651g(java.lang.String r7, boolean r8, kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$handleTrackingEvent$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$handleTrackingEvent$1 r0 = (com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$handleTrackingEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$handleTrackingEvent$1 r0 = new com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$handleTrackingEvent$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r7 = r9.mo21858l()
            goto L_0x0092
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            boolean r8 = r0.Z$0
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.datasource.CriteoTrackingGateway r2 = (com.carrefour.fid.android.data.datasource.CriteoTrackingGateway) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x006a
        L_0x004e:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r9 = r6.f90004c
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r5 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.Criteo
            r2.<init>(r5)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.Z$0 = r8
            r0.label = r4
            java.lang.Object r9 = r9.m172966invokegIAlus(r2, r0)
            if (r9 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r2 = r6
        L_0x006a:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r9)
            if (r4 != 0) goto L_0x0083
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r9.booleanValue()
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r7 = r2.mo108653j(r7, r8, r0)
            if (r7 != r1) goto L_0x0092
            return r1
        L_0x0083:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.RemoteConfigFeatureUnavailableThrowable r7 = new com.carrefour.fid.android.shared.io.RemoteConfigFeatureUnavailableThrowable
            r7.<init>()
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
        L_0x0092:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.CriteoTrackingGateway.mo108651g(java.lang.String, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: h */
    public final void mo108652h() {
        this.f90005d.removeIf(new C36391c(CriteoTrackingGateway$removeInvalidTracking$1.f90006f));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b A[SYNTHETIC, Splitter:B:17:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108653j(java.lang.String r5, boolean r6, kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$sendCriteoTrackingEvent$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$sendCriteoTrackingEvent$1 r0 = (com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$sendCriteoTrackingEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$sendCriteoTrackingEvent$1 r0 = new com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$sendCriteoTrackingEvent$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.data.repositories.CriteoRepository r7 = r4.f90003b
            r0.label = r3
            java.lang.Object r5 = r7.mo111495l(r5, r6, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r6 = kotlin.Result.m38710j(r5)
            if (r6 == 0) goto L_0x0060
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0059 }
            kotlin.d2 r5 = (kotlin.C11079d2) r5     // Catch:{ all -> 0x0059 }
            kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0059 }
            kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0059 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0059 }
            goto L_0x0064
        L_0x0059:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
        L_0x0060:
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0064:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.CriteoTrackingGateway.mo108653j(java.lang.String, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: k */
    public final void mo108654k(@C12579k List<C36378a> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f90005d = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108655l(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$syncTrackingEvents$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$syncTrackingEvents$1 r0 = (com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$syncTrackingEvents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$syncTrackingEvents$1 r0 = new com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$syncTrackingEvents$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r2 = r0.L$1
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.data.datasource.CriteoTrackingGateway r4 = (com.carrefour.fid.android.data.datasource.CriteoTrackingGateway) r4
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            r7.mo21858l()
            goto L_0x004e
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003e:
            kotlin.C11661u0.m45747n(r7)
            r6.mo108652h()
            java.util.List<com.carrefour.fid.android.data.cache.a> r7 = r6.f90005d
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r4 = r6
            r2 = r7
        L_0x004e:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x006f
            java.lang.Object r7 = r2.next()
            com.carrefour.fid.android.data.cache.a r7 = (com.carrefour.fid.android.data.cache.C36378a) r7
            java.lang.String r5 = r7.mo108644d()
            boolean r7 = r7.mo108645e()
            r0.L$0 = r4
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r4.mo108651g(r5, r7, r0)
            if (r7 != r1) goto L_0x004e
            return r1
        L_0x006f:
            java.util.List<com.carrefour.fid.android.data.cache.a> r7 = r4.f90005d
            r7.clear()
            kotlin.Result$a r7 = kotlin.Result.f28060a
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.CriteoTrackingGateway.mo108655l(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108656m(@org.jetbrains.annotations.C12579k java.lang.String r5, boolean r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$trackEvent$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$trackEvent$1 r0 = (com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$trackEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$trackEvent$1 r0 = new com.carrefour.fid.android.data.datasource.CriteoTrackingGateway$trackEvent$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.shared.util.s r7 = com.carrefour.fid.android.shared.util.C28951s.f70964a
            android.content.Context r2 = r4.f90002a
            boolean r7 = r7.mo84281g(r2)
            if (r7 == 0) goto L_0x004e
            r0.label = r3
            java.lang.Object r5 = r4.mo108651g(r5, r6, r0)
            if (r5 != r1) goto L_0x004d
            return r1
        L_0x004d:
            return r5
        L_0x004e:
            java.lang.Object r5 = r4.mo108650f(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.CriteoTrackingGateway.mo108656m(java.lang.String, boolean, kotlin.coroutines.c):java.lang.Object");
    }
}
