package androidx.compose.p004ui.graphics;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15101k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.i3 */
public interface C15231i3 {
    @C12579k

    /* renamed from: a */
    public static final C15232a f37540a = C15232a.f37541a;

    /* renamed from: androidx.compose.ui.graphics.i3$a */
    public static final class C15232a {

        /* renamed from: a */
        public static final /* synthetic */ C15232a f37541a = new C15232a();

        @C12579k
        /* renamed from: a */
        public final C15231i3 mo42824a(int i, @C12579k C15231i3 i3Var, @C12579k C15231i3 i3Var2) {
            Intrinsics.checkNotNullParameter(i3Var, "path1");
            Intrinsics.checkNotNullParameter(i3Var2, "path2");
            C15231i3 a = C15318t0.m66550a();
            if (a.mo42819s(i3Var, i3Var2, i)) {
                return a;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }

    /* renamed from: androidx.compose.ui.graphics.i3$b */
    public static final class C15233b {
        @Deprecated
        /* renamed from: b */
        public static void m66029b(@C12579k C15231i3 i3Var, @C12579k C15098i iVar, float f, float f2, boolean z) {
            Intrinsics.checkNotNullParameter(iVar, "rect");
            C15231i3.super.mo42800b(iVar, f, f2, z);
        }
    }

    /* renamed from: m */
    static /* synthetic */ void m66005m(C15231i3 i3Var, C15231i3 i3Var2, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = C15094f.f37256b.mo42248e();
            }
            i3Var.mo42822v(i3Var2, j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
    }

    /* renamed from: a */
    boolean mo42799a();

    /* renamed from: b */
    void mo42800b(@C12579k C15098i iVar, float f, float f2, boolean z) {
        Intrinsics.checkNotNullParameter(iVar, "rect");
        mo42820t(iVar, C15281o2.m66362a(f), C15281o2.m66362a(f2), z);
    }

    /* renamed from: c */
    void mo42801c(float f, float f2);

    void close();

    /* renamed from: d */
    void mo42803d(float f, float f2, float f3, float f4, float f5, float f6);

    /* renamed from: e */
    void mo42804e(float f, float f2, float f3, float f4);

    /* renamed from: f */
    void mo42805f(float f, float f2, float f3, float f4);

    /* renamed from: g */
    void mo42806g(int i);

    @C12579k
    C15098i getBounds();

    /* renamed from: h */
    void mo42808h(@C12579k C15098i iVar);

    boolean isEmpty();

    /* renamed from: j */
    void mo42810j(long j);

    /* renamed from: k */
    void mo42811k(@C12579k C15098i iVar, float f, float f2);

    /* renamed from: l */
    int mo42812l();

    /* renamed from: n */
    void mo42813n(@C12579k C15098i iVar, float f, float f2);

    /* renamed from: o */
    void mo42814o(@C12579k C15098i iVar);

    /* renamed from: p */
    void mo42815p(float f, float f2);

    /* renamed from: q */
    void mo42816q(float f, float f2, float f3, float f4, float f5, float f6);

    /* renamed from: r */
    void mo42817r(@C12579k C15101k kVar);

    void reset();

    /* renamed from: s */
    boolean mo42819s(@C12579k C15231i3 i3Var, @C12579k C15231i3 i3Var2, int i);

    /* renamed from: t */
    void mo42820t(@C12579k C15098i iVar, float f, float f2, boolean z);

    /* renamed from: u */
    void mo42821u(float f, float f2);

    /* renamed from: v */
    void mo42822v(@C12579k C15231i3 i3Var, long j);

    /* renamed from: w */
    void mo42823w(float f, float f2);
}
