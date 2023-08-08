package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.u */
public final class C23569u implements C23563o {

    /* renamed from: b */
    public static final int f59539b = 8;
    @C12579k

    /* renamed from: a */
    public final Throwable f59540a;

    public C23569u(@C12579k Throwable th) {
        Intrinsics.checkNotNullParameter(th, "error");
        this.f59540a = th;
    }

    /* renamed from: c */
    public static /* synthetic */ C23569u m104825c(C23569u uVar, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = uVar.f59540a;
        }
        return uVar.mo69049b(th);
    }

    @C12579k
    /* renamed from: a */
    public final Throwable mo69048a() {
        return this.f59540a;
    }

    @C12579k
    /* renamed from: b */
    public final C23569u mo69049b(@C12579k Throwable th) {
        Intrinsics.checkNotNullParameter(th, "error");
        return new C23569u(th);
    }

    @C12579k
    /* renamed from: d */
    public final Throwable mo69050d() {
        return this.f59540a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23569u) && Intrinsics.areEqual((Object) this.f59540a, (Object) ((C23569u) obj).f59540a);
    }

    public int hashCode() {
        return this.f59540a.hashCode();
    }

    @C12579k
    public String toString() {
        Throwable th = this.f59540a;
        return "OnValidationBasketError(error=" + th + ")";
    }
}
