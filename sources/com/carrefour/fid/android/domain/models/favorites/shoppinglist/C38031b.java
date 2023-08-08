package com.carrefour.fid.android.domain.models.favorites.shoppinglist;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.favorites.shoppinglist.b */
public final class C38031b {
    @C12579k

    /* renamed from: a */
    public final String f95864a;
    @C12579k

    /* renamed from: b */
    public final String f95865b;
    @C12579k

    /* renamed from: c */
    public final String f95866c;

    /* renamed from: d */
    public final int f95867d;

    public C38031b() {
        this((String) null, (String) null, (String) null, 0, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static /* synthetic */ C38031b m156794f(C38031b bVar, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bVar.f95864a;
        }
        if ((i2 & 2) != 0) {
            str2 = bVar.f95865b;
        }
        if ((i2 & 4) != 0) {
            str3 = bVar.f95866c;
        }
        if ((i2 & 8) != 0) {
            i = bVar.f95867d;
        }
        return bVar.mo117706e(str, str2, str3, i);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117702a() {
        return this.f95864a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo117703b() {
        return this.f95865b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo117704c() {
        return this.f95866c;
    }

    /* renamed from: d */
    public final int mo117705d() {
        return this.f95867d;
    }

    @C12579k
    /* renamed from: e */
    public final C38031b mo117706e(@C12579k String str, @C12579k String str2, @C12579k String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "label");
        Intrinsics.checkNotNullParameter(str3, "type");
        return new C38031b(str, str2, str3, i);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38031b)) {
            return false;
        }
        C38031b bVar = (C38031b) obj;
        return Intrinsics.areEqual((Object) this.f95864a, (Object) bVar.f95864a) && Intrinsics.areEqual((Object) this.f95865b, (Object) bVar.f95865b) && Intrinsics.areEqual((Object) this.f95866c, (Object) bVar.f95866c) && this.f95867d == bVar.f95867d;
    }

    @C12579k
    /* renamed from: g */
    public final String mo117708g() {
        return this.f95864a;
    }

    /* renamed from: h */
    public final int mo117709h() {
        return this.f95867d;
    }

    public int hashCode() {
        return (((((this.f95864a.hashCode() * 31) + this.f95865b.hashCode()) * 31) + this.f95866c.hashCode()) * 31) + Integer.hashCode(this.f95867d);
    }

    @C12579k
    /* renamed from: i */
    public final String mo117711i() {
        return this.f95865b;
    }

    @C12579k
    /* renamed from: j */
    public final String mo117712j() {
        return this.f95866c;
    }

    @C12579k
    public String toString() {
        String str = this.f95864a;
        String str2 = this.f95865b;
        String str3 = this.f95866c;
        int i = this.f95867d;
        return "ShoppingListMetadata(id=" + str + ", label=" + str2 + ", type=" + str3 + ", itemCount=" + i + ")";
    }

    public C38031b(@C12579k String str, @C12579k String str2, @C12579k String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "label");
        Intrinsics.checkNotNullParameter(str3, "type");
        this.f95864a = str;
        this.f95865b = str2;
        this.f95866c = str3;
        this.f95867d = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38031b(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i);
    }
}
