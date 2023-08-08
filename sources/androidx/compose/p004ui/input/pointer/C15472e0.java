package androidx.compose.p004ui.input.pointer;

import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16489j;
import androidx.compose.runtime.C8547h2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.input.pointer.e0 */
public interface C15472e0 extends C16479d {

    /* renamed from: androidx.compose.ui.input.pointer.e0$a */
    public static final class C15473a {
        @Deprecated
        /* renamed from: a */
        public static long m68545a(@C12579k C15472e0 e0Var) {
            return C15472e0.super.mo43999y();
        }

        @Deprecated
        /* renamed from: b */
        public static boolean m68546b(@C12579k C15472e0 e0Var) {
            return C15472e0.super.mo43996j5();
        }

        /* renamed from: c */
        public static /* synthetic */ void m68547c() {
        }

        @C8547h2
        @Deprecated
        /* renamed from: d */
        public static int m68548d(@C12579k C15472e0 e0Var, long j) {
            return C15472e0.super.mo7433u5(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: e */
        public static int m68549e(@C12579k C15472e0 e0Var, float f) {
            return C15472e0.super.mo7429n2(f);
        }

        @Deprecated
        /* renamed from: f */
        public static void m68550f(@C12579k C15472e0 e0Var, boolean z) {
            C15472e0.super.mo43992M2(z);
        }

        @C8547h2
        @Deprecated
        /* renamed from: g */
        public static float m68551g(@C12579k C15472e0 e0Var, long j) {
            return C15472e0.super.mo7430q(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: h */
        public static float m68552h(@C12579k C15472e0 e0Var, float f) {
            return C15472e0.super.mo7418M(f);
        }

        @C8547h2
        @Deprecated
        /* renamed from: i */
        public static float m68553i(@C12579k C15472e0 e0Var, int i) {
            return C15472e0.super.mo7416L(i);
        }

        @C8547h2
        @Deprecated
        /* renamed from: j */
        public static long m68554j(@C12579k C15472e0 e0Var, long j) {
            return C15472e0.super.mo7428n(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: k */
        public static float m68555k(@C12579k C15472e0 e0Var, long j) {
            return C15472e0.super.mo7415C2(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: l */
        public static float m68556l(@C12579k C15472e0 e0Var, float f) {
            return C15472e0.super.mo7425g5(f);
        }

        @C8547h2
        @Deprecated
        @C12579k
        /* renamed from: m */
        public static C15098i m68557m(@C12579k C15472e0 e0Var, @C12579k C16489j jVar) {
            Intrinsics.checkNotNullParameter(jVar, "$receiver");
            return C15472e0.super.mo7417L4(jVar);
        }

        @C8547h2
        @Deprecated
        /* renamed from: n */
        public static long m68558n(@C12579k C15472e0 e0Var, long j) {
            return C15472e0.super.mo7420V(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: o */
        public static long m68559o(@C12579k C15472e0 e0Var, float f) {
            return C15472e0.super.mo7427m(f);
        }

        @C8547h2
        @Deprecated
        /* renamed from: p */
        public static long m68560p(@C12579k C15472e0 e0Var, float f) {
            return C15472e0.super.mo7432u(f);
        }

        @C8547h2
        @Deprecated
        /* renamed from: q */
        public static long m68561q(@C12579k C15472e0 e0Var, int i) {
            return C15472e0.super.mo7431t(i);
        }
    }

    /* renamed from: M2 */
    void mo43992M2(boolean z) {
    }

    @C12580l
    /* renamed from: R0 */
    <R> Object mo43994R0(@C12579k C11304p<? super C15465c, ? super C11045c<? super R>, ? extends Object> pVar, @C12579k C11045c<? super R> cVar);

    /* renamed from: a */
    long mo44043a();

    @C12579k
    C15863c4 getViewConfiguration();

    /* renamed from: j5 */
    boolean mo43996j5() {
        return false;
    }

    /* renamed from: y */
    long mo43999y() {
        return C15104m.f37280b.mo42317c();
    }
}
