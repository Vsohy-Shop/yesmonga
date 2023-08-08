package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.C16680d;
import androidx.constraintlayout.core.widgets.C16804h;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.C16878c;
import androidx.constraintlayout.motion.widget.C16900s;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C16944e;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.exifinterface.media.C19135a;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.google.firebase.installations.C33124s;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.banner.C9156c;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.c */
public class C16934c {

    /* renamed from: A */
    public static final int f44428A = 1;

    /* renamed from: A0 */
    public static final int f44429A0 = 29;

    /* renamed from: A1 */
    public static final int f44430A1 = 81;

    /* renamed from: B */
    public static final int f44431B = 0;

    /* renamed from: B0 */
    public static final int f44432B0 = 30;

    /* renamed from: B1 */
    public static final int f44433B1 = 82;

    /* renamed from: C */
    public static final int f44434C = 1;

    /* renamed from: C0 */
    public static final int f44435C0 = 31;

    /* renamed from: C1 */
    public static final int f44436C1 = 83;

    /* renamed from: D */
    public static final int f44437D = 0;

    /* renamed from: D0 */
    public static final int f44438D0 = 32;

    /* renamed from: D1 */
    public static final int f44439D1 = 84;

    /* renamed from: E */
    public static final int f44440E = 4;

    /* renamed from: E0 */
    public static final int f44441E0 = 33;

    /* renamed from: E1 */
    public static final int f44442E1 = 85;

    /* renamed from: F */
    public static final int f44443F = 8;

    /* renamed from: F0 */
    public static final int f44444F0 = 34;

    /* renamed from: F1 */
    public static final int f44445F1 = 86;

    /* renamed from: G */
    public static final int f44446G = 1;

    /* renamed from: G0 */
    public static final int f44447G0 = 35;

    /* renamed from: G1 */
    public static final int f44448G1 = 87;

    /* renamed from: H */
    public static final int f44449H = 2;

    /* renamed from: H0 */
    public static final int f44450H0 = 36;

    /* renamed from: H1 */
    public static final int f44451H1 = 88;

    /* renamed from: I */
    public static final int f44452I = 3;

    /* renamed from: I0 */
    public static final int f44453I0 = 37;

    /* renamed from: I1 */
    public static final int f44454I1 = 89;

    /* renamed from: J */
    public static final int f44455J = 4;

    /* renamed from: J0 */
    public static final int f44456J0 = 38;

    /* renamed from: J1 */
    public static final int f44457J1 = 90;

    /* renamed from: K */
    public static final int f44458K = 5;

    /* renamed from: K0 */
    public static final int f44459K0 = 39;

    /* renamed from: K1 */
    public static final int f44460K1 = 91;

    /* renamed from: L */
    public static final int f44461L = 6;

    /* renamed from: L0 */
    public static final int f44462L0 = 40;

    /* renamed from: L1 */
    public static final int f44463L1 = 92;

    /* renamed from: M */
    public static final int f44464M = 7;

    /* renamed from: M0 */
    public static final int f44465M0 = 41;

    /* renamed from: M1 */
    public static final int f44466M1 = 93;

    /* renamed from: N */
    public static final int f44467N = 8;

    /* renamed from: N0 */
    public static final int f44468N0 = 42;

    /* renamed from: N1 */
    public static final int f44469N1 = 94;

    /* renamed from: O */
    public static final int f44470O = 0;

    /* renamed from: O0 */
    public static final int f44471O0 = 43;

    /* renamed from: O1 */
    public static final int f44472O1 = 95;

    /* renamed from: P */
    public static final int f44473P = 1;

    /* renamed from: P0 */
    public static final int f44474P0 = 44;

    /* renamed from: P1 */
    public static final int f44475P1 = 96;

    /* renamed from: Q */
    public static final int f44476Q = 0;

    /* renamed from: Q0 */
    public static final int f44477Q0 = 45;

    /* renamed from: Q1 */
    public static final int f44478Q1 = 97;

    /* renamed from: R */
    public static final int f44479R = 1;

    /* renamed from: R0 */
    public static final int f44480R0 = 46;

    /* renamed from: R1 */
    public static final int f44481R1 = 98;

    /* renamed from: S */
    public static final int f44482S = 2;

    /* renamed from: S0 */
    public static final int f44483S0 = 47;

    /* renamed from: S1 */
    public static final int f44484S1 = 99;

    /* renamed from: T */
    public static final boolean f44485T = false;

    /* renamed from: T0 */
    public static final int f44486T0 = 48;

    /* renamed from: T1 */
    public static final String f44487T1 = "weight";

    /* renamed from: U */
    public static final int[] f44488U = {0, 4, 8};

    /* renamed from: U0 */
    public static final int f44489U0 = 49;

    /* renamed from: U1 */
    public static final String f44490U1 = "ratio";

    /* renamed from: V */
    public static final int f44491V = 1;

    /* renamed from: V0 */
    public static final int f44492V0 = 50;

    /* renamed from: V1 */
    public static final String f44493V1 = "parent";

    /* renamed from: W */
    public static SparseIntArray f44494W = new SparseIntArray();

    /* renamed from: W0 */
    public static final int f44495W0 = 51;

    /* renamed from: X */
    public static SparseIntArray f44496X = new SparseIntArray();

    /* renamed from: X0 */
    public static final int f44497X0 = 52;

    /* renamed from: Y */
    public static final int f44498Y = 1;

    /* renamed from: Y0 */
    public static final int f44499Y0 = 53;

    /* renamed from: Z */
    public static final int f44500Z = 2;

    /* renamed from: Z0 */
    public static final int f44501Z0 = 54;

    /* renamed from: a0 */
    public static final int f44502a0 = 3;

    /* renamed from: a1 */
    public static final int f44503a1 = 55;

    /* renamed from: b0 */
    public static final int f44504b0 = 4;

    /* renamed from: b1 */
    public static final int f44505b1 = 56;

    /* renamed from: c0 */
    public static final int f44506c0 = 5;

    /* renamed from: c1 */
    public static final int f44507c1 = 57;

    /* renamed from: d0 */
    public static final int f44508d0 = 6;

    /* renamed from: d1 */
    public static final int f44509d1 = 58;

    /* renamed from: e0 */
    public static final int f44510e0 = 7;

    /* renamed from: e1 */
    public static final int f44511e1 = 59;

    /* renamed from: f0 */
    public static final int f44512f0 = 8;

    /* renamed from: f1 */
    public static final int f44513f1 = 60;

    /* renamed from: g0 */
    public static final int f44514g0 = 9;

    /* renamed from: g1 */
    public static final int f44515g1 = 61;

    /* renamed from: h */
    public static final String f44516h = "ConstraintSet";

    /* renamed from: h0 */
    public static final int f44517h0 = 10;

    /* renamed from: h1 */
    public static final int f44518h1 = 62;

    /* renamed from: i */
    public static final String f44519i = "XML parser error must be within a Constraint ";

    /* renamed from: i0 */
    public static final int f44520i0 = 11;

    /* renamed from: i1 */
    public static final int f44521i1 = 63;

    /* renamed from: j */
    public static final int f44522j = -1;

    /* renamed from: j0 */
    public static final int f44523j0 = 12;

    /* renamed from: j1 */
    public static final int f44524j1 = 64;

    /* renamed from: k */
    public static final int f44525k = -2;

    /* renamed from: k0 */
    public static final int f44526k0 = 13;

    /* renamed from: k1 */
    public static final int f44527k1 = 65;

    /* renamed from: l */
    public static final int f44528l = -3;

    /* renamed from: l0 */
    public static final int f44529l0 = 14;

    /* renamed from: l1 */
    public static final int f44530l1 = 66;

    /* renamed from: m */
    public static final int f44531m = -4;

    /* renamed from: m0 */
    public static final int f44532m0 = 15;

    /* renamed from: m1 */
    public static final int f44533m1 = 67;

    /* renamed from: n */
    public static final int f44534n = 0;

    /* renamed from: n0 */
    public static final int f44535n0 = 16;

    /* renamed from: n1 */
    public static final int f44536n1 = 68;

    /* renamed from: o */
    public static final int f44537o = 1;

    /* renamed from: o0 */
    public static final int f44538o0 = 17;

    /* renamed from: o1 */
    public static final int f44539o1 = 69;

    /* renamed from: p */
    public static final int f44540p = 2;

    /* renamed from: p0 */
    public static final int f44541p0 = 18;

    /* renamed from: p1 */
    public static final int f44542p1 = 70;

    /* renamed from: q */
    public static final int f44543q = 3;

    /* renamed from: q0 */
    public static final int f44544q0 = 19;

    /* renamed from: q1 */
    public static final int f44545q1 = 71;

    /* renamed from: r */
    public static final int f44546r = 4;

    /* renamed from: r0 */
    public static final int f44547r0 = 20;

    /* renamed from: r1 */
    public static final int f44548r1 = 72;

    /* renamed from: s */
    public static final int f44549s = -1;

    /* renamed from: s0 */
    public static final int f44550s0 = 21;

    /* renamed from: s1 */
    public static final int f44551s1 = 73;

    /* renamed from: t */
    public static final int f44552t = 0;

    /* renamed from: t0 */
    public static final int f44553t0 = 22;

    /* renamed from: t1 */
    public static final int f44554t1 = 74;

    /* renamed from: u */
    public static final int f44555u = -2;

    /* renamed from: u0 */
    public static final int f44556u0 = 23;

    /* renamed from: u1 */
    public static final int f44557u1 = 75;

    /* renamed from: v */
    public static final int f44558v = 1;

    /* renamed from: v0 */
    public static final int f44559v0 = 24;

    /* renamed from: v1 */
    public static final int f44560v1 = 76;

    /* renamed from: w */
    public static final int f44561w = 0;

    /* renamed from: w0 */
    public static final int f44562w0 = 25;

    /* renamed from: w1 */
    public static final int f44563w1 = 77;

    /* renamed from: x */
    public static final int f44564x = 2;

    /* renamed from: x0 */
    public static final int f44565x0 = 26;

    /* renamed from: x1 */
    public static final int f44566x1 = 78;

    /* renamed from: y */
    public static final int f44567y = 0;

    /* renamed from: y0 */
    public static final int f44568y0 = 27;

    /* renamed from: y1 */
    public static final int f44569y1 = 79;

    /* renamed from: z */
    public static final int f44570z = 0;

    /* renamed from: z0 */
    public static final int f44571z0 = 28;

    /* renamed from: z1 */
    public static final int f44572z1 = 80;

    /* renamed from: a */
    public boolean f44573a;

    /* renamed from: b */
    public String f44574b;

    /* renamed from: c */
    public String f44575c = "";

    /* renamed from: d */
    public int f44576d = 0;

    /* renamed from: e */
    public HashMap<String, ConstraintAttribute> f44577e = new HashMap<>();

    /* renamed from: f */
    public boolean f44578f = true;

    /* renamed from: g */
    public HashMap<Integer, C16935a> f44579g = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.c$a */
    public static class C16935a {

        /* renamed from: a */
        public int f44580a;

        /* renamed from: b */
        public String f44581b;

        /* renamed from: c */
        public final C16939d f44582c = new C16939d();

        /* renamed from: d */
        public final C16938c f44583d = new C16938c();

        /* renamed from: e */
        public final C16937b f44584e = new C16937b();

        /* renamed from: f */
        public final C16940e f44585f = new C16940e();

        /* renamed from: g */
        public HashMap<String, ConstraintAttribute> f44586g = new HashMap<>();

        /* renamed from: h */
        public C16936a f44587h;

        /* renamed from: androidx.constraintlayout.widget.c$a$a */
        public static class C16936a {

            /* renamed from: m */
            public static final int f44588m = 4;

            /* renamed from: n */
            public static final int f44589n = 10;

            /* renamed from: o */
            public static final int f44590o = 10;

            /* renamed from: p */
            public static final int f44591p = 5;

            /* renamed from: a */
            public int[] f44592a = new int[10];

            /* renamed from: b */
            public int[] f44593b = new int[10];

            /* renamed from: c */
            public int f44594c = 0;

            /* renamed from: d */
            public int[] f44595d = new int[10];

            /* renamed from: e */
            public float[] f44596e = new float[10];

            /* renamed from: f */
            public int f44597f = 0;

            /* renamed from: g */
            public int[] f44598g = new int[5];

            /* renamed from: h */
            public String[] f44599h = new String[5];

            /* renamed from: i */
            public int f44600i = 0;

            /* renamed from: j */
            public int[] f44601j = new int[4];

            /* renamed from: k */
            public boolean[] f44602k = new boolean[4];

            /* renamed from: l */
            public int f44603l = 0;

