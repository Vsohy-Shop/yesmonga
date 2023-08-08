package com.carrefour.fid.android.presentation.viewmodels.physicalstore.info;

import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27152g;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27156h;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27160i;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27164j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c */
public final class C27145c {
    @C12579k

    /* renamed from: a */
    public final C27164j f66011a;
    @C12579k

    /* renamed from: b */
    public final C27152g f66012b;
    @C12579k

    /* renamed from: c */
    public final C27160i f66013c;
    @C12579k

    /* renamed from: d */
    public final C27156h f66014d;

    public C27145c() {
        this((C27164j) null, (C27152g) null, (C27160i) null, (C27156h) null, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static /* synthetic */ C27145c m114705f(C27145c cVar, C27164j jVar, C27152g gVar, C27160i iVar, C27156h hVar, int i, Object obj) {
        if ((i & 1) != 0) {
            jVar = cVar.f66011a;
        }
        if ((i & 2) != 0) {
            gVar = cVar.f66012b;
        }
        if ((i & 4) != 0) {
            iVar = cVar.f66013c;
        }
        if ((i & 8) != 0) {
            hVar = cVar.f66014d;
        }
        return cVar.mo78925e(jVar, gVar, iVar, hVar);
    }

    @C12579k
    /* renamed from: a */
    public final C27164j mo78921a() {
        return this.f66011a;
    }

    @C12579k
    /* renamed from: b */
    public final C27152g mo78922b() {
        return this.f66012b;
    }

    @C12579k
    /* renamed from: c */
    public final C27160i mo78923c() {
        return this.f66013c;
    }

    @C12579k
    /* renamed from: d */
    public final C27156h mo78924d() {
        return this.f66014d;
    }

    @C12579k
    /* renamed from: e */
    public final C27145c mo78925e(@C12579k C27164j jVar, @C12579k C27152g gVar, @C12579k C27160i iVar, @C12579k C27156h hVar) {
        Intrinsics.checkNotNullParameter(jVar, "storeState");
        Intrinsics.checkNotNullParameter(gVar, "petrolState");
        Intrinsics.checkNotNullParameter(iVar, "servicesState");
        Intrinsics.checkNotNullParameter(hVar, "reviewState");
        return new C27145c(jVar, gVar, iVar, hVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27145c)) {
            return false;
        }
        C27145c cVar = (C27145c) obj;
        return Intrinsics.areEqual((Object) this.f66011a, (Object) cVar.f66011a) && Intrinsics.areEqual((Object) this.f66012b, (Object) cVar.f66012b) && Intrinsics.areEqual((Object) this.f66013c, (Object) cVar.f66013c) && Intrinsics.areEqual((Object) this.f66014d, (Object) cVar.f66014d);
    }

    @C12579k
    /* renamed from: g */
    public final C27152g mo78927g() {
        return this.f66012b;
    }

    @C12579k
    /* renamed from: h */
    public final C27156h mo78928h() {
        return this.f66014d;
    }

    public int hashCode() {
        return (((((this.f66011a.hashCode() * 31) + this.f66012b.hashCode()) * 31) + this.f66013c.hashCode()) * 31) + this.f66014d.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C27160i mo78930i() {
        return this.f66013c;
    }

    @C12579k
    /* renamed from: j */
    public final C27164j mo78931j() {
        return this.f66011a;
    }

    @C12579k
    public String toString() {
        C27164j jVar = this.f66011a;
        C27152g gVar = this.f66012b;
        C27160i iVar = this.f66013c;
        C27156h hVar = this.f66014d;
        return "PhysicalStoreInfoUiState(storeState=" + jVar + ", petrolState=" + gVar + ", servicesState=" + iVar + ", reviewState=" + hVar + ")";
    }

    public C27145c(@C12579k C27164j jVar, @C12579k C27152g gVar, @C12579k C27160i iVar, @C12579k C27156h hVar) {
        Intrinsics.checkNotNullParameter(jVar, "storeState");
        Intrinsics.checkNotNullParameter(gVar, "petrolState");
        Intrinsics.checkNotNullParameter(iVar, "servicesState");
        Intrinsics.checkNotNullParameter(hVar, "reviewState");
        this.f66011a = jVar;
        this.f66012b = gVar;
        this.f66013c = iVar;
        this.f66014d = hVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27145c(C27164j jVar, C27152g gVar, C27160i iVar, C27156h hVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C27164j.C27166b.f66041a : jVar, (i & 2) != 0 ? C27152g.C27154b.f66022a : gVar, (i & 4) != 0 ? C27160i.C27162b.f66035a : iVar, (i & 8) != 0 ? C27156h.C27158b.f66028a : hVar);
    }
}
