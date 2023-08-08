package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.annotation.C0331e;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.C0765q0;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31395g;
import com.google.android.material.internal.C31422p;
import com.google.android.material.theme.overlay.C31683a;

public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: w */
    public static final int f76839w = 15;
    @C0359n0

    /* renamed from: e */
    public final C0765q0 f76840e;
    @C0363p0

    /* renamed from: f */
    public final AccessibilityManager f76841f;
    @C0359n0

    /* renamed from: g */
    public final Rect f76842g;
    @C0347i0

    /* renamed from: v */
    public final int f76843v;

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$a */
    public class C31629a implements AdapterView.OnItemClickListener {
        public C31629a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Object obj;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            if (i < 0) {
                obj = materialAutoCompleteTextView.f76840e.mo3568C();
            } else {
                obj = materialAutoCompleteTextView.getAdapter().getItem(i);
            }
            MaterialAutoCompleteTextView.this.mo91453g(obj);
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = MaterialAutoCompleteTextView.this.f76840e.mo3571F();
                    i = MaterialAutoCompleteTextView.this.f76840e.mo3570E();
                    j = MaterialAutoCompleteTextView.this.f76840e.mo3569D();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f76840e.mo1975q(), view, i, j);
            }
            MaterialAutoCompleteTextView.this.f76840e.dismiss();
        }
    }

    public MaterialAutoCompleteTextView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    @C0363p0
    /* renamed from: e */
    public final TextInputLayout mo91451e() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final int mo91452f() {
        ListAdapter adapter = getAdapter();
        TextInputLayout e = mo91451e();
        int i = 0;
        if (adapter == null || e == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f76840e.mo3570E()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, e);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable h = this.f76840e.mo3601h();
        if (h != null) {
            h.getPadding(this.f76842g);
            Rect rect = this.f76842g;
            i2 += rect.left + rect.right;
        }
        return i2 + e.getEndIconView().getMeasuredWidth();
    }

    /* renamed from: g */
    public final <T extends ListAdapter & Filterable> void mo91453g(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @C0363p0
    public CharSequence getHint() {
        TextInputLayout e = mo91451e();
        if (e == null || !e.mo91516Z()) {
            return super.getHint();
        }
        return e.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout e = mo91451e();
        if (e != null && e.mo91516Z() && super.getHint() == null && C31395g.m126865c()) {
            setHint("");
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo91452f()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(@C0363p0 T t) {
        super.setAdapter(t);
        this.f76840e.mo2728o(getAdapter());
    }

    public void setSimpleItems(@C0331e int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f76841f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f76840e.mo1966a();
        }
    }

    public MaterialAutoCompleteTextView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.autoCompleteTextViewStyle);
    }

    public void setSimpleItems(@C0359n0 String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f76843v, strArr));
    }

    public MaterialAutoCompleteTextView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(C31683a.m128455c(context, attributeSet, i, 0), attributeSet, i);
        this.f76842g = new Rect();
        Context context2 = getContext();
        TypedArray j = C31422p.m126970j(context2, attributeSet, C31076a.C31091o.MaterialAutoCompleteTextView, i, C31076a.C31090n.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i2 = C31076a.C31091o.MaterialAutoCompleteTextView_android_inputType;
        if (j.hasValue(i2) && j.getInt(i2, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f76843v = j.getResourceId(C31076a.C31091o.MaterialAutoCompleteTextView_simpleItemLayout, C31076a.C31087k.mtrl_auto_complete_simple_item);
        this.f76841f = (AccessibilityManager) context2.getSystemService("accessibility");
        C0765q0 q0Var = new C0765q0(context2);
        this.f76840e = q0Var;
        q0Var.mo3596d0(true);
        q0Var.mo3583S(this);
        q0Var.mo3591a0(2);
        q0Var.mo2728o(getAdapter());
        q0Var.mo3599f0(new C31629a());
        int i3 = C31076a.C31091o.MaterialAutoCompleteTextView_simpleItems;
        if (j.hasValue(i3)) {
            setSimpleItems(j.getResourceId(i3, 0));
        }
        j.recycle();
    }
}
