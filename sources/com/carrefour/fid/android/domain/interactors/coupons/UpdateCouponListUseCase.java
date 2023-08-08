package com.carrefour.fid.android.domain.interactors.coupons;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.C36454f;
import com.carrefour.fid.android.data.entities.coupons.CouponAction;
import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import com.carrefour.fid.android.data.repositories.CouponsRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11395k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(message = "Replaced by UpdateCouponsUseCase")
@C8567o(parameters = 0)
public final class UpdateCouponListUseCase implements C37679f<C37640a, List<? extends C36454f>> {

    /* renamed from: b */
    public static final int f94453b = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final CouponsRepository f94454a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponListUseCase$a */
    public static final class C37640a {

        /* renamed from: d */
        public static final int f94455d = 8;
        @C12579k

        /* renamed from: a */
        public final String f94456a;
        @C12579k

        /* renamed from: b */
        public final CouponStatus f94457b;
        @C12579k

        /* renamed from: c */
        public final List<String> f94458c;

        public C37640a(@C12579k String str, @C12579k CouponStatus couponStatus, @C12579k List<String> list) {
            Intrinsics.checkNotNullParameter(str, "loyaltyCardId");
            Intrinsics.checkNotNullParameter(couponStatus, "newStatus");
            Intrinsics.checkNotNullParameter(list, "eanList");
            this.f94456a = str;
            this.f94457b = couponStatus;
            this.f94458c = list;
        }

        /* renamed from: e */
        public static /* synthetic */ C37640a m154307e(C37640a aVar, String str, CouponStatus couponStatus, List<String> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94456a;
            }
            if ((i & 2) != 0) {
                couponStatus = aVar.f94457b;
            }
            if ((i & 4) != 0) {
                list = aVar.f94458c;
            }
            return aVar.mo114589d(str, couponStatus, list);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114586a() {
            return this.f94456a;
        }

        @C12579k
        /* renamed from: b */
        public final CouponStatus mo114587b() {
            return this.f94457b;
        }

        @C12579k
        /* renamed from: c */
        public final List<String> mo114588c() {
            return this.f94458c;
        }

        @C12579k
        /* renamed from: d */
        public final C37640a mo114589d(@C12579k String str, @C12579k CouponStatus couponStatus, @C12579k List<String> list) {
            Intrinsics.checkNotNullParameter(str, "loyaltyCardId");
            Intrinsics.checkNotNullParameter(couponStatus, "newStatus");
            Intrinsics.checkNotNullParameter(list, "eanList");
            return new C37640a(str, couponStatus, list);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37640a)) {
                return false;
            }
            C37640a aVar = (C37640a) obj;
            return Intrinsics.areEqual((Object) this.f94456a, (Object) aVar.f94456a) && this.f94457b == aVar.f94457b && Intrinsics.areEqual((Object) this.f94458c, (Object) aVar.f94458c);
        }

        @C12579k
        /* renamed from: f */
        public final List<String> mo114591f() {
            return this.f94458c;
        }

        @C12579k
        /* renamed from: g */
        public final String mo114592g() {
            return this.f94456a;
        }

        @C12579k
        /* renamed from: h */
        public final CouponStatus mo114593h() {
            return this.f94457b;
        }

        public int hashCode() {
            return (((this.f94456a.hashCode() * 31) + this.f94457b.hashCode()) * 31) + this.f94458c.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f94456a;
            CouponStatus couponStatus = this.f94457b;
            List<String> list = this.f94458c;
            return "Param(loyaltyCardId=" + str + ", newStatus=" + couponStatus + ", eanList=" + list + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponListUseCase$b */
    public /* synthetic */ class C37641b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.data.entities.coupons.CouponStatus[] r0 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.data.entities.coupons.CouponStatus r1 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.LOADEDTOCARD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.data.entities.coupons.CouponStatus r1 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.BURNT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.data.entities.coupons.CouponStatus r1 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.PRINTED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponListUseCase.C37641b.<clinit>():void");
        }
    }

    @Inject
    public UpdateCouponListUseCase(@C12579k CouponsRepository couponsRepository) {
        Intrinsics.checkNotNullParameter(couponsRepository, "repository");
        this.f94454a = couponsRepository;
    }

    /* renamed from: a */
    public final CouponAction mo114584a(CouponStatus couponStatus) {
        int i = C37641b.$EnumSwitchMapping$0[couponStatus.ordinal()];
        if (i == 1) {
            return CouponAction.LOADTOCARD;
        }
        if (i == 2) {
            return CouponAction.BURN;
        }
        if (i != 3) {
            return CouponAction.UNLOADTOCARD;
        }
        return CouponAction.PRINT;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172955invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponListUseCase.C37640a r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.data.entities.C36454f>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponListUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponListUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponListUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponListUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponListUseCase$invoke$1
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
            goto L_0x0055
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.data.repositories.CouponsRepository r7 = r5.f94454a
            java.lang.String r2 = r6.mo114592g()
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r4 = r6.mo114593h()
            com.carrefour.fid.android.data.entities.coupons.CouponAction r4 = r5.mo114584a(r4)
            java.util.List r6 = r6.mo114591f()
            r0.label = r3
            java.lang.Object r6 = r7.mo111489d(r2, r4, r6, r0)
            if (r6 != r1) goto L_0x0055
            return r1
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponListUseCase.m172955invokegIAlus(com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponListUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
