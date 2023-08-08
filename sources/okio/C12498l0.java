package okio;

import java.util.Arrays;
import kotlin.collections.C10956m;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: okio.l0 */
public final class C12498l0 {

    /* renamed from: h */
    public static final int f30454h = 8192;

    /* renamed from: i */
    public static final int f30455i = 1024;
    @C12579k

    /* renamed from: j */
    public static final C12499a f30456j = new C12499a((DefaultConstructorMarker) null);
    @C12579k
    @C11287e

    /* renamed from: a */
    public final byte[] f30457a;
    @C11287e

    /* renamed from: b */
    public int f30458b;
    @C11287e

    /* renamed from: c */
    public int f30459c;
    @C11287e

    /* renamed from: d */
    public boolean f30460d;
    @C11287e

    /* renamed from: e */
    public boolean f30461e;
    @C12580l
    @C11287e

    /* renamed from: f */
    public C12498l0 f30462f;
    @C12580l
    @C11287e

    /* renamed from: g */
    public C12498l0 f30463g;

    /* renamed from: okio.l0$a */
    public static final class C12499a {
        public C12499a() {
        }

        public /* synthetic */ C12499a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C12498l0() {
        this.f30457a = new byte[8192];
        this.f30461e = true;
        this.f30460d = false;
    }

    /* renamed from: a */
    public final void mo27320a() {
        boolean z;
        C12498l0 l0Var = this.f30463g;
        int i = 0;
        if (l0Var != this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Intrinsics.checkNotNull(l0Var);
            if (l0Var.f30461e) {
                int i2 = this.f30459c - this.f30458b;
                C12498l0 l0Var2 = this.f30463g;
                Intrinsics.checkNotNull(l0Var2);
                int i3 = 8192 - l0Var2.f30459c;
                C12498l0 l0Var3 = this.f30463g;
                Intrinsics.checkNotNull(l0Var3);
                if (!l0Var3.f30460d) {
                    C12498l0 l0Var4 = this.f30463g;
                    Intrinsics.checkNotNull(l0Var4);
                    i = l0Var4.f30458b;
                }
                if (i2 <= i3 + i) {
                    C12498l0 l0Var5 = this.f30463g;
                    Intrinsics.checkNotNull(l0Var5);
                    mo27326g(l0Var5, i2);
                    mo27321b();
                    C12504m0.m50967d(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    @C12580l
    /* renamed from: b */
    public final C12498l0 mo27321b() {
        C12498l0 l0Var = this.f30462f;
        if (l0Var == this) {
            l0Var = null;
        }
        C12498l0 l0Var2 = this.f30463g;
        Intrinsics.checkNotNull(l0Var2);
        l0Var2.f30462f = this.f30462f;
        C12498l0 l0Var3 = this.f30462f;
        Intrinsics.checkNotNull(l0Var3);
        l0Var3.f30463g = this.f30463g;
        this.f30462f = null;
        this.f30463g = null;
        return l0Var;
    }

    @C12579k
    /* renamed from: c */
    public final C12498l0 mo27322c(@C12579k C12498l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "segment");
        l0Var.f30463g = this;
        l0Var.f30462f = this.f30462f;
        C12498l0 l0Var2 = this.f30462f;
        Intrinsics.checkNotNull(l0Var2);
        l0Var2.f30463g = l0Var;
        this.f30462f = l0Var;
        return l0Var;
    }

    @C12579k
    /* renamed from: d */
    public final C12498l0 mo27323d() {
        this.f30460d = true;
        return new C12498l0(this.f30457a, this.f30458b, this.f30459c, true, false);
    }

    @C12579k
    /* renamed from: e */
    public final C12498l0 mo27324e(int i) {
        boolean z;
        C12498l0 l0Var;
        if (i <= 0 || i > this.f30459c - this.f30458b) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (i >= 1024) {
                l0Var = mo27323d();
            } else {
                l0Var = C12504m0.m50968e();
                byte[] bArr = this.f30457a;
                byte[] bArr2 = l0Var.f30457a;
                int i2 = this.f30458b;
                C10956m.m41201f1(bArr, bArr2, 0, i2, i2 + i, 2, (Object) null);
            }
            l0Var.f30459c = l0Var.f30458b + i;
            this.f30458b += i;
            C12498l0 l0Var2 = this.f30463g;
            Intrinsics.checkNotNull(l0Var2);
            l0Var2.mo27322c(l0Var);
            return l0Var;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    @C12579k
    /* renamed from: f */
    public final C12498l0 mo27325f() {
        byte[] bArr = this.f30457a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new C12498l0(copyOf, this.f30458b, this.f30459c, false, true);
    }

    /* renamed from: g */
    public final void mo27326g(@C12579k C12498l0 l0Var, int i) {
        Intrinsics.checkNotNullParameter(l0Var, "sink");
        if (l0Var.f30461e) {
            int i2 = l0Var.f30459c;
            if (i2 + i > 8192) {
                if (!l0Var.f30460d) {
                    int i3 = l0Var.f30458b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = l0Var.f30457a;
                        C10956m.m41201f1(bArr, bArr, 0, i3, i2, 2, (Object) null);
                        l0Var.f30459c -= l0Var.f30458b;
                        l0Var.f30458b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f30457a;
            byte[] bArr3 = l0Var.f30457a;
            int i4 = l0Var.f30459c;
            int i5 = this.f30458b;
            C10956m.m41147W0(bArr2, bArr3, i4, i5, i5 + i);
            l0Var.f30459c += i;
            this.f30458b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public C12498l0(@C12579k byte[] bArr, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(bArr, "data");
        this.f30457a = bArr;
        this.f30458b = i;
        this.f30459c = i2;
        this.f30460d = z;
        this.f30461e = z2;
    }
}
