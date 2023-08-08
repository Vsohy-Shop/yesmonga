package com.carrefour.fid.android.app;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.Objects;

public class PinEntryEditText extends AppCompatEditText {

    /* renamed from: F0 */
    public static final String f33726F0 = "http://schemas.android.com/apk/res/android";

    /* renamed from: G0 */
    public static final String f33727G0 = "*";

    /* renamed from: E0 */
    public StringBuilder f33728E0 = null;

    /* renamed from: g */
    public float f33729g = 30.0f;

    /* renamed from: v */
    public float f33730v = 0.0f;

    /* renamed from: w */
    public float f33731w = 5.0f;

    /* renamed from: x */
    public float f33732x = 8.0f;

    /* renamed from: y */
    public int f33733y = 5;

    /* renamed from: z */
    public String f33734z = null;

    public PinEntryEditText(Context context) {
        super(context);
    }

    private CharSequence getFullText() {
        if (TextUtils.isEmpty(this.f33734z)) {
            return getText();
        }
        return getMaskChars();
    }

    private StringBuilder getMaskChars() {
        if (this.f33728E0 == null) {
            this.f33728E0 = new StringBuilder();
        }
        Editable text = getText();
        Objects.requireNonNull(text);
        int length = text.length();
        while (this.f33728E0.length() != length) {
            if (this.f33728E0.length() < length) {
                this.f33728E0.append(this.f33734z);
            } else {
                StringBuilder sb = this.f33728E0;
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return this.f33728E0;
    }

    /* renamed from: g */
    public final void mo32746g(Context context, AttributeSet attributeSet) {
        setBackgroundResource(0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f33729g *= f;
        this.f33732x = f * this.f33732x;
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLength", 4);
        this.f33733y = attributeIntValue;
        this.f33731w = (float) attributeIntValue;
        if ((getInputType() & 128) == 128 && TextUtils.isEmpty(this.f33734z)) {
            this.f33734z = "*";
        } else if ((getInputType() & 16) == 16 && TextUtils.isEmpty(this.f33734z)) {
            this.f33734z = "*";
        }
    }

    /* renamed from: h */
    public boolean mo32747h() {
        return !"*".equals(this.f33734z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r23) {
        /*
            r22 = this;
            r0 = r22
            java.lang.CharSequence r8 = r22.getFullText()
            int r1 = r8.length()
            float[] r9 = new float[r1]
            int r1 = r22.getWidth()
            int r2 = r22.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r22.getPaddingLeft()
            int r1 = r1 - r2
            float r2 = r0.f33729g
            r10 = 0
            int r3 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            r4 = 1065353216(0x3f800000, float:1.0)
            r11 = 1073741824(0x40000000, float:2.0)
            if (r3 >= 0) goto L_0x002e
            float r1 = (float) r1
            float r2 = r0.f33731w
            float r2 = r2 * r11
            float r2 = r2 - r4
            float r1 = r1 / r2
            r0.f33730v = r1
            goto L_0x0038
        L_0x002e:
            float r1 = (float) r1
            float r3 = r0.f33731w
            float r4 = r3 - r4
            float r2 = r2 * r4
            float r1 = r1 - r2
            float r1 = r1 / r3
            r0.f33730v = r1
        L_0x0038:
            int r1 = r22.getPaddingLeft()
            int r2 = r22.getHeight()
            int r3 = r22.getPaddingBottom()
            int r12 = r2 - r3
            android.text.TextPaint r13 = r22.getPaint()
            android.content.Context r2 = r22.getContext()
            r3 = 2131099823(0x7f0600af, float:1.781201E38)
            int r2 = androidx.core.content.C17318d.m79723f(r2, r3)
            r13.setColor(r2)
            r14 = 0
            r15 = r14
        L_0x005a:
            float r2 = (float) r15
            float r3 = r0.f33731w
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c2
            float r7 = (float) r1
            float r1 = (float) r12
            float r2 = r0.f33730v
            float r19 = r7 + r2
            android.text.TextPaint r21 = r22.getPaint()
            r16 = r23
            r17 = r7
            r18 = r1
            r20 = r1
            r16.drawLine(r17, r18, r19, r20, r21)
            android.text.Editable r2 = r22.getText()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00ab
            android.text.Editable r2 = r22.getText()
            java.util.Objects.requireNonNull(r2)
            android.text.Editable r2 = (android.text.Editable) r2
            int r2 = r2.length()
            if (r2 <= r15) goto L_0x00ab
            float r2 = r0.f33730v
            r3 = 1077936128(0x40400000, float:3.0)
            float r2 = r2 / r3
            float r2 = r2 + r7
            int r4 = r15 + 1
            r3 = r9[r14]
            float r3 = r3 / r11
            float r5 = r2 - r3
            float r2 = r0.f33732x
            float r6 = r1 - r2
            r1 = r23
            r2 = r8
            r3 = r15
            r16 = r7
            r7 = r13
            r1.drawText(r2, r3, r4, r5, r6, r7)
            goto L_0x00ad
        L_0x00ab:
            r16 = r7
        L_0x00ad:
            float r1 = r0.f33729g
            int r2 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b9
            float r1 = r0.f33730v
            float r1 = r1 * r11
            float r7 = r16 + r1
            goto L_0x00be
        L_0x00b9:
            float r2 = r0.f33730v
            float r2 = r2 + r1
            float r7 = r16 + r2
        L_0x00be:
            int r1 = (int) r7
            int r15 = r15 + 1
            goto L_0x005a
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.app.PinEntryEditText.onDraw(android.graphics.Canvas):void");
    }

    public void setInputType(int i) {
        super.setInputType(i);
        if ((i & 128) != 128 && (i & 16) != 16) {
            setMask((String) null);
        } else if (TextUtils.isEmpty(this.f33734z)) {
            setMask("*");
        }
    }

    public void setMask(String str) {
        this.f33734z = str;
        this.f33728E0 = null;
        invalidate();
    }

    public void setNumChars(Integer num) {
        this.f33731w = (float) num.intValue();
    }

    public void setMask() {
        if (mo32747h()) {
            this.f33734z = "*";
        } else {
            this.f33734z = null;
        }
        this.f33728E0 = null;
        invalidate();
    }

    public PinEntryEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo32746g(context, attributeSet);
    }

    public PinEntryEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo32746g(context, attributeSet);
    }
}
