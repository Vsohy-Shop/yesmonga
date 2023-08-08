package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.p004ui.draw.C8751i;
import androidx.compose.p004ui.draw.CacheDrawScope;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.drawscope.C15186d;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.graphics.drawscope.C15193i;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1 extends Lambda implements C11300l<CacheDrawScope, C8751i> {
    final /* synthetic */ long $handleColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1(long j) {
        super(1);
        this.$handleColor = j;
    }

    @C12579k
    /* renamed from: a */
    public final C8751i invoke(@C12579k CacheDrawScope cacheDrawScope) {
        Intrinsics.checkNotNullParameter(cacheDrawScope, "$this$drawWithCache");
        final float t = C15104m.m65023t(cacheDrawScope.mo17089b()) / 2.0f;
        final C15403w2 e = AndroidSelectionHandles_androidKt.m12668e(cacheDrawScope, t);
        final C15249k2 d = C15249k2.C15250a.m66144d(C15249k2.f37569b, this.$handleColor, 0, 2, (Object) null);
        return cacheDrawScope.mo17094h(new C11300l<C15184c, C11079d2>() {
            /* renamed from: a */
            public final void mo9218a(@C12579k C15184c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$onDrawWithContent");
                cVar.mo42716g6();
                float f = t;
                C15403w2 w2Var = e;
                C15249k2 k2Var = d;
                C15186d q5 = cVar.mo42683q5();
                long b = q5.mo42704b();
                q5.mo42705c().mo42422E();
                C15193i a = q5.mo42703a();
                C15193i.m65805f(a, f, 0.0f, 2, (Object) null);
                a.mo42714k(45.0f, C15094f.f37256b.mo42248e());
                C15187e.m65719s3(cVar, w2Var, 0, 0.0f, (C15192h) null, k2Var, 0, 46, (Object) null);
                q5.mo42705c().mo42443q();
                q5.mo42706d(b);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo9218a((C15184c) obj);
                return C11079d2.f28267a;
            }
        });
    }
}
