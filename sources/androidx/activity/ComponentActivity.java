package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.contextaware.C0231a;
import androidx.activity.contextaware.C0232b;
import androidx.activity.contextaware.C0233c;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0263a;
import androidx.activity.result.C0264b;
import androidx.activity.result.C0302g;
import androidx.activity.result.C0304i;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.C0266a;
import androidx.activity.result.contract.C0268b;
import androidx.annotation.C0346i;
import androidx.annotation.C0347i0;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0360o;
import androidx.annotation.C0363p0;
import androidx.annotation.C0368r0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.core.app.C17018b;
import androidx.core.app.C17055d0;
import androidx.core.app.C17124h5;
import androidx.core.app.C17125i;
import androidx.core.app.C17193o4;
import androidx.core.app.C17202p4;
import androidx.core.app.C17204q;
import androidx.core.app.C17211q4;
import androidx.core.content.C17363o0;
import androidx.core.content.C17365p0;
import androidx.core.p027os.C17772a;
import androidx.core.util.C17970d;
import androidx.core.view.C18318n1;
import androidx.core.view.C18383u0;
import androidx.core.view.C18412x0;
import androidx.lifecycle.C19392a1;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19448n0;
import androidx.lifecycle.C19455p;
import androidx.lifecycle.C19463r0;
import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.C19512y;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.C19477a;
import androidx.lifecycle.viewmodel.C19492e;
import androidx.savedstate.C20431c;
import androidx.savedstate.C20435d;
import androidx.savedstate.C20437e;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.tracing.C20530b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C11079d2;

public class ComponentActivity extends C17204q implements C0231a, C19499w, C19395b1, C19455p, C20437e, C0213a0, C0304i, C0264b, C17363o0, C17365p0, C17202p4, C17193o4, C17211q4, C18383u0, C0308s {

    /* renamed from: K0 */
    public static final String f629K0 = "android:support:activity-result";

    /* renamed from: E0 */
    public final CopyOnWriteArrayList<C17970d<Integer>> f630E0;

    /* renamed from: F0 */
    public final CopyOnWriteArrayList<C17970d<Intent>> f631F0;

    /* renamed from: G0 */
    public final CopyOnWriteArrayList<C17970d<C17055d0>> f632G0;

    /* renamed from: H0 */
    public final CopyOnWriteArrayList<C17970d<C17124h5>> f633H0;

    /* renamed from: I0 */
    public boolean f634I0;

    /* renamed from: J0 */
    public boolean f635J0;

    /* renamed from: X */
    public final AtomicInteger f636X;

    /* renamed from: Y */
    public final ActivityResultRegistry f637Y;

    /* renamed from: Z */
    public final CopyOnWriteArrayList<C17970d<Configuration>> f638Z;

    /* renamed from: c */
    public final C0232b f639c;

    /* renamed from: d */
    public final C18412x0 f640d;

    /* renamed from: e */
    public final C19512y f641e;

    /* renamed from: f */
    public final C20435d f642f;

    /* renamed from: g */
    public C19392a1 f643g;

    /* renamed from: v */
    public C19502x0.C19506b f644v;

    /* renamed from: w */
    public final OnBackPressedDispatcher f645w;

    /* renamed from: x */
    public final C0198f f646x;
    @C0359n0

    /* renamed from: y */
    public final C0251r f647y;
    @C0347i0

    /* renamed from: z */
    public int f648z;

    /* renamed from: androidx.activity.ComponentActivity$a */
    public class C0191a implements Runnable {
        public C0191a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    public class C0192b extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        public class C0193a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f654a;

            /* renamed from: b */
            public final /* synthetic */ C0266a.C0267a f655b;

            public C0193a(int i, C0266a.C0267a aVar) {
                this.f654a = i;
                this.f655b = aVar;
            }

