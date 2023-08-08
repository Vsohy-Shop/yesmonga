package kotlinx.serialization.json;

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
import kotlinx.serialization.C12427m;
import org.jetbrains.annotations.C12579k;

@C10862d(allowedTargets = {AnnotationTarget.PROPERTY})
@C12427m
@Target({})
@C12200d
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: kotlinx.serialization.json.t */
public @interface C12415t {

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    /* renamed from: kotlinx.serialization.json.t$a */
    public static final class C12416a implements C12415t {

        /* renamed from: c4 */
        public final /* synthetic */ String[] f30354c4;

        public C12416a(@C12579k String[] strArr) {
            Intrinsics.checkNotNullParameter(strArr, "names");
            this.f30354c4 = strArr;
        }

        @C11314h(name = "names")
        public final /* synthetic */ String[] names() {
            return this.f30354c4;
        }

        public C12416a() {
        }
    }

    String[] names();
}
