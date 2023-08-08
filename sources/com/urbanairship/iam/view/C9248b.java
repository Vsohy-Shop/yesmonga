package com.urbanairship.iam.view;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.iam.view.b */
public abstract class C9248b {

    /* renamed from: a */
    public static final int f25205a = 1;

    /* renamed from: b */
    public static final int f25206b = 2;

    /* renamed from: c */
    public static final int f25207c = 4;

    /* renamed from: d */
    public static final int f25208d = 8;

    /* renamed from: e */
    public static final int f25209e = 15;

    /* renamed from: f */
    public static final int f25210f = 9;

    /* renamed from: g */
    public static final int f25211g = 6;

    /* renamed from: h */
    public static final int f25212h = 3;

    /* renamed from: i */
    public static final int f25213i = 12;

    /* renamed from: com.urbanairship.iam.view.b$a */
    public class C9249a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f25214a;

        /* renamed from: b */
        public final /* synthetic */ float f25215b;

        /* renamed from: c */
        public final /* synthetic */ int f25216c;

        public C9249a(WeakReference weakReference, float f, int i) {
            this.f25214a = weakReference;
            this.f25215b = f;
            this.f25216c = i;
        }

        public boolean onPreDraw() {
            View view = (View) this.f25214a.get();
            if (view == null) {
                return false;
            }
            C9248b.m34742a(view, this.f25215b, this.f25216c);
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            return false;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.iam.view.b$b */
    public @interface C9250b {
    }

    /* renamed from: a */
    public static void m34742a(@C0359n0 View view, float f, int i) {
        int i2;
        int i3;
        int i4;
        if (view.getWidth() == 0) {
            view.getViewTreeObserver().addOnPreDrawListener(new C9249a(new WeakReference(view), f, i));
        }
        float min = Math.min(TypedValue.applyDimension(1, f, view.getResources().getDisplayMetrics()), (float) Math.min(view.getHeight() / 2, view.getWidth() / 2));
        int round = Math.round(min - (((float) Math.sin(Math.toRadians(45.0d))) * min));
        int round2 = Math.round(min - (((float) Math.sin(Math.toRadians(45.0d))) * min));
        int i5 = 0;
        if ((i & 1) == 1) {
            i2 = round2;
            i3 = round;
        } else {
            i3 = 0;
            i2 = 0;
        }
        if ((i & 2) == 2) {
            i2 = round2;
            i4 = round;
        } else {
            i4 = 0;
        }
        if ((i & 4) == 4) {
            i5 = round2;
            i4 = round;
        }
        if ((i & 8) != 8) {
            round = i3;
            round2 = i5;
        }
        view.setPadding(view.getPaddingLeft() + round, view.getPaddingTop() + i2, view.getPaddingRight() + i4, view.getPaddingBottom() + round2);
    }

    @C0359n0
    /* renamed from: b */
    public static float[] m34743b(float f, int i) {
        float[] fArr = new float[8];
        if ((i & 1) == 1) {
            fArr[0] = f;
            fArr[1] = f;
        }
        if ((i & 2) == 2) {
            fArr[2] = f;
            fArr[3] = f;
        }
        if ((i & 4) == 4) {
            fArr[4] = f;
            fArr[5] = f;
        }
        if ((i & 8) == 8) {
            fArr[6] = f;
            fArr[7] = f;
        }
        return fArr;
    }
}
