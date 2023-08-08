package androidx.activity.compose;

import java.util.UUID;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1 extends Lambda implements C11289a<String> {

    /* renamed from: f */
    public static final ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1 f703f = new ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1();

    public ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1() {
        super(0);
    }

    @C12579k
    public final String invoke() {
        return UUID.randomUUID().toString();
    }
}
