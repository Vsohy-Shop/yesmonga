package com.urbanairship.android.layout.reporting;

import android.app.Activity;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.C19427i;
import androidx.lifecycle.C19499w;
import com.urbanairship.C36059m;
import com.urbanairship.C36064q;
import com.urbanairship.app.C36030b;
import com.urbanairship.app.C36038h;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DisplayTimer {

    /* renamed from: a */
    public long f88633a;

    /* renamed from: b */
    public long f88634b;

    public static final class LifecycleListener implements C19427i {

        /* renamed from: a */
        public final WeakReference<DisplayTimer> f88635a;

        public LifecycleListener(DisplayTimer displayTimer) {
            this.f88635a = new WeakReference<>(displayTimer);
        }

        public void onDestroy(@C0359n0 C19499w wVar) {
            wVar.getLifecycle().mo57467d(this);
        }

        /* renamed from: v */
        public void mo34383v(@C0359n0 C19499w wVar) {
            DisplayTimer displayTimer = this.f88635a.get();
            if (displayTimer != null) {
                displayTimer.mo107380e();
            } else {
                C36059m.m148421q("DisplayTimer ref was null!", new Object[0]);
            }
        }

        /* renamed from: y */
        public void mo34384y(@C0359n0 C19499w wVar) {
            DisplayTimer displayTimer = this.f88635a.get();
            if (displayTimer != null) {
                displayTimer.mo107379d();
            } else {
                C36059m.m148421q("DisplayTimer ref was null!", new Object[0]);
            }
        }
    }

    /* renamed from: com.urbanairship.android.layout.reporting.DisplayTimer$a */
    public static final class C35855a extends C36038h {

        /* renamed from: a */
        public final WeakReference<DisplayTimer> f88636a;

        public C35855a(DisplayTimer displayTimer) {
            this.f88636a = new WeakReference<>(displayTimer);
        }

        public void onActivityPaused(@C0359n0 Activity activity) {
            DisplayTimer displayTimer = this.f88636a.get();
            if (displayTimer != null) {
                displayTimer.mo107379d();
            } else {
                C36059m.m148421q("DisplayTimer ref was null!", new Object[0]);
            }
        }

        public void onActivityResumed(@C0359n0 Activity activity) {
            DisplayTimer displayTimer = this.f88636a.get();
            if (displayTimer != null) {
                displayTimer.mo107380e();
            } else {
                C36059m.m148421q("DisplayTimer ref was null!", new Object[0]);
            }
        }
    }

    public DisplayTimer(@C0359n0 C19499w wVar) {
        this(wVar, 0);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m147816c(Activity activity) {
        return true;
    }

    /* renamed from: b */
    public long mo107378b() {
        long j = this.f88634b;
        if (this.f88633a > 0) {
            return j + (System.currentTimeMillis() - this.f88633a);
        }
        return j;
    }

    /* renamed from: d */
    public void mo107379d() {
        this.f88634b += System.currentTimeMillis() - this.f88633a;
        this.f88633a = 0;
    }

    /* renamed from: e */
    public void mo107380e() {
        this.f88633a = System.currentTimeMillis();
    }

    public DisplayTimer(@C0359n0 C19499w wVar, long j) {
        this.f88633a = 0;
        this.f88634b = 0;
        if (j > 0) {
            this.f88634b = j;
        }
        wVar.getLifecycle().mo57464a(new LifecycleListener(this));
    }

    public DisplayTimer(@C0359n0 C36030b bVar) {
        this(bVar, (C36064q<Activity>) null, 0);
    }

    public DisplayTimer(@C0359n0 C36030b bVar, @C0363p0 C36064q<Activity> qVar, long j) {
        this.f88633a = 0;
        this.f88634b = 0;
        if (j > 0) {
            this.f88634b = j;
        }
        if (qVar == null) {
            new C35866b
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0014: CONSTRUCTOR  (r4v2 ? I:com.urbanairship.android.layout.reporting.b) =  call: com.urbanairship.android.layout.reporting.b.<init>():void type: CONSTRUCTOR in method: com.urbanairship.android.layout.reporting.DisplayTimer.<init>(com.urbanairship.app.b, com.urbanairship.q, long):void, dex: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v2 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                r2.<init>()
                r0 = 0
                r2.f88633a = r0
                r2.f88634b = r0
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 <= 0) goto L_0x000f
                r2.f88634b = r5
            L_0x000f:
                if (r4 == 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                com.urbanairship.android.layout.reporting.b r4 = new com.urbanairship.android.layout.reporting.b
                r4.<init>()
            L_0x0017:
                com.urbanairship.app.d r5 = new com.urbanairship.app.d
                com.urbanairship.android.layout.reporting.DisplayTimer$a r6 = new com.urbanairship.android.layout.reporting.DisplayTimer$a
                r6.<init>(r2)
                r5.<init>(r6, r4)
                r3.mo18484e(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.reporting.DisplayTimer.<init>(com.urbanairship.app.b, com.urbanairship.q, long):void");
        }
    }
