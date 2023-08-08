package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.constraintlayout.core.motion.utils.C16685g;
import androidx.constraintlayout.core.widgets.C16775a;
import androidx.constraintlayout.core.widgets.C16798d;
import androidx.constraintlayout.core.widgets.C16799e;
import androidx.constraintlayout.core.widgets.C16801f;
import androidx.constraintlayout.core.widgets.C16803g;
import androidx.constraintlayout.core.widgets.C16804h;
import androidx.constraintlayout.core.widgets.C16806j;
import androidx.constraintlayout.core.widgets.C16808l;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.utils.C16816b;
import androidx.constraintlayout.motion.utils.C16847e;
import androidx.constraintlayout.motion.widget.C16900s;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C16930a;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.C16944e;
import androidx.constraintlayout.widget.C16960g;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.core.internal.view.C17673a;
import androidx.core.view.C18384u1;
import androidx.exifinterface.media.C19135a;
import com.bumptech.glide.load.engine.GlideException;
import com.carrefour.fid.android.design.components.extension.C37106a;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.EnergyLabelKt;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.google.firebase.installations.C33124s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MotionLayout extends ConstraintLayout implements C18384u1 {

    /* renamed from: T1 */
    public static final int f43195T1 = 0;

    /* renamed from: U1 */
    public static final int f43196U1 = 1;

    /* renamed from: V1 */
    public static final int f43197V1 = 2;

    /* renamed from: W1 */
    public static final int f43198W1 = 3;

    /* renamed from: X1 */
    public static final int f43199X1 = 4;

    /* renamed from: Y1 */
    public static final int f43200Y1 = 5;

    /* renamed from: Z1 */
    public static final int f43201Z1 = 6;

    /* renamed from: a2 */
    public static final int f43202a2 = 7;

    /* renamed from: b2 */
    public static final String f43203b2 = "MotionLayout";

    /* renamed from: c2 */
    public static final boolean f43204c2 = false;

    /* renamed from: d2 */
    public static boolean f43205d2 = false;

    /* renamed from: e2 */
    public static final int f43206e2 = 0;

    /* renamed from: f2 */
    public static final int f43207f2 = 1;

    /* renamed from: g2 */
    public static final int f43208g2 = 2;

    /* renamed from: h2 */
    public static final int f43209h2 = 50;

    /* renamed from: i2 */
    public static final int f43210i2 = 0;

    /* renamed from: j2 */
    public static final int f43211j2 = 1;

    /* renamed from: k2 */
    public static final int f43212k2 = 2;

    /* renamed from: l2 */
    public static final int f43213l2 = 3;

    /* renamed from: m2 */
    public static final float f43214m2 = 1.0E-5f;

    /* renamed from: A1 */
    public C16872k f43215A1;

    /* renamed from: B1 */
    public Runnable f43216B1 = null;

    /* renamed from: C1 */
    public int[] f43217C1 = null;

    /* renamed from: D1 */
    public int f43218D1 = 0;

    /* renamed from: E0 */
    public float f43219E0 = 1.0f;

    /* renamed from: E1 */
    public boolean f43220E1 = false;

    /* renamed from: F0 */
    public float f43221F0 = 0.0f;

    /* renamed from: F1 */
    public int f43222F1 = 0;

    /* renamed from: G0 */
    public float f43223G0 = 0.0f;

    /* renamed from: G1 */
    public HashMap<View, C16847e> f43224G1 = new HashMap<>();

    /* renamed from: H0 */
    public long f43225H0;

    /* renamed from: H1 */
    public int f43226H1;

    /* renamed from: I0 */
    public float f43227I0 = 0.0f;

    /* renamed from: I1 */
    public int f43228I1;

    /* renamed from: J0 */
    public boolean f43229J0;

    /* renamed from: J1 */
    public int f43230J1;

    /* renamed from: K0 */
    public boolean f43231K0 = false;

    /* renamed from: K1 */
    public Rect f43232K1 = new Rect();

    /* renamed from: L0 */
    public boolean f43233L0 = false;

    /* renamed from: L1 */
    public boolean f43234L1 = false;

    /* renamed from: M0 */
    public C16873l f43235M0;

    /* renamed from: M1 */
    public TransitionState f43236M1 = TransitionState.UNDEFINED;

    /* renamed from: N0 */
    public float f43237N0;

    /* renamed from: N1 */
    public C16869h f43238N1 = new C16869h();

    /* renamed from: O0 */
    public float f43239O0;

    /* renamed from: O1 */
    public boolean f43240O1 = false;

    /* renamed from: P0 */
    public int f43241P0 = 0;

    /* renamed from: P1 */
    public RectF f43242P1 = new RectF();

    /* renamed from: Q0 */
    public C16868g f43243Q0;

    /* renamed from: Q1 */
    public View f43244Q1 = null;

    /* renamed from: R0 */
    public boolean f43245R0 = false;

    /* renamed from: R1 */
    public Matrix f43246R1 = null;

    /* renamed from: S0 */
    public C16816b f43247S0 = new C16816b();

    /* renamed from: S1 */
    public ArrayList<Integer> f43248S1 = new ArrayList<>();

    /* renamed from: T0 */
    public C16867f f43249T0 = new C16867f();

    /* renamed from: U0 */
    public C16879d f43250U0;

    /* renamed from: V0 */
    public boolean f43251V0 = true;

    /* renamed from: W0 */
    public int f43252W0;

    /* renamed from: X0 */
    public int f43253X0;

    /* renamed from: Y0 */
    public int f43254Y0;

    /* renamed from: Z0 */
    public int f43255Z0;

    /* renamed from: a */
    public C16900s f43256a;

    /* renamed from: a1 */
    public boolean f43257a1 = false;

    /* renamed from: b */
    public Interpolator f43258b;

    /* renamed from: b1 */
    public float f43259b1;

    /* renamed from: c */
    public Interpolator f43260c = null;

    /* renamed from: c1 */
    public float f43261c1;

    /* renamed from: d */
    public float f43262d = 0.0f;

    /* renamed from: d1 */
    public long f43263d1;

    /* renamed from: e */
    public int f43264e = -1;

    /* renamed from: e1 */
    public float f43265e1;

    /* renamed from: f */
    public int f43266f = -1;

    /* renamed from: f1 */
    public boolean f43267f1 = false;

    /* renamed from: g */
    public int f43268g = -1;

    /* renamed from: g1 */
    public ArrayList<MotionHelper> f43269g1 = null;

    /* renamed from: h1 */
    public ArrayList<MotionHelper> f43270h1 = null;

    /* renamed from: i1 */
    public ArrayList<MotionHelper> f43271i1 = null;

    /* renamed from: j1 */
    public CopyOnWriteArrayList<C16873l> f43272j1 = null;

    /* renamed from: k1 */
    public int f43273k1 = 0;

    /* renamed from: l1 */
    public long f43274l1 = -1;

    /* renamed from: m1 */
    public float f43275m1 = 0.0f;

    /* renamed from: n1 */
    public int f43276n1 = 0;

    /* renamed from: o1 */
    public float f43277o1 = 0.0f;

    /* renamed from: p1 */
    public boolean f43278p1 = false;

    /* renamed from: q1 */
    public boolean f43279q1 = false;

    /* renamed from: r1 */
    public int f43280r1;

    /* renamed from: s1 */
    public int f43281s1;

    /* renamed from: t1 */
    public int f43282t1;

    /* renamed from: u1 */
    public int f43283u1;

    /* renamed from: v */
    public int f43284v = 0;

    /* renamed from: v1 */
    public int f43285v1;

    /* renamed from: w */
    public int f43286w = 0;

    /* renamed from: w1 */
    public int f43287w1;

    /* renamed from: x */
    public boolean f43288x = true;

    /* renamed from: x1 */
    public float f43289x1;

    /* renamed from: y */
    public HashMap<View, C16895o> f43290y = new HashMap<>();

    /* renamed from: y1 */
    public C16685g f43291y1 = new C16685g();

    /* renamed from: z */
    public long f43292z = 0;

    /* renamed from: z1 */
    public boolean f43293z1 = false;

    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$a */
    public class C16862a implements Runnable {
        public C16862a() {
        }

        public void run() {
            MotionLayout.this.f43215A1.mo50103a();
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$b */
    public class C16863b implements Runnable {
        public C16863b() {
        }

        public void run() {
            boolean unused = MotionLayout.this.f43220E1 = false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$c */
    public class C16864c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f43301a;

        public C16864c(MotionLayout motionLayout, View view) {
            this.f43301a = view;
        }

        public void run() {
            this.f43301a.setNestedScrollingEnabled(true);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$d */
    public class C16865d implements Runnable {
        public C16865d() {
        }

        public void run() {
            MotionLayout.this.f43215A1.mo50103a();
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$e */
    public static /* synthetic */ class C16866e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43303a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43303a = r0
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43303a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43303a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f43303a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.C16866e.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$f */
    public class C16867f extends C16898q {

        /* renamed from: a */
        public float f43304a = 0.0f;

        /* renamed from: b */
        public float f43305b = 0.0f;

        /* renamed from: c */
        public float f43306c;

        public C16867f() {
        }

        /* renamed from: a */
        public float mo49931a() {
            return MotionLayout.this.f43262d;
        }

        /* renamed from: b */
        public void mo50067b(float f, float f2, float f3) {
            this.f43304a = f;
            this.f43305b = f2;
            this.f43306c = f3;
        }

        public float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.f43304a;
            if (f4 > 0.0f) {
                float f5 = this.f43306c;
                if (f4 / f5 < f) {
                    f = f4 / f5;
                }
                MotionLayout.this.f43262d = f4 - (f5 * f);
                f2 = (f4 * f) - (((f5 * f) * f) / 2.0f);
                f3 = this.f43305b;
            } else {
                float f6 = this.f43306c;
                if ((-f4) / f6 < f) {
                    f = (-f4) / f6;
                }
                MotionLayout.this.f43262d = (f6 * f) + f4;
                f2 = (f4 * f) + (((f6 * f) * f) / 2.0f);
                f3 = this.f43305b;
            }
            return f2 + f3;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$g */
    public class C16868g {

        /* renamed from: v */
        public static final int f43308v = 16;

        /* renamed from: a */
        public float[] f43309a;

        /* renamed from: b */
        public int[] f43310b;

        /* renamed from: c */
        public float[] f43311c;

        /* renamed from: d */
        public Path f43312d;

        /* renamed from: e */
        public Paint f43313e;

        /* renamed from: f */
        public Paint f43314f;

        /* renamed from: g */
        public Paint f43315g;

        /* renamed from: h */
        public Paint f43316h;

        /* renamed from: i */
        public Paint f43317i;

        /* renamed from: j */
        public float[] f43318j;

        /* renamed from: k */
        public final int f43319k = -21965;

        /* renamed from: l */
        public final int f43320l = -2067046;

        /* renamed from: m */
        public final int f43321m = -13391360;

        /* renamed from: n */
        public final int f43322n = 1996488704;

        /* renamed from: o */
        public final int f43323o = 10;

        /* renamed from: p */
        public DashPathEffect f43324p;

        /* renamed from: q */
        public int f43325q;

        /* renamed from: r */
        public Rect f43326r = new Rect();

        /* renamed from: s */
        public boolean f43327s = false;

        /* renamed from: t */
        public int f43328t = 1;

        public C16868g() {
            Paint paint = new Paint();
            this.f43313e = paint;
            paint.setAntiAlias(true);
            this.f43313e.setColor(-21965);
            this.f43313e.setStrokeWidth(2.0f);
            this.f43313e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f43314f = paint2;
            paint2.setAntiAlias(true);
            this.f43314f.setColor(-2067046);
            this.f43314f.setStrokeWidth(2.0f);
            this.f43314f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f43315g = paint3;
            paint3.setAntiAlias(true);
            this.f43315g.setColor(-13391360);
            this.f43315g.setStrokeWidth(2.0f);
            this.f43315g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f43316h = paint4;
            paint4.setAntiAlias(true);
            this.f43316h.setColor(-13391360);
            this.f43316h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f43318j = new float[8];
            Paint paint5 = new Paint();
            this.f43317i = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f43324p = dashPathEffect;
            this.f43315g.setPathEffect(dashPathEffect);
            this.f43311c = new float[100];
            this.f43310b = new int[50];
            if (this.f43327s) {
                this.f43313e.setStrokeWidth(8.0f);
                this.f43317i.setStrokeWidth(8.0f);
                this.f43314f.setStrokeWidth(8.0f);
                this.f43328t = 4;
            }
        }

        /* renamed from: a */
        public void mo50068a(Canvas canvas, HashMap<View, C16895o> hashMap, int i, int i2) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f43268g) + C33124s.f80355c + MotionLayout.this.getProgress();
                    canvas.drawText(str, 10.0f, (float) (MotionLayout.this.getHeight() - 30), this.f43316h);
                    canvas.drawText(str, 11.0f, (float) (MotionLayout.this.getHeight() - 29), this.f43313e);
                }
                for (C16895o next : hashMap.values()) {
                    int q = next.mo50257q();
                    if (i2 > 0 && q == 0) {
                        q = 1;
                    }
                    if (q != 0) {
                        this.f43325q = next.mo50245e(this.f43311c, this.f43310b);
                        if (q >= 1) {
                            int i3 = i / 16;
                            float[] fArr = this.f43309a;
                            if (fArr == null || fArr.length != i3 * 2) {
                                this.f43309a = new float[(i3 * 2)];
                                this.f43312d = new Path();
                            }
                            int i4 = this.f43328t;
                            canvas.translate((float) i4, (float) i4);
                            this.f43313e.setColor(1996488704);
                            this.f43317i.setColor(1996488704);
                            this.f43314f.setColor(1996488704);
                            this.f43315g.setColor(1996488704);
                            next.mo50246f(this.f43309a, i3);
                            mo50069b(canvas, q, this.f43325q, next);
                            this.f43313e.setColor(-21965);
                            this.f43314f.setColor(-2067046);
                            this.f43317i.setColor(-2067046);
                            this.f43315g.setColor(-13391360);
                            int i5 = this.f43328t;
                            canvas.translate((float) (-i5), (float) (-i5));
                            mo50069b(canvas, q, this.f43325q, next);
                            if (q == 5) {
                                mo50077j(canvas, next);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        /* renamed from: b */
        public void mo50069b(Canvas canvas, int i, int i2, C16895o oVar) {
            if (i == 4) {
                mo50071d(canvas);
            }
            if (i == 2) {
                mo50074g(canvas);
            }
            if (i == 3) {
                mo50072e(canvas);
            }
            mo50070c(canvas);
            mo50078k(canvas, i, i2, oVar);
        }

        /* renamed from: c */
        public final void mo50070c(Canvas canvas) {
            canvas.drawLines(this.f43309a, this.f43313e);
        }

        /* renamed from: d */
        public final void mo50071d(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.f43325q; i++) {
                int i2 = this.f43310b[i];
                if (i2 == 1) {
                    z = true;
                }
                if (i2 == 0) {
                    z2 = true;
                }
            }
            if (z) {
                mo50074g(canvas);
            }
            if (z2) {
                mo50072e(canvas);
            }
        }

        /* renamed from: e */
        public final void mo50072e(Canvas canvas) {
            float[] fArr = this.f43309a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f43315g);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f43315g);
        }

        /* renamed from: f */
        public final void mo50073f(Canvas canvas, float f, float f2) {
            Canvas canvas2 = canvas;
            float[] fArr = this.f43309a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            String str = "" + (((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d))) / 100.0f);
            mo50080m(str, this.f43316h);
            canvas2.drawText(str, ((min2 / 2.0f) - ((float) (this.f43326r.width() / 2))) + min, f2 - 20.0f, this.f43316h);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f43315g);
            String str2 = "" + (((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d))) / 100.0f);
            mo50080m(str2, this.f43316h);
            canvas2.drawText(str2, f + 5.0f, max - ((max2 / 2.0f) - ((float) (this.f43326r.height() / 2))), this.f43316h);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f43315g);
        }

        /* renamed from: g */
        public final void mo50074g(Canvas canvas) {
            float[] fArr = this.f43309a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f43315g);
        }

        /* renamed from: h */
        public final void mo50075h(Canvas canvas, float f, float f2) {
            float[] fArr = this.f43309a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f3 - f5), (double) (f4 - f6));
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot((double) (f10 - f), (double) (f11 - f2));
            String str = "" + (((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            mo50080m(str, this.f43316h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - ((float) (this.f43326r.width() / 2)), -20.0f, this.f43316h);
            canvas.drawLine(f, f2, f10, f11, this.f43315g);
        }

        /* renamed from: i */
        public final void mo50076i(Canvas canvas, float f, float f2, int i, int i2) {
            Canvas canvas2 = canvas;
            String str = "" + (((float) ((int) (((double) (((f - ((float) (i / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i)))) + 0.5d))) / 100.0f);
            mo50080m(str, this.f43316h);
            canvas2.drawText(str, ((f / 2.0f) - ((float) (this.f43326r.width() / 2))) + 0.0f, f2 - 20.0f, this.f43316h);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.f43315g);
            String str2 = "" + (((float) ((int) (((double) (((f2 - ((float) (i2 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i2)))) + 0.5d))) / 100.0f);
            mo50080m(str2, this.f43316h);
            canvas2.drawText(str2, f + 5.0f, 0.0f - ((f2 / 2.0f) - ((float) (this.f43326r.height() / 2))), this.f43316h);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.f43315g);
        }

        /* renamed from: j */
        public final void mo50077j(Canvas canvas, C16895o oVar) {
            this.f43312d.reset();
            for (int i = 0; i <= 50; i++) {
                oVar.mo50247g(((float) i) / ((float) 50), this.f43318j, 0);
                Path path = this.f43312d;
                float[] fArr = this.f43318j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f43312d;
                float[] fArr2 = this.f43318j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f43312d;
                float[] fArr3 = this.f43318j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f43312d;
                float[] fArr4 = this.f43318j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f43312d.close();
            }
            this.f43313e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f43312d, this.f43313e);
            canvas.translate(-2.0f, -2.0f);
            this.f43313e.setColor(C17673a.f46025c);
            canvas.drawPath(this.f43312d, this.f43313e);
        }

        /* renamed from: k */
        public final void mo50078k(Canvas canvas, int i, int i2, C16895o oVar) {
            int i3;
            int i4;
            float f;
            float f2;
            Canvas canvas2 = canvas;
            int i5 = i;
            C16895o oVar2 = oVar;
            View view = oVar2.f43716b;
            if (view != null) {
                i4 = view.getWidth();
                i3 = oVar2.f43716b.getHeight();
            } else {
                i4 = 0;
                i3 = 0;
            }
            for (int i6 = 1; i6 < i2 - 1; i6++) {
                if (i5 != 4 || this.f43310b[i6 - 1] != 0) {
                    float[] fArr = this.f43311c;
                    int i7 = i6 * 2;
                    float f3 = fArr[i7];
                    float f4 = fArr[i7 + 1];
                    this.f43312d.reset();
                    this.f43312d.moveTo(f3, f4 + 10.0f);
                    this.f43312d.lineTo(f3 + 10.0f, f4);
                    this.f43312d.lineTo(f3, f4 - 10.0f);
                    this.f43312d.lineTo(f3 - 10.0f, f4);
                    this.f43312d.close();
                    int i8 = i6 - 1;
                    oVar2.mo50263w(i8);
                    if (i5 == 4) {
                        int i9 = this.f43310b[i8];
                        if (i9 == 1) {
                            mo50075h(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (i9 == 0) {
                            mo50073f(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (i9 == 2) {
                            f2 = f4;
                            f = f3;
                            mo50076i(canvas, f3 - 0.0f, f4 - 0.0f, i4, i3);
                            canvas2.drawPath(this.f43312d, this.f43317i);
                        }
                        f2 = f4;
                        f = f3;
                        canvas2.drawPath(this.f43312d, this.f43317i);
                    } else {
                        f2 = f4;
                        f = f3;
                    }
                    if (i5 == 2) {
                        mo50075h(canvas2, f - 0.0f, f2 - 0.0f);
                    }
                    if (i5 == 3) {
                        mo50073f(canvas2, f - 0.0f, f2 - 0.0f);
                    }
                    if (i5 == 6) {
                        mo50076i(canvas, f - 0.0f, f2 - 0.0f, i4, i3);
                    }
                    canvas2.drawPath(this.f43312d, this.f43317i);
                }
            }
            float[] fArr2 = this.f43309a;
            if (fArr2.length > 1) {
                canvas2.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f43314f);
                float[] fArr3 = this.f43309a;
                canvas2.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f43314f);
            }
        }

        /* renamed from: l */
        public final void mo50079l(Canvas canvas, float f, float f2, float f3, float f4) {
            canvas.drawRect(f, f2, f3, f4, this.f43315g);
            canvas.drawLine(f, f2, f3, f4, this.f43315g);
        }

        /* renamed from: m */
        public void mo50080m(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f43326r);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$h */
    public class C16869h {

        /* renamed from: a */
        public C16798d f43330a = new C16798d();

        /* renamed from: b */
        public C16798d f43331b = new C16798d();

        /* renamed from: c */
        public C16934c f43332c = null;

        /* renamed from: d */
        public C16934c f43333d = null;

        /* renamed from: e */
        public int f43334e;

        /* renamed from: f */
        public int f43335f;

        public C16869h() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x00d6  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0123 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo50081a() {
            /*
                r17 = this;
                r0 = r17
                androidx.constraintlayout.motion.widget.MotionLayout r1 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r1 = r1.getChildCount()
                androidx.constraintlayout.motion.widget.MotionLayout r2 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.o> r2 = r2.f43290y
                r2.clear()
                android.util.SparseArray r2 = new android.util.SparseArray
                r2.<init>()
                int[] r3 = new int[r1]
                r5 = 0
            L_0x0017:
                if (r5 >= r1) goto L_0x0037
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.view.View r6 = r6.getChildAt(r5)
                androidx.constraintlayout.motion.widget.o r7 = new androidx.constraintlayout.motion.widget.o
                r7.<init>(r6)
                int r8 = r6.getId()
                r3[r5] = r8
                r2.put(r8, r7)
                androidx.constraintlayout.motion.widget.MotionLayout r8 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.o> r8 = r8.f43290y
                r8.put(r6, r7)
                int r5 = r5 + 1
                goto L_0x0017
            L_0x0037:
                r5 = 0
            L_0x0038:
                if (r5 >= r1) goto L_0x0127
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.view.View r6 = r6.getChildAt(r5)
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.o> r7 = r7.f43290y
                java.lang.Object r7 = r7.get(r6)
                r13 = r7
                androidx.constraintlayout.motion.widget.o r13 = (androidx.constraintlayout.motion.widget.C16895o) r13
                if (r13 != 0) goto L_0x004f
                goto L_0x0123
            L_0x004f:
                androidx.constraintlayout.widget.c r7 = r0.f43332c
                java.lang.String r14 = ")"
                java.lang.String r15 = " ("
                java.lang.String r12 = "no widget for  "
                if (r7 == 0) goto L_0x00a7
                androidx.constraintlayout.core.widgets.d r7 = r0.f43330a
                androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r0.mo50087g(r7, r6)
                if (r7 == 0) goto L_0x0079
                androidx.constraintlayout.motion.widget.MotionLayout r8 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.graphics.Rect r7 = r8.mo49970K0(r7)
                androidx.constraintlayout.widget.c r8 = r0.f43332c
                androidx.constraintlayout.motion.widget.MotionLayout r9 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r9 = r9.getWidth()
                androidx.constraintlayout.motion.widget.MotionLayout r10 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r10 = r10.getHeight()
                r13.mo50235W(r7, r8, r9, r10)
                goto L_0x00d1
            L_0x0079:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.f43241P0
                if (r7 == 0) goto L_0x00d1
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = androidx.constraintlayout.motion.widget.C16878c.m77584g()
                r7.append(r8)
                r7.append(r12)
                java.lang.String r8 = androidx.constraintlayout.motion.widget.C16878c.m77588k(r6)
                r7.append(r8)
                r7.append(r15)
                java.lang.Class r8 = r6.getClass()
                java.lang.String r8 = r8.getName()
                r7.append(r8)
                r7.append(r14)
                goto L_0x00d1
            L_0x00a7:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                boolean r7 = r7.f43220E1
                if (r7 == 0) goto L_0x00d1
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.utils.e> r7 = r7.f43224G1
                java.lang.Object r7 = r7.get(r6)
                r8 = r7
                androidx.constraintlayout.motion.utils.e r8 = (androidx.constraintlayout.motion.utils.C16847e) r8
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r10 = r7.f43222F1
                int r11 = r7.f43226H1
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r16 = r7.f43228I1
                r7 = r13
                r9 = r6
                r4 = r12
                r12 = r16
                r7.mo50236X(r8, r9, r10, r11, r12)
                goto L_0x00d2
            L_0x00d1:
                r4 = r12
            L_0x00d2:
                androidx.constraintlayout.widget.c r7 = r0.f43333d
                if (r7 == 0) goto L_0x0123
                androidx.constraintlayout.core.widgets.d r7 = r0.f43331b
                androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r0.mo50087g(r7, r6)
                if (r7 == 0) goto L_0x00f6
                androidx.constraintlayout.motion.widget.MotionLayout r4 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.graphics.Rect r4 = r4.mo49970K0(r7)
                androidx.constraintlayout.widget.c r6 = r0.f43333d
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.getWidth()
                androidx.constraintlayout.motion.widget.MotionLayout r8 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r8 = r8.getHeight()
                r13.mo50232T(r4, r6, r7, r8)
                goto L_0x0123
            L_0x00f6:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.f43241P0
                if (r7 == 0) goto L_0x0123
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = androidx.constraintlayout.motion.widget.C16878c.m77584g()
                r7.append(r8)
                r7.append(r4)
                java.lang.String r4 = androidx.constraintlayout.motion.widget.C16878c.m77588k(r6)
                r7.append(r4)
                r7.append(r15)
                java.lang.Class r4 = r6.getClass()
                java.lang.String r4 = r4.getName()
                r7.append(r4)
                r7.append(r14)
            L_0x0123:
                int r5 = r5 + 1
                goto L_0x0038
            L_0x0127:
                r4 = 0
            L_0x0128:
                if (r4 >= r1) goto L_0x0145
                r5 = r3[r4]
                java.lang.Object r5 = r2.get(r5)
                androidx.constraintlayout.motion.widget.o r5 = (androidx.constraintlayout.motion.widget.C16895o) r5
                int r6 = r5.mo50251k()
                r7 = -1
                if (r6 == r7) goto L_0x0142
                java.lang.Object r6 = r2.get(r6)
                androidx.constraintlayout.motion.widget.o r6 = (androidx.constraintlayout.motion.widget.C16895o) r6
                r5.mo50242b0(r6)
            L_0x0142:
                int r4 = r4 + 1
                goto L_0x0128
            L_0x0145:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.C16869h.mo50081a():void");
        }

        /* renamed from: b */
        public final void mo50082b(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.f43266f == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                C16798d dVar = this.f43331b;
                C16934c cVar = this.f43333d;
                if (cVar == null || cVar.f44576d == 0) {
                    i6 = i;
                } else {
                    i6 = i2;
                }
                if (cVar == null || cVar.f44576d == 0) {
                    i7 = i2;
                } else {
                    i7 = i;
                }
                motionLayout2.resolveSystem(dVar, optimizationLevel, i6, i7);
                C16934c cVar2 = this.f43332c;
                if (cVar2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    C16798d dVar2 = this.f43330a;
                    int i9 = cVar2.f44576d;
                    if (i9 == 0) {
                        i8 = i;
                    } else {
                        i8 = i2;
                    }
                    if (i9 == 0) {
                        i = i2;
                    }
                    motionLayout3.resolveSystem(dVar2, optimizationLevel, i8, i);
                    return;
                }
                return;
            }
            C16934c cVar3 = this.f43332c;
            if (cVar3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                C16798d dVar3 = this.f43330a;
                int i10 = cVar3.f44576d;
                if (i10 == 0) {
                    i4 = i;
                } else {
                    i4 = i2;
                }
                if (i10 == 0) {
                    i5 = i2;
                } else {
                    i5 = i;
                }
                motionLayout4.resolveSystem(dVar3, optimizationLevel, i4, i5);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            C16798d dVar4 = this.f43331b;
            C16934c cVar4 = this.f43333d;
            if (cVar4 == null || cVar4.f44576d == 0) {
                i3 = i;
            } else {
                i3 = i2;
            }
            if (cVar4 == null || cVar4.f44576d == 0) {
                i = i2;
            }
            motionLayout5.resolveSystem(dVar4, optimizationLevel, i3, i);
        }

        /* renamed from: c */
        public void mo50083c(C16798d dVar, C16798d dVar2) {
            ConstraintWidget constraintWidget;
            ArrayList<ConstraintWidget> l2 = dVar.mo49843l2();
            HashMap hashMap = new HashMap();
            hashMap.put(dVar, dVar2);
            dVar2.mo49843l2().clear();
            dVar2.mo49571n(dVar, hashMap);
            Iterator<ConstraintWidget> it = l2.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                if (next instanceof C16775a) {
                    constraintWidget = new C16775a();
                } else if (next instanceof C16801f) {
                    constraintWidget = new C16801f();
                } else if (next instanceof C16799e) {
                    constraintWidget = new C16799e();
                } else if (next instanceof C16806j) {
                    constraintWidget = new C16806j();
                } else if (next instanceof C16803g) {
                    constraintWidget = new C16804h();
                } else {
                    constraintWidget = new ConstraintWidget();
                }
                dVar2.mo49841a(constraintWidget);
                hashMap.put(next, constraintWidget);
            }
            Iterator<ConstraintWidget> it2 = l2.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                ((ConstraintWidget) hashMap.get(next2)).mo49571n(next2, hashMap);
            }
        }

        @SuppressLint({"LogConditional"})
        /* renamed from: d */
        public final void mo50084d(String str, C16798d dVar) {
            String str2;
            String str3;
            String str4;
            String str5 = str + " " + C16878c.m77588k((View) dVar.mo49599w());
            StringBuilder sb = new StringBuilder();
            sb.append(str5);
            sb.append("  ========= ");
            sb.append(dVar);
            int size = dVar.mo49843l2().size();
            for (int i = 0; i < size; i++) {
                String str6 = str5 + "[" + i + "] ";
                ConstraintWidget constraintWidget = dVar.mo49843l2().get(i);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                ConstraintAnchor constraintAnchor = constraintWidget.f42710R.f42629f;
                String str7 = C32920e.f79928l;
                if (constraintAnchor != null) {
                    str2 = C19135a.f48928d5;
                } else {
                    str2 = str7;
                }
                sb2.append(str2);
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb3);
                if (constraintWidget.f42714T.f42629f != null) {
                    str3 = EnergyLabelKt.f67707e;
                } else {
                    str3 = str7;
                }
                sb4.append(str3);
                String sb5 = sb4.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(sb5);
                if (constraintWidget.f42708Q.f42629f != null) {
                    str4 = C37106a.f92899d;
                } else {
                    str4 = str7;
                }
                sb6.append(str4);
                String sb7 = sb6.toString();
                StringBuilder sb8 = new StringBuilder();
                sb8.append(sb7);
                if (constraintWidget.f42712S.f42629f != null) {
                    str7 = "R";
                }
                sb8.append(str7);
                String sb9 = sb8.toString();
                View view = (View) constraintWidget.mo49599w();
                String k = C16878c.m77588k(view);
                if (view instanceof TextView) {
                    k = k + "(" + ((TextView) view).getText() + ")";
                }
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str6);
                sb10.append(GlideException.C22148a.f56917d);
                sb10.append(k);
                sb10.append(" ");
                sb10.append(constraintWidget);
                sb10.append(" ");
                sb10.append(sb9);
            }
            StringBuilder sb11 = new StringBuilder();
            sb11.append(str5);
            sb11.append(" done. ");
        }

        @SuppressLint({"LogConditional"})
        /* renamed from: e */
        public final void mo50085e(String str, ConstraintLayout.C16926b bVar) {
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            if (bVar.f44288t != -1) {
                str2 = "SS";
            } else {
                str2 = "__";
            }
            sb.append(str2);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            String str13 = "|__";
            if (bVar.f44286s != -1) {
                str3 = "|SE";
            } else {
                str3 = str13;
            }
            sb3.append(str3);
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            if (bVar.f44290u != -1) {
                str4 = "|ES";
            } else {
                str4 = str13;
            }
            sb5.append(str4);
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            if (bVar.f44292v != -1) {
                str5 = "|EE";
            } else {
                str5 = str13;
            }
            sb7.append(str5);
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(sb8);
            if (bVar.f44258e != -1) {
                str6 = "|LL";
            } else {
                str6 = str13;
            }
            sb9.append(str6);
            String sb10 = sb9.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(sb10);
            if (bVar.f44260f != -1) {
                str7 = "|LR";
            } else {
                str7 = str13;
            }
            sb11.append(str7);
            String sb12 = sb11.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append(sb12);
            if (bVar.f44262g != -1) {
                str8 = "|RL";
            } else {
                str8 = str13;
            }
            sb13.append(str8);
            String sb14 = sb13.toString();
            StringBuilder sb15 = new StringBuilder();
            sb15.append(sb14);
            if (bVar.f44264h != -1) {
                str9 = "|RR";
            } else {
                str9 = str13;
            }
            sb15.append(str9);
            String sb16 = sb15.toString();
            StringBuilder sb17 = new StringBuilder();
            sb17.append(sb16);
            if (bVar.f44266i != -1) {
                str10 = "|TT";
            } else {
                str10 = str13;
            }
            sb17.append(str10);
            String sb18 = sb17.toString();
            StringBuilder sb19 = new StringBuilder();
            sb19.append(sb18);
            if (bVar.f44268j != -1) {
                str11 = "|TB";
            } else {
                str11 = str13;
            }
            sb19.append(str11);
            String sb20 = sb19.toString();
            StringBuilder sb21 = new StringBuilder();
            sb21.append(sb20);
            if (bVar.f44270k != -1) {
                str12 = "|BT";
            } else {
                str12 = str13;
            }
            sb21.append(str12);
            String sb22 = sb21.toString();
            StringBuilder sb23 = new StringBuilder();
            sb23.append(sb22);
            if (bVar.f44272l != -1) {
                str13 = "|BB";
            }
            sb23.append(str13);
            String sb24 = sb23.toString();
            StringBuilder sb25 = new StringBuilder();
            sb25.append(str);
            sb25.append(sb24);
        }

        @SuppressLint({"LogConditional"})
        /* renamed from: f */
        public final void mo50086f(String str, ConstraintWidget constraintWidget) {
            String str2;
            String str3;
            String str4;
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            ConstraintAnchor constraintAnchor = constraintWidget.f42710R.f42629f;
            String str5 = EnergyLabelKt.f67707e;
            String str6 = "__";
            if (constraintAnchor != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C19135a.f48928d5);
                sb2.append(constraintWidget.f42710R.f42629f.f42628e == ConstraintAnchor.Type.f42635c ? C19135a.f48928d5 : str5);
                str2 = sb2.toString();
            } else {
                str2 = str6;
            }
            sb.append(str2);
            String sb3 = sb.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            if (constraintWidget.f42714T.f42629f != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str5);
                if (constraintWidget.f42714T.f42629f.f42628e == ConstraintAnchor.Type.f42635c) {
                    str5 = C19135a.f48928d5;
                }
                sb5.append(str5);
                str3 = sb5.toString();
            } else {
                str3 = str6;
            }
            sb4.append(str3);
            String sb6 = sb4.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            String str7 = "R";
            if (constraintWidget.f42708Q.f42629f != null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(C37106a.f92899d);
                sb8.append(constraintWidget.f42708Q.f42629f.f42628e == ConstraintAnchor.Type.LEFT ? C37106a.f92899d : str7);
                str4 = sb8.toString();
            } else {
                str4 = str6;
            }
            sb7.append(str4);
            String sb9 = sb7.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(sb9);
            if (constraintWidget.f42712S.f42629f != null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str7);
                if (constraintWidget.f42712S.f42629f.f42628e == ConstraintAnchor.Type.LEFT) {
                    str7 = C37106a.f92899d;
                }
                sb11.append(str7);
                str6 = sb11.toString();
            }
            sb10.append(str6);
            String sb12 = sb10.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append(str);
            sb13.append(sb12);
            sb13.append(" ---  ");
            sb13.append(constraintWidget);
        }

        /* renamed from: g */
        public ConstraintWidget mo50087g(C16798d dVar, View view) {
            if (dVar.mo49599w() == view) {
                return dVar;
            }
            ArrayList<ConstraintWidget> l2 = dVar.mo49843l2();
            int size = l2.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = l2.get(i);
                if (constraintWidget.mo49599w() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        /* renamed from: h */
        public void mo50088h(C16798d dVar, C16934c cVar, C16934c cVar2) {
            this.f43332c = cVar;
            this.f43333d = cVar2;
            this.f43330a = new C16798d();
            this.f43331b = new C16798d();
            this.f43330a.mo49736U2(MotionLayout.this.mLayoutWidget.mo49723G2());
            this.f43331b.mo49736U2(MotionLayout.this.mLayoutWidget.mo49723G2());
            this.f43330a.mo49846p2();
            this.f43331b.mo49846p2();
            mo50083c(MotionLayout.this.mLayoutWidget, this.f43330a);
            mo50083c(MotionLayout.this.mLayoutWidget, this.f43331b);
            if (((double) MotionLayout.this.f43223G0) > 0.5d) {
                if (cVar != null) {
                    mo50093m(this.f43330a, cVar);
                }
                mo50093m(this.f43331b, cVar2);
            } else {
                mo50093m(this.f43331b, cVar2);
                if (cVar != null) {
                    mo50093m(this.f43330a, cVar);
                }
            }
            this.f43330a.mo49740Y2(MotionLayout.this.isRtl());
            this.f43330a.mo49742a3();
            this.f43331b.mo49740Y2(MotionLayout.this.isRtl());
            this.f43331b.mo49742a3();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    C16798d dVar2 = this.f43330a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar2.mo49458D1(dimensionBehaviour);
                    this.f43331b.mo49458D1(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    C16798d dVar3 = this.f43330a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar3.mo49521Y1(dimensionBehaviour2);
                    this.f43331b.mo49521Y1(dimensionBehaviour2);
                }
            }
        }

        /* renamed from: i */
        public boolean mo50089i(int i, int i2) {
            return (i == this.f43334e && i2 == this.f43335f) ? false : true;
        }

        /* renamed from: j */
        public void mo50090j(int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.f43285v1 = mode;
            motionLayout.f43287w1 = mode2;
            motionLayout.getOptimizationLevel();
            mo50082b(i, i2);
            if ((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                mo50082b(i, i2);
                MotionLayout.this.f43280r1 = this.f43330a.mo49569m0();
                MotionLayout.this.f43281s1 = this.f43330a.mo49456D();
                MotionLayout.this.f43282t1 = this.f43331b.mo49569m0();
                MotionLayout.this.f43283u1 = this.f43331b.mo49456D();
                MotionLayout motionLayout2 = MotionLayout.this;
                if (motionLayout2.f43280r1 == motionLayout2.f43282t1 && motionLayout2.f43281s1 == motionLayout2.f43283u1) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                motionLayout2.f43279q1 = z4;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i3 = motionLayout3.f43280r1;
            int i4 = motionLayout3.f43281s1;
            int i5 = motionLayout3.f43285v1;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                i3 = (int) (((float) i3) + (motionLayout3.f43289x1 * ((float) (motionLayout3.f43282t1 - i3))));
            }
            int i6 = i3;
            int i7 = motionLayout3.f43287w1;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i4 = (int) (((float) i4) + (motionLayout3.f43289x1 * ((float) (motionLayout3.f43283u1 - i4))));
            }
            int i8 = i4;
            if (this.f43330a.mo49732P2() || this.f43331b.mo49732P2()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f43330a.mo49730N2() || this.f43331b.mo49730N2()) {
                z3 = true;
            } else {
                z3 = false;
            }
            MotionLayout.this.resolveMeasuredDimension(i, i2, i6, i8, z2, z3);
        }

        /* renamed from: k */
        public void mo50091k() {
            mo50090j(MotionLayout.this.f43284v, MotionLayout.this.f43286w);
            MotionLayout.this.mo49969J0();
        }

        /* renamed from: l */
        public void mo50092l(int i, int i2) {
            this.f43334e = i;
            this.f43335f = i2;
        }

        /* renamed from: m */
        public final void mo50093m(C16798d dVar, C16934c cVar) {
            SparseArray sparseArray = new SparseArray();
            Constraints.C16929a aVar = new Constraints.C16929a(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, dVar);
            sparseArray.put(MotionLayout.this.getId(), dVar);
            if (!(cVar == null || cVar.f44576d == 0)) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.resolveSystem(this.f43331b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            Iterator<ConstraintWidget> it = dVar.mo49843l2().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.mo49544f1(true);
                sparseArray.put(((View) next.mo49599w()).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = dVar.mo49843l2().iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.mo49599w();
                cVar.mo50909u(view.getId(), aVar);
                next2.mo49533c2(cVar.mo50910u0(view.getId()));
                next2.mo49607y1(cVar.mo50890n0(view.getId()));
                if (view instanceof ConstraintHelper) {
                    cVar.mo50903s((ConstraintHelper) view, next2, aVar, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).mo50647I();
                    }
                }
                aVar.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view, next2, aVar, sparseArray);
                if (cVar.mo50907t0(view.getId()) == 1) {
                    next2.mo49530b2(view.getVisibility());
                } else {
                    next2.mo49530b2(cVar.mo50904s0(view.getId()));
                }
            }
            Iterator<ConstraintWidget> it3 = dVar.mo49843l2().iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof C16808l) {
                    C16803g gVar = (C16803g) next3;
                    ((ConstraintHelper) next3.mo49599w()).mo49929G(dVar, gVar, sparseArray);
                    ((C16808l) gVar).mo49829n2();
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$i */
    public interface C16870i {
        /* renamed from: a */
        void mo50094a();

        /* renamed from: b */
        float mo50095b(int i);

        /* renamed from: c */
        void mo50096c(MotionEvent motionEvent);

        void clear();

        /* renamed from: d */
        float mo50098d();

        /* renamed from: e */
        float mo50099e();

        /* renamed from: f */
        void mo50100f(int i, float f);

        /* renamed from: g */
        float mo50101g(int i);

        /* renamed from: h */
        void mo50102h(int i);
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$j */
    public static class C16871j implements C16870i {

        /* renamed from: b */
        public static C16871j f43337b = new C16871j();

        /* renamed from: a */
        public VelocityTracker f43338a;

        /* renamed from: i */
        public static C16871j m77540i() {
            f43337b.f43338a = VelocityTracker.obtain();
            return f43337b;
        }

        /* renamed from: a */
        public void mo50094a() {
            VelocityTracker velocityTracker = this.f43338a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f43338a = null;
            }
        }

        /* renamed from: b */
        public float mo50095b(int i) {
            if (this.f43338a != null) {
                return mo50095b(i);
            }
            return 0.0f;
        }

        /* renamed from: c */
        public void mo50096c(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f43338a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        public void clear() {
            VelocityTracker velocityTracker = this.f43338a;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        /* renamed from: d */
        public float mo50098d() {
            VelocityTracker velocityTracker = this.f43338a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        /* renamed from: e */
        public float mo50099e() {
            VelocityTracker velocityTracker = this.f43338a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        /* renamed from: f */
        public void mo50100f(int i, float f) {
            VelocityTracker velocityTracker = this.f43338a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i, f);
            }
        }

        /* renamed from: g */
        public float mo50101g(int i) {
            VelocityTracker velocityTracker = this.f43338a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i);
            }
            return 0.0f;
        }

        /* renamed from: h */
        public void mo50102h(int i) {
            VelocityTracker velocityTracker = this.f43338a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$k */
    public class C16872k {

        /* renamed from: a */
        public float f43339a = Float.NaN;

        /* renamed from: b */
        public float f43340b = Float.NaN;

        /* renamed from: c */
        public int f43341c = -1;

        /* renamed from: d */
        public int f43342d = -1;

        /* renamed from: e */
        public final String f43343e = "motion.progress";

        /* renamed from: f */
        public final String f43344f = "motion.velocity";

        /* renamed from: g */
        public final String f43345g = "motion.StartState";

        /* renamed from: h */
        public final String f43346h = "motion.EndState";

        public C16872k() {
        }

        /* renamed from: a */
        public void mo50103a() {
            int i = this.f43341c;
            if (!(i == -1 && this.f43342d == -1)) {
                if (i == -1) {
                    MotionLayout.this.mo49976Q0(this.f43342d);
                } else {
                    int i2 = this.f43342d;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i, i2);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (!Float.isNaN(this.f43340b)) {
                MotionLayout.this.setProgress(this.f43339a, this.f43340b);
                this.f43339a = Float.NaN;
                this.f43340b = Float.NaN;
                this.f43341c = -1;
                this.f43342d = -1;
            } else if (!Float.isNaN(this.f43339a)) {
                MotionLayout.this.setProgress(this.f43339a);
            }
        }

        /* renamed from: b */
        public Bundle mo50104b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f43339a);
            bundle.putFloat("motion.velocity", this.f43340b);
            bundle.putInt("motion.StartState", this.f43341c);
            bundle.putInt("motion.EndState", this.f43342d);
            return bundle;
        }

        /* renamed from: c */
        public void mo50105c() {
            this.f43342d = MotionLayout.this.f43268g;
            this.f43341c = MotionLayout.this.f43264e;
            this.f43340b = MotionLayout.this.getVelocity();
            this.f43339a = MotionLayout.this.getProgress();
        }

        /* renamed from: d */
        public void mo50106d(int i) {
            this.f43342d = i;
        }

        /* renamed from: e */
        public void mo50107e(float f) {
            this.f43339a = f;
        }

        /* renamed from: f */
        public void mo50108f(int i) {
            this.f43341c = i;
        }

        /* renamed from: g */
        public void mo50109g(Bundle bundle) {
            this.f43339a = bundle.getFloat("motion.progress");
            this.f43340b = bundle.getFloat("motion.velocity");
            this.f43341c = bundle.getInt("motion.StartState");
            this.f43342d = bundle.getInt("motion.EndState");
        }

        /* renamed from: h */
        public void mo50110h(float f) {
            this.f43340b = f;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$l */
    public interface C16873l {
        /* renamed from: a */
        void mo49854a(MotionLayout motionLayout, int i, int i2, float f);

        /* renamed from: f */
        void mo49857f(MotionLayout motionLayout, int i);

        /* renamed from: g */
        void mo49953g(MotionLayout motionLayout, int i, int i2);

        /* renamed from: h */
        void mo49955h(MotionLayout motionLayout, int i, boolean z, float f);
    }

    public MotionLayout(@C0359n0 Context context) {
        super(context);
        mo50057u0((AttributeSet) null);
    }

    /* renamed from: Y0 */
    public static boolean m77432Y0(float f, float f2, float f3) {
        if (f > 0.0f) {
            float f4 = f / f3;
            return f2 + ((f * f4) - (((f3 * f4) * f4) / 2.0f)) > 1.0f;
        }
        float f5 = (-f) / f3;
        return f2 + ((f * f5) + (((f3 * f5) * f5) / 2.0f)) < 0.0f;
    }

    /* renamed from: A0 */
    public int mo49960A0(String str) {
        C16900s sVar = this.f43256a;
        if (sVar == null) {
            return 0;
        }
        return sVar.mo50312W(str);
    }

    /* renamed from: B0 */
    public C16870i mo49961B0() {
        return C16871j.m77540i();
    }

    /* renamed from: C0 */
    public void mo49962C0() {
        C16900s sVar = this.f43256a;
        if (sVar != null) {
            if (sVar.mo50327i(this, this.f43266f)) {
                requestLayout();
                return;
            }
            int i = this.f43266f;
            if (i != -1) {
                this.f43256a.mo50321f(this, i);
            }
            if (this.f43256a.mo50345r0()) {
                this.f43256a.mo50342p0();
            }
        }
    }

    /* renamed from: D0 */
    public final void mo49963D0() {
        CopyOnWriteArrayList<C16873l> copyOnWriteArrayList;
        if (this.f43235M0 != null || ((copyOnWriteArrayList = this.f43272j1) != null && !copyOnWriteArrayList.isEmpty())) {
            this.f43278p1 = false;
            Iterator<Integer> it = this.f43248S1.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                C16873l lVar = this.f43235M0;
                if (lVar != null) {
                    lVar.mo49857f(this, next.intValue());
                }
                CopyOnWriteArrayList<C16873l> copyOnWriteArrayList2 = this.f43272j1;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<C16873l> it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo49857f(this, next.intValue());
                    }
                }
            }
            this.f43248S1.clear();
        }
    }

    @Deprecated
    /* renamed from: E0 */
    public void mo49964E0() {
        mo49965F0();
    }

    /* renamed from: F0 */
    public void mo49965F0() {
        this.f43238N1.mo50091k();
        invalidate();
    }

    /* renamed from: G0 */
    public boolean mo49966G0(C16873l lVar) {
        CopyOnWriteArrayList<C16873l> copyOnWriteArrayList = this.f43272j1;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(lVar);
    }

    @C0376v0(api = 17)
    /* renamed from: H0 */
    public void mo49967H0(int i, int i2) {
        int i3 = 1;
        this.f43220E1 = true;
        this.f43226H1 = getWidth();
        this.f43228I1 = getHeight();
        int rotation = getDisplay().getRotation();
        if ((rotation + 1) % 4 <= (this.f43230J1 + 1) % 4) {
            i3 = 2;
        }
        this.f43222F1 = i3;
        this.f43230J1 = rotation;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            C16847e eVar = this.f43224G1.get(childAt);
            if (eVar == null) {
                eVar = new C16847e();
                this.f43224G1.put(childAt, eVar);
            }
            eVar.mo49943a(childAt);
        }
        this.f43264e = -1;
        this.f43268g = i;
        this.f43256a.mo50338n0(-1, i);
        this.f43238N1.mo50088h(this.mLayoutWidget, (C16934c) null, this.f43256a.mo50339o(this.f43268g));
        this.f43221F0 = 0.0f;
        this.f43223G0 = 0.0f;
        invalidate();
        mo49974O0(new C16863b());
        if (i2 > 0) {
            this.f43219E0 = ((float) i2) / 1000.0f;
        }
    }

    /* renamed from: I0 */
    public void mo49968I0(int i) {
        if (getCurrentState() == -1) {
            mo49976Q0(i);
            return;
        }
        int[] iArr = this.f43217C1;
        if (iArr == null) {
            this.f43217C1 = new int[4];
        } else if (iArr.length <= this.f43218D1) {
            this.f43217C1 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f43217C1;
        int i2 = this.f43218D1;
        this.f43218D1 = i2 + 1;
        iArr2[i2] = i;
    }

    /* renamed from: J0 */
    public final void mo49969J0() {
        boolean z;
        float f;
        float f2;
        int childCount = getChildCount();
        this.f43238N1.mo50081a();
        boolean z2 = true;
        this.f43231K0 = true;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            sparseArray.put(childAt.getId(), this.f43290y.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int m = this.f43256a.mo50335m();
        if (m != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C16895o oVar = this.f43290y.get(getChildAt(i3));
                if (oVar != null) {
                    oVar.mo50233U(m);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.f43290y.size()];
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            C16895o oVar2 = this.f43290y.get(getChildAt(i5));
            if (oVar2.mo50251k() != -1) {
                sparseBooleanArray.put(oVar2.mo50251k(), true);
                iArr[i4] = oVar2.mo50251k();
                i4++;
            }
        }
        if (this.f43271i1 != null) {
            for (int i6 = 0; i6 < i4; i6++) {
                C16895o oVar3 = this.f43290y.get(findViewById(iArr[i6]));
                if (oVar3 != null) {
                    this.f43256a.mo50355z(oVar3);
                }
            }
            Iterator<MotionHelper> it = this.f43271i1.iterator();
            while (it.hasNext()) {
                it.next().mo49927c(this, this.f43290y);
            }
            for (int i7 = 0; i7 < i4; i7++) {
                C16895o oVar4 = this.f43290y.get(findViewById(iArr[i7]));
                if (oVar4 != null) {
                    oVar4.mo50240a0(width, height, this.f43219E0, getNanoTime());
                }
            }
        } else {
            for (int i8 = 0; i8 < i4; i8++) {
                C16895o oVar5 = this.f43290y.get(findViewById(iArr[i8]));
                if (oVar5 != null) {
                    this.f43256a.mo50355z(oVar5);
                    oVar5.mo50240a0(width, height, this.f43219E0, getNanoTime());
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            C16895o oVar6 = this.f43290y.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && oVar6 != null) {
                this.f43256a.mo50355z(oVar6);
                oVar6.mo50240a0(width, height, this.f43219E0, getNanoTime());
            }
        }
        float M = this.f43256a.mo50302M();
        if (M != 0.0f) {
            if (((double) M) < 0.0d) {
                z = true;
            } else {
                z = false;
            }
            float abs = Math.abs(M);
            float f3 = -3.4028235E38f;
            float f4 = Float.MAX_VALUE;
            int i10 = 0;
            float f5 = -3.4028235E38f;
            float f6 = Float.MAX_VALUE;
            while (true) {
                if (i10 >= childCount) {
                    z2 = false;
                    break;
                }
                C16895o oVar7 = this.f43290y.get(getChildAt(i10));
                if (!Float.isNaN(oVar7.f43727m)) {
                    break;
                }
                float t = oVar7.mo50260t();
                float u = oVar7.mo50262u();
                if (z) {
                    f2 = u - t;
                } else {
                    f2 = u + t;
                }
                f6 = Math.min(f6, f2);
                f5 = Math.max(f5, f2);
                i10++;
            }
            if (z2) {
                for (int i11 = 0; i11 < childCount; i11++) {
                    C16895o oVar8 = this.f43290y.get(getChildAt(i11));
                    if (!Float.isNaN(oVar8.f43727m)) {
                        f4 = Math.min(f4, oVar8.f43727m);
                        f3 = Math.max(f3, oVar8.f43727m);
                    }
                }
                while (i < childCount) {
                    C16895o oVar9 = this.f43290y.get(getChildAt(i));
                    if (!Float.isNaN(oVar9.f43727m)) {
                        oVar9.f43729o = 1.0f / (1.0f - abs);
                        if (z) {
                            oVar9.f43728n = abs - (((f3 - oVar9.f43727m) / (f3 - f4)) * abs);
                        } else {
                            oVar9.f43728n = abs - (((oVar9.f43727m - f4) * abs) / (f3 - f4));
                        }
                    }
                    i++;
                }
                return;
            }
            while (i < childCount) {
                C16895o oVar10 = this.f43290y.get(getChildAt(i));
                float t2 = oVar10.mo50260t();
                float u2 = oVar10.mo50262u();
                if (z) {
                    f = u2 - t2;
                } else {
                    f = u2 + t2;
                }
                oVar10.f43729o = 1.0f / (1.0f - abs);
                oVar10.f43728n = abs - (((f - f6) * abs) / (f5 - f6));
                i++;
            }
        }
    }

    /* renamed from: K0 */
    public final Rect mo49970K0(ConstraintWidget constraintWidget) {
        this.f43232K1.top = constraintWidget.mo49578p0();
        this.f43232K1.left = constraintWidget.mo49575o0();
        Rect rect = this.f43232K1;
        int m0 = constraintWidget.mo49569m0();
        Rect rect2 = this.f43232K1;
        rect.right = m0 + rect2.left;
        int D = constraintWidget.mo49456D();
        Rect rect3 = this.f43232K1;
        rect2.bottom = D + rect3.top;
        return rect3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r10 != 7) goto L_0x00f1;
     */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo49971L0(int r10, float r11, float r12) {
        /*
            r9 = this;
            androidx.constraintlayout.motion.widget.s r0 = r9.f43256a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            float r0 = r9.f43223G0
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            r0 = 1
            r9.f43245R0 = r0
            long r1 = r9.getNanoTime()
            r9.f43292z = r1
            androidx.constraintlayout.motion.widget.s r1 = r9.f43256a
            int r1 = r1.mo50348t()
            float r1 = (float) r1
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            r9.f43219E0 = r1
            r9.f43227I0 = r11
            r9.f43231K0 = r0
            r1 = 0
            r2 = 7
            r3 = 6
            r4 = 2
            if (r10 == 0) goto L_0x0093
            if (r10 == r0) goto L_0x0093
            if (r10 == r4) goto L_0x0093
            r5 = 4
            if (r10 == r5) goto L_0x0081
            r5 = 5
            if (r10 == r5) goto L_0x003b
            if (r10 == r3) goto L_0x0093
            if (r10 == r2) goto L_0x0093
            goto L_0x00f1
        L_0x003b:
            float r10 = r9.f43223G0
            androidx.constraintlayout.motion.widget.s r0 = r9.f43256a
            float r0 = r0.mo50291B()
            boolean r10 = m77432Y0(r12, r10, r0)
            if (r10 == 0) goto L_0x005c
            androidx.constraintlayout.motion.widget.MotionLayout$f r10 = r9.f43249T0
            float r11 = r9.f43223G0
            androidx.constraintlayout.motion.widget.s r0 = r9.f43256a
            float r0 = r0.mo50291B()
            r10.mo50067b(r12, r11, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$f r10 = r9.f43249T0
            r9.f43258b = r10
            goto L_0x00f1
        L_0x005c:
            androidx.constraintlayout.motion.utils.b r2 = r9.f43247S0
            float r3 = r9.f43223G0
            float r6 = r9.f43219E0
            androidx.constraintlayout.motion.widget.s r10 = r9.f43256a
            float r7 = r10.mo50291B()
            androidx.constraintlayout.motion.widget.s r10 = r9.f43256a
            float r8 = r10.mo50292C()
            r4 = r11
            r5 = r12
            r2.mo49932b(r3, r4, r5, r6, r7, r8)
            r9.f43262d = r1
            int r10 = r9.f43266f
            r9.f43227I0 = r11
            r9.f43266f = r10
            androidx.constraintlayout.motion.utils.b r10 = r9.f43247S0
            r9.f43258b = r10
            goto L_0x00f1
        L_0x0081:
            androidx.constraintlayout.motion.widget.MotionLayout$f r10 = r9.f43249T0
            float r11 = r9.f43223G0
            androidx.constraintlayout.motion.widget.s r0 = r9.f43256a
            float r0 = r0.mo50291B()
            r10.mo50067b(r12, r11, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$f r10 = r9.f43249T0
            r9.f43258b = r10
            goto L_0x00f1
        L_0x0093:
            if (r10 == r0) goto L_0x009f
            if (r10 != r2) goto L_0x0098
            goto L_0x009f
        L_0x0098:
            if (r10 == r4) goto L_0x009c
            if (r10 != r3) goto L_0x00a0
        L_0x009c:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00a0
        L_0x009f:
            r11 = r1
        L_0x00a0:
            androidx.constraintlayout.motion.widget.s r10 = r9.f43256a
            int r10 = r10.mo50337n()
            if (r10 != 0) goto L_0x00c0
            androidx.constraintlayout.motion.utils.b r0 = r9.f43247S0
            float r1 = r9.f43223G0
            float r4 = r9.f43219E0
            androidx.constraintlayout.motion.widget.s r10 = r9.f43256a
            float r5 = r10.mo50291B()
            androidx.constraintlayout.motion.widget.s r10 = r9.f43256a
            float r6 = r10.mo50292C()
            r2 = r11
            r3 = r12
            r0.mo49932b(r1, r2, r3, r4, r5, r6)
            goto L_0x00e7
        L_0x00c0:
            androidx.constraintlayout.motion.utils.b r0 = r9.f43247S0
            float r1 = r9.f43223G0
            androidx.constraintlayout.motion.widget.s r10 = r9.f43256a
            float r4 = r10.mo50299J()
            androidx.constraintlayout.motion.widget.s r10 = r9.f43256a
            float r5 = r10.mo50300K()
            androidx.constraintlayout.motion.widget.s r10 = r9.f43256a
            float r6 = r10.mo50298I()
            androidx.constraintlayout.motion.widget.s r10 = r9.f43256a
            float r7 = r10.mo50301L()
            androidx.constraintlayout.motion.widget.s r10 = r9.f43256a
            int r8 = r10.mo50297H()
            r2 = r11
            r3 = r12
            r0.mo49936f(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00e7:
            int r10 = r9.f43266f
            r9.f43227I0 = r11
            r9.f43266f = r10
            androidx.constraintlayout.motion.utils.b r10 = r9.f43247S0
            r9.f43258b = r10
        L_0x00f1:
            r10 = 0
            r9.f43229J0 = r10
            long r10 = r9.getNanoTime()
            r9.f43292z = r10
            r9.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo49971L0(int, float, float):void");
    }

    /* renamed from: M0 */
    public void mo49972M0(float f, float f2) {
        if (this.f43256a != null && this.f43223G0 != f) {
            this.f43245R0 = true;
            this.f43292z = getNanoTime();
            this.f43219E0 = ((float) this.f43256a.mo50348t()) / 1000.0f;
            this.f43227I0 = f;
            this.f43231K0 = true;
            this.f43247S0.mo49936f(this.f43223G0, f, f2, this.f43256a.mo50299J(), this.f43256a.mo50300K(), this.f43256a.mo50298I(), this.f43256a.mo50301L(), this.f43256a.mo50297H());
            int i = this.f43266f;
            this.f43227I0 = f;
            this.f43266f = i;
            this.f43258b = this.f43247S0;
            this.f43229J0 = false;
            this.f43292z = getNanoTime();
            invalidate();
        }
    }

    /* renamed from: N0 */
    public void mo49973N0() {
        mo49980T(1.0f);
        this.f43216B1 = null;
    }

    /* renamed from: O0 */
    public void mo49974O0(Runnable runnable) {
        mo49980T(1.0f);
        this.f43216B1 = runnable;
    }

    /* renamed from: P0 */
    public void mo49975P0() {
        mo49980T(0.0f);
    }

    /* renamed from: Q0 */
    public void mo49976Q0(int i) {
        if (!isAttachedToWindow()) {
            if (this.f43215A1 == null) {
                this.f43215A1 = new C16872k();
            }
            this.f43215A1.mo50106d(i);
            return;
        }
        mo49979S0(i, -1, -1);
    }

    /* renamed from: R0 */
    public void mo49977R0(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f43215A1 == null) {
                this.f43215A1 = new C16872k();
            }
            this.f43215A1.mo50106d(i);
            return;
        }
        mo49981T0(i, -1, -1, i2);
    }

    /* renamed from: S */
    public void mo49978S(C16873l lVar) {
        if (this.f43272j1 == null) {
            this.f43272j1 = new CopyOnWriteArrayList<>();
        }
        this.f43272j1.add(lVar);
    }

    /* renamed from: S0 */
    public void mo49979S0(int i, int i2, int i3) {
        mo49981T0(i, i2, i3, -1);
    }

    /* renamed from: T */
    public void mo49980T(float f) {
        C16900s sVar = this.f43256a;
        if (sVar != null) {
            float f2 = this.f43223G0;
            float f3 = this.f43221F0;
            if (f2 != f3 && this.f43229J0) {
                this.f43223G0 = f3;
            }
            float f4 = this.f43223G0;
            if (f4 != f) {
                this.f43245R0 = false;
                this.f43227I0 = f;
                this.f43219E0 = ((float) sVar.mo50348t()) / 1000.0f;
                setProgress(this.f43227I0);
                this.f43258b = null;
                this.f43260c = this.f43256a.mo50353x();
                this.f43229J0 = false;
                this.f43292z = getNanoTime();
                this.f43231K0 = true;
                this.f43221F0 = f4;
                this.f43223G0 = f4;
                invalidate();
            }
        }
    }

    /* renamed from: T0 */
    public void mo49981T0(int i, int i2, int i3, int i4) {
        C16960g gVar;
        int a;
        C16900s sVar = this.f43256a;
        if (!(sVar == null || (gVar = sVar.f43803b) == null || (a = gVar.mo50990a(this.f43266f, i, (float) i2, (float) i3)) == -1)) {
            i = a;
        }
        int i5 = this.f43266f;
        if (i5 != i) {
            if (this.f43264e == i) {
                mo49980T(0.0f);
                if (i4 > 0) {
                    this.f43219E0 = ((float) i4) / 1000.0f;
                }
            } else if (this.f43268g == i) {
                mo49980T(1.0f);
                if (i4 > 0) {
                    this.f43219E0 = ((float) i4) / 1000.0f;
                }
            } else {
                this.f43268g = i;
                if (i5 != -1) {
                    setTransition(i5, i);
                    mo49980T(1.0f);
                    this.f43223G0 = 0.0f;
                    mo49973N0();
                    if (i4 > 0) {
                        this.f43219E0 = ((float) i4) / 1000.0f;
                        return;
                    }
                    return;
                }
                this.f43245R0 = false;
                this.f43227I0 = 1.0f;
                this.f43221F0 = 0.0f;
                this.f43223G0 = 0.0f;
                this.f43225H0 = getNanoTime();
                this.f43292z = getNanoTime();
                this.f43229J0 = false;
                this.f43258b = null;
                if (i4 == -1) {
                    this.f43219E0 = ((float) this.f43256a.mo50348t()) / 1000.0f;
                }
                this.f43264e = -1;
                this.f43256a.mo50338n0(-1, this.f43268g);
                SparseArray sparseArray = new SparseArray();
                if (i4 == 0) {
                    this.f43219E0 = ((float) this.f43256a.mo50348t()) / 1000.0f;
                } else if (i4 > 0) {
                    this.f43219E0 = ((float) i4) / 1000.0f;
                }
                int childCount = getChildCount();
                this.f43290y.clear();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    this.f43290y.put(childAt, new C16895o(childAt));
                    sparseArray.put(childAt.getId(), this.f43290y.get(childAt));
                }
                this.f43231K0 = true;
                this.f43238N1.mo50088h(this.mLayoutWidget, (C16934c) null, this.f43256a.mo50339o(i));
                mo49965F0();
                this.f43238N1.mo50081a();
                mo49992a0();
                int width = getWidth();
                int height = getHeight();
                if (this.f43271i1 != null) {
                    for (int i7 = 0; i7 < childCount; i7++) {
                        C16895o oVar = this.f43290y.get(getChildAt(i7));
                        if (oVar != null) {
                            this.f43256a.mo50355z(oVar);
                        }
                    }
                    Iterator<MotionHelper> it = this.f43271i1.iterator();
                    while (it.hasNext()) {
                        it.next().mo49927c(this, this.f43290y);
                    }
                    for (int i8 = 0; i8 < childCount; i8++) {
                        C16895o oVar2 = this.f43290y.get(getChildAt(i8));
                        if (oVar2 != null) {
                            oVar2.mo50240a0(width, height, this.f43219E0, getNanoTime());
                        }
                    }
                } else {
                    for (int i9 = 0; i9 < childCount; i9++) {
                        C16895o oVar3 = this.f43290y.get(getChildAt(i9));
                        if (oVar3 != null) {
                            this.f43256a.mo50355z(oVar3);
                            oVar3.mo50240a0(width, height, this.f43219E0, getNanoTime());
                        }
                    }
                }
                float M = this.f43256a.mo50302M();
                if (M != 0.0f) {
                    float f = Float.MAX_VALUE;
                    float f2 = -3.4028235E38f;
                    for (int i10 = 0; i10 < childCount; i10++) {
                        C16895o oVar4 = this.f43290y.get(getChildAt(i10));
                        float u = oVar4.mo50262u() + oVar4.mo50260t();
                        f = Math.min(f, u);
                        f2 = Math.max(f2, u);
                    }
                    for (int i11 = 0; i11 < childCount; i11++) {
                        C16895o oVar5 = this.f43290y.get(getChildAt(i11));
                        float t = oVar5.mo50260t();
                        float u2 = oVar5.mo50262u();
                        oVar5.f43729o = 1.0f / (1.0f - M);
                        oVar5.f43728n = M - ((((t + u2) - f) * M) / (f2 - f));
                    }
                }
                this.f43221F0 = 0.0f;
                this.f43223G0 = 0.0f;
                this.f43231K0 = true;
                invalidate();
            }
        }
    }

    /* renamed from: U */
    public boolean mo49982U(int i, C16895o oVar) {
        C16900s sVar = this.f43256a;
        if (sVar != null) {
            return sVar.mo50325h(i, oVar);
        }
        return false;
    }

    /* renamed from: U0 */
    public void mo49983U0() {
        this.f43238N1.mo50088h(this.mLayoutWidget, this.f43256a.mo50339o(this.f43264e), this.f43256a.mo50339o(this.f43268g));
        mo49965F0();
    }

    /* renamed from: V */
    public final boolean mo49984V(View view, MotionEvent motionEvent, float f, float f2) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f, f2);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f, -f2);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f, f2);
        if (this.f43246R1 == null) {
            this.f43246R1 = new Matrix();
        }
        matrix.invert(this.f43246R1);
        obtain.transform(this.f43246R1);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    /* renamed from: V0 */
    public void mo49985V0(int i, C16934c cVar) {
        C16900s sVar = this.f43256a;
        if (sVar != null) {
            sVar.mo50330j0(i, cVar);
        }
        mo49983U0();
        if (this.f43266f == i) {
            cVar.mo50900r(this);
        }
    }

    /* renamed from: W */
    public final void mo49986W() {
        C16900s sVar = this.f43256a;
        if (sVar != null) {
            int N = sVar.mo50303N();
            C16900s sVar2 = this.f43256a;
            mo49988X(N, sVar2.mo50339o(sVar2.mo50303N()));
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            Iterator<C16900s.C16902b> it = this.f43256a.mo50346s().iterator();
            while (it.hasNext()) {
                C16900s.C16902b next = it.next();
                C16900s.C16902b bVar = this.f43256a.f43804c;
                mo49990Y(next);
                int I = next.mo50365I();
                int B = next.mo50358B();
                String i = C16878c.m77586i(getContext(), I);
                String i2 = C16878c.m77586i(getContext(), B);
                if (sparseIntArray.get(I) == B) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CHECK: two transitions with the same start and end ");
                    sb.append(i);
                    sb.append("->");
                    sb.append(i2);
                }
                if (sparseIntArray2.get(B) == I) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CHECK: you can't have reverse transitions");
                    sb2.append(i);
                    sb2.append("->");
                    sb2.append(i2);
                }
                sparseIntArray.put(I, B);
                sparseIntArray2.put(B, I);
                if (this.f43256a.mo50339o(I) == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(" no such constraintSetStart ");
                    sb3.append(i);
                }
                if (this.f43256a.mo50339o(B) == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(" no such constraintSetEnd ");
                    sb4.append(i);
                }
            }
        }
    }

    /* renamed from: W0 */
    public void mo49987W0(int i, C16934c cVar, int i2) {
        if (this.f43256a != null && this.f43266f == i) {
            int i3 = C16944e.C16951g.view_transition;
            mo49985V0(i3, mo50021n0(i));
            setState(i3, -1, -1);
            mo49985V0(i, cVar);
            C16900s.C16902b bVar = new C16900s.C16902b(-1, this.f43256a, i3, i);
            bVar.mo50371O(i2);
            setTransition(bVar);
            mo49973N0();
        }
    }

    /* renamed from: X */
    public final void mo49988X(int i, C16934c cVar) {
        String i2 = C16878c.m77586i(getContext(), i);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            if (id == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("CHECK: ");
                sb.append(i2);
                sb.append(" ALL VIEWS SHOULD HAVE ID's ");
                sb.append(childAt.getClass().getName());
                sb.append(" does not!");
            }
            if (cVar.mo50882k0(id) == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CHECK: ");
                sb2.append(i2);
                sb2.append(" NO CONSTRAINTS for ");
                sb2.append(C16878c.m77588k(childAt));
            }
        }
        int[] o0 = cVar.mo50893o0();
        for (int i4 = 0; i4 < o0.length; i4++) {
            int i5 = o0[i4];
            String i6 = C16878c.m77586i(getContext(), i5);
            if (findViewById(o0[i4]) == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("CHECK: ");
                sb3.append(i2);
                sb3.append(" NO View matches id ");
                sb3.append(i6);
            }
            if (cVar.mo50890n0(i5) == -1) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("CHECK: ");
                sb4.append(i2);
                sb4.append("(");
                sb4.append(i6);
                sb4.append(") no LAYOUT_HEIGHT");
            }
            if (cVar.mo50910u0(i5) == -1) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("CHECK: ");
                sb5.append(i2);
                sb5.append("(");
                sb5.append(i6);
                sb5.append(") no LAYOUT_HEIGHT");
            }
        }
    }

    /* renamed from: X0 */
    public void mo49989X0(int i, View... viewArr) {
        C16900s sVar = this.f43256a;
        if (sVar != null) {
            sVar.mo50349t0(i, viewArr);
        }
    }

    /* renamed from: Y */
    public final void mo49990Y(C16900s.C16902b bVar) {
        bVar.mo50365I();
        bVar.mo50358B();
    }

    /* renamed from: Z */
    public C16934c mo49991Z(int i) {
        C16900s sVar = this.f43256a;
        if (sVar == null) {
            return null;
        }
        C16934c o = sVar.mo50339o(i);
        C16934c cVar = new C16934c();
        cVar.mo50826I(o);
        return cVar;
    }

    /* renamed from: a0 */
    public final void mo49992a0() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C16895o oVar = this.f43290y.get(childAt);
            if (oVar != null) {
                oVar.mo50234V(childAt);
            }
        }
    }

    @SuppressLint({"LogConditional"})
    /* renamed from: b0 */
    public final void mo49993b0() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            sb.append(C16878c.m77584g());
            sb.append(" ");
            sb.append(C16878c.m77588k(this));
            sb.append(" ");
            sb.append(C16878c.m77586i(getContext(), this.f43266f));
            sb.append(" ");
            sb.append(C16878c.m77588k(childAt));
            sb.append(childAt.getLeft());
            sb.append(" ");
            sb.append(childAt.getTop());
        }
    }

    /* renamed from: c0 */
    public void mo49994c0(boolean z) {
        C16900s sVar = this.f43256a;
        if (sVar != null) {
            sVar.mo50331k(z);
        }
    }

    /* renamed from: d0 */
    public void mo49995d0(int i, boolean z) {
        C16900s.C16902b r0 = mo50034r0(i);
        if (z) {
            r0.mo50373Q(true);
            return;
        }
        C16900s sVar = this.f43256a;
        if (r0 == sVar.f43804c) {
            Iterator<C16900s.C16902b> it = sVar.mo50306Q(this.f43266f).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C16900s.C16902b next = it.next();
                if (next.mo50367K()) {
                    this.f43256a.f43804c = next;
                    break;
                }
            }
        }
        r0.mo50373Q(false);
    }

    public void dispatchDraw(Canvas canvas) {
        String str;
        C16875a0 a0Var;
        ArrayList<MotionHelper> arrayList = this.f43271i1;
        if (arrayList != null) {
            Iterator<MotionHelper> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo49951d(canvas);
            }
        }
        mo49999g0(false);
        C16900s sVar = this.f43256a;
        if (!(sVar == null || (a0Var = sVar.f43820s) == null)) {
            a0Var.mo50113d();
        }
        super.dispatchDraw(canvas);
        if (this.f43256a != null) {
            if ((this.f43241P0 & 1) == 1 && !isInEditMode()) {
                this.f43273k1++;
                long nanoTime = getNanoTime();
                long j = this.f43274l1;
                if (j != -1) {
                    long j2 = nanoTime - j;
                    if (j2 > 200000000) {
                        this.f43275m1 = ((float) ((int) ((((float) this.f43273k1) / (((float) j2) * 1.0E-9f)) * 100.0f))) / 100.0f;
                        this.f43273k1 = 0;
                        this.f43274l1 = nanoTime;
                    }
                } else {
                    this.f43274l1 = nanoTime;
                }
                Paint paint = new Paint();
                paint.setTextSize(42.0f);
                StringBuilder sb = new StringBuilder();
                sb.append(this.f43275m1 + " fps " + C16878c.m77589l(this, this.f43264e) + " -> ");
                sb.append(C16878c.m77589l(this, this.f43268g));
                sb.append(" (progress: ");
                sb.append(((float) ((int) (getProgress() * 1000.0f))) / 10.0f);
                sb.append(" ) state=");
                int i = this.f43266f;
                if (i == -1) {
                    str = "undefined";
                } else {
                    str = C16878c.m77589l(this, i);
                }
                sb.append(str);
                String sb2 = sb.toString();
                paint.setColor(-16777216);
                canvas.drawText(sb2, 11.0f, (float) (getHeight() - 29), paint);
                paint.setColor(-7864184);
                canvas.drawText(sb2, 10.0f, (float) (getHeight() - 30), paint);
            }
            if (this.f43241P0 > 1) {
                if (this.f43243Q0 == null) {
                    this.f43243Q0 = new C16868g();
                }
                this.f43243Q0.mo50068a(canvas, this.f43290y, this.f43256a.mo50348t(), this.f43241P0);
            }
            ArrayList<MotionHelper> arrayList2 = this.f43271i1;
            if (arrayList2 != null) {
                Iterator<MotionHelper> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().mo49952e(canvas);
                }
            }
        }
    }

    /* renamed from: e0 */
    public void mo49997e0(int i, boolean z) {
        C16900s sVar = this.f43256a;
        if (sVar != null) {
            sVar.mo50333l(i, z);
        }
    }

    /* renamed from: f0 */
    public void mo49998f0(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C16895o oVar = this.f43290y.get(getChildAt(i));
            if (oVar != null) {
                oVar.mo50249i(z);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x020b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x016f  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo49999g0(boolean r23) {
        /*
            r22 = this;
            r0 = r22
            long r1 = r0.f43225H0
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0010
            long r1 = r22.getNanoTime()
            r0.f43225H0 = r1
        L_0x0010:
            float r1 = r0.f43223G0
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r4 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 <= 0) goto L_0x0020
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0020
            r0.f43266f = r4
        L_0x0020:
            boolean r3 = r0.f43267f1
            r6 = 1
            r7 = 0
            if (r3 != 0) goto L_0x0032
            boolean r3 = r0.f43231K0
            if (r3 == 0) goto L_0x023f
            if (r23 != 0) goto L_0x0032
            float r3 = r0.f43227I0
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x023f
        L_0x0032:
            float r3 = r0.f43227I0
            float r3 = r3 - r1
            float r1 = java.lang.Math.signum(r3)
            long r8 = r22.getNanoTime()
            android.view.animation.Interpolator r3 = r0.f43258b
            boolean r10 = r3 instanceof androidx.constraintlayout.motion.widget.C16898q
            r11 = 814313567(0x3089705f, float:1.0E-9)
            if (r10 != 0) goto L_0x0051
            long r12 = r0.f43225H0
            long r12 = r8 - r12
            float r10 = (float) r12
            float r10 = r10 * r1
            float r10 = r10 * r11
            float r12 = r0.f43219E0
            float r10 = r10 / r12
            goto L_0x0052
        L_0x0051:
            r10 = r2
        L_0x0052:
            float r12 = r0.f43223G0
            float r12 = r12 + r10
            boolean r13 = r0.f43229J0
            if (r13 == 0) goto L_0x005b
            float r12 = r0.f43227I0
        L_0x005b:
            int r13 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x0065
            float r14 = r0.f43227I0
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x006f
        L_0x0065:
            int r14 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r14 > 0) goto L_0x0075
            float r14 = r0.f43227I0
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x0075
        L_0x006f:
            float r12 = r0.f43227I0
            r0.f43231K0 = r7
            r14 = r6
            goto L_0x0076
        L_0x0075:
            r14 = r7
        L_0x0076:
            r0.f43223G0 = r12
            r0.f43221F0 = r12
            r0.f43225H0 = r8
            r15 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r3 == 0) goto L_0x0103
            if (r14 != 0) goto L_0x0103
            boolean r14 = r0.f43245R0
            if (r14 == 0) goto L_0x00e4
            long r4 = r0.f43292z
            long r4 = r8 - r4
            float r4 = (float) r4
            float r4 = r4 * r11
            float r3 = r3.getInterpolation(r4)
            android.view.animation.Interpolator r4 = r0.f43258b
            androidx.constraintlayout.motion.utils.b r5 = r0.f43247S0
            r10 = 2
            if (r4 != r5) goto L_0x00a2
            boolean r4 = r5.mo49935e()
            if (r4 == 0) goto L_0x00a0
            r4 = r10
            goto L_0x00a3
        L_0x00a0:
            r4 = r6
            goto L_0x00a3
        L_0x00a2:
            r4 = r7
        L_0x00a3:
            r0.f43223G0 = r3
            r0.f43225H0 = r8
            android.view.animation.Interpolator r5 = r0.f43258b
            boolean r8 = r5 instanceof androidx.constraintlayout.motion.widget.C16898q
            if (r8 == 0) goto L_0x00e2
            androidx.constraintlayout.motion.widget.q r5 = (androidx.constraintlayout.motion.widget.C16898q) r5
            float r5 = r5.mo49931a()
            r0.f43262d = r5
            float r8 = java.lang.Math.abs(r5)
            float r9 = r0.f43219E0
            float r8 = r8 * r9
            int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r8 > 0) goto L_0x00c4
            if (r4 != r10) goto L_0x00c4
            r0.f43231K0 = r7
        L_0x00c4:
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d4
            r8 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x00d4
            r0.f43223G0 = r8
            r0.f43231K0 = r7
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x00d4:
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x00e2
            int r5 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r5 > 0) goto L_0x00e2
            r0.f43223G0 = r2
            r0.f43231K0 = r7
            r12 = r2
            goto L_0x0106
        L_0x00e2:
            r12 = r3
            goto L_0x0106
        L_0x00e4:
            float r3 = r3.getInterpolation(r12)
            android.view.animation.Interpolator r4 = r0.f43258b
            boolean r5 = r4 instanceof androidx.constraintlayout.motion.widget.C16898q
            if (r5 == 0) goto L_0x00f7
            androidx.constraintlayout.motion.widget.q r4 = (androidx.constraintlayout.motion.widget.C16898q) r4
            float r4 = r4.mo49931a()
            r0.f43262d = r4
            goto L_0x0101
        L_0x00f7:
            float r12 = r12 + r10
            float r4 = r4.getInterpolation(r12)
            float r4 = r4 - r3
            float r4 = r4 * r1
            float r4 = r4 / r10
            r0.f43262d = r4
        L_0x0101:
            r12 = r3
            goto L_0x0105
        L_0x0103:
            r0.f43262d = r10
        L_0x0105:
            r4 = r7
        L_0x0106:
            float r3 = r0.f43262d
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r3 <= 0) goto L_0x0115
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r0.setState(r3)
        L_0x0115:
            if (r4 == r6) goto L_0x013e
            if (r13 <= 0) goto L_0x011f
            float r3 = r0.f43227I0
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0129
        L_0x011f:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x012d
            float r3 = r0.f43227I0
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x012d
        L_0x0129:
            float r12 = r0.f43227I0
            r0.f43231K0 = r7
        L_0x012d:
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x0137
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x013e
        L_0x0137:
            r0.f43231K0 = r7
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
        L_0x013e:
            int r3 = r22.getChildCount()
            r0.f43267f1 = r7
            long r4 = r22.getNanoTime()
            r0.f43289x1 = r12
            android.view.animation.Interpolator r8 = r0.f43260c
            if (r8 != 0) goto L_0x0150
            r8 = r12
            goto L_0x0154
        L_0x0150:
            float r8 = r8.getInterpolation(r12)
        L_0x0154:
            android.view.animation.Interpolator r9 = r0.f43260c
            if (r9 == 0) goto L_0x016c
            float r10 = r0.f43219E0
            float r10 = r1 / r10
            float r10 = r10 + r12
            float r9 = r9.getInterpolation(r10)
            r0.f43262d = r9
            android.view.animation.Interpolator r10 = r0.f43260c
            float r10 = r10.getInterpolation(r12)
            float r9 = r9 - r10
            r0.f43262d = r9
        L_0x016c:
            r9 = r7
        L_0x016d:
            if (r9 >= r3) goto L_0x0195
            android.view.View r10 = r0.getChildAt(r9)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.o> r11 = r0.f43290y
            java.lang.Object r11 = r11.get(r10)
            r16 = r11
            androidx.constraintlayout.motion.widget.o r16 = (androidx.constraintlayout.motion.widget.C16895o) r16
            if (r16 == 0) goto L_0x0192
            boolean r11 = r0.f43267f1
            androidx.constraintlayout.core.motion.utils.g r15 = r0.f43291y1
            r17 = r10
            r18 = r8
            r19 = r4
            r21 = r15
            boolean r10 = r16.mo50224L(r17, r18, r19, r21)
            r10 = r10 | r11
            r0.f43267f1 = r10
        L_0x0192:
            int r9 = r9 + 1
            goto L_0x016d
        L_0x0195:
            if (r13 <= 0) goto L_0x019d
            float r3 = r0.f43227I0
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x01a7
        L_0x019d:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x01a9
            float r3 = r0.f43227I0
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x01a9
        L_0x01a7:
            r3 = r6
            goto L_0x01aa
        L_0x01a9:
            r3 = r7
        L_0x01aa:
            boolean r4 = r0.f43267f1
            if (r4 != 0) goto L_0x01b9
            boolean r4 = r0.f43231K0
            if (r4 != 0) goto L_0x01b9
            if (r3 == 0) goto L_0x01b9
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r4 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r4)
        L_0x01b9:
            boolean r4 = r0.f43279q1
            if (r4 == 0) goto L_0x01c0
            r22.requestLayout()
        L_0x01c0:
            boolean r4 = r0.f43267f1
            r3 = r3 ^ r6
            r3 = r3 | r4
            r0.f43267f1 = r3
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x01e4
            int r3 = r0.f43264e
            r4 = -1
            if (r3 == r4) goto L_0x01e4
            int r4 = r0.f43266f
            if (r4 == r3) goto L_0x01e4
            r0.f43266f = r3
            androidx.constraintlayout.motion.widget.s r4 = r0.f43256a
            androidx.constraintlayout.widget.c r3 = r4.mo50339o(r3)
            r3.mo50895p(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
            r7 = r6
        L_0x01e4:
            double r3 = (double) r12
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0202
            int r3 = r0.f43266f
            int r4 = r0.f43268g
            if (r3 == r4) goto L_0x0202
            r0.f43266f = r4
            androidx.constraintlayout.motion.widget.s r3 = r0.f43256a
            androidx.constraintlayout.widget.c r3 = r3.mo50339o(r4)
            r3.mo50895p(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
            r7 = r6
        L_0x0202:
            boolean r3 = r0.f43267f1
            if (r3 != 0) goto L_0x0221
            boolean r3 = r0.f43231K0
            if (r3 == 0) goto L_0x020b
            goto L_0x0221
        L_0x020b:
            if (r13 <= 0) goto L_0x0213
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x021b
        L_0x0213:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0224
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0224
        L_0x021b:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
            goto L_0x0224
        L_0x0221:
            r22.invalidate()
        L_0x0224:
            boolean r3 = r0.f43267f1
            if (r3 != 0) goto L_0x023f
            boolean r3 = r0.f43231K0
            if (r3 != 0) goto L_0x023f
            if (r13 <= 0) goto L_0x0234
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x023c
        L_0x0234:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x023f
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x023f
        L_0x023c:
            r22.mo49962C0()
        L_0x023f:
            float r1 = r0.f43223G0
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0253
            int r1 = r0.f43266f
            int r2 = r0.f43268g
            if (r1 == r2) goto L_0x024e
            goto L_0x024f
        L_0x024e:
            r6 = r7
        L_0x024f:
            r0.f43266f = r2
        L_0x0251:
            r7 = r6
            goto L_0x0262
        L_0x0253:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0262
            int r1 = r0.f43266f
            int r2 = r0.f43264e
            if (r1 == r2) goto L_0x025e
            goto L_0x025f
        L_0x025e:
            r6 = r7
        L_0x025f:
            r0.f43266f = r2
            goto L_0x0251
        L_0x0262:
            boolean r1 = r0.f43240O1
            r1 = r1 | r7
            r0.f43240O1 = r1
            if (r7 == 0) goto L_0x0270
            boolean r1 = r0.f43293z1
            if (r1 != 0) goto L_0x0270
            r22.requestLayout()
        L_0x0270:
            float r1 = r0.f43223G0
            r0.f43221F0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo49999g0(boolean):void");
    }

    public int[] getConstraintSetIds() {
        C16900s sVar = this.f43256a;
        if (sVar == null) {
            return null;
        }
        return sVar.mo50344r();
    }

    public int getCurrentState() {
        return this.f43266f;
    }

    public ArrayList<C16900s.C16902b> getDefinedTransitions() {
        C16900s sVar = this.f43256a;
        if (sVar == null) {
            return null;
        }
        return sVar.mo50346s();
    }

    public C16879d getDesignTool() {
        if (this.f43250U0 == null) {
            this.f43250U0 = new C16879d(this);
        }
        return this.f43250U0;
    }

    public int getEndState() {
        return this.f43268g;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f43223G0;
    }

    public C16900s getScene() {
        return this.f43256a;
    }

    public int getStartState() {
        return this.f43264e;
    }

    public float getTargetPosition() {
        return this.f43227I0;
    }

    public Bundle getTransitionState() {
        if (this.f43215A1 == null) {
            this.f43215A1 = new C16872k();
        }
        this.f43215A1.mo50105c();
        return this.f43215A1.mo50104b();
    }

    public long getTransitionTimeMs() {
        C16900s sVar = this.f43256a;
        if (sVar != null) {
            this.f43219E0 = ((float) sVar.mo50348t()) / 1000.0f;
        }
        return (long) (this.f43219E0 * 1000.0f);
    }

    public float getVelocity() {
        return this.f43262d;
    }

    /* renamed from: h0 */
    public final void mo50013h0() {
        float f;
        boolean z;
        float signum = Math.signum(this.f43227I0 - this.f43223G0);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f43258b;
        if (!(interpolator instanceof C16816b)) {
            f = ((((float) (nanoTime - this.f43225H0)) * signum) * 1.0E-9f) / this.f43219E0;
        } else {
            f = 0.0f;
        }
        float f2 = this.f43223G0 + f;
        if (this.f43229J0) {
            f2 = this.f43227I0;
        }
        int i = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i <= 0 || f2 < this.f43227I0) && (signum > 0.0f || f2 > this.f43227I0)) {
            z = false;
        } else {
            f2 = this.f43227I0;
            z = true;
        }
        if (interpolator != null && !z) {
            if (this.f43245R0) {
                f2 = interpolator.getInterpolation(((float) (nanoTime - this.f43292z)) * 1.0E-9f);
            } else {
                f2 = interpolator.getInterpolation(f2);
            }
        }
        if ((i > 0 && f2 >= this.f43227I0) || (signum <= 0.0f && f2 <= this.f43227I0)) {
            f2 = this.f43227I0;
        }
        this.f43289x1 = f2;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.f43260c;
        if (interpolator2 != null) {
            f2 = interpolator2.getInterpolation(f2);
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C16895o oVar = this.f43290y.get(childAt);
            if (oVar != null) {
                oVar.mo50224L(childAt, f2, nanoTime2, this.f43291y1);
            }
        }
        if (this.f43279q1) {
            requestLayout();
        }
    }

    /* renamed from: i0 */
    public final void mo50014i0() {
        CopyOnWriteArrayList<C16873l> copyOnWriteArrayList;
        if ((this.f43235M0 != null || ((copyOnWriteArrayList = this.f43272j1) != null && !copyOnWriteArrayList.isEmpty())) && this.f43277o1 != this.f43221F0) {
            if (this.f43276n1 != -1) {
                C16873l lVar = this.f43235M0;
                if (lVar != null) {
                    lVar.mo49953g(this, this.f43264e, this.f43268g);
                }
                CopyOnWriteArrayList<C16873l> copyOnWriteArrayList2 = this.f43272j1;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<C16873l> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().mo49953g(this, this.f43264e, this.f43268g);
                    }
                }
                this.f43278p1 = true;
            }
            this.f43276n1 = -1;
            float f = this.f43221F0;
            this.f43277o1 = f;
            C16873l lVar2 = this.f43235M0;
            if (lVar2 != null) {
                lVar2.mo49854a(this, this.f43264e, this.f43268g, f);
            }
            CopyOnWriteArrayList<C16873l> copyOnWriteArrayList3 = this.f43272j1;
            if (copyOnWriteArrayList3 != null) {
                Iterator<C16873l> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().mo49854a(this, this.f43264e, this.f43268g, this.f43221F0);
                }
            }
            this.f43278p1 = true;
        }
    }

    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    /* renamed from: j0 */
    public void mo50016j0() {
        int i;
        CopyOnWriteArrayList<C16873l> copyOnWriteArrayList;
        if ((this.f43235M0 != null || ((copyOnWriteArrayList = this.f43272j1) != null && !copyOnWriteArrayList.isEmpty())) && this.f43276n1 == -1) {
            this.f43276n1 = this.f43266f;
            if (!this.f43248S1.isEmpty()) {
                ArrayList<Integer> arrayList = this.f43248S1;
                i = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i = -1;
            }
            int i2 = this.f43266f;
            if (!(i == i2 || i2 == -1)) {
                this.f43248S1.add(Integer.valueOf(i2));
            }
        }
        mo49963D0();
        Runnable runnable = this.f43216B1;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f43217C1;
        if (iArr != null && this.f43218D1 > 0) {
            mo49976Q0(iArr[0]);
            int[] iArr2 = this.f43217C1;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.f43218D1--;
        }
    }

    /* renamed from: k0 */
    public final void mo50017k0(MotionLayout motionLayout, int i, int i2) {
        C16873l lVar = this.f43235M0;
        if (lVar != null) {
            lVar.mo49953g(this, i, i2);
        }
        CopyOnWriteArrayList<C16873l> copyOnWriteArrayList = this.f43272j1;
        if (copyOnWriteArrayList != null) {
            Iterator<C16873l> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().mo49953g(motionLayout, i, i2);
            }
        }
    }

    /* renamed from: l0 */
    public void mo50018l0(int i, boolean z, float f) {
        C16873l lVar = this.f43235M0;
        if (lVar != null) {
            lVar.mo49955h(this, i, z, f);
        }
        CopyOnWriteArrayList<C16873l> copyOnWriteArrayList = this.f43272j1;
        if (copyOnWriteArrayList != null) {
            Iterator<C16873l> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().mo49955h(this, i, z, f);
            }
        }
    }

    public void loadLayoutDescription(int i) {
        int i2;
        C16900s.C16902b bVar;
        if (i != 0) {
            try {
                C16900s sVar = new C16900s(getContext(), this, i);
                this.f43256a = sVar;
                if (this.f43266f == -1) {
                    this.f43266f = sVar.mo50303N();
                    this.f43264e = this.f43256a.mo50303N();
                    this.f43268g = this.f43256a.mo50350u();
                }
                if (isAttachedToWindow()) {
                    Display display = getDisplay();
                    if (display == null) {
                        i2 = 0;
                    } else {
                        i2 = display.getRotation();
                    }
                    this.f43230J1 = i2;
                    C16900s sVar2 = this.f43256a;
                    if (sVar2 != null) {
                        C16934c o = sVar2.mo50339o(this.f43266f);
                        this.f43256a.mo50326h0(this);
                        ArrayList<MotionHelper> arrayList = this.f43271i1;
                        if (arrayList != null) {
                            Iterator<MotionHelper> it = arrayList.iterator();
                            while (it.hasNext()) {
                                it.next().mo49950b(this);
                            }
                        }
                        if (o != null) {
                            o.mo50900r(this);
                        }
                        this.f43264e = this.f43266f;
                    }
                    mo49962C0();
                    C16872k kVar = this.f43215A1;
                    if (kVar == null) {
                        C16900s sVar3 = this.f43256a;
                        if (sVar3 != null && (bVar = sVar3.f43804c) != null && bVar.mo50387z() == 4) {
                            mo49973N0();
                            setState(TransitionState.SETUP);
                            setState(TransitionState.MOVING);
                        }
                    } else if (this.f43234L1) {
                        post(new C16862a());
                    } else {
                        kVar.mo50103a();
                    }
                } else {
                    this.f43256a = null;
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e);
            } catch (Exception e2) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e2);
            }
        } else {
            this.f43256a = null;
        }
    }

    /* renamed from: m */
    public void mo2389m(@C0359n0 View view, @C0359n0 View view2, int i, int i2) {
        this.f43263d1 = getNanoTime();
        this.f43265e1 = 0.0f;
        this.f43259b1 = 0.0f;
        this.f43261c1 = 0.0f;
    }

    /* renamed from: m0 */
    public void mo50020m0(int i, float f, float f2, float f3, float[] fArr) {
        String str;
        HashMap<View, C16895o> hashMap = this.f43290y;
        View viewById = getViewById(i);
        C16895o oVar = hashMap.get(viewById);
        if (oVar != null) {
            oVar.mo50256p(f, f2, f3, fArr);
            float y = viewById.getY();
            this.f43237N0 = f;
            this.f43239O0 = y;
            return;
        }
        if (viewById == null) {
            str = "" + i;
        } else {
            str = viewById.getContext().getResources().getResourceName(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("WARNING could not find view id ");
        sb.append(str);
    }

    /* renamed from: n */
    public void mo2390n(@C0359n0 View view, int i) {
        C16900s sVar = this.f43256a;
        if (sVar != null) {
            float f = this.f43265e1;
            if (f != 0.0f) {
                sVar.mo50320e0(this.f43259b1 / f, this.f43261c1 / f);
            }
        }
    }

    /* renamed from: n0 */
    public C16934c mo50021n0(int i) {
        C16900s sVar = this.f43256a;
        if (sVar == null) {
            return null;
        }
        return sVar.mo50339o(i);
    }

    /* renamed from: o */
    public void mo2391o(@C0359n0 View view, int i, int i2, @C0359n0 int[] iArr, int i3) {
        C16900s.C16902b bVar;
        C16906v J;
        int s;
        C16900s sVar = this.f43256a;
        if (sVar != null && (bVar = sVar.f43804c) != null && bVar.mo50367K()) {
            int i4 = -1;
            if (!bVar.mo50367K() || (J = bVar.mo50366J()) == null || (s = J.mo50456s()) == -1 || view.getId() == s) {
                if (sVar.mo50293D()) {
                    C16906v J2 = bVar.mo50366J();
                    if (!(J2 == null || (J2.mo50443f() & 4) == 0)) {
                        i4 = i2;
                    }
                    float f = this.f43221F0;
                    if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(i4)) {
                        return;
                    }
                }
                if (!(bVar.mo50366J() == null || (bVar.mo50366J().mo50443f() & 1) == 0)) {
                    float F = sVar.mo50295F((float) i, (float) i2);
                    float f2 = this.f43223G0;
                    if ((f2 <= 0.0f && F < 0.0f) || (f2 >= 1.0f && F > 0.0f)) {
                        view.setNestedScrollingEnabled(false);
                        view.post(new C16864c(this, view));
                        return;
                    }
                }
                float f3 = this.f43221F0;
                long nanoTime = getNanoTime();
                float f4 = (float) i;
                this.f43259b1 = f4;
                float f5 = (float) i2;
                this.f43261c1 = f5;
                this.f43265e1 = (float) (((double) (nanoTime - this.f43263d1)) * 1.0E-9d);
                this.f43263d1 = nanoTime;
                sVar.mo50319d0(f4, f5);
                if (f3 != this.f43221F0) {
                    iArr[0] = i;
                    iArr[1] = i2;
                }
                mo49999g0(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.f43257a1 = true;
                }
            }
        }
    }

    /* renamed from: o0 */
    public String mo50022o0(int i) {
        C16900s sVar = this.f43256a;
        if (sVar == null) {
            return null;
        }
        return sVar.mo50313X(i);
    }

    public void onAttachedToWindow() {
        C16900s.C16902b bVar;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f43230J1 = display.getRotation();
        }
        C16900s sVar = this.f43256a;
        if (!(sVar == null || (i = this.f43266f) == -1)) {
            C16934c o = sVar.mo50339o(i);
            this.f43256a.mo50326h0(this);
            ArrayList<MotionHelper> arrayList = this.f43271i1;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo49950b(this);
                }
            }
            if (o != null) {
                o.mo50900r(this);
            }
            this.f43264e = this.f43266f;
        }
        mo49962C0();
        C16872k kVar = this.f43215A1;
        if (kVar == null) {
            C16900s sVar2 = this.f43256a;
            if (sVar2 != null && (bVar = sVar2.f43804c) != null && bVar.mo50387z() == 4) {
                mo49973N0();
                setState(TransitionState.SETUP);
                setState(TransitionState.MOVING);
            }
        } else if (this.f43234L1) {
            post(new C16865d());
        } else {
            kVar.mo50103a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C16906v J;
        int s;
        RectF r;
        C16900s sVar = this.f43256a;
        if (sVar != null && this.f43288x) {
            C16875a0 a0Var = sVar.f43820s;
            if (a0Var != null) {
                a0Var.mo50121l(motionEvent);
            }
            C16900s.C16902b bVar = this.f43256a.f43804c;
            if (bVar != null && bVar.mo50367K() && (J = bVar.mo50366J()) != null && ((motionEvent.getAction() != 0 || (r = J.mo50455r(this, new RectF())) == null || r.contains(motionEvent.getX(), motionEvent.getY())) && (s = J.mo50456s()) != -1)) {
                View view = this.f43244Q1;
                if (view == null || view.getId() != s) {
                    this.f43244Q1 = findViewById(s);
                }
                View view2 = this.f43244Q1;
                if (view2 != null) {
                    this.f43242P1.set((float) view2.getLeft(), (float) this.f43244Q1.getTop(), (float) this.f43244Q1.getRight(), (float) this.f43244Q1.getBottom());
                    if (this.f43242P1.contains(motionEvent.getX(), motionEvent.getY()) && !mo50055t0((float) this.f43244Q1.getLeft(), (float) this.f43244Q1.getTop(), this.f43244Q1, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f43293z1 = true;
        try {
            if (this.f43256a == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (!(this.f43254Y0 == i5 && this.f43255Z0 == i6)) {
                mo49965F0();
                mo49999g0(true);
            }
            this.f43254Y0 = i5;
            this.f43255Z0 = i6;
            this.f43252W0 = i5;
            this.f43253X0 = i6;
            this.f43293z1 = false;
        } finally {
            this.f43293z1 = false;
        }
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        if (this.f43256a == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = false;
        if (this.f43284v == i && this.f43286w == i2) {
            z = false;
        } else {
            z = true;
        }
        if (this.f43240O1) {
            this.f43240O1 = false;
            mo49962C0();
            mo49963D0();
            z = true;
        }
        if (this.mDirtyHierarchy) {
            z = true;
        }
        this.f43284v = i;
        this.f43286w = i2;
        int N = this.f43256a.mo50303N();
        int u = this.f43256a.mo50350u();
        if ((z || this.f43238N1.mo50089i(N, u)) && this.f43264e != -1) {
            super.onMeasure(i, i2);
            this.f43238N1.mo50088h(this.mLayoutWidget, this.f43256a.mo50339o(N), this.f43256a.mo50339o(u));
            this.f43238N1.mo50091k();
            this.f43238N1.mo50092l(N, u);
        } else {
            if (z) {
                super.onMeasure(i, i2);
            }
            z2 = true;
        }
        if (this.f43279q1 || z2) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int m0 = this.mLayoutWidget.mo49569m0() + getPaddingLeft() + getPaddingRight();
            int D = this.mLayoutWidget.mo49456D() + paddingTop;
            int i3 = this.f43285v1;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                int i4 = this.f43280r1;
                m0 = (int) (((float) i4) + (this.f43289x1 * ((float) (this.f43282t1 - i4))));
                requestLayout();
            }
            int i5 = this.f43287w1;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                int i6 = this.f43281s1;
                D = (int) (((float) i6) + (this.f43289x1 * ((float) (this.f43283u1 - i6))));
                requestLayout();
            }
            setMeasuredDimension(m0, D);
        }
        mo50013h0();
    }

    public boolean onNestedFling(@C0359n0 View view, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(@C0359n0 View view, float f, float f2) {
        return false;
    }

    public void onRtlPropertiesChanged(int i) {
        C16900s sVar = this.f43256a;
        if (sVar != null) {
            sVar.mo50336m0(isRtl());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C16900s sVar = this.f43256a;
        if (sVar == null || !this.f43288x || !sVar.mo50345r0()) {
            return super.onTouchEvent(motionEvent);
        }
        C16900s.C16902b bVar = this.f43256a.f43804c;
        if (bVar != null && !bVar.mo50367K()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f43256a.mo50322f0(motionEvent, getCurrentState(), this);
        if (this.f43256a.f43804c.mo50368L(4)) {
            return this.f43256a.f43804c.mo50366J().mo50457t();
        }
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f43272j1 == null) {
                this.f43272j1 = new CopyOnWriteArrayList<>();
            }
            this.f43272j1.add(motionHelper);
            if (motionHelper.mo49956i()) {
                if (this.f43269g1 == null) {
                    this.f43269g1 = new ArrayList<>();
                }
                this.f43269g1.add(motionHelper);
            }
            if (motionHelper.mo49957j()) {
                if (this.f43270h1 == null) {
                    this.f43270h1 = new ArrayList<>();
                }
                this.f43270h1.add(motionHelper);
            }
            if (motionHelper.mo49928k()) {
                if (this.f43271i1 == null) {
                    this.f43271i1 = new ArrayList<>();
                }
                this.f43271i1.add(motionHelper);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f43269g1;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f43270h1;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    /* renamed from: p0 */
    public void mo50031p0(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        this.f43241P0 = i;
        invalidate();
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    /* renamed from: q */
    public void mo2407q(@C0359n0 View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!(!this.f43257a1 && i == 0 && i2 == 0)) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f43257a1 = false;
    }

    /* renamed from: q0 */
    public C16895o mo50033q0(int i) {
        return this.f43290y.get(findViewById(i));
    }

    /* renamed from: r */
    public void mo2408r(@C0359n0 View view, int i, int i2, int i3, int i4, int i5) {
    }

    /* renamed from: r0 */
    public C16900s.C16902b mo50034r0(int i) {
        return this.f43256a.mo50304O(i);
    }

    public void requestLayout() {
        C16900s sVar;
        C16900s.C16902b bVar;
        if (!this.f43279q1 && this.f43266f == -1 && (sVar = this.f43256a) != null && (bVar = sVar.f43804c) != null) {
            int E = bVar.mo50361E();
            if (E != 0) {
                if (E == 2) {
                    int childCount = getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        this.f43290y.get(getChildAt(i)).mo50228P();
                    }
                    return;
                }
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    /* renamed from: s */
    public boolean mo2409s(@C0359n0 View view, @C0359n0 View view2, int i, int i2) {
        C16900s.C16902b bVar;
        C16900s sVar = this.f43256a;
        if (sVar == null || (bVar = sVar.f43804c) == null || bVar.mo50366J() == null || (this.f43256a.f43804c.mo50366J().mo50443f() & 2) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: s0 */
    public void mo50036s0(View view, float f, float f2, float[] fArr, int i) {
        float f3;
        float f4 = this.f43262d;
        float f5 = this.f43223G0;
        if (this.f43258b != null) {
            float signum = Math.signum(this.f43227I0 - f5);
            float interpolation = this.f43258b.getInterpolation(this.f43223G0 + 1.0E-5f);
            f3 = this.f43258b.getInterpolation(this.f43223G0);
            f4 = (signum * ((interpolation - f3) / 1.0E-5f)) / this.f43219E0;
        } else {
            f3 = f5;
        }
        Interpolator interpolator = this.f43258b;
        if (interpolator instanceof C16898q) {
            f4 = ((C16898q) interpolator).mo49931a();
        }
        C16895o oVar = this.f43290y.get(view);
        if ((i & 1) == 0) {
            oVar.mo50215C(f3, view.getWidth(), view.getHeight(), f, f2, fArr);
        } else {
            oVar.mo50256p(f3, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * f4;
            fArr[1] = fArr[1] * f4;
        }
    }

    public void setDebugMode(int i) {
        this.f43241P0 = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.f43234L1 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.f43288x = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.f43256a != null) {
            setState(TransitionState.MOVING);
            Interpolator x = this.f43256a.mo50353x();
            if (x != null) {
                setProgress(x.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.f43270h1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f43270h1.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.f43269g1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f43269g1.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.f43215A1 == null) {
                this.f43215A1 = new C16872k();
            }
            this.f43215A1.mo50107e(f);
            this.f43215A1.mo50110h(f2);
            return;
        }
        setProgress(f);
        setState(TransitionState.MOVING);
        this.f43262d = f2;
        float f3 = 0.0f;
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i != 0) {
            if (i > 0) {
                f3 = 1.0f;
            }
            mo49980T(f3);
        } else if (f != 0.0f && f != 1.0f) {
            if (f > 0.5f) {
                f3 = 1.0f;
            }
            mo49980T(f3);
        }
    }

    public void setScene(C16900s sVar) {
        this.f43256a = sVar;
        sVar.mo50336m0(isRtl());
        mo49965F0();
    }

    public void setStartState(int i) {
        if (!isAttachedToWindow()) {
            if (this.f43215A1 == null) {
                this.f43215A1 = new C16872k();
            }
            this.f43215A1.mo50108f(i);
            this.f43215A1.mo50106d(i);
            return;
        }
        this.f43266f = i;
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState != transitionState2 || this.f43266f != -1) {
            TransitionState transitionState3 = this.f43236M1;
            this.f43236M1 = transitionState;
            TransitionState transitionState4 = TransitionState.MOVING;
            if (transitionState3 == transitionState4 && transitionState == transitionState4) {
                mo50014i0();
            }
            int i = C16866e.f43303a[transitionState3.ordinal()];
            if (i == 1 || i == 2) {
                if (transitionState == transitionState4) {
                    mo50014i0();
                }
                if (transitionState == transitionState2) {
                    mo50016j0();
                }
            } else if (i == 3 && transitionState == transitionState2) {
                mo50016j0();
            }
        }
    }

    public void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f43215A1 == null) {
                this.f43215A1 = new C16872k();
            }
            this.f43215A1.mo50108f(i);
            this.f43215A1.mo50106d(i2);
            return;
        }
        C16900s sVar = this.f43256a;
        if (sVar != null) {
            this.f43264e = i;
            this.f43268g = i2;
            sVar.mo50338n0(i, i2);
            this.f43238N1.mo50088h(this.mLayoutWidget, this.f43256a.mo50339o(i), this.f43256a.mo50339o(i2));
            mo49965F0();
            this.f43223G0 = 0.0f;
            mo49975P0();
        }
    }

    public void setTransitionDuration(int i) {
        C16900s sVar = this.f43256a;
        if (sVar != null) {
            sVar.mo50332k0(i);
        }
    }

    public void setTransitionListener(C16873l lVar) {
        this.f43235M0 = lVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f43215A1 == null) {
            this.f43215A1 = new C16872k();
        }
        this.f43215A1.mo50109g(bundle);
        if (isAttachedToWindow()) {
            this.f43215A1.mo50103a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo50055t0(float r8, float r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L_0x0036
            r0 = r10
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            int r2 = r2 - r1
        L_0x000d:
            if (r2 < 0) goto L_0x0036
            android.view.View r3 = r0.getChildAt(r2)
            int r4 = r3.getLeft()
            float r4 = (float) r4
            float r4 = r4 + r8
            int r5 = r10.getScrollX()
            float r5 = (float) r5
            float r4 = r4 - r5
            int r5 = r3.getTop()
            float r5 = (float) r5
            float r5 = r5 + r9
            int r6 = r10.getScrollY()
            float r6 = (float) r6
            float r5 = r5 - r6
            boolean r3 = r7.mo50055t0(r4, r5, r3, r11)
            if (r3 == 0) goto L_0x0033
            r0 = r1
            goto L_0x0037
        L_0x0033:
            int r2 = r2 + -1
            goto L_0x000d
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 != 0) goto L_0x0075
            android.graphics.RectF r2 = r7.f43242P1
            int r3 = r10.getRight()
            float r3 = (float) r3
            float r3 = r3 + r8
            int r4 = r10.getLeft()
            float r4 = (float) r4
            float r3 = r3 - r4
            int r4 = r10.getBottom()
            float r4 = (float) r4
            float r4 = r4 + r9
            int r5 = r10.getTop()
            float r5 = (float) r5
            float r4 = r4 - r5
            r2.set(r8, r9, r3, r4)
            int r2 = r11.getAction()
            if (r2 != 0) goto L_0x006c
            android.graphics.RectF r2 = r7.f43242P1
            float r3 = r11.getX()
            float r4 = r11.getY()
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L_0x0075
        L_0x006c:
            float r8 = -r8
            float r9 = -r9
            boolean r8 = r7.mo49984V(r10, r11, r8, r9)
            if (r8 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r1 = r0
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo50055t0(float, float, android.view.View, android.view.MotionEvent):boolean");
    }

    public String toString() {
        Context context = getContext();
        return C16878c.m77586i(context, this.f43264e) + "->" + C16878c.m77586i(context, this.f43268g) + " (pos:" + this.f43223G0 + " Dpos/Dt:" + this.f43262d;
    }

    /* renamed from: u0 */
    public final void mo50057u0(AttributeSet attributeSet) {
        C16900s sVar;
        int i;
        f43205d2 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16944e.C16957m.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == C16944e.C16957m.MotionLayout_layoutDescription) {
                    this.f43256a = new C16900s(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == C16944e.C16957m.MotionLayout_currentState) {
                    this.f43266f = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == C16944e.C16957m.MotionLayout_motionProgress) {
                    this.f43227I0 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f43231K0 = true;
                } else if (index == C16944e.C16957m.MotionLayout_applyMotionScene) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == C16944e.C16957m.MotionLayout_showPaths) {
                    if (this.f43241P0 == 0) {
                        if (obtainStyledAttributes.getBoolean(index, false)) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        this.f43241P0 = i;
                    }
                } else if (index == C16944e.C16957m.MotionLayout_motionDebug) {
                    this.f43241P0 = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (!z) {
                this.f43256a = null;
            }
        }
        if (this.f43241P0 != 0) {
            mo49986W();
        }
        if (this.f43266f == -1 && (sVar = this.f43256a) != null) {
            this.f43266f = sVar.mo50303N();
            this.f43264e = this.f43256a.mo50303N();
            this.f43268g = this.f43256a.mo50350u();
        }
    }

    /* renamed from: v0 */
    public boolean mo50058v0() {
        return this.f43234L1;
    }

    /* renamed from: w0 */
    public boolean mo50059w0() {
        return this.f43220E1;
    }

    /* renamed from: x0 */
    public boolean mo50060x0() {
        return this.f43288x;
    }

    /* renamed from: y0 */
    public boolean mo50061y0(int i) {
        C16900s sVar = this.f43256a;
        if (sVar != null) {
            return sVar.mo50310U(i);
        }
        return false;
    }

    /* renamed from: z0 */
    public void mo50062z0(int i) {
        if (!isAttachedToWindow()) {
            this.f43266f = i;
        }
        if (this.f43264e == i) {
            setProgress(0.0f);
        } else if (this.f43268g == i) {
            setProgress(1.0f);
        } else {
            setTransition(i, i);
        }
    }

    public void setState(int i, int i2, int i3) {
        setState(TransitionState.SETUP);
        this.f43266f = i;
        this.f43264e = -1;
        this.f43268g = -1;
        C16930a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.mo50755e(i, (float) i2, (float) i3);
            return;
        }
        C16900s sVar = this.f43256a;
        if (sVar != null) {
            sVar.mo50339o(i).mo50900r(this);
        }
    }

    public void setProgress(float f) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i >= 0) {
            int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        }
        if (!isAttachedToWindow()) {
            if (this.f43215A1 == null) {
                this.f43215A1 = new C16872k();
            }
            this.f43215A1.mo50107e(f);
            return;
        }
        if (i <= 0) {
            if (this.f43223G0 == 1.0f && this.f43266f == this.f43268g) {
                setState(TransitionState.MOVING);
            }
            this.f43266f = this.f43264e;
            if (this.f43223G0 == 0.0f) {
                setState(TransitionState.FINISHED);
            }
        } else if (f >= 1.0f) {
            if (this.f43223G0 == 0.0f && this.f43266f == this.f43264e) {
                setState(TransitionState.MOVING);
            }
            this.f43266f = this.f43268g;
            if (this.f43223G0 == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.f43266f = -1;
            setState(TransitionState.MOVING);
        }
        if (this.f43256a != null) {
            this.f43229J0 = true;
            this.f43227I0 = f;
            this.f43221F0 = f;
            this.f43225H0 = -1;
            this.f43292z = -1;
            this.f43258b = null;
            this.f43231K0 = true;
            invalidate();
        }
    }

    public void setTransition(int i) {
        float f;
        if (this.f43256a != null) {
            C16900s.C16902b r0 = mo50034r0(i);
            this.f43264e = r0.mo50365I();
            this.f43268g = r0.mo50358B();
            if (!isAttachedToWindow()) {
                if (this.f43215A1 == null) {
                    this.f43215A1 = new C16872k();
                }
                this.f43215A1.mo50108f(this.f43264e);
                this.f43215A1.mo50106d(this.f43268g);
                return;
            }
            int i2 = this.f43266f;
            float f2 = 0.0f;
            if (i2 == this.f43264e) {
                f = 0.0f;
            } else {
                f = i2 == this.f43268g ? 1.0f : Float.NaN;
            }
            this.f43256a.mo50340o0(r0);
            this.f43238N1.mo50088h(this.mLayoutWidget, this.f43256a.mo50339o(this.f43264e), this.f43256a.mo50339o(this.f43268g));
            mo49965F0();
            if (this.f43223G0 != f) {
                if (f == 0.0f) {
                    mo49998f0(true);
                    this.f43256a.mo50339o(this.f43264e).mo50900r(this);
                } else if (f == 1.0f) {
                    mo49998f0(false);
                    this.f43256a.mo50339o(this.f43268g).mo50900r(this);
                }
            }
            if (!Float.isNaN(f)) {
                f2 = f;
            }
            this.f43223G0 = f2;
            if (Float.isNaN(f)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C16878c.m77584g());
                sb.append(" transitionToStart ");
                mo49975P0();
                return;
            }
            setProgress(f);
        }
    }

    public void setTransition(C16900s.C16902b bVar) {
        this.f43256a.mo50340o0(bVar);
        setState(TransitionState.SETUP);
        if (this.f43266f == this.f43256a.mo50350u()) {
            this.f43223G0 = 1.0f;
            this.f43221F0 = 1.0f;
            this.f43227I0 = 1.0f;
        } else {
            this.f43223G0 = 0.0f;
            this.f43221F0 = 0.0f;
            this.f43227I0 = 0.0f;
        }
        this.f43225H0 = bVar.mo50368L(1) ? -1 : getNanoTime();
        int N = this.f43256a.mo50303N();
        int u = this.f43256a.mo50350u();
        if (N != this.f43264e || u != this.f43268g) {
            this.f43264e = N;
            this.f43268g = u;
            this.f43256a.mo50338n0(N, u);
            this.f43238N1.mo50088h(this.mLayoutWidget, this.f43256a.mo50339o(this.f43264e), this.f43256a.mo50339o(this.f43268g));
            this.f43238N1.mo50092l(this.f43264e, this.f43268g);
            this.f43238N1.mo50091k();
            mo49965F0();
        }
    }

    public MotionLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        mo50057u0(attributeSet);
    }

    public MotionLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo50057u0(attributeSet);
    }
}
