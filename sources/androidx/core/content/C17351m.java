package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.core.util.C17970d;
import androidx.core.util.C18001r;
import androidx.core.util.C18007x;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: androidx.core.content.m */
public class C17351m {

    /* renamed from: p */
    public static final String f45616p = "IntentSanitizer";

    /* renamed from: a */
    public int f45617a;

    /* renamed from: b */
    public C18007x<String> f45618b;

    /* renamed from: c */
    public C18007x<Uri> f45619c;

    /* renamed from: d */
    public C18007x<String> f45620d;

    /* renamed from: e */
    public C18007x<String> f45621e;

    /* renamed from: f */
    public C18007x<String> f45622f;

    /* renamed from: g */
    public C18007x<ComponentName> f45623g;

    /* renamed from: h */
    public boolean f45624h;

    /* renamed from: i */
    public Map<String, C18007x<Object>> f45625i;

    /* renamed from: j */
    public boolean f45626j;

    /* renamed from: k */
    public C18007x<Uri> f45627k;

    /* renamed from: l */
    public C18007x<ClipData> f45628l;

    /* renamed from: m */
    public boolean f45629m;

    /* renamed from: n */
    public boolean f45630n;

    /* renamed from: o */
    public boolean f45631o;

    @C0376v0(15)
    /* renamed from: androidx.core.content.m$b */
    public static class C17353b {
        @C0373u
        /* renamed from: a */
        public static Intent m79812a(Intent intent) {
            return intent.getSelector();
        }

        @C0373u
        /* renamed from: b */
        public static void m79813b(Intent intent, Intent intent2) {
            intent.setSelector(intent2);
        }
    }

    @C0376v0(16)
    /* renamed from: androidx.core.content.m$c */
    public static class C17354c {

        @C0376v0(31)
        /* renamed from: androidx.core.content.m$c$a */
        public static class C17355a {
            @C0373u
            /* renamed from: a */
            public static void m79816a(int i, ClipData.Item item, C17970d<String> dVar) {
                if (item.getHtmlText() != null || item.getIntent() != null || item.getTextLinks() != null) {
                    dVar.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
                }
            }
        }

