package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.app.C0467d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.preference.h */
public class C19926h extends C19932k {

    /* renamed from: I0 */
    public static final String f50972I0 = "MultiSelectListPreferenceDialogFragmentCompat.values";

    /* renamed from: J0 */
    public static final String f50973J0 = "MultiSelectListPreferenceDialogFragmentCompat.changed";

    /* renamed from: K0 */
    public static final String f50974K0 = "MultiSelectListPreferenceDialogFragmentCompat.entries";

    /* renamed from: L0 */
    public static final String f50975L0 = "MultiSelectListPreferenceDialogFragmentCompat.entryValues";

    /* renamed from: E0 */
    public Set<String> f50976E0 = new HashSet();

    /* renamed from: F0 */
    public boolean f50977F0;

    /* renamed from: G0 */
    public CharSequence[] f50978G0;

    /* renamed from: H0 */
    public CharSequence[] f50979H0;

    /* renamed from: androidx.preference.h$a */
    public class C19927a implements DialogInterface.OnMultiChoiceClickListener {
        public C19927a() {
        }

        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            if (z) {
                C19926h hVar = C19926h.this;
                hVar.f50977F0 = hVar.f50976E0.add(hVar.f50979H0[i].toString()) | hVar.f50977F0;
                return;
            }
            C19926h hVar2 = C19926h.this;
            hVar2.f50977F0 = hVar2.f50976E0.remove(hVar2.f50979H0[i].toString()) | hVar2.f50977F0;
        }
    }

    @C0359n0
    /* renamed from: T0 */
    public static C19926h m92681T0(String str) {
        C19926h hVar = new C19926h();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        hVar.setArguments(bundle);
        return hVar;
    }

    /* renamed from: O0 */
    public void mo59033O0(boolean z) {
        if (z && this.f50977F0) {
            MultiSelectListPreference S0 = mo59050S0();
            if (S0.mo58882g(this.f50976E0)) {
                S0.mo58814K3(this.f50976E0);
            }
        }
        this.f50977F0 = false;
    }

    /* renamed from: P0 */
    public void mo59045P0(@C0359n0 C0467d.C0468a aVar) {
        super.mo59045P0(aVar);
        int length = this.f50979H0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f50976E0.contains(this.f50979H0[i].toString());
        }
        aVar.mo1419q(this.f50978G0, zArr, new C19927a());
    }

    /* renamed from: S0 */
    public final MultiSelectListPreference mo59050S0() {
        return (MultiSelectListPreference) mo59063K0();
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            MultiSelectListPreference S0 = mo59050S0();
            if (S0.mo58806C3() == null || S0.mo58807D3() == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.f50976E0.clear();
            this.f50976E0.addAll(S0.mo58809F3());
            this.f50977F0 = false;
            this.f50978G0 = S0.mo58806C3();
            this.f50979H0 = S0.mo58807D3();
            return;
        }
        this.f50976E0.clear();
        this.f50976E0.addAll(bundle.getStringArrayList(f50972I0));
        this.f50977F0 = bundle.getBoolean(f50973J0, false);
        this.f50978G0 = bundle.getCharSequenceArray(f50974K0);
        this.f50979H0 = bundle.getCharSequenceArray(f50975L0);
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList(f50972I0, new ArrayList(this.f50976E0));
        bundle.putBoolean(f50973J0, this.f50977F0);
        bundle.putCharSequenceArray(f50974K0, this.f50978G0);
        bundle.putCharSequenceArray(f50975L0, this.f50979H0);
    }
}
