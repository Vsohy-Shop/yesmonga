package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.p027os.C17781e;
import androidx.fragment.app.C19251l0;
import androidx.fragment.app.Fragment;
import androidx.transition.C20606h0;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.transition.n */
public class C20643n extends C19251l0 {

    /* renamed from: androidx.transition.n$a */
    public class C20644a extends C20606h0.C20612f {

        /* renamed from: a */
        public final /* synthetic */ Rect f53245a;

        public C20644a(Rect rect) {
            this.f53245a = rect;
        }

        /* renamed from: a */
        public Rect mo61771a(@C0359n0 C20606h0 h0Var) {
            return this.f53245a;
        }
    }

    /* renamed from: androidx.transition.n$b */
    public class C20645b implements C20606h0.C20614h {

        /* renamed from: a */
        public final /* synthetic */ View f53247a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f53248b;

        public C20645b(View view, ArrayList arrayList) {
            this.f53247a = view;
            this.f53248b = arrayList;
        }

        /* renamed from: a */
        public void mo61665a(@C0359n0 C20606h0 h0Var) {
        }

        /* renamed from: b */
        public void mo61772b(@C0359n0 C20606h0 h0Var) {
            h0Var.mo61767z0(this);
            h0Var.mo61737b(this);
        }

        /* renamed from: c */
        public void mo61666c(@C0359n0 C20606h0 h0Var) {
        }

