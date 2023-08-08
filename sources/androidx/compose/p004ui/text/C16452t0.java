package androidx.compose.p004ui.text;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.t0 */
public final class C16452t0 extends C16405r0 {

    /* renamed from: c */
    public static final int f40778c = 0;
    @C12579k

    /* renamed from: b */
    public final String f40779b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16452t0(@C12579k String str) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "verbatim");
        this.f40779b = str;
    }

    @C12579k
    /* renamed from: a */
    public final String mo47751a() {
        return this.f40779b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C16452t0) && Intrinsics.areEqual((Object) this.f40779b, (Object) ((C16452t0) obj).f40779b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f40779b.hashCode();
    }

    @C12579k
    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f40779b + ')';
    }
}
