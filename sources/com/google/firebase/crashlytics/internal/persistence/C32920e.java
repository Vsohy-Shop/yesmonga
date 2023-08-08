package com.google.firebase.crashlytics.internal.persistence;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.crashlytics.internal.common.C32716p;
import com.google.firebase.crashlytics.internal.metadata.C32760i;
import com.google.firebase.crashlytics.internal.model.C32833b0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.C32896h;
import com.google.firebase.crashlytics.internal.settings.C32940i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.crashlytics.internal.persistence.e */
public class C32920e {

    /* renamed from: d */
    public static final Charset f79920d = Charset.forName("UTF-8");

    /* renamed from: e */
    public static final int f79921e = 8;

    /* renamed from: f */
    public static final String f79922f = "report";

    /* renamed from: g */
    public static final String f79923g = "start-time";

    /* renamed from: h */
    public static final String f79924h = "event";

    /* renamed from: i */
    public static final int f79925i = 10;

    /* renamed from: j */
    public static final String f79926j = "%010d";

    /* renamed from: k */
    public static final int f79927k = 15;

    /* renamed from: l */
    public static final String f79928l = "_";

    /* renamed from: m */
    public static final String f79929m = "";

    /* renamed from: n */
    public static final C32896h f79930n = new C32896h();

    /* renamed from: o */
    public static final Comparator<? super File> f79931o = new C32918c();

    /* renamed from: p */
    public static final FilenameFilter f79932p = new C32919d();

    /* renamed from: a */
    public final AtomicInteger f79933a = new AtomicInteger(0);

    /* renamed from: b */
    public final C32921f f79934b;
    @C0359n0

    /* renamed from: c */
    public final C32940i f79935c;

    public C32920e(C32921f fVar, C32940i iVar) {
        this.f79934b = fVar;
        this.f79935c = iVar;
    }

