package com.carrefour.fid.android.domain.models.service.models;

import com.carrefour.fid.android.shared.constant.C28531e0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.service.models.e */
public final class C38152e {
    @C12579k

    /* renamed from: a */
    public final String f96634a;
    @C12579k

    /* renamed from: b */
    public final String f96635b;
    @C12579k

    /* renamed from: c */
    public final StoreAddress f96636c;
    @C12579k

    /* renamed from: d */
    public final List<StoreService> f96637d;

    /* renamed from: e */
    public final boolean f96638e;

    public C38152e(@C12579k String str, @C12579k String str2, @C12579k StoreAddress storeAddress, @C12579k List<StoreService> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(storeAddress, "address");
        Intrinsics.checkNotNullParameter(list, C28531e0.f69095y);
        this.f96634a = str;
        this.f96635b = str2;
        this.f96636c = storeAddress;
        this.f96637d = list;
        this.f96638e = z;
    }

    /* renamed from: g */
    public static /* synthetic */ C38152e m158096g(C38152e eVar, String str, String str2, StoreAddress storeAddress, List<StoreService> list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVar.f96634a;
        }
        if ((i & 2) != 0) {
            str2 = eVar.f96635b;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            storeAddress = eVar.f96636c;
        }
        StoreAddress storeAddress2 = storeAddress;
        if ((i & 8) != 0) {
            list = eVar.f96637d;
        }
        List<StoreService> list2 = list;
        if ((i & 16) != 0) {
            z = eVar.f96638e;
        }
        return eVar.mo119278f(str, str3, storeAddress2, list2, z);
    }

    @C12579k
    /* renamed from: a */
    public final String mo119272a() {
        return this.f96634a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo119273b() {
        return this.f96635b;
    }

    @C12579k
    /* renamed from: c */
    public final StoreAddress mo119274c() {
        return this.f96636c;
    }

    @C12579k
    /* renamed from: d */
    public final List<StoreService> mo119275d() {
        return this.f96637d;
    }

    /* renamed from: e */
    public final boolean mo119276e() {
        return this.f96638e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38152e)) {
            return false;
        }
        C38152e eVar = (C38152e) obj;
        return Intrinsics.areEqual((Object) this.f96634a, (Object) eVar.f96634a) && Intrinsics.areEqual((Object) this.f96635b, (Object) eVar.f96635b) && Intrinsics.areEqual((Object) this.f96636c, (Object) eVar.f96636c) && Intrinsics.areEqual((Object) this.f96637d, (Object) eVar.f96637d) && this.f96638e == eVar.f96638e;
    }

    @C12579k
    /* renamed from: f */
    public final C38152e mo119278f(@C12579k String str, @C12579k String str2, @C12579k StoreAddress storeAddress, @C12579k List<StoreService> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(storeAddress, "address");
        Intrinsics.checkNotNullParameter(list, C28531e0.f69095y);
        return new C38152e(str, str2, storeAddress, list, z);
    }

    @C12579k
    /* renamed from: h */
    public final StoreAddress mo119279h() {
        return this.f96636c;
    }

    public int hashCode() {
        int hashCode = ((((((this.f96634a.hashCode() * 31) + this.f96635b.hashCode()) * 31) + this.f96636c.hashCode()) * 31) + this.f96637d.hashCode()) * 31;
        boolean z = this.f96638e;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    /* renamed from: i */
    public final String mo119281i() {
        return this.f96634a;
    }

    @C12579k
    /* renamed from: j */
    public final String mo119282j() {
        return this.f96635b;
    }

    @C12579k
    /* renamed from: k */
    public final List<StoreService> mo119283k() {
        return this.f96637d;
    }

    /* renamed from: l */
    public final boolean mo119284l() {
        return this.f96638e;
    }

    @C12579k
    public String toString() {
        String str = this.f96634a;
        String str2 = this.f96635b;
        StoreAddress storeAddress = this.f96636c;
        List<StoreService> list = this.f96637d;
        boolean z = this.f96638e;
        return "FacilityDetails(id=" + str + ", name=" + str2 + ", address=" + storeAddress + ", services=" + list + ", isLloyaltyActivated=" + z + ")";
    }
}
