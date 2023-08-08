package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.content.C17318d;
import androidx.core.internal.view.C17673a;
import androidx.core.view.C18119b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.g */
public class C0568g implements C17673a {

    /* renamed from: L */
    public static final String f1611L = "MenuBuilder";

    /* renamed from: M */
    public static final String f1612M = "android:menu:presenters";

    /* renamed from: N */
    public static final String f1613N = "android:menu:actionviewstates";

    /* renamed from: O */
    public static final String f1614O = "android:menu:expandedactionview";

    /* renamed from: P */
    public static final int[] f1615P = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    public View f1616A;

    /* renamed from: B */
    public boolean f1617B = false;

    /* renamed from: C */
    public boolean f1618C = false;

    /* renamed from: D */
    public boolean f1619D = false;

    /* renamed from: E */
    public boolean f1620E = false;

    /* renamed from: F */
    public boolean f1621F = false;

    /* renamed from: G */
    public ArrayList<C0573j> f1622G = new ArrayList<>();

    /* renamed from: H */
    public CopyOnWriteArrayList<WeakReference<C0585n>> f1623H = new CopyOnWriteArrayList<>();

    /* renamed from: I */
    public C0573j f1624I;

    /* renamed from: J */
    public boolean f1625J = false;

    /* renamed from: K */
    public boolean f1626K;

    /* renamed from: l */
    public final Context f1627l;

    /* renamed from: m */
    public final Resources f1628m;

    /* renamed from: n */
    public boolean f1629n;

    /* renamed from: o */
    public boolean f1630o;

    /* renamed from: p */
    public C0569a f1631p;

    /* renamed from: q */
    public ArrayList<C0573j> f1632q;

    /* renamed from: r */
    public ArrayList<C0573j> f1633r;

    /* renamed from: s */
    public boolean f1634s;

    /* renamed from: t */
    public ArrayList<C0573j> f1635t;

    /* renamed from: u */
    public ArrayList<C0573j> f1636u;

    /* renamed from: v */
    public boolean f1637v;

    /* renamed from: w */
    public int f1638w = 0;

    /* renamed from: x */
    public ContextMenu.ContextMenuInfo f1639x;

    /* renamed from: y */
    public CharSequence f1640y;

    /* renamed from: z */
    public Drawable f1641z;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.view.menu.g$a */
    public interface C0569a {
        /* renamed from: a */
        boolean mo1111a(@C0359n0 C0568g gVar, @C0359n0 MenuItem menuItem);

