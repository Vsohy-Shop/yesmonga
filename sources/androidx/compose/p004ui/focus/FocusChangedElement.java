package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.node.C15723p0;
import androidx.compose.p004ui.platform.C15983v0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016J\u0015\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, mo22516d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/focus/c;", "x", "node", "z", "Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "r", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/z;", "t", "onFocusChanged", "u", "", "toString", "", "hashCode", "", "other", "", "equals", "c", "Lkotlin/jvm/functions/l;", "y", "()Lkotlin/jvm/functions/l;", "<init>", "(Lkotlin/jvm/functions/l;)V", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.focus.FocusChangedElement */
final class FocusChangedElement extends C15723p0<C15058c> {
    @C12579k

    /* renamed from: c */
    public final C11300l<C15087z, C11079d2> f37172c;

    public FocusChangedElement(@C12579k C11300l<? super C15087z, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onFocusChanged");
        this.f37172c = lVar;
    }

    /* renamed from: v */
    public static /* synthetic */ FocusChangedElement m64465v(FocusChangedElement focusChangedElement, C11300l<C15087z, C11079d2> lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = focusChangedElement.f37172c;
        }
        return focusChangedElement.mo42057u(lVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && Intrinsics.areEqual((Object) this.f37172c, (Object) ((FocusChangedElement) obj).f37172c);
    }

    public int hashCode() {
        return this.f37172c.hashCode();
    }

    /* renamed from: r */
    public void mo17101r(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.mo45973d("onFocusChanged");
        v0Var.mo45971b().mo45707c("onFocusChanged", this.f37172c);
    }

    @C12579k
    /* renamed from: t */
    public final C11300l<C15087z, C11079d2> mo42055t() {
        return this.f37172c;
    }

    @C12579k
    public String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f37172c + ')';
    }

    @C12579k
    /* renamed from: u */
    public final FocusChangedElement mo42057u(@C12579k C11300l<? super C15087z, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onFocusChanged");
        return new FocusChangedElement(lVar);
    }

    @C12579k
    /* renamed from: x */
    public C15058c mo17098a() {
        return new C15058c(this.f37172c);
    }

    @C12579k
    /* renamed from: y */
    public final C11300l<C15087z, C11079d2> mo42059y() {
        return this.f37172c;
    }

    @C12579k
    /* renamed from: z */
    public C15058c mo17102s(@C12579k C15058c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "node");
        cVar.mo42179k0(this.f37172c);
        return cVar;
    }
}
