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

@C11363r0({"SMAP\nProductFirebaseModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductFirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/ProductItemListFirebaseModel\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n483#2,7:115\n442#2:122\n392#2:123\n1238#3,4:124\n*S KotlinDebug\n*F\n+ 1 ProductFirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/ProductItemListFirebaseModel\n*L\n102#1:115,7\n103#1:122\n103#1:123\n103#1:124,4\n*E\n"})
/* renamed from: com.carrefour.fid.android.analytics.data.analytics.firebasemodels.k */
public final class C13804k implements C13794f {
    @C12579k

    /* renamed from: a */
    public final String f33623a;
    @C12579k

    /* renamed from: b */
    public final String f33624b;
    @C12579k

    /* renamed from: c */
    public final String f33625c;
    @C12580l

    /* renamed from: d */
    public final Integer f33626d;
    @C12580l

    /* renamed from: e */
    public final String f33627e;

    /* renamed from: f */
    public final float f33628f;
    @C12580l

    /* renamed from: g */
    public final String f33629g;
    @C12580l

    /* renamed from: h */
    public final Integer f33630h;
    @C12580l

    /* renamed from: i */
    public final Integer f33631i;
    @C12580l

    /* renamed from: j */
    public final String f33632j;
    @C12580l

    /* renamed from: k */
    public final String f33633k;
    @C12580l

    /* renamed from: l */
    public final Integer f33634l;
    @C12580l

    /* renamed from: m */
    public final String f33635m;

    public C13804k(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12580l Integer num, @C12580l String str4, float f, @C12580l String str5, @C12580l Integer num2, @C12580l Integer num3, @C12580l String str6, @C12580l String str7, @C12580l Integer num4, @C12580l String str8) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "id");
        Intrinsics.checkNotNullParameter(str3, "category");
        this.f33623a = str;
        this.f33624b = str2;
        this.f33625c = str3;
        this.f33626d = num;
        this.f33627e = str4;
        this.f33628f = f;
        this.f33629g = str5;
        this.f33630h = num2;
        this.f33631i = num3;
        this.f33632j = str6;
        this.f33633k = str7;
        this.f33634l = num4;
        this.f33635m = str8;
    }

    @C12579k
    /* renamed from: a */
    public Map<String, Object> mo32723a() {
        String str;
        boolean z;
        Pair[] pairArr = new Pair[13];
        pairArr[0] = C11078d1.m42659a(FirebaseAnalytics.C32532b.f78969r, FirebaseModelKt.m58699a(this.f33623a));
        pairArr[1] = C11078d1.m42659a(FirebaseAnalytics.C32532b.f78968q, this.f33624b);
        pairArr[2] = C11078d1.m42659a(FirebaseAnalytics.C32532b.f78967p, FirebaseModelKt.m58699a(this.f33625c));
        pairArr[3] = C11078d1.m42659a("index", this.f33626d);
        pairArr[4] = C11078d1.m42659a("price", Float.valueOf(this.f33628f));
        pairArr[5] = C11078d1.m42659a("quantity", this.f33630h);
        pairArr[6] = C11078d1.m42659a(C28526d.f68795C, this.f33631i);
        pairArr[7] = C11078d1.m42659a(C28526d.f68799D, this.f33629g);
        pairArr[8] = C11078d1.m42659a(C28526d.f68803E, this.f33633k);
        pairArr[9] = C11078d1.m42659a(C28526d.f68807F, this.f33634l);
        pairArr[10] = C11078d1.m42659a(C28526d.f68811G, this.f33632j);
        String str2 = this.f33627e;
        if (str2 != null) {
            str = FirebaseModelKt.m58699a(str2);
        } else {
            str = null;
        }
        pairArr[11] = C11078d1.m42659a(FirebaseAnalytics.C32532b.f78931S, str);
        pairArr[12] = C11078d1.m42659a(C28526d.f68815H, this.f33635m);
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
    public /* synthetic */ C13804k(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Integer r21, java.lang.String r22, float r23, java.lang.String r24, java.lang.Integer r25, java.lang.Integer r26, java.lang.String r27, java.lang.String r28, java.lang.Integer r29, java.lang.String r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r21
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r22
        L_0x0013:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0019
            r10 = r2
            goto L_0x001b
        L_0x0019:
            r10 = r24
        L_0x001b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0021
            r11 = r2
            goto L_0x0023
        L_0x0021:
            r11 = r25
        L_0x0023:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0029
            r12 = r2
            goto L_0x002b
        L_0x0029:
            r12 = r26
        L_0x002b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0031
            r13 = r2
            goto L_0x0033
        L_0x0031:
            r13 = r27
        L_0x0033:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0039
            r14 = r2
            goto L_0x003b
        L_0x0039:
            r14 = r28
        L_0x003b:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0041
            r15 = r2
            goto L_0x0043
        L_0x0041:
            r15 = r29
        L_0x0043:
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r9 = r23
            r16 = r30
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13804k.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, float, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
