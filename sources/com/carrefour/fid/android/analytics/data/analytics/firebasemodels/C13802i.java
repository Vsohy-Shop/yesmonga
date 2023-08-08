package com.carrefour.fid.android.analytics.data.analytics.firebasemodels;

import androidx.constraintlayout.core.motion.utils.C16717v;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nProductFirebaseModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductFirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/ProductContentFirebaseModel\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n483#2,7:115\n442#2:122\n392#2:123\n1238#3,4:124\n*S KotlinDebug\n*F\n+ 1 ProductFirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/ProductContentFirebaseModel\n*L\n68#1:115,7\n68#1:122\n68#1:123\n68#1:124,4\n*E\n"})
/* renamed from: com.carrefour.fid.android.analytics.data.analytics.firebasemodels.i */
public final class C13802i implements C13794f {
    @C12579k

    /* renamed from: a */
    public final String f33604a;
    @C12579k

    /* renamed from: b */
    public final String f33605b;
    @C12579k

    /* renamed from: c */
    public final String f33606c;

    /* renamed from: d */
    public final int f33607d;

    /* renamed from: e */
    public final float f33608e;
    @C12579k

    /* renamed from: f */
    public final String f33609f;
    @C12580l

    /* renamed from: g */
    public final Integer f33610g;
    @C12580l

    /* renamed from: h */
    public final String f33611h;
    @C12580l

    /* renamed from: i */
    public final String f33612i;

    public C13802i(@C12579k String str, @C12579k String str2, @C12579k String str3, int i, float f, @C12579k String str4, @C12580l Integer num, @C12580l String str5, @C12580l String str6) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "id");
        Intrinsics.checkNotNullParameter(str3, "category");
        Intrinsics.checkNotNullParameter(str4, C16717v.C16719b.f42184g);
        this.f33604a = str;
        this.f33605b = str2;
        this.f33606c = str3;
        this.f33607d = i;
        this.f33608e = f;
        this.f33609f = str4;
        this.f33610g = num;
        this.f33611h = str5;
        this.f33612i = str6;
    }

    @C12579k
    /* renamed from: a */
    public Map<String, Object> mo32723a() {
        boolean z;
        Map W = C10977s0.m41456W(C11078d1.m42659a(FirebaseAnalytics.C32532b.f78969r, FirebaseModelKt.m58699a(this.f33604a)), C11078d1.m42659a(FirebaseAnalytics.C32532b.f78968q, this.f33605b), C11078d1.m42659a(FirebaseAnalytics.C32532b.f78967p, FirebaseModelKt.m58699a(this.f33606c)), C11078d1.m42659a("index", Integer.valueOf(this.f33607d)), C11078d1.m42659a("price", Float.valueOf(this.f33608e)), C11078d1.m42659a(FirebaseAnalytics.C32532b.f78955i, "EUR"), C11078d1.m42659a(C28526d.f68795C, this.f33610g), C11078d1.m42659a(C28526d.f68811G, this.f33611h), C11078d1.m42659a(C28526d.f68803E, this.f33609f), C11078d1.m42659a(C28526d.f68815H, this.f33612i));
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

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C13802i(java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17, float r18, java.lang.String r19, java.lang.Integer r20, java.lang.String r21, java.lang.String r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r10 = r2
            goto L_0x000b
        L_0x0009:
            r10 = r20
        L_0x000b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0011
            r11 = r2
            goto L_0x0013
        L_0x0011:
            r11 = r21
        L_0x0013:
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r12 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13802i.<init>(java.lang.String, java.lang.String, java.lang.String, int, float, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
