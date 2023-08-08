package com.carrefour.fid.android.checkout.presentation.p071ui.slot.model;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.model.a */
public final class C39935a implements C39938d {

    /* renamed from: b */
    public static final int f101837b = 0;

    /* renamed from: a */
    public final int f101838a;

    public C39935a() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C39935a m162724c(C39935a aVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aVar.f101838a;
        }
        return aVar.mo131674b(i);
    }

    /* renamed from: a */
    public final int mo131673a() {
        return this.f101838a;
    }

    @C12579k
    /* renamed from: b */
    public final C39935a mo131674b(int i) {
        return new C39935a(i);
    }

    /* renamed from: d */
    public final int mo131675d() {
        return this.f101838a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39935a) && this.f101838a == ((C39935a) obj).f101838a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f101838a);
    }

    @C12579k
    public String toString() {
        int i = this.f101838a;
        return "ServiceSlotBottomModel(viewType=" + i + ")";
    }

    public C39935a(int i) {
        this.f101838a = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39935a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i);
    }
}
