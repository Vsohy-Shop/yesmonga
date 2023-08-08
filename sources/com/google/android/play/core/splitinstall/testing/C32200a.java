package com.google.android.play.core.splitinstall.testing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import androidx.camera.view.C1814q;
import com.google.android.play.core.common.C32014a;
import com.google.android.play.core.internal.C32028a0;
import com.google.android.play.core.internal.C32059j;
import com.google.android.play.core.internal.C32081q0;
import com.google.android.play.core.splitcompat.C32150r;
import com.google.android.play.core.splitinstall.C32158c;
import com.google.android.play.core.splitinstall.C32167f;
import com.google.android.play.core.splitinstall.C32169g;
import com.google.android.play.core.splitinstall.C32176j0;
import com.google.android.play.core.splitinstall.C32179l;
import com.google.android.play.core.splitinstall.C32182m0;
import com.google.android.play.core.splitinstall.C32199t0;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.model.C32183a;
import com.google.android.play.core.tasks.C32227d;
import com.google.android.play.core.tasks.C32229f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.splitinstall.testing.a */
public class C32200a implements C32158c {

    /* renamed from: o */
    public static final long f78502o = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: p */
    public static final /* synthetic */ int f78503p = 0;

    /* renamed from: a */
    public final Handler f78504a;

    /* renamed from: b */
    public final Context f78505b;

    /* renamed from: c */
    public final C32199t0 f78506c;

    /* renamed from: d */
    public final C32081q0 f78507d;

    /* renamed from: e */
    public final C32059j<C32167f> f78508e;

    /* renamed from: f */
    public final C32059j<C32167f> f78509f;

    /* renamed from: g */
    public final Executor f78510g;

    /* renamed from: h */
    public final C32176j0 f78511h;

    /* renamed from: i */
    public final File f78512i;

    /* renamed from: j */
    public final AtomicReference<C32167f> f78513j;

    /* renamed from: k */
    public final Set<String> f78514k;

    /* renamed from: l */
    public final Set<String> f78515l;

    /* renamed from: m */
    public final AtomicBoolean f78516m;

    /* renamed from: n */
    public final C32202c f78517n;

    @Deprecated
    public C32200a(Context context, File file) {
        this(context, file, new C32199t0(context, context.getPackageName()));
    }

