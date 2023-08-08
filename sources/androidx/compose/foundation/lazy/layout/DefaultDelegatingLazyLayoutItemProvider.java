package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.C2855v;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2855v
public final class DefaultDelegatingLazyLayoutItemProvider implements C2549h {
    @C12579k

    /* renamed from: a */
    public final C8578k2<C2549h> f6681a;

    public DefaultDelegatingLazyLayoutItemProvider(@C12579k C8578k2<? extends C2549h> k2Var) {
        Intrinsics.checkNotNullParameter(k2Var, "delegate");
        this.f6681a = k2Var;
    }

    /* renamed from: a */
    public int mo8288a() {
        return this.f6681a.getValue().mo8288a();
    }

    @C12580l
    /* renamed from: b */
    public Object mo8289b(int i) {
        return this.f6681a.getValue().mo8289b(i);
    }

    @C8540g
    /* renamed from: e */
    public void mo8291e(int i, @C12580l C8592o oVar, int i2) {
        int i3;
        int i4;
        int i5;
        C8592o o = oVar.mo15009o(1633511187);
        if ((i2 & 14) == 0) {
            if (o.mo14976f(i)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (o.mo15006n0(this)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1633511187, i3, -1, "androidx.compose.foundation.lazy.layout.DefaultDelegatingLazyLayoutItemProvider.Item (LazyLayoutItemProvider.kt:194)");
            }
            this.f6681a.getValue().mo8291e(i, o, i3 & 14);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DefaultDelegatingLazyLayoutItemProvider$Item$1(this, i, i2));
        }
    }

    @C12579k
    /* renamed from: f */
    public Map<Object, Integer> mo8292f() {
        return this.f6681a.getValue().mo8292f();
    }

    @C12579k
    /* renamed from: g */
    public Object mo8293g(int i) {
        return this.f6681a.getValue().mo8293g(i);
    }
}
