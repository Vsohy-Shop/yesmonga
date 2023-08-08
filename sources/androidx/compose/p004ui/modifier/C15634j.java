package androidx.compose.p004ui.modifier;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8547h2
/* renamed from: androidx.compose.ui.modifier.j */
public interface C15634j<T> extends C8767m.C8770c {

    /* renamed from: androidx.compose.ui.modifier.j$a */
    public static final class C15635a {
        @Deprecated
        /* renamed from: a */
        public static <T> boolean m69526a(@C12579k C15634j<T> jVar, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15634j.super.mo17001A(lVar);
        }

        @Deprecated
        /* renamed from: b */
        public static <T> boolean m69527b(@C12579k C15634j<T> jVar, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15634j.super.mo17002T(lVar);
        }

        @Deprecated
        /* renamed from: c */
        public static <T, R> R m69528c(@C12579k C15634j<T> jVar, R r, @C12579k C11304p<? super R, ? super C8767m.C8770c, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15634j.super.mo17009w(r, pVar);
        }

        @Deprecated
        /* renamed from: d */
        public static <T, R> R m69529d(@C12579k C15634j<T> jVar, R r, @C12579k C11304p<? super C8767m.C8770c, ? super R, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15634j.super.mo17003Z(r, pVar);
        }

        @Deprecated
        @C12579k
        /* renamed from: e */
        public static <T> C8767m m69530e(@C12579k C15634j<T> jVar, @C12579k C8767m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "other");
            return C15634j.super.mo17224k3(mVar);
        }
    }

    @C12579k
    C15638m<T> getKey();

    T getValue();
}
