package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.utils.C16831d;
import androidx.constraintlayout.widget.C16944e;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: androidx.constraintlayout.motion.widget.m */
public class C16892m extends C16881f {

    /* renamed from: Y */
    public static final String f43591Y = "KeyTrigger";

    /* renamed from: Z */
    public static final String f43592Z = "KeyTrigger";

    /* renamed from: a0 */
    public static final String f43593a0 = "viewTransitionOnCross";

    /* renamed from: b0 */
    public static final String f43594b0 = "viewTransitionOnPositiveCross";

    /* renamed from: c0 */
    public static final String f43595c0 = "viewTransitionOnNegativeCross";

    /* renamed from: d0 */
    public static final String f43596d0 = "postLayout";

    /* renamed from: e0 */
    public static final String f43597e0 = "triggerSlack";

    /* renamed from: f0 */
    public static final String f43598f0 = "triggerCollisionView";

    /* renamed from: g0 */
    public static final String f43599g0 = "triggerCollisionId";

    /* renamed from: h0 */
    public static final String f43600h0 = "triggerID";

    /* renamed from: i0 */
    public static final String f43601i0 = "positiveCross";

    /* renamed from: j0 */
    public static final String f43602j0 = "negativeCross";

    /* renamed from: k0 */
    public static final String f43603k0 = "triggerReceiver";

    /* renamed from: l0 */
    public static final String f43604l0 = "CROSS";

    /* renamed from: m0 */
    public static final int f43605m0 = 5;

    /* renamed from: D */
    public int f43606D = -1;

    /* renamed from: E */
    public String f43607E = null;

    /* renamed from: F */
    public int f43608F;

    /* renamed from: G */
    public String f43609G;

    /* renamed from: H */
    public String f43610H;

    /* renamed from: I */
    public int f43611I;

    /* renamed from: J */
    public int f43612J;

    /* renamed from: K */
    public View f43613K;

    /* renamed from: L */
    public float f43614L;

    /* renamed from: M */
    public boolean f43615M;

    /* renamed from: N */
    public boolean f43616N;

    /* renamed from: O */
    public boolean f43617O;

    /* renamed from: P */
    public float f43618P;

    /* renamed from: Q */
    public float f43619Q;

    /* renamed from: R */
    public boolean f43620R;

    /* renamed from: S */
    public int f43621S;

    /* renamed from: T */
    public int f43622T;

    /* renamed from: U */
    public int f43623U;

    /* renamed from: V */
    public RectF f43624V;

    /* renamed from: W */
    public RectF f43625W;

    /* renamed from: X */
    public HashMap<String, Method> f43626X;

    /* renamed from: androidx.constraintlayout.motion.widget.m$a */
    public static class C16893a {

        /* renamed from: a */
        public static final int f43627a = 1;

        /* renamed from: b */
        public static final int f43628b = 2;

        /* renamed from: c */
        public static final int f43629c = 4;

        /* renamed from: d */
        public static final int f43630d = 5;

        /* renamed from: e */
        public static final int f43631e = 6;

        /* renamed from: f */
        public static final int f43632f = 7;

        /* renamed from: g */
        public static final int f43633g = 8;

        /* renamed from: h */
        public static final int f43634h = 9;

        /* renamed from: i */
        public static final int f43635i = 10;

        /* renamed from: j */
        public static final int f43636j = 11;

        /* renamed from: k */
        public static final int f43637k = 12;

        /* renamed from: l */
        public static final int f43638l = 13;

        /* renamed from: m */
        public static final int f43639m = 14;

