package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8767m;
import kotlin.C11395k;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11395k(message = "Use FocusRequesterModifierNode instead")
/* renamed from: androidx.compose.ui.focus.u */
public interface C15081u extends C8767m.C8770c {

    /* renamed from: androidx.compose.ui.focus.u$a */
    public static final class C15082a {
        @Deprecated
        /* renamed from: a */
        public static boolean m64805a(@C12579k C15081u uVar, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15081u.super.mo17001A(lVar);
        }

        @Deprecated
        /* renamed from: b */
        public static boolean m64806b(@C12579k C15081u uVar, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15081u.super.mo17002T(lVar);
        }

        @Deprecated
        /* renamed from: c */
        public static <R> R m64807c(@C12579k C15081u uVar, R r, @C12579k C11304p<? super R, ? super C8767m.C8770c, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15081u.super.mo17009w(r, pVar);
        }

        @Deprecated
        /* renamed from: d */
        public static <R> R m64808d(@C12579k C15081u uVar, R r, @C12579k C11304p<? super C8767m.C8770c, ? super R, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15081u.super.mo17003Z(r, pVar);
        }

        @Deprecated
        @C12579k
        /* renamed from: e */
        public static C8767m m64809e(@C12579k C15081u uVar, @C12579k C8767m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "other");
            return C15081u.super.mo17224k3(mVar);
        }
    }

    @C12579k
    /* renamed from: m1 */
    FocusRequester mo42218m1();
}
