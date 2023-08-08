package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C0309t;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0263a;
import androidx.activity.result.C0302g;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.C0266a;
import androidx.activity.result.contract.C0268b;
import androidx.annotation.C0324b1;
import androidx.annotation.C0329d0;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.app.C17055d0;
import androidx.core.app.C17124h5;
import androidx.core.app.C17193o4;
import androidx.core.app.C17211q4;
import androidx.core.content.C17363o0;
import androidx.core.content.C17365p0;
import androidx.core.util.C17970d;
import androidx.core.view.C18318n1;
import androidx.core.view.C18383u0;
import androidx.fragment.C19144a;
import androidx.fragment.app.C19234h0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.C19392a1;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.C20437e;
import com.bumptech.glide.load.engine.GlideException;
import com.google.firebase.installations.local.C33093b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.C12412q;

public abstract class FragmentManager implements C19223d0 {

    /* renamed from: S */
    public static final String f49218S = "android:support:fragments";

    /* renamed from: T */
    public static final String f49219T = "state";

    /* renamed from: U */
    public static final String f49220U = "result_";

    /* renamed from: V */
    public static final String f49221V = "state";

    /* renamed from: W */
    public static final String f49222W = "fragment_";

    /* renamed from: X */
    public static boolean f49223X = false;
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: Y */
    public static final String f49224Y = "FragmentManager";

    /* renamed from: Z */
    public static final int f49225Z = 1;

    /* renamed from: a0 */
    public static final String f49226a0 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";

    /* renamed from: A */
    public C19250l f49227A = new C19171d();

    /* renamed from: B */
    public C19263p0 f49228B = null;

    /* renamed from: C */
    public C19263p0 f49229C = new C19172e();

    /* renamed from: D */
    public C0302g<Intent> f49230D;

    /* renamed from: E */
    public C0302g<IntentSenderRequest> f49231E;

    /* renamed from: F */
    public C0302g<String[]> f49232F;

    /* renamed from: G */
    public ArrayDeque<LaunchedFragmentInfo> f49233G = new ArrayDeque<>();

    /* renamed from: H */
    public boolean f49234H;

    /* renamed from: I */
    public boolean f49235I;

    /* renamed from: J */
    public boolean f49236J;

    /* renamed from: K */
    public boolean f49237K;

    /* renamed from: L */
    public boolean f49238L;

    /* renamed from: M */
    public ArrayList<C19197a> f49239M;

    /* renamed from: N */
    public ArrayList<Boolean> f49240N;

    /* renamed from: O */
    public ArrayList<Fragment> f49241O;

    /* renamed from: P */
    public C19281z f49242P;

    /* renamed from: Q */
    public FragmentStrictMode.C19270b f49243Q;

    /* renamed from: R */
    public Runnable f49244R = new C19173f();

    /* renamed from: a */
    public final ArrayList<C19183p> f49245a = new ArrayList<>();

    /* renamed from: b */
    public boolean f49246b;

    /* renamed from: c */
    public final C19231g0 f49247c = new C19231g0();

    /* renamed from: d */
    public ArrayList<C19197a> f49248d;

    /* renamed from: e */
    public ArrayList<Fragment> f49249e;

    /* renamed from: f */
    public final C19261p f49250f = new C19261p(this);

    /* renamed from: g */
    public OnBackPressedDispatcher f49251g;

    /* renamed from: h */
    public final C0309t f49252h = new C19169b(false);

    /* renamed from: i */
    public final AtomicInteger f49253i = new AtomicInteger();

    /* renamed from: j */
    public final Map<String, BackStackState> f49254j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map<String, Bundle> f49255k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    public final Map<String, C19181n> f49256l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    public ArrayList<C19182o> f49257m;

    /* renamed from: n */
    public final C19264q f49258n = new C19264q(this);

    /* renamed from: o */
    public final CopyOnWriteArrayList<C19198a0> f49259o = new CopyOnWriteArrayList<>();

    /* renamed from: p */
    public final C17970d<Configuration> f49260p = new C19267r(this);

    /* renamed from: q */
    public final C17970d<Integer> f49261q = new C19268s(this);

    /* renamed from: r */
    public final C17970d<C17055d0> f49262r = new C19275t(this);

    /* renamed from: s */
    public final C17970d<C17124h5> f49263s = new C19276u(this);

    /* renamed from: t */
    public final C18318n1 f49264t = new C19170c();

    /* renamed from: u */
    public int f49265u = -1;

    /* renamed from: v */
    public C19253m<?> f49266v;

    /* renamed from: w */
    public C19240j f49267w;

    /* renamed from: x */
    public Fragment f49268x;
    @C0363p0

    /* renamed from: y */
    public Fragment f49269y;

