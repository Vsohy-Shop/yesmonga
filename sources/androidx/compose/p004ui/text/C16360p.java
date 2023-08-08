package androidx.compose.p004ui.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.p */
public final class C16360p {
    @C12579k

    /* renamed from: a */
    public final C16401q f40600a;

    /* renamed from: b */
    public final int f40601b;

    /* renamed from: c */
    public final int f40602c;

    public C16360p(@C12579k C16401q qVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(qVar, "intrinsics");
        this.f40600a = qVar;
        this.f40601b = i;
        this.f40602c = i2;
    }

    /* renamed from: e */
    public static /* synthetic */ C16360p m73784e(C16360p pVar, C16401q qVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            qVar = pVar.f40600a;
        }
        if ((i3 & 2) != 0) {
            i = pVar.f40601b;
        }
        if ((i3 & 4) != 0) {
            i2 = pVar.f40602c;
        }
        return pVar.mo47466d(qVar, i, i2);
    }

    @C12579k
    /* renamed from: a */
    public final C16401q mo47463a() {
        return this.f40600a;
    }

    /* renamed from: b */
    public final int mo47464b() {
        return this.f40601b;
    }

    /* renamed from: c */
    public final int mo47465c() {
        return this.f40602c;
    }

    @C12579k
    /* renamed from: d */
    public final C16360p mo47466d(@C12579k C16401q qVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(qVar, "intrinsics");
        return new C16360p(qVar, i, i2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16360p)) {
            return false;
        }
        C16360p pVar = (C16360p) obj;
        return Intrinsics.areEqual((Object) this.f40600a, (Object) pVar.f40600a) && this.f40601b == pVar.f40601b && this.f40602c == pVar.f40602c;
    }

    /* renamed from: f */
    public final int mo47468f() {
        return this.f40602c;
    }

    @C12579k
    /* renamed from: g */
    public final C16401q mo47469g() {
        return this.f40600a;
    }

    /* renamed from: h */
    public final int mo47470h() {
        return this.f40601b;
    }

    public int hashCode() {
        return (((this.f40600a.hashCode() * 31) + Integer.hashCode(this.f40601b)) * 31) + Integer.hashCode(this.f40602c);
    }

    @C12579k
    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f40600a + ", startIndex=" + this.f40601b + ", endIndex=" + this.f40602c + ')';
    }
}
