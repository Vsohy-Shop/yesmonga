package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.C16680d;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.C16944e;
import androidx.constraintlayout.widget.C16960g;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.motion.widget.s */
public class C16900s {

    /* renamed from: A */
    public static final int f43774A = -1;

    /* renamed from: B */
    public static final int f43775B = -2;

    /* renamed from: C */
    public static final int f43776C = -1;

    /* renamed from: D */
    public static final int f43777D = 0;

    /* renamed from: E */
    public static final int f43778E = 1;

    /* renamed from: F */
    public static final int f43779F = 2;

    /* renamed from: G */
    public static final String f43780G = "MotionScene";

    /* renamed from: H */
    public static final String f43781H = "Transition";

    /* renamed from: I */
    public static final String f43782I = "OnSwipe";

    /* renamed from: J */
    public static final String f43783J = "OnClick";

    /* renamed from: K */
    public static final String f43784K = "StateSet";

    /* renamed from: L */
    public static final String f43785L = "Include";

    /* renamed from: M */
    public static final String f43786M = "include";

    /* renamed from: N */
    public static final String f43787N = "KeyFrameSet";

    /* renamed from: O */
    public static final String f43788O = "ConstraintSet";

    /* renamed from: P */
    public static final String f43789P = "ViewTransition";

    /* renamed from: Q */
    public static final int f43790Q = 0;

    /* renamed from: R */
    public static final int f43791R = 1;

    /* renamed from: S */
    public static final int f43792S = 2;

    /* renamed from: T */
    public static final int f43793T = 3;

    /* renamed from: U */
    public static final int f43794U = 4;

    /* renamed from: V */
    public static final int f43795V = 5;

    /* renamed from: W */
    public static final int f43796W = 6;

    /* renamed from: v */
    public static final String f43797v = "MotionScene";

    /* renamed from: w */
    public static final boolean f43798w = false;

    /* renamed from: x */
    public static final int f43799x = 8;

    /* renamed from: y */
    public static final int f43800y = 0;

    /* renamed from: z */
    public static final int f43801z = 1;

    /* renamed from: a */
    public final MotionLayout f43802a;

    /* renamed from: b */
    public C16960g f43803b = null;

    /* renamed from: c */
    public C16902b f43804c = null;

    /* renamed from: d */
    public boolean f43805d = false;

    /* renamed from: e */
    public ArrayList<C16902b> f43806e = new ArrayList<>();

    /* renamed from: f */
    public C16902b f43807f = null;

    /* renamed from: g */
    public ArrayList<C16902b> f43808g = new ArrayList<>();

    /* renamed from: h */
    public SparseArray<C16934c> f43809h = new SparseArray<>();

    /* renamed from: i */
    public HashMap<String, Integer> f43810i = new HashMap<>();

    /* renamed from: j */
    public SparseIntArray f43811j = new SparseIntArray();

    /* renamed from: k */
    public boolean f43812k = false;

    /* renamed from: l */
    public int f43813l = 400;

    /* renamed from: m */
    public int f43814m = 0;

    /* renamed from: n */
    public MotionEvent f43815n;

    /* renamed from: o */
    public boolean f43816o = false;

    /* renamed from: p */
    public boolean f43817p = false;

    /* renamed from: q */
    public MotionLayout.C16870i f43818q;

    /* renamed from: r */
    public boolean f43819r;

    /* renamed from: s */
    public final C16875a0 f43820s;

    /* renamed from: t */
    public float f43821t;

    /* renamed from: u */
    public float f43822u;

    /* renamed from: androidx.constraintlayout.motion.widget.s$a */
    public class C16901a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ C16680d f43823a;

        public C16901a(C16900s sVar, C16680d dVar) {
            this.f43823a = dVar;
        }

