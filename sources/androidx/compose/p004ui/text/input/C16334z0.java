package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.z0 */
public final class C16334z0 {

    /* renamed from: c */
    public static final int f40561c = 8;
    @C12579k

    /* renamed from: a */
    public final C16156d f40562a;
    @C12579k

    /* renamed from: b */
    public final C16281c0 f40563b;

    public C16334z0(@C12579k C16156d dVar, @C12579k C16281c0 c0Var) {
        Intrinsics.checkNotNullParameter(dVar, "text");
        Intrinsics.checkNotNullParameter(c0Var, "offsetMapping");
        this.f40562a = dVar;
        this.f40563b = c0Var;
    }

    @C12579k
    /* renamed from: a */
    public final C16281c0 mo47342a() {
        return this.f40563b;
    }

    @C12579k
    /* renamed from: b */
    public final C16156d mo47343b() {
        return this.f40562a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16334z0)) {
            return false;
        }
        C16334z0 z0Var = (C16334z0) obj;
        if (Intrinsics.areEqual((Object) this.f40562a, (Object) z0Var.f40562a) && Intrinsics.areEqual((Object) this.f40563b, (Object) z0Var.f40563b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f40562a.hashCode() * 31) + this.f40563b.hashCode();
    }

    @C12579k
    public String toString() {
        return "TransformedText(text=" + this.f40562a + ", offsetMapping=" + this.f40563b + ')';
    }
}
