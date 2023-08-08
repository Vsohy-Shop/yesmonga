package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0329d0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.google.android.material.internal.q */
public class C31423q {

    /* renamed from: a */
    public static final Comparator<View> f75964a = new C31424a();

    /* renamed from: com.google.android.material.internal.q$a */
    public class C31424a implements Comparator<View> {
        /* renamed from: a */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    @C0363p0
    /* renamed from: a */
    public static ActionMenuItemView m126972a(@C0359n0 Toolbar toolbar, @C0329d0 int i) {
        ActionMenuView b = m126973b(toolbar);
        if (b == null) {
            return null;
        }
        for (int i2 = 0; i2 < b.getChildCount(); i2++) {
            View childAt = b.getChildAt(i2);
            if (childAt instanceof ActionMenuItemView) {
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) childAt;
                if (actionMenuItemView.getItemData().getItemId() == i) {
                    return actionMenuItemView;
                }
            }
        }
        return null;
    }

    @C0363p0
    /* renamed from: b */
    public static ActionMenuView m126973b(@C0359n0 Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r2 = (android.widget.ImageView) r2;
     */
    @androidx.annotation.C0363p0
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.widget.ImageView m126974c(@androidx.annotation.C0359n0 androidx.appcompat.widget.Toolbar r5, @androidx.annotation.C0363p0 android.graphics.drawable.Drawable r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
        L_0x0005:
            int r2 = r5.getChildCount()
            if (r1 >= r2) goto L_0x0033
            android.view.View r2 = r5.getChildAt(r1)
            boolean r3 = r2 instanceof android.widget.ImageView
            if (r3 == 0) goto L_0x0030
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.graphics.drawable.Drawable r3 = r2.getDrawable()
            if (r3 == 0) goto L_0x0030
            android.graphics.drawable.Drawable$ConstantState r4 = r3.getConstantState()
            if (r4 == 0) goto L_0x0030
            android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
            android.graphics.drawable.Drawable$ConstantState r4 = r6.getConstantState()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0030
            return r2
        L_0x0030:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C31423q.m126974c(androidx.appcompat.widget.Toolbar, android.graphics.drawable.Drawable):android.widget.ImageView");
    }

    @C0363p0
    /* renamed from: d */
    public static ImageView m126975d(@C0359n0 Toolbar toolbar) {
        return m126974c(toolbar, toolbar.getLogo());
    }

    @C0363p0
    /* renamed from: e */
    public static ImageButton m126976e(@C0359n0 Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    @C0363p0
    /* renamed from: f */
    public static View m126977f(@C0359n0 Toolbar toolbar) {
        ActionMenuView b = m126973b(toolbar);
        if (b == null || b.getChildCount() <= 1) {
            return null;
        }
        return b.getChildAt(0);
    }

    @C0363p0
    /* renamed from: g */
    public static TextView m126978g(@C0359n0 Toolbar toolbar) {
        List<TextView> h = m126979h(toolbar, toolbar.getSubtitle());
        if (h.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(h, f75964a);
    }

    /* renamed from: h */
    public static List<TextView> m126979h(@C0359n0 Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    @C0363p0
    /* renamed from: i */
    public static TextView m126980i(@C0359n0 Toolbar toolbar) {
        List<TextView> h = m126979h(toolbar, toolbar.getTitle());
        if (h.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(h, f75964a);
    }
}
