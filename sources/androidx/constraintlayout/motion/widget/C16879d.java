package androidx.constraintlayout.motion.widget;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16934c;
import com.carrefour.fid.android.core.extension.C36306e;
import java.io.PrintStream;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.motion.widget.d */
public class C16879d implements C16905u {

    /* renamed from: g */
    public static final boolean f43359g = false;

    /* renamed from: h */
    public static final String f43360h = "DesignTool";

    /* renamed from: i */
    public static final HashMap<Pair<Integer, Integer>, String> f43361i;

    /* renamed from: j */
    public static final HashMap<String, String> f43362j;

    /* renamed from: a */
    public final MotionLayout f43363a;

    /* renamed from: b */
    public C16900s f43364b;

    /* renamed from: c */
    public String f43365c = null;

    /* renamed from: d */
    public String f43366d = null;

    /* renamed from: e */
    public int f43367e = -1;

    /* renamed from: f */
    public int f43368f = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> hashMap = new HashMap<>();
        f43361i = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        f43362j = hashMap2;
        hashMap.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        hashMap.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        hashMap.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        hashMap.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        hashMap.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        hashMap.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        hashMap.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        hashMap.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        hashMap.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        hashMap.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        hashMap.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        hashMap.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        hashMap.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public C16879d(MotionLayout motionLayout) {
        this.f43363a = motionLayout;
    }

    /* renamed from: j */
    public static void m77593j(int i, C16934c cVar, View view, HashMap<String, String> hashMap, int i2, int i3) {
        int i4;
        String str = f43361i.get(Pair.create(Integer.valueOf(i2), Integer.valueOf(i3)));
        String str2 = hashMap.get(str);
        if (str2 != null) {
            String str3 = f43362j.get(str);
            if (str3 != null) {
                i4 = m77594k(i, hashMap.get(str3));
            } else {
                i4 = 0;
            }
            int parseInt = Integer.parseInt(str2);
            C16934c cVar2 = cVar;
            cVar2.mo50832L(view.getId(), i2, parseInt, i3, i4);
        }
    }

