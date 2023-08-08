package androidx.preference;

import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0351j1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.C17483q;
import androidx.preference.C19966s;
import androidx.preference.C19975v;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

@Deprecated
/* renamed from: androidx.preference.l */
public abstract class C19935l extends Fragment implements C19966s.C19969c, C19966s.C19967a, C19966s.C19968b, DialogPreference.C19890a {

    /* renamed from: X */
    public static final String f51013X = "androidx.preference.PreferenceFragment.DIALOG";

    /* renamed from: Y */
    public static final int f51014Y = 1;
    @Deprecated

    /* renamed from: y */
    public static final String f51015y = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";

    /* renamed from: z */
    public static final String f51016z = "android:preferences";

    /* renamed from: a */
    public final C19939d f51017a = new C19939d();

    /* renamed from: b */
    public C19966s f51018b;

    /* renamed from: c */
    public RecyclerView f51019c;

    /* renamed from: d */
    public boolean f51020d;

    /* renamed from: e */
    public boolean f51021e;

    /* renamed from: f */
    public Context f51022f;

    /* renamed from: g */
    public int f51023g = C19975v.C19983h.preference_list_fragment;

    /* renamed from: v */
    public Runnable f51024v;

    /* renamed from: w */
    public final Handler f51025w = new C19936a();

    /* renamed from: x */
    public final Runnable f51026x = new C19937b();

    /* renamed from: androidx.preference.l$a */
    public class C19936a extends Handler {
        public C19936a() {
        }

        public void handleMessage(@C0359n0 Message message) {
            if (message.what == 1) {
                C19935l.this.mo59069b();
            }
        }
    }

    /* renamed from: androidx.preference.l$b */
    public class C19937b implements Runnable {
        public C19937b() {
        }

        public void run() {
            RecyclerView recyclerView = C19935l.this.f51019c;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* renamed from: androidx.preference.l$c */
    public class C19938c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Preference f51029a;

        /* renamed from: b */
        public final /* synthetic */ String f51030b;

        public C19938c(Preference preference, String str) {
            this.f51029a = preference;
            this.f51030b = str;
        }

        public void run() {
            int i;
            RecyclerView.Adapter adapter = C19935l.this.f51019c.getAdapter();
            if (adapter instanceof PreferenceGroup.C19908c) {
                Preference preference = this.f51029a;
                if (preference != null) {
                    i = ((PreferenceGroup.C19908c) adapter).mo58959e(preference);
                } else {
                    i = ((PreferenceGroup.C19908c) adapter).mo58960j(this.f51030b);
                }
                if (i != -1) {
                    C19935l.this.f51019c.mo59479G1(i);
                } else {
                    adapter.registerAdapterDataObserver(new C19943h(adapter, C19935l.this.f51019c, this.f51029a, this.f51030b));
                }
            } else if (adapter != null) {
                throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
            }
        }
    }

    /* renamed from: androidx.preference.l$d */
    public class C19939d extends RecyclerView.C20075n {

        /* renamed from: a */
        public Drawable f51032a;

        /* renamed from: b */
        public int f51033b;

        /* renamed from: c */
        public boolean f51034c = true;

        public C19939d() {
        }

        /* renamed from: g */
        public void mo59102g(@C0359n0 Rect rect, @C0359n0 View view, @C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView.C20055b0 b0Var) {
            if (mo59107o(view, recyclerView)) {
                rect.bottom = this.f51033b;
            }
        }

        /* renamed from: k */
        public void mo59103k(@C0359n0 Canvas canvas, @C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView.C20055b0 b0Var) {
            if (this.f51032a != null) {
                int childCount = recyclerView.getChildCount();
                int width = recyclerView.getWidth();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    if (mo59107o(childAt, recyclerView)) {
                        int y = ((int) childAt.getY()) + childAt.getHeight();
                        this.f51032a.setBounds(0, y, width, this.f51033b + y);
                        this.f51032a.draw(canvas);
                    }
                }
            }
        }

        /* renamed from: l */
        public void mo59104l(boolean z) {
            this.f51034c = z;
        }

