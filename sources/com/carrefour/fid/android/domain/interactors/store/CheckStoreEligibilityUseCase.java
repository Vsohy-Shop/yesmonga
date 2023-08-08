package com.carrefour.fid.android.domain.interactors.store;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffEligibilityDataResponseData;
import com.carrefour.fid.android.bff_data_shared.data.api.services.BffStoresManagementApi;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class CheckStoreEligibilityUseCase implements C37678e<BffEligibilityDataResponseData> {

    /* renamed from: d */
    public static final int f94967d = 8;
    @C12579k

    /* renamed from: a */
    public final BffStoresManagementApi f94968a;
    @C12579k

    /* renamed from: b */
    public final AccountRepository f94969b;
    @C12579k

    /* renamed from: c */
    public final C37823k f94970c;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase$a */
    public static final class C37868a {

        /* renamed from: e */
        public static final int f94971e = 0;
        @C12579k

        /* renamed from: a */
        public final String f94972a;
        @C12579k

        /* renamed from: b */
        public final String f94973b;

        /* renamed from: c */
        public final double f94974c;

        /* renamed from: d */
        public final double f94975d;

        public C37868a(@C12579k String str, @C12579k String str2, double d, double d2) {
            Intrinsics.checkNotNullParameter(str, "storeId");
            Intrinsics.checkNotNullParameter(str2, "storeServiceId");
            this.f94972a = str;
            this.f94973b = str2;
            this.f94974c = d;
            this.f94975d = d2;
        }

        /* renamed from: f */
        public static /* synthetic */ C37868a m155098f(C37868a aVar, String str, String str2, double d, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94972a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f94973b;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                d = aVar.f94974c;
            }
            double d3 = d;
            if ((i & 8) != 0) {
                d2 = aVar.f94975d;
            }
            return aVar.mo115332e(str, str3, d3, d2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo115328a() {
            return this.f94972a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo115329b() {
            return this.f94973b;
        }

        /* renamed from: c */
        public final double mo115330c() {
            return this.f94974c;
        }

        /* renamed from: d */
        public final double mo115331d() {
            return this.f94975d;
        }

        @C12579k
        /* renamed from: e */
        public final C37868a mo115332e(@C12579k String str, @C12579k String str2, double d, double d2) {
            Intrinsics.checkNotNullParameter(str, "storeId");
            Intrinsics.checkNotNullParameter(str2, "storeServiceId");
            return new C37868a(str, str2, d, d2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37868a)) {
                return false;
            }
            C37868a aVar = (C37868a) obj;
            return Intrinsics.areEqual((Object) this.f94972a, (Object) aVar.f94972a) && Intrinsics.areEqual((Object) this.f94973b, (Object) aVar.f94973b) && Double.compare(this.f94974c, aVar.f94974c) == 0 && Double.compare(this.f94975d, aVar.f94975d) == 0;
        }

        /* renamed from: g */
        public final double mo115334g() {
            return this.f94974c;
        }

        /* renamed from: h */
        public final double mo115335h() {
            return this.f94975d;
        }

        public int hashCode() {
            return (((((this.f94972a.hashCode() * 31) + this.f94973b.hashCode()) * 31) + Double.hashCode(this.f94974c)) * 31) + Double.hashCode(this.f94975d);
        }

        @C12579k
        /* renamed from: i */
        public final String mo115337i() {
            return this.f94972a;
        }

        @C12579k
        /* renamed from: j */
        public final String mo115338j() {
            return this.f94973b;
        }

        @C12579k
        public String toString() {
            String str = this.f94972a;
            String str2 = this.f94973b;
            double d = this.f94974c;
            double d2 = this.f94975d;
            return "Params(storeId=" + str + ", storeServiceId=" + str2 + ", latitude=" + d + ", longitude=" + d2 + ")";
        }
    }

    @Inject
    public CheckStoreEligibilityUseCase(@C12579k BffStoresManagementApi bffStoresManagementApi, @C12579k AccountRepository accountRepository, @C12579k C37823k kVar) {
        Intrinsics.checkNotNullParameter(bffStoresManagementApi, "bffStoresManagementApi");
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        this.f94968a = bffStoresManagementApi;
        this.f94969b = accountRepository;
        this.f94970c = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0155 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173011invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.bff_data_shared.data.api.entities.BffEligibilityDataResponseData>> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase$invoke$1 r2 = (com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase$invoke$1 r2 = new com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            r11 = r2
            java.lang.Object r1 = r11.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r11.label
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L_0x0085
            if (r3 == r7) goto L_0x0077
            if (r3 == r6) goto L_0x0064
            if (r3 == r5) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r2 = r11.L$0
            com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase r2 = (com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase) r2
            kotlin.C11661u0.m45747n(r1)
            goto L_0x0156
        L_0x003d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0045:
            java.lang.Object r3 = r11.L$4
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffStoresManagementApi r3 = (com.carrefour.fid.android.bff_data_shared.data.api.services.BffStoresManagementApi) r3
            java.lang.Object r5 = r11.L$3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r11.L$2
            com.carrefour.fid.android.shared.util.ServiceUtil r6 = (com.carrefour.fid.android.shared.util.ServiceUtil) r6
            java.lang.Object r7 = r11.L$1
            com.carrefour.fid.android.domain.models.account.Address r7 = (com.carrefour.fid.android.domain.models.account.Address) r7
            java.lang.Object r9 = r11.L$0
            com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase r9 = (com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase) r9
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0111
        L_0x0064:
            java.lang.Object r3 = r11.L$1
            com.carrefour.fid.android.domain.models.account.Address r3 = (com.carrefour.fid.android.domain.models.account.Address) r3
            java.lang.Object r6 = r11.L$0
            com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase r6 = (com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase) r6
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r9 = r6
            goto L_0x00b4
        L_0x0077:
            java.lang.Object r3 = r11.L$0
            com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase r3 = (com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase) r3
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0096
        L_0x0085:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.account.data.repositories.AccountRepository r1 = r0.f94969b
            r11.L$0 = r0
            r11.label = r7
            java.lang.Object r1 = r1.mo31323h(r11)
            if (r1 != r2) goto L_0x0095
            return r2
        L_0x0095:
            r3 = r0
        L_0x0096:
            java.lang.Throwable r9 = kotlin.Result.m38705e(r1)
            if (r9 != 0) goto L_0x018d
            com.carrefour.fid.android.domain.models.account.AccountInfo r1 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r1
            com.carrefour.fid.android.domain.models.account.Address r1 = com.carrefour.fid.android.domain.models.account.extension.C37949a.m155956b(r1)
            com.carrefour.fid.android.domain.interactors.service.k r9 = r3.f94970c
            r11.L$0 = r3
            r11.L$1 = r1
            r11.label = r6
            java.lang.Object r6 = r9.m172965invokeIoAF18A(r11)
            if (r6 != r2) goto L_0x00b1
            return r2
        L_0x00b1:
            r9 = r3
            r3 = r1
            r1 = r6
        L_0x00b4:
            boolean r6 = kotlin.Result.m38709i(r1)
            if (r6 == 0) goto L_0x00bb
            r1 = r8
        L_0x00bb:
            com.carrefour.fid.android.domain.models.service.models.k r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1
            if (r3 == 0) goto L_0x017d
            double r12 = r3.mo116691P()
            r14 = 0
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r10 = 0
            if (r6 != 0) goto L_0x00cc
            r6 = r7
            goto L_0x00cd
        L_0x00cc:
            r6 = r10
        L_0x00cd:
            if (r6 != 0) goto L_0x017d
            double r12 = r3.mo116693R()
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r7 = r10
        L_0x00d9:
            if (r7 != 0) goto L_0x017d
            if (r1 == 0) goto L_0x017d
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffStoresManagementApi r6 = r9.f94968a
            com.carrefour.fid.android.domain.models.service.models.l r1 = r1.mo119352e()
            if (r1 == 0) goto L_0x00ea
            java.lang.String r1 = r1.mo119359C()
            goto L_0x00eb
        L_0x00ea:
            r1 = r8
        L_0x00eb:
            if (r1 != 0) goto L_0x00ef
            java.lang.String r1 = ""
        L_0x00ef:
            com.carrefour.fid.android.shared.util.ServiceUtil r7 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
            com.carrefour.fid.android.domain.interactors.service.k r10 = r9.f94970c
            r11.L$0 = r9
            r11.L$1 = r3
            r11.L$2 = r7
            r11.L$3 = r1
            r11.L$4 = r6
            r11.label = r5
            java.lang.Object r5 = r10.m172965invokeIoAF18A(r11)
            if (r5 != r2) goto L_0x0106
            return r2
        L_0x0106:
            r16 = r5
            r5 = r1
            r1 = r16
            r17 = r7
            r7 = r3
            r3 = r6
            r6 = r17
        L_0x0111:
            boolean r10 = kotlin.Result.m38709i(r1)
            if (r10 == 0) goto L_0x0118
            r1 = r8
        L_0x0118:
            com.carrefour.fid.android.domain.models.service.models.k r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1
            if (r1 == 0) goto L_0x0121
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = r1.mo119354f()
            goto L_0x0122
        L_0x0121:
            r1 = r8
        L_0x0122:
            java.lang.String r1 = r6.mo84123e(r1)
            double r12 = r7.mo116691P()
            java.lang.String r6 = java.lang.String.valueOf(r12)
            double r12 = r7.mo116693R()
            java.lang.String r7 = java.lang.String.valueOf(r12)
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 112(0x70, float:1.57E-43)
            r15 = 0
            r11.L$0 = r9
            r11.L$1 = r8
            r11.L$2 = r8
            r11.L$3 = r8
            r11.L$4 = r8
            r11.label = r4
            r4 = r5
            r5 = r1
            r8 = r10
            r9 = r12
            r10 = r13
            r12 = r14
            r13 = r15
            java.lang.Object r1 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffStoresManagementApi.DefaultImpls.getEligibility$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r1 != r2) goto L_0x0156
            return r2
        L_0x0156:
            retrofit2.w r1 = (retrofit2.C13091w) r1
            java.lang.Object r1 = r1.mo30572a()
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffEligibilityDataResponse r1 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffEligibilityDataResponse) r1
            if (r1 == 0) goto L_0x016d
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffEligibilityDataResponseData r1 = r1.getData()
            if (r1 == 0) goto L_0x016d
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x016d:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.CheckStoreEligibilityThrowable r1 = new com.carrefour.fid.android.core.io.CheckStoreEligibilityThrowable
            r1.<init>()
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            goto L_0x0197
        L_0x017d:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.AddressNotAvailableThrowable r1 = new com.carrefour.fid.android.shared.io.AddressNotAvailableThrowable
            r1.<init>()
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            goto L_0x0197
        L_0x018d:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
        L_0x0197:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase.m173011invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
