package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.C16677b;
import androidx.constraintlayout.core.motion.utils.C16680d;
import androidx.constraintlayout.core.motion.utils.C16703o;
import androidx.constraintlayout.core.motion.utils.C16729x;
import androidx.constraintlayout.motion.utils.C16817c;
import androidx.constraintlayout.motion.utils.C16831d;
import androidx.constraintlayout.motion.utils.C16847e;
import androidx.constraintlayout.motion.utils.C16848f;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.urbanairship.iam.events.C9175a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.motion.widget.o */
public class C16895o {

    /* renamed from: N */
    public static final int f43675N = 0;

    /* renamed from: O */
    public static final int f43676O = 1;

    /* renamed from: P */
    public static final int f43677P = 2;

    /* renamed from: Q */
    public static final int f43678Q = 3;

    /* renamed from: R */
    public static final int f43679R = 4;

    /* renamed from: S */
    public static final int f43680S = 5;

    /* renamed from: T */
    public static final int f43681T = 0;

    /* renamed from: U */
    public static final int f43682U = 1;

    /* renamed from: V */
    public static final int f43683V = 2;

    /* renamed from: W */
    public static final int f43684W = 3;

    /* renamed from: X */
    public static final int f43685X = 4;

    /* renamed from: Y */
    public static final int f43686Y = 5;

    /* renamed from: Z */
    public static final int f43687Z = 6;

    /* renamed from: a0 */
    public static final int f43688a0 = 1;

    /* renamed from: b0 */
    public static final int f43689b0 = 2;

    /* renamed from: c0 */
    public static final String f43690c0 = "MotionController";

    /* renamed from: d0 */
    public static final boolean f43691d0 = false;

    /* renamed from: e0 */
    public static final boolean f43692e0 = false;

    /* renamed from: f0 */
    public static final int f43693f0 = 0;

    /* renamed from: g0 */
    public static final int f43694g0 = 1;

    /* renamed from: h0 */
    public static final int f43695h0 = 2;

    /* renamed from: i0 */
    public static final int f43696i0 = 3;

    /* renamed from: j0 */
    public static final int f43697j0 = 4;

    /* renamed from: k0 */
    public static final int f43698k0 = 5;

    /* renamed from: l0 */
    public static final int f43699l0 = -1;

    /* renamed from: m0 */
    public static final int f43700m0 = -2;

    /* renamed from: n0 */
    public static final int f43701n0 = -3;

    /* renamed from: A */
    public ArrayList<C16881f> f43702A = new ArrayList<>();

    /* renamed from: B */
    public HashMap<String, C16848f> f43703B;

    /* renamed from: C */
    public HashMap<String, C16831d> f43704C;

    /* renamed from: D */
    public HashMap<String, C16817c> f43705D;

    /* renamed from: E */
    public C16892m[] f43706E;

    /* renamed from: F */
    public int f43707F;

    /* renamed from: G */
    public int f43708G;

    /* renamed from: H */
    public View f43709H;

    /* renamed from: I */
    public int f43710I;

    /* renamed from: J */
    public float f43711J;

    /* renamed from: K */
    public Interpolator f43712K;

    /* renamed from: L */
    public boolean f43713L;

    /* renamed from: M */
    public String[] f43714M;

    /* renamed from: a */
    public Rect f43715a = new Rect();

    /* renamed from: b */
    public View f43716b;

    /* renamed from: c */
    public int f43717c;

    /* renamed from: d */
    public boolean f43718d = false;

    /* renamed from: e */
    public String f43719e;

    /* renamed from: f */
    public int f43720f = -1;

    /* renamed from: g */
    public C16899r f43721g = new C16899r();

    /* renamed from: h */
    public C16899r f43722h = new C16899r();

    /* renamed from: i */
    public C16894n f43723i = new C16894n();

    /* renamed from: j */
    public C16894n f43724j = new C16894n();

    /* renamed from: k */
    public C16677b[] f43725k;

    /* renamed from: l */
    public C16677b f43726l;

    /* renamed from: m */
    public float f43727m = Float.NaN;

    /* renamed from: n */
    public float f43728n = 0.0f;

    /* renamed from: o */
    public float f43729o = 1.0f;

    /* renamed from: p */
    public float f43730p;

    /* renamed from: q */
    public float f43731q;

    /* renamed from: r */
    public int[] f43732r;

    /* renamed from: s */
    public double[] f43733s;

    /* renamed from: t */
    public double[] f43734t;

    /* renamed from: u */
    public String[] f43735u;

    /* renamed from: v */
    public int[] f43736v;

    /* renamed from: w */
    public int f43737w = 4;

    /* renamed from: x */
    public float[] f43738x = new float[4];

    /* renamed from: y */
    public ArrayList<C16899r> f43739y = new ArrayList<>();

    /* renamed from: z */
    public float[] f43740z = new float[1];

    /* renamed from: androidx.constraintlayout.motion.widget.o$a */
    public class C16896a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ C16680d f43741a;

        public C16896a(C16680d dVar) {
            this.f43741a = dVar;
        }

