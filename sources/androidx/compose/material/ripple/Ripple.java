package androidx.compose.material.ripple;

import androidx.compose.foundation.C2104a0;
import androidx.compose.foundation.C2107b0;
import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C11363r0({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/Ripple\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,355:1\n76#2:356\n654#3:357\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/Ripple\n*L\n117#1:356\n119#1:357\n*E\n"})
public abstract class Ripple implements C2104a0 {

    /* renamed from: a */
    public final boolean f18990a;

    /* renamed from: b */
    public final float f18991b;
    @C12579k

    /* renamed from: c */
    public final C8578k2<C15240j2> f18992c;

    public /* synthetic */ Ripple(boolean z, float f, C8578k2 k2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, k2Var);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C2107b0 mo7284a(@C12579k C2241e eVar, @C12580l C8592o oVar, int i) {
        boolean z;
        long j;
        Intrinsics.checkNotNullParameter(eVar, "interactionSource");
        oVar.mo14918M(988743187);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(988743187, i, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:113)");
        }
        C7923k kVar = (C7923k) oVar.mo15032w(RippleThemeKt.m25257d());
        oVar.mo14918M(-1524341038);
        if (this.f18992c.getValue().mo42833M() != C15240j2.f37547b.mo42851u()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j = this.f18992c.getValue().mo42833M();
        } else {
            j = kVar.mo10994a(oVar, 0);
        }
        oVar.mo15002m0();
        C7921i b = mo11012b(eVar, this.f18990a, this.f18991b, C8415c2.m30251t(C15240j2.m66071n(j), oVar, 0), C8415c2.m30251t(kVar.mo10995b(oVar, 0), oVar, 0), oVar, (i & 14) | ((i << 12) & 458752));
        EffectsKt.m29895g(b, eVar, new Ripple$rememberUpdatedInstance$1(eVar, b, (C11045c<? super Ripple$rememberUpdatedInstance$1>) null), oVar, ((i << 3) & 112) | 520);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return b;
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public abstract C7921i mo11012b(@C12579k C2241e eVar, boolean z, float f, @C12579k C8578k2<C15240j2> k2Var, @C12579k C8578k2<C7917e> k2Var2, @C12580l C8592o oVar, int i);

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ripple)) {
            return false;
        }
        Ripple ripple = (Ripple) obj;
        if (this.f18990a == ripple.f18990a && C16483g.m74440e0(this.f18991b, ripple.f18991b) && Intrinsics.areEqual((Object) this.f18992c, (Object) ripple.f18992c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f18990a) * 31) + C16483g.m74442h0(this.f18991b)) * 31) + this.f18992c.hashCode();
    }

    public Ripple(boolean z, float f, C8578k2<C15240j2> k2Var) {
        this.f18990a = z;
        this.f18991b = f;
        this.f18992c = k2Var;
    }
}
