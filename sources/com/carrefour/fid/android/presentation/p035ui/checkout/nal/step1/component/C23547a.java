package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component;

import com.carrefour.fid.android.domain.models.product.Product;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.a */
public final class C23547a {
    @C12579k

    /* renamed from: f */
    public static final C23548a f59501f = new C23548a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final int f59502a;

    /* renamed from: b */
    public final int f59503b;

    /* renamed from: c */
    public final int f59504c;

    /* renamed from: d */
    public final int f59505d;
    @C12580l

    /* renamed from: e */
    public final Product f59506e;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.a$a */
    public static final class C23548a {
        public /* synthetic */ C23548a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C23547a mo69007a() {
            return new C23547a(-1, -1, -1, 0, (Product) null);
        }

        public C23548a() {
        }
    }

    public C23547a(int i, int i2, int i3, int i4, @C12580l Product product) {
        this.f59502a = i;
        this.f59503b = i2;
        this.f59504c = i3;
        this.f59505d = i4;
        this.f59506e = product;
    }

    /* renamed from: g */
    public static /* synthetic */ C23547a m104775g(C23547a aVar, int i, int i2, int i3, int i4, Product product, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = aVar.f59502a;
        }
        if ((i5 & 2) != 0) {
            i2 = aVar.f59503b;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = aVar.f59504c;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = aVar.f59505d;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            product = aVar.f59506e;
        }
        return aVar.mo68999f(i, i6, i7, i8, product);
    }

    /* renamed from: a */
    public final int mo68993a() {
        return this.f59502a;
    }

    /* renamed from: b */
    public final int mo68994b() {
        return this.f59503b;
    }

    /* renamed from: c */
    public final int mo68995c() {
        return this.f59504c;
    }

    /* renamed from: d */
    public final int mo68996d() {
        return this.f59505d;
    }

    @C12580l
    /* renamed from: e */
    public final Product mo68997e() {
        return this.f59506e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23547a)) {
            return false;
        }
        C23547a aVar = (C23547a) obj;
        return this.f59502a == aVar.f59502a && this.f59503b == aVar.f59503b && this.f59504c == aVar.f59504c && this.f59505d == aVar.f59505d && Intrinsics.areEqual((Object) this.f59506e, (Object) aVar.f59506e);
    }

    @C12579k
    /* renamed from: f */
    public final C23547a mo68999f(int i, int i2, int i3, int i4, @C12580l Product product) {
        return new C23547a(i, i2, i3, i4, product);
    }

    /* renamed from: h */
    public final int mo69000h() {
        return this.f59502a;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f59502a) * 31) + Integer.hashCode(this.f59503b)) * 31) + Integer.hashCode(this.f59504c)) * 31) + Integer.hashCode(this.f59505d)) * 31;
        Product product = this.f59506e;
        return hashCode + (product == null ? 0 : product.hashCode());
    }

    /* renamed from: i */
    public final int mo69002i() {
        return this.f59505d;
    }

    /* renamed from: j */
    public final int mo69003j() {
        return this.f59503b;
    }

    /* renamed from: k */
    public final int mo69004k() {
        return this.f59504c;
    }

    @C12580l
    /* renamed from: l */
    public final Product mo69005l() {
        return this.f59506e;
    }

    @C12579k
    public String toString() {
        int i = this.f59502a;
        int i2 = this.f59503b;
        int i3 = this.f59504c;
        int i4 = this.f59505d;
        Product product = this.f59506e;
        return "BottomSheetData(currentQuantity=" + i + ", maxQuantity=" + i2 + ", minQuantity=" + i3 + ", incrementQuantity=" + i4 + ", product=" + product + ")";
    }
}
