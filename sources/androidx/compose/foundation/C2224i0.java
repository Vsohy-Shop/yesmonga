package androidx.compose.foundation;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.unit.C16509w;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.i0 */
public final class C2224i0 implements C2253k0 {
    @C12579k

    /* renamed from: a */
    public static final C2224i0 f5977a = new C2224i0();

    /* renamed from: a */
    public boolean mo7106a() {
        return false;
    }

    @C12579k
    /* renamed from: b */
    public C8767m mo7107b() {
        return C8767m.f23478j;
    }

    /* renamed from: c */
    public long mo7108c(long j, int i, @C12579k C11300l<? super C15094f, C15094f> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "performScroll");
        return lVar.invoke(C15094f.m64868d(j)).mo42242A();
    }

    @C12580l
    /* renamed from: d */
    public Object mo7109d(long j, @C12579k C11304p<? super C16509w, ? super C11045c<? super C16509w>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object invoke = pVar.invoke(C16509w.m74740b(j), cVar);
        return invoke == C11063b.m42612h() ? invoke : C11079d2.f28267a;
    }
}
