package androidx.compose.p004ui.input.pointer;

import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16489j;
import androidx.compose.runtime.C8547h2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.C11053g;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11053g
/* renamed from: androidx.compose.ui.input.pointer.c */
public interface C15465c extends C16479d {

    /* renamed from: androidx.compose.ui.input.pointer.c$a */
    public static final class C15466a {
        @Deprecated
        /* renamed from: b */
        public static long m68479b(@C12579k C15465c cVar) {
            return C15465c.super.mo44008y();
        }

        @C8547h2
        @Deprecated
        /* renamed from: c */
        public static int m68480c(@C12579k C15465c cVar, long j) {
            return C15465c.super.mo7433u5(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: d */
        public static int m68481d(@C12579k C15465c cVar, float f) {
            return C15465c.super.mo7429n2(f);
        }

        @C8547h2
        @Deprecated
        /* renamed from: e */
        public static float m68482e(@C12579k C15465c cVar, long j) {
            return C15465c.super.mo7430q(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: f */
        public static float m68483f(@C12579k C15465c cVar, float f) {
            return C15465c.super.mo7418M(f);
        }

        @C8547h2
        @Deprecated
        /* renamed from: g */
        public static float m68484g(@C12579k C15465c cVar, int i) {
            return C15465c.super.mo7416L(i);
        }

        @C8547h2
        @Deprecated
        /* renamed from: h */
        public static long m68485h(@C12579k C15465c cVar, long j) {
            return C15465c.super.mo7428n(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: i */
        public static float m68486i(@C12579k C15465c cVar, long j) {
            return C15465c.super.mo7415C2(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: j */
        public static float m68487j(@C12579k C15465c cVar, float f) {
            return C15465c.super.mo7425g5(f);
        }

        @C8547h2
        @Deprecated
        @C12579k
        /* renamed from: k */
        public static C15098i m68488k(@C12579k C15465c cVar, @C12579k C16489j jVar) {
            Intrinsics.checkNotNullParameter(jVar, "$receiver");
            return C15465c.super.mo7417L4(jVar);
        }

        @C8547h2
        @Deprecated
        /* renamed from: l */
        public static long m68489l(@C12579k C15465c cVar, long j) {
            return C15465c.super.mo7420V(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: m */
        public static long m68490m(@C12579k C15465c cVar, float f) {
            return C15465c.super.mo7427m(f);
        }

        @C8547h2
        @Deprecated
        /* renamed from: n */
        public static long m68491n(@C12579k C15465c cVar, float f) {
            return C15465c.super.mo7432u(f);
        }

        @C8547h2
        @Deprecated
        /* renamed from: o */
        public static long m68492o(@C12579k C15465c cVar, int i) {
            return C15465c.super.mo7431t(i);
        }

        @C12580l
        @Deprecated
        /* renamed from: p */
        public static <T> Object m68493p(@C12579k C15465c cVar, long j, @C12579k C11304p<? super C15465c, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar2) {
            return C15465c.super.mo44006u2(j, pVar, cVar2);
        }

        @C12580l
        @Deprecated
        /* renamed from: q */
        public static <T> Object m68494q(@C12579k C15465c cVar, long j, @C12579k C11304p<? super C15465c, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar2) {
            return C15465c.super.mo44001d1(j, pVar, cVar2);
        }
    }

    /* renamed from: X0 */
    static /* synthetic */ Object m68462X0(C15465c cVar, PointerEventPass pointerEventPass, C11045c cVar2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                pointerEventPass = PointerEventPass.Main;
            }
            return cVar.mo44003i3(pointerEventPass, cVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
    }

    /* renamed from: a */
    long mo44000a();

    @C12580l
    /* renamed from: d1 */
    <T> Object mo44001d1(long j, @C12579k C11304p<? super C15465c, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        return pVar.invoke(this, cVar);
    }

    @C12579k
    C15863c4 getViewConfiguration();

    @C12580l
    /* renamed from: i3 */
    Object mo44003i3(@C12579k PointerEventPass pointerEventPass, @C12579k C11045c<? super C15491o> cVar);

    @C12579k
    /* renamed from: j3 */
    C15491o mo44004j3();

    @C12580l
    /* renamed from: u2 */
    <T> Object mo44006u2(long j, @C12579k C11304p<? super C15465c, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        return pVar.invoke(this, cVar);
    }

    /* renamed from: y */
    long mo44008y() {
        return C15104m.f37280b.mo42317c();
    }
}
