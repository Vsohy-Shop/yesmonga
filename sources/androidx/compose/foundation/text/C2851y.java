package androidx.compose.foundation.text;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.text.C16260h0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTextLayoutResultProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResultProxy.kt\nandroidx/compose/foundation/text/TextLayoutResultProxy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
/* renamed from: androidx.compose.foundation.text.y */
public final class C2851y {
    @C12579k

    /* renamed from: a */
    public final C16260h0 f7480a;
    @C12580l

    /* renamed from: b */
    public C15588o f7481b;
    @C12580l

    /* renamed from: c */
    public C15588o f7482c;

    public C2851y(@C12579k C16260h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "value");
        this.f7480a = h0Var;
    }

    /* renamed from: e */
    public static /* synthetic */ int m13147e(C2851y yVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return yVar.mo9927d(i, z);
    }

    /* renamed from: h */
    public static /* synthetic */ int m13148h(C2851y yVar, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return yVar.mo9929g(j, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r2 == null) goto L_0x001e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo9924a(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.o r0 = r5.f7481b
            if (r0 == 0) goto L_0x001e
            boolean r1 = r0.mo44436k()
            if (r1 == 0) goto L_0x0016
            androidx.compose.ui.layout.o r1 = r5.f7482c
            r2 = 0
            if (r1 == 0) goto L_0x001c
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.i r2 = androidx.compose.p004ui.layout.C15588o.m69281C(r1, r0, r3, r4, r2)
            goto L_0x001c
        L_0x0016:
            androidx.compose.ui.geometry.i$a r0 = androidx.compose.p004ui.geometry.C15098i.f37261e
            androidx.compose.ui.geometry.i r2 = r0.mo42285a()
        L_0x001c:
            if (r2 != 0) goto L_0x0024
        L_0x001e:
            androidx.compose.ui.geometry.i$a r0 = androidx.compose.p004ui.geometry.C15098i.f37261e
            androidx.compose.ui.geometry.i r2 = r0.mo42285a()
        L_0x0024:
            long r6 = androidx.compose.foundation.text.C2852z.m13161b(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C2851y.mo9924a(long):long");
    }

    @C12580l
    /* renamed from: b */
    public final C15588o mo9925b() {
        return this.f7482c;
    }

    @C12580l
    /* renamed from: c */
    public final C15588o mo9926c() {
        return this.f7481b;
    }

    /* renamed from: d */
    public final int mo9927d(int i, boolean z) {
        return this.f7480a.mo47061o(i, z);
    }

    /* renamed from: f */
    public final int mo9928f(float f) {
        return this.f7480a.mo47063r(C15094f.m64882r(mo9932k(mo9924a(C15096g.m64898a(0.0f, f)))));
    }

    /* renamed from: g */
    public final int mo9929g(long j, boolean z) {
        if (z) {
            j = mo9924a(j);
        }
        return this.f7480a.mo47070x(mo9932k(j));
    }

    @C12579k
    /* renamed from: i */
    public final C16260h0 mo9930i() {
        return this.f7480a;
    }

    /* renamed from: j */
    public final boolean mo9931j(long j) {
        long k = mo9932k(mo9924a(j));
        int r = this.f7480a.mo47063r(C15094f.m64882r(k));
        if (C15094f.m64880p(k) < this.f7480a.mo47064s(r) || C15094f.m64880p(k) > this.f7480a.mo47065t(r)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final long mo9932k(long j) {
        C15094f fVar;
        long j2;
        C15588o oVar = this.f7481b;
        if (oVar == null) {
            return j;
        }
        C15588o oVar2 = this.f7482c;
        if (oVar2 != null) {
            if (!oVar.mo44436k() || !oVar2.mo44436k()) {
                j2 = j;
            } else {
                j2 = oVar.mo44430K(oVar2, j);
            }
            fVar = C15094f.m64868d(j2);
        } else {
            fVar = null;
        }
        if (fVar != null) {
            return fVar.mo42242A();
        }
        return j;
    }

    /* renamed from: l */
    public final void mo9933l(@C12580l C15588o oVar) {
        this.f7482c = oVar;
    }

    /* renamed from: m */
    public final void mo9934m(@C12580l C15588o oVar) {
        this.f7481b = oVar;
    }
}
