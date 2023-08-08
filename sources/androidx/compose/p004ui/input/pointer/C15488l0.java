package androidx.compose.p004ui.input.pointer;

import androidx.compose.p004ui.C8761g;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12580l;

@C8761g
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.input.pointer.l0 */
public final class C15488l0 implements C11300l<Boolean, C11079d2> {

    /* renamed from: b */
    public static final int f38517b = 8;
    @C12580l

    /* renamed from: a */
    public PointerInteropFilter f38518a;

    @C12580l
    /* renamed from: a */
    public final PointerInteropFilter mo44096a() {
        return this.f38518a;
    }

    /* renamed from: b */
    public void mo44097b(boolean z) {
        PointerInteropFilter pointerInteropFilter = this.f38518a;
        if (pointerInteropFilter != null) {
            pointerInteropFilter.mo43975g(z);
        }
    }

    /* renamed from: c */
    public final void mo44098c(@C12580l PointerInteropFilter pointerInteropFilter) {
        this.f38518a = pointerInteropFilter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo44097b(((Boolean) obj).booleanValue());
        return C11079d2.f28267a;
    }
}
