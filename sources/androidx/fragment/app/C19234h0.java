package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0319a;
import androidx.annotation.C0322b;
import androidx.annotation.C0324b1;
import androidx.annotation.C0327c1;
import androidx.annotation.C0329d0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.view.C18196h2;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.h0 */
public abstract class C19234h0 {

    /* renamed from: A */
    public static final int f49471A = 7;

    /* renamed from: B */
    public static final int f49472B = 8;

    /* renamed from: C */
    public static final int f49473C = 9;

    /* renamed from: D */
    public static final int f49474D = 10;

    /* renamed from: E */
    public static final int f49475E = 4096;

    /* renamed from: F */
    public static final int f49476F = 8192;

    /* renamed from: G */
    public static final int f49477G = -1;

    /* renamed from: H */
    public static final int f49478H = 0;

    /* renamed from: I */
    public static final int f49479I = 4097;

    /* renamed from: J */
    public static final int f49480J = 8194;

    /* renamed from: K */
    public static final int f49481K = 4099;

    /* renamed from: L */
    public static final int f49482L = 4100;

    /* renamed from: M */
    public static final int f49483M = 8197;

    /* renamed from: t */
    public static final int f49484t = 0;

    /* renamed from: u */
    public static final int f49485u = 1;

    /* renamed from: v */
    public static final int f49486v = 2;

    /* renamed from: w */
    public static final int f49487w = 3;

    /* renamed from: x */
    public static final int f49488x = 4;

    /* renamed from: y */
    public static final int f49489y = 5;

    /* renamed from: z */
    public static final int f49490z = 6;

    /* renamed from: a */
    public final C19250l f49491a;

    /* renamed from: b */
    public final ClassLoader f49492b;

    /* renamed from: c */
    public ArrayList<C19235a> f49493c;

    /* renamed from: d */
    public int f49494d;

    /* renamed from: e */
    public int f49495e;

    /* renamed from: f */
    public int f49496f;

    /* renamed from: g */
    public int f49497g;

    /* renamed from: h */
    public int f49498h;

    /* renamed from: i */
    public boolean f49499i;

    /* renamed from: j */
    public boolean f49500j;
    @C0363p0

    /* renamed from: k */
    public String f49501k;

    /* renamed from: l */
    public int f49502l;

    /* renamed from: m */
    public CharSequence f49503m;

    /* renamed from: n */
    public int f49504n;

    /* renamed from: o */
    public CharSequence f49505o;

    /* renamed from: p */
    public ArrayList<String> f49506p;

    /* renamed from: q */
    public ArrayList<String> f49507q;

    /* renamed from: r */
    public boolean f49508r;

    /* renamed from: s */
    public ArrayList<Runnable> f49509s;

    /* renamed from: androidx.fragment.app.h0$a */
    public static final class C19235a {

        /* renamed from: a */
        public int f49510a;

        /* renamed from: b */
        public Fragment f49511b;

        /* renamed from: c */
        public boolean f49512c;

        /* renamed from: d */
        public int f49513d;

        /* renamed from: e */
        public int f49514e;

        /* renamed from: f */
        public int f49515f;

        /* renamed from: g */
        public int f49516g;

        /* renamed from: h */
        public Lifecycle.State f49517h;

        /* renamed from: i */
        public Lifecycle.State f49518i;

        public C19235a() {
        }

        public C19235a(int i, Fragment fragment) {
            this.f49510a = i;
            this.f49511b = fragment;
            this.f49512c = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f49517h = state;
            this.f49518i = state;
        }

        public C19235a(int i, Fragment fragment, boolean z) {
            this.f49510a = i;
            this.f49511b = fragment;
            this.f49512c = z;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f49517h = state;
            this.f49518i = state;
        }

        public C19235a(int i, @C0359n0 Fragment fragment, Lifecycle.State state) {
            this.f49510a = i;
            this.f49511b = fragment;
            this.f49512c = false;
            this.f49517h = fragment.mMaxState;
            this.f49518i = state;
        }

        public C19235a(C19235a aVar) {
            this.f49510a = aVar.f49510a;
            this.f49511b = aVar.f49511b;
            this.f49512c = aVar.f49512c;
            this.f49513d = aVar.f49513d;
            this.f49514e = aVar.f49514e;
            this.f49515f = aVar.f49515f;
            this.f49516g = aVar.f49516g;
            this.f49517h = aVar.f49517h;
            this.f49518i = aVar.f49518i;
        }
    }

    @Deprecated
    public C19234h0() {
        this.f49493c = new ArrayList<>();
        this.f49500j = true;
        this.f49508r = false;
        this.f49491a = null;
        this.f49492b = null;
    }

    /* renamed from: A */
    public boolean mo57037A() {
        return this.f49493c.isEmpty();
    }

    @C0359n0
    /* renamed from: B */
    public C19234h0 mo57038B(@C0359n0 Fragment fragment) {
        mo57223m(new C19235a(3, fragment));
        return this;
    }

