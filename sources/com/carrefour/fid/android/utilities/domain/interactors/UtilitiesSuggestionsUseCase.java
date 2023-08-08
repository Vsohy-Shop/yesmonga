package com.carrefour.fid.android.utilities.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.SearchProductSuggestions;
import com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class UtilitiesSuggestionsUseCase implements SearchProductSuggestions {
    @C12579k

    /* renamed from: a */
    public final UtilitiesRepository f58101a;

    @Inject
    public UtilitiesSuggestionsUseCase(@C12579k UtilitiesRepository utilitiesRepository) {
        Intrinsics.checkNotNullParameter(utilitiesRepository, "repository");
        this.f58101a = utilitiesRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172805invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.product.SearchProductSuggestions.SearchParams r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.product.search.C38116a>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.utilities.domain.interactors.UtilitiesSuggestionsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesSuggestionsUseCase$invoke$1 r0 = (com.carrefour.fid.android.utilities.domain.interactors.UtilitiesSuggestionsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesSuggestionsUseCase$invoke$1 r0 = new com.carrefour.fid.android.utilities.domain.interactors.UtilitiesSuggestionsUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0051
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository r7 = r5.f58101a
            java.lang.String r2 = r6.mo114989h()
            java.lang.String r4 = r6.mo114988g()
            java.lang.String r6 = r6.mo114987f()
            r0.label = r3
            java.lang.Object r6 = r7.mo67050b(r2, r4, r6, r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utilities.domain.interactors.UtilitiesSuggestionsUseCase.m172805invokegIAlus(com.carrefour.fid.android.domain.interactors.product.SearchProductSuggestions$SearchParams, kotlin.coroutines.c):java.lang.Object");
    }
}
