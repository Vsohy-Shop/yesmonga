package androidx.compose.p004ui.graphics;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16502r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.b2 */
public interface C15118b2 {

    /* renamed from: androidx.compose.ui.graphics.b2$a */
    public static final class C15119a {
        @Deprecated
        /* renamed from: c */
        public static void m65225c(@C12579k C15118b2 b2Var, @C12579k C15098i iVar, int i) {
            Intrinsics.checkNotNullParameter(iVar, "rect");
            C15118b2.super.mo42426I(iVar, i);
        }

        @Deprecated
        /* renamed from: e */
        public static void m65227e(@C12579k C15118b2 b2Var, @C12579k C15098i iVar, float f, float f2, boolean z, @C12579k C15211f3 f3Var) {
            Intrinsics.checkNotNullParameter(iVar, "rect");
            Intrinsics.checkNotNullParameter(f3Var, "paint");
            C15118b2.super.mo42442o(iVar, f, f2, z, f3Var);
        }

        @Deprecated
        /* renamed from: f */
        public static void m65228f(@C12579k C15118b2 b2Var, @C12579k C15098i iVar, float f, float f2, boolean z, @C12579k C15211f3 f3Var) {
            Intrinsics.checkNotNullParameter(iVar, "rect");
            Intrinsics.checkNotNullParameter(f3Var, "paint");
            C15118b2.super.mo42446v(iVar, f, f2, z, f3Var);
        }

        @Deprecated
        /* renamed from: h */
        public static void m65230h(@C12579k C15118b2 b2Var, @C12579k C15098i iVar, @C12579k C15211f3 f3Var) {
            Intrinsics.checkNotNullParameter(iVar, "rect");
            Intrinsics.checkNotNullParameter(f3Var, "paint");
            C15118b2.super.mo42425H(iVar, f3Var);
        }

        @Deprecated
        /* renamed from: i */
        public static void m65231i(@C12579k C15118b2 b2Var, @C12579k C15098i iVar, @C12579k C15211f3 f3Var) {
            Intrinsics.checkNotNullParameter(iVar, "rect");
            Intrinsics.checkNotNullParameter(f3Var, "paint");
            C15118b2.super.mo42428K(iVar, f3Var);
        }

        @Deprecated
        /* renamed from: k */
        public static void m65233k(@C12579k C15118b2 b2Var, float f, float f2) {
            C15118b2.super.mo42449z(f, f2);
        }
    }

    /* renamed from: B */
    static /* synthetic */ void m65182B(C15118b2 b2Var, C15098i iVar, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = C15229i2.f37536b.mo42798b();
            }
            b2Var.mo42426I(iVar, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
    }

    /* renamed from: C */
    static /* synthetic */ void m65183C(C15118b2 b2Var, float f, float f2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f2 = f;
            }
            b2Var.mo42434f(f, f2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
    }

