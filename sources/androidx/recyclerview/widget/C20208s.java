package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.s */
public class C20208s extends C20115d0 {

    /* renamed from: g */
    public static final float f52161g = 1.0f;
    @C0363p0

    /* renamed from: e */
    public C20224y f52162e;
    @C0363p0

    /* renamed from: f */
    public C20224y f52163f;

    /* renamed from: c */
    public int[] mo60275c(@C0359n0 RecyclerView.C20076o oVar, @C0359n0 View view) {
        int[] iArr = new int[2];
        if (oVar.mo59428v()) {
            iArr[0] = mo60662n(view, mo60665q(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.mo59431w()) {
            iArr[1] = mo60662n(view, mo60666r(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: h */
    public View mo60280h(RecyclerView.C20076o oVar) {
        if (oVar.mo59431w()) {
            return mo60664p(oVar, mo60666r(oVar));
        }
        if (oVar.mo59428v()) {
            return mo60664p(oVar, mo60665q(oVar));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r4 = r0 - 1;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo60281i(androidx.recyclerview.widget.RecyclerView.C20076o r9, int r10, int r11) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.recyclerview.widget.RecyclerView.C20051a0.C20053b
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r9.mo59962o0()
            if (r0 != 0) goto L_0x000d
            return r1
        L_0x000d:
            android.view.View r2 = r8.mo60280h(r9)
            if (r2 != 0) goto L_0x0014
            return r1
        L_0x0014:
            int r2 = r9.mo59978u0(r2)
            if (r2 != r1) goto L_0x001b
            return r1
        L_0x001b:
            r3 = r9
            androidx.recyclerview.widget.RecyclerView$a0$b r3 = (androidx.recyclerview.widget.RecyclerView.C20051a0.C20053b) r3
            int r4 = r0 + -1
            android.graphics.PointF r3 = r3.mo59393a(r4)
            if (r3 != 0) goto L_0x0027
            return r1
        L_0x0027:
            boolean r5 = r9.mo59428v()
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L_0x003f
            androidx.recyclerview.widget.y r5 = r8.mo60665q(r9)
            int r10 = r8.mo60663o(r9, r5, r10, r7)
            float r5 = r3.x
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0040
            int r10 = -r10
            goto L_0x0040
        L_0x003f:
            r10 = r7
        L_0x0040:
            boolean r5 = r9.mo59431w()
            if (r5 == 0) goto L_0x0056
            androidx.recyclerview.widget.y r5 = r8.mo60666r(r9)
            int r11 = r8.mo60663o(r9, r5, r7, r11)
            float r3 = r3.y
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0057
            int r11 = -r11
            goto L_0x0057
        L_0x0056:
            r11 = r7
        L_0x0057:
            boolean r9 = r9.mo59431w()
            if (r9 == 0) goto L_0x005e
            r10 = r11
        L_0x005e:
            if (r10 != 0) goto L_0x0061
            return r1
        L_0x0061:
            int r2 = r2 + r10
            if (r2 >= 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r7 = r2
        L_0x0066:
            if (r7 < r0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r4 = r7
        L_0x006a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C20208s.mo60281i(androidx.recyclerview.widget.RecyclerView$o, int, int):int");
    }

    /* renamed from: m */
    public final float mo60661m(RecyclerView.C20076o oVar, C20224y yVar) {
        int max;
        int Y = oVar.mo59922Y();
        if (Y == 0) {
            return 1.0f;
        }
        View view = null;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i3 = 0; i3 < Y; i3++) {
            View X = oVar.mo59919X(i3);
            int u0 = oVar.mo59978u0(X);
            if (u0 != -1) {
                if (u0 < i2) {
                    view = X;
                    i2 = u0;
                }
                if (u0 > i) {
                    view2 = X;
                    i = u0;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(yVar.mo60695d(view), yVar.mo60695d(view2)) - Math.min(yVar.mo60698g(view), yVar.mo60698g(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i - i2) + 1));
    }

    /* renamed from: n */
    public final int mo60662n(@C0359n0 View view, C20224y yVar) {
        return (yVar.mo60698g(view) + (yVar.mo60696e(view) / 2)) - (yVar.mo60705n() + (yVar.mo60706o() / 2));
    }

    /* renamed from: o */
    public final int mo60663o(RecyclerView.C20076o oVar, C20224y yVar, int i, int i2) {
        int i3;
        int[] d = mo60276d(i, i2);
        float m = mo60661m(oVar, yVar);
        if (m <= 0.0f) {
            return 0;
        }
        if (Math.abs(d[0]) > Math.abs(d[1])) {
            i3 = d[0];
        } else {
            i3 = d[1];
        }
        return Math.round(((float) i3) / m);
    }

    @C0363p0
    /* renamed from: p */
    public final View mo60664p(RecyclerView.C20076o oVar, C20224y yVar) {
        int Y = oVar.mo59922Y();
        View view = null;
        if (Y == 0) {
            return null;
        }
        int n = yVar.mo60705n() + (yVar.mo60706o() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < Y; i2++) {
            View X = oVar.mo59919X(i2);
            int abs = Math.abs((yVar.mo60698g(X) + (yVar.mo60696e(X) / 2)) - n);
            if (abs < i) {
                view = X;
                i = abs;
            }
        }
        return view;
    }

    @C0359n0
    /* renamed from: q */
    public final C20224y mo60665q(@C0359n0 RecyclerView.C20076o oVar) {
        C20224y yVar = this.f52163f;
        if (yVar == null || yVar.f52209a != oVar) {
            this.f52163f = C20224y.m94588a(oVar);
        }
        return this.f52163f;
    }

    @C0359n0
    /* renamed from: r */
    public final C20224y mo60666r(@C0359n0 RecyclerView.C20076o oVar) {
        C20224y yVar = this.f52162e;
        if (yVar == null || yVar.f52209a != oVar) {
            this.f52162e = C20224y.m94590c(oVar);
        }
        return this.f52162e;
    }
}
