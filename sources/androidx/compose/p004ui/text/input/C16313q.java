package androidx.compose.p004ui.text.input;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.text.input.q */
public final class C16313q {
    @C12579k

    /* renamed from: f */
    public static final C16314a f40529f = new C16314a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static final int f40530g = 0;
    @C12579k

    /* renamed from: h */
    public static final C16313q f40531h = new C16313q(false, 0, false, 0, 0, 31, (DefaultConstructorMarker) null);

    /* renamed from: a */
    public final boolean f40532a;

    /* renamed from: b */
    public final int f40533b;

    /* renamed from: c */
    public final boolean f40534c;

    /* renamed from: d */
    public final int f40535d;

    /* renamed from: e */
    public final int f40536e;

    /* renamed from: androidx.compose.ui.text.input.q$a */
    public static final class C16314a {
        public /* synthetic */ C16314a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C16313q mo47302a() {
            return C16313q.f40531h;
        }

        public C16314a() {
        }
    }

    public /* synthetic */ C16313q(boolean z, int i, boolean z2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, z2, i2, i3);
    }

    /* renamed from: c */
    public static /* synthetic */ C16313q m73520c(C16313q qVar, boolean z, int i, boolean z2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = qVar.f40532a;
        }
        if ((i4 & 2) != 0) {
            i = qVar.f40533b;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            z2 = qVar.f40534c;
        }
        boolean z3 = z2;
        if ((i4 & 8) != 0) {
            i2 = qVar.f40535d;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = qVar.f40536e;
        }
        return qVar.mo47293b(z, i5, z3, i6, i3);
    }

    @C12579k
    /* renamed from: b */
    public final C16313q mo47293b(boolean z, int i, boolean z2, int i2, int i3) {
        return new C16313q(z, i, z2, i2, i3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public final boolean mo47294d() {
        return this.f40534c;
    }

    /* renamed from: e */
    public final int mo47295e() {
        return this.f40533b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16313q)) {
            return false;
        }
        C16313q qVar = (C16313q) obj;
        if (this.f40532a == qVar.f40532a && C16332z.m73588h(this.f40533b, qVar.f40533b) && this.f40534c == qVar.f40534c && C16273a0.m73366m(this.f40535d, qVar.f40535d) && C16310p.m73495l(this.f40536e, qVar.f40536e)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo47297f() {
        return this.f40536e;
    }

    /* renamed from: g */
    public final int mo47298g() {
        return this.f40535d;
    }

    /* renamed from: h */
    public final boolean mo47299h() {
        return this.f40532a;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f40532a) * 31) + C16332z.m73589i(this.f40533b)) * 31) + Boolean.hashCode(this.f40534c)) * 31) + C16273a0.m73367n(this.f40535d)) * 31) + C16310p.m73496m(this.f40536e);
    }

    @C12579k
    public String toString() {
        return "ImeOptions(singleLine=" + this.f40532a + ", capitalization=" + C16332z.m73590j(this.f40533b) + ", autoCorrect=" + this.f40534c + ", keyboardType=" + C16273a0.m73368o(this.f40535d) + ", imeAction=" + C16310p.m73497n(this.f40536e) + ')';
    }

    public C16313q(boolean z, int i, boolean z2, int i2, int i3) {
        this.f40532a = z;
        this.f40533b = i;
        this.f40534c = z2;
        this.f40535d = i2;
        this.f40536e = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16313q(boolean z, int i, boolean z2, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? C16332z.f40555b.mo47339c() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? C16273a0.f40446b.mo47159o() : i2, (i4 & 16) != 0 ? C16310p.f40516b.mo47279a() : i3, (DefaultConstructorMarker) null);
    }
}
