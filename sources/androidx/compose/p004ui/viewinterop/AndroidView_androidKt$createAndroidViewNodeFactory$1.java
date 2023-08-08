package androidx.compose.p004ui.viewinterop;

import android.content.Context;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.runtime.C8602q;
import androidx.compose.runtime.saveable.C8624c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1 */
public final class AndroidView_androidKt$createAndroidViewNodeFactory$1 extends Lambda implements C11289a<LayoutNode> {
    final /* synthetic */ Context $context;
    final /* synthetic */ NestedScrollDispatcher $dispatcher;
    final /* synthetic */ C11300l<Context, T> $factory;
    final /* synthetic */ C8602q $parentReference;
    final /* synthetic */ String $stateKey;
    final /* synthetic */ C8624c $stateRegistry;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$createAndroidViewNodeFactory$1(Context context, C11300l<? super Context, ? extends T> lVar, C8602q qVar, NestedScrollDispatcher nestedScrollDispatcher, C8624c cVar, String str) {
        super(0);
        this.$context = context;
        this.$factory = lVar;
        this.$parentReference = qVar;
        this.$dispatcher = nestedScrollDispatcher;
        this.$stateRegistry = cVar;
        this.$stateKey = str;
    }

    @C12579k
    /* renamed from: a */
    public final LayoutNode invoke() {
        return new ViewFactoryHolder(this.$context, this.$factory, this.$parentReference, this.$dispatcher, this.$stateRegistry, this.$stateKey).getLayoutNode();
    }
}
