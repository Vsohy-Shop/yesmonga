package com.carrefour.fid.android.analytics.data.analytics.firebasemodels;

import com.carrefour.fid.android.shared.constant.C28526d;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCartItemListFirebaseModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CartItemListFirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/CartItemListFirebaseModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,25:1\n1549#2:26\n1620#2,3:27\n1238#2,4:39\n483#3,7:30\n442#3:37\n392#3:38\n*S KotlinDebug\n*F\n+ 1 CartItemListFirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/CartItemListFirebaseModel\n*L\n22#1:26\n22#1:27,3\n23#1:39,4\n23#1:30,7\n23#1:37\n23#1:38\n*E\n"})
/* renamed from: com.carrefour.fid.android.analytics.data.analytics.firebasemodels.b */
public final class C13790b implements C13794f {
    @C12579k

    /* renamed from: a */
    public final String f33579a;
    @C12579k

    /* renamed from: b */
    public final String f33580b;
    @C12579k

    /* renamed from: c */
    public final List<C13804k> f33581c;
    @C12580l

    /* renamed from: d */
    public final String f33582d;
    @C12580l

    /* renamed from: e */
    public final Float f33583e;

    public C13790b(@C12579k String str, @C12579k String str2, @C12579k List<C13804k> list, @C12580l String str3, @C12580l Float f) {
        Intrinsics.checkNotNullParameter(str, "listName");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.C32532b.f78955i);
        Intrinsics.checkNotNullParameter(list, "items");
        this.f33579a = str;
        this.f33580b = str2;
        this.f33581c = list;
        this.f33582d = str3;
        this.f33583e = f;
    }

    @C12579k
    /* renamed from: a */
    public Map<String, Object> mo32723a() {
        boolean z;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11078d1.m42659a(FirebaseAnalytics.C32532b.f78948e0, this.f33579a);
        pairArr[1] = C11078d1.m42659a("item_list", this.f33579a);
        pairArr[2] = C11078d1.m42659a(FirebaseAnalytics.C32532b.f78955i, this.f33580b);
        pairArr[3] = C11078d1.m42659a(C28526d.f68851Q, this.f33583e);
        pairArr[4] = C11078d1.m42659a(C28526d.f68855R, this.f33582d);
        Iterable<C13804k> iterable = this.f33581c;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (C13804k a : iterable) {
            arrayList.add(a.mo32723a());
        }
        pairArr[5] = C11078d1.m42659a("items", arrayList);
        Map W = C10977s0.m41456W(pairArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : W.entrySet()) {
            if (entry.getValue() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C10975r0.m41400j(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Any");
            linkedHashMap2.put(key, value);
        }
        return FirebaseModelKt.m58700b(linkedHashMap2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13790b(String str, String str2, List list, String str3, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "EUR" : str2, list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : f);
    }
}
