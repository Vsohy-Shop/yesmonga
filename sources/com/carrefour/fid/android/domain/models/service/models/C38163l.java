package com.carrefour.fid.android.domain.models.service.models;

import androidx.autofill.C0861a;
import androidx.compose.p004ui.unit.C16476b;
import com.carrefour.fid.android.domain.models.service.models.C38154g;
import com.carrefour.fid.android.domain.models.service.models.C38157h;
import com.carrefour.fid.android.domain.models.service.models.DeliveryFee;
import com.carrefour.fid.android.domain.models.service.models.StoreAddress;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import java.util.List;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12439o
/* renamed from: com.carrefour.fid.android.domain.models.service.models.l */
public final class C38163l {
    @C12579k
    public static final C38165b Companion = new C38165b((DefaultConstructorMarker) null);
    @C12579k
    @C11287e

    /* renamed from: s */
    public static final C12248g<Object>[] f96666s = {null, null, null, null, null, new C12269f(C12278i.f30070a), null, null, new C12269f(C38157h.C38158a.f96659a), new C12269f(C38154g.C38155a.f96646a), new C12269f(StoreService.C38136a.f96615a), null, null, null, null, null, null, new C12269f(DeliveryFee.C38125a.f96566a)};
    @C12579k

    /* renamed from: a */
    public final String f96667a;
    @C12579k

    /* renamed from: b */
    public final String f96668b;
    @C12579k

    /* renamed from: c */
    public final String f96669c;
    @C12579k

    /* renamed from: d */
    public final String f96670d;
    @C12579k

    /* renamed from: e */
    public final String f96671e;
    @C12579k

    /* renamed from: f */
    public final List<Boolean> f96672f;
    @C12579k

    /* renamed from: g */
    public final String f96673g;
    @C12580l

    /* renamed from: h */
    public final StoreAddress f96674h;
    @C12579k

    /* renamed from: i */
    public final List<C38157h> f96675i;
    @C12579k

    /* renamed from: j */
    public final List<C38154g> f96676j;
    @C12579k

    /* renamed from: k */
    public final List<StoreService> f96677k;
    @C12579k

    /* renamed from: l */
    public final String f96678l;
    @C12579k

    /* renamed from: m */
    public final String f96679m;
    @C12579k

    /* renamed from: n */
    public final String f96680n;
    @C12579k

    /* renamed from: o */
    public final String f96681o;

    /* renamed from: p */
    public final boolean f96682p;

    /* renamed from: q */
    public final boolean f96683q;
    @C12579k

    /* renamed from: r */
    public final List<DeliveryFee> f96684r;

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    /* renamed from: com.carrefour.fid.android.domain.models.service.models.l$a */
    public static final class C38164a implements C12327y<C38163l> {
        @C12579k

        /* renamed from: a */
        public static final C38164a f96685a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f96686b;

