package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.C32833b0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.C32940i;
import com.google.firebase.crashlytics.internal.stacktrace.C32947d;
import com.google.firebase.crashlytics.internal.stacktrace.C32948e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.firebase.crashlytics.internal.common.o */
public class C32714o {

    /* renamed from: f */
    public static final Map<String, Integer> f79418f;

    /* renamed from: g */
    public static final String f79419g = String.format(Locale.US, C32689j.f79324z, new Object[]{"18.3.5"});

    /* renamed from: h */
    public static final int f79420h = 3;

    /* renamed from: i */
    public static final int f79421i = 4;

    /* renamed from: j */
    public static final int f79422j = 3;

    /* renamed from: k */
    public static final String f79423k = "0";

    /* renamed from: a */
    public final Context f79424a;

    /* renamed from: b */
    public final C32730v f79425b;

    /* renamed from: c */
    public final C32667a f79426c;

    /* renamed from: d */
    public final C32947d f79427d;

    /* renamed from: e */
    public final C32940i f79428e;

    static {
        HashMap hashMap = new HashMap();
        f79418f = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public C32714o(Context context, C32730v vVar, C32667a aVar, C32947d dVar, C32940i iVar) {
        this.f79424a = context;
        this.f79425b = vVar;
        this.f79426c = aVar;
        this.f79427d = dVar;
        this.f79428e = iVar;
    }

    /* renamed from: f */
    public static int m132133f() {
        Integer num;
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str) && (num = f79418f.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        return 7;
    }

    /* renamed from: a */
    public final CrashlyticsReport.C32762a mo94990a(CrashlyticsReport.C32762a aVar) {
        C32833b0 b0Var;
        if (!this.f79428e.mo95606b().f80003b.f80012c || this.f79426c.f79281c.size() <= 0) {
            b0Var = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C32675e next : this.f79426c.f79281c) {
                arrayList.add(CrashlyticsReport.C32762a.C32763a.m132395a().mo95163d(next.mo94867c()).mo95161b(next.mo94865a()).mo95162c(next.mo94866b()).mo95160a());
            }
            b0Var = C32833b0.m132702e(arrayList);
        }
        return CrashlyticsReport.C32762a.m132385a().mo95166c(aVar.mo95149c()).mo95168e(aVar.mo95151e()).mo95170g(aVar.mo95153g()).mo95172i(aVar.mo95155i()).mo95167d(aVar.mo95150d()).mo95169f(aVar.mo95152f()).mo95171h(aVar.mo95154h()).mo95173j(aVar.mo95156j()).mo95165b(b0Var).mo95164a();
    }

    /* renamed from: b */
    public final CrashlyticsReport.C32767c mo94991b() {
        return CrashlyticsReport.m132370b().mo95181h("18.3.5").mo95177d(this.f79426c.f79279a).mo95178e(this.f79425b.mo95029a()).mo95175b(this.f79426c.f79284f).mo95176c(this.f79426c.f79285g).mo95180g(4);
    }

    /* renamed from: c */
    public CrashlyticsReport.C32774f.C32782d mo94992c(CrashlyticsReport.C32762a aVar) {
        int i = this.f79424a.getResources().getConfiguration().orientation;
        return CrashlyticsReport.C32774f.C32782d.m132514a().mo95349f("anr").mo95348e(aVar.mo95155i()).mo95345b(mo94997i(i, mo94990a(aVar))).mo95346c(mo94999k(i)).mo95344a();
    }

    /* renamed from: d */
    public CrashlyticsReport.C32774f.C32782d mo94993d(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.f79424a.getResources().getConfiguration().orientation;
        Throwable th2 = th;
        String str2 = str;
        long j2 = j;
        return CrashlyticsReport.C32774f.C32782d.m132514a().mo95349f(str).mo95348e(j).mo95345b(mo94998j(i3, new C32948e(th, this.f79427d), thread, i, i2, z)).mo95346c(mo94999k(i3)).mo95344a();
    }

