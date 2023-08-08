package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.work.impl.utils.C21322h;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.crashlytics.internal.metadata.C32745c;
import com.google.firebase.crashlytics.internal.metadata.C32760i;
import com.google.firebase.crashlytics.internal.model.C32833b0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.google.firebase.crashlytics.internal.persistence.C32921f;
import com.google.firebase.crashlytics.internal.send.C32923b;
import com.google.firebase.crashlytics.internal.settings.C32940i;
import com.google.firebase.crashlytics.internal.stacktrace.C32947d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.crashlytics.internal.common.l0 */
public class C32709l0 implements C32712n {

    /* renamed from: f */
    public static final String f79405f = "crash";

    /* renamed from: g */
    public static final String f79406g = "error";

    /* renamed from: h */
    public static final int f79407h = 4;

    /* renamed from: i */
    public static final int f79408i = 8;

    /* renamed from: j */
    public static final int f79409j = 8192;

    /* renamed from: a */
    public final C32714o f79410a;

    /* renamed from: b */
    public final C32920e f79411b;

    /* renamed from: c */
    public final C32923b f79412c;

    /* renamed from: d */
    public final C32745c f79413d;

    /* renamed from: e */
    public final C32760i f79414e;

    public C32709l0(C32714o oVar, C32920e eVar, C32923b bVar, C32745c cVar, C32760i iVar) {
        this.f79410a = oVar;
        this.f79411b = eVar;
        this.f79412c = bVar;
        this.f79413d = cVar;
        this.f79414e = iVar;
    }

    @C0376v0(api = 30)
    /* renamed from: i */
    public static CrashlyticsReport.C32762a m132099i(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream a = applicationExitInfo.getTraceInputStream();
            if (a != null) {
                str = m132100j(a);
            }
        } catch (IOException e) {
            C32741f f = C32741f.m132248f();
            f.mo95062m("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e);
        }
        return CrashlyticsReport.C32762a.m132385a().mo95166c(applicationExitInfo.getImportance()).mo95168e(applicationExitInfo.getProcessName()).mo95170g(applicationExitInfo.getReason()).mo95172i(applicationExitInfo.getTimestamp()).mo95167d(applicationExitInfo.getPid()).mo95169f(applicationExitInfo.getPss()).mo95171h(applicationExitInfo.getRss()).mo95173j(str).mo95164a();
    }

    @C0344h1
    @C0376v0(api = 19)
    /* renamed from: j */
    public static String m132100j(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: k */
    public static C32709l0 m132101k(Context context, C32730v vVar, C32921f fVar, C32667a aVar, C32745c cVar, C32760i iVar, C32947d dVar, C32940i iVar2, C32668a0 a0Var) {
        return new C32709l0(new C32714o(context, vVar, aVar, dVar, iVar2), new C32920e(fVar, iVar2), C32923b.m133071b(context, iVar2, a0Var), cVar, iVar);
    }

    @C0359n0
    /* renamed from: o */
    public static List<CrashlyticsReport.C32768d> m132102o(@C0359n0 Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(CrashlyticsReport.C32768d.m132422a().mo95186b((String) next.getKey()).mo95187c((String) next.getValue()).mo95185a());
        }
        Collections.sort(arrayList, new C32701j0());
        return arrayList;
    }

    /* renamed from: a */
    public void mo94966a(@C0359n0 String str, long j) {
        this.f79411b.mo95545A(this.f79410a.mo94994e(str, j));
    }

    /* renamed from: b */
    public void mo94967b(String str) {
        this.f79414e.mo95128o(str);
    }

    /* renamed from: c */
    public void mo94968c(String str, String str2) {
        this.f79414e.mo95125l(str, str2);
    }

    /* renamed from: d */
    public void mo94969d(long j, String str) {
        this.f79413d.mo95079g(j, str);
    }

    /* renamed from: g */
    public final CrashlyticsReport.C32774f.C32782d mo94970g(CrashlyticsReport.C32774f.C32782d dVar) {
        return mo94971h(dVar, this.f79413d, this.f79414e);
    }

    /* renamed from: h */
    public final CrashlyticsReport.C32774f.C32782d mo94971h(CrashlyticsReport.C32774f.C32782d dVar, C32745c cVar, C32760i iVar) {
        CrashlyticsReport.C32774f.C32782d.C32797b g = dVar.mo95273g();
        String c = cVar.mo95075c();
        if (c != null) {
            g.mo95347d(CrashlyticsReport.C32774f.C32782d.C32800d.m132618a().mo95365b(c).mo95364a());
        } else {
            C32741f.m132248f().mo95060k("No log data to include with this event.");
        }
        List<CrashlyticsReport.C32768d> o = m132102o(iVar.mo95121e());
        List<CrashlyticsReport.C32768d> o2 = m132102o(iVar.mo95122f());
        if (!o.isEmpty() || !o2.isEmpty()) {
            g.mo95345b(dVar.mo95268b().mo95279g().mo95282c(C32833b0.m132702e(o)).mo95284e(C32833b0.m132702e(o2)).mo95280a());
        }
        return g.mo95344a();
    }

