package com.carrefour.fid.android.presentation.models.extension;

import android.annotation.SuppressLint;
import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import com.carrefour.fid.android.data.entities.coupons.CouponType;
import com.carrefour.fid.android.domain.models.C38015d;
import com.carrefour.fid.android.domain.models.C38029f;
import com.carrefour.fid.android.domain.models.C38041k;
import com.carrefour.fid.android.domain.models.DiscountType;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.models.Facility;
import com.carrefour.fid.android.presentation.models.Image;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCouponModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponModel.kt\ncom/carrefour/fid/android/presentation/models/extension/CouponModelKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1282#2,2:75\n1#3:77\n*S KotlinDebug\n*F\n+ 1 CouponModel.kt\ncom/carrefour/fid/android/presentation/models/extension/CouponModelKt\n*L\n32#1:75,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.models.extension.d */
public final class C38465d {

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CouponModel.kt\ncom/carrefour/fid/android/presentation/models/extension/CouponModelKt\n*L\n1#1,328:1\n69#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.models.extension.d$a */
    public static final class C38466a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(Long.valueOf(((CouponModel) t).mo121398N()), Long.valueOf(((CouponModel) t2).mo121398N()));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 CouponModel.kt\ncom/carrefour/fid/android/presentation/models/extension/CouponModelKt\n*L\n1#1,328:1\n70#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.models.extension.d$b */
    public static final class C38467b<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Comparator f97595a;

        public C38467b(Comparator comparator) {
            this.f97595a = comparator;
        }

        public final int compare(T t, T t2) {
            int compare = this.f97595a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            return C11006g.m42424l(((CouponModel) t).mo121406V(), ((CouponModel) t2).mo121406V());
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n+ 2 CouponModel.kt\ncom/carrefour/fid/android/presentation/models/extension/CouponModelKt\n*L\n1#1,328:1\n71#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.models.extension.d$c */
    public static final class C38468c<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Comparator f97596a;

        public C38468c(Comparator comparator) {
            this.f97596a = comparator;
        }

        public final int compare(T t, T t2) {
            int compare = this.f97596a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            return C11006g.m42424l(((CouponModel) t2).mo121438z(), ((CouponModel) t).mo121438z());
        }
    }

    @C12579k
    /* renamed from: a */
    public static final List<CouponModel> m159622a(@C12579k List<CouponModel> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt___CollectionsKt.m40675p5(list, new C38468c(new C38467b(new C38466a())));
    }

    @C12579k
    /* renamed from: b */
    public static final CouponModel m159623b(@C12579k C38015d dVar) {
        Image image;
        CouponType couponType;
        CouponType couponType2;
        Facility facility;
        Double d;
        CouponModel.State state;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String F = dVar.mo117580F();
        String C = dVar.mo117577C();
        String V = dVar.mo117596V();
        String U = dVar.mo117595U();
        long M = dVar.mo117587M();
        String D = dVar.mo117578D();
        List<String> S = dVar.mo117593S();
        String R = dVar.mo117592R();
        long I = dVar.mo117583I();
        Double A = dVar.mo117575A();
        DiscountType H = dVar.mo117582H();
        String O = dVar.mo117589O();
        CouponStatus Q = dVar.mo117591Q();
        C38029f L = dVar.mo117586L();
        if (L != null) {
            image = m159624c(L);
        } else {
            image = null;
        }
        String G = dVar.mo117581G();
        CouponType[] values = CouponType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                couponType = null;
                break;
            }
            couponType = values[i];
            int i2 = length;
            CouponType[] couponTypeArr = values;
            if (Intrinsics.areEqual((Object) couponType.getType(), (Object) dVar.mo117579E())) {
                break;
            }
            i++;
            length = i2;
            values = couponTypeArr;
        }
        if (couponType == null) {
            couponType2 = CouponType.UNKNOWN;
        } else {
            couponType2 = couponType;
        }
        List<String> z = dVar.mo117624z();
        String P = dVar.mo117590P();
        C38041k K = dVar.mo117585K();
        if (K != null) {
            d = A;
            facility = new Facility(K.mo117785f(), K.mo117783e());
        } else {
            d = A;
            facility = null;
        }
        String N = dVar.mo117588N();
        if (CouponStatus.Companion.mo110931c().contains(dVar.mo117591Q())) {
            state = CouponModel.State.ACTIVATED;
        } else {
            state = CouponModel.State.NEUTRAL;
        }
        return new CouponModel(I, F, G, C, couponType2, V, U, M, D, S, R, d, H, O, Q, image, z, P, facility, N, state, dVar.mo117584J());
    }

    @C12579k
    /* renamed from: c */
    public static final Image m159624c(@C12579k C38029f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new Image(fVar.mo117690c(), fVar.mo117688a(), fVar.mo117689b());
    }

    @SuppressLint({"SimpleDateFormat"})
    /* renamed from: d */
    public static final boolean m159625d(@C12579k CouponModel couponModel) {
        Intrinsics.checkNotNullParameter(couponModel, "<this>");
        if (!(!C11622t.isBlank(couponModel.mo121406V()))) {
            return true;
        }
        return Calendar.getInstance().getTime().after(new SimpleDateFormat("yyyy-MM-dd").parse(couponModel.mo121406V()));
    }

    /* renamed from: e */
    public static final boolean m159626e(@C12579k CouponModel couponModel) {
        Intrinsics.checkNotNullParameter(couponModel, "<this>");
        return !m159625d(couponModel);
    }

    @SuppressLint({"SimpleDateFormat"})
    /* renamed from: f */
    public static final boolean m159627f(@C12579k CouponModel couponModel) {
        Intrinsics.checkNotNullParameter(couponModel, "<this>");
        if (!(!C11622t.isBlank(couponModel.mo121407W()))) {
            return true;
        }
        Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(couponModel.mo121407W());
        Date time = Calendar.getInstance().getTime();
        if (time.after(parse) || time.equals(parse)) {
            return true;
        }
        return false;
    }
}
