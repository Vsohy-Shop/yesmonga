package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.C0387a;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.C36896b;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007J\u001c\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\"\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/AddressRadioButtonComponent;", "Landroidx/appcompat/widget/AppCompatRadioButton;", "", "isAddress", "", "addressPart1", "addressPart2", "Landroid/widget/TextView$BufferType;", "type", "Lkotlin/d2;", "setText", "", "text", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "a", "e", "Z", "f", "Ljava/lang/String;", "g", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class AddressRadioButtonComponent extends AppCompatRadioButton {

    /* renamed from: v */
    public static final int f92991v = 8;

    /* renamed from: e */
    public boolean f92992e;
    @C12580l

    /* renamed from: f */
    public String f92993f;
    @C12580l

    /* renamed from: g */
    public String f92994g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public AddressRadioButtonComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    public static /* synthetic */ void setText$default(AddressRadioButtonComponent addressRadioButtonComponent, boolean z, String str, String str2, TextView.BufferType bufferType, int i, Object obj) {
        if ((i & 8) != 0) {
            bufferType = null;
        }
        addressRadioButtonComponent.setText(z, str, str2, bufferType);
    }

    /* renamed from: a */
    public final void mo112770a(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C36896b.C36914r.AddressRadioButtonComponent, i, 0);
            try {
                this.f92992e = obtainStyledAttributes.getBoolean(C36896b.C36914r.AddressRadioButtonComponent_is_address, false);
                this.f92993f = obtainStyledAttributes.getString(C36896b.C36914r.AddressRadioButtonComponent_address_part1);
                String string = obtainStyledAttributes.getString(C36896b.C36914r.AddressRadioButtonComponent_address_part2);
                this.f92994g = string;
                setText(this.f92992e, this.f92993f, string, TextView.BufferType.SPANNABLE);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final void setText(boolean z, @C12580l String str, @C12580l String str2, @C12580l TextView.BufferType bufferType) {
        this.f92992e = z;
        this.f92993f = str;
        this.f92994g = str2;
        setText(getText(), bufferType);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public AddressRadioButtonComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressRadioButtonComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C0387a.C0389b.radioButtonStyle : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public AddressRadioButtonComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        mo112770a(context, attributeSet, i);
    }

    public void setText(@C12580l CharSequence charSequence, @C12580l TextView.BufferType bufferType) {
        String str;
        if (this.f92992e) {
            String str2 = this.f92993f;
            boolean z = false;
            if (!(str2 == null || C11622t.isBlank(str2))) {
                String str3 = this.f92994g;
                if (str3 == null) {
                    str = this.f92993f;
                } else {
                    str = this.f92993f + "\n" + str3;
                }
                SpannableString spannableString = new SpannableString(str);
                TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(getContext(), C36896b.C36913q.ds_title_xs_bold);
                String str4 = this.f92993f;
                Intrinsics.checkNotNull(str4);
                spannableString.setSpan(textAppearanceSpan, 0, str4.length(), 33);
                String str5 = this.f92994g;
                if (str5 == null || C11622t.isBlank(str5)) {
                    z = true;
                }
                if (!z) {
                    TextAppearanceSpan textAppearanceSpan2 = new TextAppearanceSpan(getContext(), C36896b.C36913q.ds_body_s);
                    String str6 = this.f92993f;
                    Intrinsics.checkNotNull(str6);
                    String str7 = this.f92993f;
                    Intrinsics.checkNotNull(str7);
                    int length = str7.length();
                    String str8 = this.f92994g;
                    Intrinsics.checkNotNull(str8);
                    spannableString.setSpan(textAppearanceSpan2, str6.length() + 1, length + str8.length() + 1, 33);
                }
                super.setText(spannableString, bufferType);
                return;
            }
        }
        setTextAppearance(C36896b.C36913q.ds_title_xs_bold);
        super.setText(charSequence, bufferType);
    }
}
