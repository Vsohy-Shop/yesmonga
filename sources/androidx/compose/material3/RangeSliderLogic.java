package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2240d;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.runtime.C8578k2;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

public final class RangeSliderLogic {
    @C12579k

    /* renamed from: a */
    public final C2243g f19595a;
    @C12579k

    /* renamed from: b */
    public final C2243g f19596b;
    @C12579k

    /* renamed from: c */
    public final C8578k2<Float> f19597c;
    @C12579k

    /* renamed from: d */
    public final C8578k2<Float> f19598d;
    @C12579k

    /* renamed from: e */
    public final C8578k2<C11304p<Boolean, Float, C11079d2>> f19599e;

    public RangeSliderLogic(@C12579k C2243g gVar, @C12579k C2243g gVar2, @C12579k C8578k2<Float> k2Var, @C12579k C8578k2<Float> k2Var2, @C12579k C8578k2<? extends C11304p<? super Boolean, ? super Float, C11079d2>> k2Var3) {
        Intrinsics.checkNotNullParameter(gVar, "startInteractionSource");
        Intrinsics.checkNotNullParameter(gVar2, "endInteractionSource");
        Intrinsics.checkNotNullParameter(k2Var, "rawOffsetStart");
        Intrinsics.checkNotNullParameter(k2Var2, "rawOffsetEnd");
        Intrinsics.checkNotNullParameter(k2Var3, "onDrag");
        this.f19595a = gVar;
        this.f19596b = gVar2;
        this.f19597c = k2Var;
        this.f19598d = k2Var2;
        this.f19599e = k2Var3;
    }

    @C12579k
    /* renamed from: a */
    public final C2243g mo11799a(boolean z) {
        return z ? this.f19595a : this.f19596b;
    }

    /* renamed from: b */
    public final void mo11800b(boolean z, float f, @C12579k C2240d dVar, @C12579k C12074o0 o0Var) {
        C8578k2<Float> k2Var;
        Intrinsics.checkNotNullParameter(dVar, "interaction");
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        C11304p value = this.f19599e.getValue();
        Boolean valueOf = Boolean.valueOf(z);
        if (z) {
            k2Var = this.f19597c;
        } else {
            k2Var = this.f19598d;
        }
        value.invoke(valueOf, Float.valueOf(f - k2Var.getValue().floatValue()));
        C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new RangeSliderLogic$captureThumb$1(this, z, dVar, (C11045c<? super RangeSliderLogic$captureThumb$1>) null), 3, (Object) null);
    }

    /* renamed from: c */
    public final int mo11801c(float f) {
        return Float.compare(Math.abs(this.f19597c.getValue().floatValue() - f), Math.abs(this.f19598d.getValue().floatValue() - f));
    }

    @C12579k
    /* renamed from: d */
    public final C2243g mo11802d() {
        return this.f19596b;
    }

    @C12579k
    /* renamed from: e */
    public final C8578k2<C11304p<Boolean, Float, C11079d2>> mo11803e() {
        return this.f19599e;
    }

    @C12579k
    /* renamed from: f */
    public final C8578k2<Float> mo11804f() {
        return this.f19598d;
    }

    @C12579k
    /* renamed from: g */
    public final C8578k2<Float> mo11805g() {
        return this.f19597c;
    }

    @C12579k
    /* renamed from: h */
    public final C2243g mo11806h() {
        return this.f19595a;
    }
}
