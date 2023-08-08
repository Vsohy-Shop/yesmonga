package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import androidx.compose.p004ui.text.style.C16449r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.a */
public final class C27926a {

    /* renamed from: a */
    public final int f67750a;

    /* renamed from: b */
    public final int f67751b;

    public /* synthetic */ C27926a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    /* renamed from: d */
    public static /* synthetic */ C27926a m117282d(C27926a aVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = aVar.f67750a;
        }
        if ((i3 & 2) != 0) {
            i2 = aVar.f67751b;
        }
        return aVar.mo81325c(i, i2);
    }

    /* renamed from: a */
    public final int mo81323a() {
        return this.f67750a;
    }

    /* renamed from: b */
    public final int mo81324b() {
        return this.f67751b;
    }

    @C12579k
    /* renamed from: c */
    public final C27926a mo81325c(int i, int i2) {
        return new C27926a(i, i2, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public final int mo81326e() {
        return this.f67751b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27926a)) {
            return false;
        }
        C27926a aVar = (C27926a) obj;
        return C16449r.m74263g(this.f67750a, aVar.f67750a) && this.f67751b == aVar.f67751b;
    }

    /* renamed from: f */
    public final int mo81328f() {
        return this.f67750a;
    }

    public int hashCode() {
        return (C16449r.m74264h(this.f67750a) * 31) + Integer.hashCode(this.f67751b);
    }

    @C12579k
    public String toString() {
        String i = C16449r.m74265i(this.f67750a);
        int i2 = this.f67751b;
        return "DescriptionItem(overflow=" + i + ", maxLines=" + i2 + ")";
    }

    public C27926a(int i, int i2) {
        this.f67750a = i;
        this.f67751b = i2;
    }
}
