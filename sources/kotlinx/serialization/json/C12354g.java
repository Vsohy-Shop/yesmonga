package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12200d;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.g */
public final class C12354g {

    /* renamed from: a */
    public final boolean f30201a;

    /* renamed from: b */
    public final boolean f30202b;

    /* renamed from: c */
    public final boolean f30203c;

    /* renamed from: d */
    public final boolean f30204d;

    /* renamed from: e */
    public final boolean f30205e;

    /* renamed from: f */
    public final boolean f30206f;
    @C12579k

    /* renamed from: g */
    public final String f30207g;

    /* renamed from: h */
    public final boolean f30208h;

    /* renamed from: i */
    public final boolean f30209i;
    @C12579k

    /* renamed from: j */
    public final String f30210j;

    /* renamed from: k */
    public final boolean f30211k;

    /* renamed from: l */
    public final boolean f30212l;

    public C12354g() {
        this(false, false, false, false, false, false, (String) null, false, false, (String) null, false, false, 4095, (DefaultConstructorMarker) null);
    }

    @C12200d
    /* renamed from: g */
    public static /* synthetic */ void m49753g() {
    }

    @C12200d
    /* renamed from: k */
    public static /* synthetic */ void m49754k() {
    }

    /* renamed from: a */
    public final boolean mo25357a() {
        return this.f30211k;
    }

    /* renamed from: b */
    public final boolean mo25358b() {
        return this.f30204d;
    }

    @C12579k
    /* renamed from: c */
    public final String mo25359c() {
        return this.f30210j;
    }

    /* renamed from: d */
    public final boolean mo25360d() {
        return this.f30208h;
    }

    /* renamed from: e */
    public final boolean mo25361e() {
        return this.f30201a;
    }

    /* renamed from: f */
    public final boolean mo25362f() {
        return this.f30206f;
    }

    /* renamed from: h */
    public final boolean mo25363h() {
        return this.f30202b;
    }

    /* renamed from: i */
    public final boolean mo25364i() {
        return this.f30205e;
    }

    @C12579k
    /* renamed from: j */
    public final String mo25365j() {
        return this.f30207g;
    }

    /* renamed from: l */
    public final boolean mo25366l() {
        return this.f30212l;
    }

    /* renamed from: m */
    public final boolean mo25367m() {
        return this.f30209i;
    }

    /* renamed from: n */
    public final boolean mo25368n() {
        return this.f30203c;
    }

    @C12579k
    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f30201a + ", ignoreUnknownKeys=" + this.f30202b + ", isLenient=" + this.f30203c + ", allowStructuredMapKeys=" + this.f30204d + ", prettyPrint=" + this.f30205e + ", explicitNulls=" + this.f30206f + ", prettyPrintIndent='" + this.f30207g + "', coerceInputValues=" + this.f30208h + ", useArrayPolymorphism=" + this.f30209i + ", classDiscriminator='" + this.f30210j + "', allowSpecialFloatingPointValues=" + this.f30211k + ')';
    }

    public C12354g(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @C12579k String str, boolean z7, boolean z8, @C12579k String str2, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(str2, "classDiscriminator");
        this.f30201a = z;
        this.f30202b = z2;
        this.f30203c = z3;
        this.f30204d = z4;
        this.f30205e = z5;
        this.f30206f = z6;
        this.f30207g = str;
        this.f30208h = z7;
        this.f30209i = z8;
        this.f30210j = str2;
        this.f30211k = z9;
        this.f30212l = z10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C12354g(boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, java.lang.String r21, boolean r22, boolean r23, java.lang.String r24, boolean r25, boolean r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r14 = this;
            r0 = r27
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0012
        L_0x0010:
            r3 = r16
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x001a
        L_0x0018:
            r4 = r17
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = r2
            goto L_0x0022
        L_0x0020:
            r5 = r18
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = r2
            goto L_0x002a
        L_0x0028:
            r6 = r19
        L_0x002a:
            r7 = r0 & 32
            r8 = 1
            if (r7 == 0) goto L_0x0031
            r7 = r8
            goto L_0x0033
        L_0x0031:
            r7 = r20
        L_0x0033:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            java.lang.String r9 = "    "
            goto L_0x003c
        L_0x003a:
            r9 = r21
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = r2
            goto L_0x0044
        L_0x0042:
            r10 = r22
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = r2
            goto L_0x004c
        L_0x004a:
            r11 = r23
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0053
            java.lang.String r12 = "type"
            goto L_0x0055
        L_0x0053:
            r12 = r24
        L_0x0055:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            r2 = r25
        L_0x005c:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r8 = r26
        L_0x0063:
            r15 = r14
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r2
            r27 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.C12354g.<init>(boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, boolean, boolean, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
