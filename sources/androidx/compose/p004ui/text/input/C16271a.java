package androidx.compose.p004ui.text.input;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p004ui.platform.AndroidComposeView_androidKt;
import androidx.compose.runtime.internal.C8567o;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.input.a */
public final class C16271a implements C16299j0<C16272a> {
    @C12579k

    /* renamed from: a */
    public static final C16271a f40442a = new C16271a();

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.text.input.a$a */
    public static final class C16272a implements C16292g0 {

        /* renamed from: c */
        public static final int f40443c = 8;
        @C12579k

        /* renamed from: a */
        public final C16321t0 f40444a;
        @C12579k

        /* renamed from: b */
        public final TextInputServiceAndroid f40445b;

        public C16272a(@C12579k C16321t0 t0Var, @C12579k TextInputServiceAndroid textInputServiceAndroid) {
            Intrinsics.checkNotNullParameter(t0Var, "service");
            Intrinsics.checkNotNullParameter(textInputServiceAndroid, "androidService");
            this.f40444a = t0Var;
            this.f40445b = textInputServiceAndroid;
        }

        @C12579k
        /* renamed from: a */
        public C16319s0 mo47145a() {
            C16321t0 t0Var = this.f40444a;
            C16319s0 s0Var = t0Var instanceof C16319s0 ? (C16319s0) t0Var : null;
            if (s0Var != null) {
                return s0Var;
            }
            throw new IllegalStateException("Text input service wrapper not set up! Did you use ComposeTestRule?".toString());
        }

        @C12579k
        /* renamed from: c */
        public InputConnection mo47146c(@C12579k EditorInfo editorInfo) {
            Intrinsics.checkNotNullParameter(editorInfo, "outAttrs");
            return this.f40445b.mo47126l(editorInfo);
        }

        @C12579k
        /* renamed from: d */
        public final C16321t0 mo47147d() {
            return this.f40444a;
        }
    }

    @C12579k
    /* renamed from: b */
    public C16272a mo47143a(@C12579k C16290f0 f0Var, @C12579k View view) {
        Intrinsics.checkNotNullParameter(f0Var, "platformTextInput");
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(view, f0Var);
        return new C16272a(AndroidComposeView_androidKt.m70940e().invoke(textInputServiceAndroid), textInputServiceAndroid);
    }
}
