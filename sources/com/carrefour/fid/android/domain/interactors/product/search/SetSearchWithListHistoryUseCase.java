package com.carrefour.fid.android.domain.interactors.product.search;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class SetSearchWithListHistoryUseCase implements C37679f<C37791a, C11079d2> {

    /* renamed from: b */
    public static final int f94871b = 8;
    @C12579k

    /* renamed from: a */
    public final SearchWithListHistoryPreferencesRepository f94872a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.product.search.SetSearchWithListHistoryUseCase$a */
    public static final class C37791a {

        /* renamed from: b */
        public static final int f94873b = 8;
        @C12579k

        /* renamed from: a */
        public final Set<String> f94874a;

        public C37791a(@C12579k Set<String> set) {
            Intrinsics.checkNotNullParameter(set, "searchSet");
            this.f94874a = set;
        }

        /* renamed from: c */
        public static /* synthetic */ C37791a m154921c(C37791a aVar, Set<String> set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = aVar.f94874a;
            }
            return aVar.mo115170b(set);
        }

        @C12579k
        /* renamed from: a */
        public final Set<String> mo115169a() {
            return this.f94874a;
        }

        @C12579k
        /* renamed from: b */
        public final C37791a mo115170b(@C12579k Set<String> set) {
            Intrinsics.checkNotNullParameter(set, "searchSet");
            return new C37791a(set);
        }

        @C12579k
        /* renamed from: d */
        public final Set<String> mo115171d() {
            return this.f94874a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37791a) && Intrinsics.areEqual((Object) this.f94874a, (Object) ((C37791a) obj).f94874a);
        }

        public int hashCode() {
            return this.f94874a.hashCode();
        }

        @C12579k
        public String toString() {
            Set<String> set = this.f94874a;
            return "Param(searchSet=" + set + ")";
        }
    }

    @Inject
    public SetSearchWithListHistoryUseCase(@C12579k SearchWithListHistoryPreferencesRepository searchWithListHistoryPreferencesRepository) {
        Intrinsics.checkNotNullParameter(searchWithListHistoryPreferencesRepository, "searchWithListHistoryRepository");
        this.f94872a = searchWithListHistoryPreferencesRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173002invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.product.search.SetSearchWithListHistoryUseCase.C37791a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.interactors.product.search.SetSearchWithListHistoryUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.domain.interactors.product.search.SetSearchWithListHistoryUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.product.search.SetSearchWithListHistoryUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.search.SetSearchWithListHistoryUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.product.search.SetSearchWithListHistoryUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository r6 = r4.f94872a
            java.util.Set r5 = r5.mo115171d()
            r0.label = r3
            java.lang.Object r5 = r6.mo111568b(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.search.SetSearchWithListHistoryUseCase.m173002invokegIAlus(com.carrefour.fid.android.domain.interactors.product.search.SetSearchWithListHistoryUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
