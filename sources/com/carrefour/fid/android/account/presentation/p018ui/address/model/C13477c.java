package com.carrefour.fid.android.account.presentation.p018ui.address.model;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.model.c */
public final class C13477c implements C13476b {

    /* renamed from: c */
    public static final int f32945c = 0;

    /* renamed from: a */
    public final int f32946a;

    /* renamed from: b */
    public final boolean f32947b;

    public C13477c(int i, boolean z) {
        this.f32946a = i;
        this.f32947b = z;
    }

    /* renamed from: d */
    public static /* synthetic */ C13477c m57971d(C13477c cVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cVar.f32946a;
        }
        if ((i2 & 2) != 0) {
            z = cVar.f32947b;
        }
        return cVar.mo32008c(i, z);
    }

    /* renamed from: a */
    public final int mo32006a() {
        return this.f32946a;
    }

    /* renamed from: b */
    public final boolean mo32007b() {
        return this.f32947b;
    }

    @C12579k
    /* renamed from: c */
    public final C13477c mo32008c(int i, boolean z) {
        return new C13477c(i, z);
    }

    /* renamed from: e */
    public final int mo32009e() {
        return this.f32946a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13477c)) {
            return false;
        }
        C13477c cVar = (C13477c) obj;
        return this.f32946a == cVar.f32946a && this.f32947b == cVar.f32947b;
    }

    /* renamed from: f */
    public final boolean mo32011f() {
        return this.f32947b;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f32946a) * 31;
        boolean z = this.f32947b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    public String toString() {
        int i = this.f32946a;
        boolean z = this.f32947b;
        return "VerifyAddressBottomModel(viewType=" + i + ", isSuggestionsEmpty=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13477c(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i, z);
    }
}
