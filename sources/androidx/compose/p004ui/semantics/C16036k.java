package androidx.compose.p004ui.semantics;

import androidx.compose.p004ui.C8767m;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.semantics.k */
public interface C16036k extends C8767m.C8770c {

    /* renamed from: androidx.compose.ui.semantics.k$a */
    public static final class C16037a {
        @Deprecated
        /* renamed from: a */
        public static boolean m72149a(@C12579k C16036k kVar, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C16036k.super.mo17001A(lVar);
        }

        @Deprecated
        /* renamed from: b */
        public static boolean m72150b(@C12579k C16036k kVar, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C16036k.super.mo17002T(lVar);
        }

        @Deprecated
        /* renamed from: c */
        public static <R> R m72151c(@C12579k C16036k kVar, R r, @C12579k C11304p<? super R, ? super C8767m.C8770c, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C16036k.super.mo17009w(r, pVar);
        }

        @Deprecated
        /* renamed from: d */
        public static <R> R m72152d(@C12579k C16036k kVar, R r, @C12579k C11304p<? super C8767m.C8770c, ? super R, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C16036k.super.mo17003Z(r, pVar);
        }

        @Deprecated
        /* renamed from: e */
        public static int m72153e(@C12579k C16036k kVar) {
            return C16036k.super.getId();
        }

        @C11395k(message = "SemanticsModifier.id is now unused and has been set to a fixed value. Retrieve the id from LayoutInfo instead.", replaceWith = @C11587t0(expression = "", imports = {}))
        /* renamed from: f */
        public static /* synthetic */ void m72154f() {
        }

        @Deprecated
        @C12579k
        /* renamed from: g */
        public static C8767m m72155g(@C12579k C16036k kVar, @C12579k C8767m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "other");
            return C16036k.super.mo17224k3(mVar);
        }
    }

    @C12579k
    /* renamed from: Y */
    C16035j mo46168Y();

    int getId() {
        return -1;
    }
}