    /* renamed from: k */
    public static int m77594k(int i, String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) (((float) (Integer.valueOf(str.substring(0, indexOf)).intValue() * i)) / 160.0f);
    }

    /* renamed from: l */
    public static void m77595l(int i, C16934c cVar, View view, HashMap<String, String> hashMap) {
        String str = hashMap.get("layout_editor_absoluteX");
        if (str != null) {
            cVar.mo50851W0(view.getId(), m77594k(i, str));
        }
        String str2 = hashMap.get("layout_editor_absoluteY");
        if (str2 != null) {
            cVar.mo50853X0(view.getId(), m77594k(i, str2));
        }
    }

    /* renamed from: m */
    public static void m77596m(C16934c cVar, View view, HashMap<String, String> hashMap, int i) {
        String str;
        if (i == 1) {
            str = "layout_constraintVertical_bias";
        } else {
            str = "layout_constraintHorizontal_bias";
        }
        String str2 = hashMap.get(str);
        if (str2 == null) {
            return;
        }
        if (i == 0) {
            cVar.mo50869f1(view.getId(), Float.parseFloat(str2));
        } else if (i == 1) {
            cVar.mo50808A1(view.getId(), Float.parseFloat(str2));
        }
    }

    /* renamed from: n */
    public static void m77597n(int i, C16934c cVar, View view, HashMap<String, String> hashMap, int i2) {
        String str;
        int i3;
        if (i2 == 1) {
            str = "layout_height";
        } else {
            str = "layout_width";
        }
        String str2 = hashMap.get(str);
        if (str2 != null) {
            if (!str2.equalsIgnoreCase("wrap_content")) {
                i3 = m77594k(i, str2);
            } else {
                i3 = -2;
            }
            if (i2 == 0) {
                cVar.mo50850W(view.getId(), i3);
            } else {
                cVar.mo50840P(view.getId(), i3);
            }
        }
    }

    /* renamed from: A */
    public String mo50128A() {
        if (!(this.f43365c == null || this.f43366d == null)) {
            float y = mo50153y();
            if (y <= 0.01f) {
                return this.f43365c;
            }
            if (y >= 0.99f) {
                return this.f43366d;
            }
        }
        return this.f43365c;
    }

    /* renamed from: B */
    public boolean mo50129B() {
        return (this.f43365c == null || this.f43366d == null) ? false : true;
    }

    /* renamed from: C */
    public void mo50130C(Object obj, String str, Object obj2) {
        if (obj instanceof C16881f) {
            ((C16881f) obj).mo50166j(str, obj2);
            this.f43363a.mo49965F0();
            this.f43363a.f43231K0 = true;
        }
    }

    /* renamed from: D */
    public void mo50131D(String str) {
        if (str == null) {
            str = "motion_base";
        }
        if (this.f43365c != str) {
            this.f43365c = str;
            this.f43366d = null;
            MotionLayout motionLayout = this.f43363a;
            if (motionLayout.f43256a == null) {
                motionLayout.f43256a = this.f43364b;
            }
            int A0 = motionLayout.mo49960A0(str);
            this.f43367e = A0;
            if (A0 != 0) {
                if (A0 == this.f43363a.getStartState()) {
                    this.f43363a.setProgress(0.0f);
                } else if (A0 == this.f43363a.getEndState()) {
                    this.f43363a.setProgress(1.0f);
                } else {
                    this.f43363a.mo49976Q0(A0);
                    this.f43363a.setProgress(1.0f);
                }
            }
            this.f43363a.requestLayout();
        }
    }

    /* renamed from: E */
    public void mo50132E(String str, String str2) {
        MotionLayout motionLayout = this.f43363a;
        if (motionLayout.f43256a == null) {
            motionLayout.f43256a = this.f43364b;
        }
        int A0 = motionLayout.mo49960A0(str);
        int A02 = this.f43363a.mo49960A0(str2);
        this.f43363a.setTransition(A0, A02);
        this.f43367e = A0;
        this.f43368f = A02;
        this.f43365c = str;
        this.f43366d = str2;
    }

    /* renamed from: F */
    public void mo50133F(Object obj, int i) {
        C16895o oVar;
        if ((obj instanceof View) && (oVar = this.f43363a.f43290y.get(obj)) != null) {
            oVar.mo50231S(i);
            this.f43363a.invalidate();
        }
    }

    /* renamed from: a */
    public long mo50134a() {
        return this.f43363a.getTransitionTimeMs();
    }

    /* renamed from: b */
    public int mo50135b(int i, String str, Object obj, float[] fArr, int i2, float[] fArr2, int i3) {
        C16895o oVar;
        View view = (View) obj;
        if (i != 0) {
            MotionLayout motionLayout = this.f43363a;
            if (motionLayout.f43256a == null || view == null || (oVar = motionLayout.f43290y.get(view)) == null) {
                return -1;
            }
        } else {
            oVar = null;
        }
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            int t = this.f43363a.f43256a.mo50348t() / 16;
            oVar.mo50246f(fArr2, t);
            return t;
        } else if (i == 2) {
            int t2 = this.f43363a.f43256a.mo50348t() / 16;
            oVar.mo50245e(fArr2, (int[]) null);
            return t2;
        } else if (i != 3) {
            return -1;
        } else {
            int t3 = this.f43363a.f43256a.mo50348t() / 16;
            return oVar.mo50252l(str, fArr2, i3);
        }
    }

    /* renamed from: c */
    public Boolean mo50136c(Object obj, Object obj2, float f, float f2, String[] strArr, float[] fArr) {
        if (!(obj instanceof C16889k)) {
            return Boolean.FALSE;
        }
        View view = (View) obj2;
        this.f43363a.f43290y.get(view).mo50226N(view, (C16889k) obj, f, f2, strArr, fArr);
        this.f43363a.mo49965F0();
        this.f43363a.f43231K0 = true;
        return Boolean.TRUE;
    }

    /* renamed from: d */
    public boolean mo50137d(Object obj, int i, int i2, float f, float f2) {
        if (!(obj instanceof View)) {
            return false;
        }
        MotionLayout motionLayout = this.f43363a;
        if (motionLayout.f43256a != null) {
            C16895o oVar = motionLayout.f43290y.get(obj);
            MotionLayout motionLayout2 = this.f43363a;
            int i3 = (int) (motionLayout2.f43221F0 * 100.0f);
            if (oVar != null) {
                View view = (View) obj;
                if (motionLayout2.f43256a.mo50308S(view, i3)) {
                    float y = oVar.mo50265y(2, f, f2);
                    float y2 = oVar.mo50265y(5, f, f2);
                    this.f43363a.f43256a.mo50334l0(view, i3, "motion:percentX", Float.valueOf(y));
                    this.f43363a.f43256a.mo50334l0(view, i3, "motion:percentY", Float.valueOf(y2));
                    this.f43363a.mo49965F0();
                    this.f43363a.mo49999g0(true);
                    this.f43363a.invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public void mo50138e(float f) {
        MotionLayout motionLayout = this.f43363a;
        if (motionLayout.f43256a == null) {
            motionLayout.f43256a = this.f43364b;
        }
        motionLayout.setProgress(f);
        this.f43363a.mo49999g0(true);
        this.f43363a.requestLayout();
        this.f43363a.invalidate();
    }

    /* renamed from: f */
    public void mo50139f(Object obj, int i, String str, Object obj2) {
        C16900s sVar = this.f43363a.f43256a;
        if (sVar != null) {
            sVar.mo50334l0((View) obj, i, str, obj2);
            MotionLayout motionLayout = this.f43363a;
            motionLayout.f43227I0 = ((float) i) / 100.0f;
            motionLayout.f43223G0 = 0.0f;
            motionLayout.mo49965F0();
            this.f43363a.mo49999g0(true);
        }
    }

    /* renamed from: g */
    public void mo50140g(int i, String str, Object obj, Object obj2) {
        View view = (View) obj;
        HashMap hashMap = (HashMap) obj2;
        int A0 = this.f43363a.mo49960A0(str);
        C16934c o = this.f43363a.f43256a.mo50339o(A0);
        if (o != null) {
            o.mo50816E(view.getId());
            m77597n(i, o, view, hashMap, 0);
            m77597n(i, o, view, hashMap, 1);
            int i2 = i;
            C16934c cVar = o;
            View view2 = view;
            HashMap hashMap2 = hashMap;
            m77593j(i2, cVar, view2, hashMap2, 6, 6);
            m77593j(i2, cVar, view2, hashMap2, 6, 7);
            m77593j(i2, cVar, view2, hashMap2, 7, 7);
            m77593j(i2, cVar, view2, hashMap2, 7, 6);
            m77593j(i2, cVar, view2, hashMap2, 1, 1);
            m77593j(i2, cVar, view2, hashMap2, 1, 2);
            m77593j(i2, cVar, view2, hashMap2, 2, 2);
            m77593j(i2, cVar, view2, hashMap2, 2, 1);
            m77593j(i2, cVar, view2, hashMap2, 3, 3);
            m77593j(i2, cVar, view2, hashMap2, 3, 4);
            m77593j(i2, cVar, view2, hashMap2, 4, 3);
            m77593j(i2, cVar, view2, hashMap2, 4, 4);
            m77593j(i2, cVar, view2, hashMap2, 5, 5);
            m77596m(o, view, hashMap, 0);
            m77596m(o, view, hashMap, 1);
            m77595l(i, o, view, hashMap);
            this.f43363a.mo49985V0(A0, o);
            this.f43363a.requestLayout();
        }
    }

    /* renamed from: h */
    public float mo50141h(Object obj, int i, float f, float f2) {
        C16895o oVar;
        if ((obj instanceof View) && (oVar = this.f43363a.f43290y.get((View) obj)) != null) {
            return oVar.mo50265y(i, f, f2);
        }
        return 0.0f;
    }

    /* renamed from: i */
    public Object mo50142i(Object obj, float f, float f2) {
        C16895o oVar;
        View view = (View) obj;
        MotionLayout motionLayout = this.f43363a;
        if (motionLayout.f43256a == null) {
            return -1;
        }
        if (view == null || (oVar = motionLayout.f43290y.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return oVar.mo50214B(viewGroup.getWidth(), viewGroup.getHeight(), f, f2);
    }

    /* renamed from: o */
    public void mo50143o(boolean z) {
        this.f43363a.mo49994c0(z);
    }

    /* renamed from: p */
    public void mo50144p(String str) {
        MotionLayout motionLayout = this.f43363a;
        if (motionLayout.f43256a == null) {
            motionLayout.f43256a = this.f43364b;
        }
        int A0 = motionLayout.mo49960A0(str);
        PrintStream printStream = System.out;
        printStream.println(" dumping  " + str + C36306e.f89637a + A0 + ")");
        try {
            this.f43363a.f43256a.mo50339o(A0).mo50870g0(this.f43363a.f43256a, new int[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: q */
    public int mo50145q(Object obj, float[] fArr) {
        C16900s sVar = this.f43363a.f43256a;
        if (sVar == null) {
            return -1;
        }
        int t = sVar.mo50348t() / 16;
        C16895o oVar = this.f43363a.f43290y.get(obj);
        if (oVar == null) {
            return 0;
        }
        oVar.mo50245e(fArr, (int[]) null);
        return t;
    }

    /* renamed from: r */
    public int mo50146r(Object obj, float[] fArr, int i) {
        MotionLayout motionLayout = this.f43363a;
        if (motionLayout.f43256a == null) {
            return -1;
        }
        C16895o oVar = motionLayout.f43290y.get(obj);
        if (oVar == null) {
            return 0;
        }
        oVar.mo50246f(fArr, i);
        return i;
    }

    /* renamed from: s */
    public void mo50147s(Object obj, float[] fArr) {
        C16900s sVar = this.f43363a.f43256a;
        if (sVar != null) {
            int t = sVar.mo50348t() / 16;
            C16895o oVar = this.f43363a.f43290y.get(obj);
            if (oVar != null) {
                oVar.mo50248h(fArr, t);
            }
        }
    }

    /* renamed from: t */
    public String mo50148t() {
        int endState = this.f43363a.getEndState();
        if (this.f43368f == endState) {
            return this.f43366d;
        }
        String o0 = this.f43363a.mo50022o0(endState);
        if (o0 != null) {
            this.f43366d = o0;
            this.f43368f = endState;
        }
        return o0;
    }

    /* renamed from: u */
    public int mo50149u(Object obj, int i, int[] iArr) {
        C16895o oVar = this.f43363a.f43290y.get((View) obj);
        if (oVar == null) {
            return 0;
        }
        return oVar.mo50264x(i, iArr);
    }

    /* renamed from: v */
    public int mo50150v(Object obj, int[] iArr, float[] fArr) {
        C16895o oVar = this.f43363a.f43290y.get((View) obj);
        if (oVar == null) {
            return 0;
        }
        return oVar.mo50266z(iArr, fArr);
    }

    /* renamed from: w */
    public Object mo50151w(int i, int i2, int i3) {
        MotionLayout motionLayout = this.f43363a;
        C16900s sVar = motionLayout.f43256a;
        if (sVar == null) {
            return null;
        }
        return sVar.mo50354y(motionLayout.getContext(), i, i2, i3);
    }

    /* renamed from: x */
    public Object mo50152x(Object obj, int i, int i2) {
        if (this.f43363a.f43256a == null) {
            return null;
        }
        int id = ((View) obj).getId();
        MotionLayout motionLayout = this.f43363a;
        return motionLayout.f43256a.mo50354y(motionLayout.getContext(), i, id, i2);
    }

    /* renamed from: y */
    public float mo50153y() {
        return this.f43363a.getProgress();
    }

    /* renamed from: z */
    public String mo50154z() {
        int startState = this.f43363a.getStartState();
        if (this.f43367e == startState) {
            return this.f43365c;
        }
        String o0 = this.f43363a.mo50022o0(startState);
        if (o0 != null) {
            this.f43365c = o0;
            this.f43367e = startState;
        }
        return this.f43363a.mo50022o0(startState);
    }
}
