package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.node.C15723p0;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.unit.C16476b;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012#\u0010\u0010\u001a\u001f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0002\b\u000eø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016J)\u0010\u000f\u001a\u001f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0002\b\u000eHÆ\u0003ø\u0001\u0000J3\u0010\u0011\u001a\u00020\u00002%\b\u0002\u0010\u0010\u001a\u001f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0002\b\u000eHÆ\u0001ø\u0001\u0000J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R7\u0010\u0010\u001a\u001f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0002\b\u000e8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, mo22516d2 = {"Landroidx/compose/ui/layout/LayoutModifierElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/layout/v;", "x", "node", "z", "Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "r", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/h0;", "Landroidx/compose/ui/layout/e0;", "Landroidx/compose/ui/unit/b;", "Landroidx/compose/ui/layout/g0;", "Lkotlin/t;", "t", "measure", "u", "", "toString", "", "hashCode", "", "other", "", "equals", "c", "Lkotlin/jvm/functions/q;", "y", "()Lkotlin/jvm/functions/q;", "<init>", "(Lkotlin/jvm/functions/q;)V", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.layout.LayoutModifierElement */
final class LayoutModifierElement extends C15723p0<C15607v> {
    @C12579k

    /* renamed from: c */
    public final C11305q<C15568h0, C15557e0, C16476b, C15564g0> f38625c;

    public LayoutModifierElement(@C12579k C11305q<? super C15568h0, ? super C15557e0, ? super C16476b, ? extends C15564g0> qVar) {
        Intrinsics.checkNotNullParameter(qVar, "measure");
        this.f38625c = qVar;
    }

    /* renamed from: v */
    public static /* synthetic */ LayoutModifierElement m68911v(LayoutModifierElement layoutModifierElement, C11305q<C15568h0, C15557e0, C16476b, C15564g0> qVar, int i, Object obj) {
        if ((i & 1) != 0) {
            qVar = layoutModifierElement.f38625c;
        }
        return layoutModifierElement.mo44260u(qVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutModifierElement) && Intrinsics.areEqual((Object) this.f38625c, (Object) ((LayoutModifierElement) obj).f38625c);
    }

    public int hashCode() {
        return this.f38625c.hashCode();
    }

    /* renamed from: r */
    public void mo17101r(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.mo45973d("layout");
        v0Var.mo45971b().mo45707c("measure", this.f38625c);
    }

    @C12579k
    /* renamed from: t */
    public final C11305q<C15568h0, C15557e0, C16476b, C15564g0> mo44258t() {
        return this.f38625c;
    }

    @C12579k
    public String toString() {
        return "LayoutModifierElement(measure=" + this.f38625c + ')';
    }

    @C12579k
    /* renamed from: u */
    public final LayoutModifierElement mo44260u(@C12579k C11305q<? super C15568h0, ? super C15557e0, ? super C16476b, ? extends C15564g0> qVar) {
        Intrinsics.checkNotNullParameter(qVar, "measure");
        return new LayoutModifierElement(qVar);
    }

    @C12579k
    /* renamed from: x */
    public C15607v mo17098a() {
        return new C15607v(this.f38625c);
    }

    @C12579k
    /* renamed from: y */
    public final C11305q<C15568h0, C15557e0, C16476b, C15564g0> mo44262y() {
        return this.f38625c;
    }

    @C12579k
    /* renamed from: z */
    public C15607v mo17102s(@C12579k C15607v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "node");
        vVar.mo44465k0(this.f38625c);
        return vVar;
    }
}
