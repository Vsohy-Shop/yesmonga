package androidx.compose.p004ui.input.rotary;

import androidx.compose.p004ui.node.C15723p0;
import androidx.compose.p004ui.platform.C15983v0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, mo22516d2 = {"Landroidx/compose/ui/input/rotary/OnPreRotaryScrollEventElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/input/rotary/c;", "x", "node", "z", "Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "r", "Lkotlin/Function1;", "Landroidx/compose/ui/input/rotary/d;", "", "t", "onPreRotaryScrollEvent", "u", "", "toString", "", "hashCode", "", "other", "equals", "c", "Lkotlin/jvm/functions/l;", "y", "()Lkotlin/jvm/functions/l;", "<init>", "(Lkotlin/jvm/functions/l;)V", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.input.rotary.OnPreRotaryScrollEventElement */
public final class OnPreRotaryScrollEventElement extends C15723p0<C15514c> {
    @C12579k

    /* renamed from: c */
    public final C11300l<C15515d, Boolean> f38600c;

    public OnPreRotaryScrollEventElement(@C12579k C11300l<? super C15515d, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onPreRotaryScrollEvent");
        this.f38600c = lVar;
    }

    /* renamed from: v */
    public static /* synthetic */ OnPreRotaryScrollEventElement m68853v(OnPreRotaryScrollEventElement onPreRotaryScrollEventElement, C11300l<C15515d, Boolean> lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = onPreRotaryScrollEventElement.f38600c;
        }
        return onPreRotaryScrollEventElement.mo44222u(lVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnPreRotaryScrollEventElement) && Intrinsics.areEqual((Object) this.f38600c, (Object) ((OnPreRotaryScrollEventElement) obj).f38600c);
    }

    public int hashCode() {
        return this.f38600c.hashCode();
    }

    /* renamed from: r */
    public void mo17101r(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.mo45973d("onPreRotaryScrollEvent");
        v0Var.mo45971b().mo45707c("onPreRotaryScrollEvent", this.f38600c);
    }

    @C12579k
    /* renamed from: t */
    public final C11300l<C15515d, Boolean> mo44220t() {
        return this.f38600c;
    }

    @C12579k
    public String toString() {
        return "OnPreRotaryScrollEventElement(onPreRotaryScrollEvent=" + this.f38600c + ')';
    }

    @C12579k
    /* renamed from: u */
    public final OnPreRotaryScrollEventElement mo44222u(@C12579k C11300l<? super C15515d, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onPreRotaryScrollEvent");
        return new OnPreRotaryScrollEventElement(lVar);
    }

    @C12579k
    /* renamed from: x */
    public C15514c mo17098a() {
        return new C15514c((C11300l<? super C15515d, Boolean>) null, this.f38600c);
    }

    @C12579k
    /* renamed from: y */
    public final C11300l<C15515d, Boolean> mo44224y() {
        return this.f38600c;
    }

    @C12579k
    /* renamed from: z */
    public C15514c mo17102s(@C12579k C15514c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "node");
        cVar.mo44237m0(this.f38600c);
        cVar.mo44236l0((C11300l<? super C15515d, Boolean>) null);
        return cVar;
    }
}
