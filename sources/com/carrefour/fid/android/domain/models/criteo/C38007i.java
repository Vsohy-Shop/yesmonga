package com.carrefour.fid.android.domain.models.criteo;

import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.criteo.i */
public final class C38007i implements C38184v {
    @C12579k

    /* renamed from: a */
    public final List<C38012n> f95752a;
    @C12579k

    /* renamed from: b */
    public final List<C38115c> f95753b;
    @C12580l

    /* renamed from: c */
    public final String f95754c;
    @C12580l

    /* renamed from: d */
    public final String f95755d;
    @C12579k

    /* renamed from: e */
    public List<String> f95756e;
    @C12580l

    /* renamed from: f */
    public final CriteoFormatRendering f95757f;
    @C12580l

    /* renamed from: g */
    public final String f95758g;
    @C12580l

    /* renamed from: v */
    public final String f95759v;

    public C38007i(@C12579k List<C38012n> list, @C12579k List<C38115c> list2, @C12580l String str, @C12580l String str2, @C12579k List<String> list3, @C12580l CriteoFormatRendering criteoFormatRendering, @C12580l String str3, @C12580l String str4) {
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        Intrinsics.checkNotNullParameter(list2, "products");
        Intrinsics.checkNotNullParameter(list3, "buttonsNames");
        this.f95752a = list;
        this.f95753b = list2;
        this.f95754c = str;
        this.f95755d = str2;
        this.f95756e = list3;
        this.f95757f = criteoFormatRendering;
        this.f95758g = str3;
        this.f95759v = str4;
    }

    /* renamed from: j */
    public static /* synthetic */ C38007i m156586j(C38007i iVar, List list, List list2, String str, String str2, List list3, CriteoFormatRendering criteoFormatRendering, String str3, String str4, int i, Object obj) {
        C38007i iVar2 = iVar;
        int i2 = i;
        return iVar.mo117511i((i2 & 1) != 0 ? iVar2.f95752a : list, (i2 & 2) != 0 ? iVar2.f95753b : list2, (i2 & 4) != 0 ? iVar2.f95754c : str, (i2 & 8) != 0 ? iVar2.f95755d : str2, (i2 & 16) != 0 ? iVar2.f95756e : list3, (i2 & 32) != 0 ? iVar2.f95757f : criteoFormatRendering, (i2 & 64) != 0 ? iVar2.f95758g : str3, (i2 & 128) != 0 ? iVar2.f95759v : str4);
    }

    @C12579k
    /* renamed from: a */
    public final List<C38012n> mo117501a() {
        return this.f95752a;
    }

    @C12579k
    /* renamed from: b */
    public final List<C38115c> mo117502b() {
        return this.f95753b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo117503c() {
        return this.f95754c;
    }

    @C12580l
    /* renamed from: d */
    public final String mo117504d() {
        return this.f95755d;
    }

    @C12579k
    /* renamed from: e */
    public final List<String> mo117505e() {
        return this.f95756e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38007i)) {
            return false;
        }
        C38007i iVar = (C38007i) obj;
        return Intrinsics.areEqual((Object) this.f95752a, (Object) iVar.f95752a) && Intrinsics.areEqual((Object) this.f95753b, (Object) iVar.f95753b) && Intrinsics.areEqual((Object) this.f95754c, (Object) iVar.f95754c) && Intrinsics.areEqual((Object) this.f95755d, (Object) iVar.f95755d) && Intrinsics.areEqual((Object) this.f95756e, (Object) iVar.f95756e) && Intrinsics.areEqual((Object) this.f95757f, (Object) iVar.f95757f) && Intrinsics.areEqual((Object) this.f95758g, (Object) iVar.f95758g) && Intrinsics.areEqual((Object) this.f95759v, (Object) iVar.f95759v);
    }

    @C12580l
    /* renamed from: f */
    public final CriteoFormatRendering mo117507f() {
        return this.f95757f;
    }

    @C12580l
    /* renamed from: g */
    public final String mo117508g() {
        return this.f95758g;
    }

    @C12580l
    /* renamed from: h */
    public final String mo117509h() {
        return this.f95759v;
    }

    public int hashCode() {
        int hashCode = ((this.f95752a.hashCode() * 31) + this.f95753b.hashCode()) * 31;
        String str = this.f95754c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95755d;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f95756e.hashCode()) * 31;
        CriteoFormatRendering criteoFormatRendering = this.f95757f;
        int hashCode4 = (hashCode3 + (criteoFormatRendering == null ? 0 : criteoFormatRendering.hashCode())) * 31;
        String str3 = this.f95758g;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95759v;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    @C12579k
    /* renamed from: i */
    public final C38007i mo117511i(@C12579k List<C38012n> list, @C12579k List<C38115c> list2, @C12580l String str, @C12580l String str2, @C12579k List<String> list3, @C12580l CriteoFormatRendering criteoFormatRendering, @C12580l String str3, @C12580l String str4) {
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        Intrinsics.checkNotNullParameter(list2, "products");
        Intrinsics.checkNotNullParameter(list3, "buttonsNames");
        return new C38007i(list, list2, str, str2, list3, criteoFormatRendering, str3, str4);
    }

    @C12579k
    /* renamed from: k */
    public final List<String> mo117512k() {
        return this.f95756e;
    }

    @C12579k
    /* renamed from: l */
    public final List<C38012n> mo117513l() {
        return this.f95752a;
    }

    @C12580l
    /* renamed from: m */
    public final String mo117514m() {
        return this.f95758g;
    }

    @C12580l
    /* renamed from: n */
    public final String mo117515n() {
        return this.f95759v;
    }

    @C12580l
    /* renamed from: o */
    public final String mo117516o() {
        return this.f95755d;
    }

    @C12580l
    /* renamed from: p */
    public final String mo117517p() {
        return this.f95754c;
    }

    @C12579k
    /* renamed from: q */
    public final List<C38115c> mo117518q() {
        return this.f95753b;
    }

    @C12580l
    /* renamed from: r */
    public final CriteoFormatRendering mo117519r() {
        return this.f95757f;
    }

    /* renamed from: s */
    public final void mo117520s(@C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f95756e = list;
    }

    @C12579k
    public String toString() {
        List<C38012n> list = this.f95752a;
        List<C38115c> list2 = this.f95753b;
        String str = this.f95754c;
        String str2 = this.f95755d;
        List<String> list3 = this.f95756e;
        CriteoFormatRendering criteoFormatRendering = this.f95757f;
        String str3 = this.f95758g;
        String str4 = this.f95759v;
        return "CriteoPlpButterfly(criteoProducts=" + list + ", products=" + list2 + ", onViewBeacon=" + str + ", onLoadBeacon=" + str2 + ", buttonsNames=" + list3 + ", rendering=" + criteoFormatRendering + ", onClickBeacon=" + str3 + ", onFileClickBeacon=" + str4 + ")";
    }
}
