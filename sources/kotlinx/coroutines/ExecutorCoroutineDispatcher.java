package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.C11429q;
import kotlin.coroutines.C11044b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable {
    @C12579k

    /* renamed from: c */
    public static final Key f29008c = new Key((DefaultConstructorMarker) null);

    @C11429q
    public static final class Key extends C11044b<CoroutineDispatcher, ExecutorCoroutineDispatcher> {
        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Key() {
            super(CoroutineDispatcher.f29001b, C116941.f29009f);
        }
    }

    @C12579k
    /* renamed from: a0 */
    public abstract Executor mo23573a0();

    public abstract void close();
}
