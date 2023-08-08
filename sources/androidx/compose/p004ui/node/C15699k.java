package androidx.compose.p004ui.node;

import androidx.compose.p004ui.focus.C15071l;
import androidx.compose.p004ui.focus.C15072m;
import androidx.compose.p004ui.focus.FocusProperties;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.node.k */
public final class C15699k implements C11300l<FocusProperties, C11079d2> {
    @C12579k

    /* renamed from: a */
    public final C15072m f39014a;

    public C15699k(@C12579k C15072m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "modifier");
        this.f39014a = mVar;
    }

    @C12579k
    /* renamed from: a */
    public final C15072m mo45044a() {
        return this.f39014a;
    }

    /* renamed from: b */
    public void mo45045b(@C12579k FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.f39014a.mo42212z4(new C15071l(focusProperties));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo45045b((FocusProperties) obj);
        return C11079d2.f28267a;
    }
}
