package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0722h1;
import com.google.android.material.C31076a;

public class TabItem extends View {

    /* renamed from: a */
    public final CharSequence f76708a;

    /* renamed from: b */
    public final Drawable f76709b;

    /* renamed from: c */
    public final int f76710c;

    public TabItem(Context context) {
        this(context, (AttributeSet) null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0722h1 F = C0722h1.m3538F(context, attributeSet, C31076a.C31091o.TabItem);
        this.f76708a = F.mo3482x(C31076a.C31091o.TabItem_android_text);
        this.f76709b = F.mo3466h(C31076a.C31091o.TabItem_android_icon);
        this.f76710c = F.mo3479u(C31076a.C31091o.TabItem_android_layout, 0);
        F.mo3458I();
    }
}
