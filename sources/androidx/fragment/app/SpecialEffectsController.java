package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.p027os.C17781e;
import androidx.core.view.C18196h2;
import androidx.fragment.C19144a;
import com.google.firebase.installations.local.C33093b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public abstract class SpecialEffectsController {

    /* renamed from: a */
    public final ViewGroup f49335a;

    /* renamed from: b */
    public final ArrayList<Operation> f49336b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<Operation> f49337c = new ArrayList<>();

    /* renamed from: d */
    public boolean f49338d = false;

    /* renamed from: e */
    public boolean f49339e = false;

    public static class Operation {
        @C0359n0

        /* renamed from: a */
        public State f49340a;
        @C0359n0

        /* renamed from: b */
        public LifecycleImpact f49341b;
        @C0359n0

        /* renamed from: c */
        public final Fragment f49342c;
        @C0359n0

        /* renamed from: d */
        public final List<Runnable> f49343d = new ArrayList();
        @C0359n0

        /* renamed from: e */
        public final HashSet<C17781e> f49344e = new HashSet<>();

        /* renamed from: f */
        public boolean f49345f = false;

        /* renamed from: g */
        public boolean f49346g = false;

        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            @C0359n0
            /* renamed from: g */
            public static State m89970g(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i);
            }

            @C0359n0
            /* renamed from: q */
            public static State m89971q(@C0359n0 View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return m89970g(view.getVisibility());
            }

            /* renamed from: b */
            public void mo57034b(@C0359n0 View view) {
                int i = C19195c.f49361a[ordinal()];
                if (i == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m89694W0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Removing view ");
                            sb.append(view);
                            sb.append(" from container ");
                            sb.append(viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i == 2) {
                    if (FragmentManager.m89694W0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: Setting view ");
                        sb2.append(view);
                        sb2.append(" to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i == 3) {
                    if (FragmentManager.m89694W0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SpecialEffectsController: Setting view ");
                        sb3.append(view);
                        sb3.append(" to GONE");
                    }
                    view.setVisibility(8);
                } else if (i == 4) {
                    if (FragmentManager.m89694W0(2)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("SpecialEffectsController: Setting view ");
                        sb4.append(view);
                        sb4.append(" to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }
        }

        /* renamed from: androidx.fragment.app.SpecialEffectsController$Operation$a */
        public class C19192a implements C17781e.C17783b {
            public C19192a() {
            }

            public void onCancel() {
                Operation.this.mo57022b();
            }
        }

        public Operation(@C0359n0 State state, @C0359n0 LifecycleImpact lifecycleImpact, @C0359n0 Fragment fragment, @C0359n0 C17781e eVar) {
            this.f49340a = state;
            this.f49341b = lifecycleImpact;
            this.f49342c = fragment;
            eVar.mo52222d(new C19192a());
        }

        /* renamed from: a */
        public final void mo57021a(@C0359n0 Runnable runnable) {
            this.f49343d.add(runnable);
        }

        /* renamed from: b */
        public final void mo57022b() {
            if (!mo57028h()) {
                this.f49345f = true;
                if (this.f49344e.isEmpty()) {
                    mo57023c();
                    return;
                }
                Iterator it = new ArrayList(this.f49344e).iterator();
                while (it.hasNext()) {
                    ((C17781e) it.next()).mo52219a();
                }
            }
        }

        @C0346i
        /* renamed from: c */
        public void mo57023c() {
            if (!this.f49346g) {
                if (FragmentManager.m89694W0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    sb.append(this);
                    sb.append(" has called complete.");
                }
                this.f49346g = true;
                for (Runnable run : this.f49343d) {
                    run.run();
                }
            }
        }

        /* renamed from: d */
        public final void mo57024d(@C0359n0 C17781e eVar) {
            if (this.f49344e.remove(eVar) && this.f49344e.isEmpty()) {
                mo57023c();
            }
        }

        @C0359n0
        /* renamed from: e */
        public State mo57025e() {
            return this.f49340a;
        }

        @C0359n0
        /* renamed from: f */
        public final Fragment mo57026f() {
            return this.f49342c;
        }

        @C0359n0
        /* renamed from: g */
        public LifecycleImpact mo57027g() {
            return this.f49341b;
        }

        /* renamed from: h */
        public final boolean mo57028h() {
            return this.f49345f;
        }

        /* renamed from: i */
        public final boolean mo57029i() {
            return this.f49346g;
        }

        /* renamed from: j */
        public final void mo57030j(@C0359n0 C17781e eVar) {
            mo57032l();
            this.f49344e.add(eVar);
        }

        /* renamed from: k */
        public final void mo57031k(@C0359n0 State state, @C0359n0 LifecycleImpact lifecycleImpact) {
            int i = C19195c.f49362b[lifecycleImpact.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (FragmentManager.m89694W0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: For fragment ");
                        sb.append(this.f49342c);
                        sb.append(" mFinalState = ");
                        sb.append(this.f49340a);
                        sb.append(" -> REMOVED. mLifecycleImpact  = ");
                        sb.append(this.f49341b);
                        sb.append(" to REMOVING.");
                    }
                    this.f49340a = State.REMOVED;
                    this.f49341b = LifecycleImpact.REMOVING;
                } else if (i == 3 && this.f49340a != State.REMOVED) {
                    if (FragmentManager.m89694W0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: For fragment ");
                        sb2.append(this.f49342c);
                        sb2.append(" mFinalState = ");
                        sb2.append(this.f49340a);
                        sb2.append(" -> ");
                        sb2.append(state);
                        sb2.append(". ");
                    }
                    this.f49340a = state;
                }
            } else if (this.f49340a == State.REMOVED) {
                if (FragmentManager.m89694W0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: For fragment ");
                    sb3.append(this.f49342c);
                    sb3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    sb3.append(this.f49341b);
                    sb3.append(" to ADDING.");
                }
                this.f49340a = State.VISIBLE;
                this.f49341b = LifecycleImpact.ADDING;
            }
        }

        /* renamed from: l */
        public void mo57032l() {
        }

        @C0359n0
        public String toString() {
            return "Operation " + C33093b.f80281i + Integer.toHexString(System.identityHashCode(this)) + "} " + C33093b.f80281i + "mFinalState = " + this.f49340a + "} " + C33093b.f80281i + "mLifecycleImpact = " + this.f49341b + "} " + C33093b.f80281i + "mFragment = " + this.f49342c + "}";
        }
    }

    /* renamed from: androidx.fragment.app.SpecialEffectsController$a */
    public class C19193a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C19196d f49357a;

        public C19193a(C19196d dVar) {
            this.f49357a = dVar;
        }

        public void run() {
            if (SpecialEffectsController.this.f49336b.contains(this.f49357a)) {
                this.f49357a.mo57025e().mo57034b(this.f49357a.mo57026f().mView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.SpecialEffectsController$b */
    public class C19194b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C19196d f49359a;

        public C19194b(C19196d dVar) {
            this.f49359a = dVar;
        }

        public void run() {
            SpecialEffectsController.this.f49336b.remove(this.f49359a);
            SpecialEffectsController.this.f49337c.remove(this.f49359a);
        }
    }

    /* renamed from: androidx.fragment.app.SpecialEffectsController$c */
    public static /* synthetic */ class C19195c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49361a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f49362b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f49362b = r0
                r1 = 1
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f49362b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f49362b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r4 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f49361a = r3
                androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f49361a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f49361a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f49361a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.C19195c.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.SpecialEffectsController$d */
    public static class C19196d extends Operation {
        @C0359n0

        /* renamed from: h */
        public final C19225e0 f49363h;

        public C19196d(@C0359n0 Operation.State state, @C0359n0 Operation.LifecycleImpact lifecycleImpact, @C0359n0 C19225e0 e0Var, @C0359n0 C17781e eVar) {
            super(state, lifecycleImpact, e0Var.mo57128k(), eVar);
            this.f49363h = e0Var;
        }

        /* renamed from: c */
        public void mo57023c() {
            super.mo57023c();
            this.f49363h.mo57130m();
        }

        /* renamed from: l */
        public void mo57032l() {
            if (mo57027g() == Operation.LifecycleImpact.ADDING) {
                Fragment k = this.f49363h.mo57128k();
                View findFocus = k.mView.findFocus();
                if (findFocus != null) {
                    k.setFocusedView(findFocus);
                    if (FragmentManager.m89694W0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("requestFocus: Saved focused view ");
                        sb.append(findFocus);
                        sb.append(" for Fragment ");
                        sb.append(k);
                    }
                }
                View requireView = mo57026f().requireView();
                if (requireView.getParent() == null) {
                    this.f49363h.mo57119b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k.getPostOnViewCreatedAlpha());
            } else if (mo57027g() == Operation.LifecycleImpact.REMOVING) {
                Fragment k2 = this.f49363h.mo57128k();
                View requireView2 = k2.requireView();
                if (FragmentManager.m89694W0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Clearing focus ");
                    sb2.append(requireView2.findFocus());
                    sb2.append(" on view ");
                    sb2.append(requireView2);
                    sb2.append(" for Fragment ");
                    sb2.append(k2);
                }
                requireView2.clearFocus();
            }
        }
    }

    public SpecialEffectsController(@C0359n0 ViewGroup viewGroup) {
        this.f49335a = viewGroup;
    }

    @C0359n0
    /* renamed from: n */
    public static SpecialEffectsController m89940n(@C0359n0 ViewGroup viewGroup, @C0359n0 FragmentManager fragmentManager) {
        return m89941o(viewGroup, fragmentManager.mo56825O0());
    }

    @C0359n0
    /* renamed from: o */
    public static SpecialEffectsController m89941o(@C0359n0 ViewGroup viewGroup, @C0359n0 C19263p0 p0Var) {
        int i = C19144a.C19147c.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        SpecialEffectsController a = p0Var.mo56933a(viewGroup);
        viewGroup.setTag(i, a);
        return a;
    }

    /* renamed from: a */
    public final void mo57005a(@C0359n0 Operation.State state, @C0359n0 Operation.LifecycleImpact lifecycleImpact, @C0359n0 C19225e0 e0Var) {
        synchronized (this.f49336b) {
            C17781e eVar = new C17781e();
            Operation h = mo57012h(e0Var.mo57128k());
            if (h != null) {
                h.mo57031k(state, lifecycleImpact);
                return;
            }
            C19196d dVar = new C19196d(state, lifecycleImpact, e0Var, eVar);
            this.f49336b.add(dVar);
            dVar.mo57021a(new C19193a(dVar));
            dVar.mo57021a(new C19194b(dVar));
        }
    }

    /* renamed from: b */
    public void mo57006b(@C0359n0 Operation.State state, @C0359n0 C19225e0 e0Var) {
        if (FragmentManager.m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb.append(e0Var.mo57128k());
        }
        mo57005a(state, Operation.LifecycleImpact.ADDING, e0Var);
    }

    /* renamed from: c */
    public void mo57007c(@C0359n0 C19225e0 e0Var) {
        if (FragmentManager.m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb.append(e0Var.mo57128k());
        }
        mo57005a(Operation.State.GONE, Operation.LifecycleImpact.NONE, e0Var);
    }

    /* renamed from: d */
    public void mo57008d(@C0359n0 C19225e0 e0Var) {
        if (FragmentManager.m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb.append(e0Var.mo57128k());
        }
        mo57005a(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, e0Var);
    }

    /* renamed from: e */
    public void mo57009e(@C0359n0 C19225e0 e0Var) {
        if (FragmentManager.m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb.append(e0Var.mo57128k());
        }
        mo57005a(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, e0Var);
    }

    /* renamed from: f */
    public abstract void mo57010f(@C0359n0 List<Operation> list, boolean z);

    /* renamed from: g */
    public void mo57011g() {
        if (!this.f49339e) {
            if (!C18196h2.m82521O0(this.f49335a)) {
                mo57014j();
                this.f49338d = false;
                return;
            }
            synchronized (this.f49336b) {
                if (!this.f49336b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f49337c);
                    this.f49337c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Operation operation = (Operation) it.next();
                        if (FragmentManager.m89694W0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Cancelling operation ");
                            sb.append(operation);
                        }
                        operation.mo57022b();
                        if (!operation.mo57029i()) {
                            this.f49337c.add(operation);
                        }
                    }
                    mo57019q();
                    ArrayList arrayList2 = new ArrayList(this.f49336b);
                    this.f49336b.clear();
                    this.f49337c.addAll(arrayList2);
                    boolean W0 = FragmentManager.m89694W0(2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((Operation) it2.next()).mo57032l();
                    }
                    mo57010f(arrayList2, this.f49338d);
                    this.f49338d = false;
                    boolean W02 = FragmentManager.m89694W0(2);
                }
            }
        }
    }

    @C0363p0
    /* renamed from: h */
    public final Operation mo57012h(@C0359n0 Fragment fragment) {
        Iterator<Operation> it = this.f49336b.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.mo57026f().equals(fragment) && !next.mo57028h()) {
                return next;
            }
        }
        return null;
    }

    @C0363p0
    /* renamed from: i */
    public final Operation mo57013i(@C0359n0 Fragment fragment) {
        Iterator<Operation> it = this.f49337c.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.mo57026f().equals(fragment) && !next.mo57028h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: j */
    public void mo57014j() {
        String str;
        String str2;
        FragmentManager.m89694W0(2);
        boolean O0 = C18196h2.m82521O0(this.f49335a);
        synchronized (this.f49336b) {
            mo57019q();
            Iterator<Operation> it = this.f49336b.iterator();
            while (it.hasNext()) {
                it.next().mo57032l();
            }
            Iterator it2 = new ArrayList(this.f49337c).iterator();
            while (it2.hasNext()) {
                Operation operation = (Operation) it2.next();
                if (FragmentManager.m89694W0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (O0) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f49335a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(operation);
                }
                operation.mo57022b();
            }
            Iterator it3 = new ArrayList(this.f49336b).iterator();
            while (it3.hasNext()) {
                Operation operation2 = (Operation) it3.next();
                if (FragmentManager.m89694W0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (O0) {
                        str = "";
                    } else {
                        str = "Container " + this.f49335a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(operation2);
                }
                operation2.mo57022b();
            }
        }
    }

    /* renamed from: k */
    public void mo57015k() {
        if (this.f49339e) {
            FragmentManager.m89694W0(2);
            this.f49339e = false;
            mo57011g();
        }
    }

    @C0363p0
    /* renamed from: l */
    public Operation.LifecycleImpact mo57016l(@C0359n0 C19225e0 e0Var) {
        Operation.LifecycleImpact lifecycleImpact;
        Operation h = mo57012h(e0Var.mo57128k());
        if (h != null) {
            lifecycleImpact = h.mo57027g();
        } else {
            lifecycleImpact = null;
        }
        Operation i = mo57013i(e0Var.mo57128k());
        if (i == null || (lifecycleImpact != null && lifecycleImpact != Operation.LifecycleImpact.NONE)) {
            return lifecycleImpact;
        }
        return i.mo57027g();
    }

    @C0359n0
    /* renamed from: m */
    public ViewGroup mo57017m() {
        return this.f49335a;
    }

    /* renamed from: p */
    public void mo57018p() {
        synchronized (this.f49336b) {
            mo57019q();
            this.f49339e = false;
            int size = this.f49336b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Operation operation = this.f49336b.get(size);
                Operation.State q = Operation.State.m89971q(operation.mo57026f().mView);
                Operation.State e = operation.mo57025e();
                Operation.State state = Operation.State.VISIBLE;
                if (e == state && q != state) {
                    this.f49339e = operation.mo57026f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* renamed from: q */
    public final void mo57019q() {
        Iterator<Operation> it = this.f49336b.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.mo57027g() == Operation.LifecycleImpact.ADDING) {
                next.mo57031k(Operation.State.m89970g(next.mo57026f().requireView().getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    /* renamed from: r */
    public void mo57020r(boolean z) {
        this.f49338d = z;
    }
}
