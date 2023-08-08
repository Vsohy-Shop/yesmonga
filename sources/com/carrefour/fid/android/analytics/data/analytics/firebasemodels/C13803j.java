package com.carrefour.fid.android.analytics.data.analytics.firebasemodels;

import com.carrefour.fid.android.shared.constant.C28526d;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nProductFirebaseModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductFirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/ProductFirebaseModel\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n483#2,7:115\n442#2:122\n392#2:123\n1238#3,4:124\n*S KotlinDebug\n*F\n+ 1 ProductFirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/ProductFirebaseModel\n*L\n42#1:115,7\n42#1:122\n42#1:123\n42#1:124,4\n*E\n"})
/* renamed from: com.carrefour.fid.android.analytics.data.analytics.firebasemodels.j */
public final class C13803j implements C13794f {
    @C12580l

    /* renamed from: a */
    public final String f33613a;
    @C12579k

    /* renamed from: b */
    public final String f33614b;
    @C12580l

    /* renamed from: c */
    public final String f33615c;
    @C12580l

    /* renamed from: d */
    public final Integer f33616d;

    /* renamed from: e */
    public final float f33617e;
    @C12580l

    /* renamed from: f */
    public final Integer f33618f;
    @C12580l

    /* renamed from: g */
    public final Integer f33619g;
    @C12580l

    /* renamed from: h */
    public final String f33620h;
    @C12580l

    /* renamed from: i */
    public final String f33621i;
    @C12580l

    /* renamed from: j */
    public final String f33622j;

    public C13803j(@C12580l String str, @C12579k String str2, @C12580l String str3, @C12580l Integer num, float f, @C12580l Integer num2, @C12580l Integer num3, @C12580l String str4, @C12580l String str5, @C12580l String str6) {
        Intrinsics.checkNotNullParameter(str2, "id");
        this.f33613a = str;
        this.f33614b = str2;
        this.f33615c = str3;
        this.f33616d = num;
        this.f33617e = f;
        this.f33618f = num2;
        this.f33619g = num3;
        this.f33620h = str4;
        this.f33621i = str5;
        this.f33622j = str6;
    }

    @C12579k
    /* renamed from: a */
    public Map<String, Object> mo32723a() {
        String str;
        boolean z;
        Pair[] pairArr = new Pair[11];
        String str2 = this.f33613a;
        String str3 = null;
        if (str2 != null) {
            str = FirebaseModelKt.m58699a(str2);
        } else {
            str = null;
        }
        pairArr[0] = C11078d1.m42659a(FirebaseAnalytics.C32532b.f78969r, str);
        pairArr[1] = C11078d1.m42659a(FirebaseAnalytics.C32532b.f78968q, this.f33614b);
        String str4 = this.f33615c;
        if (str4 != null) {
            str3 = FirebaseModelKt.m58699a(str4);
        }
        pairArr[2] = C11078d1.m42659a(FirebaseAnalytics.C32532b.f78967p, str3);
        pairArr[3] = C11078d1.m42659a("index", this.f33616d);
        pairArr[4] = C11078d1.m42659a("price", Float.valueOf(this.f33617e));
        pairArr[5] = C11078d1.m42659a("quantity", this.f33618f);
        pairArr[6] = C11078d1.m42659a(FirebaseAnalytics.C32532b.f78955i, "EUR");
        pairArr[7] = C11078d1.m42659a(C28526d.f68795C, this.f33619g);
        pairArr[8] = C11078d1.m42659a(C28526d.f68803E, this.f33621i);
        pairArr[9] = C11078d1.m42659a(C28526d.f68811G, this.f33620h);
        pairArr[10] = C11078d1.m42659a(C28526d.f68815H, this.f33622j);
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

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C13803j(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Integer r18, float r19, java.lang.Integer r20, java.lang.Integer r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000a
        L_0x0009:
            r4 = r15
        L_0x000a:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0010
            r6 = r2
            goto L_0x0012
        L_0x0010:
            r6 = r17
        L_0x0012:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0018
            r7 = r2
            goto L_0x001a
        L_0x0018:
            r7 = r18
        L_0x001a:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0020
            r9 = r2
            goto L_0x0022
        L_0x0020:
            r9 = r20
        L_0x0022:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0028
            r10 = r2
            goto L_0x002a
        L_0x0028:
            r10 = r21
        L_0x002a:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0030
            r11 = r2
            goto L_0x0032
        L_0x0030:
            r11 = r22
        L_0x0032:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0038
            r12 = r2
            goto L_0x003a
        L_0x0038:
            r12 = r23
        L_0x003a:
            r3 = r14
            r5 = r16
            r8 = r19
            r13 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13803j.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, float, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
