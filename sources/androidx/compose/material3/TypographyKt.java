package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class TypographyKt {
    @C12579k

    /* renamed from: a */
    public static final C8550i1<C8280s3> f19974a = CompositionLocalKt.m29859e(TypographyKt$LocalTypography$1.f19975f);

    /* renamed from: androidx.compose.material3.TypographyKt$a */
    public /* synthetic */ class C8167a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|(2:29|30)|31|33) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.material3.tokens.TypographyKeyTokens[] r0 = androidx.compose.material3.tokens.TypographyKeyTokens.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.DisplayLarge     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.DisplayMedium     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.DisplaySmall     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.HeadlineLarge     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.HeadlineMedium     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.HeadlineSmall     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.TitleLarge     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.TitleMedium     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.TitleSmall     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.BodyLarge     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.BodyMedium     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.BodySmall     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.LabelLarge     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.LabelMedium     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.LabelSmall     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TypographyKt.C8167a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final C16361p0 m26914a(@C12579k C8280s3 s3Var, @C12579k TypographyKeyTokens typographyKeyTokens) {
        Intrinsics.checkNotNullParameter(s3Var, "<this>");
        Intrinsics.checkNotNullParameter(typographyKeyTokens, "value");
        switch (C8167a.$EnumSwitchMapping$0[typographyKeyTokens.ordinal()]) {
            case 1:
                return s3Var.mo12987f();
            case 2:
                return s3Var.mo12988g();
            case 3:
                return s3Var.mo12989h();
            case 4:
                return s3Var.mo12991i();
            case 5:
                return s3Var.mo12992j();
            case 6:
                return s3Var.mo12993k();
            case 7:
                return s3Var.mo12997o();
            case 8:
                return s3Var.mo12998p();
            case 9:
                return s3Var.mo12999q();
            case 10:
                return s3Var.mo12983c();
            case 11:
                return s3Var.mo12984d();
            case 12:
                return s3Var.mo12985e();
            case 13:
                return s3Var.mo12994l();
            case 14:
                return s3Var.mo12995m();
            case 15:
                return s3Var.mo12996n();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @C12579k
    /* renamed from: b */
    public static final C8550i1<C8280s3> m26915b() {
        return f19974a;
    }
}
