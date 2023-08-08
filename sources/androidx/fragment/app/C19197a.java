package androidx.fragment.app;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.C19234h0;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.disklrucache.C22050b;
import com.bumptech.glide.load.engine.GlideException;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
public final class C19197a extends C19234h0 implements FragmentManager.C19177j, FragmentManager.C19183p {

    /* renamed from: R */
    public static final String f49364R = "FragmentManager";

    /* renamed from: N */
    public final FragmentManager f49365N;

    /* renamed from: O */
    public boolean f49366O;

    /* renamed from: P */
    public int f49367P;

    /* renamed from: Q */
    public boolean f49368Q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19197a(@C0359n0 FragmentManager fragmentManager) {
        super(fragmentManager.mo56801G0(), fragmentManager.mo56810J0() != null ? fragmentManager.mo56810J0().mo57316k().getClassLoader() : null);
        this.f49367P = -1;
        this.f49368Q = false;
        this.f49365N = fragmentManager;
    }

    /* renamed from: A */
    public boolean mo57037A() {
        return this.f49493c.isEmpty();
    }

    @C0359n0
    /* renamed from: B */
    public C19234h0 mo57038B(@C0359n0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f49365N) {
            return super.mo57038B(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @C0359n0
    /* renamed from: O */
    public C19234h0 mo57039O(@C0359n0 Fragment fragment, @C0359n0 Lifecycle.State state) {
        if (fragment.mFragmentManager != this.f49365N) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f49365N);
        } else if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        } else if (state != Lifecycle.State.DESTROYED) {
            return super.mo57039O(fragment, state);
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    @C0359n0
    /* renamed from: P */
    public C19234h0 mo57040P(@C0363p0 Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.f49365N) {
            return super.mo57040P(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @C0359n0
    /* renamed from: T */
    public C19234h0 mo57041T(@C0359n0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f49365N) {
            return super.mo57041T(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: U */
    public void mo57042U(int i) {
        if (this.f49499i) {
            if (FragmentManager.m89694W0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
            }
            int size = this.f49493c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C19234h0.C19235a aVar = this.f49493c.get(i2);
                Fragment fragment = aVar.f49511b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.m89694W0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.f49511b);
                        sb2.append(" to ");
                        sb2.append(aVar.f49511b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* renamed from: V */
    public void mo57043V() {
        int size = this.f49493c.size() - 1;
        while (size >= 0) {
            C19234h0.C19235a aVar = this.f49493c.get(size);
            if (aVar.f49512c) {
                if (aVar.f49510a == 8) {
                    aVar.f49512c = false;
                    this.f49493c.remove(size - 1);
                    size--;
                } else {
                    int i = aVar.f49511b.mContainerId;
                    aVar.f49510a = 2;
                    aVar.f49512c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        C19234h0.C19235a aVar2 = this.f49493c.get(i2);
                        if (aVar2.f49512c && aVar2.f49511b.mContainerId == i) {
                            this.f49493c.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    /* renamed from: W */
    public int mo57044W(boolean z) {
        if (!this.f49366O) {
            if (FragmentManager.m89694W0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                PrintWriter printWriter = new PrintWriter(new C19260o0("FragmentManager"));
                mo57045X(GlideException.C22148a.f56917d, printWriter);
                printWriter.close();
            }
            this.f49366O = true;
            if (this.f49499i) {
                this.f49367P = this.f49365N.mo56899r();
            } else {
                this.f49367P = -1;
            }
            this.f49365N.mo56878h0(this, z);
            return this.f49367P;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: X */
    public void mo57045X(String str, PrintWriter printWriter) {
        mo57046Y(str, printWriter, true);
    }

    /* renamed from: Y */
    public void mo57046Y(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f49501k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f49367P);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f49366O);
            if (this.f49498h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f49498h));
            }
            if (!(this.f49494d == 0 && this.f49495e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f49494d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f49495e));
            }
            if (!(this.f49496f == 0 && this.f49497g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f49496f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f49497g));
            }
            if (!(this.f49502l == 0 && this.f49503m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f49502l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f49503m);
            }
            if (!(this.f49504n == 0 && this.f49505o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f49504n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f49505o);
            }
        }
        if (!this.f49493c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f49493c.size();
            for (int i = 0; i < size; i++) {
                C19234h0.C19235a aVar = this.f49493c.get(i);
                switch (aVar.f49510a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = C22050b.f56575L0;
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f49510a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f49511b);
                if (z) {
                    if (!(aVar.f49513d == 0 && aVar.f49514e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f49513d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f49514e));
                    }
                    if (aVar.f49515f != 0 || aVar.f49516g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f49515f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f49516g));
                    }
                }
            }
        }
    }

    /* renamed from: Z */
    public void mo57047Z() {
        int size = this.f49493c.size();
        for (int i = 0; i < size; i++) {
            C19234h0.C19235a aVar = this.f49493c.get(i);
            Fragment fragment = aVar.f49511b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f49368Q;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f49498h);
                fragment.setSharedElementNames(this.f49506p, this.f49507q);
            }
            switch (aVar.f49510a) {
                case 1:
                    fragment.setAnimations(aVar.f49513d, aVar.f49514e, aVar.f49515f, aVar.f49516g);
                    this.f49365N.mo56845V1(fragment, false);
                    this.f49365N.mo56888n(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.f49513d, aVar.f49514e, aVar.f49515f, aVar.f49516g);
                    this.f49365N.mo56790C1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f49513d, aVar.f49514e, aVar.f49515f, aVar.f49516g);
                    this.f49365N.mo56838T0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f49513d, aVar.f49514e, aVar.f49515f, aVar.f49516g);
                    this.f49365N.mo56845V1(fragment, false);
                    this.f49365N.mo56868c2(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f49513d, aVar.f49514e, aVar.f49515f, aVar.f49516g);
                    this.f49365N.mo56794E(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f49513d, aVar.f49514e, aVar.f49515f, aVar.f49516g);
                    this.f49365N.mo56845V1(fragment, false);
                    this.f49365N.mo56905t(fragment);
                    break;
                case 8:
                    this.f49365N.mo56853Y1(fragment);
                    break;
                case 9:
                    this.f49365N.mo56853Y1((Fragment) null);
                    break;
                case 10:
                    this.f49365N.mo56850X1(fragment, aVar.f49518i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f49510a);
            }
        }
    }

