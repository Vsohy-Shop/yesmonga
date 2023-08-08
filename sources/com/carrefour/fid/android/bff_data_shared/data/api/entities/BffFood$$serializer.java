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
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffFood.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFood;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffFood$$serializer implements C12327y<BffFood> {
    @C12579k
    public static final BffFood$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffFood$$serializer bffFood$$serializer = new BffFood$$serializer();
        INSTANCE = bffFood$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFood", bffFood$$serializer, 23);
        pluginGeneratedSerialDescriptor.mo24966k("category", true);
        pluginGeneratedSerialDescriptor.mo24966k("caliber", true);
        pluginGeneratedSerialDescriptor.mo24966k("variety", true);
        pluginGeneratedSerialDescriptor.mo24966k("latin_name", true);
        pluginGeneratedSerialDescriptor.mo24966k("farmed_fish", true);
        pluginGeneratedSerialDescriptor.mo24966k("texture", true);
        pluginGeneratedSerialDescriptor.mo24966k("consumption_unit", true);
        pluginGeneratedSerialDescriptor.mo24966k("base_of_the_dish", true);
        pluginGeneratedSerialDescriptor.mo24966k("ingredients", true);
        pluginGeneratedSerialDescriptor.mo24966k("nutriscore", true);
        pluginGeneratedSerialDescriptor.mo24966k("wine_food_match", true);
        pluginGeneratedSerialDescriptor.mo24966k("wine_award", true);
        pluginGeneratedSerialDescriptor.mo24966k("wine_rack", true);
        pluginGeneratedSerialDescriptor.mo24966k("wine_year", true);
        pluginGeneratedSerialDescriptor.mo24966k("container_type", true);
        pluginGeneratedSerialDescriptor.mo24966k("facet_millesime", true);
        pluginGeneratedSerialDescriptor.mo24966k("wine_cepage", true);
        pluginGeneratedSerialDescriptor.mo24966k("wine_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("alcohol_degree", true);
        pluginGeneratedSerialDescriptor.mo24966k("champagne_type", true);
        pluginGeneratedSerialDescriptor.mo24966k("wine_region", true);
        pluginGeneratedSerialDescriptor.mo24966k("percentage_alcohol_volume", true);
        pluginGeneratedSerialDescriptor.mo24966k("nutritional_tables", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffFood$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(BffIngredients$$serializer.INSTANCE), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(C12276h0.f30067a), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(BffFoodNutritionalTables$$serializer.INSTANCE)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x018a, code lost:
        r2 = r2 | r6;
        r12 = r12;
        r11 = r11;
        r14 = r14;
        r9 = r9;
        r8 = r8;
        r7 = r7;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x01b8, code lost:
        r6 = r47;
        r13 = r48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0366, code lost:
        r3 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0368, code lost:
        r6 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x036a, code lost:
        r4 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0107, code lost:
        r14 = r14;
        r12 = r12;
        r11 = r11;
        r9 = r9;
        r8 = r8;
        r7 = r7;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0107, code lost:
        r14 = r14;
        r12 = r12;
        r11 = r11;
        r9 = r9;
        r8 = r8;
        r7 = r7;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0107, code lost:
        r14 = r14;
        r12 = r12;
        r11 = r11;
        r9 = r9;
        r8 = r8;
        r7 = r7;
        r5 = r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFood deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r50) {
        /*
            r49 = this;
            r0 = r50
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r49.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            boolean r2 = r0.mo24886p()
            r12 = 10
            r13 = 9
            r14 = 7
            r15 = 6
            r3 = 5
            r4 = 3
            r6 = 8
            r5 = 4
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r2 == 0) goto L_0x00e4
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r9 = r0.mo24885n(r1, r9, r2, r10)
            java.lang.Object r8 = r0.mo24885n(r1, r8, r2, r10)
            java.lang.Object r7 = r0.mo24885n(r1, r7, r2, r10)
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r10)
            java.lang.Object r5 = r0.mo24885n(r1, r5, r2, r10)
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            java.lang.Object r15 = r0.mo24885n(r1, r15, r2, r10)
            java.lang.Object r14 = r0.mo24885n(r1, r14, r2, r10)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffIngredients$$serializer r11 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffIngredients$$serializer.INSTANCE
            java.lang.Object r6 = r0.mo24885n(r1, r6, r11, r10)
            java.lang.Object r11 = r0.mo24885n(r1, r13, r2, r10)
            java.lang.Object r12 = r0.mo24885n(r1, r12, r2, r10)
            r13 = 11
            java.lang.Object r13 = r0.mo24885n(r1, r13, r2, r10)
            r24 = r3
            kotlinx.serialization.internal.h0 r3 = kotlinx.serialization.internal.C12276h0.f30067a
            r25 = r4
            r4 = 12
            java.lang.Object r3 = r0.mo24885n(r1, r4, r3, r10)
            r4 = 13
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r10)
            r22 = r3
            r3 = 14
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r21 = r3
            r3 = 15
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r20 = r3
            r3 = 16
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r19 = r3
            r3 = 17
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r18 = r3
            r3 = 18
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r17 = r3
            r3 = 19
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r16 = r3
            r3 = 20
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r50 = r3
            r3 = 21
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r10)
            r3 = 22
            r23 = r2
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTables$$serializer r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTables$$serializer.INSTANCE
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r10)
            r3 = 8388607(0x7fffff, float:1.1754942E-38)
            r10 = r4
            r28 = r5
            r26 = r7
            r33 = r11
            r34 = r12
            r29 = r13
            r31 = r14
            r30 = r15
            r5 = r16
            r35 = r17
            r7 = r18
            r11 = r21
            r12 = r22
            r4 = r50
            r14 = r2
            r16 = r3
            r13 = r8
            r17 = r9
            r8 = r19
            r9 = r20
            r2 = r23
            r3 = r24
            goto L_0x0399
        L_0x00e4:
            r46 = r8
            r2 = r9
            r3 = r10
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r36 = r15
            r37 = r36
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r44 = r43
            r45 = r44
        L_0x0107:
            if (r46 == 0) goto L_0x036e
            r47 = r6
            int r6 = r0.mo24931o(r1)
            switch(r6) {
                case -1: goto L_0x0349;
                case 0: goto L_0x031e;
                case 1: goto L_0x02f5;
                case 2: goto L_0x02cd;
                case 3: goto L_0x02a7;
                case 4: goto L_0x0283;
                case 5: goto L_0x0261;
                case 6: goto L_0x0241;
                case 7: goto L_0x0222;
                case 8: goto L_0x0204;
                case 9: goto L_0x01ec;
                case 10: goto L_0x01d6;
                case 11: goto L_0x01be;
                case 12: goto L_0x01aa;
                case 13: goto L_0x019b;
                case 14: goto L_0x018c;
                case 15: goto L_0x017b;
                case 16: goto L_0x016c;
                case 17: goto L_0x015d;
                case 18: goto L_0x014e;
                case 19: goto L_0x013f;
                case 20: goto L_0x0132;
                case 21: goto L_0x0125;
                case 22: goto L_0x0118;
                default: goto L_0x0112;
            }
        L_0x0112:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r6)
            throw r0
        L_0x0118:
            r6 = 22
            r48 = r13
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTables$$serializer r13 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTables$$serializer.INSTANCE
            java.lang.Object r14 = r0.mo24885n(r1, r6, r13, r14)
            r6 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x018a
        L_0x0125:
            r48 = r13
            r6 = 21
            kotlinx.serialization.internal.s1 r13 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r15 = r0.mo24885n(r1, r6, r13, r15)
            r6 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x018a
        L_0x0132:
            r48 = r13
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r13 = 20
            java.lang.Object r3 = r0.mo24885n(r1, r13, r6, r3)
            r6 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x018a
        L_0x013f:
            r48 = r13
            r13 = 20
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r13 = 19
            java.lang.Object r5 = r0.mo24885n(r1, r13, r6, r5)
            r6 = 524288(0x80000, float:7.34684E-40)
            goto L_0x018a
        L_0x014e:
            r48 = r13
            r13 = 19
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r13 = 18
            java.lang.Object r4 = r0.mo24885n(r1, r13, r6, r4)
            r6 = 262144(0x40000, float:3.67342E-40)
            goto L_0x018a
        L_0x015d:
            r48 = r13
            r13 = 18
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r13 = 17
            java.lang.Object r7 = r0.mo24885n(r1, r13, r6, r7)
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x018a
        L_0x016c:
            r48 = r13
            r13 = 17
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r13 = 16
            java.lang.Object r8 = r0.mo24885n(r1, r13, r6, r8)
            r6 = 65536(0x10000, float:9.18355E-41)
            goto L_0x018a
        L_0x017b:
            r48 = r13
            r13 = 16
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r13 = 15
            java.lang.Object r9 = r0.mo24885n(r1, r13, r6, r9)
            r6 = 32768(0x8000, float:4.5918E-41)
        L_0x018a:
            r2 = r2 | r6
            goto L_0x01b8
        L_0x018c:
            r48 = r13
            r13 = 15
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r13 = 14
            java.lang.Object r11 = r0.mo24885n(r1, r13, r6, r11)
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
            goto L_0x01b8
        L_0x019b:
            r48 = r13
            r13 = 14
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r13 = 13
            java.lang.Object r10 = r0.mo24885n(r1, r13, r6, r10)
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
            goto L_0x01b8
        L_0x01aa:
            r48 = r13
            r13 = 13
            kotlinx.serialization.internal.h0 r6 = kotlinx.serialization.internal.C12276h0.f30067a
            r13 = 12
            java.lang.Object r12 = r0.mo24885n(r1, r13, r6, r12)
            r2 = r2 | 4096(0x1000, float:5.74E-42)
        L_0x01b8:
            r6 = r47
            r13 = r48
            goto L_0x0107
        L_0x01be:
            r48 = r13
            r13 = 12
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r24 = r3
            r13 = r48
            r3 = 11
            java.lang.Object r13 = r0.mo24885n(r1, r3, r6, r13)
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3 = r24
            r6 = r47
            goto L_0x0107
        L_0x01d6:
            r24 = r3
            r3 = 11
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r35 = r4
            r3 = r47
            r4 = 10
            java.lang.Object r6 = r0.mo24885n(r1, r4, r6, r3)
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r3 = r24
            goto L_0x036a
        L_0x01ec:
            r24 = r3
            r35 = r4
            r3 = r47
            r4 = 10
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r34 = r3
            r4 = r45
            r3 = 9
            java.lang.Object r45 = r0.mo24885n(r1, r3, r6, r4)
            r2 = r2 | 512(0x200, float:7.175E-43)
            goto L_0x0366
        L_0x0204:
            r24 = r3
            r35 = r4
            r4 = r45
            r34 = r47
            r3 = 9
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffIngredients$$serializer r6 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffIngredients$$serializer.INSTANCE
            r33 = r4
            r3 = r44
            r4 = 8
            java.lang.Object r44 = r0.mo24885n(r1, r4, r6, r3)
            r2 = r2 | 256(0x100, float:3.59E-43)
            r3 = r24
            r45 = r33
            goto L_0x0368
        L_0x0222:
            r24 = r3
            r35 = r4
            r3 = r44
            r33 = r45
            r34 = r47
            r4 = 8
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r32 = r3
            r4 = r43
            r3 = 7
            java.lang.Object r43 = r0.mo24885n(r1, r3, r6, r4)
            r2 = r2 | 128(0x80, float:1.794E-43)
            r3 = r24
            r44 = r32
            goto L_0x0368
        L_0x0241:
            r24 = r3
            r35 = r4
            r4 = r43
            r32 = r44
            r33 = r45
            r34 = r47
            r3 = 7
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r31 = r4
            r3 = r42
            r4 = 6
            java.lang.Object r42 = r0.mo24885n(r1, r4, r6, r3)
            r2 = r2 | 64
            r3 = r24
            r43 = r31
            goto L_0x0368
        L_0x0261:
            r24 = r3
            r35 = r4
            r3 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r47
            r4 = 6
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r30 = r3
            r4 = r41
            r3 = 5
            java.lang.Object r41 = r0.mo24885n(r1, r3, r6, r4)
            r2 = r2 | 32
            r3 = r24
            r42 = r30
            goto L_0x0368
        L_0x0283:
            r24 = r3
            r35 = r4
            r4 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r47
            r3 = 5
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r29 = r4
            r3 = r40
            r4 = 4
            java.lang.Object r40 = r0.mo24885n(r1, r4, r6, r3)
            r2 = r2 | 16
            r3 = r24
            r41 = r29
            goto L_0x0368
        L_0x02a7:
            r24 = r3
            r35 = r4
            r3 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r47
            r4 = 4
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r28 = r3
            r4 = r39
            r3 = 3
            java.lang.Object r39 = r0.mo24885n(r1, r3, r6, r4)
            r2 = r2 | 8
            r3 = r24
            r40 = r28
            goto L_0x0368
        L_0x02cd:
            r24 = r3
            r35 = r4
            r4 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r47
            r3 = 3
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r27 = r4
            r3 = r38
            r4 = 2
            java.lang.Object r38 = r0.mo24885n(r1, r4, r6, r3)
            r2 = r2 | 4
            r3 = r24
            r39 = r27
            goto L_0x0368
        L_0x02f5:
            r24 = r3
            r35 = r4
            r3 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r47
            r4 = 2
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r26 = r3
            r4 = r37
            r3 = 1
            java.lang.Object r37 = r0.mo24885n(r1, r3, r6, r4)
            r2 = r2 | 2
            r3 = r24
            r38 = r26
            goto L_0x0368
        L_0x031e:
            r24 = r3
            r35 = r4
            r4 = r37
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r47
            r3 = 1
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r25 = r4
            r3 = r36
            r4 = 0
            java.lang.Object r36 = r0.mo24885n(r1, r4, r6, r3)
            r2 = r2 | 1
            r3 = r24
            r37 = r25
            goto L_0x0368
        L_0x0349:
            r24 = r3
            r35 = r4
            r3 = r36
            r25 = r37
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r47
            r4 = 0
            r46 = r4
        L_0x0366:
            r3 = r24
        L_0x0368:
            r6 = r34
        L_0x036a:
            r4 = r35
            goto L_0x0107
        L_0x036e:
            r24 = r3
            r35 = r4
            r34 = r6
            r3 = r36
            r25 = r37
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r16 = r2
            r17 = r3
            r2 = r15
            r4 = r24
            r3 = r29
            r6 = r32
            r29 = r13
            r13 = r25
            r25 = r27
        L_0x0399:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFood r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFood
            r15 = r0
            java.lang.String r17 = (java.lang.String) r17
            r18 = r13
            java.lang.String r18 = (java.lang.String) r18
            r19 = r26
            java.lang.String r19 = (java.lang.String) r19
            r20 = r25
            java.lang.String r20 = (java.lang.String) r20
            r21 = r28
            java.lang.String r21 = (java.lang.String) r21
            r22 = r3
            java.lang.String r22 = (java.lang.String) r22
            r23 = r30
            java.lang.String r23 = (java.lang.String) r23
            r24 = r31
            java.lang.String r24 = (java.lang.String) r24
            r25 = r6
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffIngredients r25 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffIngredients) r25
            r26 = r33
            java.lang.String r26 = (java.lang.String) r26
            r27 = r34
            java.lang.String r27 = (java.lang.String) r27
            r28 = r29
            java.lang.String r28 = (java.lang.String) r28
            r29 = r12
            java.lang.Integer r29 = (java.lang.Integer) r29
            r30 = r10
            java.lang.String r30 = (java.lang.String) r30
            r31 = r11
            java.lang.String r31 = (java.lang.String) r31
            r32 = r9
            java.lang.String r32 = (java.lang.String) r32
            r33 = r8
            java.lang.String r33 = (java.lang.String) r33
            r34 = r7
            java.lang.String r34 = (java.lang.String) r34
            java.lang.String r35 = (java.lang.String) r35
            r36 = r5
            java.lang.String r36 = (java.lang.String) r36
            r37 = r4
            java.lang.String r37 = (java.lang.String) r37
            r38 = r2
            java.lang.String r38 = (java.lang.String) r38
            r39 = r14
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTables r39 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTables) r39
            r40 = 0
            r15.<init>((int) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffIngredients) r25, (java.lang.String) r26, (java.lang.String) r27, (java.lang.String) r28, (java.lang.Integer) r29, (java.lang.String) r30, (java.lang.String) r31, (java.lang.String) r32, (java.lang.String) r33, (java.lang.String) r34, (java.lang.String) r35, (java.lang.String) r36, (java.lang.String) r37, (java.lang.String) r38, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTables) r39, (kotlinx.serialization.internal.C12295n1) r40)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFood$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFood");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffFood bffFood) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffFood, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffFood.write$Self(bffFood, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
