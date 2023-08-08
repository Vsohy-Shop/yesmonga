package com.carrefour.fid.android.domain.models.criteo;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.criteo.p */
public final class C38014p {
    @C12579k

    /* renamed from: a */
    public final C38013o f95782a;
    @C12579k

    /* renamed from: b */
    public final List<C38000b> f95783b;
    @C12579k

    /* renamed from: c */
    public final List<C37999a> f95784c;
    @C12580l

    /* renamed from: d */
    public final C38002d f95785d;

    public C38014p(@C12579k C38013o oVar, @C12579k List<C38000b> list, @C12579k List<C37999a> list2, @C12580l C38002d dVar) {
        Intrinsics.checkNotNullParameter(oVar, "sponsoredProducts");
        Intrinsics.checkNotNullParameter(list, "butterflies");
        Intrinsics.checkNotNullParameter(list2, "banners");
        this.f95782a = oVar;
        this.f95783b = list;
        this.f95784c = list2;
        this.f95785d = dVar;
    }

    /* renamed from: f */
    public static /* synthetic */ C38014p m156648f(C38014p pVar, C38013o oVar, List<C38000b> list, List<C37999a> list2, C38002d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            oVar = pVar.f95782a;
        }
        if ((i & 2) != 0) {
            list = pVar.f95783b;
        }
        if ((i & 4) != 0) {
            list2 = pVar.f95784c;
        }
        if ((i & 8) != 0) {
            dVar = pVar.f95785d;
        }
        return pVar.mo117567e(oVar, list, list2, dVar);
    }

    @C12579k
    /* renamed from: a */
    public final C38013o mo117563a() {
        return this.f95782a;
    }

    @C12579k
    /* renamed from: b */
    public final List<C38000b> mo117564b() {
        return this.f95783b;
    }

    @C12579k
    /* renamed from: c */
    public final List<C37999a> mo117565c() {
        return this.f95784c;
    }

    @C12580l
    /* renamed from: d */
    public final C38002d mo117566d() {
        return this.f95785d;
    }

    @C12579k
    /* renamed from: e */
    public final C38014p mo117567e(@C12579k C38013o oVar, @C12579k List<C38000b> list, @C12579k List<C37999a> list2, @C12580l C38002d dVar) {
        Intrinsics.checkNotNullParameter(oVar, "sponsoredProducts");
        Intrinsics.checkNotNullParameter(list, "butterflies");
        Intrinsics.checkNotNullParameter(list2, "banners");
        return new C38014p(oVar, list, list2, dVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38014p)) {
            return false;
        }
        C38014p pVar = (C38014p) obj;
        return Intrinsics.areEqual((Object) this.f95782a, (Object) pVar.f95782a) && Intrinsics.areEqual((Object) this.f95783b, (Object) pVar.f95783b) && Intrinsics.areEqual((Object) this.f95784c, (Object) pVar.f95784c) && Intrinsics.areEqual((Object) this.f95785d, (Object) pVar.f95785d);
    }

    @C12579k
    /* renamed from: g */
    public final List<C37999a> mo117569g() {
        return this.f95784c;
    }

    @C12579k
    /* renamed from: h */
    public final List<C38000b> mo117570h() {
        return this.f95783b;
    }

    public int hashCode() {
        int hashCode = ((((this.f95782a.hashCode() * 31) + this.f95783b.hashCode()) * 31) + this.f95784c.hashCode()) * 31;
        C38002d dVar = this.f95785d;
        return hashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    @C12580l
    /* renamed from: i */
    public final C38002d mo117572i() {
        return this.f95785d;
    }

    @C12579k
    /* renamed from: j */
    public final C38013o mo117573j() {
        return this.f95782a;
    }

    @C12579k
    public String toString() {
        C38013o oVar = this.f95782a;
        List<C38000b> list = this.f95783b;
        List<C37999a> list2 = this.f95784c;
        C38002d dVar = this.f95785d;
        return "CriteoResult(sponsoredProducts=" + oVar + ", butterflies=" + list + ", banners=" + list2 + ", flagship=" + dVar + ")";
    }
}
