package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.C17483q;
import androidx.preference.C19966s;
import androidx.preference.C19975v;

public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: s1 */
    public boolean f50901s1 = true;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PreferenceScreen(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet, C17483q.m80225a(context, C19975v.C19976a.preferenceScreenStyle, 16842891));
    }

    /* renamed from: D3 */
    public void mo58961D3(boolean z) {
        if (!mo58943r3()) {
            this.f50901s1 = z;
            return;
        }
        throw new IllegalStateException("Cannot change the usage of generated IDs while attached to the preference hierarchy");
    }

    /* renamed from: E3 */
    public boolean mo58962E3() {
        return this.f50901s1;
    }

    /* renamed from: T1 */
    public void mo58744T1() {
        C19966s.C19968b j;
        if (mo58886i0() == null && mo58878e0() == null && mo58942q3() != 0 && (j = mo58848N0().mo59196j()) != null) {
            j.mo59067R(this);
        }
    }

    /* renamed from: s3 */
    public boolean mo58944s3() {
        return false;
    }
}
