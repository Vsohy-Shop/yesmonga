package androidx.compose.p004ui.graphics.drawscope;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16482f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.drawscope.b */
public final class C15182b {
    @C12579k

    /* renamed from: a */
    public static final C16479d f37498a = C16482f.m74433a(1.0f, 1.0f);

    /* renamed from: androidx.compose.ui.graphics.drawscope.b$a */
    public static final class C15183a implements C15193i {

        /* renamed from: a */
        public final /* synthetic */ C15186d f37499a;

        public C15183a(C15186d dVar) {
            this.f37499a = dVar;
        }

        /* renamed from: U */
        public long mo42707U() {
            return C15106n.m65034b(mo42709b());
        }

        /* renamed from: a */
        public void mo42708a(@C12579k float[] fArr) {
            Intrinsics.checkNotNullParameter(fArr, "matrix");
            this.f37499a.mo42705c().mo42424G(fArr);
        }

        /* renamed from: b */
        public long mo42709b() {
            return this.f37499a.mo42704b();
        }

        /* renamed from: c */
        public void mo42710c(float f, float f2, float f3, float f4, int i) {
            this.f37499a.mo42705c().mo42431c(f, f2, f3, f4, i);
        }

        /* renamed from: d */
        public void mo42711d(@C12579k C15231i3 i3Var, int i) {
            Intrinsics.checkNotNullParameter(i3Var, "path");
            this.f37499a.mo42705c().mo42432d(i3Var, i);
        }

        /* renamed from: e */
        public void mo42712e(float f, float f2) {
            this.f37499a.mo42705c().mo42433e(f, f2);
        }

        /* renamed from: j */
        public void mo42713j(float f, float f2, long j) {
            C15118b2 c = this.f37499a.mo42705c();
            c.mo42433e(C15094f.m64880p(j), C15094f.m64882r(j));
            c.mo42434f(f, f2);
            c.mo42433e(-C15094f.m64880p(j), -C15094f.m64882r(j));
        }

        /* renamed from: k */
        public void mo42714k(float f, long j) {
            C15118b2 c = this.f37499a.mo42705c();
            c.mo42433e(C15094f.m64880p(j), C15094f.m64882r(j));
            c.mo42420A(f);
            c.mo42433e(-C15094f.m64880p(j), -C15094f.m64882r(j));
        }

        /* renamed from: n */
        public void mo42715n(float f, float f2, float f3, float f4) {
            boolean z;
            C15118b2 c = this.f37499a.mo42705c();
            C15186d dVar = this.f37499a;
            long a = C15106n.m65033a(C15104m.m65023t(mo42709b()) - (f3 + f), C15104m.m65016m(mo42709b()) - (f4 + f2));
            if (C15104m.m65023t(a) < 0.0f || C15104m.m65016m(a) < 0.0f) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                dVar.mo42706d(a);
                c.mo42433e(f, f2);
                return;
            }
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
        }
    }

    /* renamed from: c */
    public static final C15193i m65643c(C15186d dVar) {
        return new C15183a(dVar);
    }
}
