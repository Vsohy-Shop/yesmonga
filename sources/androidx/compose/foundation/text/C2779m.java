package androidx.compose.foundation.text;

import androidx.compose.p004ui.text.input.C16273a0;
import androidx.compose.p004ui.text.input.C16310p;
import androidx.compose.p004ui.text.input.C16313q;
import androidx.compose.p004ui.text.input.C16332z;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.foundation.text.m */
public final class C2779m {
    @C12579k

    /* renamed from: e */
    public static final C2780a f7294e = new C2780a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f7295f = 0;
    @C12579k

    /* renamed from: g */
    public static final C2779m f7296g = new C2779m(0, false, 0, 0, 15, (DefaultConstructorMarker) null);

    /* renamed from: a */
    public final int f7297a;

    /* renamed from: b */
    public final boolean f7298b;

    /* renamed from: c */
    public final int f7299c;

    /* renamed from: d */
    public final int f7300d;

    /* renamed from: androidx.compose.foundation.text.m$a */
    public static final class C2780a {
        public /* synthetic */ C2780a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m12609b() {
        }

        @C12579k
        /* renamed from: a */
        public final C2779m mo9541a() {
            return C2779m.f7296g;
        }

        public C2780a() {
        }
    }

    public /* synthetic */ C2779m(int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, i2, i3);
    }

    /* renamed from: c */
    public static /* synthetic */ C2779m m12601c(C2779m mVar, int i, boolean z, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = mVar.f7297a;
        }
        if ((i4 & 2) != 0) {
            z = mVar.f7298b;
        }
        if ((i4 & 4) != 0) {
            i2 = mVar.f7299c;
        }
        if ((i4 & 8) != 0) {
            i3 = mVar.f7300d;
        }
        return mVar.mo9532b(i, z, i2, i3);
    }

    /* renamed from: i */
    public static /* synthetic */ C16313q m12602i(C2779m mVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = C16313q.f40529f.mo47302a().mo47299h();
        }
        return mVar.mo9538h(z);
    }

    @C12579k
    /* renamed from: b */
    public final C2779m mo9532b(int i, boolean z, int i2, int i3) {
        return new C2779m(i, z, i2, i3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public final boolean mo9533d() {
        return this.f7298b;
    }

    /* renamed from: e */
    public final int mo9534e() {
        return this.f7297a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2779m)) {
            return false;
        }
        C2779m mVar = (C2779m) obj;
        if (C16332z.m73588h(this.f7297a, mVar.f7297a) && this.f7298b == mVar.f7298b && C16273a0.m73366m(this.f7299c, mVar.f7299c) && C16310p.m73495l(this.f7300d, mVar.f7300d)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo9536f() {
        return this.f7300d;
    }

    /* renamed from: g */
    public final int mo9537g() {
        return this.f7299c;
    }

    @C12579k
    /* renamed from: h */
    public final C16313q mo9538h(boolean z) {
        return new C16313q(z, this.f7297a, this.f7298b, this.f7299c, this.f7300d, (DefaultConstructorMarker) null);
    }

    public int hashCode() {
        return (((((C16332z.m73589i(this.f7297a) * 31) + Boolean.hashCode(this.f7298b)) * 31) + C16273a0.m73367n(this.f7299c)) * 31) + C16310p.m73496m(this.f7300d);
    }

    @C12579k
    public String toString() {
        return "KeyboardOptions(capitalization=" + C16332z.m73590j(this.f7297a) + ", autoCorrect=" + this.f7298b + ", keyboardType=" + C16273a0.m73368o(this.f7299c) + ", imeAction=" + C16310p.m73497n(this.f7300d) + ')';
    }

    public C2779m(int i, boolean z, int i2, int i3) {
        this.f7297a = i;
        this.f7298b = z;
        this.f7299c = i2;
        this.f7300d = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2779m(int i, boolean z, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? C16332z.f40555b.mo47339c() : i, (i4 & 2) != 0 ? true : z, (i4 & 4) != 0 ? C16273a0.f40446b.mo47159o() : i2, (i4 & 8) != 0 ? C16310p.f40516b.mo47279a() : i3, (DefaultConstructorMarker) null);
    }
}
