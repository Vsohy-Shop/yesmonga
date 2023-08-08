package androidx.constraintlayout.compose;

import androidx.appcompat.graphics.drawable.C0508a;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.constraintlayout.compose.C16602j;
import androidx.constraintlayout.core.state.C16769n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.constraintlayout.compose.o */
public interface C16616o extends C16602j {

    /* renamed from: androidx.constraintlayout.compose.o$a */
    public static final class C16617a {
        /* renamed from: a */
        public static void m75590a(@C12579k C16616o oVar, @C12579k C16611l0 l0Var, @C12579k List<? extends C15557e0> list) {
            C16616o oVar2;
            Intrinsics.checkNotNullParameter(oVar, "this");
            Intrinsics.checkNotNullParameter(l0Var, "state");
            Intrinsics.checkNotNullParameter(list, "measurables");
            ConstraintLayoutKt.m75225x(l0Var, list);
            C16602j f = oVar.mo48465f();
            if (f instanceof C16616o) {
                oVar2 = (C16616o) f;
            } else {
                oVar2 = null;
            }
            if (oVar2 != null) {
                oVar2.mo48354a(l0Var, list);
            }
            oVar.mo48466k(l0Var);
        }

        /* renamed from: b */
        public static void m75591b(@C12579k C16616o oVar, @C12579k C16769n nVar, int i) {
            Intrinsics.checkNotNullParameter(oVar, "this");
            Intrinsics.checkNotNullParameter(nVar, C0508a.f1295O0);
            C16602j.C16603a.m75528a(oVar, nVar, i);
        }

        /* renamed from: c */
        public static boolean m75592c(@C12579k C16616o oVar, @C12579k List<? extends C15557e0> list) {
            Intrinsics.checkNotNullParameter(oVar, "this");
            Intrinsics.checkNotNullParameter(list, "measurables");
            return C16602j.C16603a.m75529b(oVar, list);
        }

        @C12579k
        /* renamed from: d */
        public static C16602j m75593d(@C12579k C16616o oVar, @C12579k String str, float f) {
            Intrinsics.checkNotNullParameter(oVar, "this");
            Intrinsics.checkNotNullParameter(str, "name");
            return C16602j.C16603a.m75530c(oVar, str, f);
        }
    }

    /* renamed from: a */
    void mo48354a(@C12579k C16611l0 l0Var, @C12579k List<? extends C15557e0> list);

    @C12580l
    /* renamed from: f */
    C16602j mo48465f();

    /* renamed from: k */
    void mo48466k(@C12579k C16611l0 l0Var);
}
