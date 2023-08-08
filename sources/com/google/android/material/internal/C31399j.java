package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0327c1;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.annotation.C0372t0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0573j;
import androidx.appcompat.view.menu.C0585n;
import androidx.appcompat.view.menu.C0587o;
import androidx.appcompat.view.menu.C0594s;
import androidx.core.view.C18196h2;
import androidx.core.view.C18436z4;
import androidx.core.view.accessibility.C18065l0;
import androidx.core.widget.C18496q;
import androidx.recyclerview.widget.C20102a0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C31076a;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.j */
public class C31399j implements C0585n {

    /* renamed from: S0 */
    public static final int f75894S0 = 0;

    /* renamed from: T0 */
    public static final String f75895T0 = "android:menu:list";

    /* renamed from: U0 */
    public static final String f75896U0 = "android:menu:adapter";

    /* renamed from: V0 */
    public static final String f75897V0 = "android:menu:header";
    @C0372t0

    /* renamed from: E0 */
    public int f75898E0;

    /* renamed from: F0 */
    public int f75899F0;

    /* renamed from: G0 */
    public int f75900G0;
    @C0372t0

    /* renamed from: H0 */
    public int f75901H0;
    @C0372t0

    /* renamed from: I0 */
    public int f75902I0;
    @C0372t0

    /* renamed from: J0 */
    public int f75903J0;
    @C0372t0

    /* renamed from: K0 */
    public int f75904K0;

    /* renamed from: L0 */
    public boolean f75905L0;

    /* renamed from: M0 */
    public boolean f75906M0 = true;

    /* renamed from: N0 */
    public int f75907N0;

    /* renamed from: O0 */
    public int f75908O0;

    /* renamed from: P0 */
    public int f75909P0;

    /* renamed from: Q0 */
    public int f75910Q0 = -1;

    /* renamed from: R0 */
    public final View.OnClickListener f75911R0 = new C31400a();

    /* renamed from: X */
    public Drawable f75912X;

    /* renamed from: Y */
    public RippleDrawable f75913Y;

    /* renamed from: Z */
    public int f75914Z;

    /* renamed from: a */
    public NavigationMenuView f75915a;

    /* renamed from: b */
    public LinearLayout f75916b;

    /* renamed from: c */
    public C0585n.C0586a f75917c;

    /* renamed from: d */
    public C0568g f75918d;

    /* renamed from: e */
    public int f75919e;

    /* renamed from: f */
    public C31402c f75920f;

    /* renamed from: g */
    public LayoutInflater f75921g;

    /* renamed from: v */
    public int f75922v = 0;
    @C0363p0

    /* renamed from: w */
    public ColorStateList f75923w;

    /* renamed from: x */
    public int f75924x = 0;

    /* renamed from: y */
    public ColorStateList f75925y;

    /* renamed from: z */
    public ColorStateList f75926z;

    /* renamed from: com.google.android.material.internal.j$a */
    public class C31400a implements View.OnClickListener {
        public C31400a() {
        }

        public void onClick(View view) {
            boolean z = true;
            C31399j.this.mo90124Z(true);
            C0573j itemData = ((NavigationMenuItemView) view).getItemData();
            C31399j jVar = C31399j.this;
            boolean P = jVar.f75918d.mo2028P(itemData, jVar, 0);
            if (itemData == null || !itemData.isCheckable() || !P) {
                z = false;
            } else {
                C31399j.this.f75920f.mo90150t(itemData);
            }
            C31399j.this.mo90124Z(false);
            if (z) {
                C31399j.this.mo1943j(false);
            }
        }
    }

    /* renamed from: com.google.android.material.internal.j$b */
    public static class C31401b extends C31411l {
        public C31401b(View view) {
            super(view);
        }
    }

    /* renamed from: com.google.android.material.internal.j$c */
    public class C31402c extends RecyclerView.Adapter<C31411l> {

        /* renamed from: e */
        public static final String f75928e = "android:menu:checked";

        /* renamed from: f */
        public static final String f75929f = "android:menu:action_views";

        /* renamed from: g */
        public static final int f75930g = 0;

