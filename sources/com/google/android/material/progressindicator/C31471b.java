package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import com.google.android.material.C31076a;
import com.google.android.material.color.C31266s;
import com.google.android.material.internal.C31422p;
import com.google.android.material.resources.C31500c;

/* renamed from: com.google.android.material.progressindicator.b */
public abstract class C31471b {
    @C0372t0

    /* renamed from: a */
    public int f76155a;
    @C0372t0

    /* renamed from: b */
    public int f76156b;
    @C0359n0

    /* renamed from: c */
    public int[] f76157c = new int[0];
    @C0354l

    /* renamed from: d */
    public int f76158d;

    /* renamed from: e */
    public int f76159e;

    /* renamed from: f */
    public int f76160f;

    public C31471b(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C31076a.C31082f.mtrl_progress_track_thickness);
        TypedArray j = C31422p.m126970j(context, attributeSet, C31076a.C31091o.BaseProgressIndicator, i, i2, new int[0]);
        this.f76155a = C31500c.m127366d(context, j, C31076a.C31091o.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.f76156b = Math.min(C31500c.m127366d(context, j, C31076a.C31091o.BaseProgressIndicator_trackCornerRadius, 0), this.f76155a / 2);
        this.f76159e = j.getInt(C31076a.C31091o.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f76160f = j.getInt(C31076a.C31091o.BaseProgressIndicator_hideAnimationBehavior, 0);
        mo90526c(context, j);
        mo90527d(context, j);
        j.recycle();
    }

    /* renamed from: a */
    public boolean mo90524a() {
        return this.f76160f != 0;
    }

    /* renamed from: b */
    public boolean mo90525b() {
        return this.f76159e != 0;
    }

    /* renamed from: c */
    public final void mo90526c(@C0359n0 Context context, @C0359n0 TypedArray typedArray) {
        int i = C31076a.C31091o.BaseProgressIndicator_indicatorColor;
        if (!typedArray.hasValue(i)) {
            this.f76157c = new int[]{C31266s.m125951b(context, C31076a.C31079c.colorPrimary, -1)};
        } else if (typedArray.peekValue(i).type != 1) {
            this.f76157c = new int[]{typedArray.getColor(i, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i, -1));
            this.f76157c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
    }

    /* renamed from: d */
    public final void mo90527d(@C0359n0 Context context, @C0359n0 TypedArray typedArray) {
        int i = C31076a.C31091o.BaseProgressIndicator_trackColor;
        if (typedArray.hasValue(i)) {
            this.f76158d = typedArray.getColor(i, -1);
            return;
        }
        this.f76158d = this.f76157c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f76158d = C31266s.m125950a(this.f76158d, (int) (f * 255.0f));
    }

    /* renamed from: e */
    public abstract void mo90528e();
}
