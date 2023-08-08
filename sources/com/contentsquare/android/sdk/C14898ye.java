package com.contentsquare.android.sdk;

import android.view.ViewGroup;
import com.contentsquare.android.sdk.C14466k4;
import com.contentsquare.android.sdk.C14647qa;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import kotlin.C11079d2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* renamed from: com.contentsquare.android.sdk.ye */
public final class C14898ye implements C14411i1 {

    /* renamed from: a */
    public final C14453jf f36952a = new C14453jf("ScreenRecorder");

    /* renamed from: b */
    public final C14476k7 f36953b;

    /* renamed from: c */
    public final C14225bd f36954c;

    /* renamed from: d */
    public final C14856xa f36955d;

    /* renamed from: e */
    public final C14533md<C14899a> f36956e;

    /* renamed from: f */
    public final C14213b7 f36957f;

    /* renamed from: g */
    public final C14771u6 f36958g;

    /* renamed from: h */
    public final C14922z7 f36959h;

    /* renamed from: com.contentsquare.android.sdk.ye$a */
    public static abstract class C14899a {

        /* renamed from: com.contentsquare.android.sdk.ye$a$a */
        public static final class C14900a extends C14899a {

            /* renamed from: a */
            public final C14901b f36960a;

            /* renamed from: b */
            public final String f36961b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C14900a(C14901b bVar, String str) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(bVar, "failureReason");
                Intrinsics.checkNotNullParameter(str, "screenName");
                this.f36960a = bVar;
                this.f36961b = str;
            }

            /* renamed from: a */
            public final C14901b mo36938a() {
                return this.f36960a;
            }

            /* renamed from: b */
            public final String mo36939b() {
                return this.f36961b;
            }
        }

        /* renamed from: com.contentsquare.android.sdk.ye$a$b */
        public static abstract class C14901b {

            /* renamed from: com.contentsquare.android.sdk.ye$a$b$a */
            public static final class C14902a extends C14901b {

                /* renamed from: a */
                public static final C14902a f36962a = new C14902a();

                public C14902a() {
                    super((DefaultConstructorMarker) null);
                }
            }

            /* renamed from: com.contentsquare.android.sdk.ye$a$b$b */
            public static final class C14903b extends C14901b {

                /* renamed from: a */
                public static final C14903b f36963a = new C14903b();

                public C14903b() {
                    super((DefaultConstructorMarker) null);
                }
            }

            /* renamed from: com.contentsquare.android.sdk.ye$a$b$c */
            public static final class C14904c extends C14901b {

                /* renamed from: a */
                public static final C14904c f36964a = new C14904c();

                public C14904c() {
                    super((DefaultConstructorMarker) null);
                }
            }

            public C14901b() {
            }

            public /* synthetic */ C14901b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.contentsquare.android.sdk.ye$a$c */
        public static final class C14905c extends C14899a {

            /* renamed from: a */
            public static final C14905c f36965a = new C14905c();

            public C14905c() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: com.contentsquare.android.sdk.ye$a$d */
        public static final class C14906d extends C14899a {

            /* renamed from: a */
            public static final C14906d f36966a = new C14906d();

            public C14906d() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: com.contentsquare.android.sdk.ye$a$e */
        public static final class C14907e extends C14899a {

            /* renamed from: a */
            public static final C14907e f36967a = new C14907e();

            public C14907e() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: com.contentsquare.android.sdk.ye$a$f */
        public static final class C14908f extends C14899a {

            /* renamed from: a */
            public static final C14908f f36968a = new C14908f();

            public C14908f() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: com.contentsquare.android.sdk.ye$a$g */
        public static final class C14909g extends C14899a {

            /* renamed from: a */
            public final String f36969a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C14909g(String str) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "screenName");
                this.f36969a = str;
            }

            /* renamed from: a */
            public final String mo36940a() {
                return this.f36969a;
            }
        }

        public C14899a() {
        }

        public /* synthetic */ C14899a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14898ye(C14476k7 k7Var, C14225bd bdVar, C14856xa xaVar, C14533md<C14899a> mdVar, C14213b7 b7Var, C14771u6 u6Var, C14922z7 z7Var) {
        Intrinsics.checkNotNullParameter(k7Var, "deviceInfo");
        Intrinsics.checkNotNullParameter(bdVar, "screenGraphProducer");
        Intrinsics.checkNotNullParameter(xaVar, "screenCaptureProcessor");
        Intrinsics.checkNotNullParameter(mdVar, "statusRepository");
        Intrinsics.checkNotNullParameter(b7Var, "preferencesStore");
        Intrinsics.checkNotNullParameter(u6Var, BannerConfigurableFragment.f27258E0);
        Intrinsics.checkNotNullParameter(z7Var, "configurationProjectChooser");
        this.f36953b = k7Var;
        this.f36954c = bdVar;
        this.f36955d = xaVar;
        this.f36956e = mdVar;
        this.f36957f = b7Var;
        this.f36958g = u6Var;
        this.f36959h = z7Var;
    }

