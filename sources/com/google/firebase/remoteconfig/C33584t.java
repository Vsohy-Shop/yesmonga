package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.util.C40979g;
import com.google.android.gms.common.util.C40985k;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.C33033f;
import com.google.firebase.abt.C32515c;
import com.google.firebase.analytics.connector.C32537a;
import com.google.firebase.annotations.concurrent.C32562b;
import com.google.firebase.inject.C33058b;
import com.google.firebase.installations.C33088k;
import com.google.firebase.remoteconfig.internal.C33523e;
import com.google.firebase.remoteconfig.internal.C33533k;
import com.google.firebase.remoteconfig.internal.C33537m;
import com.google.firebase.remoteconfig.internal.C33538n;
import com.google.firebase.remoteconfig.internal.C33540o;
import com.google.firebase.remoteconfig.internal.C33546s;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;

@C40473a
/* renamed from: com.google.firebase.remoteconfig.t */
public class C33584t {

    /* renamed from: j */
    public static final String f81710j = "activate";

    /* renamed from: k */
    public static final String f81711k = "fetch";

    /* renamed from: l */
    public static final String f81712l = "defaults";

    /* renamed from: m */
    public static final long f81713m = 60;

    /* renamed from: n */
    public static final String f81714n = "frc";

    /* renamed from: o */
    public static final String f81715o = "settings";
    @C0344h1

    /* renamed from: p */
    public static final String f81716p = "firebase";

    /* renamed from: q */
    public static final C40979g f81717q = C40985k.m166636d();

    /* renamed from: r */
    public static final Random f81718r = new Random();
    @C0323b0("this")

    /* renamed from: a */
    public final Map<String, C33563l> f81719a;

    /* renamed from: b */
    public final Context f81720b;

    /* renamed from: c */
    public final Executor f81721c;

    /* renamed from: d */
    public final C33033f f81722d;

    /* renamed from: e */
    public final C33088k f81723e;

    /* renamed from: f */
    public final C32515c f81724f;
    @C0363p0

    /* renamed from: g */
    public final C33058b<C32537a> f81725g;

    /* renamed from: h */
    public final String f81726h;
    @C0323b0("this")

    /* renamed from: i */
    public Map<String, String> f81727i;

    public C33584t(Context context, @C32562b Executor executor, C33033f fVar, C33088k kVar, C32515c cVar, C33058b<C32537a> bVar) {
        this(context, executor, fVar, kVar, cVar, bVar, true);
    }

