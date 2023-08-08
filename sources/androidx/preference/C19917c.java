package androidx.preference;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.preference.c */
public class C19917c extends C19932k {

    /* renamed from: I0 */
    public static final String f50941I0 = "EditTextPreferenceDialogFragment.text";

    /* renamed from: J0 */
    public static final int f50942J0 = 1000;

    /* renamed from: E0 */
    public EditText f50943E0;

    /* renamed from: F0 */
    public CharSequence f50944F0;

    /* renamed from: G0 */
    public final Runnable f50945G0 = new C19918a();

    /* renamed from: H0 */
    public long f50946H0 = -1;

    /* renamed from: androidx.preference.c$a */
    public class C19918a implements Runnable {
        public C19918a() {
        }

        public void run() {
            C19917c.this.mo59037V0();
        }
    }

    @C0359n0
    /* renamed from: U0 */
    public static C19917c m92656U0(String str) {
        C19917c cVar = new C19917c();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        cVar.setArguments(bundle);
        return cVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: L0 */
    public boolean mo59031L0() {
        return true;
    }

    /* renamed from: M0 */
    public void mo59032M0(@C0359n0 View view) {
        super.mo59032M0(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.f50943E0 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.f50943E0.setText(this.f50944F0);
            EditText editText2 = this.f50943E0;
            editText2.setSelection(editText2.getText().length());
            if (mo59035S0().mo58770B3() != null) {
                mo59035S0().mo58770B3().mo58784a(this.f50943E0);
                return;
            }
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    /* renamed from: O0 */
    public void mo59033O0(boolean z) {
        if (z) {
            String obj = this.f50943E0.getText().toString();
            EditTextPreference S0 = mo59035S0();
            if (S0.mo58882g(obj)) {
                S0.mo58773E3(obj);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: R0 */
    public void mo59034R0() {
        mo59038W0(true);
        mo59037V0();
    }

    /* renamed from: S0 */
    public final EditTextPreference mo59035S0() {
        return (EditTextPreference) mo59063K0();
    }

    /* renamed from: T0 */
    public final boolean mo59036T0() {
        long j = this.f50946H0;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return false;
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: V0 */
    public void mo59037V0() {
        if (mo59036T0()) {
            EditText editText = this.f50943E0;
            if (editText == null || !editText.isFocused()) {
                mo59038W0(false);
            } else if (((InputMethodManager) this.f50943E0.getContext().getSystemService("input_method")).showSoftInput(this.f50943E0, 0)) {
                mo59038W0(false);
            } else {
                this.f50943E0.removeCallbacks(this.f50945G0);
                this.f50943E0.postDelayed(this.f50945G0, 50);
            }
        }
    }

    /* renamed from: W0 */
    public final void mo59038W0(boolean z) {
        this.f50946H0 = z ? SystemClock.currentThreadTimeMillis() : -1;
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f50944F0 = mo59035S0().mo58771C3();
        } else {
            this.f50944F0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f50944F0);
    }
}
