package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.errorprone.annotations.C32488a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.common.a */
public final class C40469a {

    /* renamed from: com.google.android.gms.common.a$a */
    public static class C40470a {
        @C0363p0

        /* renamed from: a */
        public Account f103158a;

        /* renamed from: b */
        public boolean f103159b;
        @C0363p0

        /* renamed from: c */
        public ArrayList f103160c;
        @C0363p0

        /* renamed from: d */
        public ArrayList f103161d;

        /* renamed from: e */
        public boolean f103162e;
        @C0363p0

        /* renamed from: f */
        public String f103163f;
        @C0363p0

        /* renamed from: g */
        public Bundle f103164g;

        /* renamed from: h */
        public boolean f103165h;

        /* renamed from: i */
        public int f103166i;
        @C0363p0

        /* renamed from: j */
        public String f103167j;

        /* renamed from: k */
        public boolean f103168k;
        @C0363p0

        /* renamed from: l */
        public C41003w f103169l;
        @C0363p0

        /* renamed from: m */
        public String f103170m;

        /* renamed from: n */
        public boolean f103171n;

        /* renamed from: o */
        public boolean f103172o;

        /* renamed from: com.google.android.gms.common.a$a$a */
        public static class C40471a {
            @C0363p0

            /* renamed from: a */
            public Account f103173a;
            @C0363p0

            /* renamed from: b */
            public ArrayList f103174b;
            @C0363p0

            /* renamed from: c */
            public ArrayList f103175c;

            /* renamed from: d */
            public boolean f103176d = false;
            @C0363p0

            /* renamed from: e */
            public String f103177e;
            @C0363p0

            /* renamed from: f */
            public Bundle f103178f;

            @C0359n0
            /* renamed from: a */
            public C40470a mo133620a() {
                C40843u.m166192b(true, "We only support hostedDomain filter for account chip styled account picker");
                C40843u.m166192b(true, "Consent is only valid for account chip styled account picker");
                C40470a aVar = new C40470a();
                aVar.f103161d = this.f103175c;
                aVar.f103160c = this.f103174b;
                aVar.f103162e = this.f103176d;
                aVar.f103169l = null;
                aVar.f103167j = null;
                aVar.f103164g = this.f103178f;
                aVar.f103158a = this.f103173a;
                aVar.f103159b = false;
                aVar.f103165h = false;
                aVar.f103170m = null;
                aVar.f103166i = 0;
                aVar.f103163f = this.f103177e;
                aVar.f103168k = false;
                aVar.f103171n = false;
                aVar.f103172o = false;
                return aVar;
            }

            @C0359n0
            @C32488a
            /* renamed from: b */
            public C40471a mo133621b(@C0363p0 List<Account> list) {
                this.f103174b = list == null ? null : new ArrayList(list);
                return this;
            }

            @C0359n0
            @C32488a
            /* renamed from: c */
            public C40471a mo133622c(@C0363p0 List<String> list) {
                this.f103175c = list == null ? null : new ArrayList(list);
                return this;
            }

            @C0359n0
            @C32488a
            /* renamed from: d */
            public C40471a mo133623d(boolean z) {
                this.f103176d = z;
                return this;
            }

            @C0359n0
            @C32488a
            /* renamed from: e */
            public C40471a mo133624e(@C0363p0 Bundle bundle) {
                this.f103178f = bundle;
                return this;
            }

            @C0359n0
            @C32488a
            /* renamed from: f */
            public C40471a mo133625f(@C0363p0 Account account) {
                this.f103173a = account;
                return this;
            }

            @C0359n0
            @C32488a
            /* renamed from: g */
            public C40471a mo133626g(@C0363p0 String str) {
                this.f103177e = str;
                return this;
            }
        }
    }

    @C0359n0
    @Deprecated
    /* renamed from: a */
    public static Intent m164656a(@C0363p0 Account account, @C0363p0 ArrayList<Account> arrayList, @C0363p0 String[] strArr, boolean z, @C0363p0 String str, @C0363p0 String str2, @C0363p0 String[] strArr2, @C0363p0 Bundle bundle) {
        Intent intent = new Intent();
        C40843u.m166192b(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        return intent;
    }

    @C0359n0
    /* renamed from: b */
    public static Intent m164657b(@C0359n0 C40470a aVar) {
        Intent intent = new Intent();
        boolean unused = aVar.f103168k;
        String unused2 = aVar.f103167j;
        C40843u.m166192b(true, "We only support hostedDomain filter for account chip styled account picker");
        C41003w unused3 = aVar.f103169l;
        C40843u.m166192b(true, "Consent is only valid for account chip styled account picker");
        boolean unused4 = aVar.f103159b;
        C40843u.m166192b(true, "Making the selected account non-clickable is only supported for the theme THEME_DAY_NIGHT_GOOGLE_MATERIAL2");
        boolean unused5 = aVar.f103168k;
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", aVar.f103160c);
        if (aVar.f103161d != null) {
            intent.putExtra("allowableAccountTypes", (String[]) aVar.f103161d.toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", aVar.f103164g);
        intent.putExtra("selectedAccount", aVar.f103158a);
        boolean unused6 = aVar.f103159b;
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", aVar.f103162e);
        intent.putExtra("descriptionTextOverride", aVar.f103163f);
        boolean unused7 = aVar.f103165h;
        intent.putExtra("setGmsCoreAccount", false);
        String unused8 = aVar.f103170m;
        intent.putExtra("realClientPackage", (String) null);
        int unused9 = aVar.f103166i;
        intent.putExtra("overrideTheme", 0);
        boolean unused10 = aVar.f103168k;
        intent.putExtra("overrideCustomTheme", 0);
        String unused11 = aVar.f103167j;
        intent.putExtra("hostedDomainFilter", (String) null);
        Bundle bundle = new Bundle();
        boolean unused12 = aVar.f103168k;
        C41003w unused13 = aVar.f103169l;
        boolean unused14 = aVar.f103171n;
        boolean unused15 = aVar.f103172o;
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
