package androidx.compose.p004ui.draw;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.draw.h */
public interface C8749h extends C8767m.C8770c {

    /* renamed from: androidx.compose.ui.draw.h$a */
    public static final class C8750a {
        @Deprecated
        /* renamed from: a */
        public static boolean m32544a(@C12579k C8749h hVar, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C8749h.super.mo17001A(lVar);
        }

        @Deprecated
        /* renamed from: b */
        public static boolean m32545b(@C12579k C8749h hVar, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C8749h.super.mo17002T(lVar);
        }

        @Deprecated
        /* renamed from: c */
        public static <R> R m32546c(@C12579k C8749h hVar, R r, @C12579k C11304p<? super R, ? super C8767m.C8770c, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C8749h.super.mo17009w(r, pVar);
        }

        @Deprecated
        /* renamed from: d */
        public static <R> R m32547d(@C12579k C8749h hVar, R r, @C12579k C11304p<? super C8767m.C8770c, ? super R, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C8749h.super.mo17003Z(r, pVar);
        }

        @Deprecated
        @C12579k
        /* renamed from: e */
        public static C8767m m32548e(@C12579k C8749h hVar, @C12579k C8767m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "other");
            return C8749h.super.mo17224k3(mVar);
        }
    }

    /* renamed from: C */
    void mo7212C(@C12579k C15184c cVar);
}
