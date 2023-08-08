package com.carrefour.fid.android.domain.models.basket;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.basket.a */
public final class C37968a {

    /* renamed from: a */
    public final int f95529a;
    @C12580l

    /* renamed from: b */
    public final Integer f95530b;

    public C37968a(int i, @C12580l Integer num) {
        this.f95529a = i;
        this.f95530b = num;
    }

    /* renamed from: d */
    public static /* synthetic */ C37968a m156155d(C37968a aVar, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aVar.f95529a;
        }
        if ((i2 & 2) != 0) {
            num = aVar.f95530b;
        }
        return aVar.mo117023c(i, num);
    }

    /* renamed from: a */
    public final int mo117021a() {
        return this.f95529a;
    }

    @C12580l
    /* renamed from: b */
    public final Integer mo117022b() {
        return this.f95530b;
    }

    @C12579k
    /* renamed from: c */
    public final C37968a mo117023c(int i, @C12580l Integer num) {
        return new C37968a(i, num);
    }

    @C12580l
    /* renamed from: e */
    public final Integer mo117024e() {
        return this.f95530b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37968a)) {
            return false;
        }
        C37968a aVar = (C37968a) obj;
        return this.f95529a == aVar.f95529a && Intrinsics.areEqual((Object) this.f95530b, (Object) aVar.f95530b);
    }

    /* renamed from: f */
    public final int mo117026f() {
        return this.f95529a;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f95529a) * 31;
        Integer num = this.f95530b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @C12579k
    public String toString() {
        int i = this.f95529a;
        Integer num = this.f95530b;
        return "BasketQuantity(quantity=" + i + ", maxSellingQuantity=" + num + ")";
    }
}
