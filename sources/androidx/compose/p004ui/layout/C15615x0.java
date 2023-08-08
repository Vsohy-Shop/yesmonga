package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15098i;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(level = DeprecationLevel.ERROR, message = "Please use BringIntoViewResponder instead.")
@C8761g
/* renamed from: androidx.compose.ui.layout.x0 */
public interface C15615x0 extends C8767m.C8770c {

    /* renamed from: androidx.compose.ui.layout.x0$a */
    public static final class C15616a {
        @Deprecated
        /* renamed from: a */
        public static boolean m69450a(@C12579k C15615x0 x0Var, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15615x0.super.mo17001A(lVar);
        }

        @Deprecated
        /* renamed from: b */
        public static boolean m69451b(@C12579k C15615x0 x0Var, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15615x0.super.mo17002T(lVar);
        }

        @Deprecated
        /* renamed from: c */
        public static <R> R m69452c(@C12579k C15615x0 x0Var, R r, @C12579k C11304p<? super R, ? super C8767m.C8770c, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15615x0.super.mo17009w(r, pVar);
        }

        @Deprecated
        /* renamed from: d */
        public static <R> R m69453d(@C12579k C15615x0 x0Var, R r, @C12579k C11304p<? super C8767m.C8770c, ? super R, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15615x0.super.mo17003Z(r, pVar);
        }

        @Deprecated
        @C12579k
        /* renamed from: e */
        public static C8767m m69454e(@C12579k C15615x0 x0Var, @C12579k C8767m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "other");
            return C15615x0.super.mo17224k3(mVar);
        }
    }

    @C12579k
    /* renamed from: U0 */
    C15098i mo44493U0(@C12579k C15098i iVar, @C12579k C15588o oVar);

    @C12580l
    /* renamed from: i5 */
    Object mo44494i5(@C12579k C15098i iVar, @C12579k C15098i iVar2, @C12579k C11045c<? super C11079d2> cVar);
}
