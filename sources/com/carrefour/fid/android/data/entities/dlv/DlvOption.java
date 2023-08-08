package com.carrefour.fid.android.data.entities.dlv;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.dlv.DlvCode;
import com.carrefour.fid.android.data.entities.dlv.DlvDuration;
import com.carrefour.fid.android.data.entities.dlv.DlvFee;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C12439o
@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000 ;2\u00020\u0001:\u0002<=B;\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b5\u00106Bc\b\u0017\u0012\u0006\u00107\u001a\u00020\u001b\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b5\u0010:J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0010HÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0010HÆ\u0001J\t\u0010\u001a\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0013\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R \u0010\u0015\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010%\u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010'R \u0010\u0016\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010+\u0012\u0004\b.\u0010$\u001a\u0004\b,\u0010-R \u0010\u0017\u001a\u00020\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010/\u0012\u0004\b2\u0010$\u001a\u0004\b0\u00101R \u0010\u0018\u001a\u00020\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010/\u0012\u0004\b4\u0010$\u001a\u0004\b3\u00101¨\u0006>"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/dlv/DlvOption;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "Lcom/carrefour/fid/android/data/entities/dlv/DlvCode;", "component1", "", "component2", "component3", "Lcom/carrefour/fid/android/data/entities/dlv/DlvFee;", "component4", "Lcom/carrefour/fid/android/data/entities/dlv/DlvDuration;", "component5", "component6", "code", "category", "id", "fee", "minDuration", "maxDuration", "copy", "toString", "", "hashCode", "other", "", "equals", "Lcom/carrefour/fid/android/data/entities/dlv/DlvCode;", "getCode", "()Lcom/carrefour/fid/android/data/entities/dlv/DlvCode;", "getCode$annotations", "()V", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "getCategory$annotations", "getId", "getId$annotations", "Lcom/carrefour/fid/android/data/entities/dlv/DlvFee;", "getFee", "()Lcom/carrefour/fid/android/data/entities/dlv/DlvFee;", "getFee$annotations", "Lcom/carrefour/fid/android/data/entities/dlv/DlvDuration;", "getMinDuration", "()Lcom/carrefour/fid/android/data/entities/dlv/DlvDuration;", "getMinDuration$annotations", "getMaxDuration", "getMaxDuration$annotations", "<init>", "(Lcom/carrefour/fid/android/data/entities/dlv/DlvCode;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/dlv/DlvFee;Lcom/carrefour/fid/android/data/entities/dlv/DlvDuration;Lcom/carrefour/fid/android/data/entities/dlv/DlvDuration;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILcom/carrefour/fid/android/data/entities/dlv/DlvCode;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/dlv/DlvFee;Lcom/carrefour/fid/android/data/entities/dlv/DlvDuration;Lcom/carrefour/fid/android/data/entities/dlv/DlvDuration;Lkotlinx/serialization/internal/n1;)V", "Companion", "a", "b", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class DlvOption {
    public static final int $stable = 0;
    @C12579k
    public static final C36434b Companion = new C36434b((DefaultConstructorMarker) null);
    @C12580l
    private final String category;
    @C12579k
    private final DlvCode code;
    @C12579k
    private final DlvFee fee;
    @C12579k

    /* renamed from: id */
    private final String f90094id;
    @C12579k
    private final DlvDuration maxDuration;
    @C12579k
    private final DlvDuration minDuration;

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.data.entities.dlv.DlvOption$a */
    public static final class C36433a implements C12327y<DlvOption> {
        @C12579k

        /* renamed from: a */
        public static final C36433a f90095a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f90096b;

        /* renamed from: c */
        public static final int f90097c = 0;

        static {
            C36433a aVar = new C36433a();
            f90095a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.data.entities.dlv.DlvOption", aVar, 6);
            pluginGeneratedSerialDescriptor.mo24966k("code", false);
            pluginGeneratedSerialDescriptor.mo24966k("category", true);
            pluginGeneratedSerialDescriptor.mo24966k("gtin", false);
            pluginGeneratedSerialDescriptor.mo24966k("fee", false);
            pluginGeneratedSerialDescriptor.mo24966k("min_duration", false);
            pluginGeneratedSerialDescriptor.mo24966k("max_duration", false);
            f90096b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0093, code lost:
            r3 = 5;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.carrefour.fid.android.data.entities.dlv.DlvOption deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r17) {
            /*
                r16 = this;
                r0 = r17
                java.lang.String r1 = "decoder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                kotlinx.serialization.descriptors.f r1 = r16.getDescriptor()
                kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
                boolean r2 = r0.mo24886p()
                r3 = 5
                r4 = 3
                r5 = 4
                r6 = 2
                r7 = 1
                r8 = 0
                r9 = 0
                if (r2 == 0) goto L_0x0043
                com.carrefour.fid.android.data.entities.dlv.DlvCode$a r2 = com.carrefour.fid.android.data.entities.dlv.DlvCode.C36427a.f90084a
                java.lang.Object r2 = r0.mo24895y(r1, r8, r2, r9)
                kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
                java.lang.Object r7 = r0.mo24885n(r1, r7, r8, r9)
                java.lang.String r6 = r0.mo24884m(r1, r6)
                com.carrefour.fid.android.data.entities.dlv.DlvFee$a r8 = com.carrefour.fid.android.data.entities.dlv.DlvFee.C36431a.f90091a
                java.lang.Object r4 = r0.mo24895y(r1, r4, r8, r9)
                com.carrefour.fid.android.data.entities.dlv.DlvDuration$a r8 = com.carrefour.fid.android.data.entities.dlv.DlvDuration.C36429a.f90088a
                java.lang.Object r5 = r0.mo24895y(r1, r5, r8, r9)
                java.lang.Object r3 = r0.mo24895y(r1, r3, r8, r9)
                r8 = 63
                r10 = r6
                r6 = r7
                r7 = r8
                goto L_0x009c
            L_0x0043:
                r15 = r7
                r2 = r8
                r10 = r9
                r11 = r10
                r12 = r11
                r13 = r12
                r14 = r13
            L_0x004a:
                if (r15 == 0) goto L_0x0095
                int r8 = r0.mo24931o(r1)
                switch(r8) {
                    case -1: goto L_0x0090;
                    case 0: goto L_0x0085;
                    case 1: goto L_0x007b;
                    case 2: goto L_0x0074;
                    case 3: goto L_0x006b;
                    case 4: goto L_0x0062;
                    case 5: goto L_0x0059;
                    default: goto L_0x0053;
                }
            L_0x0053:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>((int) r8)
                throw r0
            L_0x0059:
                com.carrefour.fid.android.data.entities.dlv.DlvDuration$a r8 = com.carrefour.fid.android.data.entities.dlv.DlvDuration.C36429a.f90088a
                java.lang.Object r14 = r0.mo24895y(r1, r3, r8, r14)
                r2 = r2 | 32
                goto L_0x0083
            L_0x0062:
                com.carrefour.fid.android.data.entities.dlv.DlvDuration$a r8 = com.carrefour.fid.android.data.entities.dlv.DlvDuration.C36429a.f90088a
                java.lang.Object r13 = r0.mo24895y(r1, r5, r8, r13)
                r2 = r2 | 16
                goto L_0x0083
            L_0x006b:
                com.carrefour.fid.android.data.entities.dlv.DlvFee$a r8 = com.carrefour.fid.android.data.entities.dlv.DlvFee.C36431a.f90091a
                java.lang.Object r12 = r0.mo24895y(r1, r4, r8, r12)
                r2 = r2 | 8
                goto L_0x0083
            L_0x0074:
                java.lang.String r11 = r0.mo24884m(r1, r6)
                r2 = r2 | 4
                goto L_0x0083
            L_0x007b:
                kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
                java.lang.Object r10 = r0.mo24885n(r1, r7, r8, r10)
                r2 = r2 | 2
            L_0x0083:
                r8 = 0
                goto L_0x004a
            L_0x0085:
                com.carrefour.fid.android.data.entities.dlv.DlvCode$a r8 = com.carrefour.fid.android.data.entities.dlv.DlvCode.C36427a.f90084a
                r3 = 0
                java.lang.Object r9 = r0.mo24895y(r1, r3, r8, r9)
                r2 = r2 | 1
                r8 = r3
                goto L_0x0093
            L_0x0090:
                r3 = 0
                r8 = r3
                r15 = r8
            L_0x0093:
                r3 = 5
                goto L_0x004a
            L_0x0095:
                r7 = r2
                r2 = r9
                r6 = r10
                r10 = r11
                r4 = r12
                r5 = r13
                r3 = r14
            L_0x009c:
                r0.mo24876c(r1)
                com.carrefour.fid.android.data.entities.dlv.DlvOption r0 = new com.carrefour.fid.android.data.entities.dlv.DlvOption
                r8 = r2
                com.carrefour.fid.android.data.entities.dlv.DlvCode r8 = (com.carrefour.fid.android.data.entities.dlv.DlvCode) r8
                r9 = r6
                java.lang.String r9 = (java.lang.String) r9
                r11 = r4
                com.carrefour.fid.android.data.entities.dlv.DlvFee r11 = (com.carrefour.fid.android.data.entities.dlv.DlvFee) r11
                r12 = r5
                com.carrefour.fid.android.data.entities.dlv.DlvDuration r12 = (com.carrefour.fid.android.data.entities.dlv.DlvDuration) r12
                r13 = r3
                com.carrefour.fid.android.data.entities.dlv.DlvDuration r13 = (com.carrefour.fid.android.data.entities.dlv.DlvDuration) r13
                r14 = 0
                r6 = r0
                r6.<init>((int) r7, (com.carrefour.fid.android.data.entities.dlv.DlvCode) r8, (java.lang.String) r9, (java.lang.String) r10, (com.carrefour.fid.android.data.entities.dlv.DlvFee) r11, (com.carrefour.fid.android.data.entities.dlv.DlvDuration) r12, (com.carrefour.fid.android.data.entities.dlv.DlvDuration) r13, (kotlinx.serialization.internal.C12295n1) r14)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.dlv.DlvOption.C36433a.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.data.entities.dlv.DlvOption");
        }

        /* renamed from: b */
        public void serialize(@C12579k C12244g gVar, @C12579k DlvOption dlvOption) {
            Intrinsics.checkNotNullParameter(gVar, "encoder");
            Intrinsics.checkNotNullParameter(dlvOption, "value");
            C12217f descriptor = getDescriptor();
            C12239d b = gVar.mo24906b(descriptor);
            DlvOption.write$Self(dlvOption, b, descriptor);
            b.mo24907c(descriptor);
        }

        @C12579k
        public C12248g<?>[] childSerializers() {
            C12310s1 s1Var = C12310s1.f30117a;
            DlvDuration.C36429a aVar = DlvDuration.C36429a.f90088a;
            return new C12248g[]{DlvCode.C36427a.f90084a, C12197a.m48817q(s1Var), s1Var, DlvFee.C36431a.f90091a, aVar, aVar};
        }

        @C12579k
        public C12217f getDescriptor() {
            return f90096b;
        }

        @C12579k
        public C12248g<?>[] typeParametersSerializers() {
            return C12327y.C12328a.m49635a(this);
        }
    }

    /* renamed from: com.carrefour.fid.android.data.entities.dlv.DlvOption$b */
    public static final class C36434b {
        public /* synthetic */ C36434b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<DlvOption> serializer() {
            return C36433a.f90095a;
        }

        public C36434b() {
        }
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ DlvOption(int i, @C12438n("code") DlvCode dlvCode, @C12438n("category") String str, @C12438n("gtin") String str2, @C12438n("fee") DlvFee dlvFee, @C12438n("min_duration") DlvDuration dlvDuration, @C12438n("max_duration") DlvDuration dlvDuration2, C12295n1 n1Var) {
        if (61 != (i & 61)) {
            C12261c1.m49256b(i, 61, C36433a.f90095a.getDescriptor());
        }
        this.code = dlvCode;
        if ((i & 2) == 0) {
            this.category = null;
        } else {
            this.category = str;
        }
        this.f90094id = str2;
        this.fee = dlvFee;
        this.minDuration = dlvDuration;
        this.maxDuration = dlvDuration2;
    }

    public static /* synthetic */ DlvOption copy$default(DlvOption dlvOption, DlvCode dlvCode, String str, String str2, DlvFee dlvFee, DlvDuration dlvDuration, DlvDuration dlvDuration2, int i, Object obj) {
        if ((i & 1) != 0) {
            dlvCode = dlvOption.code;
        }
        if ((i & 2) != 0) {
            str = dlvOption.category;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = dlvOption.f90094id;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            dlvFee = dlvOption.fee;
        }
        DlvFee dlvFee2 = dlvFee;
        if ((i & 16) != 0) {
            dlvDuration = dlvOption.minDuration;
        }
        DlvDuration dlvDuration3 = dlvDuration;
        if ((i & 32) != 0) {
            dlvDuration2 = dlvOption.maxDuration;
        }
        return dlvOption.copy(dlvCode, str3, str4, dlvFee2, dlvDuration3, dlvDuration2);
    }

    @C12438n("category")
    public static /* synthetic */ void getCategory$annotations() {
    }

    @C12438n("code")
    public static /* synthetic */ void getCode$annotations() {
    }

    @C12438n("fee")
    public static /* synthetic */ void getFee$annotations() {
    }

    @C12438n("gtin")
    public static /* synthetic */ void getId$annotations() {
    }

    @C12438n("max_duration")
    public static /* synthetic */ void getMaxDuration$annotations() {
    }

    @C12438n("min_duration")
    public static /* synthetic */ void getMinDuration$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(DlvOption dlvOption, C12239d dVar, C12217f fVar) {
        boolean z = false;
        dVar.mo24899D(fVar, 0, DlvCode.C36427a.f90084a, dlvOption.code);
        if (dVar.mo24897A(fVar, 1) || dlvOption.category != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, dlvOption.category);
        }
        dVar.mo24929z(fVar, 2, dlvOption.f90094id);
        dVar.mo24899D(fVar, 3, DlvFee.C36431a.f90091a, dlvOption.fee);
        DlvDuration.C36429a aVar = DlvDuration.C36429a.f90088a;
        dVar.mo24899D(fVar, 4, aVar, dlvOption.minDuration);
        dVar.mo24899D(fVar, 5, aVar, dlvOption.maxDuration);
    }

    @C12579k
    public final DlvCode component1() {
        return this.code;
    }

    @C12580l
    public final String component2() {
        return this.category;
    }

    @C12579k
    public final String component3() {
        return this.f90094id;
    }

    @C12579k
    public final DlvFee component4() {
        return this.fee;
    }

    @C12579k
    public final DlvDuration component5() {
        return this.minDuration;
    }

    @C12579k
    public final DlvDuration component6() {
        return this.maxDuration;
    }

    @C12579k
    public final DlvOption copy(@C12579k DlvCode dlvCode, @C12580l String str, @C12579k String str2, @C12579k DlvFee dlvFee, @C12579k DlvDuration dlvDuration, @C12579k DlvDuration dlvDuration2) {
        Intrinsics.checkNotNullParameter(dlvCode, "code");
        Intrinsics.checkNotNullParameter(str2, "id");
        Intrinsics.checkNotNullParameter(dlvFee, "fee");
        Intrinsics.checkNotNullParameter(dlvDuration, "minDuration");
        Intrinsics.checkNotNullParameter(dlvDuration2, "maxDuration");
        return new DlvOption(dlvCode, str, str2, dlvFee, dlvDuration, dlvDuration2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlvOption)) {
            return false;
        }
        DlvOption dlvOption = (DlvOption) obj;
        return this.code == dlvOption.code && Intrinsics.areEqual((Object) this.category, (Object) dlvOption.category) && Intrinsics.areEqual((Object) this.f90094id, (Object) dlvOption.f90094id) && Intrinsics.areEqual((Object) this.fee, (Object) dlvOption.fee) && Intrinsics.areEqual((Object) this.minDuration, (Object) dlvOption.minDuration) && Intrinsics.areEqual((Object) this.maxDuration, (Object) dlvOption.maxDuration);
    }

    @C12580l
    public final String getCategory() {
        return this.category;
    }

    @C12579k
    public final DlvCode getCode() {
        return this.code;
    }

    @C12579k
    public final DlvFee getFee() {
        return this.fee;
    }

    @C12579k
    public final String getId() {
        return this.f90094id;
    }

    @C12579k
    public final DlvDuration getMaxDuration() {
        return this.maxDuration;
    }

    @C12579k
    public final DlvDuration getMinDuration() {
        return this.minDuration;
    }

    public int hashCode() {
        int hashCode = this.code.hashCode() * 31;
        String str = this.category;
        return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f90094id.hashCode()) * 31) + this.fee.hashCode()) * 31) + this.minDuration.hashCode()) * 31) + this.maxDuration.hashCode();
    }

    @C12579k
    public String toString() {
        DlvCode dlvCode = this.code;
        String str = this.category;
        String str2 = this.f90094id;
        DlvFee dlvFee = this.fee;
        DlvDuration dlvDuration = this.minDuration;
        DlvDuration dlvDuration2 = this.maxDuration;
        return "DlvOption(code=" + dlvCode + ", category=" + str + ", id=" + str2 + ", fee=" + dlvFee + ", minDuration=" + dlvDuration + ", maxDuration=" + dlvDuration2 + ")";
    }

    public DlvOption(@C12579k DlvCode dlvCode, @C12580l String str, @C12579k String str2, @C12579k DlvFee dlvFee, @C12579k DlvDuration dlvDuration, @C12579k DlvDuration dlvDuration2) {
        Intrinsics.checkNotNullParameter(dlvCode, "code");
        Intrinsics.checkNotNullParameter(str2, "id");
        Intrinsics.checkNotNullParameter(dlvFee, "fee");
        Intrinsics.checkNotNullParameter(dlvDuration, "minDuration");
        Intrinsics.checkNotNullParameter(dlvDuration2, "maxDuration");
        this.code = dlvCode;
        this.category = str;
        this.f90094id = str2;
        this.fee = dlvFee;
        this.minDuration = dlvDuration;
        this.maxDuration = dlvDuration2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DlvOption(DlvCode dlvCode, String str, String str2, DlvFee dlvFee, DlvDuration dlvDuration, DlvDuration dlvDuration2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dlvCode, (i & 2) != 0 ? null : str, str2, dlvFee, dlvDuration, dlvDuration2);
    }
}
