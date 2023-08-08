package dev.chrisbanes.snapper;

import androidx.compose.animation.core.C2013v;
import androidx.compose.animation.core.C2017x;
import androidx.compose.foundation.lazy.C2517l;
import androidx.compose.foundation.lazy.C2570o;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8567o;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import kotlin.ranges.C11479u;
import kotlin.sequences.C11559m;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10359a
@C8567o(parameters = 0)
public final class LazyListSnapperLayoutInfo extends C10368f {

    /* renamed from: g */
    public static final int f27985g = 0;
    @C12579k

    /* renamed from: b */
    public final LazyListState f27986b;
    @C12579k

    /* renamed from: c */
    public final C11304p<C10368f, C10369g, Integer> f27987c;

    /* renamed from: d */
    public final int f27988d;
    @C12579k

    /* renamed from: e */
    public final C8700z0 f27989e;
    @C12579k

    /* renamed from: f */
    public final C8578k2 f27990f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyListSnapperLayoutInfo(LazyListState lazyListState, C11304p pVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyListState, pVar, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public boolean mo21752a() {
        C2517l lVar = (C2517l) CollectionsKt___CollectionsKt.m40677q3(this.f27986b.mo8343u().mo8378i());
        if (lVar == null) {
            return false;
        }
        if (lVar.getIndex() < mo21764n() - 1 || lVar.getOffset() + lVar.getSize() > mo21757f()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo21753b() {
        C2517l lVar = (C2517l) CollectionsKt___CollectionsKt.m40479B2(this.f27986b.mo8343u().mo8378i());
        if (lVar == null) {
            return false;
        }
        if (lVar.getIndex() > 0 || lVar.getOffset() < mo21758g()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int mo21754c(float f, @C12579k C2013v<Float> vVar, float f2) {
        float f3;
        int i;
        Intrinsics.checkNotNullParameter(vVar, "decayAnimationSpec");
        C10369g e = mo21756e();
        if (e == null) {
            return -1;
        }
        float l = mo21762l();
        if (l <= 0.0f) {
            return e.mo21792a();
        }
        int d = mo21755d(e.mo21792a());
        int d2 = mo21755d(e.mo21792a() + 1);
        if (Math.abs(f) < 0.5f) {
            if (Math.abs(d) < Math.abs(d2)) {
                i = e.mo21792a();
            } else {
                i = e.mo21792a() + 1;
            }
            return C11479u.m44334I(i, 0, mo21764n() - 1);
        }
        float H = C11479u.m44331H(C2017x.m8654a(vVar, 0.0f, f), -f2, f2);
        if (f < 0.0f) {
            f3 = C11479u.m44310A(H + ((float) d2), 0.0f);
        } else {
            f3 = C11479u.m44444t(H + ((float) d), 0.0f);
        }
        double d3 = (double) l;
        int I = C11479u.m44334I(e.mo21792a() + C11409d.m43849K0((((double) f3) / d3) - (((double) d) / d3)), 0, mo21764n() - 1);
        C10370h hVar = C10370h.f28018a;
        return I;
    }

    /* renamed from: d */
    public int mo21755d(int i) {
        C10369g gVar;
        int L0;
        int intValue;
        boolean z;
        Iterator<C10369g> it = mo21760i().iterator();
        while (true) {
            if (!it.hasNext()) {
                gVar = null;
                break;
            }
            gVar = it.next();
            if (gVar.mo21792a() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C10369g gVar2 = gVar;
        if (gVar2 != null) {
            L0 = gVar2.mo21793b();
            intValue = this.f27987c.invoke(this, gVar2).intValue();
        } else {
            C10369g e = mo21756e();
            if (e == null) {
                return 0;
            }
            L0 = C11409d.m43851L0(((float) (i - e.mo21792a())) * mo21762l()) + e.mo21793b();
            intValue = this.f27987c.invoke(this, e).intValue();
        }
        return L0 - intValue;
    }

    @C12580l
    /* renamed from: e */
    public C10369g mo21756e() {
        return (C10369g) this.f27990f.getValue();
    }

    /* renamed from: f */
    public int mo21757f() {
        return this.f27986b.mo8343u().mo8373d() - mo21763m();
    }

    /* renamed from: g */
    public int mo21758g() {
        return this.f27988d;
    }

    /* renamed from: h */
    public int mo21759h() {
        return this.f27986b.mo8343u().mo8374e();
    }

    @C12579k
    /* renamed from: i */
    public C11559m<C10369g> mo21760i() {
        return SequencesKt___SequencesKt.m44761k1(CollectionsKt___CollectionsKt.m40700v1(this.f27986b.mo8343u().mo8378i()), LazyListSnapperLayoutInfo$visibleItems$1.f27991a);
    }

    /* renamed from: k */
    public final int mo21761k() {
        C2570o u = this.f27986b.mo8343u();
        if (u.mo8378i().size() < 2) {
            return 0;
        }
        C2517l lVar = u.mo8378i().get(0);
        return u.mo8378i().get(1).getOffset() - (lVar.getSize() + lVar.getOffset());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: androidx.compose.foundation.lazy.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo21762l() {
        /*
            r9 = this;
            androidx.compose.foundation.lazy.LazyListState r0 = r9.f27986b
            androidx.compose.foundation.lazy.o r0 = r0.mo8343u()
            java.util.List r1 = r0.mo8378i()
            boolean r1 = r1.isEmpty()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L_0x0013
            return r2
        L_0x0013:
            java.util.List r1 = r0.mo8378i()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 != 0) goto L_0x0026
            r3 = r4
            goto L_0x004d
        L_0x0026:
            java.lang.Object r3 = r1.next()
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L_0x0031
            goto L_0x004d
        L_0x0031:
            r5 = r3
            androidx.compose.foundation.lazy.l r5 = (androidx.compose.foundation.lazy.C2517l) r5
            int r5 = r5.getOffset()
        L_0x0038:
            java.lang.Object r6 = r1.next()
            r7 = r6
            androidx.compose.foundation.lazy.l r7 = (androidx.compose.foundation.lazy.C2517l) r7
            int r7 = r7.getOffset()
            if (r5 <= r7) goto L_0x0047
            r3 = r6
            r5 = r7
        L_0x0047:
            boolean r6 = r1.hasNext()
            if (r6 != 0) goto L_0x0038
        L_0x004d:
            r6 = r3
            androidx.compose.foundation.lazy.l r6 = (androidx.compose.foundation.lazy.C2517l) r6
            if (r6 != 0) goto L_0x0053
            return r2
        L_0x0053:
            java.util.List r1 = r0.mo8378i()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r7 = r1.iterator()
            boolean r1 = r7.hasNext()
            if (r1 != 0) goto L_0x0064
            goto L_0x0095
        L_0x0064:
            java.lang.Object r4 = r7.next()
            boolean r1 = r7.hasNext()
            if (r1 != 0) goto L_0x006f
            goto L_0x0095
        L_0x006f:
            r1 = r4
            androidx.compose.foundation.lazy.l r1 = (androidx.compose.foundation.lazy.C2517l) r1
            int r3 = r1.getOffset()
            int r1 = r1.getSize()
            int r3 = r3 + r1
        L_0x007b:
            java.lang.Object r1 = r7.next()
            r5 = r1
            androidx.compose.foundation.lazy.l r5 = (androidx.compose.foundation.lazy.C2517l) r5
            int r8 = r5.getOffset()
            int r5 = r5.getSize()
            int r8 = r8 + r5
            if (r3 >= r8) goto L_0x008f
            r4 = r1
            r3 = r8
        L_0x008f:
            boolean r1 = r7.hasNext()
            if (r1 != 0) goto L_0x007b
        L_0x0095:
            androidx.compose.foundation.lazy.l r4 = (androidx.compose.foundation.lazy.C2517l) r4
            if (r4 != 0) goto L_0x009a
            return r2
        L_0x009a:
            int r1 = r6.getOffset()
            int r3 = r4.getOffset()
            int r1 = java.lang.Math.min(r1, r3)
            int r3 = r6.getOffset()
            int r5 = r6.getSize()
            int r3 = r3 + r5
            int r5 = r4.getOffset()
            int r4 = r4.getSize()
            int r5 = r5 + r4
            int r3 = java.lang.Math.max(r3, r5)
            int r3 = r3 - r1
            if (r3 != 0) goto L_0x00c0
            goto L_0x00d1
        L_0x00c0:
            int r1 = r9.mo21761k()
            int r3 = r3 + r1
            float r1 = (float) r3
            java.util.List r0 = r0.mo8378i()
            int r0 = r0.size()
            float r0 = (float) r0
            float r2 = r1 / r0
        L_0x00d1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.chrisbanes.snapper.LazyListSnapperLayoutInfo.mo21762l():float");
    }

    /* renamed from: m */
    public final int mo21763m() {
        return ((Number) this.f27989e.getValue()).intValue();
    }

    /* renamed from: n */
    public final int mo21764n() {
        return this.f27986b.mo8343u().mo8374e();
    }

    /* renamed from: o */
    public final void mo21765o(int i) {
        this.f27989e.setValue(Integer.valueOf(i));
    }

    public LazyListSnapperLayoutInfo(@C12579k LazyListState lazyListState, @C12579k C11304p<? super C10368f, ? super C10369g, Integer> pVar, int i) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(pVar, "snapOffsetForItem");
        this.f27986b = lazyListState;
        this.f27987c = pVar;
        this.f27989e = C8539f2.m30981g(Integer.valueOf(i), (C8410b2) null, 2, (Object) null);
        this.f27990f = C8415c2.m30235d(new LazyListSnapperLayoutInfo$currentItem$2(this));
    }
}
