package com.carrefour.fid.android.design.components.extension;

import android.graphics.drawable.Drawable;
import android.widget.Button;
import androidx.annotation.C0354l;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.C17584h;
import com.google.android.material.button.MaterialButton;
import kotlin.C11395k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ButtonKt {
    /* renamed from: a */
    public static final void m152099a(@C12579k AppCompatButton appCompatButton) {
        Intrinsics.checkNotNullParameter(appCompatButton, "<this>");
        appCompatButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    /* renamed from: b */
    public static final void m152100b(@C12579k Button button, @C12580l Drawable drawable, @C12580l @C0354l Integer num) {
        Intrinsics.checkNotNullParameter(button, "<this>");
        button.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        if (num != null) {
            int intValue = num.intValue();
            Drawable drawable2 = button.getCompoundDrawables()[0];
            if (drawable2 != null) {
                drawable2.setColorFilter(C17584h.m80560a(intValue, BlendModeCompat.SRC_ATOP));
            }
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m152101c(Button button, Drawable drawable, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        m152100b(button, drawable, num);
    }

    @C11395k(message = "Use LoaderMaterialButton instead of this extension function")
    /* renamed from: d */
    public static final void m152102d(@C12579k MaterialButton materialButton, boolean z, @C12580l Drawable drawable, @C12580l String str, @C12580l Integer num, @C12580l Integer num2) {
        Intrinsics.checkNotNullParameter(materialButton, "<this>");
        ViewKt.m152133o(materialButton, new ButtonKt$setLoading$1(materialButton, z, num, num2, str, drawable));
    }

    /* renamed from: e */
    public static /* synthetic */ void m152103e(MaterialButton materialButton, boolean z, Drawable drawable, String str, Integer num, Integer num2, int i, Object obj) {
        m152102d(materialButton, z, (i & 2) != 0 ? null : drawable, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }

    /* renamed from: f */
    public static final void m152104f(@C12579k Button button, @C12580l Drawable drawable, @C12580l @C0354l Integer num) {
        Intrinsics.checkNotNullParameter(button, "<this>");
        button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        if (num != null) {
            int intValue = num.intValue();
            Drawable drawable2 = button.getCompoundDrawables()[2];
            if (drawable2 != null) {
                drawable2.setColorFilter(C17584h.m80560a(intValue, BlendModeCompat.SRC_ATOP));
            }
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m152105g(Button button, Drawable drawable, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        m152104f(button, drawable, num);
    }
}
