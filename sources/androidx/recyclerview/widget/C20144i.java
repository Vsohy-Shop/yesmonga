package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.C0359n0;
import androidx.core.view.C18196h2;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: androidx.recyclerview.widget.i */
public class C20144i extends C20108c0 {

    /* renamed from: A */
    public static TimeInterpolator f51830A = null;

    /* renamed from: z */
    public static final boolean f51831z = false;

    /* renamed from: o */
    public ArrayList<RecyclerView.C20061e0> f51832o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<RecyclerView.C20061e0> f51833p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<C20154j> f51834q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<C20153i> f51835r = new ArrayList<>();

    /* renamed from: s */
    public ArrayList<ArrayList<RecyclerView.C20061e0>> f51836s = new ArrayList<>();

    /* renamed from: t */
    public ArrayList<ArrayList<C20154j>> f51837t = new ArrayList<>();

    /* renamed from: u */
    public ArrayList<ArrayList<C20153i>> f51838u = new ArrayList<>();

    /* renamed from: v */
    public ArrayList<RecyclerView.C20061e0> f51839v = new ArrayList<>();

    /* renamed from: w */
    public ArrayList<RecyclerView.C20061e0> f51840w = new ArrayList<>();

    /* renamed from: x */
    public ArrayList<RecyclerView.C20061e0> f51841x = new ArrayList<>();

    /* renamed from: y */
    public ArrayList<RecyclerView.C20061e0> f51842y = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.i$a */
    public class C20145a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f51843a;

        public C20145a(ArrayList arrayList) {
            this.f51843a = arrayList;
        }

