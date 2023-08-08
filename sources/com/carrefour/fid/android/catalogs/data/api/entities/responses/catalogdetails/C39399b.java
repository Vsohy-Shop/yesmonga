package com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails;

import com.google.gson.annotations.C33608c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails.b */
public final class C39399b {
    @C33608c("picto_id")
    @C12579k

    /* renamed from: a */
    public final String f100760a;
    @C33608c("picto_url")
    @C12579k

    /* renamed from: b */
    public final String f100761b;

    public C39399b() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C39399b m161467d(C39399b bVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.f100760a;
        }
        if ((i & 2) != 0) {
            str2 = bVar.f100761b;
        }
        return bVar.mo130420c(str, str2);
    }

    @C12579k
    /* renamed from: a */
    public final String mo130418a() {
        return this.f100760a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo130419b() {
        return this.f100761b;
    }

    @C12579k
    /* renamed from: c */
    public final C39399b mo130420c(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "pictoID");
        Intrinsics.checkNotNullParameter(str2, "pictoURL");
        return new C39399b(str, str2);
    }

    @C12579k
    /* renamed from: e */
    public final String mo130421e() {
        return this.f100760a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39399b)) {
            return false;
        }
        C39399b bVar = (C39399b) obj;
        return Intrinsics.areEqual((Object) this.f100760a, (Object) bVar.f100760a) && Intrinsics.areEqual((Object) this.f100761b, (Object) bVar.f100761b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo130423f() {
        return this.f100761b;
    }

    public int hashCode() {
        return (this.f100760a.hashCode() * 31) + this.f100761b.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f100760a;
        String str2 = this.f100761b;
        return "CatalogProductPictoResponse(pictoID=" + str + ", pictoURL=" + str2 + ")";
    }

    public C39399b(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "pictoID");
        Intrinsics.checkNotNullParameter(str2, "pictoURL");
        this.f100760a = str;
        this.f100761b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39399b(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2);
    }
}
