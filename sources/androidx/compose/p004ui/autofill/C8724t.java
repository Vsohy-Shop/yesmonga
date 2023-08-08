package androidx.compose.p004ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.constraintlayout.widget.C16934c;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(26)
/* renamed from: androidx.compose.ui.autofill.t */
public final class C8724t {
    @C12579k

    /* renamed from: a */
    public static final C8724t f23395a = new C8724t();

    @C12580l
    @C0376v0(26)
    @C0373u
    /* renamed from: a */
    public final AutofillId mo17035a(@C12579k ViewStructure viewStructure) {
        Intrinsics.checkNotNullParameter(viewStructure, C9874a.f27053J);
        return viewStructure.getAutofillId();
    }

    @C0376v0(26)
    @C0373u
    /* renamed from: b */
    public final boolean mo17036b(@C12579k AutofillValue autofillValue) {
        Intrinsics.checkNotNullParameter(autofillValue, "value");
        return autofillValue.isDate();
    }

    @C0376v0(26)
    @C0373u
    /* renamed from: c */
    public final boolean mo17037c(@C12579k AutofillValue autofillValue) {
        Intrinsics.checkNotNullParameter(autofillValue, "value");
        return autofillValue.isList();
    }

    @C0376v0(26)
    @C0373u
    /* renamed from: d */
    public final boolean mo17038d(@C12579k AutofillValue autofillValue) {
        Intrinsics.checkNotNullParameter(autofillValue, "value");
        return autofillValue.isText();
    }

    @C0376v0(26)
    @C0373u
    /* renamed from: e */
    public final boolean mo17039e(@C12579k AutofillValue autofillValue) {
        Intrinsics.checkNotNullParameter(autofillValue, "value");
        return autofillValue.isToggle();
    }

    @C0376v0(26)
    @C0373u
    /* renamed from: f */
    public final void mo17040f(@C12579k ViewStructure viewStructure, @C12579k String[] strArr) {
        Intrinsics.checkNotNullParameter(viewStructure, C9874a.f27053J);
        Intrinsics.checkNotNullParameter(strArr, "hints");
        viewStructure.setAutofillHints(strArr);
    }

    @C0376v0(26)
    @C0373u
    /* renamed from: g */
    public final void mo17041g(@C12579k ViewStructure viewStructure, @C12579k AutofillId autofillId, int i) {
        Intrinsics.checkNotNullParameter(viewStructure, C9874a.f27053J);
        Intrinsics.checkNotNullParameter(autofillId, C16934c.f44493V1);
        viewStructure.setAutofillId(autofillId, i);
    }

    @C0376v0(26)
    @C0373u
    /* renamed from: h */
    public final void mo17042h(@C12579k ViewStructure viewStructure, int i) {
        Intrinsics.checkNotNullParameter(viewStructure, C9874a.f27053J);
        viewStructure.setAutofillType(i);
    }

    @C0376v0(26)
    @C12579k
    @C0373u
    /* renamed from: i */
    public final CharSequence mo17043i(@C12579k AutofillValue autofillValue) {
        Intrinsics.checkNotNullParameter(autofillValue, "value");
        CharSequence a = autofillValue.getTextValue();
        Intrinsics.checkNotNullExpressionValue(a, "value.textValue");
        return a;
    }
}
