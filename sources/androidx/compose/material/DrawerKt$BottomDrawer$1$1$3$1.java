package androidx.compose.material;

import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8700z0;
import com.urbanairship.iam.C9259x;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DrawerKt$BottomDrawer$1$1$3$1 extends Lambda implements C11300l<C15588o, C11079d2> {
    final /* synthetic */ C8700z0<Float> $drawerHeight$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$1$1$3$1(C8700z0<Float> z0Var) {
        super(1);
        this.$drawerHeight$delegate = z0Var;
    }

    /* renamed from: a */
    public final void mo10142a(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, C9259x.f25239v);
        DrawerKt$BottomDrawer$1.m13450d(this.$drawerHeight$delegate, (float) C16500q.m74659j(oVar.mo44434a()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10142a((C15588o) obj);
        return C11079d2.f28267a;
    }
}