        /* renamed from: b */
        void mo1114b(@C0359n0 C0568g gVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.view.menu.g$b */
    public interface C0570b {
        /* renamed from: b */
        boolean mo1857b(C0573j jVar);
    }

    public C0568g(Context context) {
        this.f1627l = context;
        this.f1628m = context.getResources();
        this.f1632q = new ArrayList<>();
        this.f1633r = new ArrayList<>();
        this.f1634s = true;
        this.f1635t = new ArrayList<>();
        this.f1636u = new ArrayList<>();
        this.f1637v = true;
        mo2076k0(true);
    }

    /* renamed from: E */
    public static int m2678E(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f1615P;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: q */
    public static int m2679q(ArrayList<C0573j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo2132i() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public CharSequence mo2014A() {
        return this.f1640y;
    }

    /* renamed from: B */
    public View mo2015B() {
        return this.f1616A;
    }

    /* renamed from: C */
    public ArrayList<C0573j> mo2016C() {
        mo2097u();
        return this.f1636u;
    }

    /* renamed from: D */
    public boolean mo2017D() {
        return this.f1620E;
    }

    /* renamed from: F */
    public Resources mo2018F() {
        return this.f1628m;
    }

    /* renamed from: G */
    public C0568g mo2019G() {
        return this;
    }

    @C0359n0
    /* renamed from: H */
    public ArrayList<C0573j> mo2020H() {
        if (!this.f1634s) {
            return this.f1633r;
        }
        this.f1633r.clear();
        int size = this.f1632q.size();
        for (int i = 0; i < size; i++) {
            C0573j jVar = this.f1632q.get(i);
            if (jVar.isVisible()) {
                this.f1633r.add(jVar);
            }
        }
        this.f1634s = false;
        this.f1637v = true;
        return this.f1633r;
    }

    /* renamed from: I */
    public boolean mo2021I() {
        return this.f1625J;
    }

    /* renamed from: J */
    public boolean mo2022J() {
        return this.f1629n;
    }

    /* renamed from: K */
    public boolean mo2023K() {
        return this.f1630o;
    }

    /* renamed from: L */
    public void mo2024L(C0573j jVar) {
        this.f1637v = true;
        mo2026N(true);
    }

    /* renamed from: M */
    public void mo2025M(C0573j jVar) {
        this.f1634s = true;
        mo2026N(true);
    }

    /* renamed from: N */
    public void mo2026N(boolean z) {
        if (!this.f1617B) {
            if (z) {
                this.f1634s = true;
                this.f1637v = true;
            }
            mo2073j(z);
            return;
        }
        this.f1618C = true;
        if (z) {
            this.f1619D = true;
        }
    }

    /* renamed from: O */
    public boolean mo2027O(MenuItem menuItem, int i) {
        return mo2028P(menuItem, (C0585n) null, i);
    }

    /* renamed from: P */
    public boolean mo2028P(MenuItem menuItem, C0585n nVar, int i) {
        boolean z;
        C0573j jVar = (C0573j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        boolean n = jVar.mo2141n();
        C18119b a = jVar.mo1872a();
        if (a == null || !a.mo2227b()) {
            z = false;
        } else {
            z = true;
        }
        if (jVar.mo2140m()) {
            n |= jVar.expandActionView();
            if (n) {
                mo2061f(true);
            }
        } else if (jVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo2061f(false);
            }
            if (!jVar.hasSubMenu()) {
                jVar.mo2111A(new C0594s(mo2100x(), this, jVar));
            }
            C0594s sVar = (C0594s) jVar.getSubMenu();
            if (z) {
                a.mo2230g(sVar);
            }
            n |= mo2079m(sVar, nVar);
            if (!n) {
                mo2061f(true);
            }
        } else if ((i & 1) == 0) {
            mo2061f(true);
        }
        return n;
    }

    /* renamed from: Q */
    public void mo2029Q(int i) {
        mo2030R(i, true);
    }

    /* renamed from: R */
    public final void mo2030R(int i, boolean z) {
        if (i >= 0 && i < this.f1632q.size()) {
            this.f1632q.remove(i);
            if (z) {
                mo2026N(true);
            }
        }
    }

    /* renamed from: S */
    public void mo2031S(C0585n nVar) {
        Iterator<WeakReference<C0585n>> it = this.f1623H.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0585n nVar2 = (C0585n) next.get();
            if (nVar2 == null || nVar2 == nVar) {
                this.f1623H.remove(next);
            }
        }
    }

    /* renamed from: T */
    public void mo2032T(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo2099w());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0594s) item.getSubMenu()).mo2032T(bundle);
                }
            }
            int i2 = bundle.getInt(f1614O);
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: U */
    public void mo2033U(Bundle bundle) {
        mo2075k(bundle);
    }

    /* renamed from: V */
    public void mo2034V(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(f1614O, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0594s) item.getSubMenu()).mo2034V(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo2099w(), sparseArray);
        }
    }

    /* renamed from: W */
    public void mo2035W(Bundle bundle) {
        mo2077l(bundle);
    }

    /* renamed from: X */
    public void mo2036X(C0569a aVar) {
        this.f1631p = aVar;
    }

    /* renamed from: Y */
    public void mo2037Y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1639x = contextMenuInfo;
    }

    /* renamed from: Z */
    public C0568g mo2038Z(int i) {
        this.f1638w = i;
        return this;
    }

    /* renamed from: a */
    public MenuItem mo2039a(int i, int i2, int i3, CharSequence charSequence) {
        int E = m2678E(i3);
        C0573j h = mo2067h(i, i2, i3, E, charSequence, this.f1638w);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1639x;
        if (contextMenuInfo != null) {
            h.mo2169y(contextMenuInfo);
        }
        ArrayList<C0573j> arrayList = this.f1632q;
        arrayList.add(m2679q(arrayList, E), h);
        mo2026N(true);
        return h;
    }

    /* renamed from: a0 */
    public void mo2040a0(MenuItem menuItem) {
        boolean z;
        int groupId = menuItem.getGroupId();
        int size = this.f1632q.size();
        mo2080m0();
        for (int i = 0; i < size; i++) {
            C0573j jVar = this.f1632q.get(i);
            if (jVar.getGroupId() == groupId && jVar.mo2143p() && jVar.isCheckable()) {
                if (jVar == menuItem) {
                    z = true;
                } else {
                    z = false;
                }
                jVar.mo2166v(z);
            }
        }
        mo2078l0();
    }

    public MenuItem add(CharSequence charSequence) {
        return mo2039a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        int i6;
        PackageManager packageManager = this.f1627l.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            if (i8 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i8];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent4;
            }
        }
        return i5;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo2050b(C0585n nVar) {
        mo2052c(nVar, this.f1627l);
    }

    /* renamed from: b0 */
    public C0568g mo2051b0(int i) {
        mo2058d0(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: c */
    public void mo2052c(C0585n nVar, Context context) {
        this.f1623H.add(new WeakReference(nVar));
        nVar.mo1946m(context, this);
        this.f1637v = true;
    }

    /* renamed from: c0 */
    public C0568g mo2053c0(Drawable drawable) {
        mo2058d0(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public void clear() {
        C0573j jVar = this.f1624I;
        if (jVar != null) {
            mo2064g(jVar);
        }
        this.f1632q.clear();
        mo2026N(true);
    }

    public void clearHeader() {
        this.f1641z = null;
        this.f1640y = null;
        this.f1616A = null;
        mo2026N(false);
    }

    public void close() {
        mo2061f(true);
    }

    /* renamed from: d */
    public void mo2057d() {
        C0569a aVar = this.f1631p;
        if (aVar != null) {
            aVar.mo1114b(this);
        }
    }

    /* renamed from: d0 */
    public final void mo2058d0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources F = mo2018F();
        if (view != null) {
            this.f1616A = view;
            this.f1640y = null;
            this.f1641z = null;
        } else {
            if (i > 0) {
                this.f1640y = F.getText(i);
            } else if (charSequence != null) {
                this.f1640y = charSequence;
            }
            if (i2 > 0) {
                this.f1641z = C17318d.m79726i(mo2100x(), i2);
            } else if (drawable != null) {
                this.f1641z = drawable;
            }
            this.f1616A = null;
        }
        mo2026N(false);
    }

    /* renamed from: e */
    public void mo2059e() {
        this.f1617B = true;
        clear();
        clearHeader();
        this.f1623H.clear();
        this.f1617B = false;
        this.f1618C = false;
        this.f1619D = false;
        mo2026N(true);
    }

    /* renamed from: e0 */
    public C0568g mo2060e0(int i) {
        mo2058d0(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: f */
    public final void mo2061f(boolean z) {
        if (!this.f1621F) {
            this.f1621F = true;
            Iterator<WeakReference<C0585n>> it = this.f1623H.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0585n nVar = (C0585n) next.get();
                if (nVar == null) {
                    this.f1623H.remove(next);
                } else {
                    nVar.mo1936b(this, z);
                }
            }
            this.f1621F = false;
        }
    }

    /* renamed from: f0 */
    public C0568g mo2062f0(CharSequence charSequence) {
        mo2058d0(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0573j jVar = this.f1632q.get(i2);
            if (jVar.getItemId() == i) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public boolean mo2064g(C0573j jVar) {
        boolean z = false;
        if (!this.f1623H.isEmpty() && this.f1624I == jVar) {
            mo2080m0();
            Iterator<WeakReference<C0585n>> it = this.f1623H.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0585n nVar = (C0585n) next.get();
                if (nVar == null) {
                    this.f1623H.remove(next);
                } else {
                    z = nVar.mo1945l(this, jVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo2078l0();
            if (z) {
                this.f1624I = null;
            }
        }
        return z;
    }

    /* renamed from: g0 */
    public C0568g mo2065g0(View view) {
        mo2058d0(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public MenuItem getItem(int i) {
        return this.f1632q.get(i);
    }

    /* renamed from: h */
    public final C0573j mo2067h(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0573j(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: h0 */
    public void mo2068h0(boolean z) {
        this.f1620E = z;
    }

    public boolean hasVisibleItems() {
        if (this.f1626K) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1632q.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo2070i(@C0359n0 C0568g gVar, @C0359n0 MenuItem menuItem) {
        C0569a aVar = this.f1631p;
        return aVar != null && aVar.mo1111a(gVar, menuItem);
    }

    /* renamed from: i0 */
    public void mo2071i0(boolean z) {
        this.f1626K = z;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo2089s(i, keyEvent) != null;
    }

    /* renamed from: j */
    public final void mo2073j(boolean z) {
        if (!this.f1623H.isEmpty()) {
            mo2080m0();
            Iterator<WeakReference<C0585n>> it = this.f1623H.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0585n nVar = (C0585n) next.get();
                if (nVar == null) {
                    this.f1623H.remove(next);
                } else {
                    nVar.mo1943j(z);
                }
            }
            mo2078l0();
        }
    }

    /* renamed from: j0 */
    public void mo2074j0(boolean z) {
        if (this.f1630o != z) {
            mo2076k0(z);
            mo2026N(false);
        }
    }

    /* renamed from: k */
    public final void mo2075k(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f1612M);
        if (sparseParcelableArray != null && !this.f1623H.isEmpty()) {
            Iterator<WeakReference<C0585n>> it = this.f1623H.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0585n nVar = (C0585n) next.get();
                if (nVar == null) {
                    this.f1623H.remove(next);
                } else {
                    int id = nVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        nVar.mo1969f(parcelable);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if (androidx.core.view.C18338p3.m83064g(android.view.ViewConfiguration.get(r2.f1627l), r2.f1627l) != false) goto L_0x001d;
     */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2076k0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x001c
            android.content.res.Resources r3 = r2.f1628m
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L_0x001c
            android.content.Context r3 = r2.f1627l
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f1627l
            boolean r3 = androidx.core.view.C18338p3.m83064g(r3, r1)
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r2.f1630o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0568g.mo2076k0(boolean):void");
    }

    /* renamed from: l */
    public final void mo2077l(Bundle bundle) {
        Parcelable i;
        if (!this.f1623H.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<C0585n>> it = this.f1623H.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0585n nVar = (C0585n) next.get();
                if (nVar == null) {
                    this.f1623H.remove(next);
                } else {
                    int id = nVar.getId();
                    if (id > 0 && (i = nVar.mo1970i()) != null) {
                        sparseArray.put(id, i);
                    }
                }
            }
            bundle.putSparseParcelableArray(f1612M, sparseArray);
        }
    }

    /* renamed from: l0 */
    public void mo2078l0() {
        this.f1617B = false;
        if (this.f1618C) {
            this.f1618C = false;
            mo2026N(this.f1619D);
        }
    }

    /* renamed from: m */
    public final boolean mo2079m(C0594s sVar, C0585n nVar) {
        boolean z = false;
        if (this.f1623H.isEmpty()) {
            return false;
        }
        if (nVar != null) {
            z = nVar.mo1940g(sVar);
        }
        Iterator<WeakReference<C0585n>> it = this.f1623H.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0585n nVar2 = (C0585n) next.get();
            if (nVar2 == null) {
                this.f1623H.remove(next);
            } else if (!z) {
                z = nVar2.mo1940g(sVar);
            }
        }
        return z;
    }

    /* renamed from: m0 */
    public void mo2080m0() {
        if (!this.f1617B) {
            this.f1617B = true;
            this.f1618C = false;
            this.f1619D = false;
        }
    }

    /* renamed from: n */
    public boolean mo2081n(C0573j jVar) {
        boolean z = false;
        if (this.f1623H.isEmpty()) {
            return false;
        }
        mo2080m0();
        Iterator<WeakReference<C0585n>> it = this.f1623H.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0585n nVar = (C0585n) next.get();
            if (nVar == null) {
                this.f1623H.remove(next);
            } else {
                z = nVar.mo1938d(this, jVar);
                if (z) {
                    break;
                }
            }
        }
        mo2078l0();
        if (z) {
            this.f1624I = jVar;
        }
        return z;
    }

    /* renamed from: o */
    public int mo2082o(int i) {
        return mo2083p(i, 0);
    }

    /* renamed from: p */
    public int mo2083p(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f1632q.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo2027O(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C0573j s = mo2089s(i, keyEvent);
        if (s != null) {
            z = mo2027O(s, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            mo2061f(true);
        }
        return z;
    }

    /* renamed from: r */
    public int mo2086r(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1632q.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public void removeGroup(int i) {
        int o = mo2082o(i);
        if (o >= 0) {
            int size = this.f1632q.size() - o;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f1632q.get(o).getGroupId() != i) {
                    mo2026N(true);
                } else {
                    mo2030R(o, false);
                    i2 = i3;
                }
            }
            mo2026N(true);
        }
    }

    public void removeItem(int i) {
        mo2030R(mo2086r(i), true);
    }

    /* renamed from: s */
    public C0573j mo2089s(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C0573j> arrayList = this.f1622G;
        arrayList.clear();
        mo2096t(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean J = mo2022J();
        for (int i2 = 0; i2 < size; i2++) {
            C0573j jVar = arrayList.get(i2);
            if (J) {
                c = jVar.getAlphabeticShortcut();
            } else {
                c = jVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (J && c == 8 && i == 67))) {
                return jVar;
            }
        }
        return null;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1632q.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0573j jVar = this.f1632q.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.mo2167w(z2);
                jVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1625J = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1632q.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0573j jVar = this.f1632q.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f1632q.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0573j jVar = this.f1632q.get(i2);
            if (jVar.getGroupId() == i && jVar.mo2112B(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo2026N(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f1629n = z;
        mo2026N(false);
    }

    public int size() {
        return this.f1632q.size();
    }

    /* renamed from: t */
    public void mo2096t(List<C0573j> list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean z;
        boolean J = mo2022J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1632q.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0573j jVar = this.f1632q.get(i3);
                if (jVar.hasSubMenu()) {
                    ((C0568g) jVar.getSubMenu()).mo2096t(list, i, keyEvent);
                }
                if (J) {
                    c = jVar.getAlphabeticShortcut();
                } else {
                    c = jVar.getNumericShortcut();
                }
                if (J) {
                    i2 = jVar.getAlphabeticModifiers();
                } else {
                    i2 = jVar.getNumericModifiers();
                }
                if ((modifiers & C17673a.f46027e) == (i2 & C17673a.f46027e)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (J && c == 8 && i == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    /* renamed from: u */
    public void mo2097u() {
        ArrayList<C0573j> H = mo2020H();
        if (this.f1637v) {
            Iterator<WeakReference<C0585n>> it = this.f1623H.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0585n nVar = (C0585n) next.get();
                if (nVar == null) {
                    this.f1623H.remove(next);
                } else {
                    z |= nVar.mo1944k();
                }
            }
            if (z) {
                this.f1635t.clear();
                this.f1636u.clear();
                int size = H.size();
                for (int i = 0; i < size; i++) {
                    C0573j jVar = H.get(i);
                    if (jVar.mo2142o()) {
                        this.f1635t.add(jVar);
                    } else {
                        this.f1636u.add(jVar);
                    }
                }
            } else {
                this.f1635t.clear();
                this.f1636u.clear();
                this.f1636u.addAll(mo2020H());
            }
            this.f1637v = false;
        }
    }

    /* renamed from: v */
    public ArrayList<C0573j> mo2098v() {
        mo2097u();
        return this.f1635t;
    }

    /* renamed from: w */
    public String mo2099w() {
        return f1613N;
    }

    /* renamed from: x */
    public Context mo2100x() {
        return this.f1627l;
    }

    /* renamed from: y */
    public C0573j mo2101y() {
        return this.f1624I;
    }

    /* renamed from: z */
    public Drawable mo2102z() {
        return this.f1641z;
    }

    public MenuItem add(int i) {
        return mo2039a(0, 0, 0, this.f1628m.getString(i));
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f1628m.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo2039a(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0573j jVar = (C0573j) mo2039a(i, i2, i3, charSequence);
        C0594s sVar = new C0594s(this.f1627l, this, jVar);
        jVar.mo2111A(sVar);
        return sVar;
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo2039a(i, i2, i3, this.f1628m.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f1628m.getString(i4));
    }
}
