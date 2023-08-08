package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1866a;
import androidx.core.view.C18196h2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.transition.k0 */
public class C20629k0 {

    /* renamed from: c */
    public static final String f53210c = "TransitionManager";

    /* renamed from: d */
    public static C20606h0 f53211d = new C20552c();

    /* renamed from: e */
    public static ThreadLocal<WeakReference<C1866a<ViewGroup, ArrayList<C20606h0>>>> f53212e = new ThreadLocal<>();

    /* renamed from: f */
    public static ArrayList<ViewGroup> f53213f = new ArrayList<>();

    /* renamed from: a */
    public C1866a<C20558d0, C20606h0> f53214a = new C1866a<>();

    /* renamed from: b */
    public C1866a<C20558d0, C1866a<C20558d0, C20606h0>> f53215b = new C1866a<>();

    /* renamed from: androidx.transition.k0$a */
    public static class C20630a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        public C20606h0 f53216a;

        /* renamed from: b */
        public ViewGroup f53217b;

        /* renamed from: androidx.transition.k0$a$a */
        public class C20631a extends C20626j0 {

            /* renamed from: a */
            public final /* synthetic */ C1866a f53218a;

            public C20631a(C1866a aVar) {
                this.f53218a = aVar;
            }

            /* renamed from: d */
            public void mo61667d(@C0359n0 C20606h0 h0Var) {
                ((ArrayList) this.f53218a.get(C20630a.this.f53217b)).remove(h0Var);
                h0Var.mo61767z0(this);
            }
        }

        public C20630a(C20606h0 h0Var, ViewGroup viewGroup) {
            this.f53216a = h0Var;
            this.f53217b = viewGroup;
        }

        /* renamed from: a */
        public final void mo61818a() {
            this.f53217b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f53217b.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            mo61818a();
            if (!C20629k0.f53213f.remove(this.f53217b)) {
                return true;
            }
            C1866a<ViewGroup, ArrayList<C20606h0>> e = C20629k0.m95935e();
            ArrayList arrayList = e.get(this.f53217b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                e.put(this.f53217b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f53216a);
            this.f53216a.mo61737b(new C20631a(e));
            this.f53216a.mo61759t(this.f53217b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C20606h0) it.next()).mo61709G0(this.f53217b);
                }
            }
            this.f53216a.mo61766y0(this.f53217b);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            mo61818a();
            C20629k0.f53213f.remove(this.f53217b);
            ArrayList arrayList = C20629k0.m95935e().get(this.f53217b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C20606h0) it.next()).mo61709G0(this.f53217b);
                }
            }
            this.f53216a.mo61761u(true);
        }
    }

    /* renamed from: a */
    public static void m95931a(@C0359n0 ViewGroup viewGroup) {
        m95932b(viewGroup, (C20606h0) null);
    }

    /* renamed from: b */
    public static void m95932b(@C0359n0 ViewGroup viewGroup, @C0363p0 C20606h0 h0Var) {
        if (!f53213f.contains(viewGroup) && C18196h2.m82539U0(viewGroup)) {
            f53213f.add(viewGroup);
            if (h0Var == null) {
                h0Var = f53211d;
            }
            C20606h0 v = h0Var.clone();
            m95939j(viewGroup, v);
            C20558d0.m95702g(viewGroup, (C20558d0) null);
            m95938i(viewGroup, v);
        }
    }

    /* renamed from: c */
    public static void m95933c(C20558d0 d0Var, C20606h0 h0Var) {
        ViewGroup e = d0Var.mo61626e();
        if (!f53213f.contains(e)) {
            C20558d0 c = C20558d0.m95700c(e);
            if (h0Var == null) {
                if (c != null) {
                    c.mo61625b();
                }
                d0Var.mo61624a();
                return;
            }
            f53213f.add(e);
            C20606h0 v = h0Var.clone();
            if (c != null && c.mo61627f()) {
                v.mo61715J0(true);
            }
            m95939j(e, v);
            d0Var.mo61624a();
            m95938i(e, v);
        }
    }

    /* renamed from: d */
    public static void m95934d(ViewGroup viewGroup) {
        f53213f.remove(viewGroup);
        ArrayList arrayList = m95935e().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((C20606h0) arrayList2.get(size)).mo61721O(viewGroup);
            }
        }
    }

    /* renamed from: e */
    public static C1866a<ViewGroup, ArrayList<C20606h0>> m95935e() {
        C1866a<ViewGroup, ArrayList<C20606h0>> aVar;
        WeakReference weakReference = f53212e.get();
        if (weakReference != null && (aVar = (C1866a) weakReference.get()) != null) {
            return aVar;
        }
        C1866a<ViewGroup, ArrayList<C20606h0>> aVar2 = new C1866a<>();
        f53212e.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: g */
    public static void m95936g(@C0359n0 C20558d0 d0Var) {
        m95933c(d0Var, f53211d);
    }

    /* renamed from: h */
    public static void m95937h(@C0359n0 C20558d0 d0Var, @C0363p0 C20606h0 h0Var) {
        m95933c(d0Var, h0Var);
    }

    /* renamed from: i */
    public static void m95938i(ViewGroup viewGroup, C20606h0 h0Var) {
        if (h0Var != null && viewGroup != null) {
            C20630a aVar = new C20630a(h0Var, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: j */
    public static void m95939j(ViewGroup viewGroup, C20606h0 h0Var) {
        ArrayList arrayList = m95935e().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C20606h0) it.next()).mo61765x0(viewGroup);
            }
        }
        if (h0Var != null) {
            h0Var.mo61759t(viewGroup, true);
        }
        C20558d0 c = C20558d0.m95700c(viewGroup);
        if (c != null) {
            c.mo61625b();
        }
    }

    /* renamed from: f */
    public final C20606h0 mo61814f(C20558d0 d0Var) {
        C20558d0 c;
        C1866a aVar;
        C20606h0 h0Var;
        ViewGroup e = d0Var.mo61626e();
        if (e != null && (c = C20558d0.m95700c(e)) != null && (aVar = this.f53215b.get(d0Var)) != null && (h0Var = (C20606h0) aVar.get(c)) != null) {
            return h0Var;
        }
        C20606h0 h0Var2 = this.f53214a.get(d0Var);
        if (h0Var2 != null) {
            return h0Var2;
        }
        return f53211d;
    }

    /* renamed from: k */
    public void mo61815k(@C0359n0 C20558d0 d0Var, @C0359n0 C20558d0 d0Var2, @C0363p0 C20606h0 h0Var) {
        C1866a aVar = this.f53215b.get(d0Var2);
        if (aVar == null) {
            aVar = new C1866a();
            this.f53215b.put(d0Var2, aVar);
        }
        aVar.put(d0Var, h0Var);
    }

    /* renamed from: l */
    public void mo61816l(@C0359n0 C20558d0 d0Var, @C0363p0 C20606h0 h0Var) {
        this.f53214a.put(d0Var, h0Var);
    }

    /* renamed from: m */
    public void mo61817m(@C0359n0 C20558d0 d0Var) {
        m95933c(d0Var, mo61814f(d0Var));
    }
}
