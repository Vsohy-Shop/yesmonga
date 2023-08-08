package androidx.compose.p004ui.text;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C16259h
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.s0 */
public final class C16407s0 {

    /* renamed from: b */
    public static final int f40658b = 0;
    @C12579k

    /* renamed from: a */
    public final String f40659a;

    public C16407s0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        this.f40659a = str;
    }

    @C12579k
    /* renamed from: a */
    public final String mo47573a() {
        return this.f40659a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C16407s0) && Intrinsics.areEqual((Object) this.f40659a, (Object) ((C16407s0) obj).f40659a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f40659a.hashCode();
    }

    @C12579k
    public String toString() {
        return "UrlAnnotation(url=" + this.f40659a + ')';
    }
}
