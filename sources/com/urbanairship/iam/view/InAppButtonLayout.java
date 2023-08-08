package com.urbanairship.iam.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.urbanairship.automation.C8978x;
import com.urbanairship.iam.C9139b;
import com.urbanairship.iam.C9166d;
import java.util.List;

public class InAppButtonLayout extends BoundedLinearLayout {

    /* renamed from: c */
    public int f25180c;

    /* renamed from: d */
    public int f25181d;

    /* renamed from: e */
    public int f25182e;

    /* renamed from: f */
    public ButtonClickListener f25183f;

    public interface ButtonClickListener {
        /* renamed from: G */
        void mo18300G(@C0359n0 View view, @C0359n0 C9139b bVar);
    }

    /* renamed from: com.urbanairship.iam.view.InAppButtonLayout$a */
    public class C9243a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C9139b f25184a;

        public C9243a(C9139b bVar) {
            this.f25184a = bVar;
        }

        public void onClick(@C0359n0 View view) {
            if (InAppButtonLayout.this.f25183f != null) {
                InAppButtonLayout.this.f25183f.mo18300G(view, this.f25184a);
            }
        }
    }

    public InAppButtonLayout(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public final void mo18586b(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C8978x.C8994p.UrbanAirshipInAppButtonLayout, i, i2);
            this.f25180c = obtainStyledAttributes.getDimensionPixelSize(C8978x.C8994p.UrbanAirshipInAppButtonLayout_urbanAirshipStackedSpaceHeight, 0);
            this.f25181d = obtainStyledAttributes.getDimensionPixelSize(C8978x.C8994p.UrbanAirshipInAppButtonLayout_urbanAirshipSeparatedSpaceWidth, 0);
            this.f25182e = obtainStyledAttributes.getResourceId(C8978x.C8994p.UrbanAirshipInAppButtonLayout_urbanAirshipButtonLayoutResourceId, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public void setButtonClickListener(@C0363p0 ButtonClickListener buttonClickListener) {
        this.f25183f = buttonClickListener;
    }

    public void setButtons(@C0359n0 String str, @C0359n0 List<C9139b> list) {
        boolean z;
        boolean z2;
        int i;
        if (list.size() > 1) {
            z2 = C9166d.f24865f0.equals(str);
            z = C9166d.f24864e0.equals(str);
        } else {
            z = false;
            z2 = false;
        }
        removeAllViews();
        setOrientation(z2 ? 1 : 0);
        setMeasureWithLargestChildEnabled(true);
        for (int i2 = 0; i2 < list.size(); i2++) {
            C9139b bVar = list.get(i2);
            if (!z) {
                i = 15;
            } else if (i2 == 0) {
                i = 9;
            } else if (i2 == list.size() - 1) {
                i = 6;
            } else {
                i = 0;
            }
            Button button = (Button) LayoutInflater.from(getContext()).inflate(this.f25182e, this, false);
            C9254e.m34747a(button, bVar, i);
            if (z2) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
                layoutParams.weight = 1.0f;
                button.setLayoutParams(layoutParams);
                if (i2 > 0) {
                    layoutParams.setMargins(0, this.f25180c, 0, 0);
                }
            } else {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
                layoutParams2.weight = 1.0f;
                button.setLayoutParams(layoutParams2);
                if (!z && i2 > 0) {
                    layoutParams2.setMargins(this.f25181d, 0, 0, 0);
                    layoutParams2.setMarginStart(this.f25181d);
                }
            }
            addView(button);
            button.setOnClickListener(new C9243a(bVar));
        }
        requestLayout();
    }

    public InAppButtonLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InAppButtonLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo18586b(context, attributeSet, i, 0);
    }

    @C0376v0(21)
    public InAppButtonLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo18586b(context, attributeSet, i, i2);
    }
}
