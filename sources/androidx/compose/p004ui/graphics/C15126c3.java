package androidx.compose.p004ui.graphics;

import android.graphics.RenderEffect;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.graphics.c3 */
public final class C15126c3 extends C15329u3 {
    @C12580l

    /* renamed from: b */
    public final C15329u3 f37361b;

    /* renamed from: c */
    public final long f37362c;

    public /* synthetic */ C15126c3(C15329u3 u3Var, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(u3Var, j);
    }

    @C0376v0(31)
    @C12579k
    /* renamed from: b */
    public RenderEffect mo42491b() {
        return C15114a4.f37340a.mo42419b(this.f37361b, this.f37362c);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15126c3)) {
            return false;
        }
        C15126c3 c3Var = (C15126c3) obj;
        if (Intrinsics.areEqual((Object) this.f37361b, (Object) c3Var.f37361b) && C15094f.m64876l(this.f37362c, c3Var.f37362c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        C15329u3 u3Var = this.f37361b;
        if (u3Var != null) {
            i = u3Var.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + C15094f.m64883s(this.f37362c);
    }

    @C12579k
    public String toString() {
        return "OffsetEffect(renderEffect=" + this.f37361b + ", offset=" + C15094f.m64889y(this.f37362c) + ')';
    }

    public C15126c3(C15329u3 u3Var, long j) {
        super((DefaultConstructorMarker) null);
        this.f37361b = u3Var;
        this.f37362c = j;
    }
}
