package com.carrefour.fid.android.analytics.data.analytics.firebasemodels;

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

@C11363r0({"SMAP\nCheckoutItemListFirebaseModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutItemListFirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/CheckoutItemListFirebaseModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1549#2:25\n1620#2,3:26\n*S KotlinDebug\n*F\n+ 1 CheckoutItemListFirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/CheckoutItemListFirebaseModel\n*L\n21#1:25\n21#1:26,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.analytics.data.analytics.firebasemodels.c */
public final class C13791c implements C13794f {
    @C12579k

    /* renamed from: a */
    public final String f33584a;
    @C12579k

    /* renamed from: b */
    public final CheckoutProgressStep f33585b;
    @C12579k

    /* renamed from: c */
    public final String f33586c;

    /* renamed from: d */
    public final float f33587d;
    @C12579k

    /* renamed from: e */
    public final List<C13804k> f33588e;

    public C13791c(@C12579k String str, @C12579k CheckoutProgressStep checkoutProgressStep, @C12579k String str2, float f, @C12579k List<C13804k> list) {
        Intrinsics.checkNotNullParameter(str, "listName");
        Intrinsics.checkNotNullParameter(checkoutProgressStep, "checkoutStep");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.C32532b.f78955i);
        Intrinsics.checkNotNullParameter(list, "items");
        this.f33584a = str;
        this.f33585b = checkoutProgressStep;
        this.f33586c = str2;
        this.f33587d = f;
        this.f33588e = list;
    }

    @C12579k
    /* renamed from: a */
    public Map<String, Object> mo32723a() {
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11078d1.m42659a(FirebaseAnalytics.C32532b.f78948e0, FirebaseModelKt.m58699a(this.f33584a));
        pairArr[1] = C11078d1.m42659a("item_list", FirebaseModelKt.m58699a(this.f33584a));
        pairArr[2] = C11078d1.m42659a(FirebaseAnalytics.C32532b.f78955i, this.f33586c);
        pairArr[3] = C11078d1.m42659a("checkout_step", Integer.valueOf(this.f33585b.mo32721q()));
        pairArr[4] = C11078d1.m42659a("value", Float.valueOf(this.f33587d));
        Iterable<C13804k> iterable = this.f33588e;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (C13804k a : iterable) {
            arrayList.add(a.mo32723a());
        }
        pairArr[5] = C11078d1.m42659a("items", arrayList);
        return FirebaseModelKt.m58700b(C10977s0.m41456W(pairArr));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13791c(String str, CheckoutProgressStep checkoutProgressStep, String str2, float f, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, checkoutProgressStep, (i & 4) != 0 ? "EUR" : str2, f, list);
    }
}
