package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import com.google.android.material.color.C31266s;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements C31598a {

    /* renamed from: a */
    public TextView f76686a;

    /* renamed from: b */
    public Button f76687b;

    /* renamed from: c */
    public int f76688c;

    public SnackbarContentLayout(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public static void m127993b(@C0359n0 View view, int i, int i2) {
        if (C18196h2.m82551Y0(view)) {
            C18196h2.m82571d2(view, C18196h2.m82597k0(view), i, C18196h2.m82593j0(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: a */
    public void mo91238a(float f) {
        if (f != 1.0f) {
            this.f76687b.setTextColor(C31266s.m125962m(C31266s.m125953d(this, C31076a.C31079c.colorSurface), this.f76687b.getCurrentTextColor(), f));
        }
    }

    /* renamed from: c */
    public final boolean mo91239c(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f76686a.getPaddingTop() == i2 && this.f76686a.getPaddingBottom() == i3) {
            return z;
        }
        m127993b(this.f76686a, i2, i3);
        return true;
    }

    /* renamed from: d */
    public void mo91240d(int i, int i2) {
        this.f76686a.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f76686a.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f76687b.getVisibility() == 0) {
            this.f76687b.setAlpha(0.0f);
            this.f76687b.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* renamed from: f */
    public void mo91241f(int i, int i2) {
        this.f76686a.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f76686a.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f76687b.getVisibility() == 0) {
            this.f76687b.setAlpha(1.0f);
            this.f76687b.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public Button getActionView() {
        return this.f76687b;
    }

    public TextView getMessageView() {
        return this.f76686a;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f76686a = (TextView) findViewById(C31076a.C31084h.snackbar_text);
        this.f76687b = (Button) findViewById(C31076a.C31084h.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (mo91239c(1, r0, r0 - r2) != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (mo91239c(0, r0, r0) != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto L_0x000b
            return
        L_0x000b:
            android.content.res.Resources r0 = r7.getResources()
            int r2 = com.google.android.material.C31076a.C31082f.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = com.google.android.material.C31076a.C31082f.design_snackbar_padding_vertical
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f76686a
            android.text.Layout r3 = r3.getLayout()
            int r3 = r3.getLineCount()
            r4 = 0
            if (r3 <= r1) goto L_0x002e
            r3 = r1
            goto L_0x002f
        L_0x002e:
            r3 = r4
        L_0x002f:
            if (r3 == 0) goto L_0x0048
            int r5 = r7.f76688c
            if (r5 <= 0) goto L_0x0048
            android.widget.Button r5 = r7.f76687b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f76688c
            if (r5 <= r6) goto L_0x0048
            int r2 = r0 - r2
            boolean r0 = r7.mo91239c(r1, r0, r2)
            if (r0 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0048:
            if (r3 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = r2
        L_0x004c:
            boolean r0 = r7.mo91239c(r4, r0, r0)
            if (r0 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r1 = r4
        L_0x0054:
            if (r1 == 0) goto L_0x0059
            super.onMeasure(r8, r9)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f76688c = i;
    }

    public SnackbarContentLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
