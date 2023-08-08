package com.carrefour.fid.android.design.components.widgets.list;

import android.graphics.drawable.Drawable;
import androidx.annotation.C0358n;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.type.IconsPosition;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.list.e */
public final class C37265e extends C37269i {

    /* renamed from: n */
    public static final int f93461n = 8;
    @C12580l

    /* renamed from: b */
    public final String f93462b;

    /* renamed from: c */
    public final int f93463c;
    @C12580l

    /* renamed from: d */
    public final String f93464d;
    @C12579k

    /* renamed from: e */
    public final ItemErrorType f93465e;
    @C12580l

    /* renamed from: f */
    public final Drawable f93466f;
    @C12580l

    /* renamed from: g */
    public final Drawable f93467g;
    @C12579k

    /* renamed from: h */
    public final IconSize f93468h;
    @C12579k

    /* renamed from: i */
    public final IconSize f93469i;
    @C12579k

    /* renamed from: j */
    public final IconsPosition f93470j;
    @C12580l

    /* renamed from: k */
    public final String f93471k;
    @C12580l

    /* renamed from: l */
    public final C11289a<C11079d2> f93472l;
    @C12580l

    /* renamed from: m */
    public final String f93473m;

    public C37265e() {
        this((String) null, 0, (String) null, (ItemErrorType) null, (Drawable) null, (Drawable) null, (IconSize) null, (IconSize) null, (IconsPosition) null, (String) null, (C11289a) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* renamed from: n */
    public static /* synthetic */ C37265e m152908n(C37265e eVar, String str, int i, String str2, ItemErrorType itemErrorType, Drawable drawable, Drawable drawable2, IconSize iconSize, IconSize iconSize2, IconsPosition iconsPosition, String str3, C11289a aVar, String str4, int i2, Object obj) {
        C37265e eVar2 = eVar;
        int i3 = i2;
        return eVar.mo113477m((i3 & 1) != 0 ? eVar2.f93462b : str, (i3 & 2) != 0 ? eVar2.f93463c : i, (i3 & 4) != 0 ? eVar2.f93464d : str2, (i3 & 8) != 0 ? eVar2.f93465e : itemErrorType, (i3 & 16) != 0 ? eVar2.f93466f : drawable, (i3 & 32) != 0 ? eVar2.f93467g : drawable2, (i3 & 64) != 0 ? eVar2.f93468h : iconSize, (i3 & 128) != 0 ? eVar2.f93469i : iconSize2, (i3 & 256) != 0 ? eVar2.f93470j : iconsPosition, (i3 & 512) != 0 ? eVar2.f93471k : str3, (i3 & 1024) != 0 ? eVar2.f93472l : aVar, (i3 & 2048) != 0 ? eVar2.f93473m : str4);
    }

    @C12580l
    /* renamed from: a */
    public final String mo113463a() {
        return this.f93462b;
    }

    @C12580l
    /* renamed from: b */
    public final String mo113464b() {
        return this.f93471k;
    }

    @C12580l
    /* renamed from: c */
    public final C11289a<C11079d2> mo113465c() {
        return this.f93472l;
    }

    @C12580l
    /* renamed from: d */
    public final String mo113466d() {
        return this.f93473m;
    }

    /* renamed from: e */
    public final int mo113467e() {
        return this.f93463c;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37265e)) {
            return false;
        }
        C37265e eVar = (C37265e) obj;
        return Intrinsics.areEqual((Object) this.f93462b, (Object) eVar.f93462b) && this.f93463c == eVar.f93463c && Intrinsics.areEqual((Object) this.f93464d, (Object) eVar.f93464d) && this.f93465e == eVar.f93465e && Intrinsics.areEqual((Object) this.f93466f, (Object) eVar.f93466f) && Intrinsics.areEqual((Object) this.f93467g, (Object) eVar.f93467g) && this.f93468h == eVar.f93468h && this.f93469i == eVar.f93469i && this.f93470j == eVar.f93470j && Intrinsics.areEqual((Object) this.f93471k, (Object) eVar.f93471k) && Intrinsics.areEqual((Object) this.f93472l, (Object) eVar.f93472l) && Intrinsics.areEqual((Object) this.f93473m, (Object) eVar.f93473m);
    }

    @C12580l
    /* renamed from: f */
    public final String mo113469f() {
        return this.f93464d;
    }

    @C12579k
    /* renamed from: g */
    public final ItemErrorType mo113470g() {
        return this.f93465e;
    }

