package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.C0507a;
import androidx.core.view.C18196h2;
import androidx.preference.C19966s;
import androidx.preference.C19975v;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.C20157j;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.preference.n */
public class C19953n extends RecyclerView.Adapter<C19974u> implements Preference.C19900b, PreferenceGroup.C19908c {

    /* renamed from: a */
    public final PreferenceGroup f51067a;

    /* renamed from: b */
    public List<Preference> f51068b;

    /* renamed from: c */
    public List<Preference> f51069c;

    /* renamed from: d */
    public final List<C19957d> f51070d;

    /* renamed from: e */
    public final Handler f51071e;

    /* renamed from: f */
    public final Runnable f51072f = new C19954a();

    /* renamed from: androidx.preference.n$a */
    public class C19954a implements Runnable {
        public C19954a() {
        }

        public void run() {
            C19953n.this.mo59151r();
        }
    }

    /* renamed from: androidx.preference.n$b */
    public class C19955b extends C20157j.C20159b {

        /* renamed from: a */
        public final /* synthetic */ List f51074a;

        /* renamed from: b */
        public final /* synthetic */ List f51075b;

        /* renamed from: c */
        public final /* synthetic */ C19966s.C19970d f51076c;

        public C19955b(List list, List list2, C19966s.C19970d dVar) {
            this.f51074a = list;
            this.f51075b = list2;
            this.f51076c = dVar;
        }

        /* renamed from: a */
        public boolean mo59153a(int i, int i2) {
            return this.f51076c.mo59211a((Preference) this.f51074a.get(i), (Preference) this.f51075b.get(i2));
        }

        /* renamed from: b */
        public boolean mo59154b(int i, int i2) {
            return this.f51076c.mo59212b((Preference) this.f51074a.get(i), (Preference) this.f51075b.get(i2));
        }

        /* renamed from: d */
        public int mo59155d() {
            return this.f51075b.size();
        }

        /* renamed from: e */
        public int mo59156e() {
            return this.f51074a.size();
        }
    }

    /* renamed from: androidx.preference.n$c */
    public class C19956c implements Preference.C19902d {

        /* renamed from: a */
        public final /* synthetic */ PreferenceGroup f51078a;

        public C19956c(PreferenceGroup preferenceGroup) {
            this.f51078a = preferenceGroup;
        }

        /* renamed from: a */
        public boolean mo35169a(@C0359n0 Preference preference) {
            this.f51078a.mo58951z3(Integer.MAX_VALUE);
            C19953n.this.mo58930h(preference);
            PreferenceGroup.C19907b o3 = this.f51078a.mo58940o3();
            if (o3 == null) {
                return true;
            }
            o3.mo58958a();
            return true;
        }
    }

    /* renamed from: androidx.preference.n$d */
    public static class C19957d {

        /* renamed from: a */
        public int f51080a;

        /* renamed from: b */
        public int f51081b;

        /* renamed from: c */
        public String f51082c;

