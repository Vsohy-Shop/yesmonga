package androidx.compose.p004ui.node;

import androidx.compose.p004ui.focus.FocusProperties;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.node.b */
public final class C15670b implements FocusProperties {
    @C12579k

    /* renamed from: a */
    public static final C15670b f38988a = new C15670b();
    @C12580l

    /* renamed from: b */
    public static Boolean f38989b;

    /* renamed from: h */
    public void mo42102h(boolean z) {
        f38989b = Boolean.valueOf(z);
    }

    /* renamed from: o */
    public boolean mo42109o() {
        Boolean bool = f38989b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: w */
    public final boolean mo44937w() {
        return f38989b != null;
    }

    /* renamed from: x */
    public final void mo44938x() {
        f38989b = null;
    }
}
