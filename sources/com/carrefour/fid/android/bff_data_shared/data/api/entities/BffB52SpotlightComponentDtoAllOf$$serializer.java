package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import com.urbanairship.iam.C9127a0;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffB52SpotlightComponentDtoAllOf.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB52SpotlightComponentDtoAllOf;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffB52SpotlightComponentDtoAllOf$$serializer implements C12327y<BffB52SpotlightComponentDtoAllOf> {
    @C12579k
    public static final BffB52SpotlightComponentDtoAllOf$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffB52SpotlightComponentDtoAllOf$$serializer bffB52SpotlightComponentDtoAllOf$$serializer = new BffB52SpotlightComponentDtoAllOf$$serializer();
        INSTANCE = bffB52SpotlightComponentDtoAllOf$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB52SpotlightComponentDtoAllOf", bffB52SpotlightComponentDtoAllOf$$serializer, 29);
        pluginGeneratedSerialDescriptor.mo24966k(C13814a.f33702X0, true);
        pluginGeneratedSerialDescriptor.mo24966k("title", true);
        pluginGeneratedSerialDescriptor.mo24966k("design", true);
        pluginGeneratedSerialDescriptor.mo24966k("logo_type", true);
        pluginGeneratedSerialDescriptor.mo24966k("text_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("variant", true);
        pluginGeneratedSerialDescriptor.mo24966k("countdown", true);
        pluginGeneratedSerialDescriptor.mo24966k("offer_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("background_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("cta", true);
        pluginGeneratedSerialDescriptor.mo24966k("timetable", true);
        pluginGeneratedSerialDescriptor.mo24966k("description", true);
        pluginGeneratedSerialDescriptor.mo24966k("flag", true);
        pluginGeneratedSerialDescriptor.mo24966k("image_large", true);
        pluginGeneratedSerialDescriptor.mo24966k(C9127a0.f24709d, true);
        pluginGeneratedSerialDescriptor.mo24966k("background_image", true);
        pluginGeneratedSerialDescriptor.mo24966k("background_mobile_image", true);
        pluginGeneratedSerialDescriptor.mo24966k("brand_logo", true);
        pluginGeneratedSerialDescriptor.mo24966k("legal_mentions", true);
        pluginGeneratedSerialDescriptor.mo24966k("ean", true);
        pluginGeneratedSerialDescriptor.mo24966k("offer_prefix", true);
        pluginGeneratedSerialDescriptor.mo24966k(C28547h2.f69318f, true);
        pluginGeneratedSerialDescriptor.mo24966k("offer_suffix", true);
        pluginGeneratedSerialDescriptor.mo24966k("discount_design", true);
        pluginGeneratedSerialDescriptor.mo24966k("discount_prefix", true);
        pluginGeneratedSerialDescriptor.mo24966k(FirebaseAnalytics.C32532b.f78937Y, true);
        pluginGeneratedSerialDescriptor.mo24966k("discount_suffix", true);
        pluginGeneratedSerialDescriptor.mo24966k("image_link", true);
        pluginGeneratedSerialDescriptor.mo24966k(OTUXParamsKeys.OT_UX_LINKS, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffB52SpotlightComponentDtoAllOf$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffB52SpotlightComponentDtoAllOf.$childSerializers;
        C12310s1 s1Var = C12310s1.f30117a;
        BffUrlDto$$serializer bffUrlDto$$serializer = BffUrlDto$$serializer.INSTANCE;
        BffImageDto$$serializer bffImageDto$$serializer = BffImageDto$$serializer.INSTANCE;
        return new C12248g[]{C12197a.m48817q(C12276h0.f30067a), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(bffUrlDto$$serializer), C12197a.m48817q(BffTimeTableDto$$serializer.INSTANCE), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(bffUrlDto$$serializer), C12197a.m48817q(access$get$childSerializers$cp[28])};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v0, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v1, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v2, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v3, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v72, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v97, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v105, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v6, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v6, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0221, code lost:
        r22 = r4;
        r12 = r33;
        r24 = r34;
        r23 = r35;
        r21 = r36;
        r20 = r37;
        r19 = r38;
        r18 = r39;
        r17 = r40;
        r3 = r52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0566, code lost:
        r22 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0568, code lost:
        r3 = r52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x05b8, code lost:
        r41 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x05ba, code lost:
        r33 = r12;
        r40 = r17;
        r39 = r18;
        r38 = r19;
        r37 = r20;
        r36 = r21;
        r4 = r22;
        r35 = r23;
        r34 = r24;
        r2 = r53;
        r50 = r54;
        r12 = 28;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB52SpotlightComponentDtoAllOf deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r83) {
        /*
            r82 = this;
            r0 = r83
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r82.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            kotlinx.serialization.g[] r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB52SpotlightComponentDtoAllOf.$childSerializers
            boolean r3 = r0.mo24886p()
            r13 = 9
            r14 = 7
            r15 = 6
            r4 = 5
            r5 = 3
            r6 = 8
            r7 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x0106
            kotlinx.serialization.internal.h0 r3 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r3 = r0.mo24885n(r1, r10, r3, r11)
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r9 = r0.mo24885n(r1, r9, r10, r11)
            java.lang.Object r8 = r0.mo24885n(r1, r8, r10, r11)
            java.lang.Object r5 = r0.mo24885n(r1, r5, r10, r11)
            java.lang.Object r7 = r0.mo24885n(r1, r7, r10, r11)
            java.lang.Object r4 = r0.mo24885n(r1, r4, r10, r11)
            java.lang.Object r15 = r0.mo24885n(r1, r15, r10, r11)
            java.lang.Object r14 = r0.mo24885n(r1, r14, r10, r11)
            java.lang.Object r6 = r0.mo24885n(r1, r6, r10, r11)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r12 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r13 = r0.mo24885n(r1, r13, r12, r11)
            r26 = r3
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto$$serializer.INSTANCE
            r27 = r4
            r4 = 10
            java.lang.Object r3 = r0.mo24885n(r1, r4, r3, r11)
            r4 = 11
            java.lang.Object r4 = r0.mo24885n(r1, r4, r10, r11)
            r24 = r3
            r3 = 12
            java.lang.Object r3 = r0.mo24885n(r1, r3, r10, r11)
            r23 = r3
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r25 = r4
            r4 = 13
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r11)
            r21 = r4
            r4 = 14
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r11)
            r20 = r4
            r4 = 15
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r11)
            r19 = r4
            r4 = 16
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r11)
            r18 = r4
            r4 = 17
            java.lang.Object r3 = r0.mo24885n(r1, r4, r3, r11)
            r4 = 18
            java.lang.Object r4 = r0.mo24885n(r1, r4, r10, r11)
            r16 = r3
            r3 = 19
            java.lang.Object r3 = r0.mo24885n(r1, r3, r10, r11)
            r83 = r3
            r3 = 20
            java.lang.Object r3 = r0.mo24885n(r1, r3, r10, r11)
            r17 = r3
            r3 = 21
            java.lang.Object r3 = r0.mo24885n(r1, r3, r10, r11)
            r28 = r3
            r3 = 22
            java.lang.Object r3 = r0.mo24885n(r1, r3, r10, r11)
            r29 = r3
            r3 = 23
            java.lang.Object r3 = r0.mo24885n(r1, r3, r10, r11)
            r30 = r3
            r3 = 24
            java.lang.Object r3 = r0.mo24885n(r1, r3, r10, r11)
            r31 = r3
            r3 = 25
            java.lang.Object r3 = r0.mo24885n(r1, r3, r10, r11)
            r32 = r3
            r3 = 26
            java.lang.Object r3 = r0.mo24885n(r1, r3, r10, r11)
            r10 = 27
            java.lang.Object r10 = r0.mo24885n(r1, r10, r12, r11)
            r12 = 28
            r2 = r2[r12]
            java.lang.Object r2 = r0.mo24885n(r1, r12, r2, r11)
            r11 = 536870911(0x1fffffff, float:1.0842021E-19)
            r48 = r3
            r49 = r10
            r51 = r11
            r3 = r26
            r44 = r29
            r10 = r8
            r11 = r9
            r8 = r5
            r9 = r7
            r7 = r27
            r5 = r4
            r4 = r83
            goto L_0x0617
        L_0x0106:
            r12 = 28
            r51 = r9
            r3 = r11
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r13 = r9
            r14 = r13
            r15 = r14
            r33 = r15
            r34 = r33
            r35 = r34
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r44 = r43
            r45 = r44
            r46 = r45
            r47 = r46
            r48 = r47
            r49 = r48
            r50 = r49
            r11 = r10
            r10 = r50
        L_0x013b:
            if (r51 == 0) goto L_0x05d4
            r52 = r3
            int r3 = r0.mo24931o(r1)
            switch(r3) {
                case -1: goto L_0x0596;
                case 0: goto L_0x056c;
                case 1: goto L_0x0541;
                case 2: goto L_0x051b;
                case 3: goto L_0x04f5;
                case 4: goto L_0x04ce;
                case 5: goto L_0x04a7;
                case 6: goto L_0x047f;
                case 7: goto L_0x0457;
                case 8: goto L_0x042e;
                case 9: goto L_0x0405;
                case 10: goto L_0x03dc;
                case 11: goto L_0x03b1;
                case 12: goto L_0x0383;
                case 13: goto L_0x0355;
                case 14: goto L_0x0327;
                case 15: goto L_0x02f7;
                case 16: goto L_0x02c8;
                case 17: goto L_0x0299;
                case 18: goto L_0x026a;
                case 19: goto L_0x0238;
                case 20: goto L_0x020a;
                case 21: goto L_0x01f2;
                case 22: goto L_0x01da;
                case 23: goto L_0x01c2;
                case 24: goto L_0x01aa;
                case 25: goto L_0x0191;
                case 26: goto L_0x0178;
                case 27: goto L_0x015f;
                case 28: goto L_0x014c;
                default: goto L_0x0146;
            }
        L_0x0146:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r3)
            throw r0
        L_0x014c:
            r3 = r2[r12]
            r53 = r2
            r2 = r50
            java.lang.Object r2 = r0.mo24885n(r1, r12, r3, r2)
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r11 = r11 | r3
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            r54 = r2
            goto L_0x0221
        L_0x015f:
            r53 = r2
            r2 = r50
            r3 = 27
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r12 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r54 = r2
            r2 = r49
            java.lang.Object r2 = r0.mo24885n(r1, r3, r12, r2)
            r3 = 134217728(0x8000000, float:3.85186E-34)
            r11 = r11 | r3
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            r49 = r2
            goto L_0x0221
        L_0x0178:
            r53 = r2
            r2 = r49
            r54 = r50
            r3 = 26
            kotlinx.serialization.internal.s1 r12 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = r48
            java.lang.Object r2 = r0.mo24885n(r1, r3, r12, r2)
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r11 = r11 | r3
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            r48 = r2
            goto L_0x0221
        L_0x0191:
            r53 = r2
            r2 = r48
            r54 = r50
            r3 = 25
            kotlinx.serialization.internal.s1 r12 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = r47
            java.lang.Object r2 = r0.mo24885n(r1, r3, r12, r2)
            r3 = 33554432(0x2000000, float:9.403955E-38)
            r11 = r11 | r3
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            r47 = r2
            goto L_0x0221
        L_0x01aa:
            r53 = r2
            r2 = r47
            r54 = r50
            r3 = 24
            kotlinx.serialization.internal.s1 r12 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = r46
            java.lang.Object r2 = r0.mo24885n(r1, r3, r12, r2)
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            r11 = r11 | r3
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            r46 = r2
            goto L_0x0221
        L_0x01c2:
            r53 = r2
            r2 = r46
            r54 = r50
            r3 = 23
            kotlinx.serialization.internal.s1 r12 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = r45
            java.lang.Object r2 = r0.mo24885n(r1, r3, r12, r2)
            r3 = 8388608(0x800000, float:1.17549435E-38)
            r11 = r11 | r3
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            r45 = r2
            goto L_0x0221
        L_0x01da:
            r53 = r2
            r2 = r45
            r54 = r50
            r3 = 22
            kotlinx.serialization.internal.s1 r12 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = r44
            java.lang.Object r2 = r0.mo24885n(r1, r3, r12, r2)
            r3 = 4194304(0x400000, float:5.877472E-39)
            r11 = r11 | r3
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            r44 = r2
            goto L_0x0221
        L_0x01f2:
            r53 = r2
            r2 = r44
            r54 = r50
            r3 = 21
            kotlinx.serialization.internal.s1 r12 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = r43
            java.lang.Object r2 = r0.mo24885n(r1, r3, r12, r2)
            r3 = 2097152(0x200000, float:2.938736E-39)
            r11 = r11 | r3
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            r43 = r2
            goto L_0x0221
        L_0x020a:
            r53 = r2
            r2 = r43
            r54 = r50
            r3 = 20
            kotlinx.serialization.internal.s1 r12 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = r42
            java.lang.Object r2 = r0.mo24885n(r1, r3, r12, r2)
            r3 = 1048576(0x100000, float:1.469368E-39)
            r11 = r11 | r3
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            r42 = r2
        L_0x0221:
            r22 = r4
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r3 = r52
            r4 = 0
            goto L_0x05ba
        L_0x0238:
            r53 = r2
            r2 = r42
            r54 = r50
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r12 = r41
            r41 = r2
            r2 = 19
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r12)
            r12 = 524288(0x80000, float:7.34684E-40)
            r11 = r11 | r12
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            r22 = r4
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r42 = r41
            r4 = 0
            r41 = r3
            r3 = r52
            goto L_0x05ba
        L_0x026a:
            r53 = r2
            r12 = r41
            r41 = r42
            r54 = r50
            r2 = 19
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r16 = r12
            r2 = r40
            r12 = 18
            java.lang.Object r2 = r0.mo24885n(r1, r12, r3, r2)
            r3 = 262144(0x40000, float:3.67342E-40)
            r11 = r11 | r3
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            r17 = r2
            r22 = r4
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            goto L_0x0568
        L_0x0299:
            r53 = r2
            r2 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r12 = 18
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r17 = r2
            r12 = r39
            r2 = 17
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r12)
            r12 = 131072(0x20000, float:1.83671E-40)
            r11 = r11 | r12
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            r18 = r3
            r22 = r4
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            goto L_0x0568
        L_0x02c8:
            r53 = r2
            r12 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r2 = 17
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r18 = r12
            r2 = r38
            r12 = 16
            java.lang.Object r2 = r0.mo24885n(r1, r12, r3, r2)
            r3 = 65536(0x10000, float:9.18355E-41)
            r11 = r11 | r3
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            r19 = r2
            r22 = r4
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            goto L_0x0568
        L_0x02f7:
            r53 = r2
            r2 = r38
            r18 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r12 = 16
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r19 = r2
            r12 = r37
            r2 = 15
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r12)
            r12 = 32768(0x8000, float:4.5918E-41)
            r11 = r11 | r12
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            r20 = r3
            r22 = r4
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            goto L_0x0568
        L_0x0327:
            r53 = r2
            r12 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r2 = 15
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r20 = r12
            r2 = r36
            r12 = 14
            java.lang.Object r2 = r0.mo24885n(r1, r12, r3, r2)
            r11 = r11 | 16384(0x4000, float:2.2959E-41)
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            r21 = r2
            r22 = r4
            r12 = r33
            r24 = r34
            r23 = r35
            goto L_0x0568
        L_0x0355:
            r53 = r2
            r2 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r12 = 14
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r21 = r2
            r12 = r35
            r2 = 13
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r12)
            r11 = r11 | 8192(0x2000, float:1.14794E-41)
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            r23 = r3
            r22 = r4
            r12 = r33
            r24 = r34
            goto L_0x0568
        L_0x0383:
            r53 = r2
            r12 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r2 = 13
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r23 = r12
            r2 = r34
            r12 = 12
            java.lang.Object r2 = r0.mo24885n(r1, r12, r3, r2)
            r11 = r11 | 4096(0x1000, float:5.74E-42)
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            r24 = r2
            r22 = r4
            r12 = r33
            goto L_0x0568
        L_0x03b1:
            r53 = r2
            r2 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r12 = 12
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r24 = r2
            r12 = r33
            r2 = 11
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r12)
            r11 = r11 | 2048(0x800, float:2.87E-42)
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            r12 = r3
            goto L_0x0566
        L_0x03dc:
            r53 = r2
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r2 = 11
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto$$serializer.INSTANCE
            r2 = 10
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r13)
            r11 = r11 | 1024(0x400, float:1.435E-42)
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r13 = r3
            goto L_0x0566
        L_0x0405:
            r53 = r2
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r2 = 10
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r2 = 9
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r6)
            r11 = r11 | 512(0x200, float:7.175E-43)
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            r6 = r3
            goto L_0x0566
        L_0x042e:
            r53 = r2
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r2 = 9
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 8
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r14)
            r11 = r11 | 256(0x100, float:3.59E-43)
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            r14 = r3
            goto L_0x0566
        L_0x0457:
            r53 = r2
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r2 = 8
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 7
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r15)
            r11 = r11 | 128(0x80, float:1.794E-43)
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            r15 = r3
            goto L_0x0566
        L_0x047f:
            r53 = r2
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r2 = 7
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 6
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r4)
            r11 = r11 | 64
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r22 = r3
            goto L_0x0568
        L_0x04a7:
            r53 = r2
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r2 = 6
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 5
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r7)
            r11 = r11 | 32
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r7 = r3
            goto L_0x0566
        L_0x04ce:
            r53 = r2
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r2 = 5
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 4
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r5)
            r11 = r11 | 16
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r5 = r3
            goto L_0x0566
        L_0x04f5:
            r53 = r2
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r2 = 4
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 3
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r8)
            r11 = r11 | 8
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r8 = r3
            goto L_0x0566
        L_0x051b:
            r53 = r2
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r2 = 3
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 2
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r9)
            r11 = r11 | 4
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            r9 = r3
            goto L_0x0566
        L_0x0541:
            r53 = r2
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r2 = 2
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 1
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r10)
            r11 = r11 | 2
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            r10 = r3
        L_0x0566:
            r22 = r4
        L_0x0568:
            r3 = r52
            r4 = 0
            goto L_0x05b8
        L_0x056c:
            r53 = r2
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r2 = 1
            kotlinx.serialization.internal.h0 r3 = kotlinx.serialization.internal.C12276h0.f30067a
            r22 = r4
            r2 = r52
            r4 = 0
            java.lang.Object r2 = r0.mo24885n(r1, r4, r3, r2)
            r11 = r11 | 1
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            r3 = r2
            goto L_0x05b8
        L_0x0596:
            r53 = r2
            r22 = r4
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r2 = r52
            r4 = 0
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            r3 = r2
            r51 = r4
        L_0x05b8:
            r41 = r16
        L_0x05ba:
            r33 = r12
            r40 = r17
            r39 = r18
            r38 = r19
            r37 = r20
            r36 = r21
            r4 = r22
            r35 = r23
            r34 = r24
            r2 = r53
            r50 = r54
            r12 = 28
            goto L_0x013b
        L_0x05d4:
            r2 = r3
            r22 = r4
            r12 = r33
            r24 = r34
            r23 = r35
            r21 = r36
            r20 = r37
            r19 = r38
            r18 = r39
            r17 = r40
            r16 = r41
            r41 = r42
            r54 = r50
            r51 = r11
            r25 = r12
            r4 = r16
            r16 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r23
            r23 = r24
            r28 = r43
            r30 = r45
            r31 = r46
            r32 = r47
            r2 = r54
            r11 = r10
            r24 = r13
            r13 = r6
            r10 = r9
            r6 = r14
            r14 = r15
            r15 = r22
            r9 = r5
            r5 = r17
            r17 = r41
        L_0x0617:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB52SpotlightComponentDtoAllOf r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB52SpotlightComponentDtoAllOf
            r50 = r0
            r52 = r3
            java.lang.Integer r52 = (java.lang.Integer) r52
            r53 = r11
            java.lang.String r53 = (java.lang.String) r53
            r54 = r10
            java.lang.String r54 = (java.lang.String) r54
            r55 = r8
            java.lang.String r55 = (java.lang.String) r55
            r56 = r9
            java.lang.String r56 = (java.lang.String) r56
            r57 = r7
            java.lang.String r57 = (java.lang.String) r57
            r58 = r15
            java.lang.String r58 = (java.lang.String) r58
            r59 = r14
            java.lang.String r59 = (java.lang.String) r59
            r60 = r6
            java.lang.String r60 = (java.lang.String) r60
            r61 = r13
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r61 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r61
            r62 = r24
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto r62 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto) r62
            r63 = r25
            java.lang.String r63 = (java.lang.String) r63
            r64 = r23
            java.lang.String r64 = (java.lang.String) r64
            r65 = r21
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r65 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r65
            r66 = r20
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r66 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r66
            r67 = r19
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r67 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r67
            r68 = r18
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r68 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r68
            r69 = r16
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r69 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r69
            r70 = r5
            java.lang.String r70 = (java.lang.String) r70
            r71 = r4
            java.lang.String r71 = (java.lang.String) r71
            r72 = r17
            java.lang.String r72 = (java.lang.String) r72
            r73 = r28
            java.lang.String r73 = (java.lang.String) r73
            r74 = r44
            java.lang.String r74 = (java.lang.String) r74
            r75 = r30
            java.lang.String r75 = (java.lang.String) r75
            r76 = r31
            java.lang.String r76 = (java.lang.String) r76
            r77 = r32
            java.lang.String r77 = (java.lang.String) r77
            r78 = r48
            java.lang.String r78 = (java.lang.String) r78
            r79 = r49
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r79 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r79
            r80 = r2
            java.util.List r80 = (java.util.List) r80
            r81 = 0
            r50.<init>((int) r51, (java.lang.Integer) r52, (java.lang.String) r53, (java.lang.String) r54, (java.lang.String) r55, (java.lang.String) r56, (java.lang.String) r57, (java.lang.String) r58, (java.lang.String) r59, (java.lang.String) r60, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r61, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto) r62, (java.lang.String) r63, (java.lang.String) r64, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r65, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r66, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r67, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r68, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r69, (java.lang.String) r70, (java.lang.String) r71, (java.lang.String) r72, (java.lang.String) r73, (java.lang.String) r74, (java.lang.String) r75, (java.lang.String) r76, (java.lang.String) r77, (java.lang.String) r78, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r79, (java.util.List) r80, (kotlinx.serialization.internal.C12295n1) r81)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB52SpotlightComponentDtoAllOf$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB52SpotlightComponentDtoAllOf");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffB52SpotlightComponentDtoAllOf bffB52SpotlightComponentDtoAllOf) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffB52SpotlightComponentDtoAllOf, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffB52SpotlightComponentDtoAllOf.write$Self(bffB52SpotlightComponentDtoAllOf, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
