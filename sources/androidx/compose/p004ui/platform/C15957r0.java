package androidx.compose.p004ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.p004ui.unit.C16507v;
import androidx.constraintlayout.core.motion.utils.C16717v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.platform.r0 */
public final class C15957r0 {
    @C12579k

    /* renamed from: a */
    public Parcel f39659a;

    public C15957r0() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.f39659a = obtain;
    }

    /* renamed from: a */
    public final void mo45931a(byte b) {
        this.f39659a.writeByte(b);
    }

    /* renamed from: b */
    public final void mo45932b(float f) {
        this.f39659a.writeFloat(f);
    }

    /* renamed from: c */
    public final void mo45933c(int i) {
        this.f39659a.writeInt(i);
    }

    /* renamed from: d */
    public final void mo45934d(@C12579k C15205e4 e4Var) {
        Intrinsics.checkNotNullParameter(e4Var, "shadow");
        mo45943m(e4Var.mo42742f());
        mo45932b(C15094f.m64880p(e4Var.mo42743h()));
        mo45932b(C15094f.m64882r(e4Var.mo42743h()));
        mo45932b(e4Var.mo42740d());
    }

    /* renamed from: e */
    public final void mo45935e(@C12579k C16151c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "spanStyle");
        long o = c0Var.mo46611o();
        C15240j2.C15241a aVar = C15240j2.f37547b;
        if (!C15240j2.m66082y(o, aVar.mo42851u())) {
            mo45931a((byte) 1);
            mo45943m(c0Var.mo46611o());
        }
        long t = c0Var.mo46615t();
        C16504t.C16505a aVar2 = C16504t.f40903b;
        if (!C16504t.m74683j(t, aVar2.mo47903b())) {
            mo45931a((byte) 2);
            mo45940j(c0Var.mo46615t());
        }
        C16209i0 w = c0Var.mo46619w();
        if (w != null) {
            mo45931a((byte) 3);
            mo45936f(w);
        }
        C16190e0 u = c0Var.mo46617u();
        if (u != null) {
            int j = u.mo46880j();
            mo45931a((byte) 4);
            mo45945o(j);
        }
        C16194f0 v = c0Var.mo46618v();
        if (v != null) {
            int m = v.mo46893m();
            mo45931a((byte) 5);
            mo45942l(m);
        }
        String s = c0Var.mo46614s();
        if (s != null) {
            mo45931a((byte) 6);
            mo45939i(s);
        }
        if (!C16504t.m74683j(c0Var.mo46620x(), aVar2.mo47903b())) {
            mo45931a((byte) 7);
            mo45940j(c0Var.mo46620x());
        }
        C16410a l = c0Var.mo46609l();
        if (l != null) {
            float k = l.mo47589k();
            mo45931a((byte) 8);
            mo45941k(k);
        }
        C16439m D = c0Var.mo46594D();
        if (D != null) {
            mo45931a((byte) 9);
            mo45938h(D);
        }
        if (!C15240j2.m66082y(c0Var.mo46608k(), aVar.mo42851u())) {
            mo45931a((byte) 10);
            mo45943m(c0Var.mo46608k());
        }
        C16434j B = c0Var.mo46592B();
        if (B != null) {
            mo45931a((byte) 11);
            mo45937g(B);
        }
        C15205e4 A = c0Var.mo46591A();
        if (A != null) {
            mo45931a((byte) 12);
            mo45934d(A);
        }
    }

    /* renamed from: f */
    public final void mo45936f(@C12579k C16209i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        mo45933c(i0Var.mo46939t0());
    }

    /* renamed from: g */
    public final void mo45937g(@C12579k C16434j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "textDecoration");
        mo45933c(jVar.mo47675e());
    }

    /* renamed from: h */
    public final void mo45938h(@C12579k C16439m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "textGeometricTransform");
        mo45932b(mVar.mo47694d());
        mo45932b(mVar.mo47695e());
    }

    /* renamed from: i */
    public final void mo45939i(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        this.f39659a.writeString(str);
    }

    /* renamed from: j */
    public final void mo45940j(long j) {
        long m = C16504t.m74686m(j);
        C16507v.C16508a aVar = C16507v.f40911b;
        byte b = 0;
        if (!C16507v.m74732g(m, aVar.mo47910c())) {
            if (C16507v.m74732g(m, aVar.mo47909b())) {
                b = 1;
            } else if (C16507v.m74732g(m, aVar.mo47908a())) {
                b = 2;
            }
        }
        mo45931a(b);
        if (!C16507v.m74732g(C16504t.m74686m(j), aVar.mo47910c())) {
            mo45932b(C16504t.m74687n(j));
        }
    }

    /* renamed from: k */
    public final void mo45941k(float f) {
        mo45932b(f);
    }

    /* renamed from: l */
    public final void mo45942l(int i) {
        C16194f0.C16195a aVar = C16194f0.f40257b;
        byte b = 0;
        if (!C16194f0.m72971h(i, aVar.mo46896b())) {
            if (C16194f0.m72971h(i, aVar.mo46895a())) {
                b = 1;
            } else if (C16194f0.m72971h(i, aVar.mo46898d())) {
                b = 2;
            } else if (C16194f0.m72971h(i, aVar.mo46897c())) {
                b = 3;
            }
        }
        mo45931a(b);
    }

    /* renamed from: m */
    public final void mo45943m(long j) {
        mo45944n(j);
    }

    /* renamed from: n */
    public final void mo45944n(long j) {
        this.f39659a.writeLong(j);
    }

    /* renamed from: o */
    public final void mo45945o(int i) {
        C16190e0.C16191a aVar = C16190e0.f40252b;
        byte b = 0;
        if (!C16190e0.m72951f(i, aVar.mo46883b()) && C16190e0.m72951f(i, aVar.mo46882a())) {
            b = 1;
        }
        mo45931a(b);
    }

    @C12579k
    /* renamed from: p */
    public final String mo45946p() {
        String encodeToString = Base64.encodeToString(this.f39659a.marshall(), 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return encodeToString;
    }

    /* renamed from: q */
    public final void mo45947q() {
        this.f39659a.recycle();
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.f39659a = obtain;
    }
}
