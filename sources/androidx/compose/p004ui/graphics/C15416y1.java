package androidx.compose.p004ui.graphics;

import android.graphics.RenderEffect;
import androidx.annotation.C0376v0;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.graphics.y1 */
public final class C15416y1 extends C15329u3 {
    @C12580l

    /* renamed from: b */
    public final C15329u3 f38104b;

    /* renamed from: c */
    public final float f38105c;

    /* renamed from: d */
    public final float f38106d;

    /* renamed from: e */
    public final int f38107e;

    public /* synthetic */ C15416y1(C15329u3 u3Var, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(u3Var, f, f2, i);
    }

    @C0376v0(31)
    @C12579k
    /* renamed from: b */
    public RenderEffect mo42491b() {
        return C15114a4.f37340a.mo42418a(this.f38104b, this.f38105c, this.f38106d, this.f38107e);
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15416y1)) {
            return false;
        }
        C15416y1 y1Var = (C15416y1) obj;
        if (this.f38105c == y1Var.f38105c) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f38106d == y1Var.f38106d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && C15268m4.m66277h(this.f38107e, y1Var.f38107e) && Intrinsics.areEqual((Object) this.f38104b, (Object) y1Var.f38104b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        C15329u3 u3Var = this.f38104b;
        if (u3Var != null) {
            i = u3Var.hashCode();
        } else {
            i = 0;
        }
        return (((((i * 31) + Float.hashCode(this.f38105c)) * 31) + Float.hashCode(this.f38106d)) * 31) + C15268m4.m66278i(this.f38107e);
    }

    @C12579k
    public String toString() {
        return "BlurEffect(renderEffect=" + this.f38104b + ", radiusX=" + this.f38105c + ", radiusY=" + this.f38106d + ", edgeTreatment=" + C15268m4.m66279j(this.f38107e) + ')';
    }

    public C15416y1(C15329u3 u3Var, float f, float f2, int i) {
        super((DefaultConstructorMarker) null);
        this.f38104b = u3Var;
        this.f38105c = f;
        this.f38106d = f2;
        this.f38107e = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15416y1(C15329u3 u3Var, float f, float f2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(u3Var, f, (i2 & 4) != 0 ? f : f2, (i2 & 8) != 0 ? C15268m4.f37596b.mo42908a() : i, (DefaultConstructorMarker) null);
    }
}
