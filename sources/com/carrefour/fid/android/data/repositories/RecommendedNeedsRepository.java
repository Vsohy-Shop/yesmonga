package com.carrefour.fid.android.data.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.provider.headers.C36575q;
import com.carrefour.fid.android.data.service.C36636o;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
@C8567o(parameters = 0)
public final class RecommendedNeedsRepository {

    /* renamed from: c */
    public static final int f90437c = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final C36636o f90438a;
    @C12579k

    /* renamed from: b */
    public final C36575q f90439b;

    @Inject
    public RecommendedNeedsRepository(@C12579k C36636o oVar, @C12579k C36575q qVar) {
        Intrinsics.checkNotNullParameter(oVar, "service");
        Intrinsics.checkNotNullParameter(qVar, "recommendedNeedsHeaders");
        this.f90438a = oVar;
        this.f90439b = qVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111562c(@org.jetbrains.annotations.C12579k java.lang.String r11, @org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.data.entities.APIMRecommendedNeeds>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.data.repositories.RecommendedNeedsRepository$fetch$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.data.repositories.RecommendedNeedsRepository$fetch$1 r0 = (com.carrefour.fid.android.data.repositories.RecommendedNeedsRepository$fetch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.RecommendedNeedsRepository$fetch$1 r0 = new com.carrefour.fid.android.data.repositories.RecommendedNeedsRepository$fetch$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r11 = r14.mo21858l()
            goto L_0x004e
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0037:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.data.repositories.RecommendedNeedsRepository$fetch$2 r14 = new com.carrefour.fid.android.data.repositories.RecommendedNeedsRepository$fetch$2
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.label = r3
            java.lang.Object r11 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r14, r0)
            if (r11 != r1) goto L_0x004e
            return r1
        L_0x004e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.RecommendedNeedsRepository.mo111562c(java.lang.String, java.lang.String, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }
}
