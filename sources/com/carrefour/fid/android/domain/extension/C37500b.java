package com.carrefour.fid.android.domain.extension;

import com.carrefour.fid.android.data.entities.coupons.BookBurnData;
import com.carrefour.fid.android.data.entities.coupons.CouponEntity;
import com.carrefour.fid.android.data.entities.coupons.CouponImageEntity;
import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import com.carrefour.fid.android.data.entities.coupons.EmissionInfoEntity;
import com.carrefour.fid.android.domain.models.C38015d;
import com.carrefour.fid.android.domain.models.C38029f;
import com.carrefour.fid.android.domain.models.C38041k;
import com.carrefour.fid.android.domain.models.DiscountType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCouponsDomain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsDomain.kt\ncom/carrefour/fid/android/domain/extension/CouponsDomainKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1#2:55\n766#3:56\n857#3,2:57\n1549#3:59\n1620#3,3:60\n*S KotlinDebug\n*F\n+ 1 CouponsDomain.kt\ncom/carrefour/fid/android/domain/extension/CouponsDomainKt\n*L\n52#1:56\n52#1:57,2\n52#1:59\n52#1:60,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.extension.b */
public final class C37500b {
    @C12579k
    /* renamed from: a */
    public static final List<String> m153937a(@C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(list, "stores");
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (!C11622t.isBlank((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
        for (String padStart : arrayList) {
            arrayList2.add(StringsKt__StringsKt.padStart(padStart, 4, '0'));
        }
        return arrayList2;
    }

    @C12579k
    /* renamed from: b */
    public static final DiscountType m153938b(@C12579k CouponEntity couponEntity) {
        Intrinsics.checkNotNullParameter(couponEntity, FirebaseAnalytics.C32532b.f78957j);
        if (couponEntity.mo110876E() != null) {
            return DiscountType.AMOUNT;
        }
        if (couponEntity.mo110877F() != null) {
            return DiscountType.PERCENT;
        }
        return DiscountType.UNKNOWN;
    }

    @C12579k
    /* renamed from: c */
    public static final C38015d m153939c(@C12579k CouponEntity couponEntity) {
        String str;
        CouponStatus couponStatus;
        C38029f fVar;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(couponEntity, "<this>");
        String C = couponEntity.mo110874C();
        String z = couponEntity.mo110917z();
        Double E = couponEntity.mo110876E();
        if (E == null) {
            E = couponEntity.mo110877F();
        }
        Double d = E;
        DiscountType b = m153938b(couponEntity);
        String R = couponEntity.mo110889R();
        String Q = couponEntity.mo110888Q();
        long J = couponEntity.mo110881J();
        String A = couponEntity.mo110872A();
        List<String> a = m153937a(couponEntity.mo110887P());
        String O = couponEntity.mo110886O();
        long G = couponEntity.mo110878G();
        EmissionInfoEntity H = couponEntity.mo110879H();
        if (H != null) {
            str = H.mo110946k();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        String str4 = str;
        String L = couponEntity.mo110883L();
        CouponStatus[] values = CouponStatus.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                couponStatus = null;
                break;
            }
            couponStatus = values[i];
            CouponStatus[] couponStatusArr = values;
            int i2 = length;
            if (Intrinsics.areEqual((Object) couponStatus.getType(), (Object) couponEntity.mo110885N())) {
                break;
            }
            i++;
            values = couponStatusArr;
            length = i2;
        }
        if (couponStatus != null) {
            CouponImageEntity I = couponEntity.mo110880I();
            if (I != null) {
                fVar = m153940d(I);
            } else {
                fVar = null;
            }
            String D = couponEntity.mo110875D();
            String B = couponEntity.mo110873B();
            List<String> x = couponEntity.mo110915x();
            String M = couponEntity.mo110884M();
            String K = couponEntity.mo110882K();
            EmissionInfoEntity H2 = couponEntity.mo110879H();
            if (H2 == null || (str2 = H2.mo110945j()) == null) {
                str2 = new String();
            }
            String str5 = str2;
            BookBurnData y = couponEntity.mo110916y();
            if (y != null) {
                str3 = y.mo110865g();
            } else {
                str3 = null;
            }
            return new C38015d(G, C, D, z, d, b, R, Q, J, str4, A, a, O, L, couponStatus, fVar, B, x, M, (C38041k) null, K, str3, str5, 524288, (DefaultConstructorMarker) null);
        }
        throw new IllegalStateException();
    }

    @C12579k
    /* renamed from: d */
    public static final C38029f m153940d(@C12579k CouponImageEntity couponImageEntity) {
        Intrinsics.checkNotNullParameter(couponImageEntity, "<this>");
        return new C38029f(couponImageEntity.mo110923f(), couponImageEntity.mo110925h(), couponImageEntity.mo110924g());
    }
}
