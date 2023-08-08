package androidx.compose.p004ui.input.pointer;

import androidx.compose.p004ui.C8767m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.input.pointer.d0 */
public interface C15469d0 extends C8767m.C8770c {

    /* renamed from: androidx.compose.ui.input.pointer.d0$a */
    public static final class C15470a {
        @Deprecated
        /* renamed from: a */
        public static boolean m68517a(@C12579k C15469d0 d0Var, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15469d0.super.mo17001A(lVar);
        }

        @Deprecated
        /* renamed from: b */
        public static boolean m68518b(@C12579k C15469d0 d0Var, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15469d0.super.mo17002T(lVar);
        }

        @Deprecated
        /* renamed from: c */
        public static <R> R m68519c(@C12579k C15469d0 d0Var, R r, @C12579k C11304p<? super R, ? super C8767m.C8770c, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15469d0.super.mo17009w(r, pVar);
        }

        @Deprecated
        /* renamed from: d */
        public static <R> R m68520d(@C12579k C15469d0 d0Var, R r, @C12579k C11304p<? super C8767m.C8770c, ? super R, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15469d0.super.mo17003Z(r, pVar);
        }

        @Deprecated
        @C12579k
        /* renamed from: e */
        public static C8767m m68521e(@C12579k C15469d0 d0Var, @C12579k C8767m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "other");
            return C15469d0.super.mo17224k3(mVar);
        }
    }

    @C12579k
    /* renamed from: C4 */
    C15467c0 mo43971C4();
}
