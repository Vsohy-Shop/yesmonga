package com.carrefour.fid.android.account.presentation.p018ui.address.model;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.model.d */
public final class C13478d implements C13476b {

    /* renamed from: c */
    public static final int f32948c = 0;

    /* renamed from: a */
    public final int f32949a;
    @C12579k

    /* renamed from: b */
    public final String f32950b;

    public C13478d(int i, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "entryAddress");
        this.f32949a = i;
        this.f32950b = str;
    }

    /* renamed from: d */
    public static /* synthetic */ C13478d m57977d(C13478d dVar, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dVar.f32949a;
        }
        if ((i2 & 2) != 0) {
            str = dVar.f32950b;
        }
        return dVar.mo32016c(i, str);
    }

    /* renamed from: a */
    public final int mo32014a() {
        return this.f32949a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo32015b() {
        return this.f32950b;
    }

    @C12579k
    /* renamed from: c */
    public final C13478d mo32016c(int i, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "entryAddress");
        return new C13478d(i, str);
    }

    @C12579k
    /* renamed from: e */
    public final String mo32017e() {
        return this.f32950b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13478d)) {
            return false;
        }
        C13478d dVar = (C13478d) obj;
        return this.f32949a == dVar.f32949a && Intrinsics.areEqual((Object) this.f32950b, (Object) dVar.f32950b);
    }

    /* renamed from: f */
    public final int mo32019f() {
        return this.f32949a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f32949a) * 31) + this.f32950b.hashCode();
    }

    @C12579k
    public String toString() {
        int i = this.f32949a;
        String str = this.f32950b;
        return "VerifyAddressHeaderModel(viewType=" + i + ", entryAddress=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13478d(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str);
    }
}
