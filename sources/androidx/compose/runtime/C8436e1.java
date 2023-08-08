package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.e1 */
public final class C8436e1 {
    @C12579k

    /* renamed from: a */
    public final String f22800a;

    public C8436e1(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f22800a = str;
    }

    /* renamed from: c */
    public static /* synthetic */ C8436e1 m30450c(C8436e1 e1Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = e1Var.f22800a;
        }
        return e1Var.mo15567b(str);
    }

    @C12579k
    /* renamed from: a */
    public final String mo15566a() {
        return this.f22800a;
    }

    @C12579k
    /* renamed from: b */
    public final C8436e1 mo15567b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return new C8436e1(str);
    }

    @C12579k
    /* renamed from: d */
    public final String mo15568d() {
        return this.f22800a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8436e1) && Intrinsics.areEqual((Object) this.f22800a, (Object) ((C8436e1) obj).f22800a);
    }

    public int hashCode() {
        return this.f22800a.hashCode();
    }

    @C12579k
    public String toString() {
        return "OpaqueKey(key=" + this.f22800a + ')';
    }
}
