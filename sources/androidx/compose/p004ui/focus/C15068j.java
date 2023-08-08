package androidx.compose.p004ui.focus;

/* renamed from: androidx.compose.ui.focus.j */
public interface C15068j {

    /* renamed from: androidx.compose.ui.focus.j$a */
    public static final class C15069a {
    }

    /* renamed from: h */
    static /* synthetic */ void m64745h(C15068j jVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            jVar.mo42083m(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
    }

    /* renamed from: g */
    boolean mo42077g(int i);

    /* renamed from: m */
    void mo42083m(boolean z);
}