    /* renamed from: a */
    public void mo35514a(C14749tb tbVar, String str, boolean z) {
        Intrinsics.checkNotNullParameter(tbVar, "screenGraph");
        Intrinsics.checkNotNullParameter(str, "encodedScreenshot");
        mo36937e(tbVar, str, z);
    }

    /* renamed from: b */
    public final C14533md<C14899a> mo36934b() {
        return this.f36956e;
    }

    /* renamed from: c */
    public final void mo36935c(ViewGroup viewGroup, String str, String str2) {
        C14533md<C14899a> mdVar;
        C14899a.C14900a aVar;
        this.f36956e.mo34827b(C14899a.C14906d.f36966a);
        if (str2 == null) {
            str2 = "";
        }
        if (str == null) {
            this.f36952a.mo35681l("Failed to capture screen, no screenview", new Object[0]);
            mdVar = this.f36956e;
            aVar = new C14899a.C14900a(C14899a.C14901b.C14903b.f36963a, str2);
        } else if (viewGroup == null) {
            this.f36952a.mo35681l("Failed to capture screen, decorView is null", new Object[0]);
            mdVar = this.f36956e;
            aVar = new C14899a.C14900a(C14899a.C14901b.C14904c.f36964a, str2);
        } else {
            try {
                this.f36954c.mo34716d(viewGroup, str, str2, this);
                return;
            } catch (IllegalArgumentException e) {
                this.f36952a.mo35678g(e, "Failed to capture screen.", new Object[0]);
                this.f36956e.mo34827b(new C14899a.C14900a(mo36936d(e) ? C14899a.C14901b.C14902a.f36962a : C14899a.C14901b.C14904c.f36964a, str2));
                return;
            }
        }
        mdVar.mo34827b(aVar);
    }

    /* renamed from: d */
    public final boolean mo36936d(IllegalArgumentException illegalArgumentException) {
        String message = illegalArgumentException.getMessage();
        return message != null && StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "hardware bitmap", false, 2, (Object) null);
    }

    /* renamed from: e */
    public final void mo36937e(C14749tb tbVar, String str, boolean z) {
        C14466k4 c = this.f36958g.mo36561c();
        if (c != null) {
            C14647qa qaVar = new C14647qa();
            Intrinsics.checkNotNullExpressionValue(c, "rawConfiguration");
            qaVar.mo36244j(c.mo35709a());
            qaVar.mo36237c(this.f36953b.mo35763m());
            qaVar.mo36238d(z ? C14647qa.C14648a.Fullscreen : C14647qa.C14648a.PerViews);
            qaVar.mo36242h(this.f36953b.mo35762l());
            qaVar.mo36246l(this.f36953b.mo35769s());
            qaVar.mo36236b((double) this.f36953b.mo35768r());
            C14527ma i = this.f36953b.mo35759i();
            Intrinsics.checkNotNullExpressionValue(i, "deviceInfo.buildInformation");
            qaVar.mo36249o(i.mo35917i());
            qaVar.mo36251q("2");
            C14527ma i2 = this.f36953b.mo35759i();
            Intrinsics.checkNotNullExpressionValue(i2, "deviceInfo.buildInformation");
            qaVar.mo36250p(i2.mo35914e());
            qaVar.mo36245k(this.f36957f.mo34673e(C14477k8.INAPP_USER_ID, (String) null));
            qaVar.mo36243i(this.f36953b.mo35765o());
            qaVar.mo36240f(this.f36953b.mo35764n());
            qaVar.mo36248n(tbVar.mo36522d());
            qaVar.mo36239e(tbVar);
            qaVar.mo36247m(str);
            C14466k4.C14471e a = this.f36959h.mo36945a(c, this.f36957f.mo34676h(C14477k8.CLIENT_MODE_GOD_MODE, false));
            Intrinsics.checkNotNullExpressionValue(a, "configurationProjectChoo…guration, godModeEnabled)");
            C14466k4.C14467a c2 = a.mo35725c();
            Intrinsics.checkNotNullExpressionValue(c2, "configurationProjectChoo…              .clientMode");
            String b = c2.mo35714b();
            Intrinsics.checkNotNullExpressionValue(b, "configurationProjectChoo…ientMode.snapshotEndpoint");
            String d = C14920z5.m64194d(b);
            Intrinsics.checkNotNullExpressionValue(d, "UriBuilder.buildScreengraphUrl(serverName)");
            if (this.f36955d.mo36820a(qaVar, d) != null) {
                return;
            }
        }
        this.f36952a.mo35681l("The raw configuration living in configuration shouldn't be null", new Object[0]);
        C11079d2 d2Var = C11079d2.f28267a;
    }
}
