package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C0213a0;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0304i;
import androidx.annotation.C0346i;
import androidx.annotation.C0347i0;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0360o;
import androidx.annotation.C0363p0;
import androidx.core.app.C17018b;
import androidx.core.app.C17052c6;
import androidx.core.app.C17055d0;
import androidx.core.app.C17124h5;
import androidx.core.app.C17193o4;
import androidx.core.app.C17211q4;
import androidx.core.content.C17363o0;
import androidx.core.content.C17365p0;
import androidx.core.util.C17970d;
import androidx.core.view.C18318n1;
import androidx.core.view.C18383u0;
import androidx.lifecycle.C19392a1;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19512y;
import androidx.lifecycle.Lifecycle;
import androidx.loader.app.C19530a;
import androidx.savedstate.C20431c;
import androidx.savedstate.C20437e;
import com.bumptech.glide.load.engine.GlideException;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.h */
public class C19232h extends ComponentActivity implements C17018b.C17027i, C17018b.C17029k {

    /* renamed from: Q0 */
    public static final String f49464Q0 = "android:support:lifecycle";

    /* renamed from: L0 */
    public final C19242k f49465L0 = C19242k.m90220b(new C19233a());

    /* renamed from: M0 */
    public final C19512y f49466M0 = new C19512y(this);

    /* renamed from: N0 */
    public boolean f49467N0;

    /* renamed from: O0 */
    public boolean f49468O0;

    /* renamed from: P0 */
    public boolean f49469P0 = true;

    /* renamed from: androidx.fragment.app.h$a */
    public class C19233a extends C19253m<C19232h> implements C17363o0, C17365p0, C17193o4, C17211q4, C19395b1, C0213a0, C0304i, C20437e, C19198a0, C18383u0 {
        public C19233a() {
            super(C19232h.this);
        }

        /* renamed from: C */
        public void mo693C(@C0359n0 C17970d<C17055d0> dVar) {
            C19232h.this.mo693C(dVar);
        }

        /* renamed from: D */
        public void mo57192D() {
            mo697I();
        }

        /* renamed from: E */
        public C19232h mo57195n() {
            return C19232h.this;
        }

        /* renamed from: F */
        public void mo695F(@C0359n0 C17970d<Configuration> dVar) {
            C19232h.this.mo695F(dVar);
        }

        /* renamed from: H */
        public void mo696H(@C0359n0 C18318n1 n1Var) {
            C19232h.this.mo696H(n1Var);
        }

        /* renamed from: I */
        public void mo697I() {
            C19232h.this.invalidateOptionsMenu();
        }

        @C0359n0
        /* renamed from: Z */
        public OnBackPressedDispatcher mo702Z() {
            return C19232h.this.mo702Z();
        }

        /* renamed from: a */
        public void mo56935a(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment) {
            C19232h.this.mo57182p0(fragment);
        }

        @C0363p0
        /* renamed from: c */
        public View mo56759c(int i) {
            return C19232h.this.findViewById(i);
        }

        /* renamed from: d */
        public void mo705d(@C0359n0 C17970d<Configuration> dVar) {
            C19232h.this.mo705d(dVar);
        }

        /* renamed from: e */
        public void mo706e(@C0359n0 C17970d<C17124h5> dVar) {
            C19232h.this.mo706e(dVar);
        }

        /* renamed from: f */
        public void mo707f(@C0359n0 C17970d<Integer> dVar) {
            C19232h.this.mo707f(dVar);
        }

        /* renamed from: g */
        public boolean mo56760g() {
            Window window = C19232h.this.getWindow();
            if (window == null || window.peekDecorView() == null) {
                return false;
            }
            return true;
        }

        @C0359n0
        public Lifecycle getLifecycle() {
            return C19232h.this.f49466M0;
        }

        @C0359n0
        public C20431c getSavedStateRegistry() {
            return C19232h.this.getSavedStateRegistry();
        }

        @C0359n0
        public C19392a1 getViewModelStore() {
            return C19232h.this.getViewModelStore();
        }

        /* renamed from: h */
        public void mo714h(@C0359n0 C17970d<C17124h5> dVar) {
            C19232h.this.mo714h(dVar);
        }

        @C0359n0
        /* renamed from: i */
        public ActivityResultRegistry mo715i() {
            return C19232h.this.mo715i();
        }

