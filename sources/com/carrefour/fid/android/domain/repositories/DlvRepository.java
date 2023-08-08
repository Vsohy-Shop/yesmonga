package com.carrefour.fid.android.domain.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.datasource.DlvDataSource;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
@C8567o(parameters = 0)
public final class DlvRepository {

    /* renamed from: b */
    public static final int f96758b = 8;
    @C12579k

    /* renamed from: a */
    public final DlvDataSource f96759a;

    @Inject
    public DlvRepository(@C12579k DlvDataSource dlvDataSource) {
        Intrinsics.checkNotNullParameter(dlvDataSource, "dlvDataSource");
        this.f96759a = dlvDataSource;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo119610a(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.delivery.C38020e> r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<? extends com.carrefour.fid.android.domain.models.delivery.C38017b>>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.domain.repositories.DlvRepository$fetchDlvOptions$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.domain.repositories.DlvRepository$fetchDlvOptions$1 r0 = (com.carrefour.fid.android.domain.repositories.DlvRepository$fetchDlvOptions$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.repositories.DlvRepository$fetchDlvOptions$1 r0 = new com.carrefour.fid.android.domain.repositories.DlvRepository$fetchDlvOptions$1
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
            com.carrefour.fid.android.data.datasource.DlvDataSource r7 = r4.f96759a
            r0.label = r3
            java.lang.Object r5 = r7.mo108663c(r5, r6, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.repositories.DlvRepository.mo119610a(java.lang.String, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }
}
