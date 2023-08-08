package com.urbanairship.messagecenter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.C36040b;
import com.urbanairship.C36044d;
import com.urbanairship.C36059m;
import com.urbanairship.C36064q;
import com.urbanairship.C36071u;
import com.urbanairship.C36075v;
import com.urbanairship.UAirship;
import com.urbanairship.channel.C9008d;
import com.urbanairship.job.C9304f;
import com.urbanairship.job.JobResult;
import com.urbanairship.push.C9493j;
import com.urbanairship.push.C9537t;
import com.urbanairship.push.PushMessage;
import com.urbanairship.util.C9669o0;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.urbanairship.messagecenter.h */
public class C9372h extends C36040b {
    @C0359n0

    /* renamed from: m */
    public static final String f25639m = "com.urbanairship.VIEW_RICH_PUSH_INBOX";
    @C0359n0

    /* renamed from: n */
    public static final String f25640n = "com.urbanairship.VIEW_RICH_PUSH_MESSAGE";
    @C0359n0

    /* renamed from: o */
    public static final String f25641o = "message";
    @C0359n0

    /* renamed from: p */
    public static final String f25642p = "message_center";

    /* renamed from: f */
    public C36064q<C9371g> f25643f;

    /* renamed from: g */
    public final C36075v f25644g;

    /* renamed from: h */
    public final C9537t f25645h;

    /* renamed from: i */
    public final C9353c f25646i;

    /* renamed from: j */
    public C9376c f25647j;

    /* renamed from: k */
    public final C9493j f25648k;

    /* renamed from: l */
    public AtomicBoolean f25649l;

    /* renamed from: com.urbanairship.messagecenter.h$a */
    public class C9373a implements C9493j {
        public C9373a() {
        }

        @C0348i1
        /* renamed from: a */
        public void mo18643a(@C0359n0 PushMessage pushMessage, boolean z) {
            if (!C9669o0.m36224e(pushMessage.mo19189w()) && C9372h.this.mo18999B().mo18929l(pushMessage.mo19189w()) == null) {
                C36059m.m148406b("Received a Rich Push.", new Object[0]);
                C9372h.this.mo18999B().mo18926i();
            }
        }
    }

    /* renamed from: com.urbanairship.messagecenter.h$b */
    public class C9374b implements C36075v.C36077b {

        /* renamed from: com.urbanairship.messagecenter.h$b$a */
        public class C9375a implements Runnable {
            public C9375a() {
            }

            public void run() {
                C9372h.this.mo19006K();
            }
        }

        public C9374b() {
        }

        /* renamed from: a */
        public void mo17533a() {
            C36044d.m148369a().execute(new C9375a());
        }
    }

    /* renamed from: com.urbanairship.messagecenter.h$c */
    public interface C9376c {
        /* renamed from: a */
        boolean mo19009a(@C0363p0 String str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C9372h(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C36075v vVar, @C0359n0 C9008d dVar, @C0359n0 C9537t tVar, @C0359n0 AirshipConfigOptions airshipConfigOptions) {
        this(context, uVar, vVar, new C9353c(context, uVar, dVar, airshipConfigOptions), tVar);
    }

    @C0363p0
    /* renamed from: E */
    public static String m35253E(@C0363p0 Intent intent) {
        if (intent == null || intent.getData() == null || intent.getAction() == null || !"message".equalsIgnoreCase(intent.getData().getScheme())) {
            return null;
        }
        String action = intent.getAction();
        action.hashCode();
        if (action.equals(f25639m) || action.equals(f25640n)) {
            return intent.getData().getSchemeSpecificPart();
        }
        return null;
    }

    @C0359n0
    /* renamed from: H */
    public static C9372h m35254H() {
        return (C9372h) UAirship.m146188Y().mo106211R(C9372h.class);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: A */
    public void mo17591A() {
        this.f25646i.mo18918G();
        this.f25645h.mo19384A0(this.f25648k);
        this.f25649l.set(false);
    }

    @C0359n0
    /* renamed from: B */
    public C9353c mo18999B() {
        return this.f25646i;
    }

    @C0363p0
    /* renamed from: C */
    public C36064q<C9371g> mo19000C() {
        return this.f25643f;
    }

    @C0359n0
    /* renamed from: D */
    public C9420z mo19001D() {
        return this.f25646i.mo18940w();
    }

    /* renamed from: F */
    public void mo19002F(@C0363p0 C9376c cVar) {
        this.f25647j = cVar;
    }

    /* renamed from: G */
    public void mo19003G(@C0363p0 C36064q<C9371g> qVar) {
        this.f25643f = qVar;
    }

    /* renamed from: I */
    public void mo19004I() {
        mo19005J((String) null);
    }

    /* renamed from: J */
    public void mo19005J(@C0363p0 String str) {
        if (!this.f25644g.mo107874h(2)) {
            C36059m.m148421q("Unable to show Message Center. FEATURE_MESSAGE_CENTER is not enabled in PrivacyManager.", new Object[0]);
            return;
        }
        C9376c cVar = this.f25647j;
        if (cVar == null || !cVar.mo19009a(str)) {
            Intent addFlags = new Intent(f25639m).setPackage(mo107785o().getPackageName()).addFlags(805306368);
            if (str != null) {
                addFlags.setData(Uri.fromParts("message", str, (String) null));
            }
            if (addFlags.resolveActivity(mo107785o().getPackageManager()) != null) {
                mo107785o().startActivity(addFlags);
                return;
            }
            if (str != null) {
                addFlags.setAction(f25640n);
                if (addFlags.resolveActivity(mo107785o().getPackageManager()) != null) {
                    mo107785o().startActivity(addFlags);
                    return;
                }
            }
            addFlags.setClass(mo107785o(), MessageCenterActivity.class);
            mo107785o().startActivity(addFlags);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: K */
    public void mo19006K() {
        boolean h = this.f25644g.mo107874h(2);
        this.f25646i.mo18917F(h);
        this.f25646i.mo18919H();
        if (!h) {
            mo17591A();
        } else if (!this.f25649l.getAndSet(true)) {
            C36059m.m148419o("Initializing Inbox...", new Object[0]);
            this.f25645h.mo19396L(this.f25648k);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public int mo17620n() {
        return 2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: r */
    public void mo17625r() {
        super.mo17625r();
        this.f25644g.mo107868a(new C9374b());
        mo19006K();
    }

    /* renamed from: t */
    public boolean mo19007t(@C0359n0 Uri uri) {
        if ("message_center".equals(uri.getEncodedAuthority())) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 0) {
                mo19004I();
                return true;
            } else if (pathSegments.size() == 1) {
                mo19005J(pathSegments.get(0));
                return true;
            }
        }
        return false;
    }

    @C0348i1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: x */
    public JobResult mo17814x(@C0359n0 UAirship uAirship, @C0359n0 C9304f fVar) {
        if (this.f25644g.mo107874h(2)) {
            return this.f25646i.mo18913B(uAirship, fVar);
        }
        return JobResult.SUCCESS;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: y */
    public void mo17816y() {
        mo18999B().mo18923f(true);
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C9372h(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C36075v vVar, @C0359n0 C9353c cVar, @C0359n0 C9537t tVar) {
        super(context, uVar);
        this.f25649l = new AtomicBoolean(false);
        this.f25644g = vVar;
        this.f25645h = tVar;
        this.f25646i = cVar;
        this.f25648k = new C9373a();
    }
}
