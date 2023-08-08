package androidx.compose.p004ui.modifier;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8547h2
/* renamed from: androidx.compose.ui.modifier.d */
public interface C15627d extends C8767m.C8770c {

    /* renamed from: androidx.compose.ui.modifier.d$a */
    public static final class C15628a {
        @Deprecated
        /* renamed from: a */
        public static boolean m69502a(@C12579k C15627d dVar, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15627d.super.mo17001A(lVar);
        }

        @Deprecated
        /* renamed from: b */
        public static boolean m69503b(@C12579k C15627d dVar, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15627d.super.mo17002T(lVar);
        }

        @Deprecated
        /* renamed from: c */
        public static <R> R m69504c(@C12579k C15627d dVar, R r, @C12579k C11304p<? super R, ? super C8767m.C8770c, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15627d.super.mo17009w(r, pVar);
        }

        @Deprecated
        /* renamed from: d */
        public static <R> R m69505d(@C12579k C15627d dVar, R r, @C12579k C11304p<? super C8767m.C8770c, ? super R, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15627d.super.mo17003Z(r, pVar);
        }

        @Deprecated
        @C12579k
        /* renamed from: e */
        public static C8767m m69506e(@C12579k C15627d dVar, @C12579k C8767m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "other");
            return C15627d.super.mo17224k3(mVar);
        }
    }

    /* renamed from: V3 */
    void mo7151V3(@C12579k C15636k kVar);
}
