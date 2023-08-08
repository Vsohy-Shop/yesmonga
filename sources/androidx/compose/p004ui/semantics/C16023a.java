package androidx.compose.p004ui.semantics;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11660u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 1)
/* renamed from: androidx.compose.ui.semantics.a */
public final class C16023a<T extends C11660u<? extends Boolean>> {

    /* renamed from: c */
    public static final int f39769c = 0;
    @C12580l

    /* renamed from: a */
    public final String f39770a;
    @C12580l

    /* renamed from: b */
    public final T f39771b;

    public C16023a(@C12580l String str, @C12580l T t) {
        this.f39770a = str;
        this.f39771b = t;
    }

    @C12580l
    /* renamed from: a */
    public final T mo46088a() {
        return this.f39771b;
    }

    @C12580l
    /* renamed from: b */
    public final String mo46089b() {
        return this.f39770a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16023a)) {
            return false;
        }
        C16023a aVar = (C16023a) obj;
        if (Intrinsics.areEqual((Object) this.f39770a, (Object) aVar.f39770a) && Intrinsics.areEqual((Object) this.f39771b, (Object) aVar.f39771b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.f39770a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        T t = this.f39771b;
        if (t != null) {
            i2 = t.hashCode();
        }
        return i3 + i2;
    }

    @C12579k
    public String toString() {
        return "AccessibilityAction(label=" + this.f39770a + ", action=" + this.f39771b + ')';
    }
}
