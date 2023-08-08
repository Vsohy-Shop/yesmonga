package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0351j1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.C19215c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.preference.C19966s;
import androidx.preference.C19975v;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.preference.m */
public abstract class C19944m extends Fragment implements C19966s.C19969c, C19966s.C19967a, C19966s.C19968b, DialogPreference.C19890a {

    /* renamed from: X */
    public static final String f51040X = "androidx.preference.PreferenceFragment.DIALOG";

    /* renamed from: Y */
    public static final int f51041Y = 1;

    /* renamed from: x */
    public static final String f51042x = "PreferenceFragment";

    /* renamed from: y */
    public static final String f51043y = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";

    /* renamed from: z */
    public static final String f51044z = "android:preferences";

    /* renamed from: a */
    public final C19948d f51045a = new C19948d();

    /* renamed from: b */
    public C19966s f51046b;

    /* renamed from: c */
    public RecyclerView f51047c;

    /* renamed from: d */
    public boolean f51048d;

    /* renamed from: e */
    public boolean f51049e;

    /* renamed from: f */
    public int f51050f = C19975v.C19983h.preference_list_fragment;

    /* renamed from: g */
    public Runnable f51051g;

    /* renamed from: v */
    public final Handler f51052v = new C19945a(Looper.getMainLooper());

    /* renamed from: w */
    public final Runnable f51053w = new C19946b();

