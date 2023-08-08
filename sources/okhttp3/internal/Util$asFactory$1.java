package okhttp3.internal;

import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo22516d2 = {"<anonymous>", "Lokhttp3/EventListener;", "it", "Lokhttp3/Call;", "create"}, mo22517k = 3, mo22518mv = {1, 4, 0})
public final class Util$asFactory$1 implements EventListener.Factory {
    final /* synthetic */ EventListener $this_asFactory;

    public Util$asFactory$1(EventListener eventListener) {
        this.$this_asFactory = eventListener;
    }

    @C12579k
    public final EventListener create(@C12579k Call call) {
        Intrinsics.checkNotNullParameter(call, "it");
        return this.$this_asFactory;
    }
}
