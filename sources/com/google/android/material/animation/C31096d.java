package com.google.android.material.animation;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import com.google.android.material.C31076a;

/* renamed from: com.google.android.material.animation.d */
public class C31096d extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f74431a = new C31096d("childrenAlpha");

    public C31096d(String str) {
        super(Float.class, str);
    }

    @C0359n0
    /* renamed from: a */
    public Float get(@C0359n0 ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(C31076a.C31084h.mtrl_internal_children_alpha_tag);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    /* renamed from: b */
    public void set(@C0359n0 ViewGroup viewGroup, @C0359n0 Float f) {
        float floatValue = f.floatValue();
        viewGroup.setTag(C31076a.C31084h.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
