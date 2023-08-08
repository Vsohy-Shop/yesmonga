package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16479d;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.layout.u0 */
public interface C15605u0 extends C8767m.C8770c {

    /* renamed from: androidx.compose.ui.layout.u0$a */
    public static final class C15606a {
        @Deprecated
        /* renamed from: a */
        public static boolean m69375a(@C12579k C15605u0 u0Var, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15605u0.super.mo17001A(lVar);
        }

        @Deprecated
        /* renamed from: b */
        public static boolean m69376b(@C12579k C15605u0 u0Var, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15605u0.super.mo17002T(lVar);
        }

        @Deprecated
        /* renamed from: c */
        public static <R> R m69377c(@C12579k C15605u0 u0Var, R r, @C12579k C11304p<? super R, ? super C8767m.C8770c, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15605u0.super.mo17009w(r, pVar);
        }

        @Deprecated
        /* renamed from: d */
        public static <R> R m69378d(@C12579k C15605u0 u0Var, R r, @C12579k C11304p<? super C8767m.C8770c, ? super R, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15605u0.super.mo17003Z(r, pVar);
        }

        @Deprecated
        @C12579k
        /* renamed from: e */
        public static C8767m m69379e(@C12579k C15605u0 u0Var, @C12579k C8767m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "other");
            return C15605u0.super.mo17224k3(mVar);
        }
    }

    @C12580l
    /* renamed from: N */
    Object mo6431N(@C12579k C16479d dVar, @C12580l Object obj);
}
