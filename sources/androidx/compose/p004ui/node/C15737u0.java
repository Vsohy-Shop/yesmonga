package androidx.compose.p004ui.node;

/* renamed from: androidx.compose.ui.node.u0 */
public final class C15737u0 {
    /* renamed from: b */
    public static final <T> T m70592b(C15678d dVar, int i, int i2) {
        T F = dVar.mo17252q().mo17229F();
        if (F == null || (F.mo17228E() & i) == 0) {
            return null;
        }
        while (F != null) {
            int I = F.mo17232I();
            if ((I & i2) != 0) {
                return null;
            }
            if ((I & i) != 0) {
                return F;
            }
            F = F.mo17229F();
        }
        return null;
    }
}
