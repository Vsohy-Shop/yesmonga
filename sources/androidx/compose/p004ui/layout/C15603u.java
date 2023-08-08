package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8767m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.layout.u */
public interface C15603u extends C8767m.C8770c {

    /* renamed from: androidx.compose.ui.layout.u$a */
    public static final class C15604a {
        @Deprecated
        /* renamed from: a */
        public static boolean m69360a(@C12579k C15603u uVar, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15603u.super.mo17001A(lVar);
        }

        @Deprecated
        /* renamed from: b */
        public static boolean m69361b(@C12579k C15603u uVar, @C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C15603u.super.mo17002T(lVar);
        }

        @Deprecated
        /* renamed from: c */
        public static <R> R m69362c(@C12579k C15603u uVar, R r, @C12579k C11304p<? super R, ? super C8767m.C8770c, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15603u.super.mo17009w(r, pVar);
        }

        @Deprecated
        /* renamed from: d */
        public static <R> R m69363d(@C12579k C15603u uVar, R r, @C12579k C11304p<? super C8767m.C8770c, ? super R, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return C15603u.super.mo17003Z(r, pVar);
        }

        @Deprecated
        /* renamed from: e */
        public static int m69364e(@C12579k C15603u uVar, @C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
            Intrinsics.checkNotNullParameter(mVar, "$receiver");
            Intrinsics.checkNotNullParameter(lVar, "measurable");
            return C15603u.super.mo7060c(mVar, lVar, i);
        }

        @Deprecated
        /* renamed from: f */
        public static int m69365f(@C12579k C15603u uVar, @C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
            Intrinsics.checkNotNullParameter(mVar, "$receiver");
            Intrinsics.checkNotNullParameter(lVar, "measurable");
            return C15603u.super.mo7063h(mVar, lVar, i);
        }

        @Deprecated
        /* renamed from: g */
        public static int m69366g(@C12579k C15603u uVar, @C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
            Intrinsics.checkNotNullParameter(mVar, "$receiver");
            Intrinsics.checkNotNullParameter(lVar, "measurable");
            return C15603u.super.mo7061d(mVar, lVar, i);
        }

        @Deprecated
        /* renamed from: h */
        public static int m69367h(@C12579k C15603u uVar, @C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
            Intrinsics.checkNotNullParameter(mVar, "$receiver");
            Intrinsics.checkNotNullParameter(lVar, "measurable");
            return C15603u.super.mo7062f(mVar, lVar, i);
        }

        @Deprecated
        @C12579k
        /* renamed from: i */
        public static C8767m m69368i(@C12579k C15603u uVar, @C12579k C8767m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "other");
            return C15603u.super.mo17224k3(mVar);
        }
    }

    /* renamed from: c */
    int mo7060c(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        return MeasuringIntrinsics.f38657a.mo44312a(this, mVar, lVar, i);
    }

    /* renamed from: d */
    int mo7061d(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        return MeasuringIntrinsics.f38657a.mo44314c(this, mVar, lVar, i);
    }

    /* renamed from: f */
    int mo7062f(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        return MeasuringIntrinsics.f38657a.mo44315d(this, mVar, lVar, i);
    }

    /* renamed from: h */
    int mo7063h(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        return MeasuringIntrinsics.f38657a.mo44313b(this, mVar, lVar, i);
    }

    @C12579k
    /* renamed from: i */
    C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j);
}
