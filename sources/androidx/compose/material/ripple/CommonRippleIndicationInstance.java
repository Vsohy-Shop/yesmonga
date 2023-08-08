package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.C2245i;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8616s1;
import androidx.compose.runtime.snapshots.C8667t;
import java.util.Map;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleIndicationInstance\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,119:1\n215#2,2:120\n215#2,2:122\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleIndicationInstance\n*L\n77#1:120,2\n99#1:122,2\n*E\n"})
public final class CommonRippleIndicationInstance extends C7921i implements C8616s1 {

    /* renamed from: b */
    public final boolean f18985b;

    /* renamed from: c */
    public final float f18986c;
    @C12579k

    /* renamed from: d */
    public final C8578k2<C15240j2> f18987d;
    @C12579k

    /* renamed from: e */
    public final C8578k2<C7917e> f18988e;
    @C12579k

    /* renamed from: f */
    public final C8667t<C2245i.C2247b, RippleAnimation> f18989f;

    public /* synthetic */ CommonRippleIndicationInstance(boolean z, float f, C8578k2 k2Var, C8578k2 k2Var2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, k2Var, k2Var2);
    }

    /* renamed from: a */
    public void mo7285a(@C12579k C15184c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        long M = this.f18987d.getValue().mo42833M();
        cVar.mo42716g6();
        mo11063c(cVar, this.f18986c, M);
        mo11010j(cVar, M);
    }

    /* renamed from: b */
    public void mo11002b(@C12579k C2245i.C2247b bVar, @C12579k C12074o0 o0Var) {
        C15094f fVar;
        Intrinsics.checkNotNullParameter(bVar, "interaction");
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        for (Map.Entry<C2245i.C2247b, RippleAnimation> value : this.f18989f.entrySet()) {
            ((RippleAnimation) value.getValue()).mo11021j();
        }
        if (this.f18985b) {
            fVar = C15094f.m64868d(bVar.mo7608a());
        } else {
            fVar = null;
        }
        RippleAnimation rippleAnimation = new RippleAnimation(fVar, this.f18986c, this.f18985b, (DefaultConstructorMarker) null);
        this.f18989f.put(bVar, rippleAnimation);
        C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new CommonRippleIndicationInstance$addRipple$2(rippleAnimation, this, bVar, (C11045c<? super CommonRippleIndicationInstance$addRipple$2>) null), 3, (Object) null);
    }

    /* renamed from: d */
    public void mo8797d() {
    }

    /* renamed from: e */
    public void mo8799e() {
        this.f18989f.clear();
    }

    /* renamed from: f */
    public void mo11003f(@C12579k C2245i.C2247b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "interaction");
        RippleAnimation rippleAnimation = this.f18989f.get(bVar);
        if (rippleAnimation != null) {
            rippleAnimation.mo11021j();
        }
    }

    /* renamed from: g */
    public void mo8800g() {
        this.f18989f.clear();
    }

    /* renamed from: j */
    public final void mo11010j(C15187e eVar, long j) {
        boolean z;
        for (Map.Entry<C2245i.C2247b, RippleAnimation> value : this.f18989f.entrySet()) {
            RippleAnimation rippleAnimation = (RippleAnimation) value.getValue();
            float d = this.f18988e.getValue().mo11054d();
            if (d == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                rippleAnimation.mo11018g(eVar, C15240j2.m66080w(j, d, 0.0f, 0.0f, 0.0f, 14, (Object) null));
            }
        }
    }

    public CommonRippleIndicationInstance(boolean z, float f, C8578k2<C15240j2> k2Var, C8578k2<C7917e> k2Var2) {
        super(z, k2Var2);
        this.f18985b = z;
        this.f18986c = f;
        this.f18987d = k2Var;
        this.f18988e = k2Var2;
        this.f18989f = C8415c2.m30239h();
    }
}
