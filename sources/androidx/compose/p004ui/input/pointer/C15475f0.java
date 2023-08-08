package androidx.compose.p004ui.input.pointer;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import com.carrefour.fid.android.shared.constant.C28539g;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPointerInputTestUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,148:1\n33#2,6:149\n*S KotlinDebug\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n*L\n144#1:149,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.f0 */
public final class C15475f0 {
    @C12579k
    /* renamed from: a */
    public static final C15507w m68568a(long j, long j2, float f, float f2) {
        return new C15507w(C15506v.m68787b(j), j2, C15096g.m64898a(f, f2), true, 1.0f, j2, C15096g.m64898a(f, f2), false, false, 0, 0, (int) C28539g.f69265w, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static /* synthetic */ C15507w m68569b(long j, long j2, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        return m68568a(j, j2, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? 0.0f : f2);
    }

    /* renamed from: c */
    public static final void m68570c(@C12579k C11305q<? super C15491o, ? super PointerEventPass, ? super C16500q, C11079d2> qVar, @C12579k C15491o oVar, long j) {
        Intrinsics.checkNotNullParameter(qVar, "$this$invokeOverAllPasses");
        Intrinsics.checkNotNullParameter(oVar, "pointerEvent");
        m68574g(qVar, oVar, CollectionsKt__CollectionsKt.m40448L(PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final), j);
    }

    /* renamed from: d */
    public static /* synthetic */ void m68571d(C11305q qVar, C15491o oVar, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = C16502r.m74668a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m68570c(qVar, oVar, j);
    }

    /* renamed from: e */
    public static final void m68572e(@C12579k C11305q<? super C15491o, ? super PointerEventPass, ? super C16500q, C11079d2> qVar, @C12579k C15491o oVar, @C12579k PointerEventPass pointerEventPass, long j) {
        Intrinsics.checkNotNullParameter(qVar, "$this$invokeOverPass");
        Intrinsics.checkNotNullParameter(oVar, "pointerEvent");
        Intrinsics.checkNotNullParameter(pointerEventPass, "pointerEventPass");
        m68574g(qVar, oVar, C10976s.m41419k(pointerEventPass), j);
    }

    /* renamed from: f */
    public static /* synthetic */ void m68573f(C11305q qVar, C15491o oVar, PointerEventPass pointerEventPass, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = C16502r.m74668a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m68572e(qVar, oVar, pointerEventPass, j);
    }

    /* renamed from: g */
    public static final void m68574g(@C12579k C11305q<? super C15491o, ? super PointerEventPass, ? super C16500q, C11079d2> qVar, @C12579k C15491o oVar, @C12579k List<? extends PointerEventPass> list, long j) {
        Intrinsics.checkNotNullParameter(qVar, "$this$invokeOverPasses");
        Intrinsics.checkNotNullParameter(oVar, "pointerEvent");
        Intrinsics.checkNotNullParameter(list, "pointerEventPasses");
        if (!(!oVar.mo44110e().isEmpty())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                qVar.invoke(oVar, (PointerEventPass) list.get(i), C16500q.m74651b(j));
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: h */
    public static final void m68575h(@C12579k C11305q<? super C15491o, ? super PointerEventPass, ? super C16500q, C11079d2> qVar, @C12579k C15491o oVar, @C12579k PointerEventPass[] pointerEventPassArr, long j) {
        Intrinsics.checkNotNullParameter(qVar, "$this$invokeOverPasses");
        Intrinsics.checkNotNullParameter(oVar, "pointerEvent");
        Intrinsics.checkNotNullParameter(pointerEventPassArr, "pointerEventPasses");
        m68574g(qVar, oVar, ArraysKt___ArraysKt.m39955kz(pointerEventPassArr), j);
    }

    /* renamed from: i */
    public static /* synthetic */ void m68576i(C11305q qVar, C15491o oVar, List list, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = C16502r.m74668a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m68574g(qVar, oVar, list, j);
    }

    /* renamed from: j */
    public static /* synthetic */ void m68577j(C11305q qVar, C15491o oVar, PointerEventPass[] pointerEventPassArr, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = C16502r.m74668a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m68575h(qVar, oVar, pointerEventPassArr, j);
    }

    @C12579k
    /* renamed from: k */
    public static final C15507w m68578k(@C12579k C15507w wVar, long j, float f, float f2) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        long p = wVar.mo44176p();
        long z = wVar.mo44186z();
        boolean r = wVar.mo44178r();
        return new C15507w(p, wVar.mo44186z() + j, C15096g.m64898a(C15094f.m64880p(wVar.mo44177q()) + f, C15094f.m64882r(wVar.mo44177q()) + f2), true, 1.0f, z, wVar.mo44177q(), r, false, 0, 0, (int) C28539g.f69265w, (DefaultConstructorMarker) null);
    }

    /* renamed from: l */
    public static /* synthetic */ C15507w m68579l(C15507w wVar, long j, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return m68578k(wVar, j, f, f2);
    }

    @C12579k
    /* renamed from: m */
    public static final C15507w m68580m(@C12579k C15507w wVar, long j, float f, float f2) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        long p = wVar.mo44176p();
        long z = wVar.mo44186z();
        boolean r = wVar.mo44178r();
        return new C15507w(p, j, C15096g.m64898a(f, f2), true, 1.0f, z, wVar.mo44177q(), r, false, 0, 0, (int) C28539g.f69265w, (DefaultConstructorMarker) null);
    }

    /* renamed from: n */
    public static /* synthetic */ C15507w m68581n(C15507w wVar, long j, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return m68580m(wVar, j, f, f2);
    }

    @C12579k
    /* renamed from: o */
    public static final C15507w m68582o(@C12579k C15507w wVar, long j) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        long p = wVar.mo44176p();
        long z = wVar.mo44186z();
        boolean r = wVar.mo44178r();
        return new C15507w(p, j, wVar.mo44177q(), false, 1.0f, z, wVar.mo44177q(), r, false, 0, 0, (int) C28539g.f69265w, (DefaultConstructorMarker) null);
    }
}