        public float getInterpolation(float f) {
            return (float) this.f43741a.mo48998a((double) f);
        }
    }

    public C16895o(View view) {
        int i = C16881f.f43372f;
        this.f43707F = i;
        this.f43708G = i;
        this.f43709H = null;
        this.f43710I = i;
        this.f43711J = Float.NaN;
        this.f43712K = null;
        this.f43713L = false;
        mo50238Z(view);
    }

    /* renamed from: v */
    public static Interpolator m77841v(Context context, int i, String str, int i2) {
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, i2);
        }
        if (i == -1) {
            return new C16896a(C16680d.m76169c(str));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    /* renamed from: A */
    public double[] mo50213A(double d) {
        this.f43725k[0].mo48982d(d, this.f43733s);
        C16677b bVar = this.f43726l;
        if (bVar != null) {
            double[] dArr = this.f43733s;
            if (dArr.length > 0) {
                bVar.mo48982d(d, dArr);
            }
        }
        return this.f43733s;
    }

    /* renamed from: B */
    public C16889k mo50214B(int i, int i2, float f, float f2) {
        RectF rectF = new RectF();
        C16899r rVar = this.f43721g;
        float f3 = rVar.f43766e;
        rectF.left = f3;
        float f4 = rVar.f43767f;
        rectF.top = f4;
        rectF.right = f3 + rVar.f43768g;
        rectF.bottom = f4 + rVar.f43769v;
        RectF rectF2 = new RectF();
        C16899r rVar2 = this.f43722h;
        float f5 = rVar2.f43766e;
        rectF2.left = f5;
        float f6 = rVar2.f43767f;
        rectF2.top = f6;
        rectF2.right = f5 + rVar2.f43768g;
        rectF2.bottom = f6 + rVar2.f43769v;
        Iterator<C16881f> it = this.f43702A.iterator();
        while (it.hasNext()) {
            C16881f next = it.next();
            if (next instanceof C16889k) {
                C16889k kVar = (C16889k) next;
                if (kVar.mo50182r(i, i2, rectF, rectF2, f, f2)) {
                    return kVar;
                }
            }
        }
        return null;
    }

    /* renamed from: C */
    public void mo50215C(float f, int i, int i2, float f2, float f3, float[] fArr) {
        C16703o oVar;
        C16703o oVar2;
        C16703o oVar3;
        C16703o oVar4;
        C16703o oVar5;
        C16817c cVar;
        C16817c cVar2;
        C16817c cVar3;
        C16817c cVar4;
        float j = mo50250j(f, this.f43740z);
        HashMap<String, C16831d> hashMap = this.f43704C;
        C16817c cVar5 = null;
        if (hashMap == null) {
            oVar = null;
        } else {
            oVar = hashMap.get("translationX");
        }
        HashMap<String, C16831d> hashMap2 = this.f43704C;
        if (hashMap2 == null) {
            oVar2 = null;
        } else {
            oVar2 = hashMap2.get("translationY");
        }
        HashMap<String, C16831d> hashMap3 = this.f43704C;
        if (hashMap3 == null) {
            oVar3 = null;
        } else {
            oVar3 = hashMap3.get(C16881f.f43375i);
        }
        HashMap<String, C16831d> hashMap4 = this.f43704C;
        if (hashMap4 == null) {
            oVar4 = null;
        } else {
            oVar4 = hashMap4.get("scaleX");
        }
        HashMap<String, C16831d> hashMap5 = this.f43704C;
        if (hashMap5 == null) {
            oVar5 = null;
        } else {
            oVar5 = hashMap5.get("scaleY");
        }
        HashMap<String, C16817c> hashMap6 = this.f43705D;
        if (hashMap6 == null) {
            cVar = null;
        } else {
            cVar = hashMap6.get("translationX");
        }
        HashMap<String, C16817c> hashMap7 = this.f43705D;
        if (hashMap7 == null) {
            cVar2 = null;
        } else {
            cVar2 = hashMap7.get("translationY");
        }
        HashMap<String, C16817c> hashMap8 = this.f43705D;
        if (hashMap8 == null) {
            cVar3 = null;
        } else {
            cVar3 = hashMap8.get(C16881f.f43375i);
        }
        HashMap<String, C16817c> hashMap9 = this.f43705D;
        if (hashMap9 == null) {
            cVar4 = null;
        } else {
            cVar4 = hashMap9.get("scaleX");
        }
        HashMap<String, C16817c> hashMap10 = this.f43705D;
        if (hashMap10 != null) {
            cVar5 = hashMap10.get("scaleY");
        }
        C16729x xVar = new C16729x();
        xVar.mo49118b();
        xVar.mo49120d(oVar3, j);
        xVar.mo49124h(oVar, oVar2, j);
        xVar.mo49122f(oVar4, oVar5, j);
        xVar.mo49119c(cVar3, j);
        xVar.mo49123g(cVar, cVar2, j);
        xVar.mo49121e(cVar4, cVar5, j);
        C16677b bVar = this.f43726l;
        if (bVar != null) {
            double[] dArr = this.f43733s;
            if (dArr.length > 0) {
                double d = (double) j;
                bVar.mo48982d(d, dArr);
                this.f43726l.mo48985g(d, this.f43734t);
                this.f43721g.mo50283o0(f2, f3, fArr, this.f43732r, this.f43734t, this.f43733s);
            }
            xVar.mo49117a(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.f43725k != null) {
            double j2 = (double) mo50250j(j, this.f43740z);
            this.f43725k[0].mo48985g(j2, this.f43734t);
            this.f43725k[0].mo48982d(j2, this.f43733s);
            float f4 = this.f43740z[0];
            while (true) {
                double[] dArr2 = this.f43734t;
                if (i3 < dArr2.length) {
                    dArr2[i3] = dArr2[i3] * ((double) f4);
                    i3++;
                } else {
                    float f5 = f2;
                    float f6 = f3;
                    this.f43721g.mo50283o0(f5, f6, fArr, this.f43732r, dArr2, this.f43733s);
                    xVar.mo49117a(f5, f6, i, i2, fArr);
                    return;
                }
            }
        } else {
            C16899r rVar = this.f43722h;
            float f7 = rVar.f43766e;
            C16899r rVar2 = this.f43721g;
            float f8 = f7 - rVar2.f43766e;
            float f9 = rVar.f43767f - rVar2.f43767f;
            C16817c cVar6 = cVar4;
            float f10 = (rVar.f43769v - rVar2.f43769v) + f9;
            fArr[0] = (f8 * (1.0f - f2)) + (((rVar.f43768g - rVar2.f43768g) + f8) * f2);
            fArr[1] = (f9 * (1.0f - f3)) + (f10 * f3);
            xVar.mo49118b();
            xVar.mo49120d(oVar3, j);
            xVar.mo49124h(oVar, oVar2, j);
            xVar.mo49122f(oVar4, oVar5, j);
            xVar.mo49119c(cVar3, j);
            xVar.mo49123g(cVar, cVar2, j);
            xVar.mo49121e(cVar6, cVar5, j);
            xVar.mo49117a(f2, f3, i, i2, fArr);
        }
    }

    /* renamed from: D */
    public final float mo50216D() {
        char c;
        float f;
        float[] fArr = new float[2];
        float f2 = 1.0f / ((float) 99);
        double d = 0.0d;
        double d2 = 0.0d;
        float f3 = 0.0f;
        int i = 0;
        while (i < 100) {
            float f4 = ((float) i) * f2;
            double d3 = (double) f4;
            C16680d dVar = this.f43721g.f43762a;
            Iterator<C16899r> it = this.f43739y.iterator();
            float f5 = Float.NaN;
            float f6 = 0.0f;
            while (it.hasNext()) {
                C16899r next = it.next();
                C16680d dVar2 = next.f43762a;
                if (dVar2 != null) {
                    float f7 = next.f43764c;
                    if (f7 < f4) {
                        dVar = dVar2;
                        f6 = f7;
                    } else if (Float.isNaN(f5)) {
                        f5 = next.f43764c;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                float f8 = f5 - f6;
                d3 = (double) ((((float) dVar.mo48998a((double) ((f4 - f6) / f8))) * f8) + f6);
            }
            this.f43725k[0].mo48982d(d3, this.f43733s);
            float f9 = f3;
            int i2 = i;
            this.f43721g.mo50268M(d3, this.f43732r, this.f43733s, fArr, 0);
            if (i2 > 0) {
                c = 0;
                f = (float) (((double) f9) + Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0])));
            } else {
                c = 0;
                f = f9;
            }
            d = (double) fArr[c];
            i = i2 + 1;
            f3 = f;
            d2 = (double) fArr[1];
        }
        return f3;
    }

    /* renamed from: E */
    public float mo50217E() {
        return this.f43721g.f43769v;
    }

    /* renamed from: F */
    public float mo50218F() {
        return this.f43721g.f43768g;
    }

    /* renamed from: G */
    public float mo50219G() {
        return this.f43721g.f43766e;
    }

    /* renamed from: H */
    public float mo50220H() {
        return this.f43721g.f43767f;
    }

    /* renamed from: I */
    public int mo50221I() {
        return this.f43708G;
    }

    /* renamed from: J */
    public View mo50222J() {
        return this.f43716b;
    }

    /* renamed from: K */
    public final void mo50223K(C16899r rVar) {
        int binarySearch = Collections.binarySearch(this.f43739y, rVar);
        if (binarySearch == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(" KeyPath position \"");
            sb.append(rVar.f43765d);
            sb.append("\" outside of range");
        }
        this.f43739y.add((-binarySearch) - 1, rVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: androidx.constraintlayout.motion.utils.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: androidx.constraintlayout.motion.utils.f$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo50224L(android.view.View r21, float r22, long r23, androidx.constraintlayout.core.motion.utils.C16685g r25) {
        /*
            r20 = this;
            r0 = r20
            r11 = r21
            r1 = 0
            r2 = r22
            float r2 = r0.mo50250j(r2, r1)
            int r3 = r0.f43710I
            int r4 = androidx.constraintlayout.motion.widget.C16881f.f43372f
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r3 == r4) goto L_0x0042
            float r3 = (float) r3
            float r3 = r13 / r3
            float r4 = r2 / r3
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            float r4 = r4 * r3
            float r2 = r2 % r3
            float r2 = r2 / r3
            float r5 = r0.f43711J
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L_0x002d
            float r5 = r0.f43711J
            float r2 = r2 + r5
            float r2 = r2 % r13
        L_0x002d:
            android.view.animation.Interpolator r5 = r0.f43712K
            if (r5 == 0) goto L_0x0036
            float r2 = r5.getInterpolation(r2)
            goto L_0x0040
        L_0x0036:
            double r5 = (double) r2
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x003f
            r2 = r13
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            float r2 = r2 * r3
            float r2 = r2 + r4
        L_0x0042:
            r14 = r2
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.d> r2 = r0.f43704C
            if (r2 == 0) goto L_0x005f
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x004f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x005f
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.utils.d r3 = (androidx.constraintlayout.motion.utils.C16831d) r3
            r3.mo49940m(r11, r14)
            goto L_0x004f
        L_0x005f:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.f> r2 = r0.f43703B
            r15 = 0
            if (r2 == 0) goto L_0x0093
            java.util.Collection r2 = r2.values()
            java.util.Iterator r7 = r2.iterator()
            r8 = r1
            r9 = r15
        L_0x006e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x008f
            java.lang.Object r1 = r7.next()
            androidx.constraintlayout.motion.utils.f r1 = (androidx.constraintlayout.motion.utils.C16848f) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.utils.C16848f.C16852d
            if (r2 == 0) goto L_0x0082
            r8 = r1
            androidx.constraintlayout.motion.utils.f$d r8 = (androidx.constraintlayout.motion.utils.C16848f.C16852d) r8
            goto L_0x006e
        L_0x0082:
            r2 = r21
            r3 = r14
            r4 = r23
            r6 = r25
            boolean r1 = r1.mo49947j(r2, r3, r4, r6)
            r9 = r9 | r1
            goto L_0x006e
        L_0x008f:
            r16 = r9
            r9 = r8
            goto L_0x0096
        L_0x0093:
            r9 = r1
            r16 = r15
        L_0x0096:
            androidx.constraintlayout.core.motion.utils.b[] r1 = r0.f43725k
            r10 = 1
            if (r1 == 0) goto L_0x01f1
            r1 = r1[r15]
            double r7 = (double) r14
            double[] r2 = r0.f43733s
            r1.mo48982d(r7, r2)
            androidx.constraintlayout.core.motion.utils.b[] r1 = r0.f43725k
            r1 = r1[r15]
            double[] r2 = r0.f43734t
            r1.mo48985g(r7, r2)
            androidx.constraintlayout.core.motion.utils.b r1 = r0.f43726l
            if (r1 == 0) goto L_0x00bf
            double[] r2 = r0.f43733s
            int r3 = r2.length
            if (r3 <= 0) goto L_0x00bf
            r1.mo48982d(r7, r2)
            androidx.constraintlayout.core.motion.utils.b r1 = r0.f43726l
            double[] r2 = r0.f43734t
            r1.mo48985g(r7, r2)
        L_0x00bf:
            boolean r1 = r0.f43713L
            if (r1 != 0) goto L_0x00df
            androidx.constraintlayout.motion.widget.r r1 = r0.f43721g
            int[] r4 = r0.f43732r
            double[] r5 = r0.f43733s
            double[] r6 = r0.f43734t
            r17 = 0
            boolean r3 = r0.f43718d
            r2 = r14
            r18 = r3
            r3 = r21
            r12 = r7
            r7 = r17
            r8 = r18
            r1.mo50284p0(r2, r3, r4, r5, r6, r7, r8)
            r0.f43718d = r15
            goto L_0x00e0
        L_0x00df:
            r12 = r7
        L_0x00e0:
            int r1 = r0.f43708G
            int r2 = androidx.constraintlayout.motion.widget.C16881f.f43372f
            if (r1 == r2) goto L_0x0142
            android.view.View r1 = r0.f43709H
            if (r1 != 0) goto L_0x00f8
            android.view.ViewParent r1 = r21.getParent()
            android.view.View r1 = (android.view.View) r1
            int r2 = r0.f43708G
            android.view.View r1 = r1.findViewById(r2)
            r0.f43709H = r1
        L_0x00f8:
            android.view.View r1 = r0.f43709H
            if (r1 == 0) goto L_0x0142
            int r1 = r1.getTop()
            android.view.View r2 = r0.f43709H
            int r2 = r2.getBottom()
            int r1 = r1 + r2
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            android.view.View r3 = r0.f43709H
            int r3 = r3.getLeft()
            android.view.View r4 = r0.f43709H
            int r4 = r4.getRight()
            int r3 = r3 + r4
            float r3 = (float) r3
            float r3 = r3 / r2
            int r2 = r21.getRight()
            int r4 = r21.getLeft()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0142
            int r2 = r21.getBottom()
            int r4 = r21.getTop()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0142
            int r2 = r21.getLeft()
            float r2 = (float) r2
            float r3 = r3 - r2
            int r2 = r21.getTop()
            float r2 = (float) r2
            float r1 = r1 - r2
            r11.setPivotX(r3)
            r11.setPivotY(r1)
        L_0x0142:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.d> r1 = r0.f43704C
            if (r1 == 0) goto L_0x0170
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x014e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0170
            java.lang.Object r1 = r8.next()
            androidx.constraintlayout.core.motion.utils.o r1 = (androidx.constraintlayout.core.motion.utils.C16703o) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.utils.C16831d.C16835d
            if (r2 == 0) goto L_0x014e
            double[] r2 = r0.f43734t
            int r3 = r2.length
            if (r3 <= r10) goto L_0x014e
            androidx.constraintlayout.motion.utils.d$d r1 = (androidx.constraintlayout.motion.utils.C16831d.C16835d) r1
            r4 = r2[r15]
            r6 = r2[r10]
            r2 = r21
            r3 = r14
            r1.mo49942n(r2, r3, r4, r6)
            goto L_0x014e
        L_0x0170:
            if (r9 == 0) goto L_0x018d
            double[] r1 = r0.f43734t
            r7 = r1[r15]
            r17 = r1[r10]
            r1 = r9
            r2 = r21
            r3 = r25
            r4 = r14
            r5 = r23
            r19 = r10
            r9 = r17
            boolean r1 = r1.mo49949k(r2, r3, r4, r5, r7, r9)
            r1 = r16 | r1
            r16 = r1
            goto L_0x018f
        L_0x018d:
            r19 = r10
        L_0x018f:
            r10 = r19
        L_0x0191:
            androidx.constraintlayout.core.motion.utils.b[] r1 = r0.f43725k
            int r2 = r1.length
            if (r10 >= r2) goto L_0x01b5
            r1 = r1[r10]
            float[] r2 = r0.f43738x
            r1.mo48983e(r12, r2)
            androidx.constraintlayout.motion.widget.r r1 = r0.f43721g
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r1 = r1.f43761Z
            java.lang.String[] r2 = r0.f43735u
            int r3 = r10 + -1
            r2 = r2[r3]
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
            float[] r2 = r0.f43738x
            androidx.constraintlayout.motion.utils.C16814a.m77332b(r1, r11, r2)
            int r10 = r10 + 1
            goto L_0x0191
        L_0x01b5:
            androidx.constraintlayout.motion.widget.n r1 = r0.f43723i
            int r2 = r1.f43664b
            if (r2 != 0) goto L_0x01df
            r2 = 0
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01c6
            int r1 = r1.f43665c
            r11.setVisibility(r1)
            goto L_0x01df
        L_0x01c6:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x01d4
            androidx.constraintlayout.motion.widget.n r1 = r0.f43724j
            int r1 = r1.f43665c
            r11.setVisibility(r1)
            goto L_0x01df
        L_0x01d4:
            androidx.constraintlayout.motion.widget.n r2 = r0.f43724j
            int r2 = r2.f43665c
            int r1 = r1.f43665c
            if (r2 == r1) goto L_0x01df
            r11.setVisibility(r15)
        L_0x01df:
            androidx.constraintlayout.motion.widget.m[] r1 = r0.f43706E
            if (r1 == 0) goto L_0x0241
            r1 = r15
        L_0x01e4:
            androidx.constraintlayout.motion.widget.m[] r2 = r0.f43706E
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0241
            r2 = r2[r1]
            r2.mo50192A(r14, r11)
            int r1 = r1 + 1
            goto L_0x01e4
        L_0x01f1:
            r19 = r10
            androidx.constraintlayout.motion.widget.r r1 = r0.f43721g
            float r2 = r1.f43766e
            androidx.constraintlayout.motion.widget.r r3 = r0.f43722h
            float r4 = r3.f43766e
            float r4 = r4 - r2
            float r4 = r4 * r14
            float r2 = r2 + r4
            float r4 = r1.f43767f
            float r5 = r3.f43767f
            float r5 = r5 - r4
            float r5 = r5 * r14
            float r4 = r4 + r5
            float r5 = r1.f43768g
            float r6 = r3.f43768g
            float r7 = r6 - r5
            float r7 = r7 * r14
            float r7 = r7 + r5
            float r1 = r1.f43769v
            float r3 = r3.f43769v
            float r8 = r3 - r1
            float r8 = r8 * r14
            float r8 = r8 + r1
            r9 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r9
            int r10 = (int) r2
            float r4 = r4 + r9
            int r9 = (int) r4
            float r2 = r2 + r7
            int r2 = (int) r2
            float r4 = r4 + r8
            int r4 = (int) r4
            int r7 = r2 - r10
            int r8 = r4 - r9
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x022f
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x022f
            boolean r1 = r0.f43718d
            if (r1 == 0) goto L_0x023e
        L_0x022f:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            r11.measure(r3, r1)
            r0.f43718d = r15
        L_0x023e:
            r11.layout(r10, r9, r2, r4)
        L_0x0241:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.c> r1 = r0.f43705D
            if (r1 == 0) goto L_0x0270
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x024d:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0270
            java.lang.Object r1 = r8.next()
            androidx.constraintlayout.motion.utils.c r1 = (androidx.constraintlayout.motion.utils.C16817c) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.utils.C16817c.C16821d
            if (r2 == 0) goto L_0x026c
            androidx.constraintlayout.motion.utils.c$d r1 = (androidx.constraintlayout.motion.utils.C16817c.C16821d) r1
            double[] r2 = r0.f43734t
            r4 = r2[r15]
            r6 = r2[r19]
            r2 = r21
            r3 = r14
            r1.mo49939n(r2, r3, r4, r6)
            goto L_0x024d
        L_0x026c:
            r1.mo49938m(r11, r14)
            goto L_0x024d
        L_0x0270:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C16895o.mo50224L(android.view.View, float, long, androidx.constraintlayout.core.motion.utils.g):boolean");
    }

    /* renamed from: M */
    public String mo50225M() {
        return this.f43716b.getContext().getResources().getResourceEntryName(this.f43716b.getId());
    }

    /* renamed from: N */
    public void mo50226N(View view, C16889k kVar, float f, float f2, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        C16899r rVar = this.f43721g;
        float f3 = rVar.f43766e;
        rectF.left = f3;
        float f4 = rVar.f43767f;
        rectF.top = f4;
        rectF.right = f3 + rVar.f43768g;
        rectF.bottom = f4 + rVar.f43769v;
        RectF rectF2 = new RectF();
        C16899r rVar2 = this.f43722h;
        float f5 = rVar2.f43766e;
        rectF2.left = f5;
        float f6 = rVar2.f43767f;
        rectF2.top = f6;
        rectF2.right = f5 + rVar2.f43768g;
        rectF2.bottom = f6 + rVar2.f43769v;
        kVar.mo50183s(view, rectF, rectF2, f, f2, strArr, fArr);
    }

    /* renamed from: O */
    public final void mo50227O(C16899r rVar) {
        rVar.mo50282n0((float) ((int) this.f43716b.getX()), (float) ((int) this.f43716b.getY()), (float) this.f43716b.getWidth(), (float) this.f43716b.getHeight());
    }

    /* renamed from: P */
    public void mo50228P() {
        this.f43718d = true;
    }

    /* renamed from: Q */
    public void mo50229Q(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((i4 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((i6 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i == 4) {
            int i7 = rect.left + rect.right;
            rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
            rect2.top = (i7 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        }
    }

    /* renamed from: R */
    public void mo50230R(View view) {
        C16899r rVar = this.f43721g;
        rVar.f43764c = 0.0f;
        rVar.f43765d = 0.0f;
        this.f43713L = true;
        rVar.mo50282n0(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f43722h.mo50282n0(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f43723i.mo50207h0(view);
        this.f43724j.mo50207h0(view);
    }

    /* renamed from: S */
    public void mo50231S(int i) {
        this.f43721g.f43763b = i;
    }

    /* renamed from: T */
    public void mo50232T(Rect rect, C16934c cVar, int i, int i2) {
        int i3 = cVar.f44576d;
        if (i3 != 0) {
            mo50229Q(rect, this.f43715a, i3, i, i2);
            rect = this.f43715a;
        }
        C16899r rVar = this.f43722h;
        rVar.f43764c = 1.0f;
        rVar.f43765d = 1.0f;
        mo50227O(rVar);
        this.f43722h.mo50282n0((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        this.f43722h.mo50273b(cVar.mo50898q0(this.f43717c));
        this.f43724j.mo50205f0(rect, cVar, i3, this.f43717c);
    }

    /* renamed from: U */
    public void mo50233U(int i) {
        this.f43707F = i;
    }

    /* renamed from: V */
    public void mo50234V(View view) {
        C16899r rVar = this.f43721g;
        rVar.f43764c = 0.0f;
        rVar.f43765d = 0.0f;
        rVar.mo50282n0(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f43723i.mo50207h0(view);
    }

    /* renamed from: W */
    public void mo50235W(Rect rect, C16934c cVar, int i, int i2) {
        int i3 = cVar.f44576d;
        if (i3 != 0) {
            mo50229Q(rect, this.f43715a, i3, i, i2);
        }
        C16899r rVar = this.f43721g;
        rVar.f43764c = 0.0f;
        rVar.f43765d = 0.0f;
        mo50227O(rVar);
        this.f43721g.mo50282n0((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        C16934c.C16935a q0 = cVar.mo50898q0(this.f43717c);
        this.f43721g.mo50273b(q0);
        this.f43727m = q0.f44583d.f44764g;
        this.f43723i.mo50205f0(rect, cVar, i3, this.f43717c);
        this.f43708G = q0.f44585f.f44798i;
        C16934c.C16938c cVar2 = q0.f44583d;
        this.f43710I = cVar2.f44768k;
        this.f43711J = cVar2.f44767j;
        Context context = this.f43716b.getContext();
        C16934c.C16938c cVar3 = q0.f44583d;
        this.f43712K = m77841v(context, cVar3.f44770m, cVar3.f44769l, cVar3.f44771n);
    }

    /* renamed from: X */
    public void mo50236X(C16847e eVar, View view, int i, int i2, int i3) {
        C16899r rVar = this.f43721g;
        rVar.f43764c = 0.0f;
        rVar.f43765d = 0.0f;
        Rect rect = new Rect();
        if (i == 1) {
            int i4 = eVar.f43180b + eVar.f43182d;
            rect.left = ((eVar.f43181c + eVar.f43183e) - eVar.mo49945c()) / 2;
            rect.top = i2 - ((i4 + eVar.mo49944b()) / 2);
            rect.right = rect.left + eVar.mo49945c();
            rect.bottom = rect.top + eVar.mo49944b();
        } else if (i == 2) {
            int i5 = eVar.f43180b + eVar.f43182d;
            rect.left = i3 - (((eVar.f43181c + eVar.f43183e) + eVar.mo49945c()) / 2);
            rect.top = (i5 - eVar.mo49944b()) / 2;
            rect.right = rect.left + eVar.mo49945c();
            rect.bottom = rect.top + eVar.mo49944b();
        }
        this.f43721g.mo50282n0((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        this.f43723i.mo50204e0(rect, view, i, eVar.f43179a);
    }

    /* renamed from: Y */
    public void mo50237Y(int i) {
        this.f43708G = i;
        this.f43709H = null;
    }

    /* renamed from: Z */
    public void mo50238Z(View view) {
        this.f43716b = view;
        this.f43717c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C16926b) {
            this.f43719e = ((ConstraintLayout.C16926b) layoutParams).mo50702a();
        }
    }

    /* renamed from: a */
    public void mo50239a(C16881f fVar) {
        this.f43702A.add(fVar);
    }

    /* renamed from: a0 */
    public void mo50240a0(int i, int i2, float f, long j) {
        ArrayList arrayList;
        String[] strArr;
        boolean z;
        ConstraintAttribute constraintAttribute;
        int i3;
        C16848f fVar;
        ConstraintAttribute constraintAttribute2;
        int i4;
        Integer num;
        C16831d dVar;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashMap hashMap = new HashMap();
        int i5 = this.f43707F;
        if (i5 != C16881f.f43372f) {
            this.f43721g.f43772y = i5;
        }
        this.f43723i.mo50211y(this.f43724j, hashSet2);
        ArrayList<C16881f> arrayList2 = this.f43702A;
        if (arrayList2 != null) {
            Iterator<C16881f> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                C16881f next = it.next();
                if (next instanceof C16887j) {
                    C16887j jVar = (C16887j) next;
                    mo50223K(new C16899r(i, i2, jVar, this.f43721g, this.f43722h));
                    int i6 = jVar.f43539D;
                    if (i6 != C16881f.f43372f) {
                        this.f43720f = i6;
                    }
                } else if (next instanceof C16884h) {
                    next.mo50160d(hashSet3);
                } else if (next instanceof C16890l) {
                    next.mo50160d(hashSet);
                } else if (next instanceof C16892m) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((C16892m) next);
                } else {
                    next.mo50165i(hashMap);
                    next.mo50160d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i7 = 0;
        if (arrayList != null) {
            this.f43706E = (C16892m[]) arrayList.toArray(new C16892m[0]);
        }
        char c = 1;
        if (!hashSet2.isEmpty()) {
            this.f43704C = new HashMap<>();
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    Iterator<C16881f> it3 = this.f43702A.iterator();
                    while (it3.hasNext()) {
                        C16881f next2 = it3.next();
                        HashMap<String, ConstraintAttribute> hashMap2 = next2.f43397e;
                        if (!(hashMap2 == null || (constraintAttribute3 = hashMap2.get(str2)) == null)) {
                            sparseArray.append(next2.f43393a, constraintAttribute3);
                        }
                    }
                    dVar = C16831d.m77356k(str, sparseArray);
                } else {
                    dVar = C16831d.m77357l(str);
                }
                if (dVar != null) {
                    dVar.mo49076i(str);
                    this.f43704C.put(str, dVar);
                }
            }
            ArrayList<C16881f> arrayList3 = this.f43702A;
            if (arrayList3 != null) {
                Iterator<C16881f> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    C16881f next3 = it4.next();
                    if (next3 instanceof C16882g) {
                        next3.mo50156a(this.f43704C);
                    }
                }
            }
            this.f43723i.mo50202b(this.f43704C, 0);
            this.f43724j.mo50202b(this.f43704C, 100);
            for (String next4 : this.f43704C.keySet()) {
                if (!hashMap.containsKey(next4) || (num = (Integer) hashMap.get(next4)) == null) {
                    i4 = 0;
                } else {
                    i4 = num.intValue();
                }
                C16703o oVar = this.f43704C.get(next4);
                if (oVar != null) {
                    oVar.mo49077j(i4);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f43703B == null) {
                this.f43703B = new HashMap<>();
            }
            Iterator it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String str3 = (String) it5.next();
                if (!this.f43703B.containsKey(str3)) {
                    if (str3.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str4 = str3.split(",")[1];
                        Iterator<C16881f> it6 = this.f43702A.iterator();
                        while (it6.hasNext()) {
                            C16881f next5 = it6.next();
                            HashMap<String, ConstraintAttribute> hashMap3 = next5.f43397e;
                            if (!(hashMap3 == null || (constraintAttribute2 = hashMap3.get(str4)) == null)) {
                                sparseArray2.append(next5.f43393a, constraintAttribute2);
                            }
                        }
                        fVar = C16848f.m77381h(str3, sparseArray2);
                        long j2 = j;
                    } else {
                        fVar = C16848f.m77382i(str3, j);
                    }
                    if (fVar != null) {
                        fVar.mo49099e(str3);
                        this.f43703B.put(str3, fVar);
                    }
                }
            }
            ArrayList<C16881f> arrayList4 = this.f43702A;
            if (arrayList4 != null) {
                Iterator<C16881f> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    C16881f next6 = it7.next();
                    if (next6 instanceof C16890l) {
                        ((C16890l) next6).mo50191W(this.f43703B);
                    }
                }
            }
            for (String next7 : this.f43703B.keySet()) {
                if (hashMap.containsKey(next7)) {
                    i3 = ((Integer) hashMap.get(next7)).intValue();
                } else {
                    i3 = 0;
                }
                this.f43703B.get(next7).mo49100f(i3);
            }
        }
        int i8 = 2;
        int size = this.f43739y.size() + 2;
        C16899r[] rVarArr = new C16899r[size];
        rVarArr[0] = this.f43721g;
        rVarArr[size - 1] = this.f43722h;
        if (this.f43739y.size() > 0 && this.f43720f == -1) {
            this.f43720f = 0;
        }
        Iterator<C16899r> it8 = this.f43739y.iterator();
        int i9 = 1;
        while (it8.hasNext()) {
            rVarArr[i9] = it8.next();
            i9++;
        }
        HashSet hashSet4 = new HashSet();
        for (String next8 : this.f43722h.f43761Z.keySet()) {
            if (this.f43721g.f43761Z.containsKey(next8)) {
                if (!hashSet2.contains("CUSTOM," + next8)) {
                    hashSet4.add(next8);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f43735u = strArr2;
        this.f43736v = new int[strArr2.length];
        int i10 = 0;
        while (true) {
            strArr = this.f43735u;
            if (i10 >= strArr.length) {
                break;
            }
            String str5 = strArr[i10];
            this.f43736v[i10] = 0;
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    if (rVarArr[i11].f43761Z.containsKey(str5) && (constraintAttribute = rVarArr[i11].f43761Z.get(str5)) != null) {
                        int[] iArr = this.f43736v;
                        iArr[i10] = iArr[i10] + constraintAttribute.mo50637p();
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            i10++;
        }
        if (rVarArr[0].f43772y != C16881f.f43372f) {
            z = true;
        } else {
            z = false;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i12 = 1; i12 < size; i12++) {
            rVarArr[i12].mo50288w(rVarArr[i12 - 1], zArr, this.f43735u, z);
        }
        int i13 = 0;
        for (int i14 = 1; i14 < length; i14++) {
            if (zArr[i14]) {
                i13++;
            }
        }
        this.f43732r = new int[i13];
        int max = Math.max(2, i13);
        this.f43733s = new double[max];
        this.f43734t = new double[max];
        int i15 = 0;
        for (int i16 = 1; i16 < length; i16++) {
            if (zArr[i16]) {
                this.f43732r[i15] = i16;
                i15++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[1] = this.f43732r.length;
        iArr2[0] = size;
        double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, iArr2);
        double[] dArr2 = new double[size];
        for (int i17 = 0; i17 < size; i17++) {
            rVarArr[i17].mo50289y(dArr[i17], this.f43732r);
            dArr2[i17] = (double) rVarArr[i17].f43764c;
        }
        int i18 = 0;
        while (true) {
            int[] iArr3 = this.f43732r;
            if (i18 >= iArr3.length) {
                break;
            }
            if (iArr3[i18] < C16899r.f43754U0.length) {
                String str6 = C16899r.f43754U0[this.f43732r[i18]] + " [";
                for (int i19 = 0; i19 < size; i19++) {
                    str6 = str6 + dArr[i19][i18];
                }
            }
            i18++;
        }
        this.f43725k = new C16677b[(this.f43735u.length + 1)];
        int i20 = 0;
        while (true) {
            String[] strArr3 = this.f43735u;
            if (i20 >= strArr3.length) {
                break;
            }
            String str7 = strArr3[i20];
            int i21 = i7;
            int i22 = i21;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i21 < size) {
                if (rVarArr[i21].mo50276f0(str7)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr4 = new int[i8];
                        iArr4[c] = rVarArr[i21].mo50272Z(str7);
                        iArr4[i7] = size;
                        dArr4 = (double[][]) Array.newInstance(Double.TYPE, iArr4);
                    }
                    C16899r rVar = rVarArr[i21];
                    dArr3[i22] = (double) rVar.f43764c;
                    rVar.mo50271X(str7, dArr4[i22], 0);
                    i22++;
                }
                i21++;
                i8 = 2;
                i7 = 0;
                c = 1;
            }
            i20++;
            this.f43725k[i20] = C16677b.m76154a(this.f43720f, Arrays.copyOf(dArr3, i22), (double[][]) Arrays.copyOf(dArr4, i22));
            i8 = 2;
            i7 = 0;
            c = 1;
        }
        this.f43725k[0] = C16677b.m76154a(this.f43720f, dArr2, dArr);
        if (rVarArr[0].f43772y != C16881f.f43372f) {
            int[] iArr5 = new int[size];
            double[] dArr5 = new double[size];
            int[] iArr6 = new int[2];
            iArr6[1] = 2;
            iArr6[0] = size;
            double[][] dArr6 = (double[][]) Array.newInstance(Double.TYPE, iArr6);
            for (int i23 = 0; i23 < size; i23++) {
                C16899r rVar2 = rVarArr[i23];
                iArr5[i23] = rVar2.f43772y;
                dArr5[i23] = (double) rVar2.f43764c;
                double[] dArr7 = dArr6[i23];
                dArr7[0] = (double) rVar2.f43766e;
                dArr7[1] = (double) rVar2.f43767f;
            }
            this.f43726l = C16677b.m76155b(iArr5, dArr5, dArr6);
        }
        this.f43705D = new HashMap<>();
        if (this.f43702A != null) {
            Iterator it9 = hashSet3.iterator();
            float f2 = Float.NaN;
            while (it9.hasNext()) {
                String str8 = (String) it9.next();
                C16817c l = C16817c.m77339l(str8);
                if (l != null) {
                    if (l.mo49027k() && Float.isNaN(f2)) {
                        f2 = mo50216D();
                    }
                    l.mo49025i(str8);
                    this.f43705D.put(str8, l);
                }
            }
            Iterator<C16881f> it10 = this.f43702A.iterator();
            while (it10.hasNext()) {
                C16881f next9 = it10.next();
                if (next9 instanceof C16884h) {
                    ((C16884h) next9).mo50172a0(this.f43705D);
                }
            }
            for (C16817c j3 : this.f43705D.values()) {
                j3.mo49026j(f2);
            }
        }
    }

    /* renamed from: b */
    public void mo50241b(ArrayList<C16881f> arrayList) {
        this.f43702A.addAll(arrayList);
    }

    /* renamed from: b0 */
    public void mo50242b0(C16895o oVar) {
        this.f43721g.mo50287t0(oVar, oVar.f43721g);
        this.f43722h.mo50287t0(oVar, oVar.f43722h);
    }

    /* renamed from: c */
    public void mo50243c(float[] fArr, int i) {
        int i2 = i;
        float f = 1.0f / ((float) (i2 - 1));
        HashMap<String, C16831d> hashMap = this.f43704C;
        if (hashMap != null) {
            C16703o oVar = hashMap.get("translationX");
        }
        HashMap<String, C16831d> hashMap2 = this.f43704C;
        if (hashMap2 != null) {
            C16703o oVar2 = hashMap2.get("translationY");
        }
        HashMap<String, C16817c> hashMap3 = this.f43705D;
        if (hashMap3 != null) {
            C16817c cVar = hashMap3.get("translationX");
        }
        HashMap<String, C16817c> hashMap4 = this.f43705D;
        if (hashMap4 != null) {
            C16817c cVar2 = hashMap4.get("translationY");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            float f2 = ((float) i3) * f;
            float f3 = this.f43729o;
            float f4 = 0.0f;
            if (f3 != 1.0f) {
                float f5 = this.f43728n;
                if (f2 < f5) {
                    f2 = 0.0f;
                }
                if (f2 > f5 && ((double) f2) < 1.0d) {
                    f2 = Math.min((f2 - f5) * f3, 1.0f);
                }
            }
            double d = (double) f2;
            C16680d dVar = this.f43721g.f43762a;
            Iterator<C16899r> it = this.f43739y.iterator();
            float f6 = Float.NaN;
            while (it.hasNext()) {
                C16899r next = it.next();
                C16680d dVar2 = next.f43762a;
                if (dVar2 != null) {
                    float f7 = next.f43764c;
                    if (f7 < f2) {
                        dVar = dVar2;
                        f4 = f7;
                    } else if (Float.isNaN(f6)) {
                        f6 = next.f43764c;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                float f8 = f6 - f4;
                d = (double) ((((float) dVar.mo48998a((double) ((f2 - f4) / f8))) * f8) + f4);
            }
            this.f43725k[0].mo48982d(d, this.f43733s);
            C16677b bVar = this.f43726l;
            if (bVar != null) {
                double[] dArr = this.f43733s;
                if (dArr.length > 0) {
                    bVar.mo48982d(d, dArr);
                }
            }
            this.f43721g.mo50290z(this.f43732r, this.f43733s, fArr, i3 * 2);
        }
    }

    /* renamed from: d */
    public int mo50244d(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h = this.f43725k[0].mo48986h();
        if (iArr != null) {
            Iterator<C16899r> it = this.f43739y.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().f43755E0;
                i++;
            }
        }
        int i2 = 0;
        for (double d : h) {
            this.f43725k[0].mo48982d(d, this.f43733s);
            this.f43721g.mo50290z(this.f43732r, this.f43733s, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* renamed from: e */
    public int mo50245e(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h = this.f43725k[0].mo48986h();
        if (iArr != null) {
            Iterator<C16899r> it = this.f43739y.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().f43755E0;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < h.length; i3++) {
            this.f43725k[0].mo48982d(h[i3], this.f43733s);
            this.f43721g.mo50268M(h[i3], this.f43732r, this.f43733s, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* renamed from: f */
    public void mo50246f(float[] fArr, int i) {
        C16703o oVar;
        C16703o oVar2;
        C16817c cVar;
        double d;
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / ((float) (i2 - 1));
        HashMap<String, C16831d> hashMap = this.f43704C;
        C16817c cVar2 = null;
        if (hashMap == null) {
            oVar = null;
        } else {
            oVar = hashMap.get("translationX");
        }
        HashMap<String, C16831d> hashMap2 = this.f43704C;
        if (hashMap2 == null) {
            oVar2 = null;
        } else {
            oVar2 = hashMap2.get("translationY");
        }
        HashMap<String, C16817c> hashMap3 = this.f43705D;
        if (hashMap3 == null) {
            cVar = null;
        } else {
            cVar = hashMap3.get("translationX");
        }
        HashMap<String, C16817c> hashMap4 = this.f43705D;
        if (hashMap4 != null) {
            cVar2 = hashMap4.get("translationY");
        }
        C16817c cVar3 = cVar2;
        int i3 = 0;
        while (i3 < i2) {
            float f3 = ((float) i3) * f2;
            float f4 = this.f43729o;
            float f5 = 0.0f;
            if (f4 != f) {
                float f6 = this.f43728n;
                if (f3 < f6) {
                    f3 = 0.0f;
                }
                if (f3 > f6 && ((double) f3) < 1.0d) {
                    f3 = Math.min((f3 - f6) * f4, f);
                }
            }
            float f7 = f3;
            double d2 = (double) f7;
            C16680d dVar = this.f43721g.f43762a;
            Iterator<C16899r> it = this.f43739y.iterator();
            float f8 = Float.NaN;
            while (it.hasNext()) {
                C16899r next = it.next();
                C16680d dVar2 = next.f43762a;
                double d3 = d2;
                if (dVar2 != null) {
                    float f9 = next.f43764c;
                    if (f9 < f7) {
                        f5 = f9;
                        dVar = dVar2;
                    } else if (Float.isNaN(f8)) {
                        f8 = next.f43764c;
                    }
                }
                d2 = d3;
            }
            double d4 = d2;
            if (dVar != null) {
                if (Float.isNaN(f8)) {
                    f8 = 1.0f;
                }
                float f10 = f8 - f5;
                d = (double) ((((float) dVar.mo48998a((double) ((f7 - f5) / f10))) * f10) + f5);
            } else {
                d = d4;
            }
            this.f43725k[0].mo48982d(d, this.f43733s);
            C16677b bVar = this.f43726l;
            if (bVar != null) {
                double[] dArr = this.f43733s;
                if (dArr.length > 0) {
                    bVar.mo48982d(d, dArr);
                }
            }
            int i4 = i3 * 2;
            float f11 = f7;
            int i5 = i3;
            this.f43721g.mo50268M(d, this.f43732r, this.f43733s, fArr, i4);
            if (cVar != null) {
                fArr[i4] = fArr[i4] + cVar.mo49018a(f11);
            } else if (oVar != null) {
                fArr[i4] = fArr[i4] + oVar.mo49071a(f11);
            }
            if (cVar3 != null) {
                int i6 = i4 + 1;
                fArr[i6] = fArr[i6] + cVar3.mo49018a(f11);
            } else if (oVar2 != null) {
                int i7 = i4 + 1;
                fArr[i7] = fArr[i7] + oVar2.mo49071a(f11);
            }
            i3 = i5 + 1;
            f = 1.0f;
        }
    }

    /* renamed from: g */
    public void mo50247g(float f, float[] fArr, int i) {
        this.f43725k[0].mo48982d((double) mo50250j(f, (float[]) null), this.f43733s);
        this.f43721g.mo50275e0(this.f43732r, this.f43733s, fArr, i);
    }

    /* renamed from: h */
    public void mo50248h(float[] fArr, int i) {
        float f = 1.0f / ((float) (i - 1));
        for (int i2 = 0; i2 < i; i2++) {
            this.f43725k[0].mo48982d((double) mo50250j(((float) i2) * f, (float[]) null), this.f43733s);
            this.f43721g.mo50275e0(this.f43732r, this.f43733s, fArr, i2 * 8);
        }
    }

    /* renamed from: i */
    public void mo50249i(boolean z) {
        float f;
        if (C9175a.f24945j0.equals(C16878c.m77588k(this.f43716b)) && this.f43706E != null) {
            int i = 0;
            while (true) {
                C16892m[] mVarArr = this.f43706E;
                if (i < mVarArr.length) {
                    C16892m mVar = mVarArr[i];
                    if (z) {
                        f = -100.0f;
                    } else {
                        f = 100.0f;
                    }
                    mVar.mo50192A(f, this.f43716b);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: j */
    public final float mo50250j(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.f43729o;
            if (((double) f4) != 1.0d) {
                float f5 = this.f43728n;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && ((double) f) < 1.0d) {
                    f = Math.min((f - f5) * f4, 1.0f);
                }
            }
        }
        C16680d dVar = this.f43721g.f43762a;
        Iterator<C16899r> it = this.f43739y.iterator();
        float f6 = Float.NaN;
        while (it.hasNext()) {
            C16899r next = it.next();
            C16680d dVar2 = next.f43762a;
            if (dVar2 != null) {
                float f7 = next.f43764c;
                if (f7 < f) {
                    dVar = dVar2;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.f43764c;
                }
            }
        }
        if (dVar != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (double) ((f - f2) / f8);
            f = (((float) dVar.mo48998a(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) dVar.mo48999b(d);
            }
        }
        return f;
    }

    /* renamed from: k */
    public int mo50251k() {
        return this.f43721g.f43773z;
    }

    /* renamed from: l */
    public int mo50252l(String str, float[] fArr, int i) {
        C16703o oVar = this.f43704C.get(str);
        if (oVar == null) {
            return -1;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = oVar.mo49071a((float) (i2 / (fArr.length - 1)));
        }
        return fArr.length;
    }

    /* renamed from: m */
    public void mo50253m(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f43725k[0].mo48982d(d, dArr);
        this.f43725k[0].mo48985g(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f43721g.mo50269Q(d, this.f43732r, dArr, fArr, dArr2, fArr2);
    }

    /* renamed from: n */
    public float mo50254n() {
        return this.f43730p;
    }

    /* renamed from: o */
    public float mo50255o() {
        return this.f43731q;
    }

    /* renamed from: p */
    public void mo50256p(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float j = mo50250j(f, this.f43740z);
        C16677b[] bVarArr = this.f43725k;
        int i = 0;
        if (bVarArr != null) {
            double d = (double) j;
            bVarArr[0].mo48985g(d, this.f43734t);
            this.f43725k[0].mo48982d(d, this.f43733s);
            float f4 = this.f43740z[0];
            while (true) {
                dArr = this.f43734t;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * ((double) f4);
                i++;
            }
            C16677b bVar = this.f43726l;
            if (bVar != null) {
                double[] dArr2 = this.f43733s;
                if (dArr2.length > 0) {
                    bVar.mo48982d(d, dArr2);
                    this.f43726l.mo48985g(d, this.f43734t);
                    this.f43721g.mo50283o0(f2, f3, fArr, this.f43732r, this.f43734t, this.f43733s);
                    return;
                }
                return;
            }
            this.f43721g.mo50283o0(f2, f3, fArr, this.f43732r, dArr, this.f43733s);
            return;
        }
        C16899r rVar = this.f43722h;
        float f5 = rVar.f43766e;
        C16899r rVar2 = this.f43721g;
        float f6 = f5 - rVar2.f43766e;
        float f7 = rVar.f43767f - rVar2.f43767f;
        float f8 = (rVar.f43768g - rVar2.f43768g) + f6;
        float f9 = (rVar.f43769v - rVar2.f43769v) + f7;
        fArr[0] = (f6 * (1.0f - f2)) + (f8 * f2);
        fArr[1] = (f7 * (1.0f - f3)) + (f9 * f3);
    }

    /* renamed from: q */
    public int mo50257q() {
        int i = this.f43721g.f43763b;
        Iterator<C16899r> it = this.f43739y.iterator();
        while (it.hasNext()) {
            i = Math.max(i, it.next().f43763b);
        }
        return Math.max(i, this.f43722h.f43763b);
    }

    /* renamed from: r */
    public float mo50258r() {
        return this.f43722h.f43769v;
    }

    /* renamed from: s */
    public float mo50259s() {
        return this.f43722h.f43768g;
    }

    /* renamed from: t */
    public float mo50260t() {
        return this.f43722h.f43766e;
    }

    public String toString() {
        return " start: x: " + this.f43721g.f43766e + " y: " + this.f43721g.f43767f + " end: x: " + this.f43722h.f43766e + " y: " + this.f43722h.f43767f;
    }

    /* renamed from: u */
    public float mo50262u() {
        return this.f43722h.f43767f;
    }

    /* renamed from: w */
    public C16899r mo50263w(int i) {
        return this.f43739y.get(i);
    }

    /* renamed from: x */
    public int mo50264x(int i, int[] iArr) {
        int i2 = i;
        float[] fArr = new float[2];
        Iterator<C16881f> it = this.f43702A.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            C16881f next = it.next();
            int i5 = next.f43396d;
            if (i5 == i2 || i2 != -1) {
                iArr[i4] = 0;
                int i6 = i4 + 1;
                iArr[i6] = i5;
                int i7 = i6 + 1;
                int i8 = next.f43393a;
                iArr[i7] = i8;
                double d = (double) (((float) i8) / 100.0f);
                this.f43725k[0].mo48982d(d, this.f43733s);
                this.f43721g.mo50268M(d, this.f43732r, this.f43733s, fArr, 0);
                int i9 = i7 + 1;
                iArr[i9] = Float.floatToIntBits(fArr[0]);
                int i10 = i9 + 1;
                iArr[i10] = Float.floatToIntBits(fArr[1]);
                if (next instanceof C16887j) {
                    C16887j jVar = (C16887j) next;
                    int i11 = i10 + 1;
                    iArr[i11] = jVar.f43522O;
                    int i12 = i11 + 1;
                    iArr[i12] = Float.floatToIntBits(jVar.f43518K);
                    i10 = i12 + 1;
                    iArr[i10] = Float.floatToIntBits(jVar.f43519L);
                }
                int i13 = i10 + 1;
                iArr[i4] = i13 - i4;
                i3++;
                i4 = i13;
            }
        }
        return i3;
    }

    /* renamed from: y */
    public float mo50265y(int i, float f, float f2) {
        C16899r rVar = this.f43722h;
        float f3 = rVar.f43766e;
        C16899r rVar2 = this.f43721g;
        float f4 = rVar2.f43766e;
        float f5 = f3 - f4;
        float f6 = rVar.f43767f;
        float f7 = rVar2.f43767f;
        float f8 = f6 - f7;
        float f9 = f4 + (rVar2.f43768g / 2.0f);
        float f10 = f7 + (rVar2.f43769v / 2.0f);
        float hypot = (float) Math.hypot((double) f5, (double) f8);
        if (((double) hypot) < 1.0E-7d) {
            return Float.NaN;
        }
        float f11 = f - f9;
        float f12 = f2 - f10;
        if (((float) Math.hypot((double) f11, (double) f12)) == 0.0f) {
            return 0.0f;
        }
        float f13 = (f11 * f5) + (f12 * f8);
        if (i == 0) {
            return f13 / hypot;
        }
        if (i == 1) {
            return (float) Math.sqrt((double) ((hypot * hypot) - (f13 * f13)));
        }
        if (i == 2) {
            return f11 / f5;
        }
        if (i == 3) {
            return f12 / f5;
        }
        if (i == 4) {
            return f11 / f8;
        }
        if (i != 5) {
            return 0.0f;
        }
        return f12 / f8;
    }

    /* renamed from: z */
    public int mo50266z(int[] iArr, float[] fArr) {
        Iterator<C16881f> it = this.f43702A.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            C16881f next = it.next();
            int i3 = next.f43393a;
            iArr[i] = (next.f43396d * 1000) + i3;
            double d = (double) (((float) i3) / 100.0f);
            this.f43725k[0].mo48982d(d, this.f43733s);
            this.f43721g.mo50268M(d, this.f43732r, this.f43733s, fArr, i2);
            i2 += 2;
            i++;
        }
        return i;
    }
}