        /* renamed from: v */
        public static final int f75931v = 1;

        /* renamed from: w */
        public static final int f75932w = 2;

        /* renamed from: x */
        public static final int f75933x = 3;

        /* renamed from: a */
        public final ArrayList<C31404e> f75934a = new ArrayList<>();

        /* renamed from: b */
        public C0573j f75935b;

        /* renamed from: c */
        public boolean f75936c;

        public C31402c() {
            mo90148r();
        }

        public int getItemCount() {
            return this.f75934a.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            C31404e eVar = this.f75934a.get(i);
            if (eVar instanceof C31405f) {
                return 2;
            }
            if (eVar instanceof C31403d) {
                return 3;
            }
            if (!(eVar instanceof C31406g)) {
                throw new RuntimeException("Unknown item type.");
            } else if (((C31406g) eVar).mo90155a().hasSubMenu()) {
                return 1;
            } else {
                return 0;
            }
        }

        /* renamed from: k */
        public final void mo90141k(int i, int i2) {
            while (i < i2) {
                ((C31406g) this.f75934a.get(i)).f75941b = true;
                i++;
            }
        }

        @C0359n0
        /* renamed from: l */
        public Bundle mo90142l() {
            View view;
            Bundle bundle = new Bundle();
            C0573j jVar = this.f75935b;
            if (jVar != null) {
                bundle.putInt(f75928e, jVar.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f75934a.size();
            for (int i = 0; i < size; i++) {
                C31404e eVar = this.f75934a.get(i);
                if (eVar instanceof C31406g) {
                    C0573j a = ((C31406g) eVar).mo90155a();
                    if (a != null) {
                        view = a.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        view.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(f75929f, sparseArray);
            return bundle;
        }

        /* renamed from: m */
        public C0573j mo90143m() {
            return this.f75935b;
        }

        /* renamed from: n */
        public int mo90144n() {
            int i;
            if (C31399j.this.f75916b.getChildCount() == 0) {
                i = 0;
            } else {
                i = 1;
            }
            for (int i2 = 0; i2 < C31399j.this.f75920f.getItemCount(); i2++) {
                if (C31399j.this.f75920f.getItemViewType(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        /* renamed from: o */
        public void onBindViewHolder(@C0359n0 C31411l lVar, int i) {
            Drawable drawable;
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
                navigationMenuItemView.setIconTintList(C31399j.this.f75926z);
                int i2 = C31399j.this.f75924x;
                if (i2 != 0) {
                    navigationMenuItemView.setTextAppearance(i2);
                }
                ColorStateList colorStateList = C31399j.this.f75925y;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable2 = C31399j.this.f75912X;
                if (drawable2 != null) {
                    drawable = drawable2.getConstantState().newDrawable();
                } else {
                    drawable = null;
                }
                C18196h2.m82502I1(navigationMenuItemView, drawable);
                RippleDrawable rippleDrawable = C31399j.this.f75913Y;
                if (rippleDrawable != null) {
                    navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
                }
                C31406g gVar = (C31406g) this.f75934a.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.f75941b);
                C31399j jVar = C31399j.this;
                int i3 = jVar.f75914Z;
                int i4 = jVar.f75898E0;
                navigationMenuItemView.setPadding(i3, i4, i3, i4);
                navigationMenuItemView.setIconPadding(C31399j.this.f75899F0);
                C31399j jVar2 = C31399j.this;
                if (jVar2.f75905L0) {
                    navigationMenuItemView.setIconSize(jVar2.f75900G0);
                }
                navigationMenuItemView.setMaxLines(C31399j.this.f75907N0);
                navigationMenuItemView.mo1832d(gVar.mo90155a(), 0);
            } else if (itemViewType == 1) {
                TextView textView = (TextView) lVar.itemView;
                textView.setText(((C31406g) this.f75934a.get(i)).mo90155a().getTitle());
                int i5 = C31399j.this.f75922v;
                if (i5 != 0) {
                    C18496q.m83723E(textView, i5);
                }
                textView.setPadding(C31399j.this.f75903J0, textView.getPaddingTop(), C31399j.this.f75904K0, textView.getPaddingBottom());
                ColorStateList colorStateList2 = C31399j.this.f75923w;
                if (colorStateList2 != null) {
                    textView.setTextColor(colorStateList2);
                }
            } else if (itemViewType == 2) {
                C31405f fVar = (C31405f) this.f75934a.get(i);
                lVar.itemView.setPadding(C31399j.this.f75901H0, fVar.mo90154b(), C31399j.this.f75902I0, fVar.mo90153a());
            }
        }

        @C0363p0
        /* renamed from: p */
        public C31411l onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                C31399j jVar = C31399j.this;
                return new C31408i(jVar.f75921g, viewGroup, jVar.f75911R0);
            } else if (i == 1) {
                return new C31410k(C31399j.this.f75921g, viewGroup);
            } else {
                if (i == 2) {
                    return new C31409j(C31399j.this.f75921g, viewGroup);
                }
                if (i != 3) {
                    return null;
                }
                return new C31401b(C31399j.this.f75916b);
            }
        }

        /* renamed from: q */
        public void onViewRecycled(C31411l lVar) {
            if (lVar instanceof C31408i) {
                ((NavigationMenuItemView) lVar.itemView).mo89939G();
            }
        }

        /* renamed from: r */
        public final void mo90148r() {
            if (!this.f75936c) {
                boolean z = true;
                this.f75936c = true;
                this.f75934a.clear();
                this.f75934a.add(new C31403d());
                int size = C31399j.this.f75918d.mo2020H().size();
                int i = -1;
                int i2 = 0;
                boolean z2 = false;
                int i3 = 0;
                while (i2 < size) {
                    C0573j jVar = C31399j.this.f75918d.mo2020H().get(i2);
                    if (jVar.isChecked()) {
                        mo90150t(jVar);
                    }
                    if (jVar.isCheckable()) {
                        jVar.mo2167w(false);
                    }
                    if (jVar.hasSubMenu()) {
                        SubMenu subMenu = jVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i2 != 0) {
                                this.f75934a.add(new C31405f(C31399j.this.f75909P0, 0));
                            }
                            this.f75934a.add(new C31406g(jVar));
                            int size2 = this.f75934a.size();
                            int size3 = subMenu.size();
                            int i4 = 0;
                            boolean z3 = false;
                            while (i4 < size3) {
                                C0573j jVar2 = (C0573j) subMenu.getItem(i4);
                                if (jVar2.isVisible()) {
                                    if (!z3 && jVar2.getIcon() != null) {
                                        z3 = z;
                                    }
                                    if (jVar2.isCheckable()) {
                                        jVar2.mo2167w(false);
                                    }
                                    if (jVar.isChecked()) {
                                        mo90150t(jVar);
                                    }
                                    this.f75934a.add(new C31406g(jVar2));
                                }
                                i4++;
                                z = true;
                            }
                            if (z3) {
                                mo90141k(size2, this.f75934a.size());
                            }
                        }
                    } else {
                        int groupId = jVar.getGroupId();
                        if (groupId != i) {
                            i3 = this.f75934a.size();
                            if (jVar.getIcon() != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (i2 != 0) {
                                i3++;
                                ArrayList<C31404e> arrayList = this.f75934a;
                                int i5 = C31399j.this.f75909P0;
                                arrayList.add(new C31405f(i5, i5));
                            }
                        } else if (!z2 && jVar.getIcon() != null) {
                            mo90141k(i3, this.f75934a.size());
                            z2 = true;
                        }
                        C31406g gVar = new C31406g(jVar);
                        gVar.f75941b = z2;
                        this.f75934a.add(gVar);
                        i = groupId;
                    }
                    i2++;
                    z = true;
                }
                this.f75936c = false;
            }
        }

        /* renamed from: s */
        public void mo90149s(@C0359n0 Bundle bundle) {
            C0573j a;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            C0573j a2;
            int i = bundle.getInt(f75928e, 0);
            if (i != 0) {
                this.f75936c = true;
                int size = this.f75934a.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    C31404e eVar = this.f75934a.get(i2);
                    if ((eVar instanceof C31406g) && (a2 = ((C31406g) eVar).mo90155a()) != null && a2.getItemId() == i) {
                        mo90150t(a2);
                        break;
                    }
                    i2++;
                }
                this.f75936c = false;
                mo90148r();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f75929f);
            if (sparseParcelableArray != null) {
                int size2 = this.f75934a.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C31404e eVar2 = this.f75934a.get(i3);
                    if (!(!(eVar2 instanceof C31406g) || (a = ((C31406g) eVar2).mo90155a()) == null || (actionView = a.getActionView()) == null || (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a.getItemId())) == null)) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        /* renamed from: t */
        public void mo90150t(@C0359n0 C0573j jVar) {
            if (this.f75935b != jVar && jVar.isCheckable()) {
                C0573j jVar2 = this.f75935b;
                if (jVar2 != null) {
                    jVar2.setChecked(false);
                }
                this.f75935b = jVar;
                jVar.setChecked(true);
            }
        }

        /* renamed from: u */
        public void mo90151u(boolean z) {
            this.f75936c = z;
        }

        /* renamed from: v */
        public void mo90152v() {
            mo90148r();
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.google.android.material.internal.j$d */
    public static class C31403d implements C31404e {
    }

    /* renamed from: com.google.android.material.internal.j$e */
    public interface C31404e {
    }

    /* renamed from: com.google.android.material.internal.j$f */
    public static class C31405f implements C31404e {

        /* renamed from: a */
        public final int f75938a;

        /* renamed from: b */
        public final int f75939b;

        public C31405f(int i, int i2) {
            this.f75938a = i;
            this.f75939b = i2;
        }

        /* renamed from: a */
        public int mo90153a() {
            return this.f75939b;
        }

        /* renamed from: b */
        public int mo90154b() {
            return this.f75938a;
        }
    }

    /* renamed from: com.google.android.material.internal.j$g */
    public static class C31406g implements C31404e {

        /* renamed from: a */
        public final C0573j f75940a;

        /* renamed from: b */
        public boolean f75941b;

        public C31406g(C0573j jVar) {
            this.f75940a = jVar;
        }

        /* renamed from: a */
        public C0573j mo90155a() {
            return this.f75940a;
        }
    }

    /* renamed from: com.google.android.material.internal.j$h */
    public class C31407h extends C20102a0 {
        public C31407h(@C0359n0 RecyclerView recyclerView) {
            super(recyclerView);
        }

        /* renamed from: g */
        public void mo19938g(View view, @C0359n0 C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            l0Var.mo52600b1(C18065l0.C18068c.m82099e(C31399j.this.f75920f.mo90144n(), 0, false));
        }
    }

    /* renamed from: com.google.android.material.internal.j$i */
    public static class C31408i extends C31411l {
        public C31408i(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C31076a.C31087k.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.google.android.material.internal.j$j */
    public static class C31409j extends C31411l {
        public C31409j(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C31076a.C31087k.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.j$k */
    public static class C31410k extends C31411l {
        public C31410k(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C31076a.C31087k.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.j$l */
    public static abstract class C31411l extends RecyclerView.C20061e0 {
        public C31411l(View view) {
            super(view);
        }
    }

    @C0372t0
    /* renamed from: A */
    public int mo90099A() {
        return this.f75904K0;
    }

    @C0372t0
    /* renamed from: B */
    public int mo90100B() {
        return this.f75903J0;
    }

    /* renamed from: C */
    public View mo90101C(@C0347i0 int i) {
        View inflate = this.f75921g.inflate(i, this.f75916b, false);
        mo90126c(inflate);
        return inflate;
    }

    /* renamed from: D */
    public boolean mo90102D() {
        return this.f75906M0;
    }

    /* renamed from: E */
    public void mo90103E(@C0359n0 View view) {
        this.f75916b.removeView(view);
        if (this.f75916b.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.f75915a;
            navigationMenuView.setPadding(0, this.f75908O0, 0, navigationMenuView.getPaddingBottom());
        }
    }

    /* renamed from: F */
    public void mo90104F(boolean z) {
        if (this.f75906M0 != z) {
            this.f75906M0 = z;
            mo90125a0();
        }
    }

    /* renamed from: G */
    public void mo90105G(@C0359n0 C0573j jVar) {
        this.f75920f.mo90150t(jVar);
    }

    /* renamed from: H */
    public void mo90106H(@C0372t0 int i) {
        this.f75902I0 = i;
        mo1943j(false);
    }

    /* renamed from: I */
    public void mo90107I(@C0372t0 int i) {
        this.f75901H0 = i;
        mo1943j(false);
    }

    /* renamed from: J */
    public void mo90108J(int i) {
        this.f75919e = i;
    }

    /* renamed from: K */
    public void mo90109K(@C0363p0 Drawable drawable) {
        this.f75912X = drawable;
        mo1943j(false);
    }

    /* renamed from: L */
    public void mo90110L(@C0363p0 RippleDrawable rippleDrawable) {
        this.f75913Y = rippleDrawable;
        mo1943j(false);
    }

    /* renamed from: M */
    public void mo90111M(int i) {
        this.f75914Z = i;
        mo1943j(false);
    }

    /* renamed from: N */
    public void mo90112N(int i) {
        this.f75899F0 = i;
        mo1943j(false);
    }

    /* renamed from: O */
    public void mo90113O(@C0366r int i) {
        if (this.f75900G0 != i) {
            this.f75900G0 = i;
            this.f75905L0 = true;
            mo1943j(false);
        }
    }

    /* renamed from: P */
    public void mo90114P(@C0363p0 ColorStateList colorStateList) {
        this.f75926z = colorStateList;
        mo1943j(false);
    }

    /* renamed from: Q */
    public void mo90115Q(int i) {
        this.f75907N0 = i;
        mo1943j(false);
    }

    /* renamed from: R */
    public void mo90116R(@C0327c1 int i) {
        this.f75924x = i;
        mo1943j(false);
    }

    /* renamed from: S */
    public void mo90117S(@C0363p0 ColorStateList colorStateList) {
        this.f75925y = colorStateList;
        mo1943j(false);
    }

    /* renamed from: T */
    public void mo90118T(@C0372t0 int i) {
        this.f75898E0 = i;
        mo1943j(false);
    }

    /* renamed from: U */
    public void mo90119U(int i) {
        this.f75910Q0 = i;
        NavigationMenuView navigationMenuView = this.f75915a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    /* renamed from: V */
    public void mo90120V(@C0363p0 ColorStateList colorStateList) {
        this.f75923w = colorStateList;
        mo1943j(false);
    }

    /* renamed from: W */
    public void mo90121W(@C0372t0 int i) {
        this.f75904K0 = i;
        mo1943j(false);
    }

    /* renamed from: X */
    public void mo90122X(@C0372t0 int i) {
        this.f75903J0 = i;
        mo1943j(false);
    }

    /* renamed from: Y */
    public void mo90123Y(@C0327c1 int i) {
        this.f75922v = i;
        mo1943j(false);
    }

    /* renamed from: Z */
    public void mo90124Z(boolean z) {
        C31402c cVar = this.f75920f;
        if (cVar != null) {
            cVar.mo90151u(z);
        }
    }

    /* renamed from: a0 */
    public final void mo90125a0() {
        int i;
        if (this.f75916b.getChildCount() != 0 || !this.f75906M0) {
            i = 0;
        } else {
            i = this.f75908O0;
        }
        NavigationMenuView navigationMenuView = this.f75915a;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: b */
    public void mo1936b(C0568g gVar, boolean z) {
        C0585n.C0586a aVar = this.f75917c;
        if (aVar != null) {
            aVar.mo1207b(gVar, z);
        }
    }

    /* renamed from: c */
    public void mo90126c(@C0359n0 View view) {
        this.f75916b.addView(view);
        NavigationMenuView navigationMenuView = this.f75915a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: d */
    public boolean mo1938d(C0568g gVar, C0573j jVar) {
        return false;
    }

    /* renamed from: e */
    public void mo1939e(C0585n.C0586a aVar) {
        this.f75917c = aVar;
    }

    /* renamed from: f */
    public void mo1969f(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f75915a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(f75896U0);
            if (bundle2 != null) {
                this.f75920f.mo90149s(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray(f75897V0);
            if (sparseParcelableArray2 != null) {
                this.f75916b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    /* renamed from: g */
    public boolean mo1940g(C0594s sVar) {
        return false;
    }

    public int getId() {
        return this.f75919e;
    }

    /* renamed from: h */
    public C0587o mo1942h(ViewGroup viewGroup) {
        if (this.f75915a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f75921g.inflate(C31076a.C31087k.design_navigation_menu, viewGroup, false);
            this.f75915a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new C31407h(this.f75915a));
            if (this.f75920f == null) {
                this.f75920f = new C31402c();
            }
            int i = this.f75910Q0;
            if (i != -1) {
                this.f75915a.setOverScrollMode(i);
            }
            this.f75916b = (LinearLayout) this.f75921g.inflate(C31076a.C31087k.design_navigation_item_header, this.f75915a, false);
            this.f75915a.setAdapter(this.f75920f);
        }
        return this.f75915a;
    }

    @C0359n0
    /* renamed from: i */
    public Parcelable mo1970i() {
        Bundle bundle = new Bundle();
        if (this.f75915a != null) {
            SparseArray sparseArray = new SparseArray();
            this.f75915a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C31402c cVar = this.f75920f;
        if (cVar != null) {
            bundle.putBundle(f75896U0, cVar.mo90142l());
        }
        if (this.f75916b != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f75916b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(f75897V0, sparseArray2);
        }
        return bundle;
    }

    /* renamed from: j */
    public void mo1943j(boolean z) {
        C31402c cVar = this.f75920f;
        if (cVar != null) {
            cVar.mo90152v();
        }
    }

    /* renamed from: k */
    public boolean mo1944k() {
        return false;
    }

    /* renamed from: l */
    public boolean mo1945l(C0568g gVar, C0573j jVar) {
        return false;
    }

    /* renamed from: m */
    public void mo1946m(@C0359n0 Context context, @C0359n0 C0568g gVar) {
        this.f75921g = LayoutInflater.from(context);
        this.f75918d = gVar;
        this.f75909P0 = context.getResources().getDimensionPixelOffset(C31076a.C31082f.design_navigation_separator_vertical_padding);
    }

    /* renamed from: n */
    public void mo90127n(@C0359n0 C18436z4 z4Var) {
        int r = z4Var.mo53149r();
        if (this.f75908O0 != r) {
            this.f75908O0 = r;
            mo90125a0();
        }
        NavigationMenuView navigationMenuView = this.f75915a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, z4Var.mo53146o());
        C18196h2.m82616p(this.f75916b, z4Var);
    }

    @C0363p0
    /* renamed from: o */
    public C0573j mo90128o() {
        return this.f75920f.mo90143m();
    }

    @C0372t0
    /* renamed from: p */
    public int mo90129p() {
        return this.f75902I0;
    }

    @C0372t0
    /* renamed from: q */
    public int mo90130q() {
        return this.f75901H0;
    }

    /* renamed from: r */
    public int mo90131r() {
        return this.f75916b.getChildCount();
    }

    /* renamed from: s */
    public View mo90132s(int i) {
        return this.f75916b.getChildAt(i);
    }

    @C0363p0
    /* renamed from: t */
    public Drawable mo90133t() {
        return this.f75912X;
    }

    /* renamed from: u */
    public int mo90134u() {
        return this.f75914Z;
    }

    /* renamed from: v */
    public int mo90135v() {
        return this.f75899F0;
    }

    /* renamed from: w */
    public int mo90136w() {
        return this.f75907N0;
    }

    @C0363p0
    /* renamed from: x */
    public ColorStateList mo90137x() {
        return this.f75925y;
    }

    @C0363p0
    /* renamed from: y */
    public ColorStateList mo90138y() {
        return this.f75926z;
    }

    @C0372t0
    /* renamed from: z */
    public int mo90139z() {
        return this.f75898E0;
    }
}
