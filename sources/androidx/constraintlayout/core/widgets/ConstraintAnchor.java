package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C16641c;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.C16786h;
import androidx.constraintlayout.core.widgets.analyzer.C16794n;
import com.google.firebase.installations.C33124s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintAnchor {

    /* renamed from: j */
    public static final boolean f42622j = false;

    /* renamed from: k */
    public static final int f42623k = Integer.MIN_VALUE;

    /* renamed from: a */
    public HashSet<ConstraintAnchor> f42624a = null;

    /* renamed from: b */
    public int f42625b;

    /* renamed from: c */
    public boolean f42626c;

    /* renamed from: d */
    public final ConstraintWidget f42627d;

    /* renamed from: e */
    public final Type f42628e;

    /* renamed from: f */
    public ConstraintAnchor f42629f;

    /* renamed from: g */
    public int f42630g = 0;

    /* renamed from: h */
    public int f42631h = Integer.MIN_VALUE;

    /* renamed from: i */
    public SolverVariable f42632i;

    public enum Type {
        NONE,
        LEFT,
        f42635c,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintAnchor$a */
    public static /* synthetic */ class C16773a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42643a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42643a = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42643a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42643a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f42643a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.f42635c     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f42643a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f42643a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f42643a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f42643a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f42643a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintAnchor.C16773a.<clinit>():void");
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f42627d = constraintWidget;
        this.f42628e = type;
    }

    /* renamed from: A */
    public void mo49417A(int i) {
        this.f42625b = i;
        this.f42626c = true;
    }

    /* renamed from: B */
    public void mo49418B(int i) {
        if (mo49435p()) {
            this.f42631h = i;
        }
    }

    /* renamed from: C */
    public void mo49419C(int i) {
        if (mo49435p()) {
            this.f42630g = i;
        }
    }

    /* renamed from: a */
    public boolean mo49420a(ConstraintAnchor constraintAnchor, int i) {
        return mo49421b(constraintAnchor, i, Integer.MIN_VALUE, false);
    }

    /* renamed from: b */
    public boolean mo49421b(ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            mo49444x();
            return true;
        } else if (!z && !mo49442v(constraintAnchor)) {
            return false;
        } else {
            this.f42629f = constraintAnchor;
            if (constraintAnchor.f42624a == null) {
                constraintAnchor.f42624a = new HashSet<>();
            }
            HashSet<ConstraintAnchor> hashSet = this.f42629f.f42624a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f42630g = i;
            this.f42631h = i2;
            return true;
        }
    }

    /* renamed from: c */
    public void mo49422c(ConstraintAnchor constraintAnchor, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor2 = this.f42629f;
        if (!(constraintAnchor2 == null || (hashSet = constraintAnchor2.f42624a) == null)) {
            hashSet.remove(this);
        }
        ConstraintAnchor constraintAnchor3 = constraintAnchor.f42629f;
        if (constraintAnchor3 != null) {
            this.f42629f = hashMap.get(constraintAnchor.f42629f.f42627d).mo49583r(constraintAnchor3.mo49431l());
        } else {
            this.f42629f = null;
        }
        ConstraintAnchor constraintAnchor4 = this.f42629f;
        if (constraintAnchor4 != null) {
            if (constraintAnchor4.f42624a == null) {
                constraintAnchor4.f42624a = new HashSet<>();
            }
            this.f42629f.f42624a.add(this);
        }
        this.f42630g = constraintAnchor.f42630g;
        this.f42631h = constraintAnchor.f42631h;
    }

    /* renamed from: d */
    public void mo49423d(int i, ArrayList<C16794n> arrayList, C16794n nVar) {
        HashSet<ConstraintAnchor> hashSet = this.f42624a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                C16786h.m77029a(it.next().f42627d, i, arrayList, nVar);
            }
        }
    }

    /* renamed from: e */
    public HashSet<ConstraintAnchor> mo49424e() {
        return this.f42624a;
    }

    /* renamed from: f */
    public int mo49425f() {
        if (!this.f42626c) {
            return 0;
        }
        return this.f42625b;
    }

    /* renamed from: g */
    public int mo49426g() {
        ConstraintAnchor constraintAnchor;
        if (this.f42627d.mo49566l0() == 8) {
            return 0;
        }
        if (this.f42631h == Integer.MIN_VALUE || (constraintAnchor = this.f42629f) == null || constraintAnchor.f42627d.mo49566l0() != 8) {
            return this.f42630g;
        }
        return this.f42631h;
    }

    /* renamed from: h */
    public final ConstraintAnchor mo49427h() {
        switch (C16773a.f42643a[this.f42628e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f42627d.f42712S;
            case 3:
                return this.f42627d.f42708Q;
            case 4:
                return this.f42627d.f42714T;
            case 5:
                return this.f42627d.f42710R;
            default:
                throw new AssertionError(this.f42628e.name());
        }
    }

    /* renamed from: i */
    public ConstraintWidget mo49428i() {
        return this.f42627d;
    }

    /* renamed from: j */
    public SolverVariable mo49429j() {
        return this.f42632i;
    }

    /* renamed from: k */
    public ConstraintAnchor mo49430k() {
        return this.f42629f;
    }

    /* renamed from: l */
    public Type mo49431l() {
        return this.f42628e;
    }

    /* renamed from: m */
    public boolean mo49432m() {
        HashSet<ConstraintAnchor> hashSet = this.f42624a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().mo49427h().mo49435p()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo49433n() {
        HashSet<ConstraintAnchor> hashSet = this.f42624a;
        if (hashSet != null && hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public boolean mo49434o() {
        return this.f42626c;
    }

    /* renamed from: p */
    public boolean mo49435p() {
        return this.f42629f != null;
    }

    /* renamed from: q */
    public boolean mo49436q(ConstraintWidget constraintWidget) {
        if (mo49438s(constraintWidget, new HashSet())) {
            return false;
        }
        ConstraintWidget U = mo49428i().mo49507U();
        if (U == constraintWidget || constraintWidget.mo49507U() == U) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean mo49437r(ConstraintWidget constraintWidget, ConstraintAnchor constraintAnchor) {
        return mo49436q(constraintWidget);
    }

    /* renamed from: s */
    public final boolean mo49438s(ConstraintWidget constraintWidget, HashSet<ConstraintWidget> hashSet) {
        if (hashSet.contains(constraintWidget)) {
            return false;
        }
        hashSet.add(constraintWidget);
        if (constraintWidget == mo49428i()) {
            return true;
        }
        ArrayList<ConstraintAnchor> s = constraintWidget.mo49586s();
        int size = s.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = s.get(i);
            if (constraintAnchor.mo49441u(this) && constraintAnchor.mo49435p() && mo49438s(constraintAnchor.mo49430k().mo49428i(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    public boolean mo49439t() {
        switch (C16773a.f42643a[this.f42628e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new AssertionError(this.f42628e.name());
        }
    }

    public String toString() {
        return this.f42627d.mo49605y() + C33124s.f80355c + this.f42628e.toString();
    }

    /* renamed from: u */
    public boolean mo49441u(ConstraintAnchor constraintAnchor) {
        Type l = constraintAnchor.mo49431l();
        Type type = this.f42628e;
        if (l == type) {
            return true;
        }
        switch (C16773a.f42643a[type.ordinal()]) {
            case 1:
                if (l != Type.BASELINE) {
                    return true;
                }
                return false;
            case 2:
            case 3:
            case 7:
                if (l == Type.LEFT || l == Type.RIGHT || l == Type.CENTER_X) {
                    return true;
                }
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
                if (l == Type.f42635c || l == Type.BOTTOM || l == Type.CENTER_Y || l == Type.BASELINE) {
                    return true;
                }
                return false;
            case 9:
                return false;
            default:
                throw new AssertionError(this.f42628e.name());
        }
    }

    /* renamed from: v */
    public boolean mo49442v(ConstraintAnchor constraintAnchor) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (constraintAnchor == null) {
            return false;
        }
        Type l = constraintAnchor.mo49431l();
        Type type = this.f42628e;
        if (l != type) {
            switch (C16773a.f42643a[type.ordinal()]) {
                case 1:
                    if (l == Type.BASELINE || l == Type.CENTER_X || l == Type.CENTER_Y) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    if (l == Type.LEFT || l == Type.RIGHT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(constraintAnchor.mo49428i() instanceof C16801f)) {
                        return z;
                    }
                    if (z || l == Type.CENTER_X) {
                        z3 = true;
                    }
                    return z3;
                case 4:
                case 5:
                    if (l == Type.f42635c || l == Type.BOTTOM) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!(constraintAnchor.mo49428i() instanceof C16801f)) {
                        return z2;
                    }
                    if (z2 || l == Type.CENTER_Y) {
                        z3 = true;
                    }
                    return z3;
                case 6:
                    if (l == Type.LEFT || l == Type.RIGHT) {
                        return false;
                    }
                    return true;
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f42628e.name());
            }
        } else if (type != Type.BASELINE || (constraintAnchor.mo49428i().mo49581q0() && mo49428i().mo49581q0())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: w */
    public boolean mo49443w() {
        switch (C16773a.f42643a[this.f42628e.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new AssertionError(this.f42628e.name());
        }
    }

    /* renamed from: x */
    public void mo49444x() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f42629f;
        if (!(constraintAnchor == null || (hashSet = constraintAnchor.f42624a) == null)) {
            hashSet.remove(this);
            if (this.f42629f.f42624a.size() == 0) {
                this.f42629f.f42624a = null;
            }
        }
        this.f42624a = null;
        this.f42629f = null;
        this.f42630g = 0;
        this.f42631h = Integer.MIN_VALUE;
        this.f42626c = false;
        this.f42625b = 0;
    }

    /* renamed from: y */
    public void mo49445y() {
        this.f42626c = false;
        this.f42625b = 0;
    }

    /* renamed from: z */
    public void mo49446z(C16641c cVar) {
        SolverVariable solverVariable = this.f42632i;
        if (solverVariable == null) {
            this.f42632i = new SolverVariable(SolverVariable.Type.UNRESTRICTED, (String) null);
        } else {
            solverVariable.mo48610M();
        }
    }
}
