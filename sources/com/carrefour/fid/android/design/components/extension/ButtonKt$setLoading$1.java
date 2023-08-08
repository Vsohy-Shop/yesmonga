package com.carrefour.fid.android.design.components.extension;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "a", "(I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ButtonKt$setLoading$1 extends Lambda implements C11300l<Integer, C11079d2> {
    final /* synthetic */ Drawable $iconDrawable;
    final /* synthetic */ Integer $iconGravity;
    final /* synthetic */ Integer $iconPadding;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ String $text;
    final /* synthetic */ MaterialButton $this_setLoading;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonKt$setLoading$1(MaterialButton materialButton, boolean z, Integer num, Integer num2, String str, Drawable drawable) {
        super(1);
        this.$this_setLoading = materialButton;
        this.$isLoading = z;
        this.$iconGravity = num;
        this.$iconPadding = num2;
        this.$text = str;
        this.$iconDrawable = drawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r6 == false) goto L_0x0027;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112707a(int r6) {
        /*
            r5 = this;
            com.google.android.material.button.MaterialButton r0 = r5.$this_setLoading
            r0.setWidth(r6)
            boolean r6 = r5.$isLoading
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L_0x0027
            com.google.android.material.button.MaterialButton r6 = r5.$this_setLoading
            android.graphics.drawable.Drawable r6 = r6.getIcon()
            if (r6 == 0) goto L_0x0027
            com.google.android.material.button.MaterialButton r6 = r5.$this_setLoading
            java.lang.CharSequence r6 = r6.getText()
            if (r6 == 0) goto L_0x0024
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r6 = r0
            goto L_0x0025
        L_0x0024:
            r6 = r1
        L_0x0025:
            if (r6 != 0) goto L_0x006a
        L_0x0027:
            com.google.android.material.button.MaterialButton r6 = r5.$this_setLoading
            boolean r2 = r5.$isLoading
            r3 = 2
            if (r2 == 0) goto L_0x002f
            goto L_0x0037
        L_0x002f:
            java.lang.Integer r2 = r5.$iconGravity
            if (r2 == 0) goto L_0x0037
            int r3 = r2.intValue()
        L_0x0037:
            r6.setIconGravity(r3)
            com.google.android.material.button.MaterialButton r6 = r5.$this_setLoading
            boolean r2 = r5.$isLoading
            if (r2 == 0) goto L_0x0042
            r2 = r0
            goto L_0x005a
        L_0x0042:
            java.lang.Integer r2 = r5.$iconPadding
            if (r2 == 0) goto L_0x004b
            int r2 = r2.intValue()
            goto L_0x005a
        L_0x004b:
            android.content.Context r2 = r6.getContext()
            android.content.res.Resources r2 = r2.getResources()
            int r3 = com.carrefour.fid.android.design.components.C36896b.C36903g.ds_sizing_s
            float r2 = r2.getDimension(r3)
            int r2 = (int) r2
        L_0x005a:
            r6.setIconPadding(r2)
            com.google.android.material.button.MaterialButton r6 = r5.$this_setLoading
            boolean r2 = r5.$isLoading
            if (r2 == 0) goto L_0x0065
            r2 = 0
            goto L_0x0067
        L_0x0065:
            java.lang.String r2 = r5.$text
        L_0x0067:
            r6.setText(r2)
        L_0x006a:
            com.google.android.material.button.MaterialButton r6 = r5.$this_setLoading
            boolean r2 = r5.$isLoading
            if (r2 == 0) goto L_0x00ad
            int r2 = r6.getIconSize()
            if (r2 != 0) goto L_0x008a
            com.google.android.material.button.MaterialButton r2 = r5.$this_setLoading
            android.content.Context r3 = r2.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = com.carrefour.fid.android.design.components.C36896b.C36903g.ds_sizing_s
            float r3 = r3.getDimension(r4)
            int r3 = (int) r3
            r2.setIconSize(r3)
        L_0x008a:
            androidx.swiperefreshlayout.widget.b r2 = new androidx.swiperefreshlayout.widget.b
            com.google.android.material.button.MaterialButton r3 = r5.$this_setLoading
            android.content.Context r3 = r3.getContext()
            r2.<init>(r3)
            com.google.android.material.button.MaterialButton r3 = r5.$this_setLoading
            r2.mo61524F(r1)
            int[] r4 = new int[r1]
            android.content.res.ColorStateList r3 = r3.getTextColors()
            int r3 = r3.getDefaultColor()
            r4[r0] = r3
            r2.mo61556y(r4)
            r2.start()
            goto L_0x00af
        L_0x00ad:
            android.graphics.drawable.Drawable r2 = r5.$iconDrawable
        L_0x00af:
            r6.setIcon(r2)
            com.google.android.material.button.MaterialButton r6 = r5.$this_setLoading
            boolean r0 = r5.$isLoading
            r0 = r0 ^ r1
            r6.setClickable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.extension.ButtonKt$setLoading$1.mo112707a(int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo112707a(((Number) obj).intValue());
        return C11079d2.f28267a;
    }
}
