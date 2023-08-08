package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8767m;
import kotlin.C11395k;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11395k(message = "Use FocusEventModifierNode instead")
/* renamed from: androidx.compose.ui.focus.e */
public interface C15061e extends C8767m.C8770c {

    /* renamed from: androidx.compose.ui.focus.e$a */
    public static final class C15062a {
        @Deprecated
        /* renamed from: a */
        public static boolean m64733a(@C12579k C15061e eVar, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15061e.super.mo17001A(lVar);
        }

        @Deprecated
        /* renamed from: b */
        public static boolean m64734b(@C12579k C15061e eVar, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15061e.super.mo17002T(lVar);
        }

        @Deprecated
        /* renamed from: c */
        public static <R> R m64735c(@C12579k C15061e eVar, R r, @C12579k C11304p<? super R, ? super C8767m.C8770c, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15061e.super.mo17009w(r, pVar);
        }

        @Deprecated
        /* renamed from: d */
        public static <R> R m64736d(@C12579k C15061e eVar, R r, @C12579k C11304p<? super C8767m.C8770c, ? super R, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15061e.super.mo17003Z(r, pVar);
        }

        @Deprecated
        @C12579k
        /* renamed from: e */
        public static C8767m m64737e(@C12579k C15061e eVar, @C12579k C8767m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "other");
            return C15061e.super.mo17224k3(mVar);
        }
    }

    /* renamed from: W */
    void mo7218W(@C12579k C15087z zVar);
}
