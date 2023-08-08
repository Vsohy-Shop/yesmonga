package androidx.compose.p004ui.semantics;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.semantics.d */
public final class C16026d {

    /* renamed from: c */
    public static final int f39780c = 0;
    @C12579k

    /* renamed from: a */
    public final String f39781a;
    @C12579k

    /* renamed from: b */
    public final C11289a<Boolean> f39782b;

    public C16026d(@C12579k String str, @C12579k C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(str, "label");
        Intrinsics.checkNotNullParameter(aVar, "action");
        this.f39781a = str;
        this.f39782b = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final C11289a<Boolean> mo46099a() {
        return this.f39782b;
    }

    @C12579k
    /* renamed from: b */
    public final String mo46100b() {
        return this.f39781a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16026d)) {
            return false;
        }
        C16026d dVar = (C16026d) obj;
        if (Intrinsics.areEqual((Object) this.f39781a, (Object) dVar.f39781a) && Intrinsics.areEqual((Object) this.f39782b, (Object) dVar.f39782b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f39781a.hashCode() * 31) + this.f39782b.hashCode();
    }

    @C12579k
    public String toString() {
        return "CustomAccessibilityAction(label=" + this.f39781a + ", action=" + this.f39782b + ')';
    }
}
