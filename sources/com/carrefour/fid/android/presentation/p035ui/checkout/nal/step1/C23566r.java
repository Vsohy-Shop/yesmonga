package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.r */
public final class C23566r implements C23563o {

    /* renamed from: b */
    public static final int f59533b = 8;
    @C12579k

    /* renamed from: a */
    public final Throwable f59534a;

    public C23566r(@C12579k Throwable th) {
        Intrinsics.checkNotNullParameter(th, "error");
        this.f59534a = th;
    }

    /* renamed from: c */
    public static /* synthetic */ C23566r m104821c(C23566r rVar, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = rVar.f59534a;
        }
        return rVar.mo69043b(th);
    }

    @C12579k
    /* renamed from: a */
    public final Throwable mo69042a() {
        return this.f59534a;
    }

    @C12579k
    /* renamed from: b */
    public final C23566r mo69043b(@C12579k Throwable th) {
        Intrinsics.checkNotNullParameter(th, "error");
        return new C23566r(th);
    }

    @C12579k
    /* renamed from: d */
    public final Throwable mo69044d() {
        return this.f59534a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23566r) && Intrinsics.areEqual((Object) this.f59534a, (Object) ((C23566r) obj).f59534a);
    }

    public int hashCode() {
        return this.f59534a.hashCode();
    }

    @C12579k
    public String toString() {
        Throwable th = this.f59534a;
        return "OnUpdateProductError(error=" + th + ")";
    }
}
