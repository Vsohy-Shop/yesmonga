package androidx.compose.p004ui.text.font;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.font.l0 */
public final class C16221l0 extends C16242u {

    /* renamed from: x */
    public static final int f40319x = 0;
    @C12579k

    /* renamed from: w */
    public final C16251x0 f40320w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16221l0(@C12579k C16251x0 x0Var) {
        super(true, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(x0Var, "typeface");
        this.f40320w = x0Var;
    }

    @C12579k
    /* renamed from: H */
    public final C16251x0 mo46980H() {
        return this.f40320w;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C16221l0) && Intrinsics.areEqual((Object) this.f40320w, (Object) ((C16221l0) obj).f40320w)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f40320w.hashCode();
    }

    @C12579k
    public String toString() {
        return "LoadedFontFamily(typeface=" + this.f40320w + ')';
    }
}
