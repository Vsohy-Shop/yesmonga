package com.carrefour.fid.android.domain.interactors.product.search;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.product.SearchProductSuggestions;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.presentation.models.C38529u;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class GetProductSearchSuggestionsUseCase implements C37679f<C37788a, C38529u> {

    /* renamed from: c */
    public static final int f94842c = 8;
    @C12579k

    /* renamed from: a */
    public final SearchProductSuggestions f94843a;
    @C12579k

    /* renamed from: b */
    public final C37823k f94844b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase$a */
    public static final class C37788a {

        /* renamed from: b */
        public static final int f94845b = 0;
        @C12579k

        /* renamed from: a */
        public final String f94846a;

        public C37788a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "searchTerms");
            this.f94846a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C37788a m154893c(C37788a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94846a;
            }
            return aVar.mo115139b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo115138a() {
            return this.f94846a;
        }

        @C12579k
        /* renamed from: b */
        public final C37788a mo115139b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "searchTerms");
            return new C37788a(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo115140d() {
            return this.f94846a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37788a) && Intrinsics.areEqual((Object) this.f94846a, (Object) ((C37788a) obj).f94846a);
        }

        public int hashCode() {
            return this.f94846a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f94846a;
            return "Params(searchTerms=" + str + ")";
        }
    }

    @Inject
    public GetProductSearchSuggestionsUseCase(@C12579k SearchProductSuggestions searchProductSuggestions, @C12579k C37823k kVar) {
        Intrinsics.checkNotNullParameter(searchProductSuggestions, "productSearchSuggestion");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        this.f94843a = searchProductSuggestions;
        this.f94844b = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0091 A[SYNTHETIC, Splitter:B:28:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172996invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase.C37788a r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.presentation.models.C38529u>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase$invoke$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.mo21858l()
            goto L_0x008b
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase$a r8 = (com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase.C37788a) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase r2 = (com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x005f
        L_0x004c:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.service.k r9 = r7.f94844b
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r2 = r7
        L_0x005f:
            boolean r4 = kotlin.Result.m38709i(r9)
            r5 = 0
            if (r4 == 0) goto L_0x0067
            r9 = r5
        L_0x0067:
            com.carrefour.fid.android.domain.models.service.models.k r9 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r9
            if (r9 == 0) goto L_0x00aa
            java.lang.String r4 = com.carrefour.fid.android.shared.extension.C28762j0.m119069b(r9)
            java.lang.String r9 = com.carrefour.fid.android.shared.extension.C28762j0.m119068a(r9)
            com.carrefour.fid.android.domain.interactors.product.SearchProductSuggestions r2 = r2.f94843a
            com.carrefour.fid.android.domain.interactors.product.SearchProductSuggestions$SearchParams r6 = new com.carrefour.fid.android.domain.interactors.product.SearchProductSuggestions$SearchParams
            java.lang.String r8 = r8.mo115140d()
            r6.<init>(r8, r9, r4)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = r2.m172966invokegIAlus(r6, r0)
            if (r8 != r1) goto L_0x008b
            return r1
        L_0x008b:
            boolean r9 = kotlin.Result.m38710j(r8)
            if (r9 == 0) goto L_0x00a5
            kotlin.Result$a r9 = kotlin.Result.f28060a     // Catch:{ all -> 0x009e }
            com.carrefour.fid.android.domain.models.product.search.a r8 = (com.carrefour.fid.android.domain.models.product.search.C38116a) r8     // Catch:{ all -> 0x009e }
            com.carrefour.fid.android.presentation.models.u r8 = com.carrefour.fid.android.domain.interactors.product.search.C37798g.m154943a(r8)     // Catch:{ all -> 0x009e }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ all -> 0x009e }
            goto L_0x00b9
        L_0x009e:
            r8 = move-exception
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
        L_0x00a5:
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            goto L_0x00b9
        L_0x00aa:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Throwable r8 = new java.lang.Throwable
            r8.<init>()
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x00b9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase.m172996invokegIAlus(com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
