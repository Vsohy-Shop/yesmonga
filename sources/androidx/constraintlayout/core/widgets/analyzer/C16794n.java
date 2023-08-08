package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.C16643e;
import androidx.constraintlayout.core.widgets.C16796b;
import androidx.constraintlayout.core.widgets.C16798d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.n */
public class C16794n {

    /* renamed from: g */
    public static final boolean f42889g = false;

    /* renamed from: h */
    public static int f42890h;

    /* renamed from: a */
    public ArrayList<ConstraintWidget> f42891a = new ArrayList<>();

    /* renamed from: b */
    public int f42892b;

    /* renamed from: c */
    public boolean f42893c = false;

    /* renamed from: d */
    public int f42894d;

    /* renamed from: e */
    public ArrayList<C16795a> f42895e = null;

    /* renamed from: f */
    public int f42896f = -1;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.n$a */
    public class C16795a {

        /* renamed from: a */
        public WeakReference<ConstraintWidget> f42897a;

        /* renamed from: b */
        public int f42898b;

        /* renamed from: c */
        public int f42899c;

        /* renamed from: d */
        public int f42900d;

        /* renamed from: e */
        public int f42901e;

        /* renamed from: f */
        public int f42902f;

        /* renamed from: g */
        public int f42903g;

        public C16795a(ConstraintWidget constraintWidget, C16643e eVar, int i) {
            this.f42897a = new WeakReference<>(constraintWidget);
            this.f42898b = eVar.mo48696O(constraintWidget.f42708Q);
            this.f42899c = eVar.mo48696O(constraintWidget.f42710R);
            this.f42900d = eVar.mo48696O(constraintWidget.f42712S);
            this.f42901e = eVar.mo48696O(constraintWidget.f42714T);
            this.f42902f = eVar.mo48696O(constraintWidget.f42716U);
            this.f42903g = i;
        }

        /* renamed from: a */
        public void mo49706a() {
            ConstraintWidget constraintWidget = this.f42897a.get();
            if (constraintWidget != null) {
                constraintWidget.mo49579p1(this.f42898b, this.f42899c, this.f42900d, this.f42901e, this.f42902f, this.f42903g);
            }
        }
    }

    public C16794n(int i) {
        int i2 = f42890h;
        f42890h = i2 + 1;
        this.f42892b = i2;
        this.f42894d = i;
    }

    /* renamed from: a */
    public boolean mo49688a(ConstraintWidget constraintWidget) {
        if (this.f42891a.contains(constraintWidget)) {
            return false;
        }
        this.f42891a.add(constraintWidget);
        return true;
    }

    /* renamed from: b */
    public void mo49689b() {
        if (this.f42895e != null && this.f42893c) {
            for (int i = 0; i < this.f42895e.size(); i++) {
                this.f42895e.get(i).mo49706a();
            }
        }
    }

    /* renamed from: c */
    public void mo49690c(ArrayList<C16794n> arrayList) {
        int size = this.f42891a.size();
        if (this.f42896f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C16794n nVar = arrayList.get(i);
                if (this.f42896f == nVar.f42892b) {
                    mo49700m(this.f42894d, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: d */
    public void mo49691d() {
        this.f42891a.clear();
    }

    /* renamed from: e */
    public final boolean mo49692e(ConstraintWidget constraintWidget) {
        return this.f42891a.contains(constraintWidget);
    }

    /* renamed from: f */
    public int mo49693f() {
        return this.f42892b;
    }

    /* renamed from: g */
    public int mo49694g() {
        return this.f42894d;
    }

    /* renamed from: h */
    public final String mo49695h() {
        int i = this.f42894d;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    /* renamed from: i */
    public boolean mo49696i(C16794n nVar) {
        for (int i = 0; i < this.f42891a.size(); i++) {
            if (nVar.mo49692e(this.f42891a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo49697j() {
        return this.f42893c;
    }

    /* renamed from: k */
    public final int mo49698k(int i, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour z = constraintWidget.mo49608z(i);
        if (z != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && z != ConstraintWidget.DimensionBehaviour.MATCH_PARENT && z != ConstraintWidget.DimensionBehaviour.FIXED) {
            return -1;
        }
        if (i == 0) {
            return constraintWidget.mo49569m0();
        }
        return constraintWidget.mo49456D();
    }

    /* renamed from: l */
    public int mo49699l(C16643e eVar, int i) {
        if (this.f42891a.size() == 0) {
            return 0;
        }
        return mo49704q(eVar, this.f42891a, i);
    }

    /* renamed from: m */
    public void mo49700m(int i, C16794n nVar) {
        Iterator<ConstraintWidget> it = this.f42891a.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            nVar.mo49688a(next);
            if (i == 0) {
                next.f42713S0 = nVar.mo49693f();
            } else {
                next.f42715T0 = nVar.mo49693f();
            }
        }
        this.f42896f = nVar.f42892b;
    }

    /* renamed from: n */
    public void mo49701n(boolean z) {
        this.f42893c = z;
    }

    /* renamed from: o */
    public void mo49702o(int i) {
        this.f42894d = i;
    }

    /* renamed from: p */
    public int mo49703p() {
        return this.f42891a.size();
    }

    /* renamed from: q */
    public final int mo49704q(C16643e eVar, ArrayList<ConstraintWidget> arrayList, int i) {
        int O;
        int O2;
        C16798d dVar = (C16798d) arrayList.get(0).mo49507U();
        eVar.mo48706Y();
        dVar.mo49546g(eVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).mo49546g(eVar, false);
        }
        if (i == 0 && dVar.f42945M1 > 0) {
            C16796b.m77085b(dVar, eVar, arrayList, 0);
        }
        if (i == 1 && dVar.f42946N1 > 0) {
            C16796b.m77085b(dVar, eVar, arrayList, 1);
        }
        try {
            eVar.mo48701T();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f42895e = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f42895e.add(new C16795a(arrayList.get(i3), eVar, i));
        }
        if (i == 0) {
            O = eVar.mo48696O(dVar.f42708Q);
            O2 = eVar.mo48696O(dVar.f42712S);
            eVar.mo48706Y();
        } else {
            O = eVar.mo48696O(dVar.f42710R);
            O2 = eVar.mo48696O(dVar.f42714T);
            eVar.mo48706Y();
        }
        return O2 - O;
    }

    public String toString() {
        String str = mo49695h() + " [" + this.f42892b + "] <";
        Iterator<ConstraintWidget> it = this.f42891a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().mo49605y();
        }
        return str + " >";
    }
}