    /* renamed from: z */
    public C19250l f49270z = null;

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    public class C19168a implements C0263a<Map<String, Boolean>> {
        public C19168a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo790a(Map<String, Boolean> map) {
            int i;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((Boolean) arrayList.get(i2)).booleanValue()) {
                    i = 0;
                } else {
                    i = -1;
                }
                iArr[i2] = i;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f49233G.pollFirst();
            if (pollFirst == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
                return;
            }
            String str = pollFirst.f49275a;
            int i3 = pollFirst.f49276b;
            Fragment i4 = FragmentManager.this.f49247c.mo57155i(str);
            if (i4 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Permission request result delivered for unknown Fragment ");
                sb2.append(str);
                return;
            }
            i4.onRequestPermissionsResult(i3, strArr, iArr);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    public class C19169b extends C0309t {
        public C19169b(boolean z) {
            super(z);
        }

        /* renamed from: f */
        public void mo792f() {
            FragmentManager.this.mo56835S0();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    public class C19170c implements C18318n1 {
        public C19170c() {
        }

        /* renamed from: a */
        public void mo52985a(@C0359n0 Menu menu) {
            FragmentManager.this.mo56834S(menu);
        }

        /* renamed from: b */
        public void mo52986b(@C0359n0 Menu menu) {
            FragmentManager.this.mo56846W(menu);
        }

        /* renamed from: c */
        public boolean mo52987c(@C0359n0 MenuItem menuItem) {
            return FragmentManager.this.mo56831R(menuItem);
        }

        /* renamed from: d */
        public void mo52988d(@C0359n0 Menu menu, @C0359n0 MenuInflater menuInflater) {
            FragmentManager.this.mo56812K(menu, menuInflater);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    public class C19171d extends C19250l {
        public C19171d() {
        }

        @C0359n0
        /* renamed from: a */
        public Fragment mo56932a(@C0359n0 ClassLoader classLoader, @C0359n0 String str) {
            return FragmentManager.this.mo56810J0().mo57233b(FragmentManager.this.mo56810J0().mo57316k(), str, (Bundle) null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    public class C19172e implements C19263p0 {
        public C19172e() {
        }

        @C0359n0
        /* renamed from: a */
        public SpecialEffectsController mo56933a(@C0359n0 ViewGroup viewGroup) {
            return new C19199b(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    public class C19173f implements Runnable {
        public C19173f() {
        }

        public void run() {
            FragmentManager.this.mo56880j0(true);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    public class C19174g implements C19198a0 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f49283a;

        public C19174g(Fragment fragment) {
            this.f49283a = fragment;
        }

        /* renamed from: a */
        public void mo56935a(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment) {
            this.f49283a.onAttachFragment(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$h */
    public class C19175h implements C0263a<ActivityResult> {
        public C19175h() {
        }

        /* renamed from: b */
        public void mo790a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f49233G.pollFirst();
            if (pollFirst == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No Activities were started for result for ");
                sb.append(this);
                return;
            }
            String str = pollFirst.f49275a;
            int i = pollFirst.f49276b;
            Fragment i2 = FragmentManager.this.f49247c.mo57155i(str);
            if (i2 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Activity result delivered for unknown Fragment ");
                sb2.append(str);
                return;
            }
            i2.onActivityResult(i, activityResult.mo855b(), activityResult.mo854a());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$i */
    public class C19176i implements C0263a<ActivityResult> {
        public C19176i() {
        }

        /* renamed from: b */
        public void mo790a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f49233G.pollFirst();
            if (pollFirst == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No IntentSenders were started for ");
                sb.append(this);
                return;
            }
            String str = pollFirst.f49275a;
            int i = pollFirst.f49276b;
            Fragment i2 = FragmentManager.this.f49247c.mo57155i(str);
            if (i2 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Intent Sender result delivered for unknown Fragment ");
                sb2.append(str);
                return;
            }
            i2.onActivityResult(i, activityResult.mo855b(), activityResult.mo854a());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$j */
    public interface C19177j {
        @C0363p0
        @Deprecated
        /* renamed from: b */
        CharSequence mo56938b();

        @Deprecated
        @C0324b1
        /* renamed from: c */
        int mo56939c();

        @Deprecated
        @C0324b1
        /* renamed from: d */
        int mo56940d();

        @C0363p0
        @Deprecated
        /* renamed from: e */
        CharSequence mo56941e();

        int getId();

        @C0363p0
        String getName();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$k */
    public class C19178k implements C19183p {

        /* renamed from: a */
        public final String f49287a;

        public C19178k(@C0359n0 String str) {
            this.f49287a = str;
        }

        /* renamed from: a */
        public boolean mo56944a(@C0359n0 ArrayList<C19197a> arrayList, @C0359n0 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.mo56922z(arrayList, arrayList2, this.f49287a);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$l */
    public static class C19179l extends C0266a<IntentSenderRequest, ActivityResult> {
        @C0359n0
        /* renamed from: d */
        public Intent mo869a(@C0359n0 Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent(C0268b.C0292n.f820b);
            Intent a = intentSenderRequest.mo885a();
            if (!(a == null || (bundleExtra = a.getBundleExtra(C0268b.C0290m.f818b)) == null)) {
                intent.putExtra(C0268b.C0290m.f818b, bundleExtra);
                a.removeExtra(C0268b.C0290m.f818b);
                if (a.getBooleanExtra(FragmentManager.f49226a0, false)) {
                    intentSenderRequest = new IntentSenderRequest.C0259a(intentSenderRequest.mo888d()).mo892b((Intent) null).mo893c(intentSenderRequest.mo887c(), intentSenderRequest.mo886b()).mo891a();
                }
            }
            intent.putExtra(C0268b.C0292n.f821c, intentSenderRequest);
            if (FragmentManager.m89694W0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("CreateIntent created the following intent: ");
                sb.append(intent);
            }
            return intent;
        }

        @C0359n0
        /* renamed from: e */
        public ActivityResult mo870c(int i, @C0363p0 Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    public static abstract class C19180m {
        @Deprecated
        /* renamed from: d */
        public void mo56947d(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment, @C0363p0 Bundle bundle) {
        }

        /* renamed from: e */
        public void mo56948e(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment, @C0359n0 Context context) {
        }

        /* renamed from: f */
        public void mo56949f(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment, @C0363p0 Bundle bundle) {
        }

        /* renamed from: h */
        public void mo56950h(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment) {
        }

        /* renamed from: i */
        public void mo56951i(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment) {
        }

        /* renamed from: j */
        public void mo56952j(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment) {
        }

        /* renamed from: k */
        public void mo35285k(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment, @C0359n0 Context context) {
        }

        /* renamed from: l */
        public void mo56953l(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment, @C0363p0 Bundle bundle) {
        }

        /* renamed from: m */
        public void mo35286m(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment) {
        }

        /* renamed from: n */
        public void mo56954n(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment, @C0359n0 Bundle bundle) {
        }

        /* renamed from: o */
        public void mo35287o(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment) {
        }

        /* renamed from: p */
        public void mo56955p(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment) {
        }

        /* renamed from: q */
        public void mo56956q(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment, @C0359n0 View view, @C0363p0 Bundle bundle) {
        }

        /* renamed from: r */
        public void mo56957r(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment) {
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$n */
    public static class C19181n implements C19221c0 {

        /* renamed from: a */
        public final Lifecycle f49289a;

        /* renamed from: b */
        public final C19221c0 f49290b;

        /* renamed from: c */
        public final C19470t f49291c;

        public C19181n(@C0359n0 Lifecycle lifecycle, @C0359n0 C19221c0 c0Var, @C0359n0 C19470t tVar) {
            this.f49289a = lifecycle;
            this.f49290b = c0Var;
            this.f49291c = tVar;
        }

        /* renamed from: a */
        public boolean mo56958a(Lifecycle.State state) {
            return this.f49289a.mo57465b().mo57474q(state);
        }

        /* renamed from: b */
        public void mo56959b() {
            this.f49289a.mo57467d(this.f49291c);
        }

        /* renamed from: p */
        public void mo32757p(@C0359n0 String str, @C0359n0 Bundle bundle) {
            this.f49290b.mo32757p(str, bundle);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$o */
    public interface C19182o {
        @C0353k0
        /* renamed from: a */
        void mo56960a();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$p */
    public interface C19183p {
        /* renamed from: a */
        boolean mo56944a(@C0359n0 ArrayList<C19197a> arrayList, @C0359n0 ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$q */
    public class C19184q implements C19183p {

        /* renamed from: a */
        public final String f49292a;

        /* renamed from: b */
        public final int f49293b;

        /* renamed from: c */
        public final int f49294c;

        public C19184q(@C0363p0 String str, int i, int i2) {
            this.f49292a = str;
            this.f49293b = i;
            this.f49294c = i2;
        }

        /* renamed from: a */
        public boolean mo56944a(@C0359n0 ArrayList<C19197a> arrayList, @C0359n0 ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f49269y;
            if (fragment != null && this.f49293b < 0 && this.f49292a == null && fragment.getChildFragmentManager().mo56912v1()) {
                return false;
            }
            return FragmentManager.this.mo56924z1(arrayList, arrayList2, this.f49292a, this.f49293b, this.f49294c);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$r */
    public class C19185r implements C19183p {

        /* renamed from: a */
        public final String f49296a;

        public C19185r(@C0359n0 String str) {
            this.f49296a = str;
        }

        /* renamed from: a */
        public boolean mo56944a(@C0359n0 ArrayList<C19197a> arrayList, @C0359n0 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.mo56814K1(arrayList, arrayList2, this.f49296a);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$s */
    public class C19186s implements C19183p {

        /* renamed from: a */
        public final String f49298a;

        public C19186s(@C0359n0 String str) {
            this.f49298a = str;
        }

        /* renamed from: a */
        public boolean mo56944a(@C0359n0 ArrayList<C19197a> arrayList, @C0359n0 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.mo56836S1(arrayList, arrayList2, this.f49298a);
        }
    }

    /* renamed from: O1 */
    public static int m89692O1(int i) {
        int i2 = C19234h0.f49479I;
        if (i == 4097) {
            return 8194;
        }
        if (i != 8194) {
            i2 = C19234h0.f49483M;
            if (i == 8197) {
                return C19234h0.f49482L;
            }
            if (i == 4099) {
                return C19234h0.f49481K;
            }
            if (i != 4100) {
                return 0;
            }
        }
        return i2;
    }

    @C0363p0
    /* renamed from: Q0 */
    public static Fragment m89693Q0(@C0359n0 View view) {
        Object tag = view.getTag(C19144a.C19147c.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: W0 */
    public static boolean m89694W0(int i) {
        return f49223X || Log.isLoggable("FragmentManager", i);
    }

    @Deprecated
    /* renamed from: f0 */
    public static void m89698f0(boolean z) {
        f49223X = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: f1 */
    public /* synthetic */ void m89699f1(Configuration configuration) {
        if (mo56852Y0()) {
            mo56803H(configuration, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g1 */
    public /* synthetic */ void m89701g1(Integer num) {
        if (mo56852Y0() && num.intValue() == 80) {
            mo56821N(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h1 */
    public /* synthetic */ void m89703h1(C17055d0 d0Var) {
        if (mo56852Y0()) {
            mo56824O(d0Var.mo51253b(), false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i1 */
    public /* synthetic */ void m89705i1(C17124h5 h5Var) {
        if (mo56852Y0()) {
            mo56843V(h5Var.mo51570b(), false);
        }
    }

    /* renamed from: l0 */
    public static void m89709l0(@C0359n0 ArrayList<C19197a> arrayList, @C0359n0 ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C19197a aVar = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                aVar.mo57042U(-1);
                aVar.mo57048a0();
            } else {
                aVar.mo57042U(1);
                aVar.mo57047Z();
            }
            i++;
        }
    }

    @C0359n0
    /* renamed from: q0 */
    public static <F extends Fragment> F m89710q0(@C0359n0 View view) {
        F v0 = m89712v0(view);
        if (v0 != null) {
            return v0;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    @C0359n0
    /* renamed from: u0 */
    public static FragmentManager m89711u0(@C0359n0 View view) {
        C19232h hVar;
        Fragment v0 = m89712v0(view);
        if (v0 == null) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    hVar = null;
                    break;
                } else if (context instanceof C19232h) {
                    hVar = (C19232h) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (hVar != null) {
                return hVar.mo57175g0();
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        } else if (v0.isAdded()) {
            return v0.getChildFragmentManager();
        } else {
            throw new IllegalStateException("The Fragment " + v0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
    }

    @C0363p0
    /* renamed from: v0 */
    public static Fragment m89712v0(@C0359n0 View view) {
        while (view != null) {
            Fragment Q0 = m89693Q0(view);
            if (Q0 != null) {
                return Q0;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    /* renamed from: A */
    public final void mo56782A() {
        boolean z;
        C19253m<?> mVar = this.f49266v;
        if (mVar instanceof C19395b1) {
            z = this.f49247c.mo57163q().mo57413m0();
        } else if (mVar.mo57316k() instanceof Activity) {
            z = !((Activity) this.f49266v.mo57316k()).isChangingConfigurations();
        } else {
            z = true;
        }
        if (z) {
            for (BackStackState backStackState : this.f49254j.values()) {
                for (String e0 : backStackState.f49170a) {
                    this.f49247c.mo57163q().mo57404e0(e0);
                }
            }
        }
    }

    @C0359n0
    /* renamed from: A0 */
    public C19177j mo56783A0(int i) {
        return this.f49248d.get(i);
    }

    /* renamed from: A1 */
    public void mo56784A1(@C0359n0 Bundle bundle, @C0359n0 String str, @C0359n0 Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            mo56874e2(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    /* renamed from: B */
    public final Set<SpecialEffectsController> mo56785B() {
        HashSet hashSet = new HashSet();
        for (C19225e0 k : this.f49247c.mo57158l()) {
            ViewGroup viewGroup = k.mo57128k().mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.m89941o(viewGroup, mo56825O0()));
            }
        }
        return hashSet;
    }

    /* renamed from: B0 */
    public int mo56786B0() {
        ArrayList<C19197a> arrayList = this.f49248d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: B1 */
    public void mo56787B1(@C0359n0 C19180m mVar, boolean z) {
        this.f49258n.mo57363o(mVar, z);
    }

    /* renamed from: C */
    public final Set<SpecialEffectsController> mo56788C(@C0359n0 ArrayList<C19197a> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<C19234h0.C19235a> it = arrayList.get(i).f49493c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f49511b;
                if (!(fragment == null || (viewGroup = fragment.mContainer) == null)) {
                    hashSet.add(SpecialEffectsController.m89940n(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    @C0359n0
    /* renamed from: C0 */
    public final C19281z mo56789C0(@C0359n0 Fragment fragment) {
        return this.f49242P.mo57408h0(fragment);
    }

    /* renamed from: C1 */
    public void mo56790C1(@C0359n0 Fragment fragment) {
        if (m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.f49247c.mo57168v(fragment);
            if (mo56849X0(fragment)) {
                this.f49234H = true;
            }
            fragment.mRemoving = true;
            mo56864b2(fragment);
        }
    }

    @C0359n0
    /* renamed from: D */
    public C19225e0 mo56791D(@C0359n0 Fragment fragment) {
        C19225e0 o = this.f49247c.mo57161o(fragment.mWho);
        if (o != null) {
            return o;
        }
        C19225e0 e0Var = new C19225e0(this.f49258n, this.f49247c, fragment);
        e0Var.mo57132o(this.f49266v.mo57316k().getClassLoader());
        e0Var.mo57138u(this.f49265u);
        return e0Var;
    }

    @C0359n0
    /* renamed from: D0 */
    public C19240j mo56792D0() {
        return this.f49267w;
    }

    /* renamed from: D1 */
    public void mo56793D1(@C0359n0 C19198a0 a0Var) {
        this.f49259o.remove(a0Var);
    }

    /* renamed from: E */
    public void mo56794E(@C0359n0 Fragment fragment) {
        if (m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (m89694W0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(fragment);
                }
                this.f49247c.mo57168v(fragment);
                if (mo56849X0(fragment)) {
                    this.f49234H = true;
                }
                mo56864b2(fragment);
            }
        }
    }

    @C0363p0
    /* renamed from: E0 */
    public Fragment mo56795E0(@C0359n0 Bundle bundle, @C0359n0 String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment o0 = mo56892o0(string);
        if (o0 == null) {
            mo56874e2(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return o0;
    }

    /* renamed from: E1 */
    public void mo56796E1(@C0359n0 C19182o oVar) {
        ArrayList<C19182o> arrayList = this.f49257m;
        if (arrayList != null) {
            arrayList.remove(oVar);
        }
    }

    /* renamed from: F */
    public void mo56797F() {
        this.f49235I = false;
        this.f49236J = false;
        this.f49242P.mo57416p0(false);
        mo56858a0(4);
    }

    /* renamed from: F0 */
    public final ViewGroup mo56798F0(@C0359n0 Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f49267w.mo56760g()) {
            View c = this.f49267w.mo56759c(fragment.mContainerId);
            if (c instanceof ViewGroup) {
                return (ViewGroup) c;
            }
        }
        return null;
    }

    /* renamed from: F1 */
    public final void mo56799F1(@C0359n0 ArrayList<C19197a> arrayList, @C0359n0 ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).f49508r) {
                        if (i2 != i) {
                            mo56886m0(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f49508r) {
                                i2++;
                            }
                        }
                        mo56886m0(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    mo56886m0(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: G */
    public void mo56800G() {
        this.f49235I = false;
        this.f49236J = false;
        this.f49242P.mo57416p0(false);
        mo56858a0(0);
    }

    @C0359n0
    /* renamed from: G0 */
    public C19250l mo56801G0() {
        C19250l lVar = this.f49270z;
        if (lVar != null) {
            return lVar;
        }
        Fragment fragment = this.f49268x;
        if (fragment != null) {
            return fragment.mFragmentManager.mo56801G0();
        }
        return this.f49227A;
    }

    /* renamed from: G1 */
    public void mo56802G1(@C0359n0 Fragment fragment) {
        this.f49242P.mo57414n0(fragment);
    }

    /* renamed from: H */
    public void mo56803H(@C0359n0 Configuration configuration, boolean z) {
        if (z && (this.f49266v instanceof C17363o0)) {
            mo56874e2(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment next : this.f49247c.mo57162p()) {
            if (next != null) {
                next.performConfigurationChanged(configuration);
                if (z) {
                    next.mChildFragmentManager.mo56803H(configuration, true);
                }
            }
        }
    }

    @C0359n0
    /* renamed from: H0 */
    public C19231g0 mo56804H0() {
        return this.f49247c;
    }

    /* renamed from: H1 */
    public final void mo56805H1() {
        if (this.f49257m != null) {
            for (int i = 0; i < this.f49257m.size(); i++) {
                this.f49257m.get(i).mo56960a();
            }
        }
    }

    /* renamed from: I */
    public boolean mo56806I(@C0359n0 MenuItem menuItem) {
        if (this.f49265u < 1) {
            return false;
        }
        for (Fragment next : this.f49247c.mo57162p()) {
            if (next != null && next.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @C0359n0
    /* renamed from: I0 */
    public List<Fragment> mo56807I0() {
        return this.f49247c.mo57162p();
    }

    /* renamed from: I1 */
    public void mo56808I1(@C0363p0 Parcelable parcelable, @C0363p0 C19280y yVar) {
        if (this.f49266v instanceof C19395b1) {
            mo56874e2(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.f49242P.mo57415o0(yVar);
        mo56820M1(parcelable);
    }

    /* renamed from: J */
    public void mo56809J() {
        this.f49235I = false;
        this.f49236J = false;
        this.f49242P.mo57416p0(false);
        mo56858a0(1);
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: J0 */
    public C19253m<?> mo56810J0() {
        return this.f49266v;
    }

    /* renamed from: J1 */
    public void mo56811J1(@C0359n0 String str) {
        mo56878h0(new C19185r(str), false);
    }

    /* renamed from: K */
    public boolean mo56812K(@C0359n0 Menu menu, @C0359n0 MenuInflater menuInflater) {
        if (this.f49265u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment next : this.f49247c.mo57162p()) {
            if (next != null && mo56859a1(next) && next.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z = true;
            }
        }
        if (this.f49249e != null) {
            for (int i = 0; i < this.f49249e.size(); i++) {
                Fragment fragment = this.f49249e.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.onDestroyOptionsMenu();
                }
            }
        }
        this.f49249e = arrayList;
        return z;
    }

    @C0359n0
    /* renamed from: K0 */
    public LayoutInflater.Factory2 mo56813K0() {
        return this.f49250f;
    }

    /* renamed from: K1 */
    public boolean mo56814K1(@C0359n0 ArrayList<C19197a> arrayList, @C0359n0 ArrayList<Boolean> arrayList2, @C0359n0 String str) {
        BackStackState remove = this.f49254j.remove(str);
        if (remove == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        Iterator<C19197a> it = arrayList.iterator();
        while (it.hasNext()) {
            C19197a next = it.next();
            if (next.f49368Q) {
                Iterator<C19234h0.C19235a> it2 = next.f49493c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = it2.next().f49511b;
                    if (fragment != null) {
                        hashMap.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        Iterator<C19197a> it3 = remove.mo56578a(this, hashMap).iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it3.hasNext()) {
                    return z;
                }
                if (it3.next().mo56944a(arrayList, arrayList2) || z) {
                    z = true;
                }
            }
        }
    }

    /* renamed from: L */
    public void mo56815L() {
        this.f49237K = true;
        mo56880j0(true);
        mo56876g0();
        mo56782A();
        mo56858a0(-1);
        C19253m<?> mVar = this.f49266v;
        if (mVar instanceof C17365p0) {
            ((C17365p0) mVar).mo707f(this.f49261q);
        }
        C19253m<?> mVar2 = this.f49266v;
        if (mVar2 instanceof C17363o0) {
            ((C17363o0) mVar2).mo695F(this.f49260p);
        }
        C19253m<?> mVar3 = this.f49266v;
        if (mVar3 instanceof C17193o4) {
            ((C17193o4) mVar3).mo747u(this.f49262r);
        }
        C19253m<?> mVar4 = this.f49266v;
        if (mVar4 instanceof C17211q4) {
            ((C17211q4) mVar4).mo706e(this.f49263s);
        }
        C19253m<?> mVar5 = this.f49266v;
        if (mVar5 instanceof C18383u0) {
            ((C18383u0) mVar5).mo749x(this.f49264t);
        }
        this.f49266v = null;
        this.f49267w = null;
        this.f49268x = null;
        if (this.f49251g != null) {
            this.f49252h.mo968h();
            this.f49251g = null;
        }
        C0302g<Intent> gVar = this.f49230D;
        if (gVar != null) {
            gVar.mo822d();
            this.f49231E.mo822d();
            this.f49232F.mo822d();
        }
    }

    @C0359n0
    /* renamed from: L0 */
    public C19264q mo56816L0() {
        return this.f49258n;
    }

    /* renamed from: L1 */
    public void mo56817L1(@C0363p0 Parcelable parcelable) {
        if (this.f49266v instanceof C20437e) {
            mo56874e2(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        mo56820M1(parcelable);
    }

    /* renamed from: M */
    public void mo56818M() {
        mo56858a0(1);
    }

    @C0363p0
    /* renamed from: M0 */
    public Fragment mo56819M0() {
        return this.f49268x;
    }

    /* renamed from: M1 */
    public void mo56820M1(@C0363p0 Parcelable parcelable) {
        C19225e0 e0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable != null) {
            Bundle bundle3 = (Bundle) parcelable;
            for (String next : bundle3.keySet()) {
                if (next.startsWith(f49220U) && (bundle2 = bundle3.getBundle(next)) != null) {
                    bundle2.setClassLoader(this.f49266v.mo57316k().getClassLoader());
                    this.f49255k.put(next.substring(7), bundle2);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (String next2 : bundle3.keySet()) {
                if (next2.startsWith(f49222W) && (bundle = bundle3.getBundle(next2)) != null) {
                    bundle.setClassLoader(this.f49266v.mo57316k().getClassLoader());
                    arrayList.add((FragmentState) bundle.getParcelable("state"));
                }
            }
            this.f49247c.mo57171y(arrayList);
            FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
            if (fragmentManagerState != null) {
                this.f49247c.mo57169w();
                Iterator<String> it = fragmentManagerState.f49300a.iterator();
                while (it.hasNext()) {
                    FragmentState C = this.f49247c.mo57146C(it.next(), (FragmentState) null);
                    if (C != null) {
                        Fragment g0 = this.f49242P.mo57407g0(C.f49310b);
                        if (g0 != null) {
                            if (m89694W0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("restoreSaveState: re-attaching retained ");
                                sb.append(g0);
                            }
                            e0Var = new C19225e0(this.f49258n, this.f49247c, g0, C);
                        } else {
                            e0Var = new C19225e0(this.f49258n, this.f49247c, this.f49266v.mo57316k().getClassLoader(), mo56801G0(), C);
                        }
                        Fragment k = e0Var.mo57128k();
                        k.mFragmentManager = this;
                        if (m89694W0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("restoreSaveState: active (");
                            sb2.append(k.mWho);
                            sb2.append("): ");
                            sb2.append(k);
                        }
                        e0Var.mo57132o(this.f49266v.mo57316k().getClassLoader());
                        this.f49247c.mo57165s(e0Var);
                        e0Var.mo57138u(this.f49265u);
                    }
                }
                for (Fragment next3 : this.f49242P.mo57410j0()) {
                    if (!this.f49247c.mo57149c(next3.mWho)) {
                        if (m89694W0(2)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Discarding retained Fragment ");
                            sb3.append(next3);
                            sb3.append(" that was not found in the set of active Fragments ");
                            sb3.append(fragmentManagerState.f49300a);
                        }
                        this.f49242P.mo57414n0(next3);
                        next3.mFragmentManager = this;
                        C19225e0 e0Var2 = new C19225e0(this.f49258n, this.f49247c, next3);
                        e0Var2.mo57138u(1);
                        e0Var2.mo57130m();
                        next3.mRemoving = true;
                        e0Var2.mo57130m();
                    }
                }
                this.f49247c.mo57170x(fragmentManagerState.f49301b);
                if (fragmentManagerState.f49302c != null) {
                    this.f49248d = new ArrayList<>(fragmentManagerState.f49302c.length);
                    int i = 0;
                    while (true) {
                        BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f49302c;
                        if (i >= backStackRecordStateArr.length) {
                            break;
                        }
                        C19197a b = backStackRecordStateArr[i].mo56570b(this);
                        if (m89694W0(2)) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("restoreAllState: back stack #");
                            sb4.append(i);
                            sb4.append(" (index ");
                            sb4.append(b.f49367P);
                            sb4.append("): ");
                            sb4.append(b);
                            PrintWriter printWriter = new PrintWriter(new C19260o0("FragmentManager"));
                            b.mo57046Y(GlideException.C22148a.f56917d, printWriter, false);
                            printWriter.close();
                        }
                        this.f49248d.add(b);
                        i++;
                    }
                } else {
                    this.f49248d = null;
                }
                this.f49253i.set(fragmentManagerState.f49303d);
                String str = fragmentManagerState.f49304e;
                if (str != null) {
                    Fragment o0 = mo56892o0(str);
                    this.f49269y = o0;
                    mo56837T(o0);
                }
                ArrayList<String> arrayList2 = fragmentManagerState.f49305f;
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        this.f49254j.put(arrayList2.get(i2), fragmentManagerState.f49306g.get(i2));
                    }
                }
                this.f49233G = new ArrayDeque<>(fragmentManagerState.f49307v);
            }
        }
    }

    /* renamed from: N */
    public void mo56821N(boolean z) {
        if (z && (this.f49266v instanceof C17365p0)) {
            mo56874e2(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment next : this.f49247c.mo57162p()) {
            if (next != null) {
                next.performLowMemory();
                if (z) {
                    next.mChildFragmentManager.mo56821N(true);
                }
            }
        }
    }

    @C0363p0
    /* renamed from: N0 */
    public Fragment mo56822N0() {
        return this.f49269y;
    }

    @Deprecated
    /* renamed from: N1 */
    public C19280y mo56823N1() {
        if (this.f49266v instanceof C19395b1) {
            mo56874e2(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.f49242P.mo57411k0();
    }

    /* renamed from: O */
    public void mo56824O(boolean z, boolean z2) {
        if (z2 && (this.f49266v instanceof C17193o4)) {
            mo56874e2(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment next : this.f49247c.mo57162p()) {
            if (next != null) {
                next.performMultiWindowModeChanged(z);
                if (z2) {
                    next.mChildFragmentManager.mo56824O(z, true);
                }
            }
        }
    }

    @C0359n0
    /* renamed from: O0 */
    public C19263p0 mo56825O0() {
        C19263p0 p0Var = this.f49228B;
        if (p0Var != null) {
            return p0Var;
        }
        Fragment fragment = this.f49268x;
        if (fragment != null) {
            return fragment.mFragmentManager.mo56825O0();
        }
        return this.f49229C;
    }

    /* renamed from: P */
    public void mo56826P(@C0359n0 Fragment fragment) {
        Iterator<C19198a0> it = this.f49259o.iterator();
        while (it.hasNext()) {
            it.next().mo56935a(this, fragment);
        }
    }

    @C0363p0
    /* renamed from: P0 */
    public FragmentStrictMode.C19270b mo56827P0() {
        return this.f49243Q;
    }

    /* renamed from: P1 */
    public Parcelable mo56828P1() {
        if (this.f49266v instanceof C20437e) {
            mo56874e2(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        Bundle Q1 = m89696e1();
        if (Q1.isEmpty()) {
            return null;
        }
        return Q1;
    }

    /* renamed from: Q */
    public void mo56829Q() {
        for (Fragment next : this.f49247c.mo57159m()) {
            if (next != null) {
                next.onHiddenChanged(next.isHidden());
                next.mChildFragmentManager.mo56829Q();
            }
        }
    }

    @C0359n0
    /* renamed from: Q1 */
    public Bundle m89696e1() {
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        mo56914w0();
        mo56876g0();
        mo56880j0(true);
        this.f49235I = true;
        this.f49242P.mo57416p0(true);
        ArrayList<String> z = this.f49247c.mo57172z();
        ArrayList<FragmentState> n = this.f49247c.mo57160n();
        if (n.isEmpty()) {
            m89694W0(2);
        } else {
            ArrayList<String> A = this.f49247c.mo57144A();
            ArrayList<C19197a> arrayList = this.f49248d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState(this.f49248d.get(i));
                    if (m89694W0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding back stack #");
                        sb.append(i);
                        sb.append(": ");
                        sb.append(this.f49248d.get(i));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f49300a = z;
            fragmentManagerState.f49301b = A;
            fragmentManagerState.f49302c = backStackRecordStateArr;
            fragmentManagerState.f49303d = this.f49253i.get();
            Fragment fragment = this.f49269y;
            if (fragment != null) {
                fragmentManagerState.f49304e = fragment.mWho;
            }
            fragmentManagerState.f49305f.addAll(this.f49254j.keySet());
            fragmentManagerState.f49306g.addAll(this.f49254j.values());
            fragmentManagerState.f49307v = new ArrayList<>(this.f49233G);
            bundle.putParcelable("state", fragmentManagerState);
            for (String next : this.f49255k.keySet()) {
                bundle.putBundle(f49220U + next, this.f49255k.get(next));
            }
            Iterator<FragmentState> it = n.iterator();
            while (it.hasNext()) {
                FragmentState next2 = it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", next2);
                bundle.putBundle(f49222W + next2.f49310b, bundle2);
            }
        }
        return bundle;
    }

    /* renamed from: R */
    public boolean mo56831R(@C0359n0 MenuItem menuItem) {
        if (this.f49265u < 1) {
            return false;
        }
        for (Fragment next : this.f49247c.mo57162p()) {
            if (next != null && next.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @C0359n0
    /* renamed from: R0 */
    public C19392a1 mo56832R0(@C0359n0 Fragment fragment) {
        return this.f49242P.mo57412l0(fragment);
    }

    /* renamed from: R1 */
    public void mo56833R1(@C0359n0 String str) {
        mo56878h0(new C19186s(str), false);
    }

    /* renamed from: S */
    public void mo56834S(@C0359n0 Menu menu) {
        if (this.f49265u >= 1) {
            for (Fragment next : this.f49247c.mo57162p()) {
                if (next != null) {
                    next.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* renamed from: S0 */
    public void mo56835S0() {
        mo56880j0(true);
        if (this.f49252h.mo967g()) {
            mo56912v1();
        } else {
            this.f49251g.mo767f();
        }
    }

    /* renamed from: S1 */
    public boolean mo56836S1(@C0359n0 ArrayList<C19197a> arrayList, @C0359n0 ArrayList<Boolean> arrayList2, @C0359n0 String str) {
        String str2;
        String str3;
        int i;
        String str4 = str;
        int p0 = mo56895p0(str4, -1, true);
        if (p0 < 0) {
            return false;
        }
        for (int i2 = p0; i2 < this.f49248d.size(); i2++) {
            C19197a aVar = this.f49248d.get(i2);
            if (!aVar.f49508r) {
                mo56874e2(new IllegalArgumentException("saveBackStack(\"" + str4 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i3 = p0; i3 < this.f49248d.size(); i3++) {
            C19197a aVar2 = this.f49248d.get(i3);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator<C19234h0.C19235a> it = aVar2.f49493c.iterator();
            while (it.hasNext()) {
                C19234h0.C19235a next = it.next();
                Fragment fragment = next.f49511b;
                if (fragment != null) {
                    if (!next.f49512c || (i = next.f49510a) == 1 || i == 2 || i == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i4 = next.f49510a;
                    if (i4 == 1 || i4 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("saveBackStack(\"");
                sb.append(str4);
                sb.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if (hashSet2.size() == 1) {
                    str3 = " " + hashSet2.iterator().next();
                } else {
                    str3 = "s " + hashSet2;
                }
                sb.append(str3);
                sb.append(" in ");
                sb.append(aVar2);
                sb.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                mo56874e2(new IllegalArgumentException(sb.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str4);
                sb2.append("\") must not contain retained fragments. Found ");
                if (hashSet.contains(fragment2)) {
                    str2 = "direct reference to retained ";
                } else {
                    str2 = "retained child ";
                }
                sb2.append(str2);
                sb2.append("fragment ");
                sb2.append(fragment2);
                mo56874e2(new IllegalArgumentException(sb2.toString()));
            }
            for (Fragment next2 : fragment2.mChildFragmentManager.mo56923z0()) {
                if (next2 != null) {
                    arrayDeque.addLast(next2);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Fragment) it2.next()).mWho);
        }
        ArrayList arrayList4 = new ArrayList(this.f49248d.size() - p0);
        for (int i5 = p0; i5 < this.f49248d.size(); i5++) {
            arrayList4.add((Object) null);
        }
        BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
        for (int size = this.f49248d.size() - 1; size >= p0; size--) {
            C19197a remove = this.f49248d.remove(size);
            C19197a aVar3 = new C19197a(remove);
            aVar3.mo57043V();
            arrayList4.set(size - p0, new BackStackRecordState(aVar3));
            remove.f49368Q = true;
            arrayList.add(remove);
            arrayList2.add(Boolean.TRUE);
        }
        this.f49254j.put(str4, backStackState);
        return true;
    }

    /* renamed from: T */
    public final void mo56837T(@C0363p0 Fragment fragment) {
        if (fragment != null && fragment.equals(mo56892o0(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* renamed from: T0 */
    public void mo56838T0(@C0359n0 Fragment fragment) {
        if (m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            mo56864b2(fragment);
        }
    }

    @C0363p0
    /* renamed from: T1 */
    public Fragment.SavedState mo56839T1(@C0359n0 Fragment fragment) {
        C19225e0 o = this.f49247c.mo57161o(fragment.mWho);
        if (o == null || !o.mo57128k().equals(fragment)) {
            mo56874e2(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return o.mo57135r();
    }

    /* renamed from: U */
    public void mo56840U() {
        mo56858a0(5);
    }

    /* renamed from: U0 */
    public void mo56841U0(@C0359n0 Fragment fragment) {
        if (fragment.mAdded && mo56849X0(fragment)) {
            this.f49234H = true;
        }
    }

    /* renamed from: U1 */
    public void mo56842U1() {
        synchronized (this.f49245a) {
            boolean z = true;
            if (this.f49245a.size() != 1) {
                z = false;
            }
            if (z) {
                this.f49266v.mo57317l().removeCallbacks(this.f49244R);
                this.f49266v.mo57317l().post(this.f49244R);
                mo56877g2();
            }
        }
    }

    /* renamed from: V */
    public void mo56843V(boolean z, boolean z2) {
        if (z2 && (this.f49266v instanceof C17211q4)) {
            mo56874e2(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment next : this.f49247c.mo57162p()) {
            if (next != null) {
                next.performPictureInPictureModeChanged(z);
                if (z2) {
                    next.mChildFragmentManager.mo56843V(z, true);
                }
            }
        }
    }

    /* renamed from: V0 */
    public boolean mo56844V0() {
        return this.f49237K;
    }

    /* renamed from: V1 */
    public void mo56845V1(@C0359n0 Fragment fragment, boolean z) {
        ViewGroup F0 = mo56798F0(fragment);
        if (F0 != null && (F0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) F0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* renamed from: W */
    public boolean mo56846W(@C0359n0 Menu menu) {
        boolean z = false;
        if (this.f49265u < 1) {
            return false;
        }
        for (Fragment next : this.f49247c.mo57162p()) {
            if (next != null && mo56859a1(next) && next.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: W1 */
    public void mo56847W1(@C0359n0 C19250l lVar) {
        this.f49270z = lVar;
    }

    /* renamed from: X */
    public void mo56848X() {
        mo56877g2();
        mo56837T(this.f49269y);
    }

    /* renamed from: X0 */
    public final boolean mo56849X0(@C0359n0 Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.mo56911v();
    }

    /* renamed from: X1 */
    public void mo56850X1(@C0359n0 Fragment fragment, @C0359n0 Lifecycle.State state) {
        if (!fragment.equals(mo56892o0(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.mMaxState = state;
    }

    /* renamed from: Y */
    public void mo56851Y() {
        this.f49235I = false;
        this.f49236J = false;
        this.f49242P.mo57416p0(false);
        mo56858a0(7);
    }

    /* renamed from: Y0 */
    public final boolean mo56852Y0() {
        Fragment fragment = this.f49268x;
        if (fragment == null) {
            return true;
        }
        if (!fragment.isAdded() || !this.f49268x.getParentFragmentManager().mo56852Y0()) {
            return false;
        }
        return true;
    }

    /* renamed from: Y1 */
    public void mo56853Y1(@C0363p0 Fragment fragment) {
        if (fragment == null || (fragment.equals(mo56892o0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f49269y;
            this.f49269y = fragment;
            mo56837T(fragment2);
            mo56837T(this.f49269y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: Z */
    public void mo56854Z() {
        this.f49235I = false;
        this.f49236J = false;
        this.f49242P.mo57416p0(false);
        mo56858a0(5);
    }

    /* renamed from: Z0 */
    public boolean mo56855Z0(@C0363p0 Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    /* renamed from: Z1 */
    public void mo56856Z1(@C0359n0 C19263p0 p0Var) {
        this.f49228B = p0Var;
    }

    /* renamed from: a */
    public final void mo56857a(@C0359n0 String str, @C0359n0 Bundle bundle) {
        C19181n nVar = this.f49256l.get(str);
        if (nVar == null || !nVar.mo56958a(Lifecycle.State.STARTED)) {
            this.f49255k.put(str, bundle);
        } else {
            nVar.mo32757p(str, bundle);
        }
        if (m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting fragment result with key ");
            sb.append(str);
            sb.append(" and result ");
            sb.append(bundle);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a0 */
    public final void mo56858a0(int i) {
        try {
            this.f49246b = true;
            this.f49247c.mo57150d(i);
            mo56887m1(i, false);
            for (SpecialEffectsController j : mo56785B()) {
                j.mo57014j();
            }
            this.f49246b = false;
            mo56880j0(true);
        } catch (Throwable th) {
            this.f49246b = false;
            throw th;
        }
    }

    /* renamed from: a1 */
    public boolean mo56859a1(@C0363p0 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* renamed from: a2 */
    public void mo56860a2(@C0363p0 FragmentStrictMode.C19270b bVar) {
        this.f49243Q = bVar;
    }

    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: b */
    public final void mo56861b(@C0359n0 final String str, @C0359n0 C19499w wVar, @C0359n0 final C19221c0 c0Var) {
        final Lifecycle lifecycle = wVar.getLifecycle();
        if (lifecycle.mo57465b() != Lifecycle.State.DESTROYED) {
            C191666 r0 = new C19470t() {
                /* renamed from: i */
                public void mo750i(@C0359n0 C19499w wVar, @C0359n0 Lifecycle.C19372Event event) {
                    Bundle bundle;
                    if (event == Lifecycle.C19372Event.ON_START && (bundle = (Bundle) FragmentManager.this.f49255k.get(str)) != null) {
                        c0Var.mo32757p(str, bundle);
                        FragmentManager.this.mo56869d(str);
                    }
                    if (event == Lifecycle.C19372Event.ON_DESTROY) {
                        lifecycle.mo57467d(this);
                        FragmentManager.this.f49256l.remove(str);
                    }
                }
            };
            lifecycle.mo57464a(r0);
            C19181n put = this.f49256l.put(str, new C19181n(lifecycle, c0Var, r0));
            if (put != null) {
                put.mo56959b();
            }
            if (m89694W0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Setting FragmentResultListener with key ");
                sb.append(str);
                sb.append(" lifecycleOwner ");
                sb.append(lifecycle);
                sb.append(" and listener ");
                sb.append(c0Var);
            }
        }
    }

    /* renamed from: b0 */
    public void mo56862b0() {
        this.f49236J = true;
        this.f49242P.mo57416p0(true);
        mo56858a0(4);
    }

    /* renamed from: b1 */
    public boolean mo56863b1(@C0363p0 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (!fragment.equals(fragmentManager.mo56822N0()) || !mo56863b1(fragmentManager.f49268x)) {
            return false;
        }
        return true;
    }

    /* renamed from: b2 */
    public final void mo56864b2(@C0359n0 Fragment fragment) {
        ViewGroup F0 = mo56798F0(fragment);
        if (F0 != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            int i = C19144a.C19147c.visible_removing_fragment_view_tag;
            if (F0.getTag(i) == null) {
                F0.setTag(i, fragment);
            }
            ((Fragment) F0.getTag(i)).setPopDirection(fragment.getPopDirection());
        }
    }

    /* renamed from: c */
    public final void mo56865c(@C0359n0 String str) {
        C19181n remove = this.f49256l.remove(str);
        if (remove != null) {
            remove.mo56959b();
        }
        if (m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing FragmentResultListener for key ");
            sb.append(str);
        }
    }

    /* renamed from: c0 */
    public void mo56866c0() {
        mo56858a0(2);
    }

    /* renamed from: c1 */
    public boolean mo56867c1(int i) {
        return this.f49265u >= i;
    }

    /* renamed from: c2 */
    public void mo56868c2(@C0359n0 Fragment fragment) {
        if (m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* renamed from: d */
    public final void mo56869d(@C0359n0 String str) {
        this.f49255k.remove(str);
        if (m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing fragment result with key ");
            sb.append(str);
        }
    }

    /* renamed from: d0 */
    public final void mo56870d0() {
        if (this.f49238L) {
            this.f49238L = false;
            mo56872d2();
        }
    }

    /* renamed from: d1 */
    public boolean mo56871d1() {
        return this.f49235I || this.f49236J;
    }

    /* renamed from: d2 */
    public final void mo56872d2() {
        for (C19225e0 q1 : this.f49247c.mo57158l()) {
            mo56898q1(q1);
        }
    }

    /* renamed from: e0 */
    public void mo56873e0(@C0359n0 String str, @C0363p0 FileDescriptor fileDescriptor, @C0359n0 PrintWriter printWriter, @C0363p0 String[] strArr) {
        int size;
        int size2;
        String str2 = str + C12412q.f30348a;
        this.f49247c.mo57151e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f49249e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f49249e.get(i).toString());
            }
        }
        ArrayList<C19197a> arrayList2 = this.f49248d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C19197a aVar = this.f49248d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo57045X(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f49253i.get());
        synchronized (this.f49245a) {
            int size3 = this.f49245a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f49245a.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f49266v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f49267w);
        if (this.f49268x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f49268x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f49265u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f49235I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f49236J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f49237K);
        if (this.f49234H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f49234H);
        }
    }

    /* renamed from: e2 */
    public final void mo56874e2(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C19260o0("FragmentManager"));
        C19253m<?> mVar = this.f49266v;
        if (mVar != null) {
            try {
                mVar.mo57194m(GlideException.C22148a.f56917d, (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception unused) {
            }
        } else {
            mo56873e0(GlideException.C22148a.f56917d, (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* renamed from: f2 */
    public void mo56875f2(@C0359n0 C19180m mVar) {
        this.f49258n.mo57364p(mVar);
    }

    /* renamed from: g0 */
    public final void mo56876g0() {
        for (SpecialEffectsController j : mo56785B()) {
            j.mo57014j();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (mo56786B0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (mo56863b1(r3.f49268x) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.mo970j(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f49252h;
     */
    /* renamed from: g2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56877g2() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$p> r0 = r3.f49245a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$p> r1 = r3.f49245a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.t r1 = r3.f49252h     // Catch:{ all -> 0x002a }
            r1.mo970j(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.t r0 = r3.f49252h
            int r1 = r3.mo56786B0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f49268x
            boolean r1 = r3.mo56863b1(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.mo970j(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo56877g2():void");
    }

    /* renamed from: h0 */
    public void mo56878h0(@C0359n0 C19183p pVar, boolean z) {
        if (!z) {
            if (this.f49266v != null) {
                mo56913w();
            } else if (this.f49237K) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f49245a) {
            if (this.f49266v != null) {
                this.f49245a.add(pVar);
                mo56842U1();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: i0 */
    public final void mo56879i0(boolean z) {
        if (this.f49246b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f49266v == null) {
            if (this.f49237K) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f49266v.mo57317l().getLooper()) {
            if (!z) {
                mo56913w();
            }
            if (this.f49239M == null) {
                this.f49239M = new ArrayList<>();
                this.f49240N = new ArrayList<>();
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: j0 */
    public boolean mo56880j0(boolean z) {
        mo56879i0(z);
        boolean z2 = false;
        while (mo56917x0(this.f49239M, this.f49240N)) {
            z2 = true;
            this.f49246b = true;
            try {
                mo56799F1(this.f49239M, this.f49240N);
            } finally {
                mo56916x();
            }
        }
        mo56877g2();
        mo56870d0();
        this.f49247c.mo57148b();
        return z2;
    }

    /* renamed from: j1 */
    public void mo56881j1(@C0359n0 Fragment fragment, @C0359n0 String[] strArr, int i) {
        if (this.f49232F != null) {
            this.f49233G.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            this.f49232F.mo960b(strArr);
            return;
        }
        this.f49266v.mo57318t(fragment, strArr, i);
    }

    /* renamed from: k0 */
    public void mo56882k0(@C0359n0 C19183p pVar, boolean z) {
        if (!z || (this.f49266v != null && !this.f49237K)) {
            mo56879i0(z);
            if (pVar.mo56944a(this.f49239M, this.f49240N)) {
                this.f49246b = true;
                try {
                    mo56799F1(this.f49239M, this.f49240N);
                } finally {
                    mo56916x();
                }
            }
            mo56877g2();
            mo56870d0();
            this.f49247c.mo57148b();
        }
    }

    /* renamed from: k1 */
    public void mo56883k1(@C0359n0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @C0363p0 Bundle bundle) {
        if (this.f49230D != null) {
            this.f49233G.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            if (!(intent == null || bundle == null)) {
                intent.putExtra(C0268b.C0290m.f818b, bundle);
            }
            this.f49230D.mo960b(intent);
            return;
        }
        this.f49266v.mo57313A(fragment, intent, i, bundle);
    }

    /* renamed from: l1 */
    public void mo56884l1(@C0359n0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @C0363p0 Intent intent, int i2, int i3, int i4, @C0363p0 Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        Fragment fragment2 = fragment;
        Bundle bundle2 = bundle;
        if (this.f49231E != null) {
            if (bundle2 != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra(f49226a0, true);
                } else {
                    intent2 = intent;
                }
                if (m89694W0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ActivityOptions ");
                    sb.append(bundle2);
                    sb.append(" were added to fillInIntent ");
                    sb.append(intent2);
                    sb.append(" for fragment ");
                    sb.append(fragment);
                }
                intent2.putExtra(C0268b.C0290m.f818b, bundle2);
            } else {
                intent2 = intent;
            }
            IntentSender intentSender2 = intentSender;
            int i5 = i2;
            IntentSenderRequest a = new IntentSenderRequest.C0259a(intentSender).mo892b(intent2).mo893c(i3, i2).mo891a();
            int i6 = i;
            this.f49233G.addLast(new LaunchedFragmentInfo(fragment2.mWho, i));
            if (m89694W0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Fragment ");
                sb2.append(fragment);
                sb2.append("is launching an IntentSender for result ");
            }
            this.f49231E.mo960b(a);
            return;
        }
        IntentSender intentSender3 = intentSender;
        int i7 = i;
        this.f49266v.mo57314B(fragment, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: m */
    public void mo56885m(C19197a aVar) {
        if (this.f49248d == null) {
            this.f49248d = new ArrayList<>();
        }
        this.f49248d.add(aVar);
    }

    /* renamed from: m0 */
    public final void mo56886m0(@C0359n0 ArrayList<C19197a> arrayList, @C0359n0 ArrayList<Boolean> arrayList2, int i, int i2) {
        boolean z = arrayList.get(i).f49508r;
        ArrayList<Fragment> arrayList3 = this.f49241O;
        if (arrayList3 == null) {
            this.f49241O = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f49241O.addAll(this.f49247c.mo57162p());
        Fragment N0 = mo56822N0();
        boolean z2 = false;
        for (int i3 = i; i3 < i2; i3++) {
            C19197a aVar = arrayList.get(i3);
            if (!arrayList2.get(i3).booleanValue()) {
                N0 = aVar.mo57049b0(this.f49241O, N0);
            } else {
                N0 = aVar.mo57051d0(this.f49241O, N0);
            }
            if (z2 || aVar.f49499i) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.f49241O.clear();
        if (!z && this.f49265u >= 1) {
            for (int i4 = i; i4 < i2; i4++) {
                Iterator<C19234h0.C19235a> it = arrayList.get(i4).f49493c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f49511b;
                    if (!(fragment == null || fragment.mFragmentManager == null)) {
                        this.f49247c.mo57165s(mo56791D(fragment));
                    }
                }
            }
        }
        m89709l0(arrayList, arrayList2, i, i2);
        boolean booleanValue = arrayList2.get(i2 - 1).booleanValue();
        for (int i5 = i; i5 < i2; i5++) {
            C19197a aVar2 = arrayList.get(i5);
            if (booleanValue) {
                for (int size = aVar2.f49493c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = aVar2.f49493c.get(size).f49511b;
                    if (fragment2 != null) {
                        mo56791D(fragment2).mo57130m();
                    }
                }
            } else {
                Iterator<C19234h0.C19235a> it2 = aVar2.f49493c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = it2.next().f49511b;
                    if (fragment3 != null) {
                        mo56791D(fragment3).mo57130m();
                    }
                }
            }
        }
        mo56887m1(this.f49265u, true);
        for (SpecialEffectsController next : mo56788C(arrayList, i, i2)) {
            next.mo57020r(booleanValue);
            next.mo57018p();
            next.mo57011g();
        }
        while (i < i2) {
            C19197a aVar3 = arrayList.get(i);
            if (arrayList2.get(i).booleanValue() && aVar3.f49367P >= 0) {
                aVar3.f49367P = -1;
            }
            aVar3.mo57050c0();
            i++;
        }
        if (z2) {
            mo56805H1();
        }
    }

    /* renamed from: m1 */
    public void mo56887m1(int i, boolean z) {
        C19253m<?> mVar;
        if (this.f49266v == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f49265u) {
            this.f49265u = i;
            this.f49247c.mo57167u();
            mo56872d2();
            if (this.f49234H && (mVar = this.f49266v) != null && this.f49265u == 7) {
                mVar.mo57192D();
                this.f49234H = false;
            }
        }
    }

    /* renamed from: n */
    public C19225e0 mo56888n(@C0359n0 Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.m90376i(fragment, str);
        }
        if (m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
        }
        C19225e0 D = mo56791D(fragment);
        fragment.mFragmentManager = this;
        this.f49247c.mo57165s(D);
        if (!fragment.mDetached) {
            this.f49247c.mo57147a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (mo56849X0(fragment)) {
                this.f49234H = true;
            }
        }
        return D;
    }

    /* renamed from: n0 */
    public boolean mo56889n0() {
        boolean j0 = mo56880j0(true);
        mo56914w0();
        return j0;
    }

    /* renamed from: n1 */
    public void mo56890n1() {
        if (this.f49266v != null) {
            this.f49235I = false;
            this.f49236J = false;
            this.f49242P.mo57416p0(false);
            for (Fragment next : this.f49247c.mo57162p()) {
                if (next != null) {
                    next.noteStateNotSaved();
                }
            }
        }
    }

    /* renamed from: o */
    public void mo56891o(@C0359n0 C19198a0 a0Var) {
        this.f49259o.add(a0Var);
    }

    @C0363p0
    /* renamed from: o0 */
    public Fragment mo56892o0(@C0359n0 String str) {
        return this.f49247c.mo57152f(str);
    }

    /* renamed from: o1 */
    public void mo56893o1(@C0359n0 FragmentContainerView fragmentContainerView) {
        View view;
        for (C19225e0 next : this.f49247c.mo57158l()) {
            Fragment k = next.mo57128k();
            if (k.mContainerId == fragmentContainerView.getId() && (view = k.mView) != null && view.getParent() == null) {
                k.mContainer = fragmentContainerView;
                next.mo57119b();
            }
        }
    }

    /* renamed from: p */
    public void mo56894p(@C0359n0 C19182o oVar) {
        if (this.f49257m == null) {
            this.f49257m = new ArrayList<>();
        }
        this.f49257m.add(oVar);
    }

    /* renamed from: p0 */
    public final int mo56895p0(@C0363p0 String str, int i, boolean z) {
        ArrayList<C19197a> arrayList = this.f49248d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str != null || i >= 0) {
            int size = this.f49248d.size() - 1;
            while (size >= 0) {
                C19197a aVar = this.f49248d.get(size);
                if ((str != null && str.equals(aVar.getName())) || (i >= 0 && i == aVar.f49367P)) {
                    break;
                }
                size--;
            }
            if (size < 0) {
                return size;
            }
            if (z) {
                while (size > 0) {
                    C19197a aVar2 = this.f49248d.get(size - 1);
                    if ((str == null || !str.equals(aVar2.getName())) && (i < 0 || i != aVar2.f49367P)) {
                        return size;
                    }
                    size--;
                }
                return size;
            } else if (size == this.f49248d.size() - 1) {
                return -1;
            } else {
                return size + 1;
            }
        } else if (z) {
            return 0;
        } else {
            return this.f49248d.size() - 1;
        }
    }

    @C0359n0
    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: p1 */
    public C19234h0 mo56896p1() {
        return mo56909u();
    }

    /* renamed from: q */
    public void mo56897q(@C0359n0 Fragment fragment) {
        this.f49242P.mo57402c0(fragment);
    }

    /* renamed from: q1 */
    public void mo56898q1(@C0359n0 C19225e0 e0Var) {
        Fragment k = e0Var.mo57128k();
        if (!k.mDeferStart) {
            return;
        }
        if (this.f49246b) {
            this.f49238L = true;
            return;
        }
        k.mDeferStart = false;
        e0Var.mo57130m();
    }

    /* renamed from: r */
    public int mo56899r() {
        return this.f49253i.getAndIncrement();
    }

    @C0363p0
    /* renamed from: r0 */
    public Fragment mo56900r0(@C0329d0 int i) {
        return this.f49247c.mo57153g(i);
    }

    /* renamed from: r1 */
    public void mo56901r1() {
        mo56878h0(new C19184q((String) null, -1, 0), false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.activity.a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo56902s(@androidx.annotation.C0359n0 androidx.fragment.app.C19253m<?> r4, @androidx.annotation.C0359n0 androidx.fragment.app.C19240j r5, @androidx.annotation.C0363p0 androidx.fragment.app.Fragment r6) {
        /*
            r3 = this;
            androidx.fragment.app.m<?> r0 = r3.f49266v
            if (r0 != 0) goto L_0x016c
            r3.f49266v = r4
            r3.f49267w = r5
            r3.f49268x = r6
            if (r6 == 0) goto L_0x0015
            androidx.fragment.app.FragmentManager$g r5 = new androidx.fragment.app.FragmentManager$g
            r5.<init>(r6)
            r3.mo56891o(r5)
            goto L_0x001f
        L_0x0015:
            boolean r5 = r4 instanceof androidx.fragment.app.C19198a0
            if (r5 == 0) goto L_0x001f
            r5 = r4
            androidx.fragment.app.a0 r5 = (androidx.fragment.app.C19198a0) r5
            r3.mo56891o(r5)
        L_0x001f:
            androidx.fragment.app.Fragment r5 = r3.f49268x
            if (r5 == 0) goto L_0x0026
            r3.mo56877g2()
        L_0x0026:
            boolean r5 = r4 instanceof androidx.activity.C0213a0
            if (r5 == 0) goto L_0x003b
            r5 = r4
            androidx.activity.a0 r5 = (androidx.activity.C0213a0) r5
            androidx.activity.OnBackPressedDispatcher r0 = r5.mo702Z()
            r3.f49251g = r0
            if (r6 == 0) goto L_0x0036
            r5 = r6
        L_0x0036:
            androidx.activity.t r1 = r3.f49252h
            r0.mo764c(r5, r1)
        L_0x003b:
            if (r6 == 0) goto L_0x0046
            androidx.fragment.app.FragmentManager r4 = r6.mFragmentManager
            androidx.fragment.app.z r4 = r4.mo56789C0(r6)
            r3.f49242P = r4
            goto L_0x005f
        L_0x0046:
            boolean r5 = r4 instanceof androidx.lifecycle.C19395b1
            if (r5 == 0) goto L_0x0057
            androidx.lifecycle.b1 r4 = (androidx.lifecycle.C19395b1) r4
            androidx.lifecycle.a1 r4 = r4.getViewModelStore()
            androidx.fragment.app.z r4 = androidx.fragment.app.C19281z.m90427i0(r4)
            r3.f49242P = r4
            goto L_0x005f
        L_0x0057:
            androidx.fragment.app.z r4 = new androidx.fragment.app.z
            r5 = 0
            r4.<init>(r5)
            r3.f49242P = r4
        L_0x005f:
            androidx.fragment.app.z r4 = r3.f49242P
            boolean r5 = r3.mo56871d1()
            r4.mo57416p0(r5)
            androidx.fragment.app.g0 r4 = r3.f49247c
            androidx.fragment.app.z r5 = r3.f49242P
            r4.mo57145B(r5)
            androidx.fragment.app.m<?> r4 = r3.f49266v
            boolean r5 = r4 instanceof androidx.savedstate.C20437e
            if (r5 == 0) goto L_0x0090
            if (r6 != 0) goto L_0x0090
            androidx.savedstate.e r4 = (androidx.savedstate.C20437e) r4
            androidx.savedstate.c r4 = r4.getSavedStateRegistry()
            androidx.fragment.app.v r5 = new androidx.fragment.app.v
            r5.<init>(r3)
            java.lang.String r0 = "android:support:fragments"
            r4.mo61291j(r0, r5)
            android.os.Bundle r4 = r4.mo61284b(r0)
            if (r4 == 0) goto L_0x0090
            r3.mo56820M1(r4)
        L_0x0090:
            androidx.fragment.app.m<?> r4 = r3.f49266v
            boolean r5 = r4 instanceof androidx.activity.result.C0304i
            if (r5 == 0) goto L_0x0128
            androidx.activity.result.i r4 = (androidx.activity.result.C0304i) r4
            androidx.activity.result.ActivityResultRegistry r4 = r4.mo715i()
            if (r6 == 0) goto L_0x00b2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r6.mWho
            r5.append(r0)
            java.lang.String r0 = ":"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            goto L_0x00b4
        L_0x00b2:
            java.lang.String r5 = ""
        L_0x00b4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FragmentManager:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartActivityForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.activity.result.contract.b$m r1 = new androidx.activity.result.contract.b$m
            r1.<init>()
            androidx.fragment.app.FragmentManager$h r2 = new androidx.fragment.app.FragmentManager$h
            r2.<init>()
            androidx.activity.result.g r0 = r4.mo879i(r0, r1, r2)
            r3.f49230D = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartIntentSenderForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.FragmentManager$l r1 = new androidx.fragment.app.FragmentManager$l
            r1.<init>()
            androidx.fragment.app.FragmentManager$i r2 = new androidx.fragment.app.FragmentManager$i
            r2.<init>()
            androidx.activity.result.g r0 = r4.mo879i(r0, r1, r2)
            r3.f49231E = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "RequestPermissions"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            androidx.activity.result.contract.b$k r0 = new androidx.activity.result.contract.b$k
            r0.<init>()
            androidx.fragment.app.FragmentManager$a r1 = new androidx.fragment.app.FragmentManager$a
            r1.<init>()
            androidx.activity.result.g r4 = r4.mo879i(r5, r0, r1)
            r3.f49232F = r4
        L_0x0128:
            androidx.fragment.app.m<?> r4 = r3.f49266v
            boolean r5 = r4 instanceof androidx.core.content.C17363o0
            if (r5 == 0) goto L_0x0135
            androidx.core.content.o0 r4 = (androidx.core.content.C17363o0) r4
            androidx.core.util.d<android.content.res.Configuration> r5 = r3.f49260p
            r4.mo705d(r5)
        L_0x0135:
            androidx.fragment.app.m<?> r4 = r3.f49266v
            boolean r5 = r4 instanceof androidx.core.content.C17365p0
            if (r5 == 0) goto L_0x0142
            androidx.core.content.p0 r4 = (androidx.core.content.C17365p0) r4
            androidx.core.util.d<java.lang.Integer> r5 = r3.f49261q
            r4.mo733p(r5)
        L_0x0142:
            androidx.fragment.app.m<?> r4 = r3.f49266v
            boolean r5 = r4 instanceof androidx.core.app.C17193o4
            if (r5 == 0) goto L_0x014f
            androidx.core.app.o4 r4 = (androidx.core.app.C17193o4) r4
            androidx.core.util.d<androidx.core.app.d0> r5 = r3.f49262r
            r4.mo693C(r5)
        L_0x014f:
            androidx.fragment.app.m<?> r4 = r3.f49266v
            boolean r5 = r4 instanceof androidx.core.app.C17211q4
            if (r5 == 0) goto L_0x015c
            androidx.core.app.q4 r4 = (androidx.core.app.C17211q4) r4
            androidx.core.util.d<androidx.core.app.h5> r5 = r3.f49263s
            r4.mo714h(r5)
        L_0x015c:
            androidx.fragment.app.m<?> r4 = r3.f49266v
            boolean r5 = r4 instanceof androidx.core.view.C18383u0
            if (r5 == 0) goto L_0x016b
            if (r6 != 0) goto L_0x016b
            androidx.core.view.u0 r4 = (androidx.core.view.C18383u0) r4
            androidx.core.view.n1 r5 = r3.f49264t
            r4.mo696H(r5)
        L_0x016b:
            return
        L_0x016c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already attached"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo56902s(androidx.fragment.app.m, androidx.fragment.app.j, androidx.fragment.app.Fragment):void");
    }

    @C0363p0
    /* renamed from: s0 */
    public Fragment mo56903s0(@C0363p0 String str) {
        return this.f49247c.mo57154h(str);
    }

    /* renamed from: s1 */
    public void mo56904s1(int i, int i2) {
        mo56907t1(i, i2, false);
    }

    /* renamed from: t */
    public void mo56905t(@C0359n0 Fragment fragment) {
        if (m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.f49247c.mo57147a(fragment);
                if (m89694W0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(fragment);
                }
                if (mo56849X0(fragment)) {
                    this.f49234H = true;
                }
            }
        }
    }

    /* renamed from: t0 */
    public Fragment mo56906t0(@C0359n0 String str) {
        return this.f49247c.mo57155i(str);
    }

    /* renamed from: t1 */
    public void mo56907t1(int i, int i2, boolean z) {
        if (i >= 0) {
            mo56878h0(new C19184q((String) null, i, i2), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    @C0359n0
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f49268x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append(C33093b.f80281i);
            sb.append(Integer.toHexString(System.identityHashCode(this.f49268x)));
            sb.append("}");
        } else {
            C19253m<?> mVar = this.f49266v;
            if (mVar != null) {
                sb.append(mVar.getClass().getSimpleName());
                sb.append(C33093b.f80281i);
                sb.append(Integer.toHexString(System.identityHashCode(this.f49266v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    @C0359n0
    /* renamed from: u */
    public C19234h0 mo56909u() {
        return new C19197a(this);
    }

    /* renamed from: u1 */
    public void mo56910u1(@C0363p0 String str, int i) {
        mo56878h0(new C19184q(str, -1, i), false);
    }

    /* renamed from: v */
    public boolean mo56911v() {
        boolean z = false;
        for (Fragment next : this.f49247c.mo57159m()) {
            if (next != null) {
                z = mo56849X0(next);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v1 */
    public boolean mo56912v1() {
        return mo56921y1((String) null, -1, 0);
    }

    /* renamed from: w */
    public final void mo56913w() {
        if (mo56871d1()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: w0 */
    public final void mo56914w0() {
        for (SpecialEffectsController k : mo56785B()) {
            k.mo57015k();
        }
    }

    /* renamed from: w1 */
    public boolean mo56915w1(int i, int i2) {
        if (i >= 0) {
            return mo56921y1((String) null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: x */
    public final void mo56916x() {
        this.f49246b = false;
        this.f49240N.clear();
        this.f49239M.clear();
    }

    /* renamed from: x0 */
    public final boolean mo56917x0(@C0359n0 ArrayList<C19197a> arrayList, @C0359n0 ArrayList<Boolean> arrayList2) {
        synchronized (this.f49245a) {
            if (this.f49245a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f49245a.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    z |= this.f49245a.get(i).mo56944a(arrayList, arrayList2);
                }
                return z;
            } finally {
                this.f49245a.clear();
                this.f49266v.mo57317l().removeCallbacks(this.f49244R);
            }
        }
    }

    /* renamed from: x1 */
    public boolean mo56918x1(@C0363p0 String str, int i) {
        return mo56921y1(str, -1, i);
    }

    /* renamed from: y */
    public void mo56919y(@C0359n0 String str) {
        mo56878h0(new C19178k(str), false);
    }

    /* renamed from: y0 */
    public int mo56920y0() {
        return this.f49247c.mo57157k();
    }

    /* renamed from: y1 */
    public final boolean mo56921y1(@C0363p0 String str, int i, int i2) {
        mo56880j0(false);
        mo56879i0(true);
        Fragment fragment = this.f49269y;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().mo56912v1()) {
            return true;
        }
        boolean z1 = mo56924z1(this.f49239M, this.f49240N, str, i, i2);
        if (z1) {
            this.f49246b = true;
            try {
                mo56799F1(this.f49239M, this.f49240N);
            } finally {
                mo56916x();
            }
        }
        mo56877g2();
        mo56870d0();
        this.f49247c.mo57148b();
        return z1;
    }

    /* renamed from: z */
    public boolean mo56922z(@C0359n0 ArrayList<C19197a> arrayList, @C0359n0 ArrayList<Boolean> arrayList2, @C0359n0 String str) {
        if (!mo56814K1(arrayList, arrayList2, str)) {
            return false;
        }
        return mo56924z1(arrayList, arrayList2, str, -1, 1);
    }

    @C0359n0
    /* renamed from: z0 */
    public List<Fragment> mo56923z0() {
        return this.f49247c.mo57159m();
    }

    /* renamed from: z1 */
    public boolean mo56924z1(@C0359n0 ArrayList<C19197a> arrayList, @C0359n0 ArrayList<Boolean> arrayList2, @C0363p0 String str, int i, int i2) {
        boolean z;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        int p0 = mo56895p0(str, i, z);
        if (p0 < 0) {
            return false;
        }
        for (int size = this.f49248d.size() - 1; size >= p0; size--) {
            arrayList.add(this.f49248d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C19167a();

        /* renamed from: a */
        public String f49275a;

        /* renamed from: b */
        public int f49276b;

        /* renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        public class C19167a implements Parcelable.Creator<LaunchedFragmentInfo> {
            /* renamed from: a */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            /* renamed from: b */
            public LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(@C0359n0 String str, int i) {
            this.f49275a = str;
            this.f49276b = i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f49275a);
            parcel.writeInt(this.f49276b);
        }

        public LaunchedFragmentInfo(@C0359n0 Parcel parcel) {
            this.f49275a = parcel.readString();
            this.f49276b = parcel.readInt();
        }
    }
}
