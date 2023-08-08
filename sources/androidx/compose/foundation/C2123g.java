package androidx.compose.foundation;

import androidx.compose.p004ui.draw.C8749h;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15174d3;
import androidx.compose.p004ui.graphics.C15204e3;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15321t3;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/Background\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/* renamed from: androidx.compose.foundation.g */
public final class C2123g extends C15988w0 implements C8749h {
    @C12580l

    /* renamed from: d */
    public final C15240j2 f5813d;
    @C12580l

    /* renamed from: e */
    public final C15421z1 f5814e;

    /* renamed from: f */
    public final float f5815f;
    @C12579k

    /* renamed from: g */
    public final C15218g4 f5816g;
    @C12580l

    /* renamed from: v */
    public C15104m f5817v;
    @C12580l

    /* renamed from: w */
    public LayoutDirection f5818w;
    @C12580l

    /* renamed from: x */
    public C15174d3 f5819x;

    public /* synthetic */ C2123g(C15240j2 j2Var, C15421z1 z1Var, float f, C15218g4 g4Var, C11300l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2Var, z1Var, f, g4Var, lVar);
    }

    /* renamed from: C */
    public void mo7212C(@C12579k C15184c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (this.f5816g == C15321t3.m66567a()) {
            mo7312s(cVar);
        } else {
            mo7311r(cVar);
        }
        cVar.mo42716g6();
    }

    public boolean equals(@C12580l Object obj) {
        C2123g gVar;
        boolean z;
        if (obj instanceof C2123g) {
            gVar = (C2123g) obj;
        } else {
            gVar = null;
        }
        if (gVar == null || !Intrinsics.areEqual((Object) this.f5813d, (Object) gVar.f5813d) || !Intrinsics.areEqual((Object) this.f5814e, (Object) gVar.f5814e)) {
            return false;
        }
        if (this.f5815f == gVar.f5815f) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !Intrinsics.areEqual((Object) this.f5816g, (Object) gVar.f5816g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        C15240j2 j2Var = this.f5813d;
        int i2 = 0;
        if (j2Var != null) {
            i = C15240j2.m66056K(j2Var.mo42833M());
        } else {
            i = 0;
        }
        int i3 = i * 31;
        C15421z1 z1Var = this.f5814e;
        if (z1Var != null) {
            i2 = z1Var.hashCode();
        }
        return ((((i3 + i2) * 31) + Float.hashCode(this.f5815f)) * 31) + this.f5816g.hashCode();
    }

    /* renamed from: r */
    public final void mo7311r(C15184c cVar) {
        C15174d3 d3Var;
        if (!C15104m.m65013j(cVar.mo42718b(), this.f5817v) || cVar.getLayoutDirection() != this.f5818w) {
            d3Var = this.f5816g.mo7615a(cVar.mo42718b(), cVar.getLayoutDirection(), cVar);
        } else {
            d3Var = this.f5819x;
            Intrinsics.checkNotNull(d3Var);
        }
        C15240j2 j2Var = this.f5813d;
        if (j2Var != null) {
            j2Var.mo42833M();
            C15204e3.m65907g(cVar, d3Var, this.f5813d.mo42833M(), 0.0f, (C15192h) null, (C15249k2) null, 0, 60, (Object) null);
        }
        C15421z1 z1Var = this.f5814e;
        if (z1Var != null) {
            C15204e3.m65905e(cVar, d3Var, z1Var, this.f5815f, (C15192h) null, (C15249k2) null, 0, 56, (Object) null);
        }
        this.f5819x = d3Var;
        this.f5817v = C15104m.m65006c(cVar.mo42718b());
        this.f5818w = cVar.getLayoutDirection();
    }

    /* renamed from: s */
    public final void mo7312s(C15184c cVar) {
        C15240j2 j2Var = this.f5813d;
        if (j2Var != null) {
            C15187e.m65710e5(cVar, j2Var.mo42833M(), 0, 0, 0.0f, (C15192h) null, (C15249k2) null, 0, 126, (Object) null);
        }
        C15421z1 z1Var = this.f5814e;
        if (z1Var != null) {
            C15187e.m65700T3(cVar, z1Var, 0, 0, this.f5815f, (C15192h) null, (C15249k2) null, 0, 118, (Object) null);
        }
    }

    @C12579k
    public String toString() {
        return "Background(color=" + this.f5813d + ", brush=" + this.f5814e + ", alpha = " + this.f5815f + ", shape=" + this.f5816g + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2123g(C15240j2 j2Var, C15421z1 z1Var, float f, C15218g4 g4Var, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : j2Var, (i & 2) != 0 ? null : z1Var, (i & 4) != 0 ? 1.0f : f, g4Var, lVar, (DefaultConstructorMarker) null);
    }

    public C2123g(C15240j2 j2Var, C15421z1 z1Var, float f, C15218g4 g4Var, C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        this.f5813d = j2Var;
        this.f5814e = z1Var;
        this.f5815f = f;
        this.f5816g = g4Var;
    }
}
