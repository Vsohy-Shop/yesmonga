package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.widget.EditText;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.sdk.field.contract.C9989k;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10026j;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldTextView;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000e"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/view/TextBoxView;", "Lcom/usabilla/sdk/ubform/sdk/field/view/common/FieldTextView;", "Lcom/usabilla/sdk/ubform/sdk/field/presenter/j;", "Lcom/usabilla/sdk/ubform/sdk/field/contract/k$b;", "Landroid/widget/EditText;", "textInput", "Lkotlin/d2;", "n", "o", "Landroid/content/Context;", "context", "presenter", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/sdk/field/presenter/j;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class TextBoxView extends FieldTextView<C10026j> implements C9989k.C9991b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextBoxView(@C12579k Context context, @C12579k C10026j jVar) {
        super(context, jVar);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(jVar, "presenter");
    }

    /* renamed from: n */
    public void mo21044n(@C12579k EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "textInput");
        editText.setHint(((C10026j) getFieldPresenter()).mo20869f());
        editText.setSingleLine(true);
    }

    /* renamed from: o */
    public void mo21045o(@C12579k EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "textInput");
        if (((C10026j) getFieldPresenter()).mo20870g()) {
            editText.setText(((C10026j) getFieldPresenter()).mo20871t());
        }
    }
}