        /* renamed from: m */
        public void mo57194m(@C0359n0 String str, @C0363p0 FileDescriptor fileDescriptor, @C0359n0 PrintWriter printWriter, @C0363p0 String[] strArr) {
            C19232h.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @C0359n0
        /* renamed from: o */
        public LayoutInflater mo57196o() {
            return C19232h.this.getLayoutInflater().cloneInContext(C19232h.this);
        }

        /* renamed from: p */
        public void mo733p(@C0359n0 C17970d<Integer> dVar) {
            C19232h.this.mo733p(dVar);
        }

        /* renamed from: q */
        public int mo57197q() {
            Window window = C19232h.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        /* renamed from: r */
        public void mo735r(@C0359n0 C18318n1 n1Var, @C0359n0 C19499w wVar, @C0359n0 Lifecycle.State state) {
            C19232h.this.mo735r(n1Var, wVar, state);
        }

        /* renamed from: s */
        public boolean mo57198s() {
            return C19232h.this.getWindow() != null;
        }

        /* renamed from: u */
        public void mo747u(@C0359n0 C17970d<C17055d0> dVar) {
            C19232h.this.mo747u(dVar);
        }

        /* renamed from: v */
        public void mo748v(@C0359n0 C18318n1 n1Var, @C0359n0 C19499w wVar) {
            C19232h.this.mo748v(n1Var, wVar);
        }

        /* renamed from: w */
        public boolean mo57199w(@C0359n0 Fragment fragment) {
            return !C19232h.this.isFinishing();
        }

        /* renamed from: x */
        public void mo749x(@C0359n0 C18318n1 n1Var) {
            C19232h.this.mo749x(n1Var);
        }

        /* renamed from: y */
        public boolean mo57200y(@C0359n0 String str) {
            return C17018b.m78749P(C19232h.this, str);
        }
    }

    public C19232h() {
        mo57177i0();
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public /* synthetic */ Bundle m90111j0() {
        mo57178n0();
        this.f49466M0.mo57705l(Lifecycle.C19372Event.ON_STOP);
        return new Bundle();
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public /* synthetic */ void m90112k0(Configuration configuration) {
        this.f49465L0.mo57239F();
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public /* synthetic */ void m90113l0(Intent intent) {
        this.f49465L0.mo57239F();
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public /* synthetic */ void m90114m0(Context context) {
        this.f49465L0.mo57250a((Fragment) null);
    }

    /* renamed from: o0 */
    public static boolean m90115o0(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean z = false;
        for (Fragment next : fragmentManager.mo56807I0()) {
            if (next != null) {
                if (next.getHost() != null) {
                    z |= m90115o0(next.getChildFragmentManager(), state);
                }
                C19254m0 m0Var = next.mViewLifecycleOwner;
                if (m0Var != null && m0Var.getLifecycle().mo57465b().mo57474q(Lifecycle.State.STARTED)) {
                    next.mViewLifecycleOwner.mo57325f(state);
                    z = true;
                }
                if (next.mLifecycleRegistry.mo57465b().mo57474q(Lifecycle.State.STARTED)) {
                    next.mLifecycleRegistry.mo57711s(state);
                    z = true;
                }
            }
        }
        return z;
    }

    public void dump(@C0359n0 String str, @C0363p0 FileDescriptor fileDescriptor, @C0359n0 PrintWriter printWriter, @C0363p0 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (mo51643L(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + GlideException.C22148a.f56917d;
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f49467N0);
            printWriter.print(" mResumed=");
            printWriter.print(this.f49468O0);
            printWriter.print(" mStopped=");
            printWriter.print(this.f49469P0);
            if (getApplication() != null) {
                C19530a.m90901d(this).mo57721b(str2, fileDescriptor, printWriter, strArr);
            }
            this.f49465L0.mo57237D().mo56873e0(str, fileDescriptor, printWriter, strArr);
        }
    }

    @C0363p0
    /* renamed from: f0 */
    public final View mo57174f0(@C0363p0 View view, @C0359n0 String str, @C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        return this.f49465L0.mo57240G(view, str, context, attributeSet);
    }

    @C0359n0
    /* renamed from: g0 */
    public FragmentManager mo57175g0() {
        return this.f49465L0.mo57237D();
    }

    @C0359n0
    @Deprecated
    /* renamed from: h0 */
    public C19530a mo57176h0() {
        return C19530a.m90901d(this);
    }

    /* renamed from: i0 */
    public final void mo57177i0() {
        getSavedStateRegistry().mo61291j(f49464Q0, new C19222d(this));
        mo705d(new C19224e(this));
        mo734q(new C19228f(this));
        mo739s(new C19230g(this));
    }

    /* renamed from: n0 */
    public void mo57178n0() {
        do {
        } while (m90115o0(mo57175g0(), Lifecycle.State.CREATED));
    }

    @C0346i
    public void onActivityResult(int i, int i2, @C0363p0 Intent intent) {
        this.f49465L0.mo57239F();
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        this.f49466M0.mo57705l(Lifecycle.C19372Event.ON_CREATE);
        this.f49465L0.mo57254f();
    }

    @C0363p0
    public View onCreateView(@C0363p0 View view, @C0359n0 String str, @C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        View f0 = mo57174f0(view, str, context, attributeSet);
        return f0 == null ? super.onCreateView(view, str, context, attributeSet) : f0;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f49465L0.mo57256h();
        this.f49466M0.mo57705l(Lifecycle.C19372Event.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i, @C0359n0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.f49465L0.mo57253e(menuItem);
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.f49468O0 = false;
        this.f49465L0.mo57262n();
        this.f49466M0.mo57705l(Lifecycle.C19372Event.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        mo57183q0();
    }

    @C0346i
    public void onRequestPermissionsResult(int i, @C0359n0 String[] strArr, @C0359n0 int[] iArr) {
        this.f49465L0.mo57239F();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        this.f49465L0.mo57239F();
        super.onResume();
        this.f49468O0 = true;
        this.f49465L0.mo57274z();
    }

    public void onStart() {
        this.f49465L0.mo57239F();
        super.onStart();
        this.f49469P0 = false;
        if (!this.f49467N0) {
            this.f49467N0 = true;
            this.f49465L0.mo57251c();
        }
        this.f49465L0.mo57274z();
        this.f49466M0.mo57705l(Lifecycle.C19372Event.ON_START);
        this.f49465L0.mo57267s();
    }

    public void onStateNotSaved() {
        this.f49465L0.mo57239F();
    }

    public void onStop() {
        super.onStop();
        this.f49469P0 = true;
        mo57178n0();
        this.f49465L0.mo57268t();
        this.f49466M0.mo57705l(Lifecycle.C19372Event.ON_STOP);
    }

    @C0353k0
    @Deprecated
    /* renamed from: p0 */
    public void mo57182p0(@C0359n0 Fragment fragment) {
    }

    /* renamed from: q0 */
    public void mo57183q0() {
        this.f49466M0.mo57705l(Lifecycle.C19372Event.ON_RESUME);
        this.f49465L0.mo57266r();
    }

    /* renamed from: r0 */
    public void mo57184r0(@C0363p0 C17052c6 c6Var) {
        C17018b.m78745L(this, c6Var);
    }

    /* renamed from: s0 */
    public void mo57185s0(@C0363p0 C17052c6 c6Var) {
        C17018b.m78746M(this, c6Var);
    }

    /* renamed from: t0 */
    public void mo57186t0(@C0359n0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        mo57187u0(fragment, intent, i, (Bundle) null);
    }

    /* renamed from: u0 */
    public void mo57187u0(@C0359n0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @C0363p0 Bundle bundle) {
        if (i == -1) {
            C17018b.m78750Q(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    /* renamed from: v0 */
    public void mo57188v0(@C0359n0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @C0363p0 Intent intent, int i2, int i3, int i4, @C0363p0 Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            C17018b.m78751R(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    @Deprecated
    /* renamed from: w */
    public final void mo51190w(int i) {
    }

    /* renamed from: w0 */
    public void mo57189w0() {
        C17018b.m78734A(this);
    }

    @Deprecated
    /* renamed from: x0 */
    public void mo1512x0() {
        invalidateOptionsMenu();
    }

    /* renamed from: y0 */
    public void mo57190y0() {
        C17018b.m78740G(this);
    }

    /* renamed from: z0 */
    public void mo57191z0() {
        C17018b.m78752S(this);
    }

    @C0363p0
    public View onCreateView(@C0359n0 String str, @C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        View f0 = mo57174f0((View) null, str, context, attributeSet);
        return f0 == null ? super.onCreateView(str, context, attributeSet) : f0;
    }

    @C0360o
    public C19232h(@C0347i0 int i) {
        super(i);
        mo57177i0();
    }
}
