package com.urbanairship.android.layout.widget;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.android.layout.property.Image;
import com.urbanairship.android.layout.shape.C35870a;
import java.util.List;

public class ShapeView extends ImageView implements Checkable, C36008d {

    /* renamed from: c */
    public static final int[] f88976c = {16842912};

    /* renamed from: a */
    public final C36009e f88977a;

    /* renamed from: b */
    public boolean f88978b;

    public ShapeView(Context context, List<C35870a> list, List<C35870a> list2) {
        this(context, list, list2, (Image.Icon) null, (Image.Icon) null);
    }

    public boolean isChecked() {
        return this.f88978b;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f88976c);
        }
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        if (z != this.f88978b) {
            this.f88978b = z;
            refreshDrawableState();
        }
    }

    public void setClipPathBorderRadius(float f) {
        this.f88977a.mo107705a(this, f);
    }

    public void toggle() {
        setChecked(!this.f88978b);
    }

    public ShapeView(Context context, @C0359n0 List<C35870a> list, @C0359n0 List<C35870a> list2, @C0363p0 Image.Icon icon, @C0363p0 Image.Icon icon2) {
        super(context);
        this.f88977a = new C36009e();
        this.f88978b = false;
        setId(View.generateViewId());
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setImageDrawable(C35870a.m147949a(context, list, list2, icon, icon2));
    }
}
