package com.carrefour.fid.android.account.presentation.p018ui.address.model;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.model.a */
public final class C13475a implements C13476b {

    /* renamed from: c */
    public static final int f32942c = 8;

    /* renamed from: a */
    public final int f32943a;
    @C12579k

    /* renamed from: b */
    public final List<DQEAddressModel> f32944b;

    public C13475a(int i, @C12579k List<DQEAddressModel> list) {
        Intrinsics.checkNotNullParameter(list, "dqeAddresses");
        this.f32943a = i;
        this.f32944b = list;
    }

    /* renamed from: d */
    public static /* synthetic */ C13475a m57965d(C13475a aVar, int i, List<DQEAddressModel> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aVar.f32943a;
        }
        if ((i2 & 2) != 0) {
            list = aVar.f32944b;
        }
        return aVar.mo32000c(i, list);
    }

    /* renamed from: a */
    public final int mo31998a() {
        return this.f32943a;
    }

    @C12579k
    /* renamed from: b */
    public final List<DQEAddressModel> mo31999b() {
        return this.f32944b;
    }

    @C12579k
    /* renamed from: c */
    public final C13475a mo32000c(int i, @C12579k List<DQEAddressModel> list) {
        Intrinsics.checkNotNullParameter(list, "dqeAddresses");
        return new C13475a(i, list);
    }

    @C12579k
    /* renamed from: e */
    public final List<DQEAddressModel> mo32001e() {
        return this.f32944b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13475a)) {
            return false;
        }
        C13475a aVar = (C13475a) obj;
        return this.f32943a == aVar.f32943a && Intrinsics.areEqual((Object) this.f32944b, (Object) aVar.f32944b);
    }

    /* renamed from: f */
    public final int mo32003f() {
        return this.f32943a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f32943a) * 31) + this.f32944b.hashCode();
    }

    @C12579k
    public String toString() {
        int i = this.f32943a;
        List<DQEAddressModel> list = this.f32944b;
        return "AddressSuggestionsModel(viewType=" + i + ", dqeAddresses=" + list + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13475a(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, list);
    }
}
