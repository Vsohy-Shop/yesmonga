package com.carrefour.fid.android.analytics.data.analytics.firebasemodels;

import com.carrefour.fid.android.shared.constant.C28526d;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nValidateBasketFirebaseModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValidateBasketFirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/ValidateBasketFirebaseModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,26:1\n1549#2:27\n1620#2,3:28\n*S KotlinDebug\n*F\n+ 1 ValidateBasketFirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/ValidateBasketFirebaseModel\n*L\n23#1:27\n23#1:28,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.analytics.data.analytics.firebasemodels.p */
public final class C13809p implements C13794f {
    @C12579k

    /* renamed from: a */
    public final String f33658a;
    @C12579k

    /* renamed from: b */
    public final String f33659b;
    @C12579k

    /* renamed from: c */
    public final CheckoutProgressStep f33660c;
    @C12579k

    /* renamed from: d */
    public final String f33661d;

    /* renamed from: e */
    public final float f33662e;
    @C12579k

    /* renamed from: f */
    public final List<C13804k> f33663f;

    public C13809p(@C12579k String str, @C12579k String str2, @C12579k CheckoutProgressStep checkoutProgressStep, @C12579k String str3, float f, @C12579k List<C13804k> list) {
        Intrinsics.checkNotNullParameter(str, "eventCategory");
        Intrinsics.checkNotNullParameter(str2, "eventAction");
        Intrinsics.checkNotNullParameter(checkoutProgressStep, "checkoutStep");
        Intrinsics.checkNotNullParameter(str3, FirebaseAnalytics.C32532b.f78955i);
        Intrinsics.checkNotNullParameter(list, "items");
        this.f33658a = str;
        this.f33659b = str2;
        this.f33660c = checkoutProgressStep;
        this.f33661d = str3;
        this.f33662e = f;
        this.f33663f = list;
    }

    @C12579k
    /* renamed from: a */
    public Map<String, Object> mo32723a() {
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11078d1.m42659a(C28526d.f68933j, this.f33659b);
        pairArr[1] = C11078d1.m42659a(C28526d.f68929i, this.f33658a);
        pairArr[2] = C11078d1.m42659a(FirebaseAnalytics.C32532b.f78955i, this.f33661d);
        pairArr[3] = C11078d1.m42659a("checkout_step", Integer.valueOf(this.f33660c.mo32721q()));
        pairArr[4] = C11078d1.m42659a("value", Float.valueOf(this.f33662e));
        Iterable<C13804k> iterable = this.f33663f;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (C13804k a : iterable) {
            arrayList.add(a.mo32723a());
        }
        pairArr[5] = C11078d1.m42659a("items", arrayList);
        return C10977s0.m41456W(pairArr);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13809p(String str, String str2, CheckoutProgressStep checkoutProgressStep, String str3, float f, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, checkoutProgressStep, (i & 8) != 0 ? "EUR" : str3, f, list);
    }
}
