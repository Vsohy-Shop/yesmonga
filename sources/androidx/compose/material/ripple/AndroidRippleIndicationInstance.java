package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.C2245i;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15208f0;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8616s1;
import androidx.compose.runtime.C8700z0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,253:1\n76#2:254\n102#2,2:255\n76#2:257\n102#2,2:258\n138#3:260\n245#4:261\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n*L\n139#1:254\n139#1:255,2\n147#1:257\n147#1:258,2\n172#1:260\n186#1:261\n*E\n"})
public final class AndroidRippleIndicationInstance extends C7921i implements C8616s1 {

    /* renamed from: b */
    public final boolean f18975b;

    /* renamed from: c */
    public final float f18976c;
    @C12579k

    /* renamed from: d */
    public final C8578k2<C15240j2> f18977d;
    @C12579k

    /* renamed from: e */
    public final C8578k2<C7917e> f18978e;
    @C12579k

    /* renamed from: f */
    public final RippleContainer f18979f;
    @C12579k

    /* renamed from: g */
    public final C8700z0 f18980g;
    @C12579k

    /* renamed from: v */
    public final C8700z0 f18981v;

    /* renamed from: w */
    public long f18982w;

    /* renamed from: x */
    public int f18983x;
    @C12579k

    /* renamed from: y */
    public final C11289a<C11079d2> f18984y;

    public /* synthetic */ AndroidRippleIndicationInstance(boolean z, float f, C8578k2 k2Var, C8578k2 k2Var2, RippleContainer rippleContainer, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, k2Var, k2Var2, rippleContainer);
    }

    /* renamed from: a */
    public void mo7285a(@C12579k C15184c cVar) {
        int i;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        this.f18982w = cVar.mo42718b();
        if (Float.isNaN(this.f18976c)) {
            i = C11409d.m43851L0(C7918f.m25271a(cVar, this.f18975b, cVar.mo42718b()));
        } else {
            i = cVar.mo7429n2(this.f18976c);
        }
        this.f18983x = i;
        long M = this.f18977d.getValue().mo42833M();
        float d = this.f18978e.getValue().mo11054d();
        cVar.mo42716g6();
        mo11063c(cVar, this.f18976c, M);
        C15118b2 c = cVar.mo42683q5().mo42705c();
        mo11005l();
        RippleHostView m = mo11006m();
        if (m != null) {
            m.mo11040f(cVar.mo42718b(), this.f18983x, M, d);
            m.draw(C15208f0.m65929d(c));
        }
    }

    /* renamed from: b */
    public void mo11002b(@C12579k C2245i.C2247b bVar, @C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(bVar, "interaction");
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        RippleHostView b = this.f18979f.mo11033b(this);
        b.mo11036b(bVar, this.f18975b, this.f18982w, this.f18983x, this.f18977d.getValue().mo42833M(), this.f18978e.getValue().mo11054d(), this.f18984y);
        mo11009p(b);
    }

    /* renamed from: d */
    public void mo8797d() {
    }

    /* renamed from: e */
    public void mo8799e() {
        mo11004k();
    }

    /* renamed from: f */
    public void mo11003f(@C12579k C2245i.C2247b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "interaction");
        RippleHostView m = mo11006m();
        if (m != null) {
            m.mo11039e();
        }
    }

    /* renamed from: g */
    public void mo8800g() {
        mo11004k();
    }

    /* renamed from: k */
    public final void mo11004k() {
        this.f18979f.mo11032a(this);
    }

    /* renamed from: l */
    public final boolean mo11005l() {
        return ((Boolean) this.f18981v.getValue()).booleanValue();
    }

    /* renamed from: m */
    public final RippleHostView mo11006m() {
        return (RippleHostView) this.f18980g.getValue();
    }

    /* renamed from: n */
    public final void mo11007n() {
        mo11009p((RippleHostView) null);
    }

    /* renamed from: o */
    public final void mo11008o(boolean z) {
        this.f18981v.setValue(Boolean.valueOf(z));
    }

    /* renamed from: p */
    public final void mo11009p(RippleHostView rippleHostView) {
        this.f18980g.setValue(rippleHostView);
    }

    public AndroidRippleIndicationInstance(boolean z, float f, C8578k2<C15240j2> k2Var, C8578k2<C7917e> k2Var2, RippleContainer rippleContainer) {
        super(z, k2Var2);
        this.f18975b = z;
        this.f18976c = f;
        this.f18977d = k2Var;
        this.f18978e = k2Var2;
        this.f18979f = rippleContainer;
        this.f18980g = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f18981v = C8539f2.m30981g(Boolean.TRUE, (C8410b2) null, 2, (Object) null);
        this.f18982w = C15104m.f37280b.mo42317c();
        this.f18983x = -1;
        this.f18984y = new AndroidRippleIndicationInstance$onInvalidateRipple$1(this);
    }
}
