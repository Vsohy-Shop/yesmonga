package com.contentsquare.android.sdk;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C19232h;
import androidx.preference.C19944m;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import com.contentsquare.android.C14146m;
import com.contentsquare.android.C14147n;
import com.contentsquare.android.internal.features.clientmode.p024ui.deactivationdialog.DeactivationActivity;
import com.contentsquare.android.internal.features.clientmode.p024ui.settings.CustomPreference;
import com.contentsquare.android.internal.features.clientmode.p024ui.settings.SettingsActivity;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0002J\b\u0010\u001a\u001a\u00020\u0006H\u0002J\b\u0010\u001b\u001a\u00020\u0006H\u0002J\b\u0010\u001c\u001a\u00020\u0006H\u0002J\b\u0010\u001d\u001a\u00020\u0006H\u0002J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\b\u0010 \u001a\u00020\u0006H\u0002J\b\u0010!\u001a\u00020\u0006H\u0002R\u0014\u0010%\u001a\u00020\"8BX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8BX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0014\u0010)\u001a\u00020\"8BX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0014\u0010+\u001a\u00020\"8BX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010$R\u0014\u0010/\u001a\u00020,8BX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062"}, mo22516d2 = {"Lcom/contentsquare/android/sdk/f7;", "Landroidx/preference/m;", "Landroid/os/Bundle;", "savedInstanceState", "", "rootKey", "Lkotlin/d2;", "R0", "G1", "u1", "q1", "r1", "v1", "p1", "s1", "o1", "", "visible", "j", "E1", "t1", "j1", "H1", "w1", "A1", "C1", "x1", "y1", "z1", "B1", "defaultUrl", "d", "D1", "F1", "Landroidx/preference/Preference$c;", "e1", "()Landroidx/preference/Preference$c;", "onForcedQualityChange", "n1", "onSessionReplayUrlChange", "m1", "onSessionReplayPresetUrlChange", "h1", "onLogVisualizerActivationChange", "Landroidx/preference/Preference$d;", "k1", "()Landroidx/preference/Preference$d;", "onReplayLinkClickListener", "<init>", "()V", "library_release"}, mo22517k = 1, mo22518mv = {1, 4, 3})
/* renamed from: com.contentsquare.android.sdk.f7 */
public final class C14327f7 extends C19944m {

    /* renamed from: E0 */
    public C14740t7 f35382E0;

    /* renamed from: F0 */
    public PreferenceCategory f35383F0;

    /* renamed from: G0 */
    public C14445j8 f35384G0;

    /* renamed from: Z */
    public C14843x f35385Z;

    /* renamed from: com.contentsquare.android.sdk.f7$a */
    public static final class C14328a implements Preference.C19901c {

        /* renamed from: a */
        public final /* synthetic */ C14327f7 f35386a;

        public C14328a(C14327f7 f7Var) {
            this.f35386a = f7Var;
        }

