package androidx.compose.p004ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.graphics.h4 */
public final class C15225h4 extends C15421z1 {

    /* renamed from: c */
    public final long f37534c;

    public /* synthetic */ C15225h4(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* renamed from: a */
    public void mo42495a(long j, @C12579k C15211f3 f3Var, float f) {
        boolean z;
        long j2;
        Intrinsics.checkNotNullParameter(f3Var, "p");
        f3Var.mo42753g(1.0f);
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            long j3 = this.f37534c;
            j2 = C15240j2.m66080w(j3, C15240j2.m66047A(j3) * f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j2 = this.f37534c;
        }
        f3Var.mo42759l(j2);
        if (f3Var.mo42766s() != null) {
            f3Var.mo42765r((Shader) null);
        }
    }

    /* renamed from: c */
    public final long mo42781c() {
        return this.f37534c;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C15225h4) && C15240j2.m66082y(this.f37534c, ((C15225h4) obj).f37534c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C15240j2.m66056K(this.f37534c);
    }

    @C12579k
    public String toString() {
        return "SolidColor(value=" + C15240j2.m66057L(this.f37534c) + ')';
    }

    public C15225h4(long j) {
        super((DefaultConstructorMarker) null);
        this.f37534c = j;
    }
}
