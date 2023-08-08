package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0329d0;
import androidx.annotation.C0341g1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.google.android.material.internal.C31396h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@C0341g1
/* renamed from: com.google.android.material.internal.a */
public class C31385a<T extends C31396h<T>> {

    /* renamed from: a */
    public final Map<Integer, T> f75803a = new HashMap();

    /* renamed from: b */
    public final Set<Integer> f75804b = new HashSet();

    /* renamed from: c */
    public C31387b f75805c;

    /* renamed from: d */
    public boolean f75806d;

    /* renamed from: e */
    public boolean f75807e;

    /* renamed from: com.google.android.material.internal.a$a */
    public class C31386a implements C31396h.C31397a<T> {
        public C31386a() {
        }

        /* renamed from: b */
        public void mo90006a(T t, boolean z) {
            if (!z) {
                C31385a aVar = C31385a.this;
                if (!aVar.mo90005t(t, aVar.f75807e)) {
                    return;
                }
            } else if (!C31385a.this.mo89992g(t)) {
                return;
            }
            C31385a.this.mo89999n();
        }
    }

    /* renamed from: com.google.android.material.internal.a$b */
    public interface C31387b {
        /* renamed from: a */
        void mo88952a(@C0359n0 Set<Integer> set);
    }

    /* renamed from: e */
    public void mo89990e(T t) {
        this.f75803a.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            mo89992g(t);
        }
        t.setInternalOnCheckedChangeListener(new C31386a());
    }

    /* renamed from: f */
    public void mo89991f(@C0329d0 int i) {
        C31396h hVar = (C31396h) this.f75803a.get(Integer.valueOf(i));
        if (hVar != null && mo89992g(hVar)) {
            mo89999n();
        }
    }

    /* renamed from: g */
    public final boolean mo89992g(@C0359n0 C31396h<T> hVar) {
        int id = hVar.getId();
        if (this.f75804b.contains(Integer.valueOf(id))) {
            return false;
        }
        C31396h hVar2 = (C31396h) this.f75803a.get(Integer.valueOf(mo89996k()));
        if (hVar2 != null) {
            mo90005t(hVar2, false);
        }
        boolean add = this.f75804b.add(Integer.valueOf(id));
        if (!hVar.isChecked()) {
            hVar.setChecked(true);
        }
        return add;
    }

    /* renamed from: h */
    public void mo89993h() {
        boolean z = !this.f75804b.isEmpty();
        for (T t : this.f75803a.values()) {
            mo90005t(t, false);
        }
        if (z) {
            mo89999n();
        }
    }

    @C0359n0
    /* renamed from: i */
    public Set<Integer> mo89994i() {
        return new HashSet(this.f75804b);
    }

    @C0359n0
    /* renamed from: j */
    public List<Integer> mo89995j(@C0359n0 ViewGroup viewGroup) {
        Set<Integer> i = mo89994i();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof C31396h) && i.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @C0329d0
    /* renamed from: k */
    public int mo89996k() {
        if (!this.f75806d || this.f75804b.isEmpty()) {
            return -1;
        }
        return this.f75804b.iterator().next().intValue();
    }

    /* renamed from: l */
    public boolean mo89997l() {
        return this.f75807e;
    }

    /* renamed from: m */
    public boolean mo89998m() {
        return this.f75806d;
    }

    /* renamed from: n */
    public final void mo89999n() {
        C31387b bVar = this.f75805c;
        if (bVar != null) {
            bVar.mo88952a(mo89994i());
        }
    }

    /* renamed from: o */
    public void mo90000o(T t) {
        t.setInternalOnCheckedChangeListener((C31396h.C31397a) null);
        this.f75803a.remove(Integer.valueOf(t.getId()));
        this.f75804b.remove(Integer.valueOf(t.getId()));
    }

    /* renamed from: p */
    public void mo90001p(@C0363p0 C31387b bVar) {
        this.f75805c = bVar;
    }

    /* renamed from: q */
    public void mo90002q(boolean z) {
        this.f75807e = z;
    }

    /* renamed from: r */
    public void mo90003r(boolean z) {
        if (this.f75806d != z) {
            this.f75806d = z;
            mo89993h();
        }
    }

    /* renamed from: s */
    public void mo90004s(@C0329d0 int i) {
        C31396h hVar = (C31396h) this.f75803a.get(Integer.valueOf(i));
        if (hVar != null && mo90005t(hVar, this.f75807e)) {
            mo89999n();
        }
    }

    /* renamed from: t */
    public final boolean mo90005t(@C0359n0 C31396h<T> hVar, boolean z) {
        int id = hVar.getId();
        if (!this.f75804b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (!z || this.f75804b.size() != 1 || !this.f75804b.contains(Integer.valueOf(id))) {
            boolean remove = this.f75804b.remove(Integer.valueOf(id));
            if (hVar.isChecked()) {
                hVar.setChecked(false);
            }
            return remove;
        }
        hVar.setChecked(true);
        return false;
    }
}
