package com.carrefour.fid.android.data.logm;

import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

public interface ParsingWithLog {

    public static final class DefaultImpls {
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        @org.jetbrains.annotations.C12580l
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.Object m149880a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.data.logm.ParsingWithLog r25, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.logm.C37694a r26, @org.jetbrains.annotations.C12579k java.lang.String r27, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r28) {
            /*
                r0 = r28
                boolean r1 = r0 instanceof com.carrefour.fid.android.data.logm.ParsingWithLog$sendLog$1
                if (r1 == 0) goto L_0x0015
                r1 = r0
                com.carrefour.fid.android.data.logm.ParsingWithLog$sendLog$1 r1 = (com.carrefour.fid.android.data.logm.ParsingWithLog$sendLog$1) r1
                int r2 = r1.label
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L_0x0015
                int r2 = r2 - r3
                r1.label = r2
                goto L_0x001a
            L_0x0015:
                com.carrefour.fid.android.data.logm.ParsingWithLog$sendLog$1 r1 = new com.carrefour.fid.android.data.logm.ParsingWithLog$sendLog$1
                r1.<init>(r0)
            L_0x001a:
                java.lang.Object r0 = r1.result
                java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r3 = r1.label
                r4 = 1
                if (r3 == 0) goto L_0x0039
                if (r3 != r4) goto L_0x0031
                kotlin.C11661u0.m45747n(r0)
                kotlin.Result r0 = (kotlin.Result) r0
                r0.mo21858l()
                goto L_0x00a6
            L_0x0031:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0039:
                kotlin.C11661u0.m45747n(r0)
                com.carrefour.fid.android.domain.models.logm.LogMAction r7 = com.carrefour.fid.android.domain.models.logm.LogMAction.PARSING
                com.carrefour.fid.android.domain.models.logm.LogMSeverity r15 = com.carrefour.fid.android.domain.models.logm.LogMSeverity.ERROR
                retrofit2.w r0 = r25.getResponse()
                okhttp3.Response r0 = r0.mo30578i()
                okhttp3.Request r0 = r0.request()
                okhttp3.HttpUrl r0 = r0.url()
                java.net.URL r0 = r0.url()
                java.lang.String r20 = r0.toString()
                retrofit2.w r0 = r25.getResponse()
                okhttp3.Response r0 = r0.mo30578i()
                int r0 = r0.code()
                java.lang.String r16 = java.lang.String.valueOf(r0)
                retrofit2.w r0 = r25.getResponse()
                okhttp3.Response r0 = r0.mo30578i()
                okhttp3.Request r0 = r0.request()
                java.lang.String r3 = "X-Correlation-Id"
                java.lang.String r0 = r0.header(r3)
                if (r0 != 0) goto L_0x007e
                java.lang.String r0 = ""
            L_0x007e:
                r8 = r0
                com.carrefour.fid.android.domain.models.logm.LogMEntry r0 = new com.carrefour.fid.android.domain.models.logm.LogMEntry
                r5 = r0
                r6 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r17 = 0
                r18 = 0
                java.lang.String r21 = "17.7.1"
                r22 = 0
                r23 = 72185(0x119f9, float:1.01153E-40)
                r24 = 0
                r19 = r27
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                r1.label = r4
                r3 = r26
                java.lang.Object r0 = r3.m172966invokegIAlus(r0, r1)
                if (r0 != r2) goto L_0x00a6
                return r2
            L_0x00a6:
                kotlin.d2 r0 = kotlin.C11079d2.f28267a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.logm.ParsingWithLog.DefaultImpls.m149880a(com.carrefour.fid.android.data.logm.ParsingWithLog, com.carrefour.fid.android.domain.interactors.logm.a, java.lang.String, kotlin.coroutines.c):java.lang.Object");
        }
    }

    @C12580l
    /* renamed from: a */
    Object mo111413a(@C12579k C37694a aVar, @C12579k String str, @C12579k C11045c<? super C11079d2> cVar);

    /* renamed from: b */
    void mo111414b(@C12579k C13091w<?> wVar);

    @C12579k
    C13091w<?> getResponse();
}