    /* renamed from: a */
    public boolean mo56944a(@C0359n0 ArrayList<C19197a> arrayList, @C0359n0 ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f49499i) {
            return true;
        }
        this.f49365N.mo56885m(this);
        return true;
    }

    /* renamed from: a0 */
    public void mo57048a0() {
        for (int size = this.f49493c.size() - 1; size >= 0; size--) {
            C19234h0.C19235a aVar = this.f49493c.get(size);
            Fragment fragment = aVar.f49511b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f49368Q;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.m89692O1(this.f49498h));
                fragment.setSharedElementNames(this.f49507q, this.f49506p);
            }
            switch (aVar.f49510a) {
                case 1:
                    fragment.setAnimations(aVar.f49513d, aVar.f49514e, aVar.f49515f, aVar.f49516g);
                    this.f49365N.mo56845V1(fragment, true);
                    this.f49365N.mo56790C1(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.f49513d, aVar.f49514e, aVar.f49515f, aVar.f49516g);
                    this.f49365N.mo56888n(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f49513d, aVar.f49514e, aVar.f49515f, aVar.f49516g);
                    this.f49365N.mo56868c2(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f49513d, aVar.f49514e, aVar.f49515f, aVar.f49516g);
                    this.f49365N.mo56845V1(fragment, true);
                    this.f49365N.mo56838T0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f49513d, aVar.f49514e, aVar.f49515f, aVar.f49516g);
                    this.f49365N.mo56905t(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f49513d, aVar.f49514e, aVar.f49515f, aVar.f49516g);
                    this.f49365N.mo56845V1(fragment, true);
                    this.f49365N.mo56794E(fragment);
                    break;
                case 8:
                    this.f49365N.mo56853Y1((Fragment) null);
                    break;
                case 9:
                    this.f49365N.mo56853Y1(fragment);
                    break;
                case 10:
                    this.f49365N.mo56850X1(fragment, aVar.f49517h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f49510a);
            }
        }
    }

    @C0363p0
    /* renamed from: b */
    public CharSequence mo56938b() {
        if (this.f49502l != 0) {
            return this.f49365N.mo56810J0().mo57316k().getText(this.f49502l);
        }
        return this.f49503m;
    }

    /* renamed from: b0 */
    public Fragment mo57049b0(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f49493c.size()) {
            C19234h0.C19235a aVar = this.f49493c.get(i);
            int i2 = aVar.f49510a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f49511b;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f49493c.add(i, new C19234h0.C19235a(9, fragment4, true));
                                    i++;
                                    fragment2 = null;
                                }
                                C19234h0.C19235a aVar2 = new C19234h0.C19235a(3, fragment4, true);
                                aVar2.f49513d = aVar.f49513d;
                                aVar2.f49515f = aVar.f49515f;
                                aVar2.f49514e = aVar.f49514e;
                                aVar2.f49516g = aVar.f49516g;
                                this.f49493c.add(i, aVar2);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f49493c.remove(i);
                        i--;
                    } else {
                        aVar.f49510a = 1;
                        aVar.f49512c = true;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f49511b);
                    Fragment fragment5 = aVar.f49511b;
                    if (fragment5 == fragment2) {
                        this.f49493c.add(i, new C19234h0.C19235a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f49493c.add(i, new C19234h0.C19235a(9, fragment2, true));
                        aVar.f49512c = true;
                        i++;
                        fragment2 = aVar.f49511b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f49511b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: c */
    public int mo56939c() {
        return this.f49504n;
    }

    /* renamed from: c0 */
    public void mo57050c0() {
        if (this.f49509s != null) {
            for (int i = 0; i < this.f49509s.size(); i++) {
                this.f49509s.get(i).run();
            }
            this.f49509s = null;
        }
    }

    /* renamed from: d */
    public int mo56940d() {
        return this.f49502l;
    }

    /* renamed from: d0 */
    public Fragment mo57051d0(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f49493c.size() - 1; size >= 0; size--) {
            C19234h0.C19235a aVar = this.f49493c.get(size);
            int i = aVar.f49510a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f49511b;
                            break;
                        case 10:
                            aVar.f49518i = aVar.f49517h;
                            break;
                    }
                }
                arrayList.add(aVar.f49511b);
            }
            arrayList.remove(aVar.f49511b);
        }
        return fragment;
    }

    @C0363p0
    /* renamed from: e */
    public CharSequence mo56941e() {
        if (this.f49504n != 0) {
            return this.f49365N.mo56810J0().mo57316k().getText(this.f49504n);
        }
        return this.f49505o;
    }

    public int getId() {
        return this.f49367P;
    }

    @C0363p0
    public String getName() {
        return this.f49501k;
    }

    /* renamed from: q */
    public int mo57052q() {
        return mo57044W(false);
    }

    /* renamed from: r */
    public int mo57053r() {
        return mo57044W(true);
    }

    /* renamed from: s */
    public void mo57054s() {
        mo57228w();
        this.f49365N.mo56882k0(this, false);
    }

    /* renamed from: t */
    public void mo57055t() {
        mo57228w();
        this.f49365N.mo56882k0(this, true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f49367P >= 0) {
            sb.append(" #");
            sb.append(this.f49367P);
        }
        if (this.f49501k != null) {
            sb.append(" ");
            sb.append(this.f49501k);
        }
        sb.append("}");
        return sb.toString();
    }

    @C0359n0
    /* renamed from: v */
    public C19234h0 mo57057v(@C0359n0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f49365N) {
            return super.mo57057v(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: x */
    public void mo57058x(int i, Fragment fragment, @C0363p0 String str, int i2) {
        super.mo57058x(i, fragment, str, i2);
        fragment.mFragmentManager = this.f49365N;
    }

    @C0359n0
    /* renamed from: y */
    public C19234h0 mo57059y(@C0359n0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f49365N) {
            return super.mo57059y(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19197a(@C0359n0 C19197a aVar) {
        super(aVar.f49365N.mo56801G0(), aVar.f49365N.mo56810J0() != null ? aVar.f49365N.mo56810J0().mo57316k().getClassLoader() : null, aVar);
        this.f49367P = -1;
        this.f49368Q = false;
        this.f49365N = aVar.f49365N;
        this.f49366O = aVar.f49366O;
        this.f49367P = aVar.f49367P;
        this.f49368Q = aVar.f49368Q;
    }
}