            /* renamed from: a */
            public void mo50938a(int i, float f) {
                int i2 = this.f44597f;
                int[] iArr = this.f44595d;
                if (i2 >= iArr.length) {
                    this.f44595d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f44596e;
                    this.f44596e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f44595d;
                int i3 = this.f44597f;
                iArr2[i3] = i;
                float[] fArr2 = this.f44596e;
                this.f44597f = i3 + 1;
                fArr2[i3] = f;
            }

            /* renamed from: b */
            public void mo50939b(int i, int i2) {
                int i3 = this.f44594c;
                int[] iArr = this.f44592a;
                if (i3 >= iArr.length) {
                    this.f44592a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f44593b;
                    this.f44593b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f44592a;
                int i4 = this.f44594c;
                iArr3[i4] = i;
                int[] iArr4 = this.f44593b;
                this.f44594c = i4 + 1;
                iArr4[i4] = i2;
            }

            /* renamed from: c */
            public void mo50940c(int i, String str) {
                int i2 = this.f44600i;
                int[] iArr = this.f44598g;
                if (i2 >= iArr.length) {
                    this.f44598g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f44599h;
                    this.f44599h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f44598g;
                int i3 = this.f44600i;
                iArr2[i3] = i;
                String[] strArr2 = this.f44599h;
                this.f44600i = i3 + 1;
                strArr2[i3] = str;
            }

            /* renamed from: d */
            public void mo50941d(int i, boolean z) {
                int i2 = this.f44603l;
                int[] iArr = this.f44601j;
                if (i2 >= iArr.length) {
                    this.f44601j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f44602k;
                    this.f44602k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f44601j;
                int i3 = this.f44603l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f44602k;
                this.f44603l = i3 + 1;
                zArr2[i3] = z;
            }

            /* renamed from: e */
            public void mo50942e(C16935a aVar) {
                for (int i = 0; i < this.f44594c; i++) {
                    C16934c.m78346S0(aVar, this.f44592a[i], this.f44593b[i]);
                }
                for (int i2 = 0; i2 < this.f44597f; i2++) {
                    C16934c.m78345R0(aVar, this.f44595d[i2], this.f44596e[i2]);
                }
                for (int i3 = 0; i3 < this.f44600i; i3++) {
                    C16934c.m78347T0(aVar, this.f44598g[i3], this.f44599h[i3]);
                }
                for (int i4 = 0; i4 < this.f44603l; i4++) {
                    C16934c.m78348U0(aVar, this.f44601j[i4], this.f44602k[i4]);
                }
            }

            @SuppressLint({"LogConditional"})
            /* renamed from: f */
            public void mo50943f(String str) {
                for (int i = 0; i < this.f44594c; i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f44592a[i]);
                    sb.append(" = ");
                    sb.append(this.f44593b[i]);
                }
                for (int i2 = 0; i2 < this.f44597f; i2++) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f44595d[i2]);
                    sb2.append(" = ");
                    sb2.append(this.f44596e[i2]);
                }
                for (int i3 = 0; i3 < this.f44600i; i3++) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f44598g[i3]);
                    sb3.append(" = ");
                    sb3.append(this.f44599h[i3]);
                }
                for (int i4 = 0; i4 < this.f44603l; i4++) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(this.f44601j[i4]);
                    sb4.append(" = ");
                    sb4.append(this.f44602k[i4]);
                }
            }
        }

        /* renamed from: h */
        public void mo50926h(C16935a aVar) {
            C16936a aVar2 = this.f44587h;
            if (aVar2 != null) {
                aVar2.mo50942e(aVar);
            }
        }

        /* renamed from: i */
        public void mo50927i(ConstraintLayout.C16926b bVar) {
            C16937b bVar2 = this.f44584e;
            bVar.f44258e = bVar2.f44719j;
            bVar.f44260f = bVar2.f44721k;
            bVar.f44262g = bVar2.f44723l;
            bVar.f44264h = bVar2.f44725m;
            bVar.f44266i = bVar2.f44727n;
            bVar.f44268j = bVar2.f44729o;
            bVar.f44270k = bVar2.f44731p;
            bVar.f44272l = bVar2.f44733q;
            bVar.f44274m = bVar2.f44735r;
            bVar.f44276n = bVar2.f44736s;
            bVar.f44278o = bVar2.f44737t;
            bVar.f44286s = bVar2.f44738u;
            bVar.f44288t = bVar2.f44739v;
            bVar.f44290u = bVar2.f44740w;
            bVar.f44292v = bVar2.f44741x;
            bVar.leftMargin = bVar2.f44682H;
            bVar.rightMargin = bVar2.f44683I;
            bVar.topMargin = bVar2.f44684J;
            bVar.bottomMargin = bVar2.f44685K;
            bVar.f44224A = bVar2.f44694T;
            bVar.f44225B = bVar2.f44693S;
            bVar.f44296x = bVar2.f44690P;
            bVar.f44298z = bVar2.f44692R;
            bVar.f44230G = bVar2.f44742y;
            bVar.f44231H = bVar2.f44743z;
            bVar.f44280p = bVar2.f44676B;
            bVar.f44282q = bVar2.f44677C;
            bVar.f44284r = bVar2.f44678D;
            bVar.f44232I = bVar2.f44675A;
            bVar.f44247X = bVar2.f44679E;
            bVar.f44248Y = bVar2.f44680F;
            bVar.f44236M = bVar2.f44696V;
            bVar.f44235L = bVar2.f44697W;
            bVar.f44238O = bVar2.f44699Y;
            bVar.f44237N = bVar2.f44698X;
            bVar.f44251a0 = bVar2.f44728n0;
            bVar.f44253b0 = bVar2.f44730o0;
            bVar.f44239P = bVar2.f44700Z;
            bVar.f44240Q = bVar2.f44702a0;
            bVar.f44243T = bVar2.f44704b0;
            bVar.f44244U = bVar2.f44706c0;
            bVar.f44241R = bVar2.f44708d0;
            bVar.f44242S = bVar2.f44710e0;
            bVar.f44245V = bVar2.f44712f0;
            bVar.f44246W = bVar2.f44714g0;
            bVar.f44249Z = bVar2.f44681G;
            bVar.f44254c = bVar2.f44715h;
            bVar.f44250a = bVar2.f44711f;
            bVar.f44252b = bVar2.f44713g;
            bVar.width = bVar2.f44707d;
            bVar.height = bVar2.f44709e;
            String str = bVar2.f44726m0;
            if (str != null) {
                bVar.f44255c0 = str;
            }
            bVar.f44257d0 = bVar2.f44734q0;
            bVar.setMarginStart(bVar2.f44687M);
            bVar.setMarginEnd(this.f44584e.f44686L);
            bVar.mo50706e();
        }

        /* renamed from: j */
        public C16935a clone() {
            C16935a aVar = new C16935a();
            aVar.f44584e.mo50944a(this.f44584e);
            aVar.f44583d.mo50947a(this.f44583d);
            aVar.f44582c.mo50949a(this.f44582c);
            aVar.f44585f.mo50951a(this.f44585f);
            aVar.f44580a = this.f44580a;
            aVar.f44587h = this.f44587h;
            return aVar;
        }

        /* renamed from: k */
        public final void mo50929k(int i, ConstraintLayout.C16926b bVar) {
            this.f44580a = i;
            C16937b bVar2 = this.f44584e;
            bVar2.f44719j = bVar.f44258e;
            bVar2.f44721k = bVar.f44260f;
            bVar2.f44723l = bVar.f44262g;
            bVar2.f44725m = bVar.f44264h;
            bVar2.f44727n = bVar.f44266i;
            bVar2.f44729o = bVar.f44268j;
            bVar2.f44731p = bVar.f44270k;
            bVar2.f44733q = bVar.f44272l;
            bVar2.f44735r = bVar.f44274m;
            bVar2.f44736s = bVar.f44276n;
            bVar2.f44737t = bVar.f44278o;
            bVar2.f44738u = bVar.f44286s;
            bVar2.f44739v = bVar.f44288t;
            bVar2.f44740w = bVar.f44290u;
            bVar2.f44741x = bVar.f44292v;
            bVar2.f44742y = bVar.f44230G;
            bVar2.f44743z = bVar.f44231H;
            bVar2.f44675A = bVar.f44232I;
            bVar2.f44676B = bVar.f44280p;
            bVar2.f44677C = bVar.f44282q;
            bVar2.f44678D = bVar.f44284r;
            bVar2.f44679E = bVar.f44247X;
            bVar2.f44680F = bVar.f44248Y;
            bVar2.f44681G = bVar.f44249Z;
            bVar2.f44715h = bVar.f44254c;
            bVar2.f44711f = bVar.f44250a;
            bVar2.f44713g = bVar.f44252b;
            bVar2.f44707d = bVar.width;
            bVar2.f44709e = bVar.height;
            bVar2.f44682H = bVar.leftMargin;
            bVar2.f44683I = bVar.rightMargin;
            bVar2.f44684J = bVar.topMargin;
            bVar2.f44685K = bVar.bottomMargin;
            bVar2.f44688N = bVar.f44227D;
            bVar2.f44696V = bVar.f44236M;
            bVar2.f44697W = bVar.f44235L;
            bVar2.f44699Y = bVar.f44238O;
            bVar2.f44698X = bVar.f44237N;
            bVar2.f44728n0 = bVar.f44251a0;
            bVar2.f44730o0 = bVar.f44253b0;
            bVar2.f44700Z = bVar.f44239P;
            bVar2.f44702a0 = bVar.f44240Q;
            bVar2.f44704b0 = bVar.f44243T;
            bVar2.f44706c0 = bVar.f44244U;
            bVar2.f44708d0 = bVar.f44241R;
            bVar2.f44710e0 = bVar.f44242S;
            bVar2.f44712f0 = bVar.f44245V;
            bVar2.f44714g0 = bVar.f44246W;
            bVar2.f44726m0 = bVar.f44255c0;
            bVar2.f44690P = bVar.f44296x;
            bVar2.f44692R = bVar.f44298z;
            bVar2.f44689O = bVar.f44294w;
            bVar2.f44691Q = bVar.f44297y;
            bVar2.f44694T = bVar.f44224A;
            bVar2.f44693S = bVar.f44225B;
            bVar2.f44695U = bVar.f44226C;
            bVar2.f44734q0 = bVar.f44257d0;
            bVar2.f44686L = bVar.getMarginEnd();
            this.f44584e.f44687M = bVar.getMarginStart();
        }

        /* renamed from: l */
        public final void mo50930l(int i, Constraints.C16929a aVar) {
            mo50929k(i, aVar);
            this.f44582c.f44775d = aVar.f44370V0;
            C16940e eVar = this.f44585f;
            eVar.f44791b = aVar.f44373Y0;
            eVar.f44792c = aVar.f44374Z0;
            eVar.f44793d = aVar.f44375a1;
            eVar.f44794e = aVar.f44376b1;
            eVar.f44795f = aVar.f44377c1;
            eVar.f44796g = aVar.f44378d1;
            eVar.f44797h = aVar.f44379e1;
            eVar.f44799j = aVar.f44380f1;
            eVar.f44800k = aVar.f44381g1;
            eVar.f44801l = aVar.f44382h1;
            eVar.f44803n = aVar.f44372X0;
            eVar.f44802m = aVar.f44371W0;
        }

        /* renamed from: m */
        public final void mo50931m(ConstraintHelper constraintHelper, int i, Constraints.C16929a aVar) {
            mo50930l(i, aVar);
            if (constraintHelper instanceof Barrier) {
                C16937b bVar = this.f44584e;
                bVar.f44720j0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.f44716h0 = barrier.getType();
                this.f44584e.f44722k0 = barrier.getReferencedIds();
                this.f44584e.f44718i0 = barrier.getMargin();
            }
        }

        /* renamed from: n */
        public final ConstraintAttribute mo50932n(String str, ConstraintAttribute.AttributeType attributeType) {
            if (this.f44586g.containsKey(str)) {
                ConstraintAttribute constraintAttribute = this.f44586g.get(str);
                if (constraintAttribute.mo50631j() == attributeType) {
                    return constraintAttribute;
                }
                throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute.mo50631j().name());
            }
            ConstraintAttribute constraintAttribute2 = new ConstraintAttribute(str, attributeType);
            this.f44586g.put(str, constraintAttribute2);
            return constraintAttribute2;
        }

        /* renamed from: o */
        public void mo50933o(String str) {
            C16936a aVar = this.f44587h;
            if (aVar != null) {
                aVar.mo50943f(str);
            }
        }

        /* renamed from: p */
        public final void mo50934p(String str, int i) {
            mo50932n(str, ConstraintAttribute.AttributeType.COLOR_TYPE).mo50638s(i);
        }

        /* renamed from: q */
        public final void mo50935q(String str, float f) {
            mo50932n(str, ConstraintAttribute.AttributeType.FLOAT_TYPE).mo50639t(f);
        }

        /* renamed from: r */
        public final void mo50936r(String str, int i) {
            mo50932n(str, ConstraintAttribute.AttributeType.INT_TYPE).mo50640u(i);
        }

        /* renamed from: s */
        public final void mo50937s(String str, String str2) {
            mo50932n(str, ConstraintAttribute.AttributeType.STRING_TYPE).mo50641v(str2);
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$b */
    public static class C16937b {

        /* renamed from: A0 */
        public static final int f44604A0 = 7;

        /* renamed from: A1 */
        public static final int f44605A1 = 82;

        /* renamed from: B0 */
        public static final int f44606B0 = 8;

        /* renamed from: B1 */
        public static final int f44607B1 = 83;

        /* renamed from: C0 */
        public static final int f44608C0 = 9;

        /* renamed from: C1 */
        public static final int f44609C1 = 84;

        /* renamed from: D0 */
        public static final int f44610D0 = 10;

        /* renamed from: D1 */
        public static final int f44611D1 = 85;

        /* renamed from: E0 */
        public static final int f44612E0 = 11;

        /* renamed from: E1 */
        public static final int f44613E1 = 86;

        /* renamed from: F0 */
        public static final int f44614F0 = 12;

        /* renamed from: F1 */
        public static final int f44615F1 = 87;

        /* renamed from: G0 */
        public static final int f44616G0 = 13;

        /* renamed from: G1 */
        public static final int f44617G1 = 88;

        /* renamed from: H0 */
        public static final int f44618H0 = 14;

        /* renamed from: H1 */
        public static final int f44619H1 = 89;

        /* renamed from: I0 */
        public static final int f44620I0 = 15;

        /* renamed from: I1 */
        public static final int f44621I1 = 90;

        /* renamed from: J0 */
        public static final int f44622J0 = 16;

        /* renamed from: J1 */
        public static final int f44623J1 = 91;

        /* renamed from: K0 */
        public static final int f44624K0 = 17;

        /* renamed from: L0 */
        public static final int f44625L0 = 18;

        /* renamed from: M0 */
        public static final int f44626M0 = 19;

        /* renamed from: N0 */
        public static final int f44627N0 = 20;

        /* renamed from: O0 */
        public static final int f44628O0 = 21;

        /* renamed from: P0 */
        public static final int f44629P0 = 22;

        /* renamed from: Q0 */
        public static final int f44630Q0 = 23;

        /* renamed from: R0 */
        public static final int f44631R0 = 24;

        /* renamed from: S0 */
        public static final int f44632S0 = 25;

        /* renamed from: T0 */
        public static final int f44633T0 = 26;

        /* renamed from: U0 */
        public static final int f44634U0 = 27;

        /* renamed from: V0 */
        public static final int f44635V0 = 28;

        /* renamed from: W0 */
        public static final int f44636W0 = 29;

        /* renamed from: X0 */
        public static final int f44637X0 = 30;

        /* renamed from: Y0 */
        public static final int f44638Y0 = 31;

        /* renamed from: Z0 */
        public static final int f44639Z0 = 32;

        /* renamed from: a1 */
        public static final int f44640a1 = 33;

        /* renamed from: b1 */
        public static final int f44641b1 = 34;

        /* renamed from: c1 */
        public static final int f44642c1 = 35;

        /* renamed from: d1 */
        public static final int f44643d1 = 36;

        /* renamed from: e1 */
        public static final int f44644e1 = 37;

        /* renamed from: f1 */
        public static final int f44645f1 = 38;

        /* renamed from: g1 */
        public static final int f44646g1 = 39;

        /* renamed from: h1 */
        public static final int f44647h1 = 40;

        /* renamed from: i1 */
        public static final int f44648i1 = 41;

        /* renamed from: j1 */
        public static final int f44649j1 = 42;

        /* renamed from: k1 */
        public static final int f44650k1 = 61;

        /* renamed from: l1 */
        public static final int f44651l1 = 62;

        /* renamed from: m1 */
        public static final int f44652m1 = 63;

        /* renamed from: n1 */
        public static final int f44653n1 = 69;

        /* renamed from: o1 */
        public static final int f44654o1 = 70;

        /* renamed from: p1 */
        public static final int f44655p1 = 71;

        /* renamed from: q1 */
        public static final int f44656q1 = 72;

        /* renamed from: r0 */
        public static final int f44657r0 = -1;

        /* renamed from: r1 */
        public static final int f44658r1 = 73;

        /* renamed from: s0 */
        public static final int f44659s0 = Integer.MIN_VALUE;

        /* renamed from: s1 */
        public static final int f44660s1 = 74;

        /* renamed from: t0 */
        public static SparseIntArray f44661t0 = null;

        /* renamed from: t1 */
        public static final int f44662t1 = 75;

        /* renamed from: u0 */
        public static final int f44663u0 = 1;

        /* renamed from: u1 */
        public static final int f44664u1 = 76;

        /* renamed from: v0 */
        public static final int f44665v0 = 2;

        /* renamed from: v1 */
        public static final int f44666v1 = 77;

        /* renamed from: w0 */
        public static final int f44667w0 = 3;

        /* renamed from: w1 */
        public static final int f44668w1 = 78;

        /* renamed from: x0 */
        public static final int f44669x0 = 4;

        /* renamed from: x1 */
        public static final int f44670x1 = 79;

        /* renamed from: y0 */
        public static final int f44671y0 = 5;

        /* renamed from: y1 */
        public static final int f44672y1 = 80;

        /* renamed from: z0 */
        public static final int f44673z0 = 6;

        /* renamed from: z1 */
        public static final int f44674z1 = 81;

        /* renamed from: A */
        public String f44675A = null;

        /* renamed from: B */
        public int f44676B = -1;

        /* renamed from: C */
        public int f44677C = 0;

        /* renamed from: D */
        public float f44678D = 0.0f;

        /* renamed from: E */
        public int f44679E = -1;

        /* renamed from: F */
        public int f44680F = -1;

        /* renamed from: G */
        public int f44681G = -1;

        /* renamed from: H */
        public int f44682H = 0;

        /* renamed from: I */
        public int f44683I = 0;

        /* renamed from: J */
        public int f44684J = 0;

        /* renamed from: K */
        public int f44685K = 0;

        /* renamed from: L */
        public int f44686L = 0;

        /* renamed from: M */
        public int f44687M = 0;

        /* renamed from: N */
        public int f44688N = 0;

        /* renamed from: O */
        public int f44689O = Integer.MIN_VALUE;

        /* renamed from: P */
        public int f44690P = Integer.MIN_VALUE;

        /* renamed from: Q */
        public int f44691Q = Integer.MIN_VALUE;

        /* renamed from: R */
        public int f44692R = Integer.MIN_VALUE;

        /* renamed from: S */
        public int f44693S = Integer.MIN_VALUE;

        /* renamed from: T */
        public int f44694T = Integer.MIN_VALUE;

        /* renamed from: U */
        public int f44695U = Integer.MIN_VALUE;

        /* renamed from: V */
        public float f44696V = -1.0f;

        /* renamed from: W */
        public float f44697W = -1.0f;

        /* renamed from: X */
        public int f44698X = 0;

        /* renamed from: Y */
        public int f44699Y = 0;

        /* renamed from: Z */
        public int f44700Z = 0;

        /* renamed from: a */
        public boolean f44701a = false;

        /* renamed from: a0 */
        public int f44702a0 = 0;

        /* renamed from: b */
        public boolean f44703b = false;

        /* renamed from: b0 */
        public int f44704b0 = 0;

        /* renamed from: c */
        public boolean f44705c = false;

        /* renamed from: c0 */
        public int f44706c0 = 0;

        /* renamed from: d */
        public int f44707d;

        /* renamed from: d0 */
        public int f44708d0 = 0;

        /* renamed from: e */
        public int f44709e;

        /* renamed from: e0 */
        public int f44710e0 = 0;

        /* renamed from: f */
        public int f44711f = -1;

        /* renamed from: f0 */
        public float f44712f0 = 1.0f;

        /* renamed from: g */
        public int f44713g = -1;

        /* renamed from: g0 */
        public float f44714g0 = 1.0f;

        /* renamed from: h */
        public float f44715h = -1.0f;

        /* renamed from: h0 */
        public int f44716h0 = -1;

        /* renamed from: i */
        public boolean f44717i = true;

        /* renamed from: i0 */
        public int f44718i0 = 0;

        /* renamed from: j */
        public int f44719j = -1;

        /* renamed from: j0 */
        public int f44720j0 = -1;

        /* renamed from: k */
        public int f44721k = -1;

        /* renamed from: k0 */
        public int[] f44722k0;

        /* renamed from: l */
        public int f44723l = -1;

        /* renamed from: l0 */
        public String f44724l0;

        /* renamed from: m */
        public int f44725m = -1;

        /* renamed from: m0 */
        public String f44726m0;

        /* renamed from: n */
        public int f44727n = -1;

        /* renamed from: n0 */
        public boolean f44728n0 = false;

        /* renamed from: o */
        public int f44729o = -1;

        /* renamed from: o0 */
        public boolean f44730o0 = false;

        /* renamed from: p */
        public int f44731p = -1;

        /* renamed from: p0 */
        public boolean f44732p0 = true;

        /* renamed from: q */
        public int f44733q = -1;

        /* renamed from: q0 */
        public int f44734q0 = 0;

        /* renamed from: r */
        public int f44735r = -1;

        /* renamed from: s */
        public int f44736s = -1;

        /* renamed from: t */
        public int f44737t = -1;

        /* renamed from: u */
        public int f44738u = -1;

        /* renamed from: v */
        public int f44739v = -1;

        /* renamed from: w */
        public int f44740w = -1;

        /* renamed from: x */
        public int f44741x = -1;

        /* renamed from: y */
        public float f44742y = 0.5f;

        /* renamed from: z */
        public float f44743z = 0.5f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f44661t0 = sparseIntArray;
            sparseIntArray.append(C16944e.C16957m.Layout_layout_constraintLeft_toLeftOf, 24);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintLeft_toRightOf, 25);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintRight_toLeftOf, 28);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintRight_toRightOf, 29);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintTop_toTopOf, 35);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintTop_toBottomOf, 34);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintBottom_toTopOf, 4);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintBottom_toBottomOf, 3);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f44661t0.append(C16944e.C16957m.Layout_layout_editor_absoluteX, 6);
            f44661t0.append(C16944e.C16957m.Layout_layout_editor_absoluteY, 7);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintGuide_begin, 17);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintGuide_end, 18);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintGuide_percent, 19);
            f44661t0.append(C16944e.C16957m.Layout_guidelineUseRtl, 90);
            f44661t0.append(C16944e.C16957m.Layout_android_orientation, 26);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintStart_toEndOf, 31);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintStart_toStartOf, 32);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintEnd_toStartOf, 10);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintEnd_toEndOf, 9);
            f44661t0.append(C16944e.C16957m.Layout_layout_goneMarginLeft, 13);
            f44661t0.append(C16944e.C16957m.Layout_layout_goneMarginTop, 16);
            f44661t0.append(C16944e.C16957m.Layout_layout_goneMarginRight, 14);
            f44661t0.append(C16944e.C16957m.Layout_layout_goneMarginBottom, 11);
            f44661t0.append(C16944e.C16957m.Layout_layout_goneMarginStart, 15);
            f44661t0.append(C16944e.C16957m.Layout_layout_goneMarginEnd, 12);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintVertical_weight, 38);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintHorizontal_weight, 37);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintHorizontal_chainStyle, 39);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintVertical_chainStyle, 40);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintHorizontal_bias, 20);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintVertical_bias, 36);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintDimensionRatio, 5);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintLeft_creator, 91);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintTop_creator, 91);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintRight_creator, 91);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintBottom_creator, 91);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintBaseline_creator, 91);
            f44661t0.append(C16944e.C16957m.Layout_android_layout_marginLeft, 23);
            f44661t0.append(C16944e.C16957m.Layout_android_layout_marginRight, 27);
            f44661t0.append(C16944e.C16957m.Layout_android_layout_marginStart, 30);
            f44661t0.append(C16944e.C16957m.Layout_android_layout_marginEnd, 8);
            f44661t0.append(C16944e.C16957m.Layout_android_layout_marginTop, 33);
            f44661t0.append(C16944e.C16957m.Layout_android_layout_marginBottom, 2);
            f44661t0.append(C16944e.C16957m.Layout_android_layout_width, 22);
            f44661t0.append(C16944e.C16957m.Layout_android_layout_height, 21);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintWidth, 41);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintHeight, 42);
            f44661t0.append(C16944e.C16957m.Layout_layout_constrainedWidth, 41);
            f44661t0.append(C16944e.C16957m.Layout_layout_constrainedHeight, 42);
            f44661t0.append(C16944e.C16957m.Layout_layout_wrapBehaviorInParent, 76);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintCircle, 61);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintCircleRadius, 62);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintCircleAngle, 63);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintWidth_percent, 69);
            f44661t0.append(C16944e.C16957m.Layout_layout_constraintHeight_percent, 70);
            f44661t0.append(C16944e.C16957m.Layout_chainUseRtl, 71);
            f44661t0.append(C16944e.C16957m.Layout_barrierDirection, 72);
            f44661t0.append(C16944e.C16957m.Layout_barrierMargin, 73);
            f44661t0.append(C16944e.C16957m.Layout_constraint_referenced_ids, 74);
            f44661t0.append(C16944e.C16957m.Layout_barrierAllowsGoneWidgets, 75);
        }

        /* renamed from: a */
        public void mo50944a(C16937b bVar) {
            this.f44701a = bVar.f44701a;
            this.f44707d = bVar.f44707d;
            this.f44703b = bVar.f44703b;
            this.f44709e = bVar.f44709e;
            this.f44711f = bVar.f44711f;
            this.f44713g = bVar.f44713g;
            this.f44715h = bVar.f44715h;
            this.f44717i = bVar.f44717i;
            this.f44719j = bVar.f44719j;
            this.f44721k = bVar.f44721k;
            this.f44723l = bVar.f44723l;
            this.f44725m = bVar.f44725m;
            this.f44727n = bVar.f44727n;
            this.f44729o = bVar.f44729o;
            this.f44731p = bVar.f44731p;
            this.f44733q = bVar.f44733q;
            this.f44735r = bVar.f44735r;
            this.f44736s = bVar.f44736s;
            this.f44737t = bVar.f44737t;
            this.f44738u = bVar.f44738u;
            this.f44739v = bVar.f44739v;
            this.f44740w = bVar.f44740w;
            this.f44741x = bVar.f44741x;
            this.f44742y = bVar.f44742y;
            this.f44743z = bVar.f44743z;
            this.f44675A = bVar.f44675A;
            this.f44676B = bVar.f44676B;
            this.f44677C = bVar.f44677C;
            this.f44678D = bVar.f44678D;
            this.f44679E = bVar.f44679E;
            this.f44680F = bVar.f44680F;
            this.f44681G = bVar.f44681G;
            this.f44682H = bVar.f44682H;
            this.f44683I = bVar.f44683I;
            this.f44684J = bVar.f44684J;
            this.f44685K = bVar.f44685K;
            this.f44686L = bVar.f44686L;
            this.f44687M = bVar.f44687M;
            this.f44688N = bVar.f44688N;
            this.f44689O = bVar.f44689O;
            this.f44690P = bVar.f44690P;
            this.f44691Q = bVar.f44691Q;
            this.f44692R = bVar.f44692R;
            this.f44693S = bVar.f44693S;
            this.f44694T = bVar.f44694T;
            this.f44695U = bVar.f44695U;
            this.f44696V = bVar.f44696V;
            this.f44697W = bVar.f44697W;
            this.f44698X = bVar.f44698X;
            this.f44699Y = bVar.f44699Y;
            this.f44700Z = bVar.f44700Z;
            this.f44702a0 = bVar.f44702a0;
            this.f44704b0 = bVar.f44704b0;
            this.f44706c0 = bVar.f44706c0;
            this.f44708d0 = bVar.f44708d0;
            this.f44710e0 = bVar.f44710e0;
            this.f44712f0 = bVar.f44712f0;
            this.f44714g0 = bVar.f44714g0;
            this.f44716h0 = bVar.f44716h0;
            this.f44718i0 = bVar.f44718i0;
            this.f44720j0 = bVar.f44720j0;
            this.f44726m0 = bVar.f44726m0;
            int[] iArr = bVar.f44722k0;
            if (iArr == null || bVar.f44724l0 != null) {
                this.f44722k0 = null;
            } else {
                this.f44722k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f44724l0 = bVar.f44724l0;
            this.f44728n0 = bVar.f44728n0;
            this.f44730o0 = bVar.f44730o0;
            this.f44732p0 = bVar.f44732p0;
            this.f44734q0 = bVar.f44734q0;
        }

        /* JADX WARNING: type inference failed for: r2v8, types: [java.lang.String] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo50945b(androidx.constraintlayout.motion.widget.C16900s r10, java.lang.StringBuilder r11) {
            /*
                r9 = this;
                java.lang.Class r0 = r9.getClass()
                java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
                java.lang.String r1 = "\n"
                r11.append(r1)
                r1 = 0
            L_0x000e:
                int r2 = r0.length
                if (r1 >= r2) goto L_0x0080
                r2 = r0[r1]
                java.lang.String r3 = r2.getName()
                int r4 = r2.getModifiers()
                boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
                if (r4 == 0) goto L_0x0022
                goto L_0x007d
            L_0x0022:
                java.lang.Object r4 = r2.get(r9)     // Catch:{ IllegalAccessException -> 0x0079 }
                java.lang.Class r2 = r2.getType()     // Catch:{ IllegalAccessException -> 0x0079 }
                java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException -> 0x0079 }
                java.lang.String r6 = "\"\n"
                java.lang.String r7 = " = \""
                java.lang.String r8 = "    "
                if (r2 != r5) goto L_0x0059
                java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ IllegalAccessException -> 0x0079 }
                int r2 = r4.intValue()     // Catch:{ IllegalAccessException -> 0x0079 }
                r5 = -1
                if (r2 == r5) goto L_0x007d
                int r2 = r4.intValue()     // Catch:{ IllegalAccessException -> 0x0079 }
                java.lang.String r2 = r10.mo50313X(r2)     // Catch:{ IllegalAccessException -> 0x0079 }
                r11.append(r8)     // Catch:{ IllegalAccessException -> 0x0079 }
                r11.append(r3)     // Catch:{ IllegalAccessException -> 0x0079 }
                r11.append(r7)     // Catch:{ IllegalAccessException -> 0x0079 }
                if (r2 != 0) goto L_0x0051
                goto L_0x0052
            L_0x0051:
                r4 = r2
            L_0x0052:
                r11.append(r4)     // Catch:{ IllegalAccessException -> 0x0079 }
                r11.append(r6)     // Catch:{ IllegalAccessException -> 0x0079 }
                goto L_0x007d
            L_0x0059:
                java.lang.Class r5 = java.lang.Float.TYPE     // Catch:{ IllegalAccessException -> 0x0079 }
                if (r2 != r5) goto L_0x007d
                java.lang.Float r4 = (java.lang.Float) r4     // Catch:{ IllegalAccessException -> 0x0079 }
                float r2 = r4.floatValue()     // Catch:{ IllegalAccessException -> 0x0079 }
                r5 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 == 0) goto L_0x007d
                r11.append(r8)     // Catch:{ IllegalAccessException -> 0x0079 }
                r11.append(r3)     // Catch:{ IllegalAccessException -> 0x0079 }
                r11.append(r7)     // Catch:{ IllegalAccessException -> 0x0079 }
                r11.append(r4)     // Catch:{ IllegalAccessException -> 0x0079 }
                r11.append(r6)     // Catch:{ IllegalAccessException -> 0x0079 }
                goto L_0x007d
            L_0x0079:
                r2 = move-exception
                r2.printStackTrace()
            L_0x007d:
                int r1 = r1 + 1
                goto L_0x000e
            L_0x0080:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C16934c.C16937b.mo50945b(androidx.constraintlayout.motion.widget.s, java.lang.StringBuilder):void");
        }

        /* renamed from: c */
        public void mo50946c(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16944e.C16957m.Layout);
            this.f44703b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f44661t0.get(index);
                switch (i2) {
                    case 1:
                        this.f44735r = C16934c.m78359y0(obtainStyledAttributes, index, this.f44735r);
                        break;
                    case 2:
                        this.f44685K = obtainStyledAttributes.getDimensionPixelSize(index, this.f44685K);
                        break;
                    case 3:
                        this.f44733q = C16934c.m78359y0(obtainStyledAttributes, index, this.f44733q);
                        break;
                    case 4:
                        this.f44731p = C16934c.m78359y0(obtainStyledAttributes, index, this.f44731p);
                        break;
                    case 5:
                        this.f44675A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f44679E = obtainStyledAttributes.getDimensionPixelOffset(index, this.f44679E);
                        break;
                    case 7:
                        this.f44680F = obtainStyledAttributes.getDimensionPixelOffset(index, this.f44680F);
                        break;
                    case 8:
                        this.f44686L = obtainStyledAttributes.getDimensionPixelSize(index, this.f44686L);
                        break;
                    case 9:
                        this.f44741x = C16934c.m78359y0(obtainStyledAttributes, index, this.f44741x);
                        break;
                    case 10:
                        this.f44740w = C16934c.m78359y0(obtainStyledAttributes, index, this.f44740w);
                        break;
                    case 11:
                        this.f44692R = obtainStyledAttributes.getDimensionPixelSize(index, this.f44692R);
                        break;
                    case 12:
                        this.f44693S = obtainStyledAttributes.getDimensionPixelSize(index, this.f44693S);
                        break;
                    case 13:
                        this.f44689O = obtainStyledAttributes.getDimensionPixelSize(index, this.f44689O);
                        break;
                    case 14:
                        this.f44691Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f44691Q);
                        break;
                    case 15:
                        this.f44694T = obtainStyledAttributes.getDimensionPixelSize(index, this.f44694T);
                        break;
                    case 16:
                        this.f44690P = obtainStyledAttributes.getDimensionPixelSize(index, this.f44690P);
                        break;
                    case 17:
                        this.f44711f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f44711f);
                        break;
                    case 18:
                        this.f44713g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f44713g);
                        break;
                    case 19:
                        this.f44715h = obtainStyledAttributes.getFloat(index, this.f44715h);
                        break;
                    case 20:
                        this.f44742y = obtainStyledAttributes.getFloat(index, this.f44742y);
                        break;
                    case 21:
                        this.f44709e = obtainStyledAttributes.getLayoutDimension(index, this.f44709e);
                        break;
                    case 22:
                        this.f44707d = obtainStyledAttributes.getLayoutDimension(index, this.f44707d);
                        break;
                    case 23:
                        this.f44682H = obtainStyledAttributes.getDimensionPixelSize(index, this.f44682H);
                        break;
                    case 24:
                        this.f44719j = C16934c.m78359y0(obtainStyledAttributes, index, this.f44719j);
                        break;
                    case 25:
                        this.f44721k = C16934c.m78359y0(obtainStyledAttributes, index, this.f44721k);
                        break;
                    case 26:
                        this.f44681G = obtainStyledAttributes.getInt(index, this.f44681G);
                        break;
                    case 27:
                        this.f44683I = obtainStyledAttributes.getDimensionPixelSize(index, this.f44683I);
                        break;
                    case 28:
                        this.f44723l = C16934c.m78359y0(obtainStyledAttributes, index, this.f44723l);
                        break;
                    case 29:
                        this.f44725m = C16934c.m78359y0(obtainStyledAttributes, index, this.f44725m);
                        break;
                    case 30:
                        this.f44687M = obtainStyledAttributes.getDimensionPixelSize(index, this.f44687M);
                        break;
                    case 31:
                        this.f44738u = C16934c.m78359y0(obtainStyledAttributes, index, this.f44738u);
                        break;
                    case 32:
                        this.f44739v = C16934c.m78359y0(obtainStyledAttributes, index, this.f44739v);
                        break;
                    case 33:
                        this.f44684J = obtainStyledAttributes.getDimensionPixelSize(index, this.f44684J);
                        break;
                    case 34:
                        this.f44729o = C16934c.m78359y0(obtainStyledAttributes, index, this.f44729o);
                        break;
                    case 35:
                        this.f44727n = C16934c.m78359y0(obtainStyledAttributes, index, this.f44727n);
                        break;
                    case 36:
                        this.f44743z = obtainStyledAttributes.getFloat(index, this.f44743z);
                        break;
                    case 37:
                        this.f44697W = obtainStyledAttributes.getFloat(index, this.f44697W);
                        break;
                    case 38:
                        this.f44696V = obtainStyledAttributes.getFloat(index, this.f44696V);
                        break;
                    case 39:
                        this.f44698X = obtainStyledAttributes.getInt(index, this.f44698X);
                        break;
                    case 40:
                        this.f44699Y = obtainStyledAttributes.getInt(index, this.f44699Y);
                        break;
                    case 41:
                        C16934c.m78340A0(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        C16934c.m78340A0(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.f44676B = C16934c.m78359y0(obtainStyledAttributes, index, this.f44676B);
                                break;
                            case 62:
                                this.f44677C = obtainStyledAttributes.getDimensionPixelSize(index, this.f44677C);
                                break;
                            case 63:
                                this.f44678D = obtainStyledAttributes.getFloat(index, this.f44678D);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f44712f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f44714g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        break;
                                    case 72:
                                        this.f44716h0 = obtainStyledAttributes.getInt(index, this.f44716h0);
                                        break;
                                    case 73:
                                        this.f44718i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f44718i0);
                                        break;
                                    case 74:
                                        this.f44724l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f44732p0 = obtainStyledAttributes.getBoolean(index, this.f44732p0);
                                        break;
                                    case 76:
                                        this.f44734q0 = obtainStyledAttributes.getInt(index, this.f44734q0);
                                        break;
                                    case 77:
                                        this.f44736s = C16934c.m78359y0(obtainStyledAttributes, index, this.f44736s);
                                        break;
                                    case 78:
                                        this.f44737t = C16934c.m78359y0(obtainStyledAttributes, index, this.f44737t);
                                        break;
                                    case 79:
                                        this.f44695U = obtainStyledAttributes.getDimensionPixelSize(index, this.f44695U);
                                        break;
                                    case 80:
                                        this.f44688N = obtainStyledAttributes.getDimensionPixelSize(index, this.f44688N);
                                        break;
                                    case 81:
                                        this.f44700Z = obtainStyledAttributes.getInt(index, this.f44700Z);
                                        break;
                                    case 82:
                                        this.f44702a0 = obtainStyledAttributes.getInt(index, this.f44702a0);
                                        break;
                                    case 83:
                                        this.f44706c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f44706c0);
                                        break;
                                    case 84:
                                        this.f44704b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f44704b0);
                                        break;
                                    case 85:
                                        this.f44710e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f44710e0);
                                        break;
                                    case 86:
                                        this.f44708d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f44708d0);
                                        break;
                                    case 87:
                                        this.f44728n0 = obtainStyledAttributes.getBoolean(index, this.f44728n0);
                                        break;
                                    case 88:
                                        this.f44730o0 = obtainStyledAttributes.getBoolean(index, this.f44730o0);
                                        break;
                                    case 89:
                                        this.f44726m0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f44717i = obtainStyledAttributes.getBoolean(index, this.f44717i);
                                        break;
                                    case 91:
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("unused attribute 0x");
                                        sb.append(Integer.toHexString(index));
                                        sb.append("   ");
                                        sb.append(f44661t0.get(index));
                                        break;
                                    default:
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Unknown attribute 0x");
                                        sb2.append(Integer.toHexString(index));
                                        sb2.append("   ");
                                        sb2.append(f44661t0.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c */
    public static class C16938c {

        /* renamed from: A */
        public static final int f44744A = 9;

        /* renamed from: B */
        public static final int f44745B = 10;

        /* renamed from: o */
        public static final int f44746o = -2;

        /* renamed from: p */
        public static final int f44747p = -1;

        /* renamed from: q */
        public static final int f44748q = -3;

        /* renamed from: r */
        public static SparseIntArray f44749r = null;

        /* renamed from: s */
        public static final int f44750s = 1;

        /* renamed from: t */
        public static final int f44751t = 2;

        /* renamed from: u */
        public static final int f44752u = 3;

        /* renamed from: v */
        public static final int f44753v = 4;

        /* renamed from: w */
        public static final int f44754w = 5;

        /* renamed from: x */
        public static final int f44755x = 6;

        /* renamed from: y */
        public static final int f44756y = 7;

        /* renamed from: z */
        public static final int f44757z = 8;

        /* renamed from: a */
        public boolean f44758a = false;

        /* renamed from: b */
        public int f44759b = -1;

        /* renamed from: c */
        public int f44760c = 0;

        /* renamed from: d */
        public String f44761d = null;

        /* renamed from: e */
        public int f44762e = -1;

        /* renamed from: f */
        public int f44763f = 0;

        /* renamed from: g */
        public float f44764g = Float.NaN;

        /* renamed from: h */
        public int f44765h = -1;

        /* renamed from: i */
        public float f44766i = Float.NaN;

        /* renamed from: j */
        public float f44767j = Float.NaN;

        /* renamed from: k */
        public int f44768k = -1;

        /* renamed from: l */
        public String f44769l = null;

        /* renamed from: m */
        public int f44770m = -3;

        /* renamed from: n */
        public int f44771n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f44749r = sparseIntArray;
            sparseIntArray.append(C16944e.C16957m.Motion_motionPathRotate, 1);
            f44749r.append(C16944e.C16957m.Motion_pathMotionArc, 2);
            f44749r.append(C16944e.C16957m.Motion_transitionEasing, 3);
            f44749r.append(C16944e.C16957m.Motion_drawPath, 4);
            f44749r.append(C16944e.C16957m.Motion_animateRelativeTo, 5);
            f44749r.append(C16944e.C16957m.Motion_animateCircleAngleTo, 6);
            f44749r.append(C16944e.C16957m.Motion_motionStagger, 7);
            f44749r.append(C16944e.C16957m.Motion_quantizeMotionSteps, 8);
            f44749r.append(C16944e.C16957m.Motion_quantizeMotionPhase, 9);
            f44749r.append(C16944e.C16957m.Motion_quantizeMotionInterpolator, 10);
        }

        /* renamed from: a */
        public void mo50947a(C16938c cVar) {
            this.f44758a = cVar.f44758a;
            this.f44759b = cVar.f44759b;
            this.f44761d = cVar.f44761d;
            this.f44762e = cVar.f44762e;
            this.f44763f = cVar.f44763f;
            this.f44766i = cVar.f44766i;
            this.f44764g = cVar.f44764g;
            this.f44765h = cVar.f44765h;
        }

        /* renamed from: b */
        public void mo50948b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16944e.C16957m.Motion);
            this.f44758a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f44749r.get(index)) {
                    case 1:
                        this.f44766i = obtainStyledAttributes.getFloat(index, this.f44766i);
                        break;
                    case 2:
                        this.f44762e = obtainStyledAttributes.getInt(index, this.f44762e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f44761d = C16680d.f41937o[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f44761d = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f44763f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f44759b = C16934c.m78359y0(obtainStyledAttributes, index, this.f44759b);
                        break;
                    case 6:
                        this.f44760c = obtainStyledAttributes.getInteger(index, this.f44760c);
                        break;
                    case 7:
                        this.f44764g = obtainStyledAttributes.getFloat(index, this.f44764g);
                        break;
                    case 8:
                        this.f44768k = obtainStyledAttributes.getInteger(index, this.f44768k);
                        break;
                    case 9:
                        this.f44767j = obtainStyledAttributes.getFloat(index, this.f44767j);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 != 1) {
                            if (i2 != 3) {
                                this.f44770m = obtainStyledAttributes.getInteger(index, this.f44771n);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f44769l = string;
                                if (string.indexOf("/") <= 0) {
                                    this.f44770m = -1;
                                    break;
                                } else {
                                    this.f44771n = obtainStyledAttributes.getResourceId(index, -1);
                                    this.f44770m = -2;
                                    break;
                                }
                            }
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f44771n = resourceId;
                            if (resourceId == -1) {
                                break;
                            } else {
                                this.f44770m = -2;
                                break;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$d */
    public static class C16939d {

        /* renamed from: a */
        public boolean f44772a = false;

        /* renamed from: b */
        public int f44773b = 0;

        /* renamed from: c */
        public int f44774c = 0;

        /* renamed from: d */
        public float f44775d = 1.0f;

        /* renamed from: e */
        public float f44776e = Float.NaN;

        /* renamed from: a */
        public void mo50949a(C16939d dVar) {
            this.f44772a = dVar.f44772a;
            this.f44773b = dVar.f44773b;
            this.f44775d = dVar.f44775d;
            this.f44776e = dVar.f44776e;
            this.f44774c = dVar.f44774c;
        }

        /* renamed from: b */
        public void mo50950b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16944e.C16957m.PropertySet);
            this.f44772a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.PropertySet_android_alpha) {
                    this.f44775d = obtainStyledAttributes.getFloat(index, this.f44775d);
                } else if (index == C16944e.C16957m.PropertySet_android_visibility) {
                    this.f44773b = obtainStyledAttributes.getInt(index, this.f44773b);
                    this.f44773b = C16934c.f44488U[this.f44773b];
                } else if (index == C16944e.C16957m.PropertySet_visibilityMode) {
                    this.f44774c = obtainStyledAttributes.getInt(index, this.f44774c);
                } else if (index == C16944e.C16957m.PropertySet_motionProgress) {
                    this.f44776e = obtainStyledAttributes.getFloat(index, this.f44776e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$e */
    public static class C16940e {

        /* renamed from: A */
        public static final int f44777A = 12;

        /* renamed from: o */
        public static SparseIntArray f44778o = null;

        /* renamed from: p */
        public static final int f44779p = 1;

        /* renamed from: q */
        public static final int f44780q = 2;

        /* renamed from: r */
        public static final int f44781r = 3;

        /* renamed from: s */
        public static final int f44782s = 4;

        /* renamed from: t */
        public static final int f44783t = 5;

        /* renamed from: u */
        public static final int f44784u = 6;

        /* renamed from: v */
        public static final int f44785v = 7;

        /* renamed from: w */
        public static final int f44786w = 8;

        /* renamed from: x */
        public static final int f44787x = 9;

        /* renamed from: y */
        public static final int f44788y = 10;

        /* renamed from: z */
        public static final int f44789z = 11;

        /* renamed from: a */
        public boolean f44790a = false;

        /* renamed from: b */
        public float f44791b = 0.0f;

        /* renamed from: c */
        public float f44792c = 0.0f;

        /* renamed from: d */
        public float f44793d = 0.0f;

        /* renamed from: e */
        public float f44794e = 1.0f;

        /* renamed from: f */
        public float f44795f = 1.0f;

        /* renamed from: g */
        public float f44796g = Float.NaN;

        /* renamed from: h */
        public float f44797h = Float.NaN;

        /* renamed from: i */
        public int f44798i = -1;

        /* renamed from: j */
        public float f44799j = 0.0f;

        /* renamed from: k */
        public float f44800k = 0.0f;

        /* renamed from: l */
        public float f44801l = 0.0f;

        /* renamed from: m */
        public boolean f44802m = false;

        /* renamed from: n */
        public float f44803n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f44778o = sparseIntArray;
            sparseIntArray.append(C16944e.C16957m.Transform_android_rotation, 1);
            f44778o.append(C16944e.C16957m.Transform_android_rotationX, 2);
            f44778o.append(C16944e.C16957m.Transform_android_rotationY, 3);
            f44778o.append(C16944e.C16957m.Transform_android_scaleX, 4);
            f44778o.append(C16944e.C16957m.Transform_android_scaleY, 5);
            f44778o.append(C16944e.C16957m.Transform_android_transformPivotX, 6);
            f44778o.append(C16944e.C16957m.Transform_android_transformPivotY, 7);
            f44778o.append(C16944e.C16957m.Transform_android_translationX, 8);
            f44778o.append(C16944e.C16957m.Transform_android_translationY, 9);
            f44778o.append(C16944e.C16957m.Transform_android_translationZ, 10);
            f44778o.append(C16944e.C16957m.Transform_android_elevation, 11);
            f44778o.append(C16944e.C16957m.Transform_transformPivotTarget, 12);
        }

        /* renamed from: a */
        public void mo50951a(C16940e eVar) {
            this.f44790a = eVar.f44790a;
            this.f44791b = eVar.f44791b;
            this.f44792c = eVar.f44792c;
            this.f44793d = eVar.f44793d;
            this.f44794e = eVar.f44794e;
            this.f44795f = eVar.f44795f;
            this.f44796g = eVar.f44796g;
            this.f44797h = eVar.f44797h;
            this.f44798i = eVar.f44798i;
            this.f44799j = eVar.f44799j;
            this.f44800k = eVar.f44800k;
            this.f44801l = eVar.f44801l;
            this.f44802m = eVar.f44802m;
            this.f44803n = eVar.f44803n;
        }

        /* renamed from: b */
        public void mo50952b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16944e.C16957m.Transform);
            this.f44790a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f44778o.get(index)) {
                    case 1:
                        this.f44791b = obtainStyledAttributes.getFloat(index, this.f44791b);
                        break;
                    case 2:
                        this.f44792c = obtainStyledAttributes.getFloat(index, this.f44792c);
                        break;
                    case 3:
                        this.f44793d = obtainStyledAttributes.getFloat(index, this.f44793d);
                        break;
                    case 4:
                        this.f44794e = obtainStyledAttributes.getFloat(index, this.f44794e);
                        break;
                    case 5:
                        this.f44795f = obtainStyledAttributes.getFloat(index, this.f44795f);
                        break;
                    case 6:
                        this.f44796g = obtainStyledAttributes.getDimension(index, this.f44796g);
                        break;
                    case 7:
                        this.f44797h = obtainStyledAttributes.getDimension(index, this.f44797h);
                        break;
                    case 8:
                        this.f44799j = obtainStyledAttributes.getDimension(index, this.f44799j);
                        break;
                    case 9:
                        this.f44800k = obtainStyledAttributes.getDimension(index, this.f44800k);
                        break;
                    case 10:
                        this.f44801l = obtainStyledAttributes.getDimension(index, this.f44801l);
                        break;
                    case 11:
                        this.f44802m = true;
                        this.f44803n = obtainStyledAttributes.getDimension(index, this.f44803n);
                        break;
                    case 12:
                        this.f44798i = C16934c.m78359y0(obtainStyledAttributes, index, this.f44798i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$f */
    public class C16941f {

        /* renamed from: o */
        public static final String f44804o = "       ";

        /* renamed from: a */
        public Writer f44805a;

        /* renamed from: b */
        public ConstraintLayout f44806b;

        /* renamed from: c */
        public Context f44807c;

        /* renamed from: d */
        public int f44808d;

        /* renamed from: e */
        public int f44809e = 0;

        /* renamed from: f */
        public final String f44810f = "'left'";

        /* renamed from: g */
        public final String f44811g = "'right'";

        /* renamed from: h */
        public final String f44812h = "'baseline'";

        /* renamed from: i */
        public final String f44813i = "'bottom'";

        /* renamed from: j */
        public final String f44814j = "'top'";

        /* renamed from: k */
        public final String f44815k = "'start'";

        /* renamed from: l */
        public final String f44816l = "'end'";

        /* renamed from: m */
        public HashMap<Integer, String> f44817m = new HashMap<>();

        public C16941f(Writer writer, ConstraintLayout constraintLayout, int i) throws IOException {
            this.f44805a = writer;
            this.f44806b = constraintLayout;
            this.f44807c = constraintLayout.getContext();
            this.f44808d = i;
        }

        /* renamed from: a */
        public String mo50953a(int i) {
            if (this.f44817m.containsKey(Integer.valueOf(i))) {
                return "'" + this.f44817m.get(Integer.valueOf(i)) + "'";
            } else if (i == 0) {
                return "'parent'";
            } else {
                String b = mo50954b(i);
                this.f44817m.put(Integer.valueOf(i), b);
                return "'" + b + "'";
            }
        }

        /* renamed from: b */
        public String mo50954b(int i) {
            if (i != -1) {
                try {
                    return this.f44807c.getResources().getResourceEntryName(i);
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown");
                    int i2 = this.f44809e + 1;
                    this.f44809e = i2;
                    sb.append(i2);
                    return sb.toString();
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unknown");
                int i3 = this.f44809e + 1;
                this.f44809e = i3;
                sb2.append(i3);
                return sb2.toString();
            }
        }

        /* renamed from: c */
        public void mo50955c(int i, float f, int i2) throws IOException {
            if (i != -1) {
                this.f44805a.write("       circle");
                this.f44805a.write(":[");
                this.f44805a.write(mo50953a(i));
                Writer writer = this.f44805a;
                writer.write(", " + f);
                Writer writer2 = this.f44805a;
                writer2.write(i2 + "]");
            }
        }

        /* renamed from: d */
        public void mo50956d(String str, int i, String str2, int i2, int i3) throws IOException {
            if (i != -1) {
                Writer writer = this.f44805a;
                writer.write(f44804o + str);
                this.f44805a.write(":[");
                this.f44805a.write(mo50953a(i));
                this.f44805a.write(" , ");
                this.f44805a.write(str2);
                if (i2 != 0) {
                    Writer writer2 = this.f44805a;
                    writer2.write(" , " + i2);
                }
                this.f44805a.write("],\n");
            }
        }

        /* renamed from: e */
        public final void mo50957e(String str, int i, int i2, float f, int i3, int i4, boolean z) throws IOException {
            if (i == 0) {
                if (i4 == -1 && i3 == -1) {
                    if (i2 == 1) {
                        Writer writer = this.f44805a;
                        writer.write(f44804o + str + ": '???????????',\n");
                    } else if (i2 == 2) {
                        Writer writer2 = this.f44805a;
                        writer2.write(f44804o + str + ": '" + f + "%',\n");
                    }
                } else if (i2 == 0) {
                    Writer writer3 = this.f44805a;
                    writer3.write(f44804o + str + ": {'spread' ," + i3 + ", " + i4 + "}\n");
                } else if (i2 == 1) {
                    Writer writer4 = this.f44805a;
                    writer4.write(f44804o + str + ": {'wrap' ," + i3 + ", " + i4 + "}\n");
                } else if (i2 == 2) {
                    Writer writer5 = this.f44805a;
                    writer5.write(f44804o + str + ": {'" + f + "'% ," + i3 + ", " + i4 + "}\n");
                }
            } else if (i == -2) {
                Writer writer6 = this.f44805a;
                writer6.write(f44804o + str + ": 'wrap'\n");
            } else if (i == -1) {
                Writer writer7 = this.f44805a;
                writer7.write(f44804o + str + ": 'parent'\n");
            } else {
                Writer writer8 = this.f44805a;
                writer8.write(f44804o + str + ": " + i + ",\n");
            }
        }

        /* renamed from: f */
        public final void mo50958f(int i, int i2, int i3, float f) {
        }

        /* renamed from: g */
        public void mo50959g() throws IOException {
            this.f44805a.write("\n'ConstraintSet':{\n");
            for (Integer num : C16934c.this.f44579g.keySet()) {
                String a = mo50953a(num.intValue());
                Writer writer = this.f44805a;
                writer.write(a + ":{\n");
                C16937b bVar = ((C16935a) C16934c.this.f44579g.get(num)).f44584e;
                mo50957e("height", bVar.f44709e, bVar.f44702a0, bVar.f44714g0, bVar.f44710e0, bVar.f44706c0, bVar.f44730o0);
                mo50957e("width", bVar.f44707d, bVar.f44700Z, bVar.f44712f0, bVar.f44708d0, bVar.f44704b0, bVar.f44728n0);
                mo50956d("'left'", bVar.f44719j, "'left'", bVar.f44682H, bVar.f44689O);
                mo50956d("'left'", bVar.f44721k, "'right'", bVar.f44682H, bVar.f44689O);
                mo50956d("'right'", bVar.f44723l, "'left'", bVar.f44683I, bVar.f44691Q);
                mo50956d("'right'", bVar.f44725m, "'right'", bVar.f44683I, bVar.f44691Q);
                mo50956d("'baseline'", bVar.f44735r, "'baseline'", -1, bVar.f44695U);
                mo50956d("'baseline'", bVar.f44736s, "'top'", -1, bVar.f44695U);
                mo50956d("'baseline'", bVar.f44737t, "'bottom'", -1, bVar.f44695U);
                mo50956d("'top'", bVar.f44729o, "'bottom'", bVar.f44684J, bVar.f44690P);
                mo50956d("'top'", bVar.f44727n, "'top'", bVar.f44684J, bVar.f44690P);
                mo50956d("'bottom'", bVar.f44733q, "'bottom'", bVar.f44685K, bVar.f44692R);
                mo50956d("'bottom'", bVar.f44731p, "'top'", bVar.f44685K, bVar.f44692R);
                mo50956d("'start'", bVar.f44739v, "'start'", bVar.f44687M, bVar.f44694T);
                mo50956d("'start'", bVar.f44738u, "'end'", bVar.f44687M, bVar.f44694T);
                mo50956d("'end'", bVar.f44740w, "'start'", bVar.f44686L, bVar.f44693S);
                mo50956d("'end'", bVar.f44741x, "'end'", bVar.f44686L, bVar.f44693S);
                mo50961i("'horizontalBias'", bVar.f44742y, 0.5f);
                mo50961i("'verticalBias'", bVar.f44743z, 0.5f);
                mo50955c(bVar.f44676B, bVar.f44678D, bVar.f44677C);
                mo50958f(bVar.f44681G, bVar.f44711f, bVar.f44713g, bVar.f44715h);
                mo50963k("'dimensionRatio'", bVar.f44675A);
                mo50962j("'barrierMargin'", bVar.f44718i0);
                mo50962j("'type'", bVar.f44720j0);
                mo50963k("'ReferenceId'", bVar.f44724l0);
                mo50965m("'mBarrierAllowsGoneWidgets'", bVar.f44732p0, true);
                mo50962j("'WrapBehavior'", bVar.f44734q0);
                mo50960h("'verticalWeight'", bVar.f44696V);
                mo50960h("'horizontalWeight'", bVar.f44697W);
                mo50962j("'horizontalChainStyle'", bVar.f44698X);
                mo50962j("'verticalChainStyle'", bVar.f44699Y);
                mo50962j("'barrierDirection'", bVar.f44716h0);
                int[] iArr = bVar.f44722k0;
                if (iArr != null) {
                    mo50966n("'ReferenceIds'", iArr);
                }
                this.f44805a.write("}\n");
            }
            this.f44805a.write("}\n");
        }

        /* renamed from: h */
        public void mo50960h(String str, float f) throws IOException {
            if (f != -1.0f) {
                Writer writer = this.f44805a;
                writer.write(f44804o + str);
                Writer writer2 = this.f44805a;
                writer2.write(": " + f);
                this.f44805a.write(",\n");
            }
        }

        /* renamed from: i */
        public void mo50961i(String str, float f, float f2) throws IOException {
            if (f != f2) {
                Writer writer = this.f44805a;
                writer.write(f44804o + str);
                Writer writer2 = this.f44805a;
                writer2.write(": " + f);
                this.f44805a.write(",\n");
            }
        }

        /* renamed from: j */
        public void mo50962j(String str, int i) throws IOException {
            if (i != 0 && i != -1) {
                Writer writer = this.f44805a;
                writer.write(f44804o + str);
                this.f44805a.write(C33124s.f80355c);
                Writer writer2 = this.f44805a;
                writer2.write(", " + i);
                this.f44805a.write("\n");
            }
        }

        /* renamed from: k */
        public void mo50963k(String str, String str2) throws IOException {
            if (str2 != null) {
                Writer writer = this.f44805a;
                writer.write(f44804o + str);
                this.f44805a.write(C33124s.f80355c);
                Writer writer2 = this.f44805a;
                writer2.write(", " + str2);
                this.f44805a.write("\n");
            }
        }

        /* renamed from: l */
        public void mo50964l(String str, boolean z) throws IOException {
            if (z) {
                Writer writer = this.f44805a;
                writer.write(f44804o + str);
                Writer writer2 = this.f44805a;
                writer2.write(": " + z);
                this.f44805a.write(",\n");
            }
        }

        /* renamed from: m */
        public void mo50965m(String str, boolean z, boolean z2) throws IOException {
            if (z != z2) {
                Writer writer = this.f44805a;
                writer.write(f44804o + str);
                Writer writer2 = this.f44805a;
                writer2.write(": " + z);
                this.f44805a.write(",\n");
            }
        }

        /* renamed from: n */
        public void mo50966n(String str, int[] iArr) throws IOException {
            String str2;
            if (iArr != null) {
                Writer writer = this.f44805a;
                writer.write(f44804o + str);
                this.f44805a.write(": ");
                for (int i = 0; i < iArr.length; i++) {
                    Writer writer2 = this.f44805a;
                    StringBuilder sb = new StringBuilder();
                    if (i == 0) {
                        str2 = "[";
                    } else {
                        str2 = ", ";
                    }
                    sb.append(str2);
                    sb.append(mo50953a(iArr[i]));
                    writer2.write(sb.toString());
                }
                this.f44805a.write("],\n");
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$g */
    public class C16942g {

        /* renamed from: o */
        public static final String f44819o = "\n       ";

        /* renamed from: a */
        public Writer f44820a;

        /* renamed from: b */
        public ConstraintLayout f44821b;

        /* renamed from: c */
        public Context f44822c;

        /* renamed from: d */
        public int f44823d;

        /* renamed from: e */
        public int f44824e = 0;

        /* renamed from: f */
        public final String f44825f = "'left'";

        /* renamed from: g */
        public final String f44826g = "'right'";

        /* renamed from: h */
        public final String f44827h = "'baseline'";

        /* renamed from: i */
        public final String f44828i = "'bottom'";

        /* renamed from: j */
        public final String f44829j = "'top'";

        /* renamed from: k */
        public final String f44830k = "'start'";

        /* renamed from: l */
        public final String f44831l = "'end'";

        /* renamed from: m */
        public HashMap<Integer, String> f44832m = new HashMap<>();

        public C16942g(Writer writer, ConstraintLayout constraintLayout, int i) throws IOException {
            this.f44820a = writer;
            this.f44821b = constraintLayout;
            this.f44822c = constraintLayout.getContext();
            this.f44823d = i;
        }

        /* renamed from: a */
        public String mo50967a(int i) {
            if (this.f44832m.containsKey(Integer.valueOf(i))) {
                return "@+id/" + this.f44832m.get(Integer.valueOf(i)) + "";
            } else if (i == 0) {
                return C16934c.f44493V1;
            } else {
                String b = mo50968b(i);
                this.f44832m.put(Integer.valueOf(i), b);
                return "@+id/" + b + "";
            }
        }

        /* renamed from: b */
        public String mo50968b(int i) {
            if (i != -1) {
                try {
                    return this.f44822c.getResources().getResourceEntryName(i);
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown");
                    int i2 = this.f44824e + 1;
                    this.f44824e = i2;
                    sb.append(i2);
                    return sb.toString();
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unknown");
                int i3 = this.f44824e + 1;
                this.f44824e = i3;
                sb2.append(i3);
                return sb2.toString();
            }
        }

        /* renamed from: c */
        public final void mo50969c(String str, int i, int i2) throws IOException {
            if (i == i2) {
                return;
            }
            if (i == -2) {
                Writer writer = this.f44820a;
                writer.write(f44819o + str + "=\"wrap_content\"");
            } else if (i == -1) {
                Writer writer2 = this.f44820a;
                writer2.write(f44819o + str + "=\"match_parent\"");
            } else {
                Writer writer3 = this.f44820a;
                writer3.write(f44819o + str + "=\"" + i + "dp\"");
            }
        }

        /* renamed from: d */
        public final void mo50970d(String str, boolean z, boolean z2) throws IOException {
            if (z != z2) {
                Writer writer = this.f44820a;
                writer.write(f44819o + str + "=\"" + z + "dp\"");
            }
        }

        /* renamed from: e */
        public void mo50971e(int i, float f, int i2) throws IOException {
            if (i != -1) {
                this.f44820a.write("circle");
                this.f44820a.write(":[");
                this.f44820a.write(mo50967a(i));
                Writer writer = this.f44820a;
                writer.write(", " + f);
                Writer writer2 = this.f44820a;
                writer2.write(i2 + "]");
            }
        }

        /* renamed from: f */
        public void mo50972f(String str, int i, String str2, int i2, int i3) throws IOException {
            if (i != -1) {
                Writer writer = this.f44820a;
                writer.write(f44819o + str);
                this.f44820a.write(":[");
                this.f44820a.write(mo50967a(i));
                this.f44820a.write(" , ");
                this.f44820a.write(str2);
                if (i2 != 0) {
                    Writer writer2 = this.f44820a;
                    writer2.write(" , " + i2);
                }
                this.f44820a.write("],\n");
            }
        }

        /* renamed from: g */
        public final void mo50973g(String str, int i, int i2) throws IOException {
            if (i != i2) {
                Writer writer = this.f44820a;
                writer.write(f44819o + str + "=\"" + i + "dp\"");
            }
        }

        /* renamed from: h */
        public final void mo50974h(String str, int i, String[] strArr, int i2) throws IOException {
            if (i != i2) {
                Writer writer = this.f44820a;
                writer.write(f44819o + str + "=\"" + strArr[i] + "\"");
            }
        }

        /* renamed from: i */
        public void mo50975i() throws IOException {
            this.f44820a.write("\n<ConstraintSet>\n");
            for (Integer num : C16934c.this.f44579g.keySet()) {
                String a = mo50967a(num.intValue());
                this.f44820a.write("  <Constraint");
                Writer writer = this.f44820a;
                writer.write("\n       android:id=\"" + a + "\"");
                C16937b bVar = ((C16935a) C16934c.this.f44579g.get(num)).f44584e;
                mo50969c("android:layout_width", bVar.f44707d, -5);
                mo50969c("android:layout_height", bVar.f44709e, -5);
                mo50976j("app:layout_constraintGuide_begin", (float) bVar.f44711f, -1.0f);
                mo50976j("app:layout_constraintGuide_end", (float) bVar.f44713g, -1.0f);
                mo50976j("app:layout_constraintGuide_percent", bVar.f44715h, -1.0f);
                mo50976j("app:layout_constraintHorizontal_bias", bVar.f44742y, 0.5f);
                mo50976j("app:layout_constraintVertical_bias", bVar.f44743z, 0.5f);
                mo50979m("app:layout_constraintDimensionRatio", bVar.f44675A, (String) null);
                mo50981o("app:layout_constraintCircle", bVar.f44676B);
                mo50976j("app:layout_constraintCircleRadius", (float) bVar.f44677C, 0.0f);
                mo50976j("app:layout_constraintCircleAngle", bVar.f44678D, 0.0f);
                mo50976j("android:orientation", (float) bVar.f44681G, -1.0f);
                mo50976j("app:layout_constraintVertical_weight", bVar.f44696V, -1.0f);
                mo50976j("app:layout_constraintHorizontal_weight", bVar.f44697W, -1.0f);
                mo50976j("app:layout_constraintHorizontal_chainStyle", (float) bVar.f44698X, 0.0f);
                mo50976j("app:layout_constraintVertical_chainStyle", (float) bVar.f44699Y, 0.0f);
                mo50976j("app:barrierDirection", (float) bVar.f44716h0, -1.0f);
                mo50976j("app:barrierMargin", (float) bVar.f44718i0, 0.0f);
                mo50973g("app:layout_marginLeft", bVar.f44682H, 0);
                mo50973g("app:layout_goneMarginLeft", bVar.f44689O, Integer.MIN_VALUE);
                mo50973g("app:layout_marginRight", bVar.f44683I, 0);
                mo50973g("app:layout_goneMarginRight", bVar.f44691Q, Integer.MIN_VALUE);
                mo50973g("app:layout_marginStart", bVar.f44687M, 0);
                mo50973g("app:layout_goneMarginStart", bVar.f44694T, Integer.MIN_VALUE);
                mo50973g("app:layout_marginEnd", bVar.f44686L, 0);
                mo50973g("app:layout_goneMarginEnd", bVar.f44693S, Integer.MIN_VALUE);
                mo50973g("app:layout_marginTop", bVar.f44684J, 0);
                mo50973g("app:layout_goneMarginTop", bVar.f44690P, Integer.MIN_VALUE);
                mo50973g("app:layout_marginBottom", bVar.f44685K, 0);
                mo50973g("app:layout_goneMarginBottom", bVar.f44692R, Integer.MIN_VALUE);
                mo50973g("app:goneBaselineMargin", bVar.f44695U, Integer.MIN_VALUE);
                mo50973g("app:baselineMargin", bVar.f44688N, 0);
                mo50970d("app:layout_constrainedWidth", bVar.f44728n0, false);
                mo50970d("app:layout_constrainedHeight", bVar.f44730o0, false);
                mo50970d("app:barrierAllowsGoneWidgets", bVar.f44732p0, true);
                mo50976j("app:layout_wrapBehaviorInParent", (float) bVar.f44734q0, 0.0f);
                mo50981o("app:baselineToBaseline", bVar.f44735r);
                mo50981o("app:baselineToBottom", bVar.f44737t);
                mo50981o("app:baselineToTop", bVar.f44736s);
                mo50981o("app:layout_constraintBottom_toBottomOf", bVar.f44733q);
                mo50981o("app:layout_constraintBottom_toTopOf", bVar.f44731p);
                mo50981o("app:layout_constraintEnd_toEndOf", bVar.f44741x);
                mo50981o("app:layout_constraintEnd_toStartOf", bVar.f44740w);
                mo50981o("app:layout_constraintLeft_toLeftOf", bVar.f44719j);
                mo50981o("app:layout_constraintLeft_toRightOf", bVar.f44721k);
                mo50981o("app:layout_constraintRight_toLeftOf", bVar.f44723l);
                mo50981o("app:layout_constraintRight_toRightOf", bVar.f44725m);
                mo50981o("app:layout_constraintStart_toEndOf", bVar.f44738u);
                mo50981o("app:layout_constraintStart_toStartOf", bVar.f44739v);
                mo50981o("app:layout_constraintTop_toBottomOf", bVar.f44729o);
                mo50981o("app:layout_constraintTop_toTopOf", bVar.f44727n);
                String[] strArr = {"spread", "wrap", "percent"};
                mo50974h("app:layout_constraintHeight_default", bVar.f44702a0, strArr, 0);
                mo50976j("app:layout_constraintHeight_percent", bVar.f44714g0, 1.0f);
                mo50973g("app:layout_constraintHeight_min", bVar.f44710e0, 0);
                mo50973g("app:layout_constraintHeight_max", bVar.f44706c0, 0);
                mo50970d("android:layout_constrainedHeight", bVar.f44730o0, false);
                mo50974h("app:layout_constraintWidth_default", bVar.f44700Z, strArr, 0);
                mo50976j("app:layout_constraintWidth_percent", bVar.f44712f0, 1.0f);
                mo50973g("app:layout_constraintWidth_min", bVar.f44708d0, 0);
                mo50973g("app:layout_constraintWidth_max", bVar.f44704b0, 0);
                mo50970d("android:layout_constrainedWidth", bVar.f44728n0, false);
                mo50976j("app:layout_constraintVertical_weight", bVar.f44696V, -1.0f);
                mo50976j("app:layout_constraintHorizontal_weight", bVar.f44697W, -1.0f);
                mo50977k("app:layout_constraintHorizontal_chainStyle", bVar.f44698X);
                mo50977k("app:layout_constraintVertical_chainStyle", bVar.f44699Y);
                mo50974h("app:barrierDirection", bVar.f44716h0, new String[]{C9168d0.f24880E0, C9168d0.f24887Z, C9156c.f24820X, C9156c.f24821Y, "start", "end"}, -1);
                mo50979m("app:layout_constraintTag", bVar.f44726m0, (String) null);
                int[] iArr = bVar.f44722k0;
                if (iArr != null) {
                    mo50980n("'ReferenceIds'", iArr);
                }
                this.f44820a.write(" />\n");
            }
            this.f44820a.write("</ConstraintSet>\n");
        }

        /* renamed from: j */
        public void mo50976j(String str, float f, float f2) throws IOException {
            if (f != f2) {
                Writer writer = this.f44820a;
                writer.write(f44819o + str);
                Writer writer2 = this.f44820a;
                writer2.write("=\"" + f + "\"");
            }
        }

        /* renamed from: k */
        public void mo50977k(String str, int i) throws IOException {
            if (i != 0 && i != -1) {
                Writer writer = this.f44820a;
                writer.write(f44819o + str + "=\"" + i + "\"\n");
            }
        }

        /* renamed from: l */
        public void mo50978l(String str, String str2) throws IOException {
            if (str2 != null) {
                this.f44820a.write(str);
                this.f44820a.write(C33124s.f80355c);
                Writer writer = this.f44820a;
                writer.write(", " + str2);
                this.f44820a.write("\n");
            }
        }

        /* renamed from: m */
        public void mo50979m(String str, String str2, String str3) throws IOException {
            if (str2 != null && !str2.equals(str3)) {
                Writer writer = this.f44820a;
                writer.write(f44819o + str);
                Writer writer2 = this.f44820a;
                writer2.write("=\"" + str2 + "\"");
            }
        }

        /* renamed from: n */
        public void mo50980n(String str, int[] iArr) throws IOException {
            String str2;
            if (iArr != null) {
                Writer writer = this.f44820a;
                writer.write(f44819o + str);
                this.f44820a.write(C33124s.f80355c);
                for (int i = 0; i < iArr.length; i++) {
                    Writer writer2 = this.f44820a;
                    StringBuilder sb = new StringBuilder();
                    if (i == 0) {
                        str2 = "[";
                    } else {
                        str2 = ", ";
                    }
                    sb.append(str2);
                    sb.append(mo50967a(iArr[i]));
                    writer2.write(sb.toString());
                }
                this.f44820a.write("],\n");
            }
        }

        /* renamed from: o */
        public void mo50981o(String str, int i) throws IOException {
            if (i != -1) {
                Writer writer = this.f44820a;
                writer.write(f44819o + str);
                Writer writer2 = this.f44820a;
                writer2.write("=\"" + mo50967a(i) + "\"");
            }
        }
    }

    static {
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintLeft_toLeftOf, 25);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintLeft_toRightOf, 26);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintRight_toLeftOf, 29);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintRight_toRightOf, 30);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintTop_toTopOf, 36);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintTop_toBottomOf, 35);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintBottom_toTopOf, 4);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintBottom_toBottomOf, 3);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintBaseline_toTopOf, 91);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintBaseline_toBottomOf, 92);
        f44494W.append(C16944e.C16957m.Constraint_layout_editor_absoluteX, 6);
        f44494W.append(C16944e.C16957m.Constraint_layout_editor_absoluteY, 7);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintGuide_begin, 17);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintGuide_end, 18);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintGuide_percent, 19);
        f44494W.append(C16944e.C16957m.Constraint_guidelineUseRtl, 99);
        f44494W.append(C16944e.C16957m.Constraint_android_orientation, 27);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintStart_toEndOf, 32);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintStart_toStartOf, 33);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintEnd_toStartOf, 10);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintEnd_toEndOf, 9);
        f44494W.append(C16944e.C16957m.Constraint_layout_goneMarginLeft, 13);
        f44494W.append(C16944e.C16957m.Constraint_layout_goneMarginTop, 16);
        f44494W.append(C16944e.C16957m.Constraint_layout_goneMarginRight, 14);
        f44494W.append(C16944e.C16957m.Constraint_layout_goneMarginBottom, 11);
        f44494W.append(C16944e.C16957m.Constraint_layout_goneMarginStart, 15);
        f44494W.append(C16944e.C16957m.Constraint_layout_goneMarginEnd, 12);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintVertical_weight, 40);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintHorizontal_weight, 39);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintVertical_chainStyle, 42);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintHorizontal_bias, 20);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintVertical_bias, 37);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintDimensionRatio, 5);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintLeft_creator, 87);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintTop_creator, 87);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintRight_creator, 87);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintBottom_creator, 87);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintBaseline_creator, 87);
        f44494W.append(C16944e.C16957m.Constraint_android_layout_marginLeft, 24);
        f44494W.append(C16944e.C16957m.Constraint_android_layout_marginRight, 28);
        f44494W.append(C16944e.C16957m.Constraint_android_layout_marginStart, 31);
        f44494W.append(C16944e.C16957m.Constraint_android_layout_marginEnd, 8);
        f44494W.append(C16944e.C16957m.Constraint_android_layout_marginTop, 34);
        f44494W.append(C16944e.C16957m.Constraint_android_layout_marginBottom, 2);
        f44494W.append(C16944e.C16957m.Constraint_android_layout_width, 23);
        f44494W.append(C16944e.C16957m.Constraint_android_layout_height, 21);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintWidth, 95);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintHeight, 96);
        f44494W.append(C16944e.C16957m.Constraint_android_visibility, 22);
        f44494W.append(C16944e.C16957m.Constraint_android_alpha, 43);
        f44494W.append(C16944e.C16957m.Constraint_android_elevation, 44);
        f44494W.append(C16944e.C16957m.Constraint_android_rotationX, 45);
        f44494W.append(C16944e.C16957m.Constraint_android_rotationY, 46);
        f44494W.append(C16944e.C16957m.Constraint_android_rotation, 60);
        f44494W.append(C16944e.C16957m.Constraint_android_scaleX, 47);
        f44494W.append(C16944e.C16957m.Constraint_android_scaleY, 48);
        f44494W.append(C16944e.C16957m.Constraint_android_transformPivotX, 49);
        f44494W.append(C16944e.C16957m.Constraint_android_transformPivotY, 50);
        f44494W.append(C16944e.C16957m.Constraint_android_translationX, 51);
        f44494W.append(C16944e.C16957m.Constraint_android_translationY, 52);
        f44494W.append(C16944e.C16957m.Constraint_android_translationZ, 53);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintWidth_default, 54);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintHeight_default, 55);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintWidth_max, 56);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintHeight_max, 57);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintWidth_min, 58);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintHeight_min, 59);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintCircle, 61);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintCircleRadius, 62);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintCircleAngle, 63);
        f44494W.append(C16944e.C16957m.Constraint_animateRelativeTo, 64);
        f44494W.append(C16944e.C16957m.Constraint_transitionEasing, 65);
        f44494W.append(C16944e.C16957m.Constraint_drawPath, 66);
        f44494W.append(C16944e.C16957m.Constraint_transitionPathRotate, 67);
        f44494W.append(C16944e.C16957m.Constraint_motionStagger, 79);
        f44494W.append(C16944e.C16957m.Constraint_android_id, 38);
        f44494W.append(C16944e.C16957m.Constraint_motionProgress, 68);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintWidth_percent, 69);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintHeight_percent, 70);
        f44494W.append(C16944e.C16957m.Constraint_layout_wrapBehaviorInParent, 97);
        f44494W.append(C16944e.C16957m.Constraint_chainUseRtl, 71);
        f44494W.append(C16944e.C16957m.Constraint_barrierDirection, 72);
        f44494W.append(C16944e.C16957m.Constraint_barrierMargin, 73);
        f44494W.append(C16944e.C16957m.Constraint_constraint_referenced_ids, 74);
        f44494W.append(C16944e.C16957m.Constraint_barrierAllowsGoneWidgets, 75);
        f44494W.append(C16944e.C16957m.Constraint_pathMotionArc, 76);
        f44494W.append(C16944e.C16957m.Constraint_layout_constraintTag, 77);
        f44494W.append(C16944e.C16957m.Constraint_visibilityMode, 78);
        f44494W.append(C16944e.C16957m.Constraint_layout_constrainedWidth, 80);
        f44494W.append(C16944e.C16957m.Constraint_layout_constrainedHeight, 81);
        f44494W.append(C16944e.C16957m.Constraint_polarRelativeTo, 82);
        f44494W.append(C16944e.C16957m.Constraint_transformPivotTarget, 83);
        f44494W.append(C16944e.C16957m.Constraint_quantizeMotionSteps, 84);
        f44494W.append(C16944e.C16957m.Constraint_quantizeMotionPhase, 85);
        f44494W.append(C16944e.C16957m.Constraint_quantizeMotionInterpolator, 86);
        SparseIntArray sparseIntArray = f44496X;
        int i = C16944e.C16957m.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(i, 6);
        f44496X.append(i, 7);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_orientation, 27);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_goneMarginLeft, 13);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_goneMarginTop, 16);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_goneMarginRight, 14);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_goneMarginBottom, 11);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_goneMarginStart, 15);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_goneMarginEnd, 12);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintVertical_weight, 40);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintVertical_bias, 37);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintDimensionRatio, 5);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintLeft_creator, 87);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintTop_creator, 87);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintRight_creator, 87);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintBottom_creator, 87);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintBaseline_creator, 87);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_layout_marginLeft, 24);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_layout_marginRight, 28);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_layout_marginStart, 31);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_layout_marginEnd, 8);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_layout_marginTop, 34);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_layout_marginBottom, 2);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_layout_width, 23);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_layout_height, 21);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintWidth, 95);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintHeight, 96);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_visibility, 22);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_alpha, 43);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_elevation, 44);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_rotationX, 45);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_rotationY, 46);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_rotation, 60);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_scaleX, 47);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_scaleY, 48);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_transformPivotX, 49);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_transformPivotY, 50);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_translationX, 51);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_translationY, 52);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_translationZ, 53);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintWidth_default, 54);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintHeight_default, 55);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintWidth_max, 56);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintHeight_max, 57);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintWidth_min, 58);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintHeight_min, 59);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintCircleRadius, 62);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintCircleAngle, 63);
        f44496X.append(C16944e.C16957m.ConstraintOverride_animateRelativeTo, 64);
        f44496X.append(C16944e.C16957m.ConstraintOverride_transitionEasing, 65);
        f44496X.append(C16944e.C16957m.ConstraintOverride_drawPath, 66);
        f44496X.append(C16944e.C16957m.ConstraintOverride_transitionPathRotate, 67);
        f44496X.append(C16944e.C16957m.ConstraintOverride_motionStagger, 79);
        f44496X.append(C16944e.C16957m.ConstraintOverride_android_id, 38);
        f44496X.append(C16944e.C16957m.ConstraintOverride_motionTarget, 98);
        f44496X.append(C16944e.C16957m.ConstraintOverride_motionProgress, 68);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintWidth_percent, 69);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintHeight_percent, 70);
        f44496X.append(C16944e.C16957m.ConstraintOverride_chainUseRtl, 71);
        f44496X.append(C16944e.C16957m.ConstraintOverride_barrierDirection, 72);
        f44496X.append(C16944e.C16957m.ConstraintOverride_barrierMargin, 73);
        f44496X.append(C16944e.C16957m.ConstraintOverride_constraint_referenced_ids, 74);
        f44496X.append(C16944e.C16957m.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        f44496X.append(C16944e.C16957m.ConstraintOverride_pathMotionArc, 76);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constraintTag, 77);
        f44496X.append(C16944e.C16957m.ConstraintOverride_visibilityMode, 78);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constrainedWidth, 80);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_constrainedHeight, 81);
        f44496X.append(C16944e.C16957m.ConstraintOverride_polarRelativeTo, 82);
        f44496X.append(C16944e.C16957m.ConstraintOverride_transformPivotTarget, 83);
        f44496X.append(C16944e.C16957m.ConstraintOverride_quantizeMotionSteps, 84);
        f44496X.append(C16944e.C16957m.ConstraintOverride_quantizeMotionPhase, 85);
        f44496X.append(C16944e.C16957m.ConstraintOverride_quantizeMotionInterpolator, 86);
        f44496X.append(C16944e.C16957m.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f  */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m78340A0(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L_0x006f
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L_0x0026
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L_0x0022
            r6 = -3
            if (r5 == r6) goto L_0x0020
            if (r5 == r0) goto L_0x002a
            r6 = -1
            if (r5 == r6) goto L_0x002a
        L_0x0020:
            r5 = r2
            goto L_0x002d
        L_0x0022:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L_0x002d
        L_0x0026:
            int r5 = r5.getDimensionPixelSize(r6, r2)
        L_0x002a:
            r3 = r2
            r2 = r5
            r5 = r3
        L_0x002d:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.C16926b
            if (r6 == 0) goto L_0x003f
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.C16926b) r4
            if (r7 != 0) goto L_0x003a
            r4.width = r2
            r4.f44251a0 = r5
            goto L_0x006e
        L_0x003a:
            r4.height = r2
            r4.f44253b0 = r5
            goto L_0x006e
        L_0x003f:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.C16934c.C16937b
            if (r6 == 0) goto L_0x0051
            androidx.constraintlayout.widget.c$b r4 = (androidx.constraintlayout.widget.C16934c.C16937b) r4
            if (r7 != 0) goto L_0x004c
            r4.f44707d = r2
            r4.f44728n0 = r5
            goto L_0x006e
        L_0x004c:
            r4.f44709e = r2
            r4.f44730o0 = r5
            goto L_0x006e
        L_0x0051:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.C16934c.C16935a.C16936a
            if (r6 == 0) goto L_0x006e
            androidx.constraintlayout.widget.c$a$a r4 = (androidx.constraintlayout.widget.C16934c.C16935a.C16936a) r4
            if (r7 != 0) goto L_0x0064
            r6 = 23
            r4.mo50939b(r6, r2)
            r6 = 80
            r4.mo50941d(r6, r5)
            goto L_0x006e
        L_0x0064:
            r6 = 21
            r4.mo50939b(r6, r2)
            r6 = 81
            r4.mo50941d(r6, r5)
        L_0x006e:
            return
        L_0x006f:
            java.lang.String r5 = r5.getString(r6)
            m78341B0(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C16934c.m78340A0(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* renamed from: B0 */
    public static void m78341B0(Object obj, String str, int i) {
        if (str != null) {
            int indexOf = str.indexOf(61);
            int length = str.length();
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    String trim = substring.trim();
                    String trim2 = substring2.trim();
                    if (f44490U1.equalsIgnoreCase(trim)) {
                        if (obj instanceof ConstraintLayout.C16926b) {
                            ConstraintLayout.C16926b bVar = (ConstraintLayout.C16926b) obj;
                            if (i == 0) {
                                bVar.width = 0;
                            } else {
                                bVar.height = 0;
                            }
                            m78342C0(bVar, trim2);
                        } else if (obj instanceof C16937b) {
                            ((C16937b) obj).f44675A = trim2;
                        } else if (obj instanceof C16935a.C16936a) {
                            ((C16935a.C16936a) obj).mo50940c(5, trim2);
                        }
                    } else if ("weight".equalsIgnoreCase(trim)) {
                        try {
                            float parseFloat = Float.parseFloat(trim2);
                            if (obj instanceof ConstraintLayout.C16926b) {
                                ConstraintLayout.C16926b bVar2 = (ConstraintLayout.C16926b) obj;
                                if (i == 0) {
                                    bVar2.width = 0;
                                    bVar2.f44235L = parseFloat;
                                    return;
                                }
                                bVar2.height = 0;
                                bVar2.f44236M = parseFloat;
                            } else if (obj instanceof C16937b) {
                                C16937b bVar3 = (C16937b) obj;
                                if (i == 0) {
                                    bVar3.f44707d = 0;
                                    bVar3.f44697W = parseFloat;
                                    return;
                                }
                                bVar3.f44709e = 0;
                                bVar3.f44696V = parseFloat;
                            } else if (obj instanceof C16935a.C16936a) {
                                C16935a.C16936a aVar = (C16935a.C16936a) obj;
                                if (i == 0) {
                                    aVar.mo50939b(23, 0);
                                    aVar.mo50938a(39, parseFloat);
                                    return;
                                }
                                aVar.mo50939b(21, 0);
                                aVar.mo50938a(40, parseFloat);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else if (f44493V1.equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.C16926b) {
                            ConstraintLayout.C16926b bVar4 = (ConstraintLayout.C16926b) obj;
                            if (i == 0) {
                                bVar4.width = 0;
                                bVar4.f44245V = max;
                                bVar4.f44239P = 2;
                                return;
                            }
                            bVar4.height = 0;
                            bVar4.f44246W = max;
                            bVar4.f44240Q = 2;
                        } else if (obj instanceof C16937b) {
                            C16937b bVar5 = (C16937b) obj;
                            if (i == 0) {
                                bVar5.f44707d = 0;
                                bVar5.f44712f0 = max;
                                bVar5.f44700Z = 2;
                                return;
                            }
                            bVar5.f44709e = 0;
                            bVar5.f44714g0 = max;
                            bVar5.f44702a0 = 2;
                        } else if (obj instanceof C16935a.C16936a) {
                            C16935a.C16936a aVar2 = (C16935a.C16936a) obj;
                            if (i == 0) {
                                aVar2.mo50939b(23, 0);
                                aVar2.mo50939b(54, 2);
                                return;
                            }
                            aVar2.mo50939b(21, 0);
                            aVar2.mo50939b(55, 2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: C0 */
    public static void m78342C0(ConstraintLayout.C16926b bVar, String str) {
        float f = Float.NaN;
        int i = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase(C19135a.f48841T4)) {
                    i = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i2);
                if (substring2.length() > 0) {
                    f = Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i2, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f = i == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        bVar.f44232I = str;
        bVar.f44233J = f;
        bVar.f44234K = i;
    }

    /* renamed from: G1 */
    public static String[] m78343G1(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c = charArray[i2];
            if (c == ',' && !z) {
                arrayList.add(new String(charArray, i, i2 - i));
                i = i2 + 1;
            } else if (c == '\"') {
                z = !z;
            }
        }
        arrayList.add(new String(charArray, i, charArray.length - i));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: H0 */
    public static void m78344H0(Context context, C16935a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        C16935a.C16936a aVar2 = new C16935a.C16936a();
        aVar.f44587h = aVar2;
        aVar.f44583d.f44758a = false;
        aVar.f44584e.f44703b = false;
        aVar.f44582c.f44772a = false;
        aVar.f44585f.f44790a = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (f44496X.get(index)) {
                case 2:
                    aVar2.mo50939b(2, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44685K));
                    break;
                case 5:
                    aVar2.mo50940c(5, typedArray.getString(index));
                    break;
                case 6:
                    aVar2.mo50939b(6, typedArray.getDimensionPixelOffset(index, aVar.f44584e.f44679E));
                    break;
                case 7:
                    aVar2.mo50939b(7, typedArray.getDimensionPixelOffset(index, aVar.f44584e.f44680F));
                    break;
                case 8:
                    aVar2.mo50939b(8, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44686L));
                    break;
                case 11:
                    aVar2.mo50939b(11, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44692R));
                    break;
                case 12:
                    aVar2.mo50939b(12, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44693S));
                    break;
                case 13:
                    aVar2.mo50939b(13, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44689O));
                    break;
                case 14:
                    aVar2.mo50939b(14, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44691Q));
                    break;
                case 15:
                    aVar2.mo50939b(15, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44694T));
                    break;
                case 16:
                    aVar2.mo50939b(16, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44690P));
                    break;
                case 17:
                    aVar2.mo50939b(17, typedArray.getDimensionPixelOffset(index, aVar.f44584e.f44711f));
                    break;
                case 18:
                    aVar2.mo50939b(18, typedArray.getDimensionPixelOffset(index, aVar.f44584e.f44713g));
                    break;
                case 19:
                    aVar2.mo50938a(19, typedArray.getFloat(index, aVar.f44584e.f44715h));
                    break;
                case 20:
                    aVar2.mo50938a(20, typedArray.getFloat(index, aVar.f44584e.f44742y));
                    break;
                case 21:
                    aVar2.mo50939b(21, typedArray.getLayoutDimension(index, aVar.f44584e.f44709e));
                    break;
                case 22:
                    aVar2.mo50939b(22, f44488U[typedArray.getInt(index, aVar.f44582c.f44773b)]);
                    break;
                case 23:
                    aVar2.mo50939b(23, typedArray.getLayoutDimension(index, aVar.f44584e.f44707d));
                    break;
                case 24:
                    aVar2.mo50939b(24, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44682H));
                    break;
                case 27:
                    aVar2.mo50939b(27, typedArray.getInt(index, aVar.f44584e.f44681G));
                    break;
                case 28:
                    aVar2.mo50939b(28, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44683I));
                    break;
                case 31:
                    aVar2.mo50939b(31, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44687M));
                    break;
                case 34:
                    aVar2.mo50939b(34, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44684J));
                    break;
                case 37:
                    aVar2.mo50938a(37, typedArray.getFloat(index, aVar.f44584e.f44743z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f44580a);
                    aVar.f44580a = resourceId;
                    aVar2.mo50939b(38, resourceId);
                    break;
                case 39:
                    aVar2.mo50938a(39, typedArray.getFloat(index, aVar.f44584e.f44697W));
                    break;
                case 40:
                    aVar2.mo50938a(40, typedArray.getFloat(index, aVar.f44584e.f44696V));
                    break;
                case 41:
                    aVar2.mo50939b(41, typedArray.getInt(index, aVar.f44584e.f44698X));
                    break;
                case 42:
                    aVar2.mo50939b(42, typedArray.getInt(index, aVar.f44584e.f44699Y));
                    break;
                case 43:
                    aVar2.mo50938a(43, typedArray.getFloat(index, aVar.f44582c.f44775d));
                    break;
                case 44:
                    aVar2.mo50941d(44, true);
                    aVar2.mo50938a(44, typedArray.getDimension(index, aVar.f44585f.f44803n));
                    break;
                case 45:
                    aVar2.mo50938a(45, typedArray.getFloat(index, aVar.f44585f.f44792c));
                    break;
                case 46:
                    aVar2.mo50938a(46, typedArray.getFloat(index, aVar.f44585f.f44793d));
                    break;
                case 47:
                    aVar2.mo50938a(47, typedArray.getFloat(index, aVar.f44585f.f44794e));
                    break;
                case 48:
                    aVar2.mo50938a(48, typedArray.getFloat(index, aVar.f44585f.f44795f));
                    break;
                case 49:
                    aVar2.mo50938a(49, typedArray.getDimension(index, aVar.f44585f.f44796g));
                    break;
                case 50:
                    aVar2.mo50938a(50, typedArray.getDimension(index, aVar.f44585f.f44797h));
                    break;
                case 51:
                    aVar2.mo50938a(51, typedArray.getDimension(index, aVar.f44585f.f44799j));
                    break;
                case 52:
                    aVar2.mo50938a(52, typedArray.getDimension(index, aVar.f44585f.f44800k));
                    break;
                case 53:
                    aVar2.mo50938a(53, typedArray.getDimension(index, aVar.f44585f.f44801l));
                    break;
                case 54:
                    aVar2.mo50939b(54, typedArray.getInt(index, aVar.f44584e.f44700Z));
                    break;
                case 55:
                    aVar2.mo50939b(55, typedArray.getInt(index, aVar.f44584e.f44702a0));
                    break;
                case 56:
                    aVar2.mo50939b(56, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44704b0));
                    break;
                case 57:
                    aVar2.mo50939b(57, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44706c0));
                    break;
                case 58:
                    aVar2.mo50939b(58, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44708d0));
                    break;
                case 59:
                    aVar2.mo50939b(59, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44710e0));
                    break;
                case 60:
                    aVar2.mo50938a(60, typedArray.getFloat(index, aVar.f44585f.f44791b));
                    break;
                case 62:
                    aVar2.mo50939b(62, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44677C));
                    break;
                case 63:
                    aVar2.mo50938a(63, typedArray.getFloat(index, aVar.f44584e.f44678D));
                    break;
                case 64:
                    aVar2.mo50939b(64, m78359y0(typedArray, index, aVar.f44583d.f44759b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar2.mo50940c(65, C16680d.f41937o[typedArray.getInteger(index, 0)]);
                        break;
                    } else {
                        aVar2.mo50940c(65, typedArray.getString(index));
                        break;
                    }
                case 66:
                    aVar2.mo50939b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    aVar2.mo50938a(67, typedArray.getFloat(index, aVar.f44583d.f44766i));
                    break;
                case 68:
                    aVar2.mo50938a(68, typedArray.getFloat(index, aVar.f44582c.f44776e));
                    break;
                case 69:
                    aVar2.mo50938a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    aVar2.mo50938a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    break;
                case 72:
                    aVar2.mo50939b(72, typedArray.getInt(index, aVar.f44584e.f44716h0));
                    break;
                case 73:
                    aVar2.mo50939b(73, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44718i0));
                    break;
                case 74:
                    aVar2.mo50940c(74, typedArray.getString(index));
                    break;
                case 75:
                    aVar2.mo50941d(75, typedArray.getBoolean(index, aVar.f44584e.f44732p0));
                    break;
                case 76:
                    aVar2.mo50939b(76, typedArray.getInt(index, aVar.f44583d.f44762e));
                    break;
                case 77:
                    aVar2.mo50940c(77, typedArray.getString(index));
                    break;
                case 78:
                    aVar2.mo50939b(78, typedArray.getInt(index, aVar.f44582c.f44774c));
                    break;
                case 79:
                    aVar2.mo50938a(79, typedArray.getFloat(index, aVar.f44583d.f44764g));
                    break;
                case 80:
                    aVar2.mo50941d(80, typedArray.getBoolean(index, aVar.f44584e.f44728n0));
                    break;
                case 81:
                    aVar2.mo50941d(81, typedArray.getBoolean(index, aVar.f44584e.f44730o0));
                    break;
                case 82:
                    aVar2.mo50939b(82, typedArray.getInteger(index, aVar.f44583d.f44760c));
                    break;
                case 83:
                    aVar2.mo50939b(83, m78359y0(typedArray, index, aVar.f44585f.f44798i));
                    break;
                case 84:
                    aVar2.mo50939b(84, typedArray.getInteger(index, aVar.f44583d.f44768k));
                    break;
                case 85:
                    aVar2.mo50938a(85, typedArray.getFloat(index, aVar.f44583d.f44767j));
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 != 1) {
                        if (i2 != 3) {
                            C16938c cVar = aVar.f44583d;
                            cVar.f44770m = typedArray.getInteger(index, cVar.f44771n);
                            aVar2.mo50939b(88, aVar.f44583d.f44770m);
                            break;
                        } else {
                            aVar.f44583d.f44769l = typedArray.getString(index);
                            aVar2.mo50940c(90, aVar.f44583d.f44769l);
                            if (aVar.f44583d.f44769l.indexOf("/") <= 0) {
                                aVar.f44583d.f44770m = -1;
                                aVar2.mo50939b(88, -1);
                                break;
                            } else {
                                aVar.f44583d.f44771n = typedArray.getResourceId(index, -1);
                                aVar2.mo50939b(89, aVar.f44583d.f44771n);
                                aVar.f44583d.f44770m = -2;
                                aVar2.mo50939b(88, -2);
                                break;
                            }
                        }
                    } else {
                        aVar.f44583d.f44771n = typedArray.getResourceId(index, -1);
                        aVar2.mo50939b(89, aVar.f44583d.f44771n);
                        C16938c cVar2 = aVar.f44583d;
                        if (cVar2.f44771n == -1) {
                            break;
                        } else {
                            cVar2.f44770m = -2;
                            aVar2.mo50939b(88, -2);
                            break;
                        }
                    }
                case 87:
                    StringBuilder sb = new StringBuilder();
                    sb.append("unused attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(f44494W.get(index));
                    break;
                case 93:
                    aVar2.mo50939b(93, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44688N));
                    break;
                case 94:
                    aVar2.mo50939b(94, typedArray.getDimensionPixelSize(index, aVar.f44584e.f44695U));
                    break;
                case 95:
                    m78340A0(aVar2, typedArray, index, 0);
                    break;
                case 96:
                    m78340A0(aVar2, typedArray, index, 1);
                    break;
                case 97:
                    aVar2.mo50939b(97, typedArray.getInt(index, aVar.f44584e.f44734q0));
                    break;
                case 98:
                    if (!MotionLayout.f43205d2) {
                        if (typedArray.peekValue(index).type != 3) {
                            aVar.f44580a = typedArray.getResourceId(index, aVar.f44580a);
                            break;
                        } else {
                            aVar.f44581b = typedArray.getString(index);
                            break;
                        }
                    } else {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f44580a);
                        aVar.f44580a = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            aVar.f44581b = typedArray.getString(index);
                            break;
                        }
                    }
                case 99:
                    aVar2.mo50941d(99, typedArray.getBoolean(index, aVar.f44584e.f44717i));
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown attribute 0x");
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(f44494W.get(index));
                    break;
            }
        }
    }

    /* renamed from: R0 */
    public static void m78345R0(C16935a aVar, int i, float f) {
        if (i == 19) {
            aVar.f44584e.f44715h = f;
        } else if (i == 20) {
            aVar.f44584e.f44742y = f;
        } else if (i == 37) {
            aVar.f44584e.f44743z = f;
        } else if (i == 60) {
            aVar.f44585f.f44791b = f;
        } else if (i == 63) {
            aVar.f44584e.f44678D = f;
        } else if (i == 79) {
            aVar.f44583d.f44764g = f;
        } else if (i == 85) {
            aVar.f44583d.f44767j = f;
        } else if (i == 39) {
            aVar.f44584e.f44697W = f;
        } else if (i != 40) {
            switch (i) {
                case 43:
                    aVar.f44582c.f44775d = f;
                    return;
                case 44:
                    C16940e eVar = aVar.f44585f;
                    eVar.f44803n = f;
                    eVar.f44802m = true;
                    return;
                case 45:
                    aVar.f44585f.f44792c = f;
                    return;
                case 46:
                    aVar.f44585f.f44793d = f;
                    return;
                case 47:
                    aVar.f44585f.f44794e = f;
                    return;
                case 48:
                    aVar.f44585f.f44795f = f;
                    return;
                case 49:
                    aVar.f44585f.f44796g = f;
                    return;
                case 50:
                    aVar.f44585f.f44797h = f;
                    return;
                case 51:
                    aVar.f44585f.f44799j = f;
                    return;
                case 52:
                    aVar.f44585f.f44800k = f;
                    return;
                case 53:
                    aVar.f44585f.f44801l = f;
                    return;
                default:
                    switch (i) {
                        case 67:
                            aVar.f44583d.f44766i = f;
                            return;
                        case 68:
                            aVar.f44582c.f44776e = f;
                            return;
                        case 69:
                            aVar.f44584e.f44712f0 = f;
                            return;
                        case 70:
                            aVar.f44584e.f44714g0 = f;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            aVar.f44584e.f44696V = f;
        }
    }

    /* renamed from: S0 */
    public static void m78346S0(C16935a aVar, int i, int i2) {
        if (i == 6) {
            aVar.f44584e.f44679E = i2;
        } else if (i == 7) {
            aVar.f44584e.f44680F = i2;
        } else if (i == 8) {
            aVar.f44584e.f44686L = i2;
        } else if (i == 27) {
            aVar.f44584e.f44681G = i2;
        } else if (i == 28) {
            aVar.f44584e.f44683I = i2;
        } else if (i == 41) {
            aVar.f44584e.f44698X = i2;
        } else if (i == 42) {
            aVar.f44584e.f44699Y = i2;
        } else if (i == 61) {
            aVar.f44584e.f44676B = i2;
        } else if (i == 62) {
            aVar.f44584e.f44677C = i2;
        } else if (i == 72) {
            aVar.f44584e.f44716h0 = i2;
        } else if (i == 73) {
            aVar.f44584e.f44718i0 = i2;
        } else if (i == 88) {
            aVar.f44583d.f44770m = i2;
        } else if (i != 89) {
            switch (i) {
                case 2:
                    aVar.f44584e.f44685K = i2;
                    return;
                case 11:
                    aVar.f44584e.f44692R = i2;
                    return;
                case 12:
                    aVar.f44584e.f44693S = i2;
                    return;
                case 13:
                    aVar.f44584e.f44689O = i2;
                    return;
                case 14:
                    aVar.f44584e.f44691Q = i2;
                    return;
                case 15:
                    aVar.f44584e.f44694T = i2;
                    return;
                case 16:
                    aVar.f44584e.f44690P = i2;
                    return;
                case 17:
                    aVar.f44584e.f44711f = i2;
                    return;
                case 18:
                    aVar.f44584e.f44713g = i2;
                    return;
                case 31:
                    aVar.f44584e.f44687M = i2;
                    return;
                case 34:
                    aVar.f44584e.f44684J = i2;
                    return;
                case 38:
                    aVar.f44580a = i2;
                    return;
                case 64:
                    aVar.f44583d.f44759b = i2;
                    return;
                case 66:
                    aVar.f44583d.f44763f = i2;
                    return;
                case 76:
                    aVar.f44583d.f44762e = i2;
                    return;
                case 78:
                    aVar.f44582c.f44774c = i2;
                    return;
                case 93:
                    aVar.f44584e.f44688N = i2;
                    return;
                case 94:
                    aVar.f44584e.f44695U = i2;
                    return;
                case 97:
                    aVar.f44584e.f44734q0 = i2;
                    return;
                default:
                    switch (i) {
                        case 21:
                            aVar.f44584e.f44709e = i2;
                            return;
                        case 22:
                            aVar.f44582c.f44773b = i2;
                            return;
                        case 23:
                            aVar.f44584e.f44707d = i2;
                            return;
                        case 24:
                            aVar.f44584e.f44682H = i2;
                            return;
                        default:
                            switch (i) {
                                case 54:
                                    aVar.f44584e.f44700Z = i2;
                                    return;
                                case 55:
                                    aVar.f44584e.f44702a0 = i2;
                                    return;
                                case 56:
                                    aVar.f44584e.f44704b0 = i2;
                                    return;
                                case 57:
                                    aVar.f44584e.f44706c0 = i2;
                                    return;
                                case 58:
                                    aVar.f44584e.f44708d0 = i2;
                                    return;
                                case 59:
                                    aVar.f44584e.f44710e0 = i2;
                                    return;
                                default:
                                    switch (i) {
                                        case 82:
                                            aVar.f44583d.f44760c = i2;
                                            return;
                                        case 83:
                                            aVar.f44585f.f44798i = i2;
                                            return;
                                        case 84:
                                            aVar.f44583d.f44768k = i2;
                                            return;
                                        default:
                                            return;
                                    }
                            }
                    }
            }
        } else {
            aVar.f44583d.f44771n = i2;
        }
    }

    /* renamed from: T0 */
    public static void m78347T0(C16935a aVar, int i, String str) {
        if (i == 5) {
            aVar.f44584e.f44675A = str;
        } else if (i == 65) {
            aVar.f44583d.f44761d = str;
        } else if (i == 74) {
            C16937b bVar = aVar.f44584e;
            bVar.f44724l0 = str;
            bVar.f44722k0 = null;
        } else if (i == 77) {
            aVar.f44584e.f44726m0 = str;
        } else if (i == 90) {
            aVar.f44583d.f44769l = str;
        }
    }

    /* renamed from: U0 */
    public static void m78348U0(C16935a aVar, int i, boolean z) {
        if (i == 44) {
            aVar.f44585f.f44802m = z;
        } else if (i == 75) {
            aVar.f44584e.f44732p0 = z;
        } else if (i == 80) {
            aVar.f44584e.f44728n0 = z;
        } else if (i == 81) {
            aVar.f44584e.f44730o0 = z;
        }
    }

    /* renamed from: m0 */
    public static String m78356m0(int i) {
        for (Field field : C16934c.class.getDeclaredFields()) {
            if (field.getName().contains(C32920e.f79928l) && field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt((Object) null) == i) {
                        return field.getName();
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return "UNKNOWN";
    }

    /* renamed from: p0 */
    public static String m78357p0(Context context, int i, XmlPullParser xmlPullParser) {
        return ".(" + C16878c.m77586i(context, i) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }

    /* renamed from: w */
    public static C16935a m78358w(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        C16935a aVar = new C16935a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, C16944e.C16957m.ConstraintOverride);
        m78344H0(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: y0 */
    public static int m78359y0(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* renamed from: A */
    public void mo50807A(int i, int i2) {
        if (i2 == 0) {
            mo50917x(i, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            mo50917x(i, i2, 7, 0, i2, 6, 0, 0.5f);
        }
    }

    /* renamed from: A1 */
    public void mo50808A1(int i, float f) {
        mo50876i0(i).f44584e.f44743z = f;
    }

    /* renamed from: B */
    public void mo50809B(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        mo50832L(i, 6, i2, i3, i4);
        mo50832L(i, 7, i5, i6, i7);
        C16935a aVar = this.f44579g.get(Integer.valueOf(i));
        if (aVar != null) {
            aVar.f44584e.f44742y = f;
        }
    }

    /* renamed from: B1 */
    public void mo50810B1(int i, int i2) {
        mo50876i0(i).f44584e.f44699Y = i2;
    }

    /* renamed from: C */
    public void mo50811C(int i, int i2) {
        if (i2 == 0) {
            mo50917x(i, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            mo50917x(i, i2, 4, 0, i2, 3, 0, 0.5f);
        }
    }

    /* renamed from: C1 */
    public void mo50812C1(int i, float f) {
        mo50876i0(i).f44584e.f44696V = f;
    }

    /* renamed from: D */
    public void mo50813D(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        mo50832L(i, 3, i2, i3, i4);
        mo50832L(i, 4, i5, i6, i7);
        C16935a aVar = this.f44579g.get(Integer.valueOf(i));
        if (aVar != null) {
            aVar.f44584e.f44743z = f;
        }
    }

    /* renamed from: D0 */
    public void mo50814D0(C16935a aVar, String str) {
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split("=");
            if (split2.length != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(" Unable to parse ");
                sb.append(split[i]);
            } else {
                aVar.mo50935q(split2[0], Float.parseFloat(split2[1]));
            }
        }
    }

    /* renamed from: D1 */
    public void mo50815D1(int i, int i2) {
        mo50876i0(i).f44582c.f44773b = i2;
    }

    /* renamed from: E */
    public void mo50816E(int i) {
        this.f44579g.remove(Integer.valueOf(i));
    }

    /* renamed from: E0 */
    public void mo50817E0(C16935a aVar, String str) {
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split("=");
            if (split2.length != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(" Unable to parse ");
                sb.append(split[i]);
            } else {
                aVar.mo50935q(split2[0], (float) Integer.decode(split2[1]).intValue());
            }
        }
    }

    /* renamed from: E1 */
    public void mo50818E1(int i, int i2) {
        mo50876i0(i).f44582c.f44774c = i2;
    }

    /* renamed from: F */
    public void mo50819F(int i, int i2) {
        C16935a aVar;
        if (this.f44579g.containsKey(Integer.valueOf(i)) && (aVar = this.f44579g.get(Integer.valueOf(i))) != null) {
            switch (i2) {
                case 1:
                    C16937b bVar = aVar.f44584e;
                    bVar.f44721k = -1;
                    bVar.f44719j = -1;
                    bVar.f44682H = -1;
                    bVar.f44689O = Integer.MIN_VALUE;
                    return;
                case 2:
                    C16937b bVar2 = aVar.f44584e;
                    bVar2.f44725m = -1;
                    bVar2.f44723l = -1;
                    bVar2.f44683I = -1;
                    bVar2.f44691Q = Integer.MIN_VALUE;
                    return;
                case 3:
                    C16937b bVar3 = aVar.f44584e;
                    bVar3.f44729o = -1;
                    bVar3.f44727n = -1;
                    bVar3.f44684J = 0;
                    bVar3.f44690P = Integer.MIN_VALUE;
                    return;
                case 4:
                    C16937b bVar4 = aVar.f44584e;
                    bVar4.f44731p = -1;
                    bVar4.f44733q = -1;
                    bVar4.f44685K = 0;
                    bVar4.f44692R = Integer.MIN_VALUE;
                    return;
                case 5:
                    C16937b bVar5 = aVar.f44584e;
                    bVar5.f44735r = -1;
                    bVar5.f44736s = -1;
                    bVar5.f44737t = -1;
                    bVar5.f44688N = 0;
                    bVar5.f44695U = Integer.MIN_VALUE;
                    return;
                case 6:
                    C16937b bVar6 = aVar.f44584e;
                    bVar6.f44738u = -1;
                    bVar6.f44739v = -1;
                    bVar6.f44687M = 0;
                    bVar6.f44694T = Integer.MIN_VALUE;
                    return;
                case 7:
                    C16937b bVar7 = aVar.f44584e;
                    bVar7.f44740w = -1;
                    bVar7.f44741x = -1;
                    bVar7.f44686L = 0;
                    bVar7.f44693S = Integer.MIN_VALUE;
                    return;
                case 8:
                    C16937b bVar8 = aVar.f44584e;
                    bVar8.f44678D = -1.0f;
                    bVar8.f44677C = -1;
                    bVar8.f44676B = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: F0 */
    public void mo50820F0(C16935a aVar, String str) {
        String[] G1 = m78343G1(str);
        for (int i = 0; i < G1.length; i++) {
            String[] split = G1[i].split("=");
            StringBuilder sb = new StringBuilder();
            sb.append(" Unable to parse ");
            sb.append(G1[i]);
            aVar.mo50937s(split[0], split[1]);
        }
    }

    /* renamed from: F1 */
    public final String mo50821F1(int i) {
        switch (i) {
            case 1:
                return C9168d0.f24880E0;
            case 2:
                return C9168d0.f24887Z;
            case 3:
                return C9156c.f24820X;
            case 4:
                return C9156c.f24821Y;
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* renamed from: G */
    public void mo50822G(Context context, int i) {
        mo50824H((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: G0 */
    public final void mo50823G0(Context context, C16935a aVar, TypedArray typedArray, boolean z) {
        if (z) {
            m78344H0(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (!(index == C16944e.C16957m.Constraint_android_id || C16944e.C16957m.Constraint_android_layout_marginStart == index || C16944e.C16957m.Constraint_android_layout_marginEnd == index)) {
                aVar.f44583d.f44758a = true;
                aVar.f44584e.f44703b = true;
                aVar.f44582c.f44772a = true;
                aVar.f44585f.f44790a = true;
            }
            switch (f44494W.get(index)) {
                case 1:
                    C16937b bVar = aVar.f44584e;
                    bVar.f44735r = m78359y0(typedArray, index, bVar.f44735r);
                    break;
                case 2:
                    C16937b bVar2 = aVar.f44584e;
                    bVar2.f44685K = typedArray.getDimensionPixelSize(index, bVar2.f44685K);
                    break;
                case 3:
                    C16937b bVar3 = aVar.f44584e;
                    bVar3.f44733q = m78359y0(typedArray, index, bVar3.f44733q);
                    break;
                case 4:
                    C16937b bVar4 = aVar.f44584e;
                    bVar4.f44731p = m78359y0(typedArray, index, bVar4.f44731p);
                    break;
                case 5:
                    aVar.f44584e.f44675A = typedArray.getString(index);
                    break;
                case 6:
                    C16937b bVar5 = aVar.f44584e;
                    bVar5.f44679E = typedArray.getDimensionPixelOffset(index, bVar5.f44679E);
                    break;
                case 7:
                    C16937b bVar6 = aVar.f44584e;
                    bVar6.f44680F = typedArray.getDimensionPixelOffset(index, bVar6.f44680F);
                    break;
                case 8:
                    C16937b bVar7 = aVar.f44584e;
                    bVar7.f44686L = typedArray.getDimensionPixelSize(index, bVar7.f44686L);
                    break;
                case 9:
                    C16937b bVar8 = aVar.f44584e;
                    bVar8.f44741x = m78359y0(typedArray, index, bVar8.f44741x);
                    break;
                case 10:
                    C16937b bVar9 = aVar.f44584e;
                    bVar9.f44740w = m78359y0(typedArray, index, bVar9.f44740w);
                    break;
                case 11:
                    C16937b bVar10 = aVar.f44584e;
                    bVar10.f44692R = typedArray.getDimensionPixelSize(index, bVar10.f44692R);
                    break;
                case 12:
                    C16937b bVar11 = aVar.f44584e;
                    bVar11.f44693S = typedArray.getDimensionPixelSize(index, bVar11.f44693S);
                    break;
                case 13:
                    C16937b bVar12 = aVar.f44584e;
                    bVar12.f44689O = typedArray.getDimensionPixelSize(index, bVar12.f44689O);
                    break;
                case 14:
                    C16937b bVar13 = aVar.f44584e;
                    bVar13.f44691Q = typedArray.getDimensionPixelSize(index, bVar13.f44691Q);
                    break;
                case 15:
                    C16937b bVar14 = aVar.f44584e;
                    bVar14.f44694T = typedArray.getDimensionPixelSize(index, bVar14.f44694T);
                    break;
                case 16:
                    C16937b bVar15 = aVar.f44584e;
                    bVar15.f44690P = typedArray.getDimensionPixelSize(index, bVar15.f44690P);
                    break;
                case 17:
                    C16937b bVar16 = aVar.f44584e;
                    bVar16.f44711f = typedArray.getDimensionPixelOffset(index, bVar16.f44711f);
                    break;
                case 18:
                    C16937b bVar17 = aVar.f44584e;
                    bVar17.f44713g = typedArray.getDimensionPixelOffset(index, bVar17.f44713g);
                    break;
                case 19:
                    C16937b bVar18 = aVar.f44584e;
                    bVar18.f44715h = typedArray.getFloat(index, bVar18.f44715h);
                    break;
                case 20:
                    C16937b bVar19 = aVar.f44584e;
                    bVar19.f44742y = typedArray.getFloat(index, bVar19.f44742y);
                    break;
                case 21:
                    C16937b bVar20 = aVar.f44584e;
                    bVar20.f44709e = typedArray.getLayoutDimension(index, bVar20.f44709e);
                    break;
                case 22:
                    C16939d dVar = aVar.f44582c;
                    dVar.f44773b = typedArray.getInt(index, dVar.f44773b);
                    C16939d dVar2 = aVar.f44582c;
                    dVar2.f44773b = f44488U[dVar2.f44773b];
                    break;
                case 23:
                    C16937b bVar21 = aVar.f44584e;
                    bVar21.f44707d = typedArray.getLayoutDimension(index, bVar21.f44707d);
                    break;
                case 24:
                    C16937b bVar22 = aVar.f44584e;
                    bVar22.f44682H = typedArray.getDimensionPixelSize(index, bVar22.f44682H);
                    break;
                case 25:
                    C16937b bVar23 = aVar.f44584e;
                    bVar23.f44719j = m78359y0(typedArray, index, bVar23.f44719j);
                    break;
                case 26:
                    C16937b bVar24 = aVar.f44584e;
                    bVar24.f44721k = m78359y0(typedArray, index, bVar24.f44721k);
                    break;
                case 27:
                    C16937b bVar25 = aVar.f44584e;
                    bVar25.f44681G = typedArray.getInt(index, bVar25.f44681G);
                    break;
                case 28:
                    C16937b bVar26 = aVar.f44584e;
                    bVar26.f44683I = typedArray.getDimensionPixelSize(index, bVar26.f44683I);
                    break;
                case 29:
                    C16937b bVar27 = aVar.f44584e;
                    bVar27.f44723l = m78359y0(typedArray, index, bVar27.f44723l);
                    break;
                case 30:
                    C16937b bVar28 = aVar.f44584e;
                    bVar28.f44725m = m78359y0(typedArray, index, bVar28.f44725m);
                    break;
                case 31:
                    C16937b bVar29 = aVar.f44584e;
                    bVar29.f44687M = typedArray.getDimensionPixelSize(index, bVar29.f44687M);
                    break;
                case 32:
                    C16937b bVar30 = aVar.f44584e;
                    bVar30.f44738u = m78359y0(typedArray, index, bVar30.f44738u);
                    break;
                case 33:
                    C16937b bVar31 = aVar.f44584e;
                    bVar31.f44739v = m78359y0(typedArray, index, bVar31.f44739v);
                    break;
                case 34:
                    C16937b bVar32 = aVar.f44584e;
                    bVar32.f44684J = typedArray.getDimensionPixelSize(index, bVar32.f44684J);
                    break;
                case 35:
                    C16937b bVar33 = aVar.f44584e;
                    bVar33.f44729o = m78359y0(typedArray, index, bVar33.f44729o);
                    break;
                case 36:
                    C16937b bVar34 = aVar.f44584e;
                    bVar34.f44727n = m78359y0(typedArray, index, bVar34.f44727n);
                    break;
                case 37:
                    C16937b bVar35 = aVar.f44584e;
                    bVar35.f44743z = typedArray.getFloat(index, bVar35.f44743z);
                    break;
                case 38:
                    aVar.f44580a = typedArray.getResourceId(index, aVar.f44580a);
                    break;
                case 39:
                    C16937b bVar36 = aVar.f44584e;
                    bVar36.f44697W = typedArray.getFloat(index, bVar36.f44697W);
                    break;
                case 40:
                    C16937b bVar37 = aVar.f44584e;
                    bVar37.f44696V = typedArray.getFloat(index, bVar37.f44696V);
                    break;
                case 41:
                    C16937b bVar38 = aVar.f44584e;
                    bVar38.f44698X = typedArray.getInt(index, bVar38.f44698X);
                    break;
                case 42:
                    C16937b bVar39 = aVar.f44584e;
                    bVar39.f44699Y = typedArray.getInt(index, bVar39.f44699Y);
                    break;
                case 43:
                    C16939d dVar3 = aVar.f44582c;
                    dVar3.f44775d = typedArray.getFloat(index, dVar3.f44775d);
                    break;
                case 44:
                    C16940e eVar = aVar.f44585f;
                    eVar.f44802m = true;
                    eVar.f44803n = typedArray.getDimension(index, eVar.f44803n);
                    break;
                case 45:
                    C16940e eVar2 = aVar.f44585f;
                    eVar2.f44792c = typedArray.getFloat(index, eVar2.f44792c);
                    break;
                case 46:
                    C16940e eVar3 = aVar.f44585f;
                    eVar3.f44793d = typedArray.getFloat(index, eVar3.f44793d);
                    break;
                case 47:
                    C16940e eVar4 = aVar.f44585f;
                    eVar4.f44794e = typedArray.getFloat(index, eVar4.f44794e);
                    break;
                case 48:
                    C16940e eVar5 = aVar.f44585f;
                    eVar5.f44795f = typedArray.getFloat(index, eVar5.f44795f);
                    break;
                case 49:
                    C16940e eVar6 = aVar.f44585f;
                    eVar6.f44796g = typedArray.getDimension(index, eVar6.f44796g);
                    break;
                case 50:
                    C16940e eVar7 = aVar.f44585f;
                    eVar7.f44797h = typedArray.getDimension(index, eVar7.f44797h);
                    break;
                case 51:
                    C16940e eVar8 = aVar.f44585f;
                    eVar8.f44799j = typedArray.getDimension(index, eVar8.f44799j);
                    break;
                case 52:
                    C16940e eVar9 = aVar.f44585f;
                    eVar9.f44800k = typedArray.getDimension(index, eVar9.f44800k);
                    break;
                case 53:
                    C16940e eVar10 = aVar.f44585f;
                    eVar10.f44801l = typedArray.getDimension(index, eVar10.f44801l);
                    break;
                case 54:
                    C16937b bVar40 = aVar.f44584e;
                    bVar40.f44700Z = typedArray.getInt(index, bVar40.f44700Z);
                    break;
                case 55:
                    C16937b bVar41 = aVar.f44584e;
                    bVar41.f44702a0 = typedArray.getInt(index, bVar41.f44702a0);
                    break;
                case 56:
                    C16937b bVar42 = aVar.f44584e;
                    bVar42.f44704b0 = typedArray.getDimensionPixelSize(index, bVar42.f44704b0);
                    break;
                case 57:
                    C16937b bVar43 = aVar.f44584e;
                    bVar43.f44706c0 = typedArray.getDimensionPixelSize(index, bVar43.f44706c0);
                    break;
                case 58:
                    C16937b bVar44 = aVar.f44584e;
                    bVar44.f44708d0 = typedArray.getDimensionPixelSize(index, bVar44.f44708d0);
                    break;
                case 59:
                    C16937b bVar45 = aVar.f44584e;
                    bVar45.f44710e0 = typedArray.getDimensionPixelSize(index, bVar45.f44710e0);
                    break;
                case 60:
                    C16940e eVar11 = aVar.f44585f;
                    eVar11.f44791b = typedArray.getFloat(index, eVar11.f44791b);
                    break;
                case 61:
                    C16937b bVar46 = aVar.f44584e;
                    bVar46.f44676B = m78359y0(typedArray, index, bVar46.f44676B);
                    break;
                case 62:
                    C16937b bVar47 = aVar.f44584e;
                    bVar47.f44677C = typedArray.getDimensionPixelSize(index, bVar47.f44677C);
                    break;
                case 63:
                    C16937b bVar48 = aVar.f44584e;
                    bVar48.f44678D = typedArray.getFloat(index, bVar48.f44678D);
                    break;
                case 64:
                    C16938c cVar = aVar.f44583d;
                    cVar.f44759b = m78359y0(typedArray, index, cVar.f44759b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar.f44583d.f44761d = C16680d.f41937o[typedArray.getInteger(index, 0)];
                        break;
                    } else {
                        aVar.f44583d.f44761d = typedArray.getString(index);
                        break;
                    }
                case 66:
                    aVar.f44583d.f44763f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C16938c cVar2 = aVar.f44583d;
                    cVar2.f44766i = typedArray.getFloat(index, cVar2.f44766i);
                    break;
                case 68:
                    C16939d dVar4 = aVar.f44582c;
                    dVar4.f44776e = typedArray.getFloat(index, dVar4.f44776e);
                    break;
                case 69:
                    aVar.f44584e.f44712f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f44584e.f44714g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    C16937b bVar49 = aVar.f44584e;
                    bVar49.f44716h0 = typedArray.getInt(index, bVar49.f44716h0);
                    break;
                case 73:
                    C16937b bVar50 = aVar.f44584e;
                    bVar50.f44718i0 = typedArray.getDimensionPixelSize(index, bVar50.f44718i0);
                    break;
                case 74:
                    aVar.f44584e.f44724l0 = typedArray.getString(index);
                    break;
                case 75:
                    C16937b bVar51 = aVar.f44584e;
                    bVar51.f44732p0 = typedArray.getBoolean(index, bVar51.f44732p0);
                    break;
                case 76:
                    C16938c cVar3 = aVar.f44583d;
                    cVar3.f44762e = typedArray.getInt(index, cVar3.f44762e);
                    break;
                case 77:
                    aVar.f44584e.f44726m0 = typedArray.getString(index);
                    break;
                case 78:
                    C16939d dVar5 = aVar.f44582c;
                    dVar5.f44774c = typedArray.getInt(index, dVar5.f44774c);
                    break;
                case 79:
                    C16938c cVar4 = aVar.f44583d;
                    cVar4.f44764g = typedArray.getFloat(index, cVar4.f44764g);
                    break;
                case 80:
                    C16937b bVar52 = aVar.f44584e;
                    bVar52.f44728n0 = typedArray.getBoolean(index, bVar52.f44728n0);
                    break;
                case 81:
                    C16937b bVar53 = aVar.f44584e;
                    bVar53.f44730o0 = typedArray.getBoolean(index, bVar53.f44730o0);
                    break;
                case 82:
                    C16938c cVar5 = aVar.f44583d;
                    cVar5.f44760c = typedArray.getInteger(index, cVar5.f44760c);
                    break;
                case 83:
                    C16940e eVar12 = aVar.f44585f;
                    eVar12.f44798i = m78359y0(typedArray, index, eVar12.f44798i);
                    break;
                case 84:
                    C16938c cVar6 = aVar.f44583d;
                    cVar6.f44768k = typedArray.getInteger(index, cVar6.f44768k);
                    break;
                case 85:
                    C16938c cVar7 = aVar.f44583d;
                    cVar7.f44767j = typedArray.getFloat(index, cVar7.f44767j);
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 != 1) {
                        if (i2 != 3) {
                            C16938c cVar8 = aVar.f44583d;
                            cVar8.f44770m = typedArray.getInteger(index, cVar8.f44771n);
                            break;
                        } else {
                            aVar.f44583d.f44769l = typedArray.getString(index);
                            if (aVar.f44583d.f44769l.indexOf("/") <= 0) {
                                aVar.f44583d.f44770m = -1;
                                break;
                            } else {
                                aVar.f44583d.f44771n = typedArray.getResourceId(index, -1);
                                aVar.f44583d.f44770m = -2;
                                break;
                            }
                        }
                    } else {
                        aVar.f44583d.f44771n = typedArray.getResourceId(index, -1);
                        C16938c cVar9 = aVar.f44583d;
                        if (cVar9.f44771n == -1) {
                            break;
                        } else {
                            cVar9.f44770m = -2;
                            break;
                        }
                    }
                case 87:
                    StringBuilder sb = new StringBuilder();
                    sb.append("unused attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(f44494W.get(index));
                    break;
                case 91:
                    C16937b bVar54 = aVar.f44584e;
                    bVar54.f44736s = m78359y0(typedArray, index, bVar54.f44736s);
                    break;
                case 92:
                    C16937b bVar55 = aVar.f44584e;
                    bVar55.f44737t = m78359y0(typedArray, index, bVar55.f44737t);
                    break;
                case 93:
                    C16937b bVar56 = aVar.f44584e;
                    bVar56.f44688N = typedArray.getDimensionPixelSize(index, bVar56.f44688N);
                    break;
                case 94:
                    C16937b bVar57 = aVar.f44584e;
                    bVar57.f44695U = typedArray.getDimensionPixelSize(index, bVar57.f44695U);
                    break;
                case 95:
                    m78340A0(aVar.f44584e, typedArray, index, 0);
                    break;
                case 96:
                    m78340A0(aVar.f44584e, typedArray, index, 1);
                    break;
                case 97:
                    C16937b bVar58 = aVar.f44584e;
                    bVar58.f44734q0 = typedArray.getInt(index, bVar58.f44734q0);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown attribute 0x");
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(f44494W.get(index));
                    break;
            }
        }
        C16937b bVar59 = aVar.f44584e;
        if (bVar59.f44724l0 != null) {
            bVar59.f44722k0 = null;
        }
    }

    /* renamed from: H */
    public void mo50824H(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f44579g.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C16926b bVar = (ConstraintLayout.C16926b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f44578f || id != -1) {
                if (!this.f44579g.containsKey(Integer.valueOf(id))) {
                    this.f44579g.put(Integer.valueOf(id), new C16935a());
                }
                C16935a aVar = this.f44579g.get(Integer.valueOf(id));
                if (aVar != null) {
                    aVar.f44586g = ConstraintAttribute.m78205d(this.f44577e, childAt);
                    aVar.mo50929k(id, bVar);
                    aVar.f44582c.f44773b = childAt.getVisibility();
                    aVar.f44582c.f44775d = childAt.getAlpha();
                    aVar.f44585f.f44791b = childAt.getRotation();
                    aVar.f44585f.f44792c = childAt.getRotationX();
                    aVar.f44585f.f44793d = childAt.getRotationY();
                    aVar.f44585f.f44794e = childAt.getScaleX();
                    aVar.f44585f.f44795f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        C16940e eVar = aVar.f44585f;
                        eVar.f44796g = pivotX;
                        eVar.f44797h = pivotY;
                    }
                    aVar.f44585f.f44799j = childAt.getTranslationX();
                    aVar.f44585f.f44800k = childAt.getTranslationY();
                    aVar.f44585f.f44801l = childAt.getTranslationZ();
                    C16940e eVar2 = aVar.f44585f;
                    if (eVar2.f44802m) {
                        eVar2.f44803n = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar.f44584e.f44732p0 = barrier.getAllowsGoneWidget();
                        aVar.f44584e.f44722k0 = barrier.getReferencedIds();
                        aVar.f44584e.f44716h0 = barrier.getType();
                        aVar.f44584e.f44718i0 = barrier.getMargin();
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: H1 */
    public void mo50825H1(Writer writer, ConstraintLayout constraintLayout, int i) throws IOException {
        writer.write("\n---------------------------------------------\n");
        if ((i & 1) == 1) {
            new C16942g(writer, constraintLayout, i).mo50975i();
        } else {
            new C16941f(writer, constraintLayout, i).mo50959g();
        }
        writer.write("\n---------------------------------------------\n");
    }

    /* renamed from: I */
    public void mo50826I(C16934c cVar) {
        this.f44579g.clear();
        for (Integer next : cVar.f44579g.keySet()) {
            C16935a aVar = cVar.f44579g.get(next);
            if (aVar != null) {
                this.f44579g.put(next, aVar.clone());
            }
        }
    }

    /* renamed from: I0 */
    public void mo50827I0(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C16926b bVar = (ConstraintLayout.C16926b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f44578f || id != -1) {
                if (!this.f44579g.containsKey(Integer.valueOf(id))) {
                    this.f44579g.put(Integer.valueOf(id), new C16935a());
                }
                C16935a aVar = this.f44579g.get(Integer.valueOf(id));
                if (aVar != null) {
                    if (!aVar.f44584e.f44703b) {
                        aVar.mo50929k(id, bVar);
                        if (childAt instanceof ConstraintHelper) {
                            aVar.f44584e.f44722k0 = ((ConstraintHelper) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                aVar.f44584e.f44732p0 = barrier.getAllowsGoneWidget();
                                aVar.f44584e.f44716h0 = barrier.getType();
                                aVar.f44584e.f44718i0 = barrier.getMargin();
                            }
                        }
                        aVar.f44584e.f44703b = true;
                    }
                    C16939d dVar = aVar.f44582c;
                    if (!dVar.f44772a) {
                        dVar.f44773b = childAt.getVisibility();
                        aVar.f44582c.f44775d = childAt.getAlpha();
                        aVar.f44582c.f44772a = true;
                    }
                    C16940e eVar = aVar.f44585f;
                    if (!eVar.f44790a) {
                        eVar.f44790a = true;
                        eVar.f44791b = childAt.getRotation();
                        aVar.f44585f.f44792c = childAt.getRotationX();
                        aVar.f44585f.f44793d = childAt.getRotationY();
                        aVar.f44585f.f44794e = childAt.getScaleX();
                        aVar.f44585f.f44795f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                            C16940e eVar2 = aVar.f44585f;
                            eVar2.f44796g = pivotX;
                            eVar2.f44797h = pivotY;
                        }
                        aVar.f44585f.f44799j = childAt.getTranslationX();
                        aVar.f44585f.f44800k = childAt.getTranslationY();
                        aVar.f44585f.f44801l = childAt.getTranslationZ();
                        C16940e eVar3 = aVar.f44585f;
                        if (eVar3.f44802m) {
                            eVar3.f44803n = childAt.getElevation();
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: J */
    public void mo50828J(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f44579g.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraints.getChildAt(i);
            Constraints.C16929a aVar = (Constraints.C16929a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f44578f || id != -1) {
                if (!this.f44579g.containsKey(Integer.valueOf(id))) {
                    this.f44579g.put(Integer.valueOf(id), new C16935a());
                }
                C16935a aVar2 = this.f44579g.get(Integer.valueOf(id));
                if (aVar2 != null) {
                    if (childAt instanceof ConstraintHelper) {
                        aVar2.mo50931m((ConstraintHelper) childAt, id, aVar);
                    }
                    aVar2.mo50930l(id, aVar);
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: J0 */
    public void mo50829J0(C16934c cVar) {
        for (Integer next : cVar.f44579g.keySet()) {
            int intValue = next.intValue();
            C16935a aVar = cVar.f44579g.get(next);
            if (!this.f44579g.containsKey(Integer.valueOf(intValue))) {
                this.f44579g.put(Integer.valueOf(intValue), new C16935a());
            }
            C16935a aVar2 = this.f44579g.get(Integer.valueOf(intValue));
            if (aVar2 != null) {
                C16937b bVar = aVar2.f44584e;
                if (!bVar.f44703b) {
                    bVar.mo50944a(aVar.f44584e);
                }
                C16939d dVar = aVar2.f44582c;
                if (!dVar.f44772a) {
                    dVar.mo50949a(aVar.f44582c);
                }
                C16940e eVar = aVar2.f44585f;
                if (!eVar.f44790a) {
                    eVar.mo50951a(aVar.f44585f);
                }
                C16938c cVar2 = aVar2.f44583d;
                if (!cVar2.f44758a) {
                    cVar2.mo50947a(aVar.f44583d);
                }
                for (String next2 : aVar.f44586g.keySet()) {
                    if (!aVar2.f44586g.containsKey(next2)) {
                        aVar2.f44586g.put(next2, aVar.f44586g.get(next2));
                    }
                }
            }
        }
    }

    /* renamed from: K */
    public void mo50830K(int i, int i2, int i3, int i4) {
        if (!this.f44579g.containsKey(Integer.valueOf(i))) {
            this.f44579g.put(Integer.valueOf(i), new C16935a());
        }
        C16935a aVar = this.f44579g.get(Integer.valueOf(i));
        if (aVar != null) {
            switch (i2) {
                case 1:
                    if (i4 == 1) {
                        C16937b bVar = aVar.f44584e;
                        bVar.f44719j = i3;
                        bVar.f44721k = -1;
                        return;
                    } else if (i4 == 2) {
                        C16937b bVar2 = aVar.f44584e;
                        bVar2.f44721k = i3;
                        bVar2.f44719j = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("left to " + mo50821F1(i4) + " undefined");
                    }
                case 2:
                    if (i4 == 1) {
                        C16937b bVar3 = aVar.f44584e;
                        bVar3.f44723l = i3;
                        bVar3.f44725m = -1;
                        return;
                    } else if (i4 == 2) {
                        C16937b bVar4 = aVar.f44584e;
                        bVar4.f44725m = i3;
                        bVar4.f44723l = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + mo50821F1(i4) + " undefined");
                    }
                case 3:
                    if (i4 == 3) {
                        C16937b bVar5 = aVar.f44584e;
                        bVar5.f44727n = i3;
                        bVar5.f44729o = -1;
                        bVar5.f44735r = -1;
                        bVar5.f44736s = -1;
                        bVar5.f44737t = -1;
                        return;
                    } else if (i4 == 4) {
                        C16937b bVar6 = aVar.f44584e;
                        bVar6.f44729o = i3;
                        bVar6.f44727n = -1;
                        bVar6.f44735r = -1;
                        bVar6.f44736s = -1;
                        bVar6.f44737t = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + mo50821F1(i4) + " undefined");
                    }
                case 4:
                    if (i4 == 4) {
                        C16937b bVar7 = aVar.f44584e;
                        bVar7.f44733q = i3;
                        bVar7.f44731p = -1;
                        bVar7.f44735r = -1;
                        bVar7.f44736s = -1;
                        bVar7.f44737t = -1;
                        return;
                    } else if (i4 == 3) {
                        C16937b bVar8 = aVar.f44584e;
                        bVar8.f44731p = i3;
                        bVar8.f44733q = -1;
                        bVar8.f44735r = -1;
                        bVar8.f44736s = -1;
                        bVar8.f44737t = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + mo50821F1(i4) + " undefined");
                    }
                case 5:
                    if (i4 == 5) {
                        C16937b bVar9 = aVar.f44584e;
                        bVar9.f44735r = i3;
                        bVar9.f44733q = -1;
                        bVar9.f44731p = -1;
                        bVar9.f44727n = -1;
                        bVar9.f44729o = -1;
                        return;
                    } else if (i4 == 3) {
                        C16937b bVar10 = aVar.f44584e;
                        bVar10.f44736s = i3;
                        bVar10.f44733q = -1;
                        bVar10.f44731p = -1;
                        bVar10.f44727n = -1;
                        bVar10.f44729o = -1;
                        return;
                    } else if (i4 == 4) {
                        C16937b bVar11 = aVar.f44584e;
                        bVar11.f44737t = i3;
                        bVar11.f44733q = -1;
                        bVar11.f44731p = -1;
                        bVar11.f44727n = -1;
                        bVar11.f44729o = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + mo50821F1(i4) + " undefined");
                    }
                case 6:
                    if (i4 == 6) {
                        C16937b bVar12 = aVar.f44584e;
                        bVar12.f44739v = i3;
                        bVar12.f44738u = -1;
                        return;
                    } else if (i4 == 7) {
                        C16937b bVar13 = aVar.f44584e;
                        bVar13.f44738u = i3;
                        bVar13.f44739v = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + mo50821F1(i4) + " undefined");
                    }
                case 7:
                    if (i4 == 7) {
                        C16937b bVar14 = aVar.f44584e;
                        bVar14.f44741x = i3;
                        bVar14.f44740w = -1;
                        return;
                    } else if (i4 == 6) {
                        C16937b bVar15 = aVar.f44584e;
                        bVar15.f44740w = i3;
                        bVar15.f44741x = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + mo50821F1(i4) + " undefined");
                    }
                default:
                    throw new IllegalArgumentException(mo50821F1(i2) + " to " + mo50821F1(i4) + " unknown");
            }
        }
    }

    /* renamed from: K0 */
    public void mo50831K0(String str) {
        this.f44577e.remove(str);
    }

    /* renamed from: L */
    public void mo50832L(int i, int i2, int i3, int i4, int i5) {
        if (!this.f44579g.containsKey(Integer.valueOf(i))) {
            this.f44579g.put(Integer.valueOf(i), new C16935a());
        }
        C16935a aVar = this.f44579g.get(Integer.valueOf(i));
        if (aVar != null) {
            switch (i2) {
                case 1:
                    if (i4 == 1) {
                        C16937b bVar = aVar.f44584e;
                        bVar.f44719j = i3;
                        bVar.f44721k = -1;
                    } else if (i4 == 2) {
                        C16937b bVar2 = aVar.f44584e;
                        bVar2.f44721k = i3;
                        bVar2.f44719j = -1;
                    } else {
                        throw new IllegalArgumentException("Left to " + mo50821F1(i4) + " undefined");
                    }
                    aVar.f44584e.f44682H = i5;
                    return;
                case 2:
                    if (i4 == 1) {
                        C16937b bVar3 = aVar.f44584e;
                        bVar3.f44723l = i3;
                        bVar3.f44725m = -1;
                    } else if (i4 == 2) {
                        C16937b bVar4 = aVar.f44584e;
                        bVar4.f44725m = i3;
                        bVar4.f44723l = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + mo50821F1(i4) + " undefined");
                    }
                    aVar.f44584e.f44683I = i5;
                    return;
                case 3:
                    if (i4 == 3) {
                        C16937b bVar5 = aVar.f44584e;
                        bVar5.f44727n = i3;
                        bVar5.f44729o = -1;
                        bVar5.f44735r = -1;
                        bVar5.f44736s = -1;
                        bVar5.f44737t = -1;
                    } else if (i4 == 4) {
                        C16937b bVar6 = aVar.f44584e;
                        bVar6.f44729o = i3;
                        bVar6.f44727n = -1;
                        bVar6.f44735r = -1;
                        bVar6.f44736s = -1;
                        bVar6.f44737t = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + mo50821F1(i4) + " undefined");
                    }
                    aVar.f44584e.f44684J = i5;
                    return;
                case 4:
                    if (i4 == 4) {
                        C16937b bVar7 = aVar.f44584e;
                        bVar7.f44733q = i3;
                        bVar7.f44731p = -1;
                        bVar7.f44735r = -1;
                        bVar7.f44736s = -1;
                        bVar7.f44737t = -1;
                    } else if (i4 == 3) {
                        C16937b bVar8 = aVar.f44584e;
                        bVar8.f44731p = i3;
                        bVar8.f44733q = -1;
                        bVar8.f44735r = -1;
                        bVar8.f44736s = -1;
                        bVar8.f44737t = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + mo50821F1(i4) + " undefined");
                    }
                    aVar.f44584e.f44685K = i5;
                    return;
                case 5:
                    if (i4 == 5) {
                        C16937b bVar9 = aVar.f44584e;
                        bVar9.f44735r = i3;
                        bVar9.f44733q = -1;
                        bVar9.f44731p = -1;
                        bVar9.f44727n = -1;
                        bVar9.f44729o = -1;
                        return;
                    } else if (i4 == 3) {
                        C16937b bVar10 = aVar.f44584e;
                        bVar10.f44736s = i3;
                        bVar10.f44733q = -1;
                        bVar10.f44731p = -1;
                        bVar10.f44727n = -1;
                        bVar10.f44729o = -1;
                        return;
                    } else if (i4 == 4) {
                        C16937b bVar11 = aVar.f44584e;
                        bVar11.f44737t = i3;
                        bVar11.f44733q = -1;
                        bVar11.f44731p = -1;
                        bVar11.f44727n = -1;
                        bVar11.f44729o = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + mo50821F1(i4) + " undefined");
                    }
                case 6:
                    if (i4 == 6) {
                        C16937b bVar12 = aVar.f44584e;
                        bVar12.f44739v = i3;
                        bVar12.f44738u = -1;
                    } else if (i4 == 7) {
                        C16937b bVar13 = aVar.f44584e;
                        bVar13.f44738u = i3;
                        bVar13.f44739v = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + mo50821F1(i4) + " undefined");
                    }
                    aVar.f44584e.f44687M = i5;
                    return;
                case 7:
                    if (i4 == 7) {
                        C16937b bVar14 = aVar.f44584e;
                        bVar14.f44741x = i3;
                        bVar14.f44740w = -1;
                    } else if (i4 == 6) {
                        C16937b bVar15 = aVar.f44584e;
                        bVar15.f44740w = i3;
                        bVar15.f44741x = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + mo50821F1(i4) + " undefined");
                    }
                    aVar.f44584e.f44686L = i5;
                    return;
                default:
                    throw new IllegalArgumentException(mo50821F1(i2) + " to " + mo50821F1(i4) + " unknown");
            }
        }
    }

    /* renamed from: L0 */
    public void mo50833L0(int i) {
        C16935a aVar;
        if (this.f44579g.containsKey(Integer.valueOf(i)) && (aVar = this.f44579g.get(Integer.valueOf(i))) != null) {
            C16937b bVar = aVar.f44584e;
            int i2 = bVar.f44721k;
            int i3 = bVar.f44723l;
            if (i2 == -1 && i3 == -1) {
                int i4 = bVar.f44738u;
                int i5 = bVar.f44740w;
                if (!(i4 == -1 && i5 == -1)) {
                    if (i4 != -1 && i5 != -1) {
                        mo50832L(i4, 7, i5, 6, 0);
                        mo50832L(i5, 6, i2, 7, 0);
                    } else if (i5 != -1) {
                        int i6 = bVar.f44725m;
                        if (i6 != -1) {
                            mo50832L(i2, 7, i6, 7, 0);
                        } else {
                            int i7 = bVar.f44719j;
                            if (i7 != -1) {
                                mo50832L(i5, 6, i7, 6, 0);
                            }
                        }
                    }
                }
                mo50819F(i, 6);
                mo50819F(i, 7);
                return;
            }
            if (i2 == -1 || i3 == -1) {
                int i8 = bVar.f44725m;
                if (i8 != -1) {
                    mo50832L(i2, 2, i8, 2, 0);
                } else {
                    int i9 = bVar.f44719j;
                    if (i9 != -1) {
                        mo50832L(i3, 1, i9, 1, 0);
                    }
                }
            } else {
                mo50832L(i2, 2, i3, 1, 0);
                mo50832L(i3, 1, i2, 2, 0);
            }
            mo50819F(i, 1);
            mo50819F(i, 2);
        }
    }

    /* renamed from: M */
    public void mo50834M(int i, int i2, int i3, float f) {
        C16937b bVar = mo50876i0(i).f44584e;
        bVar.f44676B = i2;
        bVar.f44677C = i3;
        bVar.f44678D = f;
    }

    /* renamed from: M0 */
    public void mo50835M0(int i) {
        if (this.f44579g.containsKey(Integer.valueOf(i))) {
            C16935a aVar = this.f44579g.get(Integer.valueOf(i));
            if (aVar != null) {
                C16937b bVar = aVar.f44584e;
                int i2 = bVar.f44729o;
                int i3 = bVar.f44731p;
                if (!(i2 == -1 && i3 == -1)) {
                    if (i2 == -1 || i3 == -1) {
                        int i4 = bVar.f44733q;
                        if (i4 != -1) {
                            mo50832L(i2, 4, i4, 4, 0);
                        } else {
                            int i5 = bVar.f44727n;
                            if (i5 != -1) {
                                mo50832L(i3, 3, i5, 3, 0);
                            }
                        }
                    } else {
                        mo50832L(i2, 4, i3, 3, 0);
                        mo50832L(i3, 3, i2, 4, 0);
                    }
                }
            } else {
                return;
            }
        }
        mo50819F(i, 3);
        mo50819F(i, 4);
    }

    /* renamed from: N */
    public void mo50836N(int i, int i2) {
        mo50876i0(i).f44584e.f44702a0 = i2;
    }

    /* renamed from: N0 */
    public void mo50837N0(int i, float f) {
        mo50876i0(i).f44582c.f44775d = f;
    }

    /* renamed from: O */
    public void mo50838O(int i, int i2) {
        mo50876i0(i).f44584e.f44700Z = i2;
    }

    /* renamed from: O0 */
    public void mo50839O0(int i, boolean z) {
        mo50876i0(i).f44585f.f44802m = z;
    }

    /* renamed from: P */
    public void mo50840P(int i, int i2) {
        mo50876i0(i).f44584e.f44709e = i2;
    }

    /* renamed from: P0 */
    public void mo50841P0(int i, int i2) {
        mo50876i0(i).f44584e.f44720j0 = i2;
    }

    /* renamed from: Q */
    public void mo50842Q(int i, int i2) {
        mo50876i0(i).f44584e.f44706c0 = i2;
    }

    /* renamed from: Q0 */
    public void mo50843Q0(int i, String str, int i2) {
        mo50876i0(i).mo50934p(str, i2);
    }

    /* renamed from: R */
    public void mo50844R(int i, int i2) {
        mo50876i0(i).f44584e.f44704b0 = i2;
    }

    /* renamed from: S */
    public void mo50845S(int i, int i2) {
        mo50876i0(i).f44584e.f44710e0 = i2;
    }

    /* renamed from: T */
    public void mo50846T(int i, int i2) {
        mo50876i0(i).f44584e.f44708d0 = i2;
    }

    /* renamed from: U */
    public void mo50847U(int i, float f) {
        mo50876i0(i).f44584e.f44714g0 = f;
    }

    /* renamed from: V */
    public void mo50848V(int i, float f) {
        mo50876i0(i).f44584e.f44712f0 = f;
    }

    /* renamed from: V0 */
    public void mo50849V0(int i, String str) {
        mo50876i0(i).f44584e.f44675A = str;
    }

    /* renamed from: W */
    public void mo50850W(int i, int i2) {
        mo50876i0(i).f44584e.f44707d = i2;
    }

    /* renamed from: W0 */
    public void mo50851W0(int i, int i2) {
        mo50876i0(i).f44584e.f44679E = i2;
    }

    /* renamed from: X */
    public void mo50852X(int i, boolean z) {
        mo50876i0(i).f44584e.f44730o0 = z;
    }

    /* renamed from: X0 */
    public void mo50853X0(int i, int i2) {
        mo50876i0(i).f44584e.f44680F = i2;
    }

    /* renamed from: Y */
    public void mo50854Y(int i, boolean z) {
        mo50876i0(i).f44584e.f44728n0 = z;
    }

    /* renamed from: Y0 */
    public void mo50855Y0(int i, float f) {
        mo50876i0(i).f44585f.f44803n = f;
        mo50876i0(i).f44585f.f44802m = true;
    }

    /* renamed from: Z */
    public final int[] mo50856Z(View view, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C16944e.C16951g.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    /* renamed from: Z0 */
    public void mo50857Z0(int i, String str, float f) {
        mo50876i0(i).mo50935q(str, f);
    }

    /* renamed from: a0 */
    public void mo50858a0(int i, int i2) {
        C16937b bVar = mo50876i0(i).f44584e;
        bVar.f44701a = true;
        bVar.f44681G = i2;
    }

    /* renamed from: a1 */
    public void mo50859a1(boolean z) {
        this.f44578f = z;
    }

    /* renamed from: b0 */
    public void mo50860b0(int i, int i2, int i3, int... iArr) {
        C16937b bVar = mo50876i0(i).f44584e;
        bVar.f44720j0 = 1;
        bVar.f44716h0 = i2;
        bVar.f44718i0 = i3;
        bVar.f44701a = false;
        bVar.f44722k0 = iArr;
    }

    /* renamed from: b1 */
    public void mo50861b1(int i, int i2, int i3) {
        C16935a i0 = mo50876i0(i);
        switch (i2) {
            case 1:
                i0.f44584e.f44689O = i3;
                return;
            case 2:
                i0.f44584e.f44691Q = i3;
                return;
            case 3:
                i0.f44584e.f44690P = i3;
                return;
            case 4:
                i0.f44584e.f44692R = i3;
                return;
            case 5:
                i0.f44584e.f44695U = i3;
                return;
            case 6:
                i0.f44584e.f44694T = i3;
                return;
            case 7:
                i0.f44584e.f44693S = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* renamed from: c0 */
    public void mo50862c0(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        mo50864d0(i, i2, i3, i4, iArr, fArr, i5, 1, 2);
    }

    /* renamed from: c1 */
    public void mo50863c1(int i, int i2) {
        mo50876i0(i).f44584e.f44711f = i2;
        mo50876i0(i).f44584e.f44713g = -1;
        mo50876i0(i).f44584e.f44715h = -1.0f;
    }

    /* renamed from: d0 */
    public final void mo50864d0(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5, int i6, int i7) {
        int[] iArr2 = iArr;
        float[] fArr2 = fArr;
        if (iArr2.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (fArr2 == null || fArr2.length == iArr2.length) {
            if (fArr2 != null) {
                mo50876i0(iArr2[0]).f44584e.f44697W = fArr2[0];
            }
            mo50876i0(iArr2[0]).f44584e.f44698X = i5;
            mo50832L(iArr2[0], i6, i, i2, -1);
            for (int i8 = 1; i8 < iArr2.length; i8++) {
                int i9 = i8 - 1;
                mo50832L(iArr2[i8], i6, iArr2[i9], i7, -1);
                mo50832L(iArr2[i9], i7, iArr2[i8], i6, -1);
                if (fArr2 != null) {
                    mo50876i0(iArr2[i8]).f44584e.f44697W = fArr2[i8];
                }
            }
            mo50832L(iArr2[iArr2.length - 1], i7, i3, i4, -1);
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }

    /* renamed from: d1 */
    public void mo50865d1(int i, int i2) {
        mo50876i0(i).f44584e.f44713g = i2;
        mo50876i0(i).f44584e.f44711f = -1;
        mo50876i0(i).f44584e.f44715h = -1.0f;
    }

    /* renamed from: e0 */
    public void mo50866e0(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        mo50864d0(i, i2, i3, i4, iArr, fArr, i5, 6, 7);
    }

    /* renamed from: e1 */
    public void mo50867e1(int i, float f) {
        mo50876i0(i).f44584e.f44715h = f;
        mo50876i0(i).f44584e.f44713g = -1;
        mo50876i0(i).f44584e.f44711f = -1;
    }

    /* renamed from: f0 */
    public void mo50868f0(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        int[] iArr2 = iArr;
        float[] fArr2 = fArr;
        if (iArr2.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (fArr2 == null || fArr2.length == iArr2.length) {
            if (fArr2 != null) {
                mo50876i0(iArr2[0]).f44584e.f44696V = fArr2[0];
            }
            mo50876i0(iArr2[0]).f44584e.f44699Y = i5;
            mo50832L(iArr2[0], 3, i, i2, 0);
            for (int i6 = 1; i6 < iArr2.length; i6++) {
                int i7 = i6 - 1;
                mo50832L(iArr2[i6], 3, iArr2[i7], 4, 0);
                mo50832L(iArr2[i7], 4, iArr2[i6], 3, 0);
                if (fArr2 != null) {
                    mo50876i0(iArr2[i6]).f44584e.f44696V = fArr2[i6];
                }
            }
            mo50832L(iArr2[iArr2.length - 1], 4, i3, i4, 0);
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }

    /* renamed from: f1 */
    public void mo50869f1(int i, float f) {
        mo50876i0(i).f44584e.f44742y = f;
    }

    /* renamed from: g0 */
    public void mo50870g0(C16900s sVar, int... iArr) {
        HashSet hashSet;
        Set<Integer> keySet = this.f44579g.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int valueOf : iArr) {
                hashSet.add(Integer.valueOf(valueOf));
            }
        } else {
            hashSet = new HashSet(keySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            C16935a aVar = this.f44579g.get(num);
            if (aVar != null) {
                sb.append("<Constraint id=");
                sb.append(num);
                sb.append(" \n");
                aVar.f44584e.mo50945b(sVar, sb);
                sb.append("/>\n");
            }
        }
        System.out.println(sb.toString());
    }

    /* renamed from: g1 */
    public void mo50871g1(int i, int i2) {
        mo50876i0(i).f44584e.f44698X = i2;
    }

    /* renamed from: h */
    public final void mo50872h(ConstraintAttribute.AttributeType attributeType, String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (this.f44577e.containsKey(strArr[i])) {
                ConstraintAttribute constraintAttribute = this.f44577e.get(strArr[i]);
                if (!(constraintAttribute == null || constraintAttribute.mo50631j() == attributeType)) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute.mo50631j().name());
                }
            } else {
                this.f44577e.put(strArr[i], new ConstraintAttribute(strArr[i], attributeType));
            }
        }
    }

    /* renamed from: h0 */
    public final C16935a mo50873h0(Context context, AttributeSet attributeSet, boolean z) {
        int[] iArr;
        C16935a aVar = new C16935a();
        if (z) {
            iArr = C16944e.C16957m.ConstraintOverride;
        } else {
            iArr = C16944e.C16957m.Constraint;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        mo50823G0(context, aVar, obtainStyledAttributes, z);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: h1 */
    public void mo50874h1(int i, float f) {
        mo50876i0(i).f44584e.f44697W = f;
    }

    /* renamed from: i */
    public void mo50875i(String... strArr) {
        mo50872h(ConstraintAttribute.AttributeType.COLOR_TYPE, strArr);
    }

    /* renamed from: i0 */
    public final C16935a mo50876i0(int i) {
        if (!this.f44579g.containsKey(Integer.valueOf(i))) {
            this.f44579g.put(Integer.valueOf(i), new C16935a());
        }
        return this.f44579g.get(Integer.valueOf(i));
    }

    /* renamed from: i1 */
    public void mo50877i1(int i, String str, int i2) {
        mo50876i0(i).mo50936r(str, i2);
    }

    /* renamed from: j */
    public void mo50878j(String... strArr) {
        mo50872h(ConstraintAttribute.AttributeType.FLOAT_TYPE, strArr);
    }

    /* renamed from: j0 */
    public boolean mo50879j0(int i) {
        return mo50876i0(i).f44585f.f44802m;
    }

    /* renamed from: j1 */
    public void mo50880j1(int i, int i2) {
        if (i2 >= 0 && i2 <= 3) {
            mo50876i0(i).f44584e.f44734q0 = i2;
        }
    }

    /* renamed from: k */
    public void mo50881k(String... strArr) {
        mo50872h(ConstraintAttribute.AttributeType.INT_TYPE, strArr);
    }

    /* renamed from: k0 */
    public C16935a mo50882k0(int i) {
        if (this.f44579g.containsKey(Integer.valueOf(i))) {
            return this.f44579g.get(Integer.valueOf(i));
        }
        return null;
    }

    /* renamed from: k1 */
    public void mo50883k1(int i, int i2, int i3) {
        C16935a i0 = mo50876i0(i);
        switch (i2) {
            case 1:
                i0.f44584e.f44682H = i3;
                return;
            case 2:
                i0.f44584e.f44683I = i3;
                return;
            case 3:
                i0.f44584e.f44684J = i3;
                return;
            case 4:
                i0.f44584e.f44685K = i3;
                return;
            case 5:
                i0.f44584e.f44688N = i3;
                return;
            case 6:
                i0.f44584e.f44687M = i3;
                return;
            case 7:
                i0.f44584e.f44686L = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* renamed from: l */
    public void mo50884l(String... strArr) {
        mo50872h(ConstraintAttribute.AttributeType.STRING_TYPE, strArr);
    }

    /* renamed from: l0 */
    public HashMap<String, ConstraintAttribute> mo50885l0() {
        return this.f44577e;
    }

    /* renamed from: l1 */
    public void mo50886l1(int i, int... iArr) {
        mo50876i0(i).f44584e.f44722k0 = iArr;
    }

    /* renamed from: m */
    public void mo50887m(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i2 == 0) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        mo50832L(i, 1, i2, i4, 0);
        if (i3 == 0) {
            i5 = 2;
        } else {
            i5 = 1;
        }
        mo50832L(i, 2, i3, i5, 0);
        if (i2 != 0) {
            mo50832L(i2, 2, i, 1, 0);
        }
        if (i3 != 0) {
            mo50832L(i3, 1, i, 2, 0);
        }
    }

    /* renamed from: m1 */
    public void mo50888m1(int i, float f) {
        mo50876i0(i).f44585f.f44791b = f;
    }

    /* renamed from: n */
    public void mo50889n(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i2 == 0) {
            i4 = 6;
        } else {
            i4 = 7;
        }
        mo50832L(i, 6, i2, i4, 0);
        if (i3 == 0) {
            i5 = 7;
        } else {
            i5 = 6;
        }
        mo50832L(i, 7, i3, i5, 0);
        if (i2 != 0) {
            mo50832L(i2, 7, i, 6, 0);
        }
        if (i3 != 0) {
            mo50832L(i3, 6, i, 7, 0);
        }
    }

    /* renamed from: n0 */
    public int mo50890n0(int i) {
        return mo50876i0(i).f44584e.f44709e;
    }

    /* renamed from: n1 */
    public void mo50891n1(int i, float f) {
        mo50876i0(i).f44585f.f44792c = f;
    }

    /* renamed from: o */
    public void mo50892o(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i2 == 0) {
            i4 = 3;
        } else {
            i4 = 4;
        }
        mo50832L(i, 3, i2, i4, 0);
        if (i3 == 0) {
            i5 = 4;
        } else {
            i5 = 3;
        }
        mo50832L(i, 4, i3, i5, 0);
        if (i2 != 0) {
            mo50832L(i2, 4, i, 3, 0);
        }
        if (i3 != 0) {
            mo50832L(i3, 3, i, 4, 0);
        }
    }

    /* renamed from: o0 */
    public int[] mo50893o0() {
        Integer[] numArr = (Integer[]) this.f44579g.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* renamed from: o1 */
    public void mo50894o1(int i, float f) {
        mo50876i0(i).f44585f.f44793d = f;
    }

    /* renamed from: p */
    public void mo50895p(ConstraintLayout constraintLayout) {
        C16935a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f44579g.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(C16878c.m77588k(childAt));
            } else if (this.f44578f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.f44579g.containsKey(Integer.valueOf(id)) && (aVar = this.f44579g.get(Integer.valueOf(id))) != null) {
                ConstraintAttribute.m78207r(childAt, aVar.f44586g);
            }
        }
    }

    /* renamed from: p1 */
    public void mo50896p1(int i, float f) {
        mo50876i0(i).f44585f.f44794e = f;
    }

    /* renamed from: q */
    public void mo50897q(C16934c cVar) {
        for (C16935a next : cVar.f44579g.values()) {
            if (next.f44587h != null) {
                if (next.f44581b != null) {
                    for (Integer intValue : this.f44579g.keySet()) {
                        C16935a k0 = mo50882k0(intValue.intValue());
                        String str = k0.f44584e.f44726m0;
                        if (str != null && next.f44581b.matches(str)) {
                            next.f44587h.mo50942e(k0);
                            k0.f44586g.putAll((HashMap) next.f44586g.clone());
                        }
                    }
                } else {
                    next.f44587h.mo50942e(mo50882k0(next.f44580a));
                }
            }
        }
    }

    /* renamed from: q0 */
    public C16935a mo50898q0(int i) {
        return mo50876i0(i);
    }

    /* renamed from: q1 */
    public void mo50899q1(int i, float f) {
        mo50876i0(i).f44585f.f44795f = f;
    }

    /* renamed from: r */
    public void mo50900r(ConstraintLayout constraintLayout) {
        mo50906t(constraintLayout, true);
        constraintLayout.setConstraintSet((C16934c) null);
        constraintLayout.requestLayout();
    }

    /* renamed from: r0 */
    public int[] mo50901r0(int i) {
        int[] iArr = mo50876i0(i).f44584e.f44722k0;
        if (iArr == null) {
            return new int[0];
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* renamed from: r1 */
    public void mo50902r1(int i, String str, String str2) {
        mo50876i0(i).mo50937s(str, str2);
    }

    /* renamed from: s */
    public void mo50903s(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.C16926b bVar, SparseArray<ConstraintWidget> sparseArray) {
        C16935a aVar;
        int id = constraintHelper.getId();
        if (this.f44579g.containsKey(Integer.valueOf(id)) && (aVar = this.f44579g.get(Integer.valueOf(id))) != null && (constraintWidget instanceof C16804h)) {
            constraintHelper.mo49910z(aVar, (C16804h) constraintWidget, bVar, sparseArray);
        }
    }

    /* renamed from: s0 */
    public int mo50904s0(int i) {
        return mo50876i0(i).f44582c.f44773b;
    }

    /* renamed from: s1 */
    public void mo50905s1(int i, float f, float f2) {
        C16940e eVar = mo50876i0(i).f44585f;
        eVar.f44797h = f2;
        eVar.f44796g = f;
    }

    /* renamed from: t */
    public void mo50906t(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f44579g.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f44579g.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(C16878c.m77588k(childAt));
            } else if (this.f44578f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f44579g.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C16935a aVar = this.f44579g.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.f44584e.f44720j0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f44584e.f44716h0);
                            barrier.setMargin(aVar.f44584e.f44718i0);
                            barrier.setAllowsGoneWidget(aVar.f44584e.f44732p0);
                            C16937b bVar = aVar.f44584e;
                            int[] iArr = bVar.f44722k0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f44724l0;
                                if (str != null) {
                                    bVar.f44722k0 = mo50856Z(barrier, str);
                                    barrier.setReferencedIds(aVar.f44584e.f44722k0);
                                }
                            }
                        }
                        ConstraintLayout.C16926b bVar2 = (ConstraintLayout.C16926b) childAt.getLayoutParams();
                        bVar2.mo50706e();
                        aVar.mo50927i(bVar2);
                        if (z) {
                            ConstraintAttribute.m78207r(childAt, aVar.f44586g);
                        }
                        childAt.setLayoutParams(bVar2);
                        C16939d dVar = aVar.f44582c;
                        if (dVar.f44774c == 0) {
                            childAt.setVisibility(dVar.f44773b);
                        }
                        childAt.setAlpha(aVar.f44582c.f44775d);
                        childAt.setRotation(aVar.f44585f.f44791b);
                        childAt.setRotationX(aVar.f44585f.f44792c);
                        childAt.setRotationY(aVar.f44585f.f44793d);
                        childAt.setScaleX(aVar.f44585f.f44794e);
                        childAt.setScaleY(aVar.f44585f.f44795f);
                        C16940e eVar = aVar.f44585f;
                        if (eVar.f44798i != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(aVar.f44585f.f44798i);
                            if (findViewById != null) {
                                float top = ((float) (findViewById.getTop() + findViewById.getBottom())) / 2.0f;
                                float left = ((float) (findViewById.getLeft() + findViewById.getRight())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(left - ((float) childAt.getLeft()));
                                    childAt.setPivotY(top - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f44796g)) {
                                childAt.setPivotX(aVar.f44585f.f44796g);
                            }
                            if (!Float.isNaN(aVar.f44585f.f44797h)) {
                                childAt.setPivotY(aVar.f44585f.f44797h);
                            }
                        }
                        childAt.setTranslationX(aVar.f44585f.f44799j);
                        childAt.setTranslationY(aVar.f44585f.f44800k);
                        childAt.setTranslationZ(aVar.f44585f.f44801l);
                        C16940e eVar2 = aVar.f44585f;
                        if (eVar2.f44802m) {
                            childAt.setElevation(eVar2.f44803n);
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("WARNING NO CONSTRAINTS for view ");
                    sb2.append(id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C16935a aVar2 = this.f44579g.get(num);
            if (aVar2 != null) {
                if (aVar2.f44584e.f44720j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    C16937b bVar3 = aVar2.f44584e;
                    int[] iArr2 = bVar3.f44722k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f44724l0;
                        if (str2 != null) {
                            bVar3.f44722k0 = mo50856Z(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f44584e.f44722k0);
                        }
                    }
                    barrier2.setType(aVar2.f44584e.f44716h0);
                    barrier2.setMargin(aVar2.f44584e.f44718i0);
                    ConstraintLayout.C16926b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.mo50647I();
                    aVar2.mo50927i(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar2.f44584e.f44701a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.C16926b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.mo50927i(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).mo49916r(constraintLayout);
            }
        }
    }

    /* renamed from: t0 */
    public int mo50907t0(int i) {
        return mo50876i0(i).f44582c.f44774c;
    }

    /* renamed from: t1 */
    public void mo50908t1(int i, float f) {
        mo50876i0(i).f44585f.f44796g = f;
    }

    /* renamed from: u */
    public void mo50909u(int i, ConstraintLayout.C16926b bVar) {
        C16935a aVar;
        if (this.f44579g.containsKey(Integer.valueOf(i)) && (aVar = this.f44579g.get(Integer.valueOf(i))) != null) {
            aVar.mo50927i(bVar);
        }
    }

    /* renamed from: u0 */
    public int mo50910u0(int i) {
        return mo50876i0(i).f44584e.f44707d;
    }

    /* renamed from: u1 */
    public void mo50911u1(int i, float f) {
        mo50876i0(i).f44585f.f44797h = f;
    }

    /* renamed from: v */
    public void mo50912v(ConstraintLayout constraintLayout) {
        mo50906t(constraintLayout, false);
        constraintLayout.setConstraintSet((C16934c) null);
    }

    /* renamed from: v0 */
    public boolean mo50913v0() {
        return this.f44578f;
    }

    /* renamed from: v1 */
    public void mo50914v1(int i, float f, float f2) {
        C16940e eVar = mo50876i0(i).f44585f;
        eVar.f44799j = f;
        eVar.f44800k = f2;
    }

    /* renamed from: w0 */
    public void mo50915w0(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C16935a h0 = mo50873h0(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        h0.f44584e.f44701a = true;
                    }
                    this.f44579g.put(Integer.valueOf(h0.f44580a), h0);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: w1 */
    public void mo50916w1(int i, float f) {
        mo50876i0(i).f44585f.f44799j = f;
    }

    /* renamed from: x */
    public void mo50917x(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        int i8 = i3;
        float f2 = f;
        if (i4 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (i7 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (f2 <= 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        } else if (i8 == 1 || i8 == 2) {
            int i9 = i;
            mo50832L(i9, 1, i2, i3, i4);
            mo50832L(i9, 2, i5, i6, i7);
            C16935a aVar = this.f44579g.get(Integer.valueOf(i));
            if (aVar != null) {
                aVar.f44584e.f44742y = f2;
            }
        } else if (i8 == 6 || i8 == 7) {
            int i10 = i;
            mo50832L(i10, 6, i2, i3, i4);
            mo50832L(i10, 7, i5, i6, i7);
            C16935a aVar2 = this.f44579g.get(Integer.valueOf(i));
            if (aVar2 != null) {
                aVar2.f44584e.f44742y = f2;
            }
        } else {
            int i11 = i;
            mo50832L(i11, 3, i2, i3, i4);
            mo50832L(i11, 4, i5, i6, i7);
            C16935a aVar3 = this.f44579g.get(Integer.valueOf(i));
            if (aVar3 != null) {
                aVar3.f44584e.f44743z = f2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01cb, code lost:
        continue;
     */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50918x0(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x01da
            if (r0 == 0) goto L_0x01c8
            r4 = -1
            r5 = 3
            r6 = 2
            r7 = 0
            if (r0 == r6) goto L_0x0067
            if (r0 == r5) goto L_0x0015
            goto L_0x01cb
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r0 = r0.toLowerCase(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2075718416: goto L_0x0045;
                case -190376483: goto L_0x003b;
                case 426575017: goto L_0x0031;
                case 2146106725: goto L_0x0027;
                default: goto L_0x0026;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0026:
            goto L_0x004e
        L_0x0027:
            java.lang.String r8 = "constraintset"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r7
            goto L_0x004e
        L_0x0031:
            java.lang.String r7 = "constraintoverride"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r6
            goto L_0x004e
        L_0x003b:
            java.lang.String r7 = "constraint"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r3
            goto L_0x004e
        L_0x0045:
            java.lang.String r7 = "guideline"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r5
        L_0x004e:
            if (r4 == 0) goto L_0x0066
            if (r4 == r3) goto L_0x0058
            if (r4 == r6) goto L_0x0058
            if (r4 == r5) goto L_0x0058
            goto L_0x01cb
        L_0x0058:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.c$a> r0 = r9.f44579g     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r3 = r2.f44580a     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2 = r1
            goto L_0x01cb
        L_0x0066:
            return
        L_0x0067:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2025855158: goto L_0x00d0;
                case -1984451626: goto L_0x00c6;
                case -1962203927: goto L_0x00bc;
                case -1269513683: goto L_0x00b2;
                case -1238332596: goto L_0x00a8;
                case -71750448: goto L_0x009e;
                case 366511058: goto L_0x0093;
                case 1331510167: goto L_0x0089;
                case 1791837707: goto L_0x007e;
                case 1803088381: goto L_0x0074;
                default: goto L_0x0072;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0072:
            goto L_0x00d9
        L_0x0074:
            java.lang.String r5 = "Constraint"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r7
            goto L_0x00d9
        L_0x007e:
            java.lang.String r5 = "CustomAttribute"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 8
            goto L_0x00d9
        L_0x0089:
            java.lang.String r6 = "Barrier"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r5
            goto L_0x00d9
        L_0x0093:
            java.lang.String r5 = "CustomMethod"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 9
            goto L_0x00d9
        L_0x009e:
            java.lang.String r5 = "Guideline"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r6
            goto L_0x00d9
        L_0x00a8:
            java.lang.String r5 = "Transform"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 5
            goto L_0x00d9
        L_0x00b2:
            java.lang.String r5 = "PropertySet"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 4
            goto L_0x00d9
        L_0x00bc:
            java.lang.String r5 = "ConstraintOverride"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r3
            goto L_0x00d9
        L_0x00c6:
            java.lang.String r5 = "Motion"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 7
            goto L_0x00d9
        L_0x00d0:
            java.lang.String r5 = "Layout"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 6
        L_0x00d9:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r4) {
                case 0: goto L_0x01be;
                case 1: goto L_0x01b5;
                case 2: goto L_0x01a6;
                case 3: goto L_0x0199;
                case 4: goto L_0x0174;
                case 5: goto L_0x014e;
                case 6: goto L_0x0128;
                case 7: goto L_0x0102;
                case 8: goto L_0x00e0;
                case 9: goto L_0x00e0;
                default: goto L_0x00de;
            }
        L_0x00de:
            goto L_0x01cb
        L_0x00e0:
            if (r2 == 0) goto L_0x00e9
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r2.f44586g     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.ConstraintAttribute.m78206q(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x00e9:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0102:
            if (r2 == 0) goto L_0x010f
            androidx.constraintlayout.widget.c$c r0 = r2.f44583d     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo50948b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x010f:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0128:
            if (r2 == 0) goto L_0x0135
            androidx.constraintlayout.widget.c$b r0 = r2.f44584e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo50946c(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0135:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x014e:
            if (r2 == 0) goto L_0x015b
            androidx.constraintlayout.widget.c$e r0 = r2.f44585f     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo50952b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x015b:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0174:
            if (r2 == 0) goto L_0x0180
            androidx.constraintlayout.widget.c$d r0 = r2.f44582c     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo50950b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0180:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0199:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.c$a r0 = r9.mo50873h0(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.c$b r2 = r0.f44584e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f44720j0 = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01a6:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.c$a r0 = r9.mo50873h0(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.c$b r2 = r0.f44584e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f44701a = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f44703b = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01b5:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.c$a r0 = r9.mo50873h0(r10, r0, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01be:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.c$a r0 = r9.mo50873h0(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01c6:
            r2 = r0
            goto L_0x01cb
        L_0x01c8:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01cb:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x0006
        L_0x01d1:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x01da
        L_0x01d6:
            r10 = move-exception
            r10.printStackTrace()
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C16934c.mo50918x0(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: x1 */
    public void mo50919x1(int i, float f) {
        mo50876i0(i).f44585f.f44800k = f;
    }

    /* renamed from: y */
    public void mo50920y(int i, int i2) {
        if (i2 == 0) {
            mo50917x(i, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            mo50917x(i, i2, 2, 0, i2, 1, 0, 0.5f);
        }
    }

    /* renamed from: y1 */
    public void mo50921y1(int i, float f) {
        mo50876i0(i).f44585f.f44801l = f;
    }

    /* renamed from: z */
    public void mo50922z(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        mo50832L(i, 1, i2, i3, i4);
        mo50832L(i, 2, i5, i6, i7);
        C16935a aVar = this.f44579g.get(Integer.valueOf(i));
        if (aVar != null) {
            aVar.f44584e.f44742y = f;
        }
    }

    /* renamed from: z0 */
    public void mo50923z0(C16935a aVar, String str) {
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split("=");
            if (split2.length != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(" Unable to parse ");
                sb.append(split[i]);
            } else {
                aVar.mo50934p(split2[0], Color.parseColor(split2[1]));
            }
        }
    }

    /* renamed from: z1 */
    public void mo50924z1(boolean z) {
        this.f44573a = z;
    }
}
