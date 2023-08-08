package androidx.fragment.app;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.lifecycle.C19392a1;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19502x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.fragment.app.z */
public final class C19281z extends C19476v0 {

    /* renamed from: h */
    public static final String f49621h = "FragmentManager";

    /* renamed from: i */
    public static final C19502x0.C19506b f49622i = new C19282a();

    /* renamed from: a */
    public final HashMap<String, Fragment> f49623a = new HashMap<>();

    /* renamed from: b */
    public final HashMap<String, C19281z> f49624b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, C19392a1> f49625c = new HashMap<>();

    /* renamed from: d */
    public final boolean f49626d;

    /* renamed from: e */
    public boolean f49627e = false;

    /* renamed from: f */
    public boolean f49628f = false;

    /* renamed from: g */
    public boolean f49629g = false;

    /* renamed from: androidx.fragment.app.z$a */
    public class C19282a implements C19502x0.C19506b {
        @C0359n0
        /* renamed from: b */
        public <T extends C19476v0> T mo21645b(@C0359n0 Class<T> cls) {
            return new C19281z(true);
        }
    }

    public C19281z(boolean z) {
        this.f49626d = z;
    }

    @C0359n0
    /* renamed from: i0 */
    public static C19281z m90427i0(C19392a1 a1Var) {
        return (C19281z) new C19502x0(a1Var, f49622i).mo57693a(C19281z.class);
    }

    /* renamed from: c0 */
    public void mo57402c0(@C0359n0 Fragment fragment) {
        if (this.f49629g) {
            FragmentManager.m89694W0(2);
        } else if (!this.f49623a.containsKey(fragment.mWho)) {
            this.f49623a.put(fragment.mWho, fragment);
            if (FragmentManager.m89694W0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Updating retained Fragments: Added ");
                sb.append(fragment);
            }
        }
    }

    /* renamed from: d0 */
    public void mo57403d0(@C0359n0 Fragment fragment) {
        if (FragmentManager.m89694W0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
        }
        mo57406f0(fragment.mWho);
    }

    /* renamed from: e0 */
    public void mo57404e0(@C0359n0 String str) {
        if (FragmentManager.m89694W0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for saved state of Fragment ");
            sb.append(str);
        }
        mo57406f0(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19281z.class != obj.getClass()) {
            return false;
        }
        C19281z zVar = (C19281z) obj;
        if (!this.f49623a.equals(zVar.f49623a) || !this.f49624b.equals(zVar.f49624b) || !this.f49625c.equals(zVar.f49625c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public final void mo57406f0(@C0359n0 String str) {
        C19281z zVar = this.f49624b.get(str);
        if (zVar != null) {
            zVar.onCleared();
            this.f49624b.remove(str);
        }
        C19392a1 a1Var = this.f49625c.get(str);
        if (a1Var != null) {
            a1Var.mo57550a();
            this.f49625c.remove(str);
        }
    }

    @C0363p0
    /* renamed from: g0 */
    public Fragment mo57407g0(String str) {
        return this.f49623a.get(str);
    }

    @C0359n0
    /* renamed from: h0 */
    public C19281z mo57408h0(@C0359n0 Fragment fragment) {
        C19281z zVar = this.f49624b.get(fragment.mWho);
        if (zVar != null) {
            return zVar;
        }
        C19281z zVar2 = new C19281z(this.f49626d);
        this.f49624b.put(fragment.mWho, zVar2);
        return zVar2;
    }

    public int hashCode() {
        return (((this.f49623a.hashCode() * 31) + this.f49624b.hashCode()) * 31) + this.f49625c.hashCode();
    }

    @C0359n0
    /* renamed from: j0 */
    public Collection<Fragment> mo57410j0() {
        return new ArrayList(this.f49623a.values());
    }

    @C0363p0
    @Deprecated
    /* renamed from: k0 */
    public C19280y mo57411k0() {
        if (this.f49623a.isEmpty() && this.f49624b.isEmpty() && this.f49625c.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f49624b.entrySet()) {
            C19280y k0 = ((C19281z) next.getValue()).mo57411k0();
            if (k0 != null) {
                hashMap.put((String) next.getKey(), k0);
            }
        }
        this.f49628f = true;
        if (!this.f49623a.isEmpty() || !hashMap.isEmpty() || !this.f49625c.isEmpty()) {
            return new C19280y(new ArrayList(this.f49623a.values()), hashMap, new HashMap(this.f49625c));
        }
        return null;
    }

    @C0359n0
    /* renamed from: l0 */
    public C19392a1 mo57412l0(@C0359n0 Fragment fragment) {
        C19392a1 a1Var = this.f49625c.get(fragment.mWho);
        if (a1Var != null) {
            return a1Var;
        }
        C19392a1 a1Var2 = new C19392a1();
        this.f49625c.put(fragment.mWho, a1Var2);
        return a1Var2;
    }

    /* renamed from: m0 */
    public boolean mo57413m0() {
        return this.f49627e;
    }

    /* renamed from: n0 */
    public void mo57414n0(@C0359n0 Fragment fragment) {
        boolean z;
        if (this.f49629g) {
            FragmentManager.m89694W0(2);
            return;
        }
        if (this.f49623a.remove(fragment.mWho) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && FragmentManager.m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
        }
    }

    @Deprecated
    /* renamed from: o0 */
    public void mo57415o0(@C0363p0 C19280y yVar) {
        this.f49623a.clear();
        this.f49624b.clear();
        this.f49625c.clear();
        if (yVar != null) {
            Collection<Fragment> b = yVar.mo57399b();
            if (b != null) {
                for (Fragment next : b) {
                    if (next != null) {
                        this.f49623a.put(next.mWho, next);
                    }
                }
            }
            Map<String, C19280y> a = yVar.mo57398a();
            if (a != null) {
                for (Map.Entry next2 : a.entrySet()) {
                    C19281z zVar = new C19281z(this.f49626d);
                    zVar.mo57415o0((C19280y) next2.getValue());
                    this.f49624b.put((String) next2.getKey(), zVar);
                }
            }
            Map<String, C19392a1> c = yVar.mo57400c();
            if (c != null) {
                this.f49625c.putAll(c);
            }
        }
        this.f49628f = false;
    }

    public void onCleared() {
        if (FragmentManager.m89694W0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
        }
        this.f49627e = true;
    }

    /* renamed from: p0 */
    public void mo57416p0(boolean z) {
        this.f49629g = z;
    }

    /* renamed from: q0 */
    public boolean mo57417q0(@C0359n0 Fragment fragment) {
        if (!this.f49623a.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.f49626d) {
            return this.f49627e;
        }
        return !this.f49628f;
    }

    @C0359n0
    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f49623a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f49624b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f49625c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
