package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.google.firebase.analytics.FirebaseAnalytics;
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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffWeekPattern.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWeekPattern;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffWeekPattern$$serializer implements C12327y<BffWeekPattern> {
    @C12579k
    public static final BffWeekPattern$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffWeekPattern$$serializer bffWeekPattern$$serializer = new BffWeekPattern$$serializer();
        INSTANCE = bffWeekPattern$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffWeekPattern", bffWeekPattern$$serializer, 10);
        pluginGeneratedSerialDescriptor.mo24966k("pattern_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("beg_date", true);
        pluginGeneratedSerialDescriptor.mo24966k(FirebaseAnalytics.C32532b.f78961l, true);
        pluginGeneratedSerialDescriptor.mo24966k("monday_time_ranges", true);
        pluginGeneratedSerialDescriptor.mo24966k("tuesday_time_ranges", true);
        pluginGeneratedSerialDescriptor.mo24966k("wednesday_time_ranges", true);
        pluginGeneratedSerialDescriptor.mo24966k("thursday_time_ranges", true);
        pluginGeneratedSerialDescriptor.mo24966k("friday_time_ranges", true);
        pluginGeneratedSerialDescriptor.mo24966k("saturday_time_ranges", true);
        pluginGeneratedSerialDescriptor.mo24966k("sunday_time_ranges", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffWeekPattern$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffWeekPattern.$childSerializers;
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(C12276h0.f30067a), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[3]), C12197a.m48817q(access$get$childSerializers$cp[4]), C12197a.m48817q(access$get$childSerializers$cp[5]), C12197a.m48817q(access$get$childSerializers$cp[6]), C12197a.m48817q(access$get$childSerializers$cp[7]), C12197a.m48817q(access$get$childSerializers$cp[8]), C12197a.m48817q(access$get$childSerializers$cp[9])};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffWeekPattern deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r19.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            kotlinx.serialization.g[] r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffWeekPattern.$childSerializers
            boolean r3 = r0.mo24886p()
            r4 = 2
            r5 = 9
            r6 = 7
            r7 = 6
            r8 = 5
            r9 = 3
            r10 = 8
            r11 = 4
            r12 = 1
            r13 = 0
            r14 = 0
            if (r3 == 0) goto L_0x0069
            kotlinx.serialization.internal.h0 r3 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r3 = r0.mo24885n(r1, r13, r3, r14)
            kotlinx.serialization.internal.s1 r13 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r12 = r0.mo24885n(r1, r12, r13, r14)
            java.lang.Object r4 = r0.mo24885n(r1, r4, r13, r14)
            r13 = r2[r9]
            java.lang.Object r9 = r0.mo24885n(r1, r9, r13, r14)
            r13 = r2[r11]
            java.lang.Object r11 = r0.mo24885n(r1, r11, r13, r14)
            r13 = r2[r8]
            java.lang.Object r8 = r0.mo24885n(r1, r8, r13, r14)
            r13 = r2[r7]
            java.lang.Object r7 = r0.mo24885n(r1, r7, r13, r14)
            r13 = r2[r6]
            java.lang.Object r6 = r0.mo24885n(r1, r6, r13, r14)
            r13 = r2[r10]
            java.lang.Object r10 = r0.mo24885n(r1, r10, r13, r14)
            r2 = r2[r5]
            java.lang.Object r2 = r0.mo24885n(r1, r5, r2, r14)
            r5 = 1023(0x3ff, float:1.434E-42)
            r15 = r12
            r12 = r9
            r9 = r8
            r8 = r6
            r6 = r5
            goto L_0x00fc
        L_0x0069:
            r18 = r12
            r3 = r13
            r4 = r14
            r6 = r4
            r7 = r6
            r8 = r7
            r9 = r8
            r11 = r9
            r12 = r11
            r13 = r12
            r15 = r13
        L_0x0075:
            if (r18 == 0) goto L_0x00f5
            int r10 = r0.mo24931o(r1)
            switch(r10) {
                case -1: goto L_0x00ed;
                case 0: goto L_0x00e2;
                case 1: goto L_0x00d7;
                case 2: goto L_0x00cc;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00b8;
                case 5: goto L_0x00ae;
                case 6: goto L_0x00a4;
                case 7: goto L_0x009a;
                case 8: goto L_0x008d;
                case 9: goto L_0x0084;
                default: goto L_0x007e;
            }
        L_0x007e:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r10)
            throw r0
        L_0x0084:
            r10 = r2[r5]
            java.lang.Object r6 = r0.mo24885n(r1, r5, r10, r6)
            r3 = r3 | 512(0x200, float:7.175E-43)
            goto L_0x00f2
        L_0x008d:
            r10 = 8
            r5 = r2[r10]
            java.lang.Object r7 = r0.mo24885n(r1, r10, r5, r7)
            r3 = r3 | 256(0x100, float:3.59E-43)
            r5 = 9
            goto L_0x0075
        L_0x009a:
            r5 = 7
            r10 = r2[r5]
            java.lang.Object r8 = r0.mo24885n(r1, r5, r10, r8)
            r3 = r3 | 128(0x80, float:1.794E-43)
            goto L_0x00f0
        L_0x00a4:
            r10 = 6
            r5 = r2[r10]
            java.lang.Object r11 = r0.mo24885n(r1, r10, r5, r11)
            r3 = r3 | 64
            goto L_0x00f0
        L_0x00ae:
            r5 = 5
            r10 = r2[r5]
            java.lang.Object r9 = r0.mo24885n(r1, r5, r10, r9)
            r3 = r3 | 32
            goto L_0x00f0
        L_0x00b8:
            r10 = 4
            r5 = r2[r10]
            java.lang.Object r4 = r0.mo24885n(r1, r10, r5, r4)
            r3 = r3 | 16
            goto L_0x00f0
        L_0x00c2:
            r5 = 3
            r10 = r2[r5]
            java.lang.Object r12 = r0.mo24885n(r1, r5, r10, r12)
            r3 = r3 | 8
            goto L_0x00f0
        L_0x00cc:
            r5 = 3
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r5 = 2
            java.lang.Object r13 = r0.mo24885n(r1, r5, r10, r13)
            r3 = r3 | 4
            goto L_0x00f0
        L_0x00d7:
            r5 = 2
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r5 = 1
            java.lang.Object r15 = r0.mo24885n(r1, r5, r10, r15)
            r3 = r3 | 2
            goto L_0x00f0
        L_0x00e2:
            r5 = 1
            kotlinx.serialization.internal.h0 r10 = kotlinx.serialization.internal.C12276h0.f30067a
            r5 = 0
            java.lang.Object r14 = r0.mo24885n(r1, r5, r10, r14)
            r3 = r3 | 1
            goto L_0x00f0
        L_0x00ed:
            r5 = 0
            r18 = r5
        L_0x00f0:
            r5 = 9
        L_0x00f2:
            r10 = 8
            goto L_0x0075
        L_0x00f5:
            r2 = r6
            r10 = r7
            r7 = r11
            r6 = r3
            r11 = r4
            r4 = r13
            r3 = r14
        L_0x00fc:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffWeekPattern r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffWeekPattern
            r1 = r3
            java.lang.Integer r1 = (java.lang.Integer) r1
            r3 = r15
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = (java.lang.String) r4
            java.util.List r12 = (java.util.List) r12
            java.util.List r11 = (java.util.List) r11
            r13 = r9
            java.util.List r13 = (java.util.List) r13
            r14 = r7
            java.util.List r14 = (java.util.List) r14
            r15 = r8
            java.util.List r15 = (java.util.List) r15
            r16 = r10
            java.util.List r16 = (java.util.List) r16
            java.util.List r2 = (java.util.List) r2
            r17 = 0
            r5 = r0
            r7 = r1
            r8 = r3
            r9 = r4
            r10 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r16 = r2
            r5.<init>((int) r6, (java.lang.Integer) r7, (java.lang.String) r8, (java.lang.String) r9, (java.util.List) r10, (java.util.List) r11, (java.util.List) r12, (java.util.List) r13, (java.util.List) r14, (java.util.List) r15, (java.util.List) r16, (kotlinx.serialization.internal.C12295n1) r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffWeekPattern$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffWeekPattern");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffWeekPattern bffWeekPattern) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffWeekPattern, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffWeekPattern.write$Self(bffWeekPattern, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
