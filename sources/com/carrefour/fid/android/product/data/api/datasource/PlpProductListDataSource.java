package com.carrefour.fid.android.product.data.api.datasource;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi;
import com.carrefour.fid.android.shared.data.parsing.C28646a;
import com.carrefour.fid.android.shared.network.C28812h;
import com.carrefour.fid.android.shared.p045di.annotation.C28664h;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nPlpProductListDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlpProductListDataSource.kt\ncom/carrefour/fid/android/product/data/api/datasource/PlpProductListDataSource\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,193:1\n1549#2:194\n1620#2,3:195\n1549#2:198\n1620#2,3:199\n1549#2:202\n1620#2,3:203\n1549#2:206\n1620#2,3:207\n1549#2:210\n1620#2,3:211\n*S KotlinDebug\n*F\n+ 1 PlpProductListDataSource.kt\ncom/carrefour/fid/android/product/data/api/datasource/PlpProductListDataSource\n*L\n40#1:194\n40#1:195,3\n68#1:198\n68#1:199,3\n95#1:202\n95#1:203,3\n123#1:206\n123#1:207,3\n142#1:210\n142#1:211,3\n*E\n"})
public final class PlpProductListDataSource {

    /* renamed from: d */
    public static final int f66586d = 8;
    @C12579k

    /* renamed from: a */
    public final BffProductsManagementApi f66587a;
    @C12579k

    /* renamed from: b */
    public final C28646a f66588b;
    @C12579k

    /* renamed from: c */
    public final C28812h f66589c;

    @Inject
    public PlpProductListDataSource(@C28664h @C12579k BffProductsManagementApi bffProductsManagementApi, @C12579k C28646a aVar, @C12579k C28812h hVar) {
        Intrinsics.checkNotNullParameter(bffProductsManagementApi, "api");
        Intrinsics.checkNotNullParameter(aVar, "errorReporter");
        Intrinsics.checkNotNullParameter(hVar, "tokenProvider");
        this.f66587a = bffProductsManagementApi;
        this.f66588b = aVar;
        this.f66589c = hVar;
    }

