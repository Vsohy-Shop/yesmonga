package androidx.compose.p004ui.graphics.painter;

import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15299q2;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import com.contentsquare.android.api.C14092c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.graphics.painter.a */
public final class C15292a extends Painter {
    @C12580l

    /* renamed from: X */
    public C15249k2 f37633X;
    @C12579k

    /* renamed from: g */
    public final C15403w2 f37634g;

    /* renamed from: v */
    public final long f37635v;

    /* renamed from: w */
    public final long f37636w;

    /* renamed from: x */
    public int f37637x;

    /* renamed from: y */
    public final long f37638y;

    /* renamed from: z */
    public float f37639z;

    public /* synthetic */ C15292a(C15403w2 w2Var, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(w2Var, j, j2);
    }

    /* renamed from: a */
    public boolean mo42942a(float f) {
        this.f37639z = f;
        return true;
    }

    /* renamed from: b */
    public boolean mo42943b(@C12580l C15249k2 k2Var) {
        this.f37633X = k2Var;
        return true;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15292a)) {
            return false;
        }
        C15292a aVar = (C15292a) obj;
        if (Intrinsics.areEqual((Object) this.f37634g, (Object) aVar.f37634g) && C16494m.m74578j(this.f37635v, aVar.f37635v) && C16500q.m74657h(this.f37636w, aVar.f37636w) && C15299q2.m66448h(this.f37637x, aVar.f37637x)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f37634g.hashCode() * 31) + C16494m.m74584p(this.f37635v)) * 31) + C16500q.m74663n(this.f37636w)) * 31) + C15299q2.m66449j(this.f37637x);
    }

    /* renamed from: l */
    public long mo42949l() {
        return C16502r.m74673f(this.f37638y);
    }

    /* renamed from: n */
    public void mo42951n(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        C15187e.m65715m0(eVar, this.f37634g, this.f37635v, this.f37636w, 0, C16502r.m74668a(C11409d.m43851L0(C15104m.m65023t(eVar.mo42718b())), C11409d.m43851L0(C15104m.m65016m(eVar.mo42718b()))), this.f37639z, (C15192h) null, this.f37633X, 0, this.f37637x, C14092c.f34643q0, (Object) null);
    }

    /* renamed from: o */
    public final int mo42955o() {
        return this.f37637x;
    }

    /* renamed from: p */
    public final void mo42956p(int i) {
        this.f37637x = i;
    }

    /* renamed from: q */
    public final long mo42957q(long j, long j2) {
        boolean z;
        if (C16494m.m74581m(j) < 0 || C16494m.m74583o(j) < 0 || C16500q.m74662m(j2) < 0 || C16500q.m74659j(j2) < 0 || C16500q.m74662m(j2) > this.f37634g.getWidth() || C16500q.m74659j(j2) > this.f37634g.getHeight()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return j2;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @C12579k
    public String toString() {
        return "BitmapPainter(image=" + this.f37634g + ", srcOffset=" + C16494m.m74589u(this.f37635v) + ", srcSize=" + C16500q.m74665p(this.f37636w) + ", filterQuality=" + C15299q2.m66450k(this.f37637x) + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15292a(C15403w2 w2Var, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(w2Var, (i & 2) != 0 ? C16494m.f40890b.mo47857a() : j, (i & 4) != 0 ? C16502r.m74668a(w2Var.getWidth(), w2Var.getHeight()) : j2, (DefaultConstructorMarker) null);
    }

    public C15292a(C15403w2 w2Var, long j, long j2) {
        this.f37634g = w2Var;
        this.f37635v = j;
        this.f37636w = j2;
        this.f37637x = C15299q2.f37647b.mo42973b();
        this.f37638y = mo42957q(j, j2);
        this.f37639z = 1.0f;
    }
}