        /* renamed from: a */
        public final boolean mo35168a(Preference preference, Object obj) {
            Intrinsics.checkNotNullParameter(obj, "newValue");
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C14327f7.m61577f1(this.f35386a).mo36496c(booleanValue);
            C14327f7.m61577f1(this.f35386a).mo36498e(booleanValue);
            this.f35386a.mo35166y1();
            this.f35386a.mo35167z1();
            return true;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.f7$b */
    public static final class C14329b implements Preference.C19901c {

        /* renamed from: a */
        public final /* synthetic */ C14327f7 f35387a;

        public C14329b(C14327f7 f7Var) {
            this.f35387a = f7Var;
        }

        /* renamed from: a */
        public final boolean mo35168a(Preference preference, Object obj) {
            Intrinsics.checkNotNullParameter(preference, "<anonymous parameter 0>");
            if (obj != null) {
                this.f35387a.mo35152j1(((Boolean) obj).booleanValue());
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }
    }

    /* renamed from: com.contentsquare.android.sdk.f7$c */
    public static final class C14330c implements Preference.C19902d {

        /* renamed from: a */
        public final /* synthetic */ C14327f7 f35388a;

        public C14330c(C14327f7 f7Var) {
            this.f35388a = f7Var;
        }

        /* renamed from: a */
        public final boolean mo35169a(Preference preference) {
            Intrinsics.checkNotNullParameter(preference, "it");
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", C14146m.m60762o());
            intent.setType("text/plain");
            this.f35388a.startActivity(Intent.createChooser(intent, (CharSequence) null));
            return true;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.f7$d */
    public static final class C14331d implements Preference.C19901c {

        /* renamed from: a */
        public final /* synthetic */ C14327f7 f35389a;

        public C14331d(C14327f7 f7Var) {
            this.f35389a = f7Var;
        }

        /* renamed from: a */
        public final boolean mo35168a(Preference preference, Object obj) {
            Intrinsics.checkNotNullParameter(preference, "<anonymous parameter 0>");
            String string = this.f35389a.getString(C14147n.C14155h.contentsquare_developer_session_replay_url_key);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.conte…r_session_replay_url_key)");
            EditTextPreference editTextPreference = (EditTextPreference) this.f35389a.mo58761f0(string);
            if (editTextPreference != null) {
                if (obj != null) {
                    editTextPreference.mo58773E3((String) obj);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            if (editTextPreference == null) {
                return true;
            }
            editTextPreference.mo58798X2((CharSequence) obj);
            return true;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.f7$e */
    public static final class C14332e implements Preference.C19901c {

        /* renamed from: a */
        public final /* synthetic */ C14327f7 f35390a;

        public C14332e(C14327f7 f7Var) {
            this.f35390a = f7Var;
        }

        /* renamed from: a */
        public final boolean mo35168a(Preference preference, Object obj) {
            Intrinsics.checkNotNullParameter(preference, "preferenceChanged");
            if (obj != null) {
                String str = (String) obj;
                preference.mo58798X2(str);
                String string = this.f35390a.getString(C14147n.C14155h.contentsquare_developer_session_replay_preset_url_key);
                Intrinsics.checkNotNullExpressionValue(string, "getString(\n             …set_url_key\n            )");
                ListPreference listPreference = (ListPreference) this.f35390a.mo58761f0(string);
                if (listPreference == null) {
                    return true;
                }
                listPreference.mo58796L3(str);
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    /* renamed from: com.contentsquare.android.sdk.f7$f */
    public static final class C14333f implements Preference.C19902d {

        /* renamed from: a */
        public final /* synthetic */ C14327f7 f35391a;

        public C14333f(C14327f7 f7Var) {
            this.f35391a = f7Var;
        }

        /* renamed from: a */
        public final boolean mo35169a(Preference preference) {
            Intrinsics.checkNotNullParameter(preference, "it");
            this.f35391a.startActivity(new Intent(this.f35391a.getActivity(), DeactivationActivity.class));
            return true;
        }
    }

    /* renamed from: f1 */
    public static final /* synthetic */ C14740t7 m61577f1(C14327f7 f7Var) {
        C14740t7 t7Var = f7Var.f35382E0;
        if (t7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingsViewModel");
        }
        return t7Var;
    }

    /* renamed from: A1 */
    public final void mo35139A1() {
        C14445j8 j8Var = this.f35384G0;
        if (j8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setupCustomPreferenceDateStore");
        }
        j8Var.mo35640b(C14147n.C14155h.contentsquare_developer_session_replay_default_masking_key, true);
    }

    /* renamed from: B1 */
    public final void mo35140B1() {
        C14445j8 j8Var = this.f35384G0;
        if (j8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setupCustomPreferenceDateStore");
        }
        int i = C14147n.C14155h.f35013x71d3b4d2;
        C14740t7 t7Var = this.f35382E0;
        if (t7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingsViewModel");
        }
        j8Var.mo35639a(i, t7Var.mo36505l(), true);
    }

    /* renamed from: C1 */
    public final void mo35141C1() {
        C14445j8 j8Var = this.f35384G0;
        if (j8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setupCustomPreferenceDateStore");
        }
        j8Var.mo35640b(C14147n.C14155h.contentsquare_developer_session_replay_new_masking_key, false);
    }

    /* renamed from: D1 */
    public final void mo35142D1() {
        String string = getString(C14147n.C14155h.contentsquare_developer_session_replay_preset_url_key);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.conte…on_replay_preset_url_key)");
        ListPreference listPreference = (ListPreference) mo58761f0(string);
        if (listPreference != null) {
            C14843x xVar = this.f35385Z;
            if (xVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inAppPreferenceDataStore");
            }
            listPreference.mo58858S2(xVar);
            CharSequence[] E3 = listPreference.mo58790E3();
            String valueOf = String.valueOf(E3 != null ? E3[0] : null);
            C14843x xVar2 = this.f35385Z;
            if (xVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inAppPreferenceDataStore");
            }
            listPreference.mo58796L3(xVar2.mo36778e(string, valueOf));
            listPreference.mo58852O2(mo35154m1());
            mo35148d(valueOf);
        }
    }

    /* renamed from: E1 */
    public final void mo35143E1() {
        C14445j8 j8Var = this.f35384G0;
        if (j8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setupCustomPreferenceDateStore");
        }
        j8Var.mo35640b(C14147n.C14155h.contentsquare_session_replay_key, false);
    }

    /* renamed from: F1 */
    public final void mo35144F1() {
        C14445j8 j8Var = this.f35384G0;
        if (j8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setupCustomPreferenceDateStore");
        }
        j8Var.mo35640b(C14147n.C14155h.contentsquare_developer_session_timeout_zero_seconds_key, false);
    }

    /* renamed from: G1 */
    public final void mo35145G1() {
        C14445j8 j8Var = this.f35384G0;
        if (j8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setupCustomPreferenceDateStore");
        }
        C14445j8.m62203c(j8Var, C14147n.C14155h.contentsquare_static_snapshot_mode_key, false, 2, (Object) null);
    }

    /* renamed from: H1 */
    public final void mo35146H1() {
        String string = getString(C14147n.C14155h.contentsquare_settings_log_visualizer_user_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.conte…s_log_visualizer_user_id)");
        EditTextPreference editTextPreference = (EditTextPreference) mo58761f0(string);
        if (editTextPreference != null) {
            C14740t7 t7Var = this.f35382E0;
            if (t7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("settingsViewModel");
            }
            editTextPreference.mo58798X2(t7Var.mo36506m());
        }
    }

    /* renamed from: R0 */
    public void mo35147R0(Bundle bundle, String str) {
        mo59131c1(C14147n.C14157j.contentsquare_preferences, str);
        C19232h requireActivity = requireActivity();
        if (requireActivity != null) {
            SettingsActivity settingsActivity = (SettingsActivity) requireActivity;
            C14843x xVar = settingsActivity.f34959X0;
            Intrinsics.checkNotNullExpressionValue(xVar, "settingsActivity.mInAppPreferenceDataStore");
            this.f35385Z = xVar;
            C14740t7 t7Var = settingsActivity.f34960Y0;
            Intrinsics.checkNotNullExpressionValue(t7Var, "settingsActivity.mSettingsViewModel");
            this.f35382E0 = t7Var;
            C14843x xVar2 = this.f35385Z;
            if (xVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inAppPreferenceDataStore");
            }
            this.f35384G0 = new C14445j8(this, xVar2);
            mo35158q1();
            mo35145G1();
            mo35162u1();
            mo35158q1();
            mo35159r1();
            mo35163v1();
            mo35157p1();
            mo35156o1();
            mo35160s1();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.contentsquare.android.internal.features.clientmode.ui.settings.SettingsActivity");
    }

    /* renamed from: d */
    public final void mo35148d(String str) {
        String string = getString(C14147n.C14155h.contentsquare_developer_session_replay_url_key);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.conte…r_session_replay_url_key)");
        EditTextPreference editTextPreference = (EditTextPreference) mo58761f0(string);
        if (editTextPreference != null) {
            C14843x xVar = this.f35385Z;
            if (xVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inAppPreferenceDataStore");
            }
            editTextPreference.mo58858S2(xVar);
            C14843x xVar2 = this.f35385Z;
            if (xVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inAppPreferenceDataStore");
            }
            String e = xVar2.mo36778e(string, str);
            editTextPreference.mo58773E3(e);
            editTextPreference.mo58798X2(e);
            editTextPreference.mo58852O2(mo35155n1());
        }
    }

    /* renamed from: e1 */
    public final Preference.C19901c mo35149e1() {
        return new C14328a(this);
    }

    /* renamed from: h1 */
    public final Preference.C19901c mo35150h1() {
        return new C14329b(this);
    }

    /* renamed from: j */
    public final void mo35151j(boolean z) {
        PreferenceCategory preferenceCategory = (PreferenceCategory) mo58761f0(getString(C14147n.C14155h.contentsquare_settings_session_replay_category_key));
        if (preferenceCategory != null) {
            preferenceCategory.mo58875c3(z);
        }
    }

    /* renamed from: j1 */
    public final void mo35152j1(boolean z) {
        String string = getString(C14147n.C14155h.contentsquare_settings_log_visualizer_user_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.conte…s_log_visualizer_user_id)");
        EditTextPreference editTextPreference = (EditTextPreference) mo58761f0(string);
        if (editTextPreference != null) {
            editTextPreference.mo58875c3(z);
        }
    }

    /* renamed from: k1 */
    public final Preference.C19902d mo35153k1() {
        return new C14330c(this);
    }

    /* renamed from: m1 */
    public final Preference.C19901c mo35154m1() {
        return new C14331d(this);
    }

    /* renamed from: n1 */
    public final Preference.C19901c mo35155n1() {
        return new C14332e(this);
    }

    /* renamed from: o1 */
    public final void mo35156o1() {
        C14740t7 t7Var = this.f35382E0;
        if (t7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingsViewModel");
        }
        Boolean d = t7Var.mo36497d();
        Intrinsics.checkNotNullExpressionValue(d, "settingsViewModel.developerModeActivationState");
        if (d.booleanValue()) {
            PreferenceScreen N0 = mo59117N0();
            PreferenceCategory preferenceCategory = this.f35383F0;
            if (preferenceCategory == null) {
                Intrinsics.throwUninitializedPropertyAccessException("developerPreferenceCategory");
            }
            N0.mo58937l3(preferenceCategory);
            mo35164w1();
            mo35139A1();
            mo35141C1();
            mo35142D1();
            mo35165x1();
            mo35166y1();
            mo35167z1();
            mo35144F1();
            mo35140B1();
        }
    }

    /* renamed from: p1 */
    public final void mo35157p1() {
        C14740t7 t7Var = this.f35382E0;
        if (t7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingsViewModel");
        }
        Boolean f = t7Var.mo36499f();
        Intrinsics.checkNotNullExpressionValue(f, "settingsViewModel.featur…SessionReplayEnabledState");
        if (f.booleanValue()) {
            mo35151j(true);
            mo35143E1();
            return;
        }
        mo35151j(false);
    }

    /* renamed from: q1 */
    public final void mo35158q1() {
        Preference f0 = mo58761f0(getString(C14147n.C14155h.contentsquare_settings_preference_screen_key));
        Intrinsics.checkNotNull(f0);
        mo59130b1((PreferenceScreen) f0);
        Preference f02 = mo58761f0(getString(C14147n.C14155h.contentsquare_developer_category_key));
        Intrinsics.checkNotNull(f02);
        PreferenceCategory preferenceCategory = (PreferenceCategory) f02;
        this.f35383F0 = preferenceCategory;
        if (preferenceCategory == null) {
            Intrinsics.throwUninitializedPropertyAccessException("developerPreferenceCategory");
        }
        C14740t7 t7Var = this.f35382E0;
        if (t7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingsViewModel");
        }
        Boolean d = t7Var.mo36497d();
        Intrinsics.checkNotNullExpressionValue(d, "settingsViewModel.developerModeActivationState");
        preferenceCategory.mo58875c3(d.booleanValue());
    }

    /* renamed from: r1 */
    public final void mo35159r1() {
        C14445j8 j8Var = this.f35384G0;
        if (j8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setupCustomPreferenceDateStore");
        }
        CustomPreference customPreference = (CustomPreference) j8Var.mo35642e(C14147n.C14155h.contentsquare_disable_in_app_feature_key);
        if (customPreference != null) {
            customPreference.mo58853P2(new C14333f(this));
        }
    }

    /* renamed from: s1 */
    public final void mo35160s1() {
        mo35161t1();
        C14740t7 t7Var = this.f35382E0;
        if (t7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingsViewModel");
        }
        Boolean g = t7Var.mo36500g();
        Intrinsics.checkNotNullExpressionValue(g, "settingsViewModel.logVisualizerActivationState");
        mo35152j1(g.booleanValue());
        mo35146H1();
    }

    /* renamed from: t1 */
    public final void mo35161t1() {
        C14445j8 j8Var = this.f35384G0;
        if (j8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setupCustomPreferenceDateStore");
        }
        SwitchPreferenceCompat b = j8Var.mo35640b(C14147n.C14155h.contentsquare_log_visualizer_key, false);
        if (b != null) {
            b.mo58852O2(mo35150h1());
        }
    }

    /* renamed from: u1 */
    public final void mo35162u1() {
        C14445j8 j8Var = this.f35384G0;
        if (j8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setupCustomPreferenceDateStore");
        }
        C14445j8.m62203c(j8Var, C14147n.C14155h.contentsquare_god_mode, false, 2, (Object) null);
    }

    /* renamed from: v1 */
    public final void mo35163v1() {
        C14445j8 j8Var = this.f35384G0;
        if (j8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setupCustomPreferenceDateStore");
        }
        Preference e = j8Var.mo35642e(C14147n.C14155h.contentsquare_get_replay_link_key);
        if (e != null) {
            if (!C14731t1.m63479h()) {
                e.mo58829E2(false);
                e.mo58870a3("");
                e.mo58798X2(getString(C14147n.C14155h.contentsquare_settings_replay_link_summary_disabled));
            }
            e.mo58853P2(mo35153k1());
        }
    }

    /* renamed from: w1 */
    public final void mo35164w1() {
        C14445j8 j8Var = this.f35384G0;
        if (j8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setupCustomPreferenceDateStore");
        }
        C14445j8.m62203c(j8Var, C14147n.C14155h.contentsquare_developer_session_replay_force_start_key, false, 2, (Object) null);
    }

    /* renamed from: x1 */
    public final void mo35165x1() {
        C14445j8 j8Var = this.f35384G0;
        if (j8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setupCustomPreferenceDateStore");
        }
        SwitchPreferenceCompat c = C14445j8.m62203c(j8Var, C14147n.C14155h.contentsquare_developer_session_replay_force_quality_level_key, false, 2, (Object) null);
        if (c != null) {
            c.mo58852O2(mo35149e1());
        }
    }

    /* renamed from: y1 */
    public final void mo35166y1() {
        C14740t7 t7Var = this.f35382E0;
        if (t7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingsViewModel");
        }
        Boolean i = t7Var.mo36502i();
        C14445j8 j8Var = this.f35384G0;
        if (j8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setupCustomPreferenceDateStore");
        }
        int i2 = C14147n.C14155h.contentsquare_developer_session_replay_force_fps_key;
        C14740t7 t7Var2 = this.f35382E0;
        if (t7Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingsViewModel");
        }
        int j = t7Var2.mo36503j();
        Intrinsics.checkNotNullExpressionValue(i, "isForcedQuality");
        j8Var.mo35639a(i2, j, i.booleanValue());
    }

    /* renamed from: z1 */
    public final void mo35167z1() {
        C14740t7 t7Var = this.f35382E0;
        if (t7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingsViewModel");
        }
        Boolean i = t7Var.mo36502i();
        C14445j8 j8Var = this.f35384G0;
        if (j8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setupCustomPreferenceDateStore");
        }
        int i2 = C14147n.C14155h.contentsquare_developer_session_replay_image_quality_key;
        C14740t7 t7Var2 = this.f35382E0;
        if (t7Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingsViewModel");
        }
        int k = t7Var2.mo36504k();
        Intrinsics.checkNotNullExpressionValue(i, "isForcedQuality");
        j8Var.mo35639a(i2, k, i.booleanValue());
    }
}