        public C19957d(@C0359n0 Preference preference) {
            this.f51082c = preference.getClass().getName();
            this.f51080a = preference.mo58894m0();
            this.f51081b = preference.mo58892k1();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C19957d)) {
                return false;
            }
            C19957d dVar = (C19957d) obj;
            if (this.f51080a == dVar.f51080a && this.f51081b == dVar.f51081b && TextUtils.equals(this.f51082c, dVar.f51082c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.f51080a) * 31) + this.f51081b) * 31) + this.f51082c.hashCode();
        }
    }

    public C19953n(@C0359n0 PreferenceGroup preferenceGroup) {
        this.f51067a = preferenceGroup;
        this.f51071e = new Handler(Looper.getMainLooper());
        preferenceGroup.mo58850N2(this);
        this.f51068b = new ArrayList();
        this.f51069c = new ArrayList();
        this.f51070d = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup).mo58962E3());
        } else {
            setHasStableIds(true);
        }
        mo59151r();
    }

    /* renamed from: d */
    public void mo58928d(@C0359n0 Preference preference) {
        mo58930h(preference);
    }

    /* renamed from: e */
    public int mo58959e(@C0359n0 Preference preference) {
        int size = this.f51069c.size();
        for (int i = 0; i < size; i++) {
            Preference preference2 = this.f51069c.get(i);
            if (preference2 != null && preference2.equals(preference)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public void mo58929f(@C0359n0 Preference preference) {
        int indexOf = this.f51069c.indexOf(preference);
        if (indexOf != -1) {
            notifyItemChanged(indexOf, preference);
        }
    }

    public int getItemCount() {
        return this.f51069c.size();
    }

    public long getItemId(int i) {
        if (!hasStableIds()) {
            return -1;
        }
        return mo59147n(i).mo58884h0();
    }

    public int getItemViewType(int i) {
        C19957d dVar = new C19957d(mo59147n(i));
        int indexOf = this.f51070d.indexOf(dVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f51070d.size();
        this.f51070d.add(dVar);
        return size;
    }

    /* renamed from: h */
    public void mo58930h(@C0359n0 Preference preference) {
        this.f51071e.removeCallbacks(this.f51072f);
        this.f51071e.post(this.f51072f);
    }

    /* renamed from: j */
    public int mo58960j(@C0359n0 String str) {
        int size = this.f51069c.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, this.f51069c.get(i).mo58889j0())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final C19919d mo59144k(PreferenceGroup preferenceGroup, List<Preference> list) {
        C19919d dVar = new C19919d(preferenceGroup.mo58854Q(), list, preferenceGroup.mo58884h0());
        dVar.mo58853P2(new C19956c(preferenceGroup));
        return dVar;
    }

    /* renamed from: l */
    public final List<Preference> mo59145l(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int q3 = preferenceGroup.mo58942q3();
        int i = 0;
        for (int i2 = 0; i2 < q3; i2++) {
            Preference p3 = preferenceGroup.mo58941p3(i2);
            if (p3.mo58831F1()) {
                if (!mo59148o(preferenceGroup) || i < preferenceGroup.mo58939n3()) {
                    arrayList.add(p3);
                } else {
                    arrayList2.add(p3);
                }
                if (!(p3 instanceof PreferenceGroup)) {
                    i++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) p3;
                    if (!preferenceGroup2.mo58944s3()) {
                        continue;
                    } else if (!mo59148o(preferenceGroup) || !mo59148o(preferenceGroup2)) {
                        for (Preference next : mo59145l(preferenceGroup2)) {
                            if (!mo59148o(preferenceGroup) || i < preferenceGroup.mo58939n3()) {
                                arrayList.add(next);
                            } else {
                                arrayList2.add(next);
                            }
                            i++;
                        }
                    } else {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    }
                }
            }
        }
        if (mo59148o(preferenceGroup) && i > preferenceGroup.mo58939n3()) {
            arrayList.add(mo59144k(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    /* renamed from: m */
    public final void mo59146m(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.mo58935C3();
        int q3 = preferenceGroup.mo58942q3();
        for (int i = 0; i < q3; i++) {
            Preference p3 = preferenceGroup.mo58941p3(i);
            list.add(p3);
            C19957d dVar = new C19957d(p3);
            if (!this.f51070d.contains(dVar)) {
                this.f51070d.add(dVar);
            }
            if (p3 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) p3;
                if (preferenceGroup2.mo58944s3()) {
                    mo59146m(list, preferenceGroup2);
                }
            }
            p3.mo58850N2(this);
        }
    }

    @C0363p0
    /* renamed from: n */
    public Preference mo59147n(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return this.f51069c.get(i);
    }

    /* renamed from: o */
    public final boolean mo59148o(PreferenceGroup preferenceGroup) {
        return preferenceGroup.mo58939n3() != Integer.MAX_VALUE;
    }

    /* renamed from: p */
    public void onBindViewHolder(@C0359n0 C19974u uVar, int i) {
        Preference n = mo59147n(i);
        uVar.mo59217g();
        n.mo34405Q1(uVar);
    }

    @C0359n0
    /* renamed from: q */
    public C19974u onCreateViewHolder(@C0359n0 ViewGroup viewGroup, int i) {
        C19957d dVar = this.f51070d.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, C19975v.C19986k.BackgroundStyle);
        Drawable drawable = obtainStyledAttributes.getDrawable(C19975v.C19986k.BackgroundStyle_android_selectableItemBackground);
        if (drawable == null) {
            drawable = C0507a.m2346b(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(dVar.f51080a, viewGroup, false);
        if (inflate.getBackground() == null) {
            C18196h2.m82502I1(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = dVar.f51081b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C19974u(inflate);
    }

    /* renamed from: r */
    public void mo59151r() {
        for (Preference N2 : this.f51068b) {
            N2.mo58850N2((Preference.C19900b) null);
        }
        ArrayList arrayList = new ArrayList(this.f51068b.size());
        this.f51068b = arrayList;
        mo59146m(arrayList, this.f51067a);
        List<Preference> list = this.f51069c;
        List<Preference> l = mo59145l(this.f51067a);
        this.f51069c = l;
        C19966s N0 = this.f51067a.mo58848N0();
        if (N0 == null || N0.mo59198l() == null) {
            notifyDataSetChanged();
        } else {
            C20157j.m94272b(new C19955b(list, l, N0.mo59198l())).mo60473e(this);
        }
        for (Preference q : this.f51068b) {
            q.mo58902q();
        }
    }
}
