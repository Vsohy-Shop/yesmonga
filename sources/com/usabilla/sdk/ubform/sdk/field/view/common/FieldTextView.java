package com.usabilla.sdk.ubform.sdk.field.view.common;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.journeyapps.barcodescanner.camera.C34935s;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.sdk.field.contract.common.C9967b;
import com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter;
import com.usabilla.sdk.ubform.sdk.field.view.common.C10038a;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\u0012\b\u0000\u0010\u0003*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH$J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH$R\u001b\u0010\u0013\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/view/common/FieldTextView;", "Lcom/usabilla/sdk/ubform/sdk/field/presenter/common/FieldPresenter;", "", "P", "Lcom/usabilla/sdk/ubform/sdk/field/view/common/FieldView;", "Lcom/usabilla/sdk/ubform/sdk/field/contract/common/b;", "Lcom/usabilla/sdk/ubform/sdk/field/view/common/a;", "Lkotlin/d2;", "c", "j", "a", "Landroid/widget/EditText;", "textInput", "n", "o", "E0", "Lkotlin/z;", "getTextBox", "()Landroid/widget/EditText;", "textBox", "Landroid/text/TextWatcher;", "F0", "Landroid/text/TextWatcher;", "textWatcher", "Landroid/content/Context;", "context", "fieldPresenter", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/sdk/field/presenter/common/FieldPresenter;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public abstract class FieldTextView<P extends FieldPresenter<?, String>> extends FieldView<P> implements C9967b, C10038a {
    @C12579k

    /* renamed from: E0 */
    public final C11677z f27584E0;
    @C12579k

    /* renamed from: F0 */
    public final TextWatcher f27585F0;

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.view.common.FieldTextView$a */
    public static final class C10036a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ P f27586a;

        public C10036a(P p) {
            this.f27586a = p;
        }

        public void afterTextChanged(@C12579k Editable editable) {
            Intrinsics.checkNotNullParameter(editable, C34935s.f84988a);
            this.f27586a.mo20824R(editable.toString());
        }

        public void beforeTextChanged(@C12579k CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(charSequence, C34935s.f84988a);
        }

        public void onTextChanged(@C12579k CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(charSequence, C34935s.f84988a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FieldTextView(@C12579k Context context, @C12579k P p) {
        super(context, p);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(p, "fieldPresenter");
        this.f27584E0 = C10864b0.m38748c(new FieldTextView$textBox$2(context, this));
        this.f27585F0 = new C10036a(p);
    }

    private final EditText getTextBox() {
        return (EditText) this.f27584E0.getValue();
    }

    /* renamed from: a */
    public void mo20840a() {
        getTextBox().requestFocus();
        getTextBox().setSelection(getTextBox().getText().length());
    }

    /* renamed from: c */
    public void mo20831c() {
        if (mo21128l()) {
            getTextBox().removeTextChangedListener(this.f27585F0);
            getTextBox().setText("");
            getTextBox().addTextChangedListener(this.f27585F0);
        }
    }

    @C12579k
    /* renamed from: f */
    public Drawable mo21058f(@C12579k UbInternalTheme ubInternalTheme, @C12579k Context context) {
        return C10038a.C10039a.m37930a(this, ubInternalTheme, context);
    }

    /* renamed from: j */
    public void mo20835j() {
        mo21044n(getTextBox());
        getTextBox().addTextChangedListener(this.f27585F0);
        getRootView().addView(getTextBox());
        mo21045o(getTextBox());
    }

    /* renamed from: n */
    public abstract void mo21044n(@C12579k EditText editText);

    /* renamed from: o */
    public abstract void mo21045o(@C12579k EditText editText);
}
