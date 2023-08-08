package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8767m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,84:1\n728#2,2:85\n735#2,2:87\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeImpl\n*L\n76#1:85,2\n80#1:87,2\n*E\n"})
/* renamed from: androidx.compose.ui.focus.x */
public final class C15085x extends C8767m.C8772d implements C15084w {
    @C12579k

    /* renamed from: z */
    public FocusRequester f37247z;

    public C15085x(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        this.f37247z = focusRequester;
    }

    /* renamed from: S */
    public void mo17238S() {
        super.mo17238S();
        this.f37247z.mo42128f().mo15463e(this);
    }

    /* renamed from: T */
    public void mo17239T() {
        this.f37247z.mo42128f().mo15495z0(this);
        super.mo17239T();
    }

    @C12579k
    /* renamed from: j0 */
    public final FocusRequester mo42219j0() {
        return this.f37247z;
    }

    /* renamed from: k0 */
    public final void mo42220k0(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f37247z = focusRequester;
    }
}
