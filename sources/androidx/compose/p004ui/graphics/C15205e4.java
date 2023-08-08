package androidx.compose.p004ui.graphics;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.graphics.e4 */
public final class C15205e4 {
    @C12579k

    /* renamed from: d */
    public static final C15206a f37522d = new C15206a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: e */
    public static final C15205e4 f37523e = new C15205e4(0, 0, 0.0f, 7, (DefaultConstructorMarker) null);

    /* renamed from: a */
    public final long f37524a;

    /* renamed from: b */
    public final long f37525b;

    /* renamed from: c */
    public final float f37526c;

    /* renamed from: androidx.compose.ui.graphics.e4$a */
    public static final class C15206a {
        public /* synthetic */ C15206a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m65923b() {
        }

        @C12579k
        /* renamed from: a */
        public final C15205e4 mo42746a() {
            return C15205e4.f37523e;
        }

        public C15206a() {
        }
    }

    public /* synthetic */ C15205e4(long j, long j2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f);
    }

    /* renamed from: c */
    public static /* synthetic */ C15205e4 m65915c(C15205e4 e4Var, long j, long j2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = e4Var.f37524a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = e4Var.f37525b;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            f = e4Var.f37526c;
        }
        return e4Var.mo42739b(j3, j4, f);
    }

    @C8547h2
    /* renamed from: e */
    public static /* synthetic */ void m65916e() {
    }

    @C8547h2
    /* renamed from: g */
    public static /* synthetic */ void m65917g() {
    }

    @C8547h2
    /* renamed from: i */
    public static /* synthetic */ void m65918i() {
    }

    @C12579k
    /* renamed from: b */
    public final C15205e4 mo42739b(long j, long j2, float f) {
        return new C15205e4(j, j2, f, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public final float mo42740d() {
        return this.f37526c;
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15205e4)) {
            return false;
        }
        C15205e4 e4Var = (C15205e4) obj;
        if (!C15240j2.m66082y(this.f37524a, e4Var.f37524a) || !C15094f.m64876l(this.f37525b, e4Var.f37525b)) {
            return false;
        }
        if (this.f37526c == e4Var.f37526c) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final long mo42742f() {
        return this.f37524a;
    }

    /* renamed from: h */
    public final long mo42743h() {
        return this.f37525b;
    }

    public int hashCode() {
        return (((C15240j2.m66056K(this.f37524a) * 31) + C15094f.m64883s(this.f37525b)) * 31) + Float.hashCode(this.f37526c);
    }

    @C12579k
    public String toString() {
        return "Shadow(color=" + C15240j2.m66057L(this.f37524a) + ", offset=" + C15094f.m64889y(this.f37525b) + ", blurRadius=" + this.f37526c + ')';
    }

    public C15205e4(long j, long j2, float f) {
        this.f37524a = j;
        this.f37525b = j2;
        this.f37526c = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15205e4(long j, long j2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C15258l2.m66179d(4278190080L) : j, (i & 2) != 0 ? C15094f.f37256b.mo42248e() : j2, (i & 4) != 0 ? 0.0f : f, (DefaultConstructorMarker) null);
    }
}