    @C0359n0
    /* renamed from: C */
    public C19234h0 mo57201C(@C0329d0 int i, @C0359n0 Fragment fragment) {
        return mo57202D(i, fragment, (String) null);
    }

    @C0359n0
    /* renamed from: D */
    public C19234h0 mo57202D(@C0329d0 int i, @C0359n0 Fragment fragment, @C0363p0 String str) {
        if (i != 0) {
            mo57058x(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    @C0359n0
    /* renamed from: E */
    public final C19234h0 mo57203E(@C0329d0 int i, @C0359n0 Class<? extends Fragment> cls, @C0363p0 Bundle bundle) {
        return mo57204F(i, cls, bundle, (String) null);
    }

    @C0359n0
    /* renamed from: F */
    public final C19234h0 mo57204F(@C0329d0 int i, @C0359n0 Class<? extends Fragment> cls, @C0363p0 Bundle bundle, @C0363p0 String str) {
        return mo57202D(i, mo57227u(cls, bundle), str);
    }

    @C0359n0
    /* renamed from: G */
    public C19234h0 mo57205G(@C0359n0 Runnable runnable) {
        mo57228w();
        if (this.f49509s == null) {
            this.f49509s = new ArrayList<>();
        }
        this.f49509s.add(runnable);
        return this;
    }

    @C0359n0
    @Deprecated
    /* renamed from: H */
    public C19234h0 mo57206H(boolean z) {
        return mo57213Q(z);
    }

    @C0359n0
    @Deprecated
    /* renamed from: I */
    public C19234h0 mo57207I(@C0324b1 int i) {
        this.f49504n = i;
        this.f49505o = null;
        return this;
    }

    @C0359n0
    @Deprecated
    /* renamed from: J */
    public C19234h0 mo57208J(@C0363p0 CharSequence charSequence) {
        this.f49504n = 0;
        this.f49505o = charSequence;
        return this;
    }

    @C0359n0
    @Deprecated
    /* renamed from: K */
    public C19234h0 mo57209K(@C0324b1 int i) {
        this.f49502l = i;
        this.f49503m = null;
        return this;
    }

    @C0359n0
    @Deprecated
    /* renamed from: L */
    public C19234h0 mo57210L(@C0363p0 CharSequence charSequence) {
        this.f49502l = 0;
        this.f49503m = charSequence;
        return this;
    }

    @C0359n0
    /* renamed from: M */
    public C19234h0 mo57211M(@C0322b @C0319a int i, @C0322b @C0319a int i2) {
        return mo57212N(i, i2, 0, 0);
    }

    @C0359n0
    /* renamed from: N */
    public C19234h0 mo57212N(@C0322b @C0319a int i, @C0322b @C0319a int i2, @C0322b @C0319a int i3, @C0322b @C0319a int i4) {
        this.f49494d = i;
        this.f49495e = i2;
        this.f49496f = i3;
        this.f49497g = i4;
        return this;
    }

    @C0359n0
    /* renamed from: O */
    public C19234h0 mo57039O(@C0359n0 Fragment fragment, @C0359n0 Lifecycle.State state) {
        mo57223m(new C19235a(10, fragment, state));
        return this;
    }

    @C0359n0
    /* renamed from: P */
    public C19234h0 mo57040P(@C0363p0 Fragment fragment) {
        mo57223m(new C19235a(8, fragment));
        return this;
    }

    @C0359n0
    /* renamed from: Q */
    public C19234h0 mo57213Q(boolean z) {
        this.f49508r = z;
        return this;
    }

    @C0359n0
    /* renamed from: R */
    public C19234h0 mo57214R(int i) {
        this.f49498h = i;
        return this;
    }

    @C0359n0
    @Deprecated
    /* renamed from: S */
    public C19234h0 mo57215S(@C0327c1 int i) {
        return this;
    }

    @C0359n0
    /* renamed from: T */
    public C19234h0 mo57041T(@C0359n0 Fragment fragment) {
        mo57223m(new C19235a(5, fragment));
        return this;
    }

    @C0359n0
    /* renamed from: f */
    public C19234h0 mo57216f(@C0329d0 int i, @C0359n0 Fragment fragment) {
        mo57058x(i, fragment, (String) null, 1);
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public C19234h0 mo57217g(@C0329d0 int i, @C0359n0 Fragment fragment, @C0363p0 String str) {
        mo57058x(i, fragment, str, 1);
        return this;
    }

    @C0359n0
    /* renamed from: h */
    public final C19234h0 mo57218h(@C0329d0 int i, @C0359n0 Class<? extends Fragment> cls, @C0363p0 Bundle bundle) {
        return mo57216f(i, mo57227u(cls, bundle));
    }

    @C0359n0
    /* renamed from: i */
    public final C19234h0 mo57219i(@C0329d0 int i, @C0359n0 Class<? extends Fragment> cls, @C0363p0 Bundle bundle, @C0363p0 String str) {
        return mo57217g(i, mo57227u(cls, bundle), str);
    }

    /* renamed from: j */
    public C19234h0 mo57220j(@C0359n0 ViewGroup viewGroup, @C0359n0 Fragment fragment, @C0363p0 String str) {
        fragment.mContainer = viewGroup;
        return mo57217g(viewGroup.getId(), fragment, str);
    }

    @C0359n0
    /* renamed from: k */
    public C19234h0 mo57221k(@C0359n0 Fragment fragment, @C0363p0 String str) {
        mo57058x(0, fragment, str, 1);
        return this;
    }

    @C0359n0
    /* renamed from: l */
    public final C19234h0 mo57222l(@C0359n0 Class<? extends Fragment> cls, @C0363p0 Bundle bundle, @C0363p0 String str) {
        return mo57221k(mo57227u(cls, bundle), str);
    }

    /* renamed from: m */
    public void mo57223m(C19235a aVar) {
        this.f49493c.add(aVar);
        aVar.f49513d = this.f49494d;
        aVar.f49514e = this.f49495e;
        aVar.f49515f = this.f49496f;
        aVar.f49516g = this.f49497g;
    }

    @C0359n0
    /* renamed from: n */
    public C19234h0 mo57224n(@C0359n0 View view, @C0359n0 String str) {
        if (C19241j0.m90219f()) {
            String x0 = C18196h2.m82649x0(view);
            if (x0 != null) {
                if (this.f49506p == null) {
                    this.f49506p = new ArrayList<>();
                    this.f49507q = new ArrayList<>();
                } else if (this.f49507q.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                } else if (this.f49506p.contains(x0)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + x0 + "' has already been added to the transaction.");
                }
                this.f49506p.add(x0);
                this.f49507q.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    @C0359n0
    /* renamed from: o */
    public C19234h0 mo57225o(@C0363p0 String str) {
        if (this.f49500j) {
            this.f49499i = true;
            this.f49501k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    @C0359n0
    /* renamed from: p */
    public C19234h0 mo57226p(@C0359n0 Fragment fragment) {
        mo57223m(new C19235a(7, fragment));
        return this;
    }

    /* renamed from: q */
    public abstract int mo57052q();

    /* renamed from: r */
    public abstract int mo57053r();

    /* renamed from: s */
    public abstract void mo57054s();

    /* renamed from: t */
    public abstract void mo57055t();

    @C0359n0
    /* renamed from: u */
    public final Fragment mo57227u(@C0359n0 Class<? extends Fragment> cls, @C0363p0 Bundle bundle) {
        C19250l lVar = this.f49491a;
        if (lVar != null) {
            ClassLoader classLoader = this.f49492b;
            if (classLoader != null) {
                Fragment a = lVar.mo56932a(classLoader, cls.getName());
                if (bundle != null) {
                    a.setArguments(bundle);
                }
                return a;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    @C0359n0
    /* renamed from: v */
    public C19234h0 mo57057v(@C0359n0 Fragment fragment) {
        mo57223m(new C19235a(6, fragment));
        return this;
    }

    @C0359n0
    /* renamed from: w */
    public C19234h0 mo57228w() {
        if (!this.f49499i) {
            this.f49500j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: x */
    public void mo57058x(int i, Fragment fragment, @C0363p0 String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.m90376i(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 == null || str.equals(str3)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.mFragmentId;
                if (i3 == 0 || i3 == i) {
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo57223m(new C19235a(i2, fragment));
    }

    @C0359n0
    /* renamed from: y */
    public C19234h0 mo57059y(@C0359n0 Fragment fragment) {
        mo57223m(new C19235a(4, fragment));
        return this;
    }

    /* renamed from: z */
    public boolean mo57229z() {
        return this.f49500j;
    }

    public C19234h0(@C0359n0 C19250l lVar, @C0363p0 ClassLoader classLoader) {
        this.f49493c = new ArrayList<>();
        this.f49500j = true;
        this.f49508r = false;
        this.f49491a = lVar;
        this.f49492b = classLoader;
    }

    public C19234h0(@C0359n0 C19250l lVar, @C0363p0 ClassLoader classLoader, @C0359n0 C19234h0 h0Var) {
        this(lVar, classLoader);
        Iterator<C19235a> it = h0Var.f49493c.iterator();
        while (it.hasNext()) {
            this.f49493c.add(new C19235a(it.next()));
        }
        this.f49494d = h0Var.f49494d;
        this.f49495e = h0Var.f49495e;
        this.f49496f = h0Var.f49496f;
        this.f49497g = h0Var.f49497g;
        this.f49498h = h0Var.f49498h;
        this.f49499i = h0Var.f49499i;
        this.f49500j = h0Var.f49500j;
        this.f49501k = h0Var.f49501k;
        this.f49504n = h0Var.f49504n;
        this.f49505o = h0Var.f49505o;
        this.f49502l = h0Var.f49502l;
        this.f49503m = h0Var.f49503m;
        if (h0Var.f49506p != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f49506p = arrayList;
            arrayList.addAll(h0Var.f49506p);
        }
        if (h0Var.f49507q != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f49507q = arrayList2;
            arrayList2.addAll(h0Var.f49507q);
        }
        this.f49508r = h0Var.f49508r;
    }
}
