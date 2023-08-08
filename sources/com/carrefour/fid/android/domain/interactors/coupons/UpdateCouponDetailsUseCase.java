package com.carrefour.fid.android.domain.interactors.coupons;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.coupons.CouponAction;
import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import com.carrefour.fid.android.data.repositories.CouponsRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nUpdateCouponDetailsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateCouponDetailsUseCase.kt\ncom/carrefour/fid/android/domain/interactors/coupons/UpdateCouponDetailsUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class UpdateCouponDetailsUseCase implements C37679f<C37638a, CouponStatus> {

    /* renamed from: c */
    public static final int f94445c = 8;
    @C12579k

    /* renamed from: a */
    public final CouponsRepository f94446a;
    @C12579k

    /* renamed from: b */
    public final C37878e f94447b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase$a */
    public static final class C37638a {

        /* renamed from: e */
        public static final int f94448e = 0;
        @C12579k

        /* renamed from: a */
        public final String f94449a;

        /* renamed from: b */
        public final long f94450b;
        @C12579k

        /* renamed from: c */
        public final String f94451c;

        /* renamed from: d */
        public final int f94452d;

        public C37638a(@C12579k String str, long j, @C12579k String str2, int i) {
            Intrinsics.checkNotNullParameter(str, "status");
            Intrinsics.checkNotNullParameter(str2, "validityStartDate");
            this.f94449a = str;
            this.f94450b = j;
            this.f94451c = str2;
            this.f94452d = i;
        }

        /* renamed from: f */
        public static /* synthetic */ C37638a m154295f(C37638a aVar, String str, long j, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = aVar.f94449a;
            }
            if ((i2 & 2) != 0) {
                j = aVar.f94450b;
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                str2 = aVar.f94451c;
            }
            String str3 = str2;
            if ((i2 & 8) != 0) {
                i = aVar.f94452d;
            }
            return aVar.mo114576e(str, j2, str3, i);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114572a() {
            return this.f94449a;
        }

        /* renamed from: b */
        public final long mo114573b() {
            return this.f94450b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo114574c() {
            return this.f94451c;
        }

        /* renamed from: d */
        public final int mo114575d() {
            return this.f94452d;
        }

        @C12579k
        /* renamed from: e */
        public final C37638a mo114576e(@C12579k String str, long j, @C12579k String str2, int i) {
            Intrinsics.checkNotNullParameter(str, "status");
            Intrinsics.checkNotNullParameter(str2, "validityStartDate");
            return new C37638a(str, j, str2, i);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37638a)) {
                return false;
            }
            C37638a aVar = (C37638a) obj;
            return Intrinsics.areEqual((Object) this.f94449a, (Object) aVar.f94449a) && this.f94450b == aVar.f94450b && Intrinsics.areEqual((Object) this.f94451c, (Object) aVar.f94451c) && this.f94452d == aVar.f94452d;
        }

        /* renamed from: g */
        public final long mo114578g() {
            return this.f94450b;
        }

        /* renamed from: h */
        public final int mo114579h() {
            return this.f94452d;
        }

        public int hashCode() {
            return (((((this.f94449a.hashCode() * 31) + Long.hashCode(this.f94450b)) * 31) + this.f94451c.hashCode()) * 31) + Integer.hashCode(this.f94452d);
        }

        @C12579k
        /* renamed from: i */
        public final String mo114581i() {
            return this.f94449a;
        }

        @C12579k
        /* renamed from: j */
        public final String mo114582j() {
            return this.f94451c;
        }

        @C12579k
        public String toString() {
            String str = this.f94449a;
            long j = this.f94450b;
            String str2 = this.f94451c;
            int i = this.f94452d;
            return "Param(status=" + str + ", ean=" + j + ", validityStartDate=" + str2 + ", numberSelectedCoupon=" + i + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase$b */
    public /* synthetic */ class C37639b {
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
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase.C37639b.<clinit>():void");
        }
    }

    @Inject
    public UpdateCouponDetailsUseCase(@C12579k CouponsRepository couponsRepository, @C12579k C37878e eVar) {
        Intrinsics.checkNotNullParameter(couponsRepository, "repository");
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        this.f94446a = couponsRepository;
        this.f94447b = eVar;
    }

    /* renamed from: a */
    public final boolean mo114569a(String str) {
        if (!(!C11622t.isBlank(str))) {
            return true;
        }
        Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(str);
        Date time = Calendar.getInstance().getTime();
        if (time.after(parse) || time.equals(parse)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final CouponAction mo114570b(CouponStatus couponStatus) {
        int i = C37639b.$EnumSwitchMapping$0[couponStatus.ordinal()];
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

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00b5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172954invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase.C37638a r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends com.carrefour.fid.android.data.entities.coupons.CouponStatus>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase$invoke$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x004f
            if (r2 == r5) goto L_0x003d
            if (r2 != r4) goto L_0x0035
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r13 = r14.mo21858l()
            goto L_0x00e9
        L_0x0035:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003d:
            java.lang.Object r13 = r0.L$1
            com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase$a r13 = (com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase.C37638a) r13
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase r2 = (com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase) r2
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x0082
        L_0x004f:
            kotlin.C11661u0.m45747n(r14)
            java.lang.String r14 = r13.mo114582j()
            boolean r14 = r12.mo114569a(r14)
            if (r14 != 0) goto L_0x0070
            kotlin.Result$a r14 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.CouponErrors$CouponsActivationStartsOn r14 = new com.carrefour.fid.android.shared.io.CouponErrors$CouponsActivationStartsOn
            java.lang.String r13 = r13.mo114582j()
            r14.<init>(r13)
            java.lang.Object r13 = kotlin.C11661u0.m45734a(r14)
            java.lang.Object r13 = kotlin.Result.m38702b(r13)
            return r13
        L_0x0070:
            com.carrefour.fid.android.domain.interactors.user.e r14 = r12.f94447b
            com.carrefour.fid.android.domain.interactors.user.e$a r2 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.L$0 = r12
            r0.L$1 = r13
            r0.label = r5
            java.lang.Object r14 = r14.m172966invokegIAlus(r2, r0)
            if (r14 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r2 = r12
        L_0x0082:
            boolean r5 = kotlin.Result.m38709i(r14)
            if (r5 == 0) goto L_0x0089
            r14 = r6
        L_0x0089:
            com.carrefour.fid.android.domain.models.account.AccountInfo r14 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r14
            if (r14 == 0) goto L_0x0098
            com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils r5 = com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils.INSTANCE
            java.util.List r14 = r14.mo116669w()
            com.carrefour.fid.android.domain.models.account.UserCards r14 = r5.getMostRecentAndSecuredLoyaltyCard(r14)
            goto L_0x0099
        L_0x0098:
            r14 = r6
        L_0x0099:
            com.carrefour.fid.android.data.entities.coupons.CouponStatus[] r5 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.values()
            int r7 = r5.length
            r8 = r3
        L_0x009f:
            if (r8 >= r7) goto L_0x00b5
            r9 = r5[r8]
            java.lang.String r10 = r9.getType()
            java.lang.String r11 = r13.mo114581i()
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r10 == 0) goto L_0x00b2
            goto L_0x00b6
        L_0x00b2:
            int r8 = r8 + 1
            goto L_0x009f
        L_0x00b5:
            r9 = r6
        L_0x00b6:
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r5 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.LOADEDTOCARD
            if (r9 == r5) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r5 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.EMITTED
        L_0x00bd:
            if (r14 == 0) goto L_0x00c5
            java.lang.String r14 = r14.mo116763k()
            if (r14 != 0) goto L_0x00ca
        L_0x00c5:
            java.lang.String r14 = new java.lang.String
            r14.<init>()
        L_0x00ca:
            com.carrefour.fid.android.data.repositories.CouponsRepository r7 = r2.f94446a
            com.carrefour.fid.android.data.entities.coupons.CouponAction r2 = r2.mo114570b(r5)
            long r8 = r13.mo114578g()
            java.lang.String r13 = java.lang.String.valueOf(r8)
            java.util.List r13 = kotlin.collections.C10976s.m41419k(r13)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r13 = r7.mo111489d(r14, r2, r13, r0)
            if (r13 != r1) goto L_0x00e9
            return r1
        L_0x00e9:
            boolean r14 = kotlin.Result.m38709i(r13)
            if (r14 == 0) goto L_0x0105
            kotlin.Result$a r14 = kotlin.Result.f28060a
            java.lang.Throwable r13 = kotlin.Result.m38705e(r13)
            if (r13 != 0) goto L_0x00fc
            java.lang.Throwable r13 = new java.lang.Throwable
            r13.<init>()
        L_0x00fc:
            java.lang.Object r13 = kotlin.C11661u0.m45734a(r13)
            java.lang.Object r13 = kotlin.Result.m38702b(r13)
            return r13
        L_0x0105:
            com.carrefour.fid.android.data.entities.coupons.CouponStatus[] r14 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.values()
            int r0 = r14.length
        L_0x010a:
            if (r3 >= r0) goto L_0x0138
            r1 = r14[r3]
            java.lang.String r2 = r1.getType()
            boolean r4 = kotlin.Result.m38709i(r13)
            if (r4 == 0) goto L_0x011a
            r4 = r6
            goto L_0x011b
        L_0x011a:
            r4 = r13
        L_0x011b:
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x012c
            java.lang.Object r4 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r4)
            com.carrefour.fid.android.data.entities.f r4 = (com.carrefour.fid.android.data.entities.C36454f) r4
            if (r4 == 0) goto L_0x012c
            java.lang.String r4 = r4.mo111077k()
            goto L_0x012d
        L_0x012c:
            r4 = r6
        L_0x012d:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            if (r2 == 0) goto L_0x0135
            r6 = r1
            goto L_0x0138
        L_0x0135:
            int r3 = r3 + 1
            goto L_0x010a
        L_0x0138:
            if (r6 != 0) goto L_0x014a
            kotlin.Result$a r13 = kotlin.Result.f28060a
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>()
            java.lang.Object r13 = kotlin.C11661u0.m45734a(r13)
            java.lang.Object r13 = kotlin.Result.m38702b(r13)
            return r13
        L_0x014a:
            kotlin.Result$a r13 = kotlin.Result.f28060a
            java.lang.Object r13 = kotlin.Result.m38702b(r6)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase.m172954invokegIAlus(com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
