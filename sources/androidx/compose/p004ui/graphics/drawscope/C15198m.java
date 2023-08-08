package androidx.compose.p004ui.graphics.drawscope;

import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15244j4;
import androidx.compose.p004ui.graphics.C15253k4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.graphics.drawscope.m */
public final class C15198m extends C15192h {
    @C12579k

    /* renamed from: f */
    public static final C15199a f37505f = new C15199a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static final float f37506g = 0.0f;

    /* renamed from: h */
    public static final float f37507h = 4.0f;

    /* renamed from: i */
    public static final int f37508i = C15244j4.f37564b.mo42862a();

    /* renamed from: j */
    public static final int f37509j = C15253k4.f37575b.mo42880b();

    /* renamed from: a */
    public final float f37510a;

    /* renamed from: b */
    public final float f37511b;

    /* renamed from: c */
    public final int f37512c;

    /* renamed from: d */
    public final int f37513d;
    @C12580l

    /* renamed from: e */
    public final C15242j3 f37514e;

    /* renamed from: androidx.compose.ui.graphics.drawscope.m$a */
    public static final class C15199a {
        public /* synthetic */ C15199a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo42729a() {
            return C15198m.f37508i;
        }

        /* renamed from: b */
        public final int mo42730b() {
            return C15198m.f37509j;
        }

        public C15199a() {
        }
    }

    public /* synthetic */ C15198m(float f, float f2, int i, int i2, C15242j3 j3Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, i, i2, j3Var);
    }

    /* renamed from: c */
    public final int mo42721c() {
        return this.f37512c;
    }

    /* renamed from: d */
    public final int mo42722d() {
        return this.f37513d;
    }

    /* renamed from: e */
    public final float mo42723e() {
        return this.f37511b;
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15198m)) {
            return false;
        }
        C15198m mVar = (C15198m) obj;
        if (this.f37510a == mVar.f37510a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f37511b == mVar.f37511b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && C15244j4.m66129g(this.f37512c, mVar.f37512c) && C15253k4.m66165g(this.f37513d, mVar.f37513d) && Intrinsics.areEqual((Object) this.f37514e, (Object) mVar.f37514e)) {
            return true;
        }
        return false;
    }

    @C12580l
    /* renamed from: f */
    public final C15242j3 mo42725f() {
        return this.f37514e;
    }

    /* renamed from: g */
    public final float mo42726g() {
        return this.f37510a;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((((Float.hashCode(this.f37510a) * 31) + Float.hashCode(this.f37511b)) * 31) + C15244j4.m66130h(this.f37512c)) * 31) + C15253k4.m66166h(this.f37513d)) * 31;
        C15242j3 j3Var = this.f37514e;
        if (j3Var != null) {
            i = j3Var.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        return "Stroke(width=" + this.f37510a + ", miter=" + this.f37511b + ", cap=" + C15244j4.m66131i(this.f37512c) + ", join=" + C15253k4.m66167i(this.f37513d) + ", pathEffect=" + this.f37514e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15198m(float f, float f2, int i, int i2, C15242j3 j3Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0.0f : f, (i3 & 2) != 0 ? 4.0f : f2, (i3 & 4) != 0 ? f37508i : i, (i3 & 8) != 0 ? f37509j : i2, (i3 & 16) != 0 ? null : j3Var, (DefaultConstructorMarker) null);
    }

    public C15198m(float f, float f2, int i, int i2, C15242j3 j3Var) {
        super((DefaultConstructorMarker) null);
        this.f37510a = f;
        this.f37511b = f2;
        this.f37512c = i;
        this.f37513d = i2;
        this.f37514e = j3Var;
    }
}
