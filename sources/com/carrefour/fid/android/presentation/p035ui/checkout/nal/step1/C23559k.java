package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.k */
public final class C23559k implements C23563o {

    /* renamed from: b */
    public static final int f59525b = 8;
    @C12579k

    /* renamed from: a */
    public final Throwable f59526a;

    public C23559k(@C12579k Throwable th) {
        Intrinsics.checkNotNullParameter(th, "error");
        this.f59526a = th;
    }

    /* renamed from: c */
    public static /* synthetic */ C23559k m104817c(C23559k kVar, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = kVar.f59526a;
        }
        return kVar.mo69037b(th);
    }

    @C12579k
    /* renamed from: a */
    public final Throwable mo69036a() {
        return this.f59526a;
    }

    @C12579k
    /* renamed from: b */
    public final C23559k mo69037b(@C12579k Throwable th) {
        Intrinsics.checkNotNullParameter(th, "error");
        return new C23559k(th);
    }

    @C12579k
    /* renamed from: d */
    public final Throwable mo69038d() {
        return this.f59526a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23559k) && Intrinsics.areEqual((Object) this.f59526a, (Object) ((C23559k) obj).f59526a);
    }

    public int hashCode() {
        return this.f59526a.hashCode();
    }

    @C12579k
    public String toString() {
        Throwable th = this.f59526a;
        return "OnDeleteProductError(error=" + th + ")";
    }
}
