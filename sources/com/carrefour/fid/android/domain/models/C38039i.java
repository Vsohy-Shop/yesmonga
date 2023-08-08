package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.DepartmentCategoryType;
import com.carrefour.fid.android.core.type.DepartmentType;
import java.util.List;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(message = "Deprecated for BFF use", replaceWith = @C11587t0(expression = "ProductCategory", imports = {}))
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.i */
public final class C38039i {

    /* renamed from: j */
    public static final int f95876j = 8;
    @C12579k

    /* renamed from: a */
    public final String f95877a;
    @C12579k

    /* renamed from: b */
    public final String f95878b;

    /* renamed from: c */
    public final int f95879c;
    @C12579k

    /* renamed from: d */
    public final String f95880d;
    @C12579k

    /* renamed from: e */
    public List<C38039i> f95881e;
    @C12579k

    /* renamed from: f */
    public final DepartmentType f95882f;
    @C12579k

    /* renamed from: g */
    public final DepartmentCategoryType f95883g;
    @C12580l

    /* renamed from: h */
    public final String f95884h;
    @C12580l

    /* renamed from: i */
    public final String f95885i;

    public C38039i(@C12579k String str, @C12579k String str2, int i, @C12579k String str3, @C12579k List<C38039i> list, @C12579k DepartmentType departmentType, @C12579k DepartmentCategoryType departmentCategoryType, @C12580l String str4, @C12580l String str5) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(str3, "imageUrl");
        Intrinsics.checkNotNullParameter(list, "children");
        Intrinsics.checkNotNullParameter(departmentType, "type");
        Intrinsics.checkNotNullParameter(departmentCategoryType, "categoryType");
        this.f95877a = str;
        this.f95878b = str2;
        this.f95879c = i;
        this.f95880d = str3;
        this.f95881e = list;
        this.f95882f = departmentType;
        this.f95883g = departmentCategoryType;
        this.f95884h = str4;
        this.f95885i = str5;
    }

    /* renamed from: k */
    public static /* synthetic */ C38039i m156829k(C38039i iVar, String str, String str2, int i, String str3, List list, DepartmentType departmentType, DepartmentCategoryType departmentCategoryType, String str4, String str5, int i2, Object obj) {
        C38039i iVar2 = iVar;
        int i3 = i2;
        return iVar.mo117752j((i3 & 1) != 0 ? iVar2.f95877a : str, (i3 & 2) != 0 ? iVar2.f95878b : str2, (i3 & 4) != 0 ? iVar2.f95879c : i, (i3 & 8) != 0 ? iVar2.f95880d : str3, (i3 & 16) != 0 ? iVar2.f95881e : list, (i3 & 32) != 0 ? iVar2.f95882f : departmentType, (i3 & 64) != 0 ? iVar2.f95883g : departmentCategoryType, (i3 & 128) != 0 ? iVar2.f95884h : str4, (i3 & 256) != 0 ? iVar2.f95885i : str5);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117741a() {
        return this.f95877a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo117742b() {
        return this.f95878b;
    }

    /* renamed from: c */
    public final int mo117743c() {
        return this.f95879c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo117744d() {
        return this.f95880d;
    }

    @C12579k
    /* renamed from: e */
    public final List<C38039i> mo117745e() {
        return this.f95881e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38039i)) {
            return false;
        }
        C38039i iVar = (C38039i) obj;
        return Intrinsics.areEqual((Object) this.f95877a, (Object) iVar.f95877a) && Intrinsics.areEqual((Object) this.f95878b, (Object) iVar.f95878b) && this.f95879c == iVar.f95879c && Intrinsics.areEqual((Object) this.f95880d, (Object) iVar.f95880d) && Intrinsics.areEqual((Object) this.f95881e, (Object) iVar.f95881e) && this.f95882f == iVar.f95882f && this.f95883g == iVar.f95883g && Intrinsics.areEqual((Object) this.f95884h, (Object) iVar.f95884h) && Intrinsics.areEqual((Object) this.f95885i, (Object) iVar.f95885i);
    }

    @C12579k
    /* renamed from: f */
    public final DepartmentType mo117747f() {
        return this.f95882f;
    }

    @C12579k
    /* renamed from: g */
    public final DepartmentCategoryType mo117748g() {
        return this.f95883g;
    }

    @C12580l
    /* renamed from: h */
    public final String mo117749h() {
        return this.f95884h;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f95877a.hashCode() * 31) + this.f95878b.hashCode()) * 31) + Integer.hashCode(this.f95879c)) * 31) + this.f95880d.hashCode()) * 31) + this.f95881e.hashCode()) * 31) + this.f95882f.hashCode()) * 31) + this.f95883g.hashCode()) * 31;
        String str = this.f95884h;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95885i;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    @C12580l
    /* renamed from: i */
    public final String mo117751i() {
        return this.f95885i;
    }

    @C12579k
    /* renamed from: j */
    public final C38039i mo117752j(@C12579k String str, @C12579k String str2, int i, @C12579k String str3, @C12579k List<C38039i> list, @C12579k DepartmentType departmentType, @C12579k DepartmentCategoryType departmentCategoryType, @C12580l String str4, @C12580l String str5) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(str3, "imageUrl");
        List<C38039i> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "children");
        DepartmentType departmentType2 = departmentType;
        Intrinsics.checkNotNullParameter(departmentType2, "type");
        DepartmentCategoryType departmentCategoryType2 = departmentCategoryType;
        Intrinsics.checkNotNullParameter(departmentCategoryType2, "categoryType");
        return new C38039i(str, str2, i, str3, list2, departmentType2, departmentCategoryType2, str4, str5);
    }

    @C12579k
    /* renamed from: l */
    public final DepartmentCategoryType mo117753l() {
        return this.f95883g;
    }

    @C12579k
    /* renamed from: m */
    public final List<C38039i> mo117754m() {
        return this.f95881e;
    }

    @C12580l
    /* renamed from: n */
    public final String mo117755n() {
        return this.f95884h;
    }

    @C12580l
    /* renamed from: o */
    public final String mo117756o() {
        return this.f95885i;
    }

    @C12579k
    /* renamed from: p */
    public final String mo117757p() {
        return this.f95877a;
    }

    @C12579k
    /* renamed from: q */
    public final String mo117758q() {
        return this.f95880d;
    }

    /* renamed from: r */
    public final int mo117759r() {
        return this.f95879c;
    }

    @C12579k
    /* renamed from: s */
    public final String mo117760s() {
        return this.f95878b;
    }

    @C12579k
    /* renamed from: t */
    public final DepartmentType mo117761t() {
        return this.f95882f;
    }

    @C12579k
    public String toString() {
        String str = this.f95877a;
        String str2 = this.f95878b;
        int i = this.f95879c;
        String str3 = this.f95880d;
        List<C38039i> list = this.f95881e;
        DepartmentType departmentType = this.f95882f;
        DepartmentCategoryType departmentCategoryType = this.f95883g;
        String str4 = this.f95884h;
        String str5 = this.f95885i;
        return "DepartmentDomain(id=" + str + ", title=" + str2 + ", order=" + i + ", imageUrl=" + str3 + ", children=" + list + ", type=" + departmentType + ", categoryType=" + departmentCategoryType + ", copyOfId=" + str4 + ", fieldPath=" + str5 + ")";
    }

    /* renamed from: u */
    public final void mo117763u(@C12579k List<C38039i> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f95881e = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C38039i(java.lang.String r13, java.lang.String r14, int r15, java.lang.String r16, java.util.List r17, com.carrefour.fid.android.core.type.DepartmentType r18, com.carrefour.fid.android.core.type.DepartmentCategoryType r19, java.lang.String r20, java.lang.String r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 32
            if (r1 == 0) goto L_0x000a
            com.carrefour.fid.android.core.type.DepartmentType r1 = com.carrefour.fid.android.core.type.DepartmentType.RAYON
            r8 = r1
            goto L_0x000c
        L_0x000a:
            r8 = r18
        L_0x000c:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0014
            com.carrefour.fid.android.core.type.DepartmentCategoryType r1 = com.carrefour.fid.android.core.type.DepartmentCategoryType.RAYON
            r9 = r1
            goto L_0x0016
        L_0x0014:
            r9 = r19
        L_0x0016:
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x001d
            r10 = r2
            goto L_0x001f
        L_0x001d:
            r10 = r20
        L_0x001f:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0025
            r11 = r2
            goto L_0x0027
        L_0x0025:
            r11 = r21
        L_0x0027:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.C38039i.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.util.List, com.carrefour.fid.android.core.type.DepartmentType, com.carrefour.fid.android.core.type.DepartmentCategoryType, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