    /* renamed from: e */
    public CrashlyticsReport mo94994e(String str, long j) {
        return mo94991b().mo95182i(mo95007s(str, j)).mo95174a();
    }

    /* renamed from: g */
    public final CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a mo94995g() {
        return CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a.m132540a().mo95297b(0).mo95299d(0).mo95298c(this.f79426c.f79283e).mo95300e(this.f79426c.f79280b).mo95296a();
    }

    /* renamed from: h */
    public final C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a> mo94996h() {
        return C32833b0.m132703h(mo94995g());
    }

    /* renamed from: i */
    public final CrashlyticsReport.C32774f.C32782d.C32783a mo94997i(int i, CrashlyticsReport.C32762a aVar) {
        boolean z;
        if (aVar.mo95149c() != 100) {
            z = true;
        } else {
            z = false;
        }
        return CrashlyticsReport.C32774f.C32782d.C32783a.m132521a().mo95281b(Boolean.valueOf(z)).mo95285f(i).mo95283d(mo95002n(aVar)).mo95280a();
    }

    /* renamed from: j */
    public final CrashlyticsReport.C32774f.C32782d.C32783a mo94998j(int i, C32948e eVar, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        boolean z2;
        ActivityManager.RunningAppProcessInfo j = CommonUtils.m131928j(this.f79426c.f79283e, this.f79424a);
        if (j != null) {
            if (j.importance != 100) {
                z2 = true;
            } else {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        return CrashlyticsReport.C32774f.C32782d.C32783a.m132521a().mo95281b(bool).mo95285f(i).mo95283d(mo95003o(eVar, thread, i2, i3, z)).mo95280a();
    }

    /* renamed from: k */
    public final CrashlyticsReport.C32774f.C32782d.C32798c mo94999k(int i) {
        Double d;
        C32673d a = C32673d.m131960a(this.f79424a);
        Float b = a.mo94862b();
        if (b != null) {
            d = Double.valueOf(b.doubleValue());
        } else {
            d = null;
        }
        int c = a.mo94863c();
        boolean q = CommonUtils.m131935q(this.f79424a);
        long v = CommonUtils.m131940v() - CommonUtils.m131919a(this.f79424a);
        return CrashlyticsReport.C32774f.C32782d.C32798c.m132604a().mo95357b(d).mo95358c(c).mo95361f(q).mo95360e(i).mo95362g(v).mo95359d(CommonUtils.m131920b(Environment.getDataDirectory().getPath())).mo95356a();
    }

    /* renamed from: l */
    public final CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c mo95000l(C32948e eVar, int i, int i2) {
        return mo95001m(eVar, i, i2, 0);
    }

    /* renamed from: m */
    public final CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c mo95001m(C32948e eVar, int i, int i2, int i3) {
        String str = eVar.f80067b;
        String str2 = eVar.f80066a;
        StackTraceElement[] stackTraceElementArr = eVar.f80068c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C32948e eVar2 = eVar.f80069d;
        if (i3 >= i2) {
            C32948e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f80069d;
                i4++;
            }
        }
        CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c.C32790a d = CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c.m132558a().mo95318f(str).mo95317e(str2).mo95315c(C32833b0.m132702e(mo95005q(stackTraceElementArr, i))).mo95316d(i4);
        if (eVar2 != null && i4 == 0) {
            d.mo95314b(mo95001m(eVar2, i, i2, i3 + 1));
        }
        return d.mo95313a();
    }

    /* renamed from: n */
    public final CrashlyticsReport.C32774f.C32782d.C32783a.C32785b mo95002n(CrashlyticsReport.C32762a aVar) {
        return CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.m132534a().mo95303b(aVar).mo95306e(mo95010v()).mo95304c(mo94996h()).mo95302a();
    }

    /* renamed from: o */
    public final CrashlyticsReport.C32774f.C32782d.C32783a.C32785b mo95003o(C32948e eVar, Thread thread, int i, int i2, boolean z) {
        return CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.m132534a().mo95307f(mo95013y(eVar, thread, i, z)).mo95305d(mo95000l(eVar, i, i2)).mo95306e(mo95010v()).mo95304c(mo94996h()).mo95302a();
    }

    /* renamed from: p */
    public final CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b mo95004p(StackTraceElement stackTraceElement, CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b.C32796a aVar) {
        long j;
        long j2 = 0;
        if (stackTraceElement.isNativeMethod()) {
            j = Math.max((long) stackTraceElement.getLineNumber(), 0);
        } else {
            j = 0;
        }
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j2 = (long) stackTraceElement.getLineNumber();
        }
        return aVar.mo95342e(j).mo95343f(str).mo95339b(fileName).mo95341d(j2).mo95338a();
    }