    @C12580l
    /* renamed from: h */
    public final Drawable mo113471h() {
        return this.f93466f;
    }

    public int hashCode() {
        String str = this.f93462b;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.f93463c)) * 31;
        String str2 = this.f93464d;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f93465e.hashCode()) * 31;
        Drawable drawable = this.f93466f;
        int hashCode3 = (hashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f93467g;
        int hashCode4 = (((((((hashCode3 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31) + this.f93468h.hashCode()) * 31) + this.f93469i.hashCode()) * 31) + this.f93470j.hashCode()) * 31;
        String str3 = this.f93471k;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C11289a<C11079d2> aVar = this.f93472l;
        int hashCode6 = (hashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str4 = this.f93473m;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode6 + i;
    }

    @C12580l
    /* renamed from: i */
    public final Drawable mo113473i() {
        return this.f93467g;
    }

    @C12579k
    /* renamed from: j */
    public final IconSize mo113474j() {
        return this.f93468h;
    }

    @C12579k
    /* renamed from: k */
    public final IconSize mo113475k() {
        return this.f93469i;
    }

    @C12579k
    /* renamed from: l */
    public final IconsPosition mo113476l() {
        return this.f93470j;
    }

    @C12579k
    /* renamed from: m */
    public final C37265e mo113477m(@C12580l String str, @C0358n int i, @C12580l String str2, @C12579k ItemErrorType itemErrorType, @C12580l Drawable drawable, @C12580l Drawable drawable2, @C12579k IconSize iconSize, @C12579k IconSize iconSize2, @C12579k IconsPosition iconsPosition, @C12580l String str3, @C12580l C11289a<C11079d2> aVar, @C12580l String str4) {
        ItemErrorType itemErrorType2 = itemErrorType;
        Intrinsics.checkNotNullParameter(itemErrorType2, "itemErrorType");
        IconSize iconSize3 = iconSize;
        Intrinsics.checkNotNullParameter(iconSize3, "iconLeftSize");
        IconSize iconSize4 = iconSize2;
        Intrinsics.checkNotNullParameter(iconSize4, "iconRightSize");
        IconsPosition iconsPosition2 = iconsPosition;
        Intrinsics.checkNotNullParameter(iconsPosition2, "iconsPositionItem");
        return new C37265e(str, i, str2, itemErrorType2, drawable, drawable2, iconSize3, iconSize4, iconsPosition2, str3, aVar, str4);
    }

    @C12580l
    /* renamed from: o */
    public final String mo113478o() {
        return this.f93473m;
    }

    @C12580l
    /* renamed from: p */
    public final Drawable mo113479p() {
        return this.f93467g;
    }

    @C12580l
    /* renamed from: q */
    public final String mo113480q() {
        return this.f93471k;
    }

    @C12579k
    /* renamed from: r */
    public final IconSize mo113481r() {
        return this.f93468h;
    }

    @C12580l
    /* renamed from: s */
    public final Drawable mo113482s() {
        return this.f93466f;
    }

    @C12579k
    /* renamed from: t */
    public final IconSize mo113483t() {
        return this.f93469i;
    }

    @C12579k
    public String toString() {
        String str = this.f93462b;
        int i = this.f93463c;
        String str2 = this.f93464d;
        ItemErrorType itemErrorType = this.f93465e;
        Drawable drawable = this.f93466f;
        Drawable drawable2 = this.f93467g;
        IconSize iconSize = this.f93468h;
        IconSize iconSize2 = this.f93469i;
        IconsPosition iconsPosition = this.f93470j;
        String str3 = this.f93471k;
        C11289a<C11079d2> aVar = this.f93472l;
        String str4 = this.f93473m;
        return "ListItemIconUI(labelText=" + str + ", textColor=" + i + ", labelErrorText=" + str2 + ", itemErrorType=" + itemErrorType + ", iconRight=" + drawable + ", iconLeft=" + drawable2 + ", iconLeftSize=" + iconSize + ", iconRightSize=" + iconSize2 + ", iconsPositionItem=" + iconsPosition + ", iconLeftImageUrl=" + str3 + ", onItemClicked=" + aVar + ", contentDescription=" + str4 + ")";
    }

    @C12579k
    /* renamed from: u */
    public final IconsPosition mo113485u() {
        return this.f93470j;
    }

    @C12579k
    /* renamed from: v */
    public final ItemErrorType mo113486v() {
        return this.f93465e;
    }

    @C12580l
    /* renamed from: w */
    public final String mo113487w() {
        return this.f93464d;
    }

    @C12580l
    /* renamed from: x */
    public final String mo113488x() {
        return this.f93462b;
    }

    @C12580l
    /* renamed from: y */
    public final C11289a<C11079d2> mo113489y() {
        return this.f93472l;
    }

    /* renamed from: z */
    public final int mo113490z() {
        return this.f93463c;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C37265e(java.lang.String r14, int r15, java.lang.String r16, com.carrefour.fid.android.design.components.widgets.list.ItemErrorType r17, android.graphics.drawable.Drawable r18, android.graphics.drawable.Drawable r19, com.carrefour.fid.android.design.components.widgets.list.IconSize r20, com.carrefour.fid.android.design.components.widgets.list.IconSize r21, com.carrefour.fid.android.design.components.type.IconsPosition r22, java.lang.String r23, kotlin.jvm.functions.C11289a r24, java.lang.String r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            goto L_0x000d
        L_0x000c:
            r1 = r14
        L_0x000d:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0014
            int r2 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_grey_5
            goto L_0x0015
        L_0x0014:
            r2 = r15
        L_0x0015:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = new java.lang.String
            r3.<init>()
            goto L_0x0021
        L_0x001f:
            r3 = r16
        L_0x0021:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0028
            com.carrefour.fid.android.design.components.widgets.list.ItemErrorType r4 = com.carrefour.fid.android.design.components.widgets.list.ItemErrorType.UNKNOWN
            goto L_0x002a
        L_0x0028:
            r4 = r17
        L_0x002a:
            r5 = r0 & 16
            r6 = 0
            if (r5 == 0) goto L_0x0031
            r5 = r6
            goto L_0x0033
        L_0x0031:
            r5 = r18
        L_0x0033:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0039
            r7 = r6
            goto L_0x003b
        L_0x0039:
            r7 = r19
        L_0x003b:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0042
            com.carrefour.fid.android.design.components.widgets.list.IconSize r8 = com.carrefour.fid.android.design.components.widgets.list.IconSize.M
            goto L_0x0044
        L_0x0042:
            r8 = r20
        L_0x0044:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x004b
            com.carrefour.fid.android.design.components.widgets.list.IconSize r9 = com.carrefour.fid.android.design.components.widgets.list.IconSize.M
            goto L_0x004d
        L_0x004b:
            r9 = r21
        L_0x004d:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0054
            com.carrefour.fid.android.design.components.type.IconsPosition r10 = com.carrefour.fid.android.design.components.type.IconsPosition.UNKNOWN
            goto L_0x0056
        L_0x0054:
            r10 = r22
        L_0x0056:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x005c
            r11 = r6
            goto L_0x005e
        L_0x005c:
            r11 = r23
        L_0x005e:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r6 = r24
        L_0x0065:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            goto L_0x0071
        L_0x006f:
            r0 = r25
        L_0x0071:
            r14 = r13
            r15 = r1
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r6
            r26 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.list.C37265e.<init>(java.lang.String, int, java.lang.String, com.carrefour.fid.android.design.components.widgets.list.ItemErrorType, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, com.carrefour.fid.android.design.components.widgets.list.IconSize, com.carrefour.fid.android.design.components.widgets.list.IconSize, com.carrefour.fid.android.design.components.type.IconsPosition, java.lang.String, kotlin.jvm.functions.a, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37265e(@C12580l String str, @C0358n int i, @C12580l String str2, @C12579k ItemErrorType itemErrorType, @C12580l Drawable drawable, @C12580l Drawable drawable2, @C12579k IconSize iconSize, @C12579k IconSize iconSize2, @C12579k IconsPosition iconsPosition, @C12580l String str3, @C12580l C11289a<C11079d2> aVar, @C12580l String str4) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(itemErrorType, "itemErrorType");
        Intrinsics.checkNotNullParameter(iconSize, "iconLeftSize");
        Intrinsics.checkNotNullParameter(iconSize2, "iconRightSize");
        Intrinsics.checkNotNullParameter(iconsPosition, "iconsPositionItem");
        this.f93462b = str;
        this.f93463c = i;
        this.f93464d = str2;
        this.f93465e = itemErrorType;
        this.f93466f = drawable;
        this.f93467g = drawable2;
        this.f93468h = iconSize;
        this.f93469i = iconSize2;
        this.f93470j = iconsPosition;
        this.f93471k = str3;
        this.f93472l = aVar;
        this.f93473m = str4;
    }
}
