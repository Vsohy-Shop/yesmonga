package androidx.compose.p004ui.platform;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.platform.a4 */
public final class C15846a4 {

    /* renamed from: c */
    public static final int f39478c = 8;
    @C12579k

    /* renamed from: a */
    public final String f39479a;
    @C12580l

    /* renamed from: b */
    public final Object f39480b;

    public C15846a4(@C12579k String str, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.f39479a = str;
        this.f39480b = obj;
    }

    /* renamed from: d */
    public static /* synthetic */ C15846a4 m71220d(C15846a4 a4Var, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = a4Var.f39479a;
        }
        if ((i & 2) != 0) {
            obj = a4Var.f39480b;
        }
        return a4Var.mo45641c(str, obj);
    }

    @C12579k
    /* renamed from: a */
    public final String mo45639a() {
        return this.f39479a;
    }

    @C12580l
    /* renamed from: b */
    public final Object mo45640b() {
        return this.f39480b;
    }

    @C12579k
    /* renamed from: c */
    public final C15846a4 mo45641c(@C12579k String str, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(str, "name");
        return new C15846a4(str, obj);
    }

    @C12579k
    /* renamed from: e */
    public final String mo45642e() {
        return this.f39479a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15846a4)) {
            return false;
        }
        C15846a4 a4Var = (C15846a4) obj;
        return Intrinsics.areEqual((Object) this.f39479a, (Object) a4Var.f39479a) && Intrinsics.areEqual(this.f39480b, a4Var.f39480b);
    }

    @C12580l
    /* renamed from: f */
    public final Object mo45644f() {
        return this.f39480b;
    }

    public int hashCode() {
        int hashCode = this.f39479a.hashCode() * 31;
        Object obj = this.f39480b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    @C12579k
    public String toString() {
        return "ValueElement(name=" + this.f39479a + ", value=" + this.f39480b + ')';
    }
}
