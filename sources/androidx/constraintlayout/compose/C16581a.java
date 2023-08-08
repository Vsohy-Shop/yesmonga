package androidx.constraintlayout.compose;

import androidx.compose.p004ui.unit.C16483g;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.constraintlayout.compose.a */
public interface C16581a {

    /* renamed from: androidx.constraintlayout.compose.a$a */
    public static final class C16582a {
        /* renamed from: a */
        public static /* synthetic */ void m75396a(C16581a aVar, ConstraintLayoutBaseScope.C16566a aVar2, float f, float f2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = C16483g.m74435M((float) 0);
                }
                if ((i & 4) != 0) {
                    f2 = C16483g.m74435M((float) 0);
                }
                aVar.mo48247a(aVar2, f, f2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
        }
    }

    /* renamed from: a */
    void mo48247a(@C12579k ConstraintLayoutBaseScope.C16566a aVar, float f, float f2);
}
