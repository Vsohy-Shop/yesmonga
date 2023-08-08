package com.carrefour.fid.android.domain.interactors.criteo;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.CriteoRepository;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nCriteoSendCriteoEventUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CriteoSendCriteoEventUseCase.kt\ncom/carrefour/fid/android/domain/interactors/criteo/CriteoSendCriteoEventUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1#2:22\n*E\n"})
public final class CriteoSendCriteoEventUseCase implements C37670i {

    /* renamed from: c */
    public static final int f94499c = 8;
    @C12579k

    /* renamed from: a */
    public final CriteoRepository f94500a;
    @C12579k

    /* renamed from: b */
    public final C37807b f94501b;

    @Inject
    public CriteoSendCriteoEventUseCase(@C12579k CriteoRepository criteoRepository, @C12579k C37807b bVar) {
        Intrinsics.checkNotNullParameter(criteoRepository, "criteoRepository");
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        this.f94500a = criteoRepository;
        this.f94501b = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e A[SYNTHETIC, Splitter:B:22:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172960invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.criteo.C37670i.C37671a r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.domain.interactors.criteo.CriteoSendCriteoEventUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.domain.interactors.criteo.CriteoSendCriteoEventUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.criteo.CriteoSendCriteoEventUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.criteo.CriteoSendCriteoEventUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.criteo.CriteoSendCriteoEventUseCase$invoke$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0032 }
            kotlin.Result r8 = (kotlin.Result) r8     // Catch:{ all -> 0x0032 }
            java.lang.Object r7 = r8.mo21858l()     // Catch:{ all -> 0x0032 }
            goto L_0x0083
        L_0x0032:
            r7 = move-exception
            goto L_0x008d
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            java.lang.Object r7 = r0.L$1
            com.carrefour.fid.android.domain.interactors.criteo.i$a r7 = (com.carrefour.fid.android.domain.interactors.criteo.C37670i.C37671a) r7
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.criteo.CriteoSendCriteoEventUseCase r2 = (com.carrefour.fid.android.domain.interactors.criteo.CriteoSendCriteoEventUseCase) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0068
        L_0x004e:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r8 = r6.f94501b
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r5 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.Criteo
            r2.<init>(r5)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.m172966invokegIAlus(r2, r0)
            if (r8 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r2 = r6
        L_0x0068:
            boolean r4 = kotlin.Result.m38710j(r8)
            if (r4 == 0) goto L_0x0098
            kotlin.Result$a r4 = kotlin.Result.f28060a     // Catch:{ all -> 0x0032 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0032 }
            r8.booleanValue()     // Catch:{ all -> 0x0032 }
            r8 = 0
            r0.L$0 = r8     // Catch:{ all -> 0x0032 }
            r0.L$1 = r8     // Catch:{ all -> 0x0032 }
            r0.label = r3     // Catch:{ all -> 0x0032 }
            java.lang.Object r7 = r2.mo114646c(r7, r0)     // Catch:{ all -> 0x0032 }
            if (r7 != r1) goto L_0x0083
            return r1
        L_0x0083:
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0032 }
            kotlin.d2 r7 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0032 }
            java.lang.Object r7 = kotlin.Result.m38702b(r7)     // Catch:{ all -> 0x0032 }
            goto L_0x009c
        L_0x008d:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            goto L_0x009c
        L_0x0098:
            java.lang.Object r7 = kotlin.Result.m38702b(r8)
        L_0x009c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.criteo.CriteoSendCriteoEventUseCase.m172960invokegIAlus(com.carrefour.fid.android.domain.interactors.criteo.i$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114646c(com.carrefour.fid.android.domain.interactors.criteo.C37670i.C37671a r5, kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.interactors.criteo.CriteoSendCriteoEventUseCase$sendCriteoEvent$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.domain.interactors.criteo.CriteoSendCriteoEventUseCase$sendCriteoEvent$1 r0 = (com.carrefour.fid.android.domain.interactors.criteo.CriteoSendCriteoEventUseCase$sendCriteoEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.criteo.CriteoSendCriteoEventUseCase$sendCriteoEvent$1 r0 = new com.carrefour.fid.android.domain.interactors.criteo.CriteoSendCriteoEventUseCase$sendCriteoEvent$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.data.repositories.CriteoRepository r6 = r4.f94500a
            com.carrefour.fid.android.domain.models.criteo.h r5 = r5.mo114684d()
            r0.label = r3
            java.lang.Object r5 = r6.mo111494k(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.criteo.CriteoSendCriteoEventUseCase.mo114646c(com.carrefour.fid.android.domain.interactors.criteo.i$a, kotlin.coroutines.c):java.lang.Object");
    }
}
