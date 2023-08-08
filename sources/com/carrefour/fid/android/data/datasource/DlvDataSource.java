package com.carrefour.fid.android.data.datasource;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.dlv.DlvRequest;
import com.carrefour.fid.android.data.entities.mapper.C36485f0;
import com.carrefour.fid.android.data.service.C36629h;
import com.carrefour.fid.android.domain.models.delivery.C38020e;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nDlvDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DlvDataSource.kt\ncom/carrefour/fid/android/data/datasource/DlvDataSource\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1549#2:42\n1620#2,3:43\n*S KotlinDebug\n*F\n+ 1 DlvDataSource.kt\ncom/carrefour/fid/android/data/datasource/DlvDataSource\n*L\n38#1:42\n38#1:43,3\n*E\n"})
public final class DlvDataSource {

    /* renamed from: b */
    public static final int f90011b = 8;
    @C12579k

    /* renamed from: a */
    public final C36629h f90012a;

    @Inject
    public DlvDataSource(@C12579k C36629h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "dlvService");
        this.f90012a = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108663c(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.delivery.C38020e> r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<? extends com.carrefour.fid.android.domain.models.delivery.C38017b>>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.data.datasource.DlvDataSource$fetchDlvOptions$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.data.datasource.DlvDataSource$fetchDlvOptions$1 r0 = (com.carrefour.fid.android.data.datasource.DlvDataSource$fetchDlvOptions$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.DlvDataSource$fetchDlvOptions$1 r0 = new com.carrefour.fid.android.data.datasource.DlvDataSource$fetchDlvOptions$1
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
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.data.datasource.DlvDataSource$fetchDlvOptions$2 r7 = new com.carrefour.fid.android.data.datasource.DlvDataSource$fetchDlvOptions$2
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.DlvDataSource.mo108663c(java.lang.String, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: d */
    public final DlvRequest mo108664d(String str, List<C38020e> list) {
        Iterable<C38020e> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (C38020e a : iterable) {
            arrayList.add(C36485f0.m149650a(a));
        }
        return new DlvRequest(str, arrayList);
    }
}
