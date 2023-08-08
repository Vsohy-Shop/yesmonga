package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8767m;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.focus.s */
public final class C15079s extends C8767m.C8772d implements C15078r {
    @C12579k

    /* renamed from: z */
    public C11300l<? super FocusProperties, C11079d2> f37244z;

    public C15079s(@C12579k C11300l<? super FocusProperties, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "focusPropertiesScope");
        this.f37244z = lVar;
    }

    @C12579k
    /* renamed from: j0 */
    public final C11300l<FocusProperties, C11079d2> mo42216j0() {
        return this.f37244z;
    }

    /* renamed from: k0 */
    public final void mo42217k0(@C12579k C11300l<? super FocusProperties, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f37244z = lVar;
    }

    /* renamed from: s */
    public void mo42215s(@C12579k FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.f37244z.invoke(focusProperties);
    }
}
