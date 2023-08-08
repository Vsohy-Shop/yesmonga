package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.core.p027os.C17781e;
import java.util.ArrayList;
import java.util.List;

@C0376v0(21)
/* renamed from: androidx.fragment.app.k0 */
public class C19243k0 extends C19251l0 {

    /* renamed from: androidx.fragment.app.k0$a */
    public class C19244a extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f49529a;

        public C19244a(Rect rect) {
            this.f49529a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f49529a;
        }
    }

    /* renamed from: androidx.fragment.app.k0$b */
    public class C19245b implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ View f49531a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f49532b;

        public C19245b(View view, ArrayList arrayList) {
            this.f49531a = view;
            this.f49532b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            C19249f.m90281b(transition, this);
            this.f49531a.setVisibility(8);
            int size = this.f49532b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f49532b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            C19249f.m90281b(transition, this);
            C19249f.m90280a(transition, this);
        }
    }

    /* renamed from: androidx.fragment.app.k0$c */
    public class C19246c implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Object f49534a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f49535b;

        /* renamed from: c */
        public final /* synthetic */ Object f49536c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f49537d;

        /* renamed from: e */
        public final /* synthetic */ Object f49538e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f49539f;

        public C19246c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f49534a = obj;
            this.f49535b = arrayList;
            this.f49536c = obj2;
            this.f49537d = arrayList2;
            this.f49538e = obj3;
            this.f49539f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            C19249f.m90281b(transition, this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f49534a;
            if (obj != null) {
                C19243k0.this.mo57283n(obj, this.f49535b, (ArrayList<View>) null);
            }
            Object obj2 = this.f49536c;
            if (obj2 != null) {
                C19243k0.this.mo57283n(obj2, this.f49537d, (ArrayList<View>) null);
            }
            Object obj3 = this.f49538e;
            if (obj3 != null) {
                C19243k0.this.mo57283n(obj3, this.f49539f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.k0$d */
    public class C19247d implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Runnable f49541a;

        public C19247d(Runnable runnable) {
            this.f49541a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f49541a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.k0$e */
    public class C19248e extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f49543a;

        public C19248e(Rect rect) {
            this.f49543a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f49543a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f49543a;
        }
    }

    @C0376v0(19)
    /* renamed from: androidx.fragment.app.k0$f */
    public static class C19249f {
        /* renamed from: a */
        public static void m90280a(@C0359n0 Transition transition, @C0359n0 Transition.TransitionListener transitionListener) {
            transition.addListener(transitionListener);
        }

        /* renamed from: b */
        public static void m90281b(@C0359n0 Transition transition, @C0359n0 Transition.TransitionListener transitionListener) {
            transition.removeListener(transitionListener);
        }
    }

    /* renamed from: x */
    public static boolean m90262x(Transition transition) {
        if (!C19251l0.m90288i(transition.getTargetIds()) || !C19251l0.m90288i(transition.getTargetNames()) || !C19251l0.m90288i(transition.getTargetTypes())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo57275a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public void mo57276b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo57276b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m90262x(transition) && C19251l0.m90288i(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo57277c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: e */
    public boolean mo57278e(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: f */
    public Object mo57279f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: j */
    public Object mo57280j(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: k */
    public Object mo57281k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: m */
    public void mo57282m(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: n */
    public void mo57283n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo57283n(transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m90262x(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i = 0;
            } else {
                i = arrayList2.size();
            }
            while (i2 < i) {
                transition.addTarget(arrayList2.get(i2));
                i2++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget(arrayList.get(size));
            }
        }
    }

    /* renamed from: o */
    public void mo57284o(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C19245b(view, arrayList));
    }

    /* renamed from: p */
    public void mo57285p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C19246c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: q */
    public void mo57286q(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C19248e(rect));
        }
    }

    /* renamed from: r */
    public void mo57287r(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo57309h(view, rect);
            ((Transition) obj).setEpicenterCallback(new C19244a(rect));
        }
    }

    /* renamed from: s */
    public void mo57288s(@C0359n0 Fragment fragment, @C0359n0 Object obj, @C0359n0 C17781e eVar, @C0359n0 Runnable runnable) {
        ((Transition) obj).addListener(new C19247d(runnable));
    }

    /* renamed from: u */
    public void mo57289u(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C19251l0.m90286d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo57276b(transitionSet, arrayList);
    }

    /* renamed from: v */
    public void mo57290v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo57283n(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: w */
    public Object mo57291w(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
