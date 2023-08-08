package com.carrefour.fid.android.various.domain.model;

import androidx.annotation.Keep;
import com.carrefour.fid.android.various.domain.model.AppMessageType;
import java.lang.annotation.Annotation;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12312t0;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C12439o
@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000 ;2\u00020\u0001:\u0002<=BI\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u000e\u0012\u0006\u0010 \u001a\u00020\u0014\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b5\u00106Bk\b\u0017\u0012\u0006\u00107\u001a\u00020\f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0014\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0019\u0012\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b5\u0010:J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u001a\u001a\u00020\u0019HÆ\u0003Jb\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020\u00142\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\"\u001a\u00020\u0019HÆ\u0001¢\u0006\u0004\b#\u0010$J\t\u0010%\u001a\u00020\u000eHÖ\u0001R\u0017\u0010\u001b\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\u001d\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\u001e\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b+\u0010(R\u0017\u0010\u001f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b,\u0010(R\u0017\u0010 \u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b \u0010-\u001a\u0004\b.\u0010/R\u0019\u0010!\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b!\u00100\u001a\u0004\b1\u0010\u0018R\u0017\u0010\"\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\"\u00102\u001a\u0004\b3\u00104¨\u0006>"}, mo22516d2 = {"Lcom/carrefour/fid/android/various/domain/model/AppMessage;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "other", "", "equals", "", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "Lcom/carrefour/fid/android/various/domain/model/AppMessageRecurrence;", "component6", "", "component7", "()Ljava/lang/Long;", "Lcom/carrefour/fid/android/various/domain/model/AppMessageType;", "component8", "buttonText", "buttonUrl", "closeText", "text", "title", "recurrence", "timestamp", "type", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/various/domain/model/AppMessageRecurrence;Ljava/lang/Long;Lcom/carrefour/fid/android/various/domain/model/AppMessageType;)Lcom/carrefour/fid/android/various/domain/model/AppMessage;", "toString", "Ljava/lang/String;", "getButtonText", "()Ljava/lang/String;", "getButtonUrl", "getCloseText", "getText", "getTitle", "Lcom/carrefour/fid/android/various/domain/model/AppMessageRecurrence;", "getRecurrence", "()Lcom/carrefour/fid/android/various/domain/model/AppMessageRecurrence;", "Ljava/lang/Long;", "getTimestamp", "Lcom/carrefour/fid/android/various/domain/model/AppMessageType;", "getType", "()Lcom/carrefour/fid/android/various/domain/model/AppMessageType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/various/domain/model/AppMessageRecurrence;Ljava/lang/Long;Lcom/carrefour/fid/android/various/domain/model/AppMessageType;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/various/domain/model/AppMessageRecurrence;Ljava/lang/Long;Lcom/carrefour/fid/android/various/domain/model/AppMessageType;Lkotlinx/serialization/internal/n1;)V", "Companion", "a", "b", "various_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class AppMessage {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, null, null, null, null, new PolymorphicSerializer(C11342l0.m43547d(AppMessageRecurrence.class), new Annotation[0]), null, null};
    @C12579k
    public static final C22786b Companion = new C22786b((DefaultConstructorMarker) null);
    @C12579k
    private final String buttonText;
    @C12579k
    private final String buttonUrl;
    @C12579k
    private final String closeText;
    @C12579k
    private final AppMessageRecurrence recurrence;
    @C12579k
    private final String text;
    @C12580l
    private final Long timestamp;
    @C12579k
    private final String title;
    @C12579k
    private final AppMessageType type;

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    /* renamed from: com.carrefour.fid.android.various.domain.model.AppMessage$a */
    public static final class C22785a implements C12327y<AppMessage> {
        @C12579k

        /* renamed from: a */
        public static final C22785a f58346a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f58347b;

        static {
            C22785a aVar = new C22785a();
            f58346a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.various.domain.model.AppMessage", aVar, 8);
            pluginGeneratedSerialDescriptor.mo24966k("buttonText", false);
            pluginGeneratedSerialDescriptor.mo24966k("buttonUrl", false);
            pluginGeneratedSerialDescriptor.mo24966k("closeText", false);
            pluginGeneratedSerialDescriptor.mo24966k("text", false);
            pluginGeneratedSerialDescriptor.mo24966k("title", false);
            pluginGeneratedSerialDescriptor.mo24966k("recurrence", false);
            pluginGeneratedSerialDescriptor.mo24966k("timestamp", false);
            pluginGeneratedSerialDescriptor.mo24966k("type", false);
            f58347b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.carrefour.fid.android.various.domain.model.AppMessage deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r23) {
            /*
                r22 = this;
                r0 = r23
                java.lang.String r1 = "decoder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                kotlinx.serialization.descriptors.f r1 = r22.getDescriptor()
                kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
                kotlinx.serialization.g[] r2 = com.carrefour.fid.android.various.domain.model.AppMessage.$childSerializers
                boolean r3 = r0.mo24886p()
                r4 = 7
                r5 = 6
                r6 = 3
                r7 = 4
                r8 = 2
                r9 = 5
                r10 = 1
                r11 = 0
                r12 = 0
                if (r3 == 0) goto L_0x0057
                java.lang.String r3 = r0.mo24884m(r1, r11)
                java.lang.String r10 = r0.mo24884m(r1, r10)
                java.lang.String r8 = r0.mo24884m(r1, r8)
                java.lang.String r6 = r0.mo24884m(r1, r6)
                java.lang.String r7 = r0.mo24884m(r1, r7)
                r2 = r2[r9]
                java.lang.Object r2 = r0.mo24895y(r1, r9, r2, r12)
                kotlinx.serialization.internal.t0 r9 = kotlinx.serialization.internal.C12312t0.f30121a
                java.lang.Object r5 = r0.mo24885n(r1, r5, r9, r12)
                com.carrefour.fid.android.various.domain.model.AppMessageType$a r9 = com.carrefour.fid.android.various.domain.model.AppMessageType.C22791a.f58352a
                java.lang.Object r4 = r0.mo24895y(r1, r4, r9, r12)
                r9 = 255(0xff, float:3.57E-43)
                r15 = r6
                r6 = r10
                r10 = r5
                r5 = r3
                r21 = r8
                r8 = r4
                r4 = r9
                r9 = r7
                r7 = r21
                goto L_0x00d1
            L_0x0057:
                r19 = r10
                r3 = r11
                r8 = r12
                r10 = r8
                r11 = r10
                r13 = r11
                r14 = r13
                r15 = r14
                r16 = r15
            L_0x0062:
                if (r19 == 0) goto L_0x00ca
                int r6 = r0.mo24931o(r1)
                switch(r6) {
                    case -1: goto L_0x00c2;
                    case 0: goto L_0x00b3;
                    case 1: goto L_0x00a6;
                    case 2: goto L_0x009b;
                    case 3: goto L_0x0093;
                    case 4: goto L_0x008c;
                    case 5: goto L_0x0083;
                    case 6: goto L_0x007a;
                    case 7: goto L_0x0071;
                    default: goto L_0x006b;
                }
            L_0x006b:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>((int) r6)
                throw r0
            L_0x0071:
                com.carrefour.fid.android.various.domain.model.AppMessageType$a r6 = com.carrefour.fid.android.various.domain.model.AppMessageType.C22791a.f58352a
                java.lang.Object r8 = r0.mo24895y(r1, r4, r6, r8)
                r3 = r3 | 128(0x80, float:1.794E-43)
                goto L_0x00c8
            L_0x007a:
                kotlinx.serialization.internal.t0 r6 = kotlinx.serialization.internal.C12312t0.f30121a
                java.lang.Object r10 = r0.mo24885n(r1, r5, r6, r10)
                r3 = r3 | 64
                goto L_0x00c8
            L_0x0083:
                r6 = r2[r9]
                java.lang.Object r11 = r0.mo24895y(r1, r9, r6, r11)
                r3 = r3 | 32
                goto L_0x00c8
            L_0x008c:
                java.lang.String r16 = r0.mo24884m(r1, r7)
                r3 = r3 | 16
                goto L_0x00c8
            L_0x0093:
                r6 = 3
                java.lang.String r15 = r0.mo24884m(r1, r6)
                r3 = r3 | 8
                goto L_0x0062
            L_0x009b:
                r6 = 3
                r14 = 2
                java.lang.String r18 = r0.mo24884m(r1, r14)
                r3 = r3 | 4
                r14 = r18
                goto L_0x0062
            L_0x00a6:
                r6 = 3
                r13 = 1
                r17 = 2
                java.lang.String r18 = r0.mo24884m(r1, r13)
                r3 = r3 | 2
                r13 = r18
                goto L_0x0062
            L_0x00b3:
                r6 = 3
                r12 = 0
                r17 = 2
                r18 = 1
                java.lang.String r20 = r0.mo24884m(r1, r12)
                r3 = r3 | 1
                r12 = r20
                goto L_0x0062
            L_0x00c2:
                r17 = 2
                r18 = 1
                r19 = 0
            L_0x00c8:
                r6 = 3
                goto L_0x0062
            L_0x00ca:
                r4 = r3
                r2 = r11
                r5 = r12
                r6 = r13
                r7 = r14
                r9 = r16
            L_0x00d1:
                r0.mo24876c(r1)
                com.carrefour.fid.android.various.domain.model.AppMessage r0 = new com.carrefour.fid.android.various.domain.model.AppMessage
                r1 = r2
                com.carrefour.fid.android.various.domain.model.AppMessageRecurrence r1 = (com.carrefour.fid.android.various.domain.model.AppMessageRecurrence) r1
                r11 = r10
                java.lang.Long r11 = (java.lang.Long) r11
                r12 = r8
                com.carrefour.fid.android.various.domain.model.AppMessageType r12 = (com.carrefour.fid.android.various.domain.model.AppMessageType) r12
                r13 = 0
                r3 = r0
                r8 = r15
                r10 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.domain.model.AppMessage.C22785a.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.various.domain.model.AppMessage");
        }

        /* renamed from: b */
        public void serialize(@C12579k C12244g gVar, @C12579k AppMessage appMessage) {
            Intrinsics.checkNotNullParameter(gVar, "encoder");
            Intrinsics.checkNotNullParameter(appMessage, "value");
            C12217f descriptor = getDescriptor();
            C12239d b = gVar.mo24906b(descriptor);
            AppMessage.write$Self(appMessage, b, descriptor);
            b.mo24907c(descriptor);
        }

        @C12579k
        public C12248g<?>[] childSerializers() {
            C12248g<?>[] access$get$childSerializers$cp = AppMessage.$childSerializers;
            C12310s1 s1Var = C12310s1.f30117a;
            return new C12248g[]{s1Var, s1Var, s1Var, s1Var, s1Var, access$get$childSerializers$cp[5], C12197a.m48817q(C12312t0.f30121a), AppMessageType.C22791a.f58352a};
        }

        @C12579k
        public C12217f getDescriptor() {
            return f58347b;
        }

        @C12579k
        public C12248g<?>[] typeParametersSerializers() {
            return C12327y.C12328a.m49635a(this);
        }
    }

    /* renamed from: com.carrefour.fid.android.various.domain.model.AppMessage$b */
    public static final class C22786b {
        public /* synthetic */ C22786b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<AppMessage> serializer() {
            return C22785a.f58346a;
        }

        public C22786b() {
        }
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ AppMessage(int i, String str, String str2, String str3, String str4, String str5, AppMessageRecurrence appMessageRecurrence, Long l, AppMessageType appMessageType, C12295n1 n1Var) {
        if (255 != (i & 255)) {
            C12261c1.m49256b(i, 255, C22785a.f58346a.getDescriptor());
        }
        this.buttonText = str;
        this.buttonUrl = str2;
        this.closeText = str3;
        this.text = str4;
        this.title = str5;
        this.recurrence = appMessageRecurrence;
        this.timestamp = l;
        this.type = appMessageType;
    }

    public static /* synthetic */ AppMessage copy$default(AppMessage appMessage, String str, String str2, String str3, String str4, String str5, AppMessageRecurrence appMessageRecurrence, Long l, AppMessageType appMessageType, int i, Object obj) {
        AppMessage appMessage2 = appMessage;
        int i2 = i;
        return appMessage.copy((i2 & 1) != 0 ? appMessage2.buttonText : str, (i2 & 2) != 0 ? appMessage2.buttonUrl : str2, (i2 & 4) != 0 ? appMessage2.closeText : str3, (i2 & 8) != 0 ? appMessage2.text : str4, (i2 & 16) != 0 ? appMessage2.title : str5, (i2 & 32) != 0 ? appMessage2.recurrence : appMessageRecurrence, (i2 & 64) != 0 ? appMessage2.timestamp : l, (i2 & 128) != 0 ? appMessage2.type : appMessageType);
    }

    @C11384m
    public static final /* synthetic */ void write$Self(AppMessage appMessage, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        dVar.mo24929z(fVar, 0, appMessage.buttonText);
        dVar.mo24929z(fVar, 1, appMessage.buttonUrl);
        dVar.mo24929z(fVar, 2, appMessage.closeText);
        dVar.mo24929z(fVar, 3, appMessage.text);
        dVar.mo24929z(fVar, 4, appMessage.title);
        dVar.mo24899D(fVar, 5, gVarArr[5], appMessage.recurrence);
        dVar.mo24912i(fVar, 6, C12312t0.f30121a, appMessage.timestamp);
        dVar.mo24899D(fVar, 7, AppMessageType.C22791a.f58352a, appMessage.type);
    }

    @C12579k
    public final String component1() {
        return this.buttonText;
    }

    @C12579k
    public final String component2() {
        return this.buttonUrl;
    }

    @C12579k
    public final String component3() {
        return this.closeText;
    }

    @C12579k
    public final String component4() {
        return this.text;
    }

    @C12579k
    public final String component5() {
        return this.title;
    }

    @C12579k
    public final AppMessageRecurrence component6() {
        return this.recurrence;
    }

    @C12580l
    public final Long component7() {
        return this.timestamp;
    }

    @C12579k
    public final AppMessageType component8() {
        return this.type;
    }

    @C12579k
    public final AppMessage copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k AppMessageRecurrence appMessageRecurrence, @C12580l Long l, @C12579k AppMessageType appMessageType) {
        Intrinsics.checkNotNullParameter(str, "buttonText");
        Intrinsics.checkNotNullParameter(str2, "buttonUrl");
        Intrinsics.checkNotNullParameter(str3, "closeText");
        Intrinsics.checkNotNullParameter(str4, "text");
        Intrinsics.checkNotNullParameter(str5, "title");
        AppMessageRecurrence appMessageRecurrence2 = appMessageRecurrence;
        Intrinsics.checkNotNullParameter(appMessageRecurrence2, "recurrence");
        AppMessageType appMessageType2 = appMessageType;
        Intrinsics.checkNotNullParameter(appMessageType2, "type");
        return new AppMessage(str, str2, str3, str4, str5, appMessageRecurrence2, l, appMessageType2);
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof AppMessage)) {
            return false;
        }
        AppMessage appMessage = (AppMessage) obj;
        if (!Intrinsics.areEqual((Object) this.title, (Object) appMessage.title) || !Intrinsics.areEqual((Object) this.text, (Object) appMessage.text) || !Intrinsics.areEqual((Object) this.recurrence, (Object) appMessage.recurrence) || this.type != appMessage.type) {
            return false;
        }
        return true;
    }

    @C12579k
    public final String getButtonText() {
        return this.buttonText;
    }

    @C12579k
    public final String getButtonUrl() {
        return this.buttonUrl;
    }

    @C12579k
    public final String getCloseText() {
        return this.closeText;
    }

    @C12579k
    public final AppMessageRecurrence getRecurrence() {
        return this.recurrence;
    }

    @C12579k
    public final String getText() {
        return this.text;
    }

    @C12580l
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @C12579k
    public final String getTitle() {
        return this.title;
    }

    @C12579k
    public final AppMessageType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.text.hashCode() * 31) + this.title.hashCode()) * 31) + this.recurrence.hashCode()) * 31) + this.type.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.buttonText;
        String str2 = this.buttonUrl;
        String str3 = this.closeText;
        String str4 = this.text;
        String str5 = this.title;
        AppMessageRecurrence appMessageRecurrence = this.recurrence;
        Long l = this.timestamp;
        AppMessageType appMessageType = this.type;
        return "AppMessage(buttonText=" + str + ", buttonUrl=" + str2 + ", closeText=" + str3 + ", text=" + str4 + ", title=" + str5 + ", recurrence=" + appMessageRecurrence + ", timestamp=" + l + ", type=" + appMessageType + ")";
    }

    public AppMessage(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k AppMessageRecurrence appMessageRecurrence, @C12580l Long l, @C12579k AppMessageType appMessageType) {
        Intrinsics.checkNotNullParameter(str, "buttonText");
        Intrinsics.checkNotNullParameter(str2, "buttonUrl");
        Intrinsics.checkNotNullParameter(str3, "closeText");
        Intrinsics.checkNotNullParameter(str4, "text");
        Intrinsics.checkNotNullParameter(str5, "title");
        Intrinsics.checkNotNullParameter(appMessageRecurrence, "recurrence");
        Intrinsics.checkNotNullParameter(appMessageType, "type");
        this.buttonText = str;
        this.buttonUrl = str2;
        this.closeText = str3;
        this.text = str4;
        this.title = str5;
        this.recurrence = appMessageRecurrence;
        this.timestamp = l;
        this.type = appMessageType;
    }
}
