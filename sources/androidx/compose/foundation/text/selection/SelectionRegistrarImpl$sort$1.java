package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.layout.C15588o;
import kotlin.C11076d0;
import kotlin.comparisons.C11006g;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/foundation/text/selection/h;", "a", "b", "", "(Landroidx/compose/foundation/text/selection/h;Landroidx/compose/foundation/text/selection/h;)Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SelectionRegistrarImpl$sort$1 extends Lambda implements C11304p<C2829h, C2829h, Integer> {
    final /* synthetic */ C15588o $containerLayoutCoordinates;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionRegistrarImpl$sort$1(C15588o oVar) {
        super(2);
        this.$containerLayoutCoordinates = oVar;
    }

    @C12579k
    /* renamed from: a */
    public final Integer invoke(@C12579k C2829h hVar, @C12579k C2829h hVar2) {
        long j;
        long j2;
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(hVar, "a");
        Intrinsics.checkNotNullParameter(hVar2, "b");
        C15588o e = hVar.mo9858e();
        C15588o e2 = hVar2.mo9858e();
        if (e != null) {
            j = this.$containerLayoutCoordinates.mo44430K(e, C15094f.f37256b.mo42248e());
        } else {
            j = C15094f.f37256b.mo42248e();
        }
        if (e2 != null) {
            j2 = this.$containerLayoutCoordinates.mo44430K(e2, C15094f.f37256b.mo42248e());
        } else {
            j2 = C15094f.f37256b.mo42248e();
        }
        if (C15094f.m64882r(j) == C15094f.m64882r(j2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = C11006g.m42424l(Float.valueOf(C15094f.m64880p(j)), Float.valueOf(C15094f.m64880p(j2)));
        } else {
            i = C11006g.m42424l(Float.valueOf(C15094f.m64882r(j)), Float.valueOf(C15094f.m64882r(j2)));
        }
        return Integer.valueOf(i);
    }
}
