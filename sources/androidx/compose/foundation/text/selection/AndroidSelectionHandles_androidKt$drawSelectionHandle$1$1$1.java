package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.draw.C8751i;
import androidx.compose.p004ui.draw.CacheDrawScope;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.drawscope.C15186d;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.text.style.ResolvedTextDirection;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1 extends Lambda implements C11300l<CacheDrawScope, C8751i> {
    final /* synthetic */ ResolvedTextDirection $direction;
    final /* synthetic */ long $handleColor;
    final /* synthetic */ boolean $handlesCrossed;
    final /* synthetic */ boolean $isStartHandle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1(long j, boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        super(1);
        this.$handleColor = j;
        this.$isStartHandle = z;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z2;
    }

    @C12579k
    /* renamed from: a */
    public final C8751i invoke(@C12579k CacheDrawScope cacheDrawScope) {
        Intrinsics.checkNotNullParameter(cacheDrawScope, "$this$drawWithCache");
        final C15403w2 e = AndroidSelectionHandles_androidKt.m12668e(cacheDrawScope, C15104m.m65023t(cacheDrawScope.mo17089b()) / 2.0f);
        final C15249k2 d = C15249k2.C15250a.m66144d(C15249k2.f37569b, this.$handleColor, 0, 2, (Object) null);
        final boolean z = this.$isStartHandle;
        final ResolvedTextDirection resolvedTextDirection = this.$direction;
        final boolean z2 = this.$handlesCrossed;
        return cacheDrawScope.mo17094h(new C11300l<C15184c, C11079d2>() {
            /* renamed from: a */
            public final void mo9593a(@C12579k C15184c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$onDrawWithContent");
                cVar.mo42716g6();
                if (AndroidSelectionHandles_androidKt.m12671h(z, resolvedTextDirection, z2)) {
                    C15403w2 w2Var = e;
                    C15249k2 k2Var = d;
                    long U = cVar.mo42717U();
                    C15186d q5 = cVar.mo42683q5();
                    long b = q5.mo42704b();
                    q5.mo42705c().mo42422E();
                    q5.mo42703a().mo42713j(-1.0f, 1.0f, U);
                    C15187e.m65719s3(cVar, w2Var, 0, 0.0f, (C15192h) null, k2Var, 0, 46, (Object) null);
                    q5.mo42705c().mo42443q();
                    q5.mo42706d(b);
                    return;
                }
                C15187e.m65719s3(cVar, e, 0, 0.0f, (C15192h) null, d, 0, 46, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo9593a((C15184c) obj);
                return C11079d2.f28267a;
            }
        });
    }
}
