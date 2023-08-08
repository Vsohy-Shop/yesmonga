package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.h */
public final class C23556h implements C23563o {

    /* renamed from: b */
    public static final int f59519b = 8;
    @C12579k

    /* renamed from: a */
    public final Throwable f59520a;

    public C23556h(@C12579k Throwable th) {
        Intrinsics.checkNotNullParameter(th, "error");
        this.f59520a = th;
    }

    /* renamed from: c */
    public static /* synthetic */ C23556h m104813c(C23556h hVar, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = hVar.f59520a;
        }
        return hVar.mo69031b(th);
    }

    @C12579k
    /* renamed from: a */
    public final Throwable mo69030a() {
        return this.f59520a;
    }

    @C12579k
    /* renamed from: b */
    public final C23556h mo69031b(@C12579k Throwable th) {
        Intrinsics.checkNotNullParameter(th, "error");
        return new C23556h(th);
    }

    @C12579k
    /* renamed from: d */
    public final Throwable mo69032d() {
        return this.f59520a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23556h) && Intrinsics.areEqual((Object) this.f59520a, (Object) ((C23556h) obj).f59520a);
    }

    public int hashCode() {
        return this.f59520a.hashCode();
    }

    @C12579k
    public String toString() {
        Throwable th = this.f59520a;
        return "OnClearBasketError(error=" + th + ")";
    }
}
