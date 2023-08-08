package androidx.constraintlayout.compose;

import androidx.compose.p004ui.unit.C16483g;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.constraintlayout.compose.z */
public interface C16635z {

    /* renamed from: androidx.constraintlayout.compose.z$a */
    public static final class C16636a {
        /* renamed from: a */
        public static /* synthetic */ void m75678a(C16635z zVar, ConstraintLayoutBaseScope.C16567b bVar, float f, float f2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = C16483g.m74435M((float) 0);
                }
                if ((i & 4) != 0) {
                    f2 = C16483g.m74435M((float) 0);
                }
                zVar.mo48156a(bVar, f, f2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
        }
    }

    /* renamed from: a */
    void mo48156a(@C12579k ConstraintLayoutBaseScope.C16567b bVar, float f, float f2);
}
