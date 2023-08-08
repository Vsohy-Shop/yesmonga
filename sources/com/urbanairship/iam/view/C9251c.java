package com.urbanairship.iam.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36080x;

/* renamed from: com.urbanairship.iam.view.c */
public class C9251c {

    /* renamed from: a */
    public int f25217a;

    /* renamed from: b */
    public int f25218b;

    public C9251c(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C36080x.C36096p.UrbanAirshipLayout, i, i2);
            this.f25217a = obtainStyledAttributes.getDimensionPixelSize(C36080x.C36096p.UrbanAirshipLayout_urbanAirshipMaxWidth, 0);
            this.f25218b = obtainStyledAttributes.getDimensionPixelSize(C36080x.C36096p.UrbanAirshipLayout_urbanAirshipMaxHeight, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public int mo18606a(int i) {
        int size = View.MeasureSpec.getSize(i);
        int i2 = this.f25218b;
        if (i2 <= 0 || i2 >= size) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(i2, View.MeasureSpec.getMode(i));
    }

    /* renamed from: b */
    public int mo18607b(int i) {
        int size = View.MeasureSpec.getSize(i);
        int i2 = this.f25217a;
        if (i2 <= 0 || i2 >= size) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(i2, View.MeasureSpec.getMode(i));
    }
}
