package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.preference.C19975v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.preference.d */
public final class C19919d extends Preference {

    /* renamed from: i1 */
    public long f50948i1;

    public C19919d(@C0359n0 Context context, List<Preference> list, long j) {
        super(context);
        mo59040k3();
        mo59041l3(list);
        this.f50948i1 = j + 1000000;
    }

    /* renamed from: Q1 */
    public void mo34405Q1(@C0359n0 C19974u uVar) {
        super.mo34405Q1(uVar);
        uVar.mo59218h(false);
    }

    /* renamed from: h0 */
    public long mo58884h0() {
        return this.f50948i1;
    }

    /* renamed from: k3 */
    public final void mo59040k3() {
        mo58847M2(C19975v.C19983h.expand_button);
        mo58836H2(C19975v.C19980e.ic_arrow_down_24dp);
        mo58869Z2(C19975v.C19984i.expand_button_title);
        mo58855Q2(999);
    }

    /* renamed from: l3 */
    public final void mo59041l3(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = null;
        for (Preference next : list) {
            CharSequence j1 = next.mo58890j1();
            boolean z = next instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(j1)) {
                arrayList.add((PreferenceGroup) next);
            }
            if (arrayList.contains(next.mo58908t0())) {
                if (z) {
                    arrayList.add((PreferenceGroup) next);
                }
            } else if (!TextUtils.isEmpty(j1)) {
                if (charSequence == null) {
                    charSequence = j1;
                } else {
                    charSequence = mo58854Q().getString(C19975v.C19984i.summary_collapsed_preference_list, new Object[]{charSequence, j1});
                }
            }
        }
        mo58798X2(charSequence);
    }
}
