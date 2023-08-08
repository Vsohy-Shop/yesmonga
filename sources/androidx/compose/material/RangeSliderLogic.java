package androidx.compose.material;

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
    public final C2243g f7797a;
    @C12579k

    /* renamed from: b */
    public final C2243g f7798b;
    @C12579k

    /* renamed from: c */
    public final C8578k2<Float> f7799c;
    @C12579k

    /* renamed from: d */
    public final C8578k2<Float> f7800d;
    @C12579k

    /* renamed from: e */
    public final C8578k2<C11304p<Boolean, Float, C11079d2>> f7801e;

    public RangeSliderLogic(@C12579k C2243g gVar, @C12579k C2243g gVar2, @C12579k C8578k2<Float> k2Var, @C12579k C8578k2<Float> k2Var2, @C12579k C8578k2<? extends C11304p<? super Boolean, ? super Float, C11079d2>> k2Var3) {
        Intrinsics.checkNotNullParameter(gVar, "startInteractionSource");
        Intrinsics.checkNotNullParameter(gVar2, "endInteractionSource");
        Intrinsics.checkNotNullParameter(k2Var, "rawOffsetStart");
        Intrinsics.checkNotNullParameter(k2Var2, "rawOffsetEnd");
        Intrinsics.checkNotNullParameter(k2Var3, "onDrag");
        this.f7797a = gVar;
        this.f7798b = gVar2;
        this.f7799c = k2Var;
        this.f7800d = k2Var2;
        this.f7801e = k2Var3;
    }

    @C12579k
    /* renamed from: a */
    public final C2243g mo10353a(boolean z) {
        return z ? this.f7797a : this.f7798b;
    }

    /* renamed from: b */
    public final void mo10354b(boolean z, float f, @C12579k C2240d dVar, @C12579k C12074o0 o0Var) {
        C8578k2<Float> k2Var;
        Intrinsics.checkNotNullParameter(dVar, "interaction");
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        C11304p value = this.f7801e.getValue();
        Boolean valueOf = Boolean.valueOf(z);
        if (z) {
            k2Var = this.f7799c;
        } else {
            k2Var = this.f7800d;
        }
        value.invoke(valueOf, Float.valueOf(f - k2Var.getValue().floatValue()));
        C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new RangeSliderLogic$captureThumb$1(this, z, dVar, (C11045c<? super RangeSliderLogic$captureThumb$1>) null), 3, (Object) null);
    }

    /* renamed from: c */
    public final int mo10355c(float f) {
        return Float.compare(Math.abs(this.f7799c.getValue().floatValue() - f), Math.abs(this.f7800d.getValue().floatValue() - f));
    }

    @C12579k
    /* renamed from: d */
    public final C2243g mo10356d() {
        return this.f7798b;
    }

    @C12579k
    /* renamed from: e */
    public final C8578k2<C11304p<Boolean, Float, C11079d2>> mo10357e() {
        return this.f7801e;
    }

    @C12579k
    /* renamed from: f */
    public final C8578k2<Float> mo10358f() {
        return this.f7800d;
    }

    @C12579k
    /* renamed from: g */
    public final C8578k2<Float> mo10359g() {
        return this.f7799c;
    }

    @C12579k
    /* renamed from: h */
    public final C2243g mo10360h() {
        return this.f7797a;
    }
}
