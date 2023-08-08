package com.carrefour.fid.android.design.components.widgets.filter;

import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.filter.d */
public final class C37228d extends C37229e {

    /* renamed from: h */
    public static final int f93369h = 8;
    @C12579k

    /* renamed from: b */
    public final String f93370b;

    /* renamed from: c */
    public final boolean f93371c;

    /* renamed from: d */
    public final int f93372d;
    @C12579k

    /* renamed from: e */
    public final Map<String, String> f93373e;
    @C12579k

    /* renamed from: f */
    public final List<String> f93374f;
    @C12580l

    /* renamed from: g */
    public final C11300l<String, C11079d2> f93375g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37228d(String str, boolean z, int i, Map map, List list, C11300l lVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i2 & 4) != 0 ? 3 : i, map, (i2 & 16) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i2 & 32) != 0 ? null : lVar);
    }

    /* renamed from: h */
    public static /* synthetic */ C37228d m152827h(C37228d dVar, String str, boolean z, int i, Map<String, String> map, List<String> list, C11300l<String, C11079d2> lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dVar.f93370b;
        }
        if ((i2 & 2) != 0) {
            z = dVar.f93371c;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            i = dVar.f93372d;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            map = dVar.f93373e;
        }
        Map<String, String> map2 = map;
        if ((i2 & 16) != 0) {
            list = dVar.f93374f;
        }
        List<String> list2 = list;
        if ((i2 & 32) != 0) {
            lVar = dVar.f93375g;
        }
        return dVar.mo113379g(str, z2, i3, map2, list2, lVar);
    }

    @C12579k
    /* renamed from: a */
    public final String mo113372a() {
        return this.f93370b;
    }

    /* renamed from: b */
    public final boolean mo113373b() {
        return this.f93371c;
    }

    /* renamed from: c */
    public final int mo113374c() {
        return this.f93372d;
    }

    @C12579k
    /* renamed from: d */
    public final Map<String, String> mo113375d() {
        return this.f93373e;
    }

    @C12579k
    /* renamed from: e */
    public final List<String> mo113376e() {
        return this.f93374f;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37228d)) {
            return false;
        }
        C37228d dVar = (C37228d) obj;
        return Intrinsics.areEqual((Object) this.f93370b, (Object) dVar.f93370b) && this.f93371c == dVar.f93371c && this.f93372d == dVar.f93372d && Intrinsics.areEqual((Object) this.f93373e, (Object) dVar.f93373e) && Intrinsics.areEqual((Object) this.f93374f, (Object) dVar.f93374f) && Intrinsics.areEqual((Object) this.f93375g, (Object) dVar.f93375g);
    }

    @C12580l
    /* renamed from: f */
    public final C11300l<String, C11079d2> mo113378f() {
        return this.f93375g;
    }

    @C12579k
    /* renamed from: g */
    public final C37228d mo113379g(@C12579k String str, boolean z, int i, @C12579k Map<String, String> map, @C12579k List<String> list, @C12580l C11300l<? super String, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(map, "content");
        Intrinsics.checkNotNullParameter(list, "checkedContent");
        return new C37228d(str, z, i, map, list, lVar);
    }

    public int hashCode() {
        int hashCode = this.f93370b.hashCode() * 31;
        boolean z = this.f93371c;
        if (z) {
            z = true;
        }
        int hashCode2 = (((((((hashCode + (z ? 1 : 0)) * 31) + Integer.hashCode(this.f93372d)) * 31) + this.f93373e.hashCode()) * 31) + this.f93374f.hashCode()) * 31;
        C11300l<String, C11079d2> lVar = this.f93375g;
        return hashCode2 + (lVar == null ? 0 : lVar.hashCode());
    }

    /* renamed from: i */
    public final boolean mo113381i() {
        return this.f93371c;
    }

    @C12579k
    /* renamed from: j */
    public final List<String> mo113382j() {
        return this.f93374f;
    }

    @C12579k
    /* renamed from: k */
    public final Map<String, String> mo113383k() {
        return this.f93373e;
    }

    /* renamed from: l */
    public final int mo113384l() {
        return this.f93372d;
    }

    @C12580l
    /* renamed from: m */
    public final C11300l<String, C11079d2> mo113385m() {
        return this.f93375g;
    }

    @C12579k
    /* renamed from: n */
    public final String mo113386n() {
        return this.f93370b;
    }

    @C12579k
    public String toString() {
        String str = this.f93370b;
        boolean z = this.f93371c;
        int i = this.f93372d;
        Map<String, String> map = this.f93373e;
        List<String> list = this.f93374f;
        C11300l<String, C11079d2> lVar = this.f93375g;
        return "FilterItemGroupUI(title=" + str + ", canBeExpanded=" + z + ", maxBeforeSeeMore=" + i + ", content=" + map + ", checkedContent=" + list + ", onItemCheckClicked=" + lVar + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37228d(@C12579k String str, boolean z, int i, @C12579k Map<String, String> map, @C12579k List<String> list, @C12580l C11300l<? super String, C11079d2> lVar) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(map, "content");
        Intrinsics.checkNotNullParameter(list, "checkedContent");
        this.f93370b = str;
        this.f93371c = z;
        this.f93372d = i;
        this.f93373e = map;
        this.f93374f = list;
        this.f93375g = lVar;
    }
}
