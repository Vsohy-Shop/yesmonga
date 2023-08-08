package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8767m;
import kotlin.C11395k;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11395k(message = "Use Modifier.focusProperties() instead")
/* renamed from: androidx.compose.ui.focus.m */
public interface C15072m extends C8767m.C8770c {

    /* renamed from: androidx.compose.ui.focus.m$a */
    public static final class C15073a {
        @Deprecated
        /* renamed from: a */
        public static boolean m64773a(@C12579k C15072m mVar, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15072m.super.mo17001A(lVar);
        }

        @Deprecated
        /* renamed from: b */
        public static boolean m64774b(@C12579k C15072m mVar, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15072m.super.mo17002T(lVar);
        }

        @Deprecated
        /* renamed from: c */
        public static <R> R m64775c(@C12579k C15072m mVar, R r, @C12579k C11304p<? super R, ? super C8767m.C8770c, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15072m.super.mo17009w(r, pVar);
        }

        @Deprecated
        /* renamed from: d */
        public static <R> R m64776d(@C12579k C15072m mVar, R r, @C12579k C11304p<? super C8767m.C8770c, ? super R, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15072m.super.mo17003Z(r, pVar);
        }

        @Deprecated
        @C12579k
        /* renamed from: e */
        public static C8767m m64777e(@C12579k C15072m mVar, @C12579k C8767m mVar2) {
            Intrinsics.checkNotNullParameter(mVar2, "other");
            return C15072m.super.mo17224k3(mVar2);
        }
    }

    /* renamed from: z4 */
    void mo42212z4(@C12579k C15071l lVar);
}
