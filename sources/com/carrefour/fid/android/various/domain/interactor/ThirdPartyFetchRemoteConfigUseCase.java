package com.carrefour.fid.android.various.domain.interactor;

import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37809c;
import com.carrefour.fid.android.various.domain.repository.C22798d;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class ThirdPartyFetchRemoteConfigUseCase implements C37809c {
    @C12579k

    /* renamed from: a */
    public final C22798d f58335a;
    @C12579k

    /* renamed from: b */
    public final C37694a f58336b;

    @Inject
    public ThirdPartyFetchRemoteConfigUseCase(@C12579k C22798d dVar, @C12579k C37694a aVar) {
        Intrinsics.checkNotNullParameter(dVar, "repository");
        Intrinsics.checkNotNullParameter(aVar, "remoteLogUseCase");
        this.f58335a = dVar;
        this.f58336b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67194c(java.lang.Throwable r27, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r28
            boolean r2 = r1 instanceof com.carrefour.fid.android.various.domain.interactor.ThirdPartyFetchRemoteConfigUseCase$logFetchError$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.various.domain.interactor.ThirdPartyFetchRemoteConfigUseCase$logFetchError$1 r2 = (com.carrefour.fid.android.various.domain.interactor.ThirdPartyFetchRemoteConfigUseCase$logFetchError$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.various.domain.interactor.ThirdPartyFetchRemoteConfigUseCase$logFetchError$1 r2 = new com.carrefour.fid.android.various.domain.interactor.ThirdPartyFetchRemoteConfigUseCase$logFetchError$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x003a
            if (r4 != r5) goto L_0x0032
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            r1.mo21858l()
            goto L_0x0075
        L_0x0032:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003a:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.logm.a r1 = r0.f58336b
            com.carrefour.fid.android.domain.models.logm.LogMAction r8 = com.carrefour.fid.android.domain.models.logm.LogMAction.FIREBASE
            com.carrefour.fid.android.domain.models.logm.LogMSeverity r16 = com.carrefour.fid.android.domain.models.logm.LogMSeverity.ERROR
            java.lang.String r4 = r27.getMessage()
            if (r4 != 0) goto L_0x004b
            java.lang.String r4 = ""
        L_0x004b:
            r20 = r4
            com.carrefour.fid.android.domain.models.logm.LogMEntry r4 = new com.carrefour.fid.android.domain.models.logm.LogMEntry
            r6 = r4
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            java.lang.String r21 = "fetch"
            r22 = 0
            r23 = 0
            r24 = 105981(0x19dfd, float:1.48511E-40)
            r25 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r2.label = r5
            java.lang.Object r1 = r1.m172966invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x0075
            return r3
        L_0x0075:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.domain.interactor.ThirdPartyFetchRemoteConfigUseCase.mo67194c(java.lang.Throwable, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172813invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.various.domain.interactor.ThirdPartyFetchRemoteConfigUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.various.domain.interactor.ThirdPartyFetchRemoteConfigUseCase$invoke$1 r0 = (com.carrefour.fid.android.various.domain.interactor.ThirdPartyFetchRemoteConfigUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.various.domain.interactor.ThirdPartyFetchRemoteConfigUseCase$invoke$1 r0 = new com.carrefour.fid.android.various.domain.interactor.ThirdPartyFetchRemoteConfigUseCase$invoke$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r0 = r0.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.C11661u0.m45747n(r6)
            goto L_0x007a
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0038:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.various.domain.interactor.ThirdPartyFetchRemoteConfigUseCase r2 = (com.carrefour.fid.android.various.domain.interactor.ThirdPartyFetchRemoteConfigUseCase) r2
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0057
        L_0x0046:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.various.domain.repository.d r6 = r5.f58335a
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.mo67179b(r0)
            if (r6 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r2 = r5
        L_0x0057:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r6)
            if (r4 != 0) goto L_0x006e
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x0084
        L_0x006e:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r2.mo67194c(r4, r0)
            if (r6 != r1) goto L_0x0079
            return r1
        L_0x0079:
            r0 = r4
        L_0x007a:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x0084:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.domain.interactor.ThirdPartyFetchRemoteConfigUseCase.m172813invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
