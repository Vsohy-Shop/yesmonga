package com.carrefour.fid.android.design.components.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.content.res.C0507a;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.C36896b;
import com.google.android.material.button.MaterialButton;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\t¢\u0006\u0004\b,\u0010-J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J*\u0010\u0011\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0014J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\tH\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010&\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001d¨\u0006."}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/LoaderMaterialButton;", "Lcom/google/android/material/button/MaterialButton;", "", "isLoading", "Lkotlin/d2;", "setLoading", "Landroid/graphics/drawable/Drawable;", "icon", "setIcon", "", "iconResourceId", "setIconResource", "", "charSequence", "i", "i1", "i2", "onTextChanged", "iconGravity", "setIconGravity", "iconPadding", "setIconPadding", "S0", "Landroid/graphics/drawable/Drawable;", "savedIcon", "T0", "Ljava/lang/CharSequence;", "savedText", "U0", "I", "savedIconGravity", "V0", "savedIconPadding", "W0", "Z", "X0", "textBeingChanged", "Y0", "iconTintFromStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class LoaderMaterialButton extends MaterialButton {

    /* renamed from: Z0 */
    public static final int f93058Z0 = 8;
    @C12580l

    /* renamed from: S0 */
    public Drawable f93059S0;
    @C12580l

    /* renamed from: T0 */
    public CharSequence f93060T0;

    /* renamed from: U0 */
    public int f93061U0;

    /* renamed from: V0 */
    public int f93062V0;

    /* renamed from: W0 */
    public boolean f93063W0;

    /* renamed from: X0 */
    public boolean f93064X0;
    @SuppressLint({"CustomViewStyleable"})

    /* renamed from: Y0 */
    public final int f93065Y0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public LoaderMaterialButton(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    public void onTextChanged(@C12580l CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f93064X0) {
            this.f93060T0 = charSequence;
        }
        super.onTextChanged(charSequence, i, i2, i3);
    }

    public void setIcon(@C12580l Drawable drawable) {
        this.f93059S0 = drawable;
        super.setIcon(drawable);
    }

    public void setIconGravity(int i) {
        this.f93061U0 = i;
        super.setIconGravity(i);
    }

    public void setIconPadding(int i) {
        this.f93062V0 = i;
        super.setIconPadding(i);
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0507a.m2346b(getContext(), i);
        } else {
            drawable = null;
        }
        this.f93059S0 = drawable;
        if (!this.f93063W0) {
            setIcon(drawable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r2 == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setLoading(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.f93063W0
            if (r0 != r5) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L_0x0021
            android.graphics.drawable.Drawable r2 = r4.getIcon()
            if (r2 == 0) goto L_0x0021
            java.lang.CharSequence r2 = r4.getText()
            if (r2 == 0) goto L_0x001e
            int r2 = r2.length()
            if (r2 != 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r2 = r0
            goto L_0x001f
        L_0x001e:
            r2 = r1
        L_0x001f:
            if (r2 != 0) goto L_0x0040
        L_0x0021:
            if (r5 == 0) goto L_0x0025
            r2 = 2
            goto L_0x0027
        L_0x0025:
            int r2 = r4.f93061U0
        L_0x0027:
            super.setIconGravity(r2)
            if (r5 == 0) goto L_0x002e
            r2 = r0
            goto L_0x0030
        L_0x002e:
            int r2 = r4.f93062V0
        L_0x0030:
            super.setIconPadding(r2)
            r4.f93064X0 = r1
            if (r5 == 0) goto L_0x0039
            r2 = 0
            goto L_0x003b
        L_0x0039:
            java.lang.CharSequence r2 = r4.f93060T0
        L_0x003b:
            super.setText(r2)
            r4.f93064X0 = r0
        L_0x0040:
            if (r5 == 0) goto L_0x0073
            int r2 = r4.getIconSize()
            if (r2 != 0) goto L_0x005a
            android.content.Context r2 = r4.getContext()
            android.content.res.Resources r2 = r2.getResources()
            int r3 = com.carrefour.fid.android.design.components.C36896b.C36903g.ds_sizing_s
            float r2 = r2.getDimension(r3)
            int r2 = (int) r2
            r4.setIconSize(r2)
        L_0x005a:
            androidx.swiperefreshlayout.widget.b r2 = new androidx.swiperefreshlayout.widget.b
            android.content.Context r3 = r4.getContext()
            r2.<init>(r3)
            r2.mo61524F(r1)
            int[] r1 = new int[r1]
            int r3 = r4.f93065Y0
            r1[r0] = r3
            r2.mo61556y(r1)
            r2.start()
            goto L_0x0075
        L_0x0073:
            android.graphics.drawable.Drawable r2 = r4.f93059S0
        L_0x0075:
            super.setIcon(r2)
            r0 = r5 ^ 1
            r4.setClickable(r0)
            r4.f93063W0 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.LoaderMaterialButton.setLoading(boolean):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public LoaderMaterialButton(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoaderMaterialButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public LoaderMaterialButton(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93059S0 = getIcon();
        this.f93060T0 = getText();
        this.f93061U0 = getIconGravity();
        this.f93062V0 = getIconPadding();
        this.f93065Y0 = context.obtainStyledAttributes(attributeSet, C36896b.C36914r.MaterialButton).getColor(C36896b.C36914r.MaterialButton_iconTint, 0);
    }
}
