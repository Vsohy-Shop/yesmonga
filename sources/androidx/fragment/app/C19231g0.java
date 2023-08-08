package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0329d0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.C12412q;

/* renamed from: androidx.fragment.app.g0 */
public class C19231g0 {

    /* renamed from: e */
    public static final String f49459e = "FragmentManager";

    /* renamed from: a */
    public final ArrayList<Fragment> f49460a = new ArrayList<>();

    /* renamed from: b */
    public final HashMap<String, C19225e0> f49461b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, FragmentState> f49462c = new HashMap<>();

    /* renamed from: d */
    public C19281z f49463d;

    @C0363p0
    /* renamed from: A */
    public ArrayList<String> mo57144A() {
        synchronized (this.f49460a) {
            if (this.f49460a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f49460a.size());
            Iterator<Fragment> it = this.f49460a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (FragmentManager.m89694W0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("saveAllState: adding fragment (");
                    sb.append(next.mWho);
                    sb.append("): ");
                    sb.append(next);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: B */
    public void mo57145B(@C0359n0 C19281z zVar) {
        this.f49463d = zVar;
    }

    @C0363p0
    /* renamed from: C */
    public FragmentState mo57146C(@C0359n0 String str, @C0363p0 FragmentState fragmentState) {
        if (fragmentState != null) {
            return this.f49462c.put(str, fragmentState);
        }
        return this.f49462c.remove(str);
    }

    /* renamed from: a */
    public void mo57147a(@C0359n0 Fragment fragment) {
        if (!this.f49460a.contains(fragment)) {
            synchronized (this.f49460a) {
                this.f49460a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* renamed from: b */
    public void mo57148b() {
        this.f49461b.values().removeAll(Collections.singleton((Object) null));
    }

    /* renamed from: c */
    public boolean mo57149c(@C0359n0 String str) {
        return this.f49461b.get(str) != null;
    }

    /* renamed from: d */
    public void mo57150d(int i) {
        for (C19225e0 next : this.f49461b.values()) {
            if (next != null) {
                next.mo57138u(i);
            }
        }
    }

    /* renamed from: e */
    public void mo57151e(@C0359n0 String str, @C0363p0 FileDescriptor fileDescriptor, @C0359n0 PrintWriter printWriter, @C0363p0 String[] strArr) {
        String str2 = str + C12412q.f30348a;
        if (!this.f49461b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C19225e0 next : this.f49461b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment k = next.mo57128k();
                    printWriter.println(k);
                    k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f49460a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f49460a.get(i).toString());
            }
        }
    }

    @C0363p0
    /* renamed from: f */
    public Fragment mo57152f(@C0359n0 String str) {
        C19225e0 e0Var = this.f49461b.get(str);
        if (e0Var != null) {
            return e0Var.mo57128k();
        }
        return null;
    }

    @C0363p0
    /* renamed from: g */
    public Fragment mo57153g(@C0329d0 int i) {
        for (int size = this.f49460a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f49460a.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (C19225e0 next : this.f49461b.values()) {
            if (next != null) {
                Fragment k = next.mo57128k();
                if (k.mFragmentId == i) {
                    return k;
                }
            }
        }
        return null;
    }

    @C0363p0
    /* renamed from: h */
    public Fragment mo57154h(@C0363p0 String str) {
        if (str != null) {
            for (int size = this.f49460a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f49460a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C19225e0 next : this.f49461b.values()) {
            if (next != null) {
                Fragment k = next.mo57128k();
                if (str.equals(k.mTag)) {
                    return k;
                }
            }
        }
        return null;
    }

    @C0363p0
    /* renamed from: i */
    public Fragment mo57155i(@C0359n0 String str) {
        Fragment findFragmentByWho;
        for (C19225e0 next : this.f49461b.values()) {
            if (next != null && (findFragmentByWho = next.mo57128k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: j */
    public int mo57156j(@C0359n0 Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f49460a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f49460a.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f49460a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f49460a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* renamed from: k */
    public int mo57157k() {
        return this.f49461b.size();
    }

    @C0359n0
    /* renamed from: l */
    public List<C19225e0> mo57158l() {
        ArrayList arrayList = new ArrayList();
        for (C19225e0 next : this.f49461b.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: m */
    public List<Fragment> mo57159m() {
        ArrayList arrayList = new ArrayList();
        for (C19225e0 next : this.f49461b.values()) {
            if (next != null) {
                arrayList.add(next.mo57128k());
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: n */
    public ArrayList<FragmentState> mo57160n() {
        return new ArrayList<>(this.f49462c.values());
    }

    @C0363p0
    /* renamed from: o */
    public C19225e0 mo57161o(@C0359n0 String str) {
        return this.f49461b.get(str);
    }

    @C0359n0
    /* renamed from: p */
    public List<Fragment> mo57162p() {
        ArrayList arrayList;
        if (this.f49460a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f49460a) {
            arrayList = new ArrayList(this.f49460a);
        }
        return arrayList;
    }

    /* renamed from: q */
    public C19281z mo57163q() {
        return this.f49463d;
    }

    @C0363p0
    /* renamed from: r */
    public FragmentState mo57164r(@C0359n0 String str) {
        return this.f49462c.get(str);
    }

    /* renamed from: s */
    public void mo57165s(@C0359n0 C19225e0 e0Var) {
        Fragment k = e0Var.mo57128k();
        if (!mo57149c(k.mWho)) {
            this.f49461b.put(k.mWho, e0Var);
            if (k.mRetainInstanceChangedWhileDetached) {
                if (k.mRetainInstance) {
                    this.f49463d.mo57402c0(k);
                } else {
                    this.f49463d.mo57414n0(k);
                }
                k.mRetainInstanceChangedWhileDetached = false;
            }
            if (FragmentManager.m89694W0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Added fragment to active set ");
                sb.append(k);
            }
        }
    }

    /* renamed from: t */
    public void mo57166t(@C0359n0 C19225e0 e0Var) {
        Fragment k = e0Var.mo57128k();
        if (k.mRetainInstance) {
            this.f49463d.mo57414n0(k);
        }
        if (this.f49461b.put(k.mWho, (Object) null) != null && FragmentManager.m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(k);
        }
    }

    /* renamed from: u */
    public void mo57167u() {
        boolean z;
        Iterator<Fragment> it = this.f49460a.iterator();
        while (it.hasNext()) {
            C19225e0 e0Var = this.f49461b.get(it.next().mWho);
            if (e0Var != null) {
                e0Var.mo57130m();
            }
        }
        for (C19225e0 next : this.f49461b.values()) {
            if (next != null) {
                next.mo57130m();
                Fragment k = next.mo57128k();
                if (!k.mRemoving || k.isInBackStack()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (k.mBeingSaved && !this.f49462c.containsKey(k.mWho)) {
                        next.mo57136s();
                    }
                    mo57166t(next);
                }
            }
        }
    }

    /* renamed from: v */
    public void mo57168v(@C0359n0 Fragment fragment) {
        synchronized (this.f49460a) {
            this.f49460a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* renamed from: w */
    public void mo57169w() {
        this.f49461b.clear();
    }

    /* renamed from: x */
    public void mo57170x(@C0363p0 List<String> list) {
        this.f49460a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f = mo57152f(next);
                if (f != null) {
                    if (FragmentManager.m89694W0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: added (");
                        sb.append(next);
                        sb.append("): ");
                        sb.append(f);
                    }
                    mo57147a(f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    /* renamed from: y */
    public void mo57171y(@C0359n0 ArrayList<FragmentState> arrayList) {
        this.f49462c.clear();
        Iterator<FragmentState> it = arrayList.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            this.f49462c.put(next.f49310b, next);
        }
    }

    @C0359n0
    /* renamed from: z */
    public ArrayList<String> mo57172z() {
        ArrayList<String> arrayList = new ArrayList<>(this.f49461b.size());
        for (C19225e0 next : this.f49461b.values()) {
            if (next != null) {
                Fragment k = next.mo57128k();
                next.mo57136s();
                arrayList.add(k.mWho);
                if (FragmentManager.m89694W0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved state of ");
                    sb.append(k);
                    sb.append(": ");
                    sb.append(k.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }
}
