package com.carrefour.fid.android.domain.interactors.product.search;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.presentation.models.C38529u;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nGetSearchHistoryUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetSearchHistoryUseCase.kt\ncom/carrefour/fid/android/domain/interactors/product/search/GetSearchHistoryUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1549#2:24\n1620#2,3:25\n*S KotlinDebug\n*F\n+ 1 GetSearchHistoryUseCase.kt\ncom/carrefour/fid/android/domain/interactors/product/search/GetSearchHistoryUseCase\n*L\n17#1:24\n17#1:25,3\n*E\n"})
public final class GetSearchHistoryUseCase implements C37678e<C38529u> {

    /* renamed from: b */
    public static final int f94847b = 8;
    @C12579k

    /* renamed from: a */
    public final SearchHistoryPreferencesRepository f94848a;

    @Inject
    public GetSearchHistoryUseCase(@C12579k SearchHistoryPreferencesRepository searchHistoryPreferencesRepository) {
        Intrinsics.checkNotNullParameter(searchHistoryPreferencesRepository, "searchHistoryRepository");
        this.f94848a = searchHistoryPreferencesRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d A[Catch:{ all -> 0x0093 }, LOOP:0: B:22:0x0067->B:24:0x006d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172997invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.presentation.models.C38529u>> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.domain.interactors.product.search.GetSearchHistoryUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.domain.interactors.product.search.GetSearchHistoryUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.product.search.GetSearchHistoryUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.search.GetSearchHistoryUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.product.search.GetSearchHistoryUseCase$invoke$1
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.models.SuggestionType r0 = (com.carrefour.fid.android.presentation.models.SuggestionType) r0
            kotlin.C11661u0.m45747n(r13)     // Catch:{ all -> 0x0093 }
            kotlin.Result r13 = (kotlin.Result) r13     // Catch:{ all -> 0x0093 }
            java.lang.Object r13 = r13.mo21858l()     // Catch:{ all -> 0x0093 }
            r1 = r0
            goto L_0x0052
        L_0x0034:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x003c:
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result$a r13 = kotlin.Result.f28060a     // Catch:{ all -> 0x0093 }
            com.carrefour.fid.android.presentation.models.SuggestionType r13 = com.carrefour.fid.android.presentation.models.SuggestionType.HISTORY     // Catch:{ all -> 0x0093 }
            com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository r2 = r12.f94848a     // Catch:{ all -> 0x0093 }
            r0.L$0 = r13     // Catch:{ all -> 0x0093 }
            r0.label = r3     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r2.mo111566c(r0)     // Catch:{ all -> 0x0093 }
            if (r0 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r1 = r13
            r13 = r0
        L_0x0052:
            r2 = 0
            kotlin.C11661u0.m45747n(r13)     // Catch:{ all -> 0x0093 }
            java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch:{ all -> 0x0093 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0093 }
            r0 = 10
            int r0 = kotlin.collections.C10978t.m41495Y(r13, r0)     // Catch:{ all -> 0x0093 }
            r3.<init>(r0)     // Catch:{ all -> 0x0093 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0093 }
        L_0x0067:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x0093 }
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0093 }
            com.carrefour.fid.android.presentation.models.v r0 = new com.carrefour.fid.android.presentation.models.v     // Catch:{ all -> 0x0093 }
            com.carrefour.fid.android.presentation.models.SuggestionType r5 = com.carrefour.fid.android.presentation.models.SuggestionType.HISTORY     // Catch:{ all -> 0x0093 }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 28
            r11 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0093 }
            r3.add(r0)     // Catch:{ all -> 0x0093 }
            goto L_0x0067
        L_0x0086:
            r4 = 2
            r5 = 0
            com.carrefour.fid.android.presentation.models.u r13 = new com.carrefour.fid.android.presentation.models.u     // Catch:{ all -> 0x0093 }
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0093 }
            java.lang.Object r13 = kotlin.Result.m38702b(r13)     // Catch:{ all -> 0x0093 }
            goto L_0x009e
        L_0x0093:
            r13 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r13 = kotlin.C11661u0.m45734a(r13)
            java.lang.Object r13 = kotlin.Result.m38702b(r13)
        L_0x009e:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.search.GetSearchHistoryUseCase.m172997invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