        public float getInterpolation(float f) {
            return (float) this.f43823a.mo48998a((double) f);
        }
    }

    public C16900s(MotionLayout motionLayout) {
        this.f43802a = motionLayout;
        this.f43820s = new C16875a0(motionLayout);
    }

    /* renamed from: A */
    public static String m77927A(Context context, int i, XmlPullParser xmlPullParser) {
        return ".(" + C16878c.m77586i(context, i) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }

    /* renamed from: q0 */
    public static String m77933q0(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    /* renamed from: B */
    public float mo50291B() {
        C16902b bVar = this.f43804c;
        if (bVar == null || bVar.f43852l == null) {
            return 0.0f;
        }
        return this.f43804c.f43852l.mo50446i();
    }

    /* renamed from: C */
    public float mo50292C() {
        C16902b bVar = this.f43804c;
        if (bVar == null || bVar.f43852l == null) {
            return 0.0f;
        }
        return this.f43804c.f43852l.mo50447j();
    }

    /* renamed from: D */
    public boolean mo50293D() {
        C16902b bVar = this.f43804c;
        if (bVar == null || bVar.f43852l == null) {
            return false;
        }
        return this.f43804c.f43852l.mo50448k();
    }

    /* renamed from: E */
    public float mo50294E(View view, int i) {
        return 0.0f;
    }

    /* renamed from: F */
    public float mo50295F(float f, float f2) {
        C16902b bVar = this.f43804c;
        if (bVar == null || bVar.f43852l == null) {
            return 0.0f;
        }
        return this.f43804c.f43852l.mo50449l(f, f2);
    }

    /* renamed from: G */
    public final int mo50296G(int i) {
        int e;
        C16960g gVar = this.f43803b;
        if (gVar == null || (e = gVar.mo50994e(i, -1, -1)) == -1) {
            return i;
        }
        return e;
    }

    /* renamed from: H */
    public int mo50297H() {
        C16902b bVar = this.f43804c;
        if (bVar == null || bVar.f43852l == null) {
            return 0;
        }
        return this.f43804c.f43852l.mo50450m();
    }

    /* renamed from: I */
    public float mo50298I() {
        C16902b bVar = this.f43804c;
        if (bVar == null || bVar.f43852l == null) {
            return 0.0f;
        }
        return this.f43804c.f43852l.mo50451n();
    }

    /* renamed from: J */
    public float mo50299J() {
        C16902b bVar = this.f43804c;
        if (bVar == null || bVar.f43852l == null) {
            return 0.0f;
        }
        return this.f43804c.f43852l.mo50452o();
    }

    /* renamed from: K */
    public float mo50300K() {
        C16902b bVar = this.f43804c;
        if (bVar == null || bVar.f43852l == null) {
            return 0.0f;
        }
        return this.f43804c.f43852l.mo50453p();
    }

    /* renamed from: L */
    public float mo50301L() {
        C16902b bVar = this.f43804c;
        if (bVar == null || bVar.f43852l == null) {
            return 0.0f;
        }
        return this.f43804c.f43852l.mo50454q();
    }

    /* renamed from: M */
    public float mo50302M() {
        C16902b bVar = this.f43804c;
        if (bVar != null) {
            return bVar.f43849i;
        }
        return 0.0f;
    }

    /* renamed from: N */
    public int mo50303N() {
        C16902b bVar = this.f43804c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f43844d;
    }

    /* renamed from: O */
    public C16902b mo50304O(int i) {
        Iterator<C16902b> it = this.f43806e.iterator();
        while (it.hasNext()) {
            C16902b next = it.next();
            if (next.f43841a == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: P */
    public int mo50305P(int i) {
        Iterator<C16902b> it = this.f43806e.iterator();
        while (it.hasNext()) {
            if (it.next().f43844d == i) {
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: Q */
    public List<C16902b> mo50306Q(int i) {
        int G = mo50296G(i);
        ArrayList arrayList = new ArrayList();
        Iterator<C16902b> it = this.f43806e.iterator();
        while (it.hasNext()) {
            C16902b next = it.next();
            if (next.f43844d == G || next.f43843c == G) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: R */
    public final boolean mo50307R(int i) {
        int i2 = this.f43811j.get(i);
        int size = this.f43811j.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.f43811j.get(i2);
            size = i3;
        }
        return false;
    }

    /* renamed from: S */
    public boolean mo50308S(View view, int i) {
        C16902b bVar = this.f43804c;
        if (bVar == null) {
            return false;
        }
        Iterator it = bVar.f43851k.iterator();
        while (it.hasNext()) {
            Iterator<C16881f> it2 = ((C16886i) it.next()).mo50177d(view.getId()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().f43393a == i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: T */
    public final boolean mo50309T() {
        return this.f43818q != null;
    }

    /* renamed from: U */
    public boolean mo50310U(int i) {
        return this.f43820s.mo50117h(i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50311V(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r0 = r0.getXml(r10)
            int r1 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r2 = 0
        L_0x000d:
            r3 = 1
            if (r1 == r3) goto L_0x016c
            if (r1 == 0) goto L_0x015a
            r4 = 2
            if (r1 == r4) goto L_0x0017
            goto L_0x015d
        L_0x0017:
            java.lang.String r1 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            boolean r5 = r8.f43812k     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            if (r5 == 0) goto L_0x0035
            java.io.PrintStream r5 = java.lang.System.out     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            java.lang.String r7 = "parsing = "
            r6.append(r7)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r6.append(r1)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            java.lang.String r6 = r6.toString()     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r5.println(r6)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
        L_0x0035:
            int r5 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r6 = -1
            switch(r5) {
                case -1349929691: goto L_0x009a;
                case -1239391468: goto L_0x008f;
                case -687739768: goto L_0x0085;
                case 61998586: goto L_0x007a;
                case 269306229: goto L_0x0071;
                case 312750793: goto L_0x0067;
                case 327855227: goto L_0x005d;
                case 793277014: goto L_0x0053;
                case 1382829617: goto L_0x0049;
                case 1942574248: goto L_0x003f;
                default: goto L_0x003d;
            }     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
        L_0x003d:
            goto L_0x00a4
        L_0x003f:
            java.lang.String r3 = "include"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            if (r1 == 0) goto L_0x00a4
            r3 = 6
            goto L_0x00a5
        L_0x0049:
            java.lang.String r3 = "StateSet"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            if (r1 == 0) goto L_0x00a4
            r3 = 4
            goto L_0x00a5
        L_0x0053:
            java.lang.String r3 = "MotionScene"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            if (r1 == 0) goto L_0x00a4
            r3 = 0
            goto L_0x00a5
        L_0x005d:
            java.lang.String r3 = "OnSwipe"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            if (r1 == 0) goto L_0x00a4
            r3 = r4
            goto L_0x00a5
        L_0x0067:
            java.lang.String r3 = "OnClick"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            if (r1 == 0) goto L_0x00a4
            r3 = 3
            goto L_0x00a5
        L_0x0071:
            java.lang.String r4 = "Transition"
            boolean r1 = r1.equals(r4)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            if (r1 == 0) goto L_0x00a4
            goto L_0x00a5
        L_0x007a:
            java.lang.String r3 = "ViewTransition"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            if (r1 == 0) goto L_0x00a4
            r3 = 9
            goto L_0x00a5
        L_0x0085:
            java.lang.String r3 = "Include"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            if (r1 == 0) goto L_0x00a4
            r3 = 7
            goto L_0x00a5
        L_0x008f:
            java.lang.String r3 = "KeyFrameSet"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            if (r1 == 0) goto L_0x00a4
            r3 = 8
            goto L_0x00a5
        L_0x009a:
            java.lang.String r3 = "ConstraintSet"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            if (r1 == 0) goto L_0x00a4
            r3 = 5
            goto L_0x00a5
        L_0x00a4:
            r3 = r6
        L_0x00a5:
            switch(r3) {
                case 0: goto L_0x0156;
                case 1: goto L_0x0115;
                case 2: goto L_0x00e0;
                case 3: goto L_0x00d9;
                case 4: goto L_0x00d0;
                case 5: goto L_0x00cb;
                case 6: goto L_0x00c6;
                case 7: goto L_0x00c6;
                case 8: goto L_0x00b6;
                case 9: goto L_0x00aa;
                default: goto L_0x00a8;
            }     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
        L_0x00a8:
            goto L_0x015d
        L_0x00aa:
            androidx.constraintlayout.motion.widget.z r1 = new androidx.constraintlayout.motion.widget.z     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r1.<init>(r9, r0)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            androidx.constraintlayout.motion.widget.a0 r3 = r8.f43820s     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r3.mo50111b(r1)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            goto L_0x015d
        L_0x00b6:
            androidx.constraintlayout.motion.widget.i r1 = new androidx.constraintlayout.motion.widget.i     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r1.<init>(r9, r0)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            if (r2 == 0) goto L_0x015d
            java.util.ArrayList r3 = r2.f43851k     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r3.add(r1)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            goto L_0x015d
        L_0x00c6:
            r8.mo50317b0(r9, r0)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            goto L_0x015d
        L_0x00cb:
            r8.mo50315Z(r9, r0)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            goto L_0x015d
        L_0x00d0:
            androidx.constraintlayout.widget.g r1 = new androidx.constraintlayout.widget.g     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r1.<init>(r9, r0)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r8.f43803b = r1     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            goto L_0x015d
        L_0x00d9:
            if (r2 == 0) goto L_0x015d
            r2.mo50383v(r9, r0)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            goto L_0x015d
        L_0x00e0:
            if (r2 != 0) goto L_0x0108
            android.content.res.Resources r1 = r9.getResources()     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            java.lang.String r1 = r1.getResourceEntryName(r10)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            int r3 = r0.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            java.lang.String r5 = " OnSwipe ("
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r4.append(r1)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            java.lang.String r1 = ".xml:"
            r4.append(r1)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r4.append(r3)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            java.lang.String r1 = ")"
            r4.append(r1)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
        L_0x0108:
            if (r2 == 0) goto L_0x015d
            androidx.constraintlayout.motion.widget.v r1 = new androidx.constraintlayout.motion.widget.v     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r8.f43802a     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r1.<init>(r9, r3, r0)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            androidx.constraintlayout.motion.widget.C16906v unused = r2.f43852l = r1     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            goto L_0x015d
        L_0x0115:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.s$b> r1 = r8.f43806e     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            androidx.constraintlayout.motion.widget.s$b r2 = new androidx.constraintlayout.motion.widget.s$b     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r2.<init>(r8, r9, r0)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            androidx.constraintlayout.motion.widget.s$b r1 = r8.f43804c     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            if (r1 != 0) goto L_0x013c
            boolean r1 = r2.f43842b     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            if (r1 != 0) goto L_0x013c
            r8.f43804c = r2     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            androidx.constraintlayout.motion.widget.v r1 = r2.f43852l     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            if (r1 == 0) goto L_0x013c
            androidx.constraintlayout.motion.widget.s$b r1 = r8.f43804c     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            androidx.constraintlayout.motion.widget.v r1 = r1.f43852l     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            boolean r3 = r8.f43819r     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r1.mo50433D(r3)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
        L_0x013c:
            boolean r1 = r2.f43842b     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            if (r1 == 0) goto L_0x015d
            int r1 = r2.f43843c     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            if (r1 != r6) goto L_0x014b
            r8.f43807f = r2     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            goto L_0x0150
        L_0x014b:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.s$b> r1 = r8.f43808g     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
        L_0x0150:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.s$b> r1 = r8.f43806e     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            r1.remove(r2)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            goto L_0x015d
        L_0x0156:
            r8.mo50318c0(r9, r0)     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            goto L_0x015d
        L_0x015a:
            r0.getName()     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
        L_0x015d:
            int r1 = r0.next()     // Catch:{ XmlPullParserException -> 0x0168, IOException -> 0x0163 }
            goto L_0x000d
        L_0x0163:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x016c
        L_0x0168:
            r9 = move-exception
            r9.printStackTrace()
        L_0x016c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C16900s.mo50311V(android.content.Context, int):void");
    }

    /* renamed from: W */
    public int mo50312W(String str) {
        Integer num = this.f43810i.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: X */
    public String mo50313X(int i) {
        for (Map.Entry next : this.f43810i.entrySet()) {
            Integer num = (Integer) next.getValue();
            if (num != null && num.intValue() == i) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    /* renamed from: Y */
    public void mo50314Y(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo50315Z(android.content.Context r14, org.xmlpull.v1.XmlPullParser r15) {
        /*
            r13 = this;
            androidx.constraintlayout.widget.c r0 = new androidx.constraintlayout.widget.c
            r0.<init>()
            r1 = 0
            r0.mo50859a1(r1)
            int r2 = r15.getAttributeCount()
            r3 = -1
            r4 = r1
            r5 = r3
            r6 = r5
        L_0x0011:
            r7 = 1
            if (r4 >= r2) goto L_0x00e8
            java.lang.String r8 = r15.getAttributeName(r4)
            java.lang.String r9 = r15.getAttributeValue(r4)
            boolean r10 = r13.f43812k
            if (r10 == 0) goto L_0x0036
            java.io.PrintStream r10 = java.lang.System.out
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "id string = "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            r10.println(r11)
        L_0x0036:
            r8.hashCode()
            int r10 = r8.hashCode()
            r11 = 2
            switch(r10) {
                case -1496482599: goto L_0x0059;
                case -1153153640: goto L_0x004e;
                case 3355: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            r8 = r3
            goto L_0x0063
        L_0x0043:
            java.lang.String r10 = "id"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x004c
            goto L_0x0041
        L_0x004c:
            r8 = r11
            goto L_0x0063
        L_0x004e:
            java.lang.String r10 = "constraintRotate"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x0057
            goto L_0x0041
        L_0x0057:
            r8 = r7
            goto L_0x0063
        L_0x0059:
            java.lang.String r10 = "deriveConstraintsFrom"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x0062
            goto L_0x0041
        L_0x0062:
            r8 = r1
        L_0x0063:
            switch(r8) {
                case 0: goto L_0x00e0;
                case 1: goto L_0x0081;
                case 2: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x00e4
        L_0x0068:
            int r5 = r13.mo50351v(r14, r9)
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r13.f43810i
            java.lang.String r8 = m77933q0(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.put(r8, r9)
            java.lang.String r7 = androidx.constraintlayout.motion.widget.C16878c.m77586i(r14, r5)
            r0.f44574b = r7
            goto L_0x00e4
        L_0x0081:
            int r8 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x0089 }
            r0.f44576d = r8     // Catch:{ NumberFormatException -> 0x0089 }
            goto L_0x00e4
        L_0x0089:
            r9.hashCode()
            int r8 = r9.hashCode()
            r10 = 4
            r12 = 3
            switch(r8) {
                case -768416914: goto L_0x00c3;
                case 3317767: goto L_0x00b8;
                case 3387192: goto L_0x00ad;
                case 108511772: goto L_0x00a2;
                case 1954540437: goto L_0x0097;
                default: goto L_0x0095;
            }
        L_0x0095:
            r8 = r3
            goto L_0x00cd
        L_0x0097:
            java.lang.String r8 = "x_right"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00a0
            goto L_0x0095
        L_0x00a0:
            r8 = r10
            goto L_0x00cd
        L_0x00a2:
            java.lang.String r8 = "right"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00ab
            goto L_0x0095
        L_0x00ab:
            r8 = r12
            goto L_0x00cd
        L_0x00ad:
            java.lang.String r8 = "none"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00b6
            goto L_0x0095
        L_0x00b6:
            r8 = r11
            goto L_0x00cd
        L_0x00b8:
            java.lang.String r8 = "left"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00c1
            goto L_0x0095
        L_0x00c1:
            r8 = r7
            goto L_0x00cd
        L_0x00c3:
            java.lang.String r8 = "x_left"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00cc
            goto L_0x0095
        L_0x00cc:
            r8 = r1
        L_0x00cd:
            switch(r8) {
                case 0: goto L_0x00dd;
                case 1: goto L_0x00da;
                case 2: goto L_0x00d7;
                case 3: goto L_0x00d4;
                case 4: goto L_0x00d1;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            goto L_0x00e4
        L_0x00d1:
            r0.f44576d = r12
            goto L_0x00e4
        L_0x00d4:
            r0.f44576d = r7
            goto L_0x00e4
        L_0x00d7:
            r0.f44576d = r1
            goto L_0x00e4
        L_0x00da:
            r0.f44576d = r11
            goto L_0x00e4
        L_0x00dd:
            r0.f44576d = r10
            goto L_0x00e4
        L_0x00e0:
            int r6 = r13.mo50351v(r14, r9)
        L_0x00e4:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x00e8:
            if (r5 == r3) goto L_0x0102
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r13.f43802a
            int r1 = r1.f43241P0
            if (r1 == 0) goto L_0x00f3
            r0.mo50924z1(r7)
        L_0x00f3:
            r0.mo50918x0(r14, r15)
            if (r6 == r3) goto L_0x00fd
            android.util.SparseIntArray r14 = r13.f43811j
            r14.put(r5, r6)
        L_0x00fd:
            android.util.SparseArray<androidx.constraintlayout.widget.c> r14 = r13.f43809h
            r14.put(r5, r0)
        L_0x0102:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C16900s.mo50315Z(android.content.Context, org.xmlpull.v1.XmlPullParser):int");
    }

    /* renamed from: a0 */
    public final int mo50316a0(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return mo50315Z(context, xml);
                }
            }
            return -1;
        } catch (XmlPullParserException e) {
            e.printStackTrace();
            return -1;
        } catch (IOException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    /* renamed from: b0 */
    public final void mo50317b0(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C16944e.C16957m.include);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C16944e.C16957m.include_constraintSet) {
                mo50316a0(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c0 */
    public final void mo50318c0(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C16944e.C16957m.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C16944e.C16957m.MotionScene_defaultDuration) {
                int i2 = obtainStyledAttributes.getInt(index, this.f43813l);
                this.f43813l = i2;
                if (i2 < 8) {
                    this.f43813l = 8;
                }
            } else if (index == C16944e.C16957m.MotionScene_layoutDuringTransition) {
                this.f43814m = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d0 */
    public void mo50319d0(float f, float f2) {
        C16902b bVar = this.f43804c;
        if (bVar != null && bVar.f43852l != null) {
            this.f43804c.f43852l.mo50461w(f, f2);
        }
    }

    /* renamed from: e0 */
    public void mo50320e0(float f, float f2) {
        C16902b bVar = this.f43804c;
        if (bVar != null && bVar.f43852l != null) {
            this.f43804c.f43852l.mo50462x(f, f2);
        }
    }

    /* renamed from: f */
    public void mo50321f(MotionLayout motionLayout, int i) {
        Iterator<C16902b> it = this.f43806e.iterator();
        while (it.hasNext()) {
            C16902b next = it.next();
            if (next.f43853m.size() > 0) {
                Iterator it2 = next.f43853m.iterator();
                while (it2.hasNext()) {
                    ((C16902b.C16903a) it2.next()).mo50390c(motionLayout);
                }
            }
        }
        Iterator<C16902b> it3 = this.f43808g.iterator();
        while (it3.hasNext()) {
            C16902b next2 = it3.next();
            if (next2.f43853m.size() > 0) {
                Iterator it4 = next2.f43853m.iterator();
                while (it4.hasNext()) {
                    ((C16902b.C16903a) it4.next()).mo50390c(motionLayout);
                }
            }
        }
        Iterator<C16902b> it5 = this.f43806e.iterator();
        while (it5.hasNext()) {
            C16902b next3 = it5.next();
            if (next3.f43853m.size() > 0) {
                Iterator it6 = next3.f43853m.iterator();
                while (it6.hasNext()) {
                    ((C16902b.C16903a) it6.next()).mo50388a(motionLayout, i, next3);
                }
            }
        }
        Iterator<C16902b> it7 = this.f43808g.iterator();
        while (it7.hasNext()) {
            C16902b next4 = it7.next();
            if (next4.f43853m.size() > 0) {
                Iterator it8 = next4.f43853m.iterator();
                while (it8.hasNext()) {
                    ((C16902b.C16903a) it8.next()).mo50388a(motionLayout, i, next4);
                }
            }
        }
    }

    /* renamed from: f0 */
    public void mo50322f0(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        MotionLayout.C16870i iVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f43818q == null) {
            this.f43818q = this.f43802a.mo49961B0();
        }
        this.f43818q.mo50096c(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.f43821t = motionEvent.getRawX();
                this.f43822u = motionEvent.getRawY();
                this.f43815n = motionEvent;
                this.f43816o = false;
                if (this.f43804c.f43852l != null) {
                    RectF g = this.f43804c.f43852l.mo50444g(this.f43802a, rectF);
                    if (g == null || g.contains(this.f43815n.getX(), this.f43815n.getY())) {
                        RectF r = this.f43804c.f43852l.mo50455r(this.f43802a, rectF);
                        if (r == null || r.contains(this.f43815n.getX(), this.f43815n.getY())) {
                            this.f43817p = false;
                        } else {
                            this.f43817p = true;
                        }
                        this.f43804c.f43852l.mo50430A(this.f43821t, this.f43822u);
                        return;
                    }
                    this.f43815n = null;
                    this.f43816o = true;
                    return;
                }
                return;
            } else if (action == 2 && !this.f43816o) {
                float rawY = motionEvent.getRawY() - this.f43822u;
                float rawX = motionEvent.getRawX() - this.f43821t;
                if ((((double) rawX) != 0.0d || ((double) rawY) != 0.0d) && (motionEvent2 = this.f43815n) != null) {
                    C16902b j = mo50329j(i, rawX, rawY, motionEvent2);
                    if (j != null) {
                        motionLayout.setTransition(j);
                        RectF r2 = this.f43804c.f43852l.mo50455r(this.f43802a, rectF);
                        if (r2 != null && !r2.contains(this.f43815n.getX(), this.f43815n.getY())) {
                            z = true;
                        }
                        this.f43817p = z;
                        this.f43804c.f43852l.mo50436G(this.f43821t, this.f43822u);
                    }
                } else {
                    return;
                }
            }
        }
        if (!this.f43816o) {
            C16902b bVar = this.f43804c;
            if (!(bVar == null || bVar.f43852l == null || this.f43817p)) {
                this.f43804c.f43852l.mo50459u(motionEvent, this.f43818q, i, this);
            }
            this.f43821t = motionEvent.getRawX();
            this.f43822u = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (iVar = this.f43818q) != null) {
                iVar.mo50094a();
                this.f43818q = null;
                int i2 = motionLayout.f43266f;
                if (i2 != -1) {
                    mo50327i(motionLayout, i2);
                }
            }
        }
    }

    /* renamed from: g */
    public void mo50323g(C16902b bVar) {
        int w = mo50352w(bVar);
        if (w == -1) {
            this.f43806e.add(bVar);
        } else {
            this.f43806e.set(w, bVar);
        }
    }

    /* renamed from: g0 */
    public final void mo50324g0(int i, MotionLayout motionLayout) {
        C16934c cVar = this.f43809h.get(i);
        cVar.f44575c = cVar.f44574b;
        int i2 = this.f43811j.get(i);
        if (i2 > 0) {
            mo50324g0(i2, motionLayout);
            C16934c cVar2 = this.f43809h.get(i2);
            if (cVar2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("ERROR! invalid deriveConstraintsFrom: @id/");
                sb.append(C16878c.m77586i(this.f43802a.getContext(), i2));
                return;
            }
            cVar.f44575c += "/" + cVar2.f44575c;
            cVar.mo50829J0(cVar2);
        } else {
            cVar.f44575c += "  layout";
            cVar.mo50827I0(motionLayout);
        }
        cVar.mo50897q(cVar);
    }

    /* renamed from: h */
    public boolean mo50325h(int i, C16895o oVar) {
        return this.f43820s.mo50114e(i, oVar);
    }

    /* renamed from: h0 */
    public void mo50326h0(MotionLayout motionLayout) {
        int i = 0;
        while (i < this.f43809h.size()) {
            int keyAt = this.f43809h.keyAt(i);
            if (!mo50307R(keyAt)) {
                mo50324g0(keyAt, motionLayout);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public boolean mo50327i(MotionLayout motionLayout, int i) {
        C16902b bVar;
        if (mo50309T() || this.f43805d) {
            return false;
        }
        Iterator<C16902b> it = this.f43806e.iterator();
        while (it.hasNext()) {
            C16902b next = it.next();
            if (next.f43854n != 0 && ((bVar = this.f43804c) != next || !bVar.mo50368L(2))) {
                if (i == next.f43844d && (next.f43854n == 4 || next.f43854n == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(next);
                    if (next.f43854n == 4) {
                        motionLayout.mo49973N0();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.mo49999g0(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState);
                        motionLayout.mo49962C0();
                    }
                    return true;
                } else if (i == next.f43843c && (next.f43854n == 3 || next.f43854n == 1)) {
                    MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState2);
                    motionLayout.setTransition(next);
                    if (next.f43854n == 3) {
                        motionLayout.mo49975P0();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.mo49999g0(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState2);
                        motionLayout.mo49962C0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i0 */
    public void mo50328i0(C16902b bVar) {
        int w = mo50352w(bVar);
        if (w != -1) {
            this.f43806e.remove(w);
        }
    }

    /* renamed from: j */
    public C16902b mo50329j(int i, float f, float f2, MotionEvent motionEvent) {
        RectF g;
        float f3;
        int i2 = i;
        float f4 = f;
        float f5 = f2;
        if (i2 == -1) {
            return this.f43804c;
        }
        List<C16902b> Q = mo50306Q(i);
        RectF rectF = new RectF();
        float f6 = 0.0f;
        C16902b bVar = null;
        for (C16902b next : Q) {
            if (!next.f43855o && next.f43852l != null) {
                next.f43852l.mo50433D(this.f43819r);
                RectF r = next.f43852l.mo50455r(this.f43802a, rectF);
                if ((r == null || motionEvent == null || r.contains(motionEvent.getX(), motionEvent.getY())) && ((g = next.f43852l.mo50444g(this.f43802a, rectF)) == null || motionEvent == null || g.contains(motionEvent.getX(), motionEvent.getY()))) {
                    float a = next.f43852l.mo50438a(f4, f5);
                    if (next.f43852l.f43958l && motionEvent != null) {
                        float x = motionEvent.getX() - next.f43852l.f43955i;
                        float y = motionEvent.getY() - next.f43852l.f43956j;
                        a = ((float) (Math.atan2((double) (f5 + y), (double) (f4 + x)) - Math.atan2((double) x, (double) y))) * 10.0f;
                    }
                    if (next.f43843c == i2) {
                        f3 = -1.0f;
                    } else {
                        f3 = 1.1f;
                    }
                    float f7 = a * f3;
                    if (f7 > f6) {
                        bVar = next;
                        f6 = f7;
                    }
                }
            }
        }
        return bVar;
    }

    /* renamed from: j0 */
    public void mo50330j0(int i, C16934c cVar) {
        this.f43809h.put(i, cVar);
    }

    /* renamed from: k */
    public void mo50331k(boolean z) {
        this.f43805d = z;
    }

    /* renamed from: k0 */
    public void mo50332k0(int i) {
        C16902b bVar = this.f43804c;
        if (bVar != null) {
            bVar.mo50371O(i);
        } else {
            this.f43813l = i;
        }
    }

    /* renamed from: l */
    public void mo50333l(int i, boolean z) {
        this.f43820s.mo50115f(i, z);
    }

    /* renamed from: l0 */
    public void mo50334l0(View view, int i, String str, Object obj) {
        C16902b bVar = this.f43804c;
        if (bVar != null) {
            Iterator it = bVar.f43851k.iterator();
            while (it.hasNext()) {
                Iterator<C16881f> it2 = ((C16886i) it.next()).mo50177d(view.getId()).iterator();
                while (it2.hasNext()) {
                    if (it2.next().f43393a == i) {
                        if (obj != null) {
                            ((Float) obj).floatValue();
                        }
                        str.equalsIgnoreCase("app:PerpendicularPath_percent");
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public int mo50335m() {
        C16902b bVar = this.f43804c;
        if (bVar != null) {
            return bVar.f43856p;
        }
        return -1;
    }

    /* renamed from: m0 */
    public void mo50336m0(boolean z) {
        this.f43819r = z;
        C16902b bVar = this.f43804c;
        if (bVar != null && bVar.f43852l != null) {
            this.f43804c.f43852l.mo50433D(this.f43819r);
        }
    }

    /* renamed from: n */
    public int mo50337n() {
        C16902b bVar = this.f43804c;
        if (bVar == null || bVar.f43852l == null) {
            return 0;
        }
        return this.f43804c.f43852l.mo50442e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x0018;
     */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50338n0(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.g r0 = r6.f43803b
            r1 = -1
            if (r0 == 0) goto L_0x0016
            int r0 = r0.mo50994e(r7, r1, r1)
            if (r0 == r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r7
        L_0x000d:
            androidx.constraintlayout.widget.g r2 = r6.f43803b
            int r2 = r2.mo50994e(r8, r1, r1)
            if (r2 == r1) goto L_0x0017
            goto L_0x0018
        L_0x0016:
            r0 = r7
        L_0x0017:
            r2 = r8
        L_0x0018:
            androidx.constraintlayout.motion.widget.s$b r3 = r6.f43804c
            if (r3 == 0) goto L_0x002b
            int r3 = r3.f43843c
            if (r3 != r8) goto L_0x002b
            androidx.constraintlayout.motion.widget.s$b r3 = r6.f43804c
            int r3 = r3.f43844d
            if (r3 != r7) goto L_0x002b
            return
        L_0x002b:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.s$b> r3 = r6.f43806e
            java.util.Iterator r3 = r3.iterator()
        L_0x0031:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006b
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.s$b r4 = (androidx.constraintlayout.motion.widget.C16900s.C16902b) r4
            int r5 = r4.f43843c
            if (r5 != r2) goto L_0x0049
            int r5 = r4.f43844d
            if (r5 == r0) goto L_0x0055
        L_0x0049:
            int r5 = r4.f43843c
            if (r5 != r8) goto L_0x0031
            int r5 = r4.f43844d
            if (r5 != r7) goto L_0x0031
        L_0x0055:
            r6.f43804c = r4
            if (r4 == 0) goto L_0x006a
            androidx.constraintlayout.motion.widget.v r7 = r4.f43852l
            if (r7 == 0) goto L_0x006a
            androidx.constraintlayout.motion.widget.s$b r7 = r6.f43804c
            androidx.constraintlayout.motion.widget.v r7 = r7.f43852l
            boolean r8 = r6.f43819r
            r7.mo50433D(r8)
        L_0x006a:
            return
        L_0x006b:
            androidx.constraintlayout.motion.widget.s$b r7 = r6.f43807f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.s$b> r3 = r6.f43808g
            java.util.Iterator r3 = r3.iterator()
        L_0x0073:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0087
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.s$b r4 = (androidx.constraintlayout.motion.widget.C16900s.C16902b) r4
            int r5 = r4.f43843c
            if (r5 != r8) goto L_0x0073
            r7 = r4
            goto L_0x0073
        L_0x0087:
            androidx.constraintlayout.motion.widget.s$b r8 = new androidx.constraintlayout.motion.widget.s$b
            r8.<init>(r6, r7)
            int unused = r8.f43844d = r0
            int unused = r8.f43843c = r2
            if (r0 == r1) goto L_0x0099
            java.util.ArrayList<androidx.constraintlayout.motion.widget.s$b> r7 = r6.f43806e
            r7.add(r8)
        L_0x0099:
            r6.f43804c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C16900s.mo50338n0(int, int):void");
    }

    /* renamed from: o */
    public C16934c mo50339o(int i) {
        return mo50341p(i, -1, -1);
    }

    /* renamed from: o0 */
    public void mo50340o0(C16902b bVar) {
        this.f43804c = bVar;
        if (bVar != null && bVar.f43852l != null) {
            this.f43804c.f43852l.mo50433D(this.f43819r);
        }
    }

    /* renamed from: p */
    public C16934c mo50341p(int i, int i2, int i3) {
        int e;
        if (this.f43812k) {
            PrintStream printStream = System.out;
            printStream.println("id " + i);
            PrintStream printStream2 = System.out;
            printStream2.println("size " + this.f43809h.size());
        }
        C16960g gVar = this.f43803b;
        if (!(gVar == null || (e = gVar.mo50994e(i, i2, i3)) == -1)) {
            i = e;
        }
        if (this.f43809h.get(i) != null) {
            return this.f43809h.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Warning could not find ConstraintSet id/");
        sb.append(C16878c.m77586i(this.f43802a.getContext(), i));
        sb.append(" In MotionScene");
        SparseArray<C16934c> sparseArray = this.f43809h;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    /* renamed from: p0 */
    public void mo50342p0() {
        C16902b bVar = this.f43804c;
        if (bVar != null && bVar.f43852l != null) {
            this.f43804c.f43852l.mo50437H();
        }
    }

    /* renamed from: q */
    public C16934c mo50343q(Context context, String str) {
        if (this.f43812k) {
            PrintStream printStream = System.out;
            printStream.println("id " + str);
            PrintStream printStream2 = System.out;
            printStream2.println("size " + this.f43809h.size());
        }
        for (int i = 0; i < this.f43809h.size(); i++) {
            int keyAt = this.f43809h.keyAt(i);
            String resourceName = context.getResources().getResourceName(keyAt);
            if (this.f43812k) {
                PrintStream printStream3 = System.out;
                printStream3.println("Id for <" + i + "> is <" + resourceName + "> looking for <" + str + ">");
            }
            if (str.equals(resourceName)) {
                return this.f43809h.get(keyAt);
            }
        }
        return null;
    }

    /* renamed from: r */
    public int[] mo50344r() {
        int size = this.f43809h.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.f43809h.keyAt(i);
        }
        return iArr;
    }

    /* renamed from: r0 */
    public boolean mo50345r0() {
        Iterator<C16902b> it = this.f43806e.iterator();
        while (it.hasNext()) {
            if (it.next().f43852l != null) {
                return true;
            }
        }
        C16902b bVar = this.f43804c;
        if (bVar == null || bVar.f43852l == null) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public ArrayList<C16902b> mo50346s() {
        return this.f43806e;
    }

    /* renamed from: s0 */
    public boolean mo50347s0(MotionLayout motionLayout) {
        return motionLayout == this.f43802a && motionLayout.f43256a == this;
    }

    /* renamed from: t */
    public int mo50348t() {
        C16902b bVar = this.f43804c;
        if (bVar != null) {
            return bVar.f43848h;
        }
        return this.f43813l;
    }

    /* renamed from: t0 */
    public void mo50349t0(int i, View... viewArr) {
        this.f43820s.mo50122m(i, viewArr);
    }

    /* renamed from: u */
    public int mo50350u() {
        C16902b bVar = this.f43804c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f43843c;
    }

    /* renamed from: v */
    public final int mo50351v(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f43812k) {
                System.out.println("id getMap res = " + i);
            }
        } else {
            i = -1;
        }
        if (i != -1 || str.length() <= 1) {
            return i;
        }
        return Integer.parseInt(str.substring(1));
    }

    /* renamed from: w */
    public final int mo50352w(C16902b bVar) {
        int o = bVar.f43841a;
        if (o != -1) {
            for (int i = 0; i < this.f43806e.size(); i++) {
                if (this.f43806e.get(i).f43841a == o) {
                    return i;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("The transition must have an id");
    }

    /* renamed from: x */
    public Interpolator mo50353x() {
        int g = this.f43804c.f43845e;
        if (g == -2) {
            return AnimationUtils.loadInterpolator(this.f43802a.getContext(), this.f43804c.f43847g);
        }
        if (g == -1) {
            return new C16901a(this, C16680d.m76169c(this.f43804c.f43846f));
        }
        if (g == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (g == 1) {
            return new AccelerateInterpolator();
        }
        if (g == 2) {
            return new DecelerateInterpolator();
        }
        if (g == 4) {
            return new BounceInterpolator();
        }
        if (g == 5) {
            return new OvershootInterpolator();
        }
        if (g != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* renamed from: y */
    public C16881f mo50354y(Context context, int i, int i2, int i3) {
        C16902b bVar = this.f43804c;
        if (bVar == null) {
            return null;
        }
        Iterator it = bVar.f43851k.iterator();
        while (it.hasNext()) {
            C16886i iVar = (C16886i) it.next();
            Iterator<Integer> it2 = iVar.mo50178e().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Integer next = it2.next();
                    if (i2 == next.intValue()) {
                        Iterator<C16881f> it3 = iVar.mo50177d(next.intValue()).iterator();
                        while (it3.hasNext()) {
                            C16881f next2 = it3.next();
                            if (next2.f43393a == i3 && next2.f43396d == i) {
                                return next2;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: z */
    public void mo50355z(C16895o oVar) {
        C16902b bVar = this.f43804c;
        if (bVar == null) {
            C16902b bVar2 = this.f43807f;
            if (bVar2 != null) {
                Iterator it = bVar2.f43851k.iterator();
                while (it.hasNext()) {
                    ((C16886i) it.next()).mo50175b(oVar);
                }
                return;
            }
            return;
        }
        Iterator it2 = bVar.f43851k.iterator();
        while (it2.hasNext()) {
            ((C16886i) it2.next()).mo50175b(oVar);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$b */
    public static class C16902b {

        /* renamed from: A */
        public static final int f43824A = -2;

        /* renamed from: B */
        public static final int f43825B = -1;

        /* renamed from: C */
        public static final int f43826C = 0;

        /* renamed from: D */
        public static final int f43827D = 1;

        /* renamed from: E */
        public static final int f43828E = 2;

        /* renamed from: F */
        public static final int f43829F = 3;

        /* renamed from: G */
        public static final int f43830G = 4;

        /* renamed from: H */
        public static final int f43831H = 5;

        /* renamed from: I */
        public static final int f43832I = 6;

        /* renamed from: s */
        public static final int f43833s = 0;

        /* renamed from: t */
        public static final int f43834t = 1;

        /* renamed from: u */
        public static final int f43835u = 2;

        /* renamed from: v */
        public static final int f43836v = 3;

        /* renamed from: w */
        public static final int f43837w = 4;

        /* renamed from: x */
        public static final int f43838x = 1;

        /* renamed from: y */
        public static final int f43839y = 2;

        /* renamed from: z */
        public static final int f43840z = 4;

        /* renamed from: a */
        public int f43841a = -1;

        /* renamed from: b */
        public boolean f43842b = false;

        /* renamed from: c */
        public int f43843c = -1;

        /* renamed from: d */
        public int f43844d = -1;

        /* renamed from: e */
        public int f43845e = 0;

        /* renamed from: f */
        public String f43846f = null;

        /* renamed from: g */
        public int f43847g = -1;

        /* renamed from: h */
        public int f43848h = 400;

        /* renamed from: i */
        public float f43849i = 0.0f;

        /* renamed from: j */
        public final C16900s f43850j;

        /* renamed from: k */
        public ArrayList<C16886i> f43851k = new ArrayList<>();

        /* renamed from: l */
        public C16906v f43852l = null;

        /* renamed from: m */
        public ArrayList<C16903a> f43853m = new ArrayList<>();

        /* renamed from: n */
        public int f43854n = 0;

        /* renamed from: o */
        public boolean f43855o = false;

        /* renamed from: p */
        public int f43856p = -1;

        /* renamed from: q */
        public int f43857q = 0;

        /* renamed from: r */
        public int f43858r = 0;

        public C16902b(C16900s sVar, C16902b bVar) {
            this.f43850j = sVar;
            this.f43848h = sVar.f43813l;
            if (bVar != null) {
                this.f43856p = bVar.f43856p;
                this.f43845e = bVar.f43845e;
                this.f43846f = bVar.f43846f;
                this.f43847g = bVar.f43847g;
                this.f43848h = bVar.f43848h;
                this.f43851k = bVar.f43851k;
                this.f43849i = bVar.f43849i;
                this.f43857q = bVar.f43857q;
            }
        }

        /* renamed from: A */
        public int mo50357A() {
            return this.f43848h;
        }

        /* renamed from: B */
        public int mo50358B() {
            return this.f43843c;
        }

        /* renamed from: C */
        public int mo50359C() {
            return this.f43841a;
        }

        /* renamed from: D */
        public List<C16886i> mo50360D() {
            return this.f43851k;
        }

        /* renamed from: E */
        public int mo50361E() {
            return this.f43857q;
        }

        /* renamed from: F */
        public List<C16903a> mo50362F() {
            return this.f43853m;
        }

        /* renamed from: G */
        public int mo50363G() {
            return this.f43856p;
        }

        /* renamed from: H */
        public float mo50364H() {
            return this.f43849i;
        }

        /* renamed from: I */
        public int mo50365I() {
            return this.f43844d;
        }

        /* renamed from: J */
        public C16906v mo50366J() {
            return this.f43852l;
        }

        /* renamed from: K */
        public boolean mo50367K() {
            return !this.f43855o;
        }

        /* renamed from: L */
        public boolean mo50368L(int i) {
            return (i & this.f43858r) != 0;
        }

        /* renamed from: M */
        public void mo50369M(int i) {
            C16903a aVar;
            Iterator<C16903a> it = this.f43853m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = it.next();
                if (aVar.f43865b == i) {
                    break;
                }
            }
            if (aVar != null) {
                this.f43853m.remove(aVar);
            }
        }

        /* renamed from: N */
        public void mo50370N(int i) {
            this.f43854n = i;
        }

        /* renamed from: O */
        public void mo50371O(int i) {
            this.f43848h = Math.max(i, 8);
        }

        /* renamed from: P */
        public void mo50372P(boolean z) {
            mo50373Q(z);
        }

        /* renamed from: Q */
        public void mo50373Q(boolean z) {
            this.f43855o = !z;
        }

        /* renamed from: R */
        public void mo50374R(int i, String str, int i2) {
            this.f43845e = i;
            this.f43846f = str;
            this.f43847g = i2;
        }

        /* renamed from: S */
        public void mo50375S(int i) {
            this.f43857q = i;
        }

        /* renamed from: T */
        public void mo50376T(C16904t tVar) {
            this.f43852l = tVar == null ? null : new C16906v(this.f43850j.f43802a, tVar);
        }

        /* renamed from: U */
        public void mo50377U(int i) {
            C16906v J = mo50366J();
            if (J != null) {
                J.mo50435F(i);
            }
        }

        /* renamed from: V */
        public void mo50378V(int i) {
            this.f43856p = i;
        }

        /* renamed from: W */
        public void mo50379W(float f) {
            this.f43849i = f;
        }

        /* renamed from: X */
        public void mo50380X(int i) {
            this.f43858r = i;
        }

        /* renamed from: t */
        public void mo50381t(C16886i iVar) {
            this.f43851k.add(iVar);
        }

        /* renamed from: u */
        public void mo50382u(int i, int i2) {
            Iterator<C16903a> it = this.f43853m.iterator();
            while (it.hasNext()) {
                C16903a next = it.next();
                if (next.f43865b == i) {
                    next.f43866c = i2;
                    return;
                }
            }
            this.f43853m.add(new C16903a(this, i, i2));
        }

        /* renamed from: v */
        public void mo50383v(Context context, XmlPullParser xmlPullParser) {
            this.f43853m.add(new C16903a(context, this, xmlPullParser));
        }

        /* renamed from: w */
        public String mo50384w(Context context) {
            String str;
            if (this.f43844d == -1) {
                str = "null";
            } else {
                str = context.getResources().getResourceEntryName(this.f43844d);
            }
            if (this.f43843c == -1) {
                return str + " -> null";
            }
            return str + " -> " + context.getResources().getResourceEntryName(this.f43843c);
        }

        /* renamed from: x */
        public final void mo50385x(C16900s sVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == C16944e.C16957m.Transition_constraintSetEnd) {
                    this.f43843c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f43843c);
                    if ("layout".equals(resourceTypeName)) {
                        C16934c cVar = new C16934c();
                        cVar.mo50915w0(context, this.f43843c);
                        sVar.f43809h.append(this.f43843c, cVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f43843c = sVar.mo50316a0(context, this.f43843c);
                    }
                } else if (index == C16944e.C16957m.Transition_constraintSetStart) {
                    this.f43844d = typedArray.getResourceId(index, this.f43844d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f43844d);
                    if ("layout".equals(resourceTypeName2)) {
                        C16934c cVar2 = new C16934c();
                        cVar2.mo50915w0(context, this.f43844d);
                        sVar.f43809h.append(this.f43844d, cVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f43844d = sVar.mo50316a0(context, this.f43844d);
                    }
                } else if (index == C16944e.C16957m.Transition_motionInterpolator) {
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f43847g = resourceId;
                        if (resourceId != -1) {
                            this.f43845e = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArray.getString(index);
                        this.f43846f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f43847g = typedArray.getResourceId(index, -1);
                                this.f43845e = -2;
                            } else {
                                this.f43845e = -1;
                            }
                        }
                    } else {
                        this.f43845e = typedArray.getInteger(index, this.f43845e);
                    }
                } else if (index == C16944e.C16957m.Transition_duration) {
                    int i3 = typedArray.getInt(index, this.f43848h);
                    this.f43848h = i3;
                    if (i3 < 8) {
                        this.f43848h = 8;
                    }
                } else if (index == C16944e.C16957m.Transition_staggered) {
                    this.f43849i = typedArray.getFloat(index, this.f43849i);
                } else if (index == C16944e.C16957m.Transition_autoTransition) {
                    this.f43854n = typedArray.getInteger(index, this.f43854n);
                } else if (index == C16944e.C16957m.Transition_android_id) {
                    this.f43841a = typedArray.getResourceId(index, this.f43841a);
                } else if (index == C16944e.C16957m.Transition_transitionDisable) {
                    this.f43855o = typedArray.getBoolean(index, this.f43855o);
                } else if (index == C16944e.C16957m.Transition_pathMotionArc) {
                    this.f43856p = typedArray.getInteger(index, -1);
                } else if (index == C16944e.C16957m.Transition_layoutDuringTransition) {
                    this.f43857q = typedArray.getInteger(index, 0);
                } else if (index == C16944e.C16957m.Transition_transitionFlags) {
                    this.f43858r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f43844d == -1) {
                this.f43842b = true;
            }
        }

        /* renamed from: y */
        public final void mo50386y(C16900s sVar, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16944e.C16957m.Transition);
            mo50385x(sVar, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: z */
        public int mo50387z() {
            return this.f43854n;
        }

        /* renamed from: androidx.constraintlayout.motion.widget.s$b$a */
        public static class C16903a implements View.OnClickListener {

            /* renamed from: d */
            public static final int f43859d = 1;

            /* renamed from: e */
            public static final int f43860e = 17;

            /* renamed from: f */
            public static final int f43861f = 16;

            /* renamed from: g */
            public static final int f43862g = 256;

            /* renamed from: v */
            public static final int f43863v = 4096;

            /* renamed from: a */
            public final C16902b f43864a;

            /* renamed from: b */
            public int f43865b;

            /* renamed from: c */
            public int f43866c;

            public C16903a(Context context, C16902b bVar, XmlPullParser xmlPullParser) {
                this.f43865b = -1;
                this.f43866c = 17;
                this.f43864a = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C16944e.C16957m.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == C16944e.C16957m.OnClick_targetId) {
                        this.f43865b = obtainStyledAttributes.getResourceId(index, this.f43865b);
                    } else if (index == C16944e.C16957m.OnClick_clickAction) {
                        this.f43866c = obtainStyledAttributes.getInt(index, this.f43866c);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* renamed from: a */
            public void mo50388a(MotionLayout motionLayout, int i, C16902b bVar) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                int i2 = this.f43865b;
                View view = motionLayout;
                if (i2 != -1) {
                    view = motionLayout.findViewById(i2);
                }
                if (view == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnClick could not find id ");
                    sb.append(this.f43865b);
                    return;
                }
                int c = bVar.f43844d;
                int a = bVar.f43843c;
                if (c == -1) {
                    view.setOnClickListener(this);
                    return;
                }
                int i3 = this.f43866c;
                boolean z5 = false;
                if ((i3 & 1) == 0 || i != c) {
                    z = false;
                } else {
                    z = true;
                }
                if ((i3 & 256) == 0 || i != c) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                boolean z6 = z | z2;
                if ((i3 & 1) == 0 || i != c) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                boolean z7 = z3 | z6;
                if ((i3 & 16) == 0 || i != a) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                boolean z8 = z7 | z4;
                if ((i3 & 4096) != 0 && i == a) {
                    z5 = true;
                }
                if (z8 || z5) {
                    view.setOnClickListener(this);
                }
            }

            /* renamed from: b */
            public boolean mo50389b(C16902b bVar, MotionLayout motionLayout) {
                C16902b bVar2 = this.f43864a;
                if (bVar2 == bVar) {
                    return true;
                }
                int a = bVar2.f43843c;
                int c = this.f43864a.f43844d;
                if (c != -1) {
                    int i = motionLayout.f43266f;
                    if (i == c || i == a) {
                        return true;
                    }
                    return false;
                } else if (motionLayout.f43266f != a) {
                    return true;
                } else {
                    return false;
                }
            }

            /* renamed from: c */
            public void mo50390c(MotionLayout motionLayout) {
                int i = this.f43865b;
                if (i != -1) {
                    View findViewById = motionLayout.findViewById(i);
                    if (findViewById == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(" (*)  could not find id ");
                        sb.append(this.f43865b);
                        return;
                    }
                    findViewById.setOnClickListener((View.OnClickListener) null);
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3  */
            /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r8) {
                /*
                    r7 = this;
                    androidx.constraintlayout.motion.widget.s$b r8 = r7.f43864a
                    androidx.constraintlayout.motion.widget.s r8 = r8.f43850j
                    androidx.constraintlayout.motion.widget.MotionLayout r8 = r8.f43802a
                    boolean r0 = r8.mo50060x0()
                    if (r0 != 0) goto L_0x0011
                    return
                L_0x0011:
                    androidx.constraintlayout.motion.widget.s$b r0 = r7.f43864a
                    int r0 = r0.f43844d
                    r1 = -1
                    if (r0 != r1) goto L_0x004a
                    int r0 = r8.getCurrentState()
                    if (r0 != r1) goto L_0x002a
                    androidx.constraintlayout.motion.widget.s$b r0 = r7.f43864a
                    int r0 = r0.f43843c
                    r8.mo49976Q0(r0)
                    return
                L_0x002a:
                    androidx.constraintlayout.motion.widget.s$b r1 = new androidx.constraintlayout.motion.widget.s$b
                    androidx.constraintlayout.motion.widget.s$b r2 = r7.f43864a
                    androidx.constraintlayout.motion.widget.s r2 = r2.f43850j
                    androidx.constraintlayout.motion.widget.s$b r3 = r7.f43864a
                    r1.<init>(r2, r3)
                    int unused = r1.f43844d = r0
                    androidx.constraintlayout.motion.widget.s$b r0 = r7.f43864a
                    int r0 = r0.f43843c
                    int unused = r1.f43843c = r0
                    r8.setTransition((androidx.constraintlayout.motion.widget.C16900s.C16902b) r1)
                    r8.mo49973N0()
                    return
                L_0x004a:
                    androidx.constraintlayout.motion.widget.s$b r0 = r7.f43864a
                    androidx.constraintlayout.motion.widget.s r0 = r0.f43850j
                    androidx.constraintlayout.motion.widget.s$b r0 = r0.f43804c
                    int r1 = r7.f43866c
                    r2 = r1 & 1
                    r3 = 0
                    r4 = 1
                    if (r2 != 0) goto L_0x0061
                    r2 = r1 & 256(0x100, float:3.59E-43)
                    if (r2 == 0) goto L_0x005f
                    goto L_0x0061
                L_0x005f:
                    r2 = r3
                    goto L_0x0062
                L_0x0061:
                    r2 = r4
                L_0x0062:
                    r5 = r1 & 16
                    if (r5 != 0) goto L_0x006d
                    r1 = r1 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L_0x006b
                    goto L_0x006d
                L_0x006b:
                    r1 = r3
                    goto L_0x006e
                L_0x006d:
                    r1 = r4
                L_0x006e:
                    if (r2 == 0) goto L_0x0074
                    if (r1 == 0) goto L_0x0074
                    r5 = r4
                    goto L_0x0075
                L_0x0074:
                    r5 = r3
                L_0x0075:
                    if (r5 == 0) goto L_0x009c
                    androidx.constraintlayout.motion.widget.s$b r5 = r7.f43864a
                    androidx.constraintlayout.motion.widget.s r5 = r5.f43850j
                    androidx.constraintlayout.motion.widget.s$b r5 = r5.f43804c
                    androidx.constraintlayout.motion.widget.s$b r6 = r7.f43864a
                    if (r5 == r6) goto L_0x0086
                    r8.setTransition((androidx.constraintlayout.motion.widget.C16900s.C16902b) r6)
                L_0x0086:
                    int r5 = r8.getCurrentState()
                    int r6 = r8.getEndState()
                    if (r5 == r6) goto L_0x009d
                    float r5 = r8.getProgress()
                    r6 = 1056964608(0x3f000000, float:0.5)
                    int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                    if (r5 <= 0) goto L_0x009b
                    goto L_0x009d
                L_0x009b:
                    r1 = r3
                L_0x009c:
                    r3 = r2
                L_0x009d:
                    boolean r0 = r7.mo50389b(r0, r8)
                    if (r0 == 0) goto L_0x00e8
                    if (r3 == 0) goto L_0x00b3
                    int r0 = r7.f43866c
                    r0 = r0 & r4
                    if (r0 == 0) goto L_0x00b3
                    androidx.constraintlayout.motion.widget.s$b r0 = r7.f43864a
                    r8.setTransition((androidx.constraintlayout.motion.widget.C16900s.C16902b) r0)
                    r8.mo49973N0()
                    goto L_0x00e8
                L_0x00b3:
                    if (r1 == 0) goto L_0x00c4
                    int r0 = r7.f43866c
                    r0 = r0 & 16
                    if (r0 == 0) goto L_0x00c4
                    androidx.constraintlayout.motion.widget.s$b r0 = r7.f43864a
                    r8.setTransition((androidx.constraintlayout.motion.widget.C16900s.C16902b) r0)
                    r8.mo49975P0()
                    goto L_0x00e8
                L_0x00c4:
                    if (r3 == 0) goto L_0x00d7
                    int r0 = r7.f43866c
                    r0 = r0 & 256(0x100, float:3.59E-43)
                    if (r0 == 0) goto L_0x00d7
                    androidx.constraintlayout.motion.widget.s$b r0 = r7.f43864a
                    r8.setTransition((androidx.constraintlayout.motion.widget.C16900s.C16902b) r0)
                    r0 = 1065353216(0x3f800000, float:1.0)
                    r8.setProgress(r0)
                    goto L_0x00e8
                L_0x00d7:
                    if (r1 == 0) goto L_0x00e8
                    int r0 = r7.f43866c
                    r0 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r0 == 0) goto L_0x00e8
                    androidx.constraintlayout.motion.widget.s$b r0 = r7.f43864a
                    r8.setTransition((androidx.constraintlayout.motion.widget.C16900s.C16902b) r0)
                    r0 = 0
                    r8.setProgress(r0)
                L_0x00e8:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C16900s.C16902b.C16903a.onClick(android.view.View):void");
            }

            public C16903a(C16902b bVar, int i, int i2) {
                this.f43864a = bVar;
                this.f43865b = i;
                this.f43866c = i2;
            }
        }

        public C16902b(int i, C16900s sVar, int i2, int i3) {
            this.f43841a = i;
            this.f43850j = sVar;
            this.f43844d = i2;
            this.f43843c = i3;
            this.f43848h = sVar.f43813l;
            this.f43857q = sVar.f43814m;
        }

        public C16902b(C16900s sVar, Context context, XmlPullParser xmlPullParser) {
            this.f43848h = sVar.f43813l;
            this.f43857q = sVar.f43814m;
            this.f43850j = sVar;
            mo50386y(sVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }

    public C16900s(Context context, MotionLayout motionLayout, int i) {
        this.f43802a = motionLayout;
        this.f43820s = new C16875a0(motionLayout);
        mo50311V(context, i);
        SparseArray<C16934c> sparseArray = this.f43809h;
        int i2 = C16944e.C16951g.motion_base;
        sparseArray.put(i2, new C16934c());
        this.f43810i.put("motion_base", Integer.valueOf(i2));
    }
}
