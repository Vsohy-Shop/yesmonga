package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.content.res.C17483q;
import androidx.preference.C19975v;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: Q1 */
    public void mo34405Q1(@C0359n0 C19974u uVar) {
        super.mo34405Q1(uVar);
        if (Build.VERSION.SDK_INT >= 28) {
            uVar.itemView.setAccessibilityHeading(true);
        }
    }

    /* renamed from: e3 */
    public boolean mo58775e3() {
        return !super.mo58903q1();
    }

    /* renamed from: q1 */
    public boolean mo58903q1() {
        return false;
    }

    public PreferenceCategory(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C17483q.m80225a(context, C19975v.C19976a.preferenceCategoryStyle, 16842892));
    }

    public PreferenceCategory(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }
}
