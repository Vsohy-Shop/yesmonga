package com.carrefour.fid.android.product.presentation.models.listable;

import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.models.listable.d */
public final class C27684d implements C37369a {

    /* renamed from: a */
    public final int f67213a;
    @C12579k

    /* renamed from: b */
    public final String f67214b;
    @C12579k

    /* renamed from: c */
    public final String f67215c;
    @C12579k

    /* renamed from: d */
    public final String f67216d;

    public C27684d(int i, @C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "imageUrl");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "query");
        this.f67213a = i;
        this.f67214b = str;
        this.f67215c = str2;
        this.f67216d = str3;
    }

    /* renamed from: f */
    public static /* synthetic */ C27684d m116469f(C27684d dVar, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dVar.f67213a;
        }
        if ((i2 & 2) != 0) {
            str = dVar.f67214b;
        }
        if ((i2 & 4) != 0) {
            str2 = dVar.f67215c;
        }
        if ((i2 & 8) != 0) {
            str3 = dVar.f67216d;
        }
        return dVar.mo80442e(i, str, str2, str3);
    }

    /* renamed from: a */
    public final int mo80438a() {
        return this.f67213a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo80439b() {
        return this.f67214b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo80440c() {
        return this.f67215c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo80441d() {
        return this.f67216d;
    }

    @C12579k
    /* renamed from: e */
    public final C27684d mo80442e(int i, @C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "imageUrl");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "query");
        return new C27684d(i, str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27684d)) {
            return false;
        }
        C27684d dVar = (C27684d) obj;
        return this.f67213a == dVar.f67213a && Intrinsics.areEqual((Object) this.f67214b, (Object) dVar.f67214b) && Intrinsics.areEqual((Object) this.f67215c, (Object) dVar.f67215c) && Intrinsics.areEqual((Object) this.f67216d, (Object) dVar.f67216d);
    }

    /* renamed from: g */
    public final int mo80444g() {
        return this.f67213a;
    }

    public int getType(@C12579k C37353b.C37354a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "typeFactory");
        return 5;
    }

    @C12579k
    /* renamed from: h */
    public final String mo80445h() {
        return this.f67214b;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f67213a) * 31) + this.f67214b.hashCode()) * 31) + this.f67215c.hashCode()) * 31) + this.f67216d.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo80447i() {
        return this.f67215c;
    }

    @C12579k
    /* renamed from: j */
    public final String mo80448j() {
        return this.f67216d;
    }

    @C12579k
    public String toString() {
        int i = this.f67213a;
        String str = this.f67214b;
        String str2 = this.f67215c;
        String str3 = this.f67216d;
        return "ListableLuckyCartBanner(id=" + i + ", imageUrl=" + str + ", name=" + str2 + ", query=" + str3 + ")";
    }
}
