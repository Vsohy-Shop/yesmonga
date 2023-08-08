package com.carrefour.fid.android.utilities.domain.repositories;

import com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
public final class UtilitiesRepository {
    @C12579k

    /* renamed from: a */
    public final UtilitiesDataSource f58130a;

    @Inject
    public UtilitiesRepository(@C12579k UtilitiesDataSource utilitiesDataSource) {
        Intrinsics.checkNotNullParameter(utilitiesDataSource, "apiSource");
        this.f58130a = utilitiesDataSource;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67049a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.criteo.C38006h r11, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.luckycart.C38048b r12, @org.jetbrains.annotations.C12579k java.lang.String r13, @org.jetbrains.annotations.C12579k java.lang.String r14, @org.jetbrains.annotations.C12579k java.lang.String r15, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.utilities.C38207a>> r16) {
        /*
            r10 = this;
            r0 = r10
            r1 = r16
            boolean r2 = r1 instanceof com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository$getSponsoredItems$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository$getSponsoredItems$1 r2 = (com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository$getSponsoredItems$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository$getSponsoredItems$1 r2 = new com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository$getSponsoredItems$1
            r2.<init>(r10, r1)
        L_0x001b:
            r9 = r2
            java.lang.Object r1 = r9.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r9.label
            r4 = 1
            if (r3 == 0) goto L_0x003b
            if (r3 != r4) goto L_0x0033
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x007d
        L_0x0033:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003b:
            kotlin.C11661u0.m45747n(r1)
            if (r12 == 0) goto L_0x0045
            boolean r1 = r12.mo117915n()
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            boolean r3 = r11.mo117471E()
            if (r3 != 0) goto L_0x006d
            if (r1 != 0) goto L_0x006d
            com.carrefour.fid.android.shared.util.i r1 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r2 = "Call aborted since Criteo and LuckyCart are disabled"
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r11, r12, r13, r14, r15, r16)
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.utilities.a r1 = new com.carrefour.fid.android.domain.utilities.a
            r2 = 3
            r1.<init>(r3, r3, r2, r3)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x006d:
            com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource r3 = r0.f58130a
            r9.label = r4
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            java.lang.Object r1 = r3.mo67019b(r4, r5, r6, r7, r8, r9)
            if (r1 != r2) goto L_0x007d
            return r2
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository.mo67049a(com.carrefour.fid.android.domain.models.criteo.h, com.carrefour.fid.android.domain.models.luckycart.b, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67050b(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k java.lang.String r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.product.search.C38116a>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository$getSuggestion$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository$getSuggestion$1 r0 = (com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository$getSuggestion$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository$getSuggestion$1 r0 = new com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository$getSuggestion$1
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r5 = r8.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource r8 = r4.f58130a
            r0.label = r3
            java.lang.Object r5 = r8.mo67018a(r5, r6, r7, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r6 = kotlin.Result.m38709i(r5)
            if (r6 == 0) goto L_0x006e
            java.lang.Throwable r5 = kotlin.Result.m38705e(r5)
            if (r5 == 0) goto L_0x005c
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x006d
        L_0x005c:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Throwable r5 = new java.lang.Throwable
            java.lang.String r6 = "getSearchSuggestion has failed with no exception"
            r5.<init>(r6)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x006d:
            return r5
        L_0x006e:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSearchSuggestionsResponse r5 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSearchSuggestionsResponse) r5
            if (r5 == 0) goto L_0x007c
            com.carrefour.fid.android.domain.models.product.search.a r5 = com.carrefour.fid.android.utilities.data.api.mappers.C22677b.m102700c(r5)
            goto L_0x007d
        L_0x007c:
            r5 = 0
        L_0x007d:
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository.mo67050b(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
