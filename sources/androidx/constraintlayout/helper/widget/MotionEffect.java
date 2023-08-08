package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.widget.C16944e;

public class MotionEffect extends MotionHelper {

    /* renamed from: N0 */
    public static final String f43147N0 = "FadeMove";

    /* renamed from: O0 */
    public static final int f43148O0 = -1;

    /* renamed from: P0 */
    public static final int f43149P0 = 0;

    /* renamed from: Q0 */
    public static final int f43150Q0 = 1;

    /* renamed from: R0 */
    public static final int f43151R0 = 2;

    /* renamed from: S0 */
    public static final int f43152S0 = 3;

    /* renamed from: T0 */
    public static final int f43153T0 = -1;

    /* renamed from: F0 */
    public float f43154F0 = 0.1f;

    /* renamed from: G0 */
    public int f43155G0 = 49;

    /* renamed from: H0 */
    public int f43156H0 = 50;

    /* renamed from: I0 */
    public int f43157I0 = 0;

    /* renamed from: J0 */
    public int f43158J0 = 0;

    /* renamed from: K0 */
    public boolean f43159K0 = true;

    /* renamed from: L0 */
    public int f43160L0 = -1;

    /* renamed from: M0 */
    public int f43161M0 = -1;

    public MotionEffect(Context context) {
        super(context);
    }

