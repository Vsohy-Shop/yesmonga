package androidx.compose.p004ui.text.input;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.o0 */
public final class C16309o0 implements C16293h {

    /* renamed from: c */
    public static final int f40513c = 0;

    /* renamed from: a */
    public final int f40514a;

    /* renamed from: b */
    public final int f40515b;

    public C16309o0(int i, int i2) {
        this.f40514a = i;
        this.f40515b = i2;
    }

    /* renamed from: a */
    public void mo47162a(@C12579k C16297j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "buffer");
        if (jVar.mo47212m()) {
            jVar.mo47201b();
        }
        int I = C11479u.m44334I(this.f40514a, 0, jVar.mo47208i());
        int I2 = C11479u.m44334I(this.f40515b, 0, jVar.mo47208i());
        if (I == I2) {
            return;
        }
        if (I < I2) {
            jVar.mo47215p(I, I2);
        } else {
            jVar.mo47215p(I2, I);
        }
    }

    /* renamed from: b */
    public final int mo47270b() {
        return this.f40515b;
    }

    /* renamed from: c */
    public final int mo47271c() {
        return this.f40514a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16309o0)) {
            return false;
        }
        C16309o0 o0Var = (C16309o0) obj;
        if (this.f40514a == o0Var.f40514a && this.f40515b == o0Var.f40515b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f40514a * 31) + this.f40515b;
    }

    @C12579k
    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f40514a + ", end=" + this.f40515b + ')';
    }
}
