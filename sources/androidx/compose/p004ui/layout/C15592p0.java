package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8767m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.layout.p0 */
public interface C15592p0 extends C8767m.C8770c {

    /* renamed from: androidx.compose.ui.layout.p0$a */
    public static final class C15593a {
        @Deprecated
        /* renamed from: a */
        public static boolean m69312a(@C12579k C15592p0 p0Var, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15592p0.super.mo17001A(lVar);
        }

        @Deprecated
        /* renamed from: b */
        public static boolean m69313b(@C12579k C15592p0 p0Var, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15592p0.super.mo17002T(lVar);
        }

        @Deprecated
        /* renamed from: c */
        public static <R> R m69314c(@C12579k C15592p0 p0Var, R r, @C12579k C11304p<? super R, ? super C8767m.C8770c, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15592p0.super.mo17009w(r, pVar);
        }

        @Deprecated
        /* renamed from: d */
        public static <R> R m69315d(@C12579k C15592p0 p0Var, R r, @C12579k C11304p<? super C8767m.C8770c, ? super R, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15592p0.super.mo17003Z(r, pVar);
        }

        @Deprecated
        @C12579k
        /* renamed from: e */
        public static C8767m m69316e(@C12579k C15592p0 p0Var, @C12579k C8767m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "other");
            return C15592p0.super.mo17224k3(mVar);
        }
    }

    /* renamed from: p */
    void mo7338p(@C12579k C15588o oVar);
}