        static {
            C38164a aVar = new C38164a();
            f96685a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.domain.models.service.models.Store", aVar, 18);
            pluginGeneratedSerialDescriptor.mo24966k("name", true);
            pluginGeneratedSerialDescriptor.mo24966k("banner", true);
            pluginGeneratedSerialDescriptor.mo24966k(C0861a.f2689A, true);
            pluginGeneratedSerialDescriptor.mo24966k("format", true);
            pluginGeneratedSerialDescriptor.mo24966k("type", true);
            pluginGeneratedSerialDescriptor.mo24966k("passDays", true);
            pluginGeneratedSerialDescriptor.mo24966k("id", true);
            pluginGeneratedSerialDescriptor.mo24966k("address", true);
            pluginGeneratedSerialDescriptor.mo24966k("openingPattern", true);
            pluginGeneratedSerialDescriptor.mo24966k("openingExceptionalPattern", true);
            pluginGeneratedSerialDescriptor.mo24966k("storeServices", true);
            pluginGeneratedSerialDescriptor.mo24966k("gln", true);
            pluginGeneratedSerialDescriptor.mo24966k("anabelKey", true);
            pluginGeneratedSerialDescriptor.mo24966k("distance", true);
            pluginGeneratedSerialDescriptor.mo24966k("minOrderAmount", true);
            pluginGeneratedSerialDescriptor.mo24966k("paymentOnSiteActivated", true);
            pluginGeneratedSerialDescriptor.mo24966k("isLoyaltyActivated", true);
            pluginGeneratedSerialDescriptor.mo24966k("deliveryFees", true);
            f96686b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0198, code lost:
            r9 = r5;
            r5 = 8;
            r7 = 17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x01ed, code lost:
            r5 = 8;
            r11 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x01ef, code lost:
            r7 = 17;
            r11 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e5, code lost:
            r14 = r14;
            r11 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e5, code lost:
            r11 = r11;
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e5, code lost:
            r14 = r14;
            r11 = r11;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.carrefour.fid.android.domain.models.service.models.C38163l deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r38) {
            /*
                r37 = this;
                r0 = r38
                java.lang.String r1 = "decoder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                kotlinx.serialization.descriptors.f r1 = r37.getDescriptor()
                kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
                kotlinx.serialization.g[] r2 = com.carrefour.fid.android.domain.models.service.models.C38163l.f96666s
                boolean r3 = r0.mo24886p()
                r9 = 7
                r10 = 6
                r11 = 3
                r13 = 4
                r14 = 2
                r15 = 10
                r12 = 9
                r4 = 5
                r5 = 8
                r6 = 1
                r7 = 0
                r8 = 0
                if (r3 == 0) goto L_0x00c1
                java.lang.String r3 = r0.mo24884m(r1, r7)
                java.lang.String r6 = r0.mo24884m(r1, r6)
                java.lang.String r7 = r0.mo24884m(r1, r14)
                java.lang.String r11 = r0.mo24884m(r1, r11)
                java.lang.String r13 = r0.mo24884m(r1, r13)
                r14 = r2[r4]
                java.lang.Object r4 = r0.mo24895y(r1, r4, r14, r8)
                java.lang.String r10 = r0.mo24884m(r1, r10)
                com.carrefour.fid.android.domain.models.service.models.StoreAddress$a r14 = com.carrefour.fid.android.domain.models.service.models.StoreAddress.C38130a.f96582a
                java.lang.Object r9 = r0.mo24885n(r1, r9, r14, r8)
                r14 = r2[r5]
                java.lang.Object r5 = r0.mo24895y(r1, r5, r14, r8)
                r14 = r2[r12]
                java.lang.Object r12 = r0.mo24895y(r1, r12, r14, r8)
                r14 = r2[r15]
                java.lang.Object r14 = r0.mo24895y(r1, r15, r14, r8)
                r15 = 11
                java.lang.String r15 = r0.mo24884m(r1, r15)
                r8 = 12
                java.lang.String r8 = r0.mo24884m(r1, r8)
                r20 = r3
                r3 = 13
                java.lang.String r3 = r0.mo24884m(r1, r3)
                r19 = r3
                r3 = 14
                java.lang.String r3 = r0.mo24884m(r1, r3)
                r18 = r3
                r3 = 15
                boolean r3 = r0.mo24866C(r1, r3)
                r17 = r3
                r3 = 16
                boolean r3 = r0.mo24866C(r1, r3)
                r16 = r7
                r7 = 17
                r2 = r2[r7]
                r38 = r6
                r6 = 0
                java.lang.Object r2 = r0.mo24895y(r1, r7, r2, r6)
                r6 = 262143(0x3ffff, float:3.6734E-40)
                r24 = r38
                r21 = r3
                r28 = r10
                r29 = r15
                r7 = r16
                r15 = r12
                r16 = r14
                r14 = r9
                r9 = r13
                r34 = r6
                r6 = r4
                r4 = r34
                r35 = r11
                r11 = r5
                r5 = r20
                r20 = r17
                r17 = r8
                r8 = r35
                r36 = r19
                r19 = r18
                r18 = r36
                goto L_0x0216
            L_0x00c1:
                r3 = r6
                r6 = r8
                r8 = r7
                r7 = 17
                r33 = r3
                r3 = r6
                r4 = r3
                r10 = r4
                r11 = r10
                r13 = r11
                r14 = r13
                r23 = r14
                r24 = r23
                r25 = r24
                r26 = r25
                r27 = r26
                r28 = r27
                r29 = r28
                r30 = r29
                r31 = r30
                r32 = r31
                r6 = r8
                r22 = r6
            L_0x00e5:
                if (r33 == 0) goto L_0x01fe
                int r9 = r0.mo24931o(r1)
                switch(r9) {
                    case -1: goto L_0x01f2;
                    case 0: goto L_0x01e1;
                    case 1: goto L_0x01d4;
                    case 2: goto L_0x01c7;
                    case 3: goto L_0x01ba;
                    case 4: goto L_0x01ad;
                    case 5: goto L_0x019f;
                    case 6: goto L_0x018c;
                    case 7: goto L_0x017e;
                    case 8: goto L_0x0170;
                    case 9: goto L_0x0162;
                    case 10: goto L_0x0154;
                    case 11: goto L_0x0146;
                    case 12: goto L_0x0138;
                    case 13: goto L_0x012a;
                    case 14: goto L_0x011c;
                    case 15: goto L_0x010b;
                    case 16: goto L_0x00ff;
                    case 17: goto L_0x00f4;
                    default: goto L_0x00ee;
                }
            L_0x00ee:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>((int) r9)
                throw r0
            L_0x00f4:
                r9 = r2[r7]
                java.lang.Object r10 = r0.mo24895y(r1, r7, r9, r10)
                r9 = 131072(0x20000, float:1.83671E-40)
                r8 = r8 | r9
                goto L_0x01fb
            L_0x00ff:
                r9 = 16
                boolean r22 = r0.mo24866C(r1, r9)
                r16 = 65536(0x10000, float:9.18355E-41)
                r8 = r8 | r16
                goto L_0x01fb
            L_0x010b:
                r6 = 15
                r9 = 16
                boolean r16 = r0.mo24866C(r1, r6)
                r17 = 32768(0x8000, float:4.5918E-41)
                r8 = r8 | r17
                r6 = r16
                goto L_0x01fb
            L_0x011c:
                r7 = 14
                r9 = 16
                r16 = 15
                java.lang.String r32 = r0.mo24884m(r1, r7)
                r8 = r8 | 16384(0x4000, float:2.2959E-41)
                goto L_0x01ef
            L_0x012a:
                r7 = 13
                r9 = 16
                r16 = 15
                java.lang.String r31 = r0.mo24884m(r1, r7)
                r8 = r8 | 8192(0x2000, float:1.14794E-41)
                goto L_0x01ef
            L_0x0138:
                r7 = 12
                r9 = 16
                r16 = 15
                java.lang.String r30 = r0.mo24884m(r1, r7)
                r8 = r8 | 4096(0x1000, float:5.74E-42)
                goto L_0x01ef
            L_0x0146:
                r7 = 11
                r9 = 16
                r16 = 15
                java.lang.String r29 = r0.mo24884m(r1, r7)
                r8 = r8 | 2048(0x800, float:2.87E-42)
                goto L_0x01ef
            L_0x0154:
                r9 = 16
                r16 = 15
                r7 = r2[r15]
                java.lang.Object r4 = r0.mo24895y(r1, r15, r7, r4)
                r8 = r8 | 1024(0x400, float:1.435E-42)
                goto L_0x01ef
            L_0x0162:
                r9 = 16
                r16 = 15
                r7 = r2[r12]
                java.lang.Object r13 = r0.mo24895y(r1, r12, r7, r13)
                r8 = r8 | 512(0x200, float:7.175E-43)
                goto L_0x01ef
            L_0x0170:
                r9 = 16
                r16 = 15
                r7 = r2[r5]
                java.lang.Object r11 = r0.mo24895y(r1, r5, r7, r11)
                r8 = r8 | 256(0x100, float:3.59E-43)
                goto L_0x01ef
            L_0x017e:
                r9 = 16
                r16 = 15
                com.carrefour.fid.android.domain.models.service.models.StoreAddress$a r7 = com.carrefour.fid.android.domain.models.service.models.StoreAddress.C38130a.f96582a
                r5 = 7
                java.lang.Object r14 = r0.mo24885n(r1, r5, r7, r14)
                r8 = r8 | 128(0x80, float:1.794E-43)
                goto L_0x0198
            L_0x018c:
                r5 = 7
                r7 = 6
                r9 = 16
                r16 = 15
                java.lang.String r28 = r0.mo24884m(r1, r7)
                r8 = r8 | 64
            L_0x0198:
                r9 = r5
                r5 = 8
                r7 = 17
                goto L_0x00e5
            L_0x019f:
                r5 = 5
                r9 = 16
                r16 = 15
                r7 = r2[r5]
                java.lang.Object r3 = r0.mo24895y(r1, r5, r7, r3)
                r8 = r8 | 32
                goto L_0x01ed
            L_0x01ad:
                r5 = 5
                r7 = 4
                r9 = 16
                r16 = 15
                java.lang.String r27 = r0.mo24884m(r1, r7)
                r8 = r8 | 16
                goto L_0x01ed
            L_0x01ba:
                r5 = 3
                r7 = 4
                r9 = 16
                r16 = 15
                java.lang.String r26 = r0.mo24884m(r1, r5)
                r8 = r8 | 8
                goto L_0x01ed
            L_0x01c7:
                r5 = 2
                r7 = 4
                r9 = 16
                r16 = 15
                java.lang.String r25 = r0.mo24884m(r1, r5)
                r8 = r8 | 4
                goto L_0x01ed
            L_0x01d4:
                r5 = 1
                r7 = 4
                r9 = 16
                r16 = 15
                java.lang.String r24 = r0.mo24884m(r1, r5)
                r8 = r8 | 2
                goto L_0x01ed
            L_0x01e1:
                r5 = 0
                r7 = 4
                r9 = 16
                r16 = 15
                java.lang.String r23 = r0.mo24884m(r1, r5)
                r8 = r8 | 1
            L_0x01ed:
                r5 = 8
            L_0x01ef:
                r7 = 17
                goto L_0x01fb
            L_0x01f2:
                r5 = 0
                r9 = 16
                r16 = 15
                r33 = r5
                r5 = 8
            L_0x01fb:
                r9 = 7
                goto L_0x00e5
            L_0x01fe:
                r16 = r4
                r20 = r6
                r4 = r8
                r2 = r10
                r15 = r13
                r21 = r22
                r5 = r23
                r7 = r25
                r8 = r26
                r9 = r27
                r17 = r30
                r18 = r31
                r19 = r32
                r6 = r3
            L_0x0216:
                r0.mo24876c(r1)
                com.carrefour.fid.android.domain.models.service.models.l r0 = new com.carrefour.fid.android.domain.models.service.models.l
                r3 = r0
                r10 = r6
                java.util.List r10 = (java.util.List) r10
                r12 = r14
                com.carrefour.fid.android.domain.models.service.models.StoreAddress r12 = (com.carrefour.fid.android.domain.models.service.models.StoreAddress) r12
                r13 = r11
                java.util.List r13 = (java.util.List) r13
                r14 = r15
                java.util.List r14 = (java.util.List) r14
                r15 = r16
                java.util.List r15 = (java.util.List) r15
                r22 = r2
                java.util.List r22 = (java.util.List) r22
                r23 = 0
                r6 = r24
                r11 = r28
                r16 = r29
                r3.<init>((int) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.util.List) r10, (java.lang.String) r11, (com.carrefour.fid.android.domain.models.service.models.StoreAddress) r12, (java.util.List) r13, (java.util.List) r14, (java.util.List) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (boolean) r20, (boolean) r21, (java.util.List) r22, (kotlinx.serialization.internal.C12295n1) r23)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.service.models.C38163l.C38164a.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.domain.models.service.models.l");
        }

        /* renamed from: b */
        public void serialize(@C12579k C12244g gVar, @C12579k C38163l lVar) {
            Intrinsics.checkNotNullParameter(gVar, "encoder");
            Intrinsics.checkNotNullParameter(lVar, "value");
            C12217f descriptor = getDescriptor();
            C12239d b = gVar.mo24906b(descriptor);
            C38163l.m158175N(lVar, b, descriptor);
            b.mo24907c(descriptor);
        }

        @C12579k
        public C12248g<?>[] childSerializers() {
            C12248g<?>[] a = C38163l.f96666s;
            C12310s1 s1Var = C12310s1.f30117a;
            C12278i iVar = C12278i.f30070a;
            return new C12248g[]{s1Var, s1Var, s1Var, s1Var, s1Var, a[5], s1Var, C12197a.m48817q(StoreAddress.C38130a.f96582a), a[8], a[9], a[10], s1Var, s1Var, s1Var, s1Var, iVar, iVar, a[17]};
        }

        @C12579k
        public C12217f getDescriptor() {
            return f96686b;
        }

        @C12579k
        public C12248g<?>[] typeParametersSerializers() {
            return C12327y.C12328a.m49635a(this);
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.service.models.l$b */
    public static final class C38165b {
        public /* synthetic */ C38165b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<C38163l> serializer() {
            return C38164a.f96685a;
        }

        public C38165b() {
        }
    }

    public C38163l() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (StoreAddress) null, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, false, false, (List) null, (int) C16476b.f40862n, (DefaultConstructorMarker) null);
    }

