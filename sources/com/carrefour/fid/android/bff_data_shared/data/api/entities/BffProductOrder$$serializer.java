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
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOrder.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOrder;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffProductOrder$$serializer implements C12327y<BffProductOrder> {
    @C12579k
    public static final BffProductOrder$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffProductOrder$$serializer bffProductOrder$$serializer = new BffProductOrder$$serializer();
        INSTANCE = bffProductOrder$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOrder", bffProductOrder$$serializer, 4);
        pluginGeneratedSerialDescriptor.mo24966k("button_name", true);
        pluginGeneratedSerialDescriptor.mo24966k("desktop_multibackground", true);
        pluginGeneratedSerialDescriptor.mo24966k("products", true);
        pluginGeneratedSerialDescriptor.mo24966k("isMandatory", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffProductOrder$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffProductOrder.$childSerializers;
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[2]), C12197a.m48817q(C12278i.f30070a)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOrder deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r15) {
        /*
            r14 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            kotlinx.serialization.descriptors.f r0 = r14.getDescriptor()
            kotlinx.serialization.encoding.c r15 = r15.mo24875b(r0)
            kotlinx.serialization.g[] r1 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOrder.$childSerializers
            boolean r2 = r15.mo24886p()
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            if (r2 == 0) goto L_0x0036
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r6 = r15.mo24885n(r0, r6, r2, r7)
            java.lang.Object r2 = r15.mo24885n(r0, r5, r2, r7)
            r1 = r1[r4]
            java.lang.Object r1 = r15.mo24885n(r0, r4, r1, r7)
            kotlinx.serialization.internal.i r4 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r3 = r15.mo24885n(r0, r3, r4, r7)
            r4 = 15
            r5 = r4
            goto L_0x007d
        L_0x0036:
            r11 = r5
            r2 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x003b:
            if (r11 == 0) goto L_0x0078
            int r12 = r15.mo24931o(r0)
            r13 = -1
            if (r12 == r13) goto L_0x0076
            if (r12 == 0) goto L_0x006d
            if (r12 == r5) goto L_0x0064
            if (r12 == r4) goto L_0x005b
            if (r12 != r3) goto L_0x0055
            kotlinx.serialization.internal.i r12 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r10 = r15.mo24885n(r0, r3, r12, r10)
            r2 = r2 | 8
            goto L_0x003b
        L_0x0055:
            kotlinx.serialization.UnknownFieldException r15 = new kotlinx.serialization.UnknownFieldException
            r15.<init>((int) r12)
            throw r15
        L_0x005b:
            r12 = r1[r4]
            java.lang.Object r9 = r15.mo24885n(r0, r4, r12, r9)
            r2 = r2 | 4
            goto L_0x003b
        L_0x0064:
            kotlinx.serialization.internal.s1 r12 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r8 = r15.mo24885n(r0, r5, r12, r8)
            r2 = r2 | 2
            goto L_0x003b
        L_0x006d:
            kotlinx.serialization.internal.s1 r12 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r7 = r15.mo24885n(r0, r6, r12, r7)
            r2 = r2 | 1
            goto L_0x003b
        L_0x0076:
            r11 = r6
            goto L_0x003b
        L_0x0078:
            r5 = r2
            r6 = r7
            r2 = r8
            r1 = r9
            r3 = r10
        L_0x007d:
            r15.mo24876c(r0)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOrder r15 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOrder
            java.lang.String r6 = (java.lang.String) r6
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            r8 = r1
            java.util.List r8 = (java.util.List) r8
            r9 = r3
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r10 = 0
            r4 = r15
            r4.<init>((int) r5, (java.lang.String) r6, (java.lang.String) r7, (java.util.List) r8, (java.lang.Boolean) r9, (kotlinx.serialization.internal.C12295n1) r10)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOrder$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOrder");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffProductOrder bffProductOrder) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffProductOrder, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffProductOrder.write$Self(bffProductOrder, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
