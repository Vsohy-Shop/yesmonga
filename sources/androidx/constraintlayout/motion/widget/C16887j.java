package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.C16680d;
import androidx.constraintlayout.motion.utils.C16831d;
import androidx.constraintlayout.widget.C16944e;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.motion.widget.j */
public class C16887j extends C16889k {

    /* renamed from: R */
    public static final String f43500R = "KeyPosition";

    /* renamed from: S */
    public static final String f43501S = "KeyPosition";

    /* renamed from: T */
    public static final int f43502T = 2;

    /* renamed from: U */
    public static final int f43503U = 1;

    /* renamed from: V */
    public static final int f43504V = 0;

    /* renamed from: W */
    public static final String f43505W = "transitionEasing";

    /* renamed from: X */
    public static final String f43506X = "drawPath";

    /* renamed from: Y */
    public static final String f43507Y = "percentWidth";

    /* renamed from: Z */
    public static final String f43508Z = "percentHeight";

    /* renamed from: a0 */
    public static final String f43509a0 = "sizePercent";

    /* renamed from: b0 */
    public static final String f43510b0 = "percentX";

    /* renamed from: c0 */
    public static final String f43511c0 = "percentY";

    /* renamed from: d0 */
    public static final int f43512d0 = 2;

    /* renamed from: F */
    public String f43513F = null;

    /* renamed from: G */
    public int f43514G = C16881f.f43372f;

    /* renamed from: H */
    public int f43515H = 0;

    /* renamed from: I */
    public float f43516I = Float.NaN;

    /* renamed from: J */
    public float f43517J = Float.NaN;

    /* renamed from: K */
    public float f43518K = Float.NaN;

    /* renamed from: L */
    public float f43519L = Float.NaN;

    /* renamed from: M */
    public float f43520M = Float.NaN;

    /* renamed from: N */
    public float f43521N = Float.NaN;

    /* renamed from: O */
    public int f43522O = 0;

    /* renamed from: P */
    public float f43523P = Float.NaN;

    /* renamed from: Q */
    public float f43524Q = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.j$a */
    public static class C16888a {

        /* renamed from: a */
        public static final int f43525a = 1;

        /* renamed from: b */
        public static final int f43526b = 2;

        /* renamed from: c */
        public static final int f43527c = 3;

        /* renamed from: d */
        public static final int f43528d = 4;

        /* renamed from: e */
        public static final int f43529e = 5;

        /* renamed from: f */
        public static final int f43530f = 6;

        /* renamed from: g */
        public static final int f43531g = 7;

        /* renamed from: h */
        public static final int f43532h = 8;

        /* renamed from: i */
        public static final int f43533i = 9;

        /* renamed from: j */
        public static final int f43534j = 10;

        /* renamed from: k */
        public static final int f43535k = 11;

        /* renamed from: l */
        public static final int f43536l = 12;

        /* renamed from: m */
        public static SparseIntArray f43537m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f43537m = sparseIntArray;
            sparseIntArray.append(C16944e.C16957m.KeyPosition_motionTarget, 1);
            f43537m.append(C16944e.C16957m.KeyPosition_framePosition, 2);
            f43537m.append(C16944e.C16957m.KeyPosition_transitionEasing, 3);
            f43537m.append(C16944e.C16957m.KeyPosition_curveFit, 4);
            f43537m.append(C16944e.C16957m.KeyPosition_drawPath, 5);
            f43537m.append(C16944e.C16957m.KeyPosition_percentX, 6);
            f43537m.append(C16944e.C16957m.KeyPosition_percentY, 7);
            f43537m.append(C16944e.C16957m.KeyPosition_keyPositionType, 9);
            f43537m.append(C16944e.C16957m.KeyPosition_sizePercent, 8);
            f43537m.append(C16944e.C16957m.KeyPosition_percentWidth, 11);
            f43537m.append(C16944e.C16957m.KeyPosition_percentHeight, 12);
            f43537m.append(C16944e.C16957m.KeyPosition_pathMotionArc, 10);
        }

