package androidx.compose.foundation.shape;

import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15174d3;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15318t0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.foundation.shape.k */
public final class C2690k implements C15218g4 {

    /* renamed from: b */
    public static final int f7052b = 0;
    @C12579k

    /* renamed from: a */
    public final C11305q<C15231i3, C15104m, LayoutDirection, C11079d2> f7053a;

    public C2690k(@C12579k C11305q<? super C15231i3, ? super C15104m, ? super LayoutDirection, C11079d2> qVar) {
        Intrinsics.checkNotNullParameter(qVar, "builder");
        this.f7053a = qVar;
    }

    @C12579k
    /* renamed from: a */
    public C15174d3 mo7615a(long j, @C12579k LayoutDirection layoutDirection, @C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(dVar, "density");
        C15231i3 a = C15318t0.m66550a();
        this.f7053a.invoke(a, C15104m.m65006c(j), layoutDirection);
        a.close();
        return new C15174d3.C15175a(a);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        C11305q<C15231i3, C15104m, LayoutDirection, C11079d2> qVar = null;
        C2690k kVar = obj instanceof C2690k ? (C2690k) obj : null;
        if (kVar != null) {
            qVar = kVar.f7053a;
        }
        return Intrinsics.areEqual((Object) qVar, (Object) this.f7053a);
    }

    public int hashCode() {
        return this.f7053a.hashCode();
    }
}
