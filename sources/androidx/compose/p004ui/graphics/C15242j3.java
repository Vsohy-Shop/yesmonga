package androidx.compose.p004ui.graphics;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.j3 */
public interface C15242j3 {
    @C12579k

    /* renamed from: a */
    public static final C15243a f37562a = C15243a.f37563a;

    /* renamed from: androidx.compose.ui.graphics.j3$a */
    public static final class C15243a {

        /* renamed from: a */
        public static final /* synthetic */ C15243a f37563a = new C15243a();

        /* renamed from: d */
        public static /* synthetic */ C15242j3 m66118d(C15243a aVar, float[] fArr, float f, int i, Object obj) {
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            return aVar.mo42856c(fArr, f);
        }

        @C12579k
        /* renamed from: a */
        public final C15242j3 mo42854a(@C12579k C15242j3 j3Var, @C12579k C15242j3 j3Var2) {
            Intrinsics.checkNotNullParameter(j3Var, "outer");
            Intrinsics.checkNotNullParameter(j3Var2, "inner");
            return C15297q0.m66433a(j3Var, j3Var2);
        }

        @C12579k
        /* renamed from: b */
        public final C15242j3 mo42855b(float f) {
            return C15297q0.m66434b(f);
        }

        @C12579k
        /* renamed from: c */
        public final C15242j3 mo42856c(@C12579k float[] fArr, float f) {
            Intrinsics.checkNotNullParameter(fArr, "intervals");
            return C15297q0.m66435c(fArr, f);
        }

        @C12579k
        /* renamed from: e */
        public final C15242j3 mo42857e(@C12579k C15231i3 i3Var, float f, float f2, int i) {
            Intrinsics.checkNotNullParameter(i3Var, "shape");
            return C15297q0.m66436d(i3Var, f, f2, i);
        }
    }
}
