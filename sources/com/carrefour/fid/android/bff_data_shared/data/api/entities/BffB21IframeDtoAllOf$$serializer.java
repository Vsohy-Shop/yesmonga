package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
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
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffB21IframeDtoAllOf.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB21IframeDtoAllOf;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffB21IframeDtoAllOf$$serializer implements C12327y<BffB21IframeDtoAllOf> {
    @C12579k
    public static final BffB21IframeDtoAllOf$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffB21IframeDtoAllOf$$serializer bffB21IframeDtoAllOf$$serializer = new BffB21IframeDtoAllOf$$serializer();
        INSTANCE = bffB21IframeDtoAllOf$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB21IframeDtoAllOf", bffB21IframeDtoAllOf$$serializer, 6);
        pluginGeneratedSerialDescriptor.mo24966k(C13814a.f33702X0, true);
        pluginGeneratedSerialDescriptor.mo24966k("url", true);
        pluginGeneratedSerialDescriptor.mo24966k("width", true);
        pluginGeneratedSerialDescriptor.mo24966k("height", true);
        pluginGeneratedSerialDescriptor.mo24966k("loyalty_card_login_enabled", true);
        pluginGeneratedSerialDescriptor.mo24966k("url_contextualized", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffB21IframeDtoAllOf$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12276h0 h0Var = C12276h0.f30067a;
        return new C12248g[]{C12197a.m48817q(h0Var), C12197a.m48817q(C12310s1.f30117a), C12197a.m48817q(h0Var), C12197a.m48817q(h0Var), C12197a.m48817q(C12278i.f30070a), C12197a.m48817q(BffUrlDto$$serializer.INSTANCE)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0094, code lost:
        r3 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB21IframeDtoAllOf deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r17) {
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
            if (r2 == 0) goto L_0x0042
            kotlinx.serialization.internal.h0 r2 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r8 = r0.mo24885n(r1, r8, r2, r9)
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r7 = r0.mo24885n(r1, r7, r10, r9)
            java.lang.Object r6 = r0.mo24885n(r1, r6, r2, r9)
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r9)
            kotlinx.serialization.internal.i r4 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r4 = r0.mo24885n(r1, r5, r4, r9)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r5 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r3 = r0.mo24885n(r1, r3, r5, r9)
            r5 = 63
            r11 = r6
            r6 = r5
            goto L_0x009c
        L_0x0042:
            r15 = r7
            r2 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x0049:
            if (r15 == 0) goto L_0x0096
            int r8 = r0.mo24931o(r1)
            switch(r8) {
                case -1: goto L_0x0091;
                case 0: goto L_0x0086;
                case 1: goto L_0x007c;
                case 2: goto L_0x0073;
                case 3: goto L_0x006a;
                case 4: goto L_0x0061;
                case 5: goto L_0x0058;
                default: goto L_0x0052;
            }
        L_0x0052:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r8)
            throw r0
        L_0x0058:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r8 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r14 = r0.mo24885n(r1, r3, r8, r14)
            r2 = r2 | 32
            goto L_0x0084
        L_0x0061:
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r13 = r0.mo24885n(r1, r5, r8, r13)
            r2 = r2 | 16
            goto L_0x0084
        L_0x006a:
            kotlinx.serialization.internal.h0 r8 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r12 = r0.mo24885n(r1, r4, r8, r12)
            r2 = r2 | 8
            goto L_0x0084
        L_0x0073:
            kotlinx.serialization.internal.h0 r8 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r11 = r0.mo24885n(r1, r6, r8, r11)
            r2 = r2 | 4
            goto L_0x0084
        L_0x007c:
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r10 = r0.mo24885n(r1, r7, r8, r10)
            r2 = r2 | 2
        L_0x0084:
            r8 = 0
            goto L_0x0049
        L_0x0086:
            kotlinx.serialization.internal.h0 r8 = kotlinx.serialization.internal.C12276h0.f30067a
            r3 = 0
            java.lang.Object r9 = r0.mo24885n(r1, r3, r8, r9)
            r2 = r2 | 1
            r8 = r3
            goto L_0x0094
        L_0x0091:
            r3 = 0
            r8 = r3
            r15 = r8
        L_0x0094:
            r3 = 5
            goto L_0x0049
        L_0x0096:
            r6 = r2
            r8 = r9
            r7 = r10
            r2 = r12
            r4 = r13
            r3 = r14
        L_0x009c:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB21IframeDtoAllOf r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB21IframeDtoAllOf
            r1 = r8
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            r9 = r11
            java.lang.Integer r9 = (java.lang.Integer) r9
            r10 = r2
            java.lang.Integer r10 = (java.lang.Integer) r10
            r11 = r4
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r12 = r3
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r12 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r12
            r13 = 0
            r5 = r0
            r7 = r1
            r5.<init>((int) r6, (java.lang.Integer) r7, (java.lang.String) r8, (java.lang.Integer) r9, (java.lang.Integer) r10, (java.lang.Boolean) r11, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r12, (kotlinx.serialization.internal.C12295n1) r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB21IframeDtoAllOf$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB21IframeDtoAllOf");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffB21IframeDtoAllOf bffB21IframeDtoAllOf) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffB21IframeDtoAllOf, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffB21IframeDtoAllOf.write$Self(bffB21IframeDtoAllOf, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
