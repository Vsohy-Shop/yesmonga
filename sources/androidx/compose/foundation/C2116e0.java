package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16491k;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C2855v
/* renamed from: androidx.compose.foundation.e0 */
public final class C2116e0 {
    @C12579k

    /* renamed from: g */
    public static final C2117a f5798g = new C2117a((DefaultConstructorMarker) null);

    /* renamed from: h */
    public static final int f5799h = 0;
    @C12579k

    /* renamed from: i */
    public static final C2116e0 f5800i;
    @C12579k

    /* renamed from: j */
    public static final C2116e0 f5801j;

    /* renamed from: a */
    public final boolean f5802a;

    /* renamed from: b */
    public final long f5803b;

    /* renamed from: c */
    public final float f5804c;

    /* renamed from: d */
    public final float f5805d;

    /* renamed from: e */
    public final boolean f5806e;

    /* renamed from: f */
    public final boolean f5807f;

    /* renamed from: androidx.compose.foundation.e0$a */
    public static final class C2117a {
        public /* synthetic */ C2117a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C2855v
        /* renamed from: b */
        public static /* synthetic */ void m9134b() {
        }

        @C2855v
        /* renamed from: d */
        public static /* synthetic */ void m9135d() {
        }

        /* renamed from: f */
        public static /* synthetic */ boolean m9136f(C2117a aVar, C2116e0 e0Var, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = Build.VERSION.SDK_INT;
            }
            return aVar.mo7299e(e0Var, i);
        }

        @C12579k
        /* renamed from: a */
        public final C2116e0 mo7297a() {
            return C2116e0.f5800i;
        }

        @C12579k
        /* renamed from: c */
        public final C2116e0 mo7298c() {
            return C2116e0.f5801j;
        }

        /* renamed from: e */
        public final boolean mo7299e(@C12579k C2116e0 e0Var, int i) {
            Intrinsics.checkNotNullParameter(e0Var, "style");
            if (!MagnifierKt.m8978b(i) || e0Var.mo7291f()) {
                return false;
            }
            if (e0Var.mo7293h() || Intrinsics.areEqual((Object) e0Var, (Object) mo7297a()) || i >= 29) {
                return true;
            }
            return false;
        }

        public C2117a() {
        }
    }

    static {
        C2116e0 e0Var = new C2116e0(0, 0.0f, 0.0f, false, false, 31, (DefaultConstructorMarker) null);
        f5800i = e0Var;
        f5801j = new C2116e0(true, e0Var.f5803b, e0Var.f5804c, e0Var.f5805d, e0Var.f5806e, e0Var.f5807f, (DefaultConstructorMarker) null);
    }

    @C2855v
    public /* synthetic */ C2116e0(long j, float f, float f2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, f2, z, z2);
    }

    /* renamed from: c */
    public final boolean mo7287c() {
        return this.f5806e;
    }

    /* renamed from: d */
    public final float mo7288d() {
        return this.f5804c;
    }

    /* renamed from: e */
    public final float mo7289e() {
        return this.f5805d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2116e0)) {
            return false;
        }
        C2116e0 e0Var = (C2116e0) obj;
        if (this.f5802a == e0Var.f5802a && C16491k.m74554l(this.f5803b, e0Var.f5803b) && C16483g.m74440e0(this.f5804c, e0Var.f5804c) && C16483g.m74440e0(this.f5805d, e0Var.f5805d) && this.f5806e == e0Var.f5806e && this.f5807f == e0Var.f5807f) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo7291f() {
        return this.f5807f;
    }

    /* renamed from: g */
    public final long mo7292g() {
        return this.f5803b;
    }

    /* renamed from: h */
    public final boolean mo7293h() {
        return this.f5802a;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f5802a) * 31) + C16491k.m74560r(this.f5803b)) * 31) + C16483g.m74442h0(this.f5804c)) * 31) + C16483g.m74442h0(this.f5805d)) * 31) + Boolean.hashCode(this.f5806e)) * 31) + Boolean.hashCode(this.f5807f);
    }

    /* renamed from: i */
    public final boolean mo7295i() {
        return C2117a.m9136f(f5798g, this, 0, 2, (Object) null);
    }

    @C12579k
    public String toString() {
        if (this.f5802a) {
            return "MagnifierStyle.TextDefault";
        }
        return "MagnifierStyle(size=" + C16491k.m74565w(this.f5803b) + ", cornerRadius=" + C16483g.m74447o0(this.f5804c) + ", elevation=" + C16483g.m74447o0(this.f5805d) + ", clippingEnabled=" + this.f5806e + ", fishEyeEnabled=" + this.f5807f + ')';
    }

    public /* synthetic */ C2116e0(boolean z, long j, float f, float f2, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j, f, f2, z2, z3);
    }

    public C2116e0(boolean z, long j, float f, float f2, boolean z2, boolean z3) {
        this.f5802a = z;
        this.f5803b = j;
        this.f5804c = f;
        this.f5805d = f2;
        this.f5806e = z2;
        this.f5807f = z3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C2116e0(long r8, float r10, float r11, boolean r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r0 = r14 & 1
            if (r0 == 0) goto L_0x000b
            androidx.compose.ui.unit.k$a r0 = androidx.compose.p004ui.unit.C16491k.f40886b
            long r0 = r0.mo47851a()
            goto L_0x000c
        L_0x000b:
            r0 = r8
        L_0x000c:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0017
            androidx.compose.ui.unit.g$a r2 = androidx.compose.p004ui.unit.C16483g.f40871b
            float r2 = r2.mo47828e()
            goto L_0x0018
        L_0x0017:
            r2 = r10
        L_0x0018:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x0023
            androidx.compose.ui.unit.g$a r3 = androidx.compose.p004ui.unit.C16483g.f40871b
            float r3 = r3.mo47828e()
            goto L_0x0024
        L_0x0023:
            r3 = r11
        L_0x0024:
            r4 = r14 & 8
            if (r4 == 0) goto L_0x002a
            r4 = 1
            goto L_0x002b
        L_0x002a:
            r4 = r12
        L_0x002b:
            r5 = r14 & 16
            if (r5 == 0) goto L_0x0031
            r5 = 0
            goto L_0x0032
        L_0x0031:
            r5 = r13
        L_0x0032:
            r6 = 0
            r8 = r7
            r9 = r0
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r8.<init>((long) r9, (float) r11, (float) r12, (boolean) r13, (boolean) r14, (kotlin.jvm.internal.DefaultConstructorMarker) r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C2116e0.<init>(long, float, float, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public C2116e0(long j, float f, float f2, boolean z, boolean z2) {
        this(false, j, f, f2, z, z2, (DefaultConstructorMarker) null);
    }
}
