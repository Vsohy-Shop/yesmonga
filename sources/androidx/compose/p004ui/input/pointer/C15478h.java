package androidx.compose.p004ui.input.pointer;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.annotation.C0344h1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.input.pointer.h */
public final class C15478h {

    /* renamed from: a */
    public long f38493a;
    @C12579k

    /* renamed from: b */
    public final SparseLongArray f38494b = new SparseLongArray();
    @C12579k

    /* renamed from: c */
    public final SparseBooleanArray f38495c = new SparseBooleanArray();
    @C12579k

    /* renamed from: d */
    public final List<C15511z> f38496d = new ArrayList();

    /* renamed from: e */
    public int f38497e = -1;

    /* renamed from: f */
    public int f38498f = -1;

    @C0344h1
    /* renamed from: h */
    public static /* synthetic */ void m68594h() {
    }

    /* renamed from: a */
    public final void mo44055a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.f38494b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f38494b;
                long j = this.f38493a;
                this.f38493a = 1 + j;
                sparseLongArray.put(pointerId, j);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    this.f38495c.put(pointerId, true);
                }
            }
        } else if (actionMasked == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (this.f38494b.indexOfKey(pointerId2) < 0) {
                SparseLongArray sparseLongArray2 = this.f38494b;
                long j2 = this.f38493a;
                this.f38493a = 1 + j2;
                sparseLongArray2.put(pointerId2, j2);
            }
        }
    }

    /* renamed from: b */
    public final void mo44056b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType != this.f38497e || source != this.f38498f) {
                this.f38497e = toolType;
                this.f38498f = source;
                this.f38495c.clear();
                this.f38494b.clear();
            }
        }
    }

    @C12580l
    /* renamed from: c */
    public final C15510y mo44057c(@C12579k MotionEvent motionEvent, @C12579k C15484j0 j0Var) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        Intrinsics.checkNotNullParameter(j0Var, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.f38494b.clear();
            this.f38495c.clear();
            return null;
        }
        mo44056b(motionEvent);
        mo44055a(motionEvent);
        if (actionMasked == 10 || actionMasked == 7 || actionMasked == 9) {
            z = true;
        } else {
            z = false;
        }
        if (actionMasked == 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            this.f38495c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked == 1) {
            i = 0;
        } else if (actionMasked != 6) {
            i = -1;
        } else {
            i = motionEvent.getActionIndex();
        }
        this.f38496d.clear();
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            List<C15511z> list = this.f38496d;
            if (z || i2 == i || (z2 && motionEvent.getButtonState() == 0)) {
                z3 = false;
            } else {
                z3 = true;
            }
            list.add(mo44058d(j0Var, motionEvent, i2, z3));
        }
        mo44063j(motionEvent);
        return new C15510y(motionEvent.getEventTime(), this.f38496d, motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f7  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p004ui.input.pointer.C15511z mo44058d(androidx.compose.p004ui.input.pointer.C15484j0 r25, android.view.MotionEvent r26, int r27, boolean r28) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            int r4 = r26.getPointerId(r27)
            long r6 = r0.mo44060f(r4)
            float r15 = r26.getPressure(r27)
            float r4 = r26.getX(r27)
            float r5 = r26.getY(r27)
            long r4 = androidx.compose.p004ui.geometry.C15096g.m64898a(r4, r5)
            if (r3 != 0) goto L_0x0035
            float r4 = r26.getRawX()
            float r5 = r26.getRawY()
            long r4 = androidx.compose.p004ui.geometry.C15096g.m64898a(r4, r5)
            long r8 = r1.mo44078s(r4)
        L_0x0032:
            r10 = r4
            r12 = r8
            goto L_0x004c
        L_0x0035:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r8 < r9) goto L_0x0046
            androidx.compose.ui.input.pointer.k r4 = androidx.compose.p004ui.input.pointer.C15485k.f38507a
            long r4 = r4.mo44079a(r2, r3)
            long r8 = r1.mo44078s(r4)
            goto L_0x0032
        L_0x0046:
            long r8 = r1.mo44077E(r4)
            r12 = r4
            r10 = r8
        L_0x004c:
            int r1 = r26.getToolType(r27)
            r4 = 1
            if (r1 == 0) goto L_0x0081
            if (r1 == r4) goto L_0x007a
            r5 = 2
            if (r1 == r5) goto L_0x0073
            r5 = 3
            if (r1 == r5) goto L_0x006c
            r5 = 4
            if (r1 == r5) goto L_0x0065
            androidx.compose.ui.input.pointer.i0$a r1 = androidx.compose.p004ui.input.pointer.C15481i0.f38500b
            int r1 = r1.mo44076e()
            goto L_0x0087
        L_0x0065:
            androidx.compose.ui.input.pointer.i0$a r1 = androidx.compose.p004ui.input.pointer.C15481i0.f38500b
            int r1 = r1.mo44072a()
            goto L_0x0087
        L_0x006c:
            androidx.compose.ui.input.pointer.i0$a r1 = androidx.compose.p004ui.input.pointer.C15481i0.f38500b
            int r1 = r1.mo44073b()
            goto L_0x0087
        L_0x0073:
            androidx.compose.ui.input.pointer.i0$a r1 = androidx.compose.p004ui.input.pointer.C15481i0.f38500b
            int r1 = r1.mo44074c()
            goto L_0x0087
        L_0x007a:
            androidx.compose.ui.input.pointer.i0$a r1 = androidx.compose.p004ui.input.pointer.C15481i0.f38500b
            int r1 = r1.mo44075d()
            goto L_0x0087
        L_0x0081:
            androidx.compose.ui.input.pointer.i0$a r1 = androidx.compose.p004ui.input.pointer.C15481i0.f38500b
            int r1 = r1.mo44076e()
        L_0x0087:
            r16 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r5 = r26.getHistorySize()
            r9 = 0
        L_0x0093:
            if (r9 >= r5) goto L_0x00db
            float r14 = r2.getHistoricalX(r3, r9)
            float r4 = r2.getHistoricalY(r3, r9)
            boolean r17 = java.lang.Float.isInfinite(r14)
            if (r17 != 0) goto L_0x00ac
            boolean r17 = java.lang.Float.isNaN(r14)
            if (r17 != 0) goto L_0x00ac
            r17 = 1
            goto L_0x00ae
        L_0x00ac:
            r17 = 0
        L_0x00ae:
            if (r17 == 0) goto L_0x00d7
            boolean r17 = java.lang.Float.isInfinite(r4)
            if (r17 != 0) goto L_0x00bf
            boolean r17 = java.lang.Float.isNaN(r4)
            if (r17 != 0) goto L_0x00bf
            r17 = 1
            goto L_0x00c1
        L_0x00bf:
            r17 = 0
        L_0x00c1:
            if (r17 == 0) goto L_0x00d7
            androidx.compose.ui.input.pointer.e r8 = new androidx.compose.ui.input.pointer.e
            long r19 = r2.getHistoricalEventTime(r9)
            long r21 = androidx.compose.p004ui.geometry.C15096g.m64898a(r14, r4)
            r23 = 0
            r18 = r8
            r18.<init>(r19, r21, r23)
            r1.add(r8)
        L_0x00d7:
            int r9 = r9 + 1
            r4 = 1
            goto L_0x0093
        L_0x00db:
            int r4 = r26.getActionMasked()
            r5 = 8
            if (r4 != r5) goto L_0x00f7
            r4 = 10
            float r4 = r2.getAxisValue(r4)
            r5 = 9
            float r5 = r2.getAxisValue(r5)
            float r5 = -r5
            r8 = 0
            float r5 = r5 + r8
            long r4 = androidx.compose.p004ui.geometry.C15096g.m64898a(r4, r5)
            goto L_0x00fd
        L_0x00f7:
            androidx.compose.ui.geometry.f$a r4 = androidx.compose.p004ui.geometry.C15094f.f37256b
            long r4 = r4.mo42248e()
        L_0x00fd:
            r19 = r4
            android.util.SparseBooleanArray r4 = r0.f38495c
            int r3 = r26.getPointerId(r27)
            r5 = 0
            boolean r17 = r4.get(r3, r5)
            androidx.compose.ui.input.pointer.z r3 = new androidx.compose.ui.input.pointer.z
            r5 = r3
            long r8 = r26.getEventTime()
            r21 = 0
            r14 = r28
            r18 = r1
            r5.<init>(r6, r8, r10, r12, r14, r15, r16, r17, r18, r19, r21)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.input.pointer.C15478h.mo44058d(androidx.compose.ui.input.pointer.j0, android.view.MotionEvent, int, boolean):androidx.compose.ui.input.pointer.z");
    }

    /* renamed from: e */
    public final void mo44059e(int i) {
        this.f38495c.delete(i);
        this.f38494b.delete(i);
    }

    /* renamed from: f */
    public final long mo44060f(int i) {
        long j;
        int indexOfKey = this.f38494b.indexOfKey(i);
        if (indexOfKey >= 0) {
            j = this.f38494b.valueAt(indexOfKey);
        } else {
            j = this.f38493a;
            this.f38493a = 1 + j;
            this.f38494b.put(i, j);
        }
        return C15506v.m68787b(j);
    }

    @C12579k
    /* renamed from: g */
    public final SparseLongArray mo44061g() {
        return this.f38494b;
    }

    /* renamed from: i */
    public final boolean mo44062i(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final void mo44063j(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f38495c.get(pointerId, false)) {
                this.f38494b.delete(pointerId);
                this.f38495c.delete(pointerId);
            }
        }
        if (this.f38494b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f38494b.size() - 1; -1 < size; size--) {
                int keyAt = this.f38494b.keyAt(size);
                if (!mo44062i(motionEvent, keyAt)) {
                    this.f38494b.removeAt(size);
                    this.f38495c.delete(keyAt);
                }
            }
        }
    }
}
