package androidx.constraintlayout.compose;

import androidx.appcompat.graphics.drawable.C0508a;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.runtime.C8585m0;
import androidx.constraintlayout.core.state.C16769n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8585m0
/* renamed from: androidx.constraintlayout.compose.j */
public interface C16602j {

    /* renamed from: androidx.constraintlayout.compose.j$a */
    public static final class C16603a {
        /* renamed from: a */
        public static void m75528a(@C12579k C16602j jVar, @C12579k C16769n nVar, int i) {
            Intrinsics.checkNotNullParameter(jVar, "this");
            Intrinsics.checkNotNullParameter(nVar, C0508a.f1295O0);
        }

        /* renamed from: b */
        public static boolean m75529b(@C12579k C16602j jVar, @C12579k List<? extends C15557e0> list) {
            Intrinsics.checkNotNullParameter(jVar, "this");
            Intrinsics.checkNotNullParameter(list, "measurables");
            return true;
        }

        @C12579k
        /* renamed from: c */
        public static C16602j m75530c(@C12579k C16602j jVar, @C12579k String str, float f) {
            Intrinsics.checkNotNullParameter(jVar, "this");
            Intrinsics.checkNotNullParameter(str, "name");
            return jVar;
        }
    }

    /* renamed from: a */
    void mo48354a(@C12579k C16611l0 l0Var, @C12579k List<? extends C15557e0> list);

    /* renamed from: b */
    void mo48355b(@C12579k C16769n nVar, int i);

    /* renamed from: c */
    boolean mo48356c(@C12579k List<? extends C15557e0> list);

    @C12579k
    /* renamed from: i */
    C16602j mo48357i(@C12579k String str, float f);
}
