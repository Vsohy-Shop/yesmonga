package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.C0329d0;
import androidx.annotation.C0342h;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.annotation.C0366r;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31385a;
import com.google.android.material.internal.FlowLayout;
import java.util.List;
import java.util.Set;

public class ChipGroup extends FlowLayout {

    /* renamed from: y */
    public static final int f75030y = C31076a.C31090n.Widget_MaterialComponents_ChipGroup;
    @C0366r

    /* renamed from: e */
    public int f75031e;
    @C0366r

    /* renamed from: f */
    public int f75032f;
    @C0363p0

    /* renamed from: g */
    public C31211e f75033g;

    /* renamed from: v */
    public final C31385a<Chip> f75034v;

    /* renamed from: w */
    public final int f75035w;
    @C0359n0

    /* renamed from: x */
    public final C31212f f75036x;

    /* renamed from: com.google.android.material.chip.ChipGroup$a */
    public class C31207a implements C31385a.C31387b {
        public C31207a() {
        }

        /* renamed from: a */
        public void mo88952a(Set<Integer> set) {
            if (ChipGroup.this.f75033g != null) {
                C31211e e = ChipGroup.this.f75033g;
                ChipGroup chipGroup = ChipGroup.this;
                e.mo88953a(chipGroup, chipGroup.f75034v.mo89995j(ChipGroup.this));
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    public class C31208b implements C31211e {

        /* renamed from: a */
        public final /* synthetic */ C31210d f75038a;

        public C31208b(C31210d dVar) {
            this.f75038a = dVar;
        }

        /* renamed from: a */
        public void mo88953a(@C0359n0 ChipGroup chipGroup, @C0359n0 List<Integer> list) {
            if (ChipGroup.this.f75034v.mo89998m()) {
                this.f75038a.mo88954a(chipGroup, ChipGroup.this.getCheckedChipId());
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C31209c extends ViewGroup.MarginLayoutParams {
        public C31209c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C31209c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C31209c(int i, int i2) {
            super(i, i2);
        }

        public C31209c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface C31210d {
        /* renamed from: a */
        void mo88954a(@C0359n0 ChipGroup chipGroup, @C0329d0 int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    public interface C31211e {
        /* renamed from: a */
        void mo88953a(@C0359n0 ChipGroup chipGroup, @C0359n0 List<Integer> list);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$f */
    public class C31212f implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a */
        public ViewGroup.OnHierarchyChangeListener f75040a;

        public C31212f() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(C18196h2.m82480D());
                }
                ChipGroup.this.f75034v.mo89990e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f75040a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f75034v.mo90000o((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f75040a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        public /* synthetic */ C31212f(ChipGroup chipGroup, C31207a aVar) {
            this();
        }
    }

    public ChipGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public boolean mo88917c() {
        return super.mo88917c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C31209c);
    }

    /* renamed from: g */
    public void mo88919g(@C0329d0 int i) {
        this.f75034v.mo89991f(i);
    }

    @C0359n0
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C31209c(-2, -2);
    }

    @C0359n0
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C31209c(getContext(), attributeSet);
    }

    @C0329d0
    public int getCheckedChipId() {
        return this.f75034v.mo89996k();
    }

    @C0359n0
    public List<Integer> getCheckedChipIds() {
        return this.f75034v.mo89995j(this);
    }

    @C0366r
    public int getChipSpacingHorizontal() {
        return this.f75031e;
    }

    @C0366r
    public int getChipSpacingVertical() {
        return this.f75032f;
    }

    /* renamed from: h */
    public void mo88927h() {
        this.f75034v.mo89993h();
    }

    /* renamed from: i */
    public int mo88928i(@C0363p0 View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                if (((Chip) getChildAt(i2)) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public boolean mo88929j() {
        return this.f75034v.mo89997l();
    }

    /* renamed from: k */
    public boolean mo88930k() {
        return this.f75034v.mo89998m();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f75035w;
        if (i != -1) {
            this.f75034v.mo89991f(i);
        }
    }

    public void onInitializeAccessibilityNodeInfo(@C0359n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C18065l0 c2 = C18065l0.m81936c2(accessibilityNodeInfo);
        if (mo88917c()) {
            i = getChipCount();
        } else {
            i = -1;
        }
        int rowCount = getRowCount();
        if (mo88930k()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        c2.mo52600b1(C18065l0.C18068c.m82100f(rowCount, i, false, i2));
    }

    public void setChipSpacing(@C0366r int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(@C0366r int i) {
        if (this.f75031e != i) {
            this.f75031e = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@C0364q int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(@C0364q int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(@C0366r int i) {
        if (this.f75032f != i) {
            this.f75032f = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@C0364q int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@C0363p0 Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@C0363p0 C31210d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener((C31211e) null);
        } else {
            setOnCheckedStateChangeListener(new C31208b(dVar));
        }
    }

    public void setOnCheckedStateChangeListener(@C0363p0 C31211e eVar) {
        this.f75033g = eVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ViewGroup.OnHierarchyChangeListener unused = this.f75036x.f75040a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f75034v.mo90002q(z);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        this.f75034v.mo90003r(z);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.chipGroupStyle);
    }

    @C0359n0
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C31209c(layoutParams);
    }

    public void setSingleLine(@C0342h int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(@C0342h int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = f75030y
            android.content.Context r9 = com.google.android.material.theme.overlay.C31683a.m128455c(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            com.google.android.material.internal.a r9 = new com.google.android.material.internal.a
            r9.<init>()
            r8.f75034v = r9
            com.google.android.material.chip.ChipGroup$f r6 = new com.google.android.material.chip.ChipGroup$f
            r0 = 0
            r6.<init>(r8, r0)
            r8.f75036x = r6
            android.content.Context r0 = r8.getContext()
            int[] r2 = com.google.android.material.C31076a.C31091o.ChipGroup
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r10
            r3 = r11
            android.content.res.TypedArray r10 = com.google.android.material.internal.C31422p.m126970j(r0, r1, r2, r3, r4, r5)
            int r11 = com.google.android.material.C31076a.C31091o.ChipGroup_chipSpacing
            int r11 = r10.getDimensionPixelOffset(r11, r7)
            int r0 = com.google.android.material.C31076a.C31091o.ChipGroup_chipSpacingHorizontal
            int r0 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingHorizontal(r0)
            int r0 = com.google.android.material.C31076a.C31091o.ChipGroup_chipSpacingVertical
            int r11 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingVertical(r11)
            int r11 = com.google.android.material.C31076a.C31091o.ChipGroup_singleLine
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleLine((boolean) r11)
            int r11 = com.google.android.material.C31076a.C31091o.ChipGroup_singleSelection
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleSelection((boolean) r11)
            int r11 = com.google.android.material.C31076a.C31091o.ChipGroup_selectionRequired
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSelectionRequired(r11)
            int r11 = com.google.android.material.C31076a.C31091o.ChipGroup_checkedChip
            r0 = -1
            int r11 = r10.getResourceId(r11, r0)
            r8.f75035w = r11
            r10.recycle()
            com.google.android.material.chip.ChipGroup$a r10 = new com.google.android.material.chip.ChipGroup$a
            r10.<init>()
            r9.mo90001p(r10)
            super.setOnHierarchyChangeListener(r6)
            r9 = 1
            androidx.core.view.C18196h2.m82531R1(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
