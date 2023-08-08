package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8767m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.layout.s0 */
public interface C15599s0 extends C8767m.C8770c {

    /* renamed from: androidx.compose.ui.layout.s0$a */
    public static final class C15600a {
        @Deprecated
        /* renamed from: a */
        public static boolean m69333a(@C12579k C15599s0 s0Var, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15599s0.super.mo17001A(lVar);
        }

        @Deprecated
        /* renamed from: b */
        public static boolean m69334b(@C12579k C15599s0 s0Var, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15599s0.super.mo17002T(lVar);
        }

        @Deprecated
        /* renamed from: c */
        public static <R> R m69335c(@C12579k C15599s0 s0Var, R r, @C12579k C11304p<? super R, ? super C8767m.C8770c, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15599s0.super.mo17009w(r, pVar);
        }

        @Deprecated
        /* renamed from: d */
        public static <R> R m69336d(@C12579k C15599s0 s0Var, R r, @C12579k C11304p<? super C8767m.C8770c, ? super R, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15599s0.super.mo17003Z(r, pVar);
        }

        @Deprecated
        @C12579k
        /* renamed from: e */
        public static C8767m m69337e(@C12579k C15599s0 s0Var, @C12579k C8767m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "other");
            return C15599s0.super.mo17224k3(mVar);
        }
    }

    /* renamed from: k */
    void mo7337k(long j);
}
