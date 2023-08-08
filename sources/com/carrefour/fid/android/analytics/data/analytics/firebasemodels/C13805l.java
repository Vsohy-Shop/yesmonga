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

@C11363r0({"SMAP\nPurchaseConfirmationFirebaseModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseConfirmationFirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/PurchaseConfirmationFirebaseModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1549#2:28\n1620#2,3:29\n*S KotlinDebug\n*F\n+ 1 PurchaseConfirmationFirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/PurchaseConfirmationFirebaseModel\n*L\n23#1:28\n23#1:29,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.analytics.data.analytics.firebasemodels.l */
public final class C13805l implements C13794f {
    @C12579k

    /* renamed from: a */
    public final String f33636a;
    @C12579k

    /* renamed from: b */
    public final String f33637b;

    /* renamed from: c */
    public final float f33638c;

    /* renamed from: d */
    public final float f33639d;
    @C12579k

    /* renamed from: e */
    public final String f33640e;
    @C12579k

    /* renamed from: f */
    public final List<C13803j> f33641f;

    public C13805l(@C12579k String str, @C12579k String str2, float f, float f2, @C12579k String str3, @C12579k List<C13803j> list) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78957j);
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.C32532b.f78955i);
        Intrinsics.checkNotNullParameter(str3, "transactionId");
        Intrinsics.checkNotNullParameter(list, "items");
        this.f33636a = str;
        this.f33637b = str2;
        this.f33638c = f;
        this.f33639d = f2;
        this.f33640e = str3;
        this.f33641f = list;
    }

    @C12579k
    /* renamed from: a */
    public Map<String, Object> mo32723a() {
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11078d1.m42659a(FirebaseAnalytics.C32532b.f78957j, this.f33636a);
        pairArr[1] = C11078d1.m42659a(FirebaseAnalytics.C32532b.f78955i, this.f33637b);
        pairArr[2] = C11078d1.m42659a("value", Float.valueOf(this.f33638c));
        pairArr[3] = C11078d1.m42659a(FirebaseAnalytics.C32532b.f78917E, Float.valueOf(this.f33639d));
        pairArr[4] = C11078d1.m42659a("transaction_id", this.f33640e);
        Iterable<C13803j> iterable = this.f33641f;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (C13803j a : iterable) {
            arrayList.add(a.mo32723a());
        }
        pairArr[5] = C11078d1.m42659a("items", arrayList);
        return FirebaseModelKt.m58700b(C10977s0.m41456W(pairArr));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13805l(String str, String str2, float f, float f2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "EUR" : str2, f, f2, str3, list);
    }
}
