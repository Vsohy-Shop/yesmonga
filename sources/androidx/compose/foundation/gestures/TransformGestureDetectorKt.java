package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15472e0;
import androidx.compose.p004ui.input.pointer.C15491o;
import androidx.compose.p004ui.input.pointer.C15507w;
import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n132#2,3:256\n33#2,4:259\n135#2,2:263\n38#2:265\n137#2:266\n33#2,6:267\n33#2,6:273\n33#2,6:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n*L\n116#1:256,3\n116#1:259,4\n116#1:263,2\n116#1:265\n116#1:266\n131#1:267,6\n216#1:273,6\n242#1:279,6\n*E\n"})
public final class TransformGestureDetectorKt {
    /* renamed from: a */
    public static final float m9456a(long j) {
        boolean z = true;
        if (C15094f.m64880p(j) == 0.0f) {
            if (C15094f.m64882r(j) != 0.0f) {
                z = false;
            }
            if (z) {
                return 0.0f;
            }
        }
        return ((-((float) Math.atan2((double) C15094f.m64880p(j), (double) C15094f.m64882r(j)))) * 180.0f) / 3.1415927f;
    }

    /* renamed from: b */
    public static final long m9457b(@C12579k C15491o oVar, boolean z) {
        long j;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        long e = C15094f.f37256b.mo42248e();
        List<C15507w> e2 = oVar.mo44110e();
        int size = e2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C15507w wVar = e2.get(i2);
            if (wVar.mo44178r() && wVar.mo44182v()) {
                if (z) {
                    j = wVar.mo44177q();
                } else {
                    j = wVar.mo44181u();
                }
                e = C15094f.m64886v(e, j);
                i++;
            }
        }
        if (i == 0) {
            return C15094f.f37256b.mo42247c();
        }
        return C15094f.m64874j(e, (float) i);
    }

    /* renamed from: c */
    public static /* synthetic */ long m9458c(C15491o oVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return m9457b(oVar, z);
    }

    /* renamed from: d */
    public static final float m9459d(@C12579k C15491o oVar, boolean z) {
        long j;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        long b = m9457b(oVar, z);
        float f = 0.0f;
        if (C15094f.m64876l(b, C15094f.f37256b.mo42247c())) {
            return 0.0f;
        }
        List<C15507w> e = oVar.mo44110e();
        int size = e.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C15507w wVar = e.get(i2);
            if (wVar.mo44178r() && wVar.mo44182v()) {
                if (z) {
                    j = wVar.mo44177q();
                } else {
                    j = wVar.mo44181u();
                }
                f += C15094f.m64877m(C15094f.m64885u(j, b));
                i++;
            }
        }
        return f / ((float) i);
    }

    /* renamed from: e */
    public static /* synthetic */ float m9460e(C15491o oVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return m9459d(oVar, z);
    }

    /* renamed from: f */
    public static final long m9461f(@C12579k C15491o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        long b = m9457b(oVar, true);
        C15094f.C15095a aVar = C15094f.f37256b;
        if (C15094f.m64876l(b, aVar.mo42247c())) {
            return aVar.mo42248e();
        }
        return C15094f.m64885u(b, m9457b(oVar, false));
    }

    /* renamed from: g */
    public static final float m9462g(@C12579k C15491o oVar) {
        boolean z;
        C15491o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(oVar2, "<this>");
        List<C15507w> e = oVar.mo44110e();
        int size = e.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            C15507w wVar = e.get(i);
            if (!wVar.mo44182v() || !wVar.mo44178r()) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        float f = 0.0f;
        if (i2 < 2) {
            return 0.0f;
        }
        long b = m9457b(oVar2, true);
        long b2 = m9457b(oVar2, false);
        List<C15507w> e2 = oVar.mo44110e();
        int size2 = e2.size();
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i4 = 0;
        while (i4 < size2) {
            C15507w wVar2 = e2.get(i4);
            if (wVar2.mo44178r() && wVar2.mo44182v()) {
                long q = wVar2.mo44177q();
                long u = C15094f.m64885u(wVar2.mo44181u(), b2);
                long u2 = C15094f.m64885u(q, b);
                float a = m9456a(u2) - m9456a(u);
                float m = C15094f.m64877m(C15094f.m64886v(u2, u)) / 2.0f;
                if (a > 180.0f) {
                    a -= 360.0f;
                } else if (a < -180.0f) {
                    a += 360.0f;
                }
                f3 += a * m;
                f2 += m;
            }
            i4++;
            f = 0.0f;
        }
        if (f2 == f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return f;
        }
        return f3 / f2;
    }

    /* renamed from: h */
    public static final float m9463h(@C12579k C15491o oVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        boolean z2 = true;
        float d = m9459d(oVar, true);
        float d2 = m9459d(oVar, false);
        if (d == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 1.0f;
        }
        if (d2 != 0.0f) {
            z2 = false;
        }
        if (z2) {
            return 1.0f;
        }
        return d / d2;
    }

    @C12580l
    /* renamed from: i */
    public static final Object m9464i(@C12579k C15472e0 e0Var, boolean z, @C12579k C11306r<? super C15094f, ? super C15094f, ? super Float, ? super Float, C11079d2> rVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object d = ForEachGestureKt.m9336d(e0Var, new TransformGestureDetectorKt$detectTransformGestures$2(z, rVar, (C11045c<? super TransformGestureDetectorKt$detectTransformGestures$2>) null), cVar);
        return d == C11063b.m42612h() ? d : C11079d2.f28267a;
    }

    /* renamed from: j */
    public static /* synthetic */ Object m9465j(C15472e0 e0Var, boolean z, C11306r rVar, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m9464i(e0Var, z, rVar, cVar);
    }
}
