package com.carrefour.fid.android.domain.models.criteo;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.criteo.c */
public final class C38001c {
    @C12579k

    /* renamed from: a */
    public final C38011m f95707a;
    @C12579k

    /* renamed from: b */
    public final List<C38007i> f95708b;
    @C12579k

    /* renamed from: c */
    public final List<C37999a> f95709c;
    @C12580l

    /* renamed from: d */
    public final C38009k f95710d;

    public C38001c(@C12579k C38011m mVar, @C12579k List<C38007i> list, @C12579k List<C37999a> list2, @C12580l C38009k kVar) {
        Intrinsics.checkNotNullParameter(mVar, "sponsoredProducts");
        Intrinsics.checkNotNullParameter(list, "butterflies");
        Intrinsics.checkNotNullParameter(list2, "banners");
        this.f95707a = mVar;
        this.f95708b = list;
        this.f95709c = list2;
        this.f95710d = kVar;
    }

    /* renamed from: f */
    public static /* synthetic */ C38001c m156489f(C38001c cVar, C38011m mVar, List<C38007i> list, List<C37999a> list2, C38009k kVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mVar = cVar.f95707a;
        }
        if ((i & 2) != 0) {
            list = cVar.f95708b;
        }
        if ((i & 4) != 0) {
            list2 = cVar.f95709c;
        }
        if ((i & 8) != 0) {
            kVar = cVar.f95710d;
        }
        return cVar.mo117410e(mVar, list, list2, kVar);
    }

    @C12579k
    /* renamed from: a */
    public final C38011m mo117406a() {
        return this.f95707a;
    }

    @C12579k
    /* renamed from: b */
    public final List<C38007i> mo117407b() {
        return this.f95708b;
    }

    @C12579k
    /* renamed from: c */
    public final List<C37999a> mo117408c() {
        return this.f95709c;
    }

    @C12580l
    /* renamed from: d */
    public final C38009k mo117409d() {
        return this.f95710d;
    }

    @C12579k
    /* renamed from: e */
    public final C38001c mo117410e(@C12579k C38011m mVar, @C12579k List<C38007i> list, @C12579k List<C37999a> list2, @C12580l C38009k kVar) {
        Intrinsics.checkNotNullParameter(mVar, "sponsoredProducts");
        Intrinsics.checkNotNullParameter(list, "butterflies");
        Intrinsics.checkNotNullParameter(list2, "banners");
        return new C38001c(mVar, list, list2, kVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38001c)) {
            return false;
        }
        C38001c cVar = (C38001c) obj;
        return Intrinsics.areEqual((Object) this.f95707a, (Object) cVar.f95707a) && Intrinsics.areEqual((Object) this.f95708b, (Object) cVar.f95708b) && Intrinsics.areEqual((Object) this.f95709c, (Object) cVar.f95709c) && Intrinsics.areEqual((Object) this.f95710d, (Object) cVar.f95710d);
    }

    @C12579k
    /* renamed from: g */
    public final List<C37999a> mo117412g() {
        return this.f95709c;
    }

    @C12579k
    /* renamed from: h */
    public final List<C38007i> mo117413h() {
        return this.f95708b;
    }

    public int hashCode() {
        int hashCode = ((((this.f95707a.hashCode() * 31) + this.f95708b.hashCode()) * 31) + this.f95709c.hashCode()) * 31;
        C38009k kVar = this.f95710d;
        return hashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    @C12580l
    /* renamed from: i */
    public final C38009k mo117415i() {
        return this.f95710d;
    }

    @C12579k
    /* renamed from: j */
    public final C38011m mo117416j() {
        return this.f95707a;
    }

    @C12579k
    public String toString() {
        C38011m mVar = this.f95707a;
        List<C38007i> list = this.f95708b;
        List<C37999a> list2 = this.f95709c;
        C38009k kVar = this.f95710d;
        return "CriteoDomain(sponsoredProducts=" + mVar + ", butterflies=" + list + ", banners=" + list2 + ", flagship=" + kVar + ")";
    }
}