        /* renamed from: d */
        public void mo61667d(@C0359n0 C20606h0 h0Var) {
            h0Var.mo61767z0(this);
            this.f53247a.setVisibility(8);
            int size = this.f53248b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f53248b.get(i)).setVisibility(0);
            }
        }

        /* renamed from: e */
        public void mo61668e(@C0359n0 C20606h0 h0Var) {
        }
    }

    /* renamed from: androidx.transition.n$c */
    public class C20646c extends C20626j0 {

        /* renamed from: a */
        public final /* synthetic */ Object f53250a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f53251b;

        /* renamed from: c */
        public final /* synthetic */ Object f53252c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f53253d;

        /* renamed from: e */
        public final /* synthetic */ Object f53254e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f53255f;

        public C20646c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f53250a = obj;
            this.f53251b = arrayList;
            this.f53252c = obj2;
            this.f53253d = arrayList2;
            this.f53254e = obj3;
            this.f53255f = arrayList3;
        }

        /* renamed from: b */
        public void mo61772b(@C0359n0 C20606h0 h0Var) {
            Object obj = this.f53250a;
            if (obj != null) {
                C20643n.this.mo57283n(obj, this.f53251b, (ArrayList<View>) null);
            }
            Object obj2 = this.f53252c;
            if (obj2 != null) {
                C20643n.this.mo57283n(obj2, this.f53253d, (ArrayList<View>) null);
            }
            Object obj3 = this.f53254e;
            if (obj3 != null) {
                C20643n.this.mo57283n(obj3, this.f53255f, (ArrayList<View>) null);
            }
        }

        /* renamed from: d */
        public void mo61667d(@C0359n0 C20606h0 h0Var) {
            h0Var.mo61767z0(this);
        }
    }

    /* renamed from: androidx.transition.n$d */
    public class C20647d implements C17781e.C17783b {

        /* renamed from: a */
        public final /* synthetic */ C20606h0 f53257a;

        public C20647d(C20606h0 h0Var) {
            this.f53257a = h0Var;
        }

        public void onCancel() {
            this.f53257a.cancel();
        }
    }

    /* renamed from: androidx.transition.n$e */
    public class C20648e implements C20606h0.C20614h {

        /* renamed from: a */
        public final /* synthetic */ Runnable f53259a;

        public C20648e(Runnable runnable) {
            this.f53259a = runnable;
        }

        /* renamed from: a */
        public void mo61665a(@C0359n0 C20606h0 h0Var) {
        }

        /* renamed from: b */
        public void mo61772b(@C0359n0 C20606h0 h0Var) {
        }

        /* renamed from: c */
        public void mo61666c(@C0359n0 C20606h0 h0Var) {
        }

        /* renamed from: d */
        public void mo61667d(@C0359n0 C20606h0 h0Var) {
            this.f53259a.run();
        }

        /* renamed from: e */
        public void mo61668e(@C0359n0 C20606h0 h0Var) {
        }
    }

    /* renamed from: androidx.transition.n$f */
    public class C20649f extends C20606h0.C20612f {

        /* renamed from: a */
        public final /* synthetic */ Rect f53261a;

        public C20649f(Rect rect) {
            this.f53261a = rect;
        }

        /* renamed from: a */
        public Rect mo61771a(@C0359n0 C20606h0 h0Var) {
            Rect rect = this.f53261a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f53261a;
        }
    }

    /* renamed from: x */
    public static boolean m96014x(C20606h0 h0Var) {
        if (!C19251l0.m90288i(h0Var.mo61740c0()) || !C19251l0.m90288i(h0Var.mo61743d0()) || !C19251l0.m90288i(h0Var.mo61746g0())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo57275a(Object obj, View view) {
        if (obj != null) {
            ((C20606h0) obj).mo61744e(view);
        }
    }

    /* renamed from: b */
    public void mo57276b(Object obj, ArrayList<View> arrayList) {
        C20606h0 h0Var = (C20606h0) obj;
        if (h0Var != null) {
            int i = 0;
            if (h0Var instanceof C20639m0) {
                C20639m0 m0Var = (C20639m0) h0Var;
                int e1 = m0Var.mo61839e1();
                while (i < e1) {
                    mo57276b(m0Var.mo61838d1(i), arrayList);
                    i++;
                }
            } else if (!m96014x(h0Var) && C19251l0.m90288i(h0Var.mo61748h0())) {
                int size = arrayList.size();
                while (i < size) {
                    h0Var.mo61744e(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo57277c(ViewGroup viewGroup, Object obj) {
        C20629k0.m95932b(viewGroup, (C20606h0) obj);
    }

    /* renamed from: e */
    public boolean mo57278e(Object obj) {
        return obj instanceof C20606h0;
    }

    /* renamed from: f */
    public Object mo57279f(Object obj) {
        if (obj != null) {
            return ((C20606h0) obj).clone();
        }
        return null;
    }

    /* renamed from: j */
    public Object mo57280j(Object obj, Object obj2, Object obj3) {
        C20606h0 h0Var = (C20606h0) obj;
        C20606h0 h0Var2 = (C20606h0) obj2;
        C20606h0 h0Var3 = (C20606h0) obj3;
        if (h0Var != null && h0Var2 != null) {
            h0Var = new C20639m0().mo61835a1(h0Var).mo61835a1(h0Var2).mo61848p1(1);
        } else if (h0Var == null) {
            if (h0Var2 != null) {
                h0Var = h0Var2;
            } else {
                h0Var = null;
            }
        }
        if (h0Var3 == null) {
            return h0Var;
        }
        C20639m0 m0Var = new C20639m0();
        if (h0Var != null) {
            m0Var.mo61835a1(h0Var);
        }
        m0Var.mo61835a1(h0Var3);
        return m0Var;
    }

    /* renamed from: k */
    public Object mo57281k(Object obj, Object obj2, Object obj3) {
        C20639m0 m0Var = new C20639m0();
        if (obj != null) {
            m0Var.mo61835a1((C20606h0) obj);
        }
        if (obj2 != null) {
            m0Var.mo61835a1((C20606h0) obj2);
        }
        if (obj3 != null) {
            m0Var.mo61835a1((C20606h0) obj3);
        }
        return m0Var;
    }

    /* renamed from: m */
    public void mo57282m(Object obj, View view) {
        if (obj != null) {
            ((C20606h0) obj).mo61704D0(view);
        }
    }

    /* renamed from: n */
    public void mo57283n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        C20606h0 h0Var = (C20606h0) obj;
        int i2 = 0;
        if (h0Var instanceof C20639m0) {
            C20639m0 m0Var = (C20639m0) h0Var;
            int e1 = m0Var.mo61839e1();
            while (i2 < e1) {
                mo57283n(m0Var.mo61838d1(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m96014x(h0Var)) {
            List<View> h0 = h0Var.mo61748h0();
            if (h0.size() == arrayList.size() && h0.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    h0Var.mo61744e(arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    h0Var.mo61704D0(arrayList.get(size));
                }
            }
        }
    }

    /* renamed from: o */
    public void mo57284o(Object obj, View view, ArrayList<View> arrayList) {
        ((C20606h0) obj).mo61737b(new C20645b(view, arrayList));
    }

    /* renamed from: p */
    public void mo57285p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((C20606h0) obj).mo61737b(new C20646c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: q */
    public void mo57286q(Object obj, Rect rect) {
        if (obj != null) {
            ((C20606h0) obj).mo61719M0(new C20649f(rect));
        }
    }

    /* renamed from: r */
    public void mo57287r(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo57309h(view, rect);
            ((C20606h0) obj).mo61719M0(new C20644a(rect));
        }
    }

    /* renamed from: s */
    public void mo57288s(@C0359n0 Fragment fragment, @C0359n0 Object obj, @C0359n0 C17781e eVar, @C0359n0 Runnable runnable) {
        C20606h0 h0Var = (C20606h0) obj;
        eVar.mo52222d(new C20647d(h0Var));
        h0Var.mo61737b(new C20648e(runnable));
    }

    /* renamed from: u */
    public void mo57289u(Object obj, View view, ArrayList<View> arrayList) {
        C20639m0 m0Var = (C20639m0) obj;
        List<View> h0 = m0Var.mo61748h0();
        h0.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C19251l0.m90286d(h0, arrayList.get(i));
        }
        h0.add(view);
        arrayList.add(view);
        mo57276b(m0Var, arrayList);
    }

    /* renamed from: v */
    public void mo57290v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C20639m0 m0Var = (C20639m0) obj;
        if (m0Var != null) {
            m0Var.mo61748h0().clear();
            m0Var.mo61748h0().addAll(arrayList2);
            mo57283n(m0Var, arrayList, arrayList2);
        }
    }

    /* renamed from: w */
    public Object mo57291w(Object obj) {
        if (obj == null) {
            return null;
        }
        C20639m0 m0Var = new C20639m0();
        m0Var.mo61835a1((C20606h0) obj);
        return m0Var;
    }
}
