package androidx.compose.p004ui.draw;

import androidx.compose.p004ui.C8767m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.draw.f */
public interface C8746f extends C8749h {

    /* renamed from: androidx.compose.ui.draw.f$a */
    public static final class C8747a {
        @Deprecated
        /* renamed from: a */
        public static boolean m32525a(@C12579k C8746f fVar, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C8746f.super.mo17001A(lVar);
        }

        @Deprecated
        /* renamed from: b */
        public static boolean m32526b(@C12579k C8746f fVar, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C8746f.super.mo17002T(lVar);
        }

        @Deprecated
        /* renamed from: c */
        public static <R> R m32527c(@C12579k C8746f fVar, R r, @C12579k C11304p<? super R, ? super C8767m.C8770c, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C8746f.super.mo17009w(r, pVar);
        }

        @Deprecated
        /* renamed from: d */
        public static <R> R m32528d(@C12579k C8746f fVar, R r, @C12579k C11304p<? super C8767m.C8770c, ? super R, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C8746f.super.mo17003Z(r, pVar);
        }

        @Deprecated
        @C12579k
        /* renamed from: e */
        public static C8767m m32529e(@C12579k C8746f fVar, @C12579k C8767m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "other");
            return C8746f.super.mo17224k3(mVar);
        }
    }

    /* renamed from: h4 */
    void mo17173h4(@C12579k C8743c cVar);
}