    /* renamed from: N */
    static /* synthetic */ void m65185N(C15118b2 b2Var, C15403w2 w2Var, long j, long j2, long j3, long j4, C15211f3 f3Var, int i, Object obj) {
        long j5;
        long j6;
        long j7;
        long j8;
        if (obj == null) {
            if ((i & 2) != 0) {
                j5 = C16494m.f40890b.mo47857a();
            } else {
                j5 = j;
            }
            if ((i & 4) != 0) {
                j6 = C16502r.m74668a(w2Var.getWidth(), w2Var.getHeight());
            } else {
                j6 = j2;
            }
            if ((i & 8) != 0) {
                j7 = C16494m.f40890b.mo47857a();
            } else {
                j7 = j3;
            }
            if ((i & 16) != 0) {
                j8 = j6;
            } else {
                j8 = j4;
            }
            b2Var.mo42438j(w2Var, j5, j6, j7, j8, f3Var);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
    }

    /* renamed from: r */
    static /* synthetic */ void m65190r(C15118b2 b2Var, C15231i3 i3Var, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = C15229i2.f37536b.mo42798b();
            }
            b2Var.mo42432d(i3Var, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    /* renamed from: w */
    static /* synthetic */ void m65192w(C15118b2 b2Var, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 16) != 0) {
                i = C15229i2.f37536b.mo42798b();
            }
            b2Var.mo42431c(f, f2, f3, f4, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    /* renamed from: A */
    void mo42420A(float f);

    /* renamed from: D */
    void mo42421D(float f, float f2);

    /* renamed from: E */
    void mo42422E();

    /* renamed from: F */
    void mo42423F();

    /* renamed from: G */
    void mo42424G(@C12579k float[] fArr);

    /* renamed from: H */
    void mo42425H(@C12579k C15098i iVar, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(iVar, "rect");
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        mo42436h(iVar.mo42279t(), iVar.mo42249B(), iVar.mo42283x(), iVar.mo42271j(), f3Var);
    }

    /* renamed from: I */
    void mo42426I(@C12579k C15098i iVar, int i) {
        Intrinsics.checkNotNullParameter(iVar, "rect");
        mo42431c(iVar.mo42279t(), iVar.mo42249B(), iVar.mo42283x(), iVar.mo42271j(), i);
    }

    /* renamed from: J */
    void mo42427J(@C12579k C15231i3 i3Var, @C12579k C15211f3 f3Var);

    /* renamed from: K */
    void mo42428K(@C12579k C15098i iVar, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(iVar, "rect");
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        mo42435g(iVar.mo42279t(), iVar.mo42249B(), iVar.mo42283x(), iVar.mo42271j(), f3Var);
    }

    /* renamed from: M */
    void mo42429M(long j, float f, @C12579k C15211f3 f3Var);

    /* renamed from: P */
    void mo42430P(float f, float f2, float f3, float f4, float f5, float f6, @C12579k C15211f3 f3Var);

    /* renamed from: c */
    void mo42431c(float f, float f2, float f3, float f4, int i);

    /* renamed from: d */
    void mo42432d(@C12579k C15231i3 i3Var, int i);

    /* renamed from: e */
    void mo42433e(float f, float f2);

    /* renamed from: f */
    void mo42434f(float f, float f2);

    /* renamed from: g */
    void mo42435g(float f, float f2, float f3, float f4, @C12579k C15211f3 f3Var);

    /* renamed from: h */
    void mo42436h(float f, float f2, float f3, float f4, @C12579k C15211f3 f3Var);

    /* renamed from: i */
    void mo42437i(int i, @C12579k List<C15094f> list, @C12579k C15211f3 f3Var);

    /* renamed from: j */
    void mo42438j(@C12579k C15403w2 w2Var, long j, long j2, long j3, long j4, @C12579k C15211f3 f3Var);

    /* renamed from: k */
    void mo42439k(@C12579k C15403w2 w2Var, long j, @C12579k C15211f3 f3Var);

    /* renamed from: l */
    void mo42440l(int i, @C12579k float[] fArr, @C12579k C15211f3 f3Var);

    /* renamed from: m */
    void mo42441m(@C12579k Vertices vertices, int i, @C12579k C15211f3 f3Var);

    /* renamed from: o */
    void mo42442o(@C12579k C15098i iVar, float f, float f2, boolean z, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(iVar, "rect");
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        mo42444t(iVar.mo42279t(), iVar.mo42249B(), iVar.mo42283x(), iVar.mo42271j(), f, f2, z, f3Var);
    }

    /* renamed from: q */
    void mo42443q();

    /* renamed from: t */
    void mo42444t(float f, float f2, float f3, float f4, float f5, float f6, boolean z, @C12579k C15211f3 f3Var);

    /* renamed from: u */
    void mo42445u();

    /* renamed from: v */
    void mo42446v(@C12579k C15098i iVar, float f, float f2, boolean z, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(iVar, "rect");
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        mo42442o(iVar, C15281o2.m66362a(f), C15281o2.m66362a(f2), z, f3Var);
    }

    /* renamed from: x */
    void mo42447x(@C12579k C15098i iVar, @C12579k C15211f3 f3Var);

    /* renamed from: y */
    void mo42448y(long j, long j2, @C12579k C15211f3 f3Var);

    /* renamed from: z */
    void mo42449z(float f, float f2) {
        mo42421D(C15281o2.m66362a(f), C15281o2.m66362a(f2));
    }
}
