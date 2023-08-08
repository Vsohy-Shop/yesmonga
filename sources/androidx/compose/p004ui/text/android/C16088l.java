package androidx.compose.p004ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import androidx.compose.runtime.internal.C8567o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.C10861c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C16085k
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.android.l */
public final class C16088l {

    /* renamed from: A */
    public static final int f39981A = 0;

    /* renamed from: B */
    public static final int f39982B = 2;

    /* renamed from: C */
    public static final float f39983C = 1.0f;

    /* renamed from: D */
    public static final float f39984D = 0.0f;

    /* renamed from: E */
    public static final boolean f39985E = false;

    /* renamed from: F */
    public static final int f39986F = Integer.MAX_VALUE;

    /* renamed from: G */
    public static final int f39987G = 0;

    /* renamed from: H */
    public static final int f39988H = 0;

    /* renamed from: I */
    public static final int f39989I = 0;

    /* renamed from: J */
    public static final int f39990J = 0;

    /* renamed from: K */
    public static final int f39991K = 0;

    /* renamed from: L */
    public static final boolean f39992L = true;
    @C12579k

    /* renamed from: M */
    public static final Layout.Alignment f39993M = Layout.Alignment.ALIGN_NORMAL;
    @C12579k

    /* renamed from: N */
    public static final TextDirectionHeuristic f39994N;

    /* renamed from: O */
    public static final int f39995O = 8;
    @C12579k

    /* renamed from: a */
    public static final C16088l f39996a = new C16088l();

    /* renamed from: b */
    public static final int f39997b = 0;

    /* renamed from: c */
    public static final int f39998c = 1;

    /* renamed from: d */
    public static final int f39999d = 2;

    /* renamed from: e */
    public static final int f40000e = 3;

    /* renamed from: f */
    public static final int f40001f = 4;

    /* renamed from: g */
    public static final int f40002g = 0;

    /* renamed from: h */
    public static final int f40003h = 1;

    /* renamed from: i */
    public static final int f40004i = 0;

    /* renamed from: j */
    public static final int f40005j = 1;

    /* renamed from: k */
    public static final int f40006k = 3;

    /* renamed from: l */
    public static final int f40007l = 0;

    /* renamed from: m */
    public static final int f40008m = 1;

    /* renamed from: n */
    public static final int f40009n = 2;

    /* renamed from: o */
    public static final int f40010o = 0;

    /* renamed from: p */
    public static final int f40011p = 1;

    /* renamed from: q */
    public static final int f40012q = 2;

    /* renamed from: r */
    public static final int f40013r = 3;

    /* renamed from: s */
    public static final int f40014s = 0;

    /* renamed from: t */
    public static final int f40015t = 1;

    /* renamed from: u */
    public static final int f40016u = 0;

    /* renamed from: v */
    public static final int f40017v = 1;

    /* renamed from: w */
    public static final int f40018w = 2;

    /* renamed from: x */
    public static final int f40019x = 3;

    /* renamed from: y */
    public static final int f40020y = 4;

    /* renamed from: z */
    public static final int f40021z = 5;

    @C10861c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.compose.ui.text.android.l$a */
    public @interface C16089a {
    }

    @C10861c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.compose.ui.text.android.l$b */
    public @interface C16090b {
    }

    @C10861c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.compose.ui.text.android.l$c */
    public @interface C16091c {
    }

    @C10861c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.compose.ui.text.android.l$d */
    public @interface C16092d {
    }

    @C10861c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.compose.ui.text.android.l$e */
    public @interface C16093e {
    }

    @C10861c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.compose.ui.text.android.l$f */
    public @interface C16094f {
    }

    @C10861c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.compose.ui.text.android.l$g */
    public @interface C16095g {
    }

    static {
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic, "FIRSTSTRONG_LTR");
        f39994N = textDirectionHeuristic;
    }

    @C12579k
    /* renamed from: a */
    public final Layout.Alignment mo46479a() {
        return f39993M;
    }

    @C12579k
    /* renamed from: b */
    public final TextDirectionHeuristic mo46480b() {
        return f39994N;
    }
}
