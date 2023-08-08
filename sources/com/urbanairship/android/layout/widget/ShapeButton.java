package com.urbanairship.android.layout.widget;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.C17318d;
import com.urbanairship.android.layout.C35625g;
import com.urbanairship.android.layout.property.C35850q;
import com.urbanairship.android.layout.property.Image;
import com.urbanairship.android.layout.shape.C35870a;
import com.urbanairship.android.layout.util.C35916j;
import java.util.List;

public class ShapeButton extends AppCompatButton implements Checkable, C36008d {

    /* renamed from: x */
    public static final int[] f88969x = {16842912};
    @C0363p0

    /* renamed from: d */
    public final C35850q f88970d;
    @C0363p0

    /* renamed from: e */
    public final C35850q f88971e;
    @C0363p0

    /* renamed from: f */
    public final String f88972f;

    /* renamed from: g */
    public final C36009e f88973g;

    /* renamed from: v */
    public boolean f88974v;
    @C0363p0

    /* renamed from: w */
    public C35998a f88975w;

    /* renamed from: com.urbanairship.android.layout.widget.ShapeButton$a */
    public interface C35998a {
        /* renamed from: a */
        void mo107663a(View view, boolean z);
    }

    public ShapeButton(@C0359n0 Context context, @C0359n0 List<C35870a> list, @C0359n0 List<C35870a> list2, @C0363p0 String str, @C0363p0 C35850q qVar, @C0363p0 C35850q qVar2) {
        this(context, list, list2, (Image.Icon) null, (Image.Icon) null, str, qVar, qVar2);
    }

    /* renamed from: a */
    public final void mo107657a() {
        C35850q qVar;
        if (this.f88972f != null && this.f88970d != null && this.f88971e != null) {
            if (isChecked()) {
                qVar = this.f88970d;
            } else {
                qVar = this.f88971e;
            }
            C35916j.m148090h(this, qVar);
        }
    }

    public boolean isChecked() {
        return this.f88974v;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f88969x);
        }
        return onCreateDrawableState;
    }

    public boolean performClick() {
        toggle();
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        return performClick;
    }

    public void setChecked(boolean z) {
        if (z != this.f88974v) {
            this.f88974v = z;
            refreshDrawableState();
            mo107657a();
            C35998a aVar = this.f88975w;
            if (aVar != null) {
                aVar.mo107663a(this, z);
            }
        }
    }

    @C0353k0
    public void setClipPathBorderRadius(@C0366r float f) {
        this.f88973g.mo107705a(this, f);
    }

    public void setOnCheckedChangeListener(@C0363p0 C35998a aVar) {
        this.f88975w = aVar;
    }

    public void toggle() {
        setChecked(!this.f88974v);
    }

    public ShapeButton(@C0359n0 Context context, @C0359n0 List<C35870a> list, @C0359n0 List<C35870a> list2, @C0363p0 Image.Icon icon, @C0363p0 Image.Icon icon2) {
        this(context, list, list2, icon, icon2, (String) null, (C35850q) null, (C35850q) null);
    }

    public ShapeButton(@C0359n0 Context context, @C0359n0 List<C35870a> list, @C0359n0 List<C35870a> list2, @C0363p0 Image.Icon icon, @C0363p0 Image.Icon icon2, @C0363p0 String str, @C0363p0 C35850q qVar, @C0363p0 C35850q qVar2) {
        super(context);
        this.f88974v = false;
        this.f88975w = null;
        this.f88970d = qVar;
        this.f88971e = qVar2;
        this.f88972f = str;
        this.f88973g = new C36009e();
        setBackground(C35870a.m147949a(context, list, list2, icon, icon2));
        setForeground(C17318d.m79726i(context, C35625g.C35632g.ua_layout_imagebutton_ripple));
        setText(str);
        mo107657a();
        setPadding(0, 0, 0, 0);
        setGravity(17);
    }
}