        /* renamed from: m */
        public void mo59105m(@C0363p0 Drawable drawable) {
            if (drawable != null) {
                this.f51033b = drawable.getIntrinsicHeight();
            } else {
                this.f51033b = 0;
            }
            this.f51032a = drawable;
            C19935l.this.f51019c.mo59490K0();
        }

        /* renamed from: n */
        public void mo59106n(int i) {
            this.f51033b = i;
            C19935l.this.f51019c.mo59490K0();
        }

        /* renamed from: o */
        public final boolean mo59107o(@C0359n0 View view, @C0359n0 RecyclerView recyclerView) {
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
            boolean z3 = this.f51034c;
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

    /* renamed from: androidx.preference.l$e */
    public interface C19940e {
        /* renamed from: a */
        boolean mo59108a(@C0359n0 C19935l lVar, @C0359n0 Preference preference);
    }

    /* renamed from: androidx.preference.l$f */
    public interface C19941f {
        /* renamed from: a */
        boolean mo59109a(@C0359n0 C19935l lVar, @C0359n0 Preference preference);
    }

    /* renamed from: androidx.preference.l$g */
    public interface C19942g {
        /* renamed from: a */
        boolean mo59110a(@C0359n0 C19935l lVar, @C0359n0 PreferenceScreen preferenceScreen);
    }

    /* renamed from: androidx.preference.l$h */
    public static class C19943h extends RecyclerView.C20065i {

        /* renamed from: a */
        public final RecyclerView.Adapter<?> f51036a;

        /* renamed from: b */
        public final RecyclerView f51037b;

        /* renamed from: c */
        public final Preference f51038c;

        /* renamed from: d */
        public final String f51039d;

        public C19943h(@C0359n0 RecyclerView.Adapter<?> adapter, @C0359n0 RecyclerView recyclerView, Preference preference, String str) {
            this.f51036a = adapter;
            this.f51037b = recyclerView;
            this.f51038c = preference;
            this.f51039d = str;
        }

        /* renamed from: a */
        public void mo30655a() {
            mo59111h();
        }

        /* renamed from: b */
        public void mo30656b(int i, int i2) {
            mo59111h();
        }

        /* renamed from: c */
        public void mo30657c(int i, int i2, Object obj) {
            mo59111h();
        }

        /* renamed from: d */
        public void mo30658d(int i, int i2) {
            mo59111h();
        }

        /* renamed from: e */
        public void mo30659e(int i, int i2, int i3) {
            mo59111h();
        }

        /* renamed from: f */
        public void mo30660f(int i, int i2) {
            mo59111h();
        }

        /* renamed from: h */
        public final void mo59111h() {
            int i;
            this.f51036a.unregisterAdapterDataObserver(this);
            Preference preference = this.f51038c;
            if (preference != null) {
                i = ((PreferenceGroup.C19908c) this.f51036a).mo58959e(preference);
            } else {
                i = ((PreferenceGroup.C19908c) this.f51036a).mo58960j(this.f51039d);
            }
            if (i != -1) {
                this.f51037b.mo59479G1(i);
            }
        }
    }

    @Deprecated
    /* renamed from: R */
    public void mo59067R(@C0359n0 PreferenceScreen preferenceScreen) {
        boolean z;
        if (mo59070c() instanceof C19942g) {
            z = ((C19942g) mo59070c()).mo59110a(this, preferenceScreen);
        } else {
            z = false;
        }
        if (!z && (getActivity() instanceof C19942g)) {
            ((C19942g) getActivity()).mo59110a(this, preferenceScreen);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo59068a(@C0351j1 int i) {
        mo59081n();
        mo59094t(this.f51018b.mo59204r(this.f51022f, i, mo59073f()));
    }

    /* renamed from: b */
    public void mo59069b() {
        PreferenceScreen f = mo59073f();
        if (f != null) {
            mo59071d().setAdapter(mo59075h(f));
            f.mo58843L1();
        }
        mo59074g();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    public Fragment mo59070c() {
        return null;
    }

    @Deprecated
    /* renamed from: d */
    public final RecyclerView mo59071d() {
        return this.f51019c;
    }

    @Deprecated
    /* renamed from: e */
    public C19966s mo59072e() {
        return this.f51018b;
    }

    @Deprecated
    /* renamed from: f */
    public PreferenceScreen mo59073f() {
        return this.f51018b.mo59200n();
    }

    @Deprecated
    /* renamed from: f0 */
    public <T extends Preference> T mo58761f0(@C0359n0 CharSequence charSequence) {
        C19966s sVar = this.f51018b;
        if (sVar == null) {
            return null;
        }
        return sVar.mo59191b(charSequence);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: g */
    public void mo59074g() {
    }

    @C0359n0
    @Deprecated
    /* renamed from: h */
    public RecyclerView.Adapter mo59075h(@C0359n0 PreferenceScreen preferenceScreen) {
        return new C19953n(preferenceScreen);
    }

    @C0359n0
    @Deprecated
    /* renamed from: i */
    public RecyclerView.C20076o mo59076i() {
        return new LinearLayoutManager(getActivity());
    }

    @Deprecated
    /* renamed from: j */
    public abstract void mo59077j(@C0363p0 Bundle bundle, String str);

    @C0359n0
    @Deprecated
    /* renamed from: k */
    public RecyclerView mo59078k(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        RecyclerView recyclerView;
        if (this.f51022f.getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(C19975v.C19981f.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(C19975v.C19983h.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(mo59076i());
        recyclerView2.setAccessibilityDelegateCompat(new C19972t(recyclerView2));
        return recyclerView2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: l */
    public void mo59079l() {
    }

    /* renamed from: m */
    public final void mo59080m() {
        if (!this.f51025w.hasMessages(1)) {
            this.f51025w.obtainMessage(1).sendToTarget();
        }
    }

    /* renamed from: n */
    public final void mo59081n() {
        if (this.f51018b == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    @Deprecated
    /* renamed from: o */
    public void mo59082o(@C0359n0 Preference preference) {
        mo59091q(preference, (String) null);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        String str;
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(C19975v.C19976a.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = C19975v.C19985j.PreferenceThemeOverlay;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i);
        this.f51022f = contextThemeWrapper;
        C19966s sVar = new C19966s(contextThemeWrapper);
        this.f51018b = sVar;
        sVar.mo59209y(this);
        if (getArguments() != null) {
            str = getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        } else {
            str = null;
        }
        mo59077j(bundle, str);
    }

    @C0359n0
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        Context context = this.f51022f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C19975v.C19986k.PreferenceFragment, C17483q.m80225a(context, C19975v.C19976a.preferenceFragmentStyle, C19915a.f50937d), 0);
        this.f51023g = obtainStyledAttributes.getResourceId(C19975v.C19986k.PreferenceFragment_android_layout, this.f51023g);
        Drawable drawable = obtainStyledAttributes.getDrawable(C19975v.C19986k.PreferenceFragment_android_divider);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C19975v.C19986k.PreferenceFragment_android_dividerHeight, -1);
        boolean z = obtainStyledAttributes.getBoolean(C19975v.C19986k.PreferenceFragment_allowDividerAfterLastItem, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(this.f51022f);
        View inflate = cloneInContext.inflate(this.f51023g, viewGroup, false);
        View findViewById = inflate.findViewById(C19915a.f50935b);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView k = mo59078k(cloneInContext, viewGroup2, bundle);
            if (k != null) {
                this.f51019c = k;
                k.mo59589n(this.f51017a);
                mo59092r(drawable);
                if (dimensionPixelSize != -1) {
                    mo59093s(dimensionPixelSize);
                }
                this.f51017a.mo59104l(z);
                if (this.f51019c.getParent() == null) {
                    viewGroup2.addView(this.f51019c);
                }
                this.f51025w.post(this.f51026x);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    public void onDestroyView() {
        this.f51025w.removeCallbacks(this.f51026x);
        this.f51025w.removeMessages(1);
        if (this.f51020d) {
            mo59097v();
        }
        this.f51019c = null;
        super.onDestroyView();
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen f = mo59073f();
        if (f != null) {
            Bundle bundle2 = new Bundle();
            f.mo58822A2(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    public void onStart() {
        super.onStart();
        this.f51018b.mo59210z(this);
        this.f51018b.mo59208x(this);
    }

    public void onStop() {
        super.onStop();
        this.f51018b.mo59210z((C19966s.C19969c) null);
        this.f51018b.mo59208x((C19966s.C19967a) null);
    }

    public void onViewCreated(@C0359n0 View view, @C0363p0 Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen f;
        super.onViewCreated(view, bundle);
        if (!(bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (f = mo59073f()) == null)) {
            f.mo58922z2(bundle2);
        }
        if (this.f51020d) {
            mo59069b();
            Runnable runnable = this.f51024v;
            if (runnable != null) {
                runnable.run();
                this.f51024v = null;
            }
        }
        this.f51021e = true;
    }

    @Deprecated
    /* renamed from: p */
    public void mo59090p(@C0359n0 String str) {
        mo59091q((Preference) null, str);
    }

    /* renamed from: q */
    public final void mo59091q(Preference preference, String str) {
        C19938c cVar = new C19938c(preference, str);
        if (this.f51019c == null) {
            this.f51024v = cVar;
        } else {
            cVar.run();
        }
    }

    @Deprecated
    /* renamed from: r */
    public void mo59092r(@C0363p0 Drawable drawable) {
        this.f51017a.mo59105m(drawable);
    }

    @Deprecated
    /* renamed from: s */
    public void mo59093s(int i) {
        this.f51017a.mo59106n(i);
    }

    @Deprecated
    /* renamed from: t */
    public void mo59094t(PreferenceScreen preferenceScreen) {
        if (this.f51018b.mo59183C(preferenceScreen) && preferenceScreen != null) {
            mo59079l();
            this.f51020d = true;
            if (this.f51021e) {
                mo59080m();
            }
        }
    }

    @Deprecated
    /* renamed from: u */
    public void mo59095u(@C0351j1 int i, @C0363p0 String str) {
        mo59081n();
        PreferenceScreen r = this.f51018b.mo59204r(this.f51022f, i, (PreferenceScreen) null);
        Object obj = r;
        if (str != null) {
            Object m3 = r.mo58938m3(str);
            boolean z = m3 instanceof PreferenceScreen;
            obj = m3;
            if (!z) {
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        mo59094t((PreferenceScreen) obj);
    }

    @Deprecated
    /* renamed from: u0 */
    public void mo59096u0(@C0359n0 Preference preference) {
        boolean z;
        DialogFragment dialogFragment;
        if (mo59070c() instanceof C19940e) {
            z = ((C19940e) mo59070c()).mo59108a(this, preference);
        } else {
            z = false;
        }
        if (!z && (getActivity() instanceof C19940e)) {
            z = ((C19940e) getActivity()).mo59108a(this, preference);
        }
        if (!z && getFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                dialogFragment = C19916b.m92651i(preference.mo58889j0());
            } else if (preference instanceof ListPreference) {
                dialogFragment = C19920e.m92669i(preference.mo58889j0());
            } else if (preference instanceof MultiSelectListPreference) {
                dialogFragment = C19924g.m92677i(preference.mo58889j0());
            } else {
                throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
            }
            dialogFragment.setTargetFragment(this, 0);
            dialogFragment.show(getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    /* renamed from: v */
    public final void mo59097v() {
        PreferenceScreen f = mo59073f();
        if (f != null) {
            f.mo58866Y1();
        }
        mo59079l();
    }

    @Deprecated
    /* renamed from: x0 */
    public boolean mo59098x0(@C0359n0 Preference preference) {
        boolean z = false;
        if (preference.mo58878e0() == null) {
            return false;
        }
        if (mo59070c() instanceof C19941f) {
            z = ((C19941f) mo59070c()).mo59109a(this, preference);
        }
        if (z || !(getActivity() instanceof C19941f)) {
            return z;
        }
        return ((C19941f) getActivity()).mo59109a(this, preference);
    }
}
