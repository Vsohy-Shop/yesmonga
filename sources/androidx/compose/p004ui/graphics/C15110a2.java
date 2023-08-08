package androidx.compose.p004ui.graphics;

import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.a2 */
public final class C15110a2 {

    /* renamed from: androidx.compose.ui.graphics.a2$a */
    public static final class C15111a extends C15127c4 {

        /* renamed from: e */
        public final /* synthetic */ Shader f37326e;

        public C15111a(Shader shader) {
            this.f37326e = shader;
        }

        @C12579k
        /* renamed from: c */
        public Shader mo42412c(long j) {
            return this.f37326e;
        }
    }

    @C12579k
    /* renamed from: a */
    public static final C15127c4 m65150a(@C12579k Shader shader) {
        Intrinsics.checkNotNullParameter(shader, "shader");
        return new C15111a(shader);
    }
}
