package com.google.firebase.installations.local;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.auto.value.C32455c;
import com.google.firebase.installations.local.C33090a;
import com.google.firebase.installations.local.PersistedInstallation;

@C32455c
/* renamed from: com.google.firebase.installations.local.c */
public abstract class C33094c {
    @C0359n0

    /* renamed from: a */
    public static C33094c f80285a = m133503a().mo95839a();

    @C32455c.C32456a
    /* renamed from: com.google.firebase.installations.local.c$a */
    public static abstract class C33095a {
        @C0359n0
        /* renamed from: a */
        public abstract C33094c mo95839a();

        @C0359n0
        /* renamed from: b */
        public abstract C33095a mo95840b(@C0363p0 String str);

        @C0359n0
        /* renamed from: c */
        public abstract C33095a mo95841c(long j);

        @C0359n0
        /* renamed from: d */
        public abstract C33095a mo95842d(@C0359n0 String str);

        @C0359n0
        /* renamed from: e */
        public abstract C33095a mo95843e(@C0363p0 String str);

        @C0359n0
        /* renamed from: f */
        public abstract C33095a mo95844f(@C0363p0 String str);

        @C0359n0
        /* renamed from: g */
        public abstract C33095a mo95845g(@C0359n0 PersistedInstallation.RegistrationStatus registrationStatus);

        @C0359n0
        /* renamed from: h */
        public abstract C33095a mo95846h(long j);
    }

    @C0359n0
    /* renamed from: a */
    public static C33095a m133503a() {
        return new C33090a.C33092b().mo95846h(0).mo95845g(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION).mo95841c(0);
    }

    @C0363p0
    /* renamed from: b */
    public abstract String mo95828b();

    /* renamed from: c */
    public abstract long mo95829c();

    @C0363p0
    /* renamed from: d */
    public abstract String mo95830d();

    @C0363p0
    /* renamed from: e */
    public abstract String mo95831e();

    @C0363p0
    /* renamed from: f */
    public abstract String mo95833f();

    @C0359n0
    /* renamed from: g */
    public abstract PersistedInstallation.RegistrationStatus mo95834g();

    /* renamed from: h */
    public abstract long mo95835h();

    /* renamed from: i */
    public boolean mo95854i() {
        return mo95834g() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean mo95855j() {
        if (mo95834g() == PersistedInstallation.RegistrationStatus.NOT_GENERATED || mo95834g() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo95856k() {
        return mo95834g() == PersistedInstallation.RegistrationStatus.REGISTERED;
    }

    /* renamed from: l */
    public boolean mo95857l() {
        return mo95834g() == PersistedInstallation.RegistrationStatus.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean mo95858m() {
        return mo95834g() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    @C0359n0
    /* renamed from: n */
    public abstract C33095a mo95837n();

    @C0359n0
    /* renamed from: o */
    public C33094c mo95859o(@C0359n0 String str, long j, long j2) {
        return mo95837n().mo95840b(str).mo95841c(j).mo95846h(j2).mo95839a();
    }

    @C0359n0
    /* renamed from: p */
    public C33094c mo95860p() {
        return mo95837n().mo95840b((String) null).mo95839a();
    }

    @C0359n0
    /* renamed from: q */
    public C33094c mo95861q(@C0359n0 String str) {
        return mo95837n().mo95843e(str).mo95845g(PersistedInstallation.RegistrationStatus.REGISTER_ERROR).mo95839a();
    }

    @C0359n0
    /* renamed from: r */
    public C33094c mo95862r() {
        return mo95837n().mo95845g(PersistedInstallation.RegistrationStatus.NOT_GENERATED).mo95839a();
    }

    @C0359n0
    /* renamed from: s */
    public C33094c mo95863s(@C0359n0 String str, @C0359n0 String str2, long j, @C0363p0 String str3, long j2) {
        return mo95837n().mo95842d(str).mo95845g(PersistedInstallation.RegistrationStatus.REGISTERED).mo95840b(str3).mo95844f(str2).mo95841c(j2).mo95846h(j).mo95839a();
    }

    @C0359n0
    /* renamed from: t */
    public C33094c mo95864t(@C0359n0 String str) {
        return mo95837n().mo95842d(str).mo95845g(PersistedInstallation.RegistrationStatus.UNREGISTERED).mo95839a();
    }
}
