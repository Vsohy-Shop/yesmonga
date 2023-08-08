package com.urbanairship.iam.layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.actions.C35497g;
import com.urbanairship.actions.C35504j;
import com.urbanairship.actions.PermissionResultReceiver;
import com.urbanairship.actions.PromptPermissionAction;
import com.urbanairship.android.layout.C35700k;
import com.urbanairship.android.layout.display.C35579b;
import com.urbanairship.android.layout.display.DisplayException;
import com.urbanairship.android.layout.info.C35696x;
import com.urbanairship.android.layout.reporting.C35867c;
import com.urbanairship.android.layout.reporting.C35868d;
import com.urbanairship.android.layout.reporting.C35869e;
import com.urbanairship.android.layout.reporting.FormData;
import com.urbanairship.android.layout.util.C35911e;
import com.urbanairship.android.layout.util.UrlInfo;
import com.urbanairship.iam.C9163c0;
import com.urbanairship.iam.C9179f;
import com.urbanairship.iam.C9190h;
import com.urbanairship.iam.C9202i;
import com.urbanairship.iam.C9258w;
import com.urbanairship.iam.DisplayHandler;
import com.urbanairship.iam.InAppMessage;
import com.urbanairship.iam.assets.Assets;
import com.urbanairship.iam.events.C9175a;
import com.urbanairship.json.JsonValue;
import com.urbanairship.p006js.C9315a;
import com.urbanairship.permission.Permission;
import com.urbanairship.permission.PermissionStatus;
import com.urbanairship.util.C9642c0;
import com.urbanairship.webkit.C9711g;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class AirshipLayoutDisplayAdapter extends C9179f {

    /* renamed from: l */
    public static final C9213c f25072l = new C9216b();

    /* renamed from: d */
    public final InAppMessage f25073d;

    /* renamed from: e */
    public final C9219e f25074e;

    /* renamed from: f */
    public final C9213c f25075f;

    /* renamed from: g */
    public final C9642c0 f25076g;

    /* renamed from: h */
    public final C9315a f25077h;

    /* renamed from: i */
    public final List<UrlInfo> f25078i;

    /* renamed from: j */
    public final Map<String, String> f25079j = new HashMap();

    /* renamed from: k */
    public C35579b f25080k;

    public static class Listener implements C35700k {

        /* renamed from: a */
        public final InAppMessage f25081a;

        /* renamed from: b */
        public final DisplayHandler f25082b;

        /* renamed from: c */
        public final String f25083c;

        /* renamed from: d */
        public final Set<String> f25084d;

        /* renamed from: e */
        public final Map<String, C9214d> f25085e;

        /* renamed from: f */
        public final Map<String, Map<Integer, Integer>> f25086f;

        public /* synthetic */ Listener(InAppMessage inAppMessage, DisplayHandler displayHandler, C9211a aVar) {
            this(inAppMessage, displayHandler);
        }

        /* renamed from: m */
        public static /* synthetic */ C35497g m34594m(PermissionResultReceiver permissionResultReceiver, String str) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(PromptPermissionAction.f87444i, permissionResultReceiver);
            return C35497g.m146465d(str).mo106380m(bundle);
        }

        /* renamed from: a */
        public void mo18496a(@C0359n0 C35869e eVar, @C0363p0 C35868d dVar, long j) {
            try {
                this.f25082b.mo18163a(C9175a.m34409k(this.f25083c, this.f25081a, eVar, mo18505o(eVar)).mo18408s(dVar));
                if (eVar.mo107473e() && !this.f25084d.contains(eVar.mo107470b())) {
                    this.f25084d.add(eVar.mo107470b());
                    this.f25082b.mo18163a(C9175a.m34410l(this.f25083c, this.f25081a, eVar).mo18408s(dVar));
                }
                C9214d dVar2 = this.f25085e.get(eVar.mo107470b());
                if (dVar2 == null) {
                    dVar2 = new C9214d((C9211a) null);
                    this.f25085e.put(eVar.mo107470b(), dVar2);
                }
                dVar2.mo18510f(eVar, j);
            } catch (IllegalArgumentException e) {
                C36059m.m148409e("pageView InAppReportingEvent is not valid!", e);
            }
        }

        /* renamed from: b */
        public void mo18497b(@C0359n0 String str, @C0363p0 C35868d dVar) {
            try {
                this.f25082b.mo18163a(C9175a.m34399a(this.f25083c, this.f25081a, str).mo18408s(dVar));
            } catch (IllegalArgumentException e) {
                C36059m.m148409e("buttonTap InAppReportingEvent is not valid!", e);
            }
        }

        /* renamed from: c */
        public void mo18498c(@C0359n0 C35869e eVar, int i, @C0359n0 String str, int i2, @C0359n0 String str2, @C0363p0 C35868d dVar) {
            try {
                this.f25082b.mo18163a(C9175a.m34408j(this.f25083c, this.f25081a, eVar, i, str, i2, str2).mo18408s(dVar));
            } catch (IllegalArgumentException e) {
                C36059m.m148409e("pageSwipe InAppReportingEvent is not valid!", e);
            }
        }

        /* renamed from: d */
        public void mo18499d(long j) {
            try {
                C9163c0 c = C9163c0.m34349c();
                C9175a p = C9175a.m34413p(this.f25083c, this.f25081a, j, c);
                mo18504n((C35868d) null, j);
                this.f25082b.mo18163a(p);
                this.f25082b.mo18171h(c);
            } catch (IllegalArgumentException e) {
                C36059m.m148409e("dismissed info for resolution InAppReportingEvent is not valid!", e);
            }
        }

        /* renamed from: e */
        public void mo18500e(@C0359n0 C35867c cVar, @C0363p0 C35868d dVar) {
            try {
                this.f25082b.mo18163a(C9175a.m34403e(this.f25083c, this.f25081a, cVar).mo18408s(dVar));
            } catch (IllegalArgumentException e) {
                C36059m.m148409e("formDisplay InAppReportingEvent is not valid!", e);
            }
        }

        /* renamed from: f */
        public void mo18501f(@C0359n0 FormData.C35856a aVar, @C0363p0 C35868d dVar) {
            try {
                this.f25082b.mo18163a(C9175a.m34404f(this.f25083c, this.f25081a, aVar).mo18408s(dVar));
            } catch (IllegalArgumentException e) {
                C36059m.m148409e("formResult InAppReportingEvent is not valid!", e);
            }
        }

        /* renamed from: g */
        public void mo18502g(@C0359n0 String str, @C0363p0 String str2, boolean z, long j, @C0363p0 C35868d dVar) {
            try {
                C9163c0 b = C9163c0.m34348b(str, str2, z);
                C9175a s = C9175a.m34413p(this.f25083c, this.f25081a, j, b).mo18408s(dVar);
                mo18504n(dVar, j);
                this.f25082b.mo18163a(s);
                this.f25082b.mo18171h(b);
                if (z) {
                    this.f25082b.mo18164b();
                }
            } catch (IllegalArgumentException e) {
                C36059m.m148409e("buttonPressed info for resolution InAppReportingEvent is not valid!", e);
            }
        }

        /* renamed from: h */
        public void mo18503h(@C0359n0 Map<String, JsonValue> map, @C0363p0 final C35868d dVar) {
            C9190h.m34483c(map, new C35504j(new C9218d(new PermissionResultReceiver(new Handler(Looper.getMainLooper())) {
                /* renamed from: a */
                public void mo18506a(@C0359n0 Permission permission, @C0359n0 PermissionStatus permissionStatus, @C0359n0 PermissionStatus permissionStatus2) {
                    try {
                        Listener.this.f25082b.mo18163a(C9175a.m34412n(Listener.this.f25083c, Listener.this.f25081a, permission, permissionStatus, permissionStatus2).mo18408s(dVar));
                    } catch (IllegalArgumentException e) {
                        C36059m.m148409e("permissionResultEvent InAppReportingEvent is not valid!", e);
                    }
                }
            })));
        }

        /* renamed from: n */
        public final void mo18504n(@C0363p0 C35868d dVar, long j) {
            for (Map.Entry<String, C9214d> value : this.f25085e.entrySet()) {
                C9214d dVar2 = (C9214d) value.getValue();
                dVar2.mo18509e(j);
                if (dVar2.f25091a != null) {
                    try {
                        this.f25082b.mo18163a(C9175a.m34411m(this.f25083c, this.f25081a, dVar2.f25091a, dVar2.f25092b).mo18408s(dVar));
                    } catch (IllegalArgumentException e) {
                        C36059m.m148409e("pagerSummary InAppReportingEvent is not valid!", e);
                    }
                }
            }
        }

        /* renamed from: o */
        public final int mo18505o(@C0359n0 C35869e eVar) {
            Integer num;
            if (!this.f25086f.containsKey(eVar.mo107470b())) {
                this.f25086f.put(eVar.mo107470b(), new HashMap(eVar.mo107469a()));
            }
            Map map = this.f25086f.get(eVar.mo107470b());
            if (map != null && !map.containsKey(Integer.valueOf(eVar.mo107471c()))) {
                map.put(Integer.valueOf(eVar.mo107471c()), 0);
            }
            if (map != null) {
                num = (Integer) map.get(Integer.valueOf(eVar.mo107471c()));
            } else {
                num = 0;
            }
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            Integer valueOf = Integer.valueOf(i);
            if (map != null) {
                map.put(Integer.valueOf(eVar.mo107471c()), valueOf);
            }
            return valueOf.intValue();
        }

        public Listener(@C0359n0 InAppMessage inAppMessage, @C0359n0 DisplayHandler displayHandler) {
            this.f25084d = new HashSet();
            this.f25085e = new HashMap();
            this.f25086f = new HashMap();
            this.f25081a = inAppMessage;
            this.f25082b = displayHandler;
            this.f25083c = displayHandler.mo18169f();
        }
    }

    /* renamed from: com.urbanairship.iam.layout.AirshipLayoutDisplayAdapter$a */
    public static /* synthetic */ class C9211a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25089a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.urbanairship.android.layout.util.UrlInfo$UrlType[] r0 = com.urbanairship.android.layout.util.UrlInfo.UrlType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25089a = r0
                com.urbanairship.android.layout.util.UrlInfo$UrlType r1 = com.urbanairship.android.layout.util.UrlInfo.UrlType.VIDEO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25089a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.urbanairship.android.layout.util.UrlInfo$UrlType r1 = com.urbanairship.android.layout.util.UrlInfo.UrlType.WEB_PAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25089a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.urbanairship.android.layout.util.UrlInfo$UrlType r1 = com.urbanairship.android.layout.util.UrlInfo.UrlType.IMAGE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.iam.layout.AirshipLayoutDisplayAdapter.C9211a.<clinit>():void");
        }
    }

    /* renamed from: com.urbanairship.iam.layout.AirshipLayoutDisplayAdapter$b */
    public static class C9212b implements C35911e {

        /* renamed from: a */
        public final Map<String, String> f25090a;

        public /* synthetic */ C9212b(Map map, C9211a aVar) {
            this(map);
        }

        @C0363p0
        public String get(@C0359n0 String str) {
            return this.f25090a.get(str);
        }

        public C9212b(Map<String, String> map) {
            this.f25090a = map;
        }
    }

    @C0344h1
    /* renamed from: com.urbanairship.iam.layout.AirshipLayoutDisplayAdapter$c */
    public interface C9213c {
        /* renamed from: a */
        C35579b mo18508a(@C0359n0 C35696x xVar) throws DisplayException;
    }

    @C0344h1
    public AirshipLayoutDisplayAdapter(@C0359n0 InAppMessage inAppMessage, @C0359n0 C9219e eVar, @C0359n0 C9213c cVar, @C0359n0 C9315a aVar, @C0359n0 C9642c0 c0Var) {
        this.f25073d = inAppMessage;
        this.f25074e = eVar;
        this.f25075f = cVar;
        this.f25077h = aVar;
        this.f25076g = c0Var;
        this.f25078i = UrlInfo.m148023a(eVar.mo18512b().mo106857h());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ C9711g m34584f() {
        return new C9258w(this.f25073d);
    }

    @C0359n0
    /* renamed from: g */
    public static AirshipLayoutDisplayAdapter m34585g(@C0359n0 InAppMessage inAppMessage) {
        C9219e eVar = (C9219e) inAppMessage.mo18182n();
        if (eVar != null) {
            return new AirshipLayoutDisplayAdapter(inAppMessage, eVar, f25072l, UAirship.m146188Y().mo106206H(), C9642c0.m36130c());
        }
        throw new IllegalArgumentException("Invalid message for adapter: " + inAppMessage);
    }

    /* renamed from: a */
    public void mo18457a(@C0359n0 Context context) {
    }

    /* renamed from: b */
    public void mo18322b(@C0359n0 Context context, @C0359n0 DisplayHandler displayHandler) {
        this.f25080k.mo106602d(new Listener(this.f25073d, displayHandler, (C9211a) null)).mo106600b(new C9212b(this.f25079j, (C9211a) null)).mo106601c(C9202i.m34549m(context)).mo106603e(new C9217c(this)).mo106599a(context);
    }

    /* renamed from: c */
    public int mo18458c(@C0359n0 Context context, @C0359n0 Assets assets) {
        this.f25079j.clear();
        for (UrlInfo next : this.f25078i) {
            if (!this.f25077h.mo18743g(next.mo107537c(), 2)) {
                C36059m.m148409e("Url not allowed: %s. Unable to display message %s.", next.mo107537c(), this.f25073d.mo18184p());
                return 2;
            } else if (next.mo107536b() == UrlInfo.UrlType.IMAGE) {
                File e = assets.mo18229e(next.mo107537c());
                if (e.exists()) {
                    this.f25079j.put(next.mo107537c(), Uri.fromFile(e).toString());
                }
            }
        }
        try {
            this.f25080k = this.f25075f.mo18508a(this.f25074e.mo18512b());
            return 0;
        } catch (DisplayException e2) {
            C36059m.m148409e("Unable to display layout", e2);
            return 2;
        }
    }

    /* renamed from: d */
    public boolean mo18323d(@C0359n0 Context context) {
        if (!super.mo18323d(context)) {
            return false;
        }
        boolean b = this.f25076g.mo19605b(context);
        for (UrlInfo next : this.f25078i) {
            int i = C9211a.f25089a[next.mo107536b().ordinal()];
            if (i == 1 || i == 2) {
                if (!b) {
                    C36059m.m148409e("Message not ready. Device is not connected and the message contains a webpage or video.", next.mo107537c(), this.f25073d);
                    return false;
                }
            } else if (i == 3 && this.f25079j.get(next.mo107537c()) == null && !b) {
                C36059m.m148409e("Message not ready. Device is not connected and the message contains a webpage or video.", next.mo107537c(), this.f25073d);
                return false;
            }
        }
        return true;
    }

    /* renamed from: com.urbanairship.iam.layout.AirshipLayoutDisplayAdapter$d */
    public static class C9214d {
        @C0363p0

        /* renamed from: a */
        public C35869e f25091a;

        /* renamed from: b */
        public final List<C9175a.C9178c> f25092b;

        /* renamed from: c */
        public long f25093c;

        public C9214d() {
            this.f25092b = new ArrayList();
        }

        /* renamed from: e */
        public final void mo18509e(long j) {
            C35869e eVar = this.f25091a;
            if (eVar != null) {
                this.f25092b.add(new C9175a.C9178c(eVar.mo107471c(), this.f25091a.mo107472d(), j - this.f25093c));
            }
        }

        /* renamed from: f */
        public final void mo18510f(C35869e eVar, long j) {
            mo18509e(j);
            this.f25091a = eVar;
            this.f25093c = j;
        }

        public /* synthetic */ C9214d(C9211a aVar) {
            this();
        }
    }
}
