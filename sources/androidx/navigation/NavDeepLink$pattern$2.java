package androidx.navigation;

import java.util.regex.Pattern;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Ljava/util/regex/Pattern;", "a", "()Ljava/util/regex/Pattern;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class NavDeepLink$pattern$2 extends Lambda implements C11289a<Pattern> {
    final /* synthetic */ NavDeepLink this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavDeepLink$pattern$2(NavDeepLink navDeepLink) {
        super(0);
        this.this$0 = navDeepLink;
    }

    @C12580l
    /* renamed from: a */
    public final Pattern invoke() {
        String b = this.this$0.f50426f;
        if (b != null) {
            return Pattern.compile(b, 2);
        }
        return null;
    }
}
