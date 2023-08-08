package com.contentsquare.android.internal.features.clientmode.p024ui.settings;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.content.res.C17465i;
import androidx.preference.C19974u;
import androidx.preference.Preference;
import com.contentsquare.android.C14147n;

/* renamed from: com.contentsquare.android.internal.features.clientmode.ui.settings.CustomPreference */
public class CustomPreference extends Preference {
    public CustomPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: Q1 */
    public void mo34405Q1(C19974u uVar) {
        super.mo34405Q1(uVar);
        ((TextView) uVar.mo59214d(16908310)).setTextColor(C17465i.m80173e(mo58854Q().getResources(), C14147n.C14150c.contentsquare_settings_disable_in_app_feature_text_color, (Resources.Theme) null));
    }
}
