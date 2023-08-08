package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11309u;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,429:1\n50#2:430\n49#2:431\n25#2:438\n50#2:445\n49#2:446\n1114#3,6:432\n1114#3,6:439\n1114#3,6:447\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3\n*L\n179#1:430\n179#1:431\n230#1:438\n253#1:445\n253#1:446\n179#1:432,6\n230#1:439,6\n253#1:447,6\n*E\n"})
public final class TextFieldImplKt$CommonDecorationBox$3 extends Lambda implements C11309u<Float, C15240j2, C15240j2, Float, Float, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C16361p0 $bodyLarge;
    final /* synthetic */ C16361p0 $bodySmall;
    final /* synthetic */ C8189d3 $colors;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $container;
    final /* synthetic */ C2366i0 $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $innerTextField;
    final /* synthetic */ C2241e $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $label;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leadingIcon;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $placeholder;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $prefix;
    final /* synthetic */ boolean $shouldOverrideTextStyleColor;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $suffix;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $supportingText;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailingIcon;
    final /* synthetic */ String $transformedText;
    final /* synthetic */ TextFieldType $type;

    /* renamed from: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$a */
    public /* synthetic */ class C8136a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.material3.TextFieldType[] r0 = androidx.compose.material3.TextFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.TextFieldType r1 = androidx.compose.material3.TextFieldType.Filled     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.TextFieldType r1 = androidx.compose.material3.TextFieldType.Outlined     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3.C8136a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, String str, C8189d3 d3Var, boolean z, boolean z2, C2241e eVar, int i, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, C11304p<? super C8592o, ? super Integer, C11079d2> pVar5, C11304p<? super C8592o, ? super Integer, C11079d2> pVar6, C11304p<? super C8592o, ? super Integer, C11079d2> pVar7, TextFieldType textFieldType, C11304p<? super C8592o, ? super Integer, C11079d2> pVar8, boolean z3, C2366i0 i0Var, int i2, boolean z4, C16361p0 p0Var, C16361p0 p0Var2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar9) {
        super(7);
        this.$label = pVar;
        this.$placeholder = pVar2;
        this.$transformedText = str;
        this.$colors = d3Var;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = eVar;
        this.$$dirty1 = i;
        this.$prefix = pVar3;
        this.$suffix = pVar4;
        this.$leadingIcon = pVar5;
        this.$trailingIcon = pVar6;
        this.$supportingText = pVar7;
        this.$type = textFieldType;
        this.$innerTextField = pVar8;
        this.$singleLine = z3;
        this.$contentPadding = i0Var;
        this.$$dirty = i2;
        this.$shouldOverrideTextStyleColor = z4;
        this.$bodyLarge = p0Var;
        this.$bodySmall = p0Var2;
        this.$container = pVar9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x03eb  */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02c4  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12215a(float r25, long r26, long r28, float r30, float r31, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r32, int r33) {
        /*
            r24 = this;
            r0 = r24
            r10 = r25
            r11 = r30
            r12 = r31
            r15 = r32
            r1 = r33
            r2 = r1 & 14
            if (r2 != 0) goto L_0x001b
            boolean r2 = r15.mo14968d(r10)
            if (r2 == 0) goto L_0x0018
            r2 = 4
            goto L_0x0019
        L_0x0018:
            r2 = 2
        L_0x0019:
            r2 = r2 | r1
            goto L_0x001c
        L_0x001b:
            r2 = r1
        L_0x001c:
            r3 = r1 & 112(0x70, float:1.57E-43)
            r8 = r26
            if (r3 != 0) goto L_0x002e
            boolean r3 = r15.mo14980g(r8)
            if (r3 == 0) goto L_0x002b
            r3 = 32
            goto L_0x002d
        L_0x002b:
            r3 = 16
        L_0x002d:
            r2 = r2 | r3
        L_0x002e:
            r3 = r1 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0041
            r3 = r28
            boolean r5 = r15.mo14980g(r3)
            if (r5 == 0) goto L_0x003d
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x003f
        L_0x003d:
            r5 = 128(0x80, float:1.794E-43)
        L_0x003f:
            r2 = r2 | r5
            goto L_0x0043
        L_0x0041:
            r3 = r28
        L_0x0043:
            r5 = r1 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0053
            boolean r5 = r15.mo14968d(r11)
            if (r5 == 0) goto L_0x0050
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0052
        L_0x0050:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0052:
            r2 = r2 | r5
        L_0x0053:
            r5 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r5
            if (r1 != 0) goto L_0x0065
            boolean r1 = r15.mo14968d(r12)
            if (r1 == 0) goto L_0x0062
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0064
        L_0x0062:
            r1 = 8192(0x2000, float:1.14794E-41)
        L_0x0064:
            r2 = r2 | r1
        L_0x0065:
            r14 = r2
            r1 = 374491(0x5b6db, float:5.24774E-40)
            r1 = r1 & r14
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r2) goto L_0x007b
            boolean r1 = r32.mo15011p()
            if (r1 != 0) goto L_0x0076
            goto L_0x007b
        L_0x0076:
            r32.mo14958a0()
            goto L_0x03ee
        L_0x007b:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x008a
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:113)"
            r5 = 1290853831(0x4cf0ddc7, float:1.2628332E8)
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r14, r1, r2)
        L_0x008a:
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r5 = r0.$label
            r7 = 0
            r6 = 1
            if (r5 == 0) goto L_0x00b1
            boolean r2 = r0.$shouldOverrideTextStyleColor
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1 r1 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
            r33 = r1
            r16 = r2
            r2 = r25
            r3 = r28
            r13 = r6
            r6 = r14
            r7 = r16
            r8 = r26
            r1.<init>(r2, r3, r5, r6, r7, r8)
            r1 = -382297919(0xffffffffe93698c1, float:-1.3796616E25)
            r2 = r33
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r1, r13, r2)
            r19 = r1
            goto L_0x00b4
        L_0x00b1:
            r13 = r6
            r19 = 0
        L_0x00b4:
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r1 = r0.$placeholder
            r9 = 0
            r16 = 0
            if (r1 == 0) goto L_0x00f4
            java.lang.String r1 = r0.$transformedText
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00c5
            r6 = r13
            goto L_0x00c6
        L_0x00c5:
            r6 = r9
        L_0x00c6:
            if (r6 == 0) goto L_0x00f4
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x00f4
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1 r8 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
            androidx.compose.material3.d3 r3 = r0.$colors
            boolean r4 = r0.$enabled
            boolean r5 = r0.$isError
            androidx.compose.foundation.interaction.e r6 = r0.$interactionSource
            int r7 = r0.$$dirty1
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r2 = r0.$placeholder
            int r1 = r0.$$dirty
            r20 = r1
            r1 = r8
            r21 = r2
            r2 = r30
            r11 = r8
            r8 = r21
            r9 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -524658155(0xffffffffe0ba5a15, float:-1.0742455E20)
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r1, r13, r11)
            r8 = r1
            goto L_0x00f5
        L_0x00f4:
            r8 = 0
        L_0x00f5:
            androidx.compose.material3.d3 r1 = r0.$colors
            boolean r2 = r0.$enabled
            boolean r3 = r0.$isError
            androidx.compose.foundation.interaction.e r4 = r0.$interactionSource
            int r5 = r0.$$dirty1
            int r6 = r5 >> 6
            r6 = r6 & 14
            int r7 = r5 >> 6
            r7 = r7 & 112(0x70, float:1.57E-43)
            r6 = r6 | r7
            int r7 = r5 >> 6
            r7 = r7 & 896(0x380, float:1.256E-42)
            r6 = r6 | r7
            int r5 = r5 >> 9
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r5
            r5 = r32
            androidx.compose.runtime.k2 r1 = r1.mo12547n(r2, r3, r4, r5, r6)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.j2 r1 = (androidx.compose.p004ui.graphics.C15240j2) r1
            long r3 = r1.mo42833M()
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r6 = r0.$prefix
            if (r6 == 0) goto L_0x013f
            int r1 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x013f
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1 r9 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1
            androidx.compose.ui.text.p0 r5 = r0.$bodyLarge
            int r7 = r0.$$dirty
            r1 = r9
            r2 = r31
            r1.<init>(r2, r3, r5, r6, r7)
            r1 = 1824482619(0x6cbf653b, float:1.851063E27)
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r1, r13, r9)
            r9 = r1
            goto L_0x0140
        L_0x013f:
            r9 = 0
        L_0x0140:
            androidx.compose.material3.d3 r1 = r0.$colors
            boolean r2 = r0.$enabled
            boolean r3 = r0.$isError
            androidx.compose.foundation.interaction.e r4 = r0.$interactionSource
            int r5 = r0.$$dirty1
            int r6 = r5 >> 6
            r6 = r6 & 14
            int r7 = r5 >> 6
            r7 = r7 & 112(0x70, float:1.57E-43)
            r6 = r6 | r7
            int r7 = r5 >> 6
            r7 = r7 & 896(0x380, float:1.256E-42)
            r6 = r6 | r7
            int r5 = r5 >> 9
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r5
            r5 = r32
            androidx.compose.runtime.k2 r1 = r1.mo12548p(r2, r3, r4, r5, r6)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.j2 r1 = (androidx.compose.p004ui.graphics.C15240j2) r1
            long r3 = r1.mo42833M()
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r6 = r0.$suffix
            if (r6 == 0) goto L_0x018a
            int r1 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x018a
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1 r11 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1
            androidx.compose.ui.text.p0 r5 = r0.$bodyLarge
            int r7 = r0.$$dirty
            r1 = r11
            r2 = r31
            r1.<init>(r2, r3, r5, r6, r7)
            r1 = 907456412(0x3616af9c, float:2.245396E-6)
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r1, r13, r11)
            r12 = r1
            goto L_0x018b
        L_0x018a:
            r12 = 0
        L_0x018b:
            androidx.compose.material3.t2$a r1 = androidx.compose.material3.C8284t2.f20507b
            int r1 = r1.mo13027M()
            r2 = 6
            java.lang.String r1 = androidx.compose.material3.C8357u2.m29348a(r1, r15, r2)
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            boolean r4 = r0.$isError
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r5 = r0.$isError
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r15.mo14918M(r6)
            boolean r4 = r15.mo15006n0(r4)
            boolean r7 = r15.mo15006n0(r1)
            r4 = r4 | r7
            java.lang.Object r7 = r32.mo14921N()
            if (r4 != 0) goto L_0x01bd
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r7 != r4) goto L_0x01c5
        L_0x01bd:
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1 r7 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1
            r7.<init>(r5, r1)
            r15.mo14893C(r7)
        L_0x01c5:
            r32.mo15002m0()
            kotlin.jvm.functions.l r7 = (kotlin.jvm.functions.C11300l) r7
            r1 = 0
            r4 = 0
            androidx.compose.ui.m r1 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r3, r1, r7, r13, r4)
            androidx.compose.material3.d3 r3 = r0.$colors
            boolean r5 = r0.$enabled
            boolean r7 = r0.$isError
            androidx.compose.foundation.interaction.e r11 = r0.$interactionSource
            int r2 = r0.$$dirty1
            int r16 = r2 >> 6
            r16 = r16 & 14
            int r18 = r2 >> 6
            r18 = r18 & 112(0x70, float:1.57E-43)
            r16 = r16 | r18
            int r6 = r2 >> 6
            r6 = r6 & 896(0x380, float:1.256E-42)
            r6 = r16 | r6
            int r2 = r2 >> 9
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r6
            r26 = r3
            r27 = r5
            r28 = r7
            r29 = r11
            r30 = r32
            r31 = r2
            androidx.compose.runtime.k2 r2 = r26.mo12545j(r27, r28, r29, r30, r31)
            java.lang.Object r2 = r2.getValue()
            androidx.compose.ui.graphics.j2 r2 = (androidx.compose.p004ui.graphics.C15240j2) r2
            long r2 = r2.mo42833M()
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r5 = r0.$leadingIcon
            if (r5 == 0) goto L_0x021b
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1 r6 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
            r6.<init>(r2, r5)
            r2 = 90769583(0x56908af, float:1.0957202E-35)
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r2, r13, r6)
            r5 = r2
            goto L_0x021c
        L_0x021b:
            r5 = r4
        L_0x021c:
            androidx.compose.material3.d3 r2 = r0.$colors
            boolean r3 = r0.$enabled
            boolean r6 = r0.$isError
            androidx.compose.foundation.interaction.e r7 = r0.$interactionSource
            int r11 = r0.$$dirty1
            int r16 = r11 >> 6
            r16 = r16 & 14
            int r20 = r11 >> 6
            r20 = r20 & 112(0x70, float:1.57E-43)
            r16 = r16 | r20
            int r4 = r11 >> 6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r4 = r16 | r4
            int r11 = r11 >> 9
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r11
            r26 = r2
            r27 = r3
            r28 = r6
            r29 = r7
            r30 = r32
            r31 = r4
            androidx.compose.runtime.k2 r2 = r26.mo12551v(r27, r28, r29, r30, r31)
            java.lang.Object r2 = r2.getValue()
            androidx.compose.ui.graphics.j2 r2 = (androidx.compose.p004ui.graphics.C15240j2) r2
            long r2 = r2.mo42833M()
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r4 = r0.$trailingIcon
            if (r4 == 0) goto L_0x0267
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1 r6 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
            r6.<init>(r2, r4)
            r2 = 2077796155(0x7bd8a73b, float:2.2498559E36)
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r2, r13, r6)
            r6 = r2
            goto L_0x0268
        L_0x0267:
            r6 = 0
        L_0x0268:
            androidx.compose.material3.d3 r2 = r0.$colors
            boolean r3 = r0.$enabled
            boolean r4 = r0.$isError
            androidx.compose.foundation.interaction.e r7 = r0.$interactionSource
            int r11 = r0.$$dirty1
            int r16 = r11 >> 6
            r16 = r16 & 14
            int r21 = r11 >> 6
            r21 = r21 & 112(0x70, float:1.57E-43)
            r16 = r16 | r21
            int r13 = r11 >> 6
            r13 = r13 & 896(0x380, float:1.256E-42)
            r13 = r16 | r13
            int r11 = r11 >> 9
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r13
            r26 = r2
            r27 = r3
            r28 = r4
            r29 = r7
            r30 = r32
            r31 = r11
            androidx.compose.runtime.k2 r2 = r26.mo12549r(r27, r28, r29, r30, r31)
            java.lang.Object r2 = r2.getValue()
            androidx.compose.ui.graphics.j2 r2 = (androidx.compose.p004ui.graphics.C15240j2) r2
            long r2 = r2.mo42833M()
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r4 = r0.$supportingText
            if (r4 == 0) goto L_0x02b6
            androidx.compose.ui.text.p0 r7 = r0.$bodySmall
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1 r11 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
            r11.<init>(r2, r7, r4)
            r2 = -1531019900(0xffffffffa4be7d84, float:-8.2612E-17)
            r3 = 1
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r2, r3, r11)
            r13 = r2
            goto L_0x02b7
        L_0x02b6:
            r13 = 0
        L_0x02b7:
            androidx.compose.material3.TextFieldType r2 = r0.$type
            int[] r3 = androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3.C8136a.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r7 = 1
            if (r2 == r7) goto L_0x0389
            r7 = 2
            if (r2 == r7) goto L_0x02d4
            r1 = 404045731(0x18153fa3, float:1.9289927E-24)
            r15.mo14918M(r1)
            r32.mo15002m0()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            goto L_0x03e5
        L_0x02d4:
            r2 = 404044017(0x181538f1, float:1.9286547E-24)
            r15.mo14918M(r2)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.mo14918M(r2)
            java.lang.Object r2 = r32.mo14921N()
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r7.mo16277a()
            if (r2 != r11) goto L_0x02ff
            androidx.compose.ui.geometry.m$a r2 = androidx.compose.p004ui.geometry.C15104m.f37280b
            long r22 = r2.mo42317c()
            androidx.compose.ui.geometry.m r2 = androidx.compose.p004ui.geometry.C15104m.m65006c(r22)
            r3 = 0
            r11 = 2
            androidx.compose.runtime.z0 r2 = androidx.compose.runtime.C8539f2.m30981g(r2, r3, r11, r3)
            r15.mo14893C(r2)
        L_0x02ff:
            r32.mo15002m0()
            androidx.compose.runtime.z0 r2 = (androidx.compose.runtime.C8700z0) r2
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1 r3 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
            androidx.compose.foundation.layout.i0 r11 = r0.$contentPadding
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r4 = r0.$container
            r16 = r14
            int r14 = r0.$$dirty1
            r3.<init>(r2, r11, r4, r14)
            r4 = 1902535592(0x716663a8, float:1.1408325E30)
            r11 = 1
            androidx.compose.runtime.internal.a r20 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r4, r11, r3)
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r3 = r0.$innerTextField
            boolean r4 = r0.$singleLine
            java.lang.Float r11 = java.lang.Float.valueOf(r25)
            r14 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r15.mo14918M(r14)
            boolean r11 = r15.mo15006n0(r11)
            boolean r14 = r15.mo15006n0(r2)
            r11 = r11 | r14
            java.lang.Object r14 = r32.mo14921N()
            if (r11 != 0) goto L_0x033c
            java.lang.Object r7 = r7.mo16277a()
            if (r14 != r7) goto L_0x0344
        L_0x033c:
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$1$1 r14 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$1$1
            r14.<init>(r10, r2)
            r15.mo14893C(r14)
        L_0x0344:
            r32.mo15002m0()
            r11 = r14
            kotlin.jvm.functions.l r11 = (kotlin.jvm.functions.C11300l) r11
            androidx.compose.foundation.layout.i0 r14 = r0.$contentPadding
            r2 = r16
            int r7 = r0.$$dirty
            int r7 = r7 >> 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r18 = r4
            int r4 = r0.$$dirty1
            int r16 = r4 << 21
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r16 & r17
            r7 = r7 | r16
            int r2 = r2 << 27
            r16 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r16
            r16 = r7 | r2
            r2 = 6
            int r2 = r4 >> 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r17 = r2 | 48
            r2 = r3
            r3 = r8
            r4 = r19
            r7 = r9
            r8 = r12
            r9 = r18
            r10 = r25
            r12 = r20
            r0 = r15
            r15 = r32
            androidx.compose.material3.OutlinedTextFieldKt.m25997e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r32.mo15002m0()
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            r0 = r24
            goto L_0x03e5
        L_0x0389:
            r2 = r14
            r0 = r15
            r3 = 404043011(0x18153503, float:1.9284563E-24)
            r0.mo14918M(r3)
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1 r3 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
            r0 = r24
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r4 = r0.$container
            int r7 = r0.$$dirty1
            r3.<init>(r4, r7)
            r4 = -2124779163(0xffffffff815a7165, float:-4.0121633E-38)
            r7 = 1
            androidx.compose.runtime.internal.a r11 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r4, r7, r3)
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r3 = r0.$innerTextField
            boolean r14 = r0.$singleLine
            androidx.compose.foundation.layout.i0 r7 = r0.$contentPadding
            int r4 = r0.$$dirty
            int r4 = r4 >> 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r16 = r7
            int r7 = r0.$$dirty1
            int r17 = r7 << 21
            r18 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r17 & r18
            r4 = r4 | r17
            int r2 = r2 << 27
            r17 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r17
            r17 = r4 | r2
            int r2 = r7 >> 9
            r2 = r2 & 896(0x380, float:1.256E-42)
            r4 = 6
            r18 = r2 | 6
            r2 = r3
            r3 = r19
            r4 = r8
            r7 = r9
            r8 = r12
            r9 = r14
            r10 = r25
            r12 = r13
            r13 = r16
            r14 = r32
            r15 = r17
            r16 = r18
            androidx.compose.material3.TextFieldKt.m26656e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r32.mo15002m0()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
        L_0x03e5:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x03ee
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x03ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3.mo12215a(float, long, long, float, float, androidx.compose.runtime.o, int):void");
    }

    /* renamed from: q2 */
    public /* bridge */ /* synthetic */ Object mo12216q2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        mo12215a(((Number) obj).floatValue(), ((C15240j2) obj2).mo42833M(), ((C15240j2) obj3).mo42833M(), ((Number) obj4).floatValue(), ((Number) obj5).floatValue(), (C8592o) obj6, ((Number) obj7).intValue());
        return C11079d2.f28267a;
    }
}