        /* renamed from: a */
        public static void m79814a(int i, ClipData.Item item, C17970d<String> dVar) {
            if (item.getHtmlText() != null || item.getIntent() != null) {
                dVar.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
        @androidx.annotation.C0373u
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m79815b(@androidx.annotation.C0359n0 android.content.Intent r7, android.content.Intent r8, androidx.core.util.C18007x<android.content.ClipData> r9, boolean r10, androidx.core.util.C18007x<android.net.Uri> r11, androidx.core.util.C17970d<java.lang.String> r12) {
            /*
                android.content.ClipData r7 = r7.getClipData()
                if (r7 != 0) goto L_0x0007
                return
            L_0x0007:
                if (r9 == 0) goto L_0x0014
                boolean r9 = r9.test(r7)
                if (r9 == 0) goto L_0x0014
                r8.setClipData(r7)
                goto L_0x00de
            L_0x0014:
                r9 = 0
                r0 = 0
                r1 = r9
            L_0x0017:
                int r2 = r7.getItemCount()
                if (r0 >= r2) goto L_0x00d9
                android.content.ClipData$Item r2 = r7.getItemAt(r0)
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 31
                if (r3 < r4) goto L_0x002b
                androidx.core.content.C17351m.C17354c.C17355a.m79816a(r0, r2, r12)
                goto L_0x002e
            L_0x002b:
                m79814a(r0, r2, r12)
            L_0x002e:
                if (r10 == 0) goto L_0x0035
                java.lang.CharSequence r3 = r2.getText()
                goto L_0x005c
            L_0x0035:
                java.lang.CharSequence r3 = r2.getText()
                if (r3 == 0) goto L_0x005b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Item text cannot contain value. Item position: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = ". Text: "
                r3.append(r4)
                java.lang.CharSequence r4 = r2.getText()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r12.accept(r3)
            L_0x005b:
                r3 = r9
            L_0x005c:
                java.lang.String r4 = ". URI: "
                java.lang.String r5 = "Item URI is not allowed. Item position: "
                if (r11 != 0) goto L_0x0085
                android.net.Uri r6 = r2.getUri()
                if (r6 == 0) goto L_0x00b2
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                r6.append(r0)
                r6.append(r4)
                android.net.Uri r2 = r2.getUri()
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r12.accept(r2)
                goto L_0x00b2
            L_0x0085:
                android.net.Uri r6 = r2.getUri()
                if (r6 == 0) goto L_0x00b4
                android.net.Uri r6 = r2.getUri()
                boolean r6 = r11.test(r6)
                if (r6 == 0) goto L_0x0096
                goto L_0x00b4
            L_0x0096:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                r6.append(r0)
                r6.append(r4)
                android.net.Uri r2 = r2.getUri()
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r12.accept(r2)
            L_0x00b2:
                r2 = r9
                goto L_0x00b8
            L_0x00b4:
                android.net.Uri r2 = r2.getUri()
            L_0x00b8:
                if (r3 != 0) goto L_0x00bc
                if (r2 == 0) goto L_0x00d5
            L_0x00bc:
                if (r1 != 0) goto L_0x00cd
                android.content.ClipData r1 = new android.content.ClipData
                android.content.ClipDescription r4 = r7.getDescription()
                android.content.ClipData$Item r5 = new android.content.ClipData$Item
                r5.<init>(r3, r9, r2)
                r1.<init>(r4, r5)
                goto L_0x00d5
            L_0x00cd:
                android.content.ClipData$Item r4 = new android.content.ClipData$Item
                r4.<init>(r3, r9, r2)
                r1.addItem(r4)
            L_0x00d5:
                int r0 = r0 + 1
                goto L_0x0017
            L_0x00d9:
                if (r1 == 0) goto L_0x00de
                r8.setClipData(r1)
            L_0x00de:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.C17351m.C17354c.m79815b(android.content.Intent, android.content.Intent, androidx.core.util.x, boolean, androidx.core.util.x, androidx.core.util.d):void");
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.core.content.m$d */
    public static class C17356d {
        @C0373u
        /* renamed from: a */
        public static String m79817a(Intent intent) {
            return intent.getIdentifier();
        }

        @C0373u
        /* renamed from: b */
        public static Intent m79818b(Intent intent, String str) {
            return intent.setIdentifier(str);
        }
    }

    /* renamed from: androidx.core.content.m$e */
    public static final class C17357e {

        /* renamed from: q */
        public static final int f45632q = 2112614400;

        /* renamed from: r */
        public static final int f45633r = 2015363072;

        /* renamed from: a */
        public int f45634a;

        /* renamed from: b */
        public C18007x<String> f45635b = new C17314b0();

        /* renamed from: c */
        public C18007x<Uri> f45636c = new C17317c0();

        /* renamed from: d */
        public C18007x<String> f45637d = new C17330d0();

        /* renamed from: e */
        public C18007x<String> f45638e = new C17332e0();

        /* renamed from: f */
        public C18007x<String> f45639f = new C17334f0();

        /* renamed from: g */
        public C18007x<ComponentName> f45640g = new C17336g0();

        /* renamed from: h */
        public boolean f45641h;

        /* renamed from: i */
        public boolean f45642i;

        /* renamed from: j */
        public Map<String, C18007x<Object>> f45643j = new HashMap();

        /* renamed from: k */
        public boolean f45644k = false;

        /* renamed from: l */
        public C18007x<Uri> f45645l = new C17338h0();

        /* renamed from: m */
        public C18007x<ClipData> f45646m = new C17343i0();

        /* renamed from: n */
        public boolean f45647n;

        /* renamed from: o */
        public boolean f45648o;

        /* renamed from: p */
        public boolean f45649p;

        /* renamed from: X */
        public static /* synthetic */ boolean m79819X(ComponentName componentName) {
            return true;
        }

        /* renamed from: b0 */
        public static /* synthetic */ boolean m79825b0(Object obj) {
            return true;
        }

        /* renamed from: c0 */
        public static /* synthetic */ boolean m79827c0(Class cls, C18007x xVar, Object obj) {
            return cls.isInstance(obj) && xVar.test(cls.cast(obj));
        }

        /* renamed from: d0 */
        public static /* synthetic */ boolean m79829d0(Object obj) {
            return false;
        }

        /* renamed from: g0 */
        public static /* synthetic */ boolean m79835g0(String str) {
            return false;
        }

        /* renamed from: h0 */
        public static /* synthetic */ boolean m79837h0(Uri uri) {
            return false;
        }

        /* renamed from: i0 */
        public static /* synthetic */ boolean m79839i0(String str) {
            return false;
        }

        /* renamed from: j0 */
        public static /* synthetic */ boolean m79841j0(String str) {
            return false;
        }

        /* renamed from: k0 */
        public static /* synthetic */ boolean m79843k0(String str) {
            return false;
        }

        /* renamed from: l0 */
        public static /* synthetic */ boolean m79845l0(ComponentName componentName) {
            return false;
        }

        /* renamed from: m0 */
        public static /* synthetic */ boolean m79847m0(Uri uri) {
            return false;
        }

        /* renamed from: n0 */
        public static /* synthetic */ boolean m79849n0(ClipData clipData) {
            return false;
        }

        @SuppressLint({"BuilderSetStyle"})
        @C0359n0
        /* renamed from: A */
        public C17357e mo51764A(@C0359n0 ComponentName componentName) {
            C18001r.m81775l(componentName);
            Objects.requireNonNull(componentName);
            return mo51765B(new C17506z(componentName));
        }

        @SuppressLint({"BuilderSetStyle"})
        @C0359n0
        /* renamed from: B */
        public C17357e mo51765B(@C0359n0 C18007x<ComponentName> xVar) {
            C18001r.m81775l(xVar);
            this.f45642i = true;
            this.f45640g = this.f45640g.mo52472f(xVar);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @C0359n0
        /* renamed from: C */
        public C17357e mo51766C(@C0359n0 String str) {
            C18001r.m81775l(str);
            return mo51765B(new C17498w(str));
        }

        @SuppressLint({"BuilderSetStyle"})
        @C0359n0
        /* renamed from: D */
        public C17357e mo51767D(@C0359n0 C18007x<Uri> xVar) {
            C18001r.m81775l(xVar);
            this.f45636c = this.f45636c.mo52472f(xVar);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @C0359n0
        /* renamed from: E */
        public C17357e mo51768E(@C0359n0 String str) {
            C18001r.m81775l(str);
            mo51767D(new C17500x(str));
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @C0359n0
        /* renamed from: F */
        public C17357e mo51769F(@C0359n0 String str, @C0359n0 C18007x<Object> xVar) {
            C18001r.m81775l(str);
            C18001r.m81775l(xVar);
            C18007x xVar2 = this.f45643j.get(str);
            if (xVar2 == null) {
                new C17446q
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0012: CONSTRUCTOR  (r0v5 ? I:androidx.core.content.q) =  call: androidx.core.content.q.<init>():void type: CONSTRUCTOR in method: androidx.core.content.m.e.F(java.lang.String, androidx.core.util.x):androidx.core.content.m$e, dex: classes4.dex
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
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v5 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 49 more
                    */
                /*
                    this = this;
                    androidx.core.util.C18001r.m81775l(r2)
                    androidx.core.util.C18001r.m81775l(r3)
                    java.util.Map<java.lang.String, androidx.core.util.x<java.lang.Object>> r0 = r1.f45643j
                    java.lang.Object r0 = r0.get(r2)
                    androidx.core.util.x r0 = (androidx.core.util.C18007x) r0
                    if (r0 != 0) goto L_0x0015
                    androidx.core.content.q r0 = new androidx.core.content.q
                    r0.<init>()
                L_0x0015:
                    androidx.core.util.x r3 = r0.mo52472f(r3)
                    java.util.Map<java.lang.String, androidx.core.util.x<java.lang.Object>> r0 = r1.f45643j
                    r0.put(r2, r3)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.C17351m.C17357e.mo51769F(java.lang.String, androidx.core.util.x):androidx.core.content.m$e");
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: G */
            public C17357e mo51770G(@C0359n0 String str, @C0359n0 Class<?> cls) {
                return mo51771H(str, cls, new C17310a0());
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: H */
            public <T> C17357e mo51771H(@C0359n0 String str, @C0359n0 Class<T> cls, @C0359n0 C18007x<T> xVar) {
                C18001r.m81775l(str);
                C18001r.m81775l(cls);
                C18001r.m81775l(xVar);
                return mo51769F(str, new C17496v(cls, xVar));
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: I */
            public C17357e mo51772I(@C0359n0 C18007x<Uri> xVar) {
                mo51771H("output", Uri.class, xVar);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: J */
            public C17357e mo51773J(@C0359n0 String str) {
                mo51771H("output", Uri.class, new C17503y(str));
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: K */
            public C17357e mo51774K(@C0359n0 C18007x<Uri> xVar) {
                mo51771H("android.intent.extra.STREAM", Uri.class, xVar);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: L */
            public C17357e mo51775L(@C0359n0 String str) {
                C18001r.m81775l(str);
                mo51771H("android.intent.extra.STREAM", Uri.class, new C17489t(str));
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: M */
            public C17357e mo51776M(int i) {
                this.f45634a = i | this.f45634a;
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: N */
            public C17357e mo51777N() {
                this.f45634a |= f45632q;
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: O */
            public C17357e mo51778O() {
                this.f45647n = true;
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: P */
            public C17357e mo51779P(@C0359n0 C18007x<String> xVar) {
                C18001r.m81775l(xVar);
                this.f45639f = this.f45639f.mo52472f(xVar);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: Q */
            public C17357e mo51780Q(@C0359n0 String str) {
                C18001r.m81775l(str);
                Objects.requireNonNull(str);
                return mo51779P(new C17485s(str));
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: R */
            public C17357e mo51781R() {
                this.f45634a |= f45633r;
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: S */
            public C17357e mo51782S() {
                this.f45648o = true;
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: T */
            public C17357e mo51783T() {
                this.f45649p = true;
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: U */
            public C17357e mo51784U(@C0359n0 C18007x<String> xVar) {
                C18001r.m81775l(xVar);
                this.f45637d = this.f45637d.mo52472f(xVar);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: V */
            public C17357e mo51785V(@C0359n0 String str) {
                C18001r.m81775l(str);
                Objects.requireNonNull(str);
                return mo51784U(new C17485s(str));
            }

            @SuppressLint({"SyntheticAccessor"})
            @C0359n0
            /* renamed from: W */
            public C17351m mo51786W() {
                boolean z = this.f45641h;
                if ((!z || !this.f45642i) && (z || this.f45642i)) {
                    C17351m mVar = new C17351m();
                    int unused = mVar.f45617a = this.f45634a;
                    C18007x unused2 = mVar.f45618b = this.f45635b;
                    C18007x unused3 = mVar.f45619c = this.f45636c;
                    C18007x unused4 = mVar.f45620d = this.f45637d;
                    C18007x unused5 = mVar.f45621e = this.f45638e;
                    C18007x unused6 = mVar.f45622f = this.f45639f;
                    boolean unused7 = mVar.f45624h = this.f45641h;
                    C18007x unused8 = mVar.f45623g = this.f45640g;
                    Map unused9 = mVar.f45625i = this.f45643j;
                    boolean unused10 = mVar.f45626j = this.f45644k;
                    C18007x unused11 = mVar.f45627k = this.f45645l;
                    C18007x unused12 = mVar.f45628l = this.f45646m;
                    boolean unused13 = mVar.f45629m = this.f45647n;
                    boolean unused14 = mVar.f45630n = this.f45648o;
                    boolean unused15 = mVar.f45631o = this.f45649p;
                    return mVar;
                }
                throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: r */
            public C17357e mo51787r(@C0359n0 C18007x<String> xVar) {
                C18001r.m81775l(xVar);
                this.f45635b = this.f45635b.mo52472f(xVar);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: s */
            public C17357e mo51788s(@C0359n0 String str) {
                C18001r.m81775l(str);
                Objects.requireNonNull(str);
                mo51787r(new C17485s(str));
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: t */
            public C17357e mo51789t() {
                this.f45641h = true;
                this.f45640g = new C17492u();
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: u */
            public C17357e mo51790u(@C0359n0 C18007x<String> xVar) {
                C18001r.m81775l(xVar);
                this.f45638e = this.f45638e.mo52472f(xVar);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: v */
            public C17357e mo51791v(@C0359n0 String str) {
                C18001r.m81775l(str);
                Objects.requireNonNull(str);
                return mo51790u(new C17485s(str));
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: w */
            public C17357e mo51792w(@C0359n0 C18007x<ClipData> xVar) {
                C18001r.m81775l(xVar);
                this.f45646m = this.f45646m.mo52472f(xVar);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: x */
            public C17357e mo51793x() {
                this.f45644k = true;
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: y */
            public C17357e mo51794y(@C0359n0 C18007x<Uri> xVar) {
                C18001r.m81775l(xVar);
                this.f45645l = this.f45645l.mo52472f(xVar);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C0359n0
            /* renamed from: z */
            public C17357e mo51795z(@C0359n0 String str) {
                C18001r.m81775l(str);
                return mo51794y(new C17448r(str));
            }
        }

        /* renamed from: r */
        public static /* synthetic */ void m79806r(String str) {
        }

        /* renamed from: s */
        public static /* synthetic */ void m79807s(String str) {
            throw new SecurityException(str);
        }

        /* renamed from: t */
        public final void mo51760t(Intent intent, String str, Object obj) {
            if (obj == null) {
                intent.getExtras().putString(str, (String) null);
            } else if (obj instanceof Parcelable) {
                intent.putExtra(str, (Parcelable) obj);
            } else if (obj instanceof Parcelable[]) {
                intent.putExtra(str, (Parcelable[]) obj);
            } else if (obj instanceof Serializable) {
                intent.putExtra(str, (Serializable) obj);
            } else {
                throw new IllegalArgumentException("Unsupported type " + obj.getClass());
            }
        }

        @C0359n0
        /* renamed from: u */
        public Intent mo51761u(@C0359n0 Intent intent, @C0359n0 C17970d<String> dVar) {
            Intent intent2 = new Intent();
            ComponentName component = intent.getComponent();
            if ((!this.f45624h || component != null) && !this.f45623g.test(component)) {
                dVar.accept("Component is not allowed: " + component);
                intent2.setComponent(new ComponentName("android", "java.lang.Void"));
            } else {
                intent2.setComponent(component);
            }
            String str = intent.getPackage();
            if (str == null || this.f45622f.test(str)) {
                intent2.setPackage(str);
            } else {
                dVar.accept("Package is not allowed: " + str);
            }
            int flags = this.f45617a | intent.getFlags();
            int i = this.f45617a;
            if (flags == i) {
                intent2.setFlags(intent.getFlags());
            } else {
                intent2.setFlags(intent.getFlags() & i);
                dVar.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent.getFlags() & (~this.f45617a)));
            }
            String action = intent.getAction();
            if (action == null || this.f45618b.test(action)) {
                intent2.setAction(action);
            } else {
                dVar.accept("Action is not allowed: " + action);
            }
            Uri data = intent.getData();
            if (data == null || this.f45619c.test(data)) {
                intent2.setData(data);
            } else {
                dVar.accept("Data is not allowed: " + data);
            }
            String type = intent.getType();
            if (type == null || this.f45620d.test(type)) {
                intent2.setDataAndType(intent2.getData(), type);
            } else {
                dVar.accept("Type is not allowed: " + type);
            }
            Set<String> categories = intent.getCategories();
            if (categories != null) {
                for (String next : categories) {
                    if (this.f45621e.test(next)) {
                        intent2.addCategory(next);
                    } else {
                        dVar.accept("Category is not allowed: " + next);
                    }
                }
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String next2 : extras.keySet()) {
                    if (next2.equals("android.intent.extra.STREAM") && (this.f45617a & 1) == 0) {
                        dVar.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                    } else if (!next2.equals("output") || ((~this.f45617a) & 3) == 0) {
                        Object obj = extras.get(next2);
                        C18007x xVar = this.f45625i.get(next2);
                        if (xVar == null || !xVar.test(obj)) {
                            dVar.accept("Extra is not allowed. Key: " + next2 + ". Value: " + obj);
                        } else {
                            mo51760t(intent2, next2, obj);
                        }
                    } else {
                        dVar.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                    }
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            C17354c.m79815b(intent, intent2, this.f45628l, this.f45626j, this.f45627k, dVar);
            if (i2 >= 29) {
                if (this.f45629m) {
                    C17356d.m79818b(intent2, C17356d.m79817a(intent));
                } else if (C17356d.m79817a(intent) != null) {
                    dVar.accept("Identifier is not allowed: " + C17356d.m79817a(intent));
                }
            }
            if (this.f45630n) {
                C17353b.m79813b(intent2, C17353b.m79812a(intent));
            } else if (C17353b.m79812a(intent) != null) {
                dVar.accept("Selector is not allowed: " + C17353b.m79812a(intent));
            }
            if (this.f45631o) {
                intent2.setSourceBounds(intent.getSourceBounds());
            } else if (intent.getSourceBounds() != null) {
                dVar.accept("SourceBounds is not allowed: " + intent.getSourceBounds());
            }
            return intent2;
        }

        @C0359n0
        /* renamed from: v */
        public Intent mo51762v(@C0359n0 Intent intent) {
            return mo51761u(intent, new C17347k());
        }

        @C0359n0
        /* renamed from: w */
        public Intent mo51763w(@C0359n0 Intent intent) {
            return mo51761u(intent, new C17349l());
        }

        public C17351m() {
        }
    }
