package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C16944e;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.motion.widget.v */
public class C16906v {

    /* renamed from: G */
    public static final String f43917G = "TouchResponse";

    /* renamed from: H */
    public static final boolean f43918H = false;

    /* renamed from: I */
    public static final int f43919I = 1000;

    /* renamed from: J */
    public static final float f43920J = 1.0E-7f;

    /* renamed from: K */
    public static final float[][] f43921K = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: L */
    public static final float[][] f43922L = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: M */
    public static final int f43923M = 0;

    /* renamed from: N */
    public static final int f43924N = 1;

    /* renamed from: O */
    public static final int f43925O = 2;

    /* renamed from: P */
    public static final int f43926P = 3;

    /* renamed from: Q */
    public static final int f43927Q = 4;

    /* renamed from: R */
    public static final int f43928R = 5;

    /* renamed from: S */
    public static final int f43929S = 0;

    /* renamed from: T */
    public static final int f43930T = 1;

    /* renamed from: U */
    public static final int f43931U = 2;

    /* renamed from: V */
    public static final int f43932V = 3;

    /* renamed from: W */
    public static final int f43933W = 4;

    /* renamed from: X */
    public static final int f43934X = 5;

    /* renamed from: Y */
    public static final int f43935Y = 6;

    /* renamed from: Z */
    public static final int f43936Z = 1;

    /* renamed from: a0 */
    public static final int f43937a0 = 2;

    /* renamed from: b0 */
    public static final int f43938b0 = 4;

    /* renamed from: c0 */
    public static final int f43939c0 = 0;

    /* renamed from: d0 */
    public static final int f43940d0 = 1;

    /* renamed from: A */
    public float f43941A = 10.0f;

    /* renamed from: B */
    public float f43942B = 1.0f;

    /* renamed from: C */
    public float f43943C = Float.NaN;

    /* renamed from: D */
    public float f43944D = Float.NaN;

    /* renamed from: E */
    public int f43945E = 0;

    /* renamed from: F */
    public int f43946F = 0;

    /* renamed from: a */
    public int f43947a = 0;

    /* renamed from: b */
    public int f43948b = 0;

    /* renamed from: c */
    public int f43949c = 0;

    /* renamed from: d */
    public int f43950d = -1;

    /* renamed from: e */
    public int f43951e = -1;

    /* renamed from: f */
    public int f43952f = -1;

    /* renamed from: g */
    public float f43953g = 0.5f;

    /* renamed from: h */
    public float f43954h = 0.5f;

    /* renamed from: i */
    public float f43955i = 0.5f;

    /* renamed from: j */
    public float f43956j = 0.5f;

    /* renamed from: k */
    public int f43957k = -1;

    /* renamed from: l */
    public boolean f43958l = false;

    /* renamed from: m */
    public float f43959m = 0.0f;

    /* renamed from: n */
    public float f43960n = 1.0f;

    /* renamed from: o */
    public boolean f43961o = false;

    /* renamed from: p */
    public float[] f43962p = new float[2];

    /* renamed from: q */
    public int[] f43963q = new int[2];

    /* renamed from: r */
    public float f43964r;

    /* renamed from: s */
    public float f43965s;

    /* renamed from: t */
    public final MotionLayout f43966t;

    /* renamed from: u */
    public float f43967u = 4.0f;

    /* renamed from: v */
    public float f43968v = 1.2f;

    /* renamed from: w */
    public boolean f43969w = true;

    /* renamed from: x */
    public float f43970x = 1.0f;

    /* renamed from: y */
    public int f43971y = 0;

    /* renamed from: z */
    public float f43972z = 10.0f;

