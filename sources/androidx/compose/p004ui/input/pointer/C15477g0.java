package androidx.compose.p004ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.p004ui.geometry.C15094f;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.input.pointer.g0 */
public final class C15477g0 {
    /* renamed from: a */
    public static final void m68589a(long j, @C12579k C11300l<? super MotionEvent, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        MotionEvent obtain = MotionEvent.obtain(j, j, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        Intrinsics.checkNotNullExpressionValue(obtain, "motionEvent");
        lVar.invoke(obtain);
        obtain.recycle();
    }

    /* renamed from: b */
    public static /* synthetic */ void m68590b(long j, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = SystemClock.uptimeMillis();
        }
        m68589a(j, lVar);
    }

    /* renamed from: c */
    public static final void m68591c(@C12579k C15491o oVar, long j, @C12579k C11300l<? super MotionEvent, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(oVar, "$this$toCancelMotionEventScope");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        m68593e(oVar, j, lVar, true);
    }

    /* renamed from: d */
    public static final void m68592d(@C12579k C15491o oVar, long j, @C12579k C11300l<? super MotionEvent, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(oVar, "$this$toMotionEventScope");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        m68593e(oVar, j, lVar, false);
    }

    /* renamed from: e */
    public static final void m68593e(C15491o oVar, long j, C11300l<? super MotionEvent, C11079d2> lVar, boolean z) {
        MotionEvent h = oVar.mo44113h();
        if (h != null) {
            int action = h.getAction();
            if (z) {
                h.setAction(3);
            }
            h.offsetLocation(-C15094f.m64880p(j), -C15094f.m64882r(j));
            lVar.invoke(h);
            h.offsetLocation(C15094f.m64880p(j), C15094f.m64882r(j));
            h.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
    }
}
