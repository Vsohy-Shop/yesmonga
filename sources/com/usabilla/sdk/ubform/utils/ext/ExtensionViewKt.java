package com.usabilla.sdk.ubform.utils.ext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.IBinder;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.C17318d;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.Logger;
import com.usabilla.sdk.ubform.utils.C10142i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C11079d2;
import kotlin.collections.C10953k0;
import kotlin.collections.C10978t;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

public final class ExtensionViewKt {
    /* renamed from: a */
    public static final void m38317a(@C12579k ViewGroup viewGroup, @C12579k View view) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        C11466l W1 = C11479u.m44378W1(0, viewGroup.getChildCount());
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(W1, 10));
        Iterator it = W1.iterator();
        while (it.hasNext()) {
            arrayList.add(viewGroup.getChildAt(((C10953k0) it).mo6374c()));
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        for (Object next : arrayList) {
            if (!Intrinsics.areEqual((Object) view, (Object) (View) next)) {
                arrayList2.add(next);
            }
        }
        for (View selected : arrayList2) {
            selected.setSelected(false);
        }
    }

    /* renamed from: b */
    public static final void m38318b(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        IBinder windowToken = view.getWindowToken();
        if (windowToken != null) {
            Object systemService = view.getContext().getSystemService("input_method");
            if (systemService != null) {
                ((InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 0);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    @SuppressLint({"DiscouragedPrivateApi"})
    /* renamed from: c */
    public static final void m38319c(@C12579k EditText editText, @C12579k Context context, int i) {
        Class<TextView> cls = TextView.class;
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize((int) TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()), 0);
        gradientDrawable.setColor(i);
        if (Build.VERSION.SDK_INT >= 29) {
            editText.setTextCursorDrawable(gradientDrawable);
            return;
        }
        try {
            Field declaredField = cls.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = cls.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Drawable i3 = C17318d.m79726i(editText.getContext(), i2);
            if (i3 != null) {
                i3.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            }
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, new Drawable[]{i3, i3});
        } catch (Exception unused) {
            Logger.f26647a.logInfo("Reflection error while tinting a text cursor");
        }
    }

    /* renamed from: d */
    public static final void m38320d(@C12579k View view, @C12579k C11300l<? super View, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onSafeClick");
        view.setOnClickListener(new C10142i(0, new ExtensionViewKt$setSingleClickListener$safeClickListener$1(lVar), 1, (DefaultConstructorMarker) null));
    }

    /* renamed from: e */
    public static final void m38321e(@C12579k View view, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }
}
