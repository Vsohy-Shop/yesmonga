package androidx.compose.p004ui.node;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.layout.AlignmentLineKt;
import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15576j;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.node.AlignmentLines */
public abstract class AlignmentLines {
    @C12579k

    /* renamed from: a */
    public final C15665a f38777a;

    /* renamed from: b */
    public boolean f38778b;

    /* renamed from: c */
    public boolean f38779c;

    /* renamed from: d */
    public boolean f38780d;

    /* renamed from: e */
    public boolean f38781e;

    /* renamed from: f */
    public boolean f38782f;

    /* renamed from: g */
    public boolean f38783g;
    @C12580l

    /* renamed from: h */
    public C15665a f38784h;
    @C12579k

    /* renamed from: i */
    public final Map<C15531a, Integer> f38785i;

    public /* synthetic */ AlignmentLines(C15665a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    /* renamed from: c */
    public final void mo44524c(C15531a aVar, int i, NodeCoordinator nodeCoordinator) {
        int i2;
        float f = (float) i;
        long a = C15096g.m64898a(f, f);
        while (true) {
            a = mo44525d(nodeCoordinator, a);
            nodeCoordinator = nodeCoordinator.mo44894z4();
            Intrinsics.checkNotNull(nodeCoordinator);
            if (Intrinsics.areEqual((Object) nodeCoordinator, (Object) this.f38777a.mo44775g0())) {
                break;
            } else if (mo44526e(nodeCoordinator).containsKey(aVar)) {
                float i3 = (float) mo44530i(nodeCoordinator, aVar);
                a = C15096g.m64898a(i3, i3);
            }
        }
        if (aVar instanceof C15576j) {
            i2 = C11409d.m43851L0(C15094f.m64882r(a));
        } else {
            i2 = C11409d.m43851L0(C15094f.m64880p(a));
        }
        Map<C15531a, Integer> map = this.f38785i;
        if (map.containsKey(aVar)) {
            i2 = AlignmentLineKt.m68887c(aVar, ((Number) C10977s0.m41443K(this.f38785i, aVar)).intValue(), i2);
        }
        map.put(aVar, Integer.valueOf(i2));
    }

    /* renamed from: d */
    public abstract long mo44525d(@C12579k NodeCoordinator nodeCoordinator, long j);

    @C12579k
    /* renamed from: e */
    public abstract Map<C15531a, Integer> mo44526e(@C12579k NodeCoordinator nodeCoordinator);

    @C12579k
    /* renamed from: f */
    public final C15665a mo44527f() {
        return this.f38777a;
    }

    /* renamed from: g */
    public final boolean mo44528g() {
        return this.f38778b;
    }

    @C12579k
    /* renamed from: h */
    public final Map<C15531a, Integer> mo44529h() {
        return this.f38785i;
    }

    /* renamed from: i */
    public abstract int mo44530i(@C12579k NodeCoordinator nodeCoordinator, @C12579k C15531a aVar);

    /* renamed from: j */
    public final boolean mo44531j() {
        return this.f38781e;
    }

    /* renamed from: k */
    public final boolean mo44532k() {
        if (this.f38779c || this.f38781e || this.f38782f || this.f38783g) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean mo44533l() {
        mo44540s();
        if (this.f38784h != null) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo44534m() {
        return this.f38783g;
    }

    /* renamed from: n */
    public final boolean mo44535n() {
        return this.f38782f;
    }

    /* renamed from: o */
    public final boolean mo44536o() {
        return this.f38780d;
    }

    /* renamed from: p */
    public final boolean mo44537p() {
        return this.f38779c;
    }

    /* renamed from: q */
    public final void mo44538q() {
        this.f38778b = true;
        C15665a i = this.f38777a.mo44779i();
        if (i != null) {
            if (this.f38779c) {
                i.mo44762A0();
            } else if (this.f38781e || this.f38780d) {
                i.requestLayout();
            }
            if (this.f38782f) {
                this.f38777a.mo44762A0();
            }
            if (this.f38783g) {
                i.requestLayout();
            }
            i.mo44789w().mo44538q();
        }
    }

    /* renamed from: r */
    public final void mo44539r() {
        this.f38785i.clear();
        this.f38777a.mo44790y0(new AlignmentLines$recalculate$1(this));
        this.f38785i.putAll(mo44526e(this.f38777a.mo44775g0()));
        this.f38778b = false;
    }

    /* renamed from: s */
    public final void mo44540s() {
        C15665a aVar;
        AlignmentLines w;
        AlignmentLines w2;
        if (mo44532k()) {
            aVar = this.f38777a;
        } else {
            C15665a i = this.f38777a.mo44779i();
            if (i != null) {
                aVar = i.mo44789w().f38784h;
                if (aVar == null || !aVar.mo44789w().mo44532k()) {
                    C15665a aVar2 = this.f38784h;
                    if (aVar2 != null && !aVar2.mo44789w().mo44532k()) {
                        C15665a i2 = aVar2.mo44779i();
                        if (!(i2 == null || (w2 = i2.mo44789w()) == null)) {
                            w2.mo44540s();
                        }
                        C15665a i3 = aVar2.mo44779i();
                        if (i3 == null || (w = i3.mo44789w()) == null) {
                            aVar = null;
                        } else {
                            aVar = w.f38784h;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        this.f38784h = aVar;
    }

    /* renamed from: t */
    public final void mo44541t() {
        this.f38778b = true;
        this.f38779c = false;
        this.f38781e = false;
        this.f38780d = false;
        this.f38782f = false;
        this.f38783g = false;
        this.f38784h = null;
    }

    /* renamed from: u */
    public final void mo44542u(boolean z) {
        this.f38778b = z;
    }

    /* renamed from: v */
    public final void mo44543v(boolean z) {
        this.f38781e = z;
    }

    /* renamed from: w */
    public final void mo44544w(boolean z) {
        this.f38783g = z;
    }

    /* renamed from: x */
    public final void mo44545x(boolean z) {
        this.f38782f = z;
    }

    /* renamed from: y */
    public final void mo44546y(boolean z) {
        this.f38780d = z;
    }

    /* renamed from: z */
    public final void mo44547z(boolean z) {
        this.f38779c = z;
    }

    public AlignmentLines(C15665a aVar) {
        this.f38777a = aVar;
        this.f38778b = true;
        this.f38785i = new HashMap();
    }
}