    /* renamed from: c */
    public static /* synthetic */ Object m115563c(PlpProductListDataSource plpProductListDataSource, List list, List list2, String str, List list3, List list4, int i, int i2, C11045c cVar, int i3, Object obj) {
        List list5;
        List list6;
        int i4;
        int i5;
        if ((i3 & 8) != 0) {
            list5 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list5 = list3;
        }
        if ((i3 & 16) != 0) {
            list6 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list6 = list4;
        }
        if ((i3 & 32) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 64) != 0) {
            i5 = 10;
        } else {
            i5 = i2;
        }
        return plpProductListDataSource.mo79832b(list, list2, str, list5, list6, i4, i5, cVar);
    }

    /* renamed from: g */
    public static /* synthetic */ Object m115564g(PlpProductListDataSource plpProductListDataSource, List list, String str, List list2, List list3, int i, int i2, C11045c cVar, int i3, Object obj) {
        List list4;
        List list5;
        int i4;
        int i5;
        if ((i3 & 4) != 0) {
            list4 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list4 = list2;
        }
        if ((i3 & 8) != 0) {
            list5 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list5 = list3;
        }
        if ((i3 & 16) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 32) != 0) {
            i5 = 10;
        } else {
            i5 = i2;
        }
        return plpProductListDataSource.mo79835f(list, str, list4, list5, i4, i5, cVar);
    }

    /* renamed from: i */
    public static /* synthetic */ Object m115565i(PlpProductListDataSource plpProductListDataSource, List list, String str, String str2, List list2, List list3, int i, int i2, C11045c cVar, int i3, Object obj) {
        List list4;
        List list5;
        int i4;
        int i5;
        if ((i3 & 8) != 0) {
            list4 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list4 = list2;
        }
        if ((i3 & 16) != 0) {
            list5 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list5 = list3;
        }
        if ((i3 & 32) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 64) != 0) {
            i5 = 10;
        } else {
            i5 = i2;
        }
        return plpProductListDataSource.mo79836h(list, str, str2, list4, list5, i4, i5, cVar);
    }

    /* renamed from: k */
    public static /* synthetic */ Object m115566k(PlpProductListDataSource plpProductListDataSource, List list, String str, String str2, List list2, List list3, int i, int i2, C11045c cVar, int i3, Object obj) {
        List list4;
        List list5;
        int i4;
        int i5;
        if ((i3 & 8) != 0) {
            list4 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list4 = list2;
        }
        if ((i3 & 16) != 0) {
            list5 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list5 = list3;
        }
        if ((i3 & 32) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 64) != 0) {
            i5 = 10;
        } else {
            i5 = i2;
        }
        return plpProductListDataSource.mo79837j(list, str, str2, list4, list5, i4, i5, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076 A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083 A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3 A[Catch:{ all -> 0x0036 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a4 A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79831a(@org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12579k java.lang.String r19, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.product.domain.model.C27584b>> r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            boolean r2 = r0 instanceof com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getAlternativeProducts$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getAlternativeProducts$1 r2 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getAlternativeProducts$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getAlternativeProducts$1 r2 = new com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getAlternativeProducts$1
            r2.<init>(r1, r0)
        L_0x001c:
            r12 = r2
            java.lang.Object r0 = r12.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r12.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0054
            if (r3 == r5) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r2 = r12.L$0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r2 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource) r2
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0036 }
            goto L_0x00a5
        L_0x0036:
            r0 = move-exception
            goto L_0x00b4
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0041:
            java.lang.Object r3 = r12.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r12.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r12.L$0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r6 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource) r6
            kotlin.C11661u0.m45747n(r0)
            r7 = r3
            r15 = r6
            r6 = r5
            goto L_0x006f
        L_0x0054:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.shared.network.h r0 = r1.f66589c
            r12.L$0 = r1
            r3 = r18
            r12.L$1 = r3
            r6 = r19
            r12.L$2 = r6
            r12.label = r5
            java.lang.Object r0 = r0.mo83891a(r12)
            if (r0 != r2) goto L_0x006c
            return r2
        L_0x006c:
            r15 = r1
            r7 = r6
            r6 = r3
        L_0x006f:
            com.carrefour.fid.android.shared.network.g r0 = (com.carrefour.fid.android.shared.network.C28811g) r0
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi r3 = r15.f66587a     // Catch:{ all -> 0x0036 }
            r5 = 0
            if (r0 == 0) goto L_0x007b
            java.lang.String r8 = com.carrefour.fid.android.shared.network.C28813i.m119242a(r0)     // Catch:{ all -> 0x0036 }
            goto L_0x007c
        L_0x007b:
            r8 = r5
        L_0x007c:
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = r0.mo83886e()     // Catch:{ all -> 0x0036 }
            goto L_0x0084
        L_0x0083:
            r0 = r5
        L_0x0084:
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 240(0xf0, float:3.36E-43)
            r16 = 0
            r12.L$0 = r15     // Catch:{ all -> 0x0036 }
            r12.L$1 = r5     // Catch:{ all -> 0x0036 }
            r12.L$2 = r5     // Catch:{ all -> 0x0036 }
            r12.label = r4     // Catch:{ all -> 0x0036 }
            r4 = r8
            r5 = r0
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r13
            r13 = r14
            r14 = r16
            java.lang.Object r0 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi.DefaultImpls.getAlternativeProducts$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0036 }
            if (r0 != r2) goto L_0x00a4
            return r2
        L_0x00a4:
            r2 = r15
        L_0x00a5:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ all -> 0x0036 }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponse r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponse) r0     // Catch:{ all -> 0x0036 }
            com.carrefour.fid.android.shared.data.parsing.a r2 = r2.f66588b     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = com.carrefour.fid.android.product.data.api.mapper.C27473b.m115625d(r0, r2)     // Catch:{ all -> 0x0036 }
            goto L_0x00be
        L_0x00b4:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x00be:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource.mo79831a(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00aa A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ce A[Catch:{ all -> 0x0035 }, LOOP:0: B:28:0x00c8->B:30:0x00ce, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x012a A[Catch:{ all -> 0x0035 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x012b A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79832b(@org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r29, @org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r30, @org.jetbrains.annotations.C12579k java.lang.String r31, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38105d> r32, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38111e> r33, int r34, int r35, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.product.domain.model.C27584b>> r36) {
        /*
            r28 = this;
            r1 = r28
            r0 = r36
            boolean r2 = r0 instanceof com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getDepartmentProducts$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getDepartmentProducts$1 r2 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getDepartmentProducts$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getDepartmentProducts$1 r2 = new com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getDepartmentProducts$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r2.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0067
            if (r3 == r5) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r2 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource) r2
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x012d
        L_0x0035:
            r0 = move-exception
            goto L_0x013c
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0040:
            int r3 = r2.I$1
            int r5 = r2.I$0
            java.lang.Object r6 = r2.L$5
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r2.L$4
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r2.L$3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.L$2
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r2.L$1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r2.L$0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r11 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource) r11
            kotlin.C11661u0.m45747n(r0)
            r16 = r8
            r19 = r10
            r14 = r11
            r11 = r3
            r10 = r5
            goto L_0x009e
        L_0x0067:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.shared.network.h r0 = r1.f66589c
            r2.L$0 = r1
            r3 = r29
            r2.L$1 = r3
            r6 = r30
            r2.L$2 = r6
            r7 = r31
            r2.L$3 = r7
            r8 = r32
            r2.L$4 = r8
            r9 = r33
            r2.L$5 = r9
            r10 = r34
            r2.I$0 = r10
            r11 = r35
            r2.I$1 = r11
            r2.label = r5
            java.lang.Object r0 = r0.mo83891a(r2)
            if (r0 != r15) goto L_0x0093
            return r15
        L_0x0093:
            r14 = r1
            r19 = r3
            r16 = r7
            r7 = r8
            r27 = r9
            r9 = r6
            r6 = r27
        L_0x009e:
            com.carrefour.fid.android.shared.network.g r0 = (com.carrefour.fid.android.shared.network.C28811g) r0
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi r3 = r14.f66587a     // Catch:{ all -> 0x0035 }
            r5 = 0
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = com.carrefour.fid.android.shared.network.C28813i.m119242a(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x00ab
        L_0x00aa:
            r0 = r5
        L_0x00ab:
            java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ all -> 0x0035 }
            java.util.List r7 = com.carrefour.fid.android.product.data.api.datasource.C27464d.m115610a(r7)     // Catch:{ all -> 0x0035 }
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ all -> 0x0035 }
            java.util.List r17 = kotlin.collections.CollectionsKt___CollectionsKt.m40718y4(r9, r7)     // Catch:{ all -> 0x0035 }
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x0035 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0035 }
            r7 = 10
            int r7 = kotlin.collections.C10978t.m41495Y(r6, r7)     // Catch:{ all -> 0x0035 }
            r13.<init>(r7)     // Catch:{ all -> 0x0035 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0035 }
        L_0x00c8:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0035 }
            if (r7 == 0) goto L_0x00dc
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0035 }
            com.carrefour.fid.android.domain.models.product.e r7 = (com.carrefour.fid.android.domain.models.product.C38111e) r7     // Catch:{ all -> 0x0035 }
            java.lang.String r7 = r7.mo118782h()     // Catch:{ all -> 0x0035 }
            r13.add(r7)     // Catch:{ all -> 0x0035 }
            goto L_0x00c8
        L_0x00dc:
            java.lang.String r12 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0035 }
            java.lang.String r18 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0035 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 20734(0x50fe, float:2.9055E-41)
            r24 = 0
            r2.L$0 = r14     // Catch:{ all -> 0x0035 }
            r2.L$1 = r5     // Catch:{ all -> 0x0035 }
            r2.L$2 = r5     // Catch:{ all -> 0x0035 }
            r2.L$3 = r5     // Catch:{ all -> 0x0035 }
            r2.L$4 = r5     // Catch:{ all -> 0x0035 }
            r2.L$5 = r5     // Catch:{ all -> 0x0035 }
            r2.label = r4     // Catch:{ all -> 0x0035 }
            r4 = r0
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r20
            r0 = r13
            r13 = r18
            r25 = r14
            r14 = r17
            r26 = r15
            r15 = r16
            r16 = r21
            r17 = r0
            r18 = r22
            r20 = r2
            r21 = r23
            r22 = r24
            java.lang.Object r0 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi.DefaultImpls.getPlpProducts$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0035 }
            r2 = r26
            if (r0 != r2) goto L_0x012b
            return r2
        L_0x012b:
            r2 = r25
        L_0x012d:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ all -> 0x0035 }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2 r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2) r0     // Catch:{ all -> 0x0035 }
            com.carrefour.fid.android.shared.data.parsing.a r2 = r2.f66588b     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = com.carrefour.fid.android.product.data.api.mapper.C27473b.m115626e(r0, r2)     // Catch:{ all -> 0x0035 }
            goto L_0x0146
        L_0x013c:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x0146:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource.mo79832b(java.util.List, java.util.List, java.lang.String, java.util.List, java.util.List, int, int, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79833d(@org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r16, @org.jetbrains.annotations.C12579k java.lang.String r17, @org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.product.domain.model.C27583a>> r19) {
        /*
            r15 = this;
            r1 = r15
            r0 = r19
            boolean r2 = r0 instanceof com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getProduct$1
            if (r2 == 0) goto L_0x0016
            r2 = r0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getProduct$1 r2 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getProduct$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getProduct$1 r2 = new com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getProduct$1
            r2.<init>(r15, r0)
        L_0x001b:
            r12 = r2
            java.lang.Object r0 = r12.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r12.label
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r2 = r12.L$0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r2 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource) r2
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x0059
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0039:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi r3 = r1.f66587a     // Catch:{ all -> 0x0068 }
            r0 = 0
            r5 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            r13 = 103(0x67, float:1.44E-43)
            r14 = 0
            r12.L$0 = r1     // Catch:{ all -> 0x0068 }
            r12.label = r4     // Catch:{ all -> 0x0068 }
            r4 = r0
            r7 = r17
            r8 = r18
            r11 = r16
            java.lang.Object r0 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi.DefaultImpls.getPdpProducts$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0068 }
            if (r0 != r2) goto L_0x0058
            return r2
        L_0x0058:
            r2 = r1
        L_0x0059:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ all -> 0x0068 }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPdpResponse r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPdpResponse) r0     // Catch:{ all -> 0x0068 }
            com.carrefour.fid.android.shared.data.parsing.a r2 = r2.f66588b     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = com.carrefour.fid.android.product.data.api.mapper.C27473b.m115624c(r0, r2)     // Catch:{ all -> 0x0068 }
            goto L_0x0073
        L_0x0068:
            r0 = move-exception
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource.mo79833d(java.util.List, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094 A[Catch:{ all -> 0x0035 }, LOOP:0: B:28:0x008e->B:30:0x0094, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f3 A[Catch:{ all -> 0x0035 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f4 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79834e(@org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r29, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.Gtin> r30, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.product.domain.model.C27584b>> r31) {
        /*
            r28 = this;
            r1 = r28
            r0 = r31
            boolean r2 = r0 instanceof com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getProductsByGtins$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getProductsByGtins$1 r2 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getProductsByGtins$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getProductsByGtins$1 r2 = new com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getProductsByGtins$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r2.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0053
            if (r3 == r5) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r2 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource) r2
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x00f6
        L_0x0035:
            r0 = move-exception
            goto L_0x0105
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0040:
            java.lang.Object r3 = r2.L$2
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r5 = r2.L$1
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r2.L$0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r6 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource) r6
            kotlin.C11661u0.m45747n(r0)
            r19 = r5
            r14 = r6
            goto L_0x006f
        L_0x0053:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.shared.network.h r0 = r1.f66589c
            r2.L$0 = r1
            r3 = r29
            r2.L$1 = r3
            r6 = r30
            r2.L$2 = r6
            r2.label = r5
            java.lang.Object r0 = r0.mo83891a(r2)
            if (r0 != r15) goto L_0x006b
            return r15
        L_0x006b:
            r14 = r1
            r19 = r3
            r3 = r6
        L_0x006f:
            com.carrefour.fid.android.shared.network.g r0 = (com.carrefour.fid.android.shared.network.C28811g) r0
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi r5 = r14.f66587a     // Catch:{ all -> 0x0035 }
            r6 = 0
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = com.carrefour.fid.android.shared.network.C28813i.m119242a(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x007c
        L_0x007b:
            r0 = r6
        L_0x007c:
            r7 = r3
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ all -> 0x0035 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0035 }
            r8 = 10
            int r8 = kotlin.collections.C10978t.m41495Y(r7, r8)     // Catch:{ all -> 0x0035 }
            r13.<init>(r8)     // Catch:{ all -> 0x0035 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0035 }
        L_0x008e:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0035 }
            if (r8 == 0) goto L_0x00a2
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0035 }
            com.carrefour.fid.android.domain.models.product.Gtin r8 = (com.carrefour.fid.android.domain.models.product.Gtin) r8     // Catch:{ all -> 0x0035 }
            java.lang.String r8 = r8.mo118380i()     // Catch:{ all -> 0x0035 }
            r13.add(r8)     // Catch:{ all -> 0x0035 }
            goto L_0x008e
        L_0x00a2:
            int r3 = r3.size()     // Catch:{ all -> 0x0035 }
            java.lang.String r16 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0035 }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r17 = 0
            java.lang.String r18 = "0"
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 15614(0x3cfe, float:2.188E-41)
            r25 = 0
            r2.L$0 = r14     // Catch:{ all -> 0x0035 }
            r2.L$1 = r6     // Catch:{ all -> 0x0035 }
            r2.L$2 = r6     // Catch:{ all -> 0x0035 }
            r2.label = r4     // Catch:{ all -> 0x0035 }
            r3 = r5
            r4 = r0
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r11 = r17
            r12 = r18
            r0 = r13
            r13 = r16
            r26 = r14
            r14 = r20
            r27 = r15
            r15 = r21
            r16 = r22
            r17 = r23
            r18 = r0
            r20 = r2
            r21 = r24
            r22 = r25
            java.lang.Object r0 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi.DefaultImpls.getPlpProducts$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0035 }
            r2 = r27
            if (r0 != r2) goto L_0x00f4
            return r2
        L_0x00f4:
            r2 = r26
        L_0x00f6:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ all -> 0x0035 }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2 r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2) r0     // Catch:{ all -> 0x0035 }
            com.carrefour.fid.android.shared.data.parsing.a r2 = r2.f66588b     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = com.carrefour.fid.android.product.data.api.mapper.C27473b.m115626e(r0, r2)     // Catch:{ all -> 0x0035 }
            goto L_0x010f
        L_0x0105:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x010f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource.mo79834e(java.util.List, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0098 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b9 A[Catch:{ all -> 0x0035 }, LOOP:0: B:28:0x00b3->B:30:0x00b9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0113 A[Catch:{ all -> 0x0035 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0114 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79835f(@org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r28, @org.jetbrains.annotations.C12579k java.lang.String r29, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38105d> r30, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38111e> r31, int r32, int r33, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.product.domain.model.C27584b>> r34) {
        /*
            r27 = this;
            r1 = r27
            r0 = r34
            boolean r2 = r0 instanceof com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getPromoProducts$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getPromoProducts$1 r2 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getPromoProducts$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getPromoProducts$1 r2 = new com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getPromoProducts$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r2.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0064
            if (r3 == r5) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r2 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource) r2
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x0116
        L_0x0035:
            r0 = move-exception
            goto L_0x0125
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0040:
            int r3 = r2.I$1
            int r5 = r2.I$0
            java.lang.Object r6 = r2.L$4
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r2.L$3
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r2.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.L$1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r2.L$0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r10 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource) r10
            kotlin.C11661u0.m45747n(r0)
            r16 = r8
            r19 = r9
            r14 = r10
            r10 = r3
            r9 = r5
            r8 = r6
            goto L_0x0091
        L_0x0064:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.shared.network.h r0 = r1.f66589c
            r2.L$0 = r1
            r3 = r28
            r2.L$1 = r3
            r6 = r29
            r2.L$2 = r6
            r7 = r30
            r2.L$3 = r7
            r8 = r31
            r2.L$4 = r8
            r9 = r32
            r2.I$0 = r9
            r10 = r33
            r2.I$1 = r10
            r2.label = r5
            java.lang.Object r0 = r0.mo83891a(r2)
            if (r0 != r15) goto L_0x008c
            return r15
        L_0x008c:
            r14 = r1
            r19 = r3
            r16 = r6
        L_0x0091:
            com.carrefour.fid.android.shared.network.g r0 = (com.carrefour.fid.android.shared.network.C28811g) r0
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi r3 = r14.f66587a     // Catch:{ all -> 0x0035 }
            r5 = 0
            if (r0 == 0) goto L_0x009d
            java.lang.String r0 = com.carrefour.fid.android.shared.network.C28813i.m119242a(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x009e
        L_0x009d:
            r0 = r5
        L_0x009e:
            java.util.List r17 = com.carrefour.fid.android.product.data.api.datasource.C27464d.m115610a(r7)     // Catch:{ all -> 0x0035 }
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch:{ all -> 0x0035 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0035 }
            r6 = 10
            int r6 = kotlin.collections.C10978t.m41495Y(r8, r6)     // Catch:{ all -> 0x0035 }
            r13.<init>(r6)     // Catch:{ all -> 0x0035 }
            java.util.Iterator r6 = r8.iterator()     // Catch:{ all -> 0x0035 }
        L_0x00b3:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0035 }
            if (r7 == 0) goto L_0x00c7
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0035 }
            com.carrefour.fid.android.domain.models.product.e r7 = (com.carrefour.fid.android.domain.models.product.C38111e) r7     // Catch:{ all -> 0x0035 }
            java.lang.String r7 = r7.mo118782h()     // Catch:{ all -> 0x0035 }
            r13.add(r7)     // Catch:{ all -> 0x0035 }
            goto L_0x00b3
        L_0x00c7:
            java.lang.String r12 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0035 }
            java.lang.String r18 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0035 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r20 = "group_8"
            r21 = 0
            r22 = 0
            r23 = 20606(0x507e, float:2.8875E-41)
            r24 = 0
            r2.L$0 = r14     // Catch:{ all -> 0x0035 }
            r2.L$1 = r5     // Catch:{ all -> 0x0035 }
            r2.L$2 = r5     // Catch:{ all -> 0x0035 }
            r2.L$3 = r5     // Catch:{ all -> 0x0035 }
            r2.L$4 = r5     // Catch:{ all -> 0x0035 }
            r2.label = r4     // Catch:{ all -> 0x0035 }
            r4 = r0
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r20
            r0 = r13
            r13 = r18
            r25 = r14
            r14 = r17
            r26 = r15
            r15 = r16
            r16 = r21
            r17 = r0
            r18 = r22
            r20 = r2
            r21 = r23
            r22 = r24
            java.lang.Object r0 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi.DefaultImpls.getPlpProducts$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0035 }
            r2 = r26
            if (r0 != r2) goto L_0x0114
            return r2
        L_0x0114:
            r2 = r25
        L_0x0116:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ all -> 0x0035 }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2 r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2) r0     // Catch:{ all -> 0x0035 }
            com.carrefour.fid.android.shared.data.parsing.a r2 = r2.f66588b     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = com.carrefour.fid.android.product.data.api.mapper.C27473b.m115626e(r0, r2)     // Catch:{ all -> 0x0035 }
            goto L_0x012f
        L_0x0125:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x012f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource.mo79835f(java.util.List, java.lang.String, java.util.List, java.util.List, int, int, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a3 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c4 A[Catch:{ all -> 0x0035 }, LOOP:0: B:28:0x00be->B:30:0x00c4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011e A[Catch:{ all -> 0x0035 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011f A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79836h(@org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r28, @org.jetbrains.annotations.C12579k java.lang.String r29, @org.jetbrains.annotations.C12579k java.lang.String r30, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38105d> r31, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38111e> r32, int r33, int r34, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.product.domain.model.C27584b>> r35) {
        /*
            r27 = this;
            r1 = r27
            r0 = r35
            boolean r2 = r0 instanceof com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getQueryProducts$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getQueryProducts$1 r2 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getQueryProducts$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getQueryProducts$1 r2 = new com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getQueryProducts$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r2.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0069
            if (r3 == r5) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r2 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource) r2
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x0121
        L_0x0035:
            r0 = move-exception
            goto L_0x0130
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0040:
            int r3 = r2.I$1
            int r5 = r2.I$0
            java.lang.Object r6 = r2.L$5
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r2.L$4
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r2.L$3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.L$1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r2.L$0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r11 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource) r11
            kotlin.C11661u0.m45747n(r0)
            r16 = r8
            r12 = r9
            r19 = r10
            r14 = r11
            r11 = r3
            r10 = r5
            r9 = r6
            goto L_0x009c
        L_0x0069:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.shared.network.h r0 = r1.f66589c
            r2.L$0 = r1
            r3 = r28
            r2.L$1 = r3
            r6 = r29
            r2.L$2 = r6
            r7 = r30
            r2.L$3 = r7
            r8 = r31
            r2.L$4 = r8
            r9 = r32
            r2.L$5 = r9
            r10 = r33
            r2.I$0 = r10
            r11 = r34
            r2.I$1 = r11
            r2.label = r5
            java.lang.Object r0 = r0.mo83891a(r2)
            if (r0 != r15) goto L_0x0095
            return r15
        L_0x0095:
            r14 = r1
            r19 = r3
            r12 = r6
            r16 = r7
            r7 = r8
        L_0x009c:
            com.carrefour.fid.android.shared.network.g r0 = (com.carrefour.fid.android.shared.network.C28811g) r0
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi r3 = r14.f66587a     // Catch:{ all -> 0x0035 }
            r5 = 0
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = com.carrefour.fid.android.shared.network.C28813i.m119242a(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x00a9
        L_0x00a8:
            r0 = r5
        L_0x00a9:
            java.util.List r17 = com.carrefour.fid.android.product.data.api.datasource.C27464d.m115610a(r7)     // Catch:{ all -> 0x0035 }
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch:{ all -> 0x0035 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0035 }
            r6 = 10
            int r6 = kotlin.collections.C10978t.m41495Y(r9, r6)     // Catch:{ all -> 0x0035 }
            r13.<init>(r6)     // Catch:{ all -> 0x0035 }
            java.util.Iterator r6 = r9.iterator()     // Catch:{ all -> 0x0035 }
        L_0x00be:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0035 }
            if (r7 == 0) goto L_0x00d2
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0035 }
            com.carrefour.fid.android.domain.models.product.e r7 = (com.carrefour.fid.android.domain.models.product.C38111e) r7     // Catch:{ all -> 0x0035 }
            java.lang.String r7 = r7.mo118782h()     // Catch:{ all -> 0x0035 }
            r13.add(r7)     // Catch:{ all -> 0x0035 }
            goto L_0x00be
        L_0x00d2:
            java.lang.String r18 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0035 }
            java.lang.String r20 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0035 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r21 = 0
            r22 = 0
            r23 = 20670(0x50be, float:2.8965E-41)
            r24 = 0
            r2.L$0 = r14     // Catch:{ all -> 0x0035 }
            r2.L$1 = r5     // Catch:{ all -> 0x0035 }
            r2.L$2 = r5     // Catch:{ all -> 0x0035 }
            r2.L$3 = r5     // Catch:{ all -> 0x0035 }
            r2.L$4 = r5     // Catch:{ all -> 0x0035 }
            r2.L$5 = r5     // Catch:{ all -> 0x0035 }
            r2.label = r4     // Catch:{ all -> 0x0035 }
            r4 = r0
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r12
            r12 = r18
            r0 = r13
            r13 = r20
            r25 = r14
            r14 = r17
            r26 = r15
            r15 = r16
            r16 = r21
            r17 = r0
            r18 = r22
            r20 = r2
            r21 = r23
            r22 = r24
            java.lang.Object r0 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi.DefaultImpls.getPlpProducts$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0035 }
            r2 = r26
            if (r0 != r2) goto L_0x011f
            return r2
        L_0x011f:
            r2 = r25
        L_0x0121:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ all -> 0x0035 }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2 r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2) r0     // Catch:{ all -> 0x0035 }
            com.carrefour.fid.android.shared.data.parsing.a r2 = r2.f66588b     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = com.carrefour.fid.android.product.data.api.mapper.C27473b.m115626e(r0, r2)     // Catch:{ all -> 0x0035 }
            goto L_0x013a
        L_0x0130:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x013a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource.mo79836h(java.util.List, java.lang.String, java.lang.String, java.util.List, java.util.List, int, int, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00aa A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c6 A[Catch:{ all -> 0x0035 }, LOOP:0: B:28:0x00c0->B:30:0x00c6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0120 A[Catch:{ all -> 0x0035 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0121 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79837j(@org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r28, @org.jetbrains.annotations.C12579k java.lang.String r29, @org.jetbrains.annotations.C12579k java.lang.String r30, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38105d> r31, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38111e> r32, int r33, int r34, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.product.domain.model.C27584b>> r35) {
        /*
            r27 = this;
            r1 = r27
            r0 = r35
            boolean r2 = r0 instanceof com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getSearchProducts$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getSearchProducts$1 r2 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getSearchProducts$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getSearchProducts$1 r2 = new com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource$getSearchProducts$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r2.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x006a
            if (r3 == r5) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r2 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource) r2
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x0123
        L_0x0035:
            r0 = move-exception
            goto L_0x0132
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0040:
            int r3 = r2.I$1
            int r5 = r2.I$0
            java.lang.Object r6 = r2.L$5
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r2.L$4
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r2.L$3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.L$1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r2.L$0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r11 = (com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource) r11
            kotlin.C11661u0.m45747n(r0)
            r16 = r8
            r17 = r9
            r19 = r10
            r14 = r11
            r11 = r3
            r10 = r5
            r9 = r6
            goto L_0x009e
        L_0x006a:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.shared.network.h r0 = r1.f66589c
            r2.L$0 = r1
            r3 = r28
            r2.L$1 = r3
            r6 = r29
            r2.L$2 = r6
            r7 = r30
            r2.L$3 = r7
            r8 = r31
            r2.L$4 = r8
            r9 = r32
            r2.L$5 = r9
            r10 = r33
            r2.I$0 = r10
            r11 = r34
            r2.I$1 = r11
            r2.label = r5
            java.lang.Object r0 = r0.mo83891a(r2)
            if (r0 != r15) goto L_0x0096
            return r15
        L_0x0096:
            r14 = r1
            r19 = r3
            r17 = r6
            r16 = r7
            r7 = r8
        L_0x009e:
            com.carrefour.fid.android.shared.network.g r0 = (com.carrefour.fid.android.shared.network.C28811g) r0
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi r3 = r14.f66587a     // Catch:{ all -> 0x0035 }
            r5 = 0
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = com.carrefour.fid.android.shared.network.C28813i.m119242a(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x00ab
        L_0x00aa:
            r0 = r5
        L_0x00ab:
            java.util.List r18 = com.carrefour.fid.android.product.data.api.datasource.C27464d.m115610a(r7)     // Catch:{ all -> 0x0035 }
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch:{ all -> 0x0035 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0035 }
            r6 = 10
            int r6 = kotlin.collections.C10978t.m41495Y(r9, r6)     // Catch:{ all -> 0x0035 }
            r13.<init>(r6)     // Catch:{ all -> 0x0035 }
            java.util.Iterator r6 = r9.iterator()     // Catch:{ all -> 0x0035 }
        L_0x00c0:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0035 }
            if (r7 == 0) goto L_0x00d4
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0035 }
            com.carrefour.fid.android.domain.models.product.e r7 = (com.carrefour.fid.android.domain.models.product.C38111e) r7     // Catch:{ all -> 0x0035 }
            java.lang.String r7 = r7.mo118782h()     // Catch:{ all -> 0x0035 }
            r13.add(r7)     // Catch:{ all -> 0x0035 }
            goto L_0x00c0
        L_0x00d4:
            java.lang.String r12 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0035 }
            java.lang.String r20 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0035 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r21 = 0
            r22 = 0
            r23 = 16638(0x40fe, float:2.3315E-41)
            r24 = 0
            r2.L$0 = r14     // Catch:{ all -> 0x0035 }
            r2.L$1 = r5     // Catch:{ all -> 0x0035 }
            r2.L$2 = r5     // Catch:{ all -> 0x0035 }
            r2.L$3 = r5     // Catch:{ all -> 0x0035 }
            r2.L$4 = r5     // Catch:{ all -> 0x0035 }
            r2.L$5 = r5     // Catch:{ all -> 0x0035 }
            r2.label = r4     // Catch:{ all -> 0x0035 }
            r4 = r0
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r21
            r0 = r13
            r13 = r20
            r25 = r14
            r14 = r18
            r26 = r15
            r15 = r16
            r16 = r17
            r17 = r0
            r18 = r22
            r20 = r2
            r21 = r23
            r22 = r24
            java.lang.Object r0 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi.DefaultImpls.getPlpProducts$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0035 }
            r2 = r26
            if (r0 != r2) goto L_0x0121
            return r2
        L_0x0121:
            r2 = r25
        L_0x0123:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ all -> 0x0035 }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2 r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2) r0     // Catch:{ all -> 0x0035 }
            com.carrefour.fid.android.shared.data.parsing.a r2 = r2.f66588b     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = com.carrefour.fid.android.product.data.api.mapper.C27473b.m115626e(r0, r2)     // Catch:{ all -> 0x0035 }
            goto L_0x013c
        L_0x0132:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x013c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource.mo79837j(java.util.List, java.lang.String, java.lang.String, java.util.List, java.util.List, int, int, kotlin.coroutines.c):java.lang.Object");
    }
}
