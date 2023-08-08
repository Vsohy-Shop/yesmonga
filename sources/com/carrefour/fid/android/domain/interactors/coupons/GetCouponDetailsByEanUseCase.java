package com.carrefour.fid.android.domain.interactors.coupons;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.CouponsRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.C38015d;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.presentation.models.CouponModel;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nGetCouponDetailsByEanUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetCouponDetailsByEanUseCase.kt\ncom/carrefour/fid/android/domain/interactors/coupons/GetCouponDetailsByEanUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
public final class GetCouponDetailsByEanUseCase implements C37679f<C37636a, CouponModel> {

    /* renamed from: c */
    public static final int f94435c = 8;
    @C12579k

    /* renamed from: a */
    public final LoyaltyPreferencesStorage f94436a;
    @C12579k

    /* renamed from: b */
    public final CouponsRepository f94437b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.coupons.GetCouponDetailsByEanUseCase$a */
    public static final class C37636a {

        /* renamed from: b */
        public static final int f94438b = 0;

        /* renamed from: a */
        public final long f94439a;

        public C37636a(long j) {
            this.f94439a = j;
        }

        /* renamed from: c */
        public static /* synthetic */ C37636a m154279c(C37636a aVar, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = aVar.f94439a;
            }
            return aVar.mo114554b(j);
        }

        /* renamed from: a */
        public final long mo114553a() {
            return this.f94439a;
        }

        @C12579k
        /* renamed from: b */
        public final C37636a mo114554b(long j) {
            return new C37636a(j);
        }

        /* renamed from: d */
        public final long mo114555d() {
            return this.f94439a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37636a) && this.f94439a == ((C37636a) obj).f94439a;
        }

        public int hashCode() {
            return Long.hashCode(this.f94439a);
        }

        @C12579k
        public String toString() {
            long j = this.f94439a;
            return "Param(ean13=" + j + ")";
        }
    }

    @Inject
    public GetCouponDetailsByEanUseCase(@C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k CouponsRepository couponsRepository) {
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(couponsRepository, "couponsRepository");
        this.f94436a = loyaltyPreferencesStorage;
        this.f94437b = couponsRepository;
    }

    /* renamed from: a */
    public final C38015d mo114551a(long j, List<C38015d>... listArr) {
        Object obj;
        boolean z;
        Iterator it = C10978t.m41497a0(ArraysKt___ArraysKt.m40241ub(listArr)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C38015d) obj).mo117583I() == j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C38015d) obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172952invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.coupons.GetCouponDetailsByEanUseCase.C37636a r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.presentation.models.CouponModel>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.domain.interactors.coupons.GetCouponDetailsByEanUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.domain.interactors.coupons.GetCouponDetailsByEanUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.coupons.GetCouponDetailsByEanUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.coupons.GetCouponDetailsByEanUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.coupons.GetCouponDetailsByEanUseCase$invoke$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.domain.interactors.coupons.GetCouponDetailsByEanUseCase$a r8 = (com.carrefour.fid.android.domain.interactors.coupons.GetCouponDetailsByEanUseCase.C37636a) r8
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.interactors.coupons.GetCouponDetailsByEanUseCase r0 = (com.carrefour.fid.android.domain.interactors.coupons.GetCouponDetailsByEanUseCase) r0
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0073
        L_0x003a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0042:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.domain.interactors.coupons.GetCouponDetailsByEanUseCase$a r8 = (com.carrefour.fid.android.domain.interactors.coupons.GetCouponDetailsByEanUseCase.C37636a) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.coupons.GetCouponDetailsByEanUseCase r2 = (com.carrefour.fid.android.domain.interactors.coupons.GetCouponDetailsByEanUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0061
        L_0x004e:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r9 = r7.f94436a
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.getLoyaltyCardNumber(r0)
            if (r9 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r2 = r7
        L_0x0061:
            java.lang.String r9 = (java.lang.String) r9
            com.carrefour.fid.android.data.repositories.CouponsRepository r5 = r2.f94437b
            r0.L$0 = r2
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r5.mo111488c(r9, r0)
            if (r9 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r0 = r2
        L_0x0073:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r9)
            if (r1 != 0) goto L_0x00b8
            com.carrefour.fid.android.domain.models.c r9 = (com.carrefour.fid.android.domain.models.C37974c) r9
            long r1 = r8.mo114555d()
            r8 = 3
            java.util.List[] r8 = new java.util.List[r8]
            java.util.List r5 = r9.mo117039f()
            r6 = 0
            r8[r6] = r5
            java.util.List r5 = r9.mo117040g()
            r8[r4] = r5
            java.util.List r9 = r9.mo117041h()
            r8[r3] = r9
            com.carrefour.fid.android.domain.models.d r8 = r0.mo114551a(r1, r8)
            if (r8 == 0) goto L_0x00a6
            kotlin.Result$a r9 = kotlin.Result.f28060a
            com.carrefour.fid.android.presentation.models.CouponModel r8 = com.carrefour.fid.android.presentation.models.extension.C38465d.m159623b(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            goto L_0x00c2
        L_0x00a6:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Throwable r8 = new java.lang.Throwable
            java.lang.String r9 = "No coupon found"
            r8.<init>(r9)
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            goto L_0x00c2
        L_0x00b8:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x00c2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.coupons.GetCouponDetailsByEanUseCase.m172952invokegIAlus(com.carrefour.fid.android.domain.interactors.coupons.GetCouponDetailsByEanUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
