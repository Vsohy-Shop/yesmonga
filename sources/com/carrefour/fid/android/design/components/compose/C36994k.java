package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.compose.k */
public final class C36994k implements C36989i {

    /* renamed from: b */
    public static final int f92402b = 0;

    /* renamed from: a */
    public final float f92403a;

    public /* synthetic */ C36994k(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* renamed from: c */
    public static /* synthetic */ C36994k m151738c(C36994k kVar, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = kVar.f92403a;
        }
        return kVar.mo112429b(f);
    }

    /* renamed from: a */
    public final float mo112428a() {
        return this.f92403a;
    }

    @C12579k
    /* renamed from: b */
    public final C36994k mo112429b(float f) {
        return new C36994k(f, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public final float mo112430d() {
        return this.f92403a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36994k) && C16483g.m74440e0(this.f92403a, ((C36994k) obj).f92403a);
    }

    public int hashCode() {
        return C16483g.m74442h0(this.f92403a);
    }

    @C12579k
    public String toString() {
        String o0 = C16483g.m74447o0(this.f92403a);
        return "PlaceHolder(size=" + o0 + ")";
    }

    public C36994k(float f) {
        this.f92403a = f;
    }
}