        /* renamed from: b */
        public static void m77752b(C16887j jVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f43537m.get(index)) {
                    case 1:
                        if (!MotionLayout.f43205d2) {
                            if (typedArray.peekValue(index).type != 3) {
                                jVar.f43394b = typedArray.getResourceId(index, jVar.f43394b);
                                break;
                            } else {
                                jVar.f43395c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, jVar.f43394b);
                            jVar.f43394b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                jVar.f43395c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 2:
                        jVar.f43393a = typedArray.getInt(index, jVar.f43393a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type != 3) {
                            jVar.f43513F = C16680d.f41937o[typedArray.getInteger(index, 0)];
                            break;
                        } else {
                            jVar.f43513F = typedArray.getString(index);
                            break;
                        }
                    case 4:
                        jVar.f43539D = typedArray.getInteger(index, jVar.f43539D);
                        break;
                    case 5:
                        jVar.f43515H = typedArray.getInt(index, jVar.f43515H);
                        break;
                    case 6:
                        jVar.f43518K = typedArray.getFloat(index, jVar.f43518K);
                        break;
                    case 7:
                        jVar.f43519L = typedArray.getFloat(index, jVar.f43519L);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, jVar.f43517J);
                        jVar.f43516I = f;
                        jVar.f43517J = f;
                        break;
                    case 9:
                        jVar.f43522O = typedArray.getInt(index, jVar.f43522O);
                        break;
                    case 10:
                        jVar.f43514G = typedArray.getInt(index, jVar.f43514G);
                        break;
                    case 11:
                        jVar.f43516I = typedArray.getFloat(index, jVar.f43516I);
                        break;
                    case 12:
                        jVar.f43517J = typedArray.getFloat(index, jVar.f43517J);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f43537m.get(index));
                        break;
                }
            }
            int i2 = jVar.f43393a;
        }
    }

    public C16887j() {
        this.f43396d = 2;
    }

    /* renamed from: a */
    public void mo50156a(HashMap<String, C16831d> hashMap) {
    }

    /* renamed from: b */
    public C16881f clone() {
        return new C16887j().mo50158c(this);
    }

    /* renamed from: c */
    public C16881f mo50158c(C16881f fVar) {
        super.mo50158c(fVar);
        C16887j jVar = (C16887j) fVar;
        this.f43513F = jVar.f43513F;
        this.f43514G = jVar.f43514G;
        this.f43515H = jVar.f43515H;
        this.f43516I = jVar.f43516I;
        this.f43517J = Float.NaN;
        this.f43518K = jVar.f43518K;
        this.f43519L = jVar.f43519L;
        this.f43520M = jVar.f43520M;
        this.f43521N = jVar.f43521N;
        this.f43523P = jVar.f43523P;
        this.f43524Q = jVar.f43524Q;
        return this;
    }

    /* renamed from: f */
    public void mo50162f(Context context, AttributeSet attributeSet) {
        C16888a.m77752b(this, context.obtainStyledAttributes(attributeSet, C16944e.C16957m.KeyPosition));
    }

    /* renamed from: j */
    public void mo50166j(String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 0;
                    break;
                }
                break;
            case -1127236479:
                if (str.equals("percentWidth")) {
                    c = 1;
                    break;
                }
                break;
            case -1017587252:
                if (str.equals("percentHeight")) {
                    c = 2;
                    break;
                }
                break;
            case -827014263:
                if (str.equals("drawPath")) {
                    c = 3;
                    break;
                }
                break;
            case -200259324:
                if (str.equals("sizePercent")) {
                    c = 4;
                    break;
                }
                break;
            case 428090547:
                if (str.equals("percentX")) {
                    c = 5;
                    break;
                }
                break;
            case 428090548:
                if (str.equals("percentY")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f43513F = obj.toString();
                return;
            case 1:
                this.f43516I = mo50169m(obj);
                return;
            case 2:
                this.f43517J = mo50169m(obj);
                return;
            case 3:
                this.f43515H = mo50170n(obj);
                return;
            case 4:
                float m = mo50169m(obj);
                this.f43516I = m;
                this.f43517J = m;
                return;
            case 5:
                this.f43518K = mo50169m(obj);
                return;
            case 6:
                this.f43519L = mo50169m(obj);
                return;
            default:
                return;
        }
    }

    /* renamed from: o */
    public void mo50179o(int i, int i2, float f, float f2, float f3, float f4) {
        int i3 = this.f43522O;
        if (i3 == 1) {
            mo50185u(f, f2, f3, f4);
        } else if (i3 != 2) {
            mo50184t(f, f2, f3, f4);
        } else {
            mo50186v(i, i2);
        }
    }

    /* renamed from: p */
    public float mo50180p() {
        return this.f43523P;
    }

    /* renamed from: q */
    public float mo50181q() {
        return this.f43524Q;
    }

    /* renamed from: r */
    public boolean mo50182r(int i, int i2, RectF rectF, RectF rectF2, float f, float f2) {
        mo50179o(i, i2, rectF.centerX(), rectF.centerY(), rectF2.centerX(), rectF2.centerY());
        if (Math.abs(f - this.f43523P) >= 20.0f || Math.abs(f2 - this.f43524Q) >= 20.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public void mo50183s(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        int i = this.f43522O;
        if (i == 1) {
            mo50188x(rectF, rectF2, f, f2, strArr, fArr);
        } else if (i != 2) {
            mo50187w(rectF, rectF2, f, f2, strArr, fArr);
        } else {
            mo50189y(view, rectF, rectF2, f, f2, strArr, fArr);
        }
    }

    /* renamed from: t */
    public final void mo50184t(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = 0.0f;
        if (Float.isNaN(this.f43518K)) {
            f5 = 0.0f;
        } else {
            f5 = this.f43518K;
        }
        if (Float.isNaN(this.f43521N)) {
            f6 = 0.0f;
        } else {
            f6 = this.f43521N;
        }
        if (Float.isNaN(this.f43519L)) {
            f7 = 0.0f;
        } else {
            f7 = this.f43519L;
        }
        if (!Float.isNaN(this.f43520M)) {
            f10 = this.f43520M;
        }
        this.f43523P = (float) ((int) (f + (f5 * f8) + (f10 * f9)));
        this.f43524Q = (float) ((int) (f2 + (f8 * f6) + (f9 * f7)));
    }

    /* renamed from: u */
    public final void mo50185u(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = this.f43518K;
        float f8 = this.f43519L;
        this.f43523P = f + (f5 * f7) + ((-f6) * f8);
        this.f43524Q = f2 + (f6 * f7) + (f5 * f8);
    }

    /* renamed from: v */
    public final void mo50186v(int i, int i2) {
        float f = this.f43518K;
        float f2 = (float) 0;
        this.f43523P = (((float) (i - 0)) * f) + f2;
        this.f43524Q = (((float) (i2 - 0)) * f) + f2;
    }

    /* renamed from: w */
    public void mo50187w(RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = (f - centerX) / centerX2;
            strArr[1] = "percentY";
            fArr[1] = (f2 - centerY) / centerY2;
        } else if ("percentX".equals(str)) {
            fArr[0] = (f - centerX) / centerX2;
            fArr[1] = (f2 - centerY) / centerY2;
        } else {
            fArr[1] = (f - centerX) / centerX2;
            fArr[0] = (f2 - centerY) / centerY2;
        }
    }

    /* renamed from: x */
    public void mo50188x(RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        float hypot = (float) Math.hypot((double) centerX2, (double) centerY2);
        if (((double) hypot) < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f3 = centerX2 / hypot;
        float f4 = centerY2 / hypot;
        float f5 = f2 - centerY;
        float f6 = f - centerX;
        float f7 = ((f3 * f5) - (f6 * f4)) / hypot;
        float f8 = ((f3 * f6) + (f4 * f5)) / hypot;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            strArr[1] = "percentY";
            fArr[0] = f8;
            fArr[1] = f7;
        } else if ("percentX".equals(str)) {
            fArr[0] = f8;
            fArr[1] = f7;
        }
    }

    /* renamed from: y */
    public void mo50189y(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        rectF.centerX();
        rectF.centerY();
        rectF2.centerX();
        rectF2.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = f / ((float) width);
            strArr[1] = "percentY";
            fArr[1] = f2 / ((float) height);
        } else if ("percentX".equals(str)) {
            fArr[0] = f / ((float) width);
            fArr[1] = f2 / ((float) height);
        } else {
            fArr[1] = f / ((float) width);
            fArr[0] = f2 / ((float) height);
        }
    }

    /* renamed from: z */
    public void mo50190z(int i) {
        this.f43522O = i;
    }
}