    @C11384m
    /* renamed from: N */
    public static final /* synthetic */ void m158175N(C38163l lVar, C12239d dVar, C12217f fVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        C12248g<Object>[] gVarArr = f96666s;
        boolean z18 = false;
        if (!dVar.mo24897A(fVar, 0) && Intrinsics.areEqual((Object) lVar.f96667a, (Object) "")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            dVar.mo24929z(fVar, 0, lVar.f96667a);
        }
        if (!dVar.mo24897A(fVar, 1) && Intrinsics.areEqual((Object) lVar.f96668b, (Object) "")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            dVar.mo24929z(fVar, 1, lVar.f96668b);
        }
        if (!dVar.mo24897A(fVar, 2) && Intrinsics.areEqual((Object) lVar.f96669c, (Object) "")) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            dVar.mo24929z(fVar, 2, lVar.f96669c);
        }
        if (!dVar.mo24897A(fVar, 3) && Intrinsics.areEqual((Object) lVar.f96670d, (Object) "")) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            dVar.mo24929z(fVar, 3, lVar.f96670d);
        }
        if (!dVar.mo24897A(fVar, 4) && Intrinsics.areEqual((Object) lVar.f96671e, (Object) "")) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            dVar.mo24929z(fVar, 4, lVar.f96671e);
        }
        if (!dVar.mo24897A(fVar, 5) && Intrinsics.areEqual((Object) lVar.f96672f, (Object) CollectionsKt__CollectionsKt.m40441E())) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z6) {
            dVar.mo24899D(fVar, 5, gVarArr[5], lVar.f96672f);
        }
        if (!dVar.mo24897A(fVar, 6) && Intrinsics.areEqual((Object) lVar.f96673g, (Object) "")) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z7) {
            dVar.mo24929z(fVar, 6, lVar.f96673g);
        }
        if (!dVar.mo24897A(fVar, 7) && lVar.f96674h == null) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z8) {
            dVar.mo24912i(fVar, 7, StoreAddress.C38130a.f96582a, lVar.f96674h);
        }
        if (!dVar.mo24897A(fVar, 8) && Intrinsics.areEqual((Object) lVar.f96675i, (Object) CollectionsKt__CollectionsKt.m40441E())) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            dVar.mo24899D(fVar, 8, gVarArr[8], lVar.f96675i);
        }
        if (!dVar.mo24897A(fVar, 9) && Intrinsics.areEqual((Object) lVar.f96676j, (Object) CollectionsKt__CollectionsKt.m40441E())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            dVar.mo24899D(fVar, 9, gVarArr[9], lVar.f96676j);
        }
        if (!dVar.mo24897A(fVar, 10) && Intrinsics.areEqual((Object) lVar.f96677k, (Object) CollectionsKt__CollectionsKt.m40441E())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            dVar.mo24899D(fVar, 10, gVarArr[10], lVar.f96677k);
        }
        if (!dVar.mo24897A(fVar, 11) && Intrinsics.areEqual((Object) lVar.f96678l, (Object) "")) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            dVar.mo24929z(fVar, 11, lVar.f96678l);
        }
        if (!dVar.mo24897A(fVar, 12) && Intrinsics.areEqual((Object) lVar.f96679m, (Object) "")) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13) {
            dVar.mo24929z(fVar, 12, lVar.f96679m);
        }
        if (!dVar.mo24897A(fVar, 13) && Intrinsics.areEqual((Object) lVar.f96680n, (Object) "")) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z14) {
            dVar.mo24929z(fVar, 13, lVar.f96680n);
        }
        if (!dVar.mo24897A(fVar, 14) && Intrinsics.areEqual((Object) lVar.f96681o, (Object) "")) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (z15) {
            dVar.mo24929z(fVar, 14, lVar.f96681o);
        }
        if (!dVar.mo24897A(fVar, 15) && !lVar.f96682p) {
            z16 = false;
        } else {
            z16 = true;
        }
        if (z16) {
            dVar.mo24928y(fVar, 15, lVar.f96682p);
        }
        if (!dVar.mo24897A(fVar, 16) && !lVar.f96683q) {
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            dVar.mo24928y(fVar, 16, lVar.f96683q);
        }
        if (dVar.mo24897A(fVar, 17) || !Intrinsics.areEqual((Object) lVar.f96684r, (Object) CollectionsKt__CollectionsKt.m40441E())) {
            z18 = true;
        }
        if (z18) {
            dVar.mo24899D(fVar, 17, gVarArr[17], lVar.f96684r);
        }
    }

    /* renamed from: u */
    public static /* synthetic */ C38163l m158177u(C38163l lVar, String str, String str2, String str3, String str4, String str5, List list, String str6, StoreAddress storeAddress, List list2, List list3, List list4, String str7, String str8, String str9, String str10, boolean z, boolean z2, List list5, int i, Object obj) {
        C38163l lVar2 = lVar;
        int i2 = i;
        return lVar.mo119390t((i2 & 1) != 0 ? lVar2.f96667a : str, (i2 & 2) != 0 ? lVar2.f96668b : str2, (i2 & 4) != 0 ? lVar2.f96669c : str3, (i2 & 8) != 0 ? lVar2.f96670d : str4, (i2 & 16) != 0 ? lVar2.f96671e : str5, (i2 & 32) != 0 ? lVar2.f96672f : list, (i2 & 64) != 0 ? lVar2.f96673g : str6, (i2 & 128) != 0 ? lVar2.f96674h : storeAddress, (i2 & 256) != 0 ? lVar2.f96675i : list2, (i2 & 512) != 0 ? lVar2.f96676j : list3, (i2 & 1024) != 0 ? lVar2.f96677k : list4, (i2 & 2048) != 0 ? lVar2.f96678l : str7, (i2 & 4096) != 0 ? lVar2.f96679m : str8, (i2 & 8192) != 0 ? lVar2.f96680n : str9, (i2 & 16384) != 0 ? lVar2.f96681o : str10, (i2 & 32768) != 0 ? lVar2.f96682p : z, (i2 & 65536) != 0 ? lVar2.f96683q : z2, (i2 & 131072) != 0 ? lVar2.f96684r : list5);
    }

    @C12579k
    /* renamed from: A */
    public final String mo119357A() {
        return this.f96670d;
    }

    @C12579k
    /* renamed from: B */
    public final String mo119358B() {
        return this.f96678l;
    }

    @C12579k
    /* renamed from: C */
    public final String mo119359C() {
        return this.f96673g;
    }

    @C12579k
    /* renamed from: D */
    public final String mo119360D() {
        return this.f96681o;
    }

    @C12579k
    /* renamed from: E */
    public final String mo119361E() {
        return this.f96667a;
    }

    @C12579k
    /* renamed from: F */
    public final List<C38154g> mo119362F() {
        return this.f96676j;
    }

    @C12579k
    /* renamed from: G */
    public final List<C38157h> mo119363G() {
        return this.f96675i;
    }

    @C12579k
    /* renamed from: H */
    public final List<Boolean> mo119364H() {
        return this.f96672f;
    }

    /* renamed from: I */
    public final boolean mo119365I() {
        return this.f96682p;
    }

    @C12579k
    /* renamed from: J */
    public final String mo119366J() {
        return this.f96669c;
    }

    @C12579k
    /* renamed from: K */
    public final List<StoreService> mo119367K() {
        return this.f96677k;
    }

    @C12579k
    /* renamed from: L */
    public final String mo119368L() {
        return this.f96671e;
    }

    /* renamed from: M */
    public final boolean mo119369M() {
        return this.f96683q;
    }

    @C12579k
    /* renamed from: b */
    public final String mo119370b() {
        return this.f96667a;
    }

    @C12579k
    /* renamed from: c */
    public final List<C38154g> mo119371c() {
        return this.f96676j;
    }

    @C12579k
    /* renamed from: d */
    public final List<StoreService> mo119372d() {
        return this.f96677k;
    }

    @C12579k
    /* renamed from: e */
    public final String mo119373e() {
        return this.f96678l;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38163l)) {
            return false;
        }
        C38163l lVar = (C38163l) obj;
        return Intrinsics.areEqual((Object) this.f96667a, (Object) lVar.f96667a) && Intrinsics.areEqual((Object) this.f96668b, (Object) lVar.f96668b) && Intrinsics.areEqual((Object) this.f96669c, (Object) lVar.f96669c) && Intrinsics.areEqual((Object) this.f96670d, (Object) lVar.f96670d) && Intrinsics.areEqual((Object) this.f96671e, (Object) lVar.f96671e) && Intrinsics.areEqual((Object) this.f96672f, (Object) lVar.f96672f) && Intrinsics.areEqual((Object) this.f96673g, (Object) lVar.f96673g) && Intrinsics.areEqual((Object) this.f96674h, (Object) lVar.f96674h) && Intrinsics.areEqual((Object) this.f96675i, (Object) lVar.f96675i) && Intrinsics.areEqual((Object) this.f96676j, (Object) lVar.f96676j) && Intrinsics.areEqual((Object) this.f96677k, (Object) lVar.f96677k) && Intrinsics.areEqual((Object) this.f96678l, (Object) lVar.f96678l) && Intrinsics.areEqual((Object) this.f96679m, (Object) lVar.f96679m) && Intrinsics.areEqual((Object) this.f96680n, (Object) lVar.f96680n) && Intrinsics.areEqual((Object) this.f96681o, (Object) lVar.f96681o) && this.f96682p == lVar.f96682p && this.f96683q == lVar.f96683q && Intrinsics.areEqual((Object) this.f96684r, (Object) lVar.f96684r);
    }

    @C12579k
    /* renamed from: f */
    public final String mo119375f() {
        return this.f96679m;
    }

    @C12579k
    /* renamed from: g */
    public final String mo119376g() {
        return this.f96680n;
    }

    @C12579k
    /* renamed from: h */
    public final String mo119377h() {
        return this.f96681o;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f96667a.hashCode() * 31) + this.f96668b.hashCode()) * 31) + this.f96669c.hashCode()) * 31) + this.f96670d.hashCode()) * 31) + this.f96671e.hashCode()) * 31) + this.f96672f.hashCode()) * 31) + this.f96673g.hashCode()) * 31;
        StoreAddress storeAddress = this.f96674h;
        int hashCode2 = (((((((((((((((hashCode + (storeAddress == null ? 0 : storeAddress.hashCode())) * 31) + this.f96675i.hashCode()) * 31) + this.f96676j.hashCode()) * 31) + this.f96677k.hashCode()) * 31) + this.f96678l.hashCode()) * 31) + this.f96679m.hashCode()) * 31) + this.f96680n.hashCode()) * 31) + this.f96681o.hashCode()) * 31;
        boolean z = this.f96682p;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f96683q;
        if (!z3) {
            z2 = z3;
        }
        return ((i + (z2 ? 1 : 0)) * 31) + this.f96684r.hashCode();
    }

    /* renamed from: i */
    public final boolean mo119379i() {
        return this.f96682p;
    }

    /* renamed from: j */
    public final boolean mo119380j() {
        return this.f96683q;
    }

    @C12579k
    /* renamed from: k */
    public final List<DeliveryFee> mo119381k() {
        return this.f96684r;
    }

    @C12579k
    /* renamed from: l */
    public final String mo119382l() {
        return this.f96668b;
    }

    @C12579k
    /* renamed from: m */
    public final String mo119383m() {
        return this.f96669c;
    }

    @C12579k
    /* renamed from: n */
    public final String mo119384n() {
        return this.f96670d;
    }

    @C12579k
    /* renamed from: o */
    public final String mo119385o() {
        return this.f96671e;
    }

    @C12579k
    /* renamed from: p */
    public final List<Boolean> mo119386p() {
        return this.f96672f;
    }

    @C12579k
    /* renamed from: q */
    public final String mo119387q() {
        return this.f96673g;
    }

    @C12580l
    /* renamed from: r */
    public final StoreAddress mo119388r() {
        return this.f96674h;
    }

    @C12579k
    /* renamed from: s */
    public final List<C38157h> mo119389s() {
        return this.f96675i;
    }

    @C12579k
    /* renamed from: t */
    public final C38163l mo119390t(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k List<Boolean> list, @C12579k String str6, @C12580l StoreAddress storeAddress, @C12579k List<C38157h> list2, @C12579k List<C38154g> list3, @C12579k List<StoreService> list4, @C12579k String str7, @C12579k String str8, @C12579k String str9, @C12579k String str10, boolean z, boolean z2, @C12579k List<DeliveryFee> list5) {
        String str11 = str;
        Intrinsics.checkNotNullParameter(str11, "name");
        Intrinsics.checkNotNullParameter(str2, "banner");
        Intrinsics.checkNotNullParameter(str3, C0861a.f2689A);
        Intrinsics.checkNotNullParameter(str4, "format");
        Intrinsics.checkNotNullParameter(str5, "type");
        Intrinsics.checkNotNullParameter(list, "passDays");
        Intrinsics.checkNotNullParameter(str6, "id");
        Intrinsics.checkNotNullParameter(list2, "openingPattern");
        Intrinsics.checkNotNullParameter(list3, "openingExceptionalPattern");
        Intrinsics.checkNotNullParameter(list4, "storeServices");
        Intrinsics.checkNotNullParameter(str7, "gln");
        Intrinsics.checkNotNullParameter(str8, "anabelKey");
        Intrinsics.checkNotNullParameter(str9, "distance");
        Intrinsics.checkNotNullParameter(str10, "minOrderAmount");
        Intrinsics.checkNotNullParameter(list5, "deliveryFees");
        return new C38163l(str11, str2, str3, str4, str5, list, str6, storeAddress, list2, list3, list4, str7, str8, str9, str10, z, z2, list5);
    }

    @C12579k
    public String toString() {
        String str = this.f96667a;
        String str2 = this.f96668b;
        String str3 = this.f96669c;
        String str4 = this.f96670d;
        String str5 = this.f96671e;
        List<Boolean> list = this.f96672f;
        String str6 = this.f96673g;
        StoreAddress storeAddress = this.f96674h;
        List<C38157h> list2 = this.f96675i;
        List<C38154g> list3 = this.f96676j;
        List<StoreService> list4 = this.f96677k;
        String str7 = this.f96678l;
        String str8 = this.f96679m;
        String str9 = this.f96680n;
        String str10 = this.f96681o;
        boolean z = this.f96682p;
        boolean z2 = this.f96683q;
        List<DeliveryFee> list5 = this.f96684r;
        return "Store(name=" + str + ", banner=" + str2 + ", phoneNumber=" + str3 + ", format=" + str4 + ", type=" + str5 + ", passDays=" + list + ", id=" + str6 + ", address=" + storeAddress + ", openingPattern=" + list2 + ", openingExceptionalPattern=" + list3 + ", storeServices=" + list4 + ", gln=" + str7 + ", anabelKey=" + str8 + ", distance=" + str9 + ", minOrderAmount=" + str10 + ", paymentOnSiteActivated=" + z + ", isLoyaltyActivated=" + z2 + ", deliveryFees=" + list5 + ")";
    }

    @C12580l
    /* renamed from: v */
    public final StoreAddress mo119392v() {
        return this.f96674h;
    }

    @C12579k
    /* renamed from: w */
    public final String mo119393w() {
        return this.f96679m;
    }

    @C12579k
    /* renamed from: x */
    public final String mo119394x() {
        return this.f96668b;
    }

    @C12579k
    /* renamed from: y */
    public final List<DeliveryFee> mo119395y() {
        return this.f96684r;
    }

    @C12579k
    /* renamed from: z */
    public final String mo119396z() {
        return this.f96680n;
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ C38163l(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, StoreAddress storeAddress, List list2, List list3, List list4, String str7, String str8, String str9, String str10, boolean z, boolean z2, List list5, C12295n1 n1Var) {
        int i2 = i;
        if ((i2 & 0) != 0) {
            C12261c1.m49256b(i, 0, C38164a.f96685a.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.f96667a = "";
        } else {
            this.f96667a = str;
        }
        if ((i2 & 2) == 0) {
            this.f96668b = "";
        } else {
            this.f96668b = str2;
        }
        if ((i2 & 4) == 0) {
            this.f96669c = "";
        } else {
            this.f96669c = str3;
        }
        if ((i2 & 8) == 0) {
            this.f96670d = "";
        } else {
            this.f96670d = str4;
        }
        if ((i2 & 16) == 0) {
            this.f96671e = "";
        } else {
            this.f96671e = str5;
        }
        this.f96672f = (i2 & 32) == 0 ? CollectionsKt__CollectionsKt.m40441E() : list;
        if ((i2 & 64) == 0) {
            this.f96673g = "";
        } else {
            this.f96673g = str6;
        }
        this.f96674h = (i2 & 128) == 0 ? null : storeAddress;
        this.f96675i = (i2 & 256) == 0 ? CollectionsKt__CollectionsKt.m40441E() : list2;
        this.f96676j = (i2 & 512) == 0 ? CollectionsKt__CollectionsKt.m40441E() : list3;
        this.f96677k = (i2 & 1024) == 0 ? CollectionsKt__CollectionsKt.m40441E() : list4;
        if ((i2 & 2048) == 0) {
            this.f96678l = "";
        } else {
            this.f96678l = str7;
        }
        if ((i2 & 4096) == 0) {
            this.f96679m = "";
        } else {
            this.f96679m = str8;
        }
        if ((i2 & 8192) == 0) {
            this.f96680n = "";
        } else {
            this.f96680n = str9;
        }
        if ((i2 & 16384) == 0) {
            this.f96681o = "";
        } else {
            this.f96681o = str10;
        }
        if ((32768 & i2) == 0) {
            this.f96682p = false;
        } else {
            this.f96682p = z;
        }
        if ((65536 & i2) == 0) {
            this.f96683q = false;
        } else {
            this.f96683q = z2;
        }
        this.f96684r = (i2 & 131072) == 0 ? CollectionsKt__CollectionsKt.m40441E() : list5;
    }

    public C38163l(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k List<Boolean> list, @C12579k String str6, @C12580l StoreAddress storeAddress, @C12579k List<C38157h> list2, @C12579k List<C38154g> list3, @C12579k List<StoreService> list4, @C12579k String str7, @C12579k String str8, @C12579k String str9, @C12579k String str10, boolean z, boolean z2, @C12579k List<DeliveryFee> list5) {
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        List<Boolean> list6 = list;
        String str16 = str6;
        List<C38157h> list7 = list2;
        List<C38154g> list8 = list3;
        List<StoreService> list9 = list4;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        List<DeliveryFee> list10 = list5;
        Intrinsics.checkNotNullParameter(str11, "name");
        Intrinsics.checkNotNullParameter(str12, "banner");
        Intrinsics.checkNotNullParameter(str13, C0861a.f2689A);
        Intrinsics.checkNotNullParameter(str14, "format");
        Intrinsics.checkNotNullParameter(str15, "type");
        Intrinsics.checkNotNullParameter(list6, "passDays");
        Intrinsics.checkNotNullParameter(str16, "id");
        Intrinsics.checkNotNullParameter(list7, "openingPattern");
        Intrinsics.checkNotNullParameter(list8, "openingExceptionalPattern");
        Intrinsics.checkNotNullParameter(list9, "storeServices");
        Intrinsics.checkNotNullParameter(str17, "gln");
        Intrinsics.checkNotNullParameter(str18, "anabelKey");
        Intrinsics.checkNotNullParameter(str19, "distance");
        Intrinsics.checkNotNullParameter(str20, "minOrderAmount");
        Intrinsics.checkNotNullParameter(list10, "deliveryFees");
        this.f96667a = str11;
        this.f96668b = str12;
        this.f96669c = str13;
        this.f96670d = str14;
        this.f96671e = str15;
        this.f96672f = list6;
        this.f96673g = str16;
        this.f96674h = storeAddress;
        this.f96675i = list7;
        this.f96676j = list8;
        this.f96677k = list9;
        this.f96678l = str17;
        this.f96679m = str18;
        this.f96680n = str19;
        this.f96681o = str20;
        this.f96682p = z;
        this.f96683q = z2;
        this.f96684r = list10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C38163l(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.util.List r25, java.lang.String r26, com.carrefour.fid.android.domain.models.service.models.StoreAddress r27, java.util.List r28, java.util.List r29, java.util.List r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, boolean r35, boolean r36, java.util.List r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            r19 = this;
            r0 = r38
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r20
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r21
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r22
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            r5 = r2
            goto L_0x0024
        L_0x0022:
            r5 = r23
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = r2
            goto L_0x002c
        L_0x002a:
            r6 = r24
        L_0x002c:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0035
            java.util.List r7 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0037
        L_0x0035:
            r7 = r25
        L_0x0037:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003d
            r8 = r2
            goto L_0x003f
        L_0x003d:
            r8 = r26
        L_0x003f:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0045
            r9 = 0
            goto L_0x0047
        L_0x0045:
            r9 = r27
        L_0x0047:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0050
            java.util.List r10 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0052
        L_0x0050:
            r10 = r28
        L_0x0052:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x005b
            java.util.List r11 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x005d
        L_0x005b:
            r11 = r29
        L_0x005d:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0066
            java.util.List r12 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0068
        L_0x0066:
            r12 = r30
        L_0x0068:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x006e
            r13 = r2
            goto L_0x0070
        L_0x006e:
            r13 = r31
        L_0x0070:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0076
            r14 = r2
            goto L_0x0078
        L_0x0076:
            r14 = r32
        L_0x0078:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x007e
            r15 = r2
            goto L_0x0080
        L_0x007e:
            r15 = r33
        L_0x0080:
            r39 = r2
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0089
            r2 = r39
            goto L_0x008b
        L_0x0089:
            r2 = r34
        L_0x008b:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            r17 = 0
            if (r16 == 0) goto L_0x0097
            r16 = r17
            goto L_0x0099
        L_0x0097:
            r16 = r35
        L_0x0099:
            r18 = 65536(0x10000, float:9.18355E-41)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r17 = r36
        L_0x00a2:
            r18 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r18
            if (r0 == 0) goto L_0x00ad
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x00af
        L_0x00ad:
            r0 = r37
        L_0x00af:
            r20 = r19
            r21 = r1
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r6
            r26 = r7
            r27 = r8
            r28 = r9
            r29 = r10
            r30 = r11
            r31 = r12
            r32 = r13
            r33 = r14
            r34 = r15
            r35 = r2
            r36 = r16
            r37 = r17
            r38 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.service.models.C38163l.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, com.carrefour.fid.android.domain.models.service.models.StoreAddress, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
