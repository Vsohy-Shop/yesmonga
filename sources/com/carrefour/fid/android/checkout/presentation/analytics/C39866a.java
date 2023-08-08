package com.carrefour.fid.android.checkout.presentation.analytics;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28554j1;
import com.carrefour.fid.android.shared.constant.C28590s;
import com.carrefour.fid.android.shared.constant.C28613z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nServiceSlotAnalytics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceSlotAnalytics.kt\ncom/carrefour/fid/android/checkout/presentation/analytics/ServiceSlotAnalytics\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,223:1\n1855#2:224\n766#2:225\n857#2,2:226\n1856#2:228\n*S KotlinDebug\n*F\n+ 1 ServiceSlotAnalytics.kt\ncom/carrefour/fid/android/checkout/presentation/analytics/ServiceSlotAnalytics\n*L\n33#1:224\n34#1:225\n34#1:226,2\n33#1:228\n*E\n"})
/* renamed from: com.carrefour.fid.android.checkout.presentation.analytics.a */
public final class C39866a {

    /* renamed from: c */
    public static final int f101694c = 8;
    @C12579k

    /* renamed from: a */
    public C13783a f101695a;
    @C12579k

    /* renamed from: b */
    public final String f101696b = "omr";

    /* renamed from: com.carrefour.fid.android.checkout.presentation.analytics.a$a */
    public /* synthetic */ class C39867a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
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
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.analytics.C39866a.C39867a.<clinit>():void");
        }
    }

    @Inject
    public C39866a(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f101695a = aVar;
    }

    /* renamed from: a */
    public final List<Integer> mo131439a(Collection<? extends List<Slot>> collection) {
        ArrayList arrayList = new ArrayList();
        for (List it : collection) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : it) {
                if (Intrinsics.areEqual((Object) ((Slot) next).mo119514x(), (Object) Boolean.TRUE)) {
                    arrayList2.add(next);
                }
            }
            arrayList.add(Integer.valueOf(arrayList2.size()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final String mo131440b(BasketType basketType, StoreServiceType storeServiceType) {
        int i;
        if (basketType == null) {
            i = -1;
        } else {
            i = C39867a.$EnumSwitchMapping$0[basketType.ordinal()];
        }
        if (i == 1) {
            return "complement";
        }
        if (i != 2) {
            if (i != 3) {
                return new String();
            }
            return "lex";
        } else if (Intrinsics.areEqual((Object) storeServiceType, (Object) StoreServiceType.Drive.INSTANCE)) {
            return "picking-drive";
        } else {
            if (Intrinsics.areEqual((Object) storeServiceType, (Object) StoreServiceType.Clcv.INSTANCE)) {
                return "home-delivery";
            }
            if (Intrinsics.areEqual((Object) storeServiceType, (Object) StoreServiceType.H1h3.INSTANCE)) {
                return "lex";
            }
            return new String();
        }
    }

    /* renamed from: c */
    public final void mo131441c(@C12580l BasketType basketType, @C12580l StoreServiceType storeServiceType, @C12579k Collection<? extends List<Slot>> collection) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(collection, "slotsArray");
        List<Integer> a = mo131439a(collection);
        C13783a aVar = this.f101695a;
        Pair[] pairArr = new Pair[8];
        pairArr[0] = C11078d1.m42659a("panier_type", mo131440b(basketType, storeServiceType));
        pairArr[1] = C11078d1.m42659a("slotsAll", String.valueOf(CollectionsKt___CollectionsKt.m40714x5(a)));
        Integer num = (Integer) CollectionsKt___CollectionsKt.m40559R2(a, 0);
        String str6 = null;
        if (num != null) {
            str = num.toString();
        } else {
            str = null;
        }
        String str7 = "";
        if (str == null) {
            str = str7;
        }
        pairArr[2] = C11078d1.m42659a("slots_j0", str);
        Integer num2 = (Integer) CollectionsKt___CollectionsKt.m40559R2(a, 1);
        if (num2 != null) {
            str2 = num2.toString();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = str7;
        }
        pairArr[3] = C11078d1.m42659a("slots_j1", str2);
        Integer num3 = (Integer) CollectionsKt___CollectionsKt.m40559R2(a, 2);
        if (num3 != null) {
            str3 = num3.toString();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = str7;
        }
        pairArr[4] = C11078d1.m42659a("slots_j2", str3);
        Integer num4 = (Integer) CollectionsKt___CollectionsKt.m40559R2(a, 3);
        if (num4 != null) {
            str4 = num4.toString();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = str7;
        }
        pairArr[5] = C11078d1.m42659a("slots_j3", str4);
        Integer num5 = (Integer) CollectionsKt___CollectionsKt.m40559R2(a, 4);
        if (num5 != null) {
            str5 = num5.toString();
        } else {
            str5 = null;
        }
        if (str5 == null) {
            str5 = str7;
        }
        pairArr[6] = C11078d1.m42659a("slots_j4", str5);
        Integer num6 = (Integer) CollectionsKt___CollectionsKt.m40559R2(a, 5);
        if (num6 != null) {
            str6 = num6.toString();
        }
        if (str6 != null) {
            str7 = str6;
        }
        pairArr[7] = C11078d1.m42659a("slots_j5", str7);
        C13783a.m58667i(aVar, "checkout", "choix-slot", C10977s0.m41456W(pairArr), false, false, false, 56, (Object) null);
    }

    /* renamed from: d */
    public final void mo131442d(@C12579k Collection<? extends List<Slot>> collection) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(collection, "slotsArray");
        List<Integer> a = mo131439a(collection);
        C13783a aVar = this.f101695a;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = C11078d1.m42659a("slotsAll", String.valueOf(CollectionsKt___CollectionsKt.m40714x5(a)));
        Integer num = (Integer) CollectionsKt___CollectionsKt.m40559R2(a, 0);
        String str6 = null;
        if (num != null) {
            str = num.toString();
        } else {
            str = null;
        }
        String str7 = "";
        if (str == null) {
            str = str7;
        }
        pairArr[1] = C11078d1.m42659a("slots_j0", str);
        Integer num2 = (Integer) CollectionsKt___CollectionsKt.m40559R2(a, 1);
        if (num2 != null) {
            str2 = num2.toString();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = str7;
        }
        pairArr[2] = C11078d1.m42659a("slots_j1", str2);
        Integer num3 = (Integer) CollectionsKt___CollectionsKt.m40559R2(a, 2);
        if (num3 != null) {
            str3 = num3.toString();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = str7;
        }
        pairArr[3] = C11078d1.m42659a("slots_j2", str3);
        Integer num4 = (Integer) CollectionsKt___CollectionsKt.m40559R2(a, 3);
        if (num4 != null) {
            str4 = num4.toString();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = str7;
        }
        pairArr[4] = C11078d1.m42659a("slots_j3", str4);
        Integer num5 = (Integer) CollectionsKt___CollectionsKt.m40559R2(a, 4);
        if (num5 != null) {
            str5 = num5.toString();
        } else {
            str5 = null;
        }
        if (str5 == null) {
            str5 = str7;
        }
        pairArr[5] = C11078d1.m42659a("slots_j4", str5);
        Integer num6 = (Integer) CollectionsKt___CollectionsKt.m40559R2(a, 5);
        if (num6 != null) {
            str6 = num6.toString();
        }
        if (str6 != null) {
            str7 = str6;
        }
        pairArr[6] = C11078d1.m42659a("slots_j5", str7);
        C13783a.m58667i(aVar, "channel-switch", "choix-slot", C10977s0.m41456W(pairArr), false, false, false, 56, (Object) null);
    }

    /* renamed from: e */
    public final void mo131443e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "error");
        C13783a.m58668o(this.f101695a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "choix-slot"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, "erreurs-validation-slot"), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: f */
    public final void mo131444f(@C12579k Collection<? extends List<Slot>> collection) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(collection, "slotsArray");
        List<Integer> a = mo131439a(collection);
        C13783a aVar = this.f101695a;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = C11078d1.m42659a("slotsAll", String.valueOf(CollectionsKt___CollectionsKt.m40714x5(a)));
        Integer num = (Integer) CollectionsKt___CollectionsKt.m40559R2(a, 0);
        String str6 = null;
        if (num != null) {
            str = num.toString();
        } else {
            str = null;
        }
        String str7 = "";
        if (str == null) {
            str = str7;
        }
        pairArr[1] = C11078d1.m42659a("slots_j0", str);
        Integer num2 = (Integer) CollectionsKt___CollectionsKt.m40559R2(a, 1);
        if (num2 != null) {
            str2 = num2.toString();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = str7;
        }
        pairArr[2] = C11078d1.m42659a("slots_j1", str2);
        Integer num3 = (Integer) CollectionsKt___CollectionsKt.m40559R2(a, 2);
        if (num3 != null) {
            str3 = num3.toString();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = str7;
        }
        pairArr[3] = C11078d1.m42659a("slots_j2", str3);
        Integer num4 = (Integer) CollectionsKt___CollectionsKt.m40559R2(a, 3);
        if (num4 != null) {
            str4 = num4.toString();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = str7;
        }
        pairArr[4] = C11078d1.m42659a("slots_j3", str4);
        Integer num5 = (Integer) CollectionsKt___CollectionsKt.m40559R2(a, 4);
        if (num5 != null) {
            str5 = num5.toString();
        } else {
            str5 = null;
        }
        if (str5 == null) {
            str5 = str7;
        }
        pairArr[5] = C11078d1.m42659a("slots_j4", str5);
        Integer num6 = (Integer) CollectionsKt___CollectionsKt.m40559R2(a, 5);
        if (num6 != null) {
            str6 = num6.toString();
        }
        if (str6 != null) {
            str7 = str6;
        }
        pairArr[6] = C11078d1.m42659a("slots_j5", str7);
        C13783a.m58667i(aVar, "mon-compte", "choix-slot", C10977s0.m41456W(pairArr), false, false, false, 56, (Object) null);
    }

    /* renamed from: g */
    public final void mo131445g(@C12580l BasketType basketType, @C12580l StoreServiceType storeServiceType, boolean z) {
        String str;
        C13783a aVar = this.f101695a;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "choix-slot");
        if (z) {
            str = "channel-switch";
        } else {
            str = "checkout";
        }
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, str);
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, "checkout-progress");
        pairArr[5] = C11078d1.m42659a(C28526d.f68937k, C28590s.f69800A);
        pairArr[6] = C11078d1.m42659a("panier_type", mo131440b(basketType, storeServiceType));
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: h */
    public final void mo131446h(@C12580l BasketType basketType, @C12580l StoreServiceType storeServiceType, boolean z) {
        String str;
        C13783a aVar = this.f101695a;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "choix-slot");
        if (z) {
            str = "channel-switch";
        } else {
            str = "checkout";
        }
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, str);
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28613z.C28616c.f70103g);
        pairArr[5] = C11078d1.m42659a(C28526d.f68937k, C28590s.f69800A);
        pairArr[6] = C11078d1.m42659a("panier_type", mo131440b(basketType, storeServiceType));
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: i */
    public final void mo131447i(@C12580l BasketType basketType, @C12580l StoreServiceType storeServiceType, boolean z) {
        String str;
        C13783a aVar = this.f101695a;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "choix-slot");
        if (z) {
            str = "channel-switch";
        } else {
            str = "checkout";
        }
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, str);
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28613z.C28616c.f70104h);
        pairArr[5] = C11078d1.m42659a(C28526d.f68937k, C28590s.f69800A);
        pairArr[6] = C11078d1.m42659a("panier_type", mo131440b(basketType, storeServiceType));
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: j */
    public final void mo131448j() {
        C13783a.m58668o(this.f101695a, C10977s0.m41469j0(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "choix-slot"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68929i, this.f101696b), C11078d1.m42659a(C28526d.f68933j, "clic-trouver-un-creneau")), false, 2, (Object) null);
    }

    /* renamed from: k */
    public final void mo131449k() {
        C13783a.m58668o(this.f101695a, C10977s0.m41469j0(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "choix-slot"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68929i, this.f101696b), C11078d1.m42659a(C28526d.f68933j, "affichage-creneau")), false, 2, (Object) null);
    }

    /* renamed from: l */
    public final void mo131450l() {
        C13783a.m58668o(this.f101695a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "choix-slot"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28554j1.f69422A), C11078d1.m42659a(C28526d.f68937k, C28590s.f69800A)), false, 2, (Object) null);
    }

    /* renamed from: m */
    public final void mo131451m() {
        C13783a.m58668o(this.f101695a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "choix-slot"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28613z.C28616c.f70103g), C11078d1.m42659a(C28526d.f68937k, C28554j1.f69432K)), false, 2, (Object) null);
    }

    /* renamed from: n */
    public final void mo131452n() {
        C13783a.m58668o(this.f101695a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "choix-slot"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28613z.C28616c.f70104h), C11078d1.m42659a(C28526d.f68937k, C28554j1.f69432K)), false, 2, (Object) null);
    }
}
