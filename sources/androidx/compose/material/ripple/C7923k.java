package androidx.compose.material.ripple;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.material.ripple.k */
public interface C7923k {
    @C12579k

    /* renamed from: a */
    public static final C7924a f19047a = C7924a.f19048a;

    /* renamed from: androidx.compose.material.ripple.k$a */
    public static final class C7924a {

        /* renamed from: a */
        public static final /* synthetic */ C7924a f19048a = new C7924a();

        @C12579k
        /* renamed from: a */
        public final C7917e mo11065a(long j, boolean z) {
            if (!z) {
                return RippleThemeKt.f19025d;
            }
            if (((double) C15258l2.m66190o(j)) > 0.5d) {
                return RippleThemeKt.f19023b;
            }
            return RippleThemeKt.f19024c;
        }

        /* renamed from: b */
        public final long mo11066b(long j, boolean z) {
            float o = C15258l2.m66190o(j);
            if (z || ((double) o) >= 0.5d) {
                return j;
            }
            return C15240j2.f37547b.mo42852w();
        }
    }

    @C8540g
    /* renamed from: a */
    long mo10994a(@C12580l C8592o oVar, int i);

    @C8540g
    @C12579k
    /* renamed from: b */
    C7917e mo10995b(@C12580l C8592o oVar, int i);
}
