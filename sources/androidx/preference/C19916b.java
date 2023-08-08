package androidx.preference;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

@Deprecated
/* renamed from: androidx.preference.b */
public class C19916b extends C19930j {

    /* renamed from: G0 */
    public static final String f50938G0 = "EditTextPreferenceDialogFragment.text";

    /* renamed from: E0 */
    public EditText f50939E0;

    /* renamed from: F0 */
    public CharSequence f50940F0;

    @C0359n0
    @Deprecated
    /* renamed from: i */
    public static C19916b m92651i(String str) {
        C19916b bVar = new C19916b();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        bVar.setArguments(bundle);
        return bVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: b */
    public boolean mo59025b() {
        return true;
    }

    /* renamed from: c */
    public void mo59026c(@C0359n0 View view) {
        super.mo59026c(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.f50939E0 = editText;
        editText.requestFocus();
        EditText editText2 = this.f50939E0;
        if (editText2 != null) {
            editText2.setText(this.f50940F0);
            EditText editText3 = this.f50939E0;
            editText3.setSelection(editText3.getText().length());
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Deprecated
    /* renamed from: e */
    public void mo59027e(boolean z) {
        if (z) {
            String obj = this.f50939E0.getText().toString();
            if (mo59028h().mo58882g(obj)) {
                mo59028h().mo58773E3(obj);
            }
        }
    }

    /* renamed from: h */
    public final EditTextPreference mo59028h() {
        return (EditTextPreference) mo59057a();
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f50940F0 = mo59028h().mo58771C3();
        } else {
            this.f50940F0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f50940F0);
    }
}
