package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1866a;
import androidx.core.app.C17052c6;
import androidx.core.p027os.C17781e;
import androidx.core.util.C18001r;
import androidx.core.view.C18024a2;
import androidx.core.view.C18196h2;
import androidx.core.view.C18365s3;
import androidx.fragment.app.C19236i;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.b */
public class C19199b extends SpecialEffectsController {

    /* renamed from: androidx.fragment.app.b$a */
    public static /* synthetic */ class C19200a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49369a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f49369a = r0
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f49369a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f49369a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f49369a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C19199b.C19200a.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.b$b */
    public class C19201b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f49370a;

        /* renamed from: b */
        public final /* synthetic */ SpecialEffectsController.Operation f49371b;

        public C19201b(List list, SpecialEffectsController.Operation operation) {
            this.f49370a = list;
            this.f49371b = operation;
        }

        public void run() {
            if (this.f49370a.contains(this.f49371b)) {
                this.f49370a.remove(this.f49371b);
                C19199b.this.mo57060s(this.f49371b);
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$c */
    public class C19202c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f49373a;

        /* renamed from: b */
        public final /* synthetic */ View f49374b;

        /* renamed from: c */
        public final /* synthetic */ boolean f49375c;

        /* renamed from: d */
        public final /* synthetic */ SpecialEffectsController.Operation f49376d;

        /* renamed from: e */
        public final /* synthetic */ C19211k f49377e;

        public C19202c(ViewGroup viewGroup, View view, boolean z, SpecialEffectsController.Operation operation, C19211k kVar) {
            this.f49373a = viewGroup;
            this.f49374b = view;
            this.f49375c = z;
            this.f49376d = operation;
            this.f49377e = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f49373a.endViewTransition(this.f49374b);
            if (this.f49375c) {
                this.f49376d.mo57025e().mo57034b(this.f49374b);
            }
            this.f49377e.mo57078a();
            if (FragmentManager.m89694W0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(this.f49376d);
                sb.append(" has ended.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$d */
    public class C19203d implements C17781e.C17783b {

        /* renamed from: a */
        public final /* synthetic */ Animator f49379a;

        /* renamed from: b */
        public final /* synthetic */ SpecialEffectsController.Operation f49380b;

        public C19203d(Animator animator, SpecialEffectsController.Operation operation) {
            this.f49379a = animator;
            this.f49380b = operation;
        }

        public void onCancel() {
            this.f49379a.end();
            if (FragmentManager.m89694W0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(this.f49380b);
                sb.append(" has been canceled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$e */
    public class C19204e implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ SpecialEffectsController.Operation f49382a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f49383b;

        /* renamed from: c */
        public final /* synthetic */ View f49384c;

        /* renamed from: d */
        public final /* synthetic */ C19211k f49385d;

        /* renamed from: androidx.fragment.app.b$e$a */
        public class C19205a implements Runnable {
            public C19205a() {
            }

            public void run() {
                C19204e eVar = C19204e.this;
                eVar.f49383b.endViewTransition(eVar.f49384c);
                C19204e.this.f49385d.mo57078a();
            }
        }

        public C19204e(SpecialEffectsController.Operation operation, ViewGroup viewGroup, View view, C19211k kVar) {
            this.f49382a = operation;
            this.f49383b = viewGroup;
            this.f49384c = view;
            this.f49385d = kVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f49383b.post(new C19205a());
            if (FragmentManager.m89694W0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animation from operation ");
                sb.append(this.f49382a);
                sb.append(" has ended.");
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            if (FragmentManager.m89694W0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animation from operation ");
                sb.append(this.f49382a);
                sb.append(" has reached onAnimationStart.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$f */
    public class C19206f implements C17781e.C17783b {

        /* renamed from: a */
        public final /* synthetic */ View f49388a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f49389b;

        /* renamed from: c */
        public final /* synthetic */ C19211k f49390c;

        /* renamed from: d */
        public final /* synthetic */ SpecialEffectsController.Operation f49391d;

        public C19206f(View view, ViewGroup viewGroup, C19211k kVar, SpecialEffectsController.Operation operation) {
            this.f49388a = view;
            this.f49389b = viewGroup;
            this.f49390c = kVar;
            this.f49391d = operation;
        }

        public void onCancel() {
            this.f49388a.clearAnimation();
            this.f49389b.endViewTransition(this.f49388a);
            this.f49390c.mo57078a();
            if (FragmentManager.m89694W0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animation from operation ");
                sb.append(this.f49391d);
                sb.append(" has been cancelled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$g */
    public class C19207g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ SpecialEffectsController.Operation f49393a;

        /* renamed from: b */
        public final /* synthetic */ SpecialEffectsController.Operation f49394b;

        /* renamed from: c */
        public final /* synthetic */ boolean f49395c;

        /* renamed from: d */
        public final /* synthetic */ C1866a f49396d;

        public C19207g(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z, C1866a aVar) {
            this.f49393a = operation;
            this.f49394b = operation2;
            this.f49395c = z;
            this.f49396d = aVar;
        }

        public void run() {
            C19241j0.m90214a(this.f49393a.mo57026f(), this.f49394b.mo57026f(), this.f49395c, this.f49396d, false);
        }
    }

    /* renamed from: androidx.fragment.app.b$h */
    public class C19208h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C19251l0 f49398a;

        /* renamed from: b */
        public final /* synthetic */ View f49399b;

        /* renamed from: c */
        public final /* synthetic */ Rect f49400c;

        public C19208h(C19251l0 l0Var, View view, Rect rect) {
            this.f49398a = l0Var;
            this.f49399b = view;
            this.f49400c = rect;
        }

        public void run() {
            this.f49398a.mo57309h(this.f49399b, this.f49400c);
        }
    }

    /* renamed from: androidx.fragment.app.b$i */
    public class C19209i implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f49402a;

        public C19209i(ArrayList arrayList) {
            this.f49402a = arrayList;
        }

        public void run() {
            C19241j0.m90218e(this.f49402a, 4);
        }
    }

    /* renamed from: androidx.fragment.app.b$j */
    public class C19210j implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C19213m f49404a;

        /* renamed from: b */
        public final /* synthetic */ SpecialEffectsController.Operation f49405b;

        public C19210j(C19213m mVar, SpecialEffectsController.Operation operation) {
            this.f49404a = mVar;
            this.f49405b = operation;
        }

        public void run() {
            this.f49404a.mo57078a();
            if (FragmentManager.m89694W0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Transition for operation ");
                sb.append(this.f49405b);
                sb.append("has completed");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$k */
    public static class C19211k extends C19212l {

        /* renamed from: c */
        public boolean f49407c;

        /* renamed from: d */
        public boolean f49408d = false;
        @C0363p0

        /* renamed from: e */
        public C19236i.C19237a f49409e;

        public C19211k(@C0359n0 SpecialEffectsController.Operation operation, @C0359n0 C17781e eVar, boolean z) {
            super(operation, eVar);
            this.f49407c = z;
        }

        @C0363p0
        /* renamed from: e */
        public C19236i.C19237a mo57077e(@C0359n0 Context context) {
            boolean z;
            if (this.f49408d) {
                return this.f49409e;
            }
            Fragment f = mo57079b().mo57026f();
            if (mo57079b().mo57025e() == SpecialEffectsController.Operation.State.VISIBLE) {
                z = true;
            } else {
                z = false;
            }
            C19236i.C19237a b = C19236i.m90202b(context, f, z, this.f49407c);
            this.f49409e = b;
            this.f49408d = true;
            return b;
        }
    }

    /* renamed from: androidx.fragment.app.b$l */
    public static class C19212l {
        @C0359n0

        /* renamed from: a */
        public final SpecialEffectsController.Operation f49410a;
        @C0359n0

        /* renamed from: b */
        public final C17781e f49411b;

        public C19212l(@C0359n0 SpecialEffectsController.Operation operation, @C0359n0 C17781e eVar) {
            this.f49410a = operation;
            this.f49411b = eVar;
        }

        /* renamed from: a */
        public void mo57078a() {
            this.f49410a.mo57024d(this.f49411b);
        }

        @C0359n0
        /* renamed from: b */
        public SpecialEffectsController.Operation mo57079b() {
            return this.f49410a;
        }

        @C0359n0
        /* renamed from: c */
        public C17781e mo57080c() {
            return this.f49411b;
        }

        /* renamed from: d */
        public boolean mo57081d() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State q = SpecialEffectsController.Operation.State.m89971q(this.f49410a.mo57026f().mView);
            SpecialEffectsController.Operation.State e = this.f49410a.mo57025e();
            if (q == e || (q != (state = SpecialEffectsController.Operation.State.VISIBLE) && e != state)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.fragment.app.b$m */
    public static class C19213m extends C19212l {
        @C0363p0

        /* renamed from: c */
        public final Object f49412c;

        /* renamed from: d */
        public final boolean f49413d;
        @C0363p0

        /* renamed from: e */
        public final Object f49414e;

        public C19213m(@C0359n0 SpecialEffectsController.Operation operation, @C0359n0 C17781e eVar, boolean z, boolean z2) {
            super(operation, eVar);
            Object obj;
            Object obj2;
            boolean z3;
            if (operation.mo57025e() == SpecialEffectsController.Operation.State.VISIBLE) {
                if (z) {
                    obj2 = operation.mo57026f().getReenterTransition();
                } else {
                    obj2 = operation.mo57026f().getEnterTransition();
                }
                this.f49412c = obj2;
                if (z) {
                    z3 = operation.mo57026f().getAllowReturnTransitionOverlap();
                } else {
                    z3 = operation.mo57026f().getAllowEnterTransitionOverlap();
                }
                this.f49413d = z3;
            } else {
                if (z) {
                    obj = operation.mo57026f().getReturnTransition();
                } else {
                    obj = operation.mo57026f().getExitTransition();
                }
                this.f49412c = obj;
                this.f49413d = true;
            }
            if (!z2) {
                this.f49414e = null;
            } else if (z) {
                this.f49414e = operation.mo57026f().getSharedElementReturnTransition();
            } else {
                this.f49414e = operation.mo57026f().getSharedElementEnterTransition();
            }
        }

        @C0363p0
        /* renamed from: e */
        public C19251l0 mo57082e() {
            C19251l0 f = mo57083f(this.f49412c);
            C19251l0 f2 = mo57083f(this.f49414e);
            if (f != null && f2 != null && f != f2) {
                throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mo57079b().mo57026f() + " returned Transition " + this.f49412c + " which uses a different Transition  type than its shared element transition " + this.f49414e);
            } else if (f != null) {
                return f;
            } else {
                return f2;
            }
        }

        @C0363p0
        /* renamed from: f */
        public final C19251l0 mo57083f(Object obj) {
            if (obj == null) {
                return null;
            }
            C19251l0 l0Var = C19241j0.f49526a;
            if (l0Var != null && l0Var.mo57278e(obj)) {
                return l0Var;
            }
            C19251l0 l0Var2 = C19241j0.f49527b;
            if (l0Var2 != null && l0Var2.mo57278e(obj)) {
                return l0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + mo57079b().mo57026f() + " is not a valid framework Transition or AndroidX Transition");
        }

        @C0363p0
        /* renamed from: g */
        public Object mo57084g() {
            return this.f49414e;
        }

        @C0363p0
        /* renamed from: h */
        public Object mo57085h() {
            return this.f49412c;
        }

        /* renamed from: i */
        public boolean mo57086i() {
            return this.f49414e != null;
        }

        /* renamed from: j */
        public boolean mo57087j() {
            return this.f49413d;
        }
    }

    public C19199b(@C0359n0 ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: f */
    public void mo57010f(@C0359n0 List<SpecialEffectsController.Operation> list, boolean z) {
        SpecialEffectsController.Operation operation = null;
        SpecialEffectsController.Operation operation2 = null;
        for (SpecialEffectsController.Operation next : list) {
            SpecialEffectsController.Operation.State q = SpecialEffectsController.Operation.State.m89971q(next.mo57026f().mView);
            int i = C19200a.f49369a[next.mo57025e().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (q == SpecialEffectsController.Operation.State.VISIBLE && operation == null) {
                    operation = next;
                }
            } else if (i == 4 && q != SpecialEffectsController.Operation.State.VISIBLE) {
                operation2 = next;
            }
        }
        if (FragmentManager.m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Executing operations from ");
            sb.append(operation);
            sb.append(" to ");
            sb.append(operation2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<SpecialEffectsController.Operation> arrayList3 = new ArrayList<>(list);
        mo57066y(list);
        for (SpecialEffectsController.Operation next2 : list) {
            C17781e eVar = new C17781e();
            next2.mo57030j(eVar);
            arrayList.add(new C19211k(next2, eVar, z));
            C17781e eVar2 = new C17781e();
            next2.mo57030j(eVar2);
            boolean z2 = false;
            if (z) {
                if (next2 != operation) {
                    arrayList2.add(new C19213m(next2, eVar2, z, z2));
                    next2.mo57021a(new C19201b(arrayList3, next2));
                }
            } else if (next2 != operation2) {
                arrayList2.add(new C19213m(next2, eVar2, z, z2));
                next2.mo57021a(new C19201b(arrayList3, next2));
            }
            z2 = true;
            arrayList2.add(new C19213m(next2, eVar2, z, z2));
            next2.mo57021a(new C19201b(arrayList3, next2));
        }
        Map<SpecialEffectsController.Operation, Boolean> x = mo57065x(arrayList2, arrayList3, z, operation, operation2);
        mo57064w(arrayList, arrayList3, x.containsValue(Boolean.TRUE), x);
        for (SpecialEffectsController.Operation s : arrayList3) {
            mo57060s(s);
        }
        arrayList3.clear();
        if (FragmentManager.m89694W0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Completed executing operations from ");
            sb2.append(operation);
            sb2.append(" to ");
            sb2.append(operation2);
        }
    }

    /* renamed from: s */
    public void mo57060s(@C0359n0 SpecialEffectsController.Operation operation) {
        operation.mo57025e().mo57034b(operation.mo57026f().mView);
    }

    /* renamed from: t */
    public void mo57061t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!C18365s3.m83126c(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        mo57061t(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* renamed from: u */
    public void mo57062u(Map<String, View> map, @C0359n0 View view) {
        String x0 = C18196h2.m82649x0(view);
        if (x0 != null) {
            map.put(x0, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    mo57062u(map, childAt);
                }
            }
        }
    }

    /* renamed from: v */
    public void mo57063v(@C0359n0 C1866a<String, View> aVar, @C0359n0 Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C18196h2.m82649x0((View) it.next().getValue()))) {
                it.remove();
            }
        }
    }

    /* renamed from: w */
    public final void mo57064w(@C0359n0 List<C19211k> list, @C0359n0 List<SpecialEffectsController.Operation> list2, boolean z, @C0359n0 Map<SpecialEffectsController.Operation, Boolean> map) {
        int i;
        boolean z2;
        int i2;
        boolean z3;
        SpecialEffectsController.Operation operation;
        ViewGroup m = mo57017m();
        Context context = m.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator<C19211k> it = list.iterator();
        boolean z4 = false;
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            C19211k next = it.next();
            if (next.mo57081d()) {
                next.mo57078a();
            } else {
                C19236i.C19237a e = next.mo57077e(context);
                if (e == null) {
                    next.mo57078a();
                } else {
                    Animator animator = e.f49520b;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        SpecialEffectsController.Operation b = next.mo57079b();
                        Fragment f = b.mo57026f();
                        if (Boolean.TRUE.equals(map.get(b))) {
                            if (FragmentManager.m89694W0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Ignoring Animator set on ");
                                sb.append(f);
                                sb.append(" as this Fragment was involved in a Transition.");
                            }
                            next.mo57078a();
                        } else {
                            if (b.mo57025e() == SpecialEffectsController.Operation.State.GONE) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            List<SpecialEffectsController.Operation> list3 = list2;
                            if (z3) {
                                list3.remove(b);
                            }
                            View view = f.mView;
                            m.startViewTransition(view);
                            C19202c cVar = r0;
                            View view2 = view;
                            SpecialEffectsController.Operation operation2 = b;
                            C19202c cVar2 = new C19202c(m, view2, z3, b, next);
                            animator.addListener(cVar);
                            animator.setTarget(view2);
                            animator.start();
                            if (FragmentManager.m89694W0(2)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Animator from operation ");
                                operation = operation2;
                                sb2.append(operation);
                                sb2.append(" has started.");
                            } else {
                                operation = operation2;
                            }
                            next.mo57080c().mo52222d(new C19203d(animator, operation));
                            z4 = true;
                        }
                    }
                }
            }
            Map<SpecialEffectsController.Operation, Boolean> map2 = map;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19211k kVar = (C19211k) it2.next();
            SpecialEffectsController.Operation b2 = kVar.mo57079b();
            Fragment f2 = b2.mo57026f();
            if (z) {
                if (FragmentManager.m89694W0(i)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Ignoring Animation set on ");
                    sb3.append(f2);
                    sb3.append(" as Animations cannot run alongside Transitions.");
                }
                kVar.mo57078a();
            } else if (z4) {
                if (FragmentManager.m89694W0(i)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Ignoring Animation set on ");
                    sb4.append(f2);
                    sb4.append(" as Animations cannot run alongside Animators.");
                }
                kVar.mo57078a();
            } else {
                View view3 = f2.mView;
                Animation animation = (Animation) C18001r.m81775l(((C19236i.C19237a) C18001r.m81775l(kVar.mo57077e(context))).f49519a);
                if (b2.mo57025e() != SpecialEffectsController.Operation.State.REMOVED) {
                    view3.startAnimation(animation);
                    kVar.mo57078a();
                    z2 = z4;
                    i2 = i;
                } else {
                    m.startViewTransition(view3);
                    C19204e eVar = r0;
                    z2 = z4;
                    C19236i.C19238b bVar = new C19236i.C19238b(animation, m, view3);
                    C19204e eVar2 = new C19204e(b2, m, view3, kVar);
                    bVar.setAnimationListener(eVar);
                    view3.startAnimation(bVar);
                    i2 = 2;
                    if (FragmentManager.m89694W0(2)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Animation from operation ");
                        sb5.append(b2);
                        sb5.append(" has started.");
                    }
                }
                C17781e c = kVar.mo57080c();
                C19211k kVar2 = kVar;
                C19206f fVar = r0;
                C19206f fVar2 = new C19206f(view3, m, kVar2, b2);
                c.mo52222d(fVar);
                i = i2;
                z4 = z2;
            }
        }
    }

    @C0359n0
    /* renamed from: x */
    public final Map<SpecialEffectsController.Operation, Boolean> mo57065x(@C0359n0 List<C19213m> list, @C0359n0 List<SpecialEffectsController.Operation> list2, boolean z, @C0363p0 SpecialEffectsController.Operation operation, @C0363p0 SpecialEffectsController.Operation operation2) {
        boolean z2;
        boolean z3;
        Iterator<C19213m> it;
        ArrayList arrayList;
        ArrayList arrayList2;
        View view;
        View view2;
        Object obj;
        SpecialEffectsController.Operation operation3;
        SpecialEffectsController.Operation operation4;
        Object obj2;
        Object obj3;
        C1866a aVar;
        SpecialEffectsController.Operation operation5;
        C19251l0 l0Var;
        View view3;
        Rect rect;
        C19199b bVar;
        ArrayList arrayList3;
        SpecialEffectsController.Operation operation6;
        ArrayList arrayList4;
        C17052c6 c6Var;
        C17052c6 c6Var2;
        ArrayList<String> arrayList5;
        View view4;
        String b;
        ArrayList<String> arrayList6;
        C19199b bVar2 = this;
        boolean z4 = z;
        SpecialEffectsController.Operation operation7 = operation;
        SpecialEffectsController.Operation operation8 = operation2;
        HashMap hashMap = new HashMap();
        C19251l0 l0Var2 = null;
        for (C19213m next : list) {
            if (!next.mo57081d()) {
                C19251l0 e = next.mo57082e();
                if (l0Var2 == null) {
                    l0Var2 = e;
                } else if (!(e == null || l0Var2 == e)) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + next.mo57079b().mo57026f() + " returned Transition " + next.mo57085h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (l0Var2 == null) {
            for (C19213m next2 : list) {
                hashMap.put(next2.mo57079b(), Boolean.FALSE);
                next2.mo57078a();
            }
            return hashMap;
        }
        View view5 = new View(mo57017m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        C1866a aVar2 = new C1866a();
        Object obj4 = null;
        View view6 = null;
        boolean z5 = false;
        for (C19213m next3 : list) {
            if (!next3.mo57086i() || operation7 == null || operation8 == null) {
                aVar = aVar2;
                arrayList4 = arrayList8;
                bVar = bVar2;
                operation6 = operation7;
                arrayList3 = arrayList7;
                rect = rect2;
                l0Var = l0Var2;
                operation5 = operation8;
                view3 = view5;
                view6 = view6;
            } else {
                Object w = l0Var2.mo57291w(l0Var2.mo57279f(next3.mo57084g()));
                ArrayList<String> sharedElementSourceNames = operation2.mo57026f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = operation.mo57026f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = operation.mo57026f().getSharedElementTargetNames();
                Object obj5 = w;
                View view7 = view6;
                int i = 0;
                while (i < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i));
                    ArrayList<String> arrayList9 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i));
                    }
                    i++;
                    sharedElementTargetNames = arrayList9;
                }
                ArrayList<String> sharedElementTargetNames2 = operation2.mo57026f().getSharedElementTargetNames();
                if (!z4) {
                    c6Var2 = operation.mo57026f().getExitTransitionCallback();
                    c6Var = operation2.mo57026f().getEnterTransitionCallback();
                } else {
                    c6Var2 = operation.mo57026f().getEnterTransitionCallback();
                    c6Var = operation2.mo57026f().getExitTransitionCallback();
                }
                int size = sharedElementSourceNames.size();
                HashMap hashMap2 = hashMap;
                int i2 = 0;
                while (i2 < size) {
                    aVar2.put(sharedElementSourceNames.get(i2), sharedElementTargetNames2.get(i2));
                    i2++;
                    size = size;
                    view5 = view5;
                }
                View view8 = view5;
                if (FragmentManager.m89694W0(2)) {
                    Iterator<String> it2 = sharedElementTargetNames2.iterator();
                    while (it2.hasNext()) {
                        Iterator<String> it3 = it2;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Name: ");
                        sb.append(it2.next());
                        it2 = it3;
                    }
                    Iterator<String> it4 = sharedElementSourceNames.iterator();
                    while (it4.hasNext()) {
                        Iterator<String> it5 = it4;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Name: ");
                        sb2.append(it4.next());
                        it4 = it5;
                    }
                }
                C1866a aVar3 = new C1866a();
                bVar2.mo57062u(aVar3, operation.mo57026f().mView);
                aVar3.mo6145s(sharedElementSourceNames);
                if (c6Var2 != null) {
                    if (FragmentManager.m89694W0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Executing exit callback for operation ");
                        sb3.append(operation7);
                    }
                    c6Var2.mo51246d(sharedElementSourceNames, aVar3);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        String str = sharedElementSourceNames.get(size2);
                        View view9 = (View) aVar3.get(str);
                        if (view9 == null) {
                            aVar2.remove(str);
                            arrayList6 = sharedElementSourceNames;
                        } else {
                            arrayList6 = sharedElementSourceNames;
                            if (!str.equals(C18196h2.m82649x0(view9))) {
                                aVar2.put(C18196h2.m82649x0(view9), (String) aVar2.remove(str));
                            }
                        }
                        size2--;
                        sharedElementSourceNames = arrayList6;
                    }
                    arrayList5 = sharedElementSourceNames;
                } else {
                    arrayList5 = sharedElementSourceNames;
                    aVar2.mo6145s(aVar3.keySet());
                }
                C1866a aVar4 = new C1866a();
                bVar2.mo57062u(aVar4, operation2.mo57026f().mView);
                aVar4.mo6145s(sharedElementTargetNames2);
                aVar4.mo6145s(aVar2.values());
                if (c6Var != null) {
                    if (FragmentManager.m89694W0(2)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Executing enter callback for operation ");
                        sb4.append(operation8);
                    }
                    c6Var.mo51246d(sharedElementTargetNames2, aVar4);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str2 = sharedElementTargetNames2.get(size3);
                        View view10 = (View) aVar4.get(str2);
                        if (view10 == null) {
                            String b2 = C19241j0.m90215b(aVar2, str2);
                            if (b2 != null) {
                                aVar2.remove(b2);
                            }
                        } else if (!str2.equals(C18196h2.m82649x0(view10)) && (b = C19241j0.m90215b(aVar2, str2)) != null) {
                            aVar2.put(b, C18196h2.m82649x0(view10));
                        }
                    }
                } else {
                    C19241j0.m90217d(aVar2, aVar4);
                }
                bVar2.mo57063v(aVar3, aVar2.keySet());
                bVar2.mo57063v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList7.clear();
                    arrayList8.clear();
                    aVar = aVar2;
                    arrayList4 = arrayList8;
                    bVar = bVar2;
                    operation6 = operation7;
                    arrayList3 = arrayList7;
                    rect = rect2;
                    l0Var = l0Var2;
                    view6 = view7;
                    hashMap = hashMap2;
                    obj4 = null;
                    operation5 = operation8;
                    view3 = view8;
                } else {
                    C19241j0.m90214a(operation2.mo57026f(), operation.mo57026f(), z4, aVar3, true);
                    ArrayList<String> arrayList10 = arrayList5;
                    C19207g gVar = r0;
                    Object obj6 = obj5;
                    ViewGroup m = mo57017m();
                    View view11 = view7;
                    aVar = aVar2;
                    ArrayList arrayList11 = arrayList8;
                    C19207g gVar2 = new C19207g(operation2, operation, z, aVar4);
                    C18024a2.m81875a(m, gVar);
                    arrayList7.addAll(aVar3.values());
                    if (!arrayList10.isEmpty()) {
                        View view12 = (View) aVar3.get(arrayList10.get(0));
                        l0Var2.mo57287r(obj6, view12);
                        view6 = view12;
                    } else {
                        view6 = view11;
                    }
                    arrayList4 = arrayList11;
                    arrayList4.addAll(aVar4.values());
                    if (sharedElementTargetNames2.isEmpty() || (view4 = (View) aVar4.get(sharedElementTargetNames2.get(0))) == null) {
                        bVar = this;
                    } else {
                        bVar = this;
                        C18024a2.m81875a(mo57017m(), new C19208h(l0Var2, view4, rect2));
                        z5 = true;
                    }
                    View view13 = view8;
                    l0Var2.mo57289u(obj6, view13, arrayList7);
                    arrayList3 = arrayList7;
                    rect = rect2;
                    view3 = view13;
                    l0Var = l0Var2;
                    l0Var2.mo57285p(obj6, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, obj6, arrayList4);
                    Boolean bool = Boolean.TRUE;
                    operation6 = operation;
                    hashMap = hashMap2;
                    hashMap.put(operation6, bool);
                    operation5 = operation2;
                    hashMap.put(operation5, bool);
                    obj4 = obj6;
                }
            }
            z4 = z;
            arrayList7 = arrayList3;
            bVar2 = bVar;
            rect2 = rect;
            view5 = view3;
            operation8 = operation5;
            aVar2 = aVar;
            arrayList8 = arrayList4;
            operation7 = operation6;
            l0Var2 = l0Var;
        }
        View view14 = view6;
        C1866a aVar5 = aVar2;
        ArrayList arrayList12 = arrayList8;
        C19199b bVar3 = bVar2;
        SpecialEffectsController.Operation operation9 = operation7;
        ArrayList arrayList13 = arrayList7;
        Rect rect3 = rect2;
        C19251l0 l0Var3 = l0Var2;
        SpecialEffectsController.Operation operation10 = operation8;
        View view15 = view5;
        ArrayList arrayList14 = new ArrayList();
        Iterator<C19213m> it6 = list.iterator();
        Object obj7 = null;
        Object obj8 = null;
        while (it6.hasNext()) {
            C19213m next4 = it6.next();
            if (next4.mo57081d()) {
                hashMap.put(next4.mo57079b(), Boolean.FALSE);
                next4.mo57078a();
            } else {
                Object f = l0Var3.mo57279f(next4.mo57085h());
                SpecialEffectsController.Operation b3 = next4.mo57079b();
                if (obj4 == null || !(b3 == operation9 || b3 == operation10)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (f == null) {
                    if (!z3) {
                        hashMap.put(b3, Boolean.FALSE);
                        next4.mo57078a();
                    }
                    List<SpecialEffectsController.Operation> list3 = list2;
                    arrayList = arrayList12;
                    arrayList2 = arrayList13;
                    it = it6;
                    view = view15;
                    obj = obj7;
                    operation3 = operation10;
                    view2 = view14;
                } else {
                    it = it6;
                    ArrayList arrayList15 = new ArrayList();
                    Object obj9 = obj7;
                    bVar3.mo57061t(arrayList15, b3.mo57026f().mView);
                    if (z3) {
                        if (b3 == operation9) {
                            arrayList15.removeAll(arrayList13);
                        } else {
                            arrayList15.removeAll(arrayList12);
                        }
                    }
                    if (arrayList15.isEmpty()) {
                        l0Var3.mo57275a(f, view15);
                        arrayList = arrayList12;
                        arrayList2 = arrayList13;
                        view = view15;
                        operation4 = b3;
                        obj3 = obj8;
                        operation3 = operation10;
                        obj2 = obj9;
                        List<SpecialEffectsController.Operation> list4 = list2;
                    } else {
                        l0Var3.mo57276b(f, arrayList15);
                        view = view15;
                        SpecialEffectsController.Operation operation11 = b3;
                        obj2 = obj9;
                        arrayList2 = arrayList13;
                        obj3 = obj8;
                        arrayList = arrayList12;
                        operation3 = operation10;
                        l0Var3.mo57285p(f, f, arrayList15, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null);
                        if (operation11.mo57025e() == SpecialEffectsController.Operation.State.GONE) {
                            operation4 = operation11;
                            list2.remove(operation4);
                            ArrayList arrayList16 = new ArrayList(arrayList15);
                            arrayList16.remove(operation4.mo57026f().mView);
                            l0Var3.mo57284o(f, operation4.mo57026f().mView, arrayList16);
                            C18024a2.m81875a(mo57017m(), new C19209i(arrayList15));
                        } else {
                            List<SpecialEffectsController.Operation> list5 = list2;
                            operation4 = operation11;
                        }
                    }
                    if (operation4.mo57025e() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList14.addAll(arrayList15);
                        if (z5) {
                            l0Var3.mo57286q(f, rect3);
                        }
                        view2 = view14;
                    } else {
                        view2 = view14;
                        l0Var3.mo57287r(f, view2);
                    }
                    hashMap.put(operation4, Boolean.TRUE);
                    if (next4.mo57087j()) {
                        obj8 = l0Var3.mo57281k(obj3, f, (Object) null);
                        obj = obj2;
                    } else {
                        obj = l0Var3.mo57281k(obj2, f, (Object) null);
                        obj8 = obj3;
                    }
                }
                operation10 = operation3;
                obj7 = obj;
                view14 = view2;
                view15 = view;
                arrayList13 = arrayList2;
                arrayList12 = arrayList;
                it6 = it;
            }
        }
        ArrayList arrayList17 = arrayList12;
        ArrayList arrayList18 = arrayList13;
        SpecialEffectsController.Operation operation12 = operation10;
        Object j = l0Var3.mo57280j(obj8, obj7, obj4);
        if (j == null) {
            return hashMap;
        }
        for (C19213m next5 : list) {
            if (!next5.mo57081d()) {
                Object h = next5.mo57085h();
                SpecialEffectsController.Operation b4 = next5.mo57079b();
                if (obj4 == null || !(b4 == operation9 || b4 == operation12)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (h != null || z2) {
                    if (!C18196h2.m82539U0(mo57017m())) {
                        if (FragmentManager.m89694W0(2)) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("SpecialEffectsController: Container ");
                            sb5.append(mo57017m());
                            sb5.append(" has not been laid out. Completing operation ");
                            sb5.append(b4);
                        }
                        next5.mo57078a();
                    } else {
                        l0Var3.mo57288s(next5.mo57079b().mo57026f(), j, next5.mo57080c(), new C19210j(next5, b4));
                    }
                }
            }
        }
        if (!C18196h2.m82539U0(mo57017m())) {
            return hashMap;
        }
        C19241j0.m90218e(arrayList14, 4);
        ArrayList arrayList19 = arrayList17;
        ArrayList<String> l = l0Var3.mo57310l(arrayList19);
        if (FragmentManager.m89694W0(2)) {
            Iterator it7 = arrayList18.iterator();
            while (it7.hasNext()) {
                View view16 = (View) it7.next();
                StringBuilder sb6 = new StringBuilder();
                sb6.append("View: ");
                sb6.append(view16);
                sb6.append(" Name: ");
                sb6.append(C18196h2.m82649x0(view16));
            }
            Iterator it8 = arrayList19.iterator();
            while (it8.hasNext()) {
                View view17 = (View) it8.next();
                StringBuilder sb7 = new StringBuilder();
                sb7.append("View: ");
                sb7.append(view17);
                sb7.append(" Name: ");
                sb7.append(C18196h2.m82649x0(view17));
            }
        }
        l0Var3.mo57277c(mo57017m(), j);
        l0Var3.mo57311t(mo57017m(), arrayList18, arrayList19, l, aVar5);
        C19241j0.m90218e(arrayList14, 0);
        l0Var3.mo57290v(obj4, arrayList18, arrayList19);
        return hashMap;
    }

    /* renamed from: y */
    public final void mo57066y(@C0359n0 List<SpecialEffectsController.Operation> list) {
        Fragment f = list.get(list.size() - 1).mo57026f();
        for (SpecialEffectsController.Operation next : list) {
            next.mo57026f().mAnimationInfo.f49193c = f.mAnimationInfo.f49193c;
            next.mo57026f().mAnimationInfo.f49194d = f.mAnimationInfo.f49194d;
            next.mo57026f().mAnimationInfo.f49195e = f.mAnimationInfo.f49195e;
            next.mo57026f().mAnimationInfo.f49196f = f.mAnimationInfo.f49196f;
        }
    }
}
