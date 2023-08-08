package com.carrefour.fid.android.design.components.extension;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.annotation.C0354l;
import androidx.annotation.C0375v;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.C17584h;
import com.carrefour.fid.android.design.components.type.C37130b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.design.components.extension.g */
public final class C37116g {
    /* renamed from: a */
    public static final void m152163a(@C12579k TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    /* renamed from: b */
    public static final void m152164b(@C12579k TextView textView, @C0375v int i, @C12580l @C0354l Integer num) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        if (num != null) {
            int intValue = num.intValue();
            Drawable drawable = textView.getCompoundDrawables()[0];
            if (drawable != null) {
                drawable.setColorFilter(C17584h.m80560a(intValue, BlendModeCompat.SRC_ATOP));
            }
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m152165c(TextView textView, int i, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        m152164b(textView, i, num);
    }

    /* renamed from: d */
    public static final void m152166d(@C12579k TextView textView, @C0375v int i, @C12580l @C0354l Integer num) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
        if (num != null) {
            int intValue = num.intValue();
            Drawable drawable = textView.getCompoundDrawables()[2];
            if (drawable != null) {
                drawable.setColorFilter(C17584h.m80560a(intValue, BlendModeCompat.SRC_ATOP));
            }
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m152167e(TextView textView, int i, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        m152166d(textView, i, num);
    }

    /* renamed from: f */
    public static final void m152168f(@C12579k TextView textView, @C12579k C37130b bVar) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "textProp");
        if (bVar instanceof C37130b.C37131a) {
            textView.setText(((C37130b.C37131a) bVar).mo112749a());
        } else if (bVar instanceof C37130b.C37132b) {
            textView.setText(((C37130b.C37132b) bVar).mo112750a());
        }
    }
}
