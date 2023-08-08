package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.node.C15723p0;
import androidx.compose.p004ui.platform.C15983v0;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, mo22516d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/focus/x;", "x", "node", "y", "Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "r", "Landroidx/compose/ui/focus/FocusRequester;", "t", "focusRequester", "u", "", "toString", "", "hashCode", "", "other", "", "equals", "c", "Landroidx/compose/ui/focus/FocusRequester;", "m1", "()Landroidx/compose/ui/focus/FocusRequester;", "<init>", "(Landroidx/compose/ui/focus/FocusRequester;)V", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,84:1\n735#2,2:85\n728#2,2:87\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n*L\n59#1:85,2\n61#1:87,2\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusRequesterElement */
final class FocusRequesterElement extends C15723p0<C15085x> {
    @C12579k

    /* renamed from: c */
    public final FocusRequester f37209c;

    public FocusRequesterElement(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        this.f37209c = focusRequester;
    }

    /* renamed from: v */
    public static /* synthetic */ FocusRequesterElement m64603v(FocusRequesterElement focusRequesterElement, FocusRequester focusRequester, int i, Object obj) {
        if ((i & 1) != 0) {
            focusRequester = focusRequesterElement.f37209c;
        }
        return focusRequesterElement.mo42153u(focusRequester);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && Intrinsics.areEqual((Object) this.f37209c, (Object) ((FocusRequesterElement) obj).f37209c);
    }

    public int hashCode() {
        return this.f37209c.hashCode();
    }

    @C12579k
    /* renamed from: m1 */
    public final FocusRequester mo42150m1() {
        return this.f37209c;
    }

    /* renamed from: r */
    public void mo17101r(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.mo45973d("focusRequester");
        v0Var.mo45971b().mo45707c("focusRequester", this.f37209c);
    }

    @C12579k
    /* renamed from: t */
    public final FocusRequester mo42151t() {
        return this.f37209c;
    }

    @C12579k
    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f37209c + ')';
    }

    @C12579k
    /* renamed from: u */
    public final FocusRequesterElement mo42153u(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        return new FocusRequesterElement(focusRequester);
    }

    @C12579k
    /* renamed from: x */
    public C15085x mo17098a() {
        return new C15085x(this.f37209c);
    }

    @C12579k
    /* renamed from: y */
    public C15085x mo17102s(@C12579k C15085x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "node");
        xVar.mo42219j0().mo42128f().mo15495z0(xVar);
        xVar.mo42220k0(this.f37209c);
        xVar.mo42219j0().mo42128f().mo15463e(xVar);
        return xVar;
    }
}