            public void run() {
                C0192b.this.mo874c(this.f654a, this.f655b.mo899a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        public class C0194b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f657a;

            /* renamed from: b */
            public final /* synthetic */ IntentSender.SendIntentException f658b;

            public C0194b(int i, IntentSender.SendIntentException sendIntentException) {
                this.f657a = i;
                this.f658b = sendIntentException;
            }

            public void run() {
                C0192b.this.mo873b(this.f657a, 0, new Intent().setAction(C0268b.C0292n.f820b).putExtra(C0268b.C0292n.f822d, this.f658b));
            }
        }

        public C0192b() {
        }

        /* renamed from: f */
        public <I, O> void mo752f(int i, @C0359n0 C0266a<I, O> aVar, I i2, @C0363p0 C17125i iVar) {
            Bundle bundle;
            Bundle bundle2;
            ComponentActivity componentActivity = ComponentActivity.this;
            C0266a.C0267a<O> b = aVar.mo898b(componentActivity, i2);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new C0193a(i, b));
                return;
            }
            Intent a = aVar.mo869a(componentActivity, i2);
            if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
                a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a.hasExtra(C0268b.C0290m.f818b)) {
                Bundle bundleExtra = a.getBundleExtra(C0268b.C0290m.f818b);
                a.removeExtra(C0268b.C0290m.f818b);
                bundle = bundleExtra;
            } else {
                if (iVar != null) {
                    bundle2 = iVar.mo51574l();
                } else {
                    bundle2 = null;
                }
                bundle = bundle2;
            }
            if (C0268b.C0287k.f814b.equals(a.getAction())) {
                String[] stringArrayExtra = a.getStringArrayExtra(C0268b.C0287k.f815c);
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C17018b.m78743J(componentActivity, stringArrayExtra, i);
            } else if (C0268b.C0292n.f820b.equals(a.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a.getParcelableExtra(C0268b.C0292n.f821c);
                try {
                    C17018b.m78751R(componentActivity, intentSenderRequest.mo888d(), i, intentSenderRequest.mo885a(), intentSenderRequest.mo886b(), intentSenderRequest.mo887c(), 0, bundle);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new C0194b(i, e));
                }
            } else {
                C17018b.m78750Q(componentActivity, a, i, bundle);
            }
        }
    }

    @C0376v0(19)
    /* renamed from: androidx.activity.ComponentActivity$c */
    public static class C0195c {
        /* renamed from: a */
        public static void m1225a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    @C0376v0(33)
    /* renamed from: androidx.activity.ComponentActivity$d */
    public static class C0196d {
        @C0373u
        /* renamed from: a */
        public static OnBackInvokedDispatcher m1226a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$e */
    public static final class C0197e {

        /* renamed from: a */
        public Object f660a;

        /* renamed from: b */
        public C19392a1 f661b;
    }

    /* renamed from: androidx.activity.ComponentActivity$f */
    public interface C0198f extends Executor {
        /* renamed from: M */
        void mo755M(@C0359n0 View view);

        /* renamed from: g */
        void mo756g();
    }

    @C0376v0(16)
    /* renamed from: androidx.activity.ComponentActivity$g */
    public class C0199g implements C0198f, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: a */
        public final long f662a = (SystemClock.uptimeMillis() + 10000);

        /* renamed from: b */
        public Runnable f663b;

        /* renamed from: c */
        public boolean f664c = false;

        public C0199g() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m1230c() {
            Runnable runnable = this.f663b;
            if (runnable != null) {
                runnable.run();
                this.f663b = null;
            }
        }

        /* renamed from: M */
        public void mo755M(@C0359n0 View view) {
            if (!this.f664c) {
                this.f664c = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }

        public void execute(Runnable runnable) {
            this.f663b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f664c) {
                decorView.postOnAnimation(new C0247n(this));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        /* renamed from: g */
        public void mo756g() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public void onDraw() {
            Runnable runnable = this.f663b;
            if (runnable != null) {
                runnable.run();
                this.f663b = null;
                if (ComponentActivity.this.f647y.mo850e()) {
                    this.f664c = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                }
            } else if (SystemClock.uptimeMillis() > this.f662a) {
                this.f664c = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$h */
    public static class C0200h implements C0198f {

        /* renamed from: a */
        public final Handler f666a = mo760a();

        /* renamed from: M */
        public void mo755M(@C0359n0 View view) {
        }

        @C0359n0
        /* renamed from: a */
        public final Handler mo760a() {
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                myLooper = Looper.getMainLooper();
            }
            return new Handler(myLooper);
        }

        public void execute(Runnable runnable) {
            this.f666a.postAtFrontOfQueue(runnable);
        }

        /* renamed from: g */
        public void mo756g() {
        }
    }

    public ComponentActivity() {
        this.f639c = new C0232b();
        this.f640d = new C18412x0(new C0241i(this));
        this.f641e = new C19512y(this);
        C20435d a = C20435d.m95271a(this);
        this.f642f = a;
        this.f645w = new OnBackPressedDispatcher(new C0191a());
        C0198f R = mo698R();
        this.f646x = R;
        this.f647y = new C0251r(R, new C0242j(this));
        this.f636X = new AtomicInteger();
        this.f637Y = new C0192b();
        this.f638Z = new CopyOnWriteArrayList<>();
        this.f630E0 = new CopyOnWriteArrayList<>();
        this.f631F0 = new CopyOnWriteArrayList<>();
        this.f632G0 = new CopyOnWriteArrayList<>();
        this.f633H0 = new CopyOnWriteArrayList<>();
        this.f634I0 = false;
        this.f635J0 = false;
        if (getLifecycle() != null) {
            getLifecycle().mo57464a(new C19470t() {
                /* renamed from: i */
                public void mo750i(@C0359n0 C19499w wVar, @C0359n0 Lifecycle.C19372Event event) {
                    View view;
                    if (event == Lifecycle.C19372Event.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            C0195c.m1225a(view);
                        }
                    }
                }
            });
            getLifecycle().mo57464a(new C19470t() {
                /* renamed from: i */
                public void mo750i(@C0359n0 C19499w wVar, @C0359n0 Lifecycle.C19372Event event) {
                    if (event == Lifecycle.C19372Event.ON_DESTROY) {
                        ComponentActivity.this.f639c.mo826b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().mo57550a();
                        }
                        ComponentActivity.this.f646x.mo756g();
                    }
                }
            });
            getLifecycle().mo57464a(new C19470t() {
                /* renamed from: i */
                public void mo750i(@C0359n0 C19499w wVar, @C0359n0 Lifecycle.C19372Event event) {
                    ComponentActivity.this.mo699S();
                    ComponentActivity.this.getLifecycle().mo57467d(this);
                }
            });
            a.mo61296c();
            SavedStateHandleSupport.m90591c(this);
            getSavedStateRegistry().mo61291j(f629K0, new C0243k(this));
            mo739s(new C0245l(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: U */
    private void mo1492U() {
        ViewTreeLifecycleOwner.m90621b(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.m90625b(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.m95252b(getWindow().getDecorView(), this);
        ViewTreeOnBackPressedDispatcherOwner.m1268b(getWindow().getDecorView(), this);
        ViewTreeFullyDrawnReporterOwner.m1264b(getWindow().getDecorView(), this);
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ C11079d2 m1193V() {
        reportFullyDrawn();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ Bundle m1194W() {
        Bundle bundle = new Bundle();
        this.f637Y.mo878h(bundle);
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m1195X(Context context) {
        Bundle b = getSavedStateRegistry().mo61284b(f629K0);
        if (b != null) {
            this.f637Y.mo877g(b);
        }
    }

    /* renamed from: A */
    public final void mo692A(@C0359n0 C0233c cVar) {
        this.f639c.mo829e(cVar);
    }

    /* renamed from: C */
    public final void mo693C(@C0359n0 C17970d<C17055d0> dVar) {
        this.f632G0.add(dVar);
    }

    /* renamed from: D */
    public final void mo694D(@C0359n0 C17970d<Intent> dVar) {
        this.f631F0.remove(dVar);
    }

    /* renamed from: F */
    public final void mo695F(@C0359n0 C17970d<Configuration> dVar) {
        this.f638Z.remove(dVar);
    }

    /* renamed from: H */
    public void mo696H(@C0359n0 C18318n1 n1Var) {
        this.f640d.mo53085c(n1Var);
    }

    /* renamed from: I */
    public void mo697I() {
        invalidateOptionsMenu();
    }

    /* renamed from: R */
    public final C0198f mo698R() {
        return new C0199g();
    }

    /* renamed from: S */
    public void mo699S() {
        if (this.f643g == null) {
            C0197e eVar = (C0197e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.f643g = eVar.f661b;
            }
            if (this.f643g == null) {
                this.f643g = new C19392a1();
            }
        }
    }

    @C0363p0
    @Deprecated
    /* renamed from: T */
    public Object mo700T() {
        C0197e eVar = (C0197e) getLastNonConfigurationInstance();
        if (eVar != null) {
            return eVar.f660a;
        }
        return null;
    }

    @C0363p0
    @Deprecated
    /* renamed from: Y */
    public Object mo701Y() {
        return null;
    }

    @C0359n0
    /* renamed from: Z */
    public final OnBackPressedDispatcher mo702Z() {
        return this.f645w;
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        mo1492U();
        this.f646x.mo755M(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @C0359n0
    /* renamed from: c */
    public C0251r mo704c() {
        return this.f647y;
    }

    /* renamed from: d */
    public final void mo705d(@C0359n0 C17970d<Configuration> dVar) {
        this.f638Z.add(dVar);
    }

    /* renamed from: e */
    public final void mo706e(@C0359n0 C17970d<C17124h5> dVar) {
        this.f633H0.remove(dVar);
    }

    /* renamed from: f */
    public final void mo707f(@C0359n0 C17970d<Integer> dVar) {
        this.f630E0.remove(dVar);
    }

    @C0363p0
    /* renamed from: g */
    public Context mo708g() {
        return this.f639c.mo828d();
    }

    @C0359n0
    @C0346i
    public C19477a getDefaultViewModelCreationExtras() {
        C19492e eVar = new C19492e();
        if (getApplication() != null) {
            eVar.mo57690c(C19502x0.C19503a.f49893i, getApplication());
        }
        eVar.mo57690c(SavedStateHandleSupport.f49731c, this);
        eVar.mo57690c(SavedStateHandleSupport.f49732d, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            eVar.mo57690c(SavedStateHandleSupport.f49733e, getIntent().getExtras());
        }
        return eVar;
    }

    @C0359n0
    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (this.f644v == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.f644v = new C19463r0(application, this, bundle);
        }
        return this.f644v;
    }

    @C0359n0
    public Lifecycle getLifecycle() {
        return this.f641e;
    }

    @C0359n0
    public final C20431c getSavedStateRegistry() {
        return this.f642f.mo61295b();
    }

    @C0359n0
    public C19392a1 getViewModelStore() {
        if (getApplication() != null) {
            mo699S();
            return this.f643g;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: h */
    public final void mo714h(@C0359n0 C17970d<C17124h5> dVar) {
        this.f633H0.add(dVar);
    }

    @C0359n0
    /* renamed from: i */
    public final ActivityResultRegistry mo715i() {
        return this.f637Y;
    }

    @Deprecated
    @C0346i
    public void onActivityResult(int i, int i2, @C0363p0 Intent intent) {
        if (!this.f637Y.mo873b(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @C0353k0
    public void onBackPressed() {
        this.f645w.mo767f();
    }

    @C0346i
    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<C17970d<Configuration>> it = this.f638Z.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @C0368r0(markerClass = {C17772a.C17773a.class})
    public void onCreate(@C0363p0 Bundle bundle) {
        this.f642f.mo61297d(bundle);
        this.f639c.mo827c(this);
        super.onCreate(bundle);
        C19448n0.m90743g(this);
        if (C17772a.m81155k()) {
            this.f645w.mo768g(C0196d.m1226a(this));
        }
        int i = this.f648z;
        if (i != 0) {
            setContentView(i);
        }
    }

    public boolean onCreatePanelMenu(int i, @C0359n0 Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.f640d.mo53088h(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i, @C0359n0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f640d.mo53090j(menuItem);
        }
        return false;
    }

    @C0346i
    public void onMultiWindowModeChanged(boolean z) {
        if (!this.f634I0) {
            Iterator<C17970d<C17055d0>> it = this.f632G0.iterator();
            while (it.hasNext()) {
                it.next().accept(new C17055d0(z));
            }
        }
    }

    @C0346i
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<C17970d<Intent>> it = this.f631F0.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i, @C0359n0 Menu menu) {
        this.f640d.mo53089i(menu);
        super.onPanelClosed(i, menu);
    }

    @C0346i
    public void onPictureInPictureModeChanged(boolean z) {
        if (!this.f635J0) {
            Iterator<C17970d<C17124h5>> it = this.f633H0.iterator();
            while (it.hasNext()) {
                it.next().accept(new C17124h5(z));
            }
        }
    }

    public boolean onPreparePanel(int i, @C0363p0 View view, @C0359n0 Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.f640d.mo53091k(menu);
        return true;
    }

    @Deprecated
    @C0346i
    public void onRequestPermissionsResult(int i, @C0359n0 String[] strArr, @C0359n0 int[] iArr) {
        if (!this.f637Y.mo873b(i, -1, new Intent().putExtra(C0268b.C0287k.f815c, strArr).putExtra(C0268b.C0287k.f816d, iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @C0363p0
    public final Object onRetainNonConfigurationInstance() {
        C0197e eVar;
        Object Y = mo701Y();
        C19392a1 a1Var = this.f643g;
        if (a1Var == null && (eVar = (C0197e) getLastNonConfigurationInstance()) != null) {
            a1Var = eVar.f661b;
        }
        if (a1Var == null && Y == null) {
            return null;
        }
        C0197e eVar2 = new C0197e();
        eVar2.f660a = Y;
        eVar2.f661b = a1Var;
        return eVar2;
    }

    @C0346i
    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof C19512y) {
            ((C19512y) lifecycle).mo57711s(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f642f.mo61298e(bundle);
    }

    @C0346i
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<C17970d<Integer>> it = this.f630E0.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    /* renamed from: p */
    public final void mo733p(@C0359n0 C17970d<Integer> dVar) {
        this.f630E0.add(dVar);
    }

    /* renamed from: q */
    public final void mo734q(@C0359n0 C17970d<Intent> dVar) {
        this.f631F0.add(dVar);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: r */
    public void mo735r(@C0359n0 C18318n1 n1Var, @C0359n0 C19499w wVar, @C0359n0 Lifecycle.State state) {
        this.f640d.mo53087e(n1Var, wVar, state);
    }

    @C0359n0
    public final <I, O> C0302g<I> registerForActivityResult(@C0359n0 C0266a<I, O> aVar, @C0359n0 ActivityResultRegistry activityResultRegistry, @C0359n0 C0263a<O> aVar2) {
        return activityResultRegistry.mo880j("activity_rq#" + this.f636X.getAndIncrement(), this, aVar, aVar2);
    }

    public void reportFullyDrawn() {
        try {
            if (C20530b.m95657h()) {
                C20530b.m95652c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.f647y.mo849d();
        } finally {
            C20530b.m95655f();
        }
    }

    /* renamed from: s */
    public final void mo739s(@C0359n0 C0233c cVar) {
        this.f639c.mo825a(cVar);
    }

    public void setContentView(@C0347i0 int i) {
        mo1492U();
        this.f646x.mo755M(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Deprecated
    public void startActivityForResult(@C0359n0 Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startIntentSenderForResult(@C0359n0 IntentSender intentSender, int i, @C0363p0 Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    /* renamed from: u */
    public final void mo747u(@C0359n0 C17970d<C17055d0> dVar) {
        this.f632G0.remove(dVar);
    }

    /* renamed from: v */
    public void mo748v(@C0359n0 C18318n1 n1Var, @C0359n0 C19499w wVar) {
        this.f640d.mo53086d(n1Var, wVar);
    }

    /* renamed from: x */
    public void mo749x(@C0359n0 C18318n1 n1Var) {
        this.f640d.mo53092l(n1Var);
    }

    @Deprecated
    public void startActivityForResult(@C0359n0 Intent intent, int i, @C0363p0 Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@C0359n0 IntentSender intentSender, int i, @C0363p0 Intent intent, int i2, int i3, int i4, @C0363p0 Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* JADX INFO: finally extract failed */
    @C0376v0(api = 26)
    @C0346i
    public void onMultiWindowModeChanged(boolean z, @C0359n0 Configuration configuration) {
        this.f634I0 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f634I0 = false;
            Iterator<C17970d<C17055d0>> it = this.f632G0.iterator();
            while (it.hasNext()) {
                it.next().accept(new C17055d0(z, configuration));
            }
        } catch (Throwable th) {
            this.f634I0 = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @C0376v0(api = 26)
    @C0346i
    public void onPictureInPictureModeChanged(boolean z, @C0359n0 Configuration configuration) {
        this.f635J0 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f635J0 = false;
            Iterator<C17970d<C17124h5>> it = this.f633H0.iterator();
            while (it.hasNext()) {
                it.next().accept(new C17124h5(z, configuration));
            }
        } catch (Throwable th) {
            this.f635J0 = false;
            throw th;
        }
    }

    @C0359n0
    public final <I, O> C0302g<I> registerForActivityResult(@C0359n0 C0266a<I, O> aVar, @C0359n0 C0263a<O> aVar2) {
        return registerForActivityResult(aVar, this.f637Y, aVar2);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        mo1492U();
        this.f646x.mo755M(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        mo1492U();
        this.f646x.mo755M(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @C0360o
    public ComponentActivity(@C0347i0 int i) {
        this();
        this.f648z = i;
    }
}
