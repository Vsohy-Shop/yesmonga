package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.node.C15723p0;
import androidx.compose.p004ui.platform.C15983v0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B \u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016J\u001a\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\u000bHÆ\u0003J$\u0010\u000e\u001a\u00020\u00002\u0019\b\u0002\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R(\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, mo22516d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/focus/s;", "x", "node", "z", "Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "r", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusProperties;", "Lkotlin/t;", "t", "scope", "u", "", "toString", "", "hashCode", "", "other", "", "equals", "c", "Lkotlin/jvm/functions/l;", "y", "()Lkotlin/jvm/functions/l;", "<init>", "(Lkotlin/jvm/functions/l;)V", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.focus.FocusPropertiesElement */
final class FocusPropertiesElement extends C15723p0<C15079s> {
    @C12579k

    /* renamed from: c */
    public final C11300l<FocusProperties, C11079d2> f37187c;

    public FocusPropertiesElement(@C12579k C11300l<? super FocusProperties, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "scope");
        this.f37187c = lVar;
    }

    /* renamed from: v */
    public static /* synthetic */ FocusPropertiesElement m64541v(FocusPropertiesElement focusPropertiesElement, C11300l<FocusProperties, C11079d2> lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = focusPropertiesElement.f37187c;
        }
        return focusPropertiesElement.mo42119u(lVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && Intrinsics.areEqual((Object) this.f37187c, (Object) ((FocusPropertiesElement) obj).f37187c);
    }

    public int hashCode() {
        return this.f37187c.hashCode();
    }

    /* renamed from: r */
    public void mo17101r(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.mo45973d("focusProperties");
        v0Var.mo45971b().mo45707c("scope", this.f37187c);
    }

    @C12579k
    /* renamed from: t */
    public final C11300l<FocusProperties, C11079d2> mo42117t() {
        return this.f37187c;
    }

    @C12579k
    public String toString() {
        return "FocusPropertiesElement(scope=" + this.f37187c + ')';
    }

    @C12579k
    /* renamed from: u */
    public final FocusPropertiesElement mo42119u(@C12579k C11300l<? super FocusProperties, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "scope");
        return new FocusPropertiesElement(lVar);
    }

    @C12579k
    /* renamed from: x */
    public C15079s mo17098a() {
        return new C15079s(this.f37187c);
    }

    @C12579k
    /* renamed from: y */
    public final C11300l<FocusProperties, C11079d2> mo42121y() {
        return this.f37187c;
    }

    @C12579k
    /* renamed from: z */
    public C15079s mo17102s(@C12579k C15079s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "node");
        sVar.mo42217k0(this.f37187c);
        return sVar;
    }
}
