package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.collection.C1866a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40979g;
import com.google.android.gms.common.wrappers.C41008d;
import com.google.android.gms.internal.measurement.C41855a5;
import com.google.android.gms.internal.measurement.C41881bd;
import com.google.android.gms.internal.measurement.C41955ff;
import com.google.android.gms.internal.measurement.C41963g5;
import com.google.android.gms.internal.measurement.C41998i4;
import com.google.android.gms.internal.measurement.C42026je;
import com.google.android.gms.internal.measurement.C42122p5;
import com.google.android.gms.internal.measurement.C42132pf;
import com.google.android.gms.internal.measurement.C42139q5;
import com.google.android.gms.internal.measurement.C42223v4;
import com.google.android.gms.internal.measurement.C42240w4;
import com.google.android.gms.internal.measurement.C42291z4;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.firebase.messaging.C33180f;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.usabilla.sdk.ubform.p007db.unsent.UnsentFeedbackTable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.measurement.internal.na */
public final class C30822na implements C30667b6 {

    /* renamed from: F */
    public static volatile C30822na f73789F;

    /* renamed from: A */
    public final Map f73790A;

    /* renamed from: B */
    public final Map f73791B;

    /* renamed from: C */
    public C30903u7 f73792C;

    /* renamed from: D */
    public String f73793D;

    /* renamed from: E */
    public final C30894ta f73794E = new C30762ia(this);

    /* renamed from: a */
    public final C30936x4 f73795a;

    /* renamed from: b */
    public final C30652a4 f73796b;

    /* renamed from: c */
    public C30787l f73797c;

    /* renamed from: d */
    public C30691d4 f73798d;

    /* renamed from: e */
    public C30941x9 f73799e;

    /* renamed from: f */
    public C30660b f73800f;

    /* renamed from: g */
    public final C30846pa f73801g;

    /* renamed from: h */
    public C30879s7 f73802h;

    /* renamed from: i */
    public C30722f9 f73803i;

    /* renamed from: j */
    public final C30671ba f73804j;

    /* renamed from: k */
    public C30816n4 f73805k;

    /* renamed from: l */
    public final C30731g5 f73806l;

    /* renamed from: m */
    public boolean f73807m = false;

    /* renamed from: n */
    public boolean f73808n;
    @C40974d0

    /* renamed from: o */
    public long f73809o;

    /* renamed from: p */
    public List f73810p;

    /* renamed from: q */
    public int f73811q;

    /* renamed from: r */
    public int f73812r;

    /* renamed from: s */
    public boolean f73813s;

    /* renamed from: t */
    public boolean f73814t;

    /* renamed from: u */
    public boolean f73815u;

    /* renamed from: v */
    public FileLock f73816v;

    /* renamed from: w */
    public FileChannel f73817w;

    /* renamed from: x */
    public List f73818x;

    /* renamed from: y */
    public List f73819y;

    /* renamed from: z */
    public long f73820z;

    public C30822na(C30834oa oaVar, C30731g5 g5Var) {
        C40843u.m166202l(oaVar);
        this.f73806l = C30731g5.m123740H(oaVar.f73836a, (zzcl) null, (Long) null);
        this.f73820z = -1;
        this.f73804j = new C30671ba(this);
        C30846pa paVar = new C30846pa(this);
        paVar.mo87628j();
        this.f73801g = paVar;
        C30652a4 a4Var = new C30652a4(this);
        a4Var.mo87628j();
        this.f73796b = a4Var;
        C30936x4 x4Var = new C30936x4(this);
        x4Var.mo87628j();
        this.f73795a = x4Var;
        this.f73790A = new HashMap();
        this.f73791B = new HashMap();
        mo86904f().mo86950z(new C30684ca(this, oaVar));
    }

    @C40974d0
    /* renamed from: G */
    public static final void m124009G(C42223v4 v4Var, int i, String str) {
        List P = v4Var.mo137368P();
        int i2 = 0;
        while (i2 < P.size()) {
            if (!"_err".equals(((C41855a5) P.get(i2)).mo136514H())) {
                i2++;
            } else {
                return;
            }
        }
        C42291z4 F = C41855a5.m169601F();
        F.mo137491I("_err");
        F.mo137490H(Long.valueOf((long) i).longValue());
        C42291z4 F2 = C41855a5.m169601F();
        F2.mo137491I("_ev");
        F2.mo137492J(str);
        v4Var.mo137358E((C41855a5) F.mo137180s());
        v4Var.mo137358E((C41855a5) F2.mo137180s());
    }

    @C40974d0
    /* renamed from: H */
    public static final void m124010H(C42223v4 v4Var, @C0359n0 String str) {
        List P = v4Var.mo137368P();
        for (int i = 0; i < P.size(); i++) {
            if (str.equals(((C41855a5) P.get(i)).mo136514H())) {
                v4Var.mo137360G(i);
                return;
            }
        }
    }

    /* renamed from: Q */
    public static final boolean m124011Q(zzq zzq) {
        return !TextUtils.isEmpty(zzq.f74189b) || !TextUtils.isEmpty(zzq.f74175F0);
    }

