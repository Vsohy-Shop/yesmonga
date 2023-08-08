package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.C16655a;
import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.constraintlayout.core.parser.C16735c;
import androidx.constraintlayout.core.parser.C16736d;
import androidx.constraintlayout.core.parser.C16737e;
import androidx.constraintlayout.core.parser.C16738f;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.C16769n;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.firebase.installations.C33124s;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.banner.C9156c;
import java.util.HashMap;
import java.util.Set;

/* renamed from: androidx.constraintlayout.core.state.o */
public class C16772o {

    /* renamed from: u */
    public static final boolean f42600u = true;

    /* renamed from: v */
    public static float f42601v = Float.NaN;

    /* renamed from: a */
    public ConstraintWidget f42602a = null;

    /* renamed from: b */
    public int f42603b = 0;

    /* renamed from: c */
    public int f42604c = 0;

    /* renamed from: d */
    public int f42605d = 0;

    /* renamed from: e */
    public int f42606e = 0;

    /* renamed from: f */
    public float f42607f = Float.NaN;

    /* renamed from: g */
    public float f42608g = Float.NaN;

    /* renamed from: h */
    public float f42609h = Float.NaN;

    /* renamed from: i */
    public float f42610i = Float.NaN;

    /* renamed from: j */
    public float f42611j = Float.NaN;

    /* renamed from: k */
    public float f42612k = Float.NaN;

    /* renamed from: l */
    public float f42613l = Float.NaN;

    /* renamed from: m */
    public float f42614m = Float.NaN;

    /* renamed from: n */
    public float f42615n = Float.NaN;

    /* renamed from: o */
    public float f42616o = Float.NaN;

    /* renamed from: p */
    public float f42617p = Float.NaN;

    /* renamed from: q */
    public float f42618q = Float.NaN;

    /* renamed from: r */
    public int f42619r = 0;

    /* renamed from: s */
    public final HashMap<String, C16655a> f42620s = new HashMap<>();

    /* renamed from: t */
    public String f42621t = null;

    public C16772o() {
    }

    /* renamed from: a */
    public static void m76714a(StringBuilder sb, String str, float f) {
        if (!Float.isNaN(f)) {
            sb.append(str);
            sb.append(": ");
            sb.append(f);
            sb.append(",\n");
        }
    }

    /* renamed from: b */
    public static void m76715b(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(",\n");
    }

    /* renamed from: m */
    public static float m76716m(float f, float f2, float f3, float f4) {
        boolean isNaN = Float.isNaN(f);
        boolean isNaN2 = Float.isNaN(f2);
        if (isNaN && isNaN2) {
            return Float.NaN;
        }
        if (isNaN) {
            f = f3;
        }
        if (isNaN2) {
            f2 = f3;
        }
        return f + (f4 * (f2 - f));
    }

