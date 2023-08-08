package androidx.compose.p004ui.input.key;

import androidx.compose.p004ui.node.C15723p0;
import androidx.compose.p004ui.platform.C15983v0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001e\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003ø\u0001\u0000J\"\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0001ø\u0001\u0000J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, mo22516d2 = {"Landroidx/compose/ui/input/key/OnPreviewKeyEvent;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/input/key/e;", "x", "node", "z", "Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "r", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/b;", "", "t", "onPreviewKeyEvent", "u", "", "toString", "", "hashCode", "", "other", "equals", "c", "Lkotlin/jvm/functions/l;", "y", "()Lkotlin/jvm/functions/l;", "<init>", "(Lkotlin/jvm/functions/l;)V", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.input.key.OnPreviewKeyEvent */
public final class OnPreviewKeyEvent extends C15723p0<C15440e> {
    @C12579k

    /* renamed from: c */
    public final C11300l<C15436b, Boolean> f38128c;

    public OnPreviewKeyEvent(@C12579k C11300l<? super C15436b, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onPreviewKeyEvent");
        this.f38128c = lVar;
    }

    /* renamed from: v */
    public static /* synthetic */ OnPreviewKeyEvent m67374v(OnPreviewKeyEvent onPreviewKeyEvent, C11300l<C15436b, Boolean> lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = onPreviewKeyEvent.f38128c;
        }
        return onPreviewKeyEvent.mo43624u(lVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnPreviewKeyEvent) && Intrinsics.areEqual((Object) this.f38128c, (Object) ((OnPreviewKeyEvent) obj).f38128c);
    }

    public int hashCode() {
        return this.f38128c.hashCode();
    }

    /* renamed from: r */
    public void mo17101r(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.mo45973d("onPreviewKeyEvent");
        v0Var.mo45971b().mo45707c("onPreviewKeyEvent", this.f38128c);
    }

    @C12579k
    /* renamed from: t */
    public final C11300l<C15436b, Boolean> mo43622t() {
        return this.f38128c;
    }

    @C12579k
    public String toString() {
        return "OnPreviewKeyEvent(onPreviewKeyEvent=" + this.f38128c + ')';
    }

    @C12579k
    /* renamed from: u */
    public final OnPreviewKeyEvent mo43624u(@C12579k C11300l<? super C15436b, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onPreviewKeyEvent");
        return new OnPreviewKeyEvent(lVar);
    }

    @C12579k
    /* renamed from: x */
    public C15440e mo17098a() {
        return new C15440e((C11300l<? super C15436b, Boolean>) null, this.f38128c);
    }

    @C12579k
    /* renamed from: y */
    public final C11300l<C15436b, Boolean> mo43626y() {
        return this.f38128c;
    }

    @C12579k
    /* renamed from: z */
    public C15440e mo17102s(@C12579k C15440e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "node");
        eVar.mo43935m0(this.f38128c);
        eVar.mo43934l0((C11300l<? super C15436b, Boolean>) null);
        return eVar;
    }
}