    /* renamed from: R */
    public static final C30965z9 m124012R(C30965z9 z9Var) {
        if (z9Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (z9Var.mo87629k()) {
            return z9Var;
        } else {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(z9Var.getClass())));
        }
    }

    /* renamed from: f0 */
    public static C30822na m124014f0(Context context) {
        C40843u.m166202l(context);
        C40843u.m166202l(context.getApplicationContext());
        if (f73789F == null) {
            synchronized (C30822na.class) {
                if (f73789F == null) {
                    f73789F = new C30822na((C30834oa) C40843u.m166202l(new C30834oa(context)), (C30731g5) null);
                }
            }
        }
        return f73789F;
    }

    /* renamed from: k0 */
    public static /* bridge */ /* synthetic */ void m124015k0(C30822na naVar, C30834oa oaVar) {
        naVar.mo86904f().mo86866h();
        naVar.f73805k = new C30816n4(naVar);
        C30787l lVar = new C30787l(naVar);
        lVar.mo87628j();
        naVar.f73797c = lVar;
        naVar.mo87358U().mo87093z((C30712f) C40843u.m166202l(naVar.f73795a));
        C30722f9 f9Var = new C30722f9(naVar);
        f9Var.mo87628j();
        naVar.f73803i = f9Var;
        C30660b bVar = new C30660b(naVar);
        bVar.mo87628j();
        naVar.f73800f = bVar;
        C30879s7 s7Var = new C30879s7(naVar);
        s7Var.mo87628j();
        naVar.f73802h = s7Var;
        C30941x9 x9Var = new C30941x9(naVar);
        x9Var.mo87628j();
        naVar.f73799e = x9Var;
        naVar.f73798d = new C30691d4(naVar);
        if (naVar.f73811q != naVar.f73812r) {
            naVar.mo86903d().mo87489r().mo87465c("Not all upload components initialized", Integer.valueOf(naVar.f73811q), Integer.valueOf(naVar.f73812r));
        }
        naVar.f73807m = true;
    }

    @C0348i1
    /* renamed from: A */
    public final void mo87342A(String str, C30738h hVar) {
        mo86904f().mo86866h();
        mo87369g();
        this.f73790A.put(str, hVar);
        C30787l lVar = this.f73797c;
        m124012R(lVar);
        C40843u.m166202l(str);
        C40843u.m166202l(hVar);
        lVar.mo86866h();
        lVar.mo87627i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", hVar.mo87140h());
        try {
            if (lVar.mo87212P().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                lVar.f74136a.mo86903d().mo87489r().mo87464b("Failed to insert/update consent setting (got -1). appId", C30899u3.m124186z(str));
            }
        } catch (SQLiteException e) {
            lVar.f74136a.mo86903d().mo87489r().mo87465c("Error storing consent setting. appId, error", C30899u3.m124186z(str), e);
        }
    }

    @C0348i1
    /* renamed from: B */
    public final void mo87343B(zzli zzli, zzq zzq) {
        long j;
        int i;
        zzli zzli2 = zzli;
        zzq zzq2 = zzq;
        mo86904f().mo86866h();
        mo87369g();
        if (m124011Q(zzq)) {
            if (!zzq2.f74195v) {
                mo87356S(zzq2);
                return;
            }
            int p0 = mo87372h0().mo87535p0(zzli2.f74168b);
            int i2 = 0;
            if (p0 != 0) {
                C30906ua h0 = mo87372h0();
                String str = zzli2.f74168b;
                mo87358U();
                String r = h0.mo87538r(str, 24, true);
                String str2 = zzli2.f74168b;
                if (str2 != null) {
                    i = str2.length();
                } else {
                    i = 0;
                }
                mo87372h0().mo87503C(this.f73794E, zzq2.f74188a, p0, "_ev", r, i);
                return;
            }
            int l0 = mo87372h0().mo87529l0(zzli2.f74168b, zzli.mo87644M());
            if (l0 != 0) {
                C30906ua h02 = mo87372h0();
                String str3 = zzli2.f74168b;
                mo87358U();
                String r2 = h02.mo87538r(str3, 24, true);
                Object M = zzli.mo87644M();
                if (M != null && ((M instanceof String) || (M instanceof CharSequence))) {
                    i2 = M.toString().length();
                }
                mo87372h0().mo87503C(this.f73794E, zzq2.f74188a, l0, "_ev", r2, i2);
                return;
            }
            Object p = mo87372h0().mo87534p(zzli2.f74168b, zzli.mo87644M());
            if (p != null) {
                if ("_sid".equals(zzli2.f74168b)) {
                    long j2 = zzli2.f74169c;
                    String str4 = zzli2.f74172f;
                    String str5 = (String) C40843u.m166202l(zzq2.f74188a);
                    C30787l lVar = this.f73797c;
                    m124012R(lVar);
                    C30870ra X = lVar.mo87219X(str5, "_sno");
                    if (X != null) {
                        Object obj = X.f73926e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            mo87343B(new zzli("_sno", j2, Long.valueOf(j + 1), str4), zzq2);
                        }
                    }
                    if (X != null) {
                        mo86903d().mo87494w().mo87464b("Retrieved last session number from database does not contain a valid (long) value", X.f73926e);
                    }
                    C30787l lVar2 = this.f73797c;
                    m124012R(lVar2);
                    C30859r V = lVar2.mo87218V(str5, "_s");
                    if (V != null) {
                        j = V.f73887c;
                        mo86903d().mo87493v().mo87464b("Backfill the session number. Last used session number", Long.valueOf(j));
                    } else {
                        j = 0;
                    }
                    mo87343B(new zzli("_sno", j2, Long.valueOf(j + 1), str4), zzq2);
                }
                C30870ra raVar = new C30870ra((String) C40843u.m166202l(zzq2.f74188a), (String) C40843u.m166202l(zzli2.f74172f), zzli2.f74168b, zzli2.f74169c, p);
                mo86903d().mo87493v().mo87465c("Setting user property", this.f73806l.mo87101D().mo87412f(raVar.f73924c), p);
                C30787l lVar3 = this.f73797c;
                m124012R(lVar3);
                lVar3.mo87226e0();
                try {
                    if ("_id".equals(raVar.f73924c)) {
                        C30787l lVar4 = this.f73797c;
                        m124012R(lVar4);
                        C30870ra X2 = lVar4.mo87219X(zzq2.f74188a, "_id");
                        if (X2 != null && !raVar.f73926e.equals(X2.f73926e)) {
                            C30787l lVar5 = this.f73797c;
                            m124012R(lVar5);
                            lVar5.mo87230m(zzq2.f74188a, "_lair");
                        }
                    }
                    mo87356S(zzq2);
                    C30787l lVar6 = this.f73797c;
                    m124012R(lVar6);
                    boolean x = lVar6.mo87241x(raVar);
                    C30787l lVar7 = this.f73797c;
                    m124012R(lVar7);
                    lVar7.mo87232o();
                    if (!x) {
                        mo86903d().mo87489r().mo87465c("Too many unique user properties are set. Ignoring user property", this.f73806l.mo87101D().mo87412f(raVar.f73924c), raVar.f73926e);
                        mo87372h0().mo87503C(this.f73794E, zzq2.f74188a, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    C30787l lVar8 = this.f73797c;
                    m124012R(lVar8);
                    lVar8.mo87227f0();
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:217|218) */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0211, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0212, code lost:
        r8.f74136a.mo86903d().mo87489r().mo87465c("Failed to merge queued bundle. appId", com.google.android.gms.measurement.internal.C30899u3.m124186z(r6), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x026b, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        r0 = r0.subList(0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02fb, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02fc, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:?, code lost:
        mo86903d().mo87489r().mo87465c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C30899u3.m124186z(r6), r0.mo86880a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x050e, code lost:
        if (r3 != null) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0538, code lost:
        r1.f73815u = r2;
        mo87350K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x053d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0126, code lost:
        if (r11 != null) goto L_0x0108;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:217:0x048c */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0294 A[SYNTHETIC, Splitter:B:142:0x0294] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x029d A[Catch:{ all -> 0x03cc, all -> 0x0533 }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04a7 A[Catch:{ all -> 0x03cc, all -> 0x0533 }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0518 A[Catch:{ all -> 0x03cc, all -> 0x0533 }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x052f A[SYNTHETIC, Splitter:B:257:0x052f] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0130 A[Catch:{ all -> 0x012c, all -> 0x0536 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:170:0x0302=Splitter:B:170:0x0302, B:247:0x0512=Splitter:B:247:0x0512, B:129:0x0268=Splitter:B:129:0x0268, B:139:0x027b=Splitter:B:139:0x027b, B:231:0x04eb=Splitter:B:231:0x04eb, B:217:0x048c=Splitter:B:217:0x048c} */
    @androidx.annotation.C0348i1
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87344C() {
        /*
            r22 = this;
            r1 = r22
            com.google.android.gms.measurement.internal.d5 r0 = r22.mo86904f()
            r0.mo86866h()
            r22.mo87369g()
            r2 = 1
            r1.f73815u = r2
            r3 = 0
            com.google.android.gms.measurement.internal.g5 r0 = r1.f73806l     // Catch:{ all -> 0x0536 }
            r0.mo86901b()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.g5 r0 = r1.f73806l     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.d9 r0 = r0.mo87108L()     // Catch:{ all -> 0x0536 }
            java.lang.Boolean r0 = r0.mo87026J()     // Catch:{ all -> 0x0536 }
            if (r0 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.u3 r0 = r22.mo86903d()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87494w()     // Catch:{ all -> 0x0536 }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            r0.mo87463a(r2)     // Catch:{ all -> 0x0536 }
            r1.f73815u = r3
        L_0x0030:
            r22.mo87350K()
            return
        L_0x0034:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0536 }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.measurement.internal.u3 r0 = r22.mo86903d()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87489r()     // Catch:{ all -> 0x0536 }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            r0.mo87463a(r2)     // Catch:{ all -> 0x0536 }
            r1.f73815u = r3
            goto L_0x0030
        L_0x004a:
            long r4 = r1.f73809o     // Catch:{ all -> 0x0536 }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0058
            r22.mo87352M()     // Catch:{ all -> 0x0536 }
            r1.f73815u = r3
            goto L_0x0030
        L_0x0058:
            com.google.android.gms.measurement.internal.d5 r0 = r22.mo86904f()     // Catch:{ all -> 0x0536 }
            r0.mo86866h()     // Catch:{ all -> 0x0536 }
            java.util.List r0 = r1.f73818x     // Catch:{ all -> 0x0536 }
            if (r0 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.u3 r0 = r22.mo86903d()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87493v()     // Catch:{ all -> 0x0536 }
            java.lang.String r2 = "Uploading requested multiple times"
            r0.mo87463a(r2)     // Catch:{ all -> 0x0536 }
            r1.f73815u = r3
            goto L_0x0030
        L_0x0073:
            com.google.android.gms.measurement.internal.a4 r0 = r1.f73796b     // Catch:{ all -> 0x0536 }
            m124012R(r0)     // Catch:{ all -> 0x0536 }
            boolean r0 = r0.mo86868m()     // Catch:{ all -> 0x0536 }
            if (r0 != 0) goto L_0x0091
            com.google.android.gms.measurement.internal.u3 r0 = r22.mo86903d()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87493v()     // Catch:{ all -> 0x0536 }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.mo87463a(r2)     // Catch:{ all -> 0x0536 }
            r22.mo87352M()     // Catch:{ all -> 0x0536 }
            r1.f73815u = r3
            goto L_0x0030
        L_0x0091:
            com.google.android.gms.common.util.g r0 = r22.mo86900a()     // Catch:{ all -> 0x0536 }
            long r4 = r0.mo134768a()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.g r0 = r22.mo87358U()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.g3 r8 = com.google.android.gms.measurement.internal.C30742h3.f73514T     // Catch:{ all -> 0x0536 }
            r9 = 0
            int r0 = r0.mo87082o(r9, r8)     // Catch:{ all -> 0x0536 }
            r22.mo87358U()     // Catch:{ all -> 0x0536 }
            long r10 = com.google.android.gms.measurement.internal.C30725g.m123709I()     // Catch:{ all -> 0x0536 }
            long r10 = r4 - r10
            r8 = r3
        L_0x00ae:
            if (r8 >= r0) goto L_0x00b9
            boolean r12 = r1.mo87353N(r9, r10)     // Catch:{ all -> 0x0536 }
            if (r12 == 0) goto L_0x00b9
            int r8 = r8 + 1
            goto L_0x00ae
        L_0x00b9:
            com.google.android.gms.measurement.internal.f9 r0 = r1.f73803i     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.g4 r0 = r0.f73398g     // Catch:{ all -> 0x0536 }
            long r10 = r0.mo87096a()     // Catch:{ all -> 0x0536 }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00dc
            com.google.android.gms.measurement.internal.u3 r0 = r22.mo86903d()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87488q()     // Catch:{ all -> 0x0536 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r4 - r10
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0536 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0536 }
            r0.mo87464b(r6, r7)     // Catch:{ all -> 0x0536 }
        L_0x00dc:
            com.google.android.gms.measurement.internal.l r0 = r1.f73797c     // Catch:{ all -> 0x0536 }
            m124012R(r0)     // Catch:{ all -> 0x0536 }
            java.lang.String r6 = r0.mo87221Z()     // Catch:{ all -> 0x0536 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0536 }
            r7 = -1
            if (r0 != 0) goto L_0x04ab
            long r10 = r1.f73820z     // Catch:{ all -> 0x0536 }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0134
            com.google.android.gms.measurement.internal.l r10 = r1.f73797c     // Catch:{ all -> 0x0536 }
            m124012R(r10)     // Catch:{ all -> 0x0536 }
            android.database.sqlite.SQLiteDatabase r0 = r10.mo87212P()     // Catch:{ SQLiteException -> 0x0115, all -> 0x0113 }
            java.lang.String r11 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r11, r9)     // Catch:{ SQLiteException -> 0x0115, all -> 0x0113 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0111 }
            if (r0 != 0) goto L_0x010c
        L_0x0108:
            r11.close()     // Catch:{ all -> 0x0536 }
            goto L_0x0129
        L_0x010c:
            long r7 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0111 }
            goto L_0x0108
        L_0x0111:
            r0 = move-exception
            goto L_0x0117
        L_0x0113:
            r0 = move-exception
            goto L_0x012e
        L_0x0115:
            r0 = move-exception
            r11 = r9
        L_0x0117:
            com.google.android.gms.measurement.internal.g5 r10 = r10.f74136a     // Catch:{ all -> 0x012c }
            com.google.android.gms.measurement.internal.u3 r10 = r10.mo86903d()     // Catch:{ all -> 0x012c }
            com.google.android.gms.measurement.internal.s3 r10 = r10.mo87489r()     // Catch:{ all -> 0x012c }
            java.lang.String r12 = "Error querying raw events"
            r10.mo87464b(r12, r0)     // Catch:{ all -> 0x012c }
            if (r11 == 0) goto L_0x0129
            goto L_0x0108
        L_0x0129:
            r1.f73820z = r7     // Catch:{ all -> 0x0536 }
            goto L_0x0134
        L_0x012c:
            r0 = move-exception
            r9 = r11
        L_0x012e:
            if (r9 == 0) goto L_0x0133
            r9.close()     // Catch:{ all -> 0x0536 }
        L_0x0133:
            throw r0     // Catch:{ all -> 0x0536 }
        L_0x0134:
            com.google.android.gms.measurement.internal.g r0 = r22.mo87358U()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.g3 r7 = com.google.android.gms.measurement.internal.C30742h3.f73537i     // Catch:{ all -> 0x0536 }
            int r0 = r0.mo87082o(r6, r7)     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.g r7 = r22.mo87358U()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.g3 r8 = com.google.android.gms.measurement.internal.C30742h3.f73539j     // Catch:{ all -> 0x0536 }
            int r7 = r7.mo87082o(r6, r8)     // Catch:{ all -> 0x0536 }
            int r7 = java.lang.Math.max(r3, r7)     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.l r8 = r1.f73797c     // Catch:{ all -> 0x0536 }
            m124012R(r8)     // Catch:{ all -> 0x0536 }
            r8.mo86866h()     // Catch:{ all -> 0x0536 }
            r8.mo87627i()     // Catch:{ all -> 0x0536 }
            if (r0 <= 0) goto L_0x015b
            r10 = r2
            goto L_0x015c
        L_0x015b:
            r10 = r3
        L_0x015c:
            com.google.android.gms.common.internal.C40843u.m166191a(r10)     // Catch:{ all -> 0x0536 }
            if (r7 <= 0) goto L_0x0163
            r10 = r2
            goto L_0x0164
        L_0x0163:
            r10 = r3
        L_0x0164:
            com.google.android.gms.common.internal.C40843u.m166191a(r10)     // Catch:{ all -> 0x0536 }
            com.google.android.gms.common.internal.C40843u.m166198h(r6)     // Catch:{ all -> 0x0536 }
            android.database.sqlite.SQLiteDatabase r11 = r8.mo87212P()     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String r12 = "queue"
            java.lang.String r13 = "rowid"
            java.lang.String r14 = "data"
            java.lang.String r15 = "retry_count"
            java.lang.String[] r13 = new java.lang.String[]{r13, r14, r15}     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String r14 = "app_id=?"
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            r15[r3] = r6     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x026f }
            if (r0 != 0) goto L_0x019f
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x026f }
            r11.close()     // Catch:{ all -> 0x0536 }
            r20 = r4
            goto L_0x0297
        L_0x019f:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x026f }
            r12.<init>()     // Catch:{ SQLiteException -> 0x026f }
            r13 = r3
        L_0x01a5:
            long r14 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x026f }
            byte[] r0 = r11.getBlob(r2)     // Catch:{ IOException -> 0x0242 }
            com.google.android.gms.measurement.internal.na r9 = r8.f74119b     // Catch:{ IOException -> 0x0242 }
            com.google.android.gms.measurement.internal.pa r9 = r9.f73801g     // Catch:{ IOException -> 0x0242 }
            m124012R(r9)     // Catch:{ IOException -> 0x0242 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x022d }
            r2.<init>(r0)     // Catch:{ IOException -> 0x022d }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x022d }
            r0.<init>(r2)     // Catch:{ IOException -> 0x022d }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x022d }
            r3.<init>()     // Catch:{ IOException -> 0x022d }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x022d }
            r20 = r4
        L_0x01c9:
            int r4 = r0.read(r10)     // Catch:{ IOException -> 0x022b }
            if (r4 > 0) goto L_0x0226
            r0.close()     // Catch:{ IOException -> 0x022b }
            r2.close()     // Catch:{ IOException -> 0x022b }
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x022b }
            boolean r2 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x026d }
            if (r2 != 0) goto L_0x01e5
            int r2 = r0.length     // Catch:{ SQLiteException -> 0x026d }
            int r2 = r2 + r13
            if (r2 <= r7) goto L_0x01e5
            goto L_0x0268
        L_0x01e5:
            com.google.android.gms.internal.measurement.g5 r2 = com.google.android.gms.internal.measurement.C41981h5.m170105S1()     // Catch:{ IOException -> 0x0211 }
            com.google.android.gms.internal.measurement.va r2 = com.google.android.gms.measurement.internal.C30846pa.m124112C(r2, r0)     // Catch:{ IOException -> 0x0211 }
            com.google.android.gms.internal.measurement.g5 r2 = (com.google.android.gms.internal.measurement.C41963g5) r2     // Catch:{ IOException -> 0x0211 }
            r3 = 2
            boolean r4 = r11.isNull(r3)     // Catch:{ SQLiteException -> 0x026d }
            if (r4 != 0) goto L_0x01fd
            int r4 = r11.getInt(r3)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo136858l0(r4)     // Catch:{ SQLiteException -> 0x026d }
        L_0x01fd:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x026d }
            int r13 = r13 + r0
            com.google.android.gms.internal.measurement.s9 r0 = r2.mo137180s()     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.internal.measurement.h5 r0 = (com.google.android.gms.internal.measurement.C41981h5) r0     // Catch:{ SQLiteException -> 0x026d }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x026d }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x026d }
            r12.add(r0)     // Catch:{ SQLiteException -> 0x026d }
            goto L_0x0258
        L_0x0211:
            r0 = move-exception
            com.google.android.gms.measurement.internal.g5 r2 = r8.f74136a     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87489r()     // Catch:{ SQLiteException -> 0x026d }
            java.lang.String r3 = "Failed to merge queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r6)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo87465c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x026d }
            goto L_0x0258
        L_0x0226:
            r5 = 0
            r3.write(r10, r5, r4)     // Catch:{ IOException -> 0x022b }
            goto L_0x01c9
        L_0x022b:
            r0 = move-exception
            goto L_0x0230
        L_0x022d:
            r0 = move-exception
            r20 = r4
        L_0x0230:
            com.google.android.gms.measurement.internal.g5 r2 = r9.f74136a     // Catch:{ IOException -> 0x0240 }
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()     // Catch:{ IOException -> 0x0240 }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87489r()     // Catch:{ IOException -> 0x0240 }
            java.lang.String r3 = "Failed to ungzip content"
            r2.mo87464b(r3, r0)     // Catch:{ IOException -> 0x0240 }
            throw r0     // Catch:{ IOException -> 0x0240 }
        L_0x0240:
            r0 = move-exception
            goto L_0x0245
        L_0x0242:
            r0 = move-exception
            r20 = r4
        L_0x0245:
            com.google.android.gms.measurement.internal.g5 r2 = r8.f74136a     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87489r()     // Catch:{ SQLiteException -> 0x026d }
            java.lang.String r3 = "Failed to unzip queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r6)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo87465c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x026d }
        L_0x0258:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x026d }
            if (r0 == 0) goto L_0x0268
            if (r13 <= r7) goto L_0x0261
            goto L_0x0268
        L_0x0261:
            r4 = r20
            r2 = 1
            r3 = 0
            r9 = 0
            goto L_0x01a5
        L_0x0268:
            r11.close()     // Catch:{ all -> 0x0533 }
            r0 = r12
            goto L_0x0297
        L_0x026d:
            r0 = move-exception
            goto L_0x027b
        L_0x026f:
            r0 = move-exception
            r20 = r4
            goto L_0x027b
        L_0x0273:
            r0 = move-exception
            r9 = 0
            goto L_0x04a5
        L_0x0277:
            r0 = move-exception
            r20 = r4
            r11 = 0
        L_0x027b:
            com.google.android.gms.measurement.internal.g5 r2 = r8.f74136a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87489r()     // Catch:{ all -> 0x04a3 }
            java.lang.String r3 = "Error querying bundles. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r6)     // Catch:{ all -> 0x04a3 }
            r2.mo87465c(r3, r4, r0)     // Catch:{ all -> 0x04a3 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x04a3 }
            if (r11 == 0) goto L_0x0297
            r11.close()     // Catch:{ all -> 0x0533 }
        L_0x0297:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0533 }
            if (r2 != 0) goto L_0x0526
            com.google.android.gms.measurement.internal.h r2 = r1.mo87359V(r6)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.zzah r3 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x0533 }
            boolean r2 = r2.mo87142i(r3)     // Catch:{ all -> 0x0533 }
            if (r2 == 0) goto L_0x0302
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0533 }
        L_0x02ad:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0533 }
            if (r3 == 0) goto L_0x02cc
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0533 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0533 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.h5 r3 = (com.google.android.gms.internal.measurement.C41981h5) r3     // Catch:{ all -> 0x0533 }
            java.lang.String r4 = r3.mo136964L()     // Catch:{ all -> 0x0533 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0533 }
            if (r4 != 0) goto L_0x02ad
            java.lang.String r2 = r3.mo136964L()     // Catch:{ all -> 0x0533 }
            goto L_0x02cd
        L_0x02cc:
            r2 = 0
        L_0x02cd:
            if (r2 == 0) goto L_0x0302
            r3 = 0
        L_0x02d0:
            int r4 = r0.size()     // Catch:{ all -> 0x0533 }
            if (r3 >= r4) goto L_0x0302
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0533 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x0533 }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.h5 r4 = (com.google.android.gms.internal.measurement.C41981h5) r4     // Catch:{ all -> 0x0533 }
            java.lang.String r5 = r4.mo136964L()     // Catch:{ all -> 0x0533 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0533 }
            if (r5 == 0) goto L_0x02eb
            goto L_0x02ff
        L_0x02eb:
            java.lang.String r4 = r4.mo136964L()     // Catch:{ all -> 0x0533 }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0533 }
            if (r4 != 0) goto L_0x02ff
            r4 = 0
            java.util.List r0 = r0.subList(r4, r3)     // Catch:{ all -> 0x02fb }
            goto L_0x0302
        L_0x02fb:
            r0 = move-exception
            r2 = r4
            goto L_0x0538
        L_0x02ff:
            int r3 = r3 + 1
            goto L_0x02d0
        L_0x0302:
            com.google.android.gms.internal.measurement.e5 r2 = com.google.android.gms.internal.measurement.C41945f5.m169867B()     // Catch:{ all -> 0x0533 }
            int r3 = r0.size()     // Catch:{ all -> 0x0533 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0533 }
            int r5 = r0.size()     // Catch:{ all -> 0x0533 }
            r4.<init>(r5)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.g r5 = r22.mo87358U()     // Catch:{ all -> 0x0533 }
            boolean r5 = r5.mo87071C(r6)     // Catch:{ all -> 0x0533 }
            if (r5 == 0) goto L_0x032b
            com.google.android.gms.measurement.internal.h r5 = r1.mo87359V(r6)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.zzah r7 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x0533 }
            boolean r5 = r5.mo87142i(r7)     // Catch:{ all -> 0x0533 }
            if (r5 == 0) goto L_0x032b
            r5 = 1
            goto L_0x032c
        L_0x032b:
            r5 = 0
        L_0x032c:
            com.google.android.gms.measurement.internal.h r7 = r1.mo87359V(r6)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.zzah r8 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x0533 }
            boolean r7 = r7.mo87142i(r8)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.h r8 = r1.mo87359V(r6)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.zzah r9 = com.google.android.gms.measurement.internal.zzah.ANALYTICS_STORAGE     // Catch:{ all -> 0x0533 }
            boolean r8 = r8.mo87142i(r9)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.C41955ff.m169896b()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.g r9 = r22.mo87358U()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.g3 r10 = com.google.android.gms.measurement.internal.C30742h3.f73554q0     // Catch:{ all -> 0x0533 }
            boolean r9 = r9.mo87070B(r6, r10)     // Catch:{ all -> 0x0533 }
            r10 = 0
        L_0x034e:
            if (r10 >= r3) goto L_0x03d0
            java.lang.Object r11 = r0.get(r10)     // Catch:{ all -> 0x0533 }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x0533 }
            java.lang.Object r11 = r11.first     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.h5 r11 = (com.google.android.gms.internal.measurement.C41981h5) r11     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.n9 r11 = r11.mo137278k()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.g5 r11 = (com.google.android.gms.internal.measurement.C41963g5) r11     // Catch:{ all -> 0x0533 }
            java.lang.Object r12 = r0.get(r10)     // Catch:{ all -> 0x0533 }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x0533 }
            java.lang.Object r12 = r12.second     // Catch:{ all -> 0x0533 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0533 }
            r4.add(r12)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.g r12 = r22.mo87358U()     // Catch:{ all -> 0x0533 }
            r12.mo87084q()     // Catch:{ all -> 0x0533 }
            r12 = 76003(0x128e3, double:3.75505E-319)
            r11.mo136865v0(r12)     // Catch:{ all -> 0x0533 }
            r12 = r20
            r11.mo136864u0(r12)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.g5 r14 = r1.f73806l     // Catch:{ all -> 0x0533 }
            r14.mo86901b()     // Catch:{ all -> 0x0533 }
            r14 = 0
            r11.mo136859m0(r14)     // Catch:{ all -> 0x03cc }
            if (r5 != 0) goto L_0x038d
            r11.mo136837X0()     // Catch:{ all -> 0x0533 }
        L_0x038d:
            if (r7 != 0) goto L_0x0395
            r11.mo136850e1()     // Catch:{ all -> 0x0533 }
            r11.mo136843a1()     // Catch:{ all -> 0x0533 }
        L_0x0395:
            if (r8 != 0) goto L_0x039a
            r11.mo136833U0()     // Catch:{ all -> 0x0533 }
        L_0x039a:
            r1.mo87371h(r6, r11)     // Catch:{ all -> 0x0533 }
            if (r9 != 0) goto L_0x03a2
            r11.mo136851f1()     // Catch:{ all -> 0x0533 }
        L_0x03a2:
            com.google.android.gms.measurement.internal.g r14 = r22.mo87358U()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.g3 r15 = com.google.android.gms.measurement.internal.C30742h3.f73518X     // Catch:{ all -> 0x0533 }
            boolean r14 = r14.mo87070B(r6, r15)     // Catch:{ all -> 0x0533 }
            if (r14 == 0) goto L_0x03c4
            com.google.android.gms.internal.measurement.s9 r14 = r11.mo137180s()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.h5 r14 = (com.google.android.gms.internal.measurement.C41981h5) r14     // Catch:{ all -> 0x0533 }
            byte[] r14 = r14.mo136762g()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.pa r15 = r1.f73801g     // Catch:{ all -> 0x0533 }
            m124012R(r15)     // Catch:{ all -> 0x0533 }
            long r14 = r15.mo87431x(r14)     // Catch:{ all -> 0x0533 }
            r11.mo136812I(r14)     // Catch:{ all -> 0x0533 }
        L_0x03c4:
            r2.mo136711x(r11)     // Catch:{ all -> 0x0533 }
            int r10 = r10 + 1
            r20 = r12
            goto L_0x034e
        L_0x03cc:
            r0 = move-exception
            r2 = r14
            goto L_0x0538
        L_0x03d0:
            r12 = r20
            com.google.android.gms.measurement.internal.u3 r0 = r22.mo86903d()     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = r0.mo87486D()     // Catch:{ all -> 0x0533 }
            r5 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x0533 }
            if (r0 == 0) goto L_0x03f1
            com.google.android.gms.measurement.internal.pa r0 = r1.f73801g     // Catch:{ all -> 0x0533 }
            m124012R(r0)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.s9 r5 = r2.mo137180s()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.f5 r5 = (com.google.android.gms.internal.measurement.C41945f5) r5     // Catch:{ all -> 0x0533 }
            java.lang.String r9 = r0.mo87420D(r5)     // Catch:{ all -> 0x0533 }
            goto L_0x03f2
        L_0x03f1:
            r9 = 0
        L_0x03f2:
            com.google.android.gms.measurement.internal.pa r0 = r1.f73801g     // Catch:{ all -> 0x0533 }
            m124012R(r0)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.s9 r0 = r2.mo137180s()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.f5 r0 = (com.google.android.gms.internal.measurement.C41945f5) r0     // Catch:{ all -> 0x0533 }
            byte[] r14 = r0.mo136762g()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.ba r0 = r1.f73804j     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.aa r0 = r0.mo86908i(r6)     // Catch:{ all -> 0x0533 }
            boolean r5 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x048c }
            r7 = 1
            r5 = r5 ^ r7
            com.google.android.gms.common.internal.C40843u.m166191a(r5)     // Catch:{ MalformedURLException -> 0x048c }
            java.util.List r5 = r1.f73818x     // Catch:{ MalformedURLException -> 0x048c }
            if (r5 == 0) goto L_0x0422
            com.google.android.gms.measurement.internal.u3 r4 = r22.mo86903d()     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo87489r()     // Catch:{ MalformedURLException -> 0x048c }
            java.lang.String r5 = "Set uploading progress before finishing the previous upload"
            r4.mo87463a(r5)     // Catch:{ MalformedURLException -> 0x048c }
            goto L_0x0429
        L_0x0422:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x048c }
            r5.<init>(r4)     // Catch:{ MalformedURLException -> 0x048c }
            r1.f73818x = r5     // Catch:{ MalformedURLException -> 0x048c }
        L_0x0429:
            com.google.android.gms.measurement.internal.f9 r4 = r1.f73803i     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.measurement.internal.g4 r4 = r4.f73399h     // Catch:{ MalformedURLException -> 0x048c }
            r4.mo87097b(r12)     // Catch:{ MalformedURLException -> 0x048c }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x043d
            r3 = 0
            com.google.android.gms.internal.measurement.h5 r2 = r2.mo136710A(r3)     // Catch:{  }
            java.lang.String r4 = r2.mo136978W1()     // Catch:{ MalformedURLException -> 0x048c }
        L_0x043d:
            com.google.android.gms.measurement.internal.u3 r2 = r22.mo86903d()     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87493v()     // Catch:{ MalformedURLException -> 0x048c }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r5 = r14.length     // Catch:{ MalformedURLException -> 0x048c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ MalformedURLException -> 0x048c }
            r2.mo87466d(r3, r4, r5, r9)     // Catch:{ MalformedURLException -> 0x048c }
            r2 = 1
            r1.f73814t = r2     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.measurement.internal.a4 r11 = r1.f73796b     // Catch:{ MalformedURLException -> 0x048c }
            m124012R(r11)     // Catch:{ MalformedURLException -> 0x048c }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x048c }
            java.lang.String r2 = r0.mo86880a()     // Catch:{ MalformedURLException -> 0x048c }
            r13.<init>(r2)     // Catch:{ MalformedURLException -> 0x048c }
            java.util.Map r15 = r0.mo86881b()     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.measurement.internal.da r2 = new com.google.android.gms.measurement.internal.da     // Catch:{ MalformedURLException -> 0x048c }
            r2.<init>(r1, r6)     // Catch:{ MalformedURLException -> 0x048c }
            r11.mo86866h()     // Catch:{ MalformedURLException -> 0x048c }
            r11.mo87627i()     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.common.internal.C40843u.m166202l(r13)     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.common.internal.C40843u.m166202l(r14)     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.common.internal.C40843u.m166202l(r2)     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.measurement.internal.g5 r3 = r11.f74136a     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.measurement.internal.d5 r3 = r3.mo86904f()     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.measurement.internal.z3 r4 = new com.google.android.gms.measurement.internal.z3     // Catch:{ MalformedURLException -> 0x048c }
            r10 = r4
            r12 = r6
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x048c }
            r3.mo86949y(r4)     // Catch:{ MalformedURLException -> 0x048c }
            goto L_0x0526
        L_0x048c:
            com.google.android.gms.measurement.internal.u3 r2 = r22.mo86903d()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87489r()     // Catch:{ all -> 0x0533 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r6)     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = r0.mo86880a()     // Catch:{ all -> 0x0533 }
            r2.mo87465c(r3, r4, r0)     // Catch:{ all -> 0x0533 }
            goto L_0x0526
        L_0x04a3:
            r0 = move-exception
            r9 = r11
        L_0x04a5:
            if (r9 == 0) goto L_0x04aa
            r9.close()     // Catch:{ all -> 0x0533 }
        L_0x04aa:
            throw r0     // Catch:{ all -> 0x0533 }
        L_0x04ab:
            r12 = r4
            r1.f73820z = r7     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c     // Catch:{ all -> 0x0533 }
            m124012R(r2)     // Catch:{ all -> 0x0533 }
            r22.mo87358U()     // Catch:{ all -> 0x0533 }
            long r3 = com.google.android.gms.measurement.internal.C30725g.m123709I()     // Catch:{ all -> 0x0533 }
            long r4 = r12 - r3
            r2.mo86866h()     // Catch:{ all -> 0x0533 }
            r2.mo87627i()     // Catch:{ all -> 0x0533 }
            android.database.sqlite.SQLiteDatabase r0 = r2.mo87212P()     // Catch:{ SQLiteException -> 0x04fd, all -> 0x04fa }
            java.lang.String r3 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x04fd, all -> 0x04fa }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x04fd, all -> 0x04fa }
            r5 = 0
            r6[r5] = r4     // Catch:{ SQLiteException -> 0x04fd, all -> 0x04fa }
            android.database.Cursor r3 = r0.rawQuery(r3, r6)     // Catch:{ SQLiteException -> 0x04fd, all -> 0x04fa }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x04f8 }
            if (r0 != 0) goto L_0x04ef
            com.google.android.gms.measurement.internal.g5 r0 = r2.f74136a     // Catch:{ SQLiteException -> 0x04f8 }
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()     // Catch:{ SQLiteException -> 0x04f8 }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87493v()     // Catch:{ SQLiteException -> 0x04f8 }
            java.lang.String r4 = "No expired configs for apps with pending events"
            r0.mo87463a(r4)     // Catch:{ SQLiteException -> 0x04f8 }
        L_0x04eb:
            r3.close()     // Catch:{ all -> 0x0533 }
            goto L_0x0511
        L_0x04ef:
            r4 = 0
            java.lang.String r9 = r3.getString(r4)     // Catch:{ SQLiteException -> 0x04f8 }
            r3.close()     // Catch:{ all -> 0x0533 }
            goto L_0x0512
        L_0x04f8:
            r0 = move-exception
            goto L_0x04ff
        L_0x04fa:
            r0 = move-exception
            r9 = 0
            goto L_0x052d
        L_0x04fd:
            r0 = move-exception
            r3 = 0
        L_0x04ff:
            com.google.android.gms.measurement.internal.g5 r2 = r2.f74136a     // Catch:{ all -> 0x052b }
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()     // Catch:{ all -> 0x052b }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87489r()     // Catch:{ all -> 0x052b }
            java.lang.String r4 = "Error selecting expired configs"
            r2.mo87464b(r4, r0)     // Catch:{ all -> 0x052b }
            if (r3 == 0) goto L_0x0511
            goto L_0x04eb
        L_0x0511:
            r9 = 0
        L_0x0512:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0533 }
            if (r0 != 0) goto L_0x0526
            com.google.android.gms.measurement.internal.l r0 = r1.f73797c     // Catch:{ all -> 0x0533 }
            m124012R(r0)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.d6 r0 = r0.mo87214R(r9)     // Catch:{ all -> 0x0533 }
            if (r0 == 0) goto L_0x0526
            r1.mo87373i(r0)     // Catch:{ all -> 0x0533 }
        L_0x0526:
            r2 = 0
            r1.f73815u = r2
            goto L_0x0030
        L_0x052b:
            r0 = move-exception
            r9 = r3
        L_0x052d:
            if (r9 == 0) goto L_0x0532
            r9.close()     // Catch:{ all -> 0x0533 }
        L_0x0532:
            throw r0     // Catch:{ all -> 0x0533 }
        L_0x0533:
            r0 = move-exception
            r2 = 0
            goto L_0x0538
        L_0x0536:
            r0 = move-exception
            r2 = r3
        L_0x0538:
            r1.f73815u = r2
            r22.mo87350K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30822na.mo87344C():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:240:0x07cf, code lost:
        if (r14.isEmpty() != false) goto L_0x07d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x033f A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0382 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0385 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03e4 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0573 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x05b3 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x062c A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0677 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0684 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0691 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x06c9 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x06da A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x071b A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0742 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0747 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x074d A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x07d4 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x081a A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0869 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0876 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x088f A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x091b A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x093b A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x09cd A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0a7c A[Catch:{ SQLiteException -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0a92  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x09df A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01ce A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01e7 A[SYNTHETIC, Splitter:B:55:0x01e7] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x024b A[SYNTHETIC, Splitter:B:69:0x024b] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x025b A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    @androidx.annotation.C0348i1
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87345D(com.google.android.gms.measurement.internal.zzaw r36, com.google.android.gms.measurement.internal.zzq r37) {
        /*
            r35 = this;
            r1 = r35
            r2 = r36
            r3 = r37
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            com.google.android.gms.common.internal.C40843u.m166202l(r37)
            java.lang.String r8 = r3.f74188a
            com.google.android.gms.common.internal.C40843u.m166198h(r8)
            long r8 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.d5 r10 = r35.mo86904f()
            r10.mo86866h()
            r35.mo87369g()
            java.lang.String r10 = r3.f74188a
            com.google.android.gms.measurement.internal.pa r11 = r1.f73801g
            m124012R(r11)
            boolean r11 = com.google.android.gms.measurement.internal.C30846pa.m124117m(r36, r37)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.f74195v
            if (r11 == 0) goto L_0x0b1e
            com.google.android.gms.measurement.internal.x4 r11 = r1.f73795a
            m124012R(r11)
            java.lang.String r12 = r2.f74163a
            boolean r11 = r11.mo87574F(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.u3 r3 = r35.mo86903d()
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87494w()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r10)
            com.google.android.gms.measurement.internal.g5 r5 = r1.f73806l
            com.google.android.gms.measurement.internal.p3 r5 = r5.mo87101D()
            java.lang.String r6 = r2.f74163a
            java.lang.String r5 = r5.mo87410d(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.mo87465c(r6, r4, r5)
            com.google.android.gms.measurement.internal.x4 r3 = r1.f73795a
            m124012R(r3)
            boolean r3 = r3.mo87572D(r10)
            if (r3 != 0) goto L_0x0097
            com.google.android.gms.measurement.internal.x4 r3 = r1.f73795a
            m124012R(r3)
            boolean r3 = r3.mo87575G(r10)
            if (r3 == 0) goto L_0x007a
            goto L_0x0097
        L_0x007a:
            java.lang.String r3 = r2.f74163a
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00de
            com.google.android.gms.measurement.internal.ua r11 = r35.mo87372h0()
            com.google.android.gms.measurement.internal.ta r12 = r1.f73794E
            java.lang.String r2 = r2.f74163a
            r14 = 11
            java.lang.String r15 = "_ev"
            r17 = 0
            r13 = r10
            r16 = r2
            r11.mo87503C(r12, r13, r14, r15, r16, r17)
            return
        L_0x0097:
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c
            m124012R(r2)
            com.google.android.gms.measurement.internal.d6 r2 = r2.mo87214R(r10)
            if (r2 == 0) goto L_0x00de
            long r3 = r2.mo86976Z()
            long r5 = r2.mo86967Q()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.common.util.g r5 = r35.mo86900a()
            long r5 = r5.mo134768a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r35.mo87358U()
            com.google.android.gms.measurement.internal.g3 r5 = com.google.android.gms.measurement.internal.C30742h3.f73488B
            java.lang.Object r5 = r5.mo87094a(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.u3 r3 = r35.mo86903d()
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87488q()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.mo87463a(r4)
            r1.mo87373i(r2)
        L_0x00de:
            return
        L_0x00df:
            com.google.android.gms.measurement.internal.v3 r2 = com.google.android.gms.measurement.internal.C30911v3.m124271b(r36)
            com.google.android.gms.measurement.internal.ua r11 = r35.mo87372h0()
            com.google.android.gms.measurement.internal.g r12 = r35.mo87358U()
            int r12 = r12.mo87081n(r10)
            r11.mo87502B(r2, r12)
            com.google.android.gms.internal.measurement.C41864ae.m169689b()
            com.google.android.gms.measurement.internal.g r11 = r35.mo87358U()
            com.google.android.gms.measurement.internal.g3 r12 = com.google.android.gms.measurement.internal.C30742h3.f73491C0
            boolean r11 = r11.mo87070B(r14, r12)
            if (r11 == 0) goto L_0x0110
            com.google.android.gms.measurement.internal.g r11 = r35.mo87358U()
            com.google.android.gms.measurement.internal.g3 r12 = com.google.android.gms.measurement.internal.C30742h3.f73513S
            r13 = 10
            r14 = 35
            int r11 = r11.mo87083p(r10, r12, r13, r14)
            goto L_0x0111
        L_0x0110:
            r11 = 0
        L_0x0111:
            java.util.TreeSet r12 = new java.util.TreeSet
            android.os.Bundle r13 = r2.f74021d
            java.util.Set r13 = r13.keySet()
            r12.<init>(r13)
            java.util.Iterator r12 = r12.iterator()
        L_0x0120:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x015c
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = "items"
            boolean r14 = r14.equals(r13)
            if (r14 == 0) goto L_0x0120
            com.google.android.gms.measurement.internal.ua r14 = r35.mo87372h0()
            r17 = r12
            android.os.Bundle r12 = r2.f74021d
            android.os.Parcelable[] r12 = r12.getParcelableArray(r13)
            com.google.android.gms.internal.measurement.C41864ae.m169689b()
            com.google.android.gms.measurement.internal.g r13 = r35.mo87358U()
            r18 = r15
            com.google.android.gms.measurement.internal.g3 r15 = com.google.android.gms.measurement.internal.C30742h3.f73491C0
            r28 = r8
            r8 = 0
            boolean r9 = r13.mo87070B(r8, r15)
            r14.mo87501A(r12, r11, r9)
            r12 = r17
            r15 = r18
            r8 = r28
            goto L_0x0120
        L_0x015c:
            r28 = r8
            r18 = r15
            com.google.android.gms.measurement.internal.zzaw r2 = r2.mo87552a()
            com.google.android.gms.measurement.internal.u3 r8 = r35.mo86903d()
            java.lang.String r8 = r8.mo87486D()
            r9 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r9)
            if (r8 == 0) goto L_0x018a
            com.google.android.gms.measurement.internal.u3 r8 = r35.mo86903d()
            com.google.android.gms.measurement.internal.s3 r8 = r8.mo87493v()
            com.google.android.gms.measurement.internal.g5 r11 = r1.f73806l
            com.google.android.gms.measurement.internal.p3 r11 = r11.mo87101D()
            java.lang.String r11 = r11.mo87409c(r2)
            java.lang.String r12 = "Logging event"
            r8.mo87464b(r12, r11)
        L_0x018a:
            com.google.android.gms.internal.measurement.C42266xd.m171155b()
            com.google.android.gms.measurement.internal.g r8 = r35.mo87358U()
            com.google.android.gms.measurement.internal.g3 r11 = com.google.android.gms.measurement.internal.C30742h3.f73572z0
            r14 = 0
            r8.mo87070B(r14, r11)
            com.google.android.gms.measurement.internal.l r8 = r1.f73797c
            m124012R(r8)
            r8.mo87226e0()
            r1.mo87356S(r3)     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = "ecommerce_purchase"
            java.lang.String r11 = r2.f74163a     // Catch:{ all -> 0x0b13 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0b13 }
            java.lang.String r11 = "refund"
            if (r8 != 0) goto L_0x01c3
            java.lang.String r8 = "purchase"
            java.lang.String r12 = r2.f74163a     // Catch:{ all -> 0x0b13 }
            boolean r8 = r8.equals(r12)     // Catch:{ all -> 0x0b13 }
            if (r8 != 0) goto L_0x01c3
            java.lang.String r8 = r2.f74163a     // Catch:{ all -> 0x0b13 }
            boolean r8 = r11.equals(r8)     // Catch:{ all -> 0x0b13 }
            if (r8 == 0) goto L_0x01c1
            goto L_0x01c3
        L_0x01c1:
            r8 = 0
            goto L_0x01c4
        L_0x01c3:
            r8 = 1
        L_0x01c4:
            java.lang.String r12 = "_iap"
            java.lang.String r13 = r2.f74163a     // Catch:{ all -> 0x0b13 }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0b13 }
            if (r12 != 0) goto L_0x01db
            if (r8 == 0) goto L_0x01d2
            r8 = 1
            goto L_0x01db
        L_0x01d2:
            r32 = r4
            r33 = r5
            r4 = r18
            r5 = 1
            goto L_0x036f
        L_0x01db:
            com.google.android.gms.measurement.internal.zzau r12 = r2.f74164b     // Catch:{ all -> 0x0b13 }
            java.lang.String r13 = "currency"
            java.lang.String r12 = r12.mo87639n0(r13)     // Catch:{ all -> 0x0b13 }
            java.lang.String r13 = "value"
            if (r8 == 0) goto L_0x024b
            com.google.android.gms.measurement.internal.zzau r8 = r2.f74164b     // Catch:{ all -> 0x0b13 }
            java.lang.Double r8 = r8.mo87635X(r13)     // Catch:{ all -> 0x0b13 }
            double r16 = r8.doubleValue()     // Catch:{ all -> 0x0b13 }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r16 = r16 * r19
            r21 = 0
            int r8 = (r16 > r21 ? 1 : (r16 == r21 ? 0 : -1))
            if (r8 != 0) goto L_0x020b
            com.google.android.gms.measurement.internal.zzau r8 = r2.f74164b     // Catch:{ all -> 0x0b13 }
            java.lang.Long r8 = r8.mo87636e0(r13)     // Catch:{ all -> 0x0b13 }
            long r14 = r8.longValue()     // Catch:{ all -> 0x0b13 }
            double r13 = (double) r14     // Catch:{ all -> 0x0b13 }
            double r16 = r13 * r19
        L_0x020b:
            r13 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r8 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r8 > 0) goto L_0x0225
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r8 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r8 < 0) goto L_0x0225
            long r13 = java.lang.Math.round(r16)     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r2.f74163a     // Catch:{ all -> 0x0b13 }
            boolean r8 = r11.equals(r8)     // Catch:{ all -> 0x0b13 }
            if (r8 == 0) goto L_0x0255
            long r13 = -r13
            goto L_0x0255
        L_0x0225:
            com.google.android.gms.measurement.internal.u3 r2 = r35.mo86903d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87494w()     // Catch:{ all -> 0x0b13 }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r10)     // Catch:{ all -> 0x0b13 }
            java.lang.Double r5 = java.lang.Double.valueOf(r16)     // Catch:{ all -> 0x0b13 }
            r2.mo87465c(r3, r4, r5)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r2)     // Catch:{ all -> 0x0b13 }
            r2.mo87232o()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c
            m124012R(r2)
            r2.mo87227f0()
            return
        L_0x024b:
            com.google.android.gms.measurement.internal.zzau r8 = r2.f74164b     // Catch:{ all -> 0x0b13 }
            java.lang.Long r8 = r8.mo87636e0(r13)     // Catch:{ all -> 0x0b13 }
            long r13 = r8.longValue()     // Catch:{ all -> 0x0b13 }
        L_0x0255:
            boolean r8 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0b13 }
            if (r8 != 0) goto L_0x01d2
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r12.toUpperCase(r8)     // Catch:{ all -> 0x0b13 }
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r8.matches(r11)     // Catch:{ all -> 0x0b13 }
            if (r11 == 0) goto L_0x01d2
            java.lang.String r11 = "_ltv_"
            java.lang.String r8 = r11.concat(r8)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.l r11 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r11)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.ra r11 = r11.mo87219X(r10, r8)     // Catch:{ all -> 0x0b13 }
            if (r11 == 0) goto L_0x02b3
            java.lang.Object r11 = r11.f73926e     // Catch:{ all -> 0x0b13 }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0b13 }
            if (r12 != 0) goto L_0x0281
            goto L_0x02b3
        L_0x0281:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0b13 }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.ra r19 = new com.google.android.gms.measurement.internal.ra     // Catch:{ all -> 0x0b13 }
            java.lang.String r15 = r2.f74165c     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.common.util.g r16 = r35.mo86900a()     // Catch:{ all -> 0x0b13 }
            long r16 = r16.mo134768a()     // Catch:{ all -> 0x0b13 }
            long r11 = r11 + r13
            java.lang.Long r20 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0b13 }
            r11 = r19
            r12 = r10
            r14 = 0
            r13 = r15
            r9 = r14
            r15 = 0
            r14 = r8
            r8 = r18
            r15 = r16
            r17 = r20
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0b13 }
            r32 = r4
            r33 = r5
            r4 = r8
            r8 = r19
            r5 = 1
            goto L_0x0334
        L_0x02b3:
            r15 = r18
            r9 = 0
            com.google.android.gms.measurement.internal.l r11 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r11)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g r12 = r35.mo87358U()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g3 r9 = com.google.android.gms.measurement.internal.C30742h3.f73498G     // Catch:{ all -> 0x0b13 }
            int r9 = r12.mo87082o(r10, r9)     // Catch:{ all -> 0x0b13 }
            int r9 = r9 + -1
            com.google.android.gms.common.internal.C40843u.m166198h(r10)     // Catch:{ all -> 0x0b13 }
            r11.mo86866h()     // Catch:{ all -> 0x0b13 }
            r11.mo87627i()     // Catch:{ all -> 0x0b13 }
            android.database.sqlite.SQLiteDatabase r12 = r11.mo87212P()     // Catch:{ SQLiteException -> 0x02fc }
            r18 = r15
            java.lang.String r15 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r32 = r4
            r4 = 3
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x02f4 }
            r16 = 0
            r4[r16] = r10     // Catch:{ SQLiteException -> 0x02f4 }
            r33 = r5
            r5 = 1
            r4[r5] = r10     // Catch:{ SQLiteException -> 0x02f2 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x02f2 }
            r16 = 2
            r4[r16] = r9     // Catch:{ SQLiteException -> 0x02f2 }
            r12.execSQL(r15, r4)     // Catch:{ SQLiteException -> 0x02f2 }
            goto L_0x0318
        L_0x02f2:
            r0 = move-exception
            goto L_0x0304
        L_0x02f4:
            r0 = move-exception
            goto L_0x02f9
        L_0x02f6:
            r0 = move-exception
            r32 = r4
        L_0x02f9:
            r33 = r5
            goto L_0x0303
        L_0x02fc:
            r0 = move-exception
            r32 = r4
            r33 = r5
            r18 = r15
        L_0x0303:
            r5 = 1
        L_0x0304:
            r4 = r0
            com.google.android.gms.measurement.internal.g5 r9 = r11.f74136a     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.u3 r9 = r9.mo86903d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.s3 r9 = r9.mo87489r()     // Catch:{ all -> 0x0b13 }
            java.lang.String r11 = "Error pruning currencies. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r10)     // Catch:{ all -> 0x0b13 }
            r9.mo87465c(r11, r12, r4)     // Catch:{ all -> 0x0b13 }
        L_0x0318:
            com.google.android.gms.measurement.internal.ra r19 = new com.google.android.gms.measurement.internal.ra     // Catch:{ all -> 0x0b13 }
            java.lang.String r4 = r2.f74165c     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.common.util.g r9 = r35.mo86900a()     // Catch:{ all -> 0x0b13 }
            long r15 = r9.mo134768a()     // Catch:{ all -> 0x0b13 }
            java.lang.Long r17 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0b13 }
            r11 = r19
            r12 = r10
            r13 = r4
            r14 = r8
            r4 = r18
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0b13 }
            r8 = r19
        L_0x0334:
            com.google.android.gms.measurement.internal.l r9 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r9)     // Catch:{ all -> 0x0b13 }
            boolean r9 = r9.mo87241x(r8)     // Catch:{ all -> 0x0b13 }
            if (r9 != 0) goto L_0x036f
            com.google.android.gms.measurement.internal.u3 r9 = r35.mo86903d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.s3 r9 = r9.mo87489r()     // Catch:{ all -> 0x0b13 }
            java.lang.String r11 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r10)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g5 r13 = r1.f73806l     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.p3 r13 = r13.mo87101D()     // Catch:{ all -> 0x0b13 }
            java.lang.String r14 = r8.f73924c     // Catch:{ all -> 0x0b13 }
            java.lang.String r13 = r13.mo87412f(r14)     // Catch:{ all -> 0x0b13 }
            java.lang.Object r8 = r8.f73926e     // Catch:{ all -> 0x0b13 }
            r9.mo87466d(r11, r12, r13, r8)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.ua r11 = r35.mo87372h0()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.ta r12 = r1.f73794E     // Catch:{ all -> 0x0b13 }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo87503C(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0b13 }
        L_0x036f:
            java.lang.String r8 = r2.f74163a     // Catch:{ all -> 0x0b13 }
            boolean r8 = com.google.android.gms.measurement.internal.C30906ua.m124207Z(r8)     // Catch:{ all -> 0x0b13 }
            java.lang.String r9 = r2.f74163a     // Catch:{ all -> 0x0b13 }
            boolean r4 = r4.equals(r9)     // Catch:{ all -> 0x0b13 }
            r35.mo87372h0()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.zzau r9 = r2.f74164b     // Catch:{ all -> 0x0b13 }
            if (r9 != 0) goto L_0x0385
            r12 = 0
            goto L_0x03a4
        L_0x0385:
            com.google.android.gms.measurement.internal.s r11 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x0b13 }
            r11.<init>(r9)     // Catch:{ all -> 0x0b13 }
            r12 = 0
        L_0x038c:
            boolean r16 = r11.hasNext()     // Catch:{ all -> 0x0b13 }
            if (r16 == 0) goto L_0x03a4
            java.lang.String r14 = r11.next()     // Catch:{ all -> 0x0b13 }
            java.lang.Object r14 = r9.mo87637f0(r14)     // Catch:{ all -> 0x0b13 }
            boolean r15 = r14 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0b13 }
            if (r15 == 0) goto L_0x038c
            android.os.Parcelable[] r14 = (android.os.Parcelable[]) r14     // Catch:{ all -> 0x0b13 }
            int r14 = r14.length     // Catch:{ all -> 0x0b13 }
            long r14 = (long) r14     // Catch:{ all -> 0x0b13 }
            long r12 = r12 + r14
            goto L_0x038c
        L_0x03a4:
            com.google.android.gms.measurement.internal.l r11 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r11)     // Catch:{ all -> 0x0b13 }
            long r14 = r35.mo87347F()     // Catch:{ all -> 0x0b13 }
            r22 = 1
            long r18 = r12 + r22
            r9 = 1
            r20 = 0
            r21 = 0
            r12 = r14
            r30 = r6
            r5 = 0
            r14 = r10
            r15 = r18
            r17 = r9
            r18 = r8
            r19 = r20
            r20 = r4
            com.google.android.gms.measurement.internal.j r9 = r11.mo87217U(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0b13 }
            long r11 = r9.f73617b     // Catch:{ all -> 0x0b13 }
            r35.mo87358U()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g3 r13 = com.google.android.gms.measurement.internal.C30742h3.f73545m     // Catch:{ all -> 0x0b13 }
            r15 = 0
            java.lang.Object r13 = r13.mo87094a(r15)     // Catch:{ all -> 0x0b13 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x0b13 }
            int r13 = r13.intValue()     // Catch:{ all -> 0x0b13 }
            long r13 = (long) r13     // Catch:{ all -> 0x0b13 }
            long r11 = r11 - r13
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r13 <= 0) goto L_0x0412
            long r11 = r11 % r16
            int r2 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x0401
            com.google.android.gms.measurement.internal.u3 r2 = r35.mo86903d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87489r()     // Catch:{ all -> 0x0b13 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r10)     // Catch:{ all -> 0x0b13 }
            long r5 = r9.f73617b     // Catch:{ all -> 0x0b13 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0b13 }
            r2.mo87465c(r3, r4, r5)     // Catch:{ all -> 0x0b13 }
        L_0x0401:
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r2)     // Catch:{ all -> 0x0b13 }
            r2.mo87232o()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c
            m124012R(r2)
            r2.mo87227f0()
            return
        L_0x0412:
            if (r8 == 0) goto L_0x046d
            long r11 = r9.f73616a     // Catch:{ all -> 0x0b13 }
            r35.mo87358U()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g3 r13 = com.google.android.gms.measurement.internal.C30742h3.f73549o     // Catch:{ all -> 0x0b13 }
            java.lang.Object r13 = r13.mo87094a(r15)     // Catch:{ all -> 0x0b13 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x0b13 }
            int r13 = r13.intValue()     // Catch:{ all -> 0x0b13 }
            long r13 = (long) r13     // Catch:{ all -> 0x0b13 }
            long r11 = r11 - r13
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x046d
            long r11 = r11 % r16
            int r3 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x0448
            com.google.android.gms.measurement.internal.u3 r3 = r35.mo86903d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87489r()     // Catch:{ all -> 0x0b13 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r10)     // Catch:{ all -> 0x0b13 }
            long r6 = r9.f73616a     // Catch:{ all -> 0x0b13 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0b13 }
            r3.mo87465c(r4, r5, r6)     // Catch:{ all -> 0x0b13 }
        L_0x0448:
            com.google.android.gms.measurement.internal.ua r11 = r35.mo87372h0()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.ta r12 = r1.f73794E     // Catch:{ all -> 0x0b13 }
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f74163a     // Catch:{ all -> 0x0b13 }
            r17 = 0
            r13 = r10
            r16 = r2
            r11.mo87503C(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r2)     // Catch:{ all -> 0x0b13 }
            r2.mo87232o()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c
            m124012R(r2)
            r2.mo87227f0()
            return
        L_0x046d:
            r11 = 1000000(0xf4240, float:1.401298E-39)
            if (r4 == 0) goto L_0x04bb
            long r12 = r9.f73619d     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g r4 = r35.mo87358U()     // Catch:{ all -> 0x0b13 }
            java.lang.String r14 = r3.f74188a     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g3 r15 = com.google.android.gms.measurement.internal.C30742h3.f73547n     // Catch:{ all -> 0x0b13 }
            int r4 = r4.mo87082o(r14, r15)     // Catch:{ all -> 0x0b13 }
            int r4 = java.lang.Math.min(r11, r4)     // Catch:{ all -> 0x0b13 }
            r14 = 0
            int r4 = java.lang.Math.max(r14, r4)     // Catch:{ all -> 0x0b13 }
            long r14 = (long) r4     // Catch:{ all -> 0x0b13 }
            long r12 = r12 - r14
            int r4 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x04bb
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x04aa
            com.google.android.gms.measurement.internal.u3 r2 = r35.mo86903d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87489r()     // Catch:{ all -> 0x0b13 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r10)     // Catch:{ all -> 0x0b13 }
            long r5 = r9.f73619d     // Catch:{ all -> 0x0b13 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0b13 }
            r2.mo87465c(r3, r4, r5)     // Catch:{ all -> 0x0b13 }
        L_0x04aa:
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r2)     // Catch:{ all -> 0x0b13 }
            r2.mo87232o()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c
            m124012R(r2)
            r2.mo87227f0()
            return
        L_0x04bb:
            com.google.android.gms.measurement.internal.zzau r4 = r2.f74164b     // Catch:{ all -> 0x0b13 }
            android.os.Bundle r4 = r4.mo87634W()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.ua r9 = r35.mo87372h0()     // Catch:{ all -> 0x0b13 }
            java.lang.String r12 = "_o"
            java.lang.String r13 = r2.f74165c     // Catch:{ all -> 0x0b13 }
            r9.mo87504D(r4, r12, r13)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.ua r9 = r35.mo87372h0()     // Catch:{ all -> 0x0b13 }
            boolean r9 = r9.mo87521U(r10)     // Catch:{ all -> 0x0b13 }
            java.lang.String r15 = "_r"
            if (r9 == 0) goto L_0x04ec
            com.google.android.gms.measurement.internal.ua r9 = r35.mo87372h0()     // Catch:{ all -> 0x0b13 }
            java.lang.String r12 = "_dbg"
            java.lang.Long r13 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0b13 }
            r9.mo87504D(r4, r12, r13)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.ua r9 = r35.mo87372h0()     // Catch:{ all -> 0x0b13 }
            r9.mo87504D(r4, r15, r13)     // Catch:{ all -> 0x0b13 }
        L_0x04ec:
            java.lang.String r9 = "_s"
            java.lang.String r12 = r2.f74163a     // Catch:{ all -> 0x0b13 }
            boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x0512
            com.google.android.gms.measurement.internal.l r9 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r9)     // Catch:{ all -> 0x0b13 }
            java.lang.String r12 = r3.f74188a     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.ra r9 = r9.mo87219X(r12, r7)     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x0512
            java.lang.Object r12 = r9.f73926e     // Catch:{ all -> 0x0b13 }
            boolean r12 = r12 instanceof java.lang.Long     // Catch:{ all -> 0x0b13 }
            if (r12 == 0) goto L_0x0512
            com.google.android.gms.measurement.internal.ua r12 = r35.mo87372h0()     // Catch:{ all -> 0x0b13 }
            java.lang.Object r9 = r9.f73926e     // Catch:{ all -> 0x0b13 }
            r12.mo87504D(r4, r7, r9)     // Catch:{ all -> 0x0b13 }
        L_0x0512:
            com.google.android.gms.measurement.internal.l r7 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r7)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.common.internal.C40843u.m166198h(r10)     // Catch:{ all -> 0x0b13 }
            r7.mo86866h()     // Catch:{ all -> 0x0b13 }
            r7.mo87627i()     // Catch:{ all -> 0x0b13 }
            android.database.sqlite.SQLiteDatabase r9 = r7.mo87212P()     // Catch:{ SQLiteException -> 0x0556 }
            com.google.android.gms.measurement.internal.g5 r12 = r7.f74136a     // Catch:{ SQLiteException -> 0x0556 }
            com.google.android.gms.measurement.internal.g r12 = r12.mo87130z()     // Catch:{ SQLiteException -> 0x0556 }
            com.google.android.gms.measurement.internal.g3 r13 = com.google.android.gms.measurement.internal.C30742h3.f73555r     // Catch:{ SQLiteException -> 0x0556 }
            int r12 = r12.mo87082o(r10, r13)     // Catch:{ SQLiteException -> 0x0556 }
            int r11 = java.lang.Math.min(r11, r12)     // Catch:{ SQLiteException -> 0x0556 }
            r14 = 0
            int r11 = java.lang.Math.max(r14, r11)     // Catch:{ SQLiteException -> 0x0552 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ SQLiteException -> 0x0552 }
            java.lang.String r12 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            r13 = 2
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0552 }
            r13[r14] = r10     // Catch:{ SQLiteException -> 0x0552 }
            r17 = 1
            r13[r17] = r11     // Catch:{ SQLiteException -> 0x0552 }
            r11 = r30
            int r7 = r9.delete(r11, r12, r13)     // Catch:{ SQLiteException -> 0x0550 }
            long r12 = (long) r7
            goto L_0x056f
        L_0x0550:
            r0 = move-exception
            goto L_0x055a
        L_0x0552:
            r0 = move-exception
            r11 = r30
            goto L_0x055a
        L_0x0556:
            r0 = move-exception
            r11 = r30
            r14 = 0
        L_0x055a:
            r9 = r0
            com.google.android.gms.measurement.internal.g5 r7 = r7.f74136a     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo86903d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.s3 r7 = r7.mo87489r()     // Catch:{ all -> 0x0b13 }
            java.lang.String r12 = "Error deleting over the limit events. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r10)     // Catch:{ all -> 0x0b13 }
            r7.mo87465c(r12, r13, r9)     // Catch:{ all -> 0x0b13 }
            r12 = r5
        L_0x056f:
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0588
            com.google.android.gms.measurement.internal.u3 r7 = r35.mo86903d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.s3 r7 = r7.mo87494w()     // Catch:{ all -> 0x0b13 }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r10)     // Catch:{ all -> 0x0b13 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0b13 }
            r7.mo87465c(r9, r14, r12)     // Catch:{ all -> 0x0b13 }
        L_0x0588:
            com.google.android.gms.measurement.internal.q r7 = new com.google.android.gms.measurement.internal.q     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g5 r12 = r1.f73806l     // Catch:{ all -> 0x0b13 }
            java.lang.String r13 = r2.f74165c     // Catch:{ all -> 0x0b13 }
            java.lang.String r9 = r2.f74163a     // Catch:{ all -> 0x0b13 }
            long r5 = r2.f74166d     // Catch:{ all -> 0x0b13 }
            r18 = 0
            r2 = r11
            r11 = r7
            r31 = 0
            r14 = r10
            r36 = r2
            r34 = r15
            r2 = 0
            r15 = r9
            r16 = r5
            r20 = r4
            r11.<init>((com.google.android.gms.measurement.internal.C30731g5) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.l r4 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r4)     // Catch:{ all -> 0x0b13 }
            java.lang.String r5 = r7.f73863b     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo87218V(r10, r5)     // Catch:{ all -> 0x0b13 }
            if (r4 != 0) goto L_0x062c
            com.google.android.gms.measurement.internal.l r4 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r4)     // Catch:{ all -> 0x0b13 }
            long r4 = r4.mo87211O(r10)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g r6 = r35.mo87358U()     // Catch:{ all -> 0x0b13 }
            int r6 = r6.mo87079l(r10)     // Catch:{ all -> 0x0b13 }
            long r11 = (long) r6     // Catch:{ all -> 0x0b13 }
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x060e
            if (r8 == 0) goto L_0x060e
            com.google.android.gms.measurement.internal.u3 r2 = r35.mo86903d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87489r()     // Catch:{ all -> 0x0b13 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r10)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g5 r5 = r1.f73806l     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.p3 r5 = r5.mo87101D()     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r7.f73863b     // Catch:{ all -> 0x0b13 }
            java.lang.String r5 = r5.mo87410d(r6)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g r6 = r35.mo87358U()     // Catch:{ all -> 0x0b13 }
            int r6 = r6.mo87079l(r10)     // Catch:{ all -> 0x0b13 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0b13 }
            r2.mo87466d(r3, r4, r5, r6)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.ua r11 = r35.mo87372h0()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.ta r12 = r1.f73794E     // Catch:{ all -> 0x0b13 }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo87503C(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c
            m124012R(r2)
            r2.mo87227f0()
            return
        L_0x060e:
            com.google.android.gms.measurement.internal.r r4 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x0b13 }
            java.lang.String r13 = r7.f73863b     // Catch:{ all -> 0x0b13 }
            long r5 = r7.f73865d     // Catch:{ all -> 0x0b13 }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r4
            r12 = r10
            r20 = r5
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0b13 }
            goto L_0x063a
        L_0x062c:
            com.google.android.gms.measurement.internal.g5 r5 = r1.f73806l     // Catch:{ all -> 0x0b13 }
            long r8 = r4.f73890f     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.q r7 = r7.mo87434a(r5, r8)     // Catch:{ all -> 0x0b13 }
            long r5 = r7.f73865d     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo87453c(r5)     // Catch:{ all -> 0x0b13 }
        L_0x063a:
            com.google.android.gms.measurement.internal.l r5 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r5)     // Catch:{ all -> 0x0b13 }
            r5.mo87234q(r4)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.d5 r4 = r35.mo86904f()     // Catch:{ all -> 0x0b13 }
            r4.mo86866h()     // Catch:{ all -> 0x0b13 }
            r35.mo87369g()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.common.internal.C40843u.m166202l(r7)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.common.internal.C40843u.m166202l(r37)     // Catch:{ all -> 0x0b13 }
            java.lang.String r4 = r7.f73862a     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.common.internal.C40843u.m166198h(r4)     // Catch:{ all -> 0x0b13 }
            java.lang.String r4 = r7.f73862a     // Catch:{ all -> 0x0b13 }
            java.lang.String r5 = r3.f74188a     // Catch:{ all -> 0x0b13 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.common.internal.C40843u.m166191a(r4)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.internal.measurement.g5 r4 = com.google.android.gms.internal.measurement.C41981h5.m170105S1()     // Catch:{ all -> 0x0b13 }
            r5 = 1
            r4.mo136856j0(r5)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = "android"
            r4.mo136846c0(r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r3.f74188a     // Catch:{ all -> 0x0b13 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b13 }
            if (r6 != 0) goto L_0x067c
            java.lang.String r6 = r3.f74188a     // Catch:{ all -> 0x0b13 }
            r4.mo136801C(r6)     // Catch:{ all -> 0x0b13 }
        L_0x067c:
            java.lang.String r6 = r3.f74191d     // Catch:{ all -> 0x0b13 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b13 }
            if (r6 != 0) goto L_0x0689
            java.lang.String r6 = r3.f74191d     // Catch:{ all -> 0x0b13 }
            r4.mo136804E(r6)     // Catch:{ all -> 0x0b13 }
        L_0x0689:
            java.lang.String r6 = r3.f74190c     // Catch:{ all -> 0x0b13 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b13 }
            if (r6 != 0) goto L_0x0696
            java.lang.String r6 = r3.f74190c     // Catch:{ all -> 0x0b13 }
            r4.mo136806F(r6)     // Catch:{ all -> 0x0b13 }
        L_0x0696:
            com.google.android.gms.internal.measurement.C41955ff.m169896b()     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r3.f74182M0     // Catch:{ all -> 0x0b13 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b13 }
            if (r6 != 0) goto L_0x06c0
            com.google.android.gms.measurement.internal.g r6 = r35.mo87358U()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g3 r8 = com.google.android.gms.measurement.internal.C30742h3.f73550o0     // Catch:{ all -> 0x0b13 }
            boolean r6 = r6.mo87070B(r2, r8)     // Catch:{ all -> 0x0b13 }
            if (r6 != 0) goto L_0x06bb
            com.google.android.gms.measurement.internal.g r6 = r35.mo87358U()     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r3.f74188a     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g3 r9 = com.google.android.gms.measurement.internal.C30742h3.f73554q0     // Catch:{ all -> 0x0b13 }
            boolean r6 = r6.mo87070B(r8, r9)     // Catch:{ all -> 0x0b13 }
            if (r6 == 0) goto L_0x06c0
        L_0x06bb:
            java.lang.String r6 = r3.f74182M0     // Catch:{ all -> 0x0b13 }
            r4.mo136860o0(r6)     // Catch:{ all -> 0x0b13 }
        L_0x06c0:
            long r8 = r3.f74197x     // Catch:{ all -> 0x0b13 }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x06cd
            int r6 = (int) r8     // Catch:{ all -> 0x0b13 }
            r4.mo136808G(r6)     // Catch:{ all -> 0x0b13 }
        L_0x06cd:
            long r8 = r3.f74192e     // Catch:{ all -> 0x0b13 }
            r4.mo136838Y(r8)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r3.f74189b     // Catch:{ all -> 0x0b13 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b13 }
            if (r6 != 0) goto L_0x06df
            java.lang.String r6 = r3.f74189b     // Catch:{ all -> 0x0b13 }
            r4.mo136834V(r6)     // Catch:{ all -> 0x0b13 }
        L_0x06df:
            java.lang.String r6 = r3.f74188a     // Catch:{ all -> 0x0b13 }
            java.lang.Object r6 = com.google.android.gms.common.internal.C40843u.m166202l(r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.h r6 = r1.mo87359V(r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r3.f74180K0     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.h r8 = com.google.android.gms.measurement.internal.C30738h.m123795b(r8)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.h r6 = r6.mo87135c(r8)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r6.mo87140h()     // Catch:{ all -> 0x0b13 }
            r4.mo136816K(r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r4.mo136800B0()     // Catch:{ all -> 0x0b13 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0b13 }
            if (r6 == 0) goto L_0x0713
            java.lang.String r6 = r3.f74175F0     // Catch:{ all -> 0x0b13 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b13 }
            if (r6 != 0) goto L_0x0713
            java.lang.String r6 = r3.f74175F0     // Catch:{ all -> 0x0b13 }
            r4.mo136799B(r6)     // Catch:{ all -> 0x0b13 }
        L_0x0713:
            long r8 = r3.f74193f     // Catch:{ all -> 0x0b13 }
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x071e
            r4.mo136817L(r8)     // Catch:{ all -> 0x0b13 }
        L_0x071e:
            long r8 = r3.f74177H0     // Catch:{ all -> 0x0b13 }
            r4.mo136823P(r8)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.pa r6 = r1.f73801g     // Catch:{ all -> 0x0b13 }
            m124012R(r6)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.na r8 = r6.f74119b     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g5 r8 = r8.f73806l     // Catch:{ all -> 0x0b13 }
            android.content.Context r8 = r8.mo86902c()     // Catch:{ all -> 0x0b13 }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ all -> 0x0b13 }
            java.lang.String r9 = "com.google.android.gms.measurement"
            android.net.Uri r9 = com.google.android.gms.internal.measurement.C42225v6.m170951a(r9)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.v r10 = com.google.android.gms.measurement.internal.C30907v.f74014a     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.internal.measurement.k6 r8 = com.google.android.gms.internal.measurement.C42036k6.m170451b(r8, r9, r10)     // Catch:{ all -> 0x0b13 }
            if (r8 != 0) goto L_0x0747
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0b13 }
            goto L_0x074b
        L_0x0747:
            java.util.Map r8 = r8.mo137068c()     // Catch:{ all -> 0x0b13 }
        L_0x074b:
            if (r8 == 0) goto L_0x07d1
            boolean r9 = r8.isEmpty()     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x0755
            goto L_0x07d1
        L_0x0755:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0b13 }
            r14.<init>()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g3 r9 = com.google.android.gms.measurement.internal.C30742h3.f73512R     // Catch:{ all -> 0x0b13 }
            java.lang.Object r9 = r9.mo87094a(r2)     // Catch:{ all -> 0x0b13 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0b13 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0b13 }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x0b13 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0b13 }
        L_0x076e:
            boolean r10 = r8.hasNext()     // Catch:{ all -> 0x0b13 }
            if (r10 == 0) goto L_0x07cb
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x0b13 }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ all -> 0x0b13 }
            java.lang.Object r11 = r10.getKey()     // Catch:{ all -> 0x0b13 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0b13 }
            java.lang.String r12 = "measurement.id."
            boolean r11 = r11.startsWith(r12)     // Catch:{ all -> 0x0b13 }
            if (r11 == 0) goto L_0x076e
            java.lang.Object r10 = r10.getValue()     // Catch:{ NumberFormatException -> 0x07b9 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x07b9 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x07b9 }
            if (r10 == 0) goto L_0x076e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x07b9 }
            r14.add(r10)     // Catch:{ NumberFormatException -> 0x07b9 }
            int r10 = r14.size()     // Catch:{ NumberFormatException -> 0x07b9 }
            if (r10 < r9) goto L_0x076e
            com.google.android.gms.measurement.internal.g5 r10 = r6.f74136a     // Catch:{ NumberFormatException -> 0x07b9 }
            com.google.android.gms.measurement.internal.u3 r10 = r10.mo86903d()     // Catch:{ NumberFormatException -> 0x07b9 }
            com.google.android.gms.measurement.internal.s3 r10 = r10.mo87494w()     // Catch:{ NumberFormatException -> 0x07b9 }
            java.lang.String r11 = "Too many experiment IDs. Number of IDs"
            int r12 = r14.size()     // Catch:{ NumberFormatException -> 0x07b9 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x07b9 }
            r10.mo87464b(r11, r12)     // Catch:{ NumberFormatException -> 0x07b9 }
            goto L_0x07cb
        L_0x07b9:
            r0 = move-exception
            r10 = r0
            com.google.android.gms.measurement.internal.g5 r11 = r6.f74136a     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.u3 r11 = r11.mo86903d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.s3 r11 = r11.mo87494w()     // Catch:{ all -> 0x0b13 }
            java.lang.String r12 = "Experiment ID NumberFormatException"
            r11.mo87464b(r12, r10)     // Catch:{ all -> 0x0b13 }
            goto L_0x076e
        L_0x07cb:
            boolean r6 = r14.isEmpty()     // Catch:{ all -> 0x0b13 }
            if (r6 == 0) goto L_0x07d2
        L_0x07d1:
            r14 = r2
        L_0x07d2:
            if (r14 == 0) goto L_0x07d7
            r4.mo136822O0(r14)     // Catch:{ all -> 0x0b13 }
        L_0x07d7:
            java.lang.String r6 = r3.f74188a     // Catch:{ all -> 0x0b13 }
            java.lang.Object r6 = com.google.android.gms.common.internal.C40843u.m166202l(r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.h r6 = r1.mo87359V(r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r3.f74180K0     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.h r8 = com.google.android.gms.measurement.internal.C30738h.m123795b(r8)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.h r6 = r6.mo87135c(r8)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.zzah r8 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x0b13 }
            boolean r9 = r6.mo87142i(r8)     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x0823
            boolean r9 = r3.f74187Z     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x0823
            com.google.android.gms.measurement.internal.f9 r9 = r1.f73803i     // Catch:{ all -> 0x0b13 }
            java.lang.String r10 = r3.f74188a     // Catch:{ all -> 0x0b13 }
            android.util.Pair r9 = r9.mo87062n(r10, r6)     // Catch:{ all -> 0x0b13 }
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0b13 }
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ all -> 0x0b13 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0b13 }
            if (r10 != 0) goto L_0x0823
            boolean r10 = r3.f74187Z     // Catch:{ all -> 0x0b13 }
            if (r10 == 0) goto L_0x0823
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0b13 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0b13 }
            r4.mo136857k0(r10)     // Catch:{ all -> 0x0b13 }
            java.lang.Object r9 = r9.second     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x0823
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0b13 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0b13 }
            r4.mo136842a0(r9)     // Catch:{ all -> 0x0b13 }
        L_0x0823:
            com.google.android.gms.measurement.internal.g5 r9 = r1.f73806l     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.p r9 = r9.mo87098A()     // Catch:{ all -> 0x0b13 }
            r9.mo86873k()     // Catch:{ all -> 0x0b13 }
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ all -> 0x0b13 }
            r4.mo136820N(r9)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g5 r9 = r1.f73806l     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.p r9 = r9.mo87098A()     // Catch:{ all -> 0x0b13 }
            r9.mo86873k()     // Catch:{ all -> 0x0b13 }
            java.lang.String r9 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0b13 }
            r4.mo136844b0(r9)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g5 r9 = r1.f73806l     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.p r9 = r9.mo87098A()     // Catch:{ all -> 0x0b13 }
            long r9 = r9.mo87403p()     // Catch:{ all -> 0x0b13 }
            int r9 = (int) r9     // Catch:{ all -> 0x0b13 }
            r4.mo136863s0(r9)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g5 r9 = r1.f73806l     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.p r9 = r9.mo87098A()     // Catch:{ all -> 0x0b13 }
            java.lang.String r9 = r9.mo87404q()     // Catch:{ all -> 0x0b13 }
            r4.mo136868x0(r9)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.internal.measurement.C42026je.m170421b()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g r9 = r35.mo87358U()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g3 r10 = com.google.android.gms.measurement.internal.C30742h3.f73499G0     // Catch:{ all -> 0x0b13 }
            boolean r9 = r9.mo87070B(r2, r10)     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x086e
            long r9 = r3.f74184O0     // Catch:{ all -> 0x0b13 }
            r4.mo136862r0(r9)     // Catch:{ all -> 0x0b13 }
        L_0x086e:
            com.google.android.gms.measurement.internal.g5 r9 = r1.f73806l     // Catch:{ all -> 0x0b13 }
            boolean r9 = r9.mo87123o()     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x0882
            r4.mo136870z0()     // Catch:{ all -> 0x0b13 }
            boolean r9 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0b13 }
            if (r9 != 0) goto L_0x0882
            r4.mo136821O(r2)     // Catch:{ all -> 0x0b13 }
        L_0x0882:
            com.google.android.gms.measurement.internal.l r9 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r9)     // Catch:{ all -> 0x0b13 }
            java.lang.String r10 = r3.f74188a     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.d6 r9 = r9.mo87214R(r10)     // Catch:{ all -> 0x0b13 }
            if (r9 != 0) goto L_0x08f2
            com.google.android.gms.measurement.internal.d6 r9 = new com.google.android.gms.measurement.internal.d6     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g5 r10 = r1.f73806l     // Catch:{ all -> 0x0b13 }
            java.lang.String r11 = r3.f74188a     // Catch:{ all -> 0x0b13 }
            r9.<init>(r10, r11)     // Catch:{ all -> 0x0b13 }
            java.lang.String r10 = r1.mo87374i0(r6)     // Catch:{ all -> 0x0b13 }
            r9.mo86993i(r10)     // Catch:{ all -> 0x0b13 }
            java.lang.String r10 = r3.f74198y     // Catch:{ all -> 0x0b13 }
            r9.mo87013w(r10)     // Catch:{ all -> 0x0b13 }
            java.lang.String r10 = r3.f74189b     // Catch:{ all -> 0x0b13 }
            r9.mo87014x(r10)     // Catch:{ all -> 0x0b13 }
            boolean r8 = r6.mo87142i(r8)     // Catch:{ all -> 0x0b13 }
            if (r8 == 0) goto L_0x08bc
            com.google.android.gms.measurement.internal.f9 r8 = r1.f73803i     // Catch:{ all -> 0x0b13 }
            java.lang.String r10 = r3.f74188a     // Catch:{ all -> 0x0b13 }
            boolean r11 = r3.f74187Z     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r8.mo87063o(r10, r11)     // Catch:{ all -> 0x0b13 }
            r9.mo86957G(r8)     // Catch:{ all -> 0x0b13 }
        L_0x08bc:
            r10 = 0
            r9.mo86953C(r10)     // Catch:{ all -> 0x0b13 }
            r9.mo86954D(r10)     // Catch:{ all -> 0x0b13 }
            r9.mo86952B(r10)     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r3.f74190c     // Catch:{ all -> 0x0b13 }
            r9.mo86997k(r8)     // Catch:{ all -> 0x0b13 }
            long r10 = r3.f74197x     // Catch:{ all -> 0x0b13 }
            r9.mo86999l(r10)     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r3.f74191d     // Catch:{ all -> 0x0b13 }
            r9.mo86995j(r8)     // Catch:{ all -> 0x0b13 }
            long r10 = r3.f74192e     // Catch:{ all -> 0x0b13 }
            r9.mo87015y(r10)     // Catch:{ all -> 0x0b13 }
            long r10 = r3.f74193f     // Catch:{ all -> 0x0b13 }
            r9.mo87010t(r10)     // Catch:{ all -> 0x0b13 }
            boolean r8 = r3.f74195v     // Catch:{ all -> 0x0b13 }
            r9.mo86955E(r8)     // Catch:{ all -> 0x0b13 }
            long r10 = r3.f74177H0     // Catch:{ all -> 0x0b13 }
            r9.mo87011u(r10)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.l r8 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r8)     // Catch:{ all -> 0x0b13 }
            r8.mo87233p(r9)     // Catch:{ all -> 0x0b13 }
        L_0x08f2:
            com.google.android.gms.measurement.internal.zzah r8 = com.google.android.gms.measurement.internal.zzah.ANALYTICS_STORAGE     // Catch:{ all -> 0x0b13 }
            boolean r6 = r6.mo87142i(r8)     // Catch:{ all -> 0x0b13 }
            if (r6 == 0) goto L_0x0911
            java.lang.String r6 = r9.mo86996j0()     // Catch:{ all -> 0x0b13 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b13 }
            if (r6 != 0) goto L_0x0911
            java.lang.String r6 = r9.mo86996j0()     // Catch:{ all -> 0x0b13 }
            java.lang.Object r6 = com.google.android.gms.common.internal.C40843u.m166202l(r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0b13 }
            r4.mo136802D(r6)     // Catch:{ all -> 0x0b13 }
        L_0x0911:
            java.lang.String r6 = r9.mo87002m0()     // Catch:{ all -> 0x0b13 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b13 }
            if (r6 != 0) goto L_0x0928
            java.lang.String r6 = r9.mo87002m0()     // Catch:{ all -> 0x0b13 }
            java.lang.Object r6 = com.google.android.gms.common.internal.C40843u.m166202l(r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0b13 }
            r4.mo136832U(r6)     // Catch:{ all -> 0x0b13 }
        L_0x0928:
            com.google.android.gms.measurement.internal.l r6 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r3 = r3.f74188a     // Catch:{ all -> 0x0b13 }
            java.util.List r3 = r6.mo87224c0(r3)     // Catch:{ all -> 0x0b13 }
            r13 = r31
        L_0x0935:
            int r6 = r3.size()     // Catch:{ all -> 0x0b13 }
            if (r13 >= r6) goto L_0x096b
            com.google.android.gms.internal.measurement.p5 r6 = com.google.android.gms.internal.measurement.C42139q5.m170743E()     // Catch:{ all -> 0x0b13 }
            java.lang.Object r8 = r3.get(r13)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.ra r8 = (com.google.android.gms.measurement.internal.C30870ra) r8     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r8.f73924c     // Catch:{ all -> 0x0b13 }
            r6.mo137213E(r8)     // Catch:{ all -> 0x0b13 }
            java.lang.Object r8 = r3.get(r13)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.ra r8 = (com.google.android.gms.measurement.internal.C30870ra) r8     // Catch:{ all -> 0x0b13 }
            long r8 = r8.f73925d     // Catch:{ all -> 0x0b13 }
            r6.mo137214F(r8)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.pa r8 = r1.f73801g     // Catch:{ all -> 0x0b13 }
            m124012R(r8)     // Catch:{ all -> 0x0b13 }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.ra r9 = (com.google.android.gms.measurement.internal.C30870ra) r9     // Catch:{ all -> 0x0b13 }
            java.lang.Object r9 = r9.f73926e     // Catch:{ all -> 0x0b13 }
            r8.mo87426K(r6, r9)     // Catch:{ all -> 0x0b13 }
            r4.mo136829S0(r6)     // Catch:{ all -> 0x0b13 }
            int r13 = r13 + 1
            goto L_0x0935
        L_0x096b:
            com.google.android.gms.measurement.internal.l r3 = r1.f73797c     // Catch:{ IOException -> 0x0ac9 }
            m124012R(r3)     // Catch:{ IOException -> 0x0ac9 }
            com.google.android.gms.internal.measurement.s9 r6 = r4.mo137180s()     // Catch:{ IOException -> 0x0ac9 }
            com.google.android.gms.internal.measurement.h5 r6 = (com.google.android.gms.internal.measurement.C41981h5) r6     // Catch:{ IOException -> 0x0ac9 }
            r3.mo86866h()     // Catch:{ IOException -> 0x0ac9 }
            r3.mo87627i()     // Catch:{ IOException -> 0x0ac9 }
            com.google.android.gms.common.internal.C40843u.m166202l(r6)     // Catch:{ IOException -> 0x0ac9 }
            java.lang.String r8 = r6.mo136978W1()     // Catch:{ IOException -> 0x0ac9 }
            com.google.android.gms.common.internal.C40843u.m166198h(r8)     // Catch:{ IOException -> 0x0ac9 }
            byte[] r8 = r6.mo136762g()     // Catch:{ IOException -> 0x0ac9 }
            com.google.android.gms.measurement.internal.na r9 = r3.f74119b     // Catch:{ IOException -> 0x0ac9 }
            com.google.android.gms.measurement.internal.pa r9 = r9.f73801g     // Catch:{ IOException -> 0x0ac9 }
            m124012R(r9)     // Catch:{ IOException -> 0x0ac9 }
            long r9 = r9.mo87431x(r8)     // Catch:{ IOException -> 0x0ac9 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ IOException -> 0x0ac9 }
            r11.<init>()     // Catch:{ IOException -> 0x0ac9 }
            java.lang.String r12 = r6.mo136978W1()     // Catch:{ IOException -> 0x0ac9 }
            r13 = r33
            r11.put(r13, r12)     // Catch:{ IOException -> 0x0ac9 }
            java.lang.Long r12 = java.lang.Long.valueOf(r9)     // Catch:{ IOException -> 0x0ac9 }
            r14 = r32
            r11.put(r14, r12)     // Catch:{ IOException -> 0x0ac9 }
            java.lang.String r12 = "metadata"
            r11.put(r12, r8)     // Catch:{ IOException -> 0x0ac9 }
            android.database.sqlite.SQLiteDatabase r8 = r3.mo87212P()     // Catch:{ SQLiteException -> 0x0aaf }
            java.lang.String r12 = "raw_events_metadata"
            r15 = 4
            r8.insertWithOnConflict(r12, r2, r11, r15)     // Catch:{ SQLiteException -> 0x0aaf }
            com.google.android.gms.measurement.internal.l r3 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r3)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.zzau r4 = r7.f73867f     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.s r6 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x0b13 }
            r6.<init>(r4)     // Catch:{ all -> 0x0b13 }
        L_0x09c7:
            boolean r4 = r6.hasNext()     // Catch:{ all -> 0x0b13 }
            if (r4 == 0) goto L_0x09df
            java.lang.String r4 = r6.next()     // Catch:{ all -> 0x0b13 }
            r8 = r34
            boolean r4 = r8.equals(r4)     // Catch:{ all -> 0x0b13 }
            if (r4 == 0) goto L_0x09dc
            r31 = r5
            goto L_0x0a1e
        L_0x09dc:
            r34 = r8
            goto L_0x09c7
        L_0x09df:
            com.google.android.gms.measurement.internal.x4 r4 = r1.f73795a     // Catch:{ all -> 0x0b13 }
            m124012R(r4)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r7.f73862a     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r7.f73863b     // Catch:{ all -> 0x0b13 }
            boolean r4 = r4.mo87573E(r6, r8)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.l r15 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r15)     // Catch:{ all -> 0x0b13 }
            long r16 = r35.mo87347F()     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r7.f73862a     // Catch:{ all -> 0x0b13 }
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r18 = r6
            com.google.android.gms.measurement.internal.j r6 = r15.mo87216T(r16, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0b13 }
            if (r4 == 0) goto L_0x0a1e
            long r11 = r6.f73620e     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g r4 = r35.mo87358U()     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r7.f73862a     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g3 r8 = com.google.android.gms.measurement.internal.C30742h3.f73553q     // Catch:{ all -> 0x0b13 }
            int r4 = r4.mo87082o(r6, r8)     // Catch:{ all -> 0x0b13 }
            long r5 = (long) r4     // Catch:{ all -> 0x0b13 }
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0a1e
            r31 = 1
        L_0x0a1e:
            r3.mo86866h()     // Catch:{ all -> 0x0b13 }
            r3.mo87627i()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.common.internal.C40843u.m166202l(r7)     // Catch:{ all -> 0x0b13 }
            java.lang.String r4 = r7.f73862a     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.common.internal.C40843u.m166198h(r4)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.na r4 = r3.f74119b     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.pa r4 = r4.f73801g     // Catch:{ all -> 0x0b13 }
            m124012R(r4)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.internal.measurement.w4 r4 = r4.mo87419B(r7)     // Catch:{ all -> 0x0b13 }
            byte[] r4 = r4.mo136762g()     // Catch:{ all -> 0x0b13 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0b13 }
            r5.<init>()     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r7.f73862a     // Catch:{ all -> 0x0b13 }
            r5.put(r13, r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = "name"
            java.lang.String r8 = r7.f73863b     // Catch:{ all -> 0x0b13 }
            r5.put(r6, r8)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = "timestamp"
            long r11 = r7.f73865d     // Catch:{ all -> 0x0b13 }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0b13 }
            r5.put(r6, r8)     // Catch:{ all -> 0x0b13 }
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0b13 }
            r5.put(r14, r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = "data"
            r5.put(r6, r4)     // Catch:{ all -> 0x0b13 }
            java.lang.String r4 = "realtime"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r31)     // Catch:{ all -> 0x0b13 }
            r5.put(r4, r6)     // Catch:{ all -> 0x0b13 }
            android.database.sqlite.SQLiteDatabase r4 = r3.mo87212P()     // Catch:{ SQLiteException -> 0x0a97 }
            r6 = r36
            long r4 = r4.insert(r6, r2, r5)     // Catch:{ SQLiteException -> 0x0a97 }
            r8 = -1
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0a92
            com.google.android.gms.measurement.internal.g5 r2 = r3.f74136a     // Catch:{ SQLiteException -> 0x0a97 }
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()     // Catch:{ SQLiteException -> 0x0a97 }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87489r()     // Catch:{ SQLiteException -> 0x0a97 }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r5 = r7.f73862a     // Catch:{ SQLiteException -> 0x0a97 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r5)     // Catch:{ SQLiteException -> 0x0a97 }
            r2.mo87464b(r4, r5)     // Catch:{ SQLiteException -> 0x0a97 }
            goto L_0x0ae0
        L_0x0a92:
            r4 = 0
            r1.f73809o = r4     // Catch:{ all -> 0x0b13 }
            goto L_0x0ae0
        L_0x0a97:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.g5 r3 = r3.f74136a     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo86903d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87489r()     // Catch:{ all -> 0x0b13 }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r7.f73862a     // Catch:{ all -> 0x0b13 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r5)     // Catch:{ all -> 0x0b13 }
            r3.mo87465c(r4, r5, r2)     // Catch:{ all -> 0x0b13 }
            goto L_0x0ae0
        L_0x0aaf:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.g5 r3 = r3.f74136a     // Catch:{ IOException -> 0x0ac9 }
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo86903d()     // Catch:{ IOException -> 0x0ac9 }
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87489r()     // Catch:{ IOException -> 0x0ac9 }
            java.lang.String r5 = "Error storing raw event metadata. appId"
            java.lang.String r6 = r6.mo136978W1()     // Catch:{ IOException -> 0x0ac9 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r6)     // Catch:{ IOException -> 0x0ac9 }
            r3.mo87465c(r5, r6, r2)     // Catch:{ IOException -> 0x0ac9 }
            throw r2     // Catch:{ IOException -> 0x0ac9 }
        L_0x0ac9:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.u3 r3 = r35.mo86903d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87489r()     // Catch:{ all -> 0x0b13 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r4 = r4.mo136870z0()     // Catch:{ all -> 0x0b13 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r4)     // Catch:{ all -> 0x0b13 }
            r3.mo87465c(r5, r4, r2)     // Catch:{ all -> 0x0b13 }
        L_0x0ae0:
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c     // Catch:{ all -> 0x0b13 }
            m124012R(r2)     // Catch:{ all -> 0x0b13 }
            r2.mo87232o()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c
            m124012R(r2)
            r2.mo87227f0()
            r35.mo87352M()
            com.google.android.gms.measurement.internal.u3 r2 = r35.mo86903d()
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87493v()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r28
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo87464b(r4, r3)
            return
        L_0x0b13:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.l r3 = r1.f73797c
            m124012R(r3)
            r3.mo87227f0()
            throw r2
        L_0x0b1e:
            r1.mo87356S(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30822na.mo87345D(com.google.android.gms.measurement.internal.zzaw, com.google.android.gms.measurement.internal.zzq):void");
    }

    @C0348i1
    @C40974d0
    /* renamed from: E */
    public final boolean mo87346E() {
        mo86904f().mo86866h();
        FileLock fileLock = this.f73816v;
        if (fileLock == null || !fileLock.isValid()) {
            this.f73797c.f74136a.mo87130z();
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f73806l.mo86902c().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f73817w = channel;
                FileLock tryLock = channel.tryLock();
                this.f73816v = tryLock;
                if (tryLock != null) {
                    mo86903d().mo87493v().mo87463a("Storage concurrent access okay");
                    return true;
                }
                mo86903d().mo87489r().mo87463a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                mo86903d().mo87489r().mo87464b("Failed to acquire storage lock", e);
                return false;
            } catch (IOException e2) {
                mo86903d().mo87489r().mo87464b("Failed to access storage lock file", e2);
                return false;
            } catch (OverlappingFileLockException e3) {
                mo86903d().mo87494w().mo87464b("Storage lock already acquired", e3);
                return false;
            }
        } else {
            mo86903d().mo87493v().mo87463a("Storage concurrent access okay");
            return true;
        }
    }

    /* renamed from: F */
    public final long mo87347F() {
        long a = mo86900a().mo134768a();
        C30722f9 f9Var = this.f73803i;
        f9Var.mo87627i();
        f9Var.mo86866h();
        long a2 = f9Var.f73400i.mo87096a();
        if (a2 == 0) {
            a2 = ((long) f9Var.f74136a.mo87110N().mo87542u().nextInt(86400000)) + 1;
            f9Var.f73400i.mo87097b(a2);
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    @C0348i1
    /* renamed from: I */
    public final zzq mo87348I(String str) {
        String str2 = str;
        C30787l lVar = this.f73797c;
        m124012R(lVar);
        C30693d6 R = lVar.mo87214R(str2);
        if (R == null || TextUtils.isEmpty(R.mo87000l0())) {
            mo86903d().mo87488q().mo87464b("No app data available; dropping", str2);
            return null;
        }
        Boolean J = mo87349J(R);
        if (J == null || J.booleanValue()) {
            C30693d6 d6Var = R;
            d6Var.mo86951A();
            return new zzq(str, R.mo87004n0(), R.mo87000l0(), R.mo86966P(), R.mo86998k0(), R.mo86978a0(), R.mo86974X(), (String) null, R.mo86963M(), false, R.mo87002m0(), 0, 0, 0, d6Var.mo86962L(), false, d6Var.mo86990g0(), d6Var.mo86988f0(), d6Var.mo86975Y(), d6Var.mo86983d(), (String) null, mo87359V(str).mo87140h(), "", (String) null, d6Var.mo86965O(), d6Var.mo86986e0());
        }
        mo86903d().mo87489r().mo87464b("App version does not match; dropping. appId", C30899u3.m124186z(str));
        return null;
    }

    @C0348i1
    /* renamed from: J */
    public final Boolean mo87349J(C30693d6 d6Var) {
        try {
            if (d6Var.mo86966P() != -2147483648L) {
                if (d6Var.mo86966P() == ((long) C41008d.m166715a(this.f73806l.mo86902c()).mo134784f(d6Var.mo86994i0(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C41008d.m166715a(this.f73806l.mo86902c()).mo134784f(d6Var.mo86994i0(), 0).versionName;
                String l0 = d6Var.mo87000l0();
                if (l0 != null && l0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @C0348i1
    /* renamed from: K */
    public final void mo87350K() {
        mo86904f().mo86866h();
        if (this.f73813s || this.f73814t || this.f73815u) {
            mo86903d().mo87493v().mo87466d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f73813s), Boolean.valueOf(this.f73814t), Boolean.valueOf(this.f73815u));
            return;
        }
        mo86903d().mo87493v().mo87463a("Stopping uploading service(s)");
        List<Runnable> list = this.f73810p;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) C40843u.m166202l(this.f73810p)).clear();
        }
    }

    @C40974d0
    /* renamed from: L */
    public final void mo87351L(C41963g5 g5Var, long j, boolean z) {
        String str;
        C30870ra raVar;
        String str2;
        C30787l lVar = this.f73797c;
        m124012R(lVar);
        if (true != z) {
            str = "_lte";
        } else {
            str = "_se";
        }
        C30870ra X = lVar.mo87219X(g5Var.mo136870z0(), str);
        if (X == null || X.f73926e == null) {
            raVar = new C30870ra(g5Var.mo136870z0(), "auto", str, mo86900a().mo134768a(), Long.valueOf(j));
        } else {
            raVar = new C30870ra(g5Var.mo136870z0(), "auto", str, mo86900a().mo134768a(), Long.valueOf(((Long) X.f73926e).longValue() + j));
        }
        C42122p5 E = C42139q5.m170743E();
        E.mo137213E(str);
        E.mo137214F(mo86900a().mo134768a());
        E.mo137212D(((Long) raVar.f73926e).longValue());
        C42139q5 q5Var = (C42139q5) E.mo137180s();
        int w = C30846pa.m124125w(g5Var, str);
        if (w >= 0) {
            g5Var.mo136866w0(w, q5Var);
        } else {
            g5Var.mo136831T0(q5Var);
        }
        if (j > 0) {
            C30787l lVar2 = this.f73797c;
            m124012R(lVar2);
            lVar2.mo87241x(raVar);
            if (true != z) {
                str2 = "lifetime";
            } else {
                str2 = "session-scoped";
            }
            mo86903d().mo87493v().mo87465c("Updated engagement user property. scope, value", str2, raVar.f73926e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0238  */
    @androidx.annotation.C0348i1
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87352M() {
        /*
            r20 = this;
            r0 = r20
            com.google.android.gms.measurement.internal.d5 r1 = r20.mo86904f()
            r1.mo86866h()
            r20.mo87369g()
            long r1 = r0.f73809o
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004e
            com.google.android.gms.common.util.g r1 = r20.mo86900a()
            long r1 = r1.mo134770c()
            long r5 = r0.f73809o
            long r1 = r1 - r5
            long r1 = java.lang.Math.abs(r1)
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004c
            com.google.android.gms.measurement.internal.u3 r1 = r20.mo86903d()
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo87493v()
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r1.mo87464b(r2, r3)
            com.google.android.gms.measurement.internal.d4 r1 = r20.mo87363Z()
            r1.mo86940c()
            com.google.android.gms.measurement.internal.x9 r1 = r0.f73799e
            m124012R(r1)
            r1.mo87598m()
            return
        L_0x004c:
            r0.f73809o = r3
        L_0x004e:
            com.google.android.gms.measurement.internal.g5 r1 = r0.f73806l
            boolean r1 = r1.mo87126r()
            if (r1 == 0) goto L_0x0255
            boolean r1 = r20.mo87354O()
            if (r1 != 0) goto L_0x005e
            goto L_0x0255
        L_0x005e:
            com.google.android.gms.common.util.g r1 = r20.mo86900a()
            long r1 = r1.mo134768a()
            r20.mo87358U()
            com.google.android.gms.measurement.internal.g3 r5 = com.google.android.gms.measurement.internal.C30742h3.f73490C
            r6 = 0
            java.lang.Object r5 = r5.mo87094a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.l r5 = r0.f73797c
            m124012R(r5)
            boolean r5 = r5.mo87237t()
            r10 = 1
            if (r5 != 0) goto L_0x0093
            com.google.android.gms.measurement.internal.l r5 = r0.f73797c
            m124012R(r5)
            boolean r5 = r5.mo87236s()
            if (r5 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            if (r10 == 0) goto L_0x00d3
            com.google.android.gms.measurement.internal.g r5 = r20.mo87358U()
            java.lang.String r5 = r5.mo87088u()
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto L_0x00bf
            java.lang.String r11 = ".none."
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x00bf
            r20.mo87358U()
            com.google.android.gms.measurement.internal.g3 r5 = com.google.android.gms.measurement.internal.C30742h3.f73567x
            java.lang.Object r5 = r5.mo87094a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00bf:
            r20.mo87358U()
            com.google.android.gms.measurement.internal.g3 r5 = com.google.android.gms.measurement.internal.C30742h3.f73565w
            java.lang.Object r5 = r5.mo87094a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00d3:
            r20.mo87358U()
            com.google.android.gms.measurement.internal.g3 r5 = com.google.android.gms.measurement.internal.C30742h3.f73563v
            java.lang.Object r5 = r5.mo87094a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
        L_0x00e6:
            com.google.android.gms.measurement.internal.f9 r5 = r0.f73803i
            com.google.android.gms.measurement.internal.g4 r5 = r5.f73398g
            long r13 = r5.mo87096a()
            com.google.android.gms.measurement.internal.f9 r5 = r0.f73803i
            com.google.android.gms.measurement.internal.g4 r5 = r5.f73399h
            long r15 = r5.mo87096a()
            com.google.android.gms.measurement.internal.l r5 = r0.f73797c
            m124012R(r5)
            r17 = r10
            long r9 = r5.mo87209M()
            com.google.android.gms.measurement.internal.l r5 = r0.f73797c
            m124012R(r5)
            r18 = r7
            long r6 = r5.mo87210N()
            long r5 = java.lang.Math.max(r9, r6)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0117
        L_0x0114:
            r9 = r3
            goto L_0x018f
        L_0x0117:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r13 = r13 - r1
            long r7 = java.lang.Math.abs(r13)
            long r7 = r1 - r7
            long r15 = r15 - r1
            long r9 = java.lang.Math.abs(r15)
            long r1 = r1 - r9
            long r9 = r5 + r18
            long r7 = java.lang.Math.max(r7, r1)
            if (r17 == 0) goto L_0x013c
            int r13 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x013c
            long r9 = java.lang.Math.min(r5, r7)
            long r9 = r9 + r11
        L_0x013c:
            com.google.android.gms.measurement.internal.pa r13 = r0.f73801g
            m124012R(r13)
            boolean r13 = r13.mo87427M(r7, r11)
            if (r13 != 0) goto L_0x0149
            long r9 = r7 + r11
        L_0x0149:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x018f
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x018f
            r5 = 0
        L_0x0152:
            r20.mo87358U()
            com.google.android.gms.measurement.internal.g3 r6 = com.google.android.gms.measurement.internal.C30742h3.f73494E
            r7 = 0
            java.lang.Object r6 = r6.mo87094a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r8 = 0
            int r6 = java.lang.Math.max(r8, r6)
            r11 = 20
            int r6 = java.lang.Math.min(r11, r6)
            if (r5 >= r6) goto L_0x0114
            r11 = 1
            long r11 = r11 << r5
            r20.mo87358U()
            com.google.android.gms.measurement.internal.g3 r6 = com.google.android.gms.measurement.internal.C30742h3.f73492D
            java.lang.Object r6 = r6.mo87094a(r7)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            long r6 = java.lang.Math.max(r3, r6)
            long r6 = r6 * r11
            long r9 = r9 + r6
            int r6 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x018c
            goto L_0x018f
        L_0x018c:
            int r5 = r5 + 1
            goto L_0x0152
        L_0x018f:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0238
            com.google.android.gms.measurement.internal.a4 r1 = r0.f73796b
            m124012R(r1)
            boolean r1 = r1.mo86868m()
            if (r1 == 0) goto L_0x021b
            com.google.android.gms.measurement.internal.f9 r1 = r0.f73803i
            com.google.android.gms.measurement.internal.g4 r1 = r1.f73397f
            long r1 = r1.mo87096a()
            r20.mo87358U()
            com.google.android.gms.measurement.internal.g3 r5 = com.google.android.gms.measurement.internal.C30742h3.f73559t
            r6 = 0
            java.lang.Object r5 = r5.mo87094a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.pa r7 = r0.f73801g
            m124012R(r7)
            boolean r7 = r7.mo87427M(r1, r5)
            if (r7 != 0) goto L_0x01ca
            long r1 = r1 + r5
            long r9 = java.lang.Math.max(r9, r1)
        L_0x01ca:
            com.google.android.gms.measurement.internal.d4 r1 = r20.mo87363Z()
            r1.mo86940c()
            com.google.android.gms.common.util.g r1 = r20.mo86900a()
            long r1 = r1.mo134768a()
            long r9 = r9 - r1
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0201
            r20.mo87358U()
            com.google.android.gms.measurement.internal.g3 r1 = com.google.android.gms.measurement.internal.C30742h3.f73569y
            r2 = 0
            java.lang.Object r1 = r1.mo87094a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r9 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.f9 r1 = r0.f73803i
            com.google.android.gms.measurement.internal.g4 r1 = r1.f73398g
            com.google.android.gms.common.util.g r2 = r20.mo86900a()
            long r2 = r2.mo134768a()
            r1.mo87097b(r2)
        L_0x0201:
            com.google.android.gms.measurement.internal.u3 r1 = r20.mo86903d()
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo87493v()
            java.lang.String r2 = "Upload scheduled in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r1.mo87464b(r2, r3)
            com.google.android.gms.measurement.internal.x9 r1 = r0.f73799e
            m124012R(r1)
            r1.mo87599n(r9)
            return
        L_0x021b:
            com.google.android.gms.measurement.internal.u3 r1 = r20.mo86903d()
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo87493v()
            java.lang.String r2 = "No network"
            r1.mo87463a(r2)
            com.google.android.gms.measurement.internal.d4 r1 = r20.mo87363Z()
            r1.mo86939b()
            com.google.android.gms.measurement.internal.x9 r1 = r0.f73799e
            m124012R(r1)
            r1.mo87598m()
            return
        L_0x0238:
            com.google.android.gms.measurement.internal.u3 r1 = r20.mo86903d()
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo87493v()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo87463a(r2)
            com.google.android.gms.measurement.internal.d4 r1 = r20.mo87363Z()
            r1.mo86940c()
            com.google.android.gms.measurement.internal.x9 r1 = r0.f73799e
            m124012R(r1)
            r1.mo87598m()
            return
        L_0x0255:
            com.google.android.gms.measurement.internal.u3 r1 = r20.mo86903d()
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo87493v()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo87463a(r2)
            com.google.android.gms.measurement.internal.d4 r1 = r20.mo87363Z()
            r1.mo86940c()
            com.google.android.gms.measurement.internal.x9 r1 = r0.f73799e
            m124012R(r1)
            r1.mo87598m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30822na.mo87352M():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0b33, code lost:
        if (r10 > (com.google.android.gms.measurement.internal.C30725g.m123710i() + r8)) goto L_0x0b35;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0383 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0447 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0489 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x07d7 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0820 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0843 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x08ba A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x08bc A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x08c4 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x08f0 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0b23 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0baa A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0bc6 A[Catch:{ SQLiteException -> 0x0bde }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:55:0x01c0=Splitter:B:55:0x01c0, B:399:0x0cba=Splitter:B:399:0x0cba} */
    @androidx.annotation.C0348i1
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87353N(java.lang.String r41, long r42) {
        /*
            r40 = this;
            r1 = r40
            java.lang.String r2 = "_npa"
            java.lang.String r3 = "_ai"
            com.google.android.gms.measurement.internal.l r4 = r1.f73797c
            m124012R(r4)
            r4.mo87226e0()
            com.google.android.gms.measurement.internal.ka r4 = new com.google.android.gms.measurement.internal.ka     // Catch:{ all -> 0x0ccc }
            r12 = 0
            r4.<init>(r1, r12)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.l r5 = r1.f73797c     // Catch:{ all -> 0x0ccc }
            m124012R(r5)     // Catch:{ all -> 0x0ccc }
            r6 = 0
            long r9 = r1.f73820z     // Catch:{ all -> 0x0ccc }
            r7 = r42
            r11 = r4
            r5.mo87204G(r6, r7, r9, r11)     // Catch:{ all -> 0x0ccc }
            java.util.List r5 = r4.f73689c     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x0cba
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x002e
            goto L_0x0cba
        L_0x002e:
            com.google.android.gms.internal.measurement.h5 r5 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.n9 r5 = r5.mo137278k()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.g5 r5 = (com.google.android.gms.internal.measurement.C41963g5) r5     // Catch:{ all -> 0x0ccc }
            r5.mo136839Y0()     // Catch:{ all -> 0x0ccc }
            r11 = r12
            r14 = r11
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = -1
            r15 = -1
        L_0x0040:
            java.util.List r12 = r4.f73689c     // Catch:{ all -> 0x0ccc }
            int r12 = r12.size()     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = "_fr"
            java.lang.String r7 = "_et"
            r16 = r10
            java.lang.String r10 = "_e"
            r17 = r13
            r18 = r14
            if (r8 >= r12) goto L_0x04f9
            java.util.List r12 = r4.f73689c     // Catch:{ all -> 0x0ccc }
            java.lang.Object r12 = r12.get(r8)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.w4 r12 = (com.google.android.gms.internal.measurement.C42240w4) r12     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.n9 r12 = r12.mo137278k()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.v4 r12 = (com.google.android.gms.internal.measurement.C42223v4) r12     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.x4 r14 = r1.f73795a     // Catch:{ all -> 0x0ccc }
            m124012R(r14)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.h5 r13 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r13 = r13.mo136978W1()     // Catch:{ all -> 0x0ccc }
            r19 = r2
            java.lang.String r2 = r12.mo137367O()     // Catch:{ all -> 0x0ccc }
            boolean r2 = r14.mo87574F(r13, r2)     // Catch:{ all -> 0x0ccc }
            java.lang.String r13 = "_err"
            if (r2 == 0) goto L_0x00f7
            com.google.android.gms.measurement.internal.u3 r2 = r40.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87494w()     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.h5 r7 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = r7.mo136978W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r7)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.g5 r10 = r1.f73806l     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p3 r10 = r10.mo87101D()     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = r12.mo137367O()     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = r10.mo87410d(r14)     // Catch:{ all -> 0x0ccc }
            r2.mo87465c(r6, r7, r10)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.x4 r2 = r1.f73795a     // Catch:{ all -> 0x0ccc }
            m124012R(r2)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.h5 r6 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = r6.mo136978W1()     // Catch:{ all -> 0x0ccc }
            boolean r2 = r2.mo87572D(r6)     // Catch:{ all -> 0x0ccc }
            if (r2 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.x4 r2 = r1.f73795a     // Catch:{ all -> 0x0ccc }
            m124012R(r2)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.h5 r6 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = r6.mo136978W1()     // Catch:{ all -> 0x0ccc }
            boolean r2 = r2.mo87575G(r6)     // Catch:{ all -> 0x0ccc }
            if (r2 == 0) goto L_0x00c3
            goto L_0x00e8
        L_0x00c3:
            java.lang.String r2 = r12.mo137367O()     // Catch:{ all -> 0x0ccc }
            boolean r2 = r13.equals(r2)     // Catch:{ all -> 0x0ccc }
            if (r2 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.ua r20 = r40.mo87372h0()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.ta r2 = r1.f73794E     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.h5 r6 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r22 = r6.mo136978W1()     // Catch:{ all -> 0x0ccc }
            r23 = 11
            java.lang.String r24 = "_ev"
            java.lang.String r25 = r12.mo137367O()     // Catch:{ all -> 0x0ccc }
            r26 = 0
            r21 = r2
            r20.mo87503C(r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0ccc }
        L_0x00e8:
            r21 = r3
            r6 = r8
            r23 = r11
            r10 = r16
            r13 = r17
            r14 = r18
            r11 = r5
            r5 = -1
            goto L_0x04ee
        L_0x00f7:
            java.lang.String r2 = r12.mo137367O()     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = com.google.android.gms.measurement.internal.C30706e6.m123694a(r3)     // Catch:{ all -> 0x0ccc }
            boolean r2 = r2.equals(r14)     // Catch:{ all -> 0x0ccc }
            if (r2 == 0) goto L_0x016d
            r12.mo137361H(r3)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.u3 r2 = r40.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87493v()     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = "Renaming ad_impression to _ai"
            r2.mo87463a(r14)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.u3 r2 = r40.mo86903d()     // Catch:{ all -> 0x0ccc }
            java.lang.String r2 = r2.mo87486D()     // Catch:{ all -> 0x0ccc }
            r14 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r14)     // Catch:{ all -> 0x0ccc }
            if (r2 == 0) goto L_0x016d
            r2 = 0
        L_0x0125:
            int r14 = r12.mo137370x()     // Catch:{ all -> 0x0ccc }
            if (r2 >= r14) goto L_0x016d
            java.lang.String r14 = "ad_platform"
            com.google.android.gms.internal.measurement.a5 r20 = r12.mo137366N(r2)     // Catch:{ all -> 0x0ccc }
            r21 = r3
            java.lang.String r3 = r20.mo136514H()     // Catch:{ all -> 0x0ccc }
            boolean r3 = r14.equals(r3)     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x0168
            com.google.android.gms.internal.measurement.a5 r3 = r12.mo137366N(r2)     // Catch:{ all -> 0x0ccc }
            java.lang.String r3 = r3.mo136515I()     // Catch:{ all -> 0x0ccc }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0ccc }
            if (r3 != 0) goto L_0x0168
            java.lang.String r3 = "admob"
            com.google.android.gms.internal.measurement.a5 r14 = r12.mo137366N(r2)     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = r14.mo136515I()     // Catch:{ all -> 0x0ccc }
            boolean r3 = r3.equalsIgnoreCase(r14)     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x0168
            com.google.android.gms.measurement.internal.u3 r3 = r40.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87495x()     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = "AdMob ad impression logged from app. Potentially duplicative."
            r3.mo87463a(r14)     // Catch:{ all -> 0x0ccc }
        L_0x0168:
            int r2 = r2 + 1
            r3 = r21
            goto L_0x0125
        L_0x016d:
            r21 = r3
            com.google.android.gms.measurement.internal.x4 r2 = r1.f73795a     // Catch:{ all -> 0x0ccc }
            m124012R(r2)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.h5 r3 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r3 = r3.mo136978W1()     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = r12.mo137367O()     // Catch:{ all -> 0x0ccc }
            boolean r2 = r2.mo87573E(r3, r14)     // Catch:{ all -> 0x0ccc }
            java.lang.String r3 = "_c"
            if (r2 != 0) goto L_0x01b7
            com.google.android.gms.measurement.internal.pa r14 = r1.f73801g     // Catch:{ all -> 0x0ccc }
            m124012R(r14)     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = r12.mo137367O()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.common.internal.C40843u.m166198h(r14)     // Catch:{ all -> 0x0ccc }
            r20 = r9
            int r9 = r14.hashCode()     // Catch:{ all -> 0x0ccc }
            r22 = r8
            r8 = 95027(0x17333, float:1.33161E-40)
            if (r9 == r8) goto L_0x01a0
            goto L_0x01aa
        L_0x01a0:
            java.lang.String r8 = "_ui"
            boolean r8 = r14.equals(r8)
            if (r8 == 0) goto L_0x01aa
            r8 = 0
            goto L_0x01ab
        L_0x01aa:
            r8 = -1
        L_0x01ab:
            if (r8 == 0) goto L_0x01bb
            r25 = r6
            r24 = r7
            r23 = r11
            r2 = 0
            r11 = r5
            goto L_0x0381
        L_0x01b7:
            r22 = r8
            r20 = r9
        L_0x01bb:
            r23 = r11
            r8 = 0
            r9 = 0
            r14 = 0
        L_0x01c0:
            int r11 = r12.mo137370x()     // Catch:{ all -> 0x0ccc }
            r24 = r7
            java.lang.String r7 = "_r"
            if (r8 >= r11) goto L_0x0227
            com.google.android.gms.internal.measurement.a5 r11 = r12.mo137366N(r8)     // Catch:{ all -> 0x0ccc }
            java.lang.String r11 = r11.mo136514H()     // Catch:{ all -> 0x0ccc }
            boolean r11 = r3.equals(r11)     // Catch:{ all -> 0x0ccc }
            if (r11 == 0) goto L_0x01f5
            com.google.android.gms.internal.measurement.a5 r7 = r12.mo137366N(r8)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.n9 r7 = r7.mo137278k()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.z4 r7 = (com.google.android.gms.internal.measurement.C42291z4) r7     // Catch:{ all -> 0x0ccc }
            r11 = r5
            r25 = r6
            r5 = 1
            r7.mo137490H(r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.s9 r5 = r7.mo137180s()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.a5 r5 = (com.google.android.gms.internal.measurement.C41855a5) r5     // Catch:{ all -> 0x0ccc }
            r12.mo137363J(r8, r5)     // Catch:{ all -> 0x0ccc }
            r9 = 1
            goto L_0x021f
        L_0x01f5:
            r11 = r5
            r25 = r6
            com.google.android.gms.internal.measurement.a5 r5 = r12.mo137366N(r8)     // Catch:{ all -> 0x0ccc }
            java.lang.String r5 = r5.mo136514H()     // Catch:{ all -> 0x0ccc }
            boolean r5 = r7.equals(r5)     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x021f
            com.google.android.gms.internal.measurement.a5 r5 = r12.mo137366N(r8)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.n9 r5 = r5.mo137278k()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.z4 r5 = (com.google.android.gms.internal.measurement.C42291z4) r5     // Catch:{ all -> 0x0ccc }
            r6 = 1
            r5.mo137490H(r6)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.s9 r5 = r5.mo137180s()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.a5 r5 = (com.google.android.gms.internal.measurement.C41855a5) r5     // Catch:{ all -> 0x0ccc }
            r12.mo137363J(r8, r5)     // Catch:{ all -> 0x0ccc }
            r14 = 1
        L_0x021f:
            int r8 = r8 + 1
            r5 = r11
            r7 = r24
            r6 = r25
            goto L_0x01c0
        L_0x0227:
            r11 = r5
            r25 = r6
            if (r9 != 0) goto L_0x0258
            if (r2 == 0) goto L_0x0258
            com.google.android.gms.measurement.internal.u3 r5 = r40.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r5 = r5.mo87493v()     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.g5 r8 = r1.f73806l     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p3 r8 = r8.mo87101D()     // Catch:{ all -> 0x0ccc }
            java.lang.String r9 = r12.mo137367O()     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = r8.mo87410d(r9)     // Catch:{ all -> 0x0ccc }
            r5.mo87464b(r6, r8)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.z4 r5 = com.google.android.gms.internal.measurement.C41855a5.m169601F()     // Catch:{ all -> 0x0ccc }
            r5.mo137491I(r3)     // Catch:{ all -> 0x0ccc }
            r8 = 1
            r5.mo137490H(r8)     // Catch:{ all -> 0x0ccc }
            r12.mo137357D(r5)     // Catch:{ all -> 0x0ccc }
        L_0x0258:
            if (r14 != 0) goto L_0x0284
            com.google.android.gms.measurement.internal.u3 r5 = r40.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r5 = r5.mo87493v()     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.g5 r8 = r1.f73806l     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p3 r8 = r8.mo87101D()     // Catch:{ all -> 0x0ccc }
            java.lang.String r9 = r12.mo137367O()     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = r8.mo87410d(r9)     // Catch:{ all -> 0x0ccc }
            r5.mo87464b(r6, r8)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.z4 r5 = com.google.android.gms.internal.measurement.C41855a5.m169601F()     // Catch:{ all -> 0x0ccc }
            r5.mo137491I(r7)     // Catch:{ all -> 0x0ccc }
            r8 = 1
            r5.mo137490H(r8)     // Catch:{ all -> 0x0ccc }
            r12.mo137357D(r5)     // Catch:{ all -> 0x0ccc }
        L_0x0284:
            com.google.android.gms.measurement.internal.l r5 = r1.f73797c     // Catch:{ all -> 0x0ccc }
            m124012R(r5)     // Catch:{ all -> 0x0ccc }
            long r27 = r40.mo87347F()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.h5 r6 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r29 = r6.mo136978W1()     // Catch:{ all -> 0x0ccc }
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 1
            r26 = r5
            com.google.android.gms.measurement.internal.j r5 = r26.mo87216T(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0ccc }
            long r5 = r5.f73620e     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.g r8 = r40.mo87358U()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.h5 r9 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r9 = r9.mo136978W1()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.g3 r14 = com.google.android.gms.measurement.internal.C30742h3.f73553q     // Catch:{ all -> 0x0ccc }
            int r8 = r8.mo87082o(r9, r14)     // Catch:{ all -> 0x0ccc }
            long r8 = (long) r8     // Catch:{ all -> 0x0ccc }
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x02be
            m124010H(r12, r7)     // Catch:{ all -> 0x0ccc }
            goto L_0x02c0
        L_0x02be:
            r16 = 1
        L_0x02c0:
            java.lang.String r5 = r12.mo137367O()     // Catch:{ all -> 0x0ccc }
            boolean r5 = com.google.android.gms.measurement.internal.C30906ua.m124207Z(r5)     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x0381
            if (r2 == 0) goto L_0x0381
            com.google.android.gms.measurement.internal.l r5 = r1.f73797c     // Catch:{ all -> 0x0ccc }
            m124012R(r5)     // Catch:{ all -> 0x0ccc }
            long r27 = r40.mo87347F()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.h5 r6 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r29 = r6.mo136978W1()     // Catch:{ all -> 0x0ccc }
            r30 = 0
            r31 = 0
            r32 = 1
            r33 = 0
            r34 = 0
            r26 = r5
            com.google.android.gms.measurement.internal.j r5 = r26.mo87216T(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0ccc }
            long r5 = r5.f73618c     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.g r7 = r40.mo87358U()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.h5 r8 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = r8.mo136978W1()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.g3 r9 = com.google.android.gms.measurement.internal.C30742h3.f73551p     // Catch:{ all -> 0x0ccc }
            int r7 = r7.mo87082o(r8, r9)     // Catch:{ all -> 0x0ccc }
            long r7 = (long) r7     // Catch:{ all -> 0x0ccc }
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0381
            com.google.android.gms.measurement.internal.u3 r5 = r40.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r5 = r5.mo87494w()     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.h5 r7 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = r7.mo136978W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r7)     // Catch:{ all -> 0x0ccc }
            r5.mo87464b(r6, r7)     // Catch:{ all -> 0x0ccc }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = -1
        L_0x031d:
            int r9 = r12.mo137370x()     // Catch:{ all -> 0x0ccc }
            if (r6 >= r9) goto L_0x0347
            com.google.android.gms.internal.measurement.a5 r9 = r12.mo137366N(r6)     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = r9.mo136514H()     // Catch:{ all -> 0x0ccc }
            boolean r14 = r3.equals(r14)     // Catch:{ all -> 0x0ccc }
            if (r14 == 0) goto L_0x0339
            com.google.android.gms.internal.measurement.n9 r5 = r9.mo137278k()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.z4 r5 = (com.google.android.gms.internal.measurement.C42291z4) r5     // Catch:{ all -> 0x0ccc }
            r8 = r6
            goto L_0x0344
        L_0x0339:
            java.lang.String r9 = r9.mo136514H()     // Catch:{ all -> 0x0ccc }
            boolean r9 = r13.equals(r9)     // Catch:{ all -> 0x0ccc }
            if (r9 == 0) goto L_0x0344
            r7 = 1
        L_0x0344:
            int r6 = r6 + 1
            goto L_0x031d
        L_0x0347:
            if (r7 == 0) goto L_0x0350
            if (r5 == 0) goto L_0x034f
            r12.mo137360G(r8)     // Catch:{ all -> 0x0ccc }
            goto L_0x0381
        L_0x034f:
            r5 = 0
        L_0x0350:
            if (r5 == 0) goto L_0x036a
            com.google.android.gms.internal.measurement.n9 r5 = r5.mo136716i()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.z4 r5 = (com.google.android.gms.internal.measurement.C42291z4) r5     // Catch:{ all -> 0x0ccc }
            r5.mo137491I(r13)     // Catch:{ all -> 0x0ccc }
            r6 = 10
            r5.mo137490H(r6)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.s9 r5 = r5.mo137180s()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.a5 r5 = (com.google.android.gms.internal.measurement.C41855a5) r5     // Catch:{ all -> 0x0ccc }
            r12.mo137363J(r8, r5)     // Catch:{ all -> 0x0ccc }
            goto L_0x0381
        L_0x036a:
            com.google.android.gms.measurement.internal.u3 r5 = r40.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r5 = r5.mo87489r()     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.h5 r7 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = r7.mo136978W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r7)     // Catch:{ all -> 0x0ccc }
            r5.mo87464b(r6, r7)     // Catch:{ all -> 0x0ccc }
        L_0x0381:
            if (r2 == 0) goto L_0x043a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0ccc }
            java.util.List r5 = r12.mo137368P()     // Catch:{ all -> 0x0ccc }
            r2.<init>(r5)     // Catch:{ all -> 0x0ccc }
            r5 = 0
            r6 = -1
            r7 = -1
        L_0x038f:
            int r8 = r2.size()     // Catch:{ all -> 0x0ccc }
            java.lang.String r9 = "currency"
            java.lang.String r13 = "value"
            if (r5 >= r8) goto L_0x03bf
            java.lang.Object r8 = r2.get(r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.a5 r8 = (com.google.android.gms.internal.measurement.C41855a5) r8     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = r8.mo136514H()     // Catch:{ all -> 0x0ccc }
            boolean r8 = r13.equals(r8)     // Catch:{ all -> 0x0ccc }
            if (r8 == 0) goto L_0x03ab
            r6 = r5
            goto L_0x03bc
        L_0x03ab:
            java.lang.Object r8 = r2.get(r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.a5 r8 = (com.google.android.gms.internal.measurement.C41855a5) r8     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = r8.mo136514H()     // Catch:{ all -> 0x0ccc }
            boolean r8 = r9.equals(r8)     // Catch:{ all -> 0x0ccc }
            if (r8 == 0) goto L_0x03bc
            r7 = r5
        L_0x03bc:
            int r5 = r5 + 1
            goto L_0x038f
        L_0x03bf:
            r5 = -1
            if (r6 != r5) goto L_0x03c4
            goto L_0x043b
        L_0x03c4:
            java.lang.Object r5 = r2.get(r6)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.a5 r5 = (com.google.android.gms.internal.measurement.C41855a5) r5     // Catch:{ all -> 0x0ccc }
            boolean r5 = r5.mo136519W()     // Catch:{ all -> 0x0ccc }
            if (r5 != 0) goto L_0x03f5
            java.lang.Object r5 = r2.get(r6)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.a5 r5 = (com.google.android.gms.internal.measurement.C41855a5) r5     // Catch:{ all -> 0x0ccc }
            boolean r5 = r5.mo136517U()     // Catch:{ all -> 0x0ccc }
            if (r5 != 0) goto L_0x03f5
            com.google.android.gms.measurement.internal.u3 r2 = r40.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87495x()     // Catch:{ all -> 0x0ccc }
            java.lang.String r5 = "Value must be specified with a numeric type."
            r2.mo87463a(r5)     // Catch:{ all -> 0x0ccc }
            r12.mo137360G(r6)     // Catch:{ all -> 0x0ccc }
            m124010H(r12, r3)     // Catch:{ all -> 0x0ccc }
            r2 = 18
            m124009G(r12, r2, r13)     // Catch:{ all -> 0x0ccc }
            goto L_0x043a
        L_0x03f5:
            r5 = -1
            if (r7 != r5) goto L_0x03f9
            goto L_0x0421
        L_0x03f9:
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.a5 r2 = (com.google.android.gms.internal.measurement.C41855a5) r2     // Catch:{ all -> 0x0ccc }
            java.lang.String r2 = r2.mo136515I()     // Catch:{ all -> 0x0ccc }
            int r7 = r2.length()     // Catch:{ all -> 0x0ccc }
            r8 = 3
            if (r7 != r8) goto L_0x0421
            r7 = 0
        L_0x040b:
            int r8 = r2.length()     // Catch:{ all -> 0x0ccc }
            if (r7 >= r8) goto L_0x043b
            int r8 = r2.codePointAt(r7)     // Catch:{ all -> 0x0ccc }
            boolean r13 = java.lang.Character.isLetter(r8)     // Catch:{ all -> 0x0ccc }
            if (r13 == 0) goto L_0x0421
            int r8 = java.lang.Character.charCount(r8)     // Catch:{ all -> 0x0ccc }
            int r7 = r7 + r8
            goto L_0x040b
        L_0x0421:
            com.google.android.gms.measurement.internal.u3 r2 = r40.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87495x()     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.mo87463a(r7)     // Catch:{ all -> 0x0ccc }
            r12.mo137360G(r6)     // Catch:{ all -> 0x0ccc }
            m124010H(r12, r3)     // Catch:{ all -> 0x0ccc }
            r2 = 19
            m124009G(r12, r2, r9)     // Catch:{ all -> 0x0ccc }
            goto L_0x043b
        L_0x043a:
            r5 = -1
        L_0x043b:
            java.lang.String r2 = r12.mo137367O()     // Catch:{ all -> 0x0ccc }
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x0ccc }
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x0489
            com.google.android.gms.measurement.internal.pa r2 = r1.f73801g     // Catch:{ all -> 0x0ccc }
            m124012R(r2)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.s9 r2 = r12.mo137180s()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.w4 r2 = (com.google.android.gms.internal.measurement.C42240w4) r2     // Catch:{ all -> 0x0ccc }
            r3 = r25
            com.google.android.gms.internal.measurement.a5 r2 = com.google.android.gms.measurement.internal.C30846pa.m124118n(r2, r3)     // Catch:{ all -> 0x0ccc }
            if (r2 != 0) goto L_0x04d5
            if (r18 == 0) goto L_0x0482
            long r2 = r18.mo137355B()     // Catch:{ all -> 0x0ccc }
            long r8 = r12.mo137355B()     // Catch:{ all -> 0x0ccc }
            long r2 = r2 - r8
            long r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0ccc }
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0482
            com.google.android.gms.internal.measurement.n9 r2 = r18.mo136716i()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.v4 r2 = (com.google.android.gms.internal.measurement.C42223v4) r2     // Catch:{ all -> 0x0ccc }
            boolean r3 = r1.mo87355P(r12, r2)     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x0482
            r11.mo136830T(r15, r2)     // Catch:{ all -> 0x0ccc }
            r13 = r17
        L_0x047e:
            r14 = 0
            r23 = 0
            goto L_0x04da
        L_0x0482:
            r23 = r12
            r14 = r18
            r13 = r20
            goto L_0x04da
        L_0x0489:
            java.lang.String r2 = "_vs"
            java.lang.String r3 = r12.mo137367O()     // Catch:{ all -> 0x0ccc }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0ccc }
            if (r2 == 0) goto L_0x04d5
            com.google.android.gms.measurement.internal.pa r2 = r1.f73801g     // Catch:{ all -> 0x0ccc }
            m124012R(r2)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.s9 r2 = r12.mo137180s()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.w4 r2 = (com.google.android.gms.internal.measurement.C42240w4) r2     // Catch:{ all -> 0x0ccc }
            r8 = r24
            com.google.android.gms.internal.measurement.a5 r2 = com.google.android.gms.measurement.internal.C30846pa.m124118n(r2, r8)     // Catch:{ all -> 0x0ccc }
            if (r2 != 0) goto L_0x04d5
            if (r23 == 0) goto L_0x04ce
            long r2 = r23.mo137355B()     // Catch:{ all -> 0x0ccc }
            long r8 = r12.mo137355B()     // Catch:{ all -> 0x0ccc }
            long r2 = r2 - r8
            long r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0ccc }
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x04ce
            com.google.android.gms.internal.measurement.n9 r2 = r23.mo136716i()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.v4 r2 = (com.google.android.gms.internal.measurement.C42223v4) r2     // Catch:{ all -> 0x0ccc }
            boolean r3 = r1.mo87355P(r2, r12)     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x04ce
            r7 = r17
            r11.mo136830T(r7, r2)     // Catch:{ all -> 0x0ccc }
            r13 = r7
            goto L_0x047e
        L_0x04ce:
            r7 = r17
            r13 = r7
            r14 = r12
            r15 = r20
            goto L_0x04da
        L_0x04d5:
            r7 = r17
            r13 = r7
            r14 = r18
        L_0x04da:
            java.util.List r2 = r4.f73689c     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.s9 r3 = r12.mo137180s()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.w4 r3 = (com.google.android.gms.internal.measurement.C42240w4) r3     // Catch:{ all -> 0x0ccc }
            r6 = r22
            r2.set(r6, r3)     // Catch:{ all -> 0x0ccc }
            int r9 = r20 + 1
            r11.mo136827R0(r12)     // Catch:{ all -> 0x0ccc }
            r10 = r16
        L_0x04ee:
            int r8 = r6 + 1
            r5 = r11
            r2 = r19
            r3 = r21
            r11 = r23
            goto L_0x0040
        L_0x04f9:
            r19 = r2
            r11 = r5
            r3 = r6
            r8 = r7
            r20 = r9
            r5 = 0
            r12 = r5
            r2 = 0
        L_0x0504:
            if (r2 >= r9) goto L_0x0554
            com.google.android.gms.internal.measurement.w4 r7 = r11.mo136815J0(r2)     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = r7.mo137400I()     // Catch:{ all -> 0x0ccc }
            boolean r14 = r10.equals(r14)     // Catch:{ all -> 0x0ccc }
            if (r14 == 0) goto L_0x0527
            com.google.android.gms.measurement.internal.pa r14 = r1.f73801g     // Catch:{ all -> 0x0ccc }
            m124012R(r14)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.a5 r14 = com.google.android.gms.measurement.internal.C30846pa.m124118n(r7, r3)     // Catch:{ all -> 0x0ccc }
            if (r14 == 0) goto L_0x0527
            r11.mo136867x(r2)     // Catch:{ all -> 0x0ccc }
            int r9 = r9 + -1
            int r2 = r2 + -1
            goto L_0x0551
        L_0x0527:
            com.google.android.gms.measurement.internal.pa r14 = r1.f73801g     // Catch:{ all -> 0x0ccc }
            m124012R(r14)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.a5 r7 = com.google.android.gms.measurement.internal.C30846pa.m124118n(r7, r8)     // Catch:{ all -> 0x0ccc }
            if (r7 == 0) goto L_0x0551
            boolean r14 = r7.mo136519W()     // Catch:{ all -> 0x0ccc }
            if (r14 == 0) goto L_0x0541
            long r14 = r7.mo136513E()     // Catch:{ all -> 0x0ccc }
            java.lang.Long r7 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0ccc }
            goto L_0x0542
        L_0x0541:
            r7 = 0
        L_0x0542:
            if (r7 == 0) goto L_0x0551
            long r14 = r7.longValue()     // Catch:{ all -> 0x0ccc }
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x0551
            long r14 = r7.longValue()     // Catch:{ all -> 0x0ccc }
            long r12 = r12 + r14
        L_0x0551:
            r7 = 1
            int r2 = r2 + r7
            goto L_0x0504
        L_0x0554:
            r2 = 0
            r1.mo87351L(r11, r12, r2)     // Catch:{ all -> 0x0ccc }
            java.util.List r2 = r11.mo136805E0()     // Catch:{ all -> 0x0ccc }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0ccc }
        L_0x0560:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = "_se"
            if (r3 == 0) goto L_0x0586
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.w4 r3 = (com.google.android.gms.internal.measurement.C42240w4) r3     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = "_s"
            java.lang.String r3 = r3.mo137400I()     // Catch:{ all -> 0x0ccc }
            boolean r3 = r8.equals(r3)     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x0560
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c     // Catch:{ all -> 0x0ccc }
            m124012R(r2)     // Catch:{ all -> 0x0ccc }
            java.lang.String r3 = r11.mo136870z0()     // Catch:{ all -> 0x0ccc }
            r2.mo87230m(r3, r7)     // Catch:{ all -> 0x0ccc }
        L_0x0586:
            java.lang.String r2 = "_sid"
            int r2 = com.google.android.gms.measurement.internal.C30846pa.m124125w(r11, r2)     // Catch:{ all -> 0x0ccc }
            if (r2 < 0) goto L_0x0593
            r2 = 1
            r1.mo87351L(r11, r12, r2)     // Catch:{ all -> 0x0ccc }
            goto L_0x05b3
        L_0x0593:
            int r2 = com.google.android.gms.measurement.internal.C30846pa.m124125w(r11, r7)     // Catch:{ all -> 0x0ccc }
            if (r2 < 0) goto L_0x05b3
            r11.mo136798A(r2)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.u3 r2 = r40.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87489r()     // Catch:{ all -> 0x0ccc }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.h5 r7 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = r7.mo136978W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r7)     // Catch:{ all -> 0x0ccc }
            r2.mo87464b(r3, r7)     // Catch:{ all -> 0x0ccc }
        L_0x05b3:
            com.google.android.gms.measurement.internal.pa r2 = r1.f73801g     // Catch:{ all -> 0x0ccc }
            m124012R(r2)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.g5 r3 = r2.f74136a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87493v()     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = "Checking account type status for ad personalization signals"
            r3.mo87463a(r7)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.na r3 = r2.f74119b     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.x4 r3 = r3.f73795a     // Catch:{ all -> 0x0ccc }
            m124012R(r3)     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = r11.mo136870z0()     // Catch:{ all -> 0x0ccc }
            boolean r3 = r3.mo87570B(r7)     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x064a
            com.google.android.gms.measurement.internal.na r3 = r2.f74119b     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.l r3 = r3.f73797c     // Catch:{ all -> 0x0ccc }
            m124012R(r3)     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = r11.mo136870z0()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.d6 r3 = r3.mo87214R(r7)     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x064a
            boolean r3 = r3.mo86962L()     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x064a
            com.google.android.gms.measurement.internal.g5 r3 = r2.f74136a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p r3 = r3.mo87098A()     // Catch:{ all -> 0x0ccc }
            boolean r3 = r3.mo87406s()     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x064a
            com.google.android.gms.measurement.internal.g5 r3 = r2.f74136a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87488q()     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = "Turning off ad personalization due to account type"
            r3.mo87463a(r7)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.p5 r3 = com.google.android.gms.internal.measurement.C42139q5.m170743E()     // Catch:{ all -> 0x0ccc }
            r7 = r19
            r3.mo137213E(r7)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.g5 r2 = r2.f74136a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p r2 = r2.mo87098A()     // Catch:{ all -> 0x0ccc }
            long r8 = r2.mo87402o()     // Catch:{ all -> 0x0ccc }
            r3.mo137214F(r8)     // Catch:{ all -> 0x0ccc }
            r8 = 1
            r3.mo137212D(r8)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.s9 r2 = r3.mo137180s()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.q5 r2 = (com.google.android.gms.internal.measurement.C42139q5) r2     // Catch:{ all -> 0x0ccc }
            r3 = 0
        L_0x062c:
            int r8 = r11.mo136809G0()     // Catch:{ all -> 0x0ccc }
            if (r3 >= r8) goto L_0x0647
            com.google.android.gms.internal.measurement.q5 r8 = r11.mo136869y0(r3)     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = r8.mo137233G()     // Catch:{ all -> 0x0ccc }
            boolean r8 = r7.equals(r8)     // Catch:{ all -> 0x0ccc }
            if (r8 == 0) goto L_0x0644
            r11.mo136866w0(r3, r2)     // Catch:{ all -> 0x0ccc }
            goto L_0x064a
        L_0x0644:
            int r3 = r3 + 1
            goto L_0x062c
        L_0x0647:
            r11.mo136831T0(r2)     // Catch:{ all -> 0x0ccc }
        L_0x064a:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11.mo136861q0(r2)     // Catch:{ all -> 0x0ccc }
            r2 = -9223372036854775808
            r11.mo136826R(r2)     // Catch:{ all -> 0x0ccc }
            r2 = 0
        L_0x0658:
            int r3 = r11.mo136848d0()     // Catch:{ all -> 0x0ccc }
            if (r2 >= r3) goto L_0x068b
            com.google.android.gms.internal.measurement.w4 r3 = r11.mo136815J0(r2)     // Catch:{ all -> 0x0ccc }
            long r7 = r3.mo137398E()     // Catch:{ all -> 0x0ccc }
            long r9 = r11.mo136813I0()     // Catch:{ all -> 0x0ccc }
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0675
            long r7 = r3.mo137398E()     // Catch:{ all -> 0x0ccc }
            r11.mo136861q0(r7)     // Catch:{ all -> 0x0ccc }
        L_0x0675:
            long r7 = r3.mo137398E()     // Catch:{ all -> 0x0ccc }
            long r9 = r11.mo136811H0()     // Catch:{ all -> 0x0ccc }
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0688
            long r7 = r3.mo137398E()     // Catch:{ all -> 0x0ccc }
            r11.mo136826R(r7)     // Catch:{ all -> 0x0ccc }
        L_0x0688:
            int r2 = r2 + 1
            goto L_0x0658
        L_0x068b:
            r11.mo136853g1()     // Catch:{ all -> 0x0ccc }
            r11.mo136835V0()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.b r2 = r1.f73800f     // Catch:{ all -> 0x0ccc }
            m124012R(r2)     // Catch:{ all -> 0x0ccc }
            java.lang.String r20 = r11.mo136870z0()     // Catch:{ all -> 0x0ccc }
            java.util.List r21 = r11.mo136805E0()     // Catch:{ all -> 0x0ccc }
            java.util.List r22 = r11.mo136807F0()     // Catch:{ all -> 0x0ccc }
            long r7 = r11.mo136813I0()     // Catch:{ all -> 0x0ccc }
            java.lang.Long r23 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0ccc }
            long r7 = r11.mo136811H0()     // Catch:{ all -> 0x0ccc }
            java.lang.Long r24 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0ccc }
            r19 = r2
            java.util.List r2 = r19.mo86887m(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0ccc }
            r11.mo136818L0(r2)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.g r2 = r40.mo87358U()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.h5 r3 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r3 = r3.mo136978W1()     // Catch:{ all -> 0x0ccc }
            boolean r2 = r2.mo87074F(r3)     // Catch:{ all -> 0x0ccc }
            if (r2 == 0) goto L_0x0a07
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0ccc }
            r2.<init>()     // Catch:{ all -> 0x0ccc }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0ccc }
            r3.<init>()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.ua r7 = r40.mo87372h0()     // Catch:{ all -> 0x0ccc }
            java.security.SecureRandom r7 = r7.mo87542u()     // Catch:{ all -> 0x0ccc }
            r8 = 0
        L_0x06de:
            int r9 = r11.mo136848d0()     // Catch:{ all -> 0x0ccc }
            if (r8 >= r9) goto L_0x09d1
            com.google.android.gms.internal.measurement.w4 r9 = r11.mo136815J0(r8)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.n9 r9 = r9.mo137278k()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.v4 r9 = (com.google.android.gms.internal.measurement.C42223v4) r9     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = r9.mo137367O()     // Catch:{ all -> 0x0ccc }
            java.lang.String r12 = "_ep"
            boolean r10 = r10.equals(r12)     // Catch:{ all -> 0x0ccc }
            java.lang.String r12 = "_efs"
            java.lang.String r13 = "_sr"
            if (r10 == 0) goto L_0x0780
            com.google.android.gms.measurement.internal.pa r10 = r1.f73801g     // Catch:{ all -> 0x0ccc }
            m124012R(r10)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.s9 r10 = r9.mo137180s()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.w4 r10 = (com.google.android.gms.internal.measurement.C42240w4) r10     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = "_en"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C30846pa.m124119o(r10, r14)     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0ccc }
            java.lang.Object r14 = r2.get(r10)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.r r14 = (com.google.android.gms.measurement.internal.C30859r) r14     // Catch:{ all -> 0x0ccc }
            if (r14 != 0) goto L_0x0735
            com.google.android.gms.measurement.internal.l r14 = r1.f73797c     // Catch:{ all -> 0x0ccc }
            m124012R(r14)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.h5 r15 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r15 = r15.mo136978W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r17 = com.google.android.gms.common.internal.C40843u.m166202l(r10)     // Catch:{ all -> 0x0ccc }
            r5 = r17
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.r r14 = r14.mo87218V(r15, r5)     // Catch:{ all -> 0x0ccc }
            if (r14 == 0) goto L_0x0735
            r2.put(r10, r14)     // Catch:{ all -> 0x0ccc }
        L_0x0735:
            if (r14 == 0) goto L_0x0774
            java.lang.Long r5 = r14.f73893i     // Catch:{ all -> 0x0ccc }
            if (r5 != 0) goto L_0x0774
            java.lang.Long r5 = r14.f73894j     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x0753
            long r5 = r5.longValue()     // Catch:{ all -> 0x0ccc }
            r17 = 1
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 <= 0) goto L_0x0753
            com.google.android.gms.measurement.internal.pa r5 = r1.f73801g     // Catch:{ all -> 0x0ccc }
            m124012R(r5)     // Catch:{ all -> 0x0ccc }
            java.lang.Long r5 = r14.f73894j     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.C30846pa.m124116P(r9, r13, r5)     // Catch:{ all -> 0x0ccc }
        L_0x0753:
            java.lang.Boolean r5 = r14.f73895k     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x076b
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x076b
            com.google.android.gms.measurement.internal.pa r5 = r1.f73801g     // Catch:{ all -> 0x0ccc }
            m124012R(r5)     // Catch:{ all -> 0x0ccc }
            r5 = 1
            java.lang.Long r10 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.C30846pa.m124116P(r9, r12, r10)     // Catch:{ all -> 0x0ccc }
        L_0x076b:
            com.google.android.gms.internal.measurement.s9 r5 = r9.mo137180s()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.w4 r5 = (com.google.android.gms.internal.measurement.C42240w4) r5     // Catch:{ all -> 0x0ccc }
            r3.add(r5)     // Catch:{ all -> 0x0ccc }
        L_0x0774:
            r11.mo136830T(r8, r9)     // Catch:{ all -> 0x0ccc }
        L_0x0777:
            r10 = r3
            r21 = r7
            r5 = r11
            r7 = r2
            r2 = 1
            goto L_0x09c6
        L_0x0780:
            com.google.android.gms.measurement.internal.x4 r5 = r1.f73795a     // Catch:{ all -> 0x0ccc }
            m124012R(r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.h5 r6 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = r6.mo136978W1()     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r10 = r5.mo87050e(r6, r10)     // Catch:{ all -> 0x0ccc }
            boolean r14 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0ccc }
            if (r14 != 0) goto L_0x07b1
            long r5 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x079c }
            goto L_0x07b3
        L_0x079c:
            r0 = move-exception
            r10 = r0
            com.google.android.gms.measurement.internal.g5 r5 = r5.f74136a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r5 = r5.mo87494w()     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = "Unable to parse timezone offset. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r6)     // Catch:{ all -> 0x0ccc }
            r5.mo87465c(r14, r6, r10)     // Catch:{ all -> 0x0ccc }
        L_0x07b1:
            r5 = 0
        L_0x07b3:
            com.google.android.gms.measurement.internal.ua r10 = r40.mo87372h0()     // Catch:{ all -> 0x0ccc }
            long r14 = r9.mo137355B()     // Catch:{ all -> 0x0ccc }
            long r14 = r10.mo87543u0(r14, r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.s9 r10 = r9.mo137180s()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.w4 r10 = (com.google.android.gms.internal.measurement.C42240w4) r10     // Catch:{ all -> 0x0ccc }
            r43 = r12
            r17 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0ccc }
            r17 = r5
            java.lang.String r5 = "_dbg"
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0ccc }
            if (r6 != 0) goto L_0x080b
            java.util.List r6 = r10.mo137401J()     // Catch:{ all -> 0x0ccc }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0ccc }
        L_0x07df:
            boolean r10 = r6.hasNext()     // Catch:{ all -> 0x0ccc }
            if (r10 == 0) goto L_0x080b
            java.lang.Object r10 = r6.next()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.a5 r10 = (com.google.android.gms.internal.measurement.C41855a5) r10     // Catch:{ all -> 0x0ccc }
            r21 = r6
            java.lang.String r6 = r10.mo136514H()     // Catch:{ all -> 0x0ccc }
            boolean r6 = r5.equals(r6)     // Catch:{ all -> 0x0ccc }
            if (r6 == 0) goto L_0x0808
            long r5 = r10.mo136513E()     // Catch:{ all -> 0x0ccc }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ccc }
            boolean r5 = r12.equals(r5)     // Catch:{ all -> 0x0ccc }
            if (r5 != 0) goto L_0x0806
            goto L_0x080b
        L_0x0806:
            r5 = 1
            goto L_0x081e
        L_0x0808:
            r6 = r21
            goto L_0x07df
        L_0x080b:
            com.google.android.gms.measurement.internal.x4 r5 = r1.f73795a     // Catch:{ all -> 0x0ccc }
            m124012R(r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.h5 r6 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = r6.mo136978W1()     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = r9.mo137367O()     // Catch:{ all -> 0x0ccc }
            int r5 = r5.mo87587r(r6, r10)     // Catch:{ all -> 0x0ccc }
        L_0x081e:
            if (r5 > 0) goto L_0x0843
            com.google.android.gms.measurement.internal.u3 r6 = r40.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87494w()     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r9.mo137367O()     // Catch:{ all -> 0x0ccc }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0ccc }
            r6.mo87465c(r10, r12, r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.s9 r5 = r9.mo137180s()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.w4 r5 = (com.google.android.gms.internal.measurement.C42240w4) r5     // Catch:{ all -> 0x0ccc }
            r3.add(r5)     // Catch:{ all -> 0x0ccc }
            r11.mo136830T(r8, r9)     // Catch:{ all -> 0x0ccc }
            goto L_0x0777
        L_0x0843:
            java.lang.String r6 = r9.mo137367O()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r6 = r2.get(r6)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.r r6 = (com.google.android.gms.measurement.internal.C30859r) r6     // Catch:{ all -> 0x0ccc }
            if (r6 != 0) goto L_0x08a3
            com.google.android.gms.measurement.internal.l r6 = r1.f73797c     // Catch:{ all -> 0x0ccc }
            m124012R(r6)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.h5 r10 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = r10.mo136978W1()     // Catch:{ all -> 0x0ccc }
            java.lang.String r12 = r9.mo137367O()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.r r6 = r6.mo87218V(r10, r12)     // Catch:{ all -> 0x0ccc }
            if (r6 != 0) goto L_0x08a3
            com.google.android.gms.measurement.internal.u3 r6 = r40.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87494w()     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.h5 r12 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r12 = r12.mo136978W1()     // Catch:{ all -> 0x0ccc }
            r21 = r14
            java.lang.String r14 = r9.mo137367O()     // Catch:{ all -> 0x0ccc }
            r6.mo87465c(r10, r12, r14)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.r r6 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.h5 r10 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r24 = r10.mo136978W1()     // Catch:{ all -> 0x0ccc }
            java.lang.String r25 = r9.mo137367O()     // Catch:{ all -> 0x0ccc }
            r26 = 1
            r28 = 1
            r30 = 1
            long r32 = r9.mo137355B()     // Catch:{ all -> 0x0ccc }
            r34 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r23 = r6
            r23.<init>(r24, r25, r26, r28, r30, r32, r34, r36, r37, r38, r39)     // Catch:{ all -> 0x0ccc }
            goto L_0x08a5
        L_0x08a3:
            r21 = r14
        L_0x08a5:
            com.google.android.gms.measurement.internal.pa r10 = r1.f73801g     // Catch:{ all -> 0x0ccc }
            m124012R(r10)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.s9 r10 = r9.mo137180s()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.w4 r10 = (com.google.android.gms.internal.measurement.C42240w4) r10     // Catch:{ all -> 0x0ccc }
            java.lang.String r12 = "_eid"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C30846pa.m124119o(r10, r12)     // Catch:{ all -> 0x0ccc }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0ccc }
            if (r10 == 0) goto L_0x08bc
            r12 = 1
            goto L_0x08bd
        L_0x08bc:
            r12 = 0
        L_0x08bd:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0ccc }
            r14 = 1
            if (r5 != r14) goto L_0x08f0
            com.google.android.gms.internal.measurement.s9 r5 = r9.mo137180s()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.w4 r5 = (com.google.android.gms.internal.measurement.C42240w4) r5     // Catch:{ all -> 0x0ccc }
            r3.add(r5)     // Catch:{ all -> 0x0ccc }
            boolean r5 = r12.booleanValue()     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x08eb
            java.lang.Long r5 = r6.f73893i     // Catch:{ all -> 0x0ccc }
            if (r5 != 0) goto L_0x08df
            java.lang.Long r5 = r6.f73894j     // Catch:{ all -> 0x0ccc }
            if (r5 != 0) goto L_0x08df
            java.lang.Boolean r5 = r6.f73895k     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x08eb
        L_0x08df:
            r5 = 0
            com.google.android.gms.measurement.internal.r r6 = r6.mo87451a(r5, r5, r5)     // Catch:{ all -> 0x0ccc }
            java.lang.String r5 = r9.mo137367O()     // Catch:{ all -> 0x0ccc }
            r2.put(r5, r6)     // Catch:{ all -> 0x0ccc }
        L_0x08eb:
            r11.mo136830T(r8, r9)     // Catch:{ all -> 0x0ccc }
            goto L_0x0777
        L_0x08f0:
            int r14 = r7.nextInt(r5)     // Catch:{ all -> 0x0ccc }
            if (r14 != 0) goto L_0x0931
            com.google.android.gms.measurement.internal.pa r10 = r1.f73801g     // Catch:{ all -> 0x0ccc }
            m124012R(r10)     // Catch:{ all -> 0x0ccc }
            long r14 = (long) r5     // Catch:{ all -> 0x0ccc }
            java.lang.Long r5 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.C30846pa.m124116P(r9, r13, r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.s9 r10 = r9.mo137180s()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.w4 r10 = (com.google.android.gms.internal.measurement.C42240w4) r10     // Catch:{ all -> 0x0ccc }
            r3.add(r10)     // Catch:{ all -> 0x0ccc }
            boolean r10 = r12.booleanValue()     // Catch:{ all -> 0x0ccc }
            if (r10 == 0) goto L_0x0917
            r10 = 0
            com.google.android.gms.measurement.internal.r r6 = r6.mo87451a(r10, r5, r10)     // Catch:{ all -> 0x0ccc }
        L_0x0917:
            java.lang.String r5 = r9.mo137367O()     // Catch:{ all -> 0x0ccc }
            long r12 = r9.mo137355B()     // Catch:{ all -> 0x0ccc }
            r14 = r21
            com.google.android.gms.measurement.internal.r r6 = r6.mo87452b(r12, r14)     // Catch:{ all -> 0x0ccc }
            r2.put(r5, r6)     // Catch:{ all -> 0x0ccc }
            r10 = r3
            r21 = r7
            r5 = r11
            r7 = r2
            r2 = 1
            goto L_0x09c3
        L_0x0931:
            r14 = r21
            r21 = r7
            java.lang.Long r7 = r6.f73892h     // Catch:{ all -> 0x0ccc }
            if (r7 == 0) goto L_0x0946
            long r17 = r7.longValue()     // Catch:{ all -> 0x0ccc }
            r24 = r2
            r25 = r3
            r23 = r10
            r22 = r11
            goto L_0x095c
        L_0x0946:
            com.google.android.gms.measurement.internal.ua r7 = r40.mo87372h0()     // Catch:{ all -> 0x0ccc }
            r23 = r10
            r22 = r11
            long r10 = r9.mo137354A()     // Catch:{ all -> 0x0ccc }
            r24 = r2
            r25 = r3
            r2 = r17
            long r17 = r7.mo87543u0(r10, r2)     // Catch:{ all -> 0x0ccc }
        L_0x095c:
            int r2 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x09a7
            com.google.android.gms.measurement.internal.pa r2 = r1.f73801g     // Catch:{ all -> 0x0ccc }
            m124012R(r2)     // Catch:{ all -> 0x0ccc }
            r2 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0ccc }
            r10 = r43
            com.google.android.gms.measurement.internal.C30846pa.m124116P(r9, r10, r7)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.pa r7 = r1.f73801g     // Catch:{ all -> 0x0ccc }
            m124012R(r7)     // Catch:{ all -> 0x0ccc }
            long r10 = (long) r5     // Catch:{ all -> 0x0ccc }
            java.lang.Long r5 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.C30846pa.m124116P(r9, r13, r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.s9 r7 = r9.mo137180s()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.w4 r7 = (com.google.android.gms.internal.measurement.C42240w4) r7     // Catch:{ all -> 0x0ccc }
            r10 = r25
            r10.add(r7)     // Catch:{ all -> 0x0ccc }
            boolean r7 = r12.booleanValue()     // Catch:{ all -> 0x0ccc }
            if (r7 == 0) goto L_0x0995
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0ccc }
            r11 = 0
            com.google.android.gms.measurement.internal.r r6 = r6.mo87451a(r11, r5, r7)     // Catch:{ all -> 0x0ccc }
        L_0x0995:
            java.lang.String r5 = r9.mo137367O()     // Catch:{ all -> 0x0ccc }
            long r11 = r9.mo137355B()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.r r6 = r6.mo87452b(r11, r14)     // Catch:{ all -> 0x0ccc }
            r7 = r24
            r7.put(r5, r6)     // Catch:{ all -> 0x0ccc }
            goto L_0x09c1
        L_0x09a7:
            r7 = r24
            r10 = r25
            r2 = 1
            boolean r5 = r12.booleanValue()     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x09c1
            java.lang.String r5 = r9.mo137367O()     // Catch:{ all -> 0x0ccc }
            r11 = r23
            r12 = 0
            com.google.android.gms.measurement.internal.r r6 = r6.mo87451a(r11, r12, r12)     // Catch:{ all -> 0x0ccc }
            r7.put(r5, r6)     // Catch:{ all -> 0x0ccc }
        L_0x09c1:
            r5 = r22
        L_0x09c3:
            r5.mo136830T(r8, r9)     // Catch:{ all -> 0x0ccc }
        L_0x09c6:
            int r8 = r8 + 1
            r11 = r5
            r2 = r7
            r3 = r10
            r7 = r21
            r5 = 0
            goto L_0x06de
        L_0x09d1:
            r7 = r2
            r10 = r3
            r5 = r11
            int r2 = r10.size()     // Catch:{ all -> 0x0ccc }
            int r3 = r5.mo136848d0()     // Catch:{ all -> 0x0ccc }
            if (r2 >= r3) goto L_0x09e4
            r5.mo136839Y0()     // Catch:{ all -> 0x0ccc }
            r5.mo136819M0(r10)     // Catch:{ all -> 0x0ccc }
        L_0x09e4:
            java.util.Set r2 = r7.entrySet()     // Catch:{ all -> 0x0ccc }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0ccc }
        L_0x09ec:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x0a08
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0ccc }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.l r6 = r1.f73797c     // Catch:{ all -> 0x0ccc }
            m124012R(r6)     // Catch:{ all -> 0x0ccc }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.r r3 = (com.google.android.gms.measurement.internal.C30859r) r3     // Catch:{ all -> 0x0ccc }
            r6.mo87234q(r3)     // Catch:{ all -> 0x0ccc }
            goto L_0x09ec
        L_0x0a07:
            r5 = r11
        L_0x0a08:
            com.google.android.gms.internal.measurement.h5 r2 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r2 = r2.mo136978W1()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.l r3 = r1.f73797c     // Catch:{ all -> 0x0ccc }
            m124012R(r3)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.d6 r3 = r3.mo87214R(r2)     // Catch:{ all -> 0x0ccc }
            if (r3 != 0) goto L_0x0a31
            com.google.android.gms.measurement.internal.u3 r3 = r40.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87489r()     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.h5 r7 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = r7.mo136978W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r7)     // Catch:{ all -> 0x0ccc }
            r3.mo87464b(r6, r7)     // Catch:{ all -> 0x0ccc }
            goto L_0x0a8d
        L_0x0a31:
            int r6 = r5.mo136848d0()     // Catch:{ all -> 0x0ccc }
            if (r6 <= 0) goto L_0x0a8d
            long r6 = r3.mo86980b0()     // Catch:{ all -> 0x0ccc }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0a45
            r5.mo136854h0(r6)     // Catch:{ all -> 0x0ccc }
            goto L_0x0a48
        L_0x0a45:
            r5.mo136847c1()     // Catch:{ all -> 0x0ccc }
        L_0x0a48:
            long r8 = r3.mo86984d0()     // Catch:{ all -> 0x0ccc }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0a53
            goto L_0x0a54
        L_0x0a53:
            r6 = r8
        L_0x0a54:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0a5c
            r5.mo136855i0(r6)     // Catch:{ all -> 0x0ccc }
            goto L_0x0a5f
        L_0x0a5c:
            r5.mo136849d1()     // Catch:{ all -> 0x0ccc }
        L_0x0a5f:
            r3.mo86987f()     // Catch:{ all -> 0x0ccc }
            long r6 = r3.mo86982c0()     // Catch:{ all -> 0x0ccc }
            int r6 = (int) r6     // Catch:{ all -> 0x0ccc }
            r5.mo136810H(r6)     // Catch:{ all -> 0x0ccc }
            long r6 = r5.mo136813I0()     // Catch:{ all -> 0x0ccc }
            r3.mo86954D(r6)     // Catch:{ all -> 0x0ccc }
            long r6 = r5.mo136811H0()     // Catch:{ all -> 0x0ccc }
            r3.mo86952B(r6)     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = r3.mo86992h0()     // Catch:{ all -> 0x0ccc }
            if (r6 == 0) goto L_0x0a82
            r5.mo136840Z(r6)     // Catch:{ all -> 0x0ccc }
            goto L_0x0a85
        L_0x0a82:
            r5.mo136841Z0()     // Catch:{ all -> 0x0ccc }
        L_0x0a85:
            com.google.android.gms.measurement.internal.l r6 = r1.f73797c     // Catch:{ all -> 0x0ccc }
            m124012R(r6)     // Catch:{ all -> 0x0ccc }
            r6.mo87233p(r3)     // Catch:{ all -> 0x0ccc }
        L_0x0a8d:
            int r3 = r5.mo136848d0()     // Catch:{ all -> 0x0ccc }
            if (r3 <= 0) goto L_0x0c11
            com.google.android.gms.measurement.internal.g5 r3 = r1.f73806l     // Catch:{ all -> 0x0ccc }
            r3.mo86901b()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.x4 r3 = r1.f73795a     // Catch:{ all -> 0x0ccc }
            m124012R(r3)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.h5 r6 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = r6.mo136978W1()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.i4 r3 = r3.mo87588t(r6)     // Catch:{ all -> 0x0ccc }
            r6 = -1
            if (r3 == 0) goto L_0x0aba
            boolean r8 = r3.mo137029U()     // Catch:{ all -> 0x0ccc }
            if (r8 != 0) goto L_0x0ab2
            goto L_0x0aba
        L_0x0ab2:
            long r8 = r3.mo137017D()     // Catch:{ all -> 0x0ccc }
            r5.mo136814J(r8)     // Catch:{ all -> 0x0ccc }
            goto L_0x0ae1
        L_0x0aba:
            com.google.android.gms.internal.measurement.h5 r3 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r3 = r3.mo136956H()     // Catch:{ all -> 0x0ccc }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x0aca
            r5.mo136814J(r6)     // Catch:{ all -> 0x0ccc }
            goto L_0x0ae1
        L_0x0aca:
            com.google.android.gms.measurement.internal.u3 r3 = r40.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87494w()     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.h5 r9 = r4.f73687a     // Catch:{ all -> 0x0ccc }
            java.lang.String r9 = r9.mo136978W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r9)     // Catch:{ all -> 0x0ccc }
            r3.mo87464b(r8, r9)     // Catch:{ all -> 0x0ccc }
        L_0x0ae1:
            com.google.android.gms.measurement.internal.l r3 = r1.f73797c     // Catch:{ all -> 0x0ccc }
            m124012R(r3)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.s9 r5 = r5.mo137180s()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.h5 r5 = (com.google.android.gms.internal.measurement.C41981h5) r5     // Catch:{ all -> 0x0ccc }
            r3.mo86866h()     // Catch:{ all -> 0x0ccc }
            r3.mo87627i()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.common.internal.C40843u.m166202l(r5)     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = r5.mo136978W1()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.common.internal.C40843u.m166198h(r8)     // Catch:{ all -> 0x0ccc }
            boolean r8 = r5.mo136990m1()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.common.internal.C40843u.m166208r(r8)     // Catch:{ all -> 0x0ccc }
            r3.mo87229h0()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.g5 r8 = r3.f74136a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.common.util.g r8 = r8.mo86900a()     // Catch:{ all -> 0x0ccc }
            long r8 = r8.mo134768a()     // Catch:{ all -> 0x0ccc }
            long r10 = r5.mo136959I1()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.g5 r12 = r3.f74136a     // Catch:{ all -> 0x0ccc }
            r12.mo87130z()     // Catch:{ all -> 0x0ccc }
            long r12 = com.google.android.gms.measurement.internal.C30725g.m123710i()     // Catch:{ all -> 0x0ccc }
            long r12 = r8 - r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x0b35
            long r10 = r5.mo136959I1()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.g5 r12 = r3.f74136a     // Catch:{ all -> 0x0ccc }
            r12.mo87130z()     // Catch:{ all -> 0x0ccc }
            long r12 = com.google.android.gms.measurement.internal.C30725g.m123710i()     // Catch:{ all -> 0x0ccc }
            long r12 = r12 + r8
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0b58
        L_0x0b35:
            com.google.android.gms.measurement.internal.g5 r10 = r3.f74136a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.u3 r10 = r10.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r10 = r10.mo87494w()     // Catch:{ all -> 0x0ccc }
            java.lang.String r11 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r12 = r5.mo136978W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r12)     // Catch:{ all -> 0x0ccc }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0ccc }
            long r13 = r5.mo136959I1()     // Catch:{ all -> 0x0ccc }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0ccc }
            r10.mo87466d(r11, r12, r8, r9)     // Catch:{ all -> 0x0ccc }
        L_0x0b58:
            byte[] r8 = r5.mo136762g()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.na r9 = r3.f74119b     // Catch:{ IOException -> 0x0bf8 }
            com.google.android.gms.measurement.internal.pa r9 = r9.f73801g     // Catch:{ IOException -> 0x0bf8 }
            m124012R(r9)     // Catch:{ IOException -> 0x0bf8 }
            byte[] r8 = r9.mo87428O(r8)     // Catch:{ IOException -> 0x0bf8 }
            com.google.android.gms.measurement.internal.g5 r9 = r3.f74136a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.u3 r9 = r9.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r9 = r9.mo87493v()     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = "Saving bundle, size"
            int r11 = r8.length     // Catch:{ all -> 0x0ccc }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0ccc }
            r9.mo87464b(r10, r11)     // Catch:{ all -> 0x0ccc }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0ccc }
            r9.<init>()     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = "app_id"
            java.lang.String r11 = r5.mo136978W1()     // Catch:{ all -> 0x0ccc }
            r9.put(r10, r11)     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = "bundle_end_timestamp"
            long r11 = r5.mo136959I1()     // Catch:{ all -> 0x0ccc }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0ccc }
            r9.put(r10, r11)     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = "data"
            r9.put(r10, r8)     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = "has_realtime"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0ccc }
            r9.put(r8, r10)     // Catch:{ all -> 0x0ccc }
            boolean r8 = r5.mo136996s1()     // Catch:{ all -> 0x0ccc }
            if (r8 == 0) goto L_0x0bb7
            java.lang.String r8 = "retry_count"
            int r10 = r5.mo136947C1()     // Catch:{ all -> 0x0ccc }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0ccc }
            r9.put(r8, r10)     // Catch:{ all -> 0x0ccc }
        L_0x0bb7:
            android.database.sqlite.SQLiteDatabase r8 = r3.mo87212P()     // Catch:{ SQLiteException -> 0x0bde }
            java.lang.String r10 = "queue"
            r11 = 0
            long r8 = r8.insert(r10, r11, r9)     // Catch:{ SQLiteException -> 0x0bde }
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0c11
            com.google.android.gms.measurement.internal.g5 r6 = r3.f74136a     // Catch:{ SQLiteException -> 0x0bde }
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo86903d()     // Catch:{ SQLiteException -> 0x0bde }
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87489r()     // Catch:{ SQLiteException -> 0x0bde }
            java.lang.String r7 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r5.mo136978W1()     // Catch:{ SQLiteException -> 0x0bde }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r8)     // Catch:{ SQLiteException -> 0x0bde }
            r6.mo87464b(r7, r8)     // Catch:{ SQLiteException -> 0x0bde }
            goto L_0x0c11
        L_0x0bde:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.g5 r3 = r3.f74136a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87489r()     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = "Error storing bundle. appId"
            java.lang.String r5 = r5.mo136978W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r5)     // Catch:{ all -> 0x0ccc }
            r3.mo87465c(r7, r5, r6)     // Catch:{ all -> 0x0ccc }
            goto L_0x0c11
        L_0x0bf8:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.g5 r3 = r3.f74136a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87489r()     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r5 = r5.mo136978W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r5)     // Catch:{ all -> 0x0ccc }
            r3.mo87465c(r7, r5, r6)     // Catch:{ all -> 0x0ccc }
        L_0x0c11:
            com.google.android.gms.measurement.internal.l r3 = r1.f73797c     // Catch:{ all -> 0x0ccc }
            m124012R(r3)     // Catch:{ all -> 0x0ccc }
            java.util.List r4 = r4.f73688b     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.common.internal.C40843u.m166202l(r4)     // Catch:{ all -> 0x0ccc }
            r3.mo86866h()     // Catch:{ all -> 0x0ccc }
            r3.mo87627i()     // Catch:{ all -> 0x0ccc }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0ccc }
            r6 = 0
        L_0x0c29:
            int r7 = r4.size()     // Catch:{ all -> 0x0ccc }
            if (r6 >= r7) goto L_0x0c46
            if (r6 == 0) goto L_0x0c36
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0ccc }
        L_0x0c36:
            java.lang.Object r7 = r4.get(r6)     // Catch:{ all -> 0x0ccc }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0ccc }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0ccc }
            r5.append(r7)     // Catch:{ all -> 0x0ccc }
            int r6 = r6 + 1
            goto L_0x0c29
        L_0x0c46:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0ccc }
            android.database.sqlite.SQLiteDatabase r6 = r3.mo87212P()     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0ccc }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0ccc }
            int r6 = r4.size()     // Catch:{ all -> 0x0ccc }
            if (r5 == r6) goto L_0x0c7b
            com.google.android.gms.measurement.internal.g5 r3 = r3.f74136a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87489r()     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0ccc }
            int r4 = r4.size()     // Catch:{ all -> 0x0ccc }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0ccc }
            r3.mo87465c(r6, r5, r4)     // Catch:{ all -> 0x0ccc }
        L_0x0c7b:
            com.google.android.gms.measurement.internal.l r3 = r1.f73797c     // Catch:{ all -> 0x0ccc }
            m124012R(r3)     // Catch:{ all -> 0x0ccc }
            android.database.sqlite.SQLiteDatabase r4 = r3.mo87212P()     // Catch:{ all -> 0x0ccc }
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0c93 }
            r7 = 0
            r6[r7] = r2     // Catch:{ SQLiteException -> 0x0c93 }
            r7 = 1
            r6[r7] = r2     // Catch:{ SQLiteException -> 0x0c93 }
            r4.execSQL(r5, r6)     // Catch:{ SQLiteException -> 0x0c93 }
            goto L_0x0ca8
        L_0x0c93:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.g5 r3 = r3.f74136a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo86903d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87489r()     // Catch:{ all -> 0x0ccc }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r2)     // Catch:{ all -> 0x0ccc }
            r3.mo87465c(r5, r2, r4)     // Catch:{ all -> 0x0ccc }
        L_0x0ca8:
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c     // Catch:{ all -> 0x0ccc }
            m124012R(r2)     // Catch:{ all -> 0x0ccc }
            r2.mo87232o()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c
            m124012R(r2)
            r2.mo87227f0()
            r2 = 1
            return r2
        L_0x0cba:
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c     // Catch:{ all -> 0x0ccc }
            m124012R(r2)     // Catch:{ all -> 0x0ccc }
            r2.mo87232o()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c
            m124012R(r2)
            r2.mo87227f0()
            r2 = 0
            return r2
        L_0x0ccc:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.l r3 = r1.f73797c
            m124012R(r3)
            r3.mo87227f0()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30822na.mo87353N(java.lang.String, long):boolean");
    }

    /* renamed from: O */
    public final boolean mo87354O() {
        mo86904f().mo86866h();
        mo87369g();
        C30787l lVar = this.f73797c;
        m124012R(lVar);
        if (lVar.mo87235r()) {
            return true;
        }
        C30787l lVar2 = this.f73797c;
        m124012R(lVar2);
        if (!TextUtils.isEmpty(lVar2.mo87221Z())) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public final boolean mo87355P(C42223v4 v4Var, C42223v4 v4Var2) {
        String str;
        C40843u.m166191a("_e".equals(v4Var.mo137367O()));
        m124012R(this.f73801g);
        C41855a5 n = C30846pa.m124118n((C42240w4) v4Var.mo137180s(), "_sc");
        String str2 = null;
        if (n == null) {
            str = null;
        } else {
            str = n.mo136515I();
        }
        m124012R(this.f73801g);
        C41855a5 n2 = C30846pa.m124118n((C42240w4) v4Var2.mo137180s(), "_pc");
        if (n2 != null) {
            str2 = n2.mo136515I();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        C40843u.m166191a("_e".equals(v4Var.mo137367O()));
        m124012R(this.f73801g);
        C41855a5 n3 = C30846pa.m124118n((C42240w4) v4Var.mo137180s(), "_et");
        if (n3 == null || !n3.mo136519W() || n3.mo136513E() <= 0) {
            return true;
        }
        long E = n3.mo136513E();
        m124012R(this.f73801g);
        C41855a5 n4 = C30846pa.m124118n((C42240w4) v4Var2.mo137180s(), "_et");
        if (n4 != null && n4.mo136513E() > 0) {
            E += n4.mo136513E();
        }
        m124012R(this.f73801g);
        C30846pa.m124116P(v4Var2, "_et", Long.valueOf(E));
        m124012R(this.f73801g);
        C30846pa.m124116P(v4Var, "_fr", 1L);
        return true;
    }

    @C0348i1
    /* renamed from: S */
    public final C30693d6 mo87356S(zzq zzq) {
        String str;
        mo86904f().mo86866h();
        mo87369g();
        C40843u.m166202l(zzq);
        C40843u.m166198h(zzq.f74188a);
        if (!zzq.f74181L0.isEmpty()) {
            this.f73791B.put(zzq.f74188a, new C30810ma(this, zzq.f74181L0));
        }
        C30787l lVar = this.f73797c;
        m124012R(lVar);
        C30693d6 R = lVar.mo87214R(zzq.f74188a);
        C30738h c = mo87359V(zzq.f74188a).mo87135c(C30738h.m123795b(zzq.f74180K0));
        zzah zzah = zzah.AD_STORAGE;
        if (c.mo87142i(zzah)) {
            str = this.f73803i.mo87063o(zzq.f74188a, zzq.f74187Z);
        } else {
            str = "";
        }
        if (R == null) {
            R = new C30693d6(this.f73806l, zzq.f74188a);
            if (c.mo87142i(zzah.ANALYTICS_STORAGE)) {
                R.mo86993i(mo87374i0(c));
            }
            if (c.mo87142i(zzah)) {
                R.mo86957G(str);
            }
        } else if (c.mo87142i(zzah) && str != null && !str.equals(R.mo86979b())) {
            R.mo86957G(str);
            if (zzq.f74187Z && !"00000000-0000-0000-0000-000000000000".equals(this.f73803i.mo87062n(zzq.f74188a, c).first)) {
                R.mo86993i(mo87374i0(c));
                C30787l lVar2 = this.f73797c;
                m124012R(lVar2);
                if (lVar2.mo87219X(zzq.f74188a, "_id") != null) {
                    C30787l lVar3 = this.f73797c;
                    m124012R(lVar3);
                    if (lVar3.mo87219X(zzq.f74188a, "_lair") == null) {
                        C30870ra raVar = new C30870ra(zzq.f74188a, "auto", "_lair", mo86900a().mo134768a(), 1L);
                        C30787l lVar4 = this.f73797c;
                        m124012R(lVar4);
                        lVar4.mo87241x(raVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(R.mo86996j0()) && c.mo87142i(zzah.ANALYTICS_STORAGE)) {
            R.mo86993i(mo87374i0(c));
        }
        R.mo87014x(zzq.f74189b);
        R.mo86989g(zzq.f74175F0);
        if (!TextUtils.isEmpty(zzq.f74198y)) {
            R.mo87013w(zzq.f74198y);
        }
        long j = zzq.f74192e;
        if (j != 0) {
            R.mo87015y(j);
        }
        if (!TextUtils.isEmpty(zzq.f74190c)) {
            R.mo86997k(zzq.f74190c);
        }
        R.mo86999l(zzq.f74197x);
        String str2 = zzq.f74191d;
        if (str2 != null) {
            R.mo86995j(str2);
        }
        R.mo87010t(zzq.f74193f);
        R.mo86955E(zzq.f74195v);
        if (!TextUtils.isEmpty(zzq.f74194g)) {
            R.mo87016z(zzq.f74194g);
        }
        R.mo86991h(zzq.f74187Z);
        R.mo86956F(zzq.f74176G0);
        R.mo87011u(zzq.f74177H0);
        C41955ff.m169896b();
        if (mo87358U().mo87070B((String) null, C30742h3.f73550o0) || mo87358U().mo87070B(zzq.f74188a, C30742h3.f73554q0)) {
            R.mo86959I(zzq.f74182M0);
        }
        C41881bd.m169717b();
        if (mo87358U().mo87070B((String) null, C30742h3.f73548n0)) {
            R.mo86958H(zzq.f74178I0);
        } else {
            C41881bd.m169717b();
            if (mo87358U().mo87070B((String) null, C30742h3.f73546m0)) {
                R.mo86958H((List) null);
            }
        }
        C42132pf.m170727b();
        if (mo87358U().mo87070B((String) null, C30742h3.f73558s0)) {
            R.mo86960J(zzq.f74183N0);
        }
        C42026je.m170421b();
        if (mo87358U().mo87070B((String) null, C30742h3.f73499G0)) {
            R.mo86961K(zzq.f74184O0);
        }
        if (R.mo86964N()) {
            C30787l lVar5 = this.f73797c;
            m124012R(lVar5);
            lVar5.mo87233p(R);
        }
        return R;
    }

    /* renamed from: T */
    public final C30660b mo87357T() {
        C30660b bVar = this.f73800f;
        m124012R(bVar);
        return bVar;
    }

    /* renamed from: U */
    public final C30725g mo87358U() {
        return ((C30731g5) C40843u.m166202l(this.f73806l)).mo87130z();
    }

    @C0348i1
    /* renamed from: V */
    public final C30738h mo87359V(String str) {
        String str2;
        C30738h hVar = C30738h.f73481b;
        mo86904f().mo86866h();
        mo87369g();
        C30738h hVar2 = (C30738h) this.f73790A.get(str);
        if (hVar2 != null) {
            return hVar2;
        }
        C30787l lVar = this.f73797c;
        m124012R(lVar);
        C40843u.m166202l(str);
        lVar.mo86866h();
        lVar.mo87627i();
        Cursor cursor = null;
        try {
            Cursor rawQuery = lVar.mo87212P().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                rawQuery.close();
            } else {
                rawQuery.close();
                str2 = "G1";
            }
            C30738h b = C30738h.m123795b(str2);
            mo87342A(str, b);
            return b;
        } catch (SQLiteException e) {
            lVar.f74136a.mo86903d().mo87489r().mo87465c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: W */
    public final C30787l mo87360W() {
        C30787l lVar = this.f73797c;
        m124012R(lVar);
        return lVar;
    }

    /* renamed from: X */
    public final C30839p3 mo87361X() {
        return this.f73806l.mo87101D();
    }

    /* renamed from: Y */
    public final C30652a4 mo87362Y() {
        C30652a4 a4Var = this.f73796b;
        m124012R(a4Var);
        return a4Var;
    }

    /* renamed from: Z */
    public final C30691d4 mo87363Z() {
        C30691d4 d4Var = this.f73798d;
        if (d4Var != null) {
            return d4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: a */
    public final C40979g mo86900a() {
        return ((C30731g5) C40843u.m166202l(this.f73806l)).mo86900a();
    }

    /* renamed from: a0 */
    public final C30936x4 mo87364a0() {
        C30936x4 x4Var = this.f73795a;
        m124012R(x4Var);
        return x4Var;
    }

    /* renamed from: b */
    public final C30673c mo86901b() {
        throw null;
    }

    /* renamed from: c */
    public final Context mo86902c() {
        return this.f73806l.mo86902c();
    }

    /* renamed from: c0 */
    public final C30731g5 mo87365c0() {
        return this.f73806l;
    }

    /* renamed from: d */
    public final C30899u3 mo86903d() {
        return ((C30731g5) C40843u.m166202l(this.f73806l)).mo86903d();
    }

    /* renamed from: d0 */
    public final C30879s7 mo87366d0() {
        C30879s7 s7Var = this.f73802h;
        m124012R(s7Var);
        return s7Var;
    }

    @C0348i1
    @C40974d0
    /* renamed from: e */
    public final void mo87367e() {
        mo86904f().mo86866h();
        mo87369g();
        if (!this.f73808n) {
            this.f73808n = true;
            if (mo87346E()) {
                FileChannel fileChannel = this.f73817w;
                mo86904f().mo86866h();
                int i = 0;
                if (fileChannel == null || !fileChannel.isOpen()) {
                    mo86903d().mo87489r().mo87463a("Bad channel to read from");
                } else {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0);
                        int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            i = allocate.getInt();
                        } else if (read != -1) {
                            mo86903d().mo87494w().mo87464b("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                    } catch (IOException e) {
                        mo86903d().mo87489r().mo87464b("Failed to read from channel", e);
                    }
                }
                int p = this.f73806l.mo87099B().mo87243p();
                mo86904f().mo86866h();
                if (i > p) {
                    mo86903d().mo87489r().mo87465c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(p));
                } else if (i < p) {
                    FileChannel fileChannel2 = this.f73817w;
                    mo86904f().mo86866h();
                    if (fileChannel2 == null || !fileChannel2.isOpen()) {
                        mo86903d().mo87489r().mo87463a("Bad channel to read from");
                    } else {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(p);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0);
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                mo86903d().mo87489r().mo87464b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            mo86903d().mo87493v().mo87465c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(p));
                            return;
                        } catch (IOException e2) {
                            mo86903d().mo87489r().mo87464b("Failed to write to channel", e2);
                        }
                    }
                    mo86903d().mo87489r().mo87465c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(p));
                }
            }
        }
    }

    /* renamed from: e0 */
    public final C30722f9 mo87368e0() {
        return this.f73803i;
    }

    /* renamed from: f */
    public final C30692d5 mo86904f() {
        return ((C30731g5) C40843u.m166202l(this.f73806l)).mo86904f();
    }

    /* renamed from: g */
    public final void mo87369g() {
        if (!this.f73807m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: g0 */
    public final C30846pa mo87370g0() {
        C30846pa paVar = this.f73801g;
        m124012R(paVar);
        return paVar;
    }

    /* renamed from: h */
    public final void mo87371h(String str, C41963g5 g5Var) {
        int w;
        int indexOf;
        C30936x4 x4Var = this.f73795a;
        m124012R(x4Var);
        Set y = x4Var.mo87592y(str);
        if (y != null) {
            g5Var.mo136824P0(y);
        }
        C30936x4 x4Var2 = this.f73795a;
        m124012R(x4Var2);
        if (x4Var2.mo87578J(str)) {
            g5Var.mo136836W0();
        }
        C30936x4 x4Var3 = this.f73795a;
        m124012R(x4Var3);
        if (x4Var3.mo87581M(str)) {
            if (mo87358U().mo87070B(str, C30742h3.f73560t0)) {
                String D0 = g5Var.mo136803D0();
                if (!TextUtils.isEmpty(D0) && (indexOf = D0.indexOf(".")) != -1) {
                    g5Var.mo136844b0(D0.substring(0, indexOf));
                }
            } else {
                g5Var.mo136845b1();
            }
        }
        C30936x4 x4Var4 = this.f73795a;
        m124012R(x4Var4);
        if (x4Var4.mo87582N(str) && (w = C30846pa.m124125w(g5Var, "_id")) != -1) {
            g5Var.mo136798A(w);
        }
        C30936x4 x4Var5 = this.f73795a;
        m124012R(x4Var5);
        if (x4Var5.mo87580L(str)) {
            g5Var.mo136837X0();
        }
        C30936x4 x4Var6 = this.f73795a;
        m124012R(x4Var6);
        if (x4Var6.mo87577I(str)) {
            g5Var.mo136833U0();
            C30810ma maVar = (C30810ma) this.f73791B.get(str);
            if (maVar == null || maVar.f73757b + mo87358U().mo87085r(str, C30742h3.f73516V) < mo86900a().mo134770c()) {
                maVar = new C30810ma(this);
                this.f73791B.put(str, maVar);
            }
            g5Var.mo136828S(maVar.f73756a);
        }
        C30936x4 x4Var7 = this.f73795a;
        m124012R(x4Var7);
        if (x4Var7.mo87579K(str)) {
            g5Var.mo136851f1();
        }
    }

    /* renamed from: h0 */
    public final C30906ua mo87372h0() {
        return ((C30731g5) C40843u.m166202l(this.f73806l)).mo87110N();
    }

    @C0348i1
    /* renamed from: i */
    public final void mo87373i(C30693d6 d6Var) {
        mo86904f().mo86866h();
        if (!TextUtils.isEmpty(d6Var.mo87004n0()) || !TextUtils.isEmpty(d6Var.mo86990g0())) {
            C30671ba baVar = this.f73804j;
            Uri.Builder builder = new Uri.Builder();
            String n0 = d6Var.mo87004n0();
            if (TextUtils.isEmpty(n0)) {
                n0 = d6Var.mo86990g0();
            }
            C1866a aVar = null;
            Uri.Builder appendQueryParameter = builder.scheme((String) C30742h3.f73533g.mo87094a((Object) null)).encodedAuthority((String) C30742h3.f73535h.mo87094a((Object) null)).path("config/app/".concat(String.valueOf(n0))).appendQueryParameter("platform", "android");
            baVar.f74136a.mo87130z().mo87084q();
            appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(76003)).appendQueryParameter("runtime_version", "0");
            String uri = builder.build().toString();
            try {
                String str = (String) C40843u.m166202l(d6Var.mo86994i0());
                URL url = new URL(uri);
                mo86903d().mo87493v().mo87464b("Fetching remote configuration", str);
                C30936x4 x4Var = this.f73795a;
                m124012R(x4Var);
                C41998i4 t = x4Var.mo87588t(str);
                C30936x4 x4Var2 = this.f73795a;
                m124012R(x4Var2);
                String v = x4Var2.mo87590v(str);
                if (t != null) {
                    if (!TextUtils.isEmpty(v)) {
                        C1866a aVar2 = new C1866a();
                        aVar2.put("If-Modified-Since", v);
                        aVar = aVar2;
                    }
                    C30936x4 x4Var3 = this.f73795a;
                    m124012R(x4Var3);
                    String u = x4Var3.mo87589u(str);
                    if (!TextUtils.isEmpty(u)) {
                        if (aVar == null) {
                            aVar = new C1866a();
                        }
                        aVar.put(ConfigFetchHttpClient.f81526j, u);
                    }
                }
                this.f73813s = true;
                C30652a4 a4Var = this.f73796b;
                m124012R(a4Var);
                C30710ea eaVar = new C30710ea(this);
                a4Var.mo86866h();
                a4Var.mo87627i();
                C40843u.m166202l(url);
                C40843u.m166202l(eaVar);
                a4Var.f74136a.mo86904f().mo86949y(new C30959z3(a4Var, str, url, (byte[]) null, aVar, eaVar));
            } catch (MalformedURLException unused) {
                mo86903d().mo87489r().mo87465c("Failed to parse config URL. Not fetching. appId", C30899u3.m124186z(d6Var.mo86994i0()), uri);
            }
        } else {
            mo87381n((String) C40843u.m166202l(d6Var.mo86994i0()), 204, (Throwable) null, (byte[]) null, (Map) null);
        }
    }

    @C0348i1
    /* renamed from: i0 */
    public final String mo87374i0(C30738h hVar) {
        if (!hVar.mo87142i(zzah.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        mo87372h0().mo87542u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    @C0348i1
    /* renamed from: j */
    public final void mo87375j(zzaw zzaw, zzq zzq) {
        zzaw zzaw2;
        List<zzac> list;
        List<zzac> list2;
        List<zzac> list3;
        String str;
        zzq zzq2 = zzq;
        C40843u.m166202l(zzq);
        C40843u.m166198h(zzq2.f74188a);
        mo86904f().mo86866h();
        mo87369g();
        String str2 = zzq2.f74188a;
        long j = zzaw.f74166d;
        C30911v3 b = C30911v3.m124271b(zzaw);
        mo86904f().mo86866h();
        C30903u7 u7Var = null;
        if (!(this.f73792C == null || (str = this.f73793D) == null || !str.equals(str2))) {
            u7Var = this.f73792C;
        }
        C30906ua.m124218y(u7Var, b.f74021d, false);
        zzaw a = b.mo87552a();
        m124012R(this.f73801g);
        if (C30846pa.m124117m(a, zzq2)) {
            if (!zzq2.f74195v) {
                mo87356S(zzq2);
                return;
            }
            List list4 = zzq2.f74178I0;
            if (list4 == null) {
                zzaw2 = a;
            } else if (list4.contains(a.f74163a)) {
                Bundle W = a.f74164b.mo87634W();
                W.putLong("ga_safelisted", 1);
                zzaw2 = new zzaw(a.f74163a, new zzau(W), a.f74165c, a.f74166d);
            } else {
                mo86903d().mo87488q().mo87466d("Dropping non-safelisted event. appId, event name, origin", str2, a.f74163a, a.f74165c);
                return;
            }
            C30787l lVar = this.f73797c;
            m124012R(lVar);
            lVar.mo87226e0();
            try {
                C30787l lVar2 = this.f73797c;
                m124012R(lVar2);
                C40843u.m166198h(str2);
                lVar2.mo86866h();
                lVar2.mo87627i();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    lVar2.f74136a.mo86903d().mo87494w().mo87465c("Invalid time querying timed out conditional properties", C30899u3.m124186z(str2), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = lVar2.mo87223b0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzac zzac : list) {
                    if (zzac != null) {
                        mo86903d().mo87493v().mo87466d("User property timed out", zzac.f74147a, this.f73806l.mo87101D().mo87412f(zzac.f74149c.f74168b), zzac.f74149c.mo87644M());
                        zzaw zzaw3 = zzac.f74153g;
                        if (zzaw3 != null) {
                            mo87345D(new zzaw(zzaw3, j), zzq2);
                        }
                        C30787l lVar3 = this.f73797c;
                        m124012R(lVar3);
                        lVar3.mo87206J(str2, zzac.f74149c.f74168b);
                    }
                }
                C30787l lVar4 = this.f73797c;
                m124012R(lVar4);
                C40843u.m166198h(str2);
                lVar4.mo86866h();
                lVar4.mo87627i();
                if (i < 0) {
                    lVar4.f74136a.mo86903d().mo87494w().mo87465c("Invalid time querying expired conditional properties", C30899u3.m124186z(str2), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = lVar4.mo87223b0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList<zzaw> arrayList = new ArrayList<>(list2.size());
                for (zzac zzac2 : list2) {
                    if (zzac2 != null) {
                        mo86903d().mo87493v().mo87466d("User property expired", zzac2.f74147a, this.f73806l.mo87101D().mo87412f(zzac2.f74149c.f74168b), zzac2.f74149c.mo87644M());
                        C30787l lVar5 = this.f73797c;
                        m124012R(lVar5);
                        lVar5.mo87230m(str2, zzac2.f74149c.f74168b);
                        zzaw zzaw4 = zzac2.f74157y;
                        if (zzaw4 != null) {
                            arrayList.add(zzaw4);
                        }
                        C30787l lVar6 = this.f73797c;
                        m124012R(lVar6);
                        lVar6.mo87206J(str2, zzac2.f74149c.f74168b);
                    }
                }
                for (zzaw zzaw5 : arrayList) {
                    mo87345D(new zzaw(zzaw5, j), zzq2);
                }
                C30787l lVar7 = this.f73797c;
                m124012R(lVar7);
                String str3 = zzaw2.f74163a;
                C40843u.m166198h(str2);
                C40843u.m166198h(str3);
                lVar7.mo86866h();
                lVar7.mo87627i();
                if (i < 0) {
                    lVar7.f74136a.mo86903d().mo87494w().mo87466d("Invalid time querying triggered conditional properties", C30899u3.m124186z(str2), lVar7.f74136a.mo87101D().mo87410d(str3), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = lVar7.mo87223b0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList<zzaw> arrayList2 = new ArrayList<>(list3.size());
                for (zzac zzac3 : list3) {
                    if (zzac3 != null) {
                        zzli zzli = zzac3.f74149c;
                        C30870ra raVar = new C30870ra((String) C40843u.m166202l(zzac3.f74147a), zzac3.f74148b, zzli.f74168b, j, C40843u.m166202l(zzli.mo87644M()));
                        C30787l lVar8 = this.f73797c;
                        m124012R(lVar8);
                        if (lVar8.mo87241x(raVar)) {
                            mo86903d().mo87493v().mo87466d("User property triggered", zzac3.f74147a, this.f73806l.mo87101D().mo87412f(raVar.f73924c), raVar.f73926e);
                        } else {
                            mo86903d().mo87489r().mo87466d("Too many active user properties, ignoring", C30899u3.m124186z(zzac3.f74147a), this.f73806l.mo87101D().mo87412f(raVar.f73924c), raVar.f73926e);
                        }
                        zzaw zzaw6 = zzac3.f74155w;
                        if (zzaw6 != null) {
                            arrayList2.add(zzaw6);
                        }
                        zzac3.f74149c = new zzli(raVar);
                        zzac3.f74151e = true;
                        C30787l lVar9 = this.f73797c;
                        m124012R(lVar9);
                        lVar9.mo87240w(zzac3);
                    }
                }
                mo87345D(zzaw2, zzq2);
                for (zzaw zzaw7 : arrayList2) {
                    mo87345D(new zzaw(zzaw7, j), zzq2);
                }
                C30787l lVar10 = this.f73797c;
                m124012R(lVar10);
                lVar10.mo87232o();
            } finally {
                C30787l lVar11 = this.f73797c;
                m124012R(lVar11);
                lVar11.mo87227f0();
            }
        }
    }

    /* renamed from: j0 */
    public final String mo87376j0(zzq zzq) {
        try {
            return (String) mo86904f().mo86947s(new C30723fa(this, zzq)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            mo86903d().mo87489r().mo87465c("Failed to get app instance id. appId", C30899u3.m124186z(zzq.f74188a), e);
            return null;
        }
    }

    @C0348i1
    /* renamed from: k */
    public final void mo87377k(zzaw zzaw, String str) {
        zzaw zzaw2 = zzaw;
        String str2 = str;
        C30787l lVar = this.f73797c;
        m124012R(lVar);
        C30693d6 R = lVar.mo87214R(str2);
        if (R == null || TextUtils.isEmpty(R.mo87000l0())) {
            mo86903d().mo87488q().mo87464b("No app data available; dropping event", str2);
            return;
        }
        Boolean J = mo87349J(R);
        if (J == null) {
            if (!"_ui".equals(zzaw2.f74163a)) {
                mo86903d().mo87494w().mo87464b("Could not find package. appId", C30899u3.m124186z(str));
            }
        } else if (!J.booleanValue()) {
            mo86903d().mo87489r().mo87464b("App version does not match; dropping event. appId", C30899u3.m124186z(str));
            return;
        }
        String n0 = R.mo87004n0();
        String l0 = R.mo87000l0();
        long P = R.mo86966P();
        String k0 = R.mo86998k0();
        long a0 = R.mo86978a0();
        long X = R.mo86974X();
        zzq zzq = r2;
        boolean M = R.mo86963M();
        C30693d6 d6Var = R;
        String m0 = d6Var.mo87002m0();
        d6Var.mo86951A();
        zzq zzq2 = new zzq(str, n0, l0, P, k0, a0, X, (String) null, M, false, m0, 0, 0, 0, d6Var.mo86962L(), false, d6Var.mo86990g0(), d6Var.mo86988f0(), d6Var.mo86975Y(), d6Var.mo86983d(), (String) null, mo87359V(str2).mo87140h(), "", (String) null, d6Var.mo86965O(), d6Var.mo86986e0());
        mo87378l(zzaw2, zzq);
    }

    @C0348i1
    /* renamed from: l */
    public final void mo87378l(zzaw zzaw, zzq zzq) {
        C40843u.m166198h(zzq.f74188a);
        C30911v3 b = C30911v3.m124271b(zzaw);
        C30906ua h0 = mo87372h0();
        Bundle bundle = b.f74021d;
        C30787l lVar = this.f73797c;
        m124012R(lVar);
        h0.mo87550z(bundle, lVar.mo87213Q(zzq.f74188a));
        mo87372h0().mo87502B(b, mo87358U().mo87081n(zzq.f74188a));
        zzaw a = b.mo87552a();
        if (C33180f.C33186f.f80639l.equals(a.f74163a) && "referrer API v2".equals(a.f74164b.mo87639n0("_cis"))) {
            String n0 = a.f74164b.mo87639n0("gclid");
            if (!TextUtils.isEmpty(n0)) {
                mo87343B(new zzli("_lgclid", a.f74166d, n0, "auto"), zzq);
            }
        }
        mo87375j(a, zzq);
    }

    @C0348i1
    /* renamed from: l0 */
    public final void mo87379l0(Runnable runnable) {
        mo86904f().mo86866h();
        if (this.f73810p == null) {
            this.f73810p = new ArrayList();
        }
        this.f73810p.add(runnable);
    }

    /* renamed from: m */
    public final void mo87380m() {
        this.f73812r++;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[Catch:{ all -> 0x0176, all -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c A[Catch:{ all -> 0x0176, all -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0129 A[Catch:{ all -> 0x0176, all -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0137 A[Catch:{ all -> 0x0176, all -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0159 A[Catch:{ all -> 0x0176, all -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015d A[Catch:{ all -> 0x0176, all -> 0x0180 }] */
    @androidx.annotation.C0348i1
    @com.google.android.gms.common.util.C40974d0
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87381n(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.d5 r0 = r7.mo86904f()
            r0.mo86866h()
            r7.mo87369g()
            com.google.android.gms.common.internal.C40843u.m166198h(r8)
            r0 = 0
            if (r11 != 0) goto L_0x0012
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x0180 }
        L_0x0012:
            com.google.android.gms.measurement.internal.u3 r1 = r7.mo86903d()     // Catch:{ all -> 0x0180 }
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo87493v()     // Catch:{ all -> 0x0180 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r11.length     // Catch:{ all -> 0x0180 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0180 }
            r1.mo87464b(r2, r3)     // Catch:{ all -> 0x0180 }
            com.google.android.gms.measurement.internal.l r1 = r7.f73797c     // Catch:{ all -> 0x0180 }
            m124012R(r1)     // Catch:{ all -> 0x0180 }
            r1.mo87226e0()     // Catch:{ all -> 0x0180 }
            com.google.android.gms.measurement.internal.l r1 = r7.f73797c     // Catch:{ all -> 0x0176 }
            m124012R(r1)     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.d6 r1 = r1.mo87214R(r8)     // Catch:{ all -> 0x0176 }
            r2 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r9 == r2) goto L_0x0042
            r2 = 204(0xcc, float:2.86E-43)
            if (r9 == r2) goto L_0x0042
            if (r9 != r4) goto L_0x0046
            r9 = r4
        L_0x0042:
            if (r10 != 0) goto L_0x0046
            r2 = 1
            goto L_0x0047
        L_0x0046:
            r2 = r0
        L_0x0047:
            if (r1 != 0) goto L_0x005c
            com.google.android.gms.measurement.internal.u3 r9 = r7.mo86903d()     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.s3 r9 = r9.mo87494w()     // Catch:{ all -> 0x0176 }
            java.lang.String r10 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r8)     // Catch:{ all -> 0x0176 }
            r9.mo87464b(r10, r8)     // Catch:{ all -> 0x0176 }
            goto L_0x0160
        L_0x005c:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ba
            if (r9 != r5) goto L_0x0063
            goto L_0x00ba
        L_0x0063:
            com.google.android.gms.common.util.g r11 = r7.mo86900a()     // Catch:{ all -> 0x0176 }
            long r11 = r11.mo134768a()     // Catch:{ all -> 0x0176 }
            r1.mo87012v(r11)     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.l r11 = r7.f73797c     // Catch:{ all -> 0x0176 }
            m124012R(r11)     // Catch:{ all -> 0x0176 }
            r11.mo87233p(r1)     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.u3 r11 = r7.mo86903d()     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.s3 r11 = r11.mo87493v()     // Catch:{ all -> 0x0176 }
            java.lang.String r12 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0176 }
            r11.mo87465c(r12, r1, r10)     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.x4 r10 = r7.f73795a     // Catch:{ all -> 0x0176 }
            m124012R(r10)     // Catch:{ all -> 0x0176 }
            r10.mo87593z(r8)     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.f9 r8 = r7.f73803i     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.g4 r8 = r8.f73399h     // Catch:{ all -> 0x0176 }
            com.google.android.gms.common.util.g r10 = r7.mo86900a()     // Catch:{ all -> 0x0176 }
            long r10 = r10.mo134768a()     // Catch:{ all -> 0x0176 }
            r8.mo87097b(r10)     // Catch:{ all -> 0x0176 }
            r8 = 503(0x1f7, float:7.05E-43)
            if (r9 == r8) goto L_0x00a6
            r8 = 429(0x1ad, float:6.01E-43)
            if (r9 != r8) goto L_0x00b5
        L_0x00a6:
            com.google.android.gms.measurement.internal.f9 r8 = r7.f73803i     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.g4 r8 = r8.f73397f     // Catch:{ all -> 0x0176 }
            com.google.android.gms.common.util.g r9 = r7.mo86900a()     // Catch:{ all -> 0x0176 }
            long r9 = r9.mo134768a()     // Catch:{ all -> 0x0176 }
            r8.mo87097b(r9)     // Catch:{ all -> 0x0176 }
        L_0x00b5:
            r7.mo87352M()     // Catch:{ all -> 0x0176 }
            goto L_0x0160
        L_0x00ba:
            r10 = 0
            if (r12 == 0) goto L_0x00c6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r2 = r12.get(r2)     // Catch:{ all -> 0x0176 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0176 }
            goto L_0x00c7
        L_0x00c6:
            r2 = r10
        L_0x00c7:
            if (r2 == 0) goto L_0x00d6
            boolean r6 = r2.isEmpty()     // Catch:{ all -> 0x0176 }
            if (r6 != 0) goto L_0x00d6
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0176 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0176 }
            goto L_0x00d7
        L_0x00d6:
            r2 = r10
        L_0x00d7:
            if (r12 == 0) goto L_0x00e2
            java.lang.String r6 = "ETag"
            java.lang.Object r12 = r12.get(r6)     // Catch:{ all -> 0x0176 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x0176 }
            goto L_0x00e3
        L_0x00e2:
            r12 = r10
        L_0x00e3:
            if (r12 == 0) goto L_0x00f2
            boolean r6 = r12.isEmpty()     // Catch:{ all -> 0x0176 }
            if (r6 != 0) goto L_0x00f2
            java.lang.Object r12 = r12.get(r0)     // Catch:{ all -> 0x0176 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0176 }
            goto L_0x00f3
        L_0x00f2:
            r12 = r10
        L_0x00f3:
            if (r9 == r5) goto L_0x0101
            if (r9 != r4) goto L_0x00f8
            goto L_0x0101
        L_0x00f8:
            com.google.android.gms.measurement.internal.x4 r10 = r7.f73795a     // Catch:{ all -> 0x0176 }
            m124012R(r10)     // Catch:{ all -> 0x0176 }
            r10.mo87576H(r8, r11, r2, r12)     // Catch:{ all -> 0x0176 }
            goto L_0x0114
        L_0x0101:
            com.google.android.gms.measurement.internal.x4 r11 = r7.f73795a     // Catch:{ all -> 0x0176 }
            m124012R(r11)     // Catch:{ all -> 0x0176 }
            com.google.android.gms.internal.measurement.i4 r11 = r11.mo87588t(r8)     // Catch:{ all -> 0x0176 }
            if (r11 != 0) goto L_0x0114
            com.google.android.gms.measurement.internal.x4 r11 = r7.f73795a     // Catch:{ all -> 0x0176 }
            m124012R(r11)     // Catch:{ all -> 0x0176 }
            r11.mo87576H(r8, r10, r10, r10)     // Catch:{ all -> 0x0176 }
        L_0x0114:
            com.google.android.gms.common.util.g r10 = r7.mo86900a()     // Catch:{ all -> 0x0176 }
            long r10 = r10.mo134768a()     // Catch:{ all -> 0x0176 }
            r1.mo87001m(r10)     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.l r10 = r7.f73797c     // Catch:{ all -> 0x0176 }
            m124012R(r10)     // Catch:{ all -> 0x0176 }
            r10.mo87233p(r1)     // Catch:{ all -> 0x0176 }
            if (r9 != r5) goto L_0x0137
            com.google.android.gms.measurement.internal.u3 r9 = r7.mo86903d()     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.s3 r9 = r9.mo87495x()     // Catch:{ all -> 0x0176 }
            java.lang.String r10 = "Config not found. Using empty config. appId"
            r9.mo87464b(r10, r8)     // Catch:{ all -> 0x0176 }
            goto L_0x0148
        L_0x0137:
            com.google.android.gms.measurement.internal.u3 r8 = r7.mo86903d()     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.s3 r8 = r8.mo87493v()     // Catch:{ all -> 0x0176 }
            java.lang.String r10 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0176 }
            r8.mo87465c(r10, r9, r3)     // Catch:{ all -> 0x0176 }
        L_0x0148:
            com.google.android.gms.measurement.internal.a4 r8 = r7.f73796b     // Catch:{ all -> 0x0176 }
            m124012R(r8)     // Catch:{ all -> 0x0176 }
            boolean r8 = r8.mo86868m()     // Catch:{ all -> 0x0176 }
            if (r8 == 0) goto L_0x015d
            boolean r8 = r7.mo87354O()     // Catch:{ all -> 0x0176 }
            if (r8 == 0) goto L_0x015d
            r7.mo87344C()     // Catch:{ all -> 0x0176 }
            goto L_0x0160
        L_0x015d:
            r7.mo87352M()     // Catch:{ all -> 0x0176 }
        L_0x0160:
            com.google.android.gms.measurement.internal.l r8 = r7.f73797c     // Catch:{ all -> 0x0176 }
            m124012R(r8)     // Catch:{ all -> 0x0176 }
            r8.mo87232o()     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.l r8 = r7.f73797c     // Catch:{ all -> 0x0180 }
            m124012R(r8)     // Catch:{ all -> 0x0180 }
            r8.mo87227f0()     // Catch:{ all -> 0x0180 }
            r7.f73813s = r0
            r7.mo87350K()
            return
        L_0x0176:
            r8 = move-exception
            com.google.android.gms.measurement.internal.l r9 = r7.f73797c     // Catch:{ all -> 0x0180 }
            m124012R(r9)     // Catch:{ all -> 0x0180 }
            r9.mo87227f0()     // Catch:{ all -> 0x0180 }
            throw r8     // Catch:{ all -> 0x0180 }
        L_0x0180:
            r8 = move-exception
            r7.f73813s = r0
            r7.mo87350K()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30822na.mo87381n(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* renamed from: o */
    public final void mo87382o(boolean z) {
        mo87352M();
    }

    /* JADX INFO: finally extract failed */
    @C0348i1
    @C40974d0
    /* renamed from: p */
    public final void mo87383p(int i, Throwable th, byte[] bArr, String str) {
        C30787l lVar;
        mo86904f().mo86866h();
        mo87369g();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f73814t = false;
                mo87350K();
                throw th2;
            }
        }
        List<Long> list = (List) C40843u.m166202l(this.f73818x);
        this.f73818x = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            mo86903d().mo87493v().mo87465c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f73803i.f73399h.mo87097b(mo86900a().mo134768a());
            if (i == 503 || i == 429) {
                this.f73803i.f73397f.mo87097b(mo86900a().mo134768a());
            }
            C30787l lVar2 = this.f73797c;
            m124012R(lVar2);
            lVar2.mo87228g0(list);
            mo87352M();
            this.f73814t = false;
            mo87350K();
        }
        if (th == null) {
            try {
                this.f73803i.f73398g.mo87097b(mo86900a().mo134768a());
                this.f73803i.f73399h.mo87097b(0);
                mo87352M();
                mo86903d().mo87493v().mo87465c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                C30787l lVar3 = this.f73797c;
                m124012R(lVar3);
                lVar3.mo87226e0();
                try {
                    for (Long l : list) {
                        try {
                            lVar = this.f73797c;
                            m124012R(lVar);
                            long longValue = l.longValue();
                            lVar.mo86866h();
                            lVar.mo87627i();
                            if (lVar.mo87212P().delete(UnsentFeedbackTable.f26843e, "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            lVar.f74136a.mo86903d().mo87489r().mo87464b("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            List list2 = this.f73819y;
                            if (list2 == null || !list2.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    C30787l lVar4 = this.f73797c;
                    m124012R(lVar4);
                    lVar4.mo87232o();
                    C30787l lVar5 = this.f73797c;
                    m124012R(lVar5);
                    lVar5.mo87227f0();
                    this.f73819y = null;
                    C30652a4 a4Var = this.f73796b;
                    m124012R(a4Var);
                    if (!a4Var.mo86868m() || !mo87354O()) {
                        this.f73820z = -1;
                        mo87352M();
                    } else {
                        mo87344C();
                    }
                    this.f73809o = 0;
                } catch (Throwable th3) {
                    C30787l lVar6 = this.f73797c;
                    m124012R(lVar6);
                    lVar6.mo87227f0();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                mo86903d().mo87489r().mo87464b("Database error while trying to delete uploaded bundles", e3);
                this.f73809o = mo86900a().mo134770c();
                mo86903d().mo87493v().mo87464b("Disable upload, time", Long.valueOf(this.f73809o));
            }
            this.f73814t = false;
            mo87350K();
        }
        mo86903d().mo87493v().mo87465c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.f73803i.f73399h.mo87097b(mo86900a().mo134768a());
        this.f73803i.f73397f.mo87097b(mo86900a().mo134768a());
        C30787l lVar22 = this.f73797c;
        m124012R(lVar22);
        lVar22.mo87228g0(list);
        mo87352M();
        this.f73814t = false;
        mo87350K();
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x03d7 A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0403 A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0418 A[SYNTHETIC, Splitter:B:137:0x0418] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x04ba A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x04da A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x053f A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0126 A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ef A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f5 A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x024e A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x025d A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x026d A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    @androidx.annotation.C0348i1
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87384q(com.google.android.gms.measurement.internal.zzq r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r0 = "_npa"
            java.lang.String r7 = "_uwa"
            java.lang.String r8 = "app_id=?"
            com.google.android.gms.measurement.internal.d5 r9 = r23.mo86904f()
            r9.mo86866h()
            r23.mo87369g()
            com.google.android.gms.common.internal.C40843u.m166202l(r24)
            java.lang.String r9 = r2.f74188a
            com.google.android.gms.common.internal.C40843u.m166198h(r9)
            boolean r9 = m124011Q(r24)
            if (r9 == 0) goto L_0x0579
            com.google.android.gms.measurement.internal.l r9 = r1.f73797c
            m124012R(r9)
            java.lang.String r10 = r2.f74188a
            com.google.android.gms.measurement.internal.d6 r9 = r9.mo87214R(r10)
            r10 = 0
            if (r9 == 0) goto L_0x0060
            java.lang.String r12 = r9.mo87004n0()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x0060
            java.lang.String r12 = r2.f74189b
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0060
            r9.mo87001m(r10)
            com.google.android.gms.measurement.internal.l r12 = r1.f73797c
            m124012R(r12)
            r12.mo87233p(r9)
            com.google.android.gms.measurement.internal.x4 r9 = r1.f73795a
            m124012R(r9)
            java.lang.String r12 = r2.f74188a
            r9.mo87569A(r12)
        L_0x0060:
            boolean r9 = r2.f74195v
            if (r9 != 0) goto L_0x0068
            r23.mo87356S(r24)
            return
        L_0x0068:
            long r12 = r2.f74185X
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0076
            com.google.android.gms.common.util.g r9 = r23.mo86900a()
            long r12 = r9.mo134768a()
        L_0x0076:
            com.google.android.gms.measurement.internal.g5 r9 = r1.f73806l
            com.google.android.gms.measurement.internal.p r9 = r9.mo87098A()
            r9.mo87405r()
            int r9 = r2.f74186Y
            r15 = 1
            if (r9 == 0) goto L_0x009e
            if (r9 == r15) goto L_0x009e
            com.google.android.gms.measurement.internal.u3 r16 = r23.mo86903d()
            com.google.android.gms.measurement.internal.s3 r14 = r16.mo87494w()
            java.lang.String r10 = r2.f74188a
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r11 = "Incorrect app type, assuming installed app. appId, appType"
            r14.mo87465c(r11, r10, r9)
            r9 = 0
        L_0x009e:
            com.google.android.gms.measurement.internal.l r10 = r1.f73797c
            m124012R(r10)
            r10.mo87226e0()
            com.google.android.gms.measurement.internal.l r10 = r1.f73797c     // Catch:{ all -> 0x056f }
            m124012R(r10)     // Catch:{ all -> 0x056f }
            java.lang.String r11 = r2.f74188a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.ra r10 = r10.mo87219X(r11, r0)     // Catch:{ all -> 0x056f }
            r11 = r3
            r20 = r4
            if (r10 == 0) goto L_0x00c3
            java.lang.String r14 = "auto"
            java.lang.String r3 = r10.f73923b     // Catch:{ all -> 0x056f }
            boolean r3 = r14.equals(r3)     // Catch:{ all -> 0x056f }
            if (r3 == 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r4 = r15
            goto L_0x00fd
        L_0x00c3:
            java.lang.Boolean r3 = r2.f74176G0     // Catch:{ all -> 0x056f }
            if (r3 == 0) goto L_0x00f7
            com.google.android.gms.measurement.internal.zzli r0 = new com.google.android.gms.measurement.internal.zzli     // Catch:{ all -> 0x056f }
            java.lang.String r3 = "_npa"
            java.lang.Boolean r4 = r2.f74176G0     // Catch:{ all -> 0x056f }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x056f }
            if (r15 == r4) goto L_0x00d6
            r18 = 0
            goto L_0x00d8
        L_0x00d6:
            r18 = 1
        L_0x00d8:
            java.lang.Long r18 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x056f }
            java.lang.String r19 = "auto"
            r4 = 0
            r14 = r0
            r4 = r15
            r15 = r3
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x056f }
            if (r10 == 0) goto L_0x00f3
            java.lang.Object r3 = r10.f73926e     // Catch:{ all -> 0x056f }
            java.lang.Long r10 = r0.f74170d     // Catch:{ all -> 0x056f }
            boolean r3 = r3.equals(r10)     // Catch:{ all -> 0x056f }
            if (r3 != 0) goto L_0x00fd
        L_0x00f3:
            r1.mo87343B(r0, r2)     // Catch:{ all -> 0x056f }
            goto L_0x00fd
        L_0x00f7:
            r4 = r15
            if (r10 == 0) goto L_0x00fd
            r1.mo87388u(r0, r2)     // Catch:{ all -> 0x056f }
        L_0x00fd:
            com.google.android.gms.measurement.internal.l r0 = r1.f73797c     // Catch:{ all -> 0x056f }
            m124012R(r0)     // Catch:{ all -> 0x056f }
            java.lang.String r3 = r2.f74188a     // Catch:{ all -> 0x056f }
            java.lang.Object r3 = com.google.android.gms.common.internal.C40843u.m166202l(r3)     // Catch:{ all -> 0x056f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.d6 r0 = r0.mo87214R(r3)     // Catch:{ all -> 0x056f }
            if (r0 == 0) goto L_0x01ef
            com.google.android.gms.measurement.internal.ua r10 = r23.mo87372h0()     // Catch:{ all -> 0x056f }
            java.lang.String r14 = r2.f74189b     // Catch:{ all -> 0x056f }
            java.lang.String r15 = r0.mo87004n0()     // Catch:{ all -> 0x056f }
            java.lang.String r3 = r2.f74175F0     // Catch:{ all -> 0x056f }
            java.lang.String r4 = r0.mo86990g0()     // Catch:{ all -> 0x056f }
            boolean r3 = r10.mo87525d0(r14, r15, r3, r4)     // Catch:{ all -> 0x056f }
            if (r3 == 0) goto L_0x01ef
            com.google.android.gms.measurement.internal.u3 r3 = r23.mo86903d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87494w()     // Catch:{ all -> 0x056f }
            java.lang.String r4 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r10 = r0.mo86994i0()     // Catch:{ all -> 0x056f }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r10)     // Catch:{ all -> 0x056f }
            r3.mo87464b(r4, r10)     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.l r3 = r1.f73797c     // Catch:{ all -> 0x056f }
            m124012R(r3)     // Catch:{ all -> 0x056f }
            java.lang.String r4 = r0.mo86994i0()     // Catch:{ all -> 0x056f }
            r3.mo87627i()     // Catch:{ all -> 0x056f }
            r3.mo86866h()     // Catch:{ all -> 0x056f }
            com.google.android.gms.common.internal.C40843u.m166198h(r4)     // Catch:{ all -> 0x056f }
            android.database.sqlite.SQLiteDatabase r0 = r3.mo87212P()     // Catch:{ SQLiteException -> 0x01d5 }
            r10 = 1
            java.lang.String[] r14 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x01d5 }
            r10 = 0
            r14[r10] = r4     // Catch:{ SQLiteException -> 0x01d5 }
            java.lang.String r10 = "events"
            int r10 = r0.delete(r10, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            java.lang.String r15 = "user_attributes"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "apps"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "consent_settings"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            com.google.android.gms.internal.measurement.C42215ud.m170906b()     // Catch:{ SQLiteException -> 0x01d5 }
            com.google.android.gms.measurement.internal.g5 r15 = r3.f74136a     // Catch:{ SQLiteException -> 0x01d5 }
            com.google.android.gms.measurement.internal.g r15 = r15.mo87130z()     // Catch:{ SQLiteException -> 0x01d5 }
            r21 = r11
            com.google.android.gms.measurement.internal.g3 r11 = com.google.android.gms.measurement.internal.C30742h3.f73564v0     // Catch:{ SQLiteException -> 0x01d1 }
            r22 = r6
            r6 = 0
            boolean r11 = r15.mo87070B(r6, r11)     // Catch:{ SQLiteException -> 0x01cf }
            if (r11 == 0) goto L_0x01b9
            java.lang.String r6 = "default_event_params"
            int r0 = r0.delete(r6, r8, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r10 = r10 + r0
        L_0x01b9:
            if (r10 <= 0) goto L_0x01ed
            com.google.android.gms.measurement.internal.g5 r0 = r3.f74136a     // Catch:{ SQLiteException -> 0x01cf }
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()     // Catch:{ SQLiteException -> 0x01cf }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87493v()     // Catch:{ SQLiteException -> 0x01cf }
            java.lang.String r6 = "Deleted application data. app, records"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ SQLiteException -> 0x01cf }
            r0.mo87465c(r6, r4, r8)     // Catch:{ SQLiteException -> 0x01cf }
            goto L_0x01ed
        L_0x01cf:
            r0 = move-exception
            goto L_0x01da
        L_0x01d1:
            r0 = move-exception
            r22 = r6
            goto L_0x01da
        L_0x01d5:
            r0 = move-exception
            r22 = r6
            r21 = r11
        L_0x01da:
            com.google.android.gms.measurement.internal.g5 r3 = r3.f74136a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo86903d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87489r()     // Catch:{ all -> 0x056f }
            java.lang.String r6 = "Error deleting application data. appId, error"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r4)     // Catch:{ all -> 0x056f }
            r3.mo87465c(r6, r4, r0)     // Catch:{ all -> 0x056f }
        L_0x01ed:
            r0 = 0
            goto L_0x01f3
        L_0x01ef:
            r22 = r6
            r21 = r11
        L_0x01f3:
            if (r0 == 0) goto L_0x0249
            long r3 = r0.mo86966P()     // Catch:{ all -> 0x056f }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x020c
            long r3 = r0.mo86966P()     // Catch:{ all -> 0x056f }
            long r14 = r2.f74197x     // Catch:{ all -> 0x056f }
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x020c
            r15 = 1
            goto L_0x020d
        L_0x020c:
            r15 = 0
        L_0x020d:
            java.lang.String r3 = r0.mo87000l0()     // Catch:{ all -> 0x056f }
            long r16 = r0.mo86966P()     // Catch:{ all -> 0x056f }
            int r0 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0225
            if (r3 == 0) goto L_0x0225
            java.lang.String r0 = r2.f74190c     // Catch:{ all -> 0x056f }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x056f }
            if (r0 != 0) goto L_0x0225
            r0 = 1
            goto L_0x0226
        L_0x0225:
            r0 = 0
        L_0x0226:
            r0 = r0 | r15
            if (r0 == 0) goto L_0x0249
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x056f }
            r0.<init>()     // Catch:{ all -> 0x056f }
            java.lang.String r4 = "_pv"
            r0.putString(r4, r3)     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.zzaw r3 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x056f }
            java.lang.String r15 = "_au"
            com.google.android.gms.measurement.internal.zzau r4 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x056f }
            r4.<init>(r0)     // Catch:{ all -> 0x056f }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x056f }
            r1.mo87375j(r3, r2)     // Catch:{ all -> 0x056f }
        L_0x0249:
            r23.mo87356S(r24)     // Catch:{ all -> 0x056f }
            if (r9 != 0) goto L_0x025d
            com.google.android.gms.measurement.internal.l r0 = r1.f73797c     // Catch:{ all -> 0x056f }
            m124012R(r0)     // Catch:{ all -> 0x056f }
            java.lang.String r3 = r2.f74188a     // Catch:{ all -> 0x056f }
            java.lang.String r4 = "_f"
            com.google.android.gms.measurement.internal.r r0 = r0.mo87218V(r3, r4)     // Catch:{ all -> 0x056f }
            r15 = 0
            goto L_0x026b
        L_0x025d:
            com.google.android.gms.measurement.internal.l r0 = r1.f73797c     // Catch:{ all -> 0x056f }
            m124012R(r0)     // Catch:{ all -> 0x056f }
            java.lang.String r3 = r2.f74188a     // Catch:{ all -> 0x056f }
            java.lang.String r4 = "_v"
            com.google.android.gms.measurement.internal.r r0 = r0.mo87218V(r3, r4)     // Catch:{ all -> 0x056f }
            r15 = 1
        L_0x026b:
            if (r0 != 0) goto L_0x053f
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r12 / r3
            r10 = 1
            long r8 = r8 + r10
            long r8 = r8 * r3
            java.lang.String r3 = "_dac"
            java.lang.String r4 = "_et"
            java.lang.String r6 = "_r"
            java.lang.String r10 = "_c"
            if (r15 != 0) goto L_0x04f4
            com.google.android.gms.measurement.internal.zzli r0 = new com.google.android.gms.measurement.internal.zzli     // Catch:{ all -> 0x056f }
            java.lang.String r15 = "_fot"
            java.lang.Long r18 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x056f }
            java.lang.String r19 = "auto"
            r14 = r0
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x056f }
            r1.mo87343B(r0, r2)     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.d5 r0 = r23.mo86904f()     // Catch:{ all -> 0x056f }
            r0.mo86866h()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.n4 r0 = r1.f73805k     // Catch:{ all -> 0x056f }
            java.lang.Object r0 = com.google.android.gms.common.internal.C40843u.m166202l(r0)     // Catch:{ all -> 0x056f }
            r8 = r0
            com.google.android.gms.measurement.internal.n4 r8 = (com.google.android.gms.measurement.internal.C30816n4) r8     // Catch:{ all -> 0x056f }
            java.lang.String r0 = r2.f74188a     // Catch:{ all -> 0x056f }
            if (r0 == 0) goto L_0x0394
            boolean r9 = r0.isEmpty()     // Catch:{ all -> 0x056f }
            if (r9 == 0) goto L_0x02af
            goto L_0x0394
        L_0x02af:
            com.google.android.gms.measurement.internal.g5 r9 = r8.f73765a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.d5 r9 = r9.mo86904f()     // Catch:{ all -> 0x056f }
            r9.mo86866h()     // Catch:{ all -> 0x056f }
            boolean r9 = r8.mo87296a()     // Catch:{ all -> 0x056f }
            if (r9 != 0) goto L_0x02cf
            com.google.android.gms.measurement.internal.g5 r0 = r8.f73765a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87492u()     // Catch:{ all -> 0x056f }
            java.lang.String r5 = "Install Referrer Reporter is not available"
            r0.mo87463a(r5)     // Catch:{ all -> 0x056f }
            goto L_0x03a3
        L_0x02cf:
            com.google.android.gms.measurement.internal.m4 r9 = new com.google.android.gms.measurement.internal.m4     // Catch:{ all -> 0x056f }
            r9.<init>(r8, r0)     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.g5 r0 = r8.f73765a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.d5 r0 = r0.mo86904f()     // Catch:{ all -> 0x056f }
            r0.mo86866h()     // Catch:{ all -> 0x056f }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x056f }
            java.lang.String r11 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r11)     // Catch:{ all -> 0x056f }
            android.content.ComponentName r11 = new android.content.ComponentName     // Catch:{ all -> 0x056f }
            java.lang.String r14 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r11.<init>(r5, r14)     // Catch:{ all -> 0x056f }
            r0.setComponent(r11)     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.g5 r11 = r8.f73765a     // Catch:{ all -> 0x056f }
            android.content.Context r11 = r11.mo86902c()     // Catch:{ all -> 0x056f }
            android.content.pm.PackageManager r11 = r11.getPackageManager()     // Catch:{ all -> 0x056f }
            if (r11 != 0) goto L_0x030b
            com.google.android.gms.measurement.internal.g5 r0 = r8.f73765a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87496y()     // Catch:{ all -> 0x056f }
            java.lang.String r5 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.mo87463a(r5)     // Catch:{ all -> 0x056f }
            goto L_0x03a3
        L_0x030b:
            r14 = 0
            java.util.List r11 = r11.queryIntentServices(r0, r14)     // Catch:{ all -> 0x056f }
            if (r11 == 0) goto L_0x0384
            boolean r15 = r11.isEmpty()     // Catch:{ all -> 0x056f }
            if (r15 != 0) goto L_0x0384
            java.lang.Object r11 = r11.get(r14)     // Catch:{ all -> 0x056f }
            android.content.pm.ResolveInfo r11 = (android.content.pm.ResolveInfo) r11     // Catch:{ all -> 0x056f }
            android.content.pm.ServiceInfo r11 = r11.serviceInfo     // Catch:{ all -> 0x056f }
            if (r11 == 0) goto L_0x03a3
            java.lang.String r14 = r11.packageName     // Catch:{ all -> 0x056f }
            java.lang.String r11 = r11.name     // Catch:{ all -> 0x056f }
            if (r11 == 0) goto L_0x0374
            boolean r5 = r5.equals(r14)     // Catch:{ all -> 0x056f }
            if (r5 == 0) goto L_0x0374
            boolean r5 = r8.mo87296a()     // Catch:{ all -> 0x056f }
            if (r5 == 0) goto L_0x0374
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x056f }
            r5.<init>(r0)     // Catch:{ all -> 0x056f }
            com.google.android.gms.common.stats.b r0 = com.google.android.gms.common.stats.C40954b.m166547b()     // Catch:{ RuntimeException -> 0x035f }
            com.google.android.gms.measurement.internal.g5 r11 = r8.f73765a     // Catch:{ RuntimeException -> 0x035f }
            android.content.Context r11 = r11.mo86902c()     // Catch:{ RuntimeException -> 0x035f }
            r14 = 1
            boolean r0 = r0.mo134751a(r11, r5, r9, r14)     // Catch:{ RuntimeException -> 0x035f }
            com.google.android.gms.measurement.internal.g5 r5 = r8.f73765a     // Catch:{ RuntimeException -> 0x035f }
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo86903d()     // Catch:{ RuntimeException -> 0x035f }
            com.google.android.gms.measurement.internal.s3 r5 = r5.mo87493v()     // Catch:{ RuntimeException -> 0x035f }
            java.lang.String r9 = "Install Referrer Service is"
            if (r0 == 0) goto L_0x0359
            java.lang.String r0 = "available"
            goto L_0x035b
        L_0x0359:
            java.lang.String r0 = "not available"
        L_0x035b:
            r5.mo87464b(r9, r0)     // Catch:{ RuntimeException -> 0x035f }
            goto L_0x03a3
        L_0x035f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.g5 r5 = r8.f73765a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo86903d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.s3 r5 = r5.mo87489r()     // Catch:{ all -> 0x056f }
            java.lang.String r8 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x056f }
            r5.mo87464b(r8, r0)     // Catch:{ all -> 0x056f }
            goto L_0x03a3
        L_0x0374:
            com.google.android.gms.measurement.internal.g5 r0 = r8.f73765a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87494w()     // Catch:{ all -> 0x056f }
            java.lang.String r5 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.mo87463a(r5)     // Catch:{ all -> 0x056f }
            goto L_0x03a3
        L_0x0384:
            com.google.android.gms.measurement.internal.g5 r0 = r8.f73765a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87492u()     // Catch:{ all -> 0x056f }
            java.lang.String r5 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.mo87463a(r5)     // Catch:{ all -> 0x056f }
            goto L_0x03a3
        L_0x0394:
            com.google.android.gms.measurement.internal.g5 r0 = r8.f73765a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87496y()     // Catch:{ all -> 0x056f }
            java.lang.String r5 = "Install Referrer Reporter was called with invalid app package name"
            r0.mo87463a(r5)     // Catch:{ all -> 0x056f }
        L_0x03a3:
            com.google.android.gms.measurement.internal.d5 r0 = r23.mo86904f()     // Catch:{ all -> 0x056f }
            r0.mo86866h()     // Catch:{ all -> 0x056f }
            r23.mo87369g()     // Catch:{ all -> 0x056f }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x056f }
            r5.<init>()     // Catch:{ all -> 0x056f }
            r8 = 1
            r5.putLong(r10, r8)     // Catch:{ all -> 0x056f }
            r5.putLong(r6, r8)     // Catch:{ all -> 0x056f }
            r8 = 0
            r5.putLong(r7, r8)     // Catch:{ all -> 0x056f }
            r6 = r22
            r5.putLong(r6, r8)     // Catch:{ all -> 0x056f }
            r10 = r20
            r5.putLong(r10, r8)     // Catch:{ all -> 0x056f }
            r11 = r21
            r5.putLong(r11, r8)     // Catch:{ all -> 0x056f }
            r8 = 1
            r5.putLong(r4, r8)     // Catch:{ all -> 0x056f }
            boolean r0 = r2.f74174E0     // Catch:{ all -> 0x056f }
            if (r0 == 0) goto L_0x03da
            r5.putLong(r3, r8)     // Catch:{ all -> 0x056f }
        L_0x03da:
            java.lang.String r0 = r2.f74188a     // Catch:{ all -> 0x056f }
            java.lang.Object r0 = com.google.android.gms.common.internal.C40843u.m166202l(r0)     // Catch:{ all -> 0x056f }
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.l r0 = r1.f73797c     // Catch:{ all -> 0x056f }
            m124012R(r0)     // Catch:{ all -> 0x056f }
            com.google.android.gms.common.internal.C40843u.m166198h(r3)     // Catch:{ all -> 0x056f }
            r0.mo86866h()     // Catch:{ all -> 0x056f }
            r0.mo87627i()     // Catch:{ all -> 0x056f }
            java.lang.String r4 = "first_open_count"
            long r8 = r0.mo87208L(r3, r4)     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.g5 r0 = r1.f73806l     // Catch:{ all -> 0x056f }
            android.content.Context r0 = r0.mo86902c()     // Catch:{ all -> 0x056f }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x056f }
            if (r0 != 0) goto L_0x0418
            com.google.android.gms.measurement.internal.u3 r0 = r23.mo86903d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87489r()     // Catch:{ all -> 0x056f }
            java.lang.String r4 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r3)     // Catch:{ all -> 0x056f }
            r0.mo87464b(r4, r3)     // Catch:{ all -> 0x056f }
        L_0x0414:
            r3 = 0
            goto L_0x04d6
        L_0x0418:
            com.google.android.gms.measurement.internal.g5 r0 = r1.f73806l     // Catch:{ NameNotFoundException -> 0x0428 }
            android.content.Context r0 = r0.mo86902c()     // Catch:{ NameNotFoundException -> 0x0428 }
            com.google.android.gms.common.wrappers.c r0 = com.google.android.gms.common.wrappers.C41008d.m166715a(r0)     // Catch:{ NameNotFoundException -> 0x0428 }
            r4 = 0
            android.content.pm.PackageInfo r0 = r0.mo134784f(r3, r4)     // Catch:{ NameNotFoundException -> 0x0428 }
            goto L_0x043b
        L_0x0428:
            r0 = move-exception
            com.google.android.gms.measurement.internal.u3 r4 = r23.mo86903d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo87489r()     // Catch:{ all -> 0x056f }
            java.lang.String r14 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r3)     // Catch:{ all -> 0x056f }
            r4.mo87465c(r14, r15, r0)     // Catch:{ all -> 0x056f }
            r0 = 0
        L_0x043b:
            if (r0 == 0) goto L_0x0490
            long r14 = r0.firstInstallTime     // Catch:{ all -> 0x056f }
            r16 = 0
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0490
            r20 = r10
            r21 = r11
            long r10 = r0.lastUpdateTime     // Catch:{ all -> 0x056f }
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0471
            com.google.android.gms.measurement.internal.g r0 = r23.mo87358U()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.g3 r4 = com.google.android.gms.measurement.internal.C30742h3.f73532f0     // Catch:{ all -> 0x056f }
            r10 = 0
            boolean r0 = r0.mo87070B(r10, r4)     // Catch:{ all -> 0x056f }
            if (r0 == 0) goto L_0x046b
            r14 = 0
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0469
            r14 = 1
            r5.putLong(r7, r14)     // Catch:{ all -> 0x056f }
            r8 = 0
        L_0x0469:
            r15 = 0
            goto L_0x0473
        L_0x046b:
            r14 = 1
            r5.putLong(r7, r14)     // Catch:{ all -> 0x056f }
            goto L_0x0469
        L_0x0471:
            r10 = 0
            r15 = 1
        L_0x0473:
            com.google.android.gms.measurement.internal.zzli r0 = new com.google.android.gms.measurement.internal.zzli     // Catch:{ all -> 0x056f }
            java.lang.String r4 = "_fi"
            r7 = 1
            if (r7 == r15) goto L_0x047d
            r14 = 0
            goto L_0x047f
        L_0x047d:
            r14 = 1
        L_0x047f:
            java.lang.Long r18 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x056f }
            java.lang.String r19 = "auto"
            r14 = r0
            r15 = r4
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x056f }
            r1.mo87343B(r0, r2)     // Catch:{ all -> 0x056f }
            goto L_0x0495
        L_0x0490:
            r20 = r10
            r21 = r11
            r10 = 0
        L_0x0495:
            com.google.android.gms.measurement.internal.g5 r0 = r1.f73806l     // Catch:{ NameNotFoundException -> 0x04a5 }
            android.content.Context r0 = r0.mo86902c()     // Catch:{ NameNotFoundException -> 0x04a5 }
            com.google.android.gms.common.wrappers.c r0 = com.google.android.gms.common.wrappers.C41008d.m166715a(r0)     // Catch:{ NameNotFoundException -> 0x04a5 }
            r4 = 0
            android.content.pm.ApplicationInfo r3 = r0.mo134781c(r3, r4)     // Catch:{ NameNotFoundException -> 0x04a5 }
            goto L_0x04b8
        L_0x04a5:
            r0 = move-exception
            com.google.android.gms.measurement.internal.u3 r4 = r23.mo86903d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo87489r()     // Catch:{ all -> 0x056f }
            java.lang.String r7 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r3)     // Catch:{ all -> 0x056f }
            r4.mo87465c(r7, r3, r0)     // Catch:{ all -> 0x056f }
            r3 = r10
        L_0x04b8:
            if (r3 == 0) goto L_0x0414
            int r0 = r3.flags     // Catch:{ all -> 0x056f }
            r4 = 1
            r0 = r0 & r4
            if (r0 == 0) goto L_0x04c7
            r4 = r20
            r10 = 1
            r5.putLong(r4, r10)     // Catch:{ all -> 0x056f }
        L_0x04c7:
            int r0 = r3.flags     // Catch:{ all -> 0x056f }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0414
            r3 = r21
            r10 = 1
            r5.putLong(r3, r10)     // Catch:{ all -> 0x056f }
            goto L_0x0414
        L_0x04d6:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04dd
            r5.putLong(r6, r8)     // Catch:{ all -> 0x056f }
        L_0x04dd:
            com.google.android.gms.measurement.internal.zzaw r0 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x056f }
            java.lang.String r15 = "_f"
            com.google.android.gms.measurement.internal.zzau r3 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x056f }
            r3.<init>(r5)     // Catch:{ all -> 0x056f }
            java.lang.String r17 = "auto"
            r14 = r0
            r16 = r3
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x056f }
            r1.mo87378l(r0, r2)     // Catch:{ all -> 0x056f }
            goto L_0x055e
        L_0x04f4:
            com.google.android.gms.measurement.internal.zzli r0 = new com.google.android.gms.measurement.internal.zzli     // Catch:{ all -> 0x056f }
            java.lang.String r15 = "_fvt"
            java.lang.Long r18 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x056f }
            java.lang.String r19 = "auto"
            r14 = r0
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x056f }
            r1.mo87343B(r0, r2)     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.d5 r0 = r23.mo86904f()     // Catch:{ all -> 0x056f }
            r0.mo86866h()     // Catch:{ all -> 0x056f }
            r23.mo87369g()     // Catch:{ all -> 0x056f }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x056f }
            r0.<init>()     // Catch:{ all -> 0x056f }
            r7 = 1
            r0.putLong(r10, r7)     // Catch:{ all -> 0x056f }
            r0.putLong(r6, r7)     // Catch:{ all -> 0x056f }
            r0.putLong(r4, r7)     // Catch:{ all -> 0x056f }
            boolean r4 = r2.f74174E0     // Catch:{ all -> 0x056f }
            if (r4 == 0) goto L_0x0528
            r0.putLong(r3, r7)     // Catch:{ all -> 0x056f }
        L_0x0528:
            com.google.android.gms.measurement.internal.zzaw r3 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x056f }
            java.lang.String r15 = "_v"
            com.google.android.gms.measurement.internal.zzau r4 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x056f }
            r4.<init>(r0)     // Catch:{ all -> 0x056f }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x056f }
            r1.mo87378l(r3, r2)     // Catch:{ all -> 0x056f }
            goto L_0x055e
        L_0x053f:
            boolean r0 = r2.f74196w     // Catch:{ all -> 0x056f }
            if (r0 == 0) goto L_0x055e
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x056f }
            r0.<init>()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.zzaw r3 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x056f }
            java.lang.String r15 = "_cd"
            com.google.android.gms.measurement.internal.zzau r4 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x056f }
            r4.<init>(r0)     // Catch:{ all -> 0x056f }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x056f }
            r1.mo87378l(r3, r2)     // Catch:{ all -> 0x056f }
        L_0x055e:
            com.google.android.gms.measurement.internal.l r0 = r1.f73797c     // Catch:{ all -> 0x056f }
            m124012R(r0)     // Catch:{ all -> 0x056f }
            r0.mo87232o()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.l r0 = r1.f73797c
            m124012R(r0)
            r0.mo87227f0()
            return
        L_0x056f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r2 = r1.f73797c
            m124012R(r2)
            r2.mo87227f0()
            throw r0
        L_0x0579:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30822na.mo87384q(com.google.android.gms.measurement.internal.zzq):void");
    }

    /* renamed from: r */
    public final void mo87385r() {
        this.f73811q++;
    }

    @C0348i1
    /* renamed from: s */
    public final void mo87386s(zzac zzac) {
        zzq I = mo87348I((String) C40843u.m166202l(zzac.f74147a));
        if (I != null) {
            mo87387t(zzac, I);
        }
    }

    @C0348i1
    /* renamed from: t */
    public final void mo87387t(zzac zzac, zzq zzq) {
        Bundle bundle;
        C40843u.m166202l(zzac);
        C40843u.m166198h(zzac.f74147a);
        C40843u.m166202l(zzac.f74149c);
        C40843u.m166198h(zzac.f74149c.f74168b);
        mo86904f().mo86866h();
        mo87369g();
        if (m124011Q(zzq)) {
            if (zzq.f74195v) {
                C30787l lVar = this.f73797c;
                m124012R(lVar);
                lVar.mo87226e0();
                try {
                    mo87356S(zzq);
                    String str = (String) C40843u.m166202l(zzac.f74147a);
                    C30787l lVar2 = this.f73797c;
                    m124012R(lVar2);
                    zzac S = lVar2.mo87215S(str, zzac.f74149c.f74168b);
                    if (S != null) {
                        mo86903d().mo87488q().mo87465c("Removing conditional user property", zzac.f74147a, this.f73806l.mo87101D().mo87412f(zzac.f74149c.f74168b));
                        C30787l lVar3 = this.f73797c;
                        m124012R(lVar3);
                        lVar3.mo87206J(str, zzac.f74149c.f74168b);
                        if (S.f74151e) {
                            C30787l lVar4 = this.f73797c;
                            m124012R(lVar4);
                            lVar4.mo87230m(str, zzac.f74149c.f74168b);
                        }
                        zzaw zzaw = zzac.f74157y;
                        if (zzaw != null) {
                            zzau zzau = zzaw.f74164b;
                            if (zzau != null) {
                                bundle = zzau.mo87634W();
                            } else {
                                bundle = null;
                            }
                            mo87345D((zzaw) C40843u.m166202l(mo87372h0().mo87549y0(str, ((zzaw) C40843u.m166202l(zzac.f74157y)).f74163a, bundle, S.f74148b, zzac.f74157y.f74166d, true, true)), zzq);
                        }
                    } else {
                        mo86903d().mo87494w().mo87465c("Conditional user property doesn't exist", C30899u3.m124186z(zzac.f74147a), this.f73806l.mo87101D().mo87412f(zzac.f74149c.f74168b));
                    }
                    C30787l lVar5 = this.f73797c;
                    m124012R(lVar5);
                    lVar5.mo87232o();
                } finally {
                    C30787l lVar6 = this.f73797c;
                    m124012R(lVar6);
                    lVar6.mo87227f0();
                }
            } else {
                mo87356S(zzq);
            }
        }
    }

    @C0348i1
    /* renamed from: u */
    public final void mo87388u(String str, zzq zzq) {
        long j;
        mo86904f().mo86866h();
        mo87369g();
        if (m124011Q(zzq)) {
            if (!zzq.f74195v) {
                mo87356S(zzq);
            } else if (!"_npa".equals(str) || zzq.f74176G0 == null) {
                mo86903d().mo87488q().mo87464b("Removing user property", this.f73806l.mo87101D().mo87412f(str));
                C30787l lVar = this.f73797c;
                m124012R(lVar);
                lVar.mo87226e0();
                try {
                    mo87356S(zzq);
                    if ("_id".equals(str)) {
                        C30787l lVar2 = this.f73797c;
                        m124012R(lVar2);
                        lVar2.mo87230m((String) C40843u.m166202l(zzq.f74188a), "_lair");
                    }
                    C30787l lVar3 = this.f73797c;
                    m124012R(lVar3);
                    lVar3.mo87230m((String) C40843u.m166202l(zzq.f74188a), str);
                    C30787l lVar4 = this.f73797c;
                    m124012R(lVar4);
                    lVar4.mo87232o();
                    mo86903d().mo87488q().mo87464b("User property removed", this.f73806l.mo87101D().mo87412f(str));
                } finally {
                    C30787l lVar5 = this.f73797c;
                    m124012R(lVar5);
                    lVar5.mo87227f0();
                }
            } else {
                mo86903d().mo87488q().mo87463a("Falling back to manifest metadata value for ad personalization");
                long a = mo86900a().mo134768a();
                if (true != zzq.f74176G0.booleanValue()) {
                    j = 0;
                } else {
                    j = 1;
                }
                mo87343B(new zzli("_npa", a, Long.valueOf(j), "auto"), zzq);
            }
        }
    }

    @C0348i1
    @C40974d0
    /* renamed from: v */
    public final void mo87389v(zzq zzq) {
        if (this.f73818x != null) {
            ArrayList arrayList = new ArrayList();
            this.f73819y = arrayList;
            arrayList.addAll(this.f73818x);
        }
        C30787l lVar = this.f73797c;
        m124012R(lVar);
        String str = (String) C40843u.m166202l(zzq.f74188a);
        C40843u.m166198h(str);
        lVar.mo86866h();
        lVar.mo87627i();
        try {
            SQLiteDatabase P = lVar.mo87212P();
            String[] strArr = {str};
            int delete = P.delete("apps", "app_id=?", strArr) + P.delete("events", "app_id=?", strArr) + P.delete("user_attributes", "app_id=?", strArr) + P.delete("conditional_properties", "app_id=?", strArr) + P.delete("raw_events", "app_id=?", strArr) + P.delete("raw_events_metadata", "app_id=?", strArr) + P.delete(UnsentFeedbackTable.f26843e, "app_id=?", strArr) + P.delete("audience_filter_values", "app_id=?", strArr) + P.delete("main_event_params", "app_id=?", strArr) + P.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                lVar.f74136a.mo86903d().mo87493v().mo87465c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            lVar.f74136a.mo86903d().mo87489r().mo87465c("Error resetting analytics data. appId, error", C30899u3.m124186z(str), e);
        }
        if (zzq.f74195v) {
            mo87384q(zzq);
        }
    }

    @C0348i1
    /* renamed from: w */
    public final void mo87390w(String str, C30903u7 u7Var) {
        mo86904f().mo86866h();
        String str2 = this.f73793D;
        if (str2 == null || str2.equals(str) || u7Var != null) {
            this.f73793D = str;
            this.f73792C = u7Var;
        }
    }

    @C0348i1
    /* renamed from: x */
    public final void mo87391x() {
        mo86904f().mo86866h();
        C30787l lVar = this.f73797c;
        m124012R(lVar);
        lVar.mo87229h0();
        if (this.f73803i.f73398g.mo87096a() == 0) {
            this.f73803i.f73398g.mo87097b(mo86900a().mo134768a());
        }
        mo87352M();
    }

    @C0348i1
    /* renamed from: y */
    public final void mo87392y(zzac zzac) {
        zzq I = mo87348I((String) C40843u.m166202l(zzac.f74147a));
        if (I != null) {
            mo87393z(zzac, I);
        }
    }

    @C0348i1
    /* renamed from: z */
    public final void mo87393z(zzac zzac, zzq zzq) {
        C40843u.m166202l(zzac);
        C40843u.m166198h(zzac.f74147a);
        C40843u.m166202l(zzac.f74148b);
        C40843u.m166202l(zzac.f74149c);
        C40843u.m166198h(zzac.f74149c.f74168b);
        mo86904f().mo86866h();
        mo87369g();
        if (m124011Q(zzq)) {
            if (!zzq.f74195v) {
                mo87356S(zzq);
                return;
            }
            zzac zzac2 = new zzac(zzac);
            boolean z = false;
            zzac2.f74151e = false;
            C30787l lVar = this.f73797c;
            m124012R(lVar);
            lVar.mo87226e0();
            try {
                C30787l lVar2 = this.f73797c;
                m124012R(lVar2);
                zzac S = lVar2.mo87215S((String) C40843u.m166202l(zzac2.f74147a), zzac2.f74149c.f74168b);
                if (S != null && !S.f74148b.equals(zzac2.f74148b)) {
                    mo86903d().mo87494w().mo87466d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f73806l.mo87101D().mo87412f(zzac2.f74149c.f74168b), zzac2.f74148b, S.f74148b);
                }
                if (S != null && S.f74151e) {
                    zzac2.f74148b = S.f74148b;
                    zzac2.f74150d = S.f74150d;
                    zzac2.f74154v = S.f74154v;
                    zzac2.f74152f = S.f74152f;
                    zzac2.f74155w = S.f74155w;
                    zzac2.f74151e = true;
                    zzli zzli = zzac2.f74149c;
                    zzac2.f74149c = new zzli(zzli.f74168b, S.f74149c.f74169c, zzli.mo87644M(), S.f74149c.f74172f);
                } else if (TextUtils.isEmpty(zzac2.f74152f)) {
                    zzli zzli2 = zzac2.f74149c;
                    zzac2.f74149c = new zzli(zzli2.f74168b, zzac2.f74150d, zzli2.mo87644M(), zzac2.f74149c.f74172f);
                    zzac2.f74151e = true;
                    z = true;
                }
                if (zzac2.f74151e) {
                    zzli zzli3 = zzac2.f74149c;
                    C30870ra raVar = new C30870ra((String) C40843u.m166202l(zzac2.f74147a), zzac2.f74148b, zzli3.f74168b, zzli3.f74169c, C40843u.m166202l(zzli3.mo87644M()));
                    C30787l lVar3 = this.f73797c;
                    m124012R(lVar3);
                    if (lVar3.mo87241x(raVar)) {
                        mo86903d().mo87488q().mo87466d("User property updated immediately", zzac2.f74147a, this.f73806l.mo87101D().mo87412f(raVar.f73924c), raVar.f73926e);
                    } else {
                        mo86903d().mo87489r().mo87466d("(2)Too many active user properties, ignoring", C30899u3.m124186z(zzac2.f74147a), this.f73806l.mo87101D().mo87412f(raVar.f73924c), raVar.f73926e);
                    }
                    if (z && zzac2.f74155w != null) {
                        mo87345D(new zzaw(zzac2.f74155w, zzac2.f74150d), zzq);
                    }
                }
                C30787l lVar4 = this.f73797c;
                m124012R(lVar4);
                if (lVar4.mo87240w(zzac2)) {
                    mo86903d().mo87488q().mo87466d("Conditional property added", zzac2.f74147a, this.f73806l.mo87101D().mo87412f(zzac2.f74149c.f74168b), zzac2.f74149c.mo87644M());
                } else {
                    mo86903d().mo87489r().mo87466d("Too many conditional properties, ignoring", C30899u3.m124186z(zzac2.f74147a), this.f73806l.mo87101D().mo87412f(zzac2.f74149c.f74168b), zzac2.f74149c.mo87644M());
                }
                C30787l lVar5 = this.f73797c;
                m124012R(lVar5);
                lVar5.mo87232o();
            } finally {
                C30787l lVar6 = this.f73797c;
                m124012R(lVar6);
                lVar6.mo87227f0();
            }
        }
    }
}