    /* renamed from: J */
    public final void mo49926J(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16944e.C16957m.MotionEffect);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.MotionEffect_motionEffect_start) {
                    int i2 = obtainStyledAttributes.getInt(index, this.f43155G0);
                    this.f43155G0 = i2;
                    this.f43155G0 = Math.max(Math.min(i2, 99), 0);
                } else if (index == C16944e.C16957m.MotionEffect_motionEffect_end) {
                    int i3 = obtainStyledAttributes.getInt(index, this.f43156H0);
                    this.f43156H0 = i3;
                    this.f43156H0 = Math.max(Math.min(i3, 99), 0);
                } else if (index == C16944e.C16957m.MotionEffect_motionEffect_translationX) {
                    this.f43157I0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f43157I0);
                } else if (index == C16944e.C16957m.MotionEffect_motionEffect_translationY) {
                    this.f43158J0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f43158J0);
                } else if (index == C16944e.C16957m.MotionEffect_motionEffect_alpha) {
                    this.f43154F0 = obtainStyledAttributes.getFloat(index, this.f43154F0);
                } else if (index == C16944e.C16957m.MotionEffect_motionEffect_move) {
                    this.f43161M0 = obtainStyledAttributes.getInt(index, this.f43161M0);
                } else if (index == C16944e.C16957m.MotionEffect_motionEffect_strict) {
                    this.f43159K0 = obtainStyledAttributes.getBoolean(index, this.f43159K0);
                } else if (index == C16944e.C16957m.MotionEffect_motionEffect_viewTransition) {
                    this.f43160L0 = obtainStyledAttributes.getResourceId(index, this.f43160L0);
                }
            }
            int i4 = this.f43155G0;
            int i5 = this.f43156H0;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.f43155G0 = i4 - 1;
                } else {
                    this.f43156H0 = i5 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x017d, code lost:
        if (r14 == 0.0f) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0191, code lost:
        if (r14 == 0.0f) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a1, code lost:
        if (r15 == 0.0f) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b1, code lost:
        if (r15 == 0.0f) goto L_0x0180;
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b7  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo49927c(androidx.constraintlayout.motion.widget.MotionLayout r22, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.C16895o> r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            android.view.ViewParent r2 = r21.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            android.view.View[] r2 = r0.mo50664w(r2)
            if (r2 != 0) goto L_0x0022
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = androidx.constraintlayout.motion.widget.C16878c.m77583f()
            r1.append(r2)
            java.lang.String r2 = " views = null"
            r1.append(r2)
            return
        L_0x0022:
            androidx.constraintlayout.motion.widget.g r3 = new androidx.constraintlayout.motion.widget.g
            r3.<init>()
            androidx.constraintlayout.motion.widget.g r4 = new androidx.constraintlayout.motion.widget.g
            r4.<init>()
            float r5 = r0.f43154F0
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.String r6 = "alpha"
            r3.mo50166j(r6, r5)
            float r5 = r0.f43154F0
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r4.mo50166j(r6, r5)
            int r5 = r0.f43155G0
            r3.mo50164h(r5)
            int r5 = r0.f43156H0
            r4.mo50164h(r5)
            androidx.constraintlayout.motion.widget.j r5 = new androidx.constraintlayout.motion.widget.j
            r5.<init>()
            int r6 = r0.f43155G0
            r5.mo50164h(r6)
            r6 = 0
            r5.mo50190z(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r8 = "percentX"
            r5.mo50166j(r8, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r9 = "percentY"
            r5.mo50166j(r9, r7)
            androidx.constraintlayout.motion.widget.j r7 = new androidx.constraintlayout.motion.widget.j
            r7.<init>()
            int r10 = r0.f43156H0
            r7.mo50164h(r10)
            r7.mo50190z(r6)
            r10 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r7.mo50166j(r8, r11)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r7.mo50166j(r9, r8)
            int r8 = r0.f43157I0
            r9 = 0
            if (r8 <= 0) goto L_0x00b3
            androidx.constraintlayout.motion.widget.g r8 = new androidx.constraintlayout.motion.widget.g
            r8.<init>()
            androidx.constraintlayout.motion.widget.g r11 = new androidx.constraintlayout.motion.widget.g
            r11.<init>()
            int r12 = r0.f43157I0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r13 = "translationX"
            r8.mo50166j(r13, r12)
            int r12 = r0.f43156H0
            r8.mo50164h(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r11.mo50166j(r13, r12)
            int r12 = r0.f43156H0
            int r12 = r12 - r10
            r11.mo50164h(r12)
            goto L_0x00b5
        L_0x00b3:
            r8 = r9
            r11 = r8
        L_0x00b5:
            int r12 = r0.f43158J0
            if (r12 <= 0) goto L_0x00e1
            androidx.constraintlayout.motion.widget.g r9 = new androidx.constraintlayout.motion.widget.g
            r9.<init>()
            androidx.constraintlayout.motion.widget.g r12 = new androidx.constraintlayout.motion.widget.g
            r12.<init>()
            int r13 = r0.f43158J0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "translationY"
            r9.mo50166j(r14, r13)
            int r13 = r0.f43156H0
            r9.mo50164h(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r12.mo50166j(r14, r13)
            int r13 = r0.f43156H0
            int r13 = r13 - r10
            r12.mo50164h(r13)
            goto L_0x00e2
        L_0x00e1:
            r12 = r9
        L_0x00e2:
            int r13 = r0.f43161M0
            r15 = -1
            r17 = 0
            if (r13 != r15) goto L_0x014b
            r13 = 4
            int[] r15 = new int[r13]
            r13 = r6
        L_0x00ed:
            int r14 = r2.length
            if (r13 >= r14) goto L_0x013a
            r14 = r2[r13]
            java.lang.Object r14 = r1.get(r14)
            androidx.constraintlayout.motion.widget.o r14 = (androidx.constraintlayout.motion.widget.C16895o) r14
            if (r14 != 0) goto L_0x00fb
            goto L_0x0137
        L_0x00fb:
            float r19 = r14.mo50260t()
            float r20 = r14.mo50219G()
            float r19 = r19 - r20
            float r20 = r14.mo50262u()
            float r14 = r14.mo50220H()
            float r20 = r20 - r14
            int r14 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r14 >= 0) goto L_0x0118
            r14 = r15[r10]
            int r14 = r14 + r10
            r15[r10] = r14
        L_0x0118:
            int r14 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r14 <= 0) goto L_0x0121
            r14 = r15[r6]
            int r14 = r14 + r10
            r15[r6] = r14
        L_0x0121:
            int r14 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r14 <= 0) goto L_0x012c
            r14 = 3
            r18 = r15[r14]
            int r18 = r18 + 1
            r15[r14] = r18
        L_0x012c:
            int r14 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r14 >= 0) goto L_0x0137
            r14 = 2
            r16 = r15[r14]
            int r16 = r16 + 1
            r15[r14] = r16
        L_0x0137:
            int r13 = r13 + 1
            goto L_0x00ed
        L_0x013a:
            r13 = r15[r6]
            r14 = r13
            r13 = r6
            r6 = r10
        L_0x013f:
            r10 = 4
            if (r6 >= r10) goto L_0x014b
            r10 = r15[r6]
            if (r14 >= r10) goto L_0x0148
            r13 = r6
            r14 = r10
        L_0x0148:
            int r6 = r6 + 1
            goto L_0x013f
        L_0x014b:
            r6 = 0
        L_0x014c:
            int r10 = r2.length
            if (r6 >= r10) goto L_0x01ea
            r10 = r2[r6]
            java.lang.Object r10 = r1.get(r10)
            androidx.constraintlayout.motion.widget.o r10 = (androidx.constraintlayout.motion.widget.C16895o) r10
            if (r10 != 0) goto L_0x015e
        L_0x0159:
            r1 = r22
            r15 = -1
            goto L_0x01e4
        L_0x015e:
            float r14 = r10.mo50260t()
            float r15 = r10.mo50219G()
            float r14 = r14 - r15
            float r15 = r10.mo50262u()
            float r20 = r10.mo50220H()
            float r15 = r15 - r20
            if (r13 != 0) goto L_0x0184
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 <= 0) goto L_0x0182
            boolean r15 = r0.f43159K0
            if (r15 == 0) goto L_0x017f
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x0182
        L_0x017f:
            r1 = 3
        L_0x0180:
            r14 = 0
            goto L_0x01b5
        L_0x0182:
            r1 = 3
            goto L_0x01b4
        L_0x0184:
            r1 = 1
            if (r13 != r1) goto L_0x0194
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x0182
            boolean r15 = r0.f43159K0
            if (r15 == 0) goto L_0x017f
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x0182
            goto L_0x017f
        L_0x0194:
            r1 = 2
            if (r13 != r1) goto L_0x01a4
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 >= 0) goto L_0x0182
            boolean r14 = r0.f43159K0
            if (r14 == 0) goto L_0x017f
            int r14 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x0182
            goto L_0x017f
        L_0x01a4:
            r1 = 3
            if (r13 != r1) goto L_0x01b4
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 <= 0) goto L_0x01b4
            boolean r14 = r0.f43159K0
            if (r14 == 0) goto L_0x0180
            int r14 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x01b4
            goto L_0x0180
        L_0x01b4:
            r14 = 1
        L_0x01b5:
            if (r14 == 0) goto L_0x0159
            int r14 = r0.f43160L0
            r15 = -1
            if (r14 != r15) goto L_0x01df
            r10.mo50239a(r3)
            r10.mo50239a(r4)
            r10.mo50239a(r5)
            r10.mo50239a(r7)
            int r14 = r0.f43157I0
            if (r14 <= 0) goto L_0x01d2
            r10.mo50239a(r8)
            r10.mo50239a(r11)
        L_0x01d2:
            int r14 = r0.f43158J0
            if (r14 <= 0) goto L_0x01dc
            r10.mo50239a(r9)
            r10.mo50239a(r12)
        L_0x01dc:
            r1 = r22
            goto L_0x01e4
        L_0x01df:
            r1 = r22
            r1.mo49982U(r14, r10)
        L_0x01e4:
            int r6 = r6 + 1
            r1 = r23
            goto L_0x014c
        L_0x01ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.mo49927c(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    /* renamed from: k */
    public boolean mo49928k() {
        return true;
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo49926J(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo49926J(context, attributeSet);
    }
}
