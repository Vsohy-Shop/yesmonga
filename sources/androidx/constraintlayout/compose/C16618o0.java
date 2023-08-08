package androidx.constraintlayout.compose;

import androidx.compose.p004ui.unit.C16483g;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.constraintlayout.compose.o0 */
public interface C16618o0 {

    /* renamed from: androidx.constraintlayout.compose.o0$a */
    public static final class C16619a {
        /* renamed from: a */
        public static /* synthetic */ void m75595a(C16618o0 o0Var, ConstraintLayoutBaseScope.C16568c cVar, float f, float f2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = C16483g.m74435M((float) 0);
                }
                if ((i & 4) != 0) {
                    f2 = C16483g.m74435M((float) 0);
                }
                o0Var.mo48159a(cVar, f, f2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
        }
    }

    /* renamed from: a */
    void mo48159a(@C12579k ConstraintLayoutBaseScope.C16568c cVar, float f, float f2);
}
