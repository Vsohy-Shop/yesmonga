package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.node.C15723p0;
import androidx.compose.p004ui.platform.C15983v0;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\u0013\u001a\u00020\tHÂ\u0003R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo22516d2 = {"Landroidx/compose/ui/layout/LayoutIdModifierElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/layout/r;", "x", "node", "y", "Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "r", "", "layoutId", "u", "", "toString", "", "hashCode", "other", "", "equals", "t", "c", "Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.layout.LayoutIdModifierElement */
final class LayoutIdModifierElement extends C15723p0<C15596r> {
    @C12579k

    /* renamed from: c */
    public final Object f38623c;

    public LayoutIdModifierElement(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "layoutId");
        this.f38623c = obj;
    }

    /* renamed from: v */
    public static /* synthetic */ LayoutIdModifierElement m68895v(LayoutIdModifierElement layoutIdModifierElement, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = layoutIdModifierElement.f38623c;
        }
        return layoutIdModifierElement.mo44251u(obj);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdModifierElement) && Intrinsics.areEqual(this.f38623c, ((LayoutIdModifierElement) obj).f38623c);
    }

    public int hashCode() {
        return this.f38623c.hashCode();
    }

    /* renamed from: r */
    public void mo17101r(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.mo45973d("layoutId");
        v0Var.mo45974e(this.f38623c);
    }

    /* renamed from: t */
    public final Object mo44249t() {
        return this.f38623c;
    }

    @C12579k
    public String toString() {
        return "LayoutIdModifierElement(layoutId=" + this.f38623c + ')';
    }

    @C12579k
    /* renamed from: u */
    public final LayoutIdModifierElement mo44251u(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "layoutId");
        return new LayoutIdModifierElement(obj);
    }

    @C12579k
    /* renamed from: x */
    public C15596r mo17098a() {
        return new C15596r(this.f38623c);
    }

    @C12579k
    /* renamed from: y */
    public C15596r mo17102s(@C12579k C15596r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "node");
        rVar.mo44448j0(this.f38623c);
        return rVar;
    }
}
