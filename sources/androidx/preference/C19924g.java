package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: androidx.preference.g */
public class C19924g extends C19930j {

    /* renamed from: I0 */
    public static final String f50963I0 = "MultiSelectListPreferenceDialogFragment.values";

    /* renamed from: J0 */
    public static final String f50964J0 = "MultiSelectListPreferenceDialogFragment.changed";

    /* renamed from: K0 */
    public static final String f50965K0 = "MultiSelectListPreferenceDialogFragment.entries";

    /* renamed from: L0 */
    public static final String f50966L0 = "MultiSelectListPreferenceDialogFragment.entryValues";

    /* renamed from: E0 */
    public Set<String> f50967E0 = new HashSet();

    /* renamed from: F0 */
    public boolean f50968F0;

    /* renamed from: G0 */
    public CharSequence[] f50969G0;

    /* renamed from: H0 */
    public CharSequence[] f50970H0;

    /* renamed from: androidx.preference.g$a */
    public class C19925a implements DialogInterface.OnMultiChoiceClickListener {
        public C19925a() {
        }

        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            if (z) {
                C19924g gVar = C19924g.this;
                gVar.f50968F0 = gVar.f50967E0.add(gVar.f50970H0[i].toString()) | gVar.f50968F0;
                return;
            }
            C19924g gVar2 = C19924g.this;
            gVar2.f50968F0 = gVar2.f50967E0.remove(gVar2.f50970H0[i].toString()) | gVar2.f50968F0;
        }
    }

    @C0359n0
    @Deprecated
    /* renamed from: i */
    public static C19924g m92677i(String str) {
        C19924g gVar = new C19924g();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        gVar.setArguments(bundle);
        return gVar;
    }

    @Deprecated
    /* renamed from: e */
    public void mo59027e(boolean z) {
        MultiSelectListPreference h = mo59048h();
        if (z && this.f50968F0) {
            Set<String> set = this.f50967E0;
            if (h.mo58882g(set)) {
                h.mo58814K3(set);
            }
        }
        this.f50968F0 = false;
    }

    /* renamed from: f */
    public void mo59042f(@C0359n0 AlertDialog.Builder builder) {
        super.mo59042f(builder);
        int length = this.f50970H0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f50967E0.contains(this.f50970H0[i].toString());
        }
        builder.setMultiChoiceItems(this.f50969G0, zArr, new C19925a());
    }

    /* renamed from: h */
    public final MultiSelectListPreference mo59048h() {
        return (MultiSelectListPreference) mo59057a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            MultiSelectListPreference h = mo59048h();
            if (h.mo58806C3() == null || h.mo58807D3() == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.f50967E0.clear();
            this.f50967E0.addAll(h.mo58809F3());
            this.f50968F0 = false;
            this.f50969G0 = h.mo58806C3();
            this.f50970H0 = h.mo58807D3();
            return;
        }
        this.f50967E0.clear();
        this.f50967E0.addAll(bundle.getStringArrayList(f50963I0));
        this.f50968F0 = bundle.getBoolean(f50964J0, false);
        this.f50969G0 = bundle.getCharSequenceArray(f50965K0);
        this.f50970H0 = bundle.getCharSequenceArray(f50966L0);
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList(f50963I0, new ArrayList(this.f50967E0));
        bundle.putBoolean(f50964J0, this.f50968F0);
        bundle.putCharSequenceArray(f50965K0, this.f50969G0);
        bundle.putCharSequenceArray(f50966L0, this.f50970H0);
    }
}