    /* renamed from: androidx.preference.m$a */
    public class C19945a extends Handler {
        public C19945a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                C19944m.this.mo59113J0();
            }
        }
    }

    /* renamed from: androidx.preference.m$b */
    public class C19946b implements Runnable {
        public C19946b() {
        }

        public void run() {
            RecyclerView recyclerView = C19944m.this.f51047c;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* renamed from: androidx.preference.m$c */
    public class C19947c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Preference f51056a;

        /* renamed from: b */
        public final /* synthetic */ String f51057b;

        public C19947c(Preference preference, String str) {
            this.f51056a = preference;
            this.f51057b = str;
        }

        public void run() {
            int i;
            RecyclerView.Adapter adapter = C19944m.this.f51047c.getAdapter();
            if (adapter instanceof PreferenceGroup.C19908c) {
                Preference preference = this.f51056a;
                if (preference != null) {
                    i = ((PreferenceGroup.C19908c) adapter).mo58959e(preference);
                } else {
                    i = ((PreferenceGroup.C19908c) adapter).mo58960j(this.f51057b);
                }
                if (i != -1) {
                    C19944m.this.f51047c.mo59479G1(i);
                } else {
                    adapter.registerAdapterDataObserver(new C19952h(adapter, C19944m.this.f51047c, this.f51056a, this.f51057b));
                }
            } else if (adapter != null) {
                throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
            }
        }
    }

    /* renamed from: androidx.preference.m$d */
    public class C19948d extends RecyclerView.C20075n {

        /* renamed from: a */
        public Drawable f51059a;

        /* renamed from: b */
        public int f51060b;

        /* renamed from: c */
        public boolean f51061c = true;

        public C19948d() {
        }

        /* renamed from: g */
        public void mo59102g(@C0359n0 Rect rect, @C0359n0 View view, @C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView.C20055b0 b0Var) {
            if (mo59139o(view, recyclerView)) {
                rect.bottom = this.f51060b;
            }
        }

        /* renamed from: k */
        public void mo59103k(@C0359n0 Canvas canvas, @C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView.C20055b0 b0Var) {
            if (this.f51059a != null) {
                int childCount = recyclerView.getChildCount();
                int width = recyclerView.getWidth();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    if (mo59139o(childAt, recyclerView)) {
                        int y = ((int) childAt.getY()) + childAt.getHeight();
                        this.f51059a.setBounds(0, y, width, this.f51060b + y);
                        this.f51059a.draw(canvas);
                    }
                }
            }
        }

        /* renamed from: l */
        public void mo59136l(boolean z) {
            this.f51061c = z;
        }

        /* renamed from: m */
        public void mo59137m(Drawable drawable) {
            if (drawable != null) {
                this.f51060b = drawable.getIntrinsicHeight();
            } else {
                this.f51060b = 0;
            }
            this.f51059a = drawable;
            C19944m.this.f51047c.mo59490K0();
        }

        /* renamed from: n */
        public void mo59138n(int i) {
            this.f51060b = i;
            C19944m.this.f51047c.mo59490K0();
        }

        /* renamed from: o */
        public final boolean mo59139o(View view, RecyclerView recyclerView) {
            boolean z;
            RecyclerView.C20061e0 t0 = recyclerView.mo59648t0(view);
            boolean z2 = false;
            if (!(t0 instanceof C19974u) || !((C19974u) t0).mo59216f()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
            boolean z3 = this.f51061c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z3;
            }
            RecyclerView.C20061e0 t02 = recyclerView.mo59648t0(recyclerView.getChildAt(indexOfChild + 1));
            if ((t02 instanceof C19974u) && ((C19974u) t02).mo59215e()) {
                z2 = true;
            }
            return z2;
        }
    }

    /* renamed from: androidx.preference.m$e */
    public interface C19949e {
        /* renamed from: a */
        boolean mo59140a(@C0359n0 C19944m mVar, @C0359n0 Preference preference);
    }

    /* renamed from: androidx.preference.m$f */
    public interface C19950f {
        /* renamed from: q0 */
        boolean mo59141q0(@C0359n0 C19944m mVar, @C0359n0 Preference preference);
    }

    /* renamed from: androidx.preference.m$g */
    public interface C19951g {
        /* renamed from: a */
        boolean mo59142a(@C0359n0 C19944m mVar, @C0359n0 PreferenceScreen preferenceScreen);
    }

    /* renamed from: androidx.preference.m$h */
    public static class C19952h extends RecyclerView.C20065i {

        /* renamed from: a */
        public final RecyclerView.Adapter<?> f51063a;

        /* renamed from: b */
        public final RecyclerView f51064b;

        /* renamed from: c */
        public final Preference f51065c;

        /* renamed from: d */
        public final String f51066d;

        public C19952h(RecyclerView.Adapter<?> adapter, RecyclerView recyclerView, Preference preference, String str) {
            this.f51063a = adapter;
            this.f51064b = recyclerView;
            this.f51065c = preference;
            this.f51066d = str;
        }

        /* renamed from: a */
        public void mo30655a() {
            mo59143h();
        }

        /* renamed from: b */
        public void mo30656b(int i, int i2) {
            mo59143h();
        }

        /* renamed from: c */
        public void mo30657c(int i, int i2, Object obj) {
            mo59143h();
        }

        /* renamed from: d */
        public void mo30658d(int i, int i2) {
            mo59143h();
        }

        /* renamed from: e */
        public void mo30659e(int i, int i2, int i3) {
            mo59143h();
        }

        /* renamed from: f */
        public void mo30660f(int i, int i2) {
            mo59143h();
        }

        /* renamed from: h */
        public final void mo59143h() {
            int i;
            this.f51063a.unregisterAdapterDataObserver(this);
            Preference preference = this.f51065c;
            if (preference != null) {
                i = ((PreferenceGroup.C19908c) this.f51063a).mo58959e(preference);
            } else {
                i = ((PreferenceGroup.C19908c) this.f51063a).mo58960j(this.f51066d);
            }
            if (i != -1) {
                this.f51064b.mo59479G1(i);
            }
        }
    }

    /* renamed from: I0 */
    public void mo59112I0(@C0351j1 int i) {
        mo59124V0();
        mo59130b1(this.f51046b.mo59204r(requireContext(), i, mo59117N0()));
    }

    /* renamed from: J0 */
    public void mo59113J0() {
        PreferenceScreen N0 = mo59117N0();
        if (N0 != null) {
            mo59115L0().setAdapter(mo59119P0(N0));
            N0.mo58843L1();
        }
        mo59118O0();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: K0 */
    public Fragment mo59114K0() {
        return null;
    }

    /* renamed from: L0 */
    public final RecyclerView mo59115L0() {
        return this.f51047c;
    }

    /* renamed from: M0 */
    public C19966s mo59116M0() {
        return this.f51046b;
    }

    /* renamed from: N0 */
    public PreferenceScreen mo59117N0() {
        return this.f51046b.mo59200n();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: O0 */
    public void mo59118O0() {
    }

    @C0359n0
    /* renamed from: P0 */
    public RecyclerView.Adapter mo59119P0(@C0359n0 PreferenceScreen preferenceScreen) {
        return new C19953n(preferenceScreen);
    }

    @C0359n0
    /* renamed from: Q0 */
    public RecyclerView.C20076o mo59120Q0() {
        return new LinearLayoutManager(requireContext());
    }

    /* renamed from: R */
    public void mo59067R(@C0359n0 PreferenceScreen preferenceScreen) {
        boolean z;
        if (mo59114K0() instanceof C19951g) {
            z = ((C19951g) mo59114K0()).mo59142a(this, preferenceScreen);
        } else {
            z = false;
        }
        Fragment fragment = this;
        while (!z && fragment != null) {
            if (fragment instanceof C19951g) {
                z = ((C19951g) fragment).mo59142a(this, preferenceScreen);
            }
            fragment = fragment.getParentFragment();
        }
        if (!z && (getContext() instanceof C19951g)) {
            z = ((C19951g) getContext()).mo59142a(this, preferenceScreen);
        }
        if (!z && (getActivity() instanceof C19951g)) {
            ((C19951g) getActivity()).mo59142a(this, preferenceScreen);
        }
    }

    /* renamed from: R0 */
    public abstract void mo35147R0(@C0363p0 Bundle bundle, @C0363p0 String str);

    @C0359n0
    /* renamed from: S0 */
    public RecyclerView mo59121S0(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(C19975v.C19981f.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(C19975v.C19983h.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(mo59120Q0());
        recyclerView2.setAccessibilityDelegateCompat(new C19972t(recyclerView2));
        return recyclerView2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: T0 */
    public void mo59122T0() {
    }

    /* renamed from: U0 */
    public final void mo59123U0() {
        if (!this.f51052v.hasMessages(1)) {
            this.f51052v.obtainMessage(1).sendToTarget();
        }
    }

    /* renamed from: V0 */
    public final void mo59124V0() {
        if (this.f51046b == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    /* renamed from: W0 */
    public void mo59125W0(@C0359n0 Preference preference) {
        mo59127Y0(preference, (String) null);
    }

    /* renamed from: X0 */
    public void mo59126X0(@C0359n0 String str) {
        mo59127Y0((Preference) null, str);
    }

    /* renamed from: Y0 */
    public final void mo59127Y0(@C0363p0 Preference preference, @C0363p0 String str) {
        C19947c cVar = new C19947c(preference, str);
        if (this.f51047c == null) {
            this.f51051g = cVar;
        } else {
            cVar.run();
        }
    }

    /* renamed from: Z0 */
    public void mo59128Z0(@C0363p0 Drawable drawable) {
        this.f51045a.mo59137m(drawable);
    }

    /* renamed from: a1 */
    public void mo59129a1(int i) {
        this.f51045a.mo59138n(i);
    }

    /* renamed from: b1 */
    public void mo59130b1(PreferenceScreen preferenceScreen) {
        if (this.f51046b.mo59183C(preferenceScreen) && preferenceScreen != null) {
            mo59122T0();
            this.f51048d = true;
            if (this.f51049e) {
                mo59123U0();
            }
        }
    }

    /* renamed from: c1 */
    public void mo59131c1(@C0351j1 int i, @C0363p0 String str) {
        mo59124V0();
        PreferenceScreen r = this.f51046b.mo59204r(requireContext(), i, (PreferenceScreen) null);
        Object obj = r;
        if (str != null) {
            Object m3 = r.mo58938m3(str);
            boolean z = m3 instanceof PreferenceScreen;
            obj = m3;
            if (!z) {
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        mo59130b1((PreferenceScreen) obj);
    }

    /* renamed from: d1 */
    public final void mo59132d1() {
        mo59115L0().setAdapter((RecyclerView.Adapter) null);
        PreferenceScreen N0 = mo59117N0();
        if (N0 != null) {
            N0.mo58866Y1();
        }
        mo59122T0();
    }

    @C0363p0
    /* renamed from: f0 */
    public <T extends Preference> T mo58761f0(@C0359n0 CharSequence charSequence) {
        C19966s sVar = this.f51046b;
        if (sVar == null) {
            return null;
        }
        return sVar.mo59191b(charSequence);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        String str;
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(C19975v.C19976a.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = C19975v.C19985j.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        C19966s sVar = new C19966s(requireContext());
        this.f51046b = sVar;
        sVar.mo59209y(this);
        if (getArguments() != null) {
            str = getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        } else {
            str = null;
        }
        mo35147R0(bundle, str);
    }

    @C0359n0
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        TypedArray obtainStyledAttributes = requireContext().obtainStyledAttributes((AttributeSet) null, C19975v.C19986k.PreferenceFragmentCompat, C19975v.C19976a.preferenceFragmentCompatStyle, 0);
        this.f51050f = obtainStyledAttributes.getResourceId(C19975v.C19986k.PreferenceFragmentCompat_android_layout, this.f51050f);
        Drawable drawable = obtainStyledAttributes.getDrawable(C19975v.C19986k.PreferenceFragmentCompat_android_divider);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C19975v.C19986k.PreferenceFragmentCompat_android_dividerHeight, -1);
        boolean z = obtainStyledAttributes.getBoolean(C19975v.C19986k.PreferenceFragmentCompat_allowDividerAfterLastItem, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(requireContext());
        View inflate = cloneInContext.inflate(this.f51050f, viewGroup, false);
        View findViewById = inflate.findViewById(C19915a.f50935b);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView S0 = mo59121S0(cloneInContext, viewGroup2, bundle);
            if (S0 != null) {
                this.f51047c = S0;
                S0.mo59589n(this.f51045a);
                mo59128Z0(drawable);
                if (dimensionPixelSize != -1) {
                    mo59129a1(dimensionPixelSize);
                }
                this.f51045a.mo59136l(z);
                if (this.f51047c.getParent() == null) {
                    viewGroup2.addView(this.f51047c);
                }
                this.f51052v.post(this.f51053w);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    public void onDestroyView() {
        this.f51052v.removeCallbacks(this.f51053w);
        this.f51052v.removeMessages(1);
        if (this.f51048d) {
            mo59132d1();
        }
        this.f51047c = null;
        super.onDestroyView();
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen N0 = mo59117N0();
        if (N0 != null) {
            Bundle bundle2 = new Bundle();
            N0.mo58822A2(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    public void onStart() {
        super.onStart();
        this.f51046b.mo59210z(this);
        this.f51046b.mo59208x(this);
    }

    public void onStop() {
        super.onStop();
        this.f51046b.mo59210z((C19966s.C19969c) null);
        this.f51046b.mo59208x((C19966s.C19967a) null);
    }

    public void onViewCreated(@C0359n0 View view, @C0363p0 Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen N0;
        super.onViewCreated(view, bundle);
        if (!(bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (N0 = mo59117N0()) == null)) {
            N0.mo58922z2(bundle2);
        }
        if (this.f51048d) {
            mo59113J0();
            Runnable runnable = this.f51051g;
            if (runnable != null) {
                runnable.run();
                this.f51051g = null;
            }
        }
        this.f51049e = true;
    }

    /* renamed from: u0 */
    public void mo59096u0(@C0359n0 Preference preference) {
        boolean z;
        C19215c cVar;
        if (mo59114K0() instanceof C19949e) {
            z = ((C19949e) mo59114K0()).mo59140a(this, preference);
        } else {
            z = false;
        }
        Fragment fragment = this;
        while (!z && fragment != null) {
            if (fragment instanceof C19949e) {
                z = ((C19949e) fragment).mo59140a(this, preference);
            }
            fragment = fragment.getParentFragment();
        }
        if (!z && (getContext() instanceof C19949e)) {
            z = ((C19949e) getContext()).mo59140a(this, preference);
        }
        if (!z && (getActivity() instanceof C19949e)) {
            z = ((C19949e) getActivity()).mo59140a(this, preference);
        }
        if (!z && getParentFragmentManager().mo56903s0("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                cVar = C19917c.m92656U0(preference.mo58889j0());
            } else if (preference instanceof ListPreference) {
                cVar = C19922f.m92673T0(preference.mo58889j0());
            } else if (preference instanceof MultiSelectListPreference) {
                cVar = C19926h.m92681T0(preference.mo58889j0());
            } else {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            cVar.setTargetFragment(this, 0);
            cVar.show(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    /* renamed from: x0 */
    public boolean mo59098x0(@C0359n0 Preference preference) {
        boolean z;
        if (preference.mo58878e0() == null) {
            return false;
        }
        if (mo59114K0() instanceof C19950f) {
            z = ((C19950f) mo59114K0()).mo59141q0(this, preference);
        } else {
            z = false;
        }
        Fragment fragment = this;
        while (!z && fragment != null) {
            if (fragment instanceof C19950f) {
                z = ((C19950f) fragment).mo59141q0(this, preference);
            }
            fragment = fragment.getParentFragment();
        }
        if (!z && (getContext() instanceof C19950f)) {
            z = ((C19950f) getContext()).mo59141q0(this, preference);
        }
        if (!z && (getActivity() instanceof C19950f)) {
            z = ((C19950f) getActivity()).mo59141q0(this, preference);
        }
        if (z) {
            return true;
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle X = preference.mo58864X();
        Fragment a = parentFragmentManager.mo56801G0().mo56932a(requireActivity().getClassLoader(), preference.mo58878e0());
        a.setArguments(X);
        a.setTargetFragment(this, 0);
        parentFragmentManager.mo56909u().mo57201C(((View) requireView().getParent()).getId(), a).mo57225o((String) null).mo57052q();
        return true;
    }
}