    @C0359n0
    /* renamed from: B */
    public static String m133013B(@C0359n0 File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f79920d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    /* renamed from: G */
    public static void m133014G(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f79920d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: H */
    public static void m133015H(File file, String str, long j) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f79920d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m133021h(j));
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: f */
    public static int m133020f(List<File> list, int i) {
        int size = list.size();
        for (File next : list) {
            if (size <= i) {
                return size;
            }
            C32921f.m133049t(next);
            size--;
        }
        return size;
    }

    /* renamed from: h */
    public static long m133021h(long j) {
        return j * 1000;
    }

    @C0359n0
    /* renamed from: m */
    public static String m133022m(int i, boolean z) {
        String str;
        String format = String.format(Locale.US, f79926j, new Object[]{Integer.valueOf(i)});
        if (z) {
            str = f79928l;
        } else {
            str = "";
        }
        return "event" + format + str;
    }

    @C0359n0
    /* renamed from: o */
    public static String m133023o(@C0359n0 String str) {
        return str.substring(0, f79927k);
    }

    /* renamed from: s */
    public static boolean m133024s(@C0359n0 String str) {
        if (!str.startsWith("event") || !str.endsWith(f79928l)) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static boolean m133025t(@C0359n0 File file, @C0359n0 String str) {
        if (!str.startsWith("event") || str.endsWith(f79928l)) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public static int m133028x(@C0359n0 File file, @C0359n0 File file2) {
        return m133023o(file.getName()).compareTo(m133023o(file2.getName()));
    }

    /* renamed from: A */
    public void mo95545A(@C0359n0 CrashlyticsReport crashlyticsReport) {
        CrashlyticsReport.C32774f j = crashlyticsReport.mo95141j();
        if (j == null) {
            C32741f.m132248f().mo95052b("Could not get session for report");
            return;
        }
        String h = j.mo95205h();
        try {
            m133014G(this.f79934b.mo95578p(h, f79922f), f79930n.mo95505I(crashlyticsReport));
            m133015H(this.f79934b.mo95578p(h, f79923g), "", j.mo95208k());
        } catch (IOException e) {
            C32741f f = C32741f.m132248f();
            f.mo95053c("Could not persist report for session " + h, e);
        }
    }

    /* renamed from: C */
    public final void mo95546C(@C0359n0 File file, @C0359n0 CrashlyticsReport.C32770e eVar, @C0359n0 String str) {
        try {
            C32896h hVar = f79930n;
            m133014G(this.f79934b.mo95570h(str), hVar.mo95505I(hVar.mo95504H(m133013B(file)).mo95145n(eVar)));
        } catch (IOException e) {
            C32741f f = C32741f.m132248f();
            f.mo95063n("Could not synthesize final native report file for " + file, e);
        }
    }

    /* renamed from: D */
    public final void mo95547D(String str, long j) {
        boolean z;
        List<File> q = this.f79934b.mo95579q(str, f79932p);
        if (q.isEmpty()) {
            C32741f.m132248f().mo95060k("Session " + str + " has no events.");
            return;
        }
        Collections.sort(q);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = q.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File next = it.next();
                try {
                    arrayList.add(f79930n.mo95508j(m133013B(next)));
                    if (z || m133024s(next.getName())) {
                        z = true;
                    }
                } catch (IOException e) {
                    C32741f.m132248f().mo95063n("Could not add event to report for " + next, e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            C32741f.m132248f().mo95062m("Could not parse event files for session " + str);
            return;
        }
        mo95548E(this.f79934b.mo95578p(str, f79922f), arrayList, j, z, C32760i.m132353j(str, this.f79934b));
    }

    /* renamed from: E */
    public final void mo95548E(@C0359n0 File file, @C0359n0 List<CrashlyticsReport.C32774f.C32782d> list, long j, boolean z, @C0363p0 String str) {
        File file2;
        try {
            C32896h hVar = f79930n;
            CrashlyticsReport m = hVar.mo95504H(m133013B(file)).mo95147p(j, z, str).mo95144m(C32833b0.m132702e(list));
            CrashlyticsReport.C32774f j2 = m.mo95141j();
            if (j2 != null) {
                if (z) {
                    file2 = this.f79934b.mo95573k(j2.mo95205h());
                } else {
                    file2 = this.f79934b.mo95575m(j2.mo95205h());
                }
                m133014G(file2, hVar.mo95505I(m));
            }
        } catch (IOException e) {
            C32741f f = C32741f.m132248f();
            f.mo95063n("Could not synthesize final report file for " + file, e);
        }
    }

    /* renamed from: F */
    public final int mo95549F(String str, int i) {
        List<File> q = this.f79934b.mo95579q(str, new C32916a());
        Collections.sort(q, new C32917b());
        return m133020f(q, i);
    }

    /* renamed from: e */
    public final SortedSet<String> mo95550e(@C0363p0 String str) {
        this.f79934b.mo95564b();
        SortedSet<String> p = mo95557p();
        if (str != null) {
            p.remove(str);
        }
        if (p.size() <= 8) {
            return p;
        }
        while (p.size() > 8) {
            String last = p.last();
            C32741f f = C32741f.m132248f();
            f.mo95052b("Removing session over cap: " + last);
            this.f79934b.mo95566d(last);
            p.remove(last);
        }
        return p;
    }

    /* renamed from: g */
    public final void mo95551g() {
        int i = this.f79935c.mo95606b().f80002a.f80014b;
        List<File> n = mo95556n();
        int size = n.size();
        if (size > i) {
            for (File delete : n.subList(i, size)) {
                delete.delete();
            }
        }
    }

    /* renamed from: i */
    public void mo95552i() {
        mo95553j(this.f79934b.mo95576n());
        mo95553j(this.f79934b.mo95574l());
        mo95553j(this.f79934b.mo95571i());
    }

    /* renamed from: j */
    public final void mo95553j(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    /* renamed from: k */
    public void mo95554k(@C0363p0 String str, long j) {
        for (String next : mo95550e(str)) {
            C32741f f = C32741f.m132248f();
            f.mo95060k("Finalizing report for session " + next);
            mo95547D(next, j);
            this.f79934b.mo95566d(next);
        }
        mo95551g();
    }

    /* renamed from: l */
    public void mo95555l(String str, CrashlyticsReport.C32770e eVar) {
        File p = this.f79934b.mo95578p(str, f79922f);
        C32741f f = C32741f.m132248f();
        f.mo95052b("Writing native session report for " + str + " to file: " + p);
        mo95546C(p, eVar, str);
    }

    /* renamed from: n */
    public final List<File> mo95556n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f79934b.mo95574l());
        arrayList.addAll(this.f79934b.mo95571i());
        Comparator<? super File> comparator = f79931o;
        Collections.sort(arrayList, comparator);
        List<File> n = this.f79934b.mo95576n();
        Collections.sort(n, comparator);
        arrayList.addAll(n);
        return arrayList;
    }

    /* renamed from: p */
    public SortedSet<String> mo95557p() {
        return new TreeSet(this.f79934b.mo95567e()).descendingSet();
    }

    /* renamed from: q */
    public long mo95558q(String str) {
        return this.f79934b.mo95578p(str, f79923g).lastModified();
    }

    /* renamed from: r */
    public boolean mo95559r() {
        if (!this.f79934b.mo95576n().isEmpty() || !this.f79934b.mo95574l().isEmpty() || !this.f79934b.mo95571i().isEmpty()) {
            return true;
        }
        return false;
    }

    @C0359n0
    /* renamed from: w */
    public List<C32716p> mo95560w() {
        List<File> n = mo95556n();
        ArrayList arrayList = new ArrayList();
        for (File next : n) {
            try {
                arrayList.add(C32716p.m132159a(f79930n.mo95504H(m133013B(next)), next.getName(), next));
            } catch (IOException e) {
                C32741f f = C32741f.m132248f();
                f.mo95063n("Could not load report file " + next + "; deleting", e);
                next.delete();
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public void mo95561y(@C0359n0 CrashlyticsReport.C32774f.C32782d dVar, @C0359n0 String str) {
        mo95562z(dVar, str, false);
    }

    /* renamed from: z */
    public void mo95562z(@C0359n0 CrashlyticsReport.C32774f.C32782d dVar, @C0359n0 String str, boolean z) {
        int i = this.f79935c.mo95606b().f80002a.f80013a;
        try {
            m133014G(this.f79934b.mo95578p(str, m133022m(this.f79933a.getAndIncrement(), z)), f79930n.mo95509k(dVar));
        } catch (IOException e) {
            C32741f f = C32741f.m132248f();
            f.mo95063n("Could not persist event for session " + str, e);
        }
        mo95549F(str, i);
    }
}
