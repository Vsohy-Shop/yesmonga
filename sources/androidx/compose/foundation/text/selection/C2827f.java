package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.C2830i;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.C16359o0;
import androidx.compose.p004ui.unit.C16500q;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,297:1\n1#2:298\n*E\n"})
/* renamed from: androidx.compose.foundation.text.selection.f */
public final class C2827f implements C2829h {

    /* renamed from: a */
    public final long f7445a;
    @C12579k

    /* renamed from: b */
    public final C11289a<C15588o> f7446b;
    @C12579k

    /* renamed from: c */
    public final C11289a<C16260h0> f7447c;
    @C12580l

    /* renamed from: d */
    public C16260h0 f7448d;

    /* renamed from: e */
    public int f7449e = -1;

    public C2827f(long j, @C12579k C11289a<? extends C15588o> aVar, @C12579k C11289a<C16260h0> aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "coordinatesCallback");
        Intrinsics.checkNotNullParameter(aVar2, "layoutResultCallback");
        this.f7445a = j;
        this.f7446b = aVar;
        this.f7447c = aVar2;
    }

    @C12579k
    /* renamed from: a */
    public C16156d mo9855a() {
        C16260h0 invoke = this.f7447c.invoke();
        if (invoke == null) {
            return new C16156d("", (List) null, (List) null, 6, (DefaultConstructorMarker) null);
        }
        return invoke.mo47058l().mo47040n();
    }

    /* renamed from: b */
    public final synchronized int mo9856b(C16260h0 h0Var) {
        int i;
        if (this.f7448d != h0Var) {
            if (h0Var.mo47051f()) {
                if (!h0Var.mo47069w().mo47403e()) {
                    i = C11479u.m44313B(h0Var.mo47063r((float) C16500q.m74659j(h0Var.mo47043B())), h0Var.mo47060n() - 1);
                    while (h0Var.mo47068v(i) >= ((float) C16500q.m74659j(h0Var.mo47043B()))) {
                        i--;
                    }
                    this.f7449e = h0Var.mo47061o(i, true);
                    this.f7448d = h0Var;
                }
            }
            i = h0Var.mo47060n() - 1;
            this.f7449e = h0Var.mo47061o(i, true);
            this.f7448d = h0Var;
        }
        return this.f7449e;
    }

    @C12579k
    /* renamed from: c */
    public C15098i mo9857c(int i) {
        C16260h0 invoke = this.f7447c.invoke();
        if (invoke == null) {
            return C15098i.f37261e.mo42285a();
        }
        int length = invoke.mo47058l().mo47040n().length();
        if (length < 1) {
            return C15098i.f37261e.mo42285a();
        }
        return invoke.mo47048d(C11479u.m44334I(i, 0, length - 1));
    }

    @C12580l
    /* renamed from: e */
    public C15588o mo9858e() {
        C15588o invoke = this.f7446b.invoke();
        if (invoke == null || !invoke.mo44436k()) {
            return null;
        }
        return invoke;
    }

    /* renamed from: f */
    public long mo9859f(@C12579k C2830i iVar, boolean z) {
        C2830i.C2831a aVar;
        Intrinsics.checkNotNullParameter(iVar, "selection");
        if ((z && iVar.mo9872h().mo9884h() != mo9861h()) || (!z && iVar.mo9870f().mo9884h() != mo9861h())) {
            return C15094f.f37256b.mo42248e();
        }
        if (mo9858e() == null) {
            return C15094f.f37256b.mo42248e();
        }
        C16260h0 invoke = this.f7447c.invoke();
        if (invoke == null) {
            return C15094f.f37256b.mo42248e();
        }
        if (z) {
            aVar = iVar.mo9872h();
        } else {
            aVar = iVar.mo9870f();
        }
        return C2845u.m13123b(invoke, C11479u.m44334I(aVar.mo9883g(), 0, mo9856b(invoke)), z, iVar.mo9871g());
    }

    /* renamed from: g */
    public int mo9860g() {
        C16260h0 invoke = this.f7447c.invoke();
        if (invoke == null) {
            return 0;
        }
        return mo9856b(invoke);
    }

    /* renamed from: h */
    public long mo9861h() {
        return this.f7445a;
    }

    @C12580l
    /* renamed from: i */
    public C2830i mo9862i() {
        C16260h0 invoke = this.f7447c.invoke();
        if (invoke == null) {
            return null;
        }
        return C2828g.m13050b(C16359o0.m73780b(0, invoke.mo47058l().mo47040n().length()), false, mo9861h(), invoke);
    }

    /* renamed from: j */
    public long mo9863j(int i) {
        C16260h0 invoke = this.f7447c.invoke();
        if (invoke == null) {
            return C16356n0.f40590b.mo47429a();
        }
        int b = mo9856b(invoke);
        if (b < 1) {
            return C16356n0.f40590b.mo47429a();
        }
        int q = invoke.mo47062q(C11479u.m44334I(i, 0, b - 1));
        return C16359o0.m73780b(invoke.mo47067u(q), invoke.mo47061o(q, true));
    }

    @C12579k
    /* renamed from: k */
    public Pair<C2830i, Boolean> mo9864k(long j, long j2, @C12580l C15094f fVar, boolean z, @C12579k C15588o oVar, @C12579k SelectionAdjustment selectionAdjustment, @C12580l C2830i iVar) {
        boolean z2;
        C15094f fVar2;
        C15588o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(oVar2, "containerLayoutCoordinates");
        Intrinsics.checkNotNullParameter(selectionAdjustment, "adjustment");
        if (iVar == null || (mo9861h() == iVar.mo9872h().mo9884h() && mo9861h() == iVar.mo9870f().mo9884h())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C15588o e = mo9858e();
            if (e == null) {
                return new Pair<>(null, Boolean.FALSE);
            }
            C16260h0 invoke = this.f7447c.invoke();
            if (invoke == null) {
                return new Pair<>(null, Boolean.FALSE);
            }
            long K = oVar2.mo44430K(e, C15094f.f37256b.mo42248e());
            long u = C15094f.m64885u(j, K);
            long u2 = C15094f.m64885u(j2, K);
            if (fVar != null) {
                fVar2 = C15094f.m64868d(C15094f.m64885u(fVar.mo42242A(), K));
            } else {
                fVar2 = null;
            }
            return C2828g.m13052d(invoke, u, u2, fVar2, mo9861h(), selectionAdjustment, iVar, z);
        }
        throw new IllegalArgumentException("The given previousSelection doesn't belong to this selectable.".toString());
    }
}