    /* renamed from: androidx.constraintlayout.motion.widget.v$a */
    public class C16907a implements View.OnTouchListener {
        public C16907a(C16906v vVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.v$b */
    public class C16908b implements NestedScrollView.C18456c {
        public C16908b(C16906v vVar) {
        }

        /* renamed from: a */
        public void mo1055a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }

    public C16906v(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f43966t = motionLayout;
        mo50440c(context, Xml.asAttributeSet(xmlPullParser));
    }

    /* renamed from: A */
    public void mo50430A(float f, float f2) {
        this.f43964r = f;
        this.f43965s = f2;
    }

    /* renamed from: B */
    public void mo50431B(float f) {
        this.f43968v = f;
    }

    /* renamed from: C */
    public void mo50432C(float f) {
        this.f43967u = f;
    }

    /* renamed from: D */
    public void mo50433D(boolean z) {
        if (z) {
            float[][] fArr = f43922L;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f43921K;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f43922L;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f43921K;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f43921K[this.f43947a];
        this.f43954h = fArr5[0];
        this.f43953g = fArr5[1];
        int i = this.f43948b;
        float[][] fArr6 = f43922L;
        if (i < fArr6.length) {
            float[] fArr7 = fArr6[i];
            this.f43959m = fArr7[0];
            this.f43960n = fArr7[1];
        }
    }

    /* renamed from: E */
    public void mo50434E(float f, float f2) {
        this.f43954h = f;
        this.f43953g = f2;
    }

    /* renamed from: F */
    public void mo50435F(int i) {
        this.f43949c = i;
    }

    /* renamed from: G */
    public void mo50436G(float f, float f2) {
        this.f43964r = f;
        this.f43965s = f2;
        this.f43961o = false;
    }

    /* renamed from: H */
    public void mo50437H() {
        View view;
        int i = this.f43950d;
        if (i != -1) {
            view = this.f43966t.findViewById(i);
            if (view == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("cannot find TouchAnchorId @id/");
                sb.append(C16878c.m77586i(this.f43966t.getContext(), this.f43950d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new C16907a(this));
            nestedScrollView.setOnScrollChangeListener(new C16908b(this));
        }
    }

    /* renamed from: a */
    public float mo50438a(float f, float f2) {
        return (f * this.f43959m) + (f2 * this.f43960n);
    }

    /* renamed from: b */
    public final void mo50439b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == C16944e.C16957m.OnSwipe_touchAnchorId) {
                this.f43950d = typedArray.getResourceId(index, this.f43950d);
            } else if (index == C16944e.C16957m.OnSwipe_touchAnchorSide) {
                int i2 = typedArray.getInt(index, this.f43947a);
                this.f43947a = i2;
                float[] fArr = f43921K[i2];
                this.f43954h = fArr[0];
                this.f43953g = fArr[1];
            } else if (index == C16944e.C16957m.OnSwipe_dragDirection) {
                int i3 = typedArray.getInt(index, this.f43948b);
                this.f43948b = i3;
                float[][] fArr2 = f43922L;
                if (i3 < fArr2.length) {
                    float[] fArr3 = fArr2[i3];
                    this.f43959m = fArr3[0];
                    this.f43960n = fArr3[1];
                } else {
                    this.f43960n = Float.NaN;
                    this.f43959m = Float.NaN;
                    this.f43958l = true;
                }
            } else if (index == C16944e.C16957m.OnSwipe_maxVelocity) {
                this.f43967u = typedArray.getFloat(index, this.f43967u);
            } else if (index == C16944e.C16957m.OnSwipe_maxAcceleration) {
                this.f43968v = typedArray.getFloat(index, this.f43968v);
            } else if (index == C16944e.C16957m.OnSwipe_moveWhenScrollAtTop) {
                this.f43969w = typedArray.getBoolean(index, this.f43969w);
            } else if (index == C16944e.C16957m.OnSwipe_dragScale) {
                this.f43970x = typedArray.getFloat(index, this.f43970x);
            } else if (index == C16944e.C16957m.OnSwipe_dragThreshold) {
                this.f43972z = typedArray.getFloat(index, this.f43972z);
            } else if (index == C16944e.C16957m.OnSwipe_touchRegionId) {
                this.f43951e = typedArray.getResourceId(index, this.f43951e);
            } else if (index == C16944e.C16957m.OnSwipe_onTouchUp) {
                this.f43949c = typedArray.getInt(index, this.f43949c);
            } else if (index == C16944e.C16957m.OnSwipe_nestedScrollFlags) {
                this.f43971y = typedArray.getInteger(index, 0);
            } else if (index == C16944e.C16957m.OnSwipe_limitBoundsTo) {
                this.f43952f = typedArray.getResourceId(index, 0);
            } else if (index == C16944e.C16957m.OnSwipe_rotationCenterId) {
                this.f43957k = typedArray.getResourceId(index, this.f43957k);
            } else if (index == C16944e.C16957m.OnSwipe_springDamping) {
                this.f43941A = typedArray.getFloat(index, this.f43941A);
            } else if (index == C16944e.C16957m.OnSwipe_springMass) {
                this.f43942B = typedArray.getFloat(index, this.f43942B);
            } else if (index == C16944e.C16957m.OnSwipe_springStiffness) {
                this.f43943C = typedArray.getFloat(index, this.f43943C);
            } else if (index == C16944e.C16957m.OnSwipe_springStopThreshold) {
                this.f43944D = typedArray.getFloat(index, this.f43944D);
            } else if (index == C16944e.C16957m.OnSwipe_springBoundary) {
                this.f43945E = typedArray.getInt(index, this.f43945E);
            } else if (index == C16944e.C16957m.OnSwipe_autoCompleteMode) {
                this.f43946F = typedArray.getInt(index, this.f43946F);
            }
        }
    }

    /* renamed from: c */
    public final void mo50440c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16944e.C16957m.OnSwipe);
        mo50439b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public int mo50441d() {
        return this.f43950d;
    }

