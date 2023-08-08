package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.geometry.C15098i;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.layout.o */
public interface C15588o {

    /* renamed from: androidx.compose.ui.layout.o$a */
    public static final class C15589a {
        @Deprecated
        /* renamed from: b */
        public static void m69296b(@C12579k C15588o oVar, @C12579k C15588o oVar2, @C12579k float[] fArr) {
            Intrinsics.checkNotNullParameter(oVar2, "sourceCoordinates");
            Intrinsics.checkNotNullParameter(fArr, "matrix");
            C15588o.super.mo44433W(oVar2, fArr);
        }
    }

    /* renamed from: C */
    static /* synthetic */ C15098i m69281C(C15588o oVar, C15588o oVar2, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return oVar.mo44437n0(oVar2, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
    }

    /* renamed from: A */
    int mo44429A(@C12579k C15531a aVar);

    /* renamed from: K */
    long mo44430K(@C12579k C15588o oVar, long j);

    @C12580l
    /* renamed from: N */
    C15588o mo44431N();

    /* renamed from: T */
    long mo44432T(long j);

    /* renamed from: W */
    void mo44433W(@C12579k C15588o oVar, @C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(oVar, "sourceCoordinates");
        Intrinsics.checkNotNullParameter(fArr, "matrix");
        throw new UnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    /* renamed from: a */
    long mo44434a();

    /* renamed from: b0 */
    long mo44435b0(long j);

    /* renamed from: k */
    boolean mo44436k();

    @C12579k
    /* renamed from: n0 */
    C15098i mo44437n0(@C12579k C15588o oVar, boolean z);

    @C12580l
    /* renamed from: w0 */
    C15588o mo44438w0();

    @C12579k
    /* renamed from: x0 */
    Set<C15531a> mo44439x0();

    /* renamed from: z0 */
    long mo44440z0(long j);
}