    /* renamed from: n */
    public static void m76717n(int i, int i2, C16772o oVar, C16772o oVar2, C16772o oVar3, C16769n nVar, float f) {
        int i3;
        float f2;
        int i4;
        int i5;
        float f3;
        float f4;
        float f5;
        int i6;
        int i7;
        int i8;
        float f6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = i;
        int i14 = i2;
        C16772o oVar4 = oVar;
        C16772o oVar5 = oVar2;
        C16772o oVar6 = oVar3;
        C16769n nVar2 = nVar;
        float f7 = 100.0f * f;
        int i15 = (int) f7;
        int i16 = oVar5.f42603b;
        int i17 = oVar5.f42604c;
        int i18 = oVar6.f42603b;
        int i19 = oVar6.f42604c;
        int i20 = oVar6.f42605d - i18;
        int i21 = oVar5.f42605d - i16;
        int i22 = oVar6.f42606e - i19;
        int i23 = oVar5.f42606e - i17;
        float f8 = oVar5.f42617p;
        float f9 = oVar6.f42617p;
        float f10 = f7;
        if (oVar5.f42619r == 8) {
            i17 = (int) (((float) i17) - (((float) i22) / 2.0f));
            i3 = (int) (((float) i16) - (((float) i20) / 2.0f));
            if (Float.isNaN(f8)) {
                i4 = i22;
                i5 = i20;
                f2 = 0.0f;
            } else {
                f2 = f8;
                i5 = i20;
                i4 = i22;
            }
        } else {
            i5 = i21;
            f2 = f8;
            i4 = i23;
            i3 = i16;
        }
        if (oVar6.f42619r == 8) {
            i18 = (int) (((float) i18) - (((float) i5) / 2.0f));
            i19 = (int) (((float) i19) - (((float) i4) / 2.0f));
            i20 = i5;
            i22 = i4;
            if (Float.isNaN(f9)) {
                f9 = 0.0f;
            }
        }
        if (Float.isNaN(f2) && !Float.isNaN(f9)) {
            f2 = 1.0f;
        }
        if (!Float.isNaN(f2) && Float.isNaN(f9)) {
            f9 = 1.0f;
        }
        if (oVar5.f42619r == 4) {
            f3 = f9;
            f4 = 0.0f;
        } else {
            f4 = f2;
            f3 = f9;
        }
        if (oVar6.f42619r == 4) {
            f5 = 0.0f;
        } else {
            f5 = f3;
        }
        if (oVar4.f42602a == null || !nVar.mo49366N()) {
            i6 = i17;
            f6 = f;
            i8 = i3;
            i7 = i18;
        } else {
            C16769n.C16770a x = nVar2.mo49381x(oVar4.f42602a.f42750o, i15);
            i6 = i17;
            C16769n.C16770a w = nVar2.mo49380w(oVar4.f42602a.f42750o, i15);
            if (x == w) {
                w = null;
            }
            if (x != null) {
                i3 = (int) (x.f42588d * ((float) i13));
                i9 = i18;
                i11 = i2;
                i6 = (int) (x.f42589e * ((float) i11));
                i10 = x.f42585a;
            } else {
                i11 = i2;
                i9 = i18;
                i10 = 0;
            }
            i8 = i3;
            if (w != null) {
                int i24 = (int) (w.f42588d * ((float) i13));
                int i25 = (int) (w.f42589e * ((float) i11));
                i12 = w.f42585a;
                i7 = i24;
                i19 = i25;
            } else {
                i12 = 100;
                i7 = i9;
            }
            f6 = (f10 - ((float) i10)) / ((float) (i12 - i10));
        }
        int i26 = i6;
        oVar4.f42602a = oVar5.f42602a;
        int i27 = (int) (((float) i8) + (((float) (i7 - i8)) * f6));
        oVar4.f42603b = i27;
        int i28 = (int) (((float) i26) + (f6 * ((float) (i19 - i26))));
        oVar4.f42604c = i28;
        float f11 = f;
        float f12 = 1.0f - f11;
        oVar4.f42605d = i27 + ((int) ((((float) i5) * f12) + (((float) i20) * f11)));
        oVar4.f42606e = i28 + ((int) ((f12 * ((float) i4)) + (((float) i22) * f11)));
        oVar4.f42607f = m76716m(oVar5.f42607f, oVar6.f42607f, 0.5f, f11);
        oVar4.f42608g = m76716m(oVar5.f42608g, oVar6.f42608g, 0.5f, f11);
        oVar4.f42609h = m76716m(oVar5.f42609h, oVar6.f42609h, 0.0f, f11);
        oVar4.f42610i = m76716m(oVar5.f42610i, oVar6.f42610i, 0.0f, f11);
        oVar4.f42611j = m76716m(oVar5.f42611j, oVar6.f42611j, 0.0f, f11);
        oVar4.f42615n = m76716m(oVar5.f42615n, oVar6.f42615n, 1.0f, f11);
        oVar4.f42616o = m76716m(oVar5.f42616o, oVar6.f42616o, 1.0f, f11);
        oVar4.f42612k = m76716m(oVar5.f42612k, oVar6.f42612k, 0.0f, f11);
        oVar4.f42613l = m76716m(oVar5.f42613l, oVar6.f42613l, 0.0f, f11);
        oVar4.f42614m = m76716m(oVar5.f42614m, oVar6.f42614m, 0.0f, f11);
        oVar4.f42617p = m76716m(f4, f5, 1.0f, f11);
        Set<String> keySet = oVar6.f42620s.keySet();
        oVar4.f42620s.clear();
        for (String next : keySet) {
            if (oVar5.f42620s.containsKey(next)) {
                C16655a aVar = oVar5.f42620s.get(next);
                C16655a aVar2 = oVar6.f42620s.get(next);
                C16655a aVar3 = new C16655a(aVar);
                oVar4.f42620s.put(next, aVar3);
                if (aVar.mo48784r() == 1) {
                    aVar3.mo48791y(Float.valueOf(m76716m(aVar.mo48781n(), aVar2.mo48781n(), 0.0f, f11)));
                } else {
                    int r = aVar.mo48784r();
                    float[] fArr = new float[r];
                    float[] fArr2 = new float[r];
                    aVar.mo48782o(fArr);
                    aVar2.mo48782o(fArr2);
                    for (int i29 = 0; i29 < r; i29++) {
                        fArr[i29] = m76716m(fArr[i29], fArr2[i29], 0.0f, f11);
                        aVar3.mo48792z(fArr);
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public boolean mo49390A(String str, C16735c cVar) throws CLParsingException {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1881940865:
                if (str.equals("phone_orientation")) {
                    c = 0;
                    break;
                }
                break;
            case -1383228885:
                if (str.equals(C9156c.f24821Y)) {
                    c = 1;
                    break;
                }
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    c = 2;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 3;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 4;
                    break;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 5;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 6;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 7;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 8;
                    break;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c = 9;
                    break;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c = 10;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 11;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 12;
                    break;
                }
                break;
            case 115029:
                if (str.equals(C9156c.f24820X)) {
                    c = 13;
                    break;
                }
                break;
            case 3317767:
                if (str.equals(C9168d0.f24880E0)) {
                    c = 14;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 15;
                    break;
                }
                break;
            case 108511772:
                if (str.equals(C9168d0.f24887Z)) {
                    c = 16;
                    break;
                }
                break;
            case 642850769:
                if (str.equals("interpolatedPos")) {
                    c = 17;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                f42601v = cVar.mo49182r();
                break;
            case 1:
                this.f42606e = cVar.mo49183w();
                break;
            case 2:
                mo49407q(cVar);
                break;
            case 3:
                this.f42609h = cVar.mo49182r();
                break;
            case 4:
                this.f42610i = cVar.mo49182r();
                break;
            case 5:
                this.f42611j = cVar.mo49182r();
                break;
            case 6:
                this.f42612k = cVar.mo49182r();
                break;
            case 7:
                this.f42613l = cVar.mo49182r();
                break;
            case 8:
                this.f42614m = cVar.mo49182r();
                break;
            case 9:
                this.f42607f = cVar.mo49182r();
                break;
            case 10:
                this.f42608g = cVar.mo49182r();
                break;
            case 11:
                this.f42615n = cVar.mo49182r();
                break;
            case 12:
                this.f42616o = cVar.mo49182r();
                break;
            case 13:
                this.f42604c = cVar.mo49183w();
                break;
            case 14:
                this.f42603b = cVar.mo49183w();
                break;
            case 15:
                this.f42617p = cVar.mo49182r();
                break;
            case 16:
                this.f42605d = cVar.mo49183w();
                break;
            case 17:
                this.f42618q = cVar.mo49182r();
                break;
            default:
                return false;
        }
        return true;
    }

    /* renamed from: B */
    public C16772o mo49391B() {
        ConstraintWidget constraintWidget = this.f42602a;
        if (constraintWidget != null) {
            this.f42603b = constraintWidget.mo49480L();
            this.f42604c = this.f42602a.mo49539e0();
            this.f42605d = this.f42602a.mo49516X();
            this.f42606e = this.f42602a.mo49596v();
            mo49393D(this.f42602a.f42748n);
        }
        return this;
    }

    /* renamed from: C */
    public C16772o mo49392C(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return this;
        }
        this.f42602a = constraintWidget;
        mo49391B();
        return this;
    }

    /* renamed from: D */
    public void mo49393D(C16772o oVar) {
        this.f42607f = oVar.f42607f;
        this.f42608g = oVar.f42608g;
        this.f42609h = oVar.f42609h;
        this.f42610i = oVar.f42610i;
        this.f42611j = oVar.f42611j;
        this.f42612k = oVar.f42612k;
        this.f42613l = oVar.f42613l;
        this.f42614m = oVar.f42614m;
        this.f42615n = oVar.f42615n;
        this.f42616o = oVar.f42616o;
        this.f42617p = oVar.f42617p;
        this.f42619r = oVar.f42619r;
        this.f42620s.clear();
        for (C16655a next : oVar.f42620s.values()) {
            this.f42620s.put(next.mo48778k(), next.mo48771d());
        }
    }

    /* renamed from: E */
    public int mo49394E() {
        return Math.max(0, this.f42605d - this.f42603b);
    }

    /* renamed from: c */
    public void mo49395c(String str, int i) {
        mo49413w(str, 902, i);
    }

    /* renamed from: d */
    public void mo49396d(String str, float f) {
        mo49412v(str, 901, f);
    }

    /* renamed from: e */
    public float mo49397e() {
        int i = this.f42603b;
        return ((float) i) + (((float) (this.f42605d - i)) / 2.0f);
    }

    /* renamed from: f */
    public float mo49398f() {
        int i = this.f42604c;
        return ((float) i) + (((float) (this.f42606e - i)) / 2.0f);
    }

    /* renamed from: g */
    public C16655a mo49399g(String str) {
        return this.f42620s.get(str);
    }

    /* renamed from: h */
    public Set<String> mo49400h() {
        return this.f42620s.keySet();
    }

    /* renamed from: i */
    public int mo49401i(String str) {
        if (this.f42620s.containsKey(str)) {
            return this.f42620s.get(str).mo48774g();
        }
        return -21880;
    }

    /* renamed from: j */
    public float mo49402j(String str) {
        if (this.f42620s.containsKey(str)) {
            return this.f42620s.get(str).mo48775h();
        }
        return Float.NaN;
    }

    /* renamed from: k */
    public String mo49403k() {
        ConstraintWidget constraintWidget = this.f42602a;
        if (constraintWidget == null) {
            return "unknown";
        }
        return constraintWidget.f42750o;
    }

    /* renamed from: l */
    public int mo49404l() {
        return Math.max(0, this.f42606e - this.f42604c);
    }

    /* renamed from: o */
    public boolean mo49405o() {
        if (!Float.isNaN(this.f42609h) || !Float.isNaN(this.f42610i) || !Float.isNaN(this.f42611j) || !Float.isNaN(this.f42612k) || !Float.isNaN(this.f42613l) || !Float.isNaN(this.f42614m) || !Float.isNaN(this.f42615n) || !Float.isNaN(this.f42616o) || !Float.isNaN(this.f42617p)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public void mo49406p(String str) {
        String str2;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str3 = (".(" + stackTraceElement.getFileName() + C33124s.f80355c + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        if (this.f42602a != null) {
            str2 = str3 + "/" + (this.f42602a.hashCode() % 1000);
        } else {
            str2 = str3 + "/NULL";
        }
        System.out.println(str2 + " " + str);
    }

    /* renamed from: q */
    public void mo49407q(C16735c cVar) throws CLParsingException {
        C16738f fVar = (C16738f) cVar;
        int size = fVar.size();
        for (int i = 0; i < size; i++) {
            C16736d dVar = (C16736d) fVar.mo49153l0(i);
            dVar.mo49178h();
            C16735c O0 = dVar.mo49186O0();
            String h = O0.mo49178h();
            if (h.matches("#[0-9a-fA-F]+")) {
                mo49413w(dVar.mo49178h(), 902, Integer.parseInt(h.substring(1), 16));
            } else if (O0 instanceof C16737e) {
                mo49412v(dVar.mo49178h(), 901, O0.mo49182r());
            } else {
                mo49414x(dVar.mo49178h(), C16717v.C16719b.f42190m, h);
            }
        }
    }

    /* renamed from: r */
    public void mo49408r() {
        String str;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = (".(" + stackTraceElement.getFileName() + C33124s.f80355c + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        if (this.f42602a != null) {
            str = str2 + "/" + (this.f42602a.hashCode() % 1000) + " ";
        } else {
            str = str2 + "/NULL ";
        }
        HashMap<String, C16655a> hashMap = this.f42620s;
        if (hashMap != null) {
            for (String str3 : hashMap.keySet()) {
                System.out.println(str + this.f42620s.get(str3).toString());
            }
        }
    }

    /* renamed from: s */
    public StringBuilder mo49409s(StringBuilder sb) {
        return mo49410t(sb, false);
    }

    /* renamed from: t */
    public StringBuilder mo49410t(StringBuilder sb, boolean z) {
        sb.append("{\n");
        m76715b(sb, C9168d0.f24880E0, this.f42603b);
        m76715b(sb, C9156c.f24820X, this.f42604c);
        m76715b(sb, C9168d0.f24887Z, this.f42605d);
        m76715b(sb, C9156c.f24821Y, this.f42606e);
        m76714a(sb, "pivotX", this.f42607f);
        m76714a(sb, "pivotY", this.f42608g);
        m76714a(sb, "rotationX", this.f42609h);
        m76714a(sb, "rotationY", this.f42610i);
        m76714a(sb, "rotationZ", this.f42611j);
        m76714a(sb, "translationX", this.f42612k);
        m76714a(sb, "translationY", this.f42613l);
        m76714a(sb, "translationZ", this.f42614m);
        m76714a(sb, "scaleX", this.f42615n);
        m76714a(sb, "scaleY", this.f42616o);
        m76714a(sb, "alpha", this.f42617p);
        m76715b(sb, "visibility", this.f42619r);
        m76714a(sb, "interpolatedPos", this.f42618q);
        if (this.f42602a != null) {
            for (ConstraintAnchor.Type u : ConstraintAnchor.Type.values()) {
                mo49411u(sb, u);
            }
        }
        if (z) {
            m76714a(sb, "phone_orientation", f42601v);
        }
        if (z) {
            m76714a(sb, "phone_orientation", f42601v);
        }
        if (this.f42620s.size() != 0) {
            sb.append("custom : {\n");
            for (String next : this.f42620s.keySet()) {
                C16655a aVar = this.f42620s.get(next);
                sb.append(next);
                sb.append(": ");
                switch (aVar.mo48780m()) {
                    case 900:
                        sb.append(aVar.mo48776i());
                        sb.append(",\n");
                        break;
                    case 901:
                    case C16717v.C16719b.f42192o:
                        sb.append(aVar.mo48775h());
                        sb.append(",\n");
                        break;
                    case 902:
                        sb.append("'");
                        sb.append(C16655a.m75876c(aVar.mo48776i()));
                        sb.append("',\n");
                        break;
                    case C16717v.C16719b.f42190m:
                        sb.append("'");
                        sb.append(aVar.mo48779l());
                        sb.append("',\n");
                        break;
                    case C16717v.C16719b.f42191n:
                        sb.append("'");
                        sb.append(aVar.mo48773f());
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    /* renamed from: u */
    public final void mo49411u(StringBuilder sb, ConstraintAnchor.Type type) {
        ConstraintAnchor r = this.f42602a.mo49583r(type);
        if (r != null && r.f42629f != null) {
            sb.append("Anchor");
            sb.append(type.name());
            sb.append(": ['");
            String str = r.f42629f.mo49428i().f42750o;
            if (str == null) {
                str = "#PARENT";
            }
            sb.append(str);
            sb.append("', '");
            sb.append(r.f42629f.mo49431l().name());
            sb.append("', '");
            sb.append(r.f42630g);
            sb.append("'],\n");
        }
    }

    /* renamed from: v */
    public void mo49412v(String str, int i, float f) {
        if (this.f42620s.containsKey(str)) {
            this.f42620s.get(str).mo48787u(f);
        } else {
            this.f42620s.put(str, new C16655a(str, i, f));
        }
    }

    /* renamed from: w */
    public void mo49413w(String str, int i, int i2) {
        if (this.f42620s.containsKey(str)) {
            this.f42620s.get(str).mo48788v(i2);
        } else {
            this.f42620s.put(str, new C16655a(str, i, i2));
        }
    }

    /* renamed from: x */
    public void mo49414x(String str, int i, String str2) {
        if (this.f42620s.containsKey(str)) {
            this.f42620s.get(str).mo48790x(str2);
        } else {
            this.f42620s.put(str, new C16655a(str, i, str2));
        }
    }

    /* renamed from: y */
    public void mo49415y(String str, int i, boolean z) {
        if (this.f42620s.containsKey(str)) {
            this.f42620s.get(str).mo48785t(z);
        } else {
            this.f42620s.put(str, new C16655a(str, i, z));
        }
    }

    /* renamed from: z */
    public void mo49416z(CustomAttribute customAttribute, float[] fArr) {
    }

    public C16772o(ConstraintWidget constraintWidget) {
        this.f42602a = constraintWidget;
    }

    public C16772o(C16772o oVar) {
        this.f42602a = oVar.f42602a;
        this.f42603b = oVar.f42603b;
        this.f42604c = oVar.f42604c;
        this.f42605d = oVar.f42605d;
        this.f42606e = oVar.f42606e;
        mo49393D(oVar);
    }
}