    /* renamed from: e */
    public int mo50442e() {
        return this.f43946F;
    }

    /* renamed from: f */
    public int mo50443f() {
        return this.f43971y;
    }

    /* renamed from: g */
    public RectF mo50444g(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f43952f;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* renamed from: h */
    public int mo50445h() {
        return this.f43952f;
    }

    /* renamed from: i */
    public float mo50446i() {
        return this.f43968v;
    }

    /* renamed from: j */
    public float mo50447j() {
        return this.f43967u;
    }

    /* renamed from: k */
    public boolean mo50448k() {
        return this.f43969w;
    }

    /* renamed from: l */
    public float mo50449l(float f, float f2) {
        this.f43966t.mo50020m0(this.f43950d, this.f43966t.getProgress(), this.f43954h, this.f43953g, this.f43962p);
        float f3 = this.f43959m;
        if (f3 != 0.0f) {
            float[] fArr = this.f43962p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.f43962p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.f43960n) / fArr2[1];
    }

    /* renamed from: m */
    public int mo50450m() {
        return this.f43945E;
    }

    /* renamed from: n */
    public float mo50451n() {
        return this.f43941A;
    }

    /* renamed from: o */
    public float mo50452o() {
        return this.f43942B;
    }

    /* renamed from: p */
    public float mo50453p() {
        return this.f43943C;
    }

    /* renamed from: q */
    public float mo50454q() {
        return this.f43944D;
    }

    /* renamed from: r */
    public RectF mo50455r(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f43951e;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* renamed from: s */
    public int mo50456s() {
        return this.f43951e;
    }

    /* renamed from: t */
    public boolean mo50457t() {
        return this.f43961o;
    }

    public String toString() {
        if (Float.isNaN(this.f43959m)) {
            return C16881f.f43375i;
        }
        return this.f43959m + " , " + this.f43960n;
    }

    /* renamed from: u */
    public void mo50459u(MotionEvent motionEvent, MotionLayout.C16870i iVar, int i, C16900s sVar) {
        float f;
        float f2;
        int i2;
        float f3;
        float f4;
        float f5;
        boolean z;
        MotionLayout.C16870i iVar2 = iVar;
        if (this.f43958l) {
            mo50460v(motionEvent, iVar, i, sVar);
            return;
        }
        iVar2.mo50096c(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f43964r = motionEvent.getRawX();
            this.f43965s = motionEvent.getRawY();
            this.f43961o = false;
        } else if (action == 1) {
            this.f43961o = false;
            iVar2.mo50102h(1000);
            float e = iVar.mo50099e();
            float d = iVar.mo50098d();
            float progress = this.f43966t.getProgress();
            int i3 = this.f43950d;
            if (i3 != -1) {
                this.f43966t.mo50020m0(i3, progress, this.f43954h, this.f43953g, this.f43962p);
            } else {
                float min = (float) Math.min(this.f43966t.getWidth(), this.f43966t.getHeight());
                float[] fArr = this.f43962p;
                fArr[1] = this.f43960n * min;
                fArr[0] = min * this.f43959m;
            }
            float f6 = this.f43959m;
            float[] fArr2 = this.f43962p;
            float f7 = fArr2[0];
            float f8 = fArr2[1];
            if (f6 != 0.0f) {
                f = e / f7;
            } else {
                f = d / f8;
            }
            if (!Float.isNaN(f)) {
                f2 = (f / 3.0f) + progress;
            } else {
                f2 = progress;
            }
            if (f2 != 0.0f && f2 != 1.0f && (i2 = this.f43949c) != 3) {
                if (((double) f2) < 0.5d) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                if (i2 == 6) {
                    if (progress + f < 0.0f) {
                        f = Math.abs(f);
                    }
                    f3 = 1.0f;
                }
                if (this.f43949c == 7) {
                    if (progress + f > 1.0f) {
                        f = -Math.abs(f);
                    }
                    f3 = 0.0f;
                }
                this.f43966t.mo49971L0(this.f43949c, f3, f);
                if (0.0f >= progress || 1.0f <= progress) {
                    this.f43966t.setState(MotionLayout.TransitionState.FINISHED);
                }
            } else if (0.0f >= f2 || 1.0f <= f2) {
                this.f43966t.setState(MotionLayout.TransitionState.FINISHED);
            }
        } else if (action == 2) {
            float rawY = motionEvent.getRawY() - this.f43965s;
            float rawX = motionEvent.getRawX() - this.f43964r;
            if (Math.abs((this.f43959m * rawX) + (this.f43960n * rawY)) > this.f43972z || this.f43961o) {
                float progress2 = this.f43966t.getProgress();
                if (!this.f43961o) {
                    this.f43961o = true;
                    this.f43966t.setProgress(progress2);
                }
                int i4 = this.f43950d;
                if (i4 != -1) {
                    this.f43966t.mo50020m0(i4, progress2, this.f43954h, this.f43953g, this.f43962p);
                } else {
                    float min2 = (float) Math.min(this.f43966t.getWidth(), this.f43966t.getHeight());
                    float[] fArr3 = this.f43962p;
                    fArr3[1] = this.f43960n * min2;
                    fArr3[0] = min2 * this.f43959m;
                }
                float f9 = this.f43959m;
                float[] fArr4 = this.f43962p;
                if (((double) Math.abs(((f9 * fArr4[0]) + (this.f43960n * fArr4[1])) * this.f43970x)) < 0.01d) {
                    float[] fArr5 = this.f43962p;
                    fArr5[0] = 0.01f;
                    fArr5[1] = 0.01f;
                }
                if (this.f43959m != 0.0f) {
                    f4 = rawX / this.f43962p[0];
                } else {
                    f4 = rawY / this.f43962p[1];
                }
                float max = Math.max(Math.min(progress2 + f4, 1.0f), 0.0f);
                if (this.f43949c == 6) {
                    max = Math.max(max, 0.01f);
                }
                if (this.f43949c == 7) {
                    max = Math.min(max, 0.99f);
                }
                float progress3 = this.f43966t.getProgress();
                if (max != progress3) {
                    int i5 = (progress3 > 0.0f ? 1 : (progress3 == 0.0f ? 0 : -1));
                    if (i5 == 0 || progress3 == 1.0f) {
                        MotionLayout motionLayout = this.f43966t;
                        if (i5 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        motionLayout.mo49998f0(z);
                    }
                    this.f43966t.setProgress(max);
                    iVar2.mo50102h(1000);
                    float e2 = iVar.mo50099e();
                    float d2 = iVar.mo50098d();
                    if (this.f43959m != 0.0f) {
                        f5 = e2 / this.f43962p[0];
                    } else {
                        f5 = d2 / this.f43962p[1];
                    }
                    this.f43966t.f43262d = f5;
                } else {
                    this.f43966t.f43262d = 0.0f;
                }
                this.f43964r = motionEvent.getRawX();
                this.f43965s = motionEvent.getRawY();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0318  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50460v(android.view.MotionEvent r24, androidx.constraintlayout.motion.widget.MotionLayout.C16870i r25, int r26, androidx.constraintlayout.motion.widget.C16900s r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r24
            r1.mo50096c(r2)
            int r3 = r24.getAction()
            r4 = 0
            if (r3 == 0) goto L_0x032b
            r5 = 1135869952(0x43b40000, float:360.0)
            r6 = -1
            r9 = 1073741824(0x40000000, float:2.0)
            r10 = 1
            if (r3 == r10) goto L_0x01ba
            r11 = 2
            if (r3 == r11) goto L_0x001d
            goto L_0x0339
        L_0x001d:
            r24.getRawY()
            r24.getRawX()
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f43966t
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r3 = r3 / r9
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f43966t
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r9
            int r12 = r0.f43957k
            if (r12 == r6) goto L_0x006c
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f43966t
            android.view.View r3 = r3.findViewById(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f43966t
            int[] r12 = r0.f43963q
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.f43963q
            r11 = r11[r4]
            float r11 = (float) r11
            int r12 = r3.getLeft()
            int r13 = r3.getRight()
            int r12 = r12 + r13
            float r12 = (float) r12
            float r12 = r12 / r9
            float r11 = r11 + r12
            int[] r12 = r0.f43963q
            r12 = r12[r10]
            float r12 = (float) r12
            int r13 = r3.getTop()
            int r3 = r3.getBottom()
            int r13 = r13 + r3
            float r3 = (float) r13
            float r3 = r3 / r9
            float r3 = r3 + r12
            r22 = r11
            r11 = r3
            r3 = r22
            goto L_0x00ac
        L_0x006c:
            int r12 = r0.f43950d
            if (r12 == r6) goto L_0x00ac
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r0.f43966t
            androidx.constraintlayout.motion.widget.o r12 = r13.mo50033q0(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r0.f43966t
            int r12 = r12.mo50251k()
            android.view.View r12 = r13.findViewById(r12)
            if (r12 != 0) goto L_0x0083
            goto L_0x00ac
        L_0x0083:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f43966t
            int[] r11 = r0.f43963q
            r3.getLocationOnScreen(r11)
            int[] r3 = r0.f43963q
            r3 = r3[r4]
            float r3 = (float) r3
            int r11 = r12.getLeft()
            int r13 = r12.getRight()
            int r11 = r11 + r13
            float r11 = (float) r11
            float r11 = r11 / r9
            float r3 = r3 + r11
            int[] r11 = r0.f43963q
            r11 = r11[r10]
            float r11 = (float) r11
            int r13 = r12.getTop()
            int r12 = r12.getBottom()
            int r13 = r13 + r12
            float r12 = (float) r13
            float r12 = r12 / r9
            float r11 = r11 + r12
        L_0x00ac:
            float r9 = r24.getRawX()
            float r9 = r9 - r3
            float r12 = r24.getRawY()
            float r12 = r12 - r11
            float r13 = r24.getRawY()
            float r13 = r13 - r11
            double r13 = (double) r13
            float r15 = r24.getRawX()
            float r15 = r15 - r3
            r27 = r9
            double r8 = (double) r15
            double r8 = java.lang.Math.atan2(r13, r8)
            float r13 = r0.f43965s
            float r13 = r13 - r11
            double r13 = (double) r13
            float r11 = r0.f43964r
            float r11 = r11 - r3
            double r6 = (double) r11
            double r6 = java.lang.Math.atan2(r13, r6)
            double r6 = r8 - r6
            r13 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r6 = r6 * r13
            r13 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r6 = r6 / r13
            float r6 = (float) r6
            r7 = 1134886912(0x43a50000, float:330.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x00eb
            float r6 = r6 - r5
            goto L_0x00f2
        L_0x00eb:
            r7 = -1012596736(0xffffffffc3a50000, float:-330.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x00f2
            float r6 = r6 + r5
        L_0x00f2:
            float r7 = java.lang.Math.abs(r6)
            double r13 = (double) r7
            r16 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r7 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r7 > 0) goto L_0x0104
            boolean r7 = r0.f43961o
            if (r7 == 0) goto L_0x0339
        L_0x0104:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.f43966t
            float r7 = r7.getProgress()
            boolean r11 = r0.f43961o
            if (r11 != 0) goto L_0x0115
            r0.f43961o = r10
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f43966t
            r11.setProgress(r7)
        L_0x0115:
            int r11 = r0.f43950d
            r3 = -1
            if (r11 == r3) goto L_0x013e
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f43966t
            float r5 = r0.f43954h
            float r13 = r0.f43953g
            float[] r14 = r0.f43962p
            r16 = r3
            r17 = r11
            r18 = r7
            r19 = r5
            r20 = r13
            r21 = r14
            r16.mo50020m0(r17, r18, r19, r20, r21)
            float[] r3 = r0.f43962p
            r5 = r3[r10]
            double r13 = (double) r5
            double r13 = java.lang.Math.toDegrees(r13)
            float r5 = (float) r13
            r3[r10] = r5
            goto L_0x0142
        L_0x013e:
            float[] r3 = r0.f43962p
            r3[r10] = r5
        L_0x0142:
            float r3 = r0.f43970x
            float r6 = r6 * r3
            float[] r3 = r0.f43962p
            r3 = r3[r10]
            float r6 = r6 / r3
            float r7 = r7 + r6
            r3 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r7, r3)
            r6 = 0
            float r5 = java.lang.Math.max(r5, r6)
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.f43966t
            float r7 = r7.getProgress()
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x01a7
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0168
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0170
        L_0x0168:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f43966t
            if (r6 != 0) goto L_0x016d
            r4 = r10
        L_0x016d:
            r3.mo49998f0(r4)
        L_0x0170:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f43966t
            r3.setProgress(r5)
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.mo50102h(r3)
            float r3 = r25.mo50099e()
            float r1 = r25.mo50098d()
            double r4 = (double) r1
            double r6 = (double) r3
            double r10 = java.lang.Math.hypot(r4, r6)
            double r3 = java.lang.Math.atan2(r4, r6)
            double r3 = r3 - r8
            double r3 = java.lang.Math.sin(r3)
            double r10 = r10 * r3
            r9 = r27
            double r3 = (double) r9
            double r5 = (double) r12
            double r3 = java.lang.Math.hypot(r3, r5)
            double r10 = r10 / r3
            float r1 = (float) r10
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f43966t
            double r4 = (double) r1
            double r4 = java.lang.Math.toDegrees(r4)
            float r1 = (float) r4
            r3.f43262d = r1
            goto L_0x01ac
        L_0x01a7:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f43966t
            r3 = 0
            r1.f43262d = r3
        L_0x01ac:
            float r1 = r24.getRawX()
            r0.f43964r = r1
            float r1 = r24.getRawY()
            r0.f43965s = r1
            goto L_0x0339
        L_0x01ba:
            r0.f43961o = r4
            r6 = 16
            r1.mo50102h(r6)
            float r6 = r25.mo50099e()
            float r1 = r25.mo50098d()
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.f43966t
            float r7 = r7.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.f43966t
            int r8 = r8.getWidth()
            float r8 = (float) r8
            float r8 = r8 / r9
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f43966t
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r9
            int r12 = r0.f43957k
            r3 = -1
            if (r12 == r3) goto L_0x0215
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.f43966t
            android.view.View r8 = r8.findViewById(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f43966t
            int[] r12 = r0.f43963q
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.f43963q
            r4 = r11[r4]
            float r4 = (float) r4
            int r11 = r8.getLeft()
            int r12 = r8.getRight()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r11 = r11 / r9
            float r4 = r4 + r11
            int[] r11 = r0.f43963q
            r11 = r11[r10]
            float r11 = (float) r11
            int r12 = r8.getTop()
            int r8 = r8.getBottom()
        L_0x020f:
            int r12 = r12 + r8
            float r8 = (float) r12
            float r8 = r8 / r9
            float r11 = r11 + r8
            r8 = r4
            goto L_0x0250
        L_0x0215:
            int r12 = r0.f43950d
            r3 = -1
            if (r12 == r3) goto L_0x0250
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.f43966t
            androidx.constraintlayout.motion.widget.o r8 = r8.mo50033q0(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f43966t
            int r8 = r8.mo50251k()
            android.view.View r8 = r11.findViewById(r8)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f43966t
            int[] r12 = r0.f43963q
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.f43963q
            r4 = r11[r4]
            float r4 = (float) r4
            int r11 = r8.getLeft()
            int r12 = r8.getRight()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r11 = r11 / r9
            float r4 = r4 + r11
            int[] r11 = r0.f43963q
            r11 = r11[r10]
            float r11 = (float) r11
            int r12 = r8.getTop()
            int r8 = r8.getBottom()
            goto L_0x020f
        L_0x0250:
            float r4 = r24.getRawX()
            float r4 = r4 - r8
            float r2 = r24.getRawY()
            float r2 = r2 - r11
            double r8 = (double) r2
            double r11 = (double) r4
            double r8 = java.lang.Math.atan2(r8, r11)
            double r8 = java.lang.Math.toDegrees(r8)
            int r11 = r0.f43950d
            r3 = -1
            if (r11 == r3) goto L_0x028d
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f43966t
            float r5 = r0.f43954h
            float r12 = r0.f43953g
            float[] r13 = r0.f43962p
            r16 = r3
            r17 = r11
            r18 = r7
            r19 = r5
            r20 = r12
            r21 = r13
            r16.mo50020m0(r17, r18, r19, r20, r21)
            float[] r3 = r0.f43962p
            r5 = r3[r10]
            double r11 = (double) r5
            double r11 = java.lang.Math.toDegrees(r11)
            float r5 = (float) r11
            r3[r10] = r5
            goto L_0x0291
        L_0x028d:
            float[] r3 = r0.f43962p
            r3[r10] = r5
        L_0x0291:
            float r1 = r1 + r2
            double r1 = (double) r1
            float r6 = r6 + r4
            double r3 = (double) r6
            double r1 = java.lang.Math.atan2(r1, r3)
            double r1 = java.lang.Math.toDegrees(r1)
            double r1 = r1 - r8
            float r1 = (float) r1
            r2 = 1115291648(0x427a0000, float:62.5)
            float r1 = r1 * r2
            boolean r2 = java.lang.Float.isNaN(r1)
            r3 = 1077936128(0x40400000, float:3.0)
            if (r2 != 0) goto L_0x02b6
            float r2 = r1 * r3
            float r4 = r0.f43970x
            float r2 = r2 * r4
            float[] r4 = r0.f43962p
            r4 = r4[r10]
            float r2 = r2 / r4
            float r2 = r2 + r7
            goto L_0x02b7
        L_0x02b6:
            r2 = r7
        L_0x02b7:
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0318
            r4 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0318
            int r4 = r0.f43949c
            r5 = 3
            if (r4 == r5) goto L_0x0318
            float r5 = r0.f43970x
            float r1 = r1 * r5
            float[] r5 = r0.f43962p
            r5 = r5[r10]
            float r1 = r1 / r5
            double r5 = (double) r2
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x02d8
            r2 = 0
            goto L_0x02da
        L_0x02d8:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x02da:
            r5 = 6
            if (r4 != r5) goto L_0x02ea
            float r2 = r7 + r1
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x02e8
            float r1 = java.lang.Math.abs(r1)
        L_0x02e8:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x02ea:
            int r4 = r0.f43949c
            r5 = 7
            if (r4 != r5) goto L_0x02fd
            float r2 = r7 + r1
            r4 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x02fc
            float r1 = java.lang.Math.abs(r1)
            float r1 = -r1
        L_0x02fc:
            r2 = 0
        L_0x02fd:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.f43966t
            int r5 = r0.f43949c
            float r1 = r1 * r3
            r4.mo49971L0(r5, r2, r1)
            r1 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0310
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0339
        L_0x0310:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f43966t
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            goto L_0x0339
        L_0x0318:
            r1 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0323
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0339
        L_0x0323:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f43966t
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            goto L_0x0339
        L_0x032b:
            float r1 = r24.getRawX()
            r0.f43964r = r1
            float r1 = r24.getRawY()
            r0.f43965s = r1
            r0.f43961o = r4
        L_0x0339:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C16906v.mo50460v(android.view.MotionEvent, androidx.constraintlayout.motion.widget.MotionLayout$i, int, androidx.constraintlayout.motion.widget.s):void");
    }

    /* renamed from: w */
    public void mo50461w(float f, float f2) {
        float f3;
        float progress = this.f43966t.getProgress();
        if (!this.f43961o) {
            this.f43961o = true;
            this.f43966t.setProgress(progress);
        }
        this.f43966t.mo50020m0(this.f43950d, progress, this.f43954h, this.f43953g, this.f43962p);
        float f4 = this.f43959m;
        float[] fArr = this.f43962p;
        if (((double) Math.abs((f4 * fArr[0]) + (this.f43960n * fArr[1]))) < 0.01d) {
            float[] fArr2 = this.f43962p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f5 = this.f43959m;
        if (f5 != 0.0f) {
            f3 = (f * f5) / this.f43962p[0];
        } else {
            f3 = (f2 * this.f43960n) / this.f43962p[1];
        }
        float max = Math.max(Math.min(progress + f3, 1.0f), 0.0f);
        if (max != this.f43966t.getProgress()) {
            this.f43966t.setProgress(max);
        }
    }

    /* renamed from: x */
    public void mo50462x(float f, float f2) {
        float f3;
        boolean z;
        boolean z2 = false;
        this.f43961o = false;
        float progress = this.f43966t.getProgress();
        this.f43966t.mo50020m0(this.f43950d, progress, this.f43954h, this.f43953g, this.f43962p);
        float f4 = this.f43959m;
        float[] fArr = this.f43962p;
        float f5 = fArr[0];
        float f6 = this.f43960n;
        float f7 = fArr[1];
        float f8 = 0.0f;
        if (f4 != 0.0f) {
            f3 = (f * f4) / f5;
        } else {
            f3 = (f2 * f6) / f7;
        }
        if (!Float.isNaN(f3)) {
            progress += f3 / 3.0f;
        }
        if (progress != 0.0f) {
            if (progress != 1.0f) {
                z = true;
            } else {
                z = false;
            }
            int i = this.f43949c;
            if (i != 3) {
                z2 = true;
            }
            if (z2 && z) {
                MotionLayout motionLayout = this.f43966t;
                if (((double) progress) >= 0.5d) {
                    f8 = 1.0f;
                }
                motionLayout.mo49971L0(i, f8, f3);
            }
        }
    }

    /* renamed from: y */
    public void mo50463y(int i) {
        this.f43950d = i;
    }

    /* renamed from: z */
    public void mo50464z(int i) {
        this.f43946F = i;
    }

    public C16906v(MotionLayout motionLayout, C16904t tVar) {
        this.f43966t = motionLayout;
        this.f43950d = tVar.mo50420q();
        int r = tVar.mo50421r();
        this.f43947a = r;
        if (r != -1) {
            float[] fArr = f43921K[r];
            this.f43954h = fArr[0];
            this.f43953g = fArr[1];
        }
        int b = tVar.mo50405b();
        this.f43948b = b;
        float[][] fArr2 = f43922L;
        if (b < fArr2.length) {
            float[] fArr3 = fArr2[b];
            this.f43959m = fArr3[0];
            this.f43960n = fArr3[1];
        } else {
            this.f43960n = Float.NaN;
            this.f43959m = Float.NaN;
            this.f43958l = true;
        }
        this.f43967u = tVar.mo50410g();
        this.f43968v = tVar.mo50409f();
        this.f43969w = tVar.mo50411h();
        this.f43970x = tVar.mo50406c();
        this.f43972z = tVar.mo50407d();
        this.f43951e = tVar.mo50422s();
        this.f43949c = tVar.mo50413j();
        this.f43971y = tVar.mo50412i();
        this.f43952f = tVar.mo50408e();
        this.f43957k = tVar.mo50414k();
        this.f43945E = tVar.mo50415l();
        this.f43941A = tVar.mo50416m();
        this.f43942B = tVar.mo50417n();
        this.f43943C = tVar.mo50418o();
        this.f43944D = tVar.mo50419p();
        this.f43946F = tVar.mo50404a();
    }
}