    @C0344h1
    /* renamed from: i */
    public static C33538n m135314i(Context context, String str, String str2) {
        return new C33538n(context.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", str, str2, "settings"}), 0));
    }

    @C0363p0
    /* renamed from: j */
    public static C33546s m135315j(C33033f fVar, String str, C33058b<C32537a> bVar) {
        if (!m135317l(fVar) || !str.equals(f81716p)) {
            return null;
        }
        return new C33546s(bVar);
    }

    /* renamed from: k */
    public static boolean m135316k(C33033f fVar, String str) {
        if (!str.equals(f81716p) || !m135317l(fVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m135317l(C33033f fVar) {
        return fVar.mo95722r().equals(C33033f.f80145l);
    }

    /* renamed from: m */
    public static /* synthetic */ C32537a m135318m() {
        return null;
    }

    @C0344h1
    /* renamed from: b */
    public synchronized C33563l mo97416b(C33033f fVar, String str, C33088k kVar, C32515c cVar, Executor executor, C33523e eVar, C33523e eVar2, C33523e eVar3, C33533k kVar2, C33537m mVar, C33538n nVar) {
        C33563l lVar;
        C32515c cVar2;
        String str2 = str;
        synchronized (this) {
            if (!this.f81719a.containsKey(str2)) {
                Context context = this.f81720b;
                if (m135316k(fVar, str)) {
                    cVar2 = cVar;
                } else {
                    cVar2 = null;
                }
                C33563l lVar2 = new C33563l(context, fVar, kVar, cVar2, executor, eVar, eVar2, eVar3, kVar2, mVar, nVar);
                lVar2.mo97391N();
                this.f81719a.put(str2, lVar2);
            }
            lVar = this.f81719a.get(str2);
        }
        return lVar;
    }

    @C40473a
    @C0344h1
    /* renamed from: c */
    public synchronized C33563l mo97417c(String str) {
        C33523e d;
        C33523e d2;
        C33523e d3;
        C33538n i;
        C33537m h;
        d = mo97418d(str, f81711k);
        d2 = mo97418d(str, f81710j);
        d3 = mo97418d(str, f81712l);
        i = m135314i(this.f81720b, this.f81726h, str);
        h = mo97422h(d2, d3);
        C33546s j = m135315j(this.f81722d, str, this.f81725g);
        if (j != null) {
            h.mo97337b(new C33582r(j));
        }
        return mo97416b(this.f81722d, str, this.f81723e, this.f81724f, this.f81721c, d, d2, d3, mo97420f(str, d, i), h, i);
    }

    /* renamed from: d */
    public final C33523e mo97418d(String str, String str2) {
        return C33523e.m135121j(this.f81721c, C33540o.m135224d(this.f81720b, String.format("%s_%s_%s_%s.json", new Object[]{"frc", this.f81726h, str, str2})));
    }

    /* renamed from: e */
    public C33563l mo97419e() {
        return mo97417c(f81716p);
    }

    @C0344h1
    /* renamed from: f */
    public synchronized C33533k mo97420f(String str, C33523e eVar, C33538n nVar) {
        C33088k kVar;
        C33058b<C32537a> bVar;
        kVar = this.f81723e;
        if (m135317l(this.f81722d)) {
            bVar = this.f81725g;
        } else {
            new C33581q
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0012: CONSTRUCTOR  (r0v7 ? I:com.google.firebase.remoteconfig.q) =  call: com.google.firebase.remoteconfig.q.<init>():void type: CONSTRUCTOR in method: com.google.firebase.remoteconfig.t.f(java.lang.String, com.google.firebase.remoteconfig.internal.e, com.google.firebase.remoteconfig.internal.n):com.google.firebase.remoteconfig.internal.k, dex: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v7 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 38 more
                */
            /*
                this = this;
                monitor-enter(r11)
                com.google.firebase.remoteconfig.internal.k r10 = new com.google.firebase.remoteconfig.internal.k     // Catch:{ all -> 0x0034 }
                com.google.firebase.installations.k r1 = r11.f81723e     // Catch:{ all -> 0x0034 }
                com.google.firebase.f r0 = r11.f81722d     // Catch:{ all -> 0x0034 }
                boolean r0 = m135317l(r0)     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                com.google.firebase.inject.b<com.google.firebase.analytics.connector.a> r0 = r11.f81725g     // Catch:{ all -> 0x0034 }
                goto L_0x0015
            L_0x0010:
                com.google.firebase.remoteconfig.q r0 = new com.google.firebase.remoteconfig.q     // Catch:{ all -> 0x0034 }
                r0.<init>()     // Catch:{ all -> 0x0034 }
            L_0x0015:
                r2 = r0
                java.util.concurrent.Executor r3 = r11.f81721c     // Catch:{ all -> 0x0034 }
                com.google.android.gms.common.util.g r4 = f81717q     // Catch:{ all -> 0x0034 }
                java.util.Random r5 = f81718r     // Catch:{ all -> 0x0034 }
                com.google.firebase.f r0 = r11.f81722d     // Catch:{ all -> 0x0034 }
                com.google.firebase.n r0 = r0.mo95723s()     // Catch:{ all -> 0x0034 }
                java.lang.String r0 = r0.mo96247i()     // Catch:{ all -> 0x0034 }
                com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient r7 = r11.mo97421g(r0, r12, r14)     // Catch:{ all -> 0x0034 }
                java.util.Map<java.lang.String, java.lang.String> r9 = r11.f81727i     // Catch:{ all -> 0x0034 }
                r0 = r10
                r6 = r13
                r8 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0034 }
                monitor-exit(r11)
                return r10
            L_0x0034:
                r12 = move-exception
                monitor-exit(r11)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.C33584t.mo97420f(java.lang.String, com.google.firebase.remoteconfig.internal.e, com.google.firebase.remoteconfig.internal.n):com.google.firebase.remoteconfig.internal.k");
        }

        @C0344h1
        /* renamed from: g */
        public ConfigFetchHttpClient mo97421g(String str, String str2, C33538n nVar) {
            return new ConfigFetchHttpClient(this.f81720b, this.f81722d.mo95723s().mo96248j(), str, str2, nVar.mo97349c(), nVar.mo97349c());
        }

        /* renamed from: h */
        public final C33537m mo97422h(C33523e eVar, C33523e eVar2) {
            return new C33537m(this.f81721c, eVar, eVar2);
        }

        @C0344h1
        /* renamed from: n */
        public synchronized void mo97423n(Map<String, String> map) {
            this.f81727i = map;
        }

        @C0344h1
        public C33584t(Context context, Executor executor, C33033f fVar, C33088k kVar, C32515c cVar, C33058b<C32537a> bVar, boolean z) {
            this.f81719a = new HashMap();
            this.f81727i = new HashMap();
            this.f81720b = context;
            this.f81721c = executor;
            this.f81722d = fVar;
            this.f81723e = kVar;
            this.f81724f = cVar;
            this.f81725g = bVar;
            this.f81726h = fVar.mo95723s().mo96248j();
            if (z) {
                C31053n.m124522d(executor, new C33583s(this));
            }
        }
    }
