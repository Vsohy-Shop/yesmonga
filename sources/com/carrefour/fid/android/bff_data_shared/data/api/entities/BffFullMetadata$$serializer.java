package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.urbanairship.analytics.C35571q;
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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffFullMetadata.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFullMetadata;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffFullMetadata$$serializer implements C12327y<BffFullMetadata> {
    @C12579k
    public static final BffFullMetadata$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffFullMetadata$$serializer bffFullMetadata$$serializer = new BffFullMetadata$$serializer();
        INSTANCE = bffFullMetadata$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFullMetadata", bffFullMetadata$$serializer, 7);
        pluginGeneratedSerialDescriptor.mo24966k("self", true);
        pluginGeneratedSerialDescriptor.mo24966k(C35571q.f87943o, true);
        pluginGeneratedSerialDescriptor.mo24966k("total_pages", true);
        pluginGeneratedSerialDescriptor.mo24966k("results_per_page", true);
        pluginGeneratedSerialDescriptor.mo24966k("current_page", true);
        pluginGeneratedSerialDescriptor.mo24966k("previous_page", true);
        pluginGeneratedSerialDescriptor.mo24966k("next_page", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffFullMetadata$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12276h0 h0Var = C12276h0.f30067a;
        return new C12248g[]{C12197a.m48817q(C12310s1.f30117a), C12197a.m48817q(h0Var), C12197a.m48817q(h0Var), C12197a.m48817q(h0Var), C12197a.m48817q(h0Var), C12197a.m48817q(h0Var), C12197a.m48817q(h0Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFullMetadata deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r20.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            boolean r2 = r0.mo24886p()
            r3 = 6
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r2 == 0) goto L_0x0042
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r2 = r0.mo24885n(r1, r9, r2, r10)
            kotlinx.serialization.internal.h0 r9 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r8 = r0.mo24885n(r1, r8, r9, r10)
            java.lang.Object r7 = r0.mo24885n(r1, r7, r9, r10)
            java.lang.Object r5 = r0.mo24885n(r1, r5, r9, r10)
            java.lang.Object r6 = r0.mo24885n(r1, r6, r9, r10)
            java.lang.Object r4 = r0.mo24885n(r1, r4, r9, r10)
            java.lang.Object r3 = r0.mo24885n(r1, r3, r9, r10)
            r9 = 127(0x7f, float:1.78E-43)
            r10 = r9
            goto L_0x00af
        L_0x0042:
            r16 = r8
            r2 = r9
            r9 = r10
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x004b:
            if (r16 == 0) goto L_0x00a4
            int r8 = r0.mo24931o(r1)
            switch(r8) {
                case -1: goto L_0x009e;
                case 0: goto L_0x0093;
                case 1: goto L_0x0087;
                case 2: goto L_0x007e;
                case 3: goto L_0x0075;
                case 4: goto L_0x006c;
                case 5: goto L_0x0063;
                case 6: goto L_0x005a;
                default: goto L_0x0054;
            }
        L_0x0054:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r8)
            throw r0
        L_0x005a:
            kotlinx.serialization.internal.h0 r8 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r9 = r0.mo24885n(r1, r3, r8, r9)
            r2 = r2 | 64
            goto L_0x00a2
        L_0x0063:
            kotlinx.serialization.internal.h0 r8 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r15 = r0.mo24885n(r1, r4, r8, r15)
            r2 = r2 | 32
            goto L_0x00a2
        L_0x006c:
            kotlinx.serialization.internal.h0 r8 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r14 = r0.mo24885n(r1, r6, r8, r14)
            r2 = r2 | 16
            goto L_0x00a2
        L_0x0075:
            kotlinx.serialization.internal.h0 r8 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r13 = r0.mo24885n(r1, r5, r8, r13)
            r2 = r2 | 8
            goto L_0x00a2
        L_0x007e:
            kotlinx.serialization.internal.h0 r8 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r12 = r0.mo24885n(r1, r7, r8, r12)
            r2 = r2 | 4
            goto L_0x00a2
        L_0x0087:
            kotlinx.serialization.internal.h0 r8 = kotlinx.serialization.internal.C12276h0.f30067a
            r3 = 1
            java.lang.Object r11 = r0.mo24885n(r1, r3, r8, r11)
            r2 = r2 | 2
            r8 = r3
            r3 = 6
            goto L_0x004b
        L_0x0093:
            r3 = 1
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 0
            java.lang.Object r10 = r0.mo24885n(r1, r3, r8, r10)
            r2 = r2 | 1
            goto L_0x00a1
        L_0x009e:
            r3 = 0
            r16 = r3
        L_0x00a1:
            r3 = 6
        L_0x00a2:
            r8 = 1
            goto L_0x004b
        L_0x00a4:
            r3 = r9
            r8 = r11
            r7 = r12
            r5 = r13
            r6 = r14
            r4 = r15
            r19 = r10
            r10 = r2
            r2 = r19
        L_0x00af:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFullMetadata r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFullMetadata
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            r12 = r8
            java.lang.Integer r12 = (java.lang.Integer) r12
            r13 = r7
            java.lang.Integer r13 = (java.lang.Integer) r13
            r14 = r5
            java.lang.Integer r14 = (java.lang.Integer) r14
            r15 = r6
            java.lang.Integer r15 = (java.lang.Integer) r15
            r16 = r4
            java.lang.Integer r16 = (java.lang.Integer) r16
            r17 = r3
            java.lang.Integer r17 = (java.lang.Integer) r17
            r18 = 0
            r9 = r0
            r9.<init>((int) r10, (java.lang.String) r11, (java.lang.Integer) r12, (java.lang.Integer) r13, (java.lang.Integer) r14, (java.lang.Integer) r15, (java.lang.Integer) r16, (java.lang.Integer) r17, (kotlinx.serialization.internal.C12295n1) r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFullMetadata$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFullMetadata");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffFullMetadata bffFullMetadata) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffFullMetadata, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffFullMetadata.write$Self(bffFullMetadata, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
