package kotlinx.serialization.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10862d;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12233e;
import org.jetbrains.annotations.C12579k;

@C10862d(allowedTargets = {AnnotationTarget.CLASS})
@C12233e
@Target({ElementType.TYPE})
@C12200d
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: kotlinx.serialization.json.f */
public @interface C12352f {

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    /* renamed from: kotlinx.serialization.json.f$a */
    public static final class C12353a implements C12352f {

        /* renamed from: c4 */
        public final /* synthetic */ String f30200c4;

        public C12353a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "discriminator");
            this.f30200c4 = str;
        }

        @C11314h(name = "discriminator")
        public final /* synthetic */ String discriminator() {
            return this.f30200c4;
        }

        public C12353a() {
        }
    }

    String discriminator();
}
