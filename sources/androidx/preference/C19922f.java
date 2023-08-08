package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.app.C0467d;

/* renamed from: androidx.preference.f */
public class C19922f extends C19932k {

    /* renamed from: H0 */
    public static final String f50956H0 = "ListPreferenceDialogFragment.index";

    /* renamed from: I0 */
    public static final String f50957I0 = "ListPreferenceDialogFragment.entries";

    /* renamed from: J0 */
    public static final String f50958J0 = "ListPreferenceDialogFragment.entryValues";

    /* renamed from: E0 */
    public int f50959E0;

    /* renamed from: F0 */
    public CharSequence[] f50960F0;

    /* renamed from: G0 */
    public CharSequence[] f50961G0;

    /* renamed from: androidx.preference.f$a */
    public class C19923a implements DialogInterface.OnClickListener {
        public C19923a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C19922f fVar = C19922f.this;
            fVar.f50959E0 = i;
            fVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @C0359n0
    /* renamed from: T0 */
    public static C19922f m92673T0(String str) {
        C19922f fVar = new C19922f();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        fVar.setArguments(bundle);
        return fVar;
    }

    /* renamed from: O0 */
    public void mo59033O0(boolean z) {
        int i;
        if (z && (i = this.f50959E0) >= 0) {
            String charSequence = this.f50961G0[i].toString();
            ListPreference S0 = mo59046S0();
            if (S0.mo58882g(charSequence)) {
                S0.mo58796L3(charSequence);
            }
        }
    }

    /* renamed from: P0 */
    public void mo59045P0(@C0359n0 C0467d.C0468a aVar) {
        super.mo59045P0(aVar);
        aVar.mo1396I(this.f50960F0, this.f50959E0, new C19923a());
        aVar.mo1390C((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    /* renamed from: S0 */
    public final ListPreference mo59046S0() {
        return (ListPreference) mo59063K0();
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference S0 = mo59046S0();
            if (S0.mo58788C3() == null || S0.mo58790E3() == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.f50959E0 = S0.mo58787B3(S0.mo58791F3());
            this.f50960F0 = S0.mo58788C3();
            this.f50961G0 = S0.mo58790E3();
            return;
        }
        this.f50959E0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.f50960F0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.f50961G0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f50959E0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f50960F0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f50961G0);
    }
}
