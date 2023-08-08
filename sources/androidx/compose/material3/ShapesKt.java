package androidx.compose.material3;

import androidx.compose.foundation.shape.C2683e;
import androidx.compose.foundation.shape.C2684f;
import androidx.compose.foundation.shape.C2685g;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15321t3;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.C8582l1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nShapes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shapes.kt\nandroidx/compose/material3/ShapesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,195:1\n164#2:196\n164#2:197\n164#2:198\n164#2:199\n*S KotlinDebug\n*F\n+ 1 Shapes.kt\nandroidx/compose/material3/ShapesKt\n*L\n145#1:196\n152#1:197\n157#1:198\n162#1:199\n*E\n"})
public final class ShapesKt {
    @C12579k

    /* renamed from: a */
    public static final C8550i1<C8253n2> f19638a = CompositionLocalKt.m29859e(ShapesKt$LocalShapes$1.f19639f);

    /* renamed from: androidx.compose.material3.ShapesKt$a */
    public /* synthetic */ class C8088a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.material3.tokens.ShapeKeyTokens[] r0 = androidx.compose.material3.tokens.ShapeKeyTokens.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerExtraLarge     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerExtraLargeTop     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerExtraSmall     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerExtraSmallTop     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerFull     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerLarge     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerLargeEnd     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerLargeTop     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerMedium     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerNone     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerSmall     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ShapesKt.C8088a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final C2683e m26122a(@C12579k C2683e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        float f = (float) 0.0d;
        return C2683e.m12106d(eVar, C2685g.m12118c(C16483g.m74435M(f)), C2685g.m12118c(C16483g.m74435M(f)), (C2684f) null, (C2684f) null, 12, (Object) null);
    }

    @C12579k
    /* renamed from: b */
    public static final C2683e m26123b(@C12579k C2683e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        float f = (float) 0.0d;
        return C2683e.m12106d(eVar, C2685g.m12118c(C16483g.m74435M(f)), (C2684f) null, (C2684f) null, C2685g.m12118c(C16483g.m74435M(f)), 6, (Object) null);
    }

    @C12579k
    /* renamed from: c */
    public static final C15218g4 m26124c(@C12579k C8253n2 n2Var, @C12579k ShapeKeyTokens shapeKeyTokens) {
        Intrinsics.checkNotNullParameter(n2Var, "<this>");
        Intrinsics.checkNotNullParameter(shapeKeyTokens, "value");
        switch (C8088a.$EnumSwitchMapping$0[shapeKeyTokens.ordinal()]) {
            case 1:
                return n2Var.mo12873c();
            case 2:
                return m26128g(n2Var.mo12873c());
            case 3:
                return n2Var.mo12874d();
            case 4:
                return m26128g(n2Var.mo12874d());
            case 5:
                return C2694o.m12169k();
            case 6:
                return n2Var.mo12875e();
            case 7:
                return m26123b(n2Var.mo12875e());
            case 8:
                return m26128g(n2Var.mo12875e());
            case 9:
                return n2Var.mo12877f();
            case 10:
                return C15321t3.m66567a();
            case 11:
                return n2Var.mo12878g();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @C12579k
    /* renamed from: d */
    public static final C8550i1<C8253n2> m26125d() {
        return f19638a;
    }

    @C12579k
    /* renamed from: e */
    public static final C2683e m26126e(@C12579k C2683e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        float f = (float) 0.0d;
        return C2683e.m12106d(eVar, (C2684f) null, C2685g.m12118c(C16483g.m74435M(f)), C2685g.m12118c(C16483g.m74435M(f)), (C2684f) null, 9, (Object) null);
    }

    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: f */
    public static final C15218g4 m26127f(@C12579k ShapeKeyTokens shapeKeyTokens, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(shapeKeyTokens, "<this>");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-612531606, i, -1, "androidx.compose.material3.toShape (Shapes.kt:188)");
        }
        C15218g4 c = m26124c(C8215i1.f20180a.mo12653b(oVar, 6), shapeKeyTokens);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return c;
    }

    @C12579k
    /* renamed from: g */
    public static final C2683e m26128g(@C12579k C2683e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        float f = (float) 0.0d;
        return C2683e.m12106d(eVar, (C2684f) null, (C2684f) null, C2685g.m12118c(C16483g.m74435M(f)), C2685g.m12118c(C16483g.m74435M(f)), 3, (Object) null);
    }
}
