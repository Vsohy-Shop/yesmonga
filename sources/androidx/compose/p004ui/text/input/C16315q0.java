package androidx.compose.p004ui.text.input;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.q0 */
public final class C16315q0 implements C16293h {

    /* renamed from: c */
    public static final int f40537c = 0;

    /* renamed from: a */
    public final int f40538a;

    /* renamed from: b */
    public final int f40539b;

    public C16315q0(int i, int i2) {
        this.f40538a = i;
        this.f40539b = i2;
    }

    /* renamed from: a */
    public void mo47162a(@C12579k C16297j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "buffer");
        int I = C11479u.m44334I(this.f40538a, 0, jVar.mo47208i());
        int I2 = C11479u.m44334I(this.f40539b, 0, jVar.mo47208i());
        if (I < I2) {
            jVar.mo47217r(I, I2);
        } else {
            jVar.mo47217r(I2, I);
        }
    }

    /* renamed from: b */
    public final int mo47303b() {
        return this.f40539b;
    }

    /* renamed from: c */
    public final int mo47304c() {
        return this.f40538a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16315q0)) {
            return false;
        }
        C16315q0 q0Var = (C16315q0) obj;
        if (this.f40538a == q0Var.f40538a && this.f40539b == q0Var.f40539b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f40538a * 31) + this.f40539b;
    }

    @C12579k
    public String toString() {
        return "SetSelectionCommand(start=" + this.f40538a + ", end=" + this.f40539b + ')';
    }
}
