package androidx.compose.material;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BackdropScaffoldKt$BackdropScaffold$1$1$1$1 extends Lambda implements C11300l<C16479d, C16494m> {
    final /* synthetic */ BackdropScaffoldState $scaffoldState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$1$1$1$1(BackdropScaffoldState backdropScaffoldState) {
        super(1);
        this.$scaffoldState = backdropScaffoldState;
    }

    /* renamed from: a */
    public final long mo9977a(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "$this$offset");
        return C16496n.m74593a(0, C11409d.m43851L0(this.$scaffoldState.mo10518v().getValue().floatValue()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return C16494m.m74570b(mo9977a((C16479d) obj));
    }
}
