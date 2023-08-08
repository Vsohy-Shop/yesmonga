package androidx.compose.p004ui.focus;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.focus.o */
public final class C15075o implements C11300l<FocusProperties, C11079d2> {
    @C12579k

    /* renamed from: a */
    public final C11300l<C15071l, C11079d2> f37243a;

    public C15075o(@C12579k C11300l<? super C15071l, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "focusOrderReceiver");
        this.f37243a = lVar;
    }

    @C12579k
    /* renamed from: a */
    public final C11300l<C15071l, C11079d2> mo42213a() {
        return this.f37243a;
    }

    /* renamed from: b */
    public void mo42214b(@C12579k FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.f37243a.invoke(new C15071l(focusProperties));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo42214b((FocusProperties) obj);
        return C11079d2.f28267a;
    }
}
