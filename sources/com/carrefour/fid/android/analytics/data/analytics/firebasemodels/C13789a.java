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

@C11363r0({"SMAP\nCartFirebaseModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CartFirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/CartFirebaseModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,27:1\n1549#2:28\n1620#2,3:29\n1238#2,4:41\n483#3,7:32\n442#3:39\n392#3:40\n*S KotlinDebug\n*F\n+ 1 CartFirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/CartFirebaseModel\n*L\n24#1:28\n24#1:29,3\n25#1:41,4\n25#1:32,7\n25#1:39\n25#1:40\n*E\n"})
/* renamed from: com.carrefour.fid.android.analytics.data.analytics.firebasemodels.a */
public final class C13789a implements C13794f {
    @C12579k

    /* renamed from: a */
    public final String f33573a;

    /* renamed from: b */
    public final float f33574b;
    @C12579k

    /* renamed from: c */
    public final String f33575c;
    @C12579k

    /* renamed from: d */
    public final List<C13803j> f33576d;
    @C12580l

    /* renamed from: e */
    public final String f33577e;
    @C12580l

    /* renamed from: f */
    public final Float f33578f;

    public C13789a(@C12579k String str, float f, @C12579k String str2, @C12579k List<C13803j> list, @C12580l String str3, @C12580l Float f2) {
        Intrinsics.checkNotNullParameter(str, "listName");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.C32532b.f78955i);
        Intrinsics.checkNotNullParameter(list, "items");
        this.f33573a = str;
        this.f33574b = f;
        this.f33575c = str2;
        this.f33576d = list;
        this.f33577e = str3;
        this.f33578f = f2;
    }

    @C12579k
    /* renamed from: a */
    public Map<String, Object> mo32723a() {
        boolean z;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = C11078d1.m42659a(FirebaseAnalytics.C32532b.f78948e0, FirebaseModelKt.m58699a(this.f33573a));
        pairArr[1] = C11078d1.m42659a("item_list", FirebaseModelKt.m58699a(this.f33573a));
        pairArr[2] = C11078d1.m42659a("value", Float.valueOf(this.f33574b));
        pairArr[3] = C11078d1.m42659a(FirebaseAnalytics.C32532b.f78955i, this.f33575c);
        pairArr[4] = C11078d1.m42659a(C28526d.f68851Q, this.f33578f);
        pairArr[5] = C11078d1.m42659a(C28526d.f68855R, this.f33577e);
        Iterable<C13803j> iterable = this.f33576d;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (C13803j a : iterable) {
            arrayList.add(a.mo32723a());
        }
        pairArr[6] = C11078d1.m42659a("items", arrayList);
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
    public /* synthetic */ C13789a(String str, float f, String str2, List list, String str3, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, (i & 4) != 0 ? "EUR" : str2, list, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : f2);
    }
}
