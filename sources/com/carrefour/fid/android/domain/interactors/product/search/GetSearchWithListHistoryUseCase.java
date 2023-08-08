package com.carrefour.fid.android.domain.interactors.product.search;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository;
import com.carrefour.fid.android.domain.interactors.C37678e;
import java.util.Set;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class GetSearchWithListHistoryUseCase implements C37678e<Set<? extends String>> {

    /* renamed from: b */
    public static final int f94849b = 8;
    @C12579k

    /* renamed from: a */
    public final SearchWithListHistoryPreferencesRepository f94850a;

    @Inject
    public GetSearchWithListHistoryUseCase(@C12579k SearchWithListHistoryPreferencesRepository searchWithListHistoryPreferencesRepository) {
        Intrinsics.checkNotNullParameter(searchWithListHistoryPreferencesRepository, "searchWithListHistoryRepository");
        this.f94850a = searchWithListHistoryPreferencesRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172998invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.Set<java.lang.String>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.domain.interactors.product.search.GetSearchWithListHistoryUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.domain.interactors.product.search.GetSearchWithListHistoryUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.product.search.GetSearchWithListHistoryUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.search.GetSearchWithListHistoryUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.product.search.GetSearchWithListHistoryUseCase$invoke$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository r5 = r4.f94850a
            r0.label = r3
            java.lang.Object r5 = r5.mo111569c(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.search.GetSearchWithListHistoryUseCase.m172998invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
