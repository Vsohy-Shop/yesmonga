package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: androidx.transition.e0 */
public class C20572e0 extends C20665q1 {

    /* renamed from: d */
    public float f53045d = 3.0f;

    /* renamed from: e */
    public int f53046e = 80;

    /* renamed from: c */
    public long mo61672c(ViewGroup viewGroup, C20606h0 h0Var, C20657p0 p0Var, C20657p0 p0Var2) {
        int i;
        int i2;
        int i3;
        C20657p0 p0Var3 = p0Var;
        if (p0Var3 == null && p0Var2 == null) {
            return 0;
        }
        Rect R = h0Var.mo61726R();
        if (p0Var2 == null || mo61878e(p0Var3) == 0) {
            i = -1;
        } else {
            p0Var3 = p0Var2;
            i = 1;
        }
        int f = mo61879f(p0Var3);
        int g = mo61880g(p0Var3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (R != null) {
            i3 = R.centerX();
            i2 = R.centerY();
        } else {
            i3 = (round + width) / 2;
            i2 = (round2 + height) / 2;
        }
        float h = ((float) mo61673h(viewGroup, f, g, i3, i2, round, round2, width, height)) / ((float) mo61674i(viewGroup));
        long P = h0Var.mo61723P();
        if (P < 0) {
            P = 300;
        }
        return (long) Math.round((((float) (P * ((long) i))) / this.f53045d) * h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r5 != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r5 != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo61673h(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r6 = this;
            int r0 = r6.f53046e
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r2 = 5
            r3 = 3
            r4 = 0
            r5 = 1
            if (r0 != r1) goto L_0x0019
            int r7 = androidx.core.view.C18196h2.m82553Z(r7)
            if (r7 != r5) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r5 = r4
        L_0x0013:
            if (r5 == 0) goto L_0x0017
        L_0x0015:
            r0 = r2
            goto L_0x0029
        L_0x0017:
            r0 = r3
            goto L_0x0029
        L_0x0019:
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r1) goto L_0x0029
            int r7 = androidx.core.view.C18196h2.m82553Z(r7)
            if (r7 != r5) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r5 = r4
        L_0x0026:
            if (r5 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0029:
            if (r0 == r3) goto L_0x0051
            if (r0 == r2) goto L_0x0048
            r7 = 48
            if (r0 == r7) goto L_0x003f
            r7 = 80
            if (r0 == r7) goto L_0x0036
            goto L_0x0059
        L_0x0036:
            int r9 = r9 - r13
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r4 = r9 + r7
            goto L_0x0059
        L_0x003f:
            int r15 = r15 - r9
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r4 = r15 + r7
            goto L_0x0059
        L_0x0048:
            int r8 = r8 - r12
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r4 = r8 + r7
            goto L_0x0059
        L_0x0051:
            int r14 = r14 - r8
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r4 = r14 + r7
        L_0x0059:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C20572e0.mo61673h(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    /* renamed from: i */
    public final int mo61674i(ViewGroup viewGroup) {
        int i = this.f53046e;
        if (i == 3 || i == 5 || i == 8388611 || i == 8388613) {
            return viewGroup.getWidth();
        }
        return viewGroup.getHeight();
    }

    /* renamed from: j */
    public void mo61675j(float f) {
        if (f != 0.0f) {
            this.f53045d = f;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }

    /* renamed from: k */
    public void mo61676k(int i) {
        this.f53046e = i;
    }
}