    /* renamed from: q */
    public final C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b> mo95005q(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement p : stackTraceElementArr) {
            arrayList.add(mo95004p(p, CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b.m132586a().mo95340c(i)));
        }
        return C32833b0.m132702e(arrayList);
    }

    /* renamed from: r */
    public final CrashlyticsReport.C32774f.C32775a mo95006r() {
        return CrashlyticsReport.C32774f.C32775a.m132458a().mo95228e(this.f79425b.mo95032f()).mo95231h(this.f79426c.f79284f).mo95227d(this.f79426c.f79285g).mo95229f(this.f79425b.mo95029a()).mo95225b(this.f79426c.f79286h.mo95048d()).mo95226c(this.f79426c.f79286h.mo95049e()).mo95224a();
    }

    /* renamed from: s */
    public final CrashlyticsReport.C32774f mo95007s(String str, long j) {
        return CrashlyticsReport.C32774f.m132441a().mo95247l(j).mo95244i(str).mo95242g(f79419g).mo95237b(mo95006r()).mo95246k(mo95009u()).mo95239d(mo95008t()).mo95243h(3).mo95236a();
    }

    /* renamed from: t */
    public final CrashlyticsReport.C32774f.C32780c mo95008t() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int f = m132133f();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long v = CommonUtils.m131940v();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean B = CommonUtils.m131912B();
        int n = CommonUtils.m131932n();
        String str = Build.MANUFACTURER;
        return CrashlyticsReport.C32774f.C32780c.m132494a().mo95259b(f).mo95263f(Build.MODEL).mo95260c(availableProcessors).mo95265h(v).mo95261d(blockCount).mo95266i(B).mo95267j(n).mo95262e(str).mo95264g(Build.PRODUCT).mo95258a();
    }

    /* renamed from: u */
    public final CrashlyticsReport.C32774f.C32802e mo95009u() {
        return CrashlyticsReport.C32774f.C32802e.m132622a().mo95373d(3).mo95374e(Build.VERSION.RELEASE).mo95371b(Build.VERSION.CODENAME).mo95372c(CommonUtils.m131914D()).mo95370a();
    }

    /* renamed from: v */
    public final CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d mo95010v() {
        return CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d.m132570a().mo95325d("0").mo95324c("0").mo95323b(0).mo95322a();
    }

    /* renamed from: w */
    public final CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e mo95011w(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return mo95012x(thread, stackTraceElementArr, 0);
    }

    /* renamed from: x */
    public final CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e mo95012x(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.m132578a().mo95332d(thread.getName()).mo95331c(i).mo95330b(C32833b0.m132702e(mo95005q(stackTraceElementArr, i))).mo95329a();
    }

    /* renamed from: y */
    public final C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e> mo95013y(C32948e eVar, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo95012x(thread, eVar.f80068c, i));
        if (z) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread2 = (Thread) next.getKey();
                if (!thread2.equals(thread)) {
                    arrayList.add(mo95011w(thread2, this.f79427d.mo95616a((StackTraceElement[]) next.getValue())));
                }
            }
        }
        return C32833b0.m132702e(arrayList);
    }
}
