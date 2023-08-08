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
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffBundle.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBundle;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffBundle$$serializer implements C12327y<BffBundle> {
    @C12579k
    public static final BffBundle$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffBundle$$serializer bffBundle$$serializer = new BffBundle$$serializer();
        INSTANCE = bffBundle$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBundle", bffBundle$$serializer, 3);
        pluginGeneratedSerialDescriptor.mo24966k("gtins", true);
        pluginGeneratedSerialDescriptor.mo24966k("promotion", true);
        pluginGeneratedSerialDescriptor.mo24966k("trigger", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffBundle$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(BffBundle.$childSerializers[0]), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBundle deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r13) {
        /*
            r12 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            kotlinx.serialization.descriptors.f r0 = r12.getDescriptor()
            kotlinx.serialization.encoding.c r13 = r13.mo24875b(r0)
            kotlinx.serialization.g[] r1 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBundle.$childSerializers
            boolean r2 = r13.mo24886p()
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L_0x002f
            r1 = r1[r5]
            java.lang.Object r1 = r13.mo24885n(r0, r5, r1, r6)
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r4 = r13.mo24885n(r0, r4, r2, r6)
            java.lang.Object r2 = r13.mo24885n(r0, r3, r2, r6)
            r3 = 7
            r7 = r4
            r4 = r3
            goto L_0x0068
        L_0x002f:
            r9 = r4
            r2 = r5
            r7 = r6
            r8 = r7
        L_0x0033:
            if (r9 == 0) goto L_0x0065
            int r10 = r13.mo24931o(r0)
            r11 = -1
            if (r10 == r11) goto L_0x0063
            if (r10 == 0) goto L_0x005a
            if (r10 == r4) goto L_0x0051
            if (r10 != r3) goto L_0x004b
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r8 = r13.mo24885n(r0, r3, r10, r8)
            r2 = r2 | 4
            goto L_0x0033
        L_0x004b:
            kotlinx.serialization.UnknownFieldException r13 = new kotlinx.serialization.UnknownFieldException
            r13.<init>((int) r10)
            throw r13
        L_0x0051:
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r7 = r13.mo24885n(r0, r4, r10, r7)
            r2 = r2 | 2
            goto L_0x0033
        L_0x005a:
            r10 = r1[r5]
            java.lang.Object r6 = r13.mo24885n(r0, r5, r10, r6)
            r2 = r2 | 1
            goto L_0x0033
        L_0x0063:
            r9 = r5
            goto L_0x0033
        L_0x0065:
            r4 = r2
            r1 = r6
            r2 = r8
        L_0x0068:
            r13.mo24876c(r0)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBundle r13 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBundle
            r5 = r1
            java.util.List r5 = (java.util.List) r5
            r6 = r7
            java.lang.String r6 = (java.lang.String) r6
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            r8 = 0
            r3 = r13
            r3.<init>((int) r4, (java.util.List) r5, (java.lang.String) r6, (java.lang.String) r7, (kotlinx.serialization.internal.C12295n1) r8)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBundle$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBundle");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffBundle bffBundle) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffBundle, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffBundle.write$Self(bffBundle, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
