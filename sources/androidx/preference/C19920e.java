package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

@Deprecated
/* renamed from: androidx.preference.e */
public class C19920e extends C19930j {

    /* renamed from: H0 */
    public static final String f50949H0 = "ListPreferenceDialogFragment.index";

    /* renamed from: I0 */
    public static final String f50950I0 = "ListPreferenceDialogFragment.entries";

    /* renamed from: J0 */
    public static final String f50951J0 = "ListPreferenceDialogFragment.entryValues";

    /* renamed from: E0 */
    public int f50952E0;

    /* renamed from: F0 */
    public CharSequence[] f50953F0;

    /* renamed from: G0 */
    public CharSequence[] f50954G0;

    /* renamed from: androidx.preference.e$a */
    public class C19921a implements DialogInterface.OnClickListener {
        public C19921a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C19920e eVar = C19920e.this;
            eVar.f50952E0 = i;
            eVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @C0359n0
    @Deprecated
    /* renamed from: i */
    public static C19920e m92669i(String str) {
        C19920e eVar = new C19920e();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        eVar.setArguments(bundle);
        return eVar;
    }

    @Deprecated
    /* renamed from: e */
    public void mo59027e(boolean z) {
        int i;
        ListPreference h = mo59043h();
        if (z && (i = this.f50952E0) >= 0) {
            String charSequence = this.f50954G0[i].toString();
            if (h.mo58882g(charSequence)) {
                h.mo58796L3(charSequence);
            }
        }
    }

    /* renamed from: f */
    public void mo59042f(@C0359n0 AlertDialog.Builder builder) {
        super.mo59042f(builder);
        builder.setSingleChoiceItems(this.f50953F0, this.f50952E0, new C19921a());
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    /* renamed from: h */
    public final ListPreference mo59043h() {
        return (ListPreference) mo59057a();
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference h = mo59043h();
            if (h.mo58788C3() == null || h.mo58790E3() == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.f50952E0 = h.mo58787B3(h.mo58791F3());
            this.f50953F0 = h.mo58788C3();
            this.f50954G0 = h.mo58790E3();
            return;
        }
        this.f50952E0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.f50953F0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.f50954G0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f50952E0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f50953F0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f50954G0);
    }
}
