package com.carrefour.fid.android.domain.models.luckycart;

import com.carrefour.fid.android.domain.models.C38184v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.luckycart.a */
public final class C38047a implements C38184v {
    @C12579k

    /* renamed from: a */
    public final String f95925a;
    @C12579k

    /* renamed from: b */
    public final String f95926b;
    @C12579k

    /* renamed from: c */
    public final String f95927c;
    @C12579k

    /* renamed from: d */
    public final String f95928d;

    public C38047a(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "imageUrl");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "query");
        Intrinsics.checkNotNullParameter(str4, "trackingUrl");
        this.f95925a = str;
        this.f95926b = str2;
        this.f95927c = str3;
        this.f95928d = str4;
    }

    /* renamed from: f */
    public static /* synthetic */ C38047a m156916f(C38047a aVar, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f95925a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.f95926b;
        }
        if ((i & 4) != 0) {
            str3 = aVar.f95927c;
        }
        if ((i & 8) != 0) {
            str4 = aVar.f95928d;
        }
        return aVar.mo117893e(str, str2, str3, str4);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117889a() {
        return this.f95925a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo117890b() {
        return this.f95926b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo117891c() {
        return this.f95927c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo117892d() {
        return this.f95928d;
    }

    @C12579k
    /* renamed from: e */
    public final C38047a mo117893e(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "imageUrl");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "query");
        Intrinsics.checkNotNullParameter(str4, "trackingUrl");
        return new C38047a(str, str2, str3, str4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38047a)) {
            return false;
        }
        C38047a aVar = (C38047a) obj;
        return Intrinsics.areEqual((Object) this.f95925a, (Object) aVar.f95925a) && Intrinsics.areEqual((Object) this.f95926b, (Object) aVar.f95926b) && Intrinsics.areEqual((Object) this.f95927c, (Object) aVar.f95927c) && Intrinsics.areEqual((Object) this.f95928d, (Object) aVar.f95928d);
    }

    @C12579k
    /* renamed from: g */
    public final String mo117895g() {
        return this.f95925a;
    }

    @C12579k
    /* renamed from: h */
    public final String mo117896h() {
        return this.f95926b;
    }

    public int hashCode() {
        return (((((this.f95925a.hashCode() * 31) + this.f95926b.hashCode()) * 31) + this.f95927c.hashCode()) * 31) + this.f95928d.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo117898i() {
        return this.f95927c;
    }

    @C12579k
    /* renamed from: j */
    public final String mo117899j() {
        return this.f95928d;
    }

    @C12579k
    public String toString() {
        String str = this.f95925a;
        String str2 = this.f95926b;
        String str3 = this.f95927c;
        String str4 = this.f95928d;
        return "LuckyCartBannerDetails(imageUrl=" + str + ", name=" + str2 + ", query=" + str3 + ", trackingUrl=" + str4 + ")";
    }
}
