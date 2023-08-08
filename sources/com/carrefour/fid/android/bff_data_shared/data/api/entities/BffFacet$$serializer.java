package com.carrefour.fid.android.bff_data_shared.data.api.entities;

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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffFacet.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFacet;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffFacet$$serializer implements C12327y<BffFacet> {
    @C12579k
    public static final BffFacet$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffFacet$$serializer bffFacet$$serializer = new BffFacet$$serializer();
        INSTANCE = bffFacet$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacet", bffFacet$$serializer, 6);
        pluginGeneratedSerialDescriptor.mo24966k("field", false);
        pluginGeneratedSerialDescriptor.mo24966k("type", false);
        pluginGeneratedSerialDescriptor.mo24966k("totalTerms", false);
        pluginGeneratedSerialDescriptor.mo24966k("selected", false);
        pluginGeneratedSerialDescriptor.mo24966k("topTerms", false);
        pluginGeneratedSerialDescriptor.mo24966k("name", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffFacet$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g<?>[] access$get$childSerializers$cp = BffFacet.$childSerializers;
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{s1Var, s1Var, C12276h0.f30067a, C12278i.f30070a, access$get$childSerializers$cp[4], C12197a.m48817q(s1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacet deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r17.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            kotlinx.serialization.g[] r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacet.$childSerializers
            boolean r3 = r0.mo24886p()
            r4 = 5
            r5 = 3
            r6 = 2
            r7 = 4
            r8 = 1
            r9 = 0
            r10 = 0
            if (r3 == 0) goto L_0x0046
            java.lang.String r3 = r0.mo24884m(r1, r9)
            java.lang.String r8 = r0.mo24884m(r1, r8)
            int r6 = r0.mo24880i(r1, r6)
            boolean r5 = r0.mo24866C(r1, r5)
            r2 = r2[r7]
            java.lang.Object r2 = r0.mo24895y(r1, r7, r2, r10)
            kotlinx.serialization.internal.s1 r7 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r10)
            r7 = 63
            r15 = r4
            r4 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            r5 = r3
            goto L_0x0098
        L_0x0046:
            r16 = r8
            r3 = r9
            r11 = r3
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
            r10 = r11
        L_0x004f:
            if (r16 == 0) goto L_0x0092
            int r9 = r0.mo24931o(r1)
            switch(r9) {
                case -1: goto L_0x008e;
                case 0: goto L_0x0086;
                case 1: goto L_0x007e;
                case 2: goto L_0x0077;
                case 3: goto L_0x0070;
                case 4: goto L_0x0067;
                case 5: goto L_0x005e;
                default: goto L_0x0058;
            }
        L_0x0058:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r9)
            throw r0
        L_0x005e:
            kotlinx.serialization.internal.s1 r9 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r15 = r0.mo24885n(r1, r4, r9, r15)
            r11 = r11 | 32
            goto L_0x0084
        L_0x0067:
            r9 = r2[r7]
            java.lang.Object r14 = r0.mo24895y(r1, r7, r9, r14)
            r11 = r11 | 16
            goto L_0x0084
        L_0x0070:
            boolean r3 = r0.mo24866C(r1, r5)
            r11 = r11 | 8
            goto L_0x0084
        L_0x0077:
            int r10 = r0.mo24880i(r1, r6)
            r11 = r11 | 4
            goto L_0x0084
        L_0x007e:
            java.lang.String r13 = r0.mo24884m(r1, r8)
            r11 = r11 | 2
        L_0x0084:
            r9 = 0
            goto L_0x004f
        L_0x0086:
            r9 = 0
            java.lang.String r12 = r0.mo24884m(r1, r9)
            r11 = r11 | 1
            goto L_0x004f
        L_0x008e:
            r9 = 0
            r16 = r9
            goto L_0x004f
        L_0x0092:
            r8 = r3
            r7 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2 = r14
        L_0x0098:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacet r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacet
            r9 = r2
            java.util.List r9 = (java.util.List) r9
            r10 = r15
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            r3 = r0
            r3.<init>((int) r4, (java.lang.String) r5, (java.lang.String) r6, (int) r7, (boolean) r8, (java.util.List) r9, (java.lang.String) r10, (kotlinx.serialization.internal.C12295n1) r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacet$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacet");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffFacet bffFacet) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffFacet, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffFacet.write$Self(bffFacet, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
