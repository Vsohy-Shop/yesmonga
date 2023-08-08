package com.carrefour.fid.android.analytics.data.analytics.firebasemodels;

import com.carrefour.fid.android.shared.constant.C28526d;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSelectContentFirebaseModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectContentFirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/SelectItemFirebaseModel\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n483#2,7:51\n442#2:58\n392#2:59\n1238#3,4:60\n*S KotlinDebug\n*F\n+ 1 SelectContentFirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/SelectItemFirebaseModel\n*L\n48#1:51,7\n48#1:58\n48#1:59\n48#1:60,4\n*E\n"})
/* renamed from: com.carrefour.fid.android.analytics.data.analytics.firebasemodels.n */
public final class C13807n implements C13794f {
    @C12579k

    /* renamed from: a */
    public final String f33649a;
    @C12579k

    /* renamed from: b */
    public final String f33650b;
    @C12579k

    /* renamed from: c */
    public final C13802i f33651c;
    @C12580l

    /* renamed from: d */
    public final Integer f33652d;
    @C12580l

    /* renamed from: e */
    public final String f33653e;
    @C12580l

    /* renamed from: f */
    public final String f33654f;
    @C12580l

    /* renamed from: g */
    public final Float f33655g;

    public C13807n(@C12579k String str, @C12579k String str2, @C12579k C13802i iVar, @C12580l Integer num, @C12580l String str3, @C12580l String str4, @C12580l Float f) {
        Intrinsics.checkNotNullParameter(str, "itemList");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.C32532b.f78955i);
        Intrinsics.checkNotNullParameter(iVar, "content");
        this.f33649a = str;
        this.f33650b = str2;
        this.f33651c = iVar;
        this.f33652d = num;
        this.f33653e = str3;
        this.f33654f = str4;
        this.f33655g = f;
    }

    @C12579k
    /* renamed from: a */
    public Map<String, Object> mo32723a() {
        boolean z;
        Map W = C10977s0.m41456W(C11078d1.m42659a(FirebaseAnalytics.C32532b.f78948e0, FirebaseModelKt.m58699a(this.f33649a)), C11078d1.m42659a(FirebaseAnalytics.C32532b.f78955i, this.f33650b), C11078d1.m42659a(C28526d.f68851Q, this.f33655g), C11078d1.m42659a(C28526d.f68855R, this.f33654f), C11078d1.m42659a(C28526d.f68795C, this.f33652d), C11078d1.m42659a(C28526d.f68811G, this.f33653e), C11078d1.m42659a("items", this.f33651c.mo32723a()));
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
    public /* synthetic */ C13807n(String str, String str2, C13802i iVar, Integer num, String str3, String str4, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "EUR" : str2, iVar, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : f);
    }
}
