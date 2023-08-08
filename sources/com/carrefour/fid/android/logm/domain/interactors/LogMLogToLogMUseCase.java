package com.carrefour.fid.android.logm.domain.interactors;

import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.logm.C38243b;
import com.carrefour.fid.android.logm.data.repositories.LoggerRepository;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class LogMLogToLogMUseCase implements C37694a {
    @C12579k

    /* renamed from: a */
    public final LoggerRepository f96969a;
    @C12579k

    /* renamed from: b */
    public final C38243b f96970b;

    @Inject
    public LogMLogToLogMUseCase(@C12579k LoggerRepository loggerRepository, @C12579k C38243b bVar) {
        Intrinsics.checkNotNullParameter(loggerRepository, "repository");
        Intrinsics.checkNotNullParameter(bVar, "logMAppContext");
        this.f96969a = loggerRepository;
        this.f96970b = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173014invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.logm.LogMEntry r28, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            boolean r3 = r2 instanceof com.carrefour.fid.android.logm.domain.interactors.LogMLogToLogMUseCase$invoke$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.carrefour.fid.android.logm.domain.interactors.LogMLogToLogMUseCase$invoke$1 r3 = (com.carrefour.fid.android.logm.domain.interactors.LogMLogToLogMUseCase$invoke$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.carrefour.fid.android.logm.domain.interactors.LogMLogToLogMUseCase$invoke$1 r3 = new com.carrefour.fid.android.logm.domain.interactors.LogMLogToLogMUseCase$invoke$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r5 = r3.label
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x004b
            if (r5 == r7) goto L_0x003b
            if (r5 != r6) goto L_0x0033
            kotlin.C11661u0.m45747n(r2)
            goto L_0x00b1
        L_0x0033:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003b:
            java.lang.Object r1 = r3.L$2
            com.carrefour.fid.android.domain.models.logm.LogMEntry r1 = (com.carrefour.fid.android.domain.models.logm.LogMEntry) r1
            java.lang.Object r5 = r3.L$1
            com.carrefour.fid.android.domain.models.logm.LogMEntry r5 = (com.carrefour.fid.android.domain.models.logm.LogMEntry) r5
            java.lang.Object r7 = r3.L$0
            com.carrefour.fid.android.logm.domain.interactors.LogMLogToLogMUseCase r7 = (com.carrefour.fid.android.logm.domain.interactors.LogMLogToLogMUseCase) r7
            kotlin.C11661u0.m45747n(r2)
            goto L_0x0067
        L_0x004b:
            kotlin.C11661u0.m45747n(r2)
            java.lang.String r2 = r28.getAppContext()
            if (r2 != 0) goto L_0x006e
            com.carrefour.fid.android.logm.b r2 = r0.f96970b
            r3.L$0 = r0
            r3.L$1 = r1
            r3.L$2 = r1
            r3.label = r7
            java.lang.Object r2 = r2.mo111400a(r3)
            if (r2 != r4) goto L_0x0065
            return r4
        L_0x0065:
            r7 = r0
            r5 = r1
        L_0x0067:
            java.lang.String r2 = (java.lang.String) r2
            r8 = r2
            r2 = r7
            r7 = r1
            r1 = r5
            goto L_0x0071
        L_0x006e:
            r7 = r1
            r8 = r2
            r2 = r0
        L_0x0071:
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            java.lang.String r1 = r1.getVersion()
            if (r1 != 0) goto L_0x0092
            com.carrefour.fid.android.logm.b r1 = r2.f96970b
            java.lang.String r1 = r1.mo111401b()
        L_0x0092:
            r23 = r1
            r24 = 0
            r25 = 98302(0x17ffe, float:1.3775E-40)
            r26 = 0
            com.carrefour.fid.android.domain.models.logm.LogMEntry r1 = com.carrefour.fid.android.domain.models.logm.LogMEntry.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            com.carrefour.fid.android.logm.data.repositories.LoggerRepository r2 = r2.f96969a
            r5 = 0
            r3.L$0 = r5
            r3.L$1 = r5
            r3.L$2 = r5
            r3.label = r6
            java.lang.Object r1 = r2.mo119865g(r1, r3)
            if (r1 != r4) goto L_0x00b1
            return r4
        L_0x00b1:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.logm.domain.interactors.LogMLogToLogMUseCase.m173014invokegIAlus(com.carrefour.fid.android.domain.models.logm.LogMEntry, kotlin.coroutines.c):java.lang.Object");
    }
}