        /* renamed from: n */
        public static SparseIntArray f43640n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f43640n = sparseIntArray;
            sparseIntArray.append(C16944e.C16957m.KeyTrigger_framePosition, 8);
            f43640n.append(C16944e.C16957m.KeyTrigger_onCross, 4);
            f43640n.append(C16944e.C16957m.KeyTrigger_onNegativeCross, 1);
            f43640n.append(C16944e.C16957m.KeyTrigger_onPositiveCross, 2);
            f43640n.append(C16944e.C16957m.KeyTrigger_motionTarget, 7);
            f43640n.append(C16944e.C16957m.KeyTrigger_triggerId, 6);
            f43640n.append(C16944e.C16957m.KeyTrigger_triggerSlack, 5);
            f43640n.append(C16944e.C16957m.KeyTrigger_motion_triggerOnCollision, 9);
            f43640n.append(C16944e.C16957m.KeyTrigger_motion_postLayoutCollision, 10);
            f43640n.append(C16944e.C16957m.KeyTrigger_triggerReceiver, 11);
            f43640n.append(C16944e.C16957m.KeyTrigger_viewTransitionOnCross, 12);
            f43640n.append(C16944e.C16957m.KeyTrigger_viewTransitionOnNegativeCross, 13);
            f43640n.append(C16944e.C16957m.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        /* renamed from: a */
        public static void m77825a(C16892m mVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f43640n.get(index)) {
                    case 1:
                        String unused = mVar.f43609G = typedArray.getString(index);
                        break;
                    case 2:
                        String unused2 = mVar.f43610H = typedArray.getString(index);
                        break;
                    case 4:
                        String unused3 = mVar.f43607E = typedArray.getString(index);
                        break;
                    case 5:
                        mVar.f43614L = typedArray.getFloat(index, mVar.f43614L);
                        break;
                    case 6:
                        int unused4 = mVar.f43611I = typedArray.getResourceId(index, mVar.f43611I);
                        break;
                    case 7:
                        if (!MotionLayout.f43205d2) {
                            if (typedArray.peekValue(index).type != 3) {
                                mVar.f43394b = typedArray.getResourceId(index, mVar.f43394b);
                                break;
                            } else {
                                mVar.f43395c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, mVar.f43394b);
                            mVar.f43394b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                mVar.f43395c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, mVar.f43393a);
                        mVar.f43393a = integer;
                        float unused5 = mVar.f43618P = (((float) integer) + 0.5f) / 100.0f;
                        break;
                    case 9:
                        int unused6 = mVar.f43612J = typedArray.getResourceId(index, mVar.f43612J);
                        break;
                    case 10:
                        boolean unused7 = mVar.f43620R = typedArray.getBoolean(index, mVar.f43620R);
                        break;
                    case 11:
                        int unused8 = mVar.f43608F = typedArray.getResourceId(index, mVar.f43608F);
                        break;
                    case 12:
                        mVar.f43623U = typedArray.getResourceId(index, mVar.f43623U);
                        break;
                    case 13:
                        mVar.f43621S = typedArray.getResourceId(index, mVar.f43621S);
                        break;
                    case 14:
                        mVar.f43622T = typedArray.getResourceId(index, mVar.f43622T);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f43640n.get(index));
                        break;
                }
            }
        }
    }

    public C16892m() {
        int i = C16881f.f43372f;
        this.f43608F = i;
        this.f43609G = null;
        this.f43610H = null;
        this.f43611I = i;
        this.f43612J = i;
        this.f43613K = null;
        this.f43614L = 0.1f;
        this.f43615M = true;
        this.f43616N = true;
        this.f43617O = true;
        this.f43618P = Float.NaN;
        this.f43620R = false;
        this.f43621S = i;
        this.f43622T = i;
        this.f43623U = i;
        this.f43624V = new RectF();
        this.f43625W = new RectF();
        this.f43626X = new HashMap<>();
        this.f43396d = 5;
        this.f43397e = new HashMap<>();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50192A(float r10, android.view.View r11) {
        /*
            r9 = this;
            int r0 = r9.f43612J
            int r1 = androidx.constraintlayout.motion.widget.C16881f.f43372f
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0062
            android.view.View r0 = r9.f43613K
            if (r0 != 0) goto L_0x001a
            android.view.ViewParent r0 = r11.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r9.f43612J
            android.view.View r0 = r0.findViewById(r1)
            r9.f43613K = r0
        L_0x001a:
            android.graphics.RectF r0 = r9.f43624V
            android.view.View r1 = r9.f43613K
            boolean r4 = r9.f43620R
            r9.mo50196E(r0, r1, r4)
            android.graphics.RectF r0 = r9.f43625W
            boolean r1 = r9.f43620R
            r9.mo50196E(r0, r11, r1)
            android.graphics.RectF r0 = r9.f43624V
            android.graphics.RectF r1 = r9.f43625W
            boolean r0 = r0.intersect(r1)
            if (r0 == 0) goto L_0x004c
            boolean r0 = r9.f43615M
            if (r0 == 0) goto L_0x003c
            r9.f43615M = r3
            r0 = r2
            goto L_0x003d
        L_0x003c:
            r0 = r3
        L_0x003d:
            boolean r1 = r9.f43617O
            if (r1 == 0) goto L_0x0045
            r9.f43617O = r3
            r1 = r2
            goto L_0x0046
        L_0x0045:
            r1 = r3
        L_0x0046:
            r9.f43616N = r2
            r4 = r1
            r1 = r3
            goto L_0x00e0
        L_0x004c:
            boolean r0 = r9.f43615M
            if (r0 != 0) goto L_0x0054
            r9.f43615M = r2
            r0 = r2
            goto L_0x0055
        L_0x0054:
            r0 = r3
        L_0x0055:
            boolean r1 = r9.f43616N
            if (r1 == 0) goto L_0x005d
            r9.f43616N = r3
            r1 = r2
            goto L_0x005e
        L_0x005d:
            r1 = r3
        L_0x005e:
            r9.f43617O = r2
            goto L_0x00df
        L_0x0062:
            boolean r0 = r9.f43615M
            r1 = 0
            if (r0 == 0) goto L_0x0077
            float r0 = r9.f43618P
            float r4 = r10 - r0
            float r5 = r9.f43619Q
            float r5 = r5 - r0
            float r4 = r4 * r5
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0087
            r9.f43615M = r3
            r0 = r2
            goto L_0x0088
        L_0x0077:
            float r0 = r9.f43618P
            float r0 = r10 - r0
            float r0 = java.lang.Math.abs(r0)
            float r4 = r9.f43614L
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            r9.f43615M = r2
        L_0x0087:
            r0 = r3
        L_0x0088:
            boolean r4 = r9.f43616N
            if (r4 == 0) goto L_0x00a0
            float r4 = r9.f43618P
            float r5 = r10 - r4
            float r6 = r9.f43619Q
            float r6 = r6 - r4
            float r6 = r6 * r5
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b0
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b0
            r9.f43616N = r3
            r4 = r2
            goto L_0x00b1
        L_0x00a0:
            float r4 = r9.f43618P
            float r4 = r10 - r4
            float r4 = java.lang.Math.abs(r4)
            float r5 = r9.f43614L
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b0
            r9.f43616N = r2
        L_0x00b0:
            r4 = r3
        L_0x00b1:
            boolean r5 = r9.f43617O
            if (r5 == 0) goto L_0x00ce
            float r5 = r9.f43618P
            float r6 = r10 - r5
            float r7 = r9.f43619Q
            float r7 = r7 - r5
            float r7 = r7 * r6
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x00c9
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c9
            r9.f43617O = r3
            r1 = r2
            goto L_0x00ca
        L_0x00c9:
            r1 = r3
        L_0x00ca:
            r8 = r4
            r4 = r1
            r1 = r8
            goto L_0x00e0
        L_0x00ce:
            float r1 = r9.f43618P
            float r1 = r10 - r1
            float r1 = java.lang.Math.abs(r1)
            float r5 = r9.f43614L
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00de
            r9.f43617O = r2
        L_0x00de:
            r1 = r4
        L_0x00df:
            r4 = r3
        L_0x00e0:
            r9.f43619Q = r10
            if (r1 != 0) goto L_0x00e8
            if (r0 != 0) goto L_0x00e8
            if (r4 == 0) goto L_0x00f3
        L_0x00e8:
            android.view.ViewParent r5 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r5 = (androidx.constraintlayout.motion.widget.MotionLayout) r5
            int r6 = r9.f43611I
            r5.mo50018l0(r6, r4, r10)
        L_0x00f3:
            int r10 = r9.f43608F
            int r5 = androidx.constraintlayout.motion.widget.C16881f.f43372f
            if (r10 != r5) goto L_0x00fb
            r10 = r11
            goto L_0x0107
        L_0x00fb:
            android.view.ViewParent r10 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
            int r5 = r9.f43608F
            android.view.View r10 = r10.findViewById(r5)
        L_0x0107:
            if (r1 == 0) goto L_0x0125
            java.lang.String r1 = r9.f43609G
            if (r1 == 0) goto L_0x0110
            r9.mo50193B(r1, r10)
        L_0x0110:
            int r1 = r9.f43621S
            int r5 = androidx.constraintlayout.motion.widget.C16881f.f43372f
            if (r1 == r5) goto L_0x0125
            android.view.ViewParent r1 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = (androidx.constraintlayout.motion.widget.MotionLayout) r1
            int r5 = r9.f43621S
            android.view.View[] r6 = new android.view.View[r2]
            r6[r3] = r10
            r1.mo49989X0(r5, r6)
        L_0x0125:
            if (r4 == 0) goto L_0x0143
            java.lang.String r1 = r9.f43610H
            if (r1 == 0) goto L_0x012e
            r9.mo50193B(r1, r10)
        L_0x012e:
            int r1 = r9.f43622T
            int r4 = androidx.constraintlayout.motion.widget.C16881f.f43372f
            if (r1 == r4) goto L_0x0143
            android.view.ViewParent r1 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = (androidx.constraintlayout.motion.widget.MotionLayout) r1
            int r4 = r9.f43622T
            android.view.View[] r5 = new android.view.View[r2]
            r5[r3] = r10
            r1.mo49989X0(r4, r5)
        L_0x0143:
            if (r0 == 0) goto L_0x0161
            java.lang.String r0 = r9.f43607E
            if (r0 == 0) goto L_0x014c
            r9.mo50193B(r0, r10)
        L_0x014c:
            int r0 = r9.f43623U
            int r1 = androidx.constraintlayout.motion.widget.C16881f.f43372f
            if (r0 == r1) goto L_0x0161
            android.view.ViewParent r11 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = (androidx.constraintlayout.motion.widget.MotionLayout) r11
            int r0 = r9.f43623U
            android.view.View[] r1 = new android.view.View[r2]
            r1[r3] = r10
            r11.mo49989X0(r0, r1)
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C16892m.mo50192A(float, android.view.View):void");
    }

    /* renamed from: B */
    public final void mo50193B(String str, View view) {
        Method method;
        if (str != null) {
            if (str.startsWith(".")) {
                mo50194C(str, view);
                return;
            }
            if (this.f43626X.containsKey(str)) {
                method = this.f43626X.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.f43626X.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f43626X.put(str, (Object) null);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not find method \"");
                    sb.append(str);
                    sb.append("\"on class ");
                    sb.append(view.getClass().getSimpleName());
                    sb.append(" ");
                    sb.append(C16878c.m77588k(view));
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Exception in call \"");
                sb2.append(this.f43607E);
                sb2.append("\"on class ");
                sb2.append(view.getClass().getSimpleName());
                sb2.append(" ");
                sb2.append(C16878c.m77588k(view));
            }
        }
    }

    /* renamed from: C */
    public final void mo50194C(String str, View view) {
        boolean z;
        ConstraintAttribute constraintAttribute;
        if (str.length() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String next : this.f43397e.keySet()) {
            String lowerCase = next.toLowerCase(Locale.ROOT);
            if ((z || lowerCase.matches(str)) && (constraintAttribute = this.f43397e.get(next)) != null) {
                constraintAttribute.mo50624a(view);
            }
        }
    }

    /* renamed from: D */
    public int mo50195D() {
        return this.f43606D;
    }

    /* renamed from: E */
    public final void mo50196E(RectF rectF, View view, boolean z) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* renamed from: a */
    public void mo50156a(HashMap<String, C16831d> hashMap) {
    }

    /* renamed from: b */
    public C16881f clone() {
        return new C16892m().mo50158c(this);
    }

    /* renamed from: c */
    public C16881f mo50158c(C16881f fVar) {
        super.mo50158c(fVar);
        C16892m mVar = (C16892m) fVar;
        this.f43606D = mVar.f43606D;
        this.f43607E = mVar.f43607E;
        this.f43608F = mVar.f43608F;
        this.f43609G = mVar.f43609G;
        this.f43610H = mVar.f43610H;
        this.f43611I = mVar.f43611I;
        this.f43612J = mVar.f43612J;
        this.f43613K = mVar.f43613K;
        this.f43614L = mVar.f43614L;
        this.f43615M = mVar.f43615M;
        this.f43616N = mVar.f43616N;
        this.f43617O = mVar.f43617O;
        this.f43618P = mVar.f43618P;
        this.f43619Q = mVar.f43619Q;
        this.f43620R = mVar.f43620R;
        this.f43624V = mVar.f43624V;
        this.f43625W = mVar.f43625W;
        this.f43626X = mVar.f43626X;
        return this;
    }

    /* renamed from: d */
    public void mo50160d(HashSet<String> hashSet) {
    }

    /* renamed from: f */
    public void mo50162f(Context context, AttributeSet attributeSet) {
        C16893a.m77825a(this, context.obtainStyledAttributes(attributeSet, C16944e.C16957m.KeyTrigger), context);
    }

    /* renamed from: j */
    public void mo50166j(String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1594793529:
                if (str.equals("positiveCross")) {
                    c = 0;
                    break;
                }
                break;
            case -966421266:
                if (str.equals("viewTransitionOnPositiveCross")) {
                    c = 1;
                    break;
                }
                break;
            case -786670827:
                if (str.equals("triggerCollisionId")) {
                    c = 2;
                    break;
                }
                break;
            case -648752941:
                if (str.equals("triggerID")) {
                    c = 3;
                    break;
                }
                break;
            case -638126837:
                if (str.equals("negativeCross")) {
                    c = 4;
                    break;
                }
                break;
            case -76025313:
                if (str.equals("triggerCollisionView")) {
                    c = 5;
                    break;
                }
                break;
            case -9754574:
                if (str.equals("viewTransitionOnNegativeCross")) {
                    c = 6;
                    break;
                }
                break;
            case 64397344:
                if (str.equals("CROSS")) {
                    c = 7;
                    break;
                }
                break;
            case 364489912:
                if (str.equals("triggerSlack")) {
                    c = 8;
                    break;
                }
                break;
            case 1301930599:
                if (str.equals("viewTransitionOnCross")) {
                    c = 9;
                    break;
                }
                break;
            case 1401391082:
                if (str.equals("postLayout")) {
                    c = 10;
                    break;
                }
                break;
            case 1535404999:
                if (str.equals("triggerReceiver")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f43610H = obj.toString();
                return;
            case 1:
                this.f43622T = mo50170n(obj);
                return;
            case 2:
                this.f43612J = mo50170n(obj);
                return;
            case 3:
                this.f43611I = mo50170n(obj);
                return;
            case 4:
                this.f43609G = obj.toString();
                return;
            case 5:
                this.f43613K = (View) obj;
                return;
            case 6:
                this.f43621S = mo50170n(obj);
                return;
            case 7:
                this.f43607E = obj.toString();
                return;
            case 8:
                this.f43614L = mo50169m(obj);
                return;
            case 9:
                this.f43623U = mo50170n(obj);
                return;
            case 10:
                this.f43620R = mo50168l(obj);
                return;
            case 11:
                this.f43608F = mo50170n(obj);
                return;
            default:
                return;
        }
    }
}
