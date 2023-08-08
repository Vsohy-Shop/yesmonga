package androidx.browser.trusted;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.browser.customtabs.C0901a;
import androidx.browser.customtabs.C0912d;
import androidx.browser.customtabs.C0924h;
import androidx.browser.customtabs.C0934m;
import androidx.browser.trusted.C0985y;
import androidx.browser.trusted.sharing.C0972a;
import androidx.browser.trusted.sharing.C0973b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.browser.trusted.a0 */
public class C0936a0 {
    @SuppressLint({"ActionValue"})

    /* renamed from: i */
    public static final String f2950i = "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS";
    @SuppressLint({"ActionValue"})

    /* renamed from: j */
    public static final String f2951j = "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS";

    /* renamed from: k */
    public static final String f2952k = "androidx.browser.trusted.extra.SHARE_TARGET";

    /* renamed from: l */
    public static final String f2953l = "androidx.browser.trusted.extra.SHARE_DATA";

    /* renamed from: m */
    public static final String f2954m = "androidx.browser.trusted.extra.DISPLAY_MODE";

    /* renamed from: n */
    public static final String f2955n = "androidx.browser.trusted.extra.SCREEN_ORIENTATION";
    @C0359n0

    /* renamed from: a */
    public final Uri f2956a;
    @C0359n0

    /* renamed from: b */
    public final C0912d.C0913a f2957b = new C0912d.C0913a();
    @C0363p0

    /* renamed from: c */
    public List<String> f2958c;
    @C0363p0

    /* renamed from: d */
    public Bundle f2959d;
    @C0363p0

    /* renamed from: e */
    public C0972a f2960e;
    @C0363p0

    /* renamed from: f */
    public C0973b f2961f;
    @C0359n0

    /* renamed from: g */
    public C0985y f2962g = new C0985y.C0986a();

    /* renamed from: h */
    public int f2963h = 0;

    public C0936a0(@C0359n0 Uri uri) {
        this.f2956a = uri;
    }

    @C0359n0
    /* renamed from: a */
    public C0988z mo4002a(@C0359n0 C0924h hVar) {
        if (hVar != null) {
            this.f2957b.mo3936t(hVar);
            Intent intent = this.f2957b.mo3920d().f2893a;
            intent.setData(this.f2956a);
            intent.putExtra(C0934m.f2947a, true);
            if (this.f2958c != null) {
                intent.putExtra(f2951j, new ArrayList(this.f2958c));
            }
            Bundle bundle = this.f2959d;
            if (bundle != null) {
                intent.putExtra(f2950i, bundle);
            }
            List<Uri> emptyList = Collections.emptyList();
            C0973b bVar = this.f2961f;
            if (!(bVar == null || this.f2960e == null)) {
                intent.putExtra(f2952k, bVar.mo4062b());
                intent.putExtra(f2953l, this.f2960e.mo4061b());
                List<Uri> list = this.f2960e.f3026c;
                if (list != null) {
                    emptyList = list;
                }
            }
            intent.putExtra(f2954m, this.f2962g.mo4077a());
            intent.putExtra(f2955n, this.f2963h);
            return new C0988z(intent, emptyList);
        }
        throw new NullPointerException("CustomTabsSession is required for launching a TWA");
    }

    @C0359n0
    /* renamed from: b */
    public C0912d mo4003b() {
        return this.f2957b.mo3920d();
    }

    @C0359n0
    /* renamed from: c */
    public C0985y mo4004c() {
        return this.f2962g;
    }

    @C0359n0
    /* renamed from: d */
    public Uri mo4005d() {
        return this.f2956a;
    }

    @C0359n0
    /* renamed from: e */
    public C0936a0 mo4006e(@C0359n0 List<String> list) {
        this.f2958c = list;
        return this;
    }

    @C0359n0
    /* renamed from: f */
    public C0936a0 mo4007f(int i) {
        this.f2957b.mo3925i(i);
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public C0936a0 mo4008g(int i, @C0359n0 C0901a aVar) {
        this.f2957b.mo3926j(i, aVar);
        return this;
    }

    @C0359n0
    /* renamed from: h */
    public C0936a0 mo4009h(@C0359n0 C0901a aVar) {
        this.f2957b.mo3927k(aVar);
        return this;
    }

    @C0359n0
    /* renamed from: i */
    public C0936a0 mo4010i(@C0359n0 C0985y yVar) {
        this.f2962g = yVar;
        return this;
    }

    @C0359n0
    /* renamed from: j */
    public C0936a0 mo4011j(@C0354l int i) {
        this.f2957b.mo3931o(i);
        return this;
    }

    @C0359n0
    /* renamed from: k */
    public C0936a0 mo4012k(@C0354l int i) {
        this.f2957b.mo3932p(i);
        return this;
    }

    @C0359n0
    /* renamed from: l */
    public C0936a0 mo4013l(int i) {
        this.f2963h = i;
        return this;
    }

    @C0359n0
    /* renamed from: m */
    public C0936a0 mo4014m(@C0359n0 C0973b bVar, @C0359n0 C0972a aVar) {
        this.f2961f = bVar;
        this.f2960e = aVar;
        return this;
    }

    @C0359n0
    /* renamed from: n */
    public C0936a0 mo4015n(@C0359n0 Bundle bundle) {
        this.f2959d = bundle;
        return this;
    }

    @C0359n0
    /* renamed from: o */
    public C0936a0 mo4016o(@C0354l int i) {
        this.f2957b.mo3941y(i);
        return this;
    }
}
