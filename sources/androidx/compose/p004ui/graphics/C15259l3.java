package androidx.compose.p004ui.graphics;

import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.graphics.l3 */
public interface C15259l3 {

    /* renamed from: androidx.compose.ui.graphics.l3$a */
    public static final class C15260a {
    }

    /* renamed from: e */
    static /* synthetic */ boolean m66194e(C15259l3 l3Var, float f, float f2, C15231i3 i3Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                z = true;
            }
            return l3Var.mo42883b(f, f2, i3Var, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
    }

    /* renamed from: a */
    long mo42882a(float f);

    /* renamed from: b */
    boolean mo42883b(float f, float f2, @C12579k C15231i3 i3Var, boolean z);

    /* renamed from: c */
    void mo42884c(@C12580l C15231i3 i3Var, boolean z);

    /* renamed from: d */
    long mo42885d(float f);

    /* renamed from: f */
    float mo42886f();
}
