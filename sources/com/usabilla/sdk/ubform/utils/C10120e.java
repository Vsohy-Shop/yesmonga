package com.usabilla.sdk.ubform.utils;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.C16934c;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.utils.e */
public final class C10120e implements ViewTreeObserver.OnPreDrawListener {
    @C12579k

    /* renamed from: a */
    public final LinearLayout f27832a;

    /* renamed from: b */
    public final int f27833b;

    public C10120e(@C12579k LinearLayout linearLayout, int i) {
        Intrinsics.checkNotNullParameter(linearLayout, C16934c.f44493V1);
        this.f27832a = linearLayout;
        this.f27833b = i;
    }

    /* renamed from: a */
    public final void mo21565a(LinearLayout linearLayout, int i) {
        boolean z;
        C11466l W1 = C11479u.m44378W1(0, (linearLayout.getChildCount() * 2) - 1);
        ArrayList<Number> arrayList = new ArrayList<>();
        for (Object next : W1) {
            if (((Number) next).intValue() % 2 == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        for (Number intValue : arrayList) {
            int intValue2 = intValue.intValue();
            Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "container.context");
            linearLayout.addView(mo21566b(context, i), intValue2);
        }
    }

    /* renamed from: b */
    public final Space mo21566b(Context context, int i) {
        Space space = new Space(context);
        space.setLayoutParams(new LinearLayout.LayoutParams(i, 1));
        return space;
    }

    public boolean onPreDraw() {
        this.f27832a.getViewTreeObserver().removeOnPreDrawListener(this);
        mo21565a(this.f27832a, Math.min((this.f27832a.getWidth() - (this.f27832a.getChildAt(0).getWidth() * this.f27832a.getChildCount())) / (this.f27832a.getChildCount() + 1), this.f27833b));
        return true;
    }
}
