package com.carrefour.fid.android.domain.models.slot;

import com.carrefour.fid.android.presentation.p035ui.home.shop.OnlineStoreShopFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.slot.a */
public final class C38180a {
    @C12579k

    /* renamed from: a */
    public final Slot f96726a;
    @C12579k

    /* renamed from: b */
    public final String f96727b;

    public C38180a(@C12579k Slot slot, @C12579k String str) {
        Intrinsics.checkNotNullParameter(slot, OnlineStoreShopFragment.f60516Z);
        Intrinsics.checkNotNullParameter(str, "key");
        this.f96726a = slot;
        this.f96727b = str;
    }

    /* renamed from: d */
    public static /* synthetic */ C38180a m158322d(C38180a aVar, Slot slot, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            slot = aVar.f96726a;
        }
        if ((i & 2) != 0) {
            str = aVar.f96727b;
        }
        return aVar.mo119551c(slot, str);
    }

    @C12579k
    /* renamed from: a */
    public final Slot mo119549a() {
        return this.f96726a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo119550b() {
        return this.f96727b;
    }

    @C12579k
    /* renamed from: c */
    public final C38180a mo119551c(@C12579k Slot slot, @C12579k String str) {
        Intrinsics.checkNotNullParameter(slot, OnlineStoreShopFragment.f60516Z);
        Intrinsics.checkNotNullParameter(str, "key");
        return new C38180a(slot, str);
    }

    @C12579k
    /* renamed from: e */
    public final String mo119552e() {
        return this.f96727b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38180a)) {
            return false;
        }
        C38180a aVar = (C38180a) obj;
        return Intrinsics.areEqual((Object) this.f96726a, (Object) aVar.f96726a) && Intrinsics.areEqual((Object) this.f96727b, (Object) aVar.f96727b);
    }

    @C12579k
    /* renamed from: f */
    public final Slot mo119554f() {
        return this.f96726a;
    }

    public int hashCode() {
        return (this.f96726a.hashCode() * 31) + this.f96727b.hashCode();
    }

    @C12579k
    public String toString() {
        Slot slot = this.f96726a;
        String str = this.f96727b;
        return "ServiceSlotBooked(slot=" + slot + ", key=" + str + ")";
    }
}