    /* renamed from: F */
    public static String m130259F(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    /* renamed from: u */
    public static final /* synthetic */ C32167f m130260u(int i, C32167f fVar) {
        int m;
        if (fVar != null && i == fVar.mo92964l() && ((m = fVar.mo92965m()) == 1 || m == 2 || m == 8 || m == 9 || m == 7)) {
            return C32167f.m130174e(i, 7, fVar.mo92959g(), fVar.mo92957c(), fVar.mo92966n(), fVar.mo92962j(), fVar.mo92961i());
        }
        throw new SplitInstallException(-3);
    }

    /* renamed from: w */
    public static final /* synthetic */ C32167f m130261w(Integer num, int i, int i2, Long l, Long l2, List list, List list2, C32167f fVar) {
        C32167f e = fVar == null ? C32167f.m130174e(0, 0, 0, 0, 0, new ArrayList(), new ArrayList()) : fVar;
        return C32167f.m130174e(num == null ? e.mo92964l() : num.intValue(), i, i2, l == null ? e.mo92957c() : l.longValue(), l2 == null ? e.mo92966n() : l2.longValue(), list == null ? e.mo92962j() : list, list2 == null ? e.mo92961i() : list2);
    }

    @Nullable
    /* renamed from: B */
    public final C32167f mo92988B() {
        return this.f78513j.get();
    }

    @Nullable
    /* renamed from: C */
    public final synchronized C32167f mo92989C(C32210k kVar) {
        C32167f B;
        C32167f a;
        B = mo92988B();
        a = kVar.mo93003a(B);
        if (C1814q.m7242a(this.f78513j, B, a)) {
            return a;
        }
        return null;
    }

    /* renamed from: D */
    public final boolean mo92990D(int i, int i2, @Nullable Long l, @Nullable Long l2, @Nullable List<String> list, @Nullable Integer num, @Nullable List<String> list2) {
        C32167f C = mo92989C(new C32203d(num, i, i2, l, l2, list, list2));
        if (C == null) {
            return false;
        }
        mo92994I(C);
        return true;
    }

    /* renamed from: E */
    public final C32227d<Integer> mo92991E(@C32183a int i) {
        mo92989C(new C32206g(i, (byte[]) null));
        return C32229f.m130361d(new SplitInstallException(i));
    }

    /* renamed from: G */
    public final C32182m0 mo92992G() {
        C32182m0 c = this.f78506c.mo92985c();
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
    }

    /* renamed from: H */
    public void mo92993H(boolean z) {
        this.f78516m.set(z);
    }

    /* renamed from: I */
    public final void mo92994I(C32167f fVar) {
        this.f78504a.post(new C32207h(this, fVar));
    }

    /* renamed from: J */
    public final void mo92995J(List<Intent> list, List<String> list2, List<String> list3, long j, boolean z) {
        List<Intent> list4 = list;
        this.f78511h.mo92977a().mo92838a(list, new C32209j(this, list2, list3, j, z, list));
    }

    /* renamed from: K */
    public final void mo92996K(List<String> list, List<String> list2, long j) {
        this.f78514k.addAll(list);
        this.f78515l.addAll(list2);
        Long valueOf = Long.valueOf(j);
        mo92990D(5, 0, valueOf, valueOf, (List<String>) null, (Integer) null, (List<String>) null);
    }

    /* renamed from: L */
    public final boolean mo92997L(int i) {
        return mo92990D(6, i, (Long) null, (Long) null, (List<String>) null, (Integer) null, (List<String>) null);
    }

    /* renamed from: a */
    public final boolean mo92921a(C32167f fVar, Activity activity, int i) throws IntentSender.SendIntentException {
        return false;
    }

    /* renamed from: b */
    public final C32227d<Void> mo92922b(List<Locale> list) {
        return C32229f.m130361d(new SplitInstallException(-5));
    }

    /* renamed from: c */
    public final C32227d<Void> mo92923c(int i) {
        try {
            C32167f C = mo92989C(new C32206g(i));
            if (C != null) {
                mo92994I(C);
            }
            return C32229f.m130358a(null);
        } catch (SplitInstallException e) {
            return C32229f.m130361d(e);
        }
    }

    /* renamed from: d */
    public final C32227d<List<C32167f>> mo92924d() {
        C32167f B = mo92988B();
        return C32229f.m130358a(B != null ? Collections.singletonList(B) : Collections.emptyList());
    }

    /* renamed from: e */
    public final C32227d<Void> mo92925e(List<Locale> list) {
        return C32229f.m130361d(new SplitInstallException(-5));
    }

    /* renamed from: f */
    public final boolean mo92926f(C32167f fVar, C32014a aVar, int i) throws IntentSender.SendIntentException {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0128, code lost:
        if (r4.contains(r15) == false) goto L_0x012f;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.tasks.C32227d<java.lang.Integer> mo92927g(com.google.android.play.core.splitinstall.C32164e r21) {
        /*
            r20 = this;
            r9 = r20
            com.google.android.play.core.splitinstall.testing.f r0 = new com.google.android.play.core.splitinstall.testing.f     // Catch:{ SplitInstallException -> 0x01ff }
            r1 = r21
            r0.<init>(r1)     // Catch:{ SplitInstallException -> 0x01ff }
            com.google.android.play.core.splitinstall.f r0 = r9.mo92989C(r0)     // Catch:{ SplitInstallException -> 0x01ff }
            if (r0 == 0) goto L_0x01f8
            int r0 = r0.mo92964l()     // Catch:{ SplitInstallException -> 0x01ff }
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r2 = r21.mo92946a()
            java.util.Iterator r2 = r2.iterator()
        L_0x0020:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r2.next()
            java.util.Locale r3 = (java.util.Locale) r3
            java.lang.String r3 = r3.getLanguage()
            r10.add(r3)
            goto L_0x0020
        L_0x0034:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.io.File r3 = r9.f78512i
            java.io.File[] r3 = r3.listFiles()
            if (r3 != 0) goto L_0x004c
            r0 = -5
            com.google.android.play.core.tasks.d r0 = r9.mo92991E(r0)
            return r0
        L_0x004c:
            int r4 = r3.length
            r8 = 0
            r12 = 0
        L_0x0050:
            if (r8 >= r4) goto L_0x018d
            r14 = r3[r8]
            java.lang.String r15 = com.google.android.play.core.internal.C32028a0.m129762b(r14)
            java.lang.String r5 = m130259F(r15)
            r2.add(r15)
            java.util.List r6 = r21.mo92947b()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x012b
            java.lang.String r5 = m130259F(r15)
            java.util.HashSet r6 = new java.util.HashSet
            com.google.android.play.core.internal.q0 r7 = r9.f78507d
            java.util.List r7 = r7.mo92813a()
            r6.<init>(r7)
            com.google.android.play.core.splitinstall.m0 r7 = r20.mo92992G()
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r16 = 0
            r1[r16] = r5
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.Map r1 = r7.mo92981a(r1)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.Collection r7 = r1.values()
            java.util.Iterator r7 = r7.iterator()
        L_0x0098:
            boolean r17 = r7.hasNext()
            if (r17 == 0) goto L_0x00ae
            java.lang.Object r17 = r7.next()
            r18 = r3
            r3 = r17
            java.util.Set r3 = (java.util.Set) r3
            r5.addAll(r3)
            r3 = r18
            goto L_0x0098
        L_0x00ae:
            r18 = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x00b9:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00e5
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            r17 = r4
            java.lang.String r4 = "_"
            boolean r19 = r7.contains(r4)
            if (r19 == 0) goto L_0x00da
            r19 = r6
            r6 = -1
            java.lang.String[] r4 = r7.split(r4, r6)
            r6 = 0
            r7 = r4[r6]
            goto L_0x00dd
        L_0x00da:
            r19 = r6
            r6 = 0
        L_0x00dd:
            r3.add(r7)
            r4 = r17
            r6 = r19
            goto L_0x00b9
        L_0x00e5:
            r17 = r4
            r6 = 0
            java.util.Set<java.lang.String> r4 = r9.f78515l
            r3.addAll(r4)
            r3.addAll(r10)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x00fd:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x011e
            java.lang.Object r7 = r1.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r6 = r7.getKey()
            boolean r6 = r3.contains(r6)
            if (r6 == 0) goto L_0x011c
            java.lang.Object r6 = r7.getValue()
            java.util.Collection r6 = (java.util.Collection) r6
            r4.addAll(r6)
        L_0x011c:
            r6 = 0
            goto L_0x00fd
        L_0x011e:
            boolean r1 = r5.contains(r15)
            if (r1 == 0) goto L_0x017b
            boolean r1 = r4.contains(r15)
            if (r1 == 0) goto L_0x012f
            goto L_0x017b
        L_0x012b:
            r18 = r3
            r17 = r4
        L_0x012f:
            java.util.List r1 = r21.mo92946a()
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.Set<java.lang.String> r4 = r9.f78514k
            r3.<init>(r4)
            java.lang.String r4 = ""
            java.lang.String r5 = "base"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.addAll(r4)
            com.google.android.play.core.splitinstall.m0 r4 = r20.mo92992G()
            java.util.Map r3 = r4.mo92981a(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0155:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0183
            java.lang.Object r4 = r1.next()
            java.util.Locale r4 = (java.util.Locale) r4
            java.lang.String r5 = r4.getLanguage()
            boolean r5 = r3.containsKey(r5)
            if (r5 == 0) goto L_0x0155
            java.lang.String r4 = r4.getLanguage()
            java.lang.Object r4 = r3.get(r4)
            java.util.Set r4 = (java.util.Set) r4
            boolean r4 = r4.contains(r15)
            if (r4 == 0) goto L_0x0155
        L_0x017b:
            long r3 = r14.length()
            long r12 = r12 + r3
            r11.add(r14)
        L_0x0183:
            int r8 = r8 + 1
            r1 = r21
            r4 = r17
            r3 = r18
            goto L_0x0050
        L_0x018d:
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.util.List r3 = r21.mo92947b()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r1.length()
            int r5 = r3.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 22
            int r4 = r4 + r5
            r6.<init>(r4)
            java.lang.String r4 = "availableSplits "
            r6.append(r4)
            r6.append(r1)
            java.lang.String r1 = " want "
            r6.append(r1)
            r6.append(r3)
            java.util.HashSet r1 = new java.util.HashSet
            java.util.List r3 = r21.mo92947b()
            r1.<init>(r3)
            boolean r1 = r2.containsAll(r1)
            if (r1 != 0) goto L_0x01ce
            r0 = -2
            com.google.android.play.core.tasks.d r0 = r9.mo92991E(r0)
            return r0
        L_0x01ce:
            r1 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            java.util.List r6 = r21.mo92947b()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 1
            r3 = 0
            r1 = r20
            r7 = r0
            r8 = r10
            r1.mo92990D(r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.Executor r1 = r9.f78510g
            com.google.android.play.core.splitinstall.testing.e r2 = new com.google.android.play.core.splitinstall.testing.e
            r2.<init>(r9, r11, r10)
            r1.execute(r2)
            com.google.android.play.core.tasks.d r0 = com.google.android.play.core.tasks.C32229f.m130358a(r0)
            return r0
        L_0x01f8:
            r0 = -100
            com.google.android.play.core.tasks.d r0 = r9.mo92991E(r0)     // Catch:{ SplitInstallException -> 0x01ff }
            return r0
        L_0x01ff:
            r0 = move-exception
            int r0 = r0.mo92457a()
            com.google.android.play.core.tasks.d r0 = r9.mo92991E(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.testing.C32200a.mo92927g(com.google.android.play.core.splitinstall.e):com.google.android.play.core.tasks.d");
    }

    /* renamed from: h */
    public final void mo92928h(C32169g gVar) {
        this.f78508e.mo92767b(gVar);
    }

    /* renamed from: i */
    public final C32227d<Void> mo92929i(List<String> list) {
        return C32229f.m130361d(new SplitInstallException(-5));
    }

    /* renamed from: j */
    public final C32227d<C32167f> mo92930j(int i) {
        C32167f B = mo92988B();
        return (B == null || B.mo92964l() != i) ? C32229f.m130361d(new SplitInstallException(-4)) : C32229f.m130358a(B);
    }

    /* renamed from: k */
    public final void mo92931k(C32169g gVar) {
        this.f78508e.mo92766a(gVar);
    }

    /* renamed from: l */
    public final Set<String> mo92932l() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f78506c.mo92983a());
        hashSet.addAll(this.f78514k);
        return hashSet;
    }

    /* renamed from: m */
    public final C32227d<Void> mo92933m(List<String> list) {
        return C32229f.m130361d(new SplitInstallException(-5));
    }

    /* renamed from: n */
    public final void mo92934n(C32169g gVar) {
        this.f78509f.mo92767b(gVar);
    }

    /* renamed from: o */
    public final void mo92935o(C32169g gVar) {
        this.f78509f.mo92766a(gVar);
    }

    /* renamed from: p */
    public final Set<String> mo92936p() {
        HashSet hashSet = new HashSet();
        if (this.f78506c.mo92984b() != null) {
            hashSet.addAll(this.f78506c.mo92984b());
        }
        hashSet.addAll(this.f78515l);
        return hashSet;
    }

    /* renamed from: q */
    public final File mo92998q() {
        return this.f78512i;
    }

    /* renamed from: r */
    public final /* synthetic */ void mo92999r(List list, List list2, List list3, long j) {
        if (this.f78516m.get()) {
            mo92997L(-6);
        } else if (this.f78511h.mo92977a() != null) {
            mo92995J(list, list2, list3, j, false);
        } else {
            mo92996K(list2, list3, j);
        }
    }

    /* renamed from: s */
    public final /* synthetic */ void mo93000s(long j, List list, List list2, List list3) {
        long j2 = j;
        long j3 = j2 / 3;
        long j4 = 0;
        int i = 0;
        while (i < 3) {
            j4 = Math.min(j2, j4 + j3);
            mo92990D(2, 0, Long.valueOf(j4), Long.valueOf(j), (List<String>) null, (Integer) null, (List<String>) null);
            SystemClock.sleep(f78502o);
            C32167f B = mo92988B();
            if (B.mo92965m() != 9 && B.mo92965m() != 7 && B.mo92965m() != 6) {
                i++;
            } else {
                return;
            }
        }
        this.f78510g.execute(new C32208i(this, list, list2, list3, j));
    }

    /* renamed from: t */
    public final /* synthetic */ void mo93001t(C32167f fVar) {
        this.f78508e.mo92768c(fVar);
        this.f78509f.mo92768c(fVar);
    }

    /* renamed from: v */
    public final /* synthetic */ void mo93002v(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String b = C32028a0.m129762b(file);
            Uri fromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(fromFile, this.f78505b.getContentResolver().getType(fromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", m130259F(b));
            intent.putExtra("split_id", b);
            arrayList.add(intent);
            arrayList2.add(m130259F(C32028a0.m129762b(file)));
        }
        C32167f B = mo92988B();
        if (B != null) {
            this.f78510g.execute(new C32208i(this, B.mo92966n(), (List) arrayList, (List) arrayList2, list2));
        }
    }

    public C32200a(Context context, @Nullable File file, C32199t0 t0Var) {
        Executor a = C32150r.m130101a();
        C32081q0 q0Var = new C32081q0(context);
        C32202c cVar = C32202c.f78519a;
        this.f78504a = new Handler(Looper.getMainLooper());
        this.f78513j = new AtomicReference<>();
        this.f78514k = Collections.synchronizedSet(new HashSet());
        this.f78515l = Collections.synchronizedSet(new HashSet());
        this.f78516m = new AtomicBoolean(false);
        this.f78505b = context;
        this.f78512i = file;
        this.f78506c = t0Var;
        this.f78510g = a;
        this.f78507d = q0Var;
        this.f78517n = cVar;
        this.f78509f = new C32059j<>();
        this.f78508e = new C32059j<>();
        this.f78511h = C32179l.f78434a;
    }
}
