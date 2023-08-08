package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.google.android.material.C31076a;
import com.google.android.material.dialog.C31328a;
import com.google.android.material.dialog.C31330c;
import com.google.android.material.resources.C31499b;
import com.google.android.material.shape.C31525j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.TESTS})
/* renamed from: com.google.android.material.datepicker.h */
public class C31312h extends DatePickerDialog {
    @C0336f

    /* renamed from: c */
    public static final int f75463c = 16843612;
    @C0327c1

    /* renamed from: d */
    public static final int f75464d = C31076a.C31090n.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner;
    @C0359n0

    /* renamed from: a */
    public final Drawable f75465a;
    @C0359n0

    /* renamed from: b */
    public final Rect f75466b;

    public C31312h(@C0359n0 Context context) {
        this(context, 0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.f75465a);
        getWindow().getDecorView().setOnTouchListener(new C31328a(this, this.f75466b));
    }

    public C31312h(@C0359n0 Context context, int i) {
        this(context, i, (DatePickerDialog.OnDateSetListener) null, -1, -1, -1);
    }

    public C31312h(@C0359n0 Context context, @C0363p0 DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        this(context, 0, onDateSetListener, i, i2, i3);
    }

    public C31312h(@C0359n0 Context context, int i, @C0363p0 DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4) {
        super(context, i, onDateSetListener, i2, i3, i4);
        Context context2 = getContext();
        int g = C31499b.m127361g(getContext(), C31076a.C31079c.colorSurface, getClass().getCanonicalName());
        int i5 = f75464d;
        C31525j jVar = new C31525j(context2, (AttributeSet) null, f75463c, i5);
        jVar.mo90777o0(ColorStateList.valueOf(g));
        Rect a = C31330c.m126366a(context2, f75463c, i5);
        this.f75466b = a;
        this.f75465a = C31330c.m126367b(jVar, a);
    }
}
