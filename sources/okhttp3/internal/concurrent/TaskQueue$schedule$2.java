package okhttp3.internal.concurrent;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo22516d2 = {"okhttp3/internal/concurrent/TaskQueue$schedule$2", "Lokhttp3/internal/concurrent/Task;", "runOnce", "", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class TaskQueue$schedule$2 extends Task {
    final /* synthetic */ C11289a $block;
    final /* synthetic */ String $name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaskQueue$schedule$2(C11289a aVar, String str, String str2) {
        super(str2, false, 2, (DefaultConstructorMarker) null);
        this.$block = aVar;
        this.$name = str;
    }

    public long runOnce() {
        return ((Number) this.$block.invoke()).longValue();
    }
}
