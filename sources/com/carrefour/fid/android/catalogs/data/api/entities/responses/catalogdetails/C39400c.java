package com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails;

import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails.c */
public final class C39400c {
    @C33608c("id")
    @C12579k

    /* renamed from: a */
    public final String f100762a;
    @C33608c("catalog_id")
    @C12579k

    /* renamed from: b */
    public final String f100763b;
    @C33608c("ean")
    @C12579k

    /* renamed from: c */
    public final String f100764c;
    @C33608c("name")
    @C12579k

    /* renamed from: d */
    public final String f100765d;
    @C33608c("brand")
    @C12579k

    /* renamed from: e */
    public final String f100766e;
    @C33608c("price")
    @C12579k

    /* renamed from: f */
    public final String f100767f;
    @C33608c("promo_image")
    @C12579k

    /* renamed from: g */
    public final String f100768g;
    @C33608c("shelf")
    @C12579k

    /* renamed from: h */
    public final String f100769h;
    @C33608c("page_num")

    /* renamed from: i */
    public final int f100770i;
    @C33608c("subshelf")
    @C12579k

    /* renamed from: j */
    public final String f100771j;
    @C33608c("unit_price")
    @C12579k

    /* renamed from: k */
    public final String f100772k;
    @C33608c("legal_info")
    @C12579k

    /* renamed from: l */
    public final String f100773l;
    @C33608c("descriptions")
    @C12579k

    /* renamed from: m */
    public final List<CatalogProductDescriptionResponse> f100774m;
    @C33608c("images_url")
    @C12579k

    /* renamed from: n */
    public final List<String> f100775n;

    public C39400c() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (List) null, (List) null, 16383, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: a */
    public final String mo130426a() {
        return this.f100766e;
    }

    @C12579k
    /* renamed from: b */
    public final String mo130427b() {
        return this.f100763b;
    }

    @C12579k
    /* renamed from: c */
    public final List<CatalogProductDescriptionResponse> mo130428c() {
        return this.f100774m;
    }

    @C12579k
    /* renamed from: d */
    public final String mo130429d() {
        return this.f100764c;
    }

    @C12579k
    /* renamed from: e */
    public final String mo130430e() {
        return this.f100762a;
    }

    @C12579k
    /* renamed from: f */
    public final List<String> mo130431f() {
        return this.f100775n;
    }

    @C12579k
    /* renamed from: g */
    public final String mo130432g() {
        return this.f100773l;
    }

    @C12579k
    /* renamed from: h */
    public final String mo130433h() {
        return this.f100765d;
    }

    /* renamed from: i */
    public final int mo130434i() {
        return this.f100770i;
    }

    @C12579k
    /* renamed from: j */
    public final String mo130435j() {
        return this.f100767f;
    }

    @C12579k
    /* renamed from: k */
    public final String mo130436k() {
        return this.f100768g;
    }

    @C12579k
    /* renamed from: l */
    public final String mo130437l() {
        return this.f100769h;
    }

    @C12579k
    /* renamed from: m */
    public final String mo130438m() {
        return this.f100771j;
    }

    @C12579k
    /* renamed from: n */
    public final String mo130439n() {
        return this.f100772k;
    }

    public C39400c(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, int i, @C12579k String str9, @C12579k String str10, @C12579k String str11, @C12579k List<CatalogProductDescriptionResponse> list, @C12579k List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "catalogID");
        Intrinsics.checkNotNullParameter(str3, "ean");
        Intrinsics.checkNotNullParameter(str4, "name");
        Intrinsics.checkNotNullParameter(str5, "brand");
        Intrinsics.checkNotNullParameter(str6, "price");
        Intrinsics.checkNotNullParameter(str7, "promoImage");
        Intrinsics.checkNotNullParameter(str8, "shelf");
        Intrinsics.checkNotNullParameter(str9, "subShelf");
        Intrinsics.checkNotNullParameter(str10, "unitPrice");
        Intrinsics.checkNotNullParameter(str11, "legalInfo");
        Intrinsics.checkNotNullParameter(list, "description");
        Intrinsics.checkNotNullParameter(list2, "imagesUrl");
        this.f100762a = str;
        this.f100763b = str2;
        this.f100764c = str3;
        this.f100765d = str4;
        this.f100766e = str5;
        this.f100767f = str6;
        this.f100768g = str7;
        this.f100769h = str8;
        this.f100770i = i;
        this.f100771j = str9;
        this.f100772k = str10;
        this.f100773l = str11;
        this.f100774m = list;
        this.f100775n = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C39400c(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.util.List r27, java.util.List r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r14 = this;
            r0 = r29
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            goto L_0x000d
        L_0x000c:
            r1 = r15
        L_0x000d:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = new java.lang.String
            r2.<init>()
            goto L_0x0019
        L_0x0017:
            r2 = r16
        L_0x0019:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0023
            java.lang.String r3 = new java.lang.String
            r3.<init>()
            goto L_0x0025
        L_0x0023:
            r3 = r17
        L_0x0025:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x002f
            java.lang.String r4 = new java.lang.String
            r4.<init>()
            goto L_0x0031
        L_0x002f:
            r4 = r18
        L_0x0031:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x003b
            java.lang.String r5 = new java.lang.String
            r5.<init>()
            goto L_0x003d
        L_0x003b:
            r5 = r19
        L_0x003d:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0047
            java.lang.String r6 = new java.lang.String
            r6.<init>()
            goto L_0x0049
        L_0x0047:
            r6 = r20
        L_0x0049:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0053
            java.lang.String r7 = new java.lang.String
            r7.<init>()
            goto L_0x0055
        L_0x0053:
            r7 = r21
        L_0x0055:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x005f
            java.lang.String r8 = new java.lang.String
            r8.<init>()
            goto L_0x0061
        L_0x005f:
            r8 = r22
        L_0x0061:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0067
            r9 = 0
            goto L_0x0069
        L_0x0067:
            r9 = r23
        L_0x0069:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0073
            java.lang.String r10 = new java.lang.String
            r10.<init>()
            goto L_0x0075
        L_0x0073:
            r10 = r24
        L_0x0075:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x007f
            java.lang.String r11 = new java.lang.String
            r11.<init>()
            goto L_0x0081
        L_0x007f:
            r11 = r25
        L_0x0081:
            r12 = r0 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x008b
            java.lang.String r12 = new java.lang.String
            r12.<init>()
            goto L_0x008d
        L_0x008b:
            r12 = r26
        L_0x008d:
            r13 = r0 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x0096
            java.util.List r13 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0098
        L_0x0096:
            r13 = r27
        L_0x0098:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x00a1
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x00a3
        L_0x00a1:
            r0 = r28
        L_0x00a3:
            r15 = r14
            r16 = r1
            r17 = r2
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails.C39400c.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