        public void run() {
            Iterator it = this.f51843a.iterator();
            while (it.hasNext()) {
                C20154j jVar = (C20154j) it.next();
                C20144i.this.mo60429b0(jVar.f51877a, jVar.f51878b, jVar.f51879c, jVar.f51880d, jVar.f51881e);
            }
            this.f51843a.clear();
            C20144i.this.f51837t.remove(this.f51843a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$b */
    public class C20146b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f51845a;

        public C20146b(ArrayList arrayList) {
            this.f51845a = arrayList;
        }

        public void run() {
            Iterator it = this.f51845a.iterator();
            while (it.hasNext()) {
                C20144i.this.mo60428a0((C20153i) it.next());
            }
            this.f51845a.clear();
            C20144i.this.f51838u.remove(this.f51845a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$c */
    public class C20147c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f51847a;

        public C20147c(ArrayList arrayList) {
            this.f51847a = arrayList;
        }

        public void run() {
            Iterator it = this.f51847a.iterator();
            while (it.hasNext()) {
                C20144i.this.mo60427Z((RecyclerView.C20061e0) it.next());
            }
            this.f51847a.clear();
            C20144i.this.f51836s.remove(this.f51847a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$d */
    public class C20148d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.C20061e0 f51849a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f51850b;

        /* renamed from: c */
        public final /* synthetic */ View f51851c;

        public C20148d(RecyclerView.C20061e0 e0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f51849a = e0Var;
            this.f51850b = viewPropertyAnimator;
            this.f51851c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f51850b.setListener((Animator.AnimatorListener) null);
            this.f51851c.setAlpha(1.0f);
            C20144i.this.mo60250N(this.f51849a);
            C20144i.this.f51841x.remove(this.f51849a);
            C20144i.this.mo60432e0();
        }

        public void onAnimationStart(Animator animator) {
            C20144i.this.mo60251O(this.f51849a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$e */
    public class C20149e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.C20061e0 f51853a;

        /* renamed from: b */
        public final /* synthetic */ View f51854b;

        /* renamed from: c */
        public final /* synthetic */ ViewPropertyAnimator f51855c;

        public C20149e(RecyclerView.C20061e0 e0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f51853a = e0Var;
            this.f51854b = view;
            this.f51855c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f51854b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f51855c.setListener((Animator.AnimatorListener) null);
            C20144i.this.mo60244H(this.f51853a);
            C20144i.this.f51839v.remove(this.f51853a);
            C20144i.this.mo60432e0();
        }

        public void onAnimationStart(Animator animator) {
            C20144i.this.mo60245I(this.f51853a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$f */
    public class C20150f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.C20061e0 f51857a;

        /* renamed from: b */
        public final /* synthetic */ int f51858b;

        /* renamed from: c */
        public final /* synthetic */ View f51859c;

        /* renamed from: d */
        public final /* synthetic */ int f51860d;

        /* renamed from: e */
        public final /* synthetic */ ViewPropertyAnimator f51861e;

        public C20150f(RecyclerView.C20061e0 e0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f51857a = e0Var;
            this.f51858b = i;
            this.f51859c = view;
            this.f51860d = i2;
            this.f51861e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f51858b != 0) {
                this.f51859c.setTranslationX(0.0f);
            }
            if (this.f51860d != 0) {
                this.f51859c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f51861e.setListener((Animator.AnimatorListener) null);
            C20144i.this.mo60248L(this.f51857a);
            C20144i.this.f51840w.remove(this.f51857a);
            C20144i.this.mo60432e0();
        }

        public void onAnimationStart(Animator animator) {
            C20144i.this.mo60249M(this.f51857a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$g */
    public class C20151g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C20153i f51863a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f51864b;

        /* renamed from: c */
        public final /* synthetic */ View f51865c;

        public C20151g(C20153i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f51863a = iVar;
            this.f51864b = viewPropertyAnimator;
            this.f51865c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f51864b.setListener((Animator.AnimatorListener) null);
            this.f51865c.setAlpha(1.0f);
            this.f51865c.setTranslationX(0.0f);
            this.f51865c.setTranslationY(0.0f);
            C20144i.this.mo60246J(this.f51863a.f51871a, true);
            C20144i.this.f51842y.remove(this.f51863a.f51871a);
            C20144i.this.mo60432e0();
        }

        public void onAnimationStart(Animator animator) {
            C20144i.this.mo60247K(this.f51863a.f51871a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$h */
    public class C20152h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C20153i f51867a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f51868b;

        /* renamed from: c */
        public final /* synthetic */ View f51869c;

        public C20152h(C20153i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f51867a = iVar;
            this.f51868b = viewPropertyAnimator;
            this.f51869c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f51868b.setListener((Animator.AnimatorListener) null);
            this.f51869c.setAlpha(1.0f);
            this.f51869c.setTranslationX(0.0f);
            this.f51869c.setTranslationY(0.0f);
            C20144i.this.mo60246J(this.f51867a.f51872b, false);
            C20144i.this.f51842y.remove(this.f51867a.f51872b);
            C20144i.this.mo60432e0();
        }

        public void onAnimationStart(Animator animator) {
            C20144i.this.mo60247K(this.f51867a.f51872b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$j */
    public static class C20154j {

        /* renamed from: a */
        public RecyclerView.C20061e0 f51877a;

        /* renamed from: b */
        public int f51878b;

        /* renamed from: c */
        public int f51879c;

        /* renamed from: d */
        public int f51880d;

        /* renamed from: e */
        public int f51881e;

        public C20154j(RecyclerView.C20061e0 e0Var, int i, int i2, int i3, int i4) {
            this.f51877a = e0Var;
            this.f51878b = i;
            this.f51879c = i2;
            this.f51880d = i3;
            this.f51881e = i4;
        }
    }

    /* renamed from: D */
    public boolean mo60240D(RecyclerView.C20061e0 e0Var) {
        mo60436i0(e0Var);
        e0Var.itemView.setAlpha(0.0f);
        this.f51833p.add(e0Var);
        return true;
    }

    /* renamed from: E */
    public boolean mo60241E(RecyclerView.C20061e0 e0Var, RecyclerView.C20061e0 e0Var2, int i, int i2, int i3, int i4) {
        if (e0Var == e0Var2) {
            return mo60242F(e0Var, i, i2, i3, i4);
        }
        float translationX = e0Var.itemView.getTranslationX();
        float translationY = e0Var.itemView.getTranslationY();
        float alpha = e0Var.itemView.getAlpha();
        mo60436i0(e0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        e0Var.itemView.setTranslationX(translationX);
        e0Var.itemView.setTranslationY(translationY);
        e0Var.itemView.setAlpha(alpha);
        if (e0Var2 != null) {
            mo60436i0(e0Var2);
            e0Var2.itemView.setTranslationX((float) (-i5));
            e0Var2.itemView.setTranslationY((float) (-i6));
            e0Var2.itemView.setAlpha(0.0f);
        }
        this.f51835r.add(new C20153i(e0Var, e0Var2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: F */
    public boolean mo60242F(RecyclerView.C20061e0 e0Var, int i, int i2, int i3, int i4) {
        View view = e0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) e0Var.itemView.getTranslationY());
        mo60436i0(e0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo60248L(e0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f51834q.add(new C20154j(e0Var, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: G */
    public boolean mo60243G(RecyclerView.C20061e0 e0Var) {
        mo60436i0(e0Var);
        this.f51832o.add(e0Var);
        return true;
    }

    /* renamed from: Z */
    public void mo60427Z(RecyclerView.C20061e0 e0Var) {
        View view = e0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f51839v.add(e0Var);
        animate.alpha(1.0f).setDuration(mo59844m()).setListener(new C20149e(e0Var, view, animate)).start();
    }

    /* renamed from: a0 */
    public void mo60428a0(C20153i iVar) {
        View view;
        RecyclerView.C20061e0 e0Var = iVar.f51871a;
        View view2 = null;
        if (e0Var == null) {
            view = null;
        } else {
            view = e0Var.itemView;
        }
        RecyclerView.C20061e0 e0Var2 = iVar.f51872b;
        if (e0Var2 != null) {
            view2 = e0Var2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(mo59845n());
            this.f51842y.add(iVar.f51871a);
            duration.translationX((float) (iVar.f51875e - iVar.f51873c));
            duration.translationY((float) (iVar.f51876f - iVar.f51874d));
            duration.alpha(0.0f).setListener(new C20151g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f51842y.add(iVar.f51872b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo59845n()).alpha(1.0f).setListener(new C20152h(iVar, animate, view2)).start();
        }
    }

    /* renamed from: b0 */
    public void mo60429b0(RecyclerView.C20061e0 e0Var, int i, int i2, int i3, int i4) {
        View view = e0Var.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f51840w.add(e0Var);
        animate.setDuration(mo59846o()).setListener(new C20150f(e0Var, i5, view, i6, animate)).start();
    }

    /* renamed from: c0 */
    public final void mo60430c0(RecyclerView.C20061e0 e0Var) {
        View view = e0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f51841x.add(e0Var);
        animate.setDuration(mo59847p()).alpha(0.0f).setListener(new C20148d(e0Var, animate, view)).start();
    }

    /* renamed from: d0 */
    public void mo60431d0(List<RecyclerView.C20061e0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    /* renamed from: e0 */
    public void mo60432e0() {
        if (!mo59848q()) {
            mo59841j();
        }
    }

    /* renamed from: f0 */
    public final void mo60433f0(List<C20153i> list, RecyclerView.C20061e0 e0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C20153i iVar = list.get(size);
            if (mo60435h0(iVar, e0Var) && iVar.f51871a == null && iVar.f51872b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: g */
    public boolean mo59838g(@C0359n0 RecyclerView.C20061e0 e0Var, @C0359n0 List<Object> list) {
        return !list.isEmpty() || super.mo59838g(e0Var, list);
    }

    /* renamed from: g0 */
    public final void mo60434g0(C20153i iVar) {
        RecyclerView.C20061e0 e0Var = iVar.f51871a;
        if (e0Var != null) {
            mo60435h0(iVar, e0Var);
        }
        RecyclerView.C20061e0 e0Var2 = iVar.f51872b;
        if (e0Var2 != null) {
            mo60435h0(iVar, e0Var2);
        }
    }

    /* renamed from: h0 */
    public final boolean mo60435h0(C20153i iVar, RecyclerView.C20061e0 e0Var) {
        boolean z = false;
        if (iVar.f51872b == e0Var) {
            iVar.f51872b = null;
        } else if (iVar.f51871a != e0Var) {
            return false;
        } else {
            iVar.f51871a = null;
            z = true;
        }
        e0Var.itemView.setAlpha(1.0f);
        e0Var.itemView.setTranslationX(0.0f);
        e0Var.itemView.setTranslationY(0.0f);
        mo60246J(e0Var, z);
        return true;
    }

    /* renamed from: i0 */
    public final void mo60436i0(RecyclerView.C20061e0 e0Var) {
        if (f51830A == null) {
            f51830A = new ValueAnimator().getInterpolator();
        }
        e0Var.itemView.animate().setInterpolator(f51830A);
        mo59842k(e0Var);
    }

    /* renamed from: k */
    public void mo59842k(RecyclerView.C20061e0 e0Var) {
        View view = e0Var.itemView;
        view.animate().cancel();
        int size = this.f51834q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f51834q.get(size).f51877a == e0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo60248L(e0Var);
                this.f51834q.remove(size);
            }
        }
        mo60433f0(this.f51835r, e0Var);
        if (this.f51832o.remove(e0Var)) {
            view.setAlpha(1.0f);
            mo60250N(e0Var);
        }
        if (this.f51833p.remove(e0Var)) {
            view.setAlpha(1.0f);
            mo60244H(e0Var);
        }
        for (int size2 = this.f51838u.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f51838u.get(size2);
            mo60433f0(arrayList, e0Var);
            if (arrayList.isEmpty()) {
                this.f51838u.remove(size2);
            }
        }
        for (int size3 = this.f51837t.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f51837t.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C20154j) arrayList2.get(size4)).f51877a == e0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo60248L(e0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f51837t.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f51836s.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f51836s.get(size5);
            if (arrayList3.remove(e0Var)) {
                view.setAlpha(1.0f);
                mo60244H(e0Var);
                if (arrayList3.isEmpty()) {
                    this.f51836s.remove(size5);
                }
            }
        }
        this.f51841x.remove(e0Var);
        this.f51839v.remove(e0Var);
        this.f51842y.remove(e0Var);
        this.f51840w.remove(e0Var);
        mo60432e0();
    }

    /* renamed from: l */
    public void mo59843l() {
        int size = this.f51834q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C20154j jVar = this.f51834q.get(size);
            View view = jVar.f51877a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo60248L(jVar.f51877a);
            this.f51834q.remove(size);
        }
        for (int size2 = this.f51832o.size() - 1; size2 >= 0; size2--) {
            mo60250N(this.f51832o.get(size2));
            this.f51832o.remove(size2);
        }
        int size3 = this.f51833p.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C20061e0 e0Var = this.f51833p.get(size3);
            e0Var.itemView.setAlpha(1.0f);
            mo60244H(e0Var);
            this.f51833p.remove(size3);
        }
        for (int size4 = this.f51835r.size() - 1; size4 >= 0; size4--) {
            mo60434g0(this.f51835r.get(size4));
        }
        this.f51835r.clear();
        if (mo59848q()) {
            for (int size5 = this.f51837t.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f51837t.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C20154j jVar2 = (C20154j) arrayList.get(size6);
                    View view2 = jVar2.f51877a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo60248L(jVar2.f51877a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f51837t.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f51836s.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f51836s.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C20061e0 e0Var2 = (RecyclerView.C20061e0) arrayList2.get(size8);
                    e0Var2.itemView.setAlpha(1.0f);
                    mo60244H(e0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f51836s.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f51838u.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f51838u.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    mo60434g0((C20153i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f51838u.remove(arrayList3);
                    }
                }
            }
            mo60431d0(this.f51841x);
            mo60431d0(this.f51840w);
            mo60431d0(this.f51839v);
            mo60431d0(this.f51842y);
            mo59841j();
        }
    }

    /* renamed from: q */
    public boolean mo59848q() {
        if (!this.f51833p.isEmpty() || !this.f51835r.isEmpty() || !this.f51834q.isEmpty() || !this.f51832o.isEmpty() || !this.f51840w.isEmpty() || !this.f51841x.isEmpty() || !this.f51839v.isEmpty() || !this.f51842y.isEmpty() || !this.f51837t.isEmpty() || !this.f51836s.isEmpty() || !this.f51838u.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public void mo59855x() {
        long j;
        long j2;
        boolean z = !this.f51832o.isEmpty();
        boolean z2 = !this.f51834q.isEmpty();
        boolean z3 = !this.f51835r.isEmpty();
        boolean z4 = !this.f51833p.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C20061e0> it = this.f51832o.iterator();
            while (it.hasNext()) {
                mo60430c0(it.next());
            }
            this.f51832o.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f51834q);
                this.f51837t.add(arrayList);
                this.f51834q.clear();
                C20145a aVar = new C20145a(arrayList);
                if (z) {
                    C18196h2.m82622q1(((C20154j) arrayList.get(0)).f51877a.itemView, aVar, mo59847p());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f51835r);
                this.f51838u.add(arrayList2);
                this.f51835r.clear();
                C20146b bVar = new C20146b(arrayList2);
                if (z) {
                    C18196h2.m82622q1(((C20153i) arrayList2.get(0)).f51871a.itemView, bVar, mo59847p());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f51833p);
                this.f51836s.add(arrayList3);
                this.f51833p.clear();
                C20147c cVar = new C20147c(arrayList3);
                if (z || z2 || z3) {
                    long j3 = 0;
                    if (z) {
                        j = mo59847p();
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = mo59846o();
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j3 = mo59845n();
                    }
                    C18196h2.m82622q1(((RecyclerView.C20061e0) arrayList3.get(0)).itemView, cVar, j + Math.max(j2, j3));
                    return;
                }
                cVar.run();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$i */
    public static class C20153i {

        /* renamed from: a */
        public RecyclerView.C20061e0 f51871a;

        /* renamed from: b */
        public RecyclerView.C20061e0 f51872b;

        /* renamed from: c */
        public int f51873c;

        /* renamed from: d */
        public int f51874d;

        /* renamed from: e */
        public int f51875e;

        /* renamed from: f */
        public int f51876f;

        public C20153i(RecyclerView.C20061e0 e0Var, RecyclerView.C20061e0 e0Var2) {
            this.f51871a = e0Var;
            this.f51872b = e0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f51871a + ", newHolder=" + this.f51872b + ", fromX=" + this.f51873c + ", fromY=" + this.f51874d + ", toX=" + this.f51875e + ", toY=" + this.f51876f + C12361b.f30259j;
        }

        public C20153i(RecyclerView.C20061e0 e0Var, RecyclerView.C20061e0 e0Var2, int i, int i2, int i3, int i4) {
            this(e0Var, e0Var2);
            this.f51873c = i;
            this.f51874d = i2;
            this.f51875e = i3;
            this.f51876f = i4;
        }
    }
}
