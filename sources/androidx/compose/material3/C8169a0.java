package androidx.compose.material3;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8251n0
@C8585m0
/* renamed from: androidx.compose.material3.a0 */
public final class C8169a0 {
    @C12579k

    /* renamed from: a */
    public final String f19978a;

    /* renamed from: b */
    public final char f19979b;
    @C12579k

    /* renamed from: c */
    public final String f19980c;

    public C8169a0(@C12579k String str, char c) {
        Intrinsics.checkNotNullParameter(str, "patternWithDelimiters");
        this.f19978a = str;
        this.f19979b = c;
        this.f19980c = C11622t.replace$default(str, String.valueOf(c), "", false, 4, (Object) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C8169a0 m26921d(C8169a0 a0Var, String str, char c, int i, Object obj) {
        if ((i & 1) != 0) {
            str = a0Var.f19978a;
        }
        if ((i & 2) != 0) {
            c = a0Var.f19979b;
        }
        return a0Var.mo12434c(str, c);
    }

    @C12579k
    /* renamed from: a */
    public final String mo12432a() {
        return this.f19978a;
    }

    /* renamed from: b */
    public final char mo12433b() {
        return this.f19979b;
    }

    @C12579k
    /* renamed from: c */
    public final C8169a0 mo12434c(@C12579k String str, char c) {
        Intrinsics.checkNotNullParameter(str, "patternWithDelimiters");
        return new C8169a0(str, c);
    }

    /* renamed from: e */
    public final char mo12435e() {
        return this.f19979b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8169a0)) {
            return false;
        }
        C8169a0 a0Var = (C8169a0) obj;
        return Intrinsics.areEqual((Object) this.f19978a, (Object) a0Var.f19978a) && this.f19979b == a0Var.f19979b;
    }

    @C12579k
    /* renamed from: f */
    public final String mo12437f() {
        return this.f19978a;
    }

    @C12579k
    /* renamed from: g */
    public final String mo12438g() {
        return this.f19980c;
    }

    public int hashCode() {
        return (this.f19978a.hashCode() * 31) + Character.hashCode(this.f19979b);
    }

    @C12579k
    public String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.f19978a + ", delimiter=" + this.f19979b + ')';
    }
}
