package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.C0329d0;
import androidx.annotation.C0342h;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.C18353r0;
import androidx.core.view.accessibility.C18065l0;
import com.google.android.material.C31076a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C31432x;
import com.google.android.material.shape.C31515a;
import com.google.android.material.shape.C31518d;
import com.google.android.material.shape.C31534o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: y */
    public static final String f74907y = "MaterialButtonToggleGroup";

    /* renamed from: z */
    public static final int f74908z = C31076a.C31090n.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: a */
    public final List<C31194c> f74909a;

    /* renamed from: b */
    public final C31196e f74910b;

    /* renamed from: c */
    public final LinkedHashSet<C31195d> f74911c;

    /* renamed from: d */
    public final Comparator<MaterialButton> f74912d;

    /* renamed from: e */
    public Integer[] f74913e;

    /* renamed from: f */
    public boolean f74914f;

    /* renamed from: g */
    public boolean f74915g;

    /* renamed from: v */
    public boolean f74916v;
    @C0329d0

    /* renamed from: w */
    public final int f74917w;

    /* renamed from: x */
    public Set<Integer> f74918x;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    public class C31192a implements Comparator<MaterialButton> {
        public C31192a() {
        }

        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    public class C31193b extends C18019a {
        public C31193b() {
        }

        /* renamed from: g */
        public void mo19938g(View view, @C0359n0 C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            l0Var.mo52604c1(C18065l0.C18069d.m82106h(0, 1, MaterialButtonToggleGroup.this.mo88578k(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    public static class C31194c {

        /* renamed from: e */
        public static final C31518d f74921e = new C31515a(0.0f);

        /* renamed from: a */
        public C31518d f74922a;

        /* renamed from: b */
        public C31518d f74923b;

        /* renamed from: c */
        public C31518d f74924c;

        /* renamed from: d */
        public C31518d f74925d;

        public C31194c(C31518d dVar, C31518d dVar2, C31518d dVar3, C31518d dVar4) {
            this.f74922a = dVar;
            this.f74923b = dVar3;
            this.f74924c = dVar4;
            this.f74925d = dVar2;
        }

        /* renamed from: a */
        public static C31194c m125406a(C31194c cVar) {
            C31518d dVar = f74921e;
            return new C31194c(dVar, cVar.f74925d, dVar, cVar.f74924c);
        }

        /* renamed from: b */
        public static C31194c m125407b(C31194c cVar, View view) {
            return C31432x.m127016k(view) ? m125408c(cVar) : m125409d(cVar);
        }

        /* renamed from: c */
        public static C31194c m125408c(C31194c cVar) {
            C31518d dVar = cVar.f74922a;
            C31518d dVar2 = cVar.f74925d;
            C31518d dVar3 = f74921e;
            return new C31194c(dVar, dVar2, dVar3, dVar3);
        }

        /* renamed from: d */
        public static C31194c m125409d(C31194c cVar) {
            C31518d dVar = f74921e;
            return new C31194c(dVar, dVar, cVar.f74923b, cVar.f74924c);
        }

        /* renamed from: e */
        public static C31194c m125410e(C31194c cVar, View view) {
            return C31432x.m127016k(view) ? m125409d(cVar) : m125408c(cVar);
        }

        /* renamed from: f */
        public static C31194c m125411f(C31194c cVar) {
            C31518d dVar = cVar.f74922a;
            C31518d dVar2 = f74921e;
            return new C31194c(dVar, dVar2, cVar.f74923b, dVar2);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    public interface C31195d {
        /* renamed from: a */
        void mo88600a(MaterialButtonToggleGroup materialButtonToggleGroup, @C0329d0 int i, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    public class C31196e implements MaterialButton.C31191c {
        public C31196e() {
        }

        /* renamed from: a */
        public void mo88563a(@C0359n0 MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ C31196e(MaterialButtonToggleGroup materialButtonToggleGroup, C31192a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (mo88580m(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (mo88580m(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && mo88580m(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(@C0359n0 MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(C18196h2.m82480D());
        }
    }

    private void setupButtonChild(@C0359n0 MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f74910b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: u */
    public static void m125381u(C31534o.C31536b bVar, @C0363p0 C31194c cVar) {
        if (cVar == null) {
            bVar.mo90844o(0.0f);
        } else {
            bVar.mo90837L(cVar.f74922a).mo90854y(cVar.f74925d).mo90842Q(cVar.f74923b).mo90829D(cVar.f74924c);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            mo88570f(materialButton.getId(), materialButton.isChecked());
            C31534o shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f74909a.add(new C31194c(shapeAppearanceModel.mo90818r(), shapeAppearanceModel.mo90811j(), shapeAppearanceModel.mo90820t(), shapeAppearanceModel.mo90813l()));
            C18196h2.m82474B1(materialButton, new C31193b());
        }
    }

    /* renamed from: b */
    public void mo88565b(@C0359n0 C31195d dVar) {
        this.f74911c.add(dVar);
    }

    /* renamed from: c */
    public final void mo88566c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton j = mo88577j(i);
                int min = Math.min(j.getStrokeWidth(), mo88577j(i - 1).getStrokeWidth());
                LinearLayout.LayoutParams d = mo88567d(j);
                if (getOrientation() == 0) {
                    C18353r0.m83086g(d, 0);
                    C18353r0.m83087h(d, -min);
                    d.topMargin = 0;
                } else {
                    d.bottomMargin = 0;
                    d.topMargin = -min;
                    C18353r0.m83087h(d, 0);
                }
                j.setLayoutParams(d);
            }
            mo88589r(firstVisibleChildIndex);
        }
    }

    @C0359n0
    /* renamed from: d */
    public final LinearLayout.LayoutParams mo88567d(@C0359n0 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    public void dispatchDraw(@C0359n0 Canvas canvas) {
        mo88596w();
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public void mo88569e(@C0329d0 int i) {
        mo88570f(i, true);
    }

    /* renamed from: f */
    public final void mo88570f(@C0329d0 int i, boolean z) {
        if (i == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Button ID is not valid: ");
            sb.append(i);
            return;
        }
        HashSet hashSet = new HashSet(this.f74918x);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f74915g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (!z && hashSet.contains(Integer.valueOf(i))) {
            if (!this.f74916v || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        } else {
            return;
        }
        mo88595v(hashSet);
    }

    /* renamed from: g */
    public void mo88571g() {
        mo88595v(new HashSet());
    }

    @C0329d0
    public int getCheckedButtonId() {
        if (!this.f74915g || this.f74918x.isEmpty()) {
            return -1;
        }
        return this.f74918x.iterator().next().intValue();
    }

    @C0359n0
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = mo88577j(i).getId();
            if (this.f74918x.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f74913e;
        if (numArr == null || i2 >= numArr.length) {
            return i2;
        }
        return numArr[i2].intValue();
    }

    /* renamed from: h */
    public void mo88575h() {
        this.f74911c.clear();
    }

    /* renamed from: i */
    public final void mo88576i(@C0329d0 int i, boolean z) {
        Iterator<C31195d> it = this.f74911c.iterator();
        while (it.hasNext()) {
            it.next().mo88600a(this, i, z);
        }
    }

    /* renamed from: j */
    public final MaterialButton mo88577j(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* renamed from: k */
    public final int mo88578k(@C0363p0 View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && mo88580m(i2)) {
                i++;
            }
        }
        return -1;
    }

    @C0363p0
    /* renamed from: l */
    public final C31194c mo88579l(int i, int i2, int i3) {
        boolean z;
        C31194c cVar = this.f74909a.get(i);
        if (i2 == i3) {
            return cVar;
        }
        if (getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == i2) {
            if (z) {
                return C31194c.m125410e(cVar, this);
            }
            return C31194c.m125411f(cVar);
        } else if (i != i3) {
            return null;
        } else {
            if (z) {
                return C31194c.m125407b(cVar, this);
            }
            return C31194c.m125406a(cVar);
        }
    }

    /* renamed from: m */
    public final boolean mo88580m(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo88581n() {
        return this.f74916v;
    }

    /* renamed from: o */
    public boolean mo88582o() {
        return this.f74915g;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f74917w;
        if (i != -1) {
            mo88595v(Collections.singleton(Integer.valueOf(i)));
        }
    }

    public void onInitializeAccessibilityNodeInfo(@C0359n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C18065l0 c2 = C18065l0.m81936c2(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (mo88582o()) {
            i = 1;
        } else {
            i = 2;
        }
        c2.mo52600b1(C18065l0.C18068c.m82100f(1, visibleButtonCount, false, i));
    }

    public void onMeasure(int i, int i2) {
        mo88597x();
        mo88566c();
        super.onMeasure(i, i2);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((MaterialButton.C31191c) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f74909a.remove(indexOfChild);
        }
        mo88597x();
        mo88566c();
    }

    /* renamed from: p */
    public void mo88587p(@C0359n0 MaterialButton materialButton, boolean z) {
        if (!this.f74914f) {
            mo88570f(materialButton.getId(), z);
        }
    }

    /* renamed from: q */
    public void mo88588q(@C0359n0 C31195d dVar) {
        this.f74911c.remove(dVar);
    }

    /* renamed from: r */
    public final void mo88589r(int i) {
        if (getChildCount() != 0 && i != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) mo88577j(i).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            C18353r0.m83086g(layoutParams, 0);
            C18353r0.m83087h(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* renamed from: s */
    public final void mo88590s(@C0329d0 int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f74914f = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f74914f = false;
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f74916v = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f74915g != z) {
            this.f74915g = z;
            mo88571g();
        }
    }

    /* renamed from: t */
    public void mo88594t(@C0329d0 int i) {
        mo88570f(i, false);
    }

    /* renamed from: v */
    public final void mo88595v(Set<Integer> set) {
        Set<Integer> set2 = this.f74918x;
        this.f74918x = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = mo88577j(i).getId();
            mo88590s(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                mo88576i(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    /* renamed from: w */
    public final void mo88596w() {
        TreeMap treeMap = new TreeMap(this.f74912d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(mo88577j(i), Integer.valueOf(i));
        }
        this.f74913e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @C0344h1
    /* renamed from: x */
    public void mo88597x() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton j = mo88577j(i);
            if (j.getVisibility() != 8) {
                C31534o.C31536b v = j.getShapeAppearanceModel().mo90822v();
                m125381u(v, mo88579l(i, firstVisibleChildIndex, lastVisibleChildIndex));
                j.setShapeAppearanceModel(v.mo90843m());
            }
        }
    }

    public MaterialButtonToggleGroup(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.materialButtonToggleGroupStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(@androidx.annotation.C0359n0 android.content.Context r7, @androidx.annotation.C0363p0 android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f74908z
            android.content.Context r7 = com.google.android.material.theme.overlay.C31683a.m128455c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f74909a = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r0 = 0
            r7.<init>(r6, r0)
            r6.f74910b = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f74911c = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f74912d = r7
            r7 = 0
            r6.f74914f = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f74918x = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.C31076a.C31091o.MaterialButtonToggleGroup
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C31422p.m126970j(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.C31076a.C31091o.MaterialButtonToggleGroup_singleSelection
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection((boolean) r9)
            int r9 = com.google.android.material.C31076a.C31091o.MaterialButtonToggleGroup_checkedButton
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f74917w = r9
            int r9 = com.google.android.material.C31076a.C31091o.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f74916v = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            androidx.core.view.C18196h2.m82531R1(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(@C0342h int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
