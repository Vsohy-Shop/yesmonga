package com.carrefour.fid.android.utilities.data.api.datasource;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffUtilitiesManagementApi;
import com.carrefour.fid.android.shared.data.headers.C28642c;
import com.carrefour.fid.android.shared.data.parsing.C28646a;
import com.carrefour.fid.android.utilities.data.provider.C22678a;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class UtilitiesDataSource {
    @C12579k

    /* renamed from: a */
    public final BffUtilitiesManagementApi f58078a;
    @C12579k

    /* renamed from: b */
    public final C28646a f58079b;
    @C12579k

    /* renamed from: c */
    public final C22678a f58080c;
    @C12579k

    /* renamed from: d */
    public final C28642c f58081d;

    @Inject
    public UtilitiesDataSource(@C12579k BffUtilitiesManagementApi bffUtilitiesManagementApi, @C12579k C28646a aVar, @C12579k C22678a aVar2, @C12579k C28642c cVar) {
        Intrinsics.checkNotNullParameter(bffUtilitiesManagementApi, "bffUtilitiesManagementApi");
        Intrinsics.checkNotNullParameter(aVar, "errorReporter");
        Intrinsics.checkNotNullParameter(aVar2, "criteoHeadersProvider");
        Intrinsics.checkNotNullParameter(cVar, "authHeadersRepository");
        this.f58078a = bffUtilitiesManagementApi;
        this.f58079b = aVar;
        this.f58080c = aVar2;
        this.f58081d = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67018a(@org.jetbrains.annotations.C12579k java.lang.String r16, @org.jetbrains.annotations.C12579k java.lang.String r17, @org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSearchSuggestionsResponse>> r19) {
        /*
            r15 = this;
            r1 = r15
            r0 = r19
            boolean r2 = r0 instanceof com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource$getSearchSuggestion$1
            if (r2 == 0) goto L_0x0016
            r2 = r0
            com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource$getSearchSuggestion$1 r2 = (com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource$getSearchSuggestion$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource$getSearchSuggestion$1 r2 = new com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource$getSearchSuggestion$1
            r2.<init>(r15, r0)
        L_0x001b:
            r12 = r2
            java.lang.Object r0 = r12.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r12.label
            r4 = 1
            if (r3 == 0) goto L_0x0037
            if (r3 != r4) goto L_0x002f
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x002d }
            goto L_0x0053
        L_0x002d:
            r0 = move-exception
            goto L_0x0062
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0037:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffUtilitiesManagementApi r3 = r1.f58078a     // Catch:{ all -> 0x002d }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 248(0xf8, float:3.48E-43)
            r14 = 0
            r12.label = r4     // Catch:{ all -> 0x002d }
            r4 = r17
            r5 = r18
            r6 = r16
            java.lang.Object r0 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffUtilitiesManagementApi.DefaultImpls.getSearchSuggestion$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x002d }
            if (r0 != r2) goto L_0x0053
            return r2
        L_0x0053:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ all -> 0x002d }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSearchSuggestionsResponse r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSearchSuggestionsResponse) r0     // Catch:{ all -> 0x002d }
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x002d }
            goto L_0x006c
        L_0x0062:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource.mo67018a(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f1, code lost:
        if (r6 == null) goto L_0x00f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00aa A[Catch:{ Exception -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00af A[Catch:{ Exception -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b8 A[Catch:{ Exception -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd A[Catch:{ Exception -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c0 A[Catch:{ Exception -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c5 A[Catch:{ Exception -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8 A[Catch:{ Exception -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cd A[Catch:{ Exception -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0 A[Catch:{ Exception -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d5 A[Catch:{ Exception -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e1 A[Catch:{ Exception -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012e A[Catch:{ Exception -> 0x014b }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012f A[Catch:{ Exception -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67019b(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.criteo.C38006h r29, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.luckycart.C38048b r30, @org.jetbrains.annotations.C12579k java.lang.String r31, @org.jetbrains.annotations.C12579k java.lang.String r32, @org.jetbrains.annotations.C12579k java.lang.String r33, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.utilities.C38207a>> r34) {
        /*
            r28 = this;
            r1 = r28
            r0 = r29
            r2 = r34
            boolean r3 = r2 instanceof com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource$getSponsoredItems$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource$getSponsoredItems$1 r3 = (com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource$getSponsoredItems$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource$getSponsoredItems$1 r3 = new com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource$getSponsoredItems$1
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r3.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x006c
            if (r4 == r6) goto L_0x0043
            if (r4 != r5) goto L_0x003b
            java.lang.Object r0 = r3.L$1
            com.carrefour.fid.android.domain.models.criteo.h r0 = (com.carrefour.fid.android.domain.models.criteo.C38006h) r0
            java.lang.Object r3 = r3.L$0
            com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource r3 = (com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource) r3
            kotlin.C11661u0.m45747n(r2)     // Catch:{ Exception -> 0x014b }
            goto L_0x0134
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0043:
            java.lang.Object r0 = r3.L$6
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffUtilitiesManagementApi r0 = (com.carrefour.fid.android.bff_data_shared.data.api.services.BffUtilitiesManagementApi) r0
            java.lang.Object r4 = r3.L$5
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r3.L$4
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r3.L$3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r3.L$2
            com.carrefour.fid.android.domain.models.luckycart.b r9 = (com.carrefour.fid.android.domain.models.luckycart.C38048b) r9
            java.lang.Object r10 = r3.L$1
            com.carrefour.fid.android.domain.models.criteo.h r10 = (com.carrefour.fid.android.domain.models.criteo.C38006h) r10
            java.lang.Object r11 = r3.L$0
            com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource r11 = (com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource) r11
            kotlin.C11661u0.m45747n(r2)     // Catch:{ Exception -> 0x014b }
            r17 = r4
            r18 = r7
            r19 = r8
            r14 = r11
            r4 = r0
            r0 = r10
            goto L_0x009f
        L_0x006c:
            kotlin.C11661u0.m45747n(r2)
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffUtilitiesManagementApi r2 = r1.f58078a     // Catch:{ Exception -> 0x014b }
            com.carrefour.fid.android.utilities.data.provider.a r4 = r1.f58080c     // Catch:{ Exception -> 0x014b }
            r3.L$0 = r1     // Catch:{ Exception -> 0x014b }
            r3.L$1 = r0     // Catch:{ Exception -> 0x014b }
            r7 = r30
            r3.L$2 = r7     // Catch:{ Exception -> 0x014b }
            r8 = r31
            r3.L$3 = r8     // Catch:{ Exception -> 0x014b }
            r9 = r32
            r3.L$4 = r9     // Catch:{ Exception -> 0x014b }
            r10 = r33
            r3.L$5 = r10     // Catch:{ Exception -> 0x014b }
            r3.L$6 = r2     // Catch:{ Exception -> 0x014b }
            r3.label = r6     // Catch:{ Exception -> 0x014b }
            java.lang.Object r4 = r4.mo67021a(r0, r3)     // Catch:{ Exception -> 0x014b }
            if (r4 != r15) goto L_0x0092
            return r15
        L_0x0092:
            r14 = r1
            r19 = r8
            r18 = r9
            r17 = r10
            r9 = r7
            r27 = r4
            r4 = r2
            r2 = r27
        L_0x009f:
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ Exception -> 0x014b }
            com.carrefour.fid.android.shared.data.headers.c r7 = r14.f58081d     // Catch:{ Exception -> 0x014b }
            java.lang.String r7 = com.carrefour.fid.android.shared.util.C28905c.m119542a(r7)     // Catch:{ Exception -> 0x014b }
            r8 = 0
            if (r9 == 0) goto L_0x00af
            java.lang.String r10 = r9.mo117911j()     // Catch:{ Exception -> 0x014b }
            goto L_0x00b0
        L_0x00af:
            r10 = r8
        L_0x00b0:
            if (r9 == 0) goto L_0x00bd
            com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType r11 = r9.mo117912k()     // Catch:{ Exception -> 0x014b }
            if (r11 == 0) goto L_0x00bd
            java.lang.String r11 = r11.mo117888q()     // Catch:{ Exception -> 0x014b }
            goto L_0x00be
        L_0x00bd:
            r11 = r8
        L_0x00be:
            if (r9 == 0) goto L_0x00c5
            java.lang.String r12 = r9.mo117910i()     // Catch:{ Exception -> 0x014b }
            goto L_0x00c6
        L_0x00c5:
            r12 = r8
        L_0x00c6:
            if (r9 == 0) goto L_0x00cd
            java.lang.String r13 = r9.mo117913l()     // Catch:{ Exception -> 0x014b }
            goto L_0x00ce
        L_0x00cd:
            r13 = r8
        L_0x00ce:
            if (r9 == 0) goto L_0x00d5
            java.lang.String r16 = r9.mo117914m()     // Catch:{ Exception -> 0x014b }
            goto L_0x00d7
        L_0x00d5:
            r16 = r8
        L_0x00d7:
            boolean r20 = r0.mo117471E()     // Catch:{ Exception -> 0x014b }
            java.lang.String r20 = java.lang.String.valueOf(r20)     // Catch:{ Exception -> 0x014b }
            if (r9 == 0) goto L_0x00f3
            boolean r9 = r9.mo117915n()     // Catch:{ Exception -> 0x014b }
            if (r9 == 0) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r6 = 0
        L_0x00e9:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r6)     // Catch:{ Exception -> 0x014b }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x014b }
            if (r6 != 0) goto L_0x00f5
        L_0x00f3:
            java.lang.String r6 = "false"
        L_0x00f5:
            r21 = r6
            r9 = 0
            r22 = 0
            r23 = 0
            r24 = 28
            r25 = 0
            r3.L$0 = r14     // Catch:{ Exception -> 0x014b }
            r3.L$1 = r0     // Catch:{ Exception -> 0x014b }
            r3.L$2 = r8     // Catch:{ Exception -> 0x014b }
            r3.L$3 = r8     // Catch:{ Exception -> 0x014b }
            r3.L$4 = r8     // Catch:{ Exception -> 0x014b }
            r3.L$5 = r8     // Catch:{ Exception -> 0x014b }
            r3.L$6 = r8     // Catch:{ Exception -> 0x014b }
            r3.label = r5     // Catch:{ Exception -> 0x014b }
            r5 = r2
            r6 = r7
            r7 = r9
            r8 = r22
            r9 = r23
            r2 = r14
            r14 = r16
            r26 = r15
            r15 = r20
            r16 = r21
            r20 = r3
            r21 = r24
            r22 = r25
            java.lang.Object r3 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffUtilitiesManagementApi.DefaultImpls.getSponsoredItems$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x014b }
            r4 = r26
            if (r3 != r4) goto L_0x012f
            return r4
        L_0x012f:
            r27 = r3
            r3 = r2
            r2 = r27
        L_0x0134:
            retrofit2.w r2 = (retrofit2.C13091w) r2     // Catch:{ Exception -> 0x014b }
            java.lang.Object r2 = r2.mo30572a()     // Catch:{ Exception -> 0x014b }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSponsoredItemsResponse r2 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSponsoredItemsResponse) r2     // Catch:{ Exception -> 0x014b }
            boolean r4 = r0.mo117472F()     // Catch:{ Exception -> 0x014b }
            com.carrefour.fid.android.domain.models.criteo.CriteoPageType r0 = r0.mo117500z()     // Catch:{ Exception -> 0x014b }
            com.carrefour.fid.android.shared.data.parsing.a r3 = r3.f58079b     // Catch:{ Exception -> 0x014b }
            java.lang.Object r0 = com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt.toResult(r2, r4, r0, r3)     // Catch:{ Exception -> 0x014b }
            goto L_0x0156
        L_0x014b:
            r0 = move-exception
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x0156:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource.mo67019b(com.carrefour.fid.android.domain.models.criteo.h, com.carrefour.fid.android.domain.models.luckycart.b, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
