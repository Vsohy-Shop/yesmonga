package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.content.C17318d;

/* renamed from: androidx.preference.s */
public class C19966s {

    /* renamed from: o */
    public static final String f51098o = "_has_set_default_values";

    /* renamed from: p */
    public static final int f51099p = 0;

    /* renamed from: q */
    public static final int f51100q = 1;

    /* renamed from: a */
    public final Context f51101a;

    /* renamed from: b */
    public long f51102b = 0;
    @C0363p0

    /* renamed from: c */
    public SharedPreferences f51103c;
    @C0363p0

    /* renamed from: d */
    public C19928i f51104d;
    @C0363p0

    /* renamed from: e */
    public SharedPreferences.Editor f51105e;

    /* renamed from: f */
    public boolean f51106f;

    /* renamed from: g */
    public String f51107g;

    /* renamed from: h */
    public int f51108h;

    /* renamed from: i */
    public int f51109i = 0;

    /* renamed from: j */
    public PreferenceScreen f51110j;

    /* renamed from: k */
    public C19970d f51111k;

    /* renamed from: l */
    public C19969c f51112l;

    /* renamed from: m */
    public C19967a f51113m;

    /* renamed from: n */
    public C19968b f51114n;

    /* renamed from: androidx.preference.s$a */
    public interface C19967a {
        /* renamed from: u0 */
        void mo59096u0(@C0359n0 Preference preference);
    }

    /* renamed from: androidx.preference.s$b */
    public interface C19968b {
        /* renamed from: R */
        void mo59067R(@C0359n0 PreferenceScreen preferenceScreen);
    }

    /* renamed from: androidx.preference.s$c */
    public interface C19969c {
        /* renamed from: x0 */
        boolean mo59098x0(@C0359n0 Preference preference);
    }

    /* renamed from: androidx.preference.s$d */
    public static abstract class C19970d {
        /* renamed from: a */
        public abstract boolean mo59211a(@C0359n0 Preference preference, @C0359n0 Preference preference2);

        /* renamed from: b */
        public abstract boolean mo59212b(@C0359n0 Preference preference, @C0359n0 Preference preference2);
    }

    /* renamed from: androidx.preference.s$e */
    public static class C19971e extends C19970d {
        /* renamed from: a */
        public boolean mo59211a(@C0359n0 Preference preference, @C0359n0 Preference preference2) {
            if (preference.getClass() != preference2.getClass()) {
                return false;
            }
            if ((preference == preference2 && preference.mo58891j3()) || !TextUtils.equals(preference.mo58890j1(), preference2.mo58890j1()) || !TextUtils.equals(preference.mo58797U0(), preference2.mo58797U0())) {
                return false;
            }
            Drawable f0 = preference.mo58880f0();
            Drawable f02 = preference2.mo58880f0();
            if ((f0 != f02 && (f0 == null || !f0.equals(f02))) || preference.mo58903q1() != preference2.mo58903q1() || preference.mo58821A1() != preference2.mo58821A1()) {
                return false;
            }
            if ((preference instanceof TwoStatePreference) && ((TwoStatePreference) preference).mo59010n3() != ((TwoStatePreference) preference2).mo59010n3()) {
                return false;
            }
            if (!(preference instanceof DropDownPreference) || preference == preference2) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo59212b(@C0359n0 Preference preference, @C0359n0 Preference preference2) {
            return preference.mo58884h0() == preference2.mo58884h0();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public C19966s(@C0359n0 Context context) {
        this.f51101a = context;
        mo59185E(m92858f(context));
    }

    /* renamed from: d */
    public static SharedPreferences m92856d(@C0359n0 Context context) {
        return context.getSharedPreferences(m92858f(context), m92857e());
    }

    /* renamed from: e */
    public static int m92857e() {
        return 0;
    }

    /* renamed from: f */
    public static String m92858f(Context context) {
        return context.getPackageName() + "_preferences";
    }

    /* renamed from: u */
    public static void m92859u(@C0359n0 Context context, int i, boolean z) {
        m92860v(context, m92858f(context), m92857e(), i, z);
    }

    /* renamed from: v */
    public static void m92860v(@C0359n0 Context context, String str, int i, int i2, boolean z) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f51098o, 0);
        if (z || !sharedPreferences.getBoolean(f51098o, false)) {
            C19966s sVar = new C19966s(context);
            sVar.mo59185E(str);
            sVar.mo59184D(i);
            sVar.mo59204r(context, i2, (PreferenceScreen) null);
            sharedPreferences.edit().putBoolean(f51098o, true).apply();
        }
    }

