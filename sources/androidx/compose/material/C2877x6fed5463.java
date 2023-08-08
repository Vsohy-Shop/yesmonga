package androidx.compose.material;

import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlin.math.C11409d;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 */
public final class C2877x6fed5463 extends Lambda implements C11300l<C16476b, C16476b> {
    final /* synthetic */ float $headerHeightPx;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2877x6fed5463(float f) {
        super(1);
        this.$headerHeightPx = f;
    }

    /* renamed from: a */
    public final long mo9984a(long j) {
        return C16478c.m74385j(C16476b.m74351e(j, 0, 0, 0, 0, 10, (Object) null), 0, -C11409d.m43851L0(this.$headerHeightPx), 1, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return C16476b.m74348b(mo9984a(((C16476b) obj).mo47807x()));
    }
}