    /* renamed from: l */
    public void mo94972l(@C0359n0 String str, @C0359n0 List<C32733y> list) {
        C32741f.m132248f().mo95052b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (C32733y a : list) {
            CrashlyticsReport.C32770e.C32772b a2 = a.mo94868a();
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        this.f79411b.mo95555l(str, CrashlyticsReport.C32770e.m132428a().mo95192b(C32833b0.m132702e(arrayList)).mo95191a());
    }

    /* renamed from: m */
    public void mo94973m(long j, @C0363p0 String str) {
        this.f79411b.mo95554k(str, j);
    }

    @C0363p0
    @C0376v0(api = 30)
    /* renamed from: n */
    public final ApplicationExitInfo mo94974n(String str, List<ApplicationExitInfo> list) {
        long q = this.f79411b.mo95558q(str);
        for (ApplicationExitInfo a : list) {
            ApplicationExitInfo a2 = C21322h.m98431a(a);
            if (a2.getTimestamp() < q) {
                return null;
            }
            if (a2.getReason() == 6) {
                return a2;
            }
        }
        return null;
    }

    /* renamed from: p */
    public boolean mo94975p() {
        return this.f79411b.mo95559r();
    }

    /* renamed from: r */
    public SortedSet<String> mo94976r() {
        return this.f79411b.mo95557p();
    }

    /* renamed from: s */
    public final boolean mo94977s(@C0359n0 C31047k<C32716p> kVar) {
        if (kVar.mo87738v()) {
            C32716p r = kVar.mo87734r();
            C32741f f = C32741f.m132248f();
            f.mo95052b("Crashlytics report successfully enqueued to DataTransport: " + r.mo94856d());
            File c = r.mo94855c();
            if (c.delete()) {
                C32741f f2 = C32741f.m132248f();
                f2.mo95052b("Deleted report file: " + c.getPath());
                return true;
            }
            C32741f f3 = C32741f.m132248f();
            f3.mo95062m("Crashlytics could not delete report file: " + c.getPath());
            return true;
        }
        C32741f.m132248f().mo95063n("Crashlytics report could not be enqueued to DataTransport", kVar.mo87733q());
        return false;
    }

    /* renamed from: t */
    public final void mo94978t(@C0359n0 Throwable th, @C0359n0 Thread thread, @C0359n0 String str, @C0359n0 String str2, long j, boolean z) {
        boolean equals = str2.equals("crash");
        CrashlyticsReport.C32774f.C32782d d = this.f79410a.mo94993d(th, thread, str2, j, 4, 8, z);
        String str3 = str;
        this.f79411b.mo95562z(mo94970g(d), str, equals);
    }

    /* renamed from: u */
    public void mo94979u(@C0359n0 Throwable th, @C0359n0 Thread thread, @C0359n0 String str, long j) {
        C32741f f = C32741f.m132248f();
        f.mo95060k("Persisting fatal event for session " + str);
        mo94978t(th, thread, str, "crash", j, true);
    }

    /* renamed from: v */
    public void mo94980v(@C0359n0 Throwable th, @C0359n0 Thread thread, @C0359n0 String str, long j) {
        C32741f f = C32741f.m132248f();
        f.mo95060k("Persisting non-fatal event for session " + str);
        mo94978t(th, thread, str, "error", j, false);
    }

    @C0376v0(api = 30)
    /* renamed from: w */
    public void mo94981w(String str, List<ApplicationExitInfo> list, C32745c cVar, C32760i iVar) {
        ApplicationExitInfo n = mo94974n(str, list);
        if (n == null) {
            C32741f f = C32741f.m132248f();
            f.mo95060k("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        CrashlyticsReport.C32774f.C32782d c = this.f79410a.mo94992c(m132099i(n));
        C32741f f2 = C32741f.m132248f();
        f2.mo95052b("Persisting anr for session " + str);
        this.f79411b.mo95562z(mo94971h(c, cVar, iVar), str, true);
    }

    /* renamed from: x */
    public void mo94982x() {
        this.f79411b.mo95552i();
    }

    /* renamed from: y */
    public C31047k<Void> mo94983y(@C0359n0 Executor executor) {
        return mo94984z(executor, (String) null);
    }

    /* renamed from: z */
    public C31047k<Void> mo94984z(@C0359n0 Executor executor, @C0363p0 String str) {
        boolean z;
        List<C32716p> w = this.f79411b.mo95560w();
        ArrayList arrayList = new ArrayList();
        for (C32716p next : w) {
            if (str == null || str.equals(next.mo94856d())) {
                C32923b bVar = this.f79412c;
                if (str != null) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(bVar.mo95580c(next, z).mo87730n(executor, new C32703k0(this)));
            }
        }
        return C31053n.m124526h(arrayList);
    }
}
