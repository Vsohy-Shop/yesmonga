package com.carrefour.fid.android.domain.interactors.coupons;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.CouponsRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.service.C37820h;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.performance.C38328d;
import com.carrefour.fid.android.presentation.models.BrandSize;
import com.carrefour.fid.android.presentation.models.CouponCategory;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.models.CouponsContent;
import com.carrefour.fid.android.presentation.models.CouponsFilter;
import com.carrefour.fid.android.presentation.models.FilterSection;
import com.carrefour.fid.android.presentation.models.extension.C38465d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10975r0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nGetAvailableCouponsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetAvailableCouponsUseCase.kt\ncom/carrefour/fid/android/domain/interactors/coupons/GetAvailableCouponsUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,174:1\n1963#2,14:175\n1549#2:189\n1620#2,3:190\n1549#2:193\n1620#2,3:194\n1549#2:197\n1620#2,3:198\n1549#2:208\n1620#2,2:209\n1622#2:215\n1271#2,2:216\n1285#2,4:218\n1#3:201\n8676#4,2:202\n9358#4,4:204\n11335#4:211\n11670#4,3:212\n8676#4,2:222\n9358#4,4:224\n*S KotlinDebug\n*F\n+ 1 GetAvailableCouponsUseCase.kt\ncom/carrefour/fid/android/domain/interactors/coupons/GetAvailableCouponsUseCase\n*L\n72#1:175,14\n89#1:189\n89#1:190,3\n92#1:193\n92#1:194,3\n94#1:197\n94#1:198,3\n155#1:208\n155#1:209,2\n155#1:215\n158#1:216,2\n158#1:218,4\n150#1:202,2\n150#1:204,4\n156#1:211\n156#1:212,3\n163#1:222,2\n163#1:224,4\n*E\n"})
public final class GetAvailableCouponsUseCase implements C37679f<C37634a, C37643a> {
    @C12579k

    /* renamed from: a */
    public final C37878e f94428a;
    @C12579k

    /* renamed from: b */
    public final CouponsRepository f94429b;
    @C12579k

    /* renamed from: c */
    public final C37816e f94430c;
    @C12579k

    /* renamed from: d */
    public final C37820h f94431d;
    @C12579k

    /* renamed from: e */
    public final C38328d f94432e;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$a */
    public static final class C37634a {

        /* renamed from: b */
        public static final int f94433b = 0;

        /* renamed from: a */
        public final boolean f94434a;

        public C37634a(boolean z) {
            this.f94434a = z;
        }

        /* renamed from: c */
        public static /* synthetic */ C37634a m154272c(C37634a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f94434a;
            }
            return aVar.mo114545b(z);
        }

        /* renamed from: a */
        public final boolean mo114544a() {
            return this.f94434a;
        }

        @C12579k
        /* renamed from: b */
        public final C37634a mo114545b(boolean z) {
            return new C37634a(z);
        }