    /* renamed from: A */
    public void mo59181A(@C0363p0 C19970d dVar) {
        this.f51111k = dVar;
    }

    /* renamed from: B */
    public void mo59182B(@C0363p0 C19928i iVar) {
        this.f51104d = iVar;
    }

    /* renamed from: C */
    public boolean mo59183C(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f51110j;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.mo58866Y1();
        }
        this.f51110j = preferenceScreen;
        return true;
    }

    /* renamed from: D */
    public void mo59184D(int i) {
        this.f51108h = i;
        this.f51103c = null;
    }

    /* renamed from: E */
    public void mo59185E(String str) {
        this.f51107g = str;
        this.f51103c = null;
    }

    /* renamed from: F */
    public void mo59186F() {
        this.f51109i = 0;
        this.f51103c = null;
    }

    /* renamed from: G */
    public void mo59187G() {
        this.f51109i = 1;
        this.f51103c = null;
    }

    /* renamed from: H */
    public boolean mo59188H() {
        return !this.f51106f;
    }

    /* renamed from: I */
    public void mo59189I(@C0359n0 Preference preference) {
        C19967a aVar = this.f51113m;
        if (aVar != null) {
            aVar.mo59096u0(preference);
        }
    }

    @C0359n0
    /* renamed from: a */
    public PreferenceScreen mo59190a(@C0359n0 Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, (AttributeSet) null);
        preferenceScreen.mo58846M1(this);
        return preferenceScreen;
    }

    @C0363p0
    /* renamed from: b */
    public <T extends Preference> T mo59191b(@C0359n0 CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f51110j;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.mo58938m3(charSequence);
    }

    @C0359n0
    /* renamed from: c */
    public Context mo59192c() {
        return this.f51101a;
    }

    @C0363p0
    /* renamed from: g */
    public SharedPreferences.Editor mo59193g() {
        if (this.f51104d != null) {
            return null;
        }
        if (!this.f51106f) {
            return mo59201o().edit();
        }
        if (this.f51105e == null) {
            this.f51105e = mo59201o().edit();
        }
        return this.f51105e;
    }

    /* renamed from: h */
    public long mo59194h() {
        long j;
        synchronized (this) {
            j = this.f51102b;
            this.f51102b = 1 + j;
        }
        return j;
    }

    @C0363p0
    /* renamed from: i */
    public C19967a mo59195i() {
        return this.f51113m;
    }

    @C0363p0
    /* renamed from: j */
    public C19968b mo59196j() {
        return this.f51114n;
    }

    @C0363p0
    /* renamed from: k */
    public C19969c mo59197k() {
        return this.f51112l;
    }

    @C0363p0
    /* renamed from: l */
    public C19970d mo59198l() {
        return this.f51111k;
    }

    @C0363p0
    /* renamed from: m */
    public C19928i mo59199m() {
        return this.f51104d;
    }

    /* renamed from: n */
    public PreferenceScreen mo59200n() {
        return this.f51110j;
    }

    @C0363p0
    /* renamed from: o */
    public SharedPreferences mo59201o() {
        Context context;
        if (mo59199m() != null) {
            return null;
        }
        if (this.f51103c == null) {
            if (this.f51109i != 1) {
                context = this.f51101a;
            } else {
                context = C17318d.m79719b(this.f51101a);
            }
            this.f51103c = context.getSharedPreferences(this.f51107g, this.f51108h);
        }
        return this.f51103c;
    }

    /* renamed from: p */
    public int mo59202p() {
        return this.f51108h;
    }

    /* renamed from: q */
    public String mo59203q() {
        return this.f51107g;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: r */
    public PreferenceScreen mo59204r(@C0359n0 Context context, int i, @C0363p0 PreferenceScreen preferenceScreen) {
        mo59207w(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new C19965r(context, this).mo59174e(i, preferenceScreen);
        preferenceScreen2.mo58846M1(this);
        mo59207w(false);
        return preferenceScreen2;
    }

    /* renamed from: s */
    public boolean mo59205s() {
        return this.f51109i == 0;
    }

    /* renamed from: t */
    public boolean mo59206t() {
        return this.f51109i == 1;
    }

    /* renamed from: w */
    public final void mo59207w(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.f51105e) != null) {
            editor.apply();
        }
        this.f51106f = z;
    }

    /* renamed from: x */
    public void mo59208x(@C0363p0 C19967a aVar) {
        this.f51113m = aVar;
    }

    /* renamed from: y */
    public void mo59209y(@C0363p0 C19968b bVar) {
        this.f51114n = bVar;
    }

    /* renamed from: z */
    public void mo59210z(@C0363p0 C19969c cVar) {
        this.f51112l = cVar;
    }
}
