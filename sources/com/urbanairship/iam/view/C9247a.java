package com.urbanairship.iam.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.TypedValue;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0366r;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.iam.view.a */
public class C9247a {

    /* renamed from: a */
    public int f25198a = 0;

    /* renamed from: b */
    public Integer f25199b;

    /* renamed from: c */
    public Integer f25200c;

    /* renamed from: d */
    public int f25201d = 0;

    /* renamed from: e */
    public float f25202e = 0.0f;

    /* renamed from: f */
    public int f25203f;

    /* renamed from: g */
    public final Context f25204g;

    public C9247a(@C0359n0 Context context) {
        this.f25204g = context;
    }

    @C0359n0
    /* renamed from: b */
    public static C9247a m34735b(@C0359n0 Context context) {
        return new C9247a(context);
    }

    @C0359n0
    /* renamed from: a */
    public Drawable mo18599a() {
        int i;
        int round = Math.round(TypedValue.applyDimension(1, (float) this.f25201d, this.f25204g.getResources().getDisplayMetrics()));
        Integer num = this.f25199b;
        if (num == null) {
            i = this.f25198a;
        } else {
            i = num.intValue();
        }
        float[] b = C9248b.m34743b(TypedValue.applyDimension(1, this.f25202e, this.f25204g.getResources().getDisplayMetrics()), this.f25203f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(b);
        gradientDrawable.setColor(this.f25198a);
        gradientDrawable.setStroke(round, i);
        Integer num2 = this.f25200c;
        if (num2 == null) {
            return gradientDrawable;
        }
        return new RippleDrawable(ColorStateList.valueOf(num2.intValue()), gradientDrawable, new ShapeDrawable(new RoundRectShape(b, (RectF) null, (float[]) null)));
    }

    @C0359n0
    /* renamed from: c */
    public C9247a mo18600c(@C0354l int i) {
        this.f25198a = i;
        return this;
    }

    @C0359n0
    /* renamed from: d */
    public C9247a mo18601d(float f, int i) {
        this.f25203f = i;
        this.f25202e = f;
        return this;
    }

    @C0359n0
    /* renamed from: e */
    public C9247a mo18602e(@C0354l int i) {
        this.f25200c = Integer.valueOf(i);
        return this;
    }

    @C0359n0
    /* renamed from: f */
    public C9247a mo18603f(@C0354l int i) {
        this.f25199b = Integer.valueOf(i);
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public C9247a mo18604g(@C0366r int i) {
        this.f25201d = i;
        return this;
    }
}