        /* renamed from: d */
        public final boolean mo114546d() {
            return this.f94434a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37634a) && this.f94434a == ((C37634a) obj).f94434a;
        }

        public int hashCode() {
            boolean z = this.f94434a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f94434a;
            return "Param(isOnlineOnly=" + z + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$b */
    public /* synthetic */ class C37635b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.carrefour.fid.android.domain.models.basket.BasketType[] r0 = com.carrefour.fid.android.domain.models.basket.BasketType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_ADDITIONAL_ORDER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_DRIVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_EXPRESS_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_MARKETPLACE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_HOME_DELIVERY_NAL     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.NONE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase.C37635b.<clinit>():void");
        }
    }

    @Inject
    public GetAvailableCouponsUseCase(@C12579k C37878e eVar, @C12579k CouponsRepository couponsRepository, @C12579k C37816e eVar2, @C12579k C37820h hVar, @C12579k C38328d dVar) {
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(couponsRepository, "couponsRepository");
        Intrinsics.checkNotNullParameter(eVar2, "getFacilityDetailsByAnabelKeyUseCase");
        Intrinsics.checkNotNullParameter(hVar, "getSelectedServiceUseCase");
        Intrinsics.checkNotNullParameter(dVar, "performance");
        this.f94428a = eVar;
        this.f94429b = couponsRepository;
        this.f94430c = eVar2;
        this.f94431d = hVar;
        this.f94432e = dVar;
    }

    /* renamed from: d */
    public final List<CouponsFilter> mo114540d(List<CouponModel> list) {
        String str;
        ArrayList arrayList = new ArrayList();
        FilterSection filterSection = FilterSection.COUPONS;
        CouponsContent[] values = CouponsContent.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(values.length), 16));
        for (CouponsContent couponsContent : values) {
            Pair a = C11078d1.m42659a(couponsContent.mo121443q(), couponsContent.mo121443q());
            linkedHashMap.put(a.mo21849e(), a.mo21851f());
        }
        arrayList.add(new CouponsFilter(filterSection, linkedHashMap, CollectionsKt__CollectionsKt.m40441E()));
        FilterSection filterSection2 = FilterSection.DEPARTMENT;
        Iterable<CouponModel> a2 = C38465d.m159622a(list);
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(a2, 10));
        for (CouponModel couponModel : a2) {
            CouponCategory[] values2 = CouponCategory.values();
            ArrayList arrayList3 = new ArrayList(values2.length);
            for (CouponCategory q : values2) {
                arrayList3.add(q.mo121356q());
            }
            if (arrayList3.contains(couponModel.mo121386B())) {
                str = couponModel.mo121386B();
            } else {
                str = CouponCategory.OTHERS.mo121356q();
            }
            arrayList2.add(str);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(C10978t.m41495Y(arrayList2, 10)), 16));
        for (Object next : arrayList2) {
            linkedHashMap2.put(next, (String) next);
        }
        arrayList.add(new CouponsFilter(filterSection2, linkedHashMap2, CollectionsKt__CollectionsKt.m40441E()));
        FilterSection filterSection3 = FilterSection.BRAND_SIZE;
        BrandSize[] values3 = BrandSize.values();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(values3.length), 16));
        for (BrandSize brandSize : values3) {
            Pair a3 = C11078d1.m42659a(brandSize.mo121337q(), brandSize.mo121337q());
            linkedHashMap3.put(a3.mo21849e(), a3.mo21851f());
        }
        arrayList.add(new CouponsFilter(filterSection3, linkedHashMap3, CollectionsKt__CollectionsKt.m40441E()));
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114541e(boolean r5, kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$getDisplayedCoupons$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$getDisplayedCoupons$1 r0 = (com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$getDisplayedCoupons$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$getDisplayedCoupons$1 r0 = new com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$getDisplayedCoupons$1
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
            goto L_0x004a
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            if (r5 == 0) goto L_0x003f
            com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons r5 = com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons.ONLINE
            goto L_0x0083
        L_0x003f:
            com.carrefour.fid.android.domain.interactors.service.h r5 = r4.f94431d
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x004a
            return r1
        L_0x004a:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r5)
            if (r6 != 0) goto L_0x0084
            kotlin.Pair r5 = (kotlin.Pair) r5
            java.lang.Object r6 = r5.mo21851f()
            if (r6 != 0) goto L_0x005b
            com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons r5 = com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons.IN_STORE
            return r5
        L_0x005b:
            java.lang.Object r5 = r5.mo21849e()
            com.carrefour.fid.android.domain.models.basket.BasketType r5 = (com.carrefour.fid.android.domain.models.basket.BasketType) r5
            int[] r6 = com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase.C37635b.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r6[r5]
            switch(r5) {
                case 1: goto L_0x0081;
                case 2: goto L_0x007e;
                case 3: goto L_0x007b;
                case 4: goto L_0x0078;
                case 5: goto L_0x0075;
                case 6: goto L_0x0072;
                default: goto L_0x006c;
            }
        L_0x006c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x0072:
            com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons r5 = com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons.IN_STORE
            goto L_0x0083
        L_0x0075:
            com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons r5 = com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons.BOTH
            goto L_0x0083
        L_0x0078:
            com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons r5 = com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons.IN_STORE
            goto L_0x0083
        L_0x007b:
            com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons r5 = com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons.IN_STORE
            goto L_0x0083
        L_0x007e:
            com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons r5 = com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons.BOTH
            goto L_0x0083
        L_0x0081:
            com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons r5 = com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons.IN_STORE
        L_0x0083:
            return r5
        L_0x0084:
            com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons r5 = com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons.NONE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase.mo114541e(boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0217  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172951invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase.C37634a r18, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.interactors.coupons.C37643a>> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$invoke$1 r2 = (com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$invoke$1 r2 = new com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x0079
            if (r4 == r8) goto L_0x0067
            if (r4 == r7) goto L_0x005a
            if (r4 == r6) goto L_0x0047
            if (r4 != r5) goto L_0x003f
            java.lang.Object r3 = r2.L$1
            com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons r3 = (com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons) r3
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase r2 = (com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase) r2
            kotlin.C11661u0.m45747n(r1)
            goto L_0x014f
        L_0x003f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0047:
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons r4 = (com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons) r4
            java.lang.Object r6 = r2.L$0
            com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase r6 = (com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase) r6
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0138
        L_0x005a:
            java.lang.Object r4 = r2.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r2.L$0
            com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase r7 = (com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase) r7
            kotlin.C11661u0.m45747n(r1)
            goto L_0x010b
        L_0x0067:
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$a r4 = (com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase.C37634a) r4
            java.lang.Object r8 = r2.L$0
            com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase r8 = (com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase) r8
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0098
        L_0x0079:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.performance.d r1 = r0.f94432e
            java.lang.String r4 = "get_coupons"
            r1.mo121195d(r4)
            com.carrefour.fid.android.domain.interactors.user.e r1 = r0.f94428a
            com.carrefour.fid.android.domain.interactors.user.e$a r4 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r2.L$0 = r0
            r9 = r18
            r2.L$1 = r9
            r2.label = r8
            java.lang.Object r1 = r1.m172966invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x0096
            return r3
        L_0x0096:
            r8 = r0
            r4 = r9
        L_0x0098:
            boolean r9 = kotlin.Result.m38709i(r1)
            r10 = 0
            if (r9 == 0) goto L_0x00a0
            r1 = r10
        L_0x00a0:
            com.carrefour.fid.android.domain.models.account.AccountInfo r1 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r1
            if (r1 == 0) goto L_0x0235
            java.util.List r1 = r1.mo116669w()
            if (r1 == 0) goto L_0x0235
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            boolean r9 = r1.hasNext()
            if (r9 != 0) goto L_0x00b7
            goto L_0x00e8
        L_0x00b7:
            java.lang.Object r10 = r1.next()
            boolean r9 = r1.hasNext()
            if (r9 != 0) goto L_0x00c2
            goto L_0x00e8
        L_0x00c2:
            r9 = r10
            com.carrefour.fid.android.domain.models.account.UserCards r9 = (com.carrefour.fid.android.domain.models.account.UserCards) r9
            java.lang.String r9 = r9.mo116761i()
            long r11 = com.carrefour.fid.android.shared.extension.StringKt.m118928h(r9)
        L_0x00cd:
            java.lang.Object r9 = r1.next()
            r13 = r9
            com.carrefour.fid.android.domain.models.account.UserCards r13 = (com.carrefour.fid.android.domain.models.account.UserCards) r13
            java.lang.String r13 = r13.mo116761i()
            long r13 = com.carrefour.fid.android.shared.extension.StringKt.m118928h(r13)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x00e2
            r10 = r9
            r11 = r13
        L_0x00e2:
            boolean r9 = r1.hasNext()
            if (r9 != 0) goto L_0x00cd
        L_0x00e8:
            com.carrefour.fid.android.domain.models.account.UserCards r10 = (com.carrefour.fid.android.domain.models.account.UserCards) r10
            if (r10 == 0) goto L_0x0235
            java.lang.String r1 = r10.mo116763k()
            if (r1 != 0) goto L_0x00f4
            goto L_0x0235
        L_0x00f4:
            boolean r4 = r4.mo114546d()
            r2.L$0 = r8
            r2.L$1 = r1
            r2.label = r7
            java.lang.Object r4 = r8.mo114541e(r4, r2)
            if (r4 != r3) goto L_0x0105
            return r3
        L_0x0105:
            r7 = r8
            r16 = r4
            r4 = r1
            r1 = r16
        L_0x010b:
            com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons r1 = (com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons) r1
            com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons r8 = com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons.NONE
            if (r1 != r8) goto L_0x0123
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "No store found"
            r1.<init>(r2)
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x0123:
            com.carrefour.fid.android.data.repositories.CouponsRepository r8 = r7.f94429b
            r2.L$0 = r7
            r2.L$1 = r1
            r2.label = r6
            java.lang.Object r4 = r8.mo111488c(r4, r2)
            if (r4 != r3) goto L_0x0132
            return r3
        L_0x0132:
            r6 = r7
            r16 = r4
            r4 = r1
            r1 = r16
        L_0x0138:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r1)
            if (r7 != 0) goto L_0x0217
            com.carrefour.fid.android.domain.models.c r1 = (com.carrefour.fid.android.domain.models.C37974c) r1
            r2.L$0 = r6
            r2.L$1 = r4
            r2.label = r5
            java.lang.Object r1 = r6.mo114543g(r1, r2)
            if (r1 != r3) goto L_0x014d
            return r3
        L_0x014d:
            r3 = r4
            r2 = r6
        L_0x014f:
            com.carrefour.fid.android.domain.models.c r1 = (com.carrefour.fid.android.domain.models.C37974c) r1
            com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons r4 = com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons.IN_STORE
            r5 = 10
            if (r3 == r4) goto L_0x015b
            com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons r4 = com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons.BOTH
            if (r3 != r4) goto L_0x0186
        L_0x015b:
            java.util.List r4 = r1.mo117040g()
            if (r4 == 0) goto L_0x0186
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C10978t.m41495Y(r4, r5)
            r6.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x0170:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0184
            java.lang.Object r7 = r4.next()
            com.carrefour.fid.android.domain.models.d r7 = (com.carrefour.fid.android.domain.models.C38015d) r7
            com.carrefour.fid.android.presentation.models.CouponModel r7 = com.carrefour.fid.android.presentation.models.extension.C38465d.m159623b(r7)
            r6.add(r7)
            goto L_0x0170
        L_0x0184:
            r4 = r6
            goto L_0x018a
        L_0x0186:
            java.util.List r4 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x018a:
            com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons r6 = com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons.ONLINE
            if (r3 == r6) goto L_0x0192
            com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons r6 = com.carrefour.fid.android.domain.interactors.coupons.DisplayCoupons.BOTH
            if (r3 != r6) goto L_0x01bd
        L_0x0192:
            java.util.List r3 = r1.mo117041h()
            if (r3 == 0) goto L_0x01bd
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C10978t.m41495Y(r3, r5)
            r6.<init>(r7)
            java.util.Iterator r3 = r3.iterator()
        L_0x01a7:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x01bb
            java.lang.Object r7 = r3.next()
            com.carrefour.fid.android.domain.models.d r7 = (com.carrefour.fid.android.domain.models.C38015d) r7
            com.carrefour.fid.android.presentation.models.CouponModel r7 = com.carrefour.fid.android.presentation.models.extension.C38465d.m159623b(r7)
            r6.add(r7)
            goto L_0x01a7
        L_0x01bb:
            r3 = r6
            goto L_0x01c1
        L_0x01bd:
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x01c1:
            java.util.List r1 = r1.mo117039f()
            if (r1 == 0) goto L_0x01ea
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r6 = new java.util.ArrayList
            int r5 = kotlin.collections.C10978t.m41495Y(r1, r5)
            r6.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x01d6:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x01ee
            java.lang.Object r5 = r1.next()
            com.carrefour.fid.android.domain.models.d r5 = (com.carrefour.fid.android.domain.models.C38015d) r5
            com.carrefour.fid.android.presentation.models.CouponModel r5 = com.carrefour.fid.android.presentation.models.extension.C38465d.m159623b(r5)
            r6.add(r5)
            goto L_0x01d6
        L_0x01ea:
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x01ee:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.interactors.coupons.a r1 = new com.carrefour.fid.android.domain.interactors.coupons.a
            java.util.List r5 = com.carrefour.fid.android.presentation.models.extension.C38465d.m159622a(r3)
            java.util.List r7 = com.carrefour.fid.android.presentation.models.extension.C38465d.m159622a(r4)
            java.util.List r6 = com.carrefour.fid.android.presentation.models.extension.C38465d.m159622a(r6)
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r3 = kotlin.collections.CollectionsKt___CollectionsKt.m40718y4(r3, r4)
            java.util.List r3 = r2.mo114540d(r3)
            r1.<init>(r5, r7, r6, r3)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            com.carrefour.fid.android.performance.d r2 = r2.f94432e
            r2.mo121196e()
            return r1
        L_0x0217:
            com.carrefour.fid.android.performance.d r1 = r6.f94432e
            r1.mo121196e()
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.CouponsThrowable r1 = new com.carrefour.fid.android.core.io.CouponsThrowable
            r2 = 0
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r2)
            java.lang.String r3 = r7.getMessage()
            r1.<init>(r2, r3)
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x0235:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.NoFidCardException r1 = com.carrefour.fid.android.shared.p046io.NoFidCardException.f70499a
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase.m172951invokegIAlus(com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114543g(com.carrefour.fid.android.domain.models.C37974c r9, kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.models.C37974c> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$updateWithFacilityDetails$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$updateWithFacilityDetails$1 r0 = (com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$updateWithFacilityDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$updateWithFacilityDetails$1 r0 = new com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$updateWithFacilityDetails$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.domain.models.c r9 = (com.carrefour.fid.android.domain.models.C37974c) r9
            kotlin.C11661u0.m45747n(r10)
        L_0x002c:
            r2 = r9
            goto L_0x0065
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            kotlin.C11661u0.m45747n(r10)
            java.util.List r10 = r9.mo117040g()
            java.util.Collection r10 = (java.util.Collection) r10
            if (r10 == 0) goto L_0x004a
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r10 = 0
            goto L_0x004b
        L_0x004a:
            r10 = r3
        L_0x004b:
            if (r10 == 0) goto L_0x004e
            return r9
        L_0x004e:
            java.util.List r10 = r9.mo117040g()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$updateWithFacilityDetails$stores$1 r2 = new com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$updateWithFacilityDetails$stores$1
            r4 = 0
            r2.<init>(r8, r4)
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r10 = com.carrefour.fid.android.shared.util.ParallelMapKt.m119521a(r10, r2, r0)
            if (r10 != r1) goto L_0x002c
            return r1
        L_0x0065:
            r4 = r10
            java.util.List r4 = (java.util.List) r4
            r3 = 0
            r5 = 0
            r6 = 5
            r7 = 0
            com.carrefour.fid.android.domain.models.c r9 = com.carrefour.fid.android.domain.models.C37974c.m156175e(r2, r3, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase.mo114543g(com.carrefour.fid.android.domain.models.c, kotlin.coroutines.c):java.lang.Object");
    }
}
