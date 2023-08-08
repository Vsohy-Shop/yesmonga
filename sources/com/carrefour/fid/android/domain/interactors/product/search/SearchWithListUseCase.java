package com.carrefour.fid.android.domain.interactors.product.search;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.entities.APIMRecommendedNeeds;
import com.carrefour.fid.android.data.repositories.RecommendedNeedsRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.service.C37824l;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class SearchWithListUseCase implements C37679f<List<? extends String>, APIMRecommendedNeeds> {

    /* renamed from: f */
    public static final int f94863f = 8;
    @C12579k

    /* renamed from: a */
    public final RecommendedNeedsRepository f94864a;
    @C12579k

    /* renamed from: b */
    public final C37824l f94865b;
    @C12579k

    /* renamed from: c */
    public final LoginRepository f94866c;
    @C12579k

    /* renamed from: d */
    public final LoyaltyPreferencesStorage f94867d;
    @C12579k

    /* renamed from: e */
    public final AccountRepository f94868e;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase$a */
    public static final class C37790a {

        /* renamed from: b */
        public static final int f94869b = 8;
        @C12579k

        /* renamed from: a */
        public final List<String> f94870a;

        public C37790a(@C12579k List<String> list) {
            Intrinsics.checkNotNullParameter(list, "searchList");
            this.f94870a = list;
        }

        /* renamed from: c */
        public static /* synthetic */ C37790a m154916c(C37790a aVar, List<String> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.f94870a;
            }
            return aVar.mo115163b(list);
        }

        @C12579k
        /* renamed from: a */
        public final List<String> mo115162a() {
            return this.f94870a;
        }

        @C12579k
        /* renamed from: b */
        public final C37790a mo115163b(@C12579k List<String> list) {
            Intrinsics.checkNotNullParameter(list, "searchList");
            return new C37790a(list);
        }

        @C12579k
        /* renamed from: d */
        public final List<String> mo115164d() {
            return this.f94870a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37790a) && Intrinsics.areEqual((Object) this.f94870a, (Object) ((C37790a) obj).f94870a);
        }

        public int hashCode() {
            return this.f94870a.hashCode();
        }

        @C12579k
        public String toString() {
            List<String> list = this.f94870a;
            return "Param(searchList=" + list + ")";
        }
    }

    @Inject
    public SearchWithListUseCase(@C12579k RecommendedNeedsRepository recommendedNeedsRepository, @C12579k C37824l lVar, @C12579k LoginRepository loginRepository, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k AccountRepository accountRepository) {
        Intrinsics.checkNotNullParameter(recommendedNeedsRepository, "repository");
        Intrinsics.checkNotNullParameter(lVar, "getStoreRefUseCase");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        this.f94864a = recommendedNeedsRepository;
        this.f94865b = lVar;
        this.f94866c = loginRepository;
        this.f94867d = loyaltyPreferencesStorage;
        this.f94868e = accountRepository;
    }

    /* renamed from: c */
    public final String mo115158c() {
        return this.f94866c.mo31353e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo115159d(kotlin.coroutines.C11045c<? super java.lang.String> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase$getLoyaltyCardNumber$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase$getLoyaltyCardNumber$1 r0 = (com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase$getLoyaltyCardNumber$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase$getLoyaltyCardNumber$1 r0 = new com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase$getLoyaltyCardNumber$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x006d
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0038:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase r2 = (com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0051
        L_0x0040:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r8 = r7.f94867d
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.getLoyaltyCardNumber(r0)
            if (r8 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r2 = r7
        L_0x0051:
            java.lang.String r8 = (java.lang.String) r8
            int r5 = r8.length()
            if (r5 != 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r4 = 0
        L_0x005b:
            if (r4 == 0) goto L_0x0085
            com.carrefour.fid.android.account.data.repositories.AccountRepository r2 = r2.f94868e
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r0 = r2.mo31329n(r0)
            if (r0 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x006d:
            com.carrefour.fid.android.domain.models.account.AccountInfo r8 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r8
            if (r8 == 0) goto L_0x0076
            java.util.List r8 = r8.mo116669w()
            goto L_0x0077
        L_0x0076:
            r8 = 0
        L_0x0077:
            if (r8 == 0) goto L_0x0084
            com.carrefour.fid.android.domain.models.account.UserCards r8 = com.carrefour.fid.android.account.domain.extension.C13242a.m57372b(r8)
            if (r8 == 0) goto L_0x0084
            java.lang.String r8 = r8.mo116763k()
            goto L_0x0085
        L_0x0084:
            r8 = r0
        L_0x0085:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase.mo115159d(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo115160e(kotlin.coroutines.C11045c<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase$getStoreId$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase$getStoreId$1 r0 = (com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase$getStoreId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase$getStoreId$1 r0 = new com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase$getStoreId$1
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
            com.carrefour.fid.android.domain.interactors.service.l r5 = r4.f94865b
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38709i(r5)
            if (r0 == 0) goto L_0x004d
            java.lang.String r5 = "6"
        L_0x004d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase.mo115160e(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173001invokegIAlus(@org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.data.entities.APIMRecommendedNeeds>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase$invoke$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005a
            if (r2 == r5) goto L_0x004e
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r9 = r10.mo21858l()
            goto L_0x00a4
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003e:
            java.lang.Object r9 = r0.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase r4 = (com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase) r4
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0090
        L_0x004e:
            java.lang.Object r9 = r0.L$1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase r2 = (com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase) r2
            kotlin.C11661u0.m45747n(r10)
            goto L_0x006b
        L_0x005a:
            kotlin.C11661u0.m45747n(r10)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r8.mo115159d(r0)
            if (r10 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r2 = r8
        L_0x006b:
            java.lang.String r10 = (java.lang.String) r10
            int r6 = r10.length()
            if (r6 <= 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r5 = 0
        L_0x0075:
            if (r5 == 0) goto L_0x0078
            goto L_0x007c
        L_0x0078:
            java.lang.String r10 = r2.mo115158c()
        L_0x007c:
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r4
            java.lang.Object r4 = r2.mo115160e(r0)
            if (r4 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r7 = r2
            r2 = r9
            r9 = r10
            r10 = r4
            r4 = r7
        L_0x0090:
            java.lang.String r10 = (java.lang.String) r10
            com.carrefour.fid.android.data.repositories.RecommendedNeedsRepository r4 = r4.f94864a
            r5 = 0
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r9 = r4.mo111562c(r9, r10, r2, r0)
            if (r9 != r1) goto L_0x00a4
            return r1
        L_0x00a4:
            boolean r10 = kotlin.Result.m38710j(r9)
            if (r10 == 0) goto L_0x00b2
            r10 = r9
            com.carrefour.fid.android.data.entities.APIMRecommendedNeeds r10 = (com.carrefour.fid.android.data.entities.APIMRecommendedNeeds) r10
            kotlin.Result$a r0 = kotlin.Result.f28060a
            kotlin.Result.m38702b(r10)
        L_0x00b2:
            java.lang.Throwable r10 = kotlin.Result.m38705e(r9)
            if (r10 == 0) goto L_0x00c1
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)
            kotlin.Result.m38702b(r10)
        L_0x00c1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase.m173001invokegIAlus(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }
}
