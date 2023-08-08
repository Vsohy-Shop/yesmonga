package androidx.compose.p004ui.input.pointer;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11395k;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C11395k(message = "Use PointerInputChange.isConsumed and PointerInputChange.consume() instead")
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.input.pointer.d */
public final class C15468d {

    /* renamed from: c */
    public static final int f38482c = 8;

    /* renamed from: a */
    public boolean f38483a;

    /* renamed from: b */
    public boolean f38484b;

    public C15468d() {
        this(false, false, 3, (DefaultConstructorMarker) null);
    }

    @C11395k(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    /* renamed from: b */
    public static /* synthetic */ void m68505b() {
    }

    @C11395k(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    /* renamed from: d */
    public static /* synthetic */ void m68506d() {
    }

    /* renamed from: a */
    public final boolean mo44036a() {
        return this.f38484b;
    }

    /* renamed from: c */
    public final boolean mo44037c() {
        return this.f38483a;
    }

    /* renamed from: e */
    public final void mo44038e(boolean z) {
        this.f38484b = z;
    }

    /* renamed from: f */
    public final void mo44039f(boolean z) {
        this.f38483a = z;
    }

    public C15468d(boolean z, boolean z2) {
        this.f38483a = z;
        this.f38484b = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15468d(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
