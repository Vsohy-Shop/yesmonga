package androidx.compose.animation;

import androidx.appcompat.graphics.drawable.C0508a;
import androidx.compose.animation.core.Transition;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C2031i
/* renamed from: androidx.compose.animation.c */
public final class C1915c implements AnimatedVisibilityScope {
    @C12579k

    /* renamed from: a */
    public Transition<EnterExitState> f5274a;
    @C12579k

    /* renamed from: b */
    public final C8700z0<C16500q> f5275b = C8539f2.m30981g(C16500q.m74651b(C16500q.f40900b.mo47897a()), (C8410b2) null, 2, (Object) null);

    public C1915c(@C12579k Transition<EnterExitState> transition) {
        Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        this.f5274a = transition;
    }

    @C12579k
    /* renamed from: c */
    public Transition<EnterExitState> mo6487c() {
        return this.f5274a;
    }

    @C12579k
    /* renamed from: e */
    public final C8700z0<C16500q> mo6594e() {
        return this.f5275b;
    }

    /* renamed from: f */
    public void mo6595f(@C12579k Transition<EnterExitState> transition) {
        Intrinsics.checkNotNullParameter(transition, "<set-?>");
        this.f5274a = transition;
    }
}
